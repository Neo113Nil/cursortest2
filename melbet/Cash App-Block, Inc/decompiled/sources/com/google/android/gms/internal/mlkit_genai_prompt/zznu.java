package com.google.android.gms.internal.mlkit_genai_prompt;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;

/* loaded from: classes4.dex */
public final class zznu implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt__ComparisonsKt.compareValues(Float.valueOf(((zzgd) obj2).zzb), Float.valueOf(((zzgd) obj).zzb));
    }
}
