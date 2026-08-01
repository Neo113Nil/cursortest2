package com.anythink.expressad.video.module.a.a;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.anythink.expressad.foundation.h.q;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class j extends e {

    /* renamed from: a, reason: collision with root package name */
    private int f21766a;

    public j(ImageView imageView, int i) {
        super(imageView);
        this.f21766a = i;
    }

    @Override // com.anythink.expressad.video.module.a.a.e, com.anythink.expressad.foundation.g.d.c
    public final void a(Bitmap bitmap, String str) {
        Bitmap a9;
        if (bitmap == null) {
            return;
        }
        try {
            WeakReference<ImageView> weakReference = this.f21761c;
            if (weakReference == null || weakReference.get() == null || bitmap.isRecycled() || (a9 = q.a(bitmap, this.f21766a)) == null) {
                return;
            }
            this.f21761c.get().setImageBitmap(a9);
        } catch (Throwable th) {
            if (com.anythink.expressad.a.f17618a) {
                th.printStackTrace();
            }
        }
    }
}
