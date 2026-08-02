package defpackage;

import java.io.Serializable;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class w extends uif implements vyc {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i, Object obj) {
        super(7);
        this.r = i;
        this.s = obj;
    }

    @Override // defpackage.vyc
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Serializable serializable) {
        switch (this.r) {
            case 0:
                String str = (String) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                String str2 = (String) obj3;
                String str3 = (String) obj4;
                String str4 = (String) obj5;
                long longValue = ((Number) obj6).longValue();
                int intValue = ((Number) serializable).intValue();
                str.getClass();
                str2.getClass();
                str3.getClass();
                str4.getClass();
                qne r0 = gut.r0(intValue, longValue, str, str3, str2, str4);
                ((x60) ((g0c) this.s)).a(booleanValue ? r0.A(null) : qne.m(r0, null, 3));
                break;
            case 1:
                String str5 = (String) obj;
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                String str6 = (String) obj3;
                String str7 = (String) obj4;
                String str8 = (String) obj5;
                long longValue2 = ((Number) obj6).longValue();
                int intValue2 = ((Number) serializable).intValue();
                str5.getClass();
                str6.getClass();
                str7.getClass();
                str8.getClass();
                qne r02 = gut.r0(intValue2, longValue2, str5, str7, str6, str8);
                ((x60) ((g0c) this.s)).a(booleanValue2 ? r02.A(null) : qne.m(r02, null, 3));
                break;
            case 2:
                String str9 = (String) obj;
                boolean booleanValue3 = ((Boolean) obj2).booleanValue();
                String str10 = (String) obj3;
                String str11 = (String) obj4;
                String str12 = (String) obj5;
                long longValue3 = ((Number) obj6).longValue();
                int intValue3 = ((Number) serializable).intValue();
                str9.getClass();
                str10.getClass();
                str11.getClass();
                str12.getClass();
                qne r03 = gut.r0(intValue3, longValue3, str9, str11, str10, str12);
                ((x60) ((g0c) this.s)).a(booleanValue3 ? r03.A(null) : qne.m(r03, null, 3));
                break;
            default:
                String str13 = (String) obj;
                boolean booleanValue4 = ((Boolean) obj2).booleanValue();
                String str14 = (String) obj3;
                String str15 = (String) obj4;
                String str16 = (String) obj5;
                long longValue4 = ((Number) obj6).longValue();
                int intValue4 = ((Number) serializable).intValue();
                str13.getClass();
                str14.getClass();
                str15.getClass();
                str16.getClass();
                qne r04 = gut.r0(intValue4, longValue4, str13, str15, str14, str16);
                g0c g0cVar = (g0c) ((z6u) this.s).d;
                qne A = booleanValue4 ? r04.A(null) : qne.m(r04, null, 3);
                x60 x60Var = (x60) g0cVar;
                x60Var.getClass();
                x60Var.a(A);
                break;
        }
        return Unit.a;
    }
}
