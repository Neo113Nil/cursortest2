package A3;

import U.b;
import android.R;
import android.content.res.ColorStateList;
import com.icefishing.icefishingbigwin.C5275R;
import m.C4668B;

/* loaded from: classes2.dex */
public final class a extends C4668B {

    /* renamed from: z, reason: collision with root package name */
    public static final int[][] f27z = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: x, reason: collision with root package name */
    public ColorStateList f28x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f29y;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f28x == null) {
            int l9 = V2.a.l(C5275R.attr.colorControlActivated, this);
            int l10 = V2.a.l(C5275R.attr.colorOnSurface, this);
            int l11 = V2.a.l(C5275R.attr.colorSurface, this);
            this.f28x = new ColorStateList(f27z, new int[]{V2.a.r(l11, l9, 1.0f), V2.a.r(l11, l10, 0.54f), V2.a.r(l11, l10, 0.38f), V2.a.r(l11, l10, 0.38f)});
        }
        return this.f28x;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f29y && b.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z3) {
        this.f29y = z3;
        if (z3) {
            b.c(this, getMaterialThemeColorsTintList());
        } else {
            b.c(this, null);
        }
    }
}
