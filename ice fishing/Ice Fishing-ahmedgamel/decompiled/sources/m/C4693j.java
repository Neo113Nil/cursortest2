package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.icefishingapp.icefishing.C5275R;
import l.C4645b;

/* renamed from: m.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4693j extends C4720x implements InterfaceC4697l {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C4695k f39154w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4693j(C4695k c4695k, Context context) {
        super(context, null, C5275R.attr.actionOverflowButtonStyle);
        this.f39154w = c4695k;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        A8.b.t(this, getContentDescription());
        setOnTouchListener(new C4645b(this, this));
    }

    @Override // m.InterfaceC4697l
    public final boolean a() {
        return false;
    }

    @Override // m.InterfaceC4697l
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f39154w.l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i6, int i9, int i10) {
        boolean frame = super.setFrame(i, i6, i9, i10);
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
