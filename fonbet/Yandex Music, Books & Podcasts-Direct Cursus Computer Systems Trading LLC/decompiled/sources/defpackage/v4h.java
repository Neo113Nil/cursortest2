package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class v4h extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ w4h s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v4h(w4h w4hVar, int i) {
        super(0);
        this.r = i;
        this.s = w4hVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                wof wofVar = (wof) this.s.u.getValue();
                return new enj(wofVar != null ? wofVar.S(0L) : 9205357640488583168L);
            case 1:
                return new enj(this.s.w);
            default:
                this.s.U0();
                return Unit.a;
        }
    }
}
