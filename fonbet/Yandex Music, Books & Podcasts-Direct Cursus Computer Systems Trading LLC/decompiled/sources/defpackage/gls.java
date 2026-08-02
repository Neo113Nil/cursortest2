package defpackage;

import android.util.TypedValue;
import android.view.ViewConfiguration;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class gls implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lls b;

    public /* synthetic */ gls(lls llsVar, int i) {
        this.a = i;
        this.b = llsVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Integer.valueOf(ViewConfiguration.get(this.b.requireContext()).getScaledTouchSlop());
            case 1:
                return Integer.valueOf(ViewConfiguration.get(this.b.requireContext()).getScaledMinimumFlingVelocity());
            case 2:
                return Float.valueOf(TypedValue.applyDimension(1, 24.0f, this.b.getResources().getDisplayMetrics()));
            case 3:
                return Float.valueOf(TypedValue.applyDimension(1, 40.0f, this.b.getResources().getDisplayMetrics()));
            default:
                this.b.y();
                return Unit.a;
        }
    }
}
