package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
public final class zla {
    public static final cvj f = cvj.a(vf7.c, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");
    public static final cvj g = new cvj("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, cvj.e);
    public static final cvj h;
    public static final cvj i;
    public static final fs7 j;
    public static final ArrayDeque k;
    public final r33 a;
    public final DisplayMetrics b;
    public final z98 c;
    public final ArrayList d;
    public final osd e = osd.a();

    static {
        wla wlaVar = wla.b;
        Boolean bool = Boolean.FALSE;
        h = cvj.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        i = cvj.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        j = new fs7(21);
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = xut.a;
        k = new ArrayDeque(0);
    }

    public zla(ArrayList arrayList, DisplayMetrics displayMetrics, r33 r33Var, z98 z98Var) {
        this.d = arrayList;
        w1g.s(displayMetrics, "Argument must not be null");
        this.b = displayMetrics;
        w1g.s(r33Var, "Argument must not be null");
        this.a = r33Var;
        w1g.s(z98Var, "Argument must not be null");
        this.c = z98Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        throw r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap c(ice iceVar, BitmapFactory.Options options, yla ylaVar, r33 r33Var) {
        if (!options.inJustDecodeBounds) {
            ylaVar.c();
            iceVar.r();
        }
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        String str = options.outMimeType;
        Lock lock = i7t.b;
        lock.lock();
        try {
            try {
                Bitmap o = iceVar.o(options);
                lock.unlock();
                return o;
            } catch (IllegalArgumentException e) {
                StringBuilder l = dfi.l("Exception decoding bitmap, outWidth: ", i2, i3, ", outHeight: ", ", outMimeType: ");
                l.append(str);
                l.append(", inBitmap: ");
                l.append(d(options.inBitmap));
                IOException iOException = new IOException(l.toString(), e);
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", iOException);
                }
                Bitmap bitmap = options.inBitmap;
                if (bitmap == null) {
                    throw iOException;
                }
                try {
                    r33Var.o(bitmap);
                    options.inBitmap = null;
                    Bitmap c = c(iceVar, options, ylaVar, r33Var);
                    i7t.b.unlock();
                    return c;
                } catch (IOException unused) {
                    throw iOException;
                }
            }
        } catch (Throwable th) {
            i7t.b.unlock();
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

    public final s33 a(ice iceVar, int i2, int i3, pwj pwjVar, yla ylaVar) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        byte[] bArr = (byte[]) this.c.f(SQLiteDatabase.OPEN_FULLMUTEX, byte[].class);
        synchronized (zla.class) {
            arrayDeque = k;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                e(options);
            }
        }
        options.inTempStorage = bArr;
        vf7 vf7Var = (vf7) pwjVar.c(f);
        qmm qmmVar = (qmm) pwjVar.c(g);
        wla wlaVar = (wla) pwjVar.c(wla.g);
        boolean booleanValue = ((Boolean) pwjVar.c(h)).booleanValue();
        cvj cvjVar = i;
        try {
            s33 b = s33.b(this.a, b(iceVar, options, wlaVar, vf7Var, qmmVar, pwjVar.c(cvjVar) != null && ((Boolean) pwjVar.c(cvjVar)).booleanValue(), i2, i3, booleanValue, ylaVar));
            e(options);
            synchronized (arrayDeque) {
                arrayDeque.offer(options);
            }
            this.c.l(bArr);
            return b;
        } catch (Throwable th) {
            e(options);
            ArrayDeque arrayDeque2 = k;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options);
                this.c.l(bArr);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap b(ice iceVar, BitmapFactory.Options options, wla wlaVar, vf7 vf7Var, qmm qmmVar, boolean z, int i2, int i3, boolean z2, yla ylaVar) {
        int i4;
        boolean z3;
        int i5;
        int i6;
        String str;
        String str2;
        r33 r33Var;
        int i7;
        boolean z4;
        boolean z5;
        int i8;
        r33 r33Var2;
        Bitmap c;
        Bitmap t;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        Bitmap.Config config;
        Bitmap.Config config2;
        Bitmap.Config config3;
        String str3;
        String str4;
        int i9;
        int i10;
        int floor;
        int floor2;
        int i11;
        int i12;
        int i13;
        int i14 = esg.b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        options.inJustDecodeBounds = true;
        r33 r33Var3 = this.a;
        c(iceVar, options, ylaVar, r33Var3);
        options.inJustDecodeBounds = false;
        int[] iArr = {options.outWidth, options.outHeight};
        int i15 = iArr[0];
        int i16 = iArr[1];
        String str5 = options.outMimeType;
        boolean z6 = (i15 == -1 || i16 == -1) ? false : z;
        int y = iceVar.y();
        switch (y) {
            case 3:
            case 4:
                i4 = 180;
                break;
            case 5:
            case 6:
                i4 = 90;
                break;
            case 7:
            case 8:
                i4 = 270;
                break;
            default:
                i4 = 0;
                break;
        }
        switch (y) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                z3 = true;
                break;
            default:
                z3 = false;
                break;
        }
        if (i2 == Integer.MIN_VALUE) {
            if (i4 != 90) {
                i5 = 270;
                if (i4 != 270) {
                    i6 = i15;
                }
            } else {
                i5 = 270;
            }
            i6 = i16;
        } else {
            i5 = 270;
            i6 = i2;
        }
        int i17 = i3 == Integer.MIN_VALUE ? (i4 == 90 || i4 == i5) ? i15 : i16 : i3;
        ImageHeaderParser$ImageType I = iceVar.I();
        boolean z7 = z6;
        if (i15 <= 0 || i16 <= 0) {
            str = ", density: ";
            str2 = ", target density: ";
            r33Var = r33Var3;
            i7 = i6;
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Unable to determine dimensions for: " + I + " with target [" + i7 + "x" + i17 + "]");
            }
        } else {
            if (i4 == 90 || i4 == 270) {
                str3 = ", density: ";
                str4 = "]";
                i9 = i16;
                i10 = i15;
            } else {
                str3 = ", density: ";
                str4 = "]";
                i10 = i16;
                i9 = i15;
            }
            i7 = i6;
            float b = wlaVar.b(i9, i10, i7, i17);
            if (b <= 0.0f) {
                StringBuilder sb = new StringBuilder("Cannot scale with factor: ");
                sb.append(b);
                sb.append(" from: ");
                sb.append(wlaVar);
                sb.append(", source: [");
                hrg.w(i15, i16, "x", "], target: [", sb);
                sb.append(i7);
                sb.append("x");
                sb.append(i17);
                sb.append(str4);
                throw new IllegalArgumentException(sb.toString());
            }
            int a = wlaVar.a(i9, i10, i7, i17);
            if (a == 0) {
                xq0.x("Cannot round with null rounding");
                return null;
            }
            int i18 = i4;
            float f2 = i9;
            int i19 = i9;
            float f3 = i10;
            int i20 = i10;
            int i21 = (int) ((b * f3) + 0.5d);
            int i22 = i19 / ((int) ((b * f2) + 0.5d));
            int i23 = i20 / i21;
            int max = Math.max(1, Integer.highestOneBit(a == 1 ? Math.max(i22, i23) : Math.min(i22, i23)));
            if (a == 1 && max < 1.0f / b) {
                max <<= 1;
            }
            options.inSampleSize = max;
            if (I == ImageHeaderParser$ImageType.JPEG) {
                float min = f3 / Math.min(max, 8);
                floor = (int) Math.ceil(f2 / r7);
                floor2 = (int) Math.ceil(min);
                int i24 = max / 8;
                if (i24 > 0) {
                    floor /= i24;
                    floor2 /= i24;
                }
            } else if (I == ImageHeaderParser$ImageType.PNG || I == ImageHeaderParser$ImageType.PNG_A) {
                float f4 = f3 / max;
                floor = (int) Math.floor(f2 / r7);
                floor2 = (int) Math.floor(f4);
            } else {
                if (I.isWebp()) {
                    float f5 = max;
                    i12 = Math.round(f2 / f5);
                    i11 = Math.round(f3 / f5);
                } else if (i19 % max == 0 && i20 % max == 0) {
                    i12 = i19 / max;
                    i11 = i20 / max;
                } else {
                    options.inJustDecodeBounds = true;
                    c(iceVar, options, ylaVar, r33Var3);
                    options.inJustDecodeBounds = false;
                    int[] iArr2 = {options.outWidth, options.outHeight};
                    int i25 = iArr2[0];
                    i11 = iArr2[1];
                    i12 = i25;
                }
                r33Var = r33Var3;
                double b2 = wlaVar.b(i12, i11, i7, i17);
                int round = (int) Math.round((b2 > 1.0d ? b2 : 1.0d / b2) * 2.147483647E9d);
                int i26 = (int) ((round * b2) + 0.5d);
                float f6 = i26 / round;
                int i27 = max;
                int i28 = i11;
                options.inTargetDensity = (int) (((b2 / f6) * i26) + 0.5d);
                int round2 = (int) Math.round((b2 > 1.0d ? b2 : 1.0d / b2) * 2.147483647E9d);
                options.inDensity = round2;
                i13 = options.inTargetDensity;
                if (i13 > 0 || round2 <= 0 || i13 == round2) {
                    options.inTargetDensity = 0;
                    options.inDensity = 0;
                } else {
                    options.inScaled = true;
                }
                if (Log.isLoggable("Downsampler", 2)) {
                    str = str3;
                    str2 = ", target density: ";
                } else {
                    StringBuilder l = dfi.l("Calculate scaling, source: [", i15, i16, "x", "], degreesToRotate: ");
                    hrg.w(i18, i7, ", target: [", "x", l);
                    hrg.w(i17, i12, "], power of two scaled: [", "x", l);
                    l.append(i28);
                    l.append("], exact scale factor: ");
                    l.append(b);
                    l.append(", power of 2 sample size: ");
                    l.append(i27);
                    l.append(", adjusted scale factor: ");
                    l.append(b2);
                    str2 = ", target density: ";
                    l.append(str2);
                    l.append(options.inTargetDensity);
                    str = str3;
                    l.append(str);
                    l.append(options.inDensity);
                    Log.v("Downsampler", l.toString());
                }
            }
            int i29 = floor2;
            i12 = floor;
            i11 = i29;
            r33Var = r33Var3;
            double b22 = wlaVar.b(i12, i11, i7, i17);
            int round3 = (int) Math.round((b22 > 1.0d ? b22 : 1.0d / b22) * 2.147483647E9d);
            int i262 = (int) ((round3 * b22) + 0.5d);
            float f62 = i262 / round3;
            int i272 = max;
            int i282 = i11;
            options.inTargetDensity = (int) (((b22 / f62) * i262) + 0.5d);
            int round22 = (int) Math.round((b22 > 1.0d ? b22 : 1.0d / b22) * 2.147483647E9d);
            options.inDensity = round22;
            i13 = options.inTargetDensity;
            if (i13 > 0) {
            }
            options.inTargetDensity = 0;
            options.inDensity = 0;
            if (Log.isLoggable("Downsampler", 2)) {
            }
        }
        boolean b3 = this.e.b(i7, i17, z7, z3);
        if (b3) {
            config3 = Bitmap.Config.HARDWARE;
            options.inPreferredConfig = config3;
            options.inMutable = false;
        }
        if (!b3) {
            if (vf7Var != vf7.a) {
                try {
                    z4 = iceVar.I().hasAlpha();
                } catch (IOException e) {
                    if (Log.isLoggable("Downsampler", 3)) {
                        Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + vf7Var, e);
                    }
                    z4 = false;
                }
                Bitmap.Config config4 = z4 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                options.inPreferredConfig = config4;
                if (config4 == Bitmap.Config.RGB_565) {
                    z5 = true;
                    options.inDither = true;
                }
            } else {
                z5 = true;
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            }
            if (i15 >= 0 || i16 < 0 || !z2) {
                int i30 = options.inTargetDensity;
                float f7 = !((i30 > 0 || (i8 = options.inDensity) <= 0 || i30 == i8) ? false : z5) ? i30 / options.inDensity : 1.0f;
                int i31 = options.inSampleSize;
                float f8 = i31;
                int ceil = (int) Math.ceil(i15 / f8);
                int ceil2 = (int) Math.ceil(i16 / f8);
                int round4 = Math.round(ceil * f7);
                int round5 = Math.round(ceil2 * f7);
                if (Log.isLoggable("Downsampler", 2)) {
                    StringBuilder l2 = dfi.l("Calculated target [", round4, round5, "x", "] for source [");
                    hrg.w(i15, i16, "x", "], sampleSize: ", l2);
                    l2.append(i31);
                    l2.append(", targetDensity: ");
                    l2.append(options.inTargetDensity);
                    l2.append(str);
                    l2.append(options.inDensity);
                    l2.append(", density multiplier: ");
                    l2.append(f7);
                    Log.v("Downsampler", l2.toString());
                }
                i7 = round4;
                i17 = round5;
            }
            if (i7 > 0 && i17 > 0) {
                if (Build.VERSION.SDK_INT < 26) {
                    Bitmap.Config config5 = options.inPreferredConfig;
                    config2 = Bitmap.Config.HARDWARE;
                    if (config5 != config2) {
                        config = options.outConfig;
                    }
                } else {
                    config = null;
                }
                if (config == null) {
                    config = options.inPreferredConfig;
                }
                r33Var2 = r33Var;
                options.inBitmap = r33Var2.n(i7, i17, config);
                if (qmmVar != null) {
                    int i32 = Build.VERSION.SDK_INT;
                    if (i32 >= 28) {
                        options.inPreferredColorSpace = ColorSpace.get(qmmVar == qmm.a && (colorSpace = options.outColorSpace) != null && colorSpace.isWideGamut() ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
                    } else if (i32 >= 26) {
                        named = ColorSpace.Named.SRGB;
                        options.inPreferredColorSpace = ColorSpace.get(named);
                    }
                }
                c = c(iceVar, options, ylaVar, r33Var2);
                ylaVar.h(r33Var2, c);
                if (Log.isLoggable("Downsampler", 2)) {
                    Log.v("Downsampler", "Decoded " + d(c) + " from [" + i15 + "x" + i16 + "] " + str5 + " with inBitmap " + d(options.inBitmap) + " for [" + i2 + "x" + i3 + "], sample size: " + options.inSampleSize + str + options.inDensity + str2 + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + esg.a(elapsedRealtimeNanos));
                }
                if (c != null) {
                    return null;
                }
                c.setDensity(this.b.densityDpi);
                switch (y) {
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        Matrix matrix = new Matrix();
                        switch (y) {
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
                        RectF rectF = new RectF(0.0f, 0.0f, c.getWidth(), c.getHeight());
                        matrix.mapRect(rectF);
                        t = r33Var2.t(Math.round(rectF.width()), Math.round(rectF.height()), c.getConfig() != null ? c.getConfig() : Bitmap.Config.ARGB_8888);
                        matrix.postTranslate(-rectF.left, -rectF.top);
                        t.setHasAlpha(c.hasAlpha());
                        i7t.a(c, t, matrix);
                        break;
                    default:
                        t = c;
                        break;
                }
                if (!c.equals(t)) {
                    r33Var2.o(c);
                }
                return t;
            }
            r33Var2 = r33Var;
            if (qmmVar != null) {
            }
            c = c(iceVar, options, ylaVar, r33Var2);
            ylaVar.h(r33Var2, c);
            if (Log.isLoggable("Downsampler", 2)) {
            }
            if (c != null) {
            }
        }
        z5 = true;
        if (i15 >= 0) {
        }
        int i302 = options.inTargetDensity;
        if (!((i302 > 0 || (i8 = options.inDensity) <= 0 || i302 == i8) ? false : z5)) {
        }
        int i312 = options.inSampleSize;
        float f82 = i312;
        int ceil3 = (int) Math.ceil(i15 / f82);
        int ceil22 = (int) Math.ceil(i16 / f82);
        int round42 = Math.round(ceil3 * f7);
        int round52 = Math.round(ceil22 * f7);
        if (Log.isLoggable("Downsampler", 2)) {
        }
        i7 = round42;
        i17 = round52;
        if (i7 > 0) {
            if (Build.VERSION.SDK_INT < 26) {
            }
            if (config == null) {
            }
            r33Var2 = r33Var;
            options.inBitmap = r33Var2.n(i7, i17, config);
            if (qmmVar != null) {
            }
            c = c(iceVar, options, ylaVar, r33Var2);
            ylaVar.h(r33Var2, c);
            if (Log.isLoggable("Downsampler", 2)) {
            }
            if (c != null) {
            }
        }
        r33Var2 = r33Var;
        if (qmmVar != null) {
        }
        c = c(iceVar, options, ylaVar, r33Var2);
        ylaVar.h(r33Var2, c);
        if (Log.isLoggable("Downsampler", 2)) {
        }
        if (c != null) {
        }
    }
}
