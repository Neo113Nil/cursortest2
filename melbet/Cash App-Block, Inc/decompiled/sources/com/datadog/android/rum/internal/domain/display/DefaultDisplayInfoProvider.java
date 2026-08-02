package com.datadog.android.rum.internal.domain.display;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import androidx.cursoradapter.widget.CursorAdapter;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.rum.internal.domain.InfoData;
import com.datadog.android.rum.internal.domain.InfoProvider;
import com.google.android.filament.Box;
import kotlin.math.MathKt__MathJVMKt;

/* loaded from: classes4.dex */
public final class DefaultDisplayInfoProvider implements InfoProvider {
    public final CursorAdapter.ChangeObserver brightnessObserver;
    public final ContentResolver contentResolver;
    public volatile DisplayInfo currentState;
    public final Box systemSettingsWrapper;

    public DefaultDisplayInfoProvider(Context context, InternalLogger internalLogger) {
        Box box = new Box(context, internalLogger);
        ContentResolver contentResolver = context.getContentResolver();
        contentResolver.getClass();
        Handler handler = new Handler(Looper.getMainLooper());
        context.getClass();
        internalLogger.getClass();
        this.systemSettingsWrapper = box;
        this.contentResolver = contentResolver;
        this.currentState = new DisplayInfo(null);
        CursorAdapter.ChangeObserver changeObserver = new CursorAdapter.ChangeObserver(this, handler, 3);
        this.brightnessObserver = changeObserver;
        Uri uriFor = Settings.System.getUriFor("screen_brightness");
        if (uriFor != null) {
            contentResolver.registerContentObserver(uriFor, false, changeObserver);
        }
        if (box.getInt() != Integer.MIN_VALUE) {
            this.currentState = new DisplayInfo(Float.valueOf(MathKt__MathJVMKt.roundToInt((r5 / 255.0f) * 10.0f) / 10.0f));
        }
    }

    @Override // com.datadog.android.rum.internal.domain.InfoProvider
    public final void cleanup() {
        this.contentResolver.unregisterContentObserver(this.brightnessObserver);
    }

    @Override // com.datadog.android.rum.internal.domain.InfoProvider
    public final InfoData getState() {
        return this.currentState;
    }
}
