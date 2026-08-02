package com.connectsdk.discovery.provider;

import android.content.Context;
import android.util.Log;
import com.connectsdk.core.Util;
import com.connectsdk.discovery.DiscoveryFilter;
import com.connectsdk.discovery.DiscoveryProvider;
import com.connectsdk.discovery.DiscoveryProviderListener;
import com.connectsdk.service.config.ServiceDescription;
import defpackage.ckp;
import defpackage.dkp;
import defpackage.fkp;
import defpackage.ikp;
import defpackage.j2f;
import defpackage.p2f;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.jmdns.impl.a;

/* loaded from: classes.dex */
public class ZeroconfDiscoveryProvider implements DiscoveryProvider {
    private static final String HOSTNAME = "connectsdk";
    j2f jmdns;
    private Timer scanTimer;
    InetAddress srcAddress;
    boolean isRunning = false;
    ikp jmdnsListener = new ikp() { // from class: com.connectsdk.discovery.provider.ZeroconfDiscoveryProvider.1
        @Override // defpackage.ikp
        public void serviceAdded(ckp ckpVar) {
            dkp dkpVar = (dkp) ckpVar;
            p2f.X0(((p2f) ZeroconfDiscoveryProvider.this.jmdns).R0(dkpVar.a, dkpVar.b, "", false), 6000L);
        }

        @Override // defpackage.ikp
        public void serviceRemoved(ckp ckpVar) {
            final ServiceDescription serviceDescription = ZeroconfDiscoveryProvider.this.foundServices.get(((dkp) ckpVar).c.b());
            if (serviceDescription != null) {
                Util.runOnUI(new Runnable() { // from class: com.connectsdk.discovery.provider.ZeroconfDiscoveryProvider.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Iterator<DiscoveryProviderListener> it = ZeroconfDiscoveryProvider.this.serviceListeners.iterator();
                        while (it.hasNext()) {
                            it.next().onServiceRemoved(ZeroconfDiscoveryProvider.this, serviceDescription);
                        }
                    }
                });
            }
        }

