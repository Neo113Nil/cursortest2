package com.google.android.gms.internal.mlkit_genai_prompt;

import android.os.Handler;
import android.os.Looper;
import androidx.activity.result.PickVisualMediaRequestKt;
import androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService;
import androidx.camera.core.impl.utils.executor.IoExecutor;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import com.android.volley.ExecutorDelivery$1;
import com.bumptech.glide.util.Executors$1;
import com.squareup.cash.appmessages.sheet.SheetAppMessageModel;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.genie.backend.api.GenieAppConfig;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.scannerview.SizeMap;

/* loaded from: classes4.dex */
public abstract class zzabp {
    public static final long access$getHeaderGradientColor(SheetAppMessageModel.Loaded loaded, Composer composer) {
        Color forTheme = ThemablesKt.forTheme(loaded.headerGradient, composer);
        return forTheme != null ? forTheme.value : Color.Unspecified;
    }

    public static Executors$1 directExecutor() {
        if (Executors$1.sDirectExecutor != null) {
            return Executors$1.sDirectExecutor;
        }
        synchronized (Executors$1.class) {
            try {
                if (Executors$1.sDirectExecutor == null) {
                    Executors$1.sDirectExecutor = new Executors$1(1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return Executors$1.sDirectExecutor;
    }

    public static ExecutorDelivery$1 highPriorityExecutor() {
        if (ExecutorDelivery$1.sExecutor != null) {
            return ExecutorDelivery$1.sExecutor;
        }
        synchronized (ExecutorDelivery$1.class) {
            try {
                if (ExecutorDelivery$1.sExecutor == null) {
                    ExecutorDelivery$1.sExecutor = new ExecutorDelivery$1(3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ExecutorDelivery$1.sExecutor;
    }

    public static IoExecutor ioExecutor() {
        if (IoExecutor.sExecutor != null) {
            return IoExecutor.sExecutor;
        }
        synchronized (IoExecutor.class) {
            try {
                if (IoExecutor.sExecutor == null) {
                    IoExecutor.sExecutor = new IoExecutor();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return IoExecutor.sExecutor;
    }

    public static HandlerScheduledExecutorService mainThreadExecutor() {
        if (PickVisualMediaRequestKt.sInstance != null) {
            return PickVisualMediaRequestKt.sInstance;
        }
        synchronized (PickVisualMediaRequestKt.class) {
            try {
                if (PickVisualMediaRequestKt.sInstance == null) {
                    PickVisualMediaRequestKt.sInstance = new HandlerScheduledExecutorService(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return PickVisualMediaRequestKt.sInstance;
    }

    public static GenieAppConfig provideMoneybotGenieAppConfig() {
        return new GenieAppConfig();
    }

    public static EglCore provideMoneybotGenieSceneLoader(GenieAppConfig genieAppConfig, String str, String str2, SizeMap sizeMap) {
        return new EglCore(genieAppConfig, str, str2, sizeMap);
    }
}
