package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.extractor.text.CueEncoder;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.data.InputStreamRewinder;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import com.bumptech.glide.util.ByteBufferUtil;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Util;
import com.caverock.androidsvg.SVG;
import com.plaid.internal.EnumC0170g;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.locks.Lock;

/* loaded from: classes4.dex */
public final class Downsampler {
    public static final Option ALLOW_HARDWARE_CONFIG;
    public static final CueEncoder EMPTY_CALLBACKS;
    public static final Option FIX_BITMAP_SIZE_TO_REQUESTED_DIMENSIONS;
    public static final ArrayDeque OPTIONS_QUEUE;
    public final BitmapPool bitmapPool;
    public final LruArrayPool byteArrayPool;
    public final DisplayMetrics displayMetrics;
    public final HardwareConfigState hardwareConfigState = HardwareConfigState.getInstance();
    public final ArrayList parsers;
    public static final Option DECODE_FORMAT = Option.memory(DecodeFormat.DEFAULT, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");
    public static final Option PREFERRED_COLOR_SPACE = new Option("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, Option.EMPTY_UPDATER);

    public interface DecodeCallbacks {
        void onDecodeComplete(Bitmap bitmap, BitmapPool bitmapPool);

        void onObtainBounds();
    }

    static {
        DownsampleStrategy$None downsampleStrategy$None = DownsampleStrategy$None.FIT_CENTER;
        Boolean bool = Boolean.FALSE;
        FIX_BITMAP_SIZE_TO_REQUESTED_DIMENSIONS = Option.memory(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        ALLOW_HARDWARE_CONFIG = Option.memory(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        EMPTY_CALLBACKS = new CueEncoder(19);
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        OPTIONS_QUEUE = new ArrayDeque(0);
    }

    public Downsampler(ArrayList arrayList, DisplayMetrics displayMetrics, BitmapPool bitmapPool, LruArrayPool lruArrayPool) {
        this.parsers = arrayList;
        Util.checkNotNull(displayMetrics, "Argument must not be null");
        this.displayMetrics = displayMetrics;
        Util.checkNotNull(bitmapPool, "Argument must not be null");
        this.bitmapPool = bitmapPool;
        Util.checkNotNull(lruArrayPool, "Argument must not be null");
        this.byteArrayPool = lruArrayPool;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        throw r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap decodeStream(SVG svg, BitmapFactory.Options options, DecodeCallbacks decodeCallbacks, BitmapPool bitmapPool) {
        if (!options.inJustDecodeBounds) {
            decodeCallbacks.onObtainBounds();
            switch (svg.$r8$classId) {
                case 13:
                    RecyclableBufferedInputStream recyclableBufferedInputStream = (RecyclableBufferedInputStream) ((InputStreamRewinder) svg.rootElement).bufferedStream;
                    synchronized (recyclableBufferedInputStream) {
                        recyclableBufferedInputStream.marklimit = recyclableBufferedInputStream.buf.length;
                        break;
                    }
            }
        }
        int i = options.outWidth;
        int i2 = options.outHeight;
        String str = options.outMimeType;
        Lock lock = TransformationUtils.BITMAP_DRAWABLE_LOCK;
        lock.lock();
        try {
            try {
                Bitmap decodeBitmap = svg.decodeBitmap(options);
                lock.unlock();
                return decodeBitmap;
            } catch (IllegalArgumentException e) {
                StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(i, i2, "Exception decoding bitmap, outWidth: ", ", outHeight: ", ", outMimeType: ");
                m107m.append(str);
                m107m.append(", inBitmap: ");
                m107m.append(getBitmapString(options.inBitmap));
                IOException iOException = new IOException(m107m.toString(), e);
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", iOException);
                }
                Bitmap bitmap = options.inBitmap;
                if (bitmap == null) {
                    throw iOException;
                }
                try {
                    bitmapPool.put(bitmap);
                    options.inBitmap = null;
                    Bitmap decodeStream = decodeStream(svg, options, decodeCallbacks, bitmapPool);
                    TransformationUtils.BITMAP_DRAWABLE_LOCK.unlock();
                    return decodeStream;
                } catch (IOException unused) {
                    throw iOException;
                }
            }
        } catch (Throwable th) {
            TransformationUtils.BITMAP_DRAWABLE_LOCK.unlock();
            throw th;
        }
    }

    public static String getBitmapString(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static void resetOptions(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final BitmapResource decode(SVG svg, int i, int i2, Options options, DecodeCallbacks decodeCallbacks) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options2;
        byte[] bArr = (byte[]) this.byteArrayPool.get(byte[].class, 65536);
        synchronized (Downsampler.class) {
            arrayDeque = OPTIONS_QUEUE;
            synchronized (arrayDeque) {
                options2 = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options2 == null) {
                options2 = new BitmapFactory.Options();
                resetOptions(options2);
            }
        }
        options2.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) options.get(DECODE_FORMAT);
        PreferredColorSpace preferredColorSpace = (PreferredColorSpace) options.get(PREFERRED_COLOR_SPACE);
        DownsampleStrategy$None downsampleStrategy$None = (DownsampleStrategy$None) options.get(DownsampleStrategy$None.OPTION);
        boolean booleanValue = ((Boolean) options.get(FIX_BITMAP_SIZE_TO_REQUESTED_DIMENSIONS)).booleanValue();
        Option option = ALLOW_HARDWARE_CONFIG;
        try {
            BitmapResource obtain = BitmapResource.obtain(decodeFromWrappedStreams(svg, options2, downsampleStrategy$None, decodeFormat, preferredColorSpace, options.get(option) != null && ((Boolean) options.get(option)).booleanValue(), i, i2, booleanValue, decodeCallbacks), this.bitmapPool);
            resetOptions(options2);
            synchronized (arrayDeque) {
                arrayDeque.offer(options2);
            }
            this.byteArrayPool.put(bArr);
            return obtain;
        } catch (Throwable th) {
            resetOptions(options2);
            ArrayDeque arrayDeque2 = OPTIONS_QUEUE;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options2);
                this.byteArrayPool.put(bArr);
                throw th;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x041c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0158 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0293 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x036c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap decodeFromWrappedStreams(SVG svg, BitmapFactory.Options options, DownsampleStrategy$None downsampleStrategy$None, DecodeFormat decodeFormat, PreferredColorSpace preferredColorSpace, boolean z, int i, int i2, boolean z2, DecodeCallbacks decodeCallbacks) {
        long j;
        String str;
        int orientation;
        int i3;
        int i4;
        boolean z3;
        int i5;
        int i6;
        int i7;
        String str2;
        BitmapPool bitmapPool;
        String str3;
        int i8;
        boolean isHardwareConfigAllowed;
        boolean z4;
        int i9;
        BitmapPool bitmapPool2;
        Bitmap decodeStream;
        Bitmap bitmap;
        ColorSpace colorSpace;
        Bitmap.Config config;
        boolean z5;
        String str4;
        String str5;
        int i10;
        int i11;
        int floor;
        int floor2;
        int i12;
        int i13;
        RecyclableBufferedInputStream recyclableBufferedInputStream;
        List list;
        int i14 = LogTime.$r8$clinit;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        options.inJustDecodeBounds = true;
        BitmapPool bitmapPool3 = this.bitmapPool;
        decodeStream(svg, options, decodeCallbacks, bitmapPool3);
        options.inJustDecodeBounds = false;
        int[] iArr = {options.outWidth, options.outHeight};
        int i15 = iArr[0];
        int i16 = iArr[1];
        String str6 = options.outMimeType;
        boolean z6 = (i15 == -1 || i16 == -1) ? false : z;
        RecyclableBufferedInputStream recyclableBufferedInputStream2 = null;
        switch (svg.$r8$classId) {
            case 12:
                j = elapsedRealtimeNanos;
                str = str6;
                List list2 = (List) svg.cssRules;
                ByteBuffer rewind = ByteBufferUtil.rewind((ByteBuffer) svg.rootElement);
                LruArrayPool lruArrayPool = (LruArrayPool) svg.idToElementMap;
                if (rewind != null) {
                    int size = list2.size();
                    int i17 = 0;
                    while (i17 < size) {
                        List list3 = list2;
                        try {
                            orientation = ((ImageHeaderParser) list2.get(i17)).getOrientation(rewind, lruArrayPool);
                            LruArrayPool lruArrayPool2 = lruArrayPool;
                            if (orientation != -1) {
                                i3 = orientation;
                                switch (i3) {
                                    case 3:
                                    case 4:
                                        i4 = EnumC0170g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE;
                                        break;
                                    case 5:
                                    case 6:
                                        i4 = 90;
                                        break;
                                    case 7:
                                    case 8:
                                        i4 = EnumC0170g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE;
                                        break;
                                    default:
                                        i4 = 0;
                                        break;
                                }
                                switch (i3) {
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
                                if (i == Integer.MIN_VALUE) {
                                    if (i4 != 90) {
                                        i5 = EnumC0170g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE;
                                        if (i4 != 270) {
                                            i6 = i15;
                                        }
                                    } else {
                                        i5 = EnumC0170g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE;
                                    }
                                    i6 = i16;
                                } else {
                                    i5 = EnumC0170g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE;
                                    i6 = i;
                                }
                                i7 = i2 == Integer.MIN_VALUE ? (i4 == 90 || i4 == i5) ? i15 : i16 : i2;
                                ImageHeaderParser.ImageType imageType = svg.getImageType();
                                int i18 = i3;
                                boolean z7 = z3;
                                if (i15 > 0 || i16 <= 0) {
                                    str2 = ", density: ";
                                    bitmapPool = bitmapPool3;
                                    str3 = ", target density: ";
                                    i8 = i6;
                                    if (Log.isLoggable("Downsampler", 3)) {
                                        Log.d("Downsampler", "Unable to determine dimensions for: " + imageType + " with target [" + i8 + "x" + i7 + "]");
                                    }
                                } else {
                                    if (i4 == 90 || i4 == 270) {
                                        str4 = ", density: ";
                                        str5 = "]";
                                        i10 = i16;
                                        i11 = i15;
                                    } else {
                                        str4 = ", density: ";
                                        str5 = "]";
                                        i11 = i16;
                                        i10 = i15;
                                    }
                                    i8 = i6;
                                    float scaleFactor = downsampleStrategy$None.getScaleFactor(i10, i11, i8, i7);
                                    if (scaleFactor <= RecyclerView.DECELERATION_RATE) {
                                        StringBuilder sb = new StringBuilder("Cannot scale with factor: ");
                                        sb.append(scaleFactor);
                                        sb.append(" from: ");
                                        sb.append(downsampleStrategy$None);
                                        sb.append(", source: [");
                                        Recorder$$ExternalSyntheticOutline1.m105m(i15, i16, "x", "], target: [", sb);
                                        a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline1.m(i8, i7, "x", str5, sb));
                                        return null;
                                    }
                                    int sampleSizeRounding = downsampleStrategy$None.getSampleSizeRounding(i10, i11, i8, i7);
                                    if (sampleSizeRounding == 0) {
                                        a$$ExternalSyntheticBUOutline0.m$3("Cannot round with null rounding");
                                        return null;
                                    }
                                    int i19 = i4;
                                    float f = i10;
                                    int i20 = i10;
                                    float f2 = i11;
                                    int i21 = i11;
                                    int i22 = (int) ((scaleFactor * f2) + 0.5d);
                                    int i23 = i20 / ((int) ((scaleFactor * f) + 0.5d));
                                    int i24 = i21 / i22;
                                    int max = Math.max(1, Integer.highestOneBit(sampleSizeRounding == 1 ? Math.max(i23, i24) : Math.min(i23, i24)));
                                    if (sampleSizeRounding == 1 && max < 1.0f / scaleFactor) {
                                        max <<= 1;
                                    }
                                    options.inSampleSize = max;
                                    if (imageType == ImageHeaderParser.ImageType.JPEG) {
                                        float min = Math.min(max, 8);
                                        floor = (int) Math.ceil(f / min);
                                        floor2 = (int) Math.ceil(f2 / min);
                                        int i25 = max / 8;
                                        if (i25 > 0) {
                                            floor2 /= i25;
                                            i12 = floor / i25;
                                            double scaleFactor2 = downsampleStrategy$None.getScaleFactor(i12, floor2, i8, i7);
                                            int round = (int) Math.round((scaleFactor2 > 1.0d ? scaleFactor2 : 1.0d / scaleFactor2) * 2.147483647E9d);
                                            bitmapPool = bitmapPool3;
                                            int i26 = (int) ((round * scaleFactor2) + 0.5d);
                                            float f3 = i26 / round;
                                            int i27 = max;
                                            options.inTargetDensity = (int) (((scaleFactor2 / f3) * i26) + 0.5d);
                                            int round2 = (int) Math.round((scaleFactor2 > 1.0d ? scaleFactor2 : 1.0d / scaleFactor2) * 2.147483647E9d);
                                            options.inDensity = round2;
                                            i13 = options.inTargetDensity;
                                            if (i13 > 0 || round2 <= 0 || i13 == round2) {
                                                options.inTargetDensity = 0;
                                                options.inDensity = 0;
                                            } else {
                                                options.inScaled = true;
                                            }
                                            if (Log.isLoggable("Downsampler", 2)) {
                                                str2 = str4;
                                                str3 = ", target density: ";
                                            } else {
                                                StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(i15, i16, "Calculate scaling, source: [", "x", "], degreesToRotate: ");
                                                Recorder$$ExternalSyntheticOutline1.m105m(i19, i8, ", target: [", "x", m107m);
                                                Recorder$$ExternalSyntheticOutline1.m105m(i7, i12, "], power of two scaled: [", "x", m107m);
                                                m107m.append(floor2);
                                                m107m.append("], exact scale factor: ");
                                                m107m.append(scaleFactor);
                                                m107m.append(", power of 2 sample size: ");
                                                m107m.append(i27);
                                                m107m.append(", adjusted scale factor: ");
                                                m107m.append(scaleFactor2);
                                                str3 = ", target density: ";
                                                m107m.append(str3);
                                                m107m.append(options.inTargetDensity);
                                                str2 = str4;
                                                m107m.append(str2);
                                                m107m.append(options.inDensity);
                                                Log.v("Downsampler", m107m.toString());
                                            }
                                        }
                                        i12 = floor;
                                        double scaleFactor22 = downsampleStrategy$None.getScaleFactor(i12, floor2, i8, i7);
                                        int round3 = (int) Math.round((scaleFactor22 > 1.0d ? scaleFactor22 : 1.0d / scaleFactor22) * 2.147483647E9d);
                                        bitmapPool = bitmapPool3;
                                        int i262 = (int) ((round3 * scaleFactor22) + 0.5d);
                                        float f32 = i262 / round3;
                                        int i272 = max;
                                        options.inTargetDensity = (int) (((scaleFactor22 / f32) * i262) + 0.5d);
                                        int round22 = (int) Math.round((scaleFactor22 > 1.0d ? scaleFactor22 : 1.0d / scaleFactor22) * 2.147483647E9d);
                                        options.inDensity = round22;
                                        i13 = options.inTargetDensity;
                                        if (i13 > 0) {
                                        }
                                        options.inTargetDensity = 0;
                                        options.inDensity = 0;
                                        if (Log.isLoggable("Downsampler", 2)) {
                                        }
                                    } else {
                                        if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
                                            float f4 = max;
                                            floor = (int) Math.floor(f / f4);
                                            floor2 = (int) Math.floor(f2 / f4);
                                        } else {
                                            if (imageType.isWebp()) {
                                                float f5 = max;
                                                i12 = Math.round(f / f5);
                                                floor2 = Math.round(f2 / f5);
                                            } else if (i20 % max == 0 && i21 % max == 0) {
                                                i12 = i20 / max;
                                                floor2 = i21 / max;
                                            } else {
                                                options.inJustDecodeBounds = true;
                                                decodeStream(svg, options, decodeCallbacks, bitmapPool3);
                                                options.inJustDecodeBounds = false;
                                                int[] iArr2 = {options.outWidth, options.outHeight};
                                                floor = iArr2[0];
                                                floor2 = iArr2[1];
                                            }
                                            double scaleFactor222 = downsampleStrategy$None.getScaleFactor(i12, floor2, i8, i7);
                                            int round32 = (int) Math.round((scaleFactor222 > 1.0d ? scaleFactor222 : 1.0d / scaleFactor222) * 2.147483647E9d);
                                            bitmapPool = bitmapPool3;
                                            int i2622 = (int) ((round32 * scaleFactor222) + 0.5d);
                                            float f322 = i2622 / round32;
                                            int i2722 = max;
                                            options.inTargetDensity = (int) (((scaleFactor222 / f322) * i2622) + 0.5d);
                                            int round222 = (int) Math.round((scaleFactor222 > 1.0d ? scaleFactor222 : 1.0d / scaleFactor222) * 2.147483647E9d);
                                            options.inDensity = round222;
                                            i13 = options.inTargetDensity;
                                            if (i13 > 0) {
                                            }
                                            options.inTargetDensity = 0;
                                            options.inDensity = 0;
                                            if (Log.isLoggable("Downsampler", 2)) {
                                            }
                                        }
                                        i12 = floor;
                                        double scaleFactor2222 = downsampleStrategy$None.getScaleFactor(i12, floor2, i8, i7);
                                        int round322 = (int) Math.round((scaleFactor2222 > 1.0d ? scaleFactor2222 : 1.0d / scaleFactor2222) * 2.147483647E9d);
                                        bitmapPool = bitmapPool3;
                                        int i26222 = (int) ((round322 * scaleFactor2222) + 0.5d);
                                        float f3222 = i26222 / round322;
                                        int i27222 = max;
                                        options.inTargetDensity = (int) (((scaleFactor2222 / f3222) * i26222) + 0.5d);
                                        int round2222 = (int) Math.round((scaleFactor2222 > 1.0d ? scaleFactor2222 : 1.0d / scaleFactor2222) * 2.147483647E9d);
                                        options.inDensity = round2222;
                                        i13 = options.inTargetDensity;
                                        if (i13 > 0) {
                                        }
                                        options.inTargetDensity = 0;
                                        options.inDensity = 0;
                                        if (Log.isLoggable("Downsampler", 2)) {
                                        }
                                    }
                                }
                                isHardwareConfigAllowed = this.hardwareConfigState.isHardwareConfigAllowed(i8, i7, z6, z7);
                                if (isHardwareConfigAllowed) {
                                    options.inPreferredConfig = Bitmap.Config.HARDWARE;
                                    z4 = false;
                                    options.inMutable = false;
                                } else {
                                    z4 = false;
                                }
                                if (!isHardwareConfigAllowed) {
                                    if (decodeFormat != DecodeFormat.PREFER_ARGB_8888) {
                                        try {
                                            z5 = svg.getImageType().hasAlpha();
                                        } catch (IOException e) {
                                            if (Log.isLoggable("Downsampler", 3)) {
                                                Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + decodeFormat, e);
                                            }
                                            z5 = z4;
                                        }
                                        Bitmap.Config config2 = z5 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                                        options.inPreferredConfig = config2;
                                        if (config2 == Bitmap.Config.RGB_565) {
                                            options.inDither = true;
                                        }
                                    } else {
                                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                    }
                                }
                                if (i15 >= 0 || i16 < 0 || !z2) {
                                    int i28 = options.inTargetDensity;
                                    float f6 = (i28 > 0 || (i9 = options.inDensity) <= 0 || i28 == i9) ? 1.0f : i28 / i9;
                                    int i29 = options.inSampleSize;
                                    float f7 = i29;
                                    int ceil = (int) Math.ceil(i15 / f7);
                                    int ceil2 = (int) Math.ceil(i16 / f7);
                                    int round4 = Math.round(ceil * f6);
                                    int round5 = Math.round(ceil2 * f6);
                                    if (Log.isLoggable("Downsampler", 2)) {
                                        StringBuilder m107m2 = Recorder$$ExternalSyntheticOutline2.m107m(round4, round5, "Calculated target [", "x", "] for source [");
                                        Recorder$$ExternalSyntheticOutline1.m105m(i15, i16, "x", "], sampleSize: ", m107m2);
                                        m107m2.append(i29);
                                        m107m2.append(", targetDensity: ");
                                        m107m2.append(options.inTargetDensity);
                                        m107m2.append(str2);
                                        m107m2.append(options.inDensity);
                                        m107m2.append(", density multiplier: ");
                                        m107m2.append(f6);
                                        Log.v("Downsampler", m107m2.toString());
                                    }
                                    i8 = round4;
                                    i7 = round5;
                                }
                                if (i8 > 0 || i7 <= 0 || (config = options.inPreferredConfig) == Bitmap.Config.HARDWARE) {
                                    bitmapPool2 = bitmapPool;
                                } else {
                                    Bitmap.Config config3 = options.outConfig;
                                    if (config3 != null) {
                                        config = config3;
                                    }
                                    bitmapPool2 = bitmapPool;
                                    options.inBitmap = bitmapPool2.getDirty(i8, i7, config);
                                }
                                if (preferredColorSpace != null) {
                                    options.inPreferredColorSpace = ColorSpace.get((preferredColorSpace == PreferredColorSpace.DISPLAY_P3 && (colorSpace = options.outColorSpace) != null && colorSpace.isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
                                }
                                decodeStream = decodeStream(svg, options, decodeCallbacks, bitmapPool2);
                                decodeCallbacks.onDecodeComplete(decodeStream, bitmapPool2);
                                if (Log.isLoggable("Downsampler", 2)) {
                                    Log.v("Downsampler", "Decoded " + getBitmapString(decodeStream) + " from [" + i15 + "x" + i16 + "] " + str + " with inBitmap " + getBitmapString(options.inBitmap) + " for [" + i + "x" + i2 + "], sample size: " + options.inSampleSize + str2 + options.inDensity + str3 + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + LogTime.getElapsedMillis(j));
                                }
                                if (decodeStream == null) {
                                    return null;
                                }
                                decodeStream.setDensity(this.displayMetrics.densityDpi);
                                switch (i18) {
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                        Matrix matrix = new Matrix();
                                        switch (i18) {
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
                                        RectF rectF = new RectF(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, decodeStream.getWidth(), decodeStream.getHeight());
                                        matrix.mapRect(rectF);
                                        bitmap = bitmapPool2.get(Math.round(rectF.width()), Math.round(rectF.height()), decodeStream.getConfig() != null ? decodeStream.getConfig() : Bitmap.Config.ARGB_8888);
                                        matrix.postTranslate(-rectF.left, -rectF.top);
                                        bitmap.setHasAlpha(decodeStream.hasAlpha());
                                        TransformationUtils.applyMatrix(decodeStream, bitmap, matrix);
                                        break;
                                    default:
                                        bitmap = decodeStream;
                                        break;
                                }
                                if (!decodeStream.equals(bitmap)) {
                                    bitmapPool2.put(decodeStream);
                                }
                                return bitmap;
                            }
                            i17++;
                            list2 = list3;
                            lruArrayPool = lruArrayPool2;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                i3 = -1;
                switch (i3) {
                }
                switch (i3) {
                }
                if (i == Integer.MIN_VALUE) {
                }
                if (i2 == Integer.MIN_VALUE) {
                }
                ImageHeaderParser.ImageType imageType2 = svg.getImageType();
                int i182 = i3;
                boolean z72 = z3;
                if (i15 > 0) {
                }
                str2 = ", density: ";
                bitmapPool = bitmapPool3;
                str3 = ", target density: ";
                i8 = i6;
                if (Log.isLoggable("Downsampler", 3)) {
                }
                isHardwareConfigAllowed = this.hardwareConfigState.isHardwareConfigAllowed(i8, i7, z6, z72);
                if (isHardwareConfigAllowed) {
                }
                if (!isHardwareConfigAllowed) {
                }
                if (i15 >= 0) {
                }
                int i282 = options.inTargetDensity;
                if (i282 > 0) {
                }
                int i292 = options.inSampleSize;
                float f72 = i292;
                int ceil3 = (int) Math.ceil(i15 / f72);
                int ceil22 = (int) Math.ceil(i16 / f72);
                int round42 = Math.round(ceil3 * f6);
                int round52 = Math.round(ceil22 * f6);
                if (Log.isLoggable("Downsampler", 2)) {
                }
                i8 = round42;
                i7 = round52;
                if (i8 > 0) {
                }
                bitmapPool2 = bitmapPool;
                if (preferredColorSpace != null) {
                }
                decodeStream = decodeStream(svg, options, decodeCallbacks, bitmapPool2);
                decodeCallbacks.onDecodeComplete(decodeStream, bitmapPool2);
                if (Log.isLoggable("Downsampler", 2)) {
                }
                if (decodeStream == null) {
                }
                break;
            case 13:
                j = elapsedRealtimeNanos;
                str = str6;
                List list4 = (List) svg.idToElementMap;
                RecyclableBufferedInputStream recyclableBufferedInputStream3 = (RecyclableBufferedInputStream) ((InputStreamRewinder) svg.rootElement).bufferedStream;
                recyclableBufferedInputStream3.reset();
                i3 = ImageHeaderParserUtils.getOrientation(list4, recyclableBufferedInputStream3, (LruArrayPool) svg.cssRules);
                switch (i3) {
                }
                switch (i3) {
                }
                if (i == Integer.MIN_VALUE) {
                }
                if (i2 == Integer.MIN_VALUE) {
                }
                ImageHeaderParser.ImageType imageType22 = svg.getImageType();
                int i1822 = i3;
                boolean z722 = z3;
                if (i15 > 0) {
                }
                str2 = ", density: ";
                bitmapPool = bitmapPool3;
                str3 = ", target density: ";
                i8 = i6;
                if (Log.isLoggable("Downsampler", 3)) {
                }
                isHardwareConfigAllowed = this.hardwareConfigState.isHardwareConfigAllowed(i8, i7, z6, z722);
                if (isHardwareConfigAllowed) {
                }
                if (!isHardwareConfigAllowed) {
                }
                if (i15 >= 0) {
                }
                int i2822 = options.inTargetDensity;
                if (i2822 > 0) {
                }
                int i2922 = options.inSampleSize;
                float f722 = i2922;
                int ceil32 = (int) Math.ceil(i15 / f722);
                int ceil222 = (int) Math.ceil(i16 / f722);
                int round422 = Math.round(ceil32 * f6);
                int round522 = Math.round(ceil222 * f6);
                if (Log.isLoggable("Downsampler", 2)) {
                }
                i8 = round422;
                i7 = round522;
                if (i8 > 0) {
                }
                bitmapPool2 = bitmapPool;
                if (preferredColorSpace != null) {
                }
                decodeStream = decodeStream(svg, options, decodeCallbacks, bitmapPool2);
                decodeCallbacks.onDecodeComplete(decodeStream, bitmapPool2);
                if (Log.isLoggable("Downsampler", 2)) {
                }
                if (decodeStream == null) {
                }
                break;
            default:
                List list5 = (List) svg.cssRules;
                j = elapsedRealtimeNanos;
                InputStreamRewinder inputStreamRewinder = (InputStreamRewinder) svg.idToElementMap;
                LruArrayPool lruArrayPool3 = (LruArrayPool) svg.rootElement;
                int size2 = list5.size();
                str = str6;
                int i30 = 0;
                while (i30 < size2) {
                    int i31 = size2;
                    ImageHeaderParser imageHeaderParser = (ImageHeaderParser) list5.get(i30);
                    int i32 = i30;
                    try {
                        list = list5;
                        recyclableBufferedInputStream = new RecyclableBufferedInputStream(new FileInputStream(inputStreamRewinder.rewindAndGet().getFileDescriptor()), lruArrayPool3);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        orientation = imageHeaderParser.getOrientation(recyclableBufferedInputStream, lruArrayPool3);
                        recyclableBufferedInputStream.release();
                        inputStreamRewinder.rewindAndGet();
                        if (orientation != -1) {
                            i3 = orientation;
                            switch (i3) {
                            }
                            switch (i3) {
                            }
                            if (i == Integer.MIN_VALUE) {
                            }
                            if (i2 == Integer.MIN_VALUE) {
                            }
                            ImageHeaderParser.ImageType imageType222 = svg.getImageType();
                            int i18222 = i3;
                            boolean z7222 = z3;
                            if (i15 > 0) {
                            }
                            str2 = ", density: ";
                            bitmapPool = bitmapPool3;
                            str3 = ", target density: ";
                            i8 = i6;
                            if (Log.isLoggable("Downsampler", 3)) {
                            }
                            isHardwareConfigAllowed = this.hardwareConfigState.isHardwareConfigAllowed(i8, i7, z6, z7222);
                            if (isHardwareConfigAllowed) {
                            }
                            if (!isHardwareConfigAllowed) {
                            }
                            if (i15 >= 0) {
                            }
                            int i28222 = options.inTargetDensity;
                            if (i28222 > 0) {
                            }
                            int i29222 = options.inSampleSize;
                            float f7222 = i29222;
                            int ceil322 = (int) Math.ceil(i15 / f7222);
                            int ceil2222 = (int) Math.ceil(i16 / f7222);
                            int round4222 = Math.round(ceil322 * f6);
                            int round5222 = Math.round(ceil2222 * f6);
                            if (Log.isLoggable("Downsampler", 2)) {
                            }
                            i8 = round4222;
                            i7 = round5222;
                            if (i8 > 0) {
                            }
                            bitmapPool2 = bitmapPool;
                            if (preferredColorSpace != null) {
                            }
                            decodeStream = decodeStream(svg, options, decodeCallbacks, bitmapPool2);
                            decodeCallbacks.onDecodeComplete(decodeStream, bitmapPool2);
                            if (Log.isLoggable("Downsampler", 2)) {
                            }
                            if (decodeStream == null) {
                            }
                        } else {
                            i30 = i32 + 1;
                            size2 = i31;
                            list5 = list;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        recyclableBufferedInputStream2 = recyclableBufferedInputStream;
                        if (recyclableBufferedInputStream2 != null) {
                            recyclableBufferedInputStream2.release();
                        }
                        inputStreamRewinder.rewindAndGet();
                        throw th;
                    }
                }
                i3 = -1;
                switch (i3) {
                }
                switch (i3) {
                }
                if (i == Integer.MIN_VALUE) {
                }
                if (i2 == Integer.MIN_VALUE) {
                }
                ImageHeaderParser.ImageType imageType2222 = svg.getImageType();
                int i182222 = i3;
                boolean z72222 = z3;
                if (i15 > 0) {
                }
                str2 = ", density: ";
                bitmapPool = bitmapPool3;
                str3 = ", target density: ";
                i8 = i6;
                if (Log.isLoggable("Downsampler", 3)) {
                }
                isHardwareConfigAllowed = this.hardwareConfigState.isHardwareConfigAllowed(i8, i7, z6, z72222);
                if (isHardwareConfigAllowed) {
                }
                if (!isHardwareConfigAllowed) {
                }
                if (i15 >= 0) {
                }
                int i282222 = options.inTargetDensity;
                if (i282222 > 0) {
                }
                int i292222 = options.inSampleSize;
                float f72222 = i292222;
                int ceil3222 = (int) Math.ceil(i15 / f72222);
                int ceil22222 = (int) Math.ceil(i16 / f72222);
                int round42222 = Math.round(ceil3222 * f6);
                int round52222 = Math.round(ceil22222 * f6);
                if (Log.isLoggable("Downsampler", 2)) {
                }
                i8 = round42222;
                i7 = round52222;
                if (i8 > 0) {
                }
                bitmapPool2 = bitmapPool;
                if (preferredColorSpace != null) {
                }
                decodeStream = decodeStream(svg, options, decodeCallbacks, bitmapPool2);
                decodeCallbacks.onDecodeComplete(decodeStream, bitmapPool2);
                if (Log.isLoggable("Downsampler", 2)) {
                }
                if (decodeStream == null) {
                }
                break;
        }
    }
}
