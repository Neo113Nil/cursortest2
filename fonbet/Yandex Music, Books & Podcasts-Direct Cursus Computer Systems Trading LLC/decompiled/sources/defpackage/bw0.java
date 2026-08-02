package defpackage;

import android.os.Parcelable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class bw0 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ ltm s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bw0(ltm ltmVar, int i) {
        super(1);
        this.r = i;
        this.s = ltmVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.r;
        mm6 mm6Var = this.s;
        switch (i) {
            case 0:
                ((oc4) mm6Var).c(null);
                return Unit.a;
            case 1:
                fgk fgkVar = (fgk) obj;
                fgkVar.getClass();
                int ordinal = fgkVar.ordinal();
                if (ordinal == 0) {
                    return new gd4(((oc4) mm6Var).d.c(new u7o(egm.a)));
                }
                if (ordinal == 1) {
                    return Unit.a;
                }
                b6e.s();
                return null;
            case 2:
                r7w r7wVar = (r7w) obj;
                r7wVar.getClass();
                Parcelable.Creator<bfk> creator = bfk.CREATOR;
                return new gd4(((oc4) mm6Var).d.c(new s7o(y7g.x(r7wVar))));
            default:
                ktm ktmVar = (ktm) mm6Var;
                ktmVar.getClass();
                ktmVar.c(obj);
                return Unit.a;
        }
    }
}
