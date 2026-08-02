package com.anythink.basead.ui.animplayerview.redpacket;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import java.util.Random;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public float f11323a;

    /* renamed from: b, reason: collision with root package name */
    public float f11324b;

    /* renamed from: c, reason: collision with root package name */
    private Bitmap f11325c;

    /* renamed from: d, reason: collision with root package name */
    private int f11326d;

    /* renamed from: e, reason: collision with root package name */
    private int f11327e;

    /* renamed from: f, reason: collision with root package name */
    private float f11328f;

    /* renamed from: g, reason: collision with root package name */
    private float f11329g;

    public a(Context context, Bitmap bitmap, double d9, double d10, int i) {
        i = i == 0 ? Math.min(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels) : i;
        double nextInt = ((d9 * 100.0d) + new Random().nextInt(6)) / 100.0d;
        if (nextInt >= d9 && nextInt <= d10) {
            d10 = nextInt;
        }
        Log.d("RedPacketBean", "widthScale: ".concat(String.valueOf(d10)));
        int i4 = (int) (i * d10);
        this.f11326d = i4;
        int height = (bitmap.getHeight() * i4) / bitmap.getWidth();
        this.f11327e = height;
        try {
            this.f11325c = Bitmap.createScaledBitmap(bitmap, this.f11326d, height, true);
        } catch (Exception e9) {
            Log.e("RedPacketBean", "createScaledBitmap failed: " + e9.getMessage());
        }
        this.f11328f = 400.0f;
        this.f11329g = (new Random().nextFloat() * 30.0f) - 15.0f;
    }

    private float f() {
        return this.f11328f;
    }

    public final int a() {
        return this.f11327e;
    }

    public final int b() {
        return this.f11326d;
    }

    public final Bitmap c() {
        return this.f11325c;
    }

    public final void d() {
        Bitmap bitmap = this.f11325c;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f11325c.recycle();
        this.f11325c = null;
    }

    public final float e() {
        return this.f11329g;
    }
}
