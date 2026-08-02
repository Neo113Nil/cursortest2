package com.google.android.play.core.review;

import android.os.Process;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes4.dex */
public abstract class zzj {
    public static final HashMap zza;

    static {
        new HashSet(Arrays.asList("native", "unity"));
        zza = new HashMap();
        Recorder$$ExternalSyntheticOutline2.m(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat("PlayCoreVersion");
    }
}
