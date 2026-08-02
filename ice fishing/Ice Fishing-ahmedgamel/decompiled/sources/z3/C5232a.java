package z3;

import Q3.b;
import android.content.Context;
import com.IceFishing.LiveIceFishing.C5248R;
import com.bumptech.glide.e;

/* renamed from: z3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5232a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f42230f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f42231a;

    /* renamed from: b, reason: collision with root package name */
    public final int f42232b;

    /* renamed from: c, reason: collision with root package name */
    public final int f42233c;

    /* renamed from: d, reason: collision with root package name */
    public final int f42234d;

    /* renamed from: e, reason: collision with root package name */
    public final float f42235e;

    public C5232a(Context context) {
        boolean g9 = e.g(context, C5248R.attr.elevationOverlayEnabled, false);
        int i = b.i(context, C5248R.attr.elevationOverlayColor, 0);
        int i4 = b.i(context, C5248R.attr.elevationOverlayAccentColor, 0);
        int i6 = b.i(context, C5248R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f42231a = g9;
        this.f42232b = i;
        this.f42233c = i4;
        this.f42234d = i6;
        this.f42235e = f2;
    }
}
