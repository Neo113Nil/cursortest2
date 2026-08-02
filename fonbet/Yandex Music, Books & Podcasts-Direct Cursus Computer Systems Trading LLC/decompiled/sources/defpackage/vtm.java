package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.view.MenuItem;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.Unit;
import kotlin.coroutines.g;
import ru.yandex.music.YMApplication;

/* loaded from: classes.dex */
public final class vtm implements wtm, x7o, hwq, jr2, dup, ros, dko, lci, gpt, npv, vww, pun {
    public final Object a;

    public vtm(int i) {
        switch (i) {
            case 11:
                sfm sfmVar = new sfm();
                sfmVar.a = this;
                sfmVar.b = rqi.a();
                this.a = sfmVar;
                break;
            case 12:
                this.a = y0q.b(0, 0, null, 7);
                break;
            case 18:
                this.a = new TrustManager[]{new qs1(2)};
                break;
            default:
                this.a = new LinkedHashSet();
                break;
        }
    }

    public static final fuu r(vtm vtmVar, List list, fyt fytVar) {
        vtmVar.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((mqs) it.next()).a);
        }
        return new fuu(new m3q(new cd5(arrayList), fytVar), list);
    }

    @Override // defpackage.dup
    public ocg I(long j, xof xofVar, jx7 jx7Var) {
        return new zxj((nh0) this.a);
    }

    @Override // defpackage.hwq
    public void a(zsq zsqVar) {
        zsqVar.getClass();
    }

    @Override // defpackage.pun
    public void accept(Object obj, Object obj2) {
        yyw yywVar = new yyw(1, (i8s) obj2);
        szw szwVar = (szw) ((azw) obj).s();
        vy2 vy2Var = (vy2) this.a;
        Parcel X = szwVar.X();
        int i = ezw.a;
        X.writeStrongBinder(yywVar);
        ezw.c(X, vy2Var);
        szwVar.p0(X, 1);
    }

    @Override // defpackage.hwq
    public pjc c() {
        return (x0q) this.a;
    }

    @Override // defpackage.wtm
    public void e() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // defpackage.jr2
    public void f(or2 or2Var) {
        v1s v1sVar = (v1s) this.a;
        if (v1sVar.I == null) {
            return;
        }
        int i = or2Var.b;
        List list = v1sVar.J;
        if (list != null) {
            xj9 xj9Var = (xj9) list.get(i);
            bd8 bd8Var = xj9Var == null ? null : xj9Var.a.c;
            if (bd8Var != null) {
                ep9 ep9Var = ((xo9) ((znk) v1sVar.I).b).j;
                ep9Var.getClass();
                if (bd8Var.e != null) {
                    int i2 = i9f.a;
                }
                qg8 qg8Var = ep9Var.b;
                e23 e23Var = ep9Var.a;
                gc8 gc8Var = e23Var.a;
                xzb xzbVar = e23Var.b;
                qg8Var.b.j(gc8Var, xzbVar, i, bd8Var);
                qg8Var.a(gc8Var, xzbVar, bd8Var, "click", gc8Var.getActionHandler());
            }
        }
    }

    @Override // defpackage.wtm
    public void g(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.a).setResultCode(i);
    }

    @Override // defpackage.vww
    public void h() {
        xww xwwVar = (xww) this.a;
        Iterator it = xwwVar.l.values().iterator();
        while (it.hasNext()) {
            ((fo0) it.next()).disconnect();
        }
        xwwVar.s.p = Collections.EMPTY_SET;
    }

    @Override // defpackage.vww
    public void j() {
        xww xwwVar = (xww) this.a;
        xwwVar.a.lock();
        try {
            xwwVar.q = new nww(xwwVar, xwwVar.n, xwwVar.o, xwwVar.j, xwwVar.p, xwwVar.a, xwwVar.i);
            xwwVar.q.h();
            xwwVar.h.signalAll();
        } finally {
            xwwVar.a.unlock();
        }
    }

    @Override // defpackage.jr2
    public void k(or2 or2Var) {
        qq2 qq2Var = ((v1s) this.a).I;
        if (qq2Var == null) {
            return;
        }
        ((xo9) ((znk) qq2Var).b).d.setCurrentItem(or2Var.b);
    }

    @Override // defpackage.vww
    public gr2 l(gr2 gr2Var) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // defpackage.hwq
    public void m(xsq xsqVar, zsq zsqVar) {
        xsqVar.getClass();
        zsqVar.getClass();
    }

    @Override // defpackage.vww
    public boolean o() {
        return true;
    }

    @Override // defpackage.ros
    public boolean onMenuItemClick(MenuItem menuItem) {
        return ((tos) this.a).b.onMenuItemSelected(0, menuItem);
    }

    @Override // defpackage.x7o
    public void onSuccess(Object obj) {
        List list = (List) obj;
        list.getClass();
        mm6 mm6Var = (ltm) this.a;
        List<gl2> list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        for (gl2 gl2Var : list2) {
            String str = gl2Var.a;
            String uri = gl2Var.g.toString();
            uri.getClass();
            arrayList.add(new zl2(str, uri, gl2Var.b, false, true, gl2Var.f));
        }
        ((oc4) mm6Var).c(new u7o(arrayList));
    }

    public vtm q(vtm vtmVar) {
        vtmVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        w1g.n((LinkedHashMap) this.a, new u60(linkedHashMap, 8));
        w1g.n((LinkedHashMap) vtmVar.a, new u60(linkedHashMap, 9));
        return new vtm((Map) linkedHashMap);
    }

    @Override // defpackage.gpt
    public ca7 s(Uri uri) {
        return new yq1((ContentResolver) this.a, uri, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object t(w90 w90Var, cg6 cg6Var) {
        nlq nlqVar;
        int i;
        vtm vtmVar;
        if (cg6Var instanceof nlq) {
            nlqVar = (nlq) cg6Var;
            int i2 = nlqVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nlqVar.m = i2 - Integer.MIN_VALUE;
                Object obj = nlqVar.k;
                nm6 nm6Var = nm6.a;
                i = nlqVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    try {
                        kun kunVar = new kun(this, w90Var, null, 29);
                        nlqVar.j = this;
                        nlqVar.m = 1;
                        if (gld.Q(kunVar, nlqVar) == nm6Var) {
                            return nm6Var;
                        }
                    } catch (klq e) {
                        e = e;
                        vtmVar = this;
                        if (e.a != vtmVar) {
                            throw e;
                        }
                        return Unit.a;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vtmVar = nlqVar.j;
                    try {
                        qgg.h0(obj);
                    } catch (klq e2) {
                        e = e2;
                        if (e.a != vtmVar) {
                        }
                        return Unit.a;
                    }
                }
                return Unit.a;
            }
        }
        nlqVar = new nlq(this, cg6Var);
        Object obj2 = nlqVar.k;
        nm6 nm6Var2 = nm6.a;
        i = nlqVar.m;
        if (i != 0) {
        }
        return Unit.a;
    }

    public void u(long j, String str) {
        w1g.B((LinkedHashMap) this.a, str, new oqe(j, true));
    }

    @Override // defpackage.dko
    public joj v(joj jojVar) {
        TrustManager[] trustManagerArr = (TrustManager[]) this.a;
        SSLContext sSLContext = SSLContext.getInstance("SSL");
        if (sSLContext != null) {
            sSLContext.init(null, trustManagerArr, new SecureRandom());
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            socketFactory.getClass();
            TrustManager trustManager = trustManagerArr[0];
            trustManager.getClass();
            jojVar.f(socketFactory, (X509TrustManager) trustManager);
            soj sojVar = new soj();
            if (!sojVar.equals(jojVar.t)) {
                jojVar.B = null;
            }
            jojVar.t = sojVar;
        }
        return jojVar;
    }

    public void w(String str, String str2) {
        w1g.B((LinkedHashMap) this.a, str, new jkr(str2));
    }

    @Override // defpackage.x7o
    public void x(Object obj) {
        bfk bfkVar = (bfk) obj;
        bfkVar.getClass();
        ((oc4) ((ltm) this.a)).c(new s7o(bfkVar));
    }

    @Override // defpackage.lci
    public kci y(kkp kkpVar) {
        return new hpt(this);
    }

    @Override // defpackage.hwq
    public void d() {
    }

    @Override // defpackage.hwq
    public void i() {
    }

    @Override // defpackage.vww
    public void b(Bundle bundle) {
    }

    @Override // defpackage.vww
    public void n(int i) {
    }

    public vtm(Map map) {
        this.a = new LinkedHashMap();
        w1g.n(map, new q2r(4, this));
    }

    public vtm(YMApplication yMApplication, av0 av0Var, d4i d4iVar) {
        this.a = yMApplication;
        pjc j = ((iv0) av0Var).a.j();
        mn7 mn7Var = dm6.b;
        g.a.getClass();
        mn7Var.getClass();
        ox6.B(j, new tf6(mn7Var), new tek(21, d4iVar, this));
    }

    public /* synthetic */ vtm(Object obj) {
        this.a = obj;
    }

    public vtm(mqs mqsVar) {
        mqsVar.getClass();
        this.a = mqsVar;
    }

    public vtm(bpv bpvVar) {
        zqv zqvVar = zqv.b;
        this.a = bpvVar;
    }

    public vtm(hn5 hn5Var) {
        aqd aqdVar;
        if (Build.VERSION.SDK_INT >= 31) {
            aqdVar = new i8r(hn5Var);
        } else {
            aqdVar = new aqd(hn5Var);
        }
        aqdVar.f();
        this.a = aqdVar;
    }

    @Override // defpackage.vww
    public void p(h66 h66Var, po0 po0Var, boolean z) {
    }
}
