package coil3;

import android.graphics.Canvas;

/* loaded from: classes3.dex */
public interface Image {
    void draw(Canvas canvas);

    int getHeight();

    boolean getShareable();

    long getSize();

    int getWidth();
}
