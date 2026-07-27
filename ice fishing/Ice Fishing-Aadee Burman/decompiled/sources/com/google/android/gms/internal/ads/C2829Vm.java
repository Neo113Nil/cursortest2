package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: com.google.android.gms.internal.ads.Vm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2829Vm {

    /* renamed from: a, reason: collision with root package name */
    public final u2.r f28232a;

    /* renamed from: b, reason: collision with root package name */
    public final T2.a f28233b;

    /* renamed from: c, reason: collision with root package name */
    public final RD f28234c;

    public C2829Vm(u2.r rVar, T2.a aVar, RD rd) {
        this.f28232a = rVar;
        this.f28233b = aVar;
        this.f28234c = rd;
    }

    public final Bitmap a(byte[] bArr, double d2, boolean z3) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d2 * 160.0d);
        if (!z3) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        C3301ha c3301ha = AbstractC3569ma.f32200a7;
        q2.r rVar = q2.r.f40204e;
        if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
            options.inJustDecodeBounds = true;
            b(bArr, options);
            options.inJustDecodeBounds = false;
            int i = options.outWidth * options.outHeight;
            if (i > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i - 1) / ((Integer) rVar.f40207c.a(AbstractC3569ma.f32210b7)).intValue())) / 2);
            }
        }
        return b(bArr, options);
    }

    public final Bitmap b(byte[] bArr, BitmapFactory.Options options) {
        this.f28233b.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        if (decodeByteArray != null) {
            long j6 = elapsedRealtime2 - elapsedRealtime;
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            int allocationByteCount = decodeByteArray.getAllocationByteCount();
            boolean z3 = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder sb = new StringBuilder(String.valueOf(j6).length() + String.valueOf(width).length() + 20 + String.valueOf(height).length() + 8 + String.valueOf(allocationByteCount).length() + 7 + 15 + String.valueOf(z3).length());
            u1.h.h(sb, "Decoded image w: ", width, " h:", height);
            sb.append(" bytes: ");
            sb.append(allocationByteCount);
            sb.append(" time: ");
            sb.append(j6);
            sb.append(" on ui thread: ");
            sb.append(z3);
            u2.z.k(sb.toString());
        }
        return decodeByteArray;
    }
}
