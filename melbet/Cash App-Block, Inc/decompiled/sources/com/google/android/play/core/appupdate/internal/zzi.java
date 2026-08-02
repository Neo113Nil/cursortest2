package com.google.android.play.core.appupdate.internal;

import android.os.Process;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes4.dex */
public abstract class zzi {
    public static final HashMap zzc;

    static {
        new HashSet(Arrays.asList("app_update", "review"));
        new HashSet(Arrays.asList("native", "unity"));
        zzc = new HashMap();
        Recorder$$ExternalSyntheticOutline2.m(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat("PlayCoreVersion");
    }
}
