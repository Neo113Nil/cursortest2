package com.miteksystems.misnap.document.internal;

/* loaded from: classes4.dex */
public final class SpikeNormalizer {
    public transient long a;
    public transient boolean b = true;

    public SpikeNormalizer(int i) {
        this.a = SpikeNormalizerSwigModuleJNI.a.new_SpikeNormalizer(i, 2);
    }

    public final /* synthetic */ boolean a(int i) {
        return SpikeNormalizerSwigModuleJNI.a.SpikeNormalizer_isSpike(this.a, this, i);
    }

    public final /* synthetic */ void finalize() {
        synchronized (this) {
            try {
                long j = this.a;
                if (j != 0) {
                    if (this.b) {
                        this.b = false;
                        SpikeNormalizerSwigModuleJNI.a.delete_SpikeNormalizer(j);
                    }
                    this.a = 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
