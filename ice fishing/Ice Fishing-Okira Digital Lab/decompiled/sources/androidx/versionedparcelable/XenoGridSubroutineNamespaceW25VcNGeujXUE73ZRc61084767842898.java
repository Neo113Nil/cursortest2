package androidx.versionedparcelable;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class XenoGridSubroutineNamespaceW25VcNGeujXUE73ZRc61084767842898 implements ThreadFactory {
    public final ThreadFactory AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = Executors.defaultThreadFactory();
    public final String ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public XenoGridSubroutineNamespaceW25VcNGeujXUE73ZRc61084767842898(String str) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.newThread(new GoldenVectorWorkerTranspilerGC6tDjoKz8eLQvy06325083993483197(runnable, 2));
        newThread.setName(this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800);
        return newThread;
    }
}
