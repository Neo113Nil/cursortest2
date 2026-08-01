package O0;

import a.AbstractC0078a;
import android.R;
import android.content.res.ColorStateList;
import m.C0238D;

/* loaded from: classes.dex */
public final class a extends C0238D {

    /* renamed from: g, reason: collision with root package name */
    public static final int[][] f840g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f841f;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.e == null) {
            int y2 = AbstractC0078a.y(this, com.lumenpath.harispro.hrnavigator.R.attr.colorControlActivated);
            int y3 = AbstractC0078a.y(this, com.lumenpath.harispro.hrnavigator.R.attr.colorOnSurface);
            int y4 = AbstractC0078a.y(this, com.lumenpath.harispro.hrnavigator.R.attr.colorSurface);
            this.e = new ColorStateList(f840g, new int[]{AbstractC0078a.O(y4, y2, 1.0f), AbstractC0078a.O(y4, y3, 0.54f), AbstractC0078a.O(y4, y3, 0.38f), AbstractC0078a.O(y4, y3, 0.38f)});
        }
        return this.e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f841f && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f841f = z2;
        if (z2) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
