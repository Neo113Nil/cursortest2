package defpackage;

import android.os.Parcelable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ql2 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ x7o s;
    public final /* synthetic */ r7w t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ql2(x7o x7oVar, r7w r7wVar, int i) {
        super(0);
        this.r = i;
        this.s = x7oVar;
        this.t = r7wVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.r;
        r7w r7wVar = this.t;
        x7o x7oVar = this.s;
        switch (i) {
            case 0:
                Parcelable.Creator<bfk> creator = bfk.CREATOR;
                x7oVar.x(y7g.x(r7wVar));
                break;
            case 1:
                Parcelable.Creator<bfk> creator2 = bfk.CREATOR;
                x7oVar.x(y7g.x(r7wVar));
                break;
            case 2:
                Parcelable.Creator<bfk> creator3 = bfk.CREATOR;
                x7oVar.x(y7g.x(r7wVar));
                break;
            case 3:
                Parcelable.Creator<bfk> creator4 = bfk.CREATOR;
                x7oVar.x(y7g.x(r7wVar));
                break;
            default:
                Parcelable.Creator<bfk> creator5 = bfk.CREATOR;
                x7oVar.x(y7g.x(r7wVar));
                break;
        }
        return Unit.a;
    }
}
