package com.google.android.play.integrity.internal;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.util.IllegalFormatException;
import java.util.Locale;

/* loaded from: classes.dex */
public final class s {
    public final String a;

    public s(String str) {
        this.a = Recorder$$ExternalSyntheticOutline2.m(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat(str);
    }

    public static String f(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e);
                str2 = Boxes$$ExternalSyntheticOutline1.m(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return Recorder$$ExternalSyntheticOutline2.m(str, " : ", str2);
    }

    public final void c(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", f(this.a, str, objArr), remoteException);
        }
    }

    public final void d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", f(this.a, str, objArr));
        }
    }

    public final void e(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", f(this.a, str, objArr));
        }
    }
}
