package defpackage;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class v extends uif implements ryc {
    public final /* synthetic */ int r;
    public final /* synthetic */ g0c s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(g0c g0cVar, int i) {
        super(4);
        this.r = i;
        this.s = g0cVar;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.r) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                String str3 = (String) obj3;
                String str4 = (String) obj4;
                eta.r(str, str2, str3, str4);
                ((x60) this.s).a(gut.q0(str, str3, str2, str4));
                break;
            case 1:
                String str5 = (String) obj;
                String str6 = (String) obj2;
                String str7 = (String) obj3;
                String str8 = (String) obj4;
                eta.r(str5, str6, str7, str8);
                ((x60) this.s).a(gut.q0(str5, str7, str6, str8));
                break;
            default:
                String str9 = (String) obj;
                String str10 = (String) obj2;
                String str11 = (String) obj3;
                String str12 = (String) obj4;
                eta.r(str9, str10, str11, str12);
                ((x60) this.s).a(gut.q0(str9, str11, str10, str12));
                break;
        }
        return Unit.a;
    }
}
