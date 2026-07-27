package v3;

import a.AbstractC0415a;
import android.content.Context;
import com.icefishing.icefishingliveapp.C5284R;

/* renamed from: v3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5125a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f41361f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f41362a;

    /* renamed from: b, reason: collision with root package name */
    public final int f41363b;

    /* renamed from: c, reason: collision with root package name */
    public final int f41364c;

    /* renamed from: d, reason: collision with root package name */
    public final int f41365d;

    /* renamed from: e, reason: collision with root package name */
    public final float f41366e;

    public C5125a(Context context) {
        boolean A8 = AbstractC0415a.A(context, C5284R.attr.elevationOverlayEnabled, false);
        int g9 = U2.a.g(context, C5284R.attr.elevationOverlayColor, 0);
        int g10 = U2.a.g(context, C5284R.attr.elevationOverlayAccentColor, 0);
        int g11 = U2.a.g(context, C5284R.attr.colorSurface, 0);
        float f6 = context.getResources().getDisplayMetrics().density;
        this.f41362a = A8;
        this.f41363b = g9;
        this.f41364c = g10;
        this.f41365d = g11;
        this.f41366e = f6;
    }
}
