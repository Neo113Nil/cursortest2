package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class u37 extends FrameLayout {
    public static final /* synthetic */ int b = 0;
    public final aqd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u37(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.paymentsdk_divkit_bank_search_input_layout, this);
        int i = R.id.bankInputEditText;
        TextInputEditText textInputEditText = (TextInputEditText) dag.v(R.id.bankInputEditText, this);
        if (textInputEditText != null) {
            i = R.id.bankInputLayout;
            if (((TextInputLayout) dag.v(R.id.bankInputLayout, this)) != null) {
                i = R.id.clearInputButton;
                ImageView imageView = (ImageView) dag.v(R.id.clearInputButton, this);
                if (imageView != null) {
                    this.a = new aqd(this, textInputEditText, imageView, 14);
                    return;
                }
            }
        }
        jj4.j("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    public final void setOnTextChangeListener(@NotNull Function1<? super String, Unit> function1) {
        function1.getClass();
        aqd aqdVar = this.a;
        ((TextInputEditText) aqdVar.b).addTextChangedListener(new ex3(2, function1, this));
        ((ImageView) aqdVar.c).setOnClickListener(new ol(10, this));
    }

    public /* synthetic */ u37(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u37(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }
}
