package B1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.ads.C3112dq;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;
import s1.EnumC4988a;
import s1.InterfaceC4991d;
import t0.AbstractC5051n;
import v1.InterfaceC5117a;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: f, reason: collision with root package name */
    public static final s1.g f110f = s1.g.a(EnumC4988a.f40417v, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* renamed from: g, reason: collision with root package name */
    public static final s1.g f111g = new s1.g("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, s1.g.f40421e);

    /* renamed from: h, reason: collision with root package name */
    public static final s1.g f112h;
    public static final s1.g i;

    /* renamed from: j, reason: collision with root package name */
    public static final C3.e f113j;

    /* renamed from: k, reason: collision with root package name */
    public static final ArrayDeque f114k;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC5117a f115a;

    /* renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f116b;

    /* renamed from: c, reason: collision with root package name */
    public final C3112dq f117c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f118d;

    /* renamed from: e, reason: collision with root package name */
    public final x f119e = x.a();

    static {
        m mVar = m.f102b;
        Boolean bool = Boolean.FALSE;
        f112h = s1.g.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        i = s1.g.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f113j = new C3.e();
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = N1.p.f1976a;
        f114k = new ArrayDeque(0);
    }

    public o(ArrayList arrayList, DisplayMetrics displayMetrics, InterfaceC5117a interfaceC5117a, C3112dq c3112dq) {
        this.f118d = arrayList;
        N1.g.c(displayMetrics, "Argument must not be null");
        this.f116b = displayMetrics;
        N1.g.c(interfaceC5117a, "Argument must not be null");
        this.f115a = interfaceC5117a;
        N1.g.c(c3112dq, "Argument must not be null");
        this.f117c = c3112dq;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        throw r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap c(Y2.e eVar, BitmapFactory.Options options, n nVar, InterfaceC5117a interfaceC5117a) {
        if (!options.inJustDecodeBounds) {
            nVar.c();
            switch (eVar.f3962n) {
                case 2:
                    z zVar = (z) ((com.bumptech.glide.load.data.g) eVar.f3963u).f23580u;
                    synchronized (zVar) {
                        zVar.f137v = zVar.f135n.length;
                        break;
                    }
            }
        }
        int i4 = options.outWidth;
        int i9 = options.outHeight;
        String str = options.outMimeType;
        Lock lock = B.f70b;
        lock.lock();
        try {
            try {
                Bitmap q6 = eVar.q(options);
                lock.unlock();
                return q6;
            } catch (IllegalArgumentException e6) {
                StringBuilder h9 = AbstractC5051n.h(i4, i9, "Exception decoding bitmap, outWidth: ", ", outHeight: ", ", outMimeType: ");
                h9.append(str);
                h9.append(", inBitmap: ");
                h9.append(d(options.inBitmap));
                IOException iOException = new IOException(h9.toString(), e6);
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", iOException);
                }
                Bitmap bitmap = options.inBitmap;
                if (bitmap == null) {
                    throw iOException;
                }
                try {
                    interfaceC5117a.d(bitmap);
                    options.inBitmap = null;
                    Bitmap c4 = c(eVar, options, nVar, interfaceC5117a);
                    B.f70b.unlock();
                    return c4;
                } catch (IOException unused) {
                    throw iOException;
                }
            }
        } catch (Throwable th) {
            B.f70b.unlock();
            throw th;
        }
    }

    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static void e(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final C0262d a(Y2.e eVar, int i4, int i9, s1.h hVar, n nVar) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        byte[] bArr = (byte[]) this.f117c.f(com.anythink.basead.exoplayer.b.aX, byte[].class);
        synchronized (o.class) {
            arrayDeque = f114k;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                e(options);
            }
        }
        options.inTempStorage = bArr;
        EnumC4988a enumC4988a = (EnumC4988a) hVar.c(f110f);
        s1.i iVar = (s1.i) hVar.c(f111g);
        m mVar = (m) hVar.c(m.f107g);
        boolean booleanValue = ((Boolean) hVar.c(f112h)).booleanValue();
        s1.g gVar = i;
        try {
            C0262d b9 = C0262d.b(b(eVar, options, mVar, enumC4988a, iVar, hVar.c(gVar) != null && ((Boolean) hVar.c(gVar)).booleanValue(), i4, i9, booleanValue, nVar), this.f115a);
            e(options);
            synchronized (arrayDeque) {
                arrayDeque.offer(options);
            }
            this.f117c.k(bArr);
            return b9;
        } catch (Throwable th) {
            e(options);
            ArrayDeque arrayDeque2 = f114k;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options);
                this.f117c.k(bArr);
                throw th;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x05c6 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0155 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x045e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0482  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap b(Y2.e eVar, BitmapFactory.Options options, m mVar, EnumC4988a enumC4988a, s1.i iVar, boolean z8, int i4, int i9, boolean z9, n nVar) {
        String str;
        long j9;
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13;
        String str2;
        InterfaceC5117a interfaceC5117a;
        String str3;
        int i14;
        boolean c4;
        boolean z11;
        boolean z12;
        boolean z13;
        int i15;
        int round;
        int i16;
        InterfaceC5117a interfaceC5117a2;
        Bitmap c9;
        Bitmap bitmap;
        ColorSpace colorSpace;
        boolean z14;
        ColorSpace colorSpace2;
        ColorSpace colorSpace3;
        ColorSpace colorSpace4;
        boolean isWideGamut;
        Bitmap.Config config;
        Bitmap.Config config2;
        Bitmap.Config config3;
        String str4;
        int i17;
        String str5;
        int i18;
        int floor;
        int floor2;
        z zVar;
        z zVar2;
        int i19;
        ColorSpace.Named unused;
        int i20 = N1.j.f1965b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        options.inJustDecodeBounds = true;
        InterfaceC5117a interfaceC5117a3 = this.f115a;
        c(eVar, options, nVar, interfaceC5117a3);
        options.inJustDecodeBounds = false;
        int[] iArr = {options.outWidth, options.outHeight};
        int i21 = iArr[0];
        int i22 = iArr[1];
        String str6 = options.outMimeType;
        boolean z15 = (i21 == -1 || i22 == -1) ? false : z8;
        switch (eVar.f3962n) {
            case 1:
                str = str6;
                j9 = elapsedRealtimeNanos;
                ByteBuffer c10 = N1.b.c((ByteBuffer) eVar.f3963u);
                C3112dq c3112dq = (C3112dq) eVar.f3965w;
                if (c10 != null) {
                    ArrayList arrayList = (ArrayList) eVar.f3964v;
                    int size = arrayList.size();
                    int i23 = 0;
                    while (i23 < size) {
                        ArrayList arrayList2 = arrayList;
                        try {
                            int f6 = ((InterfaceC4991d) arrayList.get(i23)).f(c10, c3112dq);
                            C3112dq c3112dq2 = c3112dq;
                            if (f6 != -1) {
                                i10 = f6;
                                switch (i10) {
                                    case 3:
                                    case 4:
                                        i11 = 180;
                                        break;
                                    case 5:
                                    case 6:
                                        i11 = 90;
                                        break;
                                    case 7:
                                    case 8:
                                        i11 = 270;
                                        break;
                                    default:
                                        i11 = 0;
                                        break;
                                }
                                switch (i10) {
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                        z10 = true;
                                        break;
                                    default:
                                        z10 = false;
                                        break;
                                }
                                if (i4 == Integer.MIN_VALUE) {
                                    if (i11 != 90) {
                                        i12 = 270;
                                        if (i11 != 270) {
                                            i13 = i21;
                                        }
                                    } else {
                                        i12 = 270;
                                    }
                                    i13 = i22;
                                } else {
                                    i12 = 270;
                                    i13 = i4;
                                }
                                int i24 = i9 == Integer.MIN_VALUE ? (i11 == 90 || i11 == i12) ? i21 : i22 : i9;
                                ImageHeaderParser$ImageType y6 = eVar.y();
                                int i25 = i10;
                                boolean z16 = z10;
                                if (i21 > 0 || i22 <= 0) {
                                    str2 = ", density: ";
                                    interfaceC5117a = interfaceC5117a3;
                                    str3 = ", target density: ";
                                    i14 = i13;
                                    if (Log.isLoggable("Downsampler", 3)) {
                                        Log.d("Downsampler", "Unable to determine dimensions for: " + y6 + " with target [" + i14 + "x" + i24 + "]");
                                    }
                                } else {
                                    if (i11 == 90 || i11 == 270) {
                                        str4 = ", density: ";
                                        i17 = i21;
                                        str5 = "]";
                                        i18 = i22;
                                    } else {
                                        str4 = ", density: ";
                                        i17 = i22;
                                        str5 = "]";
                                        i18 = i21;
                                    }
                                    i14 = i13;
                                    float b9 = mVar.b(i18, i17, i14, i24);
                                    if (b9 <= 0.0f) {
                                        throw new IllegalArgumentException("Cannot scale with factor: " + b9 + " from: " + mVar + ", source: [" + i21 + "x" + i22 + "], target: [" + i14 + "x" + i24 + str5);
                                    }
                                    int a9 = mVar.a(i18, i17, i14, i24);
                                    if (a9 == 0) {
                                        throw new IllegalArgumentException("Cannot round with null rounding");
                                    }
                                    int i26 = i11;
                                    float f9 = i18;
                                    int i27 = i18;
                                    float f10 = i17;
                                    int i28 = i17;
                                    int i29 = (int) ((b9 * f10) + 0.5d);
                                    int i30 = i27 / ((int) ((b9 * f9) + 0.5d));
                                    int i31 = i28 / i29;
                                    int max = Math.max(1, Integer.highestOneBit(a9 == 1 ? Math.max(i30, i31) : Math.min(i30, i31)));
                                    if (a9 == 1 && max < 1.0f / b9) {
                                        max <<= 1;
                                    }
                                    options.inSampleSize = max;
                                    if (y6 == ImageHeaderParser$ImageType.JPEG) {
                                        float min = Math.min(max, 8);
                                        floor = (int) Math.ceil(f9 / min);
                                        floor2 = (int) Math.ceil(f10 / min);
                                        int i32 = max / 8;
                                        if (i32 > 0) {
                                            floor /= i32;
                                            floor2 /= i32;
                                        }
                                    } else if (y6 == ImageHeaderParser$ImageType.PNG || y6 == ImageHeaderParser$ImageType.PNG_A) {
                                        float f11 = max;
                                        floor = (int) Math.floor(f9 / f11);
                                        floor2 = (int) Math.floor(f10 / f11);
                                    } else if (y6.isWebp()) {
                                        float f12 = max;
                                        floor = Math.round(f9 / f12);
                                        floor2 = Math.round(f10 / f12);
                                    } else if (i27 % max == 0 && i28 % max == 0) {
                                        floor = i27 / max;
                                        floor2 = i28 / max;
                                    } else {
                                        options.inJustDecodeBounds = true;
                                        c(eVar, options, nVar, interfaceC5117a3);
                                        options.inJustDecodeBounds = false;
                                        int[] iArr2 = {options.outWidth, options.outHeight};
                                        int i33 = iArr2[0];
                                        floor2 = iArr2[1];
                                        floor = i33;
                                    }
                                    int i34 = max;
                                    double b10 = mVar.b(floor, floor2, i14, i24);
                                    int i35 = floor2;
                                    interfaceC5117a = interfaceC5117a3;
                                    options.inTargetDensity = (int) (((b10 / (r10 / r7)) * ((int) ((((int) Math.round((b10 <= 1.0d ? b10 : 1.0d / b10) * 2.147483647E9d)) * b10) + 0.5d))) + 0.5d);
                                    int round2 = (int) Math.round((b10 <= 1.0d ? b10 : 1.0d / b10) * 2.147483647E9d);
                                    options.inDensity = round2;
                                    int i36 = options.inTargetDensity;
                                    if (i36 <= 0 || round2 <= 0 || i36 == round2) {
                                        options.inTargetDensity = 0;
                                        options.inDensity = 0;
                                    } else {
                                        options.inScaled = true;
                                    }
                                    if (Log.isLoggable("Downsampler", 2)) {
                                        StringBuilder h9 = AbstractC5051n.h(i21, i22, "Calculate scaling, source: [", "x", "], degreesToRotate: ");
                                        h9.append(i26);
                                        h9.append(", target: [");
                                        h9.append(i14);
                                        h9.append("x");
                                        h9.append(i24);
                                        h9.append("], power of two scaled: [");
                                        h9.append(floor);
                                        h9.append("x");
                                        h9.append(i35);
                                        h9.append("], exact scale factor: ");
                                        h9.append(b9);
                                        h9.append(", power of 2 sample size: ");
                                        h9.append(i34);
                                        h9.append(", adjusted scale factor: ");
                                        h9.append(b10);
                                        str3 = ", target density: ";
                                        h9.append(str3);
                                        h9.append(options.inTargetDensity);
                                        str2 = str4;
                                        h9.append(str2);
                                        h9.append(options.inDensity);
                                        Log.v("Downsampler", h9.toString());
                                    } else {
                                        str2 = str4;
                                        str3 = ", target density: ";
                                    }
                                }
                                c4 = this.f119e.c(i14, i24, z15, z16);
                                if (c4) {
                                    config3 = Bitmap.Config.HARDWARE;
                                    options.inPreferredConfig = config3;
                                    z11 = false;
                                    options.inMutable = false;
                                } else {
                                    z11 = false;
                                }
                                if (!c4) {
                                    if (enumC4988a != EnumC4988a.f40415n) {
                                        try {
                                            z12 = eVar.y().hasAlpha();
                                        } catch (IOException e6) {
                                            if (Log.isLoggable("Downsampler", 3)) {
                                                Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + enumC4988a, e6);
                                            }
                                            z12 = z11;
                                        }
                                        Bitmap.Config config4 = z12 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                                        options.inPreferredConfig = config4;
                                        if (config4 == Bitmap.Config.RGB_565) {
                                            z13 = true;
                                            options.inDither = true;
                                        }
                                    } else {
                                        z13 = true;
                                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                    }
                                    i15 = Build.VERSION.SDK_INT;
                                    if (i21 >= 0 || i22 < 0 || !z9) {
                                        int i37 = options.inTargetDensity;
                                        float f13 = !((i37 > 0 || (i16 = options.inDensity) <= 0 || i37 == i16) ? z11 : z13) ? i37 / options.inDensity : 1.0f;
                                        int i38 = options.inSampleSize;
                                        float f14 = i38;
                                        int ceil = (int) Math.ceil(i21 / f14);
                                        int ceil2 = (int) Math.ceil(i22 / f14);
                                        round = Math.round(ceil * f13);
                                        int round3 = Math.round(ceil2 * f13);
                                        if (Log.isLoggable("Downsampler", 2)) {
                                            StringBuilder h10 = AbstractC5051n.h(round, round3, "Calculated target [", "x", "] for source [");
                                            h10.append(i21);
                                            h10.append("x");
                                            h10.append(i22);
                                            h10.append("], sampleSize: ");
                                            h10.append(i38);
                                            h10.append(", targetDensity: ");
                                            h10.append(options.inTargetDensity);
                                            h10.append(str2);
                                            h10.append(options.inDensity);
                                            h10.append(", density multiplier: ");
                                            h10.append(f13);
                                            Log.v("Downsampler", h10.toString());
                                        }
                                        i24 = round3;
                                    } else {
                                        round = i14;
                                    }
                                    if (round > 0 && i24 > 0) {
                                        if (i15 < 26) {
                                            Bitmap.Config config5 = options.inPreferredConfig;
                                            config2 = Bitmap.Config.HARDWARE;
                                            config = config5 != config2 ? options.outConfig : null;
                                        }
                                        if (config == null) {
                                            config = options.inPreferredConfig;
                                        }
                                        interfaceC5117a2 = interfaceC5117a;
                                        options.inBitmap = interfaceC5117a2.c(round, i24, config);
                                        if (iVar != null) {
                                            if (i15 >= 28) {
                                                if (iVar == s1.i.f40427n) {
                                                    colorSpace3 = options.outColorSpace;
                                                    if (colorSpace3 != null) {
                                                        colorSpace4 = options.outColorSpace;
                                                        isWideGamut = colorSpace4.isWideGamut();
                                                        if (isWideGamut) {
                                                            z14 = true;
                                                            colorSpace2 = ColorSpace.get(!z14 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
                                                            options.inPreferredColorSpace = colorSpace2;
                                                        }
                                                    }
                                                }
                                                z14 = false;
                                                colorSpace2 = ColorSpace.get(!z14 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
                                                options.inPreferredColorSpace = colorSpace2;
                                            } else if (i15 >= 26) {
                                                unused = ColorSpace.Named.SRGB;
                                                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                                                options.inPreferredColorSpace = colorSpace;
                                            }
                                        }
                                        c9 = c(eVar, options, nVar, interfaceC5117a2);
                                        nVar.d(c9, interfaceC5117a2);
                                        if (Log.isLoggable("Downsampler", 2)) {
                                            Log.v("Downsampler", "Decoded " + d(c9) + " from [" + i21 + "x" + i22 + "] " + str + " with inBitmap " + d(options.inBitmap) + " for [" + i4 + "x" + i9 + "], sample size: " + options.inSampleSize + str2 + options.inDensity + str3 + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + N1.j.a(j9));
                                        }
                                        if (c9 != null) {
                                            return null;
                                        }
                                        c9.setDensity(this.f116b.densityDpi);
                                        switch (i25) {
                                            case 2:
                                            case 3:
                                            case 4:
                                            case 5:
                                            case 6:
                                            case 7:
                                            case 8:
                                                Matrix matrix = new Matrix();
                                                switch (i25) {
                                                    case 2:
                                                        matrix.setScale(-1.0f, 1.0f);
                                                        break;
                                                    case 3:
                                                        matrix.setRotate(180.0f);
                                                        break;
                                                    case 4:
                                                        matrix.setRotate(180.0f);
                                                        matrix.postScale(-1.0f, 1.0f);
                                                        break;
                                                    case 5:
                                                        matrix.setRotate(90.0f);
                                                        matrix.postScale(-1.0f, 1.0f);
                                                        break;
                                                    case 6:
                                                        matrix.setRotate(90.0f);
                                                        break;
                                                    case 7:
                                                        matrix.setRotate(-90.0f);
                                                        matrix.postScale(-1.0f, 1.0f);
                                                        break;
                                                    case 8:
                                                        matrix.setRotate(-90.0f);
                                                        break;
                                                }
                                                c9 = Bitmap.createBitmap(c9, 0, 0, c9.getWidth(), c9.getHeight(), matrix, true);
                                                bitmap = c9;
                                                break;
                                            default:
                                                bitmap = c9;
                                                break;
                                        }
                                        if (bitmap.equals(c9)) {
                                            return c9;
                                        }
                                        interfaceC5117a2.d(bitmap);
                                        return c9;
                                    }
                                    interfaceC5117a2 = interfaceC5117a;
                                    if (iVar != null) {
                                    }
                                    c9 = c(eVar, options, nVar, interfaceC5117a2);
                                    nVar.d(c9, interfaceC5117a2);
                                    if (Log.isLoggable("Downsampler", 2)) {
                                    }
                                    if (c9 != null) {
                                    }
                                }
                                z13 = true;
                                i15 = Build.VERSION.SDK_INT;
                                if (i21 >= 0) {
                                }
                                int i372 = options.inTargetDensity;
                                if (!((i372 > 0 || (i16 = options.inDensity) <= 0 || i372 == i16) ? z11 : z13)) {
                                }
                                int i382 = options.inSampleSize;
                                float f142 = i382;
                                int ceil3 = (int) Math.ceil(i21 / f142);
                                int ceil22 = (int) Math.ceil(i22 / f142);
                                round = Math.round(ceil3 * f13);
                                int round32 = Math.round(ceil22 * f13);
                                if (Log.isLoggable("Downsampler", 2)) {
                                }
                                i24 = round32;
                                if (round > 0) {
                                    if (i15 < 26) {
                                    }
                                    if (config == null) {
                                    }
                                    interfaceC5117a2 = interfaceC5117a;
                                    options.inBitmap = interfaceC5117a2.c(round, i24, config);
                                    if (iVar != null) {
                                    }
                                    c9 = c(eVar, options, nVar, interfaceC5117a2);
                                    nVar.d(c9, interfaceC5117a2);
                                    if (Log.isLoggable("Downsampler", 2)) {
                                    }
                                    if (c9 != null) {
                                    }
                                }
                                interfaceC5117a2 = interfaceC5117a;
                                if (iVar != null) {
                                }
                                c9 = c(eVar, options, nVar, interfaceC5117a2);
                                nVar.d(c9, interfaceC5117a2);
                                if (Log.isLoggable("Downsampler", 2)) {
                                }
                                if (c9 != null) {
                                }
                            } else {
                                i23++;
                                arrayList = arrayList2;
                                c3112dq = c3112dq2;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                i10 = -1;
                switch (i10) {
                }
                switch (i10) {
                }
                if (i4 == Integer.MIN_VALUE) {
                }
                if (i9 == Integer.MIN_VALUE) {
                }
                ImageHeaderParser$ImageType y62 = eVar.y();
                int i252 = i10;
                boolean z162 = z10;
                if (i21 > 0) {
                }
                str2 = ", density: ";
                interfaceC5117a = interfaceC5117a3;
                str3 = ", target density: ";
                i14 = i13;
                if (Log.isLoggable("Downsampler", 3)) {
                }
                c4 = this.f119e.c(i14, i24, z15, z162);
                if (c4) {
                }
                if (!c4) {
                }
                z13 = true;
                i15 = Build.VERSION.SDK_INT;
                if (i21 >= 0) {
                }
                int i3722 = options.inTargetDensity;
                if (!((i3722 > 0 || (i16 = options.inDensity) <= 0 || i3722 == i16) ? z11 : z13)) {
                }
                int i3822 = options.inSampleSize;
                float f1422 = i3822;
                int ceil32 = (int) Math.ceil(i21 / f1422);
                int ceil222 = (int) Math.ceil(i22 / f1422);
                round = Math.round(ceil32 * f13);
                int round322 = Math.round(ceil222 * f13);
                if (Log.isLoggable("Downsampler", 2)) {
                }
                i24 = round322;
                if (round > 0) {
                }
                interfaceC5117a2 = interfaceC5117a;
                if (iVar != null) {
                }
                c9 = c(eVar, options, nVar, interfaceC5117a2);
                nVar.d(c9, interfaceC5117a2);
                if (Log.isLoggable("Downsampler", 2)) {
                }
                if (c9 != null) {
                }
                break;
            case 2:
                str = str6;
                j9 = elapsedRealtimeNanos;
                z zVar3 = (z) ((com.bumptech.glide.load.data.g) eVar.f3963u).f23580u;
                zVar3.reset();
                i10 = S0.f.j((ArrayList) eVar.f3965w, zVar3, (C3112dq) eVar.f3964v);
                switch (i10) {
                }
                switch (i10) {
                }
                if (i4 == Integer.MIN_VALUE) {
                }
                if (i9 == Integer.MIN_VALUE) {
                }
                ImageHeaderParser$ImageType y622 = eVar.y();
                int i2522 = i10;
                boolean z1622 = z10;
                if (i21 > 0) {
                }
                str2 = ", density: ";
                interfaceC5117a = interfaceC5117a3;
                str3 = ", target density: ";
                i14 = i13;
                if (Log.isLoggable("Downsampler", 3)) {
                }
                c4 = this.f119e.c(i14, i24, z15, z1622);
                if (c4) {
                }
                if (!c4) {
                }
                z13 = true;
                i15 = Build.VERSION.SDK_INT;
                if (i21 >= 0) {
                }
                int i37222 = options.inTargetDensity;
                if (!((i37222 > 0 || (i16 = options.inDensity) <= 0 || i37222 == i16) ? z11 : z13)) {
                }
                int i38222 = options.inSampleSize;
                float f14222 = i38222;
                int ceil322 = (int) Math.ceil(i21 / f14222);
                int ceil2222 = (int) Math.ceil(i22 / f14222);
                round = Math.round(ceil322 * f13);
                int round3222 = Math.round(ceil2222 * f13);
                if (Log.isLoggable("Downsampler", 2)) {
                }
                i24 = round3222;
                if (round > 0) {
                }
                interfaceC5117a2 = interfaceC5117a;
                if (iVar != null) {
                }
                c9 = c(eVar, options, nVar, interfaceC5117a2);
                nVar.d(c9, interfaceC5117a2);
                if (Log.isLoggable("Downsampler", 2)) {
                }
                if (c9 != null) {
                }
                break;
            default:
                com.bumptech.glide.load.data.g gVar = (com.bumptech.glide.load.data.g) eVar.f3965w;
                C3112dq c3112dq3 = (C3112dq) eVar.f3963u;
                j9 = elapsedRealtimeNanos;
                ArrayList arrayList3 = (ArrayList) eVar.f3964v;
                int size2 = arrayList3.size();
                str = str6;
                int i39 = 0;
                while (i39 < size2) {
                    int i40 = i39;
                    InterfaceC4991d interfaceC4991d = (InterfaceC4991d) arrayList3.get(i39);
                    ArrayList arrayList4 = arrayList3;
                    try {
                        i19 = size2;
                        zVar2 = new z(new FileInputStream(gVar.d().getFileDescriptor()), c3112dq3);
                    } catch (Throwable th2) {
                        th = th2;
                        zVar = null;
                    }
                    try {
                        int c11 = interfaceC4991d.c(zVar2, c3112dq3);
                        zVar2.b();
                        gVar.d();
                        if (c11 != -1) {
                            i10 = c11;
                            switch (i10) {
                            }
                            switch (i10) {
                            }
                            if (i4 == Integer.MIN_VALUE) {
                            }
                            if (i9 == Integer.MIN_VALUE) {
                            }
                            ImageHeaderParser$ImageType y6222 = eVar.y();
                            int i25222 = i10;
                            boolean z16222 = z10;
                            if (i21 > 0) {
                            }
                            str2 = ", density: ";
                            interfaceC5117a = interfaceC5117a3;
                            str3 = ", target density: ";
                            i14 = i13;
                            if (Log.isLoggable("Downsampler", 3)) {
                            }
                            c4 = this.f119e.c(i14, i24, z15, z16222);
                            if (c4) {
                            }
                            if (!c4) {
                            }
                            z13 = true;
                            i15 = Build.VERSION.SDK_INT;
                            if (i21 >= 0) {
                            }
                            int i372222 = options.inTargetDensity;
                            if (!((i372222 > 0 || (i16 = options.inDensity) <= 0 || i372222 == i16) ? z11 : z13)) {
                            }
                            int i382222 = options.inSampleSize;
                            float f142222 = i382222;
                            int ceil3222 = (int) Math.ceil(i21 / f142222);
                            int ceil22222 = (int) Math.ceil(i22 / f142222);
                            round = Math.round(ceil3222 * f13);
                            int round32222 = Math.round(ceil22222 * f13);
                            if (Log.isLoggable("Downsampler", 2)) {
                            }
                            i24 = round32222;
                            if (round > 0) {
                            }
                            interfaceC5117a2 = interfaceC5117a;
                            if (iVar != null) {
                            }
                            c9 = c(eVar, options, nVar, interfaceC5117a2);
                            nVar.d(c9, interfaceC5117a2);
                            if (Log.isLoggable("Downsampler", 2)) {
                            }
                            if (c9 != null) {
                            }
                        } else {
                            i39 = i40 + 1;
                            arrayList3 = arrayList4;
                            size2 = i19;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        zVar = zVar2;
                        if (zVar != null) {
                            zVar.b();
                        }
                        gVar.d();
                        throw th;
                    }
                }
                i10 = -1;
                switch (i10) {
                }
                switch (i10) {
                }
                if (i4 == Integer.MIN_VALUE) {
                }
                if (i9 == Integer.MIN_VALUE) {
                }
                ImageHeaderParser$ImageType y62222 = eVar.y();
                int i252222 = i10;
                boolean z162222 = z10;
                if (i21 > 0) {
                }
                str2 = ", density: ";
                interfaceC5117a = interfaceC5117a3;
                str3 = ", target density: ";
                i14 = i13;
                if (Log.isLoggable("Downsampler", 3)) {
                }
                c4 = this.f119e.c(i14, i24, z15, z162222);
                if (c4) {
                }
                if (!c4) {
                }
                z13 = true;
                i15 = Build.VERSION.SDK_INT;
                if (i21 >= 0) {
                }
                int i3722222 = options.inTargetDensity;
                if (!((i3722222 > 0 || (i16 = options.inDensity) <= 0 || i3722222 == i16) ? z11 : z13)) {
                }
                int i3822222 = options.inSampleSize;
                float f1422222 = i3822222;
                int ceil32222 = (int) Math.ceil(i21 / f1422222);
                int ceil222222 = (int) Math.ceil(i22 / f1422222);
                round = Math.round(ceil32222 * f13);
                int round322222 = Math.round(ceil222222 * f13);
                if (Log.isLoggable("Downsampler", 2)) {
                }
                i24 = round322222;
                if (round > 0) {
                }
                interfaceC5117a2 = interfaceC5117a;
                if (iVar != null) {
                }
                c9 = c(eVar, options, nVar, interfaceC5117a2);
                nVar.d(c9, interfaceC5117a2);
                if (Log.isLoggable("Downsampler", 2)) {
                }
                if (c9 != null) {
                }
                break;
        }
    }
}
