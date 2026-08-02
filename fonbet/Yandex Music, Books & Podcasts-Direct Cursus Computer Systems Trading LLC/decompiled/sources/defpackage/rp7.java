package defpackage;

import android.os.Parcel;
import android.view.ViewGroup;
import androidx.fragment.app.o;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.functions.Function1;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import ru.yandex.music.R;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;

/* loaded from: classes6.dex */
public final class rp7 implements kag, bnq, u97, ipr, gu1, jm5, re6, ls6, x7o, zv3, qw0, tpl, l0c, yyc {
    public static final Integer[] b = {Integer.valueOf(NetworkRequestException.INVALID_SIGNATURE), Integer.valueOf(NetworkRequestException.REGIONAL_RESTRICTION)};
    public static final e3d c = new e3d(1);
    public static final qcm d = new qcm();
    public Object a;

    public rp7(int i) {
        szh szhVar;
        switch (i) {
            case 2:
                fex fexVar = fex.c;
                hjp hjpVar = new hjp(22, new ydx[]{ovn.k, d});
                Charset charset = xcx.a;
                this.a = hjpVar;
                break;
            case 10:
                this.a = new sml(29);
                break;
            case 24:
                this.a = new ConcurrentLinkedQueue();
                break;
            default:
                zym zymVar = zym.c;
                try {
                    szhVar = (szh) Class.forName("androidx.glance.appwidget.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    szhVar = c;
                }
                szh[] szhVarArr = {e3d.b, szhVar};
                y8h y8hVar = new y8h();
                y8hVar.a = szhVarArr;
                Charset charset2 = vse.a;
                this.a = y8hVar;
                break;
        }
    }

    public static Integer A(int i, Throwable th) {
        Throwable cause;
        if (th instanceof i6e) {
            return Integer.valueOf(((i6e) th).d);
        }
        if (th instanceof hb7) {
            return Integer.valueOf(((hb7) th).a);
        }
        if (i <= 10 && (cause = th.getCause()) != null) {
            return A(i + 1, cause);
        }
        return null;
    }

    public void B() {
        ((vni) this.a).a();
    }

    public void C(Object obj) {
        obj.getClass();
        ((o18) this.a).a(new roe(obj));
    }

    public void D(Function1 function1) {
        ((o18) this.a).a(new roe(function1));
    }

    public void E(Function1 function1) {
        ((o18) this.a).a(new dmq(function1));
    }

    @Override // defpackage.l0c
    public int F() {
        return ((ExtendedFloatingActionButton) this.a).y0;
    }

    public void G(int i, Object obj, wto wtoVar) {
        c8 c8Var = (c8) obj;
        yr4 yr4Var = (yr4) this.a;
        yr4Var.y(i, 2);
        yr4Var.A(c8Var.getSerializedSize(wtoVar));
        wtoVar.f(c8Var, this);
    }

    @Override // defpackage.u97
    public void Q(aa7 aa7Var, om3 om3Var) {
        om3Var.f((om3) this.a);
    }

    @Override // defpackage.l0c
    public int a() {
        return ((ExtendedFloatingActionButton) this.a).getMeasuredHeight();
    }

    @Override // defpackage.yyc
    public Object apply(Object obj) {
        return (fi) this.a;
    }

    @Override // defpackage.jm5, defpackage.xeh
    public void b(ka8 ka8Var) {
        ((jm5) this.a).b(ka8Var);
    }

    @Override // defpackage.l0c
    public int c() {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.a;
        return ((extendedFloatingActionButton.getMeasuredWidth() - extendedFloatingActionButton.getPaddingStart()) - extendedFloatingActionButton.getPaddingEnd()) + extendedFloatingActionButton.y0 + extendedFloatingActionButton.z0;
    }

    @Override // defpackage.kag
    public void d(int i, int i2) {
        ((k8g) this.a).a.e(i, i2);
    }

    @Override // defpackage.ipr
    public int e(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // defpackage.ls6
    public void f(Object obj) {
        zq6 zq6Var = (zq6) obj;
        zq6Var.getClass();
        zt3 zt3Var = (zt3) this.a;
        if (zt3Var.w()) {
            r7o r7oVar = z7o.b;
            zt3Var.resumeWith(new t7o(zq6Var));
        }
    }

    @Override // defpackage.ipr
    public List g(long j) {
        return j >= 0 ? (List) this.a : Collections.EMPTY_LIST;
    }

    @Override // defpackage.zv3
    public boolean h(ffk ffkVar) {
        ffkVar.getClass();
        mgk mgkVar = ((e57) this.a).w;
        return mgkVar != null && mgkVar.g(ffkVar.a);
    }

    @Override // defpackage.l0c
    public int i() {
        return ((ExtendedFloatingActionButton) this.a).z0;
    }

    @Override // defpackage.kag
    public void j(int i, int i2) {
        ((k8g) this.a).a.f(i, i2);
    }

    @Override // defpackage.kag
    public void k(int i, int i2, Object obj) {
        ((k8g) this.a).a.d(i, i2, obj);
    }

    @Override // defpackage.kag
    public void l(int i, int i2) {
        ((k8g) this.a).a.c(i, i2);
    }

    @Override // defpackage.re6
    public void m(we6 we6Var) {
        ((qe6) this.a).Q(we6Var.g());
    }

    @Override // defpackage.gu1
    public void n(fi4 fi4Var, u2x u2xVar) {
        kue kueVar = ((kh4) this.a).c;
        u2xVar.getClass();
        if (u2xVar.equals(bi4.u) || u2xVar.equals(bi4.t) || u2xVar.equals(bi4.s)) {
            return;
        }
        if (u2xVar instanceof ci4) {
            kueVar.a("web", ((ci4) u2xVar).s, false);
            return;
        }
        if (u2xVar instanceof ai4) {
            kueVar.a("web", ((ai4) u2xVar).s, false);
        } else if (u2xVar instanceof di4) {
            kueVar.a("system", ((di4) u2xVar).s, false);
        } else {
            b6e.s();
        }
    }

    @Override // defpackage.ipr
    public long o(int i) {
        vq1.v(i == 0);
        return 0L;
    }

    @Override // defpackage.jm5, defpackage.xeh
    public void onComplete() {
        ((jm5) this.a).onComplete();
    }

    @Override // defpackage.jm5, defpackage.xeh
    public void onError(Throwable th) {
        ((jm5) this.a).onComplete();
    }

    @Override // defpackage.ls6
    public void onResult(Object obj) {
        br6 br6Var = (br6) obj;
        br6Var.getClass();
        zt3 zt3Var = (zt3) this.a;
        if (zt3Var.w()) {
            r7o r7oVar = z7o.b;
            zt3Var.resumeWith(br6Var);
        }
    }

    @Override // defpackage.x7o
    public void onSuccess(Object obj) {
        mgk mgkVar = (mgk) obj;
        mgkVar.getClass();
        mgkVar.e(jfk.a, null, new bnd(19, (sbp) this.a));
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x004d, code lost:
    
        if ("und".equals(r0) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        if (r0 != null) goto L43;
     */
    @Override // defpackage.tpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String p(isb isbVar) {
        Locale forLanguageTag;
        String valueOf;
        String str = isbVar.c;
        String str2 = null;
        if (str != null) {
            if (StringsKt.U(str)) {
                str = null;
            }
        }
        String str3 = isbVar.d;
        if (str3 != null) {
            String str4 = !StringsKt.U(str3) ? str3 : null;
            if (str4 != null) {
                if ("und".equals(str4)) {
                    str4 = null;
                }
                if (str4 != null && (forLanguageTag = Locale.forLanguageTag(str4)) != null && (str = forLanguageTag.getDisplayLanguage(new Locale("ru"))) != null) {
                    if (StringsKt.U(str)) {
                        str = null;
                    }
                    if (str != null) {
                    }
                }
            }
        }
        str = null;
        if (str == null) {
            if (str3 != null && !StringsKt.U(str3)) {
                str2 = str3;
            }
            if (str2 == null) {
                str = ((z23) this.a).a.getString(R.string.player_undefined_track);
                str.getClass();
            } else {
                str = str2;
            }
        }
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char charAt = str.charAt(0);
        if (Character.isLowerCase(charAt)) {
            Locale locale = Locale.ROOT;
            locale.getClass();
            valueOf = CharsKt.e(charAt, locale);
        } else {
            valueOf = String.valueOf(charAt);
        }
        sb.append((Object) valueOf);
        sb.append(str.substring(1));
        return sb.toString();
    }

    @Override // defpackage.ipr
    public int q() {
        return 1;
    }

    @Override // defpackage.qw0
    public Object r(rwo rwoVar, Float f, Float f2, Function1 function1, r1r r1rVar) {
        Object a = w1r.a(rwoVar, f.floatValue(), wdp.J(0.0f, f2.floatValue(), 28), (uf7) this.a, function1, r1rVar);
        return a == nm6.a ? a : (qm0) a;
    }

    @Override // defpackage.bnq
    public Object s(rkn rknVar) {
        return zsd.g0(new ez(((fs1) this.a).f, 12), rknVar);
    }

    public void t(byte b2) {
        ((Parcel) this.a).writeByte(b2);
    }

    public void u(float f) {
        ((Parcel) this.a).writeFloat(f);
    }

    public void v(long j) {
        long b2 = kes.b(j);
        byte b3 = 0;
        if (!les.a(b2, 0L)) {
            if (les.a(b2, 4294967296L)) {
                b3 = 1;
            } else if (les.a(b2, 8589934592L)) {
                b3 = 2;
            }
        }
        t(b3);
        if (les.a(kes.b(j), 0L)) {
            return;
        }
        u(kes.c(j));
    }

    @Override // defpackage.l0c
    public ViewGroup.LayoutParams w() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    @Override // defpackage.x7o
    public void x(Object obj) {
        bfk bfkVar = (bfk) obj;
        bfkVar.getClass();
        ((sbp) this.a).B(bfkVar);
    }

    @Override // defpackage.tpl
    public String y() {
        String string = ((z23) this.a).a.getString(R.string.player_adaptive_track);
        string.getClass();
        return string;
    }

    @Override // defpackage.tpl
    public String z() {
        String string = ((z23) this.a).a.getString(R.string.player_disable_track);
        string.getClass();
        return string;
    }

    public rp7(cga cgaVar, o oVar) {
        cgaVar.getClass();
        oVar.getClass();
        cgaVar.getClass();
        oVar.getClass();
        this.a = new vni(oVar);
    }

    public /* synthetic */ rp7(Object obj) {
        this.a = obj;
    }
}
