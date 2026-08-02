package defpackage;

import android.os.Parcelable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class v03 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ iwe s;
    public final /* synthetic */ r7w t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v03(iwe iweVar, r7w r7wVar, int i) {
        super(0);
        this.r = i;
        this.s = iweVar;
        this.t = r7wVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.r;
        r7w r7wVar = this.t;
        iwe iweVar = this.s;
        switch (i) {
            case 0:
                Parcelable.Creator<bfk> creator = bfk.CREATOR;
                iweVar.x(y7g.x(r7wVar));
                break;
            default:
                Parcelable.Creator<bfk> creator2 = bfk.CREATOR;
                iweVar.x(y7g.x(r7wVar));
                break;
        }
        return Unit.a;
    }
}
