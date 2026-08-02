package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.appcompat.widget.SwitchCompat;
import kotlin.KotlinVersion;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class wvr extends FrameLayout {
    public static final int[][] e = {new int[]{-16842910}, new int[]{R.attr.state_checked}, new int[0]};
    public final SwitchCompat a;
    public Integer b;
    public final int[] c;
    public final int[] d;

    public wvr(@NotNull Context context) {
        super(context);
        SwitchCompat switchCompat = new SwitchCompat(context);
        this.a = switchCompat;
        int[] iArr = {Color.argb((int) (0.1f * r7), Color.red(r5), Color.green(r5), Color.blue(r5)), Color.argb((int) (Color.alpha(r6) * 0.3f), Color.red(r6), Color.green(r6), Color.blue(r6)), Color.argb((int) (0.3f * r7), Color.red(r5), Color.green(r5), Color.blue(r5))};
        this.c = iArr;
        int[] iArr2 = {aa5.d(r4, 0.5f, -1), r6, r4};
        this.d = iArr2;
        switchCompat.setShowText(false);
        switchCompat.setBackground(m7j.a);
        switchCompat.setImportantForAccessibility(2);
        switchCompat.setFocusable(false);
        switchCompat.setFocusableInTouchMode(false);
        addView(switchCompat, new FrameLayout.LayoutParams(-2, -2, 17));
        setOnClickListener(new xal(9, this));
        TypedValue typedValue = new TypedValue();
        int b = b(R.attr.colorForeground, typedValue, false);
        int b2 = b(R.attr.colorControlActivated, typedValue, false);
        int b3 = b(ru.yandex.music.R.attr.colorSwitchThumbNormal, typedValue, true);
        float f = KotlinVersion.MAX_COMPONENT_VALUE;
        int[][] iArr3 = e;
        switchCompat.setTrackTintList(new ColorStateList(iArr3, iArr));
        switchCompat.setThumbTintList(new ColorStateList(iArr3, iArr2));
    }

    public final int b(int i, TypedValue typedValue, boolean z) {
        if (getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return (!z || typedValue.resourceId == 0) ? typedValue.data : getContext().getColor(typedValue.resourceId);
        }
        return 0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    @NotNull
    public CharSequence getAccessibilityClassName() {
        return "android.widget.Switch";
    }

    public final Integer getColorOn() {
        return this.b;
    }

    public final ColorStateList getThumbTintList$div_release() {
        return this.a.getThumbTintList();
    }

    public final ColorStateList getTrackTintList$div_release() {
        return this.a.getTrackTintList();
    }

    @Override // android.view.View
    public final boolean isEnabled() {
        return this.a.isEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (wdu.e(this) == null) {
            wdu.q(this, new eb(5));
        }
    }

    public final void setChecked(boolean z) {
        this.a.setChecked(z);
    }

    public final void setColorOn(Integer num) {
        this.b = num;
        if (num != null) {
            int intValue = num.intValue();
            int[] iArr = this.d;
            iArr[1] = intValue;
            int argb = Color.argb((int) (Color.alpha(intValue) * 0.3f), Color.red(intValue), Color.green(intValue), Color.blue(intValue));
            int[] iArr2 = this.c;
            iArr2[1] = argb;
            int[][] iArr3 = e;
            ColorStateList colorStateList = new ColorStateList(iArr3, iArr2);
            SwitchCompat switchCompat = this.a;
            switchCompat.setTrackTintList(colorStateList);
            switchCompat.setThumbTintList(new ColorStateList(iArr3, iArr));
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        this.a.setEnabled(z);
    }

    public final void setOnCheckedChangeListener(@NotNull Function1<? super Boolean, Unit> function1) {
        this.a.setOnCheckedChangeListener(new vvr(0, function1));
    }

    public static /* synthetic */ void getThumbTintList$div_release$annotations() {
    }

    public static /* synthetic */ void getTrackTintList$div_release$annotations() {
    }
}
