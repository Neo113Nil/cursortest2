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
        char c4;
        int i;
        int i4;
        int i9;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i10 = width * height;
        int[] iArr = new int[i10];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int i11 = width - 1;
        int i12 = height - 1;
        int[] iArr2 = new int[i10];
        int[] iArr3 = new int[i10];
        int[] iArr4 = new int[i10];
        int[] iArr5 = new int[Math.max(width, height)];
        int[] iArr6 = new int[173056];
        int i13 = 0;
        for (int i14 = 0; i14 < 173056; i14++) {
            iArr6[i14] = i14 / 676;
        }
        char c9 = 2;
        boolean z8 = true;
        char c10 = '3';
        int[][] iArr7 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 51, 3);
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            c4 = c9;
            i = 25;
            if (i15 >= height) {
                break;
            }
            int i18 = i13;
            int i19 = i18;
            int i20 = i19;
            int i21 = i20;
            int i22 = i21;
            int i23 = i22;
            int i24 = i23;
            int i25 = i24;
            boolean z9 = z8;
            int i26 = -25;
            int i27 = i25;
            while (i26 <= 25) {
                char c11 = c10;
                int i28 = iArr[Math.min(i11, Math.max(i26, i13)) + i16];
                int[] iArr8 = iArr7[i26 + 25];
                iArr8[i13] = (i28 & 16711680) >> 16;
                iArr8[z9 ? 1 : 0] = (i28 & 65280) >> 8;
                iArr8[c4] = i28 & com.anythink.basead.exoplayer.k.p.f8630b;
                int abs = 26 - Math.abs(i26);
                int i29 = iArr8[i13];
                i27 = (i29 * abs) + i27;
                int i30 = iArr8[z9 ? 1 : 0];
                i18 = (i30 * abs) + i18;
                int i31 = iArr8[c4];
                i19 = (abs * i31) + i19;
                if (i26 > 0) {
                    i23 += i29;
                    i24 += i30;
                    i25 += i31;
                } else {
                    i20 += i29;
                    i21 += i30;
                    i22 += i31;
                }
                i26++;
                c10 = c11;
            }
            char c12 = c10;
            int i32 = i13;
            while (i32 < width) {
                iArr2[i16] = iArr6[i27];
                iArr3[i16] = iArr6[i18];
                iArr4[i16] = iArr6[i19];
                int i33 = i27 - i20;
                int i34 = i18 - i21;
                int i35 = i19 - i22;
                int[] iArr9 = iArr7[(i + 26) % 51];
                int i36 = i20 - iArr9[i13];
                int i37 = i21 - iArr9[z9 ? 1 : 0];
                int i38 = i22 - iArr9[c4];
                if (i15 == 0) {
                    i9 = i13;
                    iArr5[i32] = Math.min(i32 + 26, i11);
                } else {
                    i9 = i13;
                }
                int i39 = iArr[i17 + iArr5[i32]];
                int i40 = (i39 & 16711680) >> 16;
                iArr9[i9] = i40;
                int i41 = (i39 & 65280) >> 8;
                iArr9[z9 ? 1 : 0] = i41;
                int i42 = i39 & com.anythink.basead.exoplayer.k.p.f8630b;
                iArr9[c4] = i42;
                int i43 = i23 + i40;
                int i44 = i24 + i41;
                int i45 = i25 + i42;
                i27 = i33 + i43;
                i18 = i34 + i44;
                i19 = i35 + i45;
                i = (i + 1) % 51;
                int[] iArr10 = iArr7[i % 51];
                int i46 = iArr10[i9];
                i20 = i36 + i46;
                int i47 = iArr10[z9 ? 1 : 0];
                i21 = i37 + i47;
                int i48 = iArr10[c4];
                i22 = i38 + i48;
                i23 = i43 - i46;
                i24 = i44 - i47;
                i25 = i45 - i48;
                i16++;
                i32++;
                i13 = i9;
            }
            i17 += width;
            i15++;
            c9 = c4;
            z8 = z9 ? 1 : 0;
            c10 = c12;
        }
        int i49 = i13;
        boolean z10 = z8;
        int i50 = i49;
        while (i50 < width) {
            int i51 = width * (-25);
            int i52 = i50;
            int i53 = -25;
            int i54 = i49;
            int i55 = i54;
            int i56 = i55;
            int i57 = i56;
            int i58 = i57;
            int i59 = i58;
            int i60 = i59;
            int i61 = i60;
            int i62 = i61;
            while (i53 <= i) {
                int i63 = i49;
                int max = Math.max(i63, i51) + i52;
                int[] iArr11 = iArr7[i53 + 25];
                iArr11[i63] = iArr2[max];
                iArr11[z10 ? 1 : 0] = iArr3[max];
                iArr11[c4] = iArr4[max];
                int abs2 = 26 - Math.abs(i53);
                i54 = (iArr2[max] * abs2) + i54;
                i55 = (iArr3[max] * abs2) + i55;
                i56 = (iArr4[max] * abs2) + i56;
                if (i53 > 0) {
                    i60 += iArr11[0];
                    i61 += iArr11[z10 ? 1 : 0];
                    i62 += iArr11[c4];
                } else {
                    i57 += iArr11[0];
                    i58 += iArr11[z10 ? 1 : 0];
                    i59 += iArr11[c4];
                }
                if (i53 < i12) {
                    i51 += width;
                }
                i53++;
                i = 25;
                i49 = 0;
            }
            int i64 = i52;
            int i65 = 25;
            for (int i66 = 0; i66 < height; i66++) {
                iArr[i64] = (iArr[i64] & (-16777216)) | (iArr6[i54] << 16) | (iArr6[i55] << 8) | iArr6[i56];
                int i67 = i54 - i57;
                int i68 = i55 - i58;
                int i69 = i56 - i59;
                int[] iArr12 = iArr7[(i65 + 26) % 51];
                int i70 = i57 - iArr12[0];
                int i71 = i58 - iArr12[z10 ? 1 : 0];
                int i72 = i59 - iArr12[c4];
                if (i52 == 0) {
                    i4 = i64;
                    iArr5[i66] = Math.min(i66 + 26, i12) * width;
                } else {
                    i4 = i64;
                }
                int i73 = i52 + iArr5[i66];
                int i74 = iArr2[i73];
                iArr12[0] = i74;
                int i75 = iArr3[i73];
                iArr12[z10 ? 1 : 0] = i75;
                int i76 = iArr4[i73];
                iArr12[c4] = i76;
                int i77 = i60 + i74;
                int i78 = i61 + i75;
                int i79 = i62 + i76;
                i54 = i67 + i77;
                i55 = i68 + i78;
                i56 = i69 + i79;
                i65 = (i65 + 1) % 51;
                int[] iArr13 = iArr7[i65];
                int i80 = iArr13[0];
                i57 = i70 + i80;
                int i81 = iArr13[z10 ? 1 : 0];
                i58 = i71 + i81;
                int i82 = iArr13[c4];
                i59 = i72 + i82;
                i60 = i77 - i80;
                i61 = i78 - i81;
                i62 = i79 - i82;
                i64 = i4 + width;
            }
            i49 = 0;
            i50 = i52 + 1;
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
        } catch (OutOfMemoryError e6) {
            e6.printStackTrace();
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static Bitmap a(Context context, int i, int i4, int i9) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeResource(context.getResources(), i, options);
            options.inSampleSize = a(options.outWidth, options.outHeight, i4, i9);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeResource(context.getResources(), i, options);
        } catch (OutOfMemoryError e6) {
            e6.printStackTrace();
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static int a(int i, int i4, int i9, int i10) {
        int i11 = 1;
        if (i9 <= 0 && i10 <= 0) {
            return 1;
        }
        while (i / i11 > i9 && i4 / i11 > i10) {
            i11 *= 2;
        }
        return i11;
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
            com.anythink.basead.b.c.i.v("Error", "Error, cannot access an invalid/free'd bitmap here!");
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
