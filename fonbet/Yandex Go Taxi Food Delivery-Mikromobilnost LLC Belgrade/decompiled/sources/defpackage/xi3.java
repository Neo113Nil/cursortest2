package defpackage;

import android.content.Context;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import androidx.lifecycle.Lifecycle;
import com.yandex.messaging.extension.ContextExtensionsKt$makeReceiver$1;
import com.yandex.messaging.internal.calls.a;

/* loaded from: classes15.dex */
public final /* synthetic */ class xi3 implements e1k {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xi3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((yi3) obj2).a.d((zi3) obj);
                break;
            case 1:
                jn3 jn3Var = (jn3) obj2;
                jn3Var.f.d((cl3) obj);
                qp3 qp3Var = jn3Var.h;
                kgx kgxVar = jn3.j[0];
                qp3Var.b(null);
                break;
            case 2:
                ((Lifecycle) obj2).d((wj6) obj);
                break;
            case 3:
                PhoneStateListener phoneStateListener = (PhoneStateListener) obj;
                TelephonyManager telephonyManager = ((a) obj2).b;
                if (telephonyManager != null) {
                    try {
                        telephonyManager.listen(phoneStateListener, 0);
                        break;
                    } catch (SecurityException unused) {
                        ydz.b("CellularCallObservable", "READ_PHONE_STATE permission is not declared, it is important for video calls");
                        return;
                    }
                }
                break;
            case 4:
                ((m0b) obj2).a.d((h4t) obj);
                break;
            case 5:
                n5e n5eVar = (n5e) obj2;
                z83.g(null, n5eVar.a, Looper.myLooper());
                n5eVar.x.d((ag5) obj);
                break;
            case 6:
                ((Context) obj2).unregisterReceiver((ContextExtensionsKt$makeReceiver$1) obj);
                break;
            case 7:
                ejs ejsVar = (ejs) obj2;
                zq60 zq60Var = ejsVar.b;
                zq60Var.d((vn21) obj);
                if (zq60Var.isEmpty()) {
                    op3 op3Var = ejsVar.c;
                    kgx kgxVar2 = ejs.x[0];
                    op3Var.b(null);
                    fjs fjsVar = ejsVar.w;
                    String str = ejsVar.a;
                    kse.a(fjsVar.a);
                    fjsVar.e.remove(str);
                    break;
                }
                break;
            case 8:
                ((eu10) obj2).close();
                ((uds0) obj).close();
                break;
            case 9:
                umi0 umi0Var = (umi0) obj2;
                zq60 zq60Var2 = umi0Var.b;
                zq60Var2.d((vn21) obj);
                if (zq60Var2.isEmpty()) {
                    op3 op3Var2 = umi0Var.c;
                    kgx kgxVar3 = umi0.x[0];
                    op3Var2.b(null);
                    vmi0 vmi0Var = umi0Var.w;
                    String str2 = umi0Var.a;
                    z83.g(null, vmi0Var.a, Looper.myLooper());
                    vmi0Var.f.remove(str2);
                    break;
                }
                break;
            case 10:
                aq11 aq11Var = (aq11) obj2;
                z83.g(null, aq11Var.d.getLooper(), Looper.myLooper());
                aq11Var.a.d((xp11) obj);
                break;
            default:
                ((el21) obj2).d.d((dl21) obj);
                break;
        }
    }
}
