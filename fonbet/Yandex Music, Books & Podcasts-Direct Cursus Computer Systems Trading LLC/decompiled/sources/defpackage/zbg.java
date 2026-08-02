package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class zbg extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Long s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zbg(Long l, int i) {
        super(1);
        this.r = i;
        this.s = l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                o0l o0lVar = (o0l) obj;
                o0lVar.getClass();
                o0lVar.b = this.s;
                break;
            default:
                o0l o0lVar2 = (o0l) obj;
                o0lVar2.getClass();
                o0lVar2.b = this.s;
                break;
        }
        return Unit.a;
    }
}
