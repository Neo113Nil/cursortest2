package com.gamericefishpro.space.ea;

import android.content.Context;
import android.util.TypedValue;
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.d9.h;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final int f = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public a(Context context) {
        TypedValue typedValueI = h.I(context, R.attr.elevationOverlayEnabled);
        boolean z = (typedValueI == null || typedValueI.type != 18 || typedValueI.data == 0) ? false : true;
        int iR = com.gamericefishpro.space.b9.a.r(context, R.attr.elevationOverlayColor, 0);
        int iR2 = com.gamericefishpro.space.b9.a.r(context, R.attr.elevationOverlayAccentColor, 0);
        int iR3 = com.gamericefishpro.space.b9.a.r(context, R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.a = z;
        this.b = iR;
        this.c = iR2;
        this.d = iR3;
        this.e = f2;
    }
}
