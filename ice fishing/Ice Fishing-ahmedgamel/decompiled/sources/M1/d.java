package M1;

import B.f;
import P1.g;
import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static Integer f1858d;

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f1859a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1860b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public f f1861c;

    public d(ImageView imageView) {
        this.f1859a = imageView;
    }

    public final int a(int i, int i4, int i6) {
        int i9 = i4 - i6;
        if (i9 > 0) {
            return i9;
        }
        int i10 = i - i6;
        if (i10 > 0) {
            return i10;
        }
        ImageView imageView = this.f1859a;
        if (imageView.isLayoutRequested() || i4 != -2) {
            return 0;
        }
        if (Log.isLoggable("ViewTarget", 4)) {
            Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
        }
        Context context = imageView.getContext();
        if (f1858d == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            g.c(windowManager, "Argument must not be null");
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            f1858d = Integer.valueOf(Math.max(point.x, point.y));
        }
        return f1858d.intValue();
    }
}
