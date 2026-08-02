package C3;

import Q3.b;
import android.R;
import android.content.res.ColorStateList;
import com.IceFishing.LiveIceFishing.C5248R;
import m.C4680B;

/* loaded from: classes2.dex */
public final class a extends C4680B {

    /* renamed from: z, reason: collision with root package name */
    public static final int[][] f326z = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: x, reason: collision with root package name */
    public ColorStateList f327x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f328y;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f327x == null) {
            int h3 = b.h(C5248R.attr.colorControlActivated, this);
            int h9 = b.h(C5248R.attr.colorOnSurface, this);
            int h10 = b.h(C5248R.attr.colorSurface, this);
            this.f327x = new ColorStateList(f326z, new int[]{b.l(h10, h3, 1.0f), b.l(h10, h9, 0.54f), b.l(h10, h9, 0.38f), b.l(h10, h9, 0.38f)});
        }
        return this.f327x;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f328y && U.b.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z6) {
        this.f328y = z6;
        if (z6) {
            U.b.c(this, getMaterialThemeColorsTintList());
        } else {
            U.b.c(this, null);
        }
    }
}
