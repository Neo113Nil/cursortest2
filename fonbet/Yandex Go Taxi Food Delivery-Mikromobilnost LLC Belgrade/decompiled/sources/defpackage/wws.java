package defpackage;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.gcm.GcmTaskService;
import com.google.android.gms.gcm.a;
import com.google.android.gms.gcm.zzg;
import com.google.android.gms.gcm.zzh;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class wws implements Runnable {
    public final String a;
    public final zzg b;
    public final Messenger c;
    public final /* synthetic */ GcmTaskService w;

    public wws(GcmTaskService gcmTaskService, String str, IBinder iBinder, Bundle bundle, long j, ArrayList arrayList) {
        zzg zzhVar;
        this.w = gcmTaskService;
        this.a = str;
        if (iBinder == null) {
            zzhVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gcm.INetworkTaskCallback");
            zzhVar = queryLocalInterface instanceof zzg ? (zzg) queryLocalInterface : new zzh(iBinder);
        }
        this.b = zzhVar;
        this.c = null;
    }

    public final void a(int i) {
        Object obj;
        a aVar;
        ComponentName componentName;
        a aVar2;
        ComponentName componentName2;
        int i2;
        a aVar3;
        ComponentName componentName3;
        a aVar4;
        ComponentName componentName4;
        int i3;
        a aVar5;
        String str;
        ComponentName componentName5;
        a aVar6;
        ComponentName componentName6;
        a aVar7;
        ComponentName componentName7;
        int i4;
        ComponentName componentName8;
        a aVar8;
        ComponentName componentName9;
        a aVar9;
        ComponentName componentName10;
        int i5;
        obj = this.w.lock;
        synchronized (obj) {
            try {
                try {
                    try {
                        aVar5 = this.w.zzx;
                        str = this.a;
                        componentName5 = this.w.componentName;
                    } catch (Throwable th) {
                        aVar3 = this.w.zzx;
                        String str2 = this.a;
                        componentName3 = this.w.componentName;
                        aVar3.a(str2, componentName3.getClassName());
                        if (!(this.c != null)) {
                            aVar4 = this.w.zzx;
                            componentName4 = this.w.componentName;
                            if (!aVar4.b(componentName4.getClassName())) {
                                GcmTaskService gcmTaskService = this.w;
                                i3 = gcmTaskService.zzu;
                                gcmTaskService.stopSelf(i3);
                            }
                        }
                        throw th;
                    }
                } catch (RemoteException unused) {
                    String valueOf = String.valueOf(this.a);
                    Log.e("GcmTaskService", valueOf.length() != 0 ? "Error reporting result of operation to scheduler for ".concat(valueOf) : new String("Error reporting result of operation to scheduler for "));
                    aVar = this.w.zzx;
                    String str3 = this.a;
                    componentName = this.w.componentName;
                    aVar.a(str3, componentName.getClassName());
                    if (!(this.c != null)) {
                        aVar2 = this.w.zzx;
                        componentName2 = this.w.componentName;
                        if (!aVar2.b(componentName2.getClassName())) {
                            GcmTaskService gcmTaskService2 = this.w;
                            i2 = gcmTaskService2.zzu;
                            gcmTaskService2.stopSelf(i2);
                        }
                    }
                }
                if (aVar5.c(str, componentName5.getClassName())) {
                    aVar8 = this.w.zzx;
                    String str4 = this.a;
                    componentName9 = this.w.componentName;
                    aVar8.a(str4, componentName9.getClassName());
                    if (!(this.c != null)) {
                        aVar9 = this.w.zzx;
                        componentName10 = this.w.componentName;
                        if (!aVar9.b(componentName10.getClassName())) {
                            GcmTaskService gcmTaskService3 = this.w;
                            i5 = gcmTaskService3.zzu;
                            gcmTaskService3.stopSelf(i5);
                        }
                    }
                    return;
                }
                Messenger messenger = this.c;
                if (messenger != null) {
                    Message obtain = Message.obtain();
                    obtain.what = 3;
                    obtain.arg1 = i;
                    Bundle bundle = new Bundle();
                    componentName8 = this.w.componentName;
                    bundle.putParcelable("component", componentName8);
                    bundle.putString("tag", this.a);
                    obtain.setData(bundle);
                    messenger.send(obtain);
                } else {
                    this.b.zzf(i);
                }
                aVar6 = this.w.zzx;
                String str5 = this.a;
                componentName6 = this.w.componentName;
                aVar6.a(str5, componentName6.getClassName());
                if (!(this.c != null)) {
                    aVar7 = this.w.zzx;
                    componentName7 = this.w.componentName;
                    if (!aVar7.b(componentName7.getClassName())) {
                        GcmTaskService gcmTaskService4 = this.w;
                        i4 = gcmTaskService4.zzu;
                        gcmTaskService4.stopSelf(i4);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        asa1 asa1Var;
        GcmTaskService gcmTaskService = this.w;
        String valueOf = String.valueOf(this.a);
        sbb1 sbb1Var = new sbb1(valueOf.length() != 0 ? "nts:client:onRunTask:".concat(valueOf) : new String("nts:client:onRunTask:"));
        try {
            gtx0 gtx0Var = new gtx0();
            asa1Var = gcmTaskService.zzg;
            asa1Var.getClass();
            try {
                a(gcmTaskService.onRunTask(gtx0Var));
                sbb1Var.close();
            } finally {
            }
        } finally {
        }
    }

    public wws(GcmTaskService gcmTaskService, String str, Messenger messenger, Bundle bundle, long j, ArrayList arrayList) {
        this.w = gcmTaskService;
        this.a = str;
        this.c = messenger;
        this.b = null;
    }
}
