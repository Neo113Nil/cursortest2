package B8;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import pl.droidsonroids.gif.GifImageView;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f231a;

    /* renamed from: b, reason: collision with root package name */
    public final int f232b;

    /* renamed from: c, reason: collision with root package name */
    public final int f233c;

    /* renamed from: d, reason: collision with root package name */
    public final int f234d;

    public e(GifImageView gifImageView, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = gifImageView.getContext().obtainStyledAttributes(attributeSet, h.f238a, 0, 0);
        this.f231a = obtainStyledAttributes.getBoolean(0, false);
        this.f232b = obtainStyledAttributes.getInt(1, -1);
        obtainStyledAttributes.recycle();
        this.f233c = a(gifImageView, attributeSet, true);
        this.f234d = a(gifImageView, attributeSet, false);
    }

    public static int a(GifImageView gifImageView, AttributeSet attributeSet, boolean z3) {
        int attributeResourceValue = attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", z3 ? "src" : "background", 0);
        if (attributeResourceValue > 0) {
            if (f.f235a.contains(gifImageView.getResources().getResourceTypeName(attributeResourceValue)) && !f.a(gifImageView, z3, attributeResourceValue)) {
                return attributeResourceValue;
            }
        }
        return 0;
    }

    public e() {
        this.f231a = false;
        this.f232b = -1;
        this.f233c = 0;
        this.f234d = 0;
    }
}
