package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* loaded from: classes11.dex */
public interface xvb {
    void actualDraw(Canvas canvas);

    boolean actualIsOpaque();

    void buildCircularRevealCache();

    void destroyCircularRevealCache();

    int getCircularRevealScrimColor();

    wvb getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(wvb wvbVar);
}
