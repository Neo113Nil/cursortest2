package defpackage;

import android.content.Context;
import androidx.fragment.app.y;
import java.util.List;
import kotlin.coroutines.Continuation;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes3.dex */
public final class b21 {
    public final c01 a;
    public final ia0 b;
    public final qe3 c;
    public final x11 d;
    public final Context e;
    public final mm6 f;
    public final xdr g;
    public final jyr h;
    public List i;

    public b21(c01 c01Var, ia0 ia0Var, qe3 qe3Var, x11 x11Var, Context context, mm6 mm6Var) {
        c01Var.getClass();
        context.getClass();
        this.a = c01Var;
        this.b = ia0Var;
        this.c = qe3Var;
        this.d = x11Var;
        this.e = context;
        this.f = mm6Var;
        this.g = ydr.a(d21.a);
        this.h = btf.b(new u11(this, 2));
        this.i = c5b.a;
        x97.y(mm6Var, dm6.b, null, new l5(this, (Continuation) null, 22), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b21 b21Var, cg6 cg6Var) {
        a21 a21Var;
        Object obj;
        nm6 nm6Var;
        int i;
        String str;
        String str2;
        String str3;
        long j;
        c01 c01Var = b21Var.a;
        ia0 ia0Var = b21Var.b;
        if (cg6Var instanceof a21) {
            a21Var = (a21) cg6Var;
            int i2 = a21Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a21Var.o = i2 - Integer.MIN_VALUE;
                obj = a21Var.m;
                nm6Var = nm6.a;
                i = a21Var.o;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!c01Var.e || !((z66) ((jyr) ia0Var.g).getValue()).f()) {
                        return null;
                    }
                    String str4 = c01Var.b;
                    String str5 = ((c21) ((jyr) ia0Var.i).getValue()).a;
                    CoverPath coverPath = c01Var.k;
                    a21Var.j = str4;
                    a21Var.k = str5;
                    a21Var.o = 1;
                    Object t = h4a.t(ouj.t(coverPath), b21Var.e, (cce) ((jyr) ia0Var.f).getValue(), true, a21Var);
                    if (t != nm6Var) {
                        str = str4;
                        obj = t;
                        str2 = str5;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j2 = a21Var.l;
                    str2 = a21Var.k;
                    String str6 = a21Var.j;
                    qgg.h0(obj);
                    j = j2;
                    str3 = str6;
                    return new lnu(str3, str2, j, (amu) obj, null, null, null, null, 240);
                }
                str2 = a21Var.k;
                str = a21Var.j;
                qgg.h0(obj);
                d85 d85Var = (d85) obj;
                long j3 = d85Var == null ? d85Var.a : oa5.a;
                dy6 dy6Var = (dy6) ((jyr) ia0Var.j).getValue();
                a21Var.j = str;
                a21Var.k = str2;
                a21Var.l = j3;
                a21Var.o = 2;
                obj = dy6Var.a(a21Var);
                if (obj != nm6Var) {
                    str3 = str;
                    j = j3;
                    return new lnu(str3, str2, j, (amu) obj, null, null, null, null, 240);
                }
                return nm6Var;
            }
        }
        a21Var = new a21(b21Var, cg6Var);
        obj = a21Var.m;
        nm6Var = nm6.a;
        i = a21Var.o;
        if (i != 0) {
        }
        d85 d85Var2 = (d85) obj;
        if (d85Var2 == null) {
        }
        dy6 dy6Var2 = (dy6) ((jyr) ia0Var.j).getValue();
        a21Var.j = str;
        a21Var.k = str2;
        a21Var.l = j3;
        a21Var.o = 2;
        obj = dy6Var2.a(a21Var);
        if (obj != nm6Var) {
        }
        return nm6Var;
    }

    public final twu b(mm6 mm6Var) {
        StationId stationId = StationId.a;
        StationId b = StationId.b(this.a.a);
        b.getClass();
        efo efoVar = new efo(5, this);
        kxi kxiVar = this.c.a;
        ia0 ia0Var = this.b;
        return wyf.T(b, mm6Var, kxiVar, new hb(13, this, b), (k6l) ((jyr) ia0Var.k).getValue(), (uwu) ((jyr) ia0Var.l).getValue(), (qwu) ((jyr) ia0Var.m).getValue(), efoVar, 768);
    }

    public final void c() {
        this.c.b(wjb.AboutArtistScreen);
        x11 x11Var = this.d;
        c01 c01Var = this.a;
        c01Var.getClass();
        x11Var.e.invoke();
        u51 P = ghh.P(c01Var);
        y yVar = x11Var.c;
        oa1 oa1Var = new oa1(x11Var.a, 0);
        jfu jfuVar = x11Var.b;
        l18 l18Var = l18.b;
        bdt I = hag.I(h1d.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        ovn.R(yVar, P, oa1Var, jfuVar, (h1d) qdcVar.C(I));
    }

    public final void d(boolean z) {
        this.c.a(z ? sjb.Undislike : sjb.Dislike);
        x97.y(this.f, null, null, new z11(this, z, (Continuation) null, 0), 3);
    }
}
