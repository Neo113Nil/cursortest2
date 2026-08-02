package com.google.mlkit.common.sdkinternal;

import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class Cleaner {
    public final ReferenceQueue zza = new ReferenceQueue();
    public final Set zzb = Collections.synchronizedSet(new HashSet());
}
