package K1;

import B.f;
import N1.g;
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
    public static Integer f1563d;

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f1564a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1565b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public f f1566c;

    public d(ImageView imageView) {
        this.f1564a = imageView;
    }

    public final int a(int i, int i6, int i9) {
        int i10 = i6 - i9;
        if (i10 > 0) {
            return i10;
        }
        int i11 = i - i9;
        if (i11 > 0) {
            return i11;
        }
        ImageView imageView = this.f1564a;
        if (imageView.isLayoutRequested() || i6 != -2) {
            return 0;
        }
        if (Log.isLoggable("ViewTarget", 4)) {
            Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
        }
        Context context = imageView.getContext();
        if (f1563d == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            g.c(windowManager, "Argument must not be null");
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            f1563d = Integer.valueOf(Math.max(point.x, point.y));
        }
        return f1563d.intValue();
    }
}
