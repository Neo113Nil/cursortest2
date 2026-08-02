package defpackage;

import android.app.Application;
import com.yandex.pulse.metrics.o;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class rn6 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ rn6(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                opf opfVar = (opf) obj;
                opfVar.getClass();
                jpa.B(opfVar, c3x.h(4287221203L), 0L, 0L, 0.0f, null, 0, 126);
                return Unit.a;
            case 1:
                opf opfVar2 = (opf) obj;
                opfVar2.getClass();
                jpa.B(opfVar2, c3x.h(4287221203L), 0L, 0L, 0.0f, null, 0, 126);
                return Unit.a;
            case 2:
                vz1.e((o18) obj, jp6.class).E(new rn6(3));
                return Unit.a;
            case 3:
                ((l13) obj).getClass();
                return new jp6();
            case 4:
                o18 o18Var = (o18) obj;
                vz1.e(o18Var, kt6.class).E(new rn6(5));
                o18Var.b(hag.I(lt6.class)).E(new rn6(6));
                return Unit.a;
            case 5:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                return new kt6((lt6) l13Var.a.D(hag.I(lt6.class), l13Var, l13Var.b));
            case 6:
                ((l13) obj).getClass();
                return new lt6();
            case 7:
                ((jfp) obj).getClass();
                return Unit.a;
            case 8:
                ((jfp) obj).getClass();
                return Unit.a;
            case 9:
                wv6 wv6Var = (wv6) obj;
                wv6Var.getClass();
                return wv6Var.a;
            case 10:
                return yhn.m(0, eeh.a(250.0d / ((Float) obj).floatValue()));
            case 11:
                double floatValue = ((Float) obj).floatValue();
                return yhn.m(eeh.a(250.0d / floatValue), eeh.a(500.0d / floatValue));
            case 12:
                double floatValue2 = ((Float) obj).floatValue();
                return yhn.m(eeh.a(500.0d / floatValue2), eeh.a(2000.0d / floatValue2));
            case 13:
                double floatValue3 = ((Float) obj).floatValue();
                return yhn.m(eeh.a(2000.0d / floatValue3), eeh.a(4000.0d / floatValue3));
            case 14:
                g4f g4fVar = (g4f) obj;
                g4fVar.getClass();
                g4fVar.c = true;
                g4fVar.a = true;
                g4fVar.b = false;
                g4fVar.e = true;
                g4fVar.g = true;
                g4fVar.d = true;
                return Unit.a;
            case 15:
                return ((e87) obj).c;
            case 16:
                o18 o18Var2 = (o18) obj;
                vz1.e(o18Var2, p4t.class).E(new rn6(17));
                o18Var2.b(hag.I(n4t.class)).E(new rn6(18));
                o18Var2.b(hag.I(w87.class)).E(new rn6(19));
                return Unit.a;
            case 17:
                ((l13) obj).getClass();
                return new p4t();
            case 18:
                ((l13) obj).getClass();
                return new n4t();
            case 19:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                bdt I = hag.I(n4t.class);
                qdc qdcVar = l13Var2.a;
                Set set = l13Var2.b;
                return new w87((n4t) qdcVar.D(I, l13Var2, set), (p4t) qdcVar.D(hag.I(p4t.class), l13Var2, set));
            case 20:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                StringBuilder m = tlm.m(str, " : ");
                if (value instanceof Object[]) {
                    value = Arrays.toString((Object[]) value);
                    value.getClass();
                }
                m.append(value);
                return m.toString();
            case 21:
                vz1.e((o18) obj, cc7.class).E(new rn6(22));
                return Unit.a;
            case 22:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                return new dc7((Application) l13Var3.a.D(hag.I(Application.class), l13Var3, l13Var3.b));
            case 23:
                l13 l13Var4 = (l13) obj;
                l13Var4.getClass();
                bdt I2 = hag.I(i5h.class);
                qdc qdcVar2 = l13Var4.a;
                Set set2 = l13Var4.b;
                return new p4h((i5h) qdcVar2.D(I2, l13Var4, set2), (o9w) qdcVar2.D(hag.I(o9w.class), l13Var4, set2));
            case 24:
                return (oou) vz1.l((l13) obj, uou.class);
            case 25:
                vz1.e((o18) obj, le7.class).E(new rn6(26));
                return Unit.a;
            case 26:
                l13 l13Var5 = (l13) obj;
                l13Var5.getClass();
                return new le7();
            case 27:
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                return entry2.getKey() + "=" + entry2.getValue();
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                vz1.e((o18) obj, qh7.class).D(new rn6(29));
                return Unit.a;
            default:
                ((l13) obj).getClass();
                return new qh7();
        }
    }
}
