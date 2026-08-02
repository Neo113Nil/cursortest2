package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class zwh extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ geg s;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zwh(geg gegVar, boolean z, int i) {
        super(1);
        this.r = i;
        this.s = gegVar;
        this.t = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                ieg iegVar = (ieg) obj;
                iegVar.getClass();
                iegVar.d = neg.a(this.s);
                iegVar.e = Long.valueOf(System.currentTimeMillis());
                iegVar.f = Boolean.valueOf(this.t);
                break;
            default:
                ieg iegVar2 = (ieg) obj;
                iegVar2.getClass();
                iegVar2.g = neg.a(this.s);
                iegVar2.h = Long.valueOf(System.currentTimeMillis());
                iegVar2.i = Boolean.valueOf(this.t);
                break;
        }
        return Unit.a;
    }
}
