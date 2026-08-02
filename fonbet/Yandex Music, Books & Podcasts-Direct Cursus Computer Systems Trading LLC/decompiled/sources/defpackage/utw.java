package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class utw extends uif implements Function2 {
    public final /* synthetic */ int r = 1;
    public final /* synthetic */ ikn s;
    public final /* synthetic */ xqn t;
    public final /* synthetic */ xqn u;
    public final /* synthetic */ xqn v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public utw(ikn iknVar, xqn xqnVar, xqn xqnVar2, xqn xqnVar3) {
        super(2);
        this.s = iknVar;
        this.t = xqnVar;
        this.u = xqnVar2;
        this.v = xqnVar3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                int intValue = ((Number) obj).intValue();
                long longValue = ((Number) obj2).longValue();
                if (intValue == 1) {
                    xqn xqnVar = this.t;
                    if (xqnVar.a != null) {
                        kac.f("bad zip: NTFS extra attribute tag 0x0001 repeated");
                        break;
                    } else if (longValue != 24) {
                        kac.f("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                        break;
                    } else {
                        ikn iknVar = this.s;
                        xqnVar.a = Long.valueOf(iknVar.o());
                        this.u.a = Long.valueOf(iknVar.o());
                        this.v.a = Long.valueOf(iknVar.o());
                    }
                }
                break;
            default:
                int intValue2 = ((Number) obj).intValue();
                long longValue2 = ((Number) obj2).longValue();
                if (intValue2 == 21589) {
                    if (longValue2 < 1) {
                        kac.f("bad zip: extended timestamp extra too short");
                        break;
                    } else {
                        ikn iknVar2 = this.s;
                        byte readByte = iknVar2.readByte();
                        boolean z = (readByte & 1) == 1;
                        boolean z2 = (readByte & 2) == 2;
                        boolean z3 = (readByte & 4) == 4;
                        long j = z ? 5L : 1L;
                        if (z2) {
                            j += 4;
                        }
                        if (z3) {
                            j += 4;
                        }
                        if (longValue2 < j) {
                            kac.f("bad zip: extended timestamp extra too short");
                            break;
                        } else {
                            if (z) {
                                this.t.a = Integer.valueOf(iknVar2.g());
                            }
                            if (z2) {
                                this.u.a = Integer.valueOf(iknVar2.g());
                            }
                            if (z3) {
                                this.v.a = Integer.valueOf(iknVar2.g());
                            }
                        }
                    }
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public utw(xqn xqnVar, ikn iknVar, xqn xqnVar2, xqn xqnVar3) {
        super(2);
        this.t = xqnVar;
        this.s = iknVar;
        this.u = xqnVar2;
        this.v = xqnVar3;
    }
}
