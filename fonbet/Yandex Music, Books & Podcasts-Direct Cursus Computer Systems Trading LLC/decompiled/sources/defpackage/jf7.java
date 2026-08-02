package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.yandex.video.m3.player.ui.debug.model.DrmMode;

/* loaded from: classes6.dex */
public final class jf7 extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ yci t;
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jf7(Object obj, Object obj2, boolean z, yci yciVar, int i, int i2) {
        super(2);
        this.r = i2;
        this.v = obj;
        this.w = obj2;
        this.s = z;
        this.t = yciVar;
        this.u = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                ((Number) obj2).intValue();
                wb6 wb6Var = (wb6) this.v;
                DrmMode drmMode = (DrmMode) this.w;
                lf7.c(wb6Var, drmMode, this.s, this.t, (hq5) obj, rvf.R(this.u | 1));
                break;
            default:
                ((Number) obj2).intValue();
                vcu vcuVar = (vcu) this.v;
                sy1 sy1Var = (sy1) this.w;
                lf7.g(vcuVar, sy1Var, this.s, this.t, (hq5) obj, rvf.R(this.u | 1));
                break;
        }
        return Unit.a;
    }
}
