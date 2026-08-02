package defpackage;

import android.animation.ValueAnimator;
import android.util.TypedValue;
import android.view.View;
import com.yandex.plus.core.locale.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class xkg implements Function1 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ xkg(int i, View view) {
        this.b = i;
        this.c = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                float f = ((cma) obj).a;
                View view = this.c;
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), eeh.b(TypedValue.applyDimension(1, f, view.getContext().getResources().getDisplayMetrics())) + this.b);
                break;
            default:
                ((ValueAnimator) obj).getClass();
                if (this.b == -2) {
                    b.D(-2, this.c);
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ xkg(View view, int i) {
        this.c = view;
        this.b = i;
    }
}
