package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class fvg extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ has s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fvg(has hasVar, int i) {
        super(1);
        this.r = i;
        this.s = hasVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                this.s.b(((enj) obj).a);
                break;
            default:
                lfm lfmVar = (lfm) obj;
                this.s.d(swf.f0(lfmVar, false));
                lfmVar.a();
                break;
        }
        return Unit.a;
    }
}
