package defpackage;

import android.os.Parcelable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class knd extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ bnd s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ knd(bnd bndVar, int i) {
        super(1);
        this.r = i;
        this.s = bndVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.r;
        bnd bndVar = this.s;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                bndVar.onSuccess(new jnd(str));
                break;
            default:
                r7w r7wVar = (r7w) obj;
                r7wVar.getClass();
                Parcelable.Creator<bfk> creator = bfk.CREATOR;
                bndVar.x(y7g.x(r7wVar));
                break;
        }
        return Unit.a;
    }
}
