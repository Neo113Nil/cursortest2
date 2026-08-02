package com.squareup.cash.moneybot.views.home;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Looper;
import android.os.SystemClock;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.compose.ui.graphics.Color;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.math.DoubleUtils;
import com.squareup.cash.R;
import com.squareup.cash.graphics.views.TextureViewRenderer;
import com.squareup.cash.moneybot.views.card.InsightChartKt$$ExternalSyntheticLambda19;
import com.squareup.moshi.LinkedHashTreeMap;
import com.squareup.scannerview.CameraOperator;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes4.dex */
public final class ParticleGridRenderer extends TextureViewRenderer implements DefaultLifecycleObserver {
    public int asciiAtlasTexId;
    public final Context context;
    public final long glyphColor;
    public final GridStyle gridStyle;
    public ByteBuffer particleTexBuffer;
    public int particleTexId;
    public int positionHandle;
    public int program;
    public final FloatBuffer quadVertices;
    public CameraOperator.AnonymousClass2 renderHandler;
    public LinkedHashTreeMap.AvlBuilder state;
    public int surfaceHeight;
    public int surfaceWidth;
    public volatile boolean touchActive;
    public volatile float touchX;
    public volatile float touchY;
    public int uAsciiAtlas;
    public int uBaseOpacity;
    public int uCharSize;
    public int uCharSizeMax;
    public int uDotColor;
    public int uDotSpacing;
    public int uGridMargin;
    public int uGridOpacity;
    public int uGridSize;
    public int uGridStyle;
    public int uMaxDelta;
    public int uMaxDotRadius;
    public int uParticleTex;
    public int uRectAspect;
    public int uResolution;
    public int uvHandle;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ParticleGridRenderer(Context context, GridStyle gridStyle, long j) {
        super(r0);
        InsightChartKt$$ExternalSyntheticLambda19 insightChartKt$$ExternalSyntheticLambda19 = new InsightChartKt$$ExternalSyntheticLambda19(18);
        context.getClass();
        gridStyle.getClass();
        this.context = context;
        this.gridStyle = gridStyle;
        this.glyphColor = j;
        this.positionHandle = -1;
        this.uvHandle = -1;
        this.uResolution = -1;
        this.uDotSpacing = -1;
        this.uMaxDotRadius = -1;
        this.uBaseOpacity = -1;
        this.uGridOpacity = -1;
        this.uDotColor = -1;
        this.uParticleTex = -1;
        this.uGridSize = -1;
        this.uGridStyle = -1;
        this.uRectAspect = -1;
        this.uAsciiAtlas = -1;
        this.uGridMargin = -1;
        this.uMaxDelta = -1;
        this.uCharSize = -1;
        this.uCharSizeMax = -1;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(64).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(new float[]{-1.0f, -1.0f, RecyclerView.DECELERATION_RATE, 1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f, 1.0f, 1.0f, RecyclerView.DECELERATION_RATE});
        asFloatBuffer.position(0);
        this.quadVertices = asFloatBuffer;
    }

    public static void setUniform1f(float f, int i) {
        if (i >= 0) {
            GLES20.glUniform1f(i, f);
        }
    }

