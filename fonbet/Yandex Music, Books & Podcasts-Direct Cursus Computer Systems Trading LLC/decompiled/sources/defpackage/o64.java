package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class o64 {
    public static final msg j = new msg("CastContext", null);
    public static final Object k = new Object();
    public static volatile o64 l;
    public final Context a;
    public final jmp b;
    public final i0x c;
    public final k74 d;
    public final w8c e;
    public final s0x f;
    public final s2x g;
    public final b4x h;
    public final b1x i;

    public o64(Context context, k74 k74Var, List list, l3x l3xVar, w8c w8cVar) {
        t1x t1xVar;
        LinkProperties linkProperties;
        this.a = context;
        this.d = k74Var;
        this.e = w8cVar;
        this.g = new s2x(context);
        this.h = l3xVar.k;
        r2x r2xVar = null;
        if (TextUtils.isEmpty(k74Var.a)) {
            this.i = null;
        } else {
            this.i = new b1x(context, k74Var, l3xVar);
        }
        HashMap hashMap = new HashMap();
        b1x b1xVar = this.i;
        if (b1xVar != null) {
            hashMap.put(b1xVar.b, b1xVar.c);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                b1x b1xVar2 = (b1x) it.next();
                y1g.H(b1xVar2, "Additional SessionProvider must not be null.");
                String str = b1xVar2.b;
                y1g.D(str, "Category for SessionProvider must not be null or empty string.");
                y1g.y("SessionProvider for category " + str + " already added", !hashMap.containsKey(str));
                hashMap.put(str, b1xVar2.c);
            }
        }
        k74Var.p = new agx(1);
        try {
            e1x a = w0x.a(context, k74Var, l3xVar, hashMap);
            try {
                x0x x0xVar = (x0x) a;
                Parcel N0 = x0xVar.N0(x0xVar.M0(), 6);
                IBinder readStrongBinder = N0.readStrongBinder();
                if (readStrongBinder == null) {
                    t1xVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
                    t1xVar = queryLocalInterface instanceof t1x ? (t1x) queryLocalInterface : new t1x(readStrongBinder, "com.google.android.gms.cast.framework.IDiscoveryManager", 2);
                }
                N0.recycle();
                this.c = new i0x(t1xVar);
                try {
                    x0x x0xVar2 = (x0x) a;
                    Parcel N02 = x0xVar2.N0(x0xVar2.M0(), 5);
                    IBinder readStrongBinder2 = N02.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.cast.framework.ISessionManager");
                        r2xVar = queryLocalInterface2 instanceof r2x ? (r2x) queryLocalInterface2 : new r2x(readStrongBinder2, "com.google.android.gms.cast.framework.ISessionManager", 2);
                    }
                    N02.recycle();
                    jmp jmpVar = new jmp(r2xVar, context);
                    this.b = jmpVar;
                    y1g.D("PrecacheManager", "The log tag cannot be null or empty.");
                    b4x b4xVar = this.h;
                    if (b4xVar != null) {
                        b4xVar.f = jmpVar;
                        fsn fsnVar = b4xVar.c;
                        y1g.G(fsnVar);
                        fsnVar.post(new t3x(b4xVar, 1));
                    }
                    ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);
                    y7x y7xVar = new y7x(context, newFixedThreadPool instanceof nlx ? (nlx) newFixedThreadPool : newFixedThreadPool instanceof ScheduledExecutorService ? new qlx((ScheduledExecutorService) newFixedThreadPool) : new nlx(newFixedThreadPool));
                    y1g.D("BaseNetUtils", "The log tag cannot be null or empty.");
                    ConnectivityManager connectivityManager = y7xVar.c;
                    y7x.j.b("Start monitoring connectivity changes", new Object[0]);
                    if (!y7xVar.f && connectivityManager != null && etn.z(y7xVar.g, "android.permission.ACCESS_NETWORK_STATE") == 0) {
                        Network activeNetwork = connectivityManager.getActiveNetwork();
                        if (activeNetwork != null && (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) != null) {
                            y7xVar.a(activeNetwork, linkProperties);
                        }
                        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addTransportType(1).build(), y7xVar.b);
                        y7xVar.f = true;
                    }
                    s0x s0xVar = new s0x();
                    this.f = s0xVar;
                    try {
                        x0x x0xVar3 = (x0x) a;
                        Parcel M0 = x0xVar3.M0();
                        y4x.d(M0, s0xVar);
                        x0xVar3.O0(M0, 3);
                        s0xVar.h.add(this.g.b);
                        if (!Collections.unmodifiableList(k74Var.l).isEmpty()) {
                            msg msgVar = j;
                            Log.i(msgVar.a, msgVar.d("Setting Route Discovery for appIds: ".concat(String.valueOf(Collections.unmodifiableList(this.d.l))), new Object[0]));
                            s2x s2xVar = this.g;
                            List unmodifiableList = Collections.unmodifiableList(this.d.l);
                            s2xVar.getClass();
                            s2x.g.b(dfi.c(unmodifiableList.size(), "SetRouteDiscovery for ", " IDs"), new Object[0]);
                            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                            Iterator it2 = unmodifiableList.iterator();
                            while (it2.hasNext()) {
                                linkedHashSet.add(hyf.R((String) it2.next()));
                            }
                            s2x.g.b("resetting routes. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(s2xVar.d.keySet())), new Object[0]);
                            HashMap hashMap2 = new HashMap();
                            synchronized (s2xVar.d) {
                                try {
                                    for (String str2 : linkedHashSet) {
                                        p2x p2xVar = (p2x) s2xVar.d.get(hyf.R(str2));
                                        if (p2xVar != null) {
                                            hashMap2.put(str2, p2xVar);
                                        }
                                    }
                                    s2xVar.d.clear();
                                    s2xVar.d.putAll(hashMap2);
                                } finally {
                                }
                            }
                            s2x.g.b("Routes reset. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(s2xVar.d.keySet())), new Object[0]);
                            synchronized (s2xVar.e) {
                                s2xVar.e.clear();
                                s2xVar.e.addAll(linkedHashSet);
                            }
                            s2xVar.a();
                        }
                        w8cVar.e(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_ANALYTICS_CONSENT_TIMEOUT_SECONDS"}).o(new q3x(1, this));
                        q5i a2 = h8s.a();
                        a2.c = new mju(w8cVar, new String[]{"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"});
                        a2.d = new i6c[]{vwb.n};
                        a2.a = false;
                        a2.b = 8427;
                        w8cVar.c(0, a2.c()).o(new dxl());
                    } catch (RemoteException e) {
                        b6e.o("Failed to call addAppVisibilityListener", e);
                        throw null;
                    }
                } catch (RemoteException e2) {
                    b6e.o("Failed to call getSessionManagerImpl", e2);
                    throw null;
                }
            } catch (RemoteException e3) {
                b6e.o("Failed to call getDiscoveryManagerImpl", e3);
                throw null;
            }
        } catch (RemoteException e4) {
            b6e.o("Failed to call newCastContextImpl", e4);
            throw null;
        }
    }

    public static o64 a(Context context) {
        y1g.B("Must be called from the main thread.");
        if (l == null) {
            synchronized (k) {
                if (l == null) {
                    Context applicationContext = context.getApplicationContext();
                    swj b = b(applicationContext);
                    k74 castOptions = b.getCastOptions(applicationContext);
                    w8c w8cVar = new w8c(applicationContext, null, w8c.n, eo0.M, nmd.c);
                    try {
                        l = new o64(applicationContext, castOptions, b.getAdditionalSessionProviders(applicationContext), new l3x(applicationContext, krh.d(applicationContext), castOptions, w8cVar), w8cVar);
                    } catch (odi e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        return l;
    }

    public static swj b(Context context) {
        me1 a;
        try {
            a = b6w.a(context);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
            e = e;
        }
        try {
            Bundle bundle = a.b.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                j.c(new Object[0]);
            }
            String string = bundle.getString("com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME");
            if (string != null) {
                return (swj) Class.forName(string).asSubclass(swj.class).getDeclaredConstructor(null).newInstance(null);
            }
            throw new IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
        } catch (ClassNotFoundException e2) {
            e = e2;
            b6e.o("Failed to initialize CastContext.", e);
            return null;
        } catch (IllegalAccessException e3) {
            e = e3;
            b6e.o("Failed to initialize CastContext.", e);
            return null;
        } catch (InstantiationException e4) {
            e = e4;
            b6e.o("Failed to initialize CastContext.", e);
            return null;
        } catch (NoSuchMethodException e5) {
            e = e5;
            b6e.o("Failed to initialize CastContext.", e);
            return null;
        } catch (NullPointerException e6) {
            e = e6;
            b6e.o("Failed to initialize CastContext.", e);
            return null;
        } catch (InvocationTargetException e7) {
            e = e7;
            b6e.o("Failed to initialize CastContext.", e);
            return null;
        }
    }
}
