package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.connectsdk.etc.helper.HttpMessage;
import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public class evj {
    public boolean a;
    public Object b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;

    public evj(l13 l13Var) {
        bdt I = hag.I(oq7.class);
        qdc qdcVar = l13Var.a;
        Set set = l13Var.b;
        this.c = (oq7) qdcVar.D(I, l13Var, set);
        bdt I2 = hag.I(ofo.class);
        qdc qdcVar2 = l13Var.a;
        this.d = (ofo) qdcVar2.D(I2, l13Var, set);
        this.b = (frt) qdcVar2.D(hag.I(frt.class), l13Var, set);
        this.e = (cc7) qdcVar2.D(hag.I(cc7.class), l13Var, set);
        this.a = ((Boolean) u5v.e.getValue()).booleanValue();
        this.f = (g0l) qdcVar2.D(hag.I(g0l.class), l13Var, set);
    }

    public static final List a(evj evjVar, o06 o06Var, List list) {
        evjVar.getClass();
        int i = o06Var.a;
        if (i < 0) {
            return c5b.a;
        }
        int i2 = o06Var.b;
        if (i2 < -1) {
            return c5b.a;
        }
        int g = i2 == -1 ? u75.g(list) + 1 : i2 + i;
        if (i > g || i > u75.g(list)) {
            return c5b.a;
        }
        int size = list.size();
        if (g > size) {
            g = size;
        }
        return list.subList(i, g);
    }

    public IOException b(long j, boolean z, boolean z2, IOException iOException) {
        jib jibVar = (jib) this.d;
        mkn mknVar = (mkn) this.c;
        if (iOException != null) {
            m(iOException);
        }
        if (z2) {
            if (iOException != null) {
                jibVar.getClass();
            } else {
                jibVar.k(mknVar, j);
            }
        }
        if (z) {
            if (iOException != null) {
                jibVar.getClass();
            } else {
                jibVar.o(mknVar, j);
            }
        }
        return mknVar.g(this, z2, z, iOException);
    }

    public void c() {
        Iterator it = ((CopyOnWriteArrayList) this.f).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                l1j.f();
            } else {
                if (((Boolean) ((xdr) this.c).getValue()).booleanValue()) {
                    boolean z = this.a;
                }
                throw null;
            }
        }
    }

    public void d() {
        int i;
        TypedValue typedValue = new TypedValue();
        hn5 hn5Var = (hn5) this.c;
        Resources.Theme theme = hn5Var.getTheme();
        if (theme.resolveAttribute(R.attr.windowSplashScreenBackground, typedValue, true)) {
            this.d = Integer.valueOf(typedValue.resourceId);
            this.b = Integer.valueOf(typedValue.data);
        }
        if (theme.resolveAttribute(R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
            this.e = y2x.w(hn5Var, typedValue.resourceId);
        }
        if (theme.resolveAttribute(R.attr.splashScreenIconSize, typedValue, true)) {
            this.a = typedValue.resourceId == R.dimen.splashscreen_icon_size_with_background;
        }
        if (!theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) || (i = typedValue.resourceId) == 0) {
            return;
        }
        hn5Var.setTheme(i);
    }

    public zp4 e() {
        mkn mknVar = (mkn) this.c;
        if (mknVar.k) {
            xq0.q("Check failed.");
            return null;
        }
        mknVar.k = true;
        mknVar.f.j();
        okn d = ((iob) this.e).d();
        d.getClass();
        Socket socket = d.d;
        socket.getClass();
        ikn iknVar = d.h;
        iknVar.getClass();
        hkn hknVar = d.i;
        hknVar.getClass();
        socket.setSoTimeout(0);
        d.k();
        return new zp4(iknVar, hknVar, this);
    }

    public wkn f(l3o l3oVar) {
        iob iobVar = (iob) this.e;
        try {
            String a = l3oVar.f.a(HttpMessage.CONTENT_TYPE_HEADER);
            if (a == null) {
                a = null;
            }
            long c = iobVar.c(l3oVar);
            return new wkn(a, c, new ikn(new hob(this, iobVar.a(l3oVar), c)), 0);
        } catch (IOException e) {
            ((jib) this.d).getClass();
            m(e);
            throw e;
        }
    }

    public void g() {
        xdr xdrVar = (xdr) this.b;
        Boolean bool = Boolean.FALSE;
        xdrVar.getClass();
        xdrVar.m(null, bool);
        Iterator it = ((CopyOnWriteArrayList) this.f).iterator();
        if (it.hasNext()) {
            throw hrg.j(it);
        }
    }

    public k3o h(boolean z) {
        try {
            k3o g = ((iob) this.e).g(z);
            if (g == null) {
                return g;
            }
            g.m = this;
            return g;
        } catch (IOException e) {
            ((jib) this.d).getClass();
            m(e);
            throw e;
        }
    }

    public void i() {
        xdr xdrVar = (xdr) this.c;
        Boolean bool = Boolean.TRUE;
        xdrVar.getClass();
        xdrVar.m(null, bool);
        c();
    }

    public void j() {
        xdr xdrVar = (xdr) this.b;
        Boolean bool = Boolean.TRUE;
        xdrVar.getClass();
        xdrVar.m(null, bool);
        Iterator it = ((CopyOnWriteArrayList) this.f).iterator();
        if (it.hasNext()) {
            throw hrg.j(it);
        }
    }

    public void k(d7r d7rVar) {
        float dimension;
        this.f = d7rVar;
        hn5 hn5Var = (hn5) this.c;
        vtm vtmVar = new vtm(hn5Var);
        Integer num = (Integer) this.d;
        Integer num2 = (Integer) this.b;
        ViewGroup m = ((aqd) vtmVar.a).m();
        if (num != null && num.intValue() != 0) {
            m.setBackgroundResource(num.intValue());
        } else if (num2 != null) {
            m.setBackgroundColor(num2.intValue());
        } else {
            m.setBackground(hn5Var.getWindow().getDecorView().getBackground());
        }
        Drawable drawable = (Drawable) this.e;
        if (drawable != null) {
            ImageView imageView = (ImageView) m.findViewById(R.id.splashscreen_icon_view);
            if (this.a) {
                Drawable w = y2x.w(imageView.getContext(), R.drawable.icon_background);
                dimension = imageView.getResources().getDimension(R.dimen.splashscreen_icon_size_with_background) * 0.6666667f;
                if (w != null) {
                    imageView.setBackground(new vbh(w, dimension));
                }
            } else {
                dimension = imageView.getResources().getDimension(R.dimen.splashscreen_icon_size_no_background) * 0.6666667f;
            }
            imageView.setImageDrawable(new vbh(drawable, dimension));
        }
        m.addOnLayoutChangeListener(new v09(1, this, vtmVar));
    }

    public void l() {
        if (((Boolean) ((xdr) this.c).getValue()).booleanValue()) {
            return;
        }
        i();
    }

    public void m(IOException iOException) {
        this.a = true;
        ((job) this.b).b(iOException);
        okn d = ((iob) this.e).d();
        mkn mknVar = (mkn) this.c;
        synchronized (d) {
            try {
                if (!(iOException instanceof sjr)) {
                    if (!(d.g != null) || (iOException instanceof i66)) {
                        d.j = true;
                        if (d.m == 0) {
                            okn.d(mknVar.a, d.b, iOException);
                            d.l++;
                        }
                    }
                } else if (((sjr) iOException).a == 8) {
                    int i = d.n + 1;
                    d.n = i;
                    if (i > 1) {
                        d.j = true;
                        d.l++;
                    }
                } else if (((sjr) iOException).a != 9 || !mknVar.p) {
                    d.j = true;
                    d.l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void n(boolean z) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.a = z;
        qgx qgxVar = (qgx) this.f;
        Context context = (Context) this.c;
        qgxVar.a(context, intentFilter2);
        boolean z2 = this.a;
        qgx qgxVar2 = (qgx) this.e;
        if (z2) {
            qgxVar2.b(context, intentFilter);
        } else {
            qgxVar2.a(context, intentFilter);
        }
    }

    public evj() {
        Boolean bool = Boolean.FALSE;
        xdr a = ydr.a(bool);
        this.c = a;
        this.d = a;
        xdr a2 = ydr.a(bool);
        this.b = a2;
        this.e = a2;
        this.f = new CopyOnWriteArrayList();
    }

    public evj(rao raoVar, String str, ozw ozwVar, Function1 function1, int i) {
        s9t s9tVar = s9t.a;
        raoVar = (i & 2) != 0 ? qao.a : raoVar;
        s9tVar = (i & 4) != 0 ? s9t.b : s9tVar;
        str = (i & 8) != 0 ? null : str;
        ozwVar = (i & 16) != 0 ? null : ozwVar;
        function1 = (i & 32) != 0 ? null : function1;
        this.a = true;
        this.c = raoVar;
        this.d = s9tVar;
        this.b = str;
        this.e = ozwVar;
        this.f = function1;
    }

    public evj(bve bveVar, lik likVar, boolean z) {
        bveVar.getClass();
        likVar.getClass();
        this.c = bveVar;
        this.d = likVar;
        this.a = z;
        final int i = 0;
        this.b = btf.b(new Function0(this) { // from class: dvj
            public final /* synthetic */ evj b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        evj evjVar = this.b;
                        l18 l18Var = l18.b;
                        bdt I = hag.I(ljk.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        return ((ljk) qdcVar.C(I)).a((bve) evjVar.c, (lik) evjVar.d, evjVar.a);
                    default:
                        evj evjVar2 = this.b;
                        l18 l18Var2 = l18.b;
                        bdt I2 = hag.I(pjk.class);
                        qdc qdcVar2 = l18Var2.a;
                        qdcVar2.getClass();
                        return ((pjk) qdcVar2.C(I2)).a((bve) evjVar2.c);
                }
            }
        });
        final int i2 = 1;
        this.e = btf.b(new Function0(this) { // from class: dvj
            public final /* synthetic */ evj b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        evj evjVar = this.b;
                        l18 l18Var = l18.b;
                        bdt I = hag.I(ljk.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        return ((ljk) qdcVar.C(I)).a((bve) evjVar.c, (lik) evjVar.d, evjVar.a);
                    default:
                        evj evjVar2 = this.b;
                        l18 l18Var2 = l18.b;
                        bdt I2 = hag.I(pjk.class);
                        qdc qdcVar2 = l18Var2.a;
                        qdcVar2.getClass();
                        return ((pjk) qdcVar2.C(I2)).a((bve) evjVar2.c);
                }
            }
        });
        this.f = btf.b(new s9j(19));
    }

    public evj(bve bveVar, boolean z, lik likVar) {
        bveVar.getClass();
        likVar.getClass();
        this.c = bveVar;
        this.a = z;
        this.b = btf.b(new rln(29, this, likVar));
        this.e = btf.b(new eyq(24, this));
        this.f = btf.b(new nrq(29));
        this.d = l18.b.b(hag.I(sek.class), true);
    }

    public evj(qud qudVar, z06 z06Var, w16 w16Var, tmb tmbVar, boolean z) {
        qudVar.getClass();
        z06Var.getClass();
        w16Var.getClass();
        this.c = qudVar;
        this.d = z06Var;
        this.e = w16Var;
        this.f = tmbVar;
        this.a = z;
        this.b = btf.b(new cp5(15));
    }

    public evj(int i, float f, o3k o3kVar) {
        this.c = o3kVar;
        this.d = new u6k(i);
        this.b = new t6k(f);
        this.f = new xtf(i, 30, 100);
    }

    public evj(Context context, n4n n4nVar, atn atnVar) {
        this.c = context;
        this.d = n4nVar;
        this.b = atnVar;
        this.e = new qgx(this, true);
        this.f = new qgx(this, false);
    }

    public evj(mkn mknVar, jib jibVar, job jobVar, iob iobVar) {
        jibVar.getClass();
        jobVar.getClass();
        this.c = mknVar;
        this.d = jibVar;
        this.b = jobVar;
        this.e = iobVar;
        this.f = iobVar.d();
    }

    public evj(f5v f5vVar, oyu oyuVar, xsu xsuVar, nyn nynVar, h4q h4qVar, boolean z) {
        f5vVar.getClass();
        oyuVar.getClass();
        xsuVar.getClass();
        nynVar.getClass();
        h4qVar.getClass();
        this.c = f5vVar;
        this.d = oyuVar;
        this.b = xsuVar;
        this.e = nynVar;
        this.f = h4qVar;
        this.a = z;
    }

    public evj(tf6 tf6Var) {
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        this.a = ((ulu) ((byb) qdcVar.C(I)).c(ern.a(ulu.class))).h();
        this.b = btf.b(new ufl(10));
        this.e = btf.b(new iik(11, this, tf6Var));
        this.c = new xdh(tf6Var, this);
        this.d = new ce5(tf6Var, this);
        this.f = l18Var.b(hag.I(uil.class), true);
    }

    public evj(hn5 hn5Var) {
        this.c = hn5Var;
    }
}
