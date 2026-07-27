package x8;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import pl.droidsonroids.gif.GifImageView;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f41806a;

    /* renamed from: b, reason: collision with root package name */
    public final int f41807b;

    /* renamed from: c, reason: collision with root package name */
    public final int f41808c;

    /* renamed from: d, reason: collision with root package name */
    public final int f41809d;

    public c(GifImageView gifImageView, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = gifImageView.getContext().obtainStyledAttributes(attributeSet, e.f41811a, 0, 0);
        this.f41806a = obtainStyledAttributes.getBoolean(0, false);
        this.f41807b = obtainStyledAttributes.getInt(1, -1);
        obtainStyledAttributes.recycle();
        this.f41808c = a(gifImageView, attributeSet, true);
        this.f41809d = a(gifImageView, attributeSet, false);
    }

    public static int a(GifImageView gifImageView, AttributeSet attributeSet, boolean z8) {
        int attributeResourceValue = attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", z8 ? "src" : "background", 0);
        if (attributeResourceValue > 0) {
            if (d.f41810a.contains(gifImageView.getResources().getResourceTypeName(attributeResourceValue)) && !d.a(gifImageView, z8, attributeResourceValue)) {
                return attributeResourceValue;
            }
        }
        return 0;
    }

    public c() {
        this.f41806a = false;
        this.f41807b = -1;
        this.f41808c = 0;
        this.f41809d = 0;
    }
}
