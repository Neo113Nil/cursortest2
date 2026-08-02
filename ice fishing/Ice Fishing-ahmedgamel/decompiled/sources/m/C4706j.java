package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.IceFishing.LiveIceFishing.C5248R;
import l.C4656b;

/* renamed from: m.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4706j extends C4733x implements InterfaceC4710l {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C4708k f39223w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4706j(C4708k c4708k, Context context) {
        super(context, null, C5248R.attr.actionOverflowButtonStyle);
        this.f39223w = c4708k;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        A8.b.v(this, getContentDescription());
        setOnTouchListener(new C4656b(this, this));
    }

    @Override // m.InterfaceC4710l
    public final boolean a() {
        return false;
    }

    @Override // m.InterfaceC4710l
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f39223w.l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i4, int i6, int i9) {
        boolean frame = super.setFrame(i, i4, i6, i9);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            H.a.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
