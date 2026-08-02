package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class xp implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sdr b;

    public /* synthetic */ xp(sdr sdrVar, int i) {
        this.a = i;
        this.b = sdrVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        sdr sdrVar = this.b;
        switch (i) {
            case 0:
                zco zcoVar = (zco) obj;
                zcoVar.getClass();
                float floatValue = ((Number) sdrVar.getValue()).floatValue();
                zcoVar.k(floatValue);
                zcoVar.n(floatValue);
                break;
            case 1:
                jx7 jx7Var = (jx7) obj;
                jx7Var.getClass();
                break;
            case 2:
                zco zcoVar2 = (zco) obj;
                zcoVar2.getClass();
                zcoVar2.a(((Number) sdrVar.getValue()).floatValue());
                break;
            case 3:
                jx7 jx7Var2 = (jx7) obj;
                jx7Var2.getClass();
                break;
            case 4:
                zco zcoVar3 = (zco) obj;
                zcoVar3.getClass();
                zcoVar3.j(((Number) sdrVar.getValue()).floatValue());
                break;
            case 5:
                zco zcoVar4 = (zco) obj;
                zcoVar4.getClass();
                zcoVar4.a(((Number) sdrVar.getValue()).floatValue());
                break;
            case 6:
                zco zcoVar5 = (zco) obj;
                zcoVar5.getClass();
                zcoVar5.a(((Number) sdrVar.getValue()).floatValue());
                break;
            case 7:
                zco zcoVar6 = (zco) obj;
                zcoVar6.getClass();
                zcoVar6.a(vwb.w(sdrVar));
                break;
            case 8:
                zco zcoVar7 = (zco) obj;
                zcoVar7.getClass();
                zcoVar7.a(vwb.w(sdrVar));
                break;
            case 9:
                zco zcoVar8 = (zco) obj;
                zcoVar8.getClass();
                zcoVar8.a(vwb.w(sdrVar));
                break;
            case 10:
                zco zcoVar9 = (zco) obj;
                zcoVar9.getClass();
                zcoVar9.a(vwb.w(sdrVar));
                break;
            case 11:
                zco zcoVar10 = (zco) obj;
                zcoVar10.getClass();
                zcoVar10.a(vwb.w(sdrVar));
                break;
            case 12:
                zco zcoVar11 = (zco) obj;
                zcoVar11.getClass();
                zcoVar11.a(vwb.w(sdrVar));
                break;
            case 13:
                jfp jfpVar = (jfp) obj;
                int i2 = kii.p;
                jfpVar.getClass();
                wfp.i(jfpVar, new ky4(1, ((List) sdrVar.getValue()).size()));
                break;
            case 14:
                View view = (View) obj;
                view.getClass();
                view.setVisibility(((q5k) sdrVar.getValue()) instanceof o5k ? 0 : 8);
                break;
            case 15:
                zco zcoVar12 = (zco) obj;
                zcoVar12.getClass();
                zcoVar12.k(((Number) sdrVar.getValue()).floatValue());
                zcoVar12.n(((Number) sdrVar.getValue()).floatValue());
                break;
            case 16:
                zco zcoVar13 = (zco) obj;
                zcoVar13.getClass();
                float floatValue2 = ((Number) sdrVar.getValue()).floatValue();
                zcoVar13.k(floatValue2);
                zcoVar13.n(floatValue2);
                break;
            case 17:
                ((jx7) obj).getClass();
                break;
            case 18:
                vuf vufVar = (vuf) obj;
                vufVar.getClass();
                ArrayList arrayList = new ArrayList(5);
                while (r5 < 5) {
                    arrayList.add(Unit.a);
                    r5++;
                }
                vufVar.Z(arrayList.size(), null, new wyl(arrayList, 6), new wn5(new cl(27, arrayList, sdrVar), -1091073711, true));
                break;
            case 19:
                ((jx7) obj).getClass();
                break;
            case 20:
                ((jx7) obj).getClass();
                break;
            case 21:
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                wfp.n(jfpVar2, 1);
                wfp.s(jfpVar2, (String) sdrVar.getValue());
                break;
            default:
                zco zcoVar14 = (zco) obj;
                zcoVar14.getClass();
                zcoVar14.a(((Number) sdrVar.getValue()).floatValue());
                break;
        }
        return Unit.a;
    }
}
