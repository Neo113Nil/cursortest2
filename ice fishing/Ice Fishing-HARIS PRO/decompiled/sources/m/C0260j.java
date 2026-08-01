package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.lumenpath.harispro.hrnavigator.R;
import l.C0218b;

/* renamed from: m.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0260j extends C0291z implements InterfaceC0266m {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0264l f3957d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0260j(C0264l c0264l, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f3957d = c0264l;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        d1.a(this, getContentDescription());
        setOnTouchListener(new C0218b(this, this));
    }

    @Override // m.InterfaceC0266m
    public final boolean a() {
        return false;
    }

    @Override // m.InterfaceC0266m
    public final boolean b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f3957d.o();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
