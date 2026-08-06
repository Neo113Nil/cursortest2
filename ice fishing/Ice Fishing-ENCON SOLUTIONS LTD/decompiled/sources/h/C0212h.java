package h;

import a.AbstractC0083a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.watchfacestudio.spraktum.R;
import s.AbstractC1044a;

/* renamed from: h.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0212h extends C0221q implements InterfaceC0214j {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0213i f3251c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0212h(C0213i c0213i, Context context) {
        super(context, R.attr.actionOverflowButtonStyle);
        this.f3251c = c0213i;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        AbstractC0083a.q(this, getContentDescription());
        setOnTouchListener(new g.a(this, this));
    }

    @Override // h.InterfaceC0214j
    public final boolean a() {
        return false;
    }

    @Override // h.InterfaceC0214j
    public final boolean b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f3251c.j();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i2, int i3, int i4, int i5) {
        boolean frame = super.setFrame(i2, i3, i4, i5);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            AbstractC1044a.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
