package defpackage;

import android.content.Context;
import androidx.compose.runtime.internal.a;
import com.yandex.go.navigation.compose.notification.InAppComposeNotification;
import java.util.Map;

/* loaded from: classes12.dex */
public abstract class qkv extends h55 {
    public InAppComposeNotification D;
    public final chd E;

    public qkv(int i) {
        super(null);
        this.E = new chd();
    }

    @Override // defpackage.h55
    public void G(Object obj) {
        tzt tztVar = new tzt(14, this);
        Context context = Q().a;
        wfd P = P();
        chd chdVar = this.E;
        zfd a = P.a(obj, chdVar);
        hgd hgdVar = new hgd(context);
        chdVar.d = true;
        Map map = chdVar.c;
        f22 f22Var = new f22(5);
        a7u0 a7u0Var = n1m0.a;
        m1m0 m1m0Var = new m1m0(map, f22Var);
        chdVar.b = m1m0Var;
        chdVar.c = null;
        InAppComposeNotification inAppComposeNotification = new InAppComposeNotification(context, new a(1922564941, new wzr(tztVar, hgdVar, m1m0Var, a, 6), true), R(obj));
        inAppComposeNotification.setDetachListener(new h2r(9, this, inAppComposeNotification));
        this.D = inAppComposeNotification;
        okv Q = Q();
        Q.getClass();
        inAppComposeNotification.getInfo().getClass();
        Q.b.e(inAppComposeNotification);
    }

    @Override // defpackage.h55
    public void H(Object obj) {
        boolean z = this.z;
        chd chdVar = this.E;
        chdVar.d = false;
        if (z) {
            chdVar.a = null;
            chdVar.c = null;
        } else {
            m1m0 m1m0Var = chdVar.b;
            chdVar.c = m1m0Var != null ? m1m0Var.a() : null;
        }
        chdVar.b = null;
        InAppComposeNotification inAppComposeNotification = this.D;
        if (inAppComposeNotification != null) {
            this.D = null;
            okv Q = Q();
            Q.getClass();
            inAppComposeNotification.getInfo().getClass();
            Q.b.c(inAppComposeNotification.getInfo().a);
        }
    }

    public abstract wfd P();

    public abstract okv Q();

    public abstract pkv R(Object obj);

    public qkv() {
        this(0);
    }
}
