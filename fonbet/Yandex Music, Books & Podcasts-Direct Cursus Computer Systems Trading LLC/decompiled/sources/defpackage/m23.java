package defpackage;

import android.os.Parcelable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class m23 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ pt0 s;
    public final /* synthetic */ r7w t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m23(pt0 pt0Var, r7w r7wVar, int i) {
        super(0);
        this.r = i;
        this.s = pt0Var;
        this.t = r7wVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.r;
        r7w r7wVar = this.t;
        pt0 pt0Var = this.s;
        switch (i) {
            case 0:
                Parcelable.Creator<bfk> creator = bfk.CREATOR;
                pt0Var.x(y7g.x(r7wVar));
                break;
            case 1:
                Parcelable.Creator<bfk> creator2 = bfk.CREATOR;
                pt0Var.x(y7g.x(r7wVar));
                break;
            default:
                Parcelable.Creator<bfk> creator3 = bfk.CREATOR;
                pt0Var.x(y7g.x(r7wVar));
                break;
        }
        return Unit.a;
    }
}
