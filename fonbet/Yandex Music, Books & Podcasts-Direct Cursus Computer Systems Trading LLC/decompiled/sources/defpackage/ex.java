package defpackage;

import com.yandex.pulse.metrics.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class ex implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ ex(int i, Function0 function0) {
        this.a = i;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        switch (this.a) {
            case 0:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                break;
            case 1:
                ((jpa) obj).getClass();
                this.b.invoke();
                break;
            case 2:
                wof wofVar = (wof) obj;
                wofVar.getClass();
                if (!ltg.D(wofVar).y(wofVar, true).i()) {
                    this.b.invoke();
                }
                break;
            case 3:
                ma0 ma0Var = (ma0) obj;
                ma0Var.getClass();
                na0 na0Var = new na0(ma0Var.a, this.b);
                na0Var.f.setValue(Boolean.valueOf(ma0Var.b));
                break;
            case 4:
                jpa jpaVar = (jpa) obj;
                jpaVar.getClass();
                jpa.B(jpaVar, ((d85) this.b.invoke()).a, 0L, 0L, 0.0f, null, 0, 126);
                break;
            case 5:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.h(jfpVar, new or(10, this.b));
                break;
            case 6:
                ((Boolean) obj).booleanValue();
                this.b.invoke();
                break;
            case 7:
                ((Boolean) obj).booleanValue();
                this.b.invoke();
                break;
            case 8:
                np3 np3Var = (np3) obj;
                np3Var.getClass();
                long j = ((d85) this.b.invoke()).a;
                break;
            case 9:
                np3 np3Var2 = (np3) obj;
                np3Var2.getClass();
                long j2 = ((d85) this.b.invoke()).a;
                break;
            case 10:
                ((Boolean) obj).booleanValue();
                this.b.invoke();
                break;
            case 11:
                opf opfVar = (opf) obj;
                opfVar.getClass();
                jpa.B(opfVar, ((d85) this.b.invoke()).a, 0L, 0L, 0.0f, null, 0, 126);
                opfVar.a();
                break;
            case 12:
                ((ahs) obj).getClass();
                this.b.invoke();
                break;
            case 13:
                zco zcoVar = (zco) obj;
                zcoVar.getClass();
                zcoVar.c(true);
                zcoVar.a(((Number) this.b.invoke()).floatValue());
                break;
            case 14:
                jpa jpaVar2 = (jpa) obj;
                jpaVar2.getClass();
                jpa.B(jpaVar2, ((d85) this.b.invoke()).a, 0L, 0L, 0.0f, null, 0, 126);
                break;
            case 15:
                String str2 = (String) obj;
                str2.getClass();
                Function0 function0 = this.b;
                ssg.a(2, (function0 == null || (str = (String) function0.invoke()) == null) ? "OkHttpLog" : "OkHttpLog:".concat(str), str2, null);
                break;
            case 16:
                ((Boolean) obj).booleanValue();
                this.b.invoke();
                break;
            case 17:
                opf opfVar2 = (opf) obj;
                opfVar2.getClass();
                opfVar2.a();
                jpa.B(opfVar2, ((ymk) this.b.invoke()).a, 0L, opfVar2.a.e(), 0.0f, null, 27, 58);
                break;
            case 18:
                ((xjo) obj).getClass();
                break;
            case 19:
                zco zcoVar2 = (zco) obj;
                zcoVar2.getClass();
                float floatValue = ((Number) this.b.invoke()).floatValue();
                zcoVar2.k(floatValue);
                zcoVar2.n(floatValue);
                break;
            case 20:
                ((oa8) obj).getClass();
                break;
            case 21:
                zco zcoVar3 = (zco) obj;
                zcoVar3.getClass();
                zcoVar3.a(((Number) this.b.invoke()).floatValue());
                break;
            case 22:
                zco zcoVar4 = (zco) obj;
                zcoVar4.getClass();
                zcoVar4.a(1.0f - yhn.c(((Number) this.b.invoke()).floatValue(), 0.0f, 1.0f));
                break;
            case 23:
                zco zcoVar5 = (zco) obj;
                zcoVar5.getClass();
                zcoVar5.a(((zrq) this.b.invoke()).b);
                zcoVar5.d(2);
                break;
            case 24:
                ((wof) obj).getClass();
                this.b.invoke();
                break;
            case 25:
                ((wof) obj).getClass();
                this.b.invoke();
                break;
            case 26:
                ((wof) obj).getClass();
                this.b.invoke();
                break;
            case 27:
                ((wof) obj).getClass();
                this.b.invoke();
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((wof) obj).getClass();
                this.b.invoke();
                break;
            default:
                ((wof) obj).getClass();
                this.b.invoke();
                break;
        }
        return Unit.a;
    }
}
