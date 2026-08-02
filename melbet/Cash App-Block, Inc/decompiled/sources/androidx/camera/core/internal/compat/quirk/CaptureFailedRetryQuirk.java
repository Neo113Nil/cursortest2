package androidx.camera.core.internal.compat.quirk;

import android.util.Pair;
import androidx.camera.core.impl.Quirk;
import java.util.Collections;
import java.util.HashSet;

/* loaded from: classes3.dex */
public class CaptureFailedRetryQuirk implements Quirk {
    public static final HashSet FAILED_RETRY_ALLOW_LIST = new HashSet(Collections.singletonList(Pair.create("SAMSUNG", "SM-G981U1")));
}
