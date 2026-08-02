package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class ldh extends pr0 {
    public static final int[][] g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList e;
    public boolean f;

    public ldh(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(bg3.p0(context, attributeSet, i, ru.yandex.music.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet, i);
        Context context2 = getContext();
        TypedArray B = bcx.B(context2, attributeSet, vdn.D, i, ru.yandex.music.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (B.hasValue(0)) {
            setButtonTintList(ivf.D(context2, B, 0));
        }
        this.f = B.getBoolean(1, false);
        B.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.e == null) {
            int N = qgg.N(ru.yandex.music.R.attr.colorControlActivated, this);
            int N2 = qgg.N(ru.yandex.music.R.attr.colorOnSurface, this);
            int N3 = qgg.N(ru.yandex.music.R.attr.colorSurface, this);
            this.e = new ColorStateList(g, new int[]{qgg.W(N3, 1.0f, N), qgg.W(N3, 0.54f, N2), qgg.W(N3, 0.38f, N2), qgg.W(N3, 0.38f, N2)});
        }
        return this.e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    public ldh(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ru.yandex.music.R.attr.radioButtonStyle);
    }

    public ldh(@NonNull Context context) {
        this(context, null);
    }
}
