package com.squareup.cash.card.onboarding.opengl.renderer;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.opengl.GLES20;
import android.os.Looper;
import android.os.SystemClock;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.google.common.math.DoubleUtils;
import com.squareup.cash.R;
import com.squareup.cash.card.onboarding.BitmapsKt;
import com.squareup.cash.graphics.backend.engine.TextureType;
import com.squareup.cash.graphics.views.TextureViewRenderer;
import com.squareup.scannerview.CameraOperator;
import java.nio.Buffer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class HeatRenderer extends TextureViewRenderer implements DefaultLifecycleObserver {
    public final Context context;
    public final long coolingDelayMs;
    public CameraOperator.AnonymousClass2 handler;
    public Bitmap heatMap;
    public int heatMapTextureId;
    public int heatMaskTextureId;
    public final long heatingThrottleMs;
    public final Integer initialHeatMap;
    public long lastUpdate;
    public final int mask;
    public MoodHeatProgram program;
    public int temperatureMapTextureId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeatRenderer(Context context, Integer num, long j, long j2, Function1 function1) {
        super(function1);
        context.getClass();
        function1.getClass();
        this.context = context;
        this.mask = R.drawable.mood_skin;
        this.initialHeatMap = num;
        this.coolingDelayMs = j;
        this.heatingThrottleMs = j2;
        this.heatMapTextureId = -1;
        this.temperatureMapTextureId = -1;
        this.heatMaskTextureId = -1;
        this.lastUpdate = SystemClock.uptimeMillis();
    }

    public final void applyHeat(float f, float f2) {
        if (this.handler != null && SystemClock.uptimeMillis() - this.lastUpdate >= this.heatingThrottleMs) {
            this.lastUpdate = SystemClock.uptimeMillis();
            CameraOperator.AnonymousClass2 anonymousClass2 = this.handler;
            if (anonymousClass2 != null) {
                anonymousClass2.sendMessage(anonymousClass2.obtainMessage(0, (int) f, (int) f2));
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("handler");
                throw null;
            }
        }
    }

    public final void coolHeatInternal() {
        Bitmap bitmap = this.heatMap;
        if (bitmap == null) {
            Intrinsics.throwUninitializedPropertyAccessException("heatMap");
            throw null;
        }
        Bitmap coolHeat = BitmapsKt.coolHeat(bitmap);
        Bitmap bitmap2 = this.heatMap;
        if (bitmap2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("heatMap");
            throw null;
        }
        Canvas canvas = new Canvas(bitmap2);
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        canvas.drawBitmap(coolHeat, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, paint);
        Bitmap bitmap3 = this.heatMap;
        if (bitmap3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("heatMap");
            throw null;
        }
        DoubleUtils.updateTexture(this.heatMapTextureId, bitmap3, TextureType.COLOR);
        redraw();
        CameraOperator.AnonymousClass2 anonymousClass2 = this.handler;
        if (anonymousClass2 != null) {
            anonymousClass2.sendMessageDelayed(anonymousClass2.obtainMessage(1), this.coolingDelayMs);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("handler");
            throw null;
        }
    }

    @Override // com.squareup.cash.graphics.views.TextureViewRenderer
    public final void destroy() {
        MoodHeatProgram moodHeatProgram = this.program;
        if (moodHeatProgram == null) {
            Intrinsics.throwUninitializedPropertyAccessException("program");
            throw null;
        }
        GLES20.glDeleteProgram(moodHeatProgram.programHandle);
        GLES20.glDeleteShader(moodHeatProgram.vertexShader);
        GLES20.glDeleteShader(moodHeatProgram.fragmentShader);
        GLES20.glDeleteTextures(1, new int[]{this.heatMapTextureId}, 0);
        GLES20.glDeleteTextures(1, new int[]{this.temperatureMapTextureId}, 0);
        GLES20.glDeleteTextures(1, new int[]{this.heatMaskTextureId}, 0);
    }

    @Override // com.squareup.cash.graphics.views.TextureViewRenderer
    public final void draw$1() {
        MoodHeatProgram moodHeatProgram = this.program;
        if (moodHeatProgram == null) {
            Intrinsics.throwUninitializedPropertyAccessException("program");
            throw null;
        }
        GLES20.glUseProgram(moodHeatProgram.programHandle);
        DoubleUtils.checkGlError("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, moodHeatProgram.heatMapTextureId);
        GLES20.glUniform1i(moodHeatProgram.temperatureMapLocation, 1);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, moodHeatProgram.temperatureMapTextureId);
        GLES20.glUniform1i(moodHeatProgram.heatMaskLocation, 2);
        GLES20.glActiveTexture(33986);
        GLES20.glBindTexture(3553, moodHeatProgram.heatMaskTextureId);
        int i = moodHeatProgram.positionLocation;
        GLES20.glEnableVertexAttribArray(i);
        DoubleUtils.checkGlError("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(moodHeatProgram.positionLocation, 2, 5126, false, 8, (Buffer) MoodHeatProgram.vertexArray);
        DoubleUtils.checkGlError("glVertexAttribPointer");
        int i2 = moodHeatProgram.textureLocation;
        GLES20.glEnableVertexAttribArray(i2);
        DoubleUtils.checkGlError("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(moodHeatProgram.textureLocation, 2, 5126, false, 8, (Buffer) MoodHeatProgram.texCoordArray);
        DoubleUtils.checkGlError("glVertexAttribPointer");
        GLES20.glDrawArrays(5, 0, 4);
        DoubleUtils.checkGlError("glDrawArrays");
        GLES20.glDisableVertexAttribArray(i);
        GLES20.glDisableVertexAttribArray(i2);
        GLES20.glBindTexture(3553, 0);
        GLES20.glUseProgram(0);
    }

    @Override // com.squareup.cash.graphics.views.TextureViewRenderer
    public final void init(int i, int i2) {
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        this.handler = new CameraOperator.AnonymousClass2(this, myLooper, 4);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        Canvas canvas = new Canvas(createBitmap);
        Context context = this.context;
        Drawable drawableCompat = PlatformKt.getDrawableCompat(context, this.mask, null);
        drawableCompat.getClass();
        float f = i;
        float f2 = i2;
        float max = Float.max(f / drawableCompat.getIntrinsicWidth(), f2 / drawableCompat.getIntrinsicHeight());
        float intrinsicWidth = drawableCompat.getIntrinsicWidth() * max;
        float intrinsicHeight = drawableCompat.getIntrinsicHeight() * max;
        drawableCompat.setBounds(new Rect((int) ((-(intrinsicWidth - f)) / 2.0f), (int) ((-(intrinsicHeight - f2)) / 2.0f), (int) intrinsicWidth, (int) intrinsicHeight));
        drawableCompat.draw(canvas);
        createBitmap.getClass();
        Bitmap createBitmap2 = Bitmap.createBitmap((int) (f / 4.0f), (int) (f2 / 4.0f), config);
        Integer num = this.initialHeatMap;
        if (num != null) {
            Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), num.intValue());
            new Canvas(createBitmap2).drawBitmap(decodeResource, new Rect(0, 0, decodeResource.getWidth(), decodeResource.getHeight()), new Rect(0, 0, createBitmap2.getWidth(), createBitmap2.getHeight()), (Paint) null);
        }
        createBitmap2.getClass();
        this.heatMap = createBitmap2;
        TextureType textureType = TextureType.COLOR;
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        DoubleUtils.checkGlError("glGenTextures");
        int i3 = iArr[0];
        DoubleUtils.updateTexture(i3, createBitmap2, textureType);
        this.heatMapTextureId = i3;
        Bitmap decodeResource2 = BitmapFactory.decodeResource(context.getResources(), R.drawable.temperature_map);
        decodeResource2.getClass();
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        DoubleUtils.checkGlError("glGenTextures");
        int i4 = iArr2[0];
        DoubleUtils.updateTexture(i4, decodeResource2, textureType);
        this.temperatureMapTextureId = i4;
        int[] iArr3 = new int[1];
        GLES20.glGenTextures(1, iArr3, 0);
        DoubleUtils.checkGlError("glGenTextures");
        int i5 = iArr3[0];
        DoubleUtils.updateTexture(i5, createBitmap, textureType);
        this.heatMaskTextureId = i5;
        this.program = new MoodHeatProgram(this.heatMapTextureId, this.temperatureMapTextureId, this.heatMaskTextureId);
        coolHeatInternal();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        CameraOperator.AnonymousClass2 anonymousClass2 = this.handler;
        if (anonymousClass2 != null) {
            anonymousClass2.removeMessages(1);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        CameraOperator.AnonymousClass2 anonymousClass2 = this.handler;
        if (anonymousClass2 != null) {
            anonymousClass2.sendMessage(anonymousClass2.obtainMessage(1));
        }
    }

    public /* synthetic */ HeatRenderer(Context context, Integer num, Function1 function1) {
        this(context, num, 33L, 50L, function1);
    }
}
