package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public abstract class ow3 extends FrameLayout implements kw3 {
    public /* synthetic */ ow3(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @NotNull
    public abstract /* synthetic */ nw3 getMode();

    public abstract /* synthetic */ void setCardPaymentSystemListener(Function1 function1);

    public abstract /* synthetic */ void setMaskedCardNumberListener(Function1 function1);

    public abstract /* synthetic */ void setOnStateChangeListener(Function1 function1);

    public abstract /* synthetic */ void setPaymentApi(sdk sdkVar);

    public abstract /* synthetic */ void setSaveCardOnPayment(boolean z);

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ow3(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ow3(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow3(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    public void a() {
    }
}
