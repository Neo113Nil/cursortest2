package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class cg extends AppCompatImageView implements eg {
    public final /* synthetic */ dg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg(dg dgVar, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.a = dgVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        s7g.C(this, getContentDescription());
        setOnTouchListener(new yf(this, this));
    }

    @Override // defpackage.eg
    public final boolean b() {
        return false;
    }

    @Override // defpackage.eg
    public final boolean f() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.a.l();
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
