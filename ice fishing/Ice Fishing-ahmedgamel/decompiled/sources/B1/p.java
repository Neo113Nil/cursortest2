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
import com.google.android.gms.internal.ads.C2941aq;
import com.icefishingapp.icefishing.AbstractC4404f;
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
import s1.EnumC4966a;
import s1.InterfaceC4969d;
import v1.InterfaceC5104a;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: f, reason: collision with root package name */
    public static final s1.g f145f = s1.g.a(EnumC4966a.f40448v, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* renamed from: g, reason: collision with root package name */
    public static final s1.g f146g = new s1.g("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, s1.g.f40452e);

    /* renamed from: h, reason: collision with root package name */
    public static final s1.g f147h;
    public static final s1.g i;

    /* renamed from: j, reason: collision with root package name */
    public static final E3.e f148j;

    /* renamed from: k, reason: collision with root package name */
    public static final ArrayDeque f149k;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC5104a f150a;

    /* renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f151b;

    /* renamed from: c, reason: collision with root package name */
    public final C2941aq f152c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f153d;

    /* renamed from: e, reason: collision with root package name */
    public final y f154e = y.a();

    static {
        n nVar = n.f137b;
        Boolean bool = Boolean.FALSE;
        f147h = s1.g.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        i = s1.g.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f148j = new E3.e();
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = N1.p.f1932a;
        f149k = new ArrayDeque(0);
    }

    public p(ArrayList arrayList, DisplayMetrics displayMetrics, InterfaceC5104a interfaceC5104a, C2941aq c2941aq) {
        this.f153d = arrayList;
        N1.g.c(displayMetrics, "Argument must not be null");
        this.f151b = displayMetrics;
        N1.g.c(interfaceC5104a, "Argument must not be null");
        this.f150a = interfaceC5104a;
        N1.g.c(c2941aq, "Argument must not be null");
        this.f152c = c2941aq;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        throw r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap c(Z2.e eVar, BitmapFactory.Options options, o oVar, InterfaceC5104a interfaceC5104a) {
        if (!options.inJustDecodeBounds) {
            oVar.o();
            switch (eVar.f4169n) {
                case 2:
                    A a9 = (A) ((com.bumptech.glide.load.data.g) eVar.f4170u).f23424u;
                    synchronized (a9) {
                        a9.f99v = a9.f97n.length;
                        break;
                    }
            }
        }
        int i6 = options.outWidth;
        int i9 = options.outHeight;
        String str = options.outMimeType;
        Lock lock = C.f104b;
        lock.lock();
        try {
            try {
                Bitmap o6 = eVar.o(options);
                lock.unlock();
                return o6;
            } catch (IllegalArgumentException e9) {
                StringBuilder h9 = AbstractC4404f.h(i6, i9, "Exception decoding bitmap, outWidth: ", ", outHeight: ", ", outMimeType: ");
                h9.append(str);
                h9.append(", inBitmap: ");
                h9.append(d(options.inBitmap));
                IOException iOException = new IOException(h9.toString(), e9);
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", iOException);
                }
                Bitmap bitmap = options.inBitmap;
                if (bitmap == null) {
                    throw iOException;
                }
                try {
                    interfaceC5104a.d(bitmap);
                    options.inBitmap = null;
                    Bitmap c9 = c(eVar, options, oVar, interfaceC5104a);
                    C.f104b.unlock();
                    return c9;
                } catch (IOException unused) {
                    throw iOException;
                }
            }
        } catch (Throwable th) {
            C.f104b.unlock();
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

    public final C0262d a(Z2.e eVar, int i6, int i9, s1.h hVar, o oVar) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        byte[] bArr = (byte[]) this.f152c.f(com.anythink.basead.exoplayer.b.aX, byte[].class);
        synchronized (p.class) {
            arrayDeque = f149k;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                e(options);
            }
        }
        options.inTempStorage = bArr;
        EnumC4966a enumC4966a = (EnumC4966a) hVar.c(f145f);
        s1.i iVar = (s1.i) hVar.c(f146g);
        n nVar = (n) hVar.c(n.f142g);
        boolean booleanValue = ((Boolean) hVar.c(f147h)).booleanValue();
        s1.g gVar = i;
        try {
            C0262d b9 = C0262d.b(b(eVar, options, nVar, enumC4966a, iVar, hVar.c(gVar) != null && ((Boolean) hVar.c(gVar)).booleanValue(), i6, i9, booleanValue, oVar), this.f150a);
            e(options);
            synchronized (arrayDeque) {
                arrayDeque.offer(options);
            }
            this.f152c.k(bArr);
            return b9;
        } catch (Throwable th) {
            e(options);
            ArrayDeque arrayDeque2 = f149k;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options);
                this.f152c.k(bArr);
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
    public final Bitmap b(Z2.e eVar, BitmapFactory.Options options, n nVar, EnumC4966a enumC4966a, s1.i iVar, boolean z3, int i6, int i9, boolean z6, o oVar) {
        String str;
        long j6;
        int i10;
        int i11;
        boolean z9;
        int i12;
        int i13;
        String str2;
        InterfaceC5104a interfaceC5104a;
        String str3;
        int i14;
        boolean c9;
        boolean z10;
        boolean z11;
        boolean z12;
        int i15;
        int round;
        int i16;
        InterfaceC5104a interfaceC5104a2;
        Bitmap c10;
        Bitmap bitmap;
        ColorSpace colorSpace;
        boolean z13;
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
        A a9;
        A a10;
        int i19;
        ColorSpace.Named unused;
        int i20 = N1.j.f1921b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        options.inJustDecodeBounds = true;
        InterfaceC5104a interfaceC5104a3 = this.f150a;
        c(eVar, options, oVar, interfaceC5104a3);
        options.inJustDecodeBounds = false;
        int[] iArr = {options.outWidth, options.outHeight};
        int i21 = iArr[0];
        int i22 = iArr[1];
        String str6 = options.outMimeType;
        boolean z14 = (i21 == -1 || i22 == -1) ? false : z3;
        switch (eVar.f4169n) {
            case 1:
                str = str6;
                j6 = elapsedRealtimeNanos;
                ByteBuffer c11 = N1.b.c((ByteBuffer) eVar.f4170u);
                C2941aq c2941aq = (C2941aq) eVar.f4172w;
                if (c11 != null) {
                    ArrayList arrayList = (ArrayList) eVar.f4171v;
                    int size = arrayList.size();
                    int i23 = 0;
                    while (i23 < size) {
                        ArrayList arrayList2 = arrayList;
                        try {
                            int f3 = ((InterfaceC4969d) arrayList.get(i23)).f(c11, c2941aq);
                            C2941aq c2941aq2 = c2941aq;
                            if (f3 != -1) {
                                i10 = f3;
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
                                        z9 = true;
                                        break;
                                    default:
                                        z9 = false;
                                        break;
                                }
                                if (i6 == Integer.MIN_VALUE) {
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
                                    i13 = i6;
                                }
                                int i24 = i9 == Integer.MIN_VALUE ? (i11 == 90 || i11 == i12) ? i21 : i22 : i9;
                                ImageHeaderParser$ImageType v9 = eVar.v();
                                int i25 = i10;
                                boolean z15 = z9;
                                if (i21 > 0 || i22 <= 0) {
                                    str2 = ", density: ";
                                    interfaceC5104a = interfaceC5104a3;
                                    str3 = ", target density: ";
                                    i14 = i13;
                                    if (Log.isLoggable("Downsampler", 3)) {
                                        Log.d("Downsampler", "Unable to determine dimensions for: " + v9 + " with target [" + i14 + "x" + i24 + "]");
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
                                    float b9 = nVar.b(i18, i17, i14, i24);
                                    if (b9 <= 0.0f) {
                                        throw new IllegalArgumentException("Cannot scale with factor: " + b9 + " from: " + nVar + ", source: [" + i21 + "x" + i22 + "], target: [" + i14 + "x" + i24 + str5);
                                    }
                                    int a11 = nVar.a(i18, i17, i14, i24);
                                    if (a11 == 0) {
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
                                    int max = Math.max(1, Integer.highestOneBit(a11 == 1 ? Math.max(i30, i31) : Math.min(i30, i31)));
                                    if (a11 == 1 && max < 1.0f / b9) {
                                        max <<= 1;
                                    }
                                    options.inSampleSize = max;
                                    if (v9 == ImageHeaderParser$ImageType.JPEG) {
                                        float min = Math.min(max, 8);
                                        floor = (int) Math.ceil(f9 / min);
                                        floor2 = (int) Math.ceil(f10 / min);
                                        int i32 = max / 8;
                                        if (i32 > 0) {
                                            floor /= i32;
                                            floor2 /= i32;
                                        }
                                    } else if (v9 == ImageHeaderParser$ImageType.PNG || v9 == ImageHeaderParser$ImageType.PNG_A) {
                                        float f11 = max;
                                        floor = (int) Math.floor(f9 / f11);
                                        floor2 = (int) Math.floor(f10 / f11);
                                    } else if (v9.isWebp()) {
                                        float f12 = max;
                                        floor = Math.round(f9 / f12);
                                        floor2 = Math.round(f10 / f12);
                                    } else if (i27 % max == 0 && i28 % max == 0) {
                                        floor = i27 / max;
                                        floor2 = i28 / max;
                                    } else {
                                        options.inJustDecodeBounds = true;
                                        c(eVar, options, oVar, interfaceC5104a3);
                                        options.inJustDecodeBounds = false;
                                        int[] iArr2 = {options.outWidth, options.outHeight};
                                        int i33 = iArr2[0];
                                        floor2 = iArr2[1];
                                        floor = i33;
                                    }
                                    int i34 = max;
                                    double b10 = nVar.b(floor, floor2, i14, i24);
                                    int i35 = floor2;
                                    interfaceC5104a = interfaceC5104a3;
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
                                        StringBuilder h9 = AbstractC4404f.h(i21, i22, "Calculate scaling, source: [", "x", "], degreesToRotate: ");
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
                                c9 = this.f154e.c(i14, i24, z14, z15);
                                if (c9) {
                                    config3 = Bitmap.Config.HARDWARE;
                                    options.inPreferredConfig = config3;
                                    z10 = false;
                                    options.inMutable = false;
                                } else {
                                    z10 = false;
                                }
                                if (!c9) {
                                    if (enumC4966a != EnumC4966a.f40446n) {
                                        try {
                                            z11 = eVar.v().hasAlpha();
                                        } catch (IOException e9) {
                                            if (Log.isLoggable("Downsampler", 3)) {
                                                Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + enumC4966a, e9);
                                            }
                                            z11 = z10;
                                        }
                                        Bitmap.Config config4 = z11 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                                        options.inPreferredConfig = config4;
                                        if (config4 == Bitmap.Config.RGB_565) {
                                            z12 = true;
                                            options.inDither = true;
                                        }
                                    } else {
                                        z12 = true;
                                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                    }
                                    i15 = Build.VERSION.SDK_INT;
                                    if (i21 >= 0 || i22 < 0 || !z6) {
                                        int i37 = options.inTargetDensity;
                                        float f13 = !((i37 > 0 || (i16 = options.inDensity) <= 0 || i37 == i16) ? z10 : z12) ? i37 / options.inDensity : 1.0f;
                                        int i38 = options.inSampleSize;
                                        float f14 = i38;
                                        int ceil = (int) Math.ceil(i21 / f14);
                                        int ceil2 = (int) Math.ceil(i22 / f14);
                                        round = Math.round(ceil * f13);
                                        int round3 = Math.round(ceil2 * f13);
                                        if (Log.isLoggable("Downsampler", 2)) {
                                            StringBuilder h10 = AbstractC4404f.h(round, round3, "Calculated target [", "x", "] for source [");
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
                                        interfaceC5104a2 = interfaceC5104a;
                                        options.inBitmap = interfaceC5104a2.c(round, i24, config);
                                        if (iVar != null) {
                                            if (i15 >= 28) {
                                                if (iVar == s1.i.f40458n) {
                                                    colorSpace3 = options.outColorSpace;
                                                    if (colorSpace3 != null) {
                                                        colorSpace4 = options.outColorSpace;
                                                        isWideGamut = colorSpace4.isWideGamut();
                                                        if (isWideGamut) {
                                                            z13 = true;
                                                            colorSpace2 = ColorSpace.get(!z13 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
                                                            options.inPreferredColorSpace = colorSpace2;
                                                        }
                                                    }
                                                }
                                                z13 = false;
                                                colorSpace2 = ColorSpace.get(!z13 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
                                                options.inPreferredColorSpace = colorSpace2;
                                            } else if (i15 >= 26) {
                                                unused = ColorSpace.Named.SRGB;
                                                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                                                options.inPreferredColorSpace = colorSpace;
                                            }
                                        }
                                        c10 = c(eVar, options, oVar, interfaceC5104a2);
                                        oVar.p(c10, interfaceC5104a2);
                                        if (Log.isLoggable("Downsampler", 2)) {
                                            Log.v("Downsampler", "Decoded " + d(c10) + " from [" + i21 + "x" + i22 + "] " + str + " with inBitmap " + d(options.inBitmap) + " for [" + i6 + "x" + i9 + "], sample size: " + options.inSampleSize + str2 + options.inDensity + str3 + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + N1.j.a(j6));
                                        }
                                        if (c10 != null) {
                                            return null;
                                        }
                                        c10.setDensity(this.f151b.densityDpi);
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
                                                c10 = Bitmap.createBitmap(c10, 0, 0, c10.getWidth(), c10.getHeight(), matrix, true);
                                                bitmap = c10;
                                                break;
                                            default:
                                                bitmap = c10;
                                                break;
                                        }
                                        if (bitmap.equals(c10)) {
                                            return c10;
                                        }
                                        interfaceC5104a2.d(bitmap);
                                        return c10;
                                    }
                                    interfaceC5104a2 = interfaceC5104a;
                                    if (iVar != null) {
                                    }
                                    c10 = c(eVar, options, oVar, interfaceC5104a2);
                                    oVar.p(c10, interfaceC5104a2);
                                    if (Log.isLoggable("Downsampler", 2)) {
                                    }
                                    if (c10 != null) {
                                    }
                                }
                                z12 = true;
                                i15 = Build.VERSION.SDK_INT;
                                if (i21 >= 0) {
                                }
                                int i372 = options.inTargetDensity;
                                if (!((i372 > 0 || (i16 = options.inDensity) <= 0 || i372 == i16) ? z10 : z12)) {
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
                                    interfaceC5104a2 = interfaceC5104a;
                                    options.inBitmap = interfaceC5104a2.c(round, i24, config);
                                    if (iVar != null) {
                                    }
                                    c10 = c(eVar, options, oVar, interfaceC5104a2);
                                    oVar.p(c10, interfaceC5104a2);
                                    if (Log.isLoggable("Downsampler", 2)) {
                                    }
                                    if (c10 != null) {
                                    }
                                }
                                interfaceC5104a2 = interfaceC5104a;
                                if (iVar != null) {
                                }
                                c10 = c(eVar, options, oVar, interfaceC5104a2);
                                oVar.p(c10, interfaceC5104a2);
                                if (Log.isLoggable("Downsampler", 2)) {
                                }
                                if (c10 != null) {
                                }
                            } else {
                                i23++;
                                arrayList = arrayList2;
                                c2941aq = c2941aq2;
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
                if (i6 == Integer.MIN_VALUE) {
                }
                if (i9 == Integer.MIN_VALUE) {
                }
                ImageHeaderParser$ImageType v92 = eVar.v();
                int i252 = i10;
                boolean z152 = z9;
                if (i21 > 0) {
                }
                str2 = ", density: ";
                interfaceC5104a = interfaceC5104a3;
                str3 = ", target density: ";
                i14 = i13;
                if (Log.isLoggable("Downsampler", 3)) {
                }
                c9 = this.f154e.c(i14, i24, z14, z152);
                if (c9) {
                }
                if (!c9) {
                }
                z12 = true;
                i15 = Build.VERSION.SDK_INT;
                if (i21 >= 0) {
                }
                int i3722 = options.inTargetDensity;
                if (!((i3722 > 0 || (i16 = options.inDensity) <= 0 || i3722 == i16) ? z10 : z12)) {
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
                interfaceC5104a2 = interfaceC5104a;
                if (iVar != null) {
                }
                c10 = c(eVar, options, oVar, interfaceC5104a2);
                oVar.p(c10, interfaceC5104a2);
                if (Log.isLoggable("Downsampler", 2)) {
                }
                if (c10 != null) {
                }
                break;
            case 2:
                str = str6;
                j6 = elapsedRealtimeNanos;
                A a12 = (A) ((com.bumptech.glide.load.data.g) eVar.f4170u).f23424u;
                a12.reset();
                i10 = com.bumptech.glide.e.d((ArrayList) eVar.f4172w, a12, (C2941aq) eVar.f4171v);
                switch (i10) {
                }
                switch (i10) {
                }
                if (i6 == Integer.MIN_VALUE) {
                }
                if (i9 == Integer.MIN_VALUE) {
                }
                ImageHeaderParser$ImageType v922 = eVar.v();
                int i2522 = i10;
                boolean z1522 = z9;
                if (i21 > 0) {
                }
                str2 = ", density: ";
                interfaceC5104a = interfaceC5104a3;
                str3 = ", target density: ";
                i14 = i13;
                if (Log.isLoggable("Downsampler", 3)) {
                }
                c9 = this.f154e.c(i14, i24, z14, z1522);
                if (c9) {
                }
                if (!c9) {
                }
                z12 = true;
                i15 = Build.VERSION.SDK_INT;
                if (i21 >= 0) {
                }
                int i37222 = options.inTargetDensity;
                if (!((i37222 > 0 || (i16 = options.inDensity) <= 0 || i37222 == i16) ? z10 : z12)) {
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
                interfaceC5104a2 = interfaceC5104a;
                if (iVar != null) {
                }
                c10 = c(eVar, options, oVar, interfaceC5104a2);
                oVar.p(c10, interfaceC5104a2);
                if (Log.isLoggable("Downsampler", 2)) {
                }
                if (c10 != null) {
                }
                break;
            default:
                com.bumptech.glide.load.data.g gVar = (com.bumptech.glide.load.data.g) eVar.f4172w;
                C2941aq c2941aq3 = (C2941aq) eVar.f4170u;
                j6 = elapsedRealtimeNanos;
                ArrayList arrayList3 = (ArrayList) eVar.f4171v;
                int size2 = arrayList3.size();
                str = str6;
                int i39 = 0;
                while (i39 < size2) {
                    int i40 = i39;
                    InterfaceC4969d interfaceC4969d = (InterfaceC4969d) arrayList3.get(i39);
                    ArrayList arrayList4 = arrayList3;
                    try {
                        i19 = size2;
                        a10 = new A(new FileInputStream(gVar.e().getFileDescriptor()), c2941aq3);
                    } catch (Throwable th2) {
                        th = th2;
                        a9 = null;
                    }
                    try {
                        int b11 = interfaceC4969d.b(a10, c2941aq3);
                        a10.b();
                        gVar.e();
                        if (b11 != -1) {
                            i10 = b11;
                            switch (i10) {
                            }
                            switch (i10) {
                            }
                            if (i6 == Integer.MIN_VALUE) {
                            }
                            if (i9 == Integer.MIN_VALUE) {
                            }
                            ImageHeaderParser$ImageType v9222 = eVar.v();
                            int i25222 = i10;
                            boolean z15222 = z9;
                            if (i21 > 0) {
                            }
                            str2 = ", density: ";
                            interfaceC5104a = interfaceC5104a3;
                            str3 = ", target density: ";
                            i14 = i13;
                            if (Log.isLoggable("Downsampler", 3)) {
                            }
                            c9 = this.f154e.c(i14, i24, z14, z15222);
                            if (c9) {
                            }
                            if (!c9) {
                            }
                            z12 = true;
                            i15 = Build.VERSION.SDK_INT;
                            if (i21 >= 0) {
                            }
                            int i372222 = options.inTargetDensity;
                            if (!((i372222 > 0 || (i16 = options.inDensity) <= 0 || i372222 == i16) ? z10 : z12)) {
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
                            interfaceC5104a2 = interfaceC5104a;
                            if (iVar != null) {
                            }
                            c10 = c(eVar, options, oVar, interfaceC5104a2);
                            oVar.p(c10, interfaceC5104a2);
                            if (Log.isLoggable("Downsampler", 2)) {
                            }
                            if (c10 != null) {
                            }
                        } else {
                            i39 = i40 + 1;
                            arrayList3 = arrayList4;
                            size2 = i19;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        a9 = a10;
                        if (a9 != null) {
                            a9.b();
                        }
                        gVar.e();
                        throw th;
                    }
                }
                i10 = -1;
                switch (i10) {
                }
                switch (i10) {
                }
                if (i6 == Integer.MIN_VALUE) {
                }
                if (i9 == Integer.MIN_VALUE) {
                }
                ImageHeaderParser$ImageType v92222 = eVar.v();
                int i252222 = i10;
                boolean z152222 = z9;
                if (i21 > 0) {
                }
                str2 = ", density: ";
                interfaceC5104a = interfaceC5104a3;
                str3 = ", target density: ";
                i14 = i13;
                if (Log.isLoggable("Downsampler", 3)) {
                }
                c9 = this.f154e.c(i14, i24, z14, z152222);
                if (c9) {
                }
                if (!c9) {
                }
                z12 = true;
                i15 = Build.VERSION.SDK_INT;
                if (i21 >= 0) {
                }
                int i3722222 = options.inTargetDensity;
                if (!((i3722222 > 0 || (i16 = options.inDensity) <= 0 || i3722222 == i16) ? z10 : z12)) {
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
                interfaceC5104a2 = interfaceC5104a;
                if (iVar != null) {
                }
                c10 = c(eVar, options, oVar, interfaceC5104a2);
                oVar.p(c10, interfaceC5104a2);
                if (Log.isLoggable("Downsampler", 2)) {
                }
                if (c10 != null) {
                }
                break;
        }
    }
}
