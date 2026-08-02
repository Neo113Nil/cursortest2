package defpackage;

import com.google.gson.Gson;
import com.yandex.pulse.metrics.o;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class sxd implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ sxd(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z = false;
        switch (this.a) {
            case 0:
                jyr jyrVar = txd.e;
                l18 l18Var = l18.b;
                bdt I = hag.I(byb.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                return Boolean.valueOf(((txd) ((byb) qdcVar.C(I)).c(ern.a(txd.class))).h());
            case 1:
                wjb wjbVar = wjb.MainScreen;
                hlb hlbVar = hlb.Fullscreen;
                jyr jyrVar2 = o5j.e;
                return new cvo(wjbVar, hlbVar, (glb) null, new dvo(tyf.v() ? "mobile_foryou" : "main"), (avo) null, 52);
            case 2:
                return new w5r();
            case 3:
                jyr jyrVar3 = c2e.e;
                jyr jyrVar4 = t5j.e;
                if (wyf.M()) {
                    l18 l18Var2 = l18.b;
                    bdt I2 = hag.I(byb.class);
                    qdc qdcVar2 = l18Var2.a;
                    qdcVar2.getClass();
                    if (Intrinsics.d(((c2e) ((byb) qdcVar2.C(I2)).c(ern.a(c2e.class))).b(), "on")) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 4:
                wjb wjbVar2 = wjb.MainScreen;
                hlb hlbVar2 = hlb.Fullscreen;
                jyr jyrVar5 = o5j.e;
                return new cvo(wjbVar2, hlbVar2, (glb) null, new dvo(tyf.v() ? "mobile_foryou" : "main"), (avo) null, 52);
            case 5:
                return "HttpCacheNetworkLayer";
            case 6:
                return new lnq();
            case 7:
                return new fvf(0, 0);
            case 8:
                return qld.m();
            case 9:
                return new hke();
            case 10:
                return new ple();
            case 11:
                l18 l18Var3 = l18.b;
                return new ile(l18Var3.b(hag.I(lwc.class), true), l18Var3.b(hag.I(c72.class), true), l18Var3.b(hag.I(z66.class), true), l18Var3.b(hag.I(f7l.class), true));
            case 12:
                return (ani) l18.b.c(hag.I(ani.class));
            case 13:
                l18 l18Var4 = l18.b;
                bdt I3 = hag.I(nst.class);
                qdc qdcVar3 = l18Var4.a;
                qdcVar3.getClass();
                x97.y(cmd.a, ca8.b, null, new zts((nst) qdcVar3.C(I3), null, 10), 2);
                return Unit.a;
            case 14:
                return new g3u();
            case 15:
                return new d1f();
            case 16:
                return new LinkedHashMap();
            case 17:
                return new Gson();
            case 18:
                return y6f.b;
            case 19:
                return n5f.b;
            case 20:
                return k5f.b;
            case 21:
                return s5f.b;
            case 22:
                return f4f.b;
            case 23:
                return gs6.b;
            case 24:
                return new fdf();
            case 25:
                return new gdf();
            case 26:
                return new hdf();
            case 27:
                return new idf();
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new cff();
            default:
                return new dff();
        }
    }

    public /* synthetic */ sxd(int i, Object obj) {
        this.a = i;
    }
}
