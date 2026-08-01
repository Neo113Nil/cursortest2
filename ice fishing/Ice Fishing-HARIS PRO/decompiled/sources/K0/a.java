package K0;

import a.AbstractC0078a;
import android.content.Context;
import com.lumenpath.harispro.hrnavigator.R;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f388f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f389a;

    /* renamed from: b, reason: collision with root package name */
    public final int f390b;

    /* renamed from: c, reason: collision with root package name */
    public final int f391c;

    /* renamed from: d, reason: collision with root package name */
    public final int f392d;
    public final float e;

    public a(Context context) {
        boolean V2 = AbstractC0078a.V(context, R.attr.elevationOverlayEnabled, false);
        int x2 = AbstractC0078a.x(context, R.attr.elevationOverlayColor, 0);
        int x3 = AbstractC0078a.x(context, R.attr.elevationOverlayAccentColor, 0);
        int x4 = AbstractC0078a.x(context, R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f389a = V2;
        this.f390b = x2;
        this.f391c = x3;
        this.f392d = x4;
        this.e = f2;
    }
}
