package h;

import a.AbstractC0069a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.icecatchbiger.hookfrostmaster.R;
import g.ViewOnTouchListenerC0141a;
import q.AbstractC0227a;

/* renamed from: h.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0164h extends C0173q implements InterfaceC0166j {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0165i f2187g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0164h(C0165i c0165i, Context context) {
        super(context, R.attr.actionOverflowButtonStyle);
        this.f2187g = c0165i;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        AbstractC0069a.F(this, getContentDescription());
        setOnTouchListener(new ViewOnTouchListenerC0141a(this, this));
    }

    @Override // h.InterfaceC0166j
    public final boolean a() {
        return false;
    }

    @Override // h.InterfaceC0166j
    public final boolean b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f2187g.f();
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
            AbstractC0227a.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
