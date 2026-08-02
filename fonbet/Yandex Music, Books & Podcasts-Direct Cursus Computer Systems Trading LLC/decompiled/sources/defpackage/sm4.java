package defpackage;

import android.content.Context;
import com.yandex.pulse.metrics.o;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

/* loaded from: classes3.dex */
public final /* synthetic */ class sm4 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ sm4(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = 0;
        switch (this.a) {
            case 0:
                ((String) obj).getClass();
                return "?";
            case 1:
                ((String) obj).getClass();
                return "?";
            case 2:
                ((String) obj).getClass();
                return "?";
            case 3:
                ((String) obj).getClass();
                return "?";
            case 4:
                return Boolean.valueOf(((tre) obj) instanceof rqm);
            case 5:
                u51 u51Var = (u51) obj;
                u51Var.getClass();
                return u51Var.b;
            case 6:
                o18 o18Var = (o18) obj;
                vz1.e(o18Var, q8r.class).E(new sm4(7));
                o18Var.b(hag.I(cce.class)).E(new sm4(8));
                jyr jyrVar = t1c.a;
                s1c s1cVar = new s1c();
                synchronized (hs4.class) {
                    hs4.d = s1cVar;
                    hs4.c = null;
                }
                return Unit.a;
            case 7:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                bdt I = hag.I(z66.class);
                qdc qdcVar = l13Var.a;
                Set set = l13Var.b;
                z66 z66Var = (z66) qdcVar.D(I, l13Var, set);
                Context context = (Context) qdcVar.D(hag.I(Context.class), l13Var, set);
                xzi xziVar = new xzi(z66Var);
                is4 is4Var = new is4(1);
                fi1 fi1Var = new fi1(1);
                tao taoVar = new tao();
                taoVar.a = context;
                taoVar.b = xziVar;
                taoVar.c = is4Var;
                taoVar.e = fi1Var;
                taoVar.d = btf.b(new r8r(taoVar, i));
                return new s8r(btf.b(new rln(25, taoVar, (i0j) qdcVar.D(hag.I(i0j.class), l13Var, set))), (x8r) ((jyr) taoVar.d).getValue());
            case 8:
                return ((q8r) vz1.l((l13) obj, q8r.class)).b();
            case 9:
                mtq mtqVar = (mtq) obj;
                mtqVar.getClass();
                return mtqVar.a;
            case 10:
                ((IntRange) obj).getClass();
                return Unit.a;
            case 11:
                opf opfVar = (opf) obj;
                opfVar.getClass();
                jpa.B(opfVar, c3x.h(4287221203L), 0L, 0L, 0.0f, null, 0, 126);
                return Unit.a;
            case 12:
                ((jfp) obj).getClass();
                return Unit.a;
            case 13:
                vz1.e((o18) obj, ku4.class).E(new sm4(14));
                return Unit.a;
            case 14:
                ((l13) obj).getClass();
                return new ku4();
            case 15:
                so1 so1Var = (so1) obj;
                so1Var.getClass();
                return so1Var.a.a;
            case 16:
                o18 o18Var2 = (o18) obj;
                vz1.e(o18Var2, nv4.class).E(new sm4(17));
                o18Var2.b(hag.I(xo1.class)).E(new sm4(18));
                o18Var2.b(hag.I(wo1.class)).E(new sm4(19));
                o18Var2.b(hag.I(dp1.class)).E(new sm4(20));
                o18Var2.b(hag.I(jp1.class)).E(new sm4(21));
                return Unit.a;
            case 17:
                ((l13) obj).getClass();
                return new nv4();
            case 18:
                ((l13) obj).getClass();
                return new xo1();
            case 19:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                return new wo1((xo1) l13Var2.a.D(hag.I(xo1.class), l13Var2, l13Var2.b));
            case 20:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                return (dp1) ((wo1) l13Var3.a.D(hag.I(wo1.class), l13Var3, l13Var3.b)).a.getValue();
            case 21:
                l13 l13Var4 = (l13) obj;
                l13Var4.getClass();
                return (jp1) ((wo1) l13Var4.a.D(hag.I(wo1.class), l13Var4, l13Var4.b)).b.getValue();
            case 22:
                vuf vufVar = (vuf) obj;
                vufVar.getClass();
                vuf.Y(vufVar, null, tt0.g, 3);
                vuf.Y(vufVar, null, tt0.h, 3);
                vuf.Y(vufVar, null, tt0.i, 3);
                vuf.Y(vufVar, null, tt0.j, 3);
                return Unit.a;
            case 23:
                String str = (String) obj;
                return hrg.A(str, "'", str, "'");
            case 24:
                String str2 = (String) obj;
                return hrg.A(str2, "'", str2, "'");
            case 25:
                vz1.e((o18) obj, qy4.class).E(new sm4(26));
                return Unit.a;
            case 26:
                ((l13) obj).getClass();
                return new qy4();
            case 27:
                ((l13) obj).getClass();
                return new p44();
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((l13) obj).getClass();
                return (gnu) l18.b.c(hag.I(gnu.class));
            default:
                vz1.e((o18) obj, ow4.class).E(new z35(i));
                return Unit.a;
        }
    }
}
