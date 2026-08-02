package androidx.camera.core.internal.compat.quirk;

import androidx.camera.core.impl.Quirk;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class IncorrectJpegMetadataQuirk implements Quirk {
    public static final HashSet SAMSUNG_DEVICES = new HashSet(Arrays.asList("A24", "BEYOND0", "BEYOND2"));
}
