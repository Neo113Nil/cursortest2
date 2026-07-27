package androidx.versionedparcelable;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class QuantumStreamPostfixComponentEFs6xXx6qIxvqOKZ3070394643310968 implements ThreadFactory {
    public static final ThreadFactory LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = Executors.defaultThreadFactory();
    public final int ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
    public final String AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public final AtomicLong ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = new AtomicLong();
    public final StrictMode.ThreadPolicy RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;

    public QuantumStreamPostfixComponentEFs6xXx6qIxvqOKZ3070394643310968(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = str;
        this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = i;
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.newThread(new GoldenVectorCoroutineTranspilerTbwuCpNUfxiQ181tFE78464764385187(6, this, runnable));
        Locale locale = Locale.ROOT;
        newThread.setName(this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 + " Thread #" + this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.getAndIncrement());
        return newThread;
    }
}
