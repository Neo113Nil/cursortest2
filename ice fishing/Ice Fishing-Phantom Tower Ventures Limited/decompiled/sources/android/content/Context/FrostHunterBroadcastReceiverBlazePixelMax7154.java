package android.content.Context;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterBroadcastReceiverBlazePixelMax7154 implements Executor {
    public static final /* synthetic */ FrostHunterBroadcastReceiverBlazePixelMax7154[] FrostHunterAlertDialogAuroraDelta3200;
    public static final FrostHunterBroadcastReceiverBlazePixelMax7154 FrostHunterCameraXPixelTurboCosmos9814;
    public static final Handler FrostHunterFlowMaxDragonHero5809;

    static {
        FrostHunterBroadcastReceiverBlazePixelMax7154 frostHunterBroadcastReceiverBlazePixelMax7154 = new FrostHunterBroadcastReceiverBlazePixelMax7154("INSTANCE", 0);
        FrostHunterCameraXPixelTurboCosmos9814 = frostHunterBroadcastReceiverBlazePixelMax7154;
        FrostHunterAlertDialogAuroraDelta3200 = new FrostHunterBroadcastReceiverBlazePixelMax7154[]{frostHunterBroadcastReceiverBlazePixelMax7154};
        FrostHunterFlowMaxDragonHero5809 = new Handler(Looper.getMainLooper());
    }

    public static FrostHunterBroadcastReceiverBlazePixelMax7154 valueOf(String str) {
        return (FrostHunterBroadcastReceiverBlazePixelMax7154) Enum.valueOf(FrostHunterBroadcastReceiverBlazePixelMax7154.class, str);
    }

    public static FrostHunterBroadcastReceiverBlazePixelMax7154[] values() {
        return (FrostHunterBroadcastReceiverBlazePixelMax7154[]) FrostHunterAlertDialogAuroraDelta3200.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        FrostHunterFlowMaxDragonHero5809.post(runnable);
    }
}
