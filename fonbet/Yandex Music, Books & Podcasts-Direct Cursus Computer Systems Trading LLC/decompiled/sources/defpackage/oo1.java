package defpackage;

import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class oo1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    public /* synthetic */ oo1(float f, float f2, int i) {
        this.a = i;
        this.b = f;
        this.c = f2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                jx7 jx7Var = (jx7) obj;
                jx7Var.getClass();
                float f = this.b / 2;
                return new enj(swf.i(jx7Var.n0(this.c + f), jx7Var.n0(f)));
            case 1:
                zco zcoVar = (zco) obj;
                zcoVar.getClass();
                zcoVar.y(this.b + this.c);
                return Unit.a;
            case 2:
                np3 np3Var = (np3) obj;
                np3Var.getClass();
                float f2 = this.c * 2;
                float f3 = this.b;
                float density = np3Var.getDensity() * (f2 + f3);
                float density2 = np3Var.getDensity() * f3 * 0.2f;
                float d = (nmq.d(np3Var.a.e()) - density) / 2.0f;
                Float valueOf = Float.valueOf(0.0f);
                long j = d85.m;
                Pair pair = new Pair(valueOf, new d85(j));
                Float valueOf2 = Float.valueOf(0.5f);
                long j2 = d85.b;
                Pair pair2 = new Pair(valueOf2, new d85(d85.b(j2, 0.35f, 0.0f, 0.0f, 0.0f, 14)));
                Float valueOf3 = Float.valueOf(1.0f);
                o6g G = y9w.G(new Pair[]{pair, pair2, new Pair(valueOf3, new d85(j2))}, d - density2, d, 8);
                float f4 = d + density;
                return np3Var.b(new s24(G, y9w.G(new Pair[]{new Pair(valueOf, new d85(j2)), new Pair(valueOf2, new d85(d85.b(j2, 0.35f, 0.0f, 0.0f, 0.0f, 14))), new Pair(valueOf3, new d85(j))}, f4, f4 + density2, 8), 2));
            case 3:
                np3 np3Var2 = (np3) obj;
                np3Var2.getClass();
                float f5 = this.c * 2;
                float f6 = this.b;
                float density3 = np3Var2.getDensity() * (f5 + f6);
                float density4 = np3Var2.getDensity() * f6 * 0.2f;
                float d2 = (nmq.d(np3Var2.a.e()) - density3) / 2.0f;
                Float valueOf4 = Float.valueOf(0.0f);
                long j3 = d85.m;
                Pair pair3 = new Pair(valueOf4, new d85(j3));
                Float valueOf5 = Float.valueOf(0.5f);
                long j4 = d85.b;
                Pair pair4 = new Pair(valueOf5, new d85(d85.b(j4, 0.35f, 0.0f, 0.0f, 0.0f, 14)));
                Float valueOf6 = Float.valueOf(1.0f);
                o6g G2 = y9w.G(new Pair[]{pair3, pair4, new Pair(valueOf6, new d85(j4))}, d2 - density4, d2, 8);
                float f7 = d2 + density3;
                return np3Var2.b(new s24(G2, y9w.G(new Pair[]{new Pair(valueOf4, new d85(j4)), new Pair(valueOf5, new d85(d85.b(j4, 0.35f, 0.0f, 0.0f, 0.0f, 14))), new Pair(valueOf6, new d85(j3))}, f7, f7 + density4, 8), 3));
            default:
                Map map = (Map) obj;
                map.getClass();
                Object obj2 = map.get("initialCenterX");
                obj2.getClass();
                int intValue = ((Integer) obj2).intValue();
                Object obj3 = map.get("initialCenterY");
                obj3.getClass();
                int intValue2 = ((Integer) obj3).intValue();
                Object obj4 = map.get("initialOffsetX");
                obj4.getClass();
                float floatValue = ((Float) obj4).floatValue();
                Object obj5 = map.get("initialOffsetY");
                obj5.getClass();
                float floatValue2 = ((Float) obj5).floatValue();
                Object obj6 = map.get("initialScale");
                obj6.getClass();
                float floatValue3 = ((Float) obj6).floatValue();
                Object obj7 = map.get("initialAlpha");
                obj7.getClass();
                float floatValue4 = ((Float) obj7).floatValue();
                Object obj8 = map.get("scrollMode");
                obj8.getClass();
                jeh jehVar = ((Integer) obj8).intValue() == 1 ? jeh.b : jeh.a;
                Object obj9 = map.get("dragScrollMode");
                obj9.getClass();
                int intValue3 = ((Integer) obj9).intValue();
                heh hehVar = intValue3 != 1 ? intValue3 != 2 ? heh.a : heh.c : heh.b;
                Object obj10 = map.get("initialIsTitleVisible");
                obj10.getClass();
                boolean booleanValue = ((Boolean) obj10).booleanValue();
                Object obj11 = map.get("initialIsHudVisible");
                obj11.getClass();
                boolean booleanValue2 = ((Boolean) obj11).booleanValue();
                Object obj12 = map.get("initialIsHeaderVisible");
                obj12.getClass();
                boolean booleanValue3 = ((Boolean) obj12).booleanValue();
                Object obj13 = map.get("initialIsFooterVisible");
                obj13.getClass();
                boolean booleanValue4 = ((Boolean) obj13).booleanValue();
                Object obj14 = map.get("initialIsCardInfoVisible");
                obj14.getClass();
                boolean booleanValue5 = ((Boolean) obj14).booleanValue();
                Object obj15 = map.get("initialIsOneToOneHintActive");
                obj15.getClass();
                return new rxv(floatValue, floatValue2, intValue, intValue2, jehVar, floatValue3, floatValue4, booleanValue2, booleanValue, booleanValue5, booleanValue3, booleanValue4, ((Boolean) obj15).booleanValue(), hehVar, this.b, this.c);
        }
    }
}
