package androidx.versionedparcelable;

import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final /* synthetic */ class YellowLoopDataframeStreamDyDplopMWeUrcF2lQ536526810543946 implements ThreadFactory {
    public final /* synthetic */ String ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800);
        thread.setPriority(10);
        return thread;
    }
}
