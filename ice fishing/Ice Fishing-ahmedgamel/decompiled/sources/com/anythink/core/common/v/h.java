package com.anythink.core.common.v;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.lang.reflect.Array;

/* loaded from: classes.dex */
public final class h {

    public interface a {
        void a();

        void a(Bitmap bitmap);
    }

    public static int[] a(String str) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            return new int[]{options.outWidth, options.outHeight};
        } catch (OutOfMemoryError unused) {
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static Bitmap b(Bitmap bitmap) {
        char c9;
        int i;
        int i4;
        int i6;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i9 = width * height;
        int[] iArr = new int[i9];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int i10 = width - 1;
        int i11 = height - 1;
        int[] iArr2 = new int[i9];
        int[] iArr3 = new int[i9];
        int[] iArr4 = new int[i9];
        int[] iArr5 = new int[Math.max(width, height)];
        int[] iArr6 = new int[173056];
        int i12 = 0;
        for (int i13 = 0; i13 < 173056; i13++) {
            iArr6[i13] = i13 / 676;
        }
        char c10 = 2;
        boolean z6 = true;
        char c11 = '3';
        int[][] iArr7 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 51, 3);
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            c9 = c10;
            i = 25;
            if (i14 >= height) {
                break;
            }
            int i17 = i12;
            int i18 = i17;
            int i19 = i18;
            int i20 = i19;
            int i21 = i20;
            int i22 = i21;
            int i23 = i22;
            int i24 = i23;
            boolean z9 = z6;
            int i25 = -25;
            int i26 = i24;
            while (i25 <= 25) {
                char c12 = c11;
                int i27 = iArr[Math.min(i10, Math.max(i25, i12)) + i15];
                int[] iArr8 = iArr7[i25 + 25];
                iArr8[i12] = (i27 & 16711680) >> 16;
                iArr8[z9 ? 1 : 0] = (i27 & 65280) >> 8;
                iArr8[c9] = i27 & com.anythink.basead.exoplayer.k.p.f9259b;
                int abs = 26 - Math.abs(i25);
                int i28 = iArr8[i12];
                i26 = (i28 * abs) + i26;
                int i29 = iArr8[z9 ? 1 : 0];
                i17 = (i29 * abs) + i17;
                int i30 = iArr8[c9];
                i18 = (abs * i30) + i18;
                if (i25 > 0) {
                    i22 += i28;
                    i23 += i29;
                    i24 += i30;
                } else {
                    i19 += i28;
                    i20 += i29;
                    i21 += i30;
                }
                i25++;
                c11 = c12;
            }
            char c13 = c11;
            int i31 = i12;
            while (i31 < width) {
                iArr2[i15] = iArr6[i26];
                iArr3[i15] = iArr6[i17];
                iArr4[i15] = iArr6[i18];
                int i32 = i26 - i19;
                int i33 = i17 - i20;
                int i34 = i18 - i21;
                int[] iArr9 = iArr7[(i + 26) % 51];
                int i35 = i19 - iArr9[i12];
                int i36 = i20 - iArr9[z9 ? 1 : 0];
                int i37 = i21 - iArr9[c9];
                if (i14 == 0) {
                    i6 = i12;
                    iArr5[i31] = Math.min(i31 + 26, i10);
                } else {
                    i6 = i12;
                }
                int i38 = iArr[i16 + iArr5[i31]];
                int i39 = (i38 & 16711680) >> 16;
                iArr9[i6] = i39;
                int i40 = (i38 & 65280) >> 8;
                iArr9[z9 ? 1 : 0] = i40;
                int i41 = i38 & com.anythink.basead.exoplayer.k.p.f9259b;
                iArr9[c9] = i41;
                int i42 = i22 + i39;
                int i43 = i23 + i40;
                int i44 = i24 + i41;
                i26 = i32 + i42;
                i17 = i33 + i43;
                i18 = i34 + i44;
                i = (i + 1) % 51;
                int[] iArr10 = iArr7[i % 51];
                int i45 = iArr10[i6];
                i19 = i35 + i45;
                int i46 = iArr10[z9 ? 1 : 0];
                i20 = i36 + i46;
                int i47 = iArr10[c9];
                i21 = i37 + i47;
                i22 = i42 - i45;
                i23 = i43 - i46;
                i24 = i44 - i47;
                i15++;
                i31++;
                i12 = i6;
            }
            i16 += width;
            i14++;
            c10 = c9;
            z6 = z9 ? 1 : 0;
            c11 = c13;
        }
        int i48 = i12;
        boolean z10 = z6;
        int i49 = i48;
        while (i49 < width) {
            int i50 = width * (-25);
            int i51 = i49;
            int i52 = -25;
            int i53 = i48;
            int i54 = i53;
            int i55 = i54;
            int i56 = i55;
            int i57 = i56;
            int i58 = i57;
            int i59 = i58;
            int i60 = i59;
            int i61 = i60;
            while (i52 <= i) {
                int i62 = i48;
                int max = Math.max(i62, i50) + i51;
                int[] iArr11 = iArr7[i52 + 25];
                iArr11[i62] = iArr2[max];
                iArr11[z10 ? 1 : 0] = iArr3[max];
                iArr11[c9] = iArr4[max];
                int abs2 = 26 - Math.abs(i52);
                i53 = (iArr2[max] * abs2) + i53;
                i54 = (iArr3[max] * abs2) + i54;
                i55 = (iArr4[max] * abs2) + i55;
                if (i52 > 0) {
                    i59 += iArr11[0];
                    i60 += iArr11[z10 ? 1 : 0];
                    i61 += iArr11[c9];
                } else {
                    i56 += iArr11[0];
                    i57 += iArr11[z10 ? 1 : 0];
                    i58 += iArr11[c9];
                }
                if (i52 < i11) {
                    i50 += width;
                }
                i52++;
                i = 25;
                i48 = 0;
            }
            int i63 = i51;
            int i64 = 25;
            for (int i65 = 0; i65 < height; i65++) {
                iArr[i63] = (iArr[i63] & (-16777216)) | (iArr6[i53] << 16) | (iArr6[i54] << 8) | iArr6[i55];
                int i66 = i53 - i56;
                int i67 = i54 - i57;
                int i68 = i55 - i58;
                int[] iArr12 = iArr7[(i64 + 26) % 51];
                int i69 = i56 - iArr12[0];
                int i70 = i57 - iArr12[z10 ? 1 : 0];
                int i71 = i58 - iArr12[c9];
                if (i51 == 0) {
                    i4 = i63;
                    iArr5[i65] = Math.min(i65 + 26, i11) * width;
                } else {
                    i4 = i63;
                }
                int i72 = i51 + iArr5[i65];
                int i73 = iArr2[i72];
                iArr12[0] = i73;
                int i74 = iArr3[i72];
                iArr12[z10 ? 1 : 0] = i74;
                int i75 = iArr4[i72];
                iArr12[c9] = i75;
                int i76 = i59 + i73;
                int i77 = i60 + i74;
                int i78 = i61 + i75;
                i53 = i66 + i76;
                i54 = i67 + i77;
                i55 = i68 + i78;
                i64 = (i64 + 1) % 51;
                int[] iArr13 = iArr7[i64];
                int i79 = iArr13[0];
                i56 = i69 + i79;
                int i80 = iArr13[z10 ? 1 : 0];
                i57 = i70 + i80;
                int i81 = iArr13[c9];
                i58 = i71 + i81;
                i59 = i76 - i79;
                i60 = i77 - i80;
                i61 = i78 - i81;
                i63 = i4 + width;
            }
            i48 = 0;
            i49 = i51 + 1;
            i = 25;
        }
        bitmap.setPixels(iArr, 0, width, 0, 0, width, height);
        return bitmap;
    }

    private static Bitmap a(String str, int i, int i4) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            options.inSampleSize = a(options.outWidth, options.outHeight, i, i4);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeFile(str, options);
        } catch (OutOfMemoryError unused) {
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static Bitmap a(FileDescriptor fileDescriptor, int i, int i4) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
            options.inSampleSize = a(options.outWidth, options.outHeight, i, i4);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        } catch (OutOfMemoryError e9) {
            e9.printStackTrace();
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static Bitmap a(Context context, int i, int i4, int i6) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeResource(context.getResources(), i, options);
            options.inSampleSize = a(options.outWidth, options.outHeight, i4, i6);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeResource(context.getResources(), i, options);
        } catch (OutOfMemoryError e9) {
            e9.printStackTrace();
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static int a(int i, int i4, int i6, int i9) {
        int i10 = 1;
        if (i6 <= 0 && i9 <= 0) {
            return 1;
        }
        while (i / i10 > i6 && i4 / i10 > i9) {
            i10 *= 2;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ca A[Catch: all -> 0x00cd, TRY_LEAVE, TryCatch #6 {all -> 0x00cd, blocks: (B:61:0x00c4, B:63:0x00ca), top: B:60:0x00c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap a(Context context, Bitmap bitmap) {
        RenderScript renderScript;
        Bitmap bitmap2;
        ScriptIntrinsicBlur scriptIntrinsicBlur;
        Allocation allocation;
        Allocation allocation2;
        Bitmap createBitmap;
        if (context == null || bitmap == null) {
            return null;
        }
        if (bitmap.isRecycled()) {
            com.IceFishing.LiveIceFishing.k.x("Error", "Error, cannot access an invalid/free'd bitmap here!");
            return null;
        }
        try {
            double max = Math.max(Math.max(bitmap.getWidth() / 500.0d, bitmap.getHeight() / 500.0d), 1.0d);
            int width = (int) (bitmap.getWidth() / max);
            int height = (int) (bitmap.getHeight() / max);
            createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            bitmap2 = Bitmap.createScaledBitmap(bitmap, width, height, true);
            try {
                renderScript = RenderScript.create(context);
            } catch (Throwable th) {
                th = th;
                renderScript = null;
                scriptIntrinsicBlur = null;
            }
        } catch (Throwable th2) {
            th = th2;
            renderScript = null;
            bitmap2 = null;
            scriptIntrinsicBlur = null;
        }
        try {
            scriptIntrinsicBlur = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
            try {
                allocation = Allocation.createFromBitmap(renderScript, bitmap2);
                try {
                    allocation2 = Allocation.createFromBitmap(renderScript, createBitmap);
                    try {
                        scriptIntrinsicBlur.setRadius(25.0f);
                        scriptIntrinsicBlur.setInput(allocation);
                        scriptIntrinsicBlur.forEach(allocation2);
                        allocation2.copyTo(createBitmap);
                        new Canvas(createBitmap).drawColor(855638016);
                        try {
                            allocation2.destroy();
                        } catch (Throwable unused) {
                        }
                        if (allocation != null) {
                            try {
                                allocation.destroy();
                            } catch (Throwable unused2) {
                            }
                        }
                        try {
                            scriptIntrinsicBlur.destroy();
                        } catch (Throwable unused3) {
                        }
                        if (renderScript != null) {
                            try {
                                renderScript.destroy();
                            } catch (Throwable unused4) {
                            }
                        }
                        if (bitmap2 != null && bitmap2 != bitmap) {
                            try {
                                if (!bitmap2.isRecycled()) {
                                    bitmap2.recycle();
                                }
                            } catch (Throwable unused5) {
                            }
                        }
                        return createBitmap;
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            th.printStackTrace();
                            if (allocation2 != null) {
                                try {
                                    allocation2.destroy();
                                } catch (Throwable unused6) {
                                }
                            }
                            if (allocation != null) {
                                try {
                                    allocation.destroy();
                                } catch (Throwable unused7) {
                                }
                            }
                            if (scriptIntrinsicBlur != null) {
                                try {
                                    scriptIntrinsicBlur.destroy();
                                } catch (Throwable unused8) {
                                }
                            }
                            if (renderScript != null) {
                                try {
                                    renderScript.destroy();
                                } catch (Throwable unused9) {
                                }
                            }
                            if (bitmap2 != null && bitmap2 != bitmap) {
                                try {
                                    if (!bitmap2.isRecycled()) {
                                        bitmap2.recycle();
                                    }
                                } catch (Throwable unused10) {
                                }
                            }
                            return null;
                        } finally {
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    allocation2 = null;
                }
            } catch (Throwable th5) {
                th = th5;
                allocation = null;
                allocation2 = allocation;
                th.printStackTrace();
                if (allocation2 != null) {
                }
                if (allocation != null) {
                }
                if (scriptIntrinsicBlur != null) {
                }
                if (renderScript != null) {
                }
                if (bitmap2 != null) {
                    if (!bitmap2.isRecycled()) {
                    }
                }
                return null;
            }
        } catch (Throwable th6) {
            th = th6;
            scriptIntrinsicBlur = null;
            allocation = scriptIntrinsicBlur;
            allocation2 = allocation;
            th.printStackTrace();
            if (allocation2 != null) {
            }
            if (allocation != null) {
            }
            if (scriptIntrinsicBlur != null) {
            }
            if (renderScript != null) {
            }
            if (bitmap2 != null) {
            }
            return null;
        }
    }

    public static void a(final Context context, final Bitmap bitmap, final a aVar) {
        com.anythink.core.common.d.t.b();
        com.anythink.core.common.d.t.c(new Runnable() { // from class: com.anythink.core.common.v.h.1
            @Override // java.lang.Runnable
            public final void run() {
                final Bitmap a9 = h.a(context, bitmap);
                com.anythink.core.common.d.t.b().b(new Runnable() { // from class: com.anythink.core.common.v.h.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        Bitmap bitmap2;
                        a aVar2 = aVar;
                        if (aVar2 == null || (bitmap2 = a9) == null) {
                            return;
                        }
                        aVar2.a(bitmap2);
                    }
                });
            }
        });
    }

    public static InputStream a(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                try {
                    byteArrayOutputStream.close();
                } catch (Exception unused) {
                }
                return byteArrayInputStream;
            } catch (Exception unused2) {
                if (byteArrayOutputStream == null) {
                    return null;
                }
                try {
                    byteArrayOutputStream.close();
                    return null;
                } catch (Exception unused3) {
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream2 = byteArrayOutputStream;
                if (byteArrayOutputStream2 != null) {
                    try {
                        byteArrayOutputStream2.close();
                    } catch (Exception unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
            byteArrayOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
