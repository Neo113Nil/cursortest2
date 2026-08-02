package com.yandex.plus.core.gradient.impl;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import com.yandex.plus.bdui.plus.shared.serializer.d;
import com.yandex.plus.core.gradient.api.c;
import defpackage.btf;
import defpackage.jyr;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a implements c {
    public final b a;
    public final b b;
    public BitmapShader f;
    public Canvas g;
    public final com.yandex.plus.bdui.plus.webview.navigation.a c = new com.yandex.plus.bdui.plus.webview.navigation.a(4);
    public float d = 1.0f;
    public float e = 1.0f;
    public final jyr h = btf.b(new d(24));

    public a(b bVar, b bVar2) {
        this.a = bVar;
        this.b = bVar2;
        float f = bVar.b;
    }

    @Override // com.yandex.plus.core.gradient.api.c
    public final void a(float f, float f2, float f3, float f4) {
        this.a.a(f, f2, f3, f4);
        this.b.a(f, f2, f3, f4);
        float max = Math.max(f3 - f, 1.0f);
        float max2 = Math.max(f4 - f2, 1.0f);
        if (((int) max) == ((int) this.d) && ((int) max2) == ((int) this.e)) {
            return;
        }
        this.d = max;
        this.e = max2;
        d();
        e();
    }

    @Override // com.yandex.plus.core.gradient.api.c
    public final void b(float f) {
        this.a.b(f);
        this.b.b(f);
        e();
    }

    public final void c() {
        if (this.f == null) {
            d();
        }
    }

    public final void d() {
        Bitmap createBitmap = Bitmap.createBitmap((int) this.d, (int) this.e, Bitmap.Config.ARGB_8888);
        createBitmap.getClass();
        this.g = new Canvas(createBitmap);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f = new BitmapShader(createBitmap, tileMode, tileMode);
        this.c.invoke(n());
    }

    public final void e() {
        c();
        jyr jyrVar = this.h;
        ((Paint) jyrVar.getValue()).setShader(this.a.n());
        Canvas canvas = this.g;
        if (canvas == null) {
            Intrinsics.j("currentCanvas");
            throw null;
        }
        canvas.drawPaint((Paint) jyrVar.getValue());
        ((Paint) jyrVar.getValue()).setShader(this.b.n());
        Canvas canvas2 = this.g;
        if (canvas2 != null) {
            canvas2.drawPaint((Paint) jyrVar.getValue());
        } else {
            Intrinsics.j("currentCanvas");
            throw null;
        }
    }

    @Override // com.yandex.plus.core.gradient.api.c
    public final Shader n() {
        c();
        BitmapShader bitmapShader = this.f;
        if (bitmapShader != null) {
            return bitmapShader;
        }
        Intrinsics.j("currentShader");
        throw null;
    }

    @Override // com.yandex.plus.core.gradient.api.c
    public final void q(float f) {
        this.a.q(f);
        this.b.q(f);
        e();
    }
}
