package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.yandex.music.shared.utils.ThrowablesKt;
import com.yandex.pulse.metrics.o;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.payment.tariffpaywall.TariffPaywallActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class d5s implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ d5s(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable meAndCauses$lambda$0;
        switch (this.a) {
            case 0:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                bdt I = hag.I(f7l.class);
                qdc qdcVar = l13Var.a;
                Set set = l13Var.b;
                break;
            case 1:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                bdt I2 = hag.I(f7l.class);
                qdc qdcVar2 = l13Var2.a;
                Set set2 = l13Var2.b;
                break;
            case 2:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                bdt I3 = hag.I(f7l.class);
                qdc qdcVar3 = l13Var3.a;
                Set set3 = l13Var3.b;
                break;
            case 3:
                l13 l13Var4 = (l13) obj;
                l13Var4.getClass();
                bdt I4 = hag.I(Context.class);
                qdc qdcVar4 = l13Var4.a;
                Set set4 = l13Var4.b;
                break;
            case 4:
                ((l13) obj).getClass();
                break;
            case 5:
                ((l13) obj).getClass();
                m4s m4sVar = new m4s();
                bdt I5 = hag.I(t5s.class);
                l18 l18Var = l18.b;
                l18Var.b(I5, true);
                l18Var.b(hag.I(j5s.class), true);
                break;
            case 6:
                l13 l13Var5 = (l13) obj;
                l13Var5.getClass();
                break;
            case 7:
                l13 l13Var6 = (l13) obj;
                l13Var6.getClass();
                bdt I6 = hag.I(Context.class);
                qdc qdcVar5 = l13Var6.a;
                Set set5 = l13Var6.b;
                break;
            case 8:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.e(jfpVar);
                break;
            case 9:
                int i = TariffPaywallActivity.z;
                ((Resources) obj).getClass();
                break;
            case 10:
                ((l13) obj).getClass();
                u7s u7sVar = new u7s();
                u7sVar.b = cge.e;
                break;
            case 11:
                ((l13) obj).getClass();
                n7s n7sVar = new n7s();
                n7sVar.a = new LinkedHashMap();
                n7sVar.b = new LinkedHashMap();
                n7sVar.c = new LinkedHashMap();
                break;
            case 12:
                ((l13) obj).getClass();
                break;
            case 13:
                ((l13) obj).getClass();
                a7s a7sVar = new a7s();
                a7sVar.a = new LinkedHashMap();
                break;
            case 14:
                ((l13) obj).getClass();
                break;
            case 15:
                ((l13) obj).getClass();
                break;
            case 16:
                l13 l13Var7 = (l13) obj;
                l13Var7.getClass();
                break;
            case 17:
                l13 l13Var8 = (l13) obj;
                l13Var8.getClass();
                break;
            case 18:
                l13 l13Var9 = (l13) obj;
                l13Var9.getClass();
                break;
            case 19:
                l13 l13Var10 = (l13) obj;
                l13Var10.getClass();
                break;
            case 20:
                vz1.e((o18) obj, i7s.class).D(new d5s(21));
                break;
            case 21:
                ((l13) obj).getClass();
                break;
            case 22:
                if (!((Boolean) obj).booleanValue()) {
                    break;
                } else {
                    break;
                }
            case 23:
                cge cgeVar = (cge) obj;
                cgeVar.getClass();
                cge cgeVar2 = cge.c;
                if (cgeVar != cgeVar2) {
                    break;
                }
                break;
            case 24:
                ((String) obj).getClass();
                break;
            case 25:
                u51 u51Var = (u51) obj;
                u51Var.getClass();
                break;
            case 26:
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                wfp.w(jfpVar2);
                wfp.x(jfpVar2, -1.0f);
                break;
            case 27:
                meAndCauses$lambda$0 = ThrowablesKt.meAndCauses$lambda$0((Throwable) obj);
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((ahs) obj).getClass();
                break;
            default:
                jfp jfpVar3 = (jfp) obj;
                jfpVar3.getClass();
                wfp.e(jfpVar3);
                break;
        }
        return Unit.a;
    }
}
