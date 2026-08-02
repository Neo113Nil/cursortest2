package D1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.ads.C2964aq;
import com.google.android.gms.internal.ads.Wv;
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
import u1.EnumC5062a;
import u1.InterfaceC5065d;
import x1.InterfaceC5183a;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: f, reason: collision with root package name */
    public static final u1.g f559f = u1.g.a(EnumC5062a.f41002v, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* renamed from: g, reason: collision with root package name */
    public static final u1.g f560g = new u1.g("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, u1.g.f41006e);

    /* renamed from: h, reason: collision with root package name */
    public static final u1.g f561h;
    public static final u1.g i;

    /* renamed from: j, reason: collision with root package name */
    public static final c4.e f562j;

    /* renamed from: k, reason: collision with root package name */
    public static final ArrayDeque f563k;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC5183a f564a;

    /* renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f565b;

    /* renamed from: c, reason: collision with root package name */
    public final C2964aq f566c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f567d;

    /* renamed from: e, reason: collision with root package name */
    public final x f568e = x.a();

    static {
        n nVar = n.f551b;
        Boolean bool = Boolean.FALSE;
        f561h = u1.g.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        i = u1.g.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f562j = new c4.e();
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = P1.p.f2376a;
        f563k = new ArrayDeque(0);
    }

    public p(ArrayList arrayList, DisplayMetrics displayMetrics, InterfaceC5183a interfaceC5183a, C2964aq c2964aq) {
        this.f567d = arrayList;
        P1.g.c(displayMetrics, "Argument must not be null");
        this.f565b = displayMetrics;
        P1.g.c(interfaceC5183a, "Argument must not be null");
        this.f564a = interfaceC5183a;
        P1.g.c(c2964aq, "Argument must not be null");
        this.f566c = c2964aq;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        throw r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap c(b3.e eVar, BitmapFactory.Options options, o oVar, InterfaceC5183a interfaceC5183a) {
        if (!options.inJustDecodeBounds) {
            oVar.x();
            switch (eVar.f5556n) {
                case 3:
                    z zVar = (z) ((com.bumptech.glide.load.data.g) eVar.f5557u).f24211u;
                    synchronized (zVar) {
                        zVar.f585v = zVar.f583n.length;
                        break;
                    }
            }
        }
        int i4 = options.outWidth;
        int i6 = options.outHeight;
        String str = options.outMimeType;
        Lock lock = B.f518b;
        lock.lock();
        try {
            try {
                Bitmap p9 = eVar.p(options);
                lock.unlock();
                return p9;
            } catch (IllegalArgumentException e9) {
                StringBuilder j6 = Wv.j(i4, i6, "Exception decoding bitmap, outWidth: ", ", outHeight: ", ", outMimeType: ");
                j6.append(str);
                j6.append(", inBitmap: ");
                j6.append(d(options.inBitmap));
                IOException iOException = new IOException(j6.toString(), e9);
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", iOException);
                }
                Bitmap bitmap = options.inBitmap;
                if (bitmap == null) {
                    throw iOException;
                }
                try {
                    interfaceC5183a.b(bitmap);
                    options.inBitmap = null;
                    Bitmap c9 = c(eVar, options, oVar, interfaceC5183a);
                    B.f518b.unlock();
                    return c9;
                } catch (IOException unused) {
                    throw iOException;
                }
            }
        } catch (Throwable th) {
            B.f518b.unlock();
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

    public final C0299d a(b3.e eVar, int i4, int i6, u1.h hVar, o oVar) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        byte[] bArr = (byte[]) this.f566c.f(com.anythink.basead.exoplayer.b.aX, byte[].class);
        synchronized (p.class) {
            arrayDeque = f563k;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                e(options);
            }
        }
        options.inTempStorage = bArr;
        EnumC5062a enumC5062a = (EnumC5062a) hVar.c(f559f);
        u1.i iVar = (u1.i) hVar.c(f560g);
        n nVar = (n) hVar.c(n.f556g);
        boolean booleanValue = ((Boolean) hVar.c(f561h)).booleanValue();
        u1.g gVar = i;
        try {
            C0299d d9 = C0299d.d(b(eVar, options, nVar, enumC5062a, iVar, hVar.c(gVar) != null && ((Boolean) hVar.c(gVar)).booleanValue(), i4, i6, booleanValue, oVar), this.f564a);
            e(options);
            synchronized (arrayDeque) {
                arrayDeque.offer(options);
            }
            this.f566c.k(bArr);
            return d9;
        } catch (Throwable th) {
            e(options);
            ArrayDeque arrayDeque2 = f563k;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options);
                this.f566c.k(bArr);
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
    public final Bitmap b(b3.e eVar, BitmapFactory.Options options, n nVar, EnumC5062a enumC5062a, u1.i iVar, boolean z6, int i4, int i6, boolean z9, o oVar) {
        String str;
        long j6;
        int i9;
        int i10;
        boolean z10;
        int i11;
        int i12;
        String str2;
        InterfaceC5183a interfaceC5183a;
        String str3;
        int i13;
        boolean c9;
        boolean z11;
        boolean z12;
        boolean z13;
        int i14;
        int round;
        int i15;
        InterfaceC5183a interfaceC5183a2;
        Bitmap c10;
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
        int i16;
        String str5;
        int i17;
        int floor;
        int floor2;
        z zVar;
        z zVar2;
        int i18;
        ColorSpace.Named unused;
        int i19 = P1.j.f2365b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        options.inJustDecodeBounds = true;
        InterfaceC5183a interfaceC5183a3 = this.f564a;
        c(eVar, options, oVar, interfaceC5183a3);
        options.inJustDecodeBounds = false;
        int[] iArr = {options.outWidth, options.outHeight};
        int i20 = iArr[0];
        int i21 = iArr[1];
        String str6 = options.outMimeType;
        boolean z15 = (i20 == -1 || i21 == -1) ? false : z6;
        switch (eVar.f5556n) {
            case 2:
                str = str6;
                j6 = elapsedRealtimeNanos;
                ByteBuffer c11 = P1.b.c((ByteBuffer) eVar.f5557u);
                C2964aq c2964aq = (C2964aq) eVar.f5559w;
                if (c11 != null) {
                    ArrayList arrayList = (ArrayList) eVar.f5558v;
                    int size = arrayList.size();
                    int i22 = 0;
                    while (i22 < size) {
                        ArrayList arrayList2 = arrayList;
                        try {
                            int f2 = ((InterfaceC5065d) arrayList.get(i22)).f(c11, c2964aq);
                            C2964aq c2964aq2 = c2964aq;
                            if (f2 != -1) {
                                i9 = f2;
                                switch (i9) {
                                    case 3:
                                    case 4:
                                        i10 = 180;
                                        break;
                                    case 5:
                                    case 6:
                                        i10 = 90;
                                        break;
                                    case 7:
                                    case 8:
                                        i10 = 270;
                                        break;
                                    default:
                                        i10 = 0;
                                        break;
                                }
                                switch (i9) {
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
                                    if (i10 != 90) {
                                        i11 = 270;
                                        if (i10 != 270) {
                                            i12 = i20;
                                        }
                                    } else {
                                        i11 = 270;
                                    }
                                    i12 = i21;
                                } else {
                                    i11 = 270;
                                    i12 = i4;
                                }
                                int i23 = i6 == Integer.MIN_VALUE ? (i10 == 90 || i10 == i11) ? i20 : i21 : i6;
                                ImageHeaderParser$ImageType w3 = eVar.w();
                                int i24 = i9;
                                boolean z16 = z10;
                                if (i20 > 0 || i21 <= 0) {
                                    str2 = ", density: ";
                                    interfaceC5183a = interfaceC5183a3;
                                    str3 = ", target density: ";
                                    i13 = i12;
                                    if (Log.isLoggable("Downsampler", 3)) {
                                        Log.d("Downsampler", "Unable to determine dimensions for: " + w3 + " with target [" + i13 + "x" + i23 + "]");
                                    }
                                } else {
                                    if (i10 == 90 || i10 == 270) {
                                        str4 = ", density: ";
                                        i16 = i20;
                                        str5 = "]";
                                        i17 = i21;
                                    } else {
                                        str4 = ", density: ";
                                        i16 = i21;
                                        str5 = "]";
                                        i17 = i20;
                                    }
                                    i13 = i12;
                                    float b9 = nVar.b(i17, i16, i13, i23);
                                    if (b9 <= 0.0f) {
                                        throw new IllegalArgumentException("Cannot scale with factor: " + b9 + " from: " + nVar + ", source: [" + i20 + "x" + i21 + "], target: [" + i13 + "x" + i23 + str5);
                                    }
                                    int a9 = nVar.a(i17, i16, i13, i23);
                                    if (a9 == 0) {
                                        throw new IllegalArgumentException("Cannot round with null rounding");
                                    }
                                    int i25 = i10;
                                    float f9 = i17;
                                    int i26 = i17;
                                    float f10 = i16;
                                    int i27 = i16;
                                    int i28 = (int) ((b9 * f10) + 0.5d);
                                    int i29 = i26 / ((int) ((b9 * f9) + 0.5d));
                                    int i30 = i27 / i28;
                                    int max = Math.max(1, Integer.highestOneBit(a9 == 1 ? Math.max(i29, i30) : Math.min(i29, i30)));
                                    if (a9 == 1 && max < 1.0f / b9) {
                                        max <<= 1;
                                    }
                                    options.inSampleSize = max;
                                    if (w3 == ImageHeaderParser$ImageType.JPEG) {
                                        float min = Math.min(max, 8);
                                        floor = (int) Math.ceil(f9 / min);
                                        floor2 = (int) Math.ceil(f10 / min);
                                        int i31 = max / 8;
                                        if (i31 > 0) {
                                            floor /= i31;
                                            floor2 /= i31;
                                        }
                                    } else if (w3 == ImageHeaderParser$ImageType.PNG || w3 == ImageHeaderParser$ImageType.PNG_A) {
                                        float f11 = max;
                                        floor = (int) Math.floor(f9 / f11);
                                        floor2 = (int) Math.floor(f10 / f11);
                                    } else if (w3.isWebp()) {
                                        float f12 = max;
                                        floor = Math.round(f9 / f12);
                                        floor2 = Math.round(f10 / f12);
                                    } else if (i26 % max == 0 && i27 % max == 0) {
                                        floor = i26 / max;
                                        floor2 = i27 / max;
                                    } else {
                                        options.inJustDecodeBounds = true;
                                        c(eVar, options, oVar, interfaceC5183a3);
                                        options.inJustDecodeBounds = false;
                                        int[] iArr2 = {options.outWidth, options.outHeight};
                                        int i32 = iArr2[0];
                                        floor2 = iArr2[1];
                                        floor = i32;
                                    }
                                    int i33 = max;
                                    double b10 = nVar.b(floor, floor2, i13, i23);
                                    int i34 = floor2;
                                    interfaceC5183a = interfaceC5183a3;
                                    options.inTargetDensity = (int) (((b10 / (r10 / r7)) * ((int) ((((int) Math.round((b10 <= 1.0d ? b10 : 1.0d / b10) * 2.147483647E9d)) * b10) + 0.5d))) + 0.5d);
                                    int round2 = (int) Math.round((b10 <= 1.0d ? b10 : 1.0d / b10) * 2.147483647E9d);
                                    options.inDensity = round2;
                                    int i35 = options.inTargetDensity;
                                    if (i35 <= 0 || round2 <= 0 || i35 == round2) {
                                        options.inTargetDensity = 0;
                                        options.inDensity = 0;
                                    } else {
                                        options.inScaled = true;
                                    }
                                    if (Log.isLoggable("Downsampler", 2)) {
                                        StringBuilder j9 = Wv.j(i20, i21, "Calculate scaling, source: [", "x", "], degreesToRotate: ");
                                        j9.append(i25);
                                        j9.append(", target: [");
                                        j9.append(i13);
                                        j9.append("x");
                                        j9.append(i23);
                                        j9.append("], power of two scaled: [");
                                        j9.append(floor);
                                        j9.append("x");
                                        j9.append(i34);
                                        j9.append("], exact scale factor: ");
                                        j9.append(b9);
                                        j9.append(", power of 2 sample size: ");
                                        j9.append(i33);
                                        j9.append(", adjusted scale factor: ");
                                        j9.append(b10);
                                        str3 = ", target density: ";
                                        j9.append(str3);
                                        j9.append(options.inTargetDensity);
                                        str2 = str4;
                                        j9.append(str2);
                                        j9.append(options.inDensity);
                                        Log.v("Downsampler", j9.toString());
                                    } else {
                                        str2 = str4;
                                        str3 = ", target density: ";
                                    }
                                }
                                c9 = this.f568e.c(i13, i23, z15, z16);
                                if (c9) {
                                    config3 = Bitmap.Config.HARDWARE;
                                    options.inPreferredConfig = config3;
                                    z11 = false;
                                    options.inMutable = false;
                                } else {
                                    z11 = false;
                                }
                                if (!c9) {
                                    if (enumC5062a != EnumC5062a.f41000n) {
                                        try {
                                            z12 = eVar.w().hasAlpha();
                                        } catch (IOException e9) {
                                            if (Log.isLoggable("Downsampler", 3)) {
                                                Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + enumC5062a, e9);
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
                                    i14 = Build.VERSION.SDK_INT;
                                    if (i20 >= 0 || i21 < 0 || !z9) {
                                        int i36 = options.inTargetDensity;
                                        float f13 = !((i36 > 0 || (i15 = options.inDensity) <= 0 || i36 == i15) ? z11 : z13) ? i36 / options.inDensity : 1.0f;
                                        int i37 = options.inSampleSize;
                                        float f14 = i37;
                                        int ceil = (int) Math.ceil(i20 / f14);
                                        int ceil2 = (int) Math.ceil(i21 / f14);
                                        round = Math.round(ceil * f13);
                                        int round3 = Math.round(ceil2 * f13);
                                        if (Log.isLoggable("Downsampler", 2)) {
                                            StringBuilder j10 = Wv.j(round, round3, "Calculated target [", "x", "] for source [");
                                            j10.append(i20);
                                            j10.append("x");
                                            j10.append(i21);
                                            j10.append("], sampleSize: ");
                                            j10.append(i37);
                                            j10.append(", targetDensity: ");
                                            j10.append(options.inTargetDensity);
                                            j10.append(str2);
                                            j10.append(options.inDensity);
                                            j10.append(", density multiplier: ");
                                            j10.append(f13);
                                            Log.v("Downsampler", j10.toString());
                                        }
                                        i23 = round3;
                                    } else {
                                        round = i13;
                                    }
                                    if (round > 0 && i23 > 0) {
                                        if (i14 < 26) {
                                            Bitmap.Config config5 = options.inPreferredConfig;
                                            config2 = Bitmap.Config.HARDWARE;
                                            config = config5 != config2 ? options.outConfig : null;
                                        }
                                        if (config == null) {
                                            config = options.inPreferredConfig;
                                        }
                                        interfaceC5183a2 = interfaceC5183a;
                                        options.inBitmap = interfaceC5183a2.a(round, i23, config);
                                        if (iVar != null) {
                                            if (i14 >= 28) {
                                                if (iVar == u1.i.f41012n) {
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
                                            } else if (i14 >= 26) {
                                                unused = ColorSpace.Named.SRGB;
                                                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                                                options.inPreferredColorSpace = colorSpace;
                                            }
                                        }
                                        c10 = c(eVar, options, oVar, interfaceC5183a2);
                                        oVar.z(c10, interfaceC5183a2);
                                        if (Log.isLoggable("Downsampler", 2)) {
                                            Log.v("Downsampler", "Decoded " + d(c10) + " from [" + i20 + "x" + i21 + "] " + str + " with inBitmap " + d(options.inBitmap) + " for [" + i4 + "x" + i6 + "], sample size: " + options.inSampleSize + str2 + options.inDensity + str3 + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + P1.j.a(j6));
                                        }
                                        if (c10 != null) {
                                            return null;
                                        }
                                        c10.setDensity(this.f565b.densityDpi);
                                        switch (i24) {
                                            case 2:
                                            case 3:
                                            case 4:
                                            case 5:
                                            case 6:
                                            case 7:
                                            case 8:
                                                Matrix matrix = new Matrix();
                                                switch (i24) {
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
                                        interfaceC5183a2.b(bitmap);
                                        return c10;
                                    }
                                    interfaceC5183a2 = interfaceC5183a;
                                    if (iVar != null) {
                                    }
                                    c10 = c(eVar, options, oVar, interfaceC5183a2);
                                    oVar.z(c10, interfaceC5183a2);
                                    if (Log.isLoggable("Downsampler", 2)) {
                                    }
                                    if (c10 != null) {
                                    }
                                }
                                z13 = true;
                                i14 = Build.VERSION.SDK_INT;
                                if (i20 >= 0) {
                                }
                                int i362 = options.inTargetDensity;
                                if (!((i362 > 0 || (i15 = options.inDensity) <= 0 || i362 == i15) ? z11 : z13)) {
                                }
                                int i372 = options.inSampleSize;
                                float f142 = i372;
                                int ceil3 = (int) Math.ceil(i20 / f142);
                                int ceil22 = (int) Math.ceil(i21 / f142);
                                round = Math.round(ceil3 * f13);
                                int round32 = Math.round(ceil22 * f13);
                                if (Log.isLoggable("Downsampler", 2)) {
                                }
                                i23 = round32;
                                if (round > 0) {
                                    if (i14 < 26) {
                                    }
                                    if (config == null) {
                                    }
                                    interfaceC5183a2 = interfaceC5183a;
                                    options.inBitmap = interfaceC5183a2.a(round, i23, config);
                                    if (iVar != null) {
                                    }
                                    c10 = c(eVar, options, oVar, interfaceC5183a2);
                                    oVar.z(c10, interfaceC5183a2);
                                    if (Log.isLoggable("Downsampler", 2)) {
                                    }
                                    if (c10 != null) {
                                    }
                                }
                                interfaceC5183a2 = interfaceC5183a;
                                if (iVar != null) {
                                }
                                c10 = c(eVar, options, oVar, interfaceC5183a2);
                                oVar.z(c10, interfaceC5183a2);
                                if (Log.isLoggable("Downsampler", 2)) {
                                }
                                if (c10 != null) {
                                }
                            } else {
                                i22++;
                                arrayList = arrayList2;
                                c2964aq = c2964aq2;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                i9 = -1;
                switch (i9) {
                }
                switch (i9) {
                }
                if (i4 == Integer.MIN_VALUE) {
                }
                if (i6 == Integer.MIN_VALUE) {
                }
                ImageHeaderParser$ImageType w32 = eVar.w();
                int i242 = i9;
                boolean z162 = z10;
                if (i20 > 0) {
                }
                str2 = ", density: ";
                interfaceC5183a = interfaceC5183a3;
                str3 = ", target density: ";
                i13 = i12;
                if (Log.isLoggable("Downsampler", 3)) {
                }
                c9 = this.f568e.c(i13, i23, z15, z162);
                if (c9) {
                }
                if (!c9) {
                }
                z13 = true;
                i14 = Build.VERSION.SDK_INT;
                if (i20 >= 0) {
                }
                int i3622 = options.inTargetDensity;
                if (!((i3622 > 0 || (i15 = options.inDensity) <= 0 || i3622 == i15) ? z11 : z13)) {
                }
                int i3722 = options.inSampleSize;
                float f1422 = i3722;
                int ceil32 = (int) Math.ceil(i20 / f1422);
                int ceil222 = (int) Math.ceil(i21 / f1422);
                round = Math.round(ceil32 * f13);
                int round322 = Math.round(ceil222 * f13);
                if (Log.isLoggable("Downsampler", 2)) {
                }
                i23 = round322;
                if (round > 0) {
                }
                interfaceC5183a2 = interfaceC5183a;
                if (iVar != null) {
                }
                c10 = c(eVar, options, oVar, interfaceC5183a2);
                oVar.z(c10, interfaceC5183a2);
                if (Log.isLoggable("Downsampler", 2)) {
                }
                if (c10 != null) {
                }
                break;
            case 3:
                str = str6;
                j6 = elapsedRealtimeNanos;
                z zVar3 = (z) ((com.bumptech.glide.load.data.g) eVar.f5557u).f24211u;
                zVar3.reset();
                i9 = t8.g.i((ArrayList) eVar.f5559w, zVar3, (C2964aq) eVar.f5558v);
                switch (i9) {
                }
                switch (i9) {
                }
                if (i4 == Integer.MIN_VALUE) {
                }
                if (i6 == Integer.MIN_VALUE) {
                }
                ImageHeaderParser$ImageType w322 = eVar.w();
                int i2422 = i9;
                boolean z1622 = z10;
                if (i20 > 0) {
                }
                str2 = ", density: ";
                interfaceC5183a = interfaceC5183a3;
                str3 = ", target density: ";
                i13 = i12;
                if (Log.isLoggable("Downsampler", 3)) {
                }
                c9 = this.f568e.c(i13, i23, z15, z1622);
                if (c9) {
                }
                if (!c9) {
                }
                z13 = true;
                i14 = Build.VERSION.SDK_INT;
                if (i20 >= 0) {
                }
                int i36222 = options.inTargetDensity;
                if (!((i36222 > 0 || (i15 = options.inDensity) <= 0 || i36222 == i15) ? z11 : z13)) {
                }
                int i37222 = options.inSampleSize;
                float f14222 = i37222;
                int ceil322 = (int) Math.ceil(i20 / f14222);
                int ceil2222 = (int) Math.ceil(i21 / f14222);
                round = Math.round(ceil322 * f13);
                int round3222 = Math.round(ceil2222 * f13);
                if (Log.isLoggable("Downsampler", 2)) {
                }
                i23 = round3222;
                if (round > 0) {
                }
                interfaceC5183a2 = interfaceC5183a;
                if (iVar != null) {
                }
                c10 = c(eVar, options, oVar, interfaceC5183a2);
                oVar.z(c10, interfaceC5183a2);
                if (Log.isLoggable("Downsampler", 2)) {
                }
                if (c10 != null) {
                }
                break;
            default:
                com.bumptech.glide.load.data.g gVar = (com.bumptech.glide.load.data.g) eVar.f5559w;
                C2964aq c2964aq3 = (C2964aq) eVar.f5557u;
                j6 = elapsedRealtimeNanos;
                ArrayList arrayList3 = (ArrayList) eVar.f5558v;
                int size2 = arrayList3.size();
                str = str6;
                int i38 = 0;
                while (i38 < size2) {
                    int i39 = i38;
                    InterfaceC5065d interfaceC5065d = (InterfaceC5065d) arrayList3.get(i38);
                    ArrayList arrayList4 = arrayList3;
                    try {
                        i18 = size2;
                        zVar2 = new z(new FileInputStream(gVar.e().getFileDescriptor()), c2964aq3);
                    } catch (Throwable th2) {
                        th = th2;
                        zVar = null;
                    }
                    try {
                        int b11 = interfaceC5065d.b(zVar2, c2964aq3);
                        zVar2.b();
                        gVar.e();
                        if (b11 != -1) {
                            i9 = b11;
                            switch (i9) {
                            }
                            switch (i9) {
                            }
                            if (i4 == Integer.MIN_VALUE) {
                            }
                            if (i6 == Integer.MIN_VALUE) {
                            }
                            ImageHeaderParser$ImageType w3222 = eVar.w();
                            int i24222 = i9;
                            boolean z16222 = z10;
                            if (i20 > 0) {
                            }
                            str2 = ", density: ";
                            interfaceC5183a = interfaceC5183a3;
                            str3 = ", target density: ";
                            i13 = i12;
                            if (Log.isLoggable("Downsampler", 3)) {
                            }
                            c9 = this.f568e.c(i13, i23, z15, z16222);
                            if (c9) {
                            }
                            if (!c9) {
                            }
                            z13 = true;
                            i14 = Build.VERSION.SDK_INT;
                            if (i20 >= 0) {
                            }
                            int i362222 = options.inTargetDensity;
                            if (!((i362222 > 0 || (i15 = options.inDensity) <= 0 || i362222 == i15) ? z11 : z13)) {
                            }
                            int i372222 = options.inSampleSize;
                            float f142222 = i372222;
                            int ceil3222 = (int) Math.ceil(i20 / f142222);
                            int ceil22222 = (int) Math.ceil(i21 / f142222);
                            round = Math.round(ceil3222 * f13);
                            int round32222 = Math.round(ceil22222 * f13);
                            if (Log.isLoggable("Downsampler", 2)) {
                            }
                            i23 = round32222;
                            if (round > 0) {
                            }
                            interfaceC5183a2 = interfaceC5183a;
                            if (iVar != null) {
                            }
                            c10 = c(eVar, options, oVar, interfaceC5183a2);
                            oVar.z(c10, interfaceC5183a2);
                            if (Log.isLoggable("Downsampler", 2)) {
                            }
                            if (c10 != null) {
                            }
                        } else {
                            i38 = i39 + 1;
                            arrayList3 = arrayList4;
                            size2 = i18;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        zVar = zVar2;
                        if (zVar != null) {
                            zVar.b();
                        }
                        gVar.e();
                        throw th;
                    }
                }
                i9 = -1;
                switch (i9) {
                }
                switch (i9) {
                }
                if (i4 == Integer.MIN_VALUE) {
                }
                if (i6 == Integer.MIN_VALUE) {
                }
                ImageHeaderParser$ImageType w32222 = eVar.w();
                int i242222 = i9;
                boolean z162222 = z10;
                if (i20 > 0) {
                }
                str2 = ", density: ";
                interfaceC5183a = interfaceC5183a3;
                str3 = ", target density: ";
                i13 = i12;
                if (Log.isLoggable("Downsampler", 3)) {
                }
                c9 = this.f568e.c(i13, i23, z15, z162222);
                if (c9) {
                }
                if (!c9) {
                }
                z13 = true;
                i14 = Build.VERSION.SDK_INT;
                if (i20 >= 0) {
                }
                int i3622222 = options.inTargetDensity;
                if (!((i3622222 > 0 || (i15 = options.inDensity) <= 0 || i3622222 == i15) ? z11 : z13)) {
                }
                int i3722222 = options.inSampleSize;
                float f1422222 = i3722222;
                int ceil32222 = (int) Math.ceil(i20 / f1422222);
                int ceil222222 = (int) Math.ceil(i21 / f1422222);
                round = Math.round(ceil32222 * f13);
                int round322222 = Math.round(ceil222222 * f13);
                if (Log.isLoggable("Downsampler", 2)) {
                }
                i23 = round322222;
                if (round > 0) {
                }
                interfaceC5183a2 = interfaceC5183a;
                if (iVar != null) {
                }
                c10 = c(eVar, options, oVar, interfaceC5183a2);
                oVar.z(c10, interfaceC5183a2);
                if (Log.isLoggable("Downsampler", 2)) {
                }
                if (c10 != null) {
                }
                break;
        }
    }
}
