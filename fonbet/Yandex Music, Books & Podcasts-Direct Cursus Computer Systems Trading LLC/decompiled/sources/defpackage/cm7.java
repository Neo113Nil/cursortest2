package defpackage;

import android.view.TextureView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class cm7 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ dm7 s;
    public final /* synthetic */ TextureView t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cm7(dm7 dm7Var, TextureView textureView, int i) {
        super(0);
        this.r = i;
        this.s = dm7Var;
        this.t = textureView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                this.s.a.p(this.t);
                break;
            default:
                this.s.a.n(this.t);
                break;
        }
        return Unit.a;
    }
}