        @Override // defpackage.ikp
        public void serviceResolved(ckp ckpVar) {
            dkp dkpVar = (dkp) ckpVar;
            String b = dkpVar.c.b();
            if (Util.isIPv4Address(b)) {
                fkp fkpVar = dkpVar.c;
                String e = fkpVar.e();
                int i = ((a) fkpVar).h;
                ServiceDescription serviceDescription = ZeroconfDiscoveryProvider.this.foundServices.get(b);
                boolean z = true;
                if (serviceDescription == null) {
                    serviceDescription = new ServiceDescription();
                    serviceDescription.setUUID(b);
                    serviceDescription.setServiceFilter(fkpVar.i());
                    serviceDescription.setIpAddress(b);
                    serviceDescription.setServiceID(ZeroconfDiscoveryProvider.this.serviceIdForFilter(fkpVar.i()));
                    serviceDescription.setPort(i);
                    serviceDescription.setFriendlyName(e);
                } else if (serviceDescription.getFriendlyName().equals(e)) {
                    z = false;
                } else {
                    serviceDescription.setFriendlyName(e);
                }
                serviceDescription.setLastDetection(new Date().getTime());
                ZeroconfDiscoveryProvider.this.foundServices.put(b, serviceDescription);
                if (z) {
                    Iterator<DiscoveryProviderListener> it = ZeroconfDiscoveryProvider.this.serviceListeners.iterator();
                    while (it.hasNext()) {
                        it.next().onServiceAdded(ZeroconfDiscoveryProvider.this, serviceDescription);
                    }
                }
            }
        }
    };
    ConcurrentHashMap<String, ServiceDescription> foundServices = new ConcurrentHashMap<>(8, 0.75f, 2);
    CopyOnWriteArrayList<DiscoveryProviderListener> serviceListeners = new CopyOnWriteArrayList<>();
    List<DiscoveryFilter> serviceFilters = new CopyOnWriteArrayList();

    public class MDNSSearchTask extends TimerTask {
        private MDNSSearchTask() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            ArrayList arrayList = new ArrayList();
            long time = new Date().getTime() - 60000;
            for (String str : ZeroconfDiscoveryProvider.this.foundServices.keySet()) {
                ServiceDescription serviceDescription = ZeroconfDiscoveryProvider.this.foundServices.get(str);
                if (serviceDescription == null || serviceDescription.getLastDetection() < time) {
                    arrayList.add(str);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                final ServiceDescription serviceDescription2 = ZeroconfDiscoveryProvider.this.foundServices.get(str2);
                if (serviceDescription2 != null) {
                    Util.runOnUI(new Runnable() { // from class: com.connectsdk.discovery.provider.ZeroconfDiscoveryProvider.MDNSSearchTask.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Iterator<DiscoveryProviderListener> it2 = ZeroconfDiscoveryProvider.this.serviceListeners.iterator();
                            while (it2.hasNext()) {
                                it2.next().onServiceRemoved(ZeroconfDiscoveryProvider.this, serviceDescription2);
                            }
                        }
                    });
                }
                if (ZeroconfDiscoveryProvider.this.foundServices.containsKey(str2)) {
                    ZeroconfDiscoveryProvider.this.foundServices.remove(str2);
                }
            }
            ZeroconfDiscoveryProvider.this.rescan();
        }
    }

    public ZeroconfDiscoveryProvider(Context context) {
        try {
            this.srcAddress = Util.getIpAddress(context);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    @Override // com.connectsdk.discovery.DiscoveryProvider
    public void addDeviceFilter(DiscoveryFilter discoveryFilter) {
        if (discoveryFilter.getServiceFilter() == null) {
            Log.e(Util.T, "This device filter does not have zeroconf filter info");
        } else {
            this.serviceFilters.add(discoveryFilter);
        }
    }

    @Override // com.connectsdk.discovery.DiscoveryProvider
    public void addListener(DiscoveryProviderListener discoveryProviderListener) {
        this.serviceListeners.add(discoveryProviderListener);
    }

    public j2f createJmDNS() throws IOException {
        InetAddress inetAddress = this.srcAddress;
        if (inetAddress != null) {
            return new p2f(HOSTNAME, inetAddress);
        }
        return null;
    }

    @Override // com.connectsdk.discovery.DiscoveryProvider
    public boolean isEmpty() {
        return this.serviceFilters.size() == 0;
    }

    @Override // com.connectsdk.discovery.DiscoveryProvider
    public void removeDeviceFilter(DiscoveryFilter discoveryFilter) {
        this.serviceFilters.remove(discoveryFilter);
    }

    @Override // com.connectsdk.discovery.DiscoveryProvider
    public void removeListener(DiscoveryProviderListener discoveryProviderListener) {
        this.serviceListeners.remove(discoveryProviderListener);
    }

    @Override // com.connectsdk.discovery.DiscoveryProvider
    public void rescan() {
        try {
            j2f j2fVar = this.jmdns;
            if (j2fVar != null) {
                ((p2f) j2fVar).close();
                this.jmdns = null;
            }
            j2f createJmDNS = createJmDNS();
            this.jmdns = createJmDNS;
            if (createJmDNS != null) {
                Iterator<DiscoveryFilter> it = this.serviceFilters.iterator();
                while (it.hasNext()) {
                    String serviceFilter = it.next().getServiceFilter();
                    ((p2f) this.jmdns).Y(serviceFilter, this.jmdnsListener, false);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override // com.connectsdk.discovery.DiscoveryProvider
    public void reset() {
        stop();
        this.foundServices.clear();
    }

    @Override // com.connectsdk.discovery.DiscoveryProvider
    public void restart() {
        stop();
        start();
    }

    public String serviceIdForFilter(String str) {
        for (DiscoveryFilter discoveryFilter : this.serviceFilters) {
            if (discoveryFilter.getServiceFilter().equals(str)) {
                return discoveryFilter.getServiceId();
            }
        }
        return "";
    }

    @Override // com.connectsdk.discovery.DiscoveryProvider
    public void setFilters(List<DiscoveryFilter> list) {
        this.serviceFilters = list;
    }

    @Override // com.connectsdk.discovery.DiscoveryProvider
    public void start() {
        if (this.isRunning) {
            return;
        }
        this.isRunning = true;
        Timer timer = new Timer();
        this.scanTimer = timer;
        timer.schedule(new MDNSSearchTask(), 100L, 10000L);
    }

    @Override // com.connectsdk.discovery.DiscoveryProvider
    public void stop() {
        this.isRunning = false;
        Timer timer = this.scanTimer;
        if (timer != null) {
            timer.cancel();
            this.scanTimer = null;
        }
        if (this.jmdns != null) {
            Iterator<DiscoveryFilter> it = this.serviceFilters.iterator();
            while (it.hasNext()) {
                this.jmdns.X(it.next().getServiceFilter(), this.jmdnsListener);
            }
        }
    }
}
