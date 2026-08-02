package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class cc8 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ gc8 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cc8(gc8 gc8Var, int i) {
        super(0);
        this.r = i;
        this.s = gc8Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ic8 histogramReporter;
        ic8 histogramReporter2;
        switch (this.r) {
            case 0:
                break;
            case 1:
                gc8 gc8Var = this.s;
                break;
            case 2:
                break;
            case 3:
                histogramReporter = this.s.getHistogramReporter();
                histogramReporter.getClass();
                histogramReporter.g = Long.valueOf(vp4.a());
                break;
            default:
                histogramReporter2 = this.s.getHistogramReporter();
                histogramReporter2.b();
                break;
        }
        return Unit.a;
    }
}
