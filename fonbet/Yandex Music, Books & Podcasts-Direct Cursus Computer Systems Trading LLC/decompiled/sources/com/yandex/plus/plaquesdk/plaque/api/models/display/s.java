package com.yandex.plus.plaquesdk.plaque.api.models.display;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ShapeDrawable;
import android.util.DisplayMetrics;
import defpackage.b6e;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class s {
    public static final float a(float f, float f2) {
        if (f > 0.0f || f2 > 0.0f) {
            return (float) Math.sqrt(f + f2);
        }
        return 0.0f;
    }

    public static ShapeDrawable.ShaderFactory b(e eVar) {
        ArrayList arrayList = eVar.a;
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList.size() == 1 ? new r(3, new h(((n) CollectionsKt.Q(arrayList)).a)) : new r(1, eVar);
    }

    public static ShapeDrawable.ShaderFactory c(f fVar) {
        ArrayList arrayList = fVar.a;
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList.size() == 1 ? new r(3, new h(((n) CollectionsKt.Q(arrayList)).a)) : new r(2, fVar);
    }

    public static float[] d(Context context, o oVar, int i) {
        context.getClass();
        float e = e(context, oVar.a, i);
        float e2 = e(context, oVar.b, i);
        float e3 = e(context, oVar.c, i);
        float e4 = e(context, oVar.d, i);
        return new float[]{e, e, e2, e2, e3, e3, e4, e4};
    }

    public static float e(Context context, m mVar, int i) {
        if (!(mVar instanceof k)) {
            if (mVar.equals(l.a)) {
                return i / 2.0f;
            }
            b6e.s();
            return 0.0f;
        }
        com.yandex.plus.core.android.extensions.e eVar = ((k) mVar).a;
        context.getClass();
        Resources resources = context.getResources();
        resources.getClass();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        displayMetrics.getClass();
        Float c = com.yandex.plus.core.android.extensions.e.c(eVar.a, displayMetrics);
        c.intValue();
        c.longValue();
        return Float.valueOf(c.floatValue()).floatValue();
    }
}
