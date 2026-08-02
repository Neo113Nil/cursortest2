package defpackage;

import android.os.Parcelable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class t57 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ y57 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t57(y57 y57Var, int i) {
        super(1);
        this.r = i;
        this.s = y57Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                int intValue = ((Number) obj).intValue();
                xdr xdrVar = this.s.y;
                ycp ycpVar = new ycp(intValue);
                xdrVar.getClass();
                xdrVar.m(null, ycpVar);
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                y57 y57Var = this.s;
                x97.y(ot0.F(y57Var), null, null, new bv6(y57Var, str, null, 14), 3);
                break;
            case 2:
                kpo kpoVar = (kpo) obj;
                kpoVar.getClass();
                y57 y57Var2 = this.s;
                mfk mfkVar = y57Var2.z0;
                if (mfkVar != null) {
                    x97.y(ot0.F(y57Var2), null, null, new j57(y57Var2, (Parcelable) kpoVar, (Object) mfkVar, (Continuation) null, 2), 3);
                }
                break;
            default:
                bfk bfkVar = (bfk) obj;
                bfkVar.getClass();
                xdr xdrVar2 = this.s.y;
                tcp tcpVar = new tcp(bfkVar);
                xdrVar2.getClass();
                xdrVar2.m(null, tcpVar);
                break;
        }
        return Unit.a;
    }
}
