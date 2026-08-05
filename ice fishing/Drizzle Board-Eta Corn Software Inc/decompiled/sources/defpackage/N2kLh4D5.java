package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.kolosta.rejin.jilosa.R;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class N2kLh4D5 extends CMlnIseC implements B1cjorwa {
    public final /* synthetic */ CTE3lpUp VgvYg0wo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N2kLh4D5(CTE3lpUp cTE3lpUp, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.VgvYg0wo = cTE3lpUp;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        e50.ygLcUYwZ(this, getContentDescription());
        setOnTouchListener(new orhfF2Ya(this, this));
    }

    @Override // defpackage.B1cjorwa
    public final boolean MdtA4re8() {
        return false;
    }

    @Override // defpackage.B1cjorwa
    public final boolean NCTxEWno() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.VgvYg0wo.ygLcUYwZ();
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
