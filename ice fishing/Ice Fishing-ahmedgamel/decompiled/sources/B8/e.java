package B8;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import pl.droidsonroids.gif.GifImageView;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f297a;

    /* renamed from: b, reason: collision with root package name */
    public final int f298b;

    /* renamed from: c, reason: collision with root package name */
    public final int f299c;

    /* renamed from: d, reason: collision with root package name */
    public final int f300d;

    public e(GifImageView gifImageView, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = gifImageView.getContext().obtainStyledAttributes(attributeSet, h.f304a, 0, 0);
        this.f297a = obtainStyledAttributes.getBoolean(0, false);
        this.f298b = obtainStyledAttributes.getInt(1, -1);
        obtainStyledAttributes.recycle();
        this.f299c = a(gifImageView, attributeSet, true);
        this.f300d = a(gifImageView, attributeSet, false);
    }

    public static int a(GifImageView gifImageView, AttributeSet attributeSet, boolean z6) {
        int attributeResourceValue = attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", z6 ? "src" : "background", 0);
        if (attributeResourceValue > 0) {
            if (f.f301a.contains(gifImageView.getResources().getResourceTypeName(attributeResourceValue)) && !f.a(gifImageView, z6, attributeResourceValue)) {
                return attributeResourceValue;
            }
        }
        return 0;
    }

    public e() {
        this.f297a = false;
        this.f298b = -1;
        this.f299c = 0;
        this.f300d = 0;
    }
}
