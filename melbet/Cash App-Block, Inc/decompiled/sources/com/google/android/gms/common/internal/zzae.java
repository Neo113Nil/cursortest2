package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.service.zat;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public abstract class zzae {
    public static final Object zza = new Object();
    public static boolean zzb;
    public static int zzd;

    public static void checkArgument(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void checkHandlerThread(Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + 35 + 1);
            Boxes$$ExternalSyntheticOutline1.m(sb, "Must be called on ", name2, " thread, but got ", name);
            a$$ExternalSyntheticBUOutline0.m(sb, (Object) ".");
        }
    }

    public static void checkNotEmpty(String str) {
        if (TextUtils.isEmpty(str)) {
            a$$ExternalSyntheticBUOutline0.m$3("Given String is empty or null");
        }
    }

    public static void checkNotMainThread(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1(str);
    }

    public static void checkNotNull(Object obj) {
        if (obj != null) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$2("null reference");
    }

    public static void checkState(boolean z) {
        if (z) {
            return;
        }
        Path$$ExternalSyntheticBUOutline0.m();
    }

    public static boolean equal(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static ApiException fromStatus(Status status) {
        return status.zzc != null ? new ResolvableApiException(status) : new ApiException(status);
    }

    public static zat getClient(Context context, TelemetryLoggingOptions telemetryLoggingOptions) {
        return new zat(context, null, zat.zae, telemetryLoggingOptions, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public static void checkState(String str, boolean z) {
        if (z) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1(str);
    }

    public static void checkNotNull(Object obj, String str) {
        if (obj != null) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$2(str);
    }

    public static void checkArgument(String str, boolean z) {
        if (z) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3(str);
    }

    public static void checkNotEmpty(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            a$$ExternalSyntheticBUOutline0.m$3(str2);
        }
    }

    public static void checkArgument(boolean z) {
        if (z) {
            return;
        }
        Path$$ExternalSyntheticBUOutline0.m$3();
    }
}
