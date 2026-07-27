package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.icefishing.icefishingliveapp.C5284R;
import l.C4674b;

/* renamed from: m.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4741j extends C4768x implements InterfaceC4745l {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C4743k f39425w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4741j(C4743k c4743k, Context context) {
        super(context, null, C5284R.attr.actionOverflowButtonStyle);
        this.f39425w = c4743k;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        K3.b.B(this, getContentDescription());
        setOnTouchListener(new C4674b(this, this));
    }

    @Override // m.InterfaceC4745l
    public final boolean a() {
        return false;
    }

    @Override // m.InterfaceC4745l
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f39425w.l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i4, int i9, int i10) {
        boolean frame = super.setFrame(i, i4, i9, i10);
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
