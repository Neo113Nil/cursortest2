package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class b17 extends ConstraintLayout {
    public final j6e q;
    public final TranslateAnimation r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b17(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.paymentsdk_divkit_button_loading_view, this);
        View v = dag.v(R.id.blur_view, this);
        if (v == null) {
            jj4.j("Missing required view with ID: ".concat(getResources().getResourceName(R.id.blur_view)));
            throw null;
        }
        this.q = new j6e(this, v);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, -1.0f, 2, 2.0f, 1, 0.0f, 1, 0.0f);
        translateAnimation.setDuration(1000L);
        translateAnimation.setInterpolator(new LinearInterpolator());
        translateAnimation.setRepeatMode(1);
        translateAnimation.setRepeatCount(-1);
        this.r = translateAnimation;
    }

    public /* synthetic */ b17(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b17(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }
}
