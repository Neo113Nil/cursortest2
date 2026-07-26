package android.content.Context;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterDrawablePhoenixMaxGamma4162 implements Executor {
    public static final FrostHunterDrawablePhoenixMaxGamma4162 FrostHunterCameraXPixelTurboCosmos9814;
    public static final /* synthetic */ FrostHunterDrawablePhoenixMaxGamma4162[] FrostHunterFlowMaxDragonHero5809;

    static {
        FrostHunterDrawablePhoenixMaxGamma4162 frostHunterDrawablePhoenixMaxGamma4162 = new FrostHunterDrawablePhoenixMaxGamma4162("INSTANCE", 0);
        FrostHunterCameraXPixelTurboCosmos9814 = frostHunterDrawablePhoenixMaxGamma4162;
        FrostHunterFlowMaxDragonHero5809 = new FrostHunterDrawablePhoenixMaxGamma4162[]{frostHunterDrawablePhoenixMaxGamma4162};
    }

    public static FrostHunterDrawablePhoenixMaxGamma4162 valueOf(String str) {
        return (FrostHunterDrawablePhoenixMaxGamma4162) Enum.valueOf(FrostHunterDrawablePhoenixMaxGamma4162.class, str);
    }

    public static FrostHunterDrawablePhoenixMaxGamma4162[] values() {
        return (FrostHunterDrawablePhoenixMaxGamma4162[]) FrostHunterFlowMaxDragonHero5809.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
