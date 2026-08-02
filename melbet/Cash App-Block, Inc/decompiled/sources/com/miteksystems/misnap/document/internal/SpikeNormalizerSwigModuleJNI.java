package com.miteksystems.misnap.document.internal;

import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0005H\u0086 ¢\u0006\u0004\b\t\u0010\nJ(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0086 ¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/miteksystems/misnap/document/internal/SpikeNormalizerSwigModuleJNI;", "", "", "jarg1", "jarg2", "", "new_SpikeNormalizer", "(II)J", "", "delete_SpikeNormalizer", "(J)V", "Lcom/miteksystems/misnap/document/internal/SpikeNormalizer;", "jarg1_", "sjarg2", "", "SpikeNormalizer_isSpike", "(JLcom/miteksystems/misnap/document/internal/SpikeNormalizer;I)Z", "SpikeNormalizer_resetCount", "(JLcom/miteksystems/misnap/document/internal/SpikeNormalizer;)V", "document-analysis_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
final class SpikeNormalizerSwigModuleJNI {
    public static final SpikeNormalizerSwigModuleJNI a = new SpikeNormalizerSwigModuleJNI();

    public final native boolean SpikeNormalizer_isSpike(long jarg1, SpikeNormalizer jarg1_, int sjarg2);

    public final native void SpikeNormalizer_resetCount(long jarg1, SpikeNormalizer jarg1_);

    public final native void delete_SpikeNormalizer(long jarg1);

    public final native long new_SpikeNormalizer(int jarg1, int jarg2);
}
