package defpackage;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class vt4 implements tt4 {
    public final grl a;
    public final fkn b;
    public final fkn c;
    public final x8a d;

    public vt4(grl grlVar, jvo jvoVar) {
        grlVar.getClass();
        jvoVar.getClass();
        this.a = grlVar;
        this.b = grlVar.D;
        this.c = grlVar.B;
        this.d = new x8a("likeClick");
    }

    @Override // defpackage.tt4
    public final vdr c() {
        return this.c;
    }

    @Override // defpackage.tt4
    public final void d() {
        if (this.d.e("item")) {
            grl grlVar = this.a;
            grlVar.getClass();
            x97.y(ot0.F(grlVar), null, null, new frl(1, grlVar, null), 3);
        }
    }

    @Override // defpackage.tt4
    public final void e() {
        String str;
        String str2;
        nwh nwhVar = this.a.C;
        if (nwhVar.a) {
            nmb nmbVar = (nmb) nwhVar.h;
            nwk p = nwhVar.p();
            String str3 = "";
            if (p == null || (str = p.a) == null) {
                str = "";
            }
            nwk p2 = nwhVar.p();
            if (p2 != null && (str2 = p2.b) != null) {
                str3 = str2;
            }
            okb w = nwh.w((uz7) ((vdr) nwhVar.c).getValue());
            nmbVar.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("page_type", "object");
            linkedHashMap.put("track_id", str);
            linkedHashMap.put("track_name", str3);
            dfi.p(1, CommonUrlParts.DEVICE_TYPE, w.a, "_meta", linkedHashMap);
            nmbVar.C("CollapsedPlayer.Showed", linkedHashMap);
        }
    }

    @Override // defpackage.tt4
    public final void f() {
        this.a.N();
    }

    @Override // defpackage.tt4
    public final void g(yur yurVar) {
        yurVar.getClass();
        int ordinal = yurVar.ordinal();
        grl grlVar = this.a;
        if (ordinal == 0) {
            grlVar.M(true);
        } else if (ordinal == 1) {
            grlVar.L(true);
        } else {
            b6e.s();
        }
    }

    @Override // defpackage.tt4
    public final vdr getState() {
        return this.b;
    }
}
