package defpackage;

import android.net.Uri;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* loaded from: classes4.dex */
public final class mgk {
    public final ogk a;
    public final gek b;
    public final jdk c;
    public final xwj d;
    public final lnd e;
    public final j03 f;
    public final List g;
    public final Function0 h;
    public final g0c i;
    public mek j;
    public rfk k;
    public x7o l;
    public String m;
    public ozw n;

    public mgk(ogk ogkVar, gek gekVar, jdk jdkVar, xwj xwjVar, lnd lndVar, j03 j03Var, List list, Function0 function0, g0c g0cVar) {
        ogkVar.getClass();
        gekVar.getClass();
        jdkVar.getClass();
        lndVar.getClass();
        j03Var.getClass();
        list.getClass();
        function0.getClass();
        g0cVar.getClass();
        this.a = ogkVar;
        this.b = gekVar;
        this.c = jdkVar;
        this.d = xwjVar;
        this.e = lndVar;
        this.f = j03Var;
        this.g = list;
        this.h = function0;
        this.i = g0cVar;
    }

    public final void a(ffk ffkVar, String str) {
        Object obj;
        String w = o8g.w(ffkVar);
        boolean v = c.v(ffkVar.a.a, "browser-", false);
        gek gekVar = this.b;
        if (!v) {
            c(this.a.b(w, str, b(), new oxa(gekVar), ffkVar.i, new jtc(this, gekVar)));
            return;
        }
        Iterator it = this.g.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            qfk N = wxf.N((zh3) obj);
            if (Intrinsics.d(N != null ? N.a : null, w)) {
                break;
            }
        }
        zh3 zh3Var = (zh3) obj;
        if (zh3Var == null) {
            Parcelable.Creator<bfk> creator = bfk.CREATOR;
            bfk F = y7g.F("Failed to pay. Couldn't find appropriate browser card");
            x7o x7oVar = this.l;
            if (x7oVar != null) {
                x7oVar.x(F);
                return;
            }
            return;
        }
        g3j g3jVar = new g3j(zh3Var.a, zh3Var.b, zh3Var.c, str, false, cm2.UnknownBank);
        String b = b();
        oxa oxaVar = new oxa(gekVar);
        jtc jtcVar = new jtc(this, gekVar);
        ogk ogkVar = this.a;
        yop yopVar = ogkVar.g;
        ii iiVar = new ii(ogkVar, g3jVar, b, oxaVar, jtcVar, 27);
        yopVar.getClass();
        c(mif.a(yopVar, iiVar, null, 5));
    }

    public final String b() {
        String str = this.m;
        return str == null ? this.c.b : str;
    }

    public final void c(yop yopVar) {
        mif.b(mif.b(yopVar, new igk(this, 0), null, 5), lhb.y0, new igk(this, 1), 1);
    }

    public final ArrayList d() {
        mek mekVar = this.j;
        if (mekVar != null) {
            return zsd.J0(mekVar.a);
        }
        Intrinsics.j("paymentDetails");
        throw null;
    }

    public final void e(rfk rfkVar, String str, x7o x7oVar) {
        String str2;
        wwj vwjVar;
        rfkVar.getClass();
        x7oVar.getClass();
        this.k = rfkVar;
        this.l = x7oVar;
        this.m = str;
        boolean z = rfkVar instanceof ffk;
        gek gekVar = this.b;
        if (z) {
            mek mekVar = this.j;
            if (mekVar == null) {
                Intrinsics.j("paymentDetails");
                throw null;
            }
            bg2 bg2Var = mekVar.a;
            ffk ffkVar = (ffk) rfkVar;
            hw3 hw3Var = ffkVar.a;
            qfk o = lsq.o(bg2Var, hw3Var.a);
            if (o != null) {
                if (o.e) {
                    gekVar.e();
                    return;
                } else {
                    a(ffkVar, "");
                    return;
                }
            }
            if (c.v(hw3Var.a, "browser-", false)) {
                gekVar.e();
                return;
            }
            Parcelable.Creator<bfk> creator = bfk.CREATOR;
            x7oVar.x(y7g.F("Failed to pay. Couldn't find card with id " + hw3Var.a + "."));
            return;
        }
        if (rfkVar instanceof pfk) {
            pfk pfkVar = (pfk) rfkVar;
            c(this.a.b(pfkVar.a, "", b(), new oxa(gekVar), pfkVar.g, new jtc(this, gekVar)));
            return;
        }
        if (rfkVar.equals(ifk.a)) {
            mek mekVar2 = this.j;
            if (mekVar2 == null) {
                Intrinsics.j("paymentDetails");
                throw null;
            }
            if (!mekVar2.a.c) {
                Parcelable.Creator<bfk> creator2 = bfk.CREATOR;
                x7oVar.x(y7g.x(y7g.D()));
                return;
            }
            xwj xwjVar = this.d;
            if (xwjVar == null || (vwjVar = xwjVar.b) == null) {
                vgk vgkVar = mekVar2.b;
                String str3 = vgkVar.b;
                yhk yhkVar = vgkVar.g;
                if (yhkVar == null || (str2 = yhkVar.a) == null) {
                    str2 = vgkVar.a;
                }
                vwjVar = new vwj(str3, new BigDecimal(str2), null, null);
            }
            lnd lndVar = this.e;
            lndVar.getClass();
            c(mif.a(lndVar.a(vwjVar), new igk(this, 2), null, 5));
            return;
        }
        if (rfkVar.equals(jfk.a)) {
            gekVar.b();
            return;
        }
        boolean equals = rfkVar.equals(lfk.a);
        ogk ogkVar = this.a;
        if (equals) {
            ozw ozwVar = this.n;
            if (ozwVar == null) {
                Parcelable.Creator<bfk> creator3 = bfk.CREATOR;
                x7oVar.x(y7g.F("Failed to pay. Sbp called without actual sbp handler set"));
                return;
            }
            bro[] broVarArr = bro.a;
            String b = b();
            awc awcVar = new awc(ozwVar);
            jtc jtcVar = new jtc(this, gekVar);
            ogkVar.getClass();
            yop yopVar = ogkVar.g;
            ak0 ak0Var = new ak0(ogkVar, b, awcVar, jtcVar);
            yopVar.getClass();
            c(mif.a(yopVar, ak0Var, null, 5));
            return;
        }
        if (!rfkVar.equals(kfk.a)) {
            Parcelable.Creator<bfk> creator4 = bfk.CREATOR;
            bfk F = y7g.F("Failed to pay. Couldn't handle payment method " + rfkVar.getClass().getSimpleName() + ".");
            x7o x7oVar2 = this.l;
            if (x7oVar2 != null) {
                x7oVar2.x(F);
                return;
            }
            return;
        }
        ozw ozwVar2 = this.n;
        if (ozwVar2 == null) {
            Parcelable.Creator<bfk> creator5 = bfk.CREATOR;
            x7oVar.x(y7g.F("Failed to pay. Sbp called without actual sbp handler set"));
            return;
        }
        String b2 = b();
        n7b n7bVar = new n7b(ozwVar2);
        jtc jtcVar2 = new jtc(this, gekVar);
        ogkVar.getClass();
        yop yopVar2 = ogkVar.g;
        ak0 ak0Var2 = new ak0(ogkVar, b2, n7bVar, jtcVar2, 21);
        yopVar2.getClass();
        c(mif.a(yopVar2, ak0Var2, null, 5));
    }

    public final wgk f() {
        tyh tyhVar;
        mek mekVar = this.j;
        if (mekVar == null) {
            Intrinsics.j("paymentDetails");
            throw null;
        }
        vgk vgkVar = mekVar.b;
        vgkVar.getClass();
        hd hdVar = vgkVar.d;
        id idVar = (hdVar == null ? -1 : jj6.b[hdVar.ordinal()]) == 1 ? id.a : null;
        syh syhVar = vgkVar.f;
        if (syhVar != null) {
            qyh qyhVar = syhVar.d;
            tyhVar = new tyh(syhVar.a, syhVar.b, syhVar.c, qyhVar != null ? new ryh(qyhVar.b, qyhVar.a, qyhVar.d, qyhVar.c, qyhVar.e) : null);
        } else {
            tyhVar = null;
        }
        yhk yhkVar = vgkVar.g;
        return new wgk(vgkVar.a, vgkVar.b, Uri.parse(vgkVar.c), idVar, vgkVar.e, tyhVar, new eck(yhkVar != null ? yhkVar.a : null), vgkVar.h, vgkVar.j);
    }

    public final boolean g(hw3 hw3Var) {
        hw3Var.getClass();
        mek mekVar = this.j;
        if (mekVar == null) {
            Intrinsics.j("paymentDetails");
            throw null;
        }
        qfk o = lsq.o(mekVar.a, hw3Var.a);
        if (o != null) {
            return o.e;
        }
        return false;
    }
}
