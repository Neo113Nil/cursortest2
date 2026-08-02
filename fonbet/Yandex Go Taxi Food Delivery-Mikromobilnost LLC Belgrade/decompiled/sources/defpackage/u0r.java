package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.yandex.messaging.extension.a;
import com.yandex.messaging.internal.images.b;
import kotlin.Pair;

/* loaded from: classes15.dex */
public final class u0r {
    public static final int g = kjs0.b(36);
    public final Context a;
    public final ImageView b;
    public final h3y c;
    public pzt0 d;
    public GradientDrawable e;
    public boolean f;

    public u0r(Context context, ImageView imageView, h3y h3yVar) {
        this.a = context;
        this.b = imageView;
        this.c = h3yVar;
    }

    public final void a() {
        this.e = null;
        this.f = false;
        pzt0 pzt0Var = this.d;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.d = null;
    }

    public final void b() {
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        ImageView imageView = this.b;
        imageView.setScaleType(scaleType);
        imageView.setBackground(null);
        imageView.setClipToOutline(false);
    }

    public final void c(int i, String str, boolean z) {
        h3y h3yVar;
        Pair pair;
        int i2;
        ImageView imageView = this.b;
        if (!z || str == null || str.length() == 0 || (h3yVar = this.c) == null) {
            imageView.setImageResource(i);
            return;
        }
        if (!this.f) {
            b();
            imageView.setImageResource(i);
        }
        String f = b.f(str);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null && (i2 = layoutParams.width) > 0 && layoutParams.height > 0) {
            pair = new Pair(Integer.valueOf(i2), Integer.valueOf(layoutParams.height));
        } else if (imageView.getMeasuredWidth() <= 0 || imageView.getMeasuredHeight() <= 0) {
            int i3 = g;
            pair = new Pair(Integer.valueOf(i3), Integer.valueOf(i3));
        } else {
            pair = new Pair(Integer.valueOf(imageView.getMeasuredWidth()), Integer.valueOf(imageView.getMeasuredHeight()));
        }
        int intValue = ((Number) pair.getFirst()).intValue();
        int intValue2 = ((Number) pair.getSecond()).intValue();
        yn50 yn50Var = (yn50) ((xav) h3yVar.get()).load(f);
        xn50 xn50Var = yn50Var.b;
        xn50Var.i = intValue;
        xn50Var.j = intValue2;
        xn50Var.f = true;
        this.d = a.a(yn50Var, imageView, null, new is8(this, i, 3), null, new dzm(28, this), 10);
    }
}
