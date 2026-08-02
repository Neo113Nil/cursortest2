package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class vjd implements rjc, zyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ bqi b;

    public /* synthetic */ vjd(bqi bqiVar, int i) {
        this.a = i;
        this.b = bqiVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        bqi bqiVar = this.b;
        switch (i) {
            case 0:
                ((xdr) bqiVar).l((ijd) obj);
                Unit unit = Unit.a;
                nm6 nm6Var = nm6.a;
                return unit;
            case 1:
                ((xdr) bqiVar).l((pjd) obj);
                Unit unit2 = Unit.a;
                nm6 nm6Var2 = nm6.a;
                return unit2;
            default:
                ((xdr) bqiVar).l((bjd) obj);
                Unit unit3 = Unit.a;
                nm6 nm6Var3 = nm6.a;
                return unit3;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof rjc) && (obj instanceof zyc)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof rjc) && (obj instanceof zyc)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof rjc) && (obj instanceof zyc)) {
                    break;
                }
                break;
        }
        return Intrinsics.d(getFunctionDelegate(), ((zyc) obj).getFunctionDelegate());
    }

    @Override // defpackage.zyc
    public final syc getFunctionDelegate() {
        switch (this.a) {
        }
        return new ezc(2, 0, bqi.class, this.b, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
