package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.fragment.app.t;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class nvq implements hvq {
    public final kxi a;
    public final cvo b;
    public final tmb c;
    public final qwq d;
    public final ju0 e;
    public final tao f;
    public final cq4 g;
    public final sfm h;
    public final ruq i;
    public final ewq j;
    public final suq k;
    public final pwq l;
    public final hwq m;
    public final Locale n;
    public final jyr o;
    public final vdr p;
    public final k6l q;
    public final qwu r;
    public final uwu s;

    public nvq(kxi kxiVar, cvo cvoVar, tmb tmbVar, qwq qwqVar, ju0 ju0Var, tao taoVar, cq4 cq4Var) {
        htr htrVar;
        this.a = kxiVar;
        this.b = cvoVar;
        this.c = tmbVar;
        this.d = qwqVar;
        this.e = ju0Var;
        this.f = taoVar;
        this.g = cq4Var;
        this.h = qwqVar.O();
        this.i = qwqVar.J();
        this.j = qwqVar.L();
        this.k = qwqVar.K();
        this.l = qwqVar.P();
        this.m = qwqVar.N();
        quk qukVar = htr.f;
        String language = swf.I().getLanguage();
        language.getClass();
        qukVar.getClass();
        int hashCode = language.hashCode();
        if (hashCode == 3424) {
            if (language.equals("kk")) {
                htrVar = htr.j;
            }
            htrVar = htr.g;
        } else if (hashCode != 3651) {
            if (hashCode == 3749 && language.equals("uz")) {
                htrVar = htr.i;
            }
            htrVar = htr.g;
        } else {
            if (language.equals("ru")) {
                htrVar = htr.h;
            }
            htrVar = htr.g;
        }
        this.n = htrVar.c;
        this.o = btf.b(new oxo(27, this));
        this.p = (vdr) ((jyr) ju0Var.l).getValue();
        this.q = (k6l) ((jyr) ju0Var.h).getValue();
        this.r = (qwu) ((jyr) ju0Var.k).getValue();
        this.s = (uwu) ((jyr) ju0Var.j).getValue();
        Continuation continuation = null;
        x97.y(cq4Var, null, null, new mvq(this, continuation, 1), 3);
        x97.y(cq4Var, null, null, new mvq(this, continuation, 0), 3);
    }

    public static thj B(zsq zsqVar) {
        pkb pkbVar = pkb.SlideContent;
        String str = zsqVar.a;
        int i = zsqVar.d;
        str.getClass();
        return new thj(pkbVar, str, i + 1, 1, "");
    }

    @Override // defpackage.hvq
    public final void A(boolean z, zsq zsqVar) {
        zsqVar.getClass();
        C(zsqVar, new ivq(z, this, zsqVar));
    }

    public final void C(zsq zsqVar, Function1 function1) {
        lwq lwqVar = (lwq) m().getValue();
        if ((lwqVar instanceof iwq) || Intrinsics.d(lwqVar, jwq.a)) {
            return;
        }
        if (!(lwqVar instanceof kwq)) {
            b6e.s();
            return;
        }
        String str = zsqVar.b;
        String str2 = zsqVar.a;
        int i = zsqVar.c;
        int size = ((kwq) lwqVar).a.b.size();
        str.getClass();
        str2.getClass();
        function1.invoke(this.c.a(new lab(1, i + 1, size, str, str2), null));
    }

    @Override // defpackage.hvq
    public final Locale a() {
        return this.n;
    }

    @Override // defpackage.hvq
    public final ewq b() {
        return this.j;
    }

    @Override // defpackage.hvq
    public final void c() {
        ((t) this.f.a).getOnBackPressedDispatcher().d();
    }

    @Override // defpackage.hvq
    public final kxi d() {
        return this.a;
    }

    @Override // defpackage.hvq
    public final cvo e() {
        return this.b;
    }

    @Override // defpackage.hvq
    public final jmj f(int i, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(2079784625);
        nmj nmjVar = (nmj) ((jyr) this.e.i).getValue();
        boolean h = oq5Var.h(this);
        Object K = oq5Var.K();
        if (h || K == gq5.a) {
            K = new ti1(10, this);
            oq5Var.k0(K);
        }
        jmj a = nmjVar.a((dmj) K, this.c, 1, oq5Var, ((i << 6) & 896) | 4160);
        oq5Var.p(false);
        return a;
    }

    @Override // defpackage.hvq
    public final uwu g() {
        return this.s;
    }

    @Override // defpackage.hvq
    public final k6l h() {
        return this.q;
    }

    @Override // defpackage.hvq
    public final qwu i() {
        return this.r;
    }

    @Override // defpackage.hvq
    public final void j(String str, zsq zsqVar) {
        str.getClass();
        zsqVar.getClass();
        C(zsqVar, new jvq(this, zsqVar, str, 2));
    }

    @Override // defpackage.hvq
    public final pwq k() {
        return this.l;
    }

    @Override // defpackage.hvq
    public final vdr l() {
        return this.p;
    }

    @Override // defpackage.hvq
    public final vdr m() {
        return (vdr) this.o.getValue();
    }

    @Override // defpackage.hvq
    public final void n(String str, zsq zsqVar) {
        str.getClass();
        zsqVar.getClass();
        C(zsqVar, new jvq(this, zsqVar, str, 1));
    }

    @Override // defpackage.hvq
    public final zuq o(td3 td3Var, int i) {
        td3Var.getClass();
        return new avq(td3Var, i, (g2q) ((jyr) this.e.m).getValue(), this.h, this.g);
    }

    @Override // defpackage.hvq
    public final suq p() {
        return this.k;
    }

    @Override // defpackage.hvq
    public final void q(zsq zsqVar) {
        zsqVar.getClass();
        C(zsqVar, new kvq(this, zsqVar, 0));
    }

    @Override // defpackage.hvq
    public final void r(boolean z, zsq zsqVar, String str) {
        zsqVar.getClass();
        str.getClass();
        C(zsqVar, new y20(this, zsqVar, z, str));
    }

    @Override // defpackage.hvq
    public final j54 s(q14 q14Var, int i) {
        q14Var.getClass();
        return new k54(i, this.h, this.d, q14Var);
    }

    @Override // defpackage.hvq
    public final hwq t() {
        return this.m;
    }

    @Override // defpackage.hvq
    public final void u(String str) {
        str.getClass();
        w1g.y((t) this.f.a, str, true);
    }

    @Override // defpackage.hvq
    public final void v(Uri uri, String str) {
        uri.getClass();
        str.getClass();
        t tVar = (t) this.f.a;
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", uri);
        intent.setType("image/*");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.addFlags(1);
        tVar.startActivity(Intent.createChooser(intent, null));
        hag.x(tVar, R.string.screenshot_saved_toast, 0);
    }

    @Override // defpackage.hvq
    public final ruq w() {
        return this.i;
    }

    @Override // defpackage.hvq
    public final void x(zsq zsqVar) {
        C(zsqVar, new kvq(this, zsqVar, 1));
    }

    @Override // defpackage.hvq
    public final ws4 y(ns4 ns4Var, int i) {
        return new xs4(i, this.h, this.d, ns4Var);
    }

    @Override // defpackage.hvq
    public final boolean z() {
        return Build.VERSION.SDK_INT >= 29;
    }
}
