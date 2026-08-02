package defpackage;

import android.view.SurfaceView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class bm7 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ dm7 s;
    public final /* synthetic */ SurfaceView t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bm7(dm7 dm7Var, SurfaceView surfaceView, int i) {
        super(0);
        this.r = i;
        this.s = dm7Var;
        this.t = surfaceView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                this.s.a.v(this.t);
                break;
            default:
                this.s.a.j(this.t);
                break;
        }
        return Unit.a;
    }
}
