package com.gamericefishpro.space.r3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements Handler.Callback, ServiceConnection {
    public final Context d;
    public final Handler e;
    public final HashMap i = new HashMap();
    public HashSet v = new HashSet();

    public o(Context context) {
        this.d = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.e = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(n nVar) {
        boolean z;
        ArrayDeque arrayDeque = nVar.d;
        ComponentName componentName = nVar.a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
            arrayDeque.size();
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (nVar.b) {
            z = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.d;
            boolean zBindService = context.bindService(component, this, 33);
            nVar.b = zBindService;
            if (zBindService) {
                nVar.e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z = nVar.b;
        }
        if (!z || nVar.c == null) {
            b(nVar);
            return;
        }
        while (true) {
            l lVar = (l) arrayDeque.peek();
            if (lVar == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    lVar.toString();
                }
                lVar.a(nVar.c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Objects.toString(componentName);
                }
            } catch (RemoteException e) {
                Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        b(nVar);
    }

    public final void b(n nVar) {
        ComponentName componentName = nVar.a;
        ArrayDeque arrayDeque = nVar.d;
        Handler handler = this.e;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = nVar.e;
        int i2 = i + 1;
        nVar.e = i2;
        if (i2 <= 6) {
            Log.isLoggable("NotifManCompat", 3);
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), (1 << i) * 1000);
            return;
        }
        Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + nVar.e + " retries");
        arrayDeque.clear();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i = message.what;
        com.gamericefishpro.space.c.c cVar = null;
        if (i == 0) {
            l lVar = (l) message.obj;
            String string = Settings.Secure.getString(this.d.getContentResolver(), "enabled_notification_listeners");
            synchronized (p.c) {
                if (string != null) {
                    try {
                        if (!string.equals(p.d)) {
                            String[] strArrSplit = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(strArrSplit.length);
                            for (String str : strArrSplit) {
                                ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                                if (componentNameUnflattenFromString != null) {
                                    hashSet2.add(componentNameUnflattenFromString.getPackageName());
                                }
                            }
                            p.e = hashSet2;
                            p.d = string;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                hashSet = p.e;
            }
            if (!hashSet.equals(this.v)) {
                this.v = hashSet;
                List<ResolveInfo> listQueryIntentServices = this.d.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : listQueryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet3.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet3) {
                    if (!this.i.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Objects.toString(componentName2);
                        }
                        this.i.put(componentName2, new n(componentName2));
                    }
                }
                Iterator it = this.i.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Objects.toString(entry.getKey());
                        }
                        n nVar = (n) entry.getValue();
                        if (nVar.b) {
                            this.d.unbindService(this);
                            nVar.b = false;
                        }
                        nVar.c = null;
                        it.remove();
                    }
                }
            }
            for (n nVar2 : this.i.values()) {
                nVar2.d.add(lVar);
                a(nVar2);
            }
        } else if (i == 1) {
            m mVar = (m) message.obj;
            ComponentName componentName3 = mVar.a;
            IBinder iBinder = mVar.b;
            n nVar3 = (n) this.i.get(componentName3);
            if (nVar3 != null) {
                int i2 = com.gamericefishpro.space.c.b.d;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(com.gamericefishpro.space.c.c.a);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof com.gamericefishpro.space.c.c)) {
                        com.gamericefishpro.space.c.a aVar = new com.gamericefishpro.space.c.a();
                        aVar.d = iBinder;
                        cVar = aVar;
                    } else {
                        cVar = (com.gamericefishpro.space.c.c) iInterfaceQueryLocalInterface;
                    }
                }
                nVar3.c = cVar;
                nVar3.e = 0;
                a(nVar3);
                return true;
            }
        } else if (i == 2) {
            n nVar4 = (n) this.i.get((ComponentName) message.obj);
            if (nVar4 != null) {
                if (nVar4.b) {
                    this.d.unbindService(this);
                    nVar4.b = false;
                }
                nVar4.c = null;
                return true;
            }
        } else {
            if (i != 3) {
                return false;
            }
            n nVar5 = (n) this.i.get((ComponentName) message.obj);
            if (nVar5 != null) {
                a(nVar5);
                return true;
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.e.obtainMessage(1, new m(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.e.obtainMessage(2, componentName).sendToTarget();
    }
}
