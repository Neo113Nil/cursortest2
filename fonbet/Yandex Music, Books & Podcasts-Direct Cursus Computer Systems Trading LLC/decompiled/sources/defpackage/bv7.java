package defpackage;

import com.yandex.pulse.metrics.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class bv7 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ bv7(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        htr htrVar;
        switch (this.a) {
            case 0:
                return new zf6(ern.a(md.class), (t9f) null, new t9f[0]);
            case 1:
                return new gt();
            case 2:
                return new uus();
            case 3:
                return new ivl();
            case 4:
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
                return htrVar.c;
            case 5:
                return new w08();
            case 6:
                return new u08();
            case 7:
                return qld.m();
            case 8:
                return Unit.a;
            case 9:
                return new t88();
            case 10:
                return 2;
            case 11:
                return new n98();
            case 12:
                return new zf6(ern.a(md.class), (t9f) null, new t9f[0]);
            case 13:
                return new u3a();
            case 14:
                return Unit.a;
            case 15:
                tkr tkrVar = tkr.a;
                return new wsd(tkrVar, new qy0(tkrVar, 0), 1);
            case 16:
                l18 l18Var = l18.b;
                bdt I = hag.I(qy7.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                return ((qy7) qdcVar.C(I)).a();
            case 17:
                return new ida();
            case 18:
                return new jda();
            case 19:
                return new bea();
            case 20:
                return new yea();
            case 21:
                return new ufa();
            case 22:
                return new gha();
            case 23:
                return new hha();
            case 24:
                return new zha();
            case 25:
                return new wia();
            case 26:
                return new qja();
            case 27:
                return new yyq();
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new kij();
            default:
                return new xaa();
        }
    }
}
