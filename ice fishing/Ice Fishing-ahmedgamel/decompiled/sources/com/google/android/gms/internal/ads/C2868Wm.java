package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import android.os.SystemClock;
import w.AbstractC5128c;

/* renamed from: com.google.android.gms.internal.ads.Wm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2868Wm {

    /* renamed from: a, reason: collision with root package name */
    public final w2.r f29179a;

    /* renamed from: b, reason: collision with root package name */
    public final V2.a f29180b;

    /* renamed from: c, reason: collision with root package name */
    public final RD f29181c;

    public C2868Wm(w2.r rVar, V2.a aVar, RD rd) {
        this.f29179a = rVar;
        this.f29180b = aVar;
        this.f29181c = rd;
    }

    public final Bitmap a(byte[] bArr, double d9, boolean z6) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d9 * 160.0d);
        if (!z6) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        C3324ha c3324ha = AbstractC3592ma.f32979a7;
        s2.r rVar = s2.r.f40506e;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
            options.inJustDecodeBounds = true;
            b(bArr, options);
            options.inJustDecodeBounds = false;
            int i = options.outWidth * options.outHeight;
            if (i > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i - 1) / ((Integer) rVar.f40509c.a(AbstractC3592ma.f32989b7)).intValue())) / 2);
            }
        }
        return b(bArr, options);
    }

    public final Bitmap b(byte[] bArr, BitmapFactory.Options options) {
        this.f29180b.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        if (decodeByteArray != null) {
            long j6 = elapsedRealtime2 - elapsedRealtime;
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            int allocationByteCount = decodeByteArray.getAllocationByteCount();
            boolean z6 = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder sb = new StringBuilder(String.valueOf(j6).length() + String.valueOf(width).length() + 20 + String.valueOf(height).length() + 8 + String.valueOf(allocationByteCount).length() + 7 + 15 + String.valueOf(z6).length());
            AbstractC5128c.g(sb, "Decoded image w: ", width, " h:", height);
            sb.append(" bytes: ");
            sb.append(allocationByteCount);
            sb.append(" time: ");
            sb.append(j6);
            sb.append(" on ui thread: ");
            sb.append(z6);
            w2.z.k(sb.toString());
        }
        return decodeByteArray;
    }
}
