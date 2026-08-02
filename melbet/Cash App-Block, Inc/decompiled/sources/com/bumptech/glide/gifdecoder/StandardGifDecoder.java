package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import android.util.Log;
import coil3.svg.internal.AndroidSvg;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class StandardGifDecoder {
    public int[] act;
    public final AndroidSvg bitmapProvider;
    public byte[] block;
    public final int downsampledHeight;
    public final int downsampledWidth;
    public int framePointer;
    public GifHeader header;
    public Boolean isFirstFrameTransparent;
    public byte[] mainPixels;
    public final int[] mainScratch;
    public byte[] pixelStack;
    public short[] prefix;
    public Bitmap previousImage;
    public ByteBuffer rawData;
    public final int sampleSize;
    public final boolean savePrevious;
    public int status;
    public byte[] suffix;
    public final int[] pct = new int[256];
    public Bitmap.Config bitmapConfig = Bitmap.Config.ARGB_8888;

    public StandardGifDecoder(AndroidSvg androidSvg, GifHeader gifHeader, ByteBuffer byteBuffer, int i) {
        this.bitmapProvider = androidSvg;
        this.header = new GifHeader();
        synchronized (this) {
            try {
                if (i <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
                }
                int highestOneBit = Integer.highestOneBit(i);
                this.status = 0;
                this.header = gifHeader;
                this.framePointer = -1;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.rawData = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.rawData.order(ByteOrder.LITTLE_ENDIAN);
                this.savePrevious = false;
                Iterator it = gifHeader.frames.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((GifFrame) it.next()).dispose == 3) {
                        this.savePrevious = true;
                        break;
                    }
                }
                this.sampleSize = highestOneBit;
                int i2 = gifHeader.width;
                this.downsampledWidth = i2 / highestOneBit;
                int i3 = gifHeader.height;
                this.downsampledHeight = i3 / highestOneBit;
                int i4 = i2 * i3;
                LruArrayPool lruArrayPool = (LruArrayPool) this.bitmapProvider.renderOptions;
                this.mainPixels = lruArrayPool == null ? new byte[i4] : (byte[]) lruArrayPool.get(byte[].class, i4);
                AndroidSvg androidSvg2 = this.bitmapProvider;
                int i5 = this.downsampledWidth * this.downsampledHeight;
                LruArrayPool lruArrayPool2 = (LruArrayPool) androidSvg2.renderOptions;
                this.mainScratch = lruArrayPool2 == null ? new int[i5] : (int[]) lruArrayPool2.get(int[].class, i5);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Bitmap getNextBitmap() {
        Boolean bool = this.isFirstFrameTransparent;
        Bitmap dirty = ((BitmapPool) this.bitmapProvider.svg).getDirty(this.downsampledWidth, this.downsampledHeight, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.bitmapConfig);
        dirty.setHasAlpha(true);
        return dirty;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:18:0x005b, B:19:0x0066, B:20:0x005e, B:21:0x0068, B:23:0x0079, B:24:0x0085, B:27:0x008e, B:29:0x0092, B:31:0x009a, B:32:0x00ad, B:36:0x00b1, B:38:0x00b5, B:40:0x00c7, B:42:0x00cb, B:43:0x00cf, B:46:0x008a, B:48:0x00d5, B:50:0x00dd, B:53:0x0017, B:55:0x001f, B:56:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:18:0x005b, B:19:0x0066, B:20:0x005e, B:21:0x0068, B:23:0x0079, B:24:0x0085, B:27:0x008e, B:29:0x0092, B:31:0x009a, B:32:0x00ad, B:36:0x00b1, B:38:0x00b5, B:40:0x00c7, B:42:0x00cb, B:43:0x00cf, B:46:0x008a, B:48:0x00d5, B:50:0x00dd, B:53:0x0017, B:55:0x001f, B:56:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:18:0x005b, B:19:0x0066, B:20:0x005e, B:21:0x0068, B:23:0x0079, B:24:0x0085, B:27:0x008e, B:29:0x0092, B:31:0x009a, B:32:0x00ad, B:36:0x00b1, B:38:0x00b5, B:40:0x00c7, B:42:0x00cb, B:43:0x00cf, B:46:0x008a, B:48:0x00d5, B:50:0x00dd, B:53:0x0017, B:55:0x001f, B:56:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1 A[Catch: all -> 0x0014, TRY_ENTER, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:18:0x005b, B:19:0x0066, B:20:0x005e, B:21:0x0068, B:23:0x0079, B:24:0x0085, B:27:0x008e, B:29:0x0092, B:31:0x009a, B:32:0x00ad, B:36:0x00b1, B:38:0x00b5, B:40:0x00c7, B:42:0x00cb, B:43:0x00cf, B:46:0x008a, B:48:0x00d5, B:50:0x00dd, B:53:0x0017, B:55:0x001f, B:56:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:18:0x005b, B:19:0x0066, B:20:0x005e, B:21:0x0068, B:23:0x0079, B:24:0x0085, B:27:0x008e, B:29:0x0092, B:31:0x009a, B:32:0x00ad, B:36:0x00b1, B:38:0x00b5, B:40:0x00c7, B:42:0x00cb, B:43:0x00cf, B:46:0x008a, B:48:0x00d5, B:50:0x00dd, B:53:0x0017, B:55:0x001f, B:56:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00dd A[Catch: all -> 0x0014, TRY_LEAVE, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:18:0x005b, B:19:0x0066, B:20:0x005e, B:21:0x0068, B:23:0x0079, B:24:0x0085, B:27:0x008e, B:29:0x0092, B:31:0x009a, B:32:0x00ad, B:36:0x00b1, B:38:0x00b5, B:40:0x00c7, B:42:0x00cb, B:43:0x00cf, B:46:0x008a, B:48:0x00d5, B:50:0x00dd, B:53:0x0017, B:55:0x001f, B:56:0x003e), top: B:3:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized Bitmap getNextFrame() {
        int i;
        int[] iArr;
        try {
            if (this.header.frameCount > 0) {
                if (this.framePointer < 0) {
                }
                i = this.status;
                if (i != 1 && i != 2) {
                    this.status = 0;
                    if (this.block == null) {
                        LruArrayPool lruArrayPool = (LruArrayPool) this.bitmapProvider.renderOptions;
                        this.block = lruArrayPool == null ? new byte[255] : (byte[]) lruArrayPool.get(byte[].class, 255);
                    }
                    GifFrame gifFrame = (GifFrame) this.header.frames.get(this.framePointer);
                    int i2 = this.framePointer - 1;
                    GifFrame gifFrame2 = i2 < 0 ? (GifFrame) this.header.frames.get(i2) : null;
                    iArr = gifFrame.lct;
                    if (iArr != null) {
                        iArr = this.header.gct;
                    }
                    this.act = iArr;
                    if (iArr != null) {
                        if (Log.isLoggable("StandardGifDecoder", 3)) {
                            Log.d("StandardGifDecoder", "No valid color table found for frame #" + this.framePointer);
                        }
                        this.status = 1;
                        return null;
                    }
                    if (gifFrame.transparency) {
                        System.arraycopy(iArr, 0, this.pct, 0, iArr.length);
                        int[] iArr2 = this.pct;
                        this.act = iArr2;
                        iArr2[gifFrame.transIndex] = 0;
                        if (gifFrame.dispose == 2 && this.framePointer == 0) {
                            this.isFirstFrameTransparent = Boolean.TRUE;
                        }
                    }
                    return setPixels(gifFrame, gifFrame2);
                }
                if (Log.isLoggable("StandardGifDecoder", 3)) {
                    Log.d("StandardGifDecoder", "Unable to decode frame, status=" + this.status);
                }
                return null;
            }
            if (Log.isLoggable("StandardGifDecoder", 3)) {
                Log.d("StandardGifDecoder", "Unable to decode frame, frameCount=" + this.header.frameCount + ", framePointer=" + this.framePointer);
            }
            this.status = 1;
            i = this.status;
            if (i != 1) {
                this.status = 0;
                if (this.block == null) {
                }
                GifFrame gifFrame3 = (GifFrame) this.header.frames.get(this.framePointer);
                int i22 = this.framePointer - 1;
                if (i22 < 0) {
                }
                iArr = gifFrame3.lct;
                if (iArr != null) {
                }
                this.act = iArr;
                if (iArr != null) {
                }
            }
            if (Log.isLoggable("StandardGifDecoder", 3)) {
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
    
        if (r7.bgIndex == r37.transIndex) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0204 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e2 A[LOOP:2: B:52:0x00e0->B:53:0x00e2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap setPixels(GifFrame gifFrame, GifFrame gifFrame2) {
        int i;
        byte[] bArr;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int[] iArr2;
        int i12;
        short[] sArr;
        byte[] bArr2;
        short s;
        int i13;
        int i14;
        int i15;
        int i16;
        AndroidSvg androidSvg = this.bitmapProvider;
        byte b = 0;
        int[] iArr3 = this.mainScratch;
        if (gifFrame2 == null) {
            Bitmap bitmap = this.previousImage;
            if (bitmap != null) {
                ((BitmapPool) androidSvg.svg).put(bitmap);
            }
            this.previousImage = null;
            Arrays.fill(iArr3, 0);
        }
        if (gifFrame2 != null && gifFrame2.dispose == 3 && this.previousImage == null) {
            Arrays.fill(iArr3, 0);
        }
        int i17 = this.downsampledWidth;
        int i18 = this.sampleSize;
        if (gifFrame2 != null && (i13 = gifFrame2.dispose) > 0) {
            if (i13 == 2) {
                if (!gifFrame.transparency) {
                    GifHeader gifHeader = this.header;
                    i14 = gifHeader.bgColor;
                    if (gifFrame.lct != null) {
                    }
                    int i19 = gifFrame2.ih / i18;
                    int i20 = gifFrame2.iy / i18;
                    int i21 = gifFrame2.iw / i18;
                    i15 = (i20 * i17) + (gifFrame2.ix / i18);
                    i16 = (i19 * i17) + i15;
                    while (i15 < i16) {
                        int i22 = i15 + i21;
                        for (int i23 = i15; i23 < i22; i23++) {
                            iArr3[i23] = i14;
                        }
                        i15 += i17;
                    }
                }
                i14 = 0;
                int i192 = gifFrame2.ih / i18;
                int i202 = gifFrame2.iy / i18;
                int i212 = gifFrame2.iw / i18;
                i15 = (i202 * i17) + (gifFrame2.ix / i18);
                i16 = (i192 * i17) + i15;
                while (i15 < i16) {
                }
            } else if (i13 == 3) {
                Bitmap bitmap2 = this.previousImage;
                if (bitmap2 != null) {
                    int i24 = this.downsampledHeight;
                    int i25 = this.downsampledWidth;
                    bitmap2.getPixels(iArr3, 0, i25, 0, 0, i25, i24);
                }
                this.rawData.position(gifFrame.bufferFrameStart);
                i = gifFrame.iw * gifFrame.ih;
                bArr = this.mainPixels;
                if (bArr != null || bArr.length < i) {
                    LruArrayPool lruArrayPool = (LruArrayPool) androidSvg.renderOptions;
                    this.mainPixels = lruArrayPool != null ? new byte[i] : (byte[]) lruArrayPool.get(byte[].class, i);
                }
                byte[] bArr3 = this.mainPixels;
                if (this.prefix == null) {
                    this.prefix = new short[4096];
                }
                short[] sArr2 = this.prefix;
                if (this.suffix == null) {
                    this.suffix = new byte[4096];
                }
                byte[] bArr4 = this.suffix;
                if (this.pixelStack == null) {
                    this.pixelStack = new byte[4097];
                }
                byte[] bArr5 = this.pixelStack;
                int i26 = this.rawData.get() & 255;
                i2 = 1 << i26;
                int i27 = i2 + 1;
                int i28 = i2 + 2;
                int i29 = i26 + 1;
                int i30 = (1 << i29) - 1;
                for (i3 = 0; i3 < i2; i3++) {
                    sArr2[i3] = 0;
                    bArr4[i3] = (byte) i3;
                }
                byte[] bArr6 = this.block;
                i4 = 0;
                int i31 = 0;
                int i32 = 0;
                int i33 = 0;
                int i34 = 0;
                int i35 = 0;
                int i36 = 0;
                int i37 = 0;
                int i38 = i29;
                int i39 = i28;
                int i40 = i30;
                short s2 = -1;
                short s3 = -1;
                while (true) {
                    if (i4 < i) {
                        iArr = iArr3;
                        break;
                    }
                    if (i31 == 0) {
                        int i41 = this.rawData.get() & 255;
                        if (i41 <= 0) {
                            i31 = i41;
                            iArr = iArr3;
                            sArr = sArr2;
                            bArr2 = bArr6;
                        } else {
                            iArr = iArr3;
                            ByteBuffer byteBuffer = this.rawData;
                            sArr = sArr2;
                            bArr2 = bArr6;
                            i31 = i41;
                            byteBuffer.get(this.block, 0, Math.min(i41, byteBuffer.remaining()));
                        }
                        if (i31 <= 0) {
                            this.status = 3;
                            b = 0;
                            break;
                        }
                        i32 = 0;
                    } else {
                        iArr = iArr3;
                        sArr = sArr2;
                        bArr2 = bArr6;
                    }
                    i34 += (bArr2[i32] & 255) << i33;
                    i32++;
                    i31--;
                    short s4 = s3;
                    int i42 = i33 + 8;
                    int i43 = i39;
                    int i44 = i38;
                    byte[] bArr7 = bArr4;
                    int i45 = i36;
                    while (true) {
                        i33 = i42;
                        if (i42 < i44) {
                            i36 = i45;
                            bArr4 = bArr7;
                            i38 = i44;
                            iArr3 = iArr;
                            bArr6 = bArr2;
                            s2 = -1;
                            s3 = s4;
                            i39 = i43;
                            sArr2 = sArr;
                            break;
                        }
                        int i46 = i34 & i40;
                        i34 >>= i44;
                        i33 -= i44;
                        if (i46 == i2) {
                            i44 = i29;
                            i43 = i28;
                            i40 = i30;
                            s4 = s2;
                            i42 = i33;
                        } else {
                            if (i46 == i27) {
                                i39 = i43;
                                i38 = i44;
                                i36 = i45;
                                bArr4 = bArr7;
                                iArr3 = iArr;
                                sArr2 = sArr;
                                bArr6 = bArr2;
                                s3 = s4;
                                break;
                            }
                            int i47 = i44;
                            if (s4 == s2) {
                                bArr3[i35] = bArr7[i46 == true ? 1 : 0];
                                i35++;
                                i4++;
                                s4 = i46 == true ? 1 : 0;
                                i45 = s4;
                                i42 = i33;
                                i44 = i47;
                            } else {
                                if (i46 >= i43) {
                                    bArr5[i37] = (byte) i45;
                                    i37++;
                                    s = s4;
                                } else {
                                    s = i46 == true ? 1 : 0;
                                }
                                while (s >= i2) {
                                    bArr5[i37] = bArr7[s];
                                    i37++;
                                    s = sArr[s];
                                }
                                i45 = bArr7[s] & 255;
                                byte b2 = (byte) i45;
                                bArr3[i35] = b2;
                                while (true) {
                                    i35++;
                                    i4++;
                                    if (i37 <= 0) {
                                        break;
                                    }
                                    i37--;
                                    bArr3[i35] = bArr5[i37];
                                }
                                int i48 = i2;
                                if (i43 < 4096) {
                                    sArr[i43] = s4;
                                    bArr7[i43] = b2;
                                    i43++;
                                    if ((i43 & i40) == 0 && i43 < 4096) {
                                        i44 = i47 + 1;
                                        i40 += i43;
                                        s4 = i46 == true ? 1 : 0;
                                        i42 = i33;
                                        i2 = i48;
                                    }
                                }
                                i44 = i47;
                                s4 = i46 == true ? 1 : 0;
                                i42 = i33;
                                i2 = i48;
                            }
                            s2 = -1;
                        }
                    }
                    b = 0;
                }
                Arrays.fill(bArr3, i35, i, b);
                z = gifFrame.interlace;
                int[] iArr4 = this.mainScratch;
                if (z && i18 == 1) {
                    int i49 = gifFrame.ih;
                    int i50 = gifFrame.iy;
                    int i51 = gifFrame.iw;
                    int i52 = gifFrame.ix;
                    byte b3 = this.framePointer == 0 ? (byte) 1 : b;
                    byte[] bArr8 = this.mainPixels;
                    int[] iArr5 = this.act;
                    int i53 = -1;
                    for (int i54 = b; i54 < i49; i54++) {
                        int i55 = (i54 + i50) * i17;
                        int i56 = i55 + i52;
                        int i57 = i56 + i51;
                        int i58 = i55 + i17;
                        if (i58 < i57) {
                            i57 = i58;
                        }
                        int i59 = gifFrame.iw * i54;
                        while (i56 < i57) {
                            int i60 = i49;
                            int i61 = bArr8[i59];
                            int[] iArr6 = iArr4;
                            int i62 = i61 & 255;
                            if (i62 != i53) {
                                int i63 = iArr5[i62];
                                if (i63 != 0) {
                                    iArr6[i56] = i63;
                                } else {
                                    i53 = i61;
                                }
                            }
                            i59++;
                            i56++;
                            i49 = i60;
                            iArr4 = iArr6;
                        }
                    }
                    Boolean bool = this.isFirstFrameTransparent;
                    this.isFirstFrameTransparent = Boolean.valueOf((bool != null && bool.booleanValue()) || !(this.isFirstFrameTransparent != null || b3 == 0 || i53 == -1));
                } else {
                    i5 = gifFrame.ih / i18;
                    int i64 = gifFrame.iy / i18;
                    int i65 = gifFrame.iw / i18;
                    int i66 = gifFrame.ix / i18;
                    boolean z2 = this.framePointer != 0;
                    byte[] bArr9 = this.mainPixels;
                    int[] iArr7 = this.act;
                    Boolean bool2 = this.isFirstFrameTransparent;
                    int i67 = 8;
                    i6 = 0;
                    int i68 = 0;
                    int i69 = 1;
                    while (i6 < i5) {
                        int i70 = i64;
                        if (gifFrame.interlace) {
                            if (i68 >= i5) {
                                i69++;
                                if (i69 == 2) {
                                    i68 = 4;
                                } else if (i69 == 3) {
                                    i67 = 4;
                                    i68 = 2;
                                } else if (i69 == 4) {
                                    i68 = 1;
                                    i67 = 2;
                                }
                            }
                            i7 = i68 + i67;
                        } else {
                            i7 = i68;
                            i68 = i6;
                        }
                        int i71 = i68 + i70;
                        int i72 = i5;
                        boolean z3 = i18 == 1;
                        if (i71 < this.downsampledHeight) {
                            int i73 = i71 * i17;
                            int i74 = i73 + i66;
                            int i75 = i74 + i65;
                            int i76 = i73 + i17;
                            if (i76 < i75) {
                                i75 = i76;
                            }
                            i8 = i7;
                            int i77 = i6 * i18 * gifFrame.iw;
                            if (z3) {
                                int i78 = i74;
                                while (i78 < i75) {
                                    int i79 = i78;
                                    int i80 = iArr7[bArr9[i77] & 255];
                                    if (i80 != 0) {
                                        iArr4[i79] = i80;
                                    } else if (z2 && bool2 == null) {
                                        bool2 = Boolean.TRUE;
                                    }
                                    i77 += i18;
                                    i78 = i79 + 1;
                                }
                            } else {
                                int i81 = ((i75 - i74) * i18) + i77;
                                Boolean bool3 = bool2;
                                int i82 = i77;
                                int i83 = i74;
                                while (i83 < i75) {
                                    int i84 = i75;
                                    int i85 = gifFrame.iw;
                                    int i86 = i65;
                                    int i87 = i82;
                                    int i88 = 0;
                                    int i89 = 0;
                                    int i90 = 0;
                                    int i91 = 0;
                                    int i92 = 0;
                                    while (true) {
                                        if (i87 >= i82 + i18) {
                                            i11 = i66;
                                            break;
                                        }
                                        byte[] bArr10 = this.mainPixels;
                                        i11 = i66;
                                        if (i87 >= bArr10.length || i87 >= i81) {
                                            break;
                                        }
                                        int i93 = this.act[bArr10[i87] & 255];
                                        if (i93 != 0) {
                                            i88 += (i93 >> 24) & 255;
                                            i89 += (i93 >> 16) & 255;
                                            i90 += (i93 >> 8) & 255;
                                            i91 += i93 & 255;
                                            i92++;
                                        }
                                        i87++;
                                        i66 = i11;
                                    }
                                    int i94 = i82 + i85;
                                    int i95 = i94;
                                    while (i95 < i94 + i18) {
                                        byte[] bArr11 = this.mainPixels;
                                        int i96 = i94;
                                        if (i95 >= bArr11.length || i95 >= i81) {
                                            break;
                                        }
                                        int i97 = this.act[bArr11[i95] & 255];
                                        if (i97 != 0) {
                                            i88 += (i97 >> 24) & 255;
                                            i89 += (i97 >> 16) & 255;
                                            i90 += (i97 >> 8) & 255;
                                            i91 += i97 & 255;
                                            i92++;
                                        }
                                        i95++;
                                        i94 = i96;
                                    }
                                    int i98 = i92 == 0 ? 0 : ((i88 / i92) << 24) | ((i89 / i92) << 16) | ((i90 / i92) << 8) | (i91 / i92);
                                    if (i98 != 0) {
                                        iArr4[i83] = i98;
                                    } else if (z2 && bool3 == null) {
                                        bool3 = Boolean.TRUE;
                                    }
                                    i82 += i18;
                                    i83++;
                                    i75 = i84;
                                    i65 = i86;
                                    i66 = i11;
                                }
                                i10 = i65;
                                i9 = i66;
                                bool2 = bool3;
                                i6++;
                                i64 = i70;
                                i5 = i72;
                                i68 = i8;
                                i65 = i10;
                                i66 = i9;
                            }
                        } else {
                            i8 = i7;
                        }
                        i10 = i65;
                        i9 = i66;
                        i6++;
                        i64 = i70;
                        i5 = i72;
                        i68 = i8;
                        i65 = i10;
                        i66 = i9;
                    }
                    if (this.isFirstFrameTransparent == null) {
                        this.isFirstFrameTransparent = Boolean.valueOf(bool2 == null ? false : bool2.booleanValue());
                    }
                }
                if (this.savePrevious || !((i12 = gifFrame.dispose) == 0 || i12 == 1)) {
                    iArr2 = iArr;
                } else {
                    if (this.previousImage == null) {
                        this.previousImage = getNextBitmap();
                    }
                    Bitmap bitmap3 = this.previousImage;
                    int i99 = this.downsampledHeight;
                    int i100 = this.downsampledWidth;
                    iArr2 = iArr;
                    bitmap3.setPixels(iArr2, 0, i100, 0, 0, i100, i99);
                }
                Bitmap nextBitmap = getNextBitmap();
                int i101 = this.downsampledHeight;
                int i102 = this.downsampledWidth;
                nextBitmap.setPixels(iArr2, 0, i102, 0, 0, i102, i101);
                return nextBitmap;
            }
        }
        this.rawData.position(gifFrame.bufferFrameStart);
        i = gifFrame.iw * gifFrame.ih;
        bArr = this.mainPixels;
        if (bArr != null) {
        }
        LruArrayPool lruArrayPool2 = (LruArrayPool) androidSvg.renderOptions;
        this.mainPixels = lruArrayPool2 != null ? new byte[i] : (byte[]) lruArrayPool2.get(byte[].class, i);
        byte[] bArr32 = this.mainPixels;
        if (this.prefix == null) {
        }
        short[] sArr22 = this.prefix;
        if (this.suffix == null) {
        }
        byte[] bArr42 = this.suffix;
        if (this.pixelStack == null) {
        }
        byte[] bArr52 = this.pixelStack;
        int i262 = this.rawData.get() & 255;
        i2 = 1 << i262;
        int i272 = i2 + 1;
        int i282 = i2 + 2;
        int i292 = i262 + 1;
        int i302 = (1 << i292) - 1;
        while (i3 < i2) {
        }
        byte[] bArr62 = this.block;
        i4 = 0;
        int i312 = 0;
        int i322 = 0;
        int i332 = 0;
        int i342 = 0;
        int i352 = 0;
        int i362 = 0;
        int i372 = 0;
        int i382 = i292;
        int i392 = i282;
        int i402 = i302;
        short s22 = -1;
        short s32 = -1;
        while (true) {
            if (i4 < i) {
            }
            b = 0;
        }
        Arrays.fill(bArr32, i352, i, b);
        z = gifFrame.interlace;
        int[] iArr42 = this.mainScratch;
        if (z) {
        }
        i5 = gifFrame.ih / i18;
        int i642 = gifFrame.iy / i18;
        int i652 = gifFrame.iw / i18;
        int i662 = gifFrame.ix / i18;
        if (this.framePointer != 0) {
        }
        byte[] bArr92 = this.mainPixels;
        int[] iArr72 = this.act;
        Boolean bool22 = this.isFirstFrameTransparent;
        int i672 = 8;
        i6 = 0;
        int i682 = 0;
        int i692 = 1;
        while (i6 < i5) {
        }
        if (this.isFirstFrameTransparent == null) {
        }
        if (this.savePrevious) {
        }
        iArr2 = iArr;
        Bitmap nextBitmap2 = getNextBitmap();
        int i1012 = this.downsampledHeight;
        int i1022 = this.downsampledWidth;
        nextBitmap2.setPixels(iArr2, 0, i1022, 0, 0, i1022, i1012);
        return nextBitmap2;
    }
}
