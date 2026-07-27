package x3;

import L3.F;
import android.content.Context;
import com.icefishing.icefishinglive2.C5275R;

/* renamed from: x3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5196a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f41765f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f41766a;

    /* renamed from: b, reason: collision with root package name */
    public final int f41767b;

    /* renamed from: c, reason: collision with root package name */
    public final int f41768c;

    /* renamed from: d, reason: collision with root package name */
    public final int f41769d;

    /* renamed from: e, reason: collision with root package name */
    public final float f41770e;

    public C5196a(Context context) {
        boolean q8 = F.q(context, C5275R.attr.elevationOverlayEnabled, false);
        int m4 = V2.a.m(context, C5275R.attr.elevationOverlayColor, 0);
        int m9 = V2.a.m(context, C5275R.attr.elevationOverlayAccentColor, 0);
        int m10 = V2.a.m(context, C5275R.attr.colorSurface, 0);
        float f3 = context.getResources().getDisplayMetrics().density;
        this.f41766a = q8;
        this.f41767b = m4;
        this.f41768c = m9;
        this.f41769d = m10;
        this.f41770e = f3;
    }
}
