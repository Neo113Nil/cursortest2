package com.anythink.expressad.video.module.a.a;

import android.graphics.Bitmap;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class e implements com.anythink.expressad.foundation.g.d.c {

    /* renamed from: b, reason: collision with root package name */
    protected static final String f21759b = "ImageLoaderListener";

    /* renamed from: a, reason: collision with root package name */
    private com.anythink.expressad.foundation.d.d f21760a;

    /* renamed from: c, reason: collision with root package name */
    protected WeakReference<ImageView> f21761c;

    /* renamed from: d, reason: collision with root package name */
    private String f21762d;

    public e(ImageView imageView) {
        this.f21761c = new WeakReference<>(imageView);
    }

    @Override // com.anythink.expressad.foundation.g.d.c
    public void a(String str, String str2) {
    }

    @Override // com.anythink.expressad.foundation.g.d.c
    public void a(Bitmap bitmap, String str) {
        if (bitmap == null) {
            return;
        }
        try {
            WeakReference<ImageView> weakReference = this.f21761c;
            if (weakReference == null || weakReference.get() == null || bitmap.isRecycled()) {
                return;
            }
            this.f21761c.get().setImageBitmap(bitmap);
            this.f21761c.get().setVisibility(0);
        } catch (Throwable th) {
            if (com.anythink.expressad.a.f17618a) {
                th.printStackTrace();
            }
        }
    }

    public e(ImageView imageView, com.anythink.expressad.foundation.d.d dVar, String str) {
        this.f21761c = new WeakReference<>(imageView);
        this.f21760a = dVar;
        this.f21762d = str;
    }
}
