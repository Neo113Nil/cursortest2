package defpackage;

import android.os.Looper;
import com.yandex.messaging.core.net.entities.FileUploadResponseData;
import com.yandex.messaging.internal.view.attach.AttachInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes15.dex */
public final class q2r implements ho3 {
    public static final /* synthetic */ kgx[] A;
    public final g2r a;
    public boolean c;
    public izq x;
    public boolean y;
    public final /* synthetic */ t2r z;
    public final zq60 b = new zq60();
    public final op3 w = new op3();

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("uploadRetrier", 0, "getUploadRetrier()Lcom/yandex/messaging/Cancelable;", q2r.class);
        qoi0.a.getClass();
        A = new kgx[]{mutablePropertyReference1Impl};
    }

    public q2r(t2r t2rVar, g2r g2rVar) {
        this.z = t2rVar;
        this.a = g2rVar;
    }

    public final void a() {
        this.c = true;
        t2r t2rVar = this.z;
        z83.g(null, t2rVar.c, Looper.myLooper());
        HashMap hashMap = t2rVar.h;
        g2r g2rVar = this.a;
        hashMap.remove(g2rVar);
        kgx kgxVar = A[0];
        this.w.b(null);
        String key = g2rVar.getKey();
        if (key != null) {
            a1r a1rVar = t2rVar.e;
            a1rVar.d.post(new v0r(a1rVar, key, 1));
        }
    }

    @Override // defpackage.go3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void D(FileUploadResponseData fileUploadResponseData) {
        boolean z;
        z83.g(null, this.z.c, Looper.myLooper());
        izq izqVar = this.x;
        if (izqVar == null) {
            ny61.r("Required value was null.");
            return;
        }
        AttachInfo attachInfo = izqVar.c;
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
                zq60Var.clear();
                a();
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
                ((o2r) arrayList.get(i)).a(new k2r(Collections.singletonList(new u2r(fileUploadResponseData.id, attachInfo))));
                i++;
            }
        }
    }

    @Override // defpackage.ho3
    /* renamed from: c */
    public final boolean mo103c(int i) {
        boolean z;
        i2r i2rVar = i == 507 ? m2r.a : l2r.a;
        zq60 zq60Var = this.b;
        zq60Var.getClass();
        ArrayList arrayList = zq60Var.a;
        zq60Var.b++;
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
                zq60Var.clear();
                a();
                return true;
            }
            while (i2 < size && arrayList.get(i2) == null) {
                i2++;
            }
            if (i2 >= size) {
                if (!z2) {
                    zq60.a(zq60Var);
                }
                ny61.p();
                return false;
            }
            ((o2r) arrayList.get(i2)).b(i2rVar);
            i2++;
        }
    }
}
