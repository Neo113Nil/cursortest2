package defpackage;

import android.os.Looper;
import com.yandex.messaging.core.net.entities.UserData;
import java.util.ArrayList;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes15.dex */
public final class umi0 implements ho3 {
    public static final /* synthetic */ kgx[] x;
    public final String a;
    public final zq60 b = new zq60();
    public final op3 c = new op3();
    public final /* synthetic */ vmi0 w;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("httpRetrier", 0, "getHttpRetrier()Lcom/yandex/messaging/Cancelable;", umi0.class);
        qoi0.a.getClass();
        x = new kgx[]{mutablePropertyReference1Impl};
    }

    public umi0(vmi0 vmi0Var, String str) {
        this.w = vmi0Var;
        this.a = str;
    }

    @Override // defpackage.go3
    public final void D(Object obj) {
        boolean z;
        UserData userData = (UserData) obj;
        vmi0 vmi0Var = this.w;
        z83.g(null, vmi0Var.a, Looper.myLooper());
        k020 k020Var = vmi0Var.c;
        l020 C = k020Var.C();
        try {
            C.D0(userData);
            C.s();
            C.close();
            in21 c = k020Var.c(userData);
            kgx kgxVar = x[0];
            this.c.b(null);
            zq60 zq60Var = this.b;
            zq60Var.getClass();
            ArrayList arrayList = zq60Var.a;
            zq60Var.b++;
            int size = arrayList.size();
            int i = 0;
            boolean z2 = false;
            while (true) {
                int i2 = i;
                while (i2 < size && arrayList.get(i2) == null) {
                    i2++;
                }
                if (i2 < size) {
                    z = true;
                } else {
                    if (!z2) {
                        zq60.a(zq60Var);
                        z2 = true;
                    }
                    z = false;
                }
                if (!z) {
                    return;
                }
                while (i < size && arrayList.get(i) == null) {
                    i++;
                }
                if (i >= size) {
                    if (!z2) {
                        zq60.a(zq60Var);
                    }
                    ny61.p();
                    return;
                } else {
                    ((vn21) arrayList.get(i)).a(c);
                    i++;
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ooc.g(C, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.ho3
    /* renamed from: c */
    public final boolean mo103c(int i) {
        boolean z;
        zq60 zq60Var = this.b;
        zq60Var.getClass();
        zq60Var.b++;
        ArrayList arrayList = zq60Var.a;
        int size = arrayList.size();
        int i2 = 0;
        boolean z2 = false;
        while (true) {
            int i3 = i2;
            while (i3 < size && arrayList.get(i3) == null) {
                i3++;
            }
            if (i3 < size) {
                z = true;
            } else {
                if (!z2) {
                    zq60.a(zq60Var);
                    z2 = true;
                }
                z = false;
            }
            if (!z) {
                break;
            }
            while (i2 < size && arrayList.get(i2) == null) {
                i2++;
            }
            if (i2 < size) {
                ((vn21) arrayList.get(i2)).onError(i);
                i2++;
            } else {
                if (!z2) {
                    zq60.a(zq60Var);
                }
                ny61.p();
            }
        }
        return false;
    }
}
