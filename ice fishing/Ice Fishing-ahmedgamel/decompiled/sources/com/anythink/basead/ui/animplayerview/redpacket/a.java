package com.anythink.basead.ui.animplayerview.redpacket;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import java.util.Random;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public float f10537a;

    /* renamed from: b, reason: collision with root package name */
    public float f10538b;

    /* renamed from: c, reason: collision with root package name */
    private Bitmap f10539c;

    /* renamed from: d, reason: collision with root package name */
    private int f10540d;

    /* renamed from: e, reason: collision with root package name */
    private int f10541e;

    /* renamed from: f, reason: collision with root package name */
    private float f10542f;

    /* renamed from: g, reason: collision with root package name */
    private float f10543g;

    public a(Context context, Bitmap bitmap, double d2, double d9, int i) {
        i = i == 0 ? Math.min(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels) : i;
        double nextInt = ((d2 * 100.0d) + new Random().nextInt(6)) / 100.0d;
        if (nextInt >= d2 && nextInt <= d9) {
            d9 = nextInt;
        }
        Log.d("RedPacketBean", "widthScale: ".concat(String.valueOf(d9)));
        int i6 = (int) (i * d9);
        this.f10540d = i6;
        int height = (bitmap.getHeight() * i6) / bitmap.getWidth();
        this.f10541e = height;
        try {
            this.f10539c = Bitmap.createScaledBitmap(bitmap, this.f10540d, height, true);
        } catch (Exception e9) {
            Log.e("RedPacketBean", "createScaledBitmap failed: " + e9.getMessage());
        }
        this.f10542f = 400.0f;
        this.f10543g = (new Random().nextFloat() * 30.0f) - 15.0f;
    }

    private float f() {
        return this.f10542f;
    }

    public final int a() {
        return this.f10541e;
    }

    public final int b() {
        return this.f10540d;
    }

    public final Bitmap c() {
        return this.f10539c;
    }

    public final void d() {
        Bitmap bitmap = this.f10539c;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f10539c.recycle();
        this.f10539c = null;
    }

    public final float e() {
        return this.f10543g;
    }
}
