package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class k05 implements pjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ tc4 b;
    public final /* synthetic */ e15 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    public /* synthetic */ k05(tc4 tc4Var, e15 e15Var, String str, String str2, int i) {
        this.a = i;
        this.b = tc4Var;
        this.c = e15Var;
        this.d = str;
        this.e = str2;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object collect = this.b.collect(new j05(rjcVar, this.c, this.d, this.e, 0), continuation);
                if (collect != nm6.a) {
                    break;
                }
                break;
            default:
                Object collect2 = this.b.collect(new j05(rjcVar, this.c, this.d, this.e, 1), continuation);
                if (collect2 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
