package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class r89 extends uif implements Function1 {
    public final /* synthetic */ int r = 1;
    public final /* synthetic */ pyg s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r89(u89 u89Var, pyg pygVar) {
        super(1);
        this.s = pygVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                pyg pygVar = this.s;
                czg czgVar = pygVar.b;
                if (booleanValue) {
                    if (!czgVar.k() && (czgVar.b.e() < 1.0f || czgVar.b.getRepeatCount() == -1)) {
                        pygVar.e();
                    }
                } else if (czgVar.k()) {
                    pygVar.c();
                }
                break;
            default:
                mzg mzgVar = (mzg) obj;
                int i = mzgVar.a;
                czg czgVar2 = this.s.b;
                czgVar2.b.setRepeatCount(i);
                czgVar2.b.setRepeatMode(mzgVar.b);
                czgVar2.z(mzgVar.c);
                czgVar2.t(mzgVar.d);
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r89(pyg pygVar) {
        super(1);
        this.s = pygVar;
    }
}
