package com.google.mlkit.common.sdkinternal;

import com.fillr.browsersdk.Fillr;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* loaded from: classes4.dex */
public final class zzd extends PhantomReference {
    public final Set zza;
    public final Fillr.AnonymousClass3 zzb;

    public /* synthetic */ zzd(Cleaner cleaner, ReferenceQueue referenceQueue, Set set, Fillr.AnonymousClass3 anonymousClass3) {
        super(cleaner, referenceQueue);
        this.zza = set;
        this.zzb = anonymousClass3;
    }
}
