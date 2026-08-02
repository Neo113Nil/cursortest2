package com.yandex.passport.internal.ui.bouncer.roundabout.avatar;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.DisplayMetrics;
import defpackage.e7t;
import defpackage.g4i;
import defpackage.u75;
import defpackage.v75;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class b implements e7t {
    public final boolean a;
    public final int b;
    public final String c;
    public final int d;
    public final int e;

    public b(int i, boolean z) {
        this.a = z;
        this.b = i;
        this.c = b.class.getName() + "-hasPlus=" + z;
        float f = (float) 2;
        float f2 = g4i.a.density;
        this.d = (int) (f * f2);
        this.e = (int) (f * f2);
    }

    @Override // defpackage.e7t
    public final String a() {
        return this.c;
    }

    @Override // defpackage.e7t
    public final Bitmap b(Bitmap bitmap) {
        bitmap.getClass();
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = this.b;
        Bitmap createBitmap = Bitmap.createBitmap(i, i, config);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = i / 2.0f;
        int i2 = this.d;
        boolean z = this.a;
        canvas.drawCircle(f, f, z ? f - (this.e + i2) : f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, (Rect) null, new Rect(0, 0, i, i), paint);
        if (z) {
            Canvas canvas2 = new Canvas(createBitmap);
            Paint paint2 = new Paint(1);
            paint2.setStyle(Paint.Style.STROKE);
            float f2 = i2;
            paint2.setStrokeWidth(f2);
            DisplayMetrics displayMetrics = g4i.a;
            float f3 = displayMetrics.density;
            float f4 = 22;
            PointF pointF = new PointF((-6) * f3, f3 * f4);
            float f5 = displayMetrics.density;
            PointF pointF2 = new PointF(44 * f5, f4 * f5);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            List h = u75.h(new Pair(Float.valueOf(0.0f), new com.yandex.passport.common.ui.b(Color.parseColor("#FF5C4D"))), new Pair(Float.valueOf(0.3f), new com.yandex.passport.common.ui.b(Color.parseColor("#EB469F"))), new Pair(Float.valueOf(0.75f), new com.yandex.passport.common.ui.b(Color.parseColor("#8341EF"))), new Pair(Float.valueOf(1.0f), new com.yandex.passport.common.ui.b(Color.parseColor("#3F68F9"))));
            tileMode.getClass();
            h.getClass();
            float f6 = pointF.x;
            float f7 = pointF.y;
            float f8 = pointF2.x;
            float f9 = pointF2.y;
            List list = h;
            ArrayList arrayList = new ArrayList(v75.o(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((com.yandex.passport.common.ui.b) ((Pair) it.next()).b).a));
            }
            int[] v0 = CollectionsKt.v0(arrayList);
            ArrayList arrayList2 = new ArrayList(v75.o(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Float.valueOf(((Number) ((Pair) it2.next()).a).floatValue()));
            }
            paint2.setShader(new LinearGradient(f6, f7, f8, f9, v0, CollectionsKt.t0(arrayList2), tileMode));
            canvas2.drawCircle(f, f, f - (f2 / 2.0f), paint2);
        }
        return createBitmap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.a == ((b) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return b.class.hashCode();
    }
}