    @Override // com.squareup.cash.graphics.views.TextureViewRenderer
    public final void destroy() {
        CameraOperator.AnonymousClass2 anonymousClass2 = this.renderHandler;
        if (anonymousClass2 != null) {
            anonymousClass2.removeMessages(0);
        }
        int i = this.program;
        if (i != 0) {
            GLES20.glDeleteProgram(i);
            this.program = 0;
        }
        int i2 = this.particleTexId;
        if (i2 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i2}, 0);
            this.particleTexId = 0;
        }
        int i3 = this.asciiAtlasTexId;
        if (i3 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i3}, 0);
            this.asciiAtlasTexId = 0;
        }
    }

    @Override // com.squareup.cash.graphics.views.TextureViewRenderer
    public final void draw$1() {
        float f;
        float f2;
        int i;
        SystemClock.uptimeMillis();
        LinkedHashTreeMap.AvlBuilder avlBuilder = this.state;
        String str = "state";
        if (avlBuilder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("state");
            throw null;
        }
        boolean z = this.touchActive;
        float f3 = this.touchX;
        float f4 = this.touchY;
        float[] fArr = (float[]) avlBuilder.stack;
        int i2 = avlBuilder.size;
        float f5 = ParticleConstants.TRAIL_DECAY;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i3 * 8;
            int i5 = i4 + 4;
            float f6 = fArr[i5];
            int i6 = i4 + 5;
            float f7 = fArr[i6];
            if (z) {
                float f8 = fArr[i4] - f3;
                float f9 = fArr[i4 + 1] - f4;
                float f10 = (f9 * f9) + (f8 * f8);
                i = i3;
                float sqrt = (float) Math.sqrt(f10);
                if (sqrt < 750.0f && sqrt > 0.001f) {
                    float sqrt2 = (float) Math.sqrt(1.0f - (sqrt / 750.0f));
                    int i7 = i4 + 6;
                    if (sqrt2 > fArr[i7]) {
                        fArr[i7] = sqrt2;
                    }
                }
            } else {
                i = i3;
            }
            int i8 = i4 + 7;
            fArr[i8] = fArr[i8] * f5;
            int i9 = i4 + 6;
            fArr[i9] = fArr[i9] * f5;
            int i10 = i4 + 2;
            int i11 = i2;
            fArr[i10] = CameraState$Type$EnumUnboxingLocalUtility.m(f6, fArr[i4], 0.005f, fArr[i10]);
            int i12 = i4 + 3;
            int i13 = i4 + 1;
            String str2 = str;
            fArr[i12] = CameraState$Type$EnumUnboxingLocalUtility.m(f7, fArr[i13], 0.005f, fArr[i12]);
            fArr[i10] = fArr[i10] * 0.909f;
            fArr[i12] = fArr[i12] * 0.909f;
            fArr[i4] = fArr[i4] + fArr[i10];
            float f11 = fArr[i13] + fArr[i12];
            fArr[i13] = f11;
            float f12 = fArr[i4] - fArr[i5];
            float f13 = f11 - fArr[i6];
            float f14 = (f13 * f13) + (f12 * f12);
            if (f14 > 1225.0f) {
                float sqrt3 = 35.0f / ((float) Math.sqrt(f14));
                fArr[i4] = (f12 * sqrt3) + fArr[i5];
                fArr[i13] = (f13 * sqrt3) + fArr[i6];
            }
            i3 = i + 1;
            i2 = i11;
            str = str2;
        }
        String str3 = str;
        LinkedHashTreeMap.AvlBuilder avlBuilder2 = this.state;
        if (avlBuilder2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str3);
            throw null;
        }
        float[] fArr2 = (float[]) avlBuilder2.stack;
        ByteBuffer byteBuffer = this.particleTexBuffer;
        if (byteBuffer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("particleTexBuffer");
            throw null;
        }
        byteBuffer.position(0);
        LinkedHashTreeMap.AvlBuilder avlBuilder3 = this.state;
        if (avlBuilder3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str3);
            throw null;
        }
        int i14 = avlBuilder3.size;
        for (int i15 = 0; i15 < i14; i15++) {
            int i16 = i15 * 8;
            float f15 = fArr2[i16] - fArr2[i16 + 4];
            float f16 = fArr2[i16 + 1] - fArr2[i16 + 5];
            byteBuffer.put((byte) RangesKt___RangesKt.coerceIn((int) ((f15 * 1.275f) + 127.5f), 0, 255));
            byteBuffer.put((byte) RangesKt___RangesKt.coerceIn((int) ((f16 * 1.275f) + 127.5f), 0, 255));
            byteBuffer.put((byte) RangesKt___RangesKt.coerceIn((int) (fArr2[i16 + 6] * 255.0f), 0, 255));
            byteBuffer.put((byte) -1);
        }
        byteBuffer.position(0);
        GLES20.glBindTexture(3553, this.particleTexId);
        LinkedHashTreeMap.AvlBuilder avlBuilder4 = this.state;
        if (avlBuilder4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str3);
            throw null;
        }
        GLES20.glTexImage2D(3553, 0, 6408, avlBuilder4.leavesToSkip, avlBuilder4.leavesSkipped, 0, 6408, 5121, byteBuffer);
        GLES20.glUseProgram(this.program);
        int ordinal = this.gridStyle.ordinal();
        if (ordinal == 0) {
            f = 20.0f;
        } else {
            if (ordinal != 1 && ordinal != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            f = 46.0f;
        }
        int i17 = this.uResolution;
        float f17 = this.surfaceWidth;
        float f18 = this.surfaceHeight;
        if (i17 >= 0) {
            GLES20.glUniform2f(i17, f17, f18);
        }
        setUniform1f(f, this.uDotSpacing);
        setUniform1f(4.0f, this.uMaxDotRadius);
        int i18 = this.uBaseOpacity;
        int ordinal2 = this.gridStyle.ordinal();
        if (ordinal2 == 0) {
            f2 = 0.3f;
        } else if (ordinal2 == 1) {
            f2 = 0.5f;
        } else {
            if (ordinal2 != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            f2 = 1.0f;
        }
        setUniform1f(f2, i18);
        float f19 = 1.0f;
        setUniform1f(1.0f, this.uGridOpacity);
        int i19 = this.uDotColor;
        if (i19 >= 0) {
            GLES20.glUniform3f(i19, Color.m681getRedimpl(this.glyphColor), Color.m680getGreenimpl(this.glyphColor), Color.m678getBlueimpl(this.glyphColor));
        }
        int i20 = this.uGridSize;
        LinkedHashTreeMap.AvlBuilder avlBuilder5 = this.state;
        if (avlBuilder5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str3);
            throw null;
        }
        float f20 = avlBuilder5.leavesToSkip;
        float f21 = avlBuilder5.leavesSkipped;
        if (i20 >= 0) {
            GLES20.glUniform2f(i20, f20, f21);
        }
        int i21 = this.uGridStyle;
        int ordinal3 = this.gridStyle.ordinal();
        if (ordinal3 == 0) {
            f19 = 0.0f;
        } else if (ordinal3 != 1) {
            if (ordinal3 != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            f19 = 2.0f;
        }
        setUniform1f(f19, i21);
        setUniform1f(RecyclerView.DECELERATION_RATE, this.uRectAspect);
        setUniform1f(f * 4.0f, this.uGridMargin);
        setUniform1f(100.0f, this.uMaxDelta);
        setUniform1f(44.0f, this.uCharSize);
        setUniform1f(56.0f, this.uCharSizeMax);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.particleTexId);
        int i22 = this.uParticleTex;
        if (i22 >= 0) {
            GLES20.glUniform1i(i22, 0);
        }
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, this.asciiAtlasTexId);
        int i23 = this.uAsciiAtlas;
        if (i23 >= 0) {
            GLES20.glUniform1i(i23, 1);
        }
        int i24 = this.positionHandle;
        if (i24 >= 0) {
            GLES20.glEnableVertexAttribArray(i24);
            this.quadVertices.position(0);
            GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 16, (Buffer) this.quadVertices);
        }
        int i25 = this.uvHandle;
        if (i25 >= 0) {
            GLES20.glEnableVertexAttribArray(i25);
            this.quadVertices.position(2);
            GLES20.glVertexAttribPointer(this.uvHandle, 2, 5126, false, 16, (Buffer) this.quadVertices);
        }
        GLES20.glDrawArrays(5, 0, 4);
        int i26 = this.positionHandle;
        if (i26 >= 0) {
            GLES20.glDisableVertexAttribArray(i26);
        }
        int i27 = this.uvHandle;
        if (i27 >= 0) {
            GLES20.glDisableVertexAttribArray(i27);
        }
    }

    @Override // com.squareup.cash.graphics.views.TextureViewRenderer
    public final void init(int i, int i2) {
        float f;
        int i3;
        Bitmap createBitmap;
        int i4;
        this.surfaceWidth = i;
        this.surfaceHeight = i2;
        SystemClock.uptimeMillis();
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        this.renderHandler = new CameraOperator.AnonymousClass2(this, myLooper, 6);
        GridStyle gridStyle = this.gridStyle;
        int ordinal = gridStyle.ordinal();
        int i5 = 1;
        if (ordinal == 0) {
            f = 20.0f;
        } else {
            if (ordinal != 1 && ordinal != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            f = 46.0f;
        }
        float f2 = 4.0f * f;
        float f3 = 2.0f;
        float f4 = f2 * 2.0f;
        int i6 = ((int) ((i + f4) / f)) + 2;
        int i7 = ((int) ((i2 + f4) / f)) + 2;
        LinkedHashTreeMap.AvlBuilder avlBuilder = new LinkedHashTreeMap.AvlBuilder(i6, i7);
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i9 >= i7) {
                break;
            }
            int i10 = 0;
            while (i10 < i6) {
                int m$1 = Fragment$5$$ExternalSyntheticOutline0.m$1(i9, i6, i10, 8);
                float f5 = 0.5f * f;
                float f6 = ((i10 * f) + f5) - f2;
                float f7 = f3;
                float f8 = ((i9 * f) + f5) - f2;
                float[] fArr = (float[]) avlBuilder.stack;
                fArr[m$1] = f6;
                fArr[m$1 + 1] = f8;
                fArr[m$1 + 4] = f6;
                fArr[m$1 + 5] = f8;
                i10++;
                f3 = f7;
            }
            i9++;
        }
        float f9 = f3;
        this.state = avlBuilder;
        ByteBuffer order = ByteBuffer.allocateDirect(avlBuilder.leavesToSkip * avlBuilder.leavesSkipped * 4).order(ByteOrder.nativeOrder());
        order.getClass();
        this.particleTexBuffer = order;
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i11 = iArr[0];
        this.particleTexId = i11;
        GLES20.glBindTexture(3553, i11);
        GLES20.glTexParameteri(3553, 10241, 9728);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        if (gridStyle == GridStyle.ASCII || gridStyle == GridStyle.GLYPH) {
            if (gridStyle == GridStyle.GLYPH) {
                int[] iArr2 = {R.drawable.particle_glyph_0, R.drawable.particle_glyph_1, R.drawable.particle_glyph_2, R.drawable.particle_glyph_3, R.drawable.particle_glyph_4};
                int[] iArr3 = {36, 36, 72, 72, 72};
                createBitmap = Bitmap.createBitmap(480, 96, Bitmap.Config.ARGB_8888);
                createBitmap.getClass();
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(3);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = false;
                int i12 = 0;
                for (i3 = 5; i12 < i3; i3 = 5) {
                    Bitmap decodeResource = BitmapFactory.decodeResource(this.context.getResources(), iArr2[i12], options);
                    decodeResource.getClass();
                    int width = decodeResource.getWidth();
                    int height = decodeResource.getHeight();
                    int[] iArr4 = new int[width * height];
                    decodeResource.getPixels(iArr4, 0, width, 0, 0, width, height);
                    int i13 = i8;
                    int i14 = i13;
                    int i15 = i14;
                    int i16 = width;
                    int i17 = height;
                    while (i13 < height) {
                        int[] iArr5 = iArr2;
                        int i18 = i8;
                        int i19 = i15;
                        while (i18 < width) {
                            int[] iArr6 = iArr3;
                            if (((iArr4[(i13 * width) + i18] >> 16) & 255) > 0) {
                                if (i18 < i16) {
                                    i16 = i18;
                                }
                                if (i18 > i14) {
                                    i14 = i18;
                                }
                                if (i13 < i17) {
                                    i17 = i13;
                                }
                                if (i13 > i19) {
                                    i19 = i13;
                                }
                            }
                            i18++;
                            iArr3 = iArr6;
                        }
                        i13++;
                        iArr2 = iArr5;
                        i15 = i19;
                        i8 = 0;
                    }
                    int[] iArr7 = iArr2;
                    int[] iArr8 = iArr3;
                    Rect rect = i14 >= i16 ? new Rect(i16, i17, i14 + 1, i15 + 1) : new Rect(0, 0, width, height);
                    int width2 = rect.width();
                    float max = iArr8[i12] / Math.max(width2, r2);
                    int i20 = (int) (width2 * max);
                    int height2 = (int) (rect.height() * max);
                    int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(96, i20, 2, i12 * 96);
                    int i21 = (96 - height2) / 2;
                    canvas.drawBitmap(decodeResource, rect, new Rect(m, i21, i20 + m, height2 + i21), paint);
                    decodeResource.recycle();
                    i12++;
                    iArr2 = iArr7;
                    iArr3 = iArr8;
                    i5 = 1;
                    i8 = 0;
                }
                i4 = i5;
            } else {
                List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"‧", "•", "✸", "⬙", "$"});
                createBitmap = Bitmap.createBitmap(listOf.size() * 96, 96, Bitmap.Config.ARGB_8888);
                createBitmap.getClass();
                Canvas canvas2 = new Canvas(createBitmap);
                canvas2.drawColor(0);
                Paint paint2 = new Paint(1);
                paint2.setColor(-1);
                paint2.setTextSize(80.0f);
                paint2.setTypeface(Typeface.DEFAULT_BOLD);
                paint2.setTextAlign(Paint.Align.CENTER);
                Paint.FontMetrics fontMetrics = paint2.getFontMetrics();
                float f10 = 48.0f - ((fontMetrics.ascent + fontMetrics.descent) / f9);
                Iterator it = listOf.iterator();
                int i22 = 0;
                while (it.hasNext()) {
                    canvas2.drawText((String) it.next(), (i22 * 96) + 48.0f, f10, paint2);
                    i22++;
                }
                i4 = 1;
            }
            int[] iArr9 = new int[i4];
            GLES20.glGenTextures(i4, iArr9, 0);
            int i23 = iArr9[0];
            this.asciiAtlasTexId = i23;
            GLES20.glBindTexture(3553, i23);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLUtils.texImage2D(3553, 0, createBitmap, 0);
            createBitmap.recycle();
        }
        int createProgram = DoubleUtils.createProgram(DoubleUtils.loadShader(35633, "\n      attribute vec2 position;\n      attribute vec2 textureCoord;\n      varying vec2 vUV;\n      void main() {\n        gl_Position = vec4(position, 0.0, 1.0);\n        vUV = textureCoord;\n      }\n    "), DoubleUtils.loadShader(35632, "\n      precision highp float;\n      varying vec2 vUV;\n\n      uniform vec2 resolution;\n      uniform float dotSpacing;\n      uniform float maxDotRadius;\n      uniform float baseOpacity;\n      uniform float gridOpacity;\n      uniform vec3 dotColor;\n      uniform sampler2D particleTex;\n      uniform vec2 gridSize;\n      uniform float gridStyle;\n      uniform sampler2D asciiAtlas;\n      uniform float gridMargin;\n      uniform float maxDelta;\n      uniform float charSize;\n      uniform float charSizeMax;\n\n      void main() {\n        vec2 pixelPos = vUV * resolution;\n\n        // Use the same margin as CPU grid init (spacing * 4)\n        float margin = gridMargin;\n\n        // Which grid cell is this pixel in?\n        float gx = (pixelPos.x + margin) / dotSpacing;\n        float gy = (pixelPos.y + margin) / dotSpacing;\n        int centerCellX = int(floor(gx));\n        int centerCellY = int(floor(gy));\n\n        float alpha = 0.0;\n        float highlight = 0.0;\n\n        for (int dy = -2; dy <= 2; dy++) {\n          for (int dx = -2; dx <= 2; dx++) {\n            int cellX = centerCellX + dx;\n            int cellY = centerCellY + dy;\n            if (cellX < 0 || cellY < 0 ||\n                cellX >= int(gridSize.x) || cellY >= int(gridSize.y)) continue;\n\n            // Compute base position from cell index (matches CPU createParticleGrid)\n            vec2 basePos = vec2(\n              float(cellX) * dotSpacing + dotSpacing * 0.5 - margin,\n              float(cellY) * dotSpacing + dotSpacing * 0.5 - margin\n            );\n\n            // Read particle delta from data texture\n            vec2 texCoord = (vec2(float(cellX), float(cellY)) + 0.5) / gridSize;\n            vec4 pData = texture2D(particleTex, texCoord);\n            // Decode delta: [0,1] -> [-maxDelta, +maxDelta]\n            vec2 delta = (pData.xy - 0.5) * 2.0 * maxDelta;\n            vec2 particlePos = basePos + delta;\n            float pHighlight = pData.z;\n\n            vec2 diff = pixelPos - particlePos;\n            float dist = length(diff);\n            float shapeMask = 0.0;\n\n            if (gridStyle > 0.5) {\n              // ASCII/GLYPH mode: characters grow from charSize to charSizeMax when highlighted\n              float adjustedCharSize = mix(charSize, charSizeMax, pHighlight);\n              vec2 cellUV = diff / adjustedCharSize + 0.5;\n              if (cellUV.x >= 0.0 && cellUV.x <= 1.0 && cellUV.y >= 0.0 && cellUV.y <= 1.0) {\n                int charIdx = int(clamp(pHighlight * 4.99, 0.0, 4.0));\n                float atlasU = (float(charIdx) + cellUV.x) / 5.0;\n                // Both ASCII text and GLYPH PNGs store shape in RGB (white on black)\n                shapeMask = texture2D(asciiAtlas, vec2(atlasU, cellUV.y)).r;\n              }\n            } else {\n              // Dot mode: dots grow up to 1.5x when highlighted (matching iOS)\n              float adjustedRadius = mix(maxDotRadius, maxDotRadius * 1.5, pHighlight);\n              shapeMask = 1.0 - smoothstep(adjustedRadius - 1.0, adjustedRadius + 1.0, dist);\n            }\n\n            if (shapeMask > alpha) {\n              alpha = shapeMask;\n              highlight = pHighlight;\n            }\n          }\n        }\n\n        // Fade to transparent at the bottom 30% (vUV.y=1 is bottom)\n        float fadeFactor = 1.0 - smoothstep(0.7, 1.0, vUV.y);\n\n        float opacity = baseOpacity + highlight * (1.0 - baseOpacity);\n        float finalAlpha = alpha * opacity * gridOpacity * fadeFactor;\n        gl_FragColor = vec4(dotColor * finalAlpha, finalAlpha);\n      }\n    "));
        this.program = createProgram;
        this.positionHandle = GLES20.glGetAttribLocation(createProgram, "position");
        this.uvHandle = GLES20.glGetAttribLocation(this.program, "textureCoord");
        this.uResolution = GLES20.glGetUniformLocation(this.program, "resolution");
        this.uDotSpacing = GLES20.glGetUniformLocation(this.program, "dotSpacing");
        this.uMaxDotRadius = GLES20.glGetUniformLocation(this.program, "maxDotRadius");
        this.uBaseOpacity = GLES20.glGetUniformLocation(this.program, "baseOpacity");
        this.uGridOpacity = GLES20.glGetUniformLocation(this.program, "gridOpacity");
        this.uDotColor = GLES20.glGetUniformLocation(this.program, "dotColor");
        this.uParticleTex = GLES20.glGetUniformLocation(this.program, "particleTex");
        this.uGridSize = GLES20.glGetUniformLocation(this.program, "gridSize");
        this.uGridStyle = GLES20.glGetUniformLocation(this.program, "gridStyle");
        this.uRectAspect = GLES20.glGetUniformLocation(this.program, "rectAspect");
        this.uAsciiAtlas = GLES20.glGetUniformLocation(this.program, "asciiAtlas");
        this.uGridMargin = GLES20.glGetUniformLocation(this.program, "gridMargin");
        this.uMaxDelta = GLES20.glGetUniformLocation(this.program, "maxDelta");
        this.uCharSize = GLES20.glGetUniformLocation(this.program, "charSize");
        this.uCharSizeMax = GLES20.glGetUniformLocation(this.program, "charSizeMax");
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        scheduleFrame();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        CameraOperator.AnonymousClass2 anonymousClass2 = this.renderHandler;
        if (anonymousClass2 != null) {
            anonymousClass2.removeMessages(0);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        if (this.renderHandler != null) {
            scheduleFrame();
        }
    }

    public final void scheduleFrame() {
        CameraOperator.AnonymousClass2 anonymousClass2 = this.renderHandler;
        if (anonymousClass2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("renderHandler");
            throw null;
        }
        if (anonymousClass2.hasMessages(0)) {
            return;
        }
        CameraOperator.AnonymousClass2 anonymousClass22 = this.renderHandler;
        if (anonymousClass22 != null) {
            anonymousClass22.sendMessageDelayed(anonymousClass22.obtainMessage(0), 16L);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("renderHandler");
            throw null;
        }
    }
}
