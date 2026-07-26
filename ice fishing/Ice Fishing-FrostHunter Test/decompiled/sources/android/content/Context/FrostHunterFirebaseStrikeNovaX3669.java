package android.content.Context;

import com.adjust.sdk.network.ErrorCodes;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class FrostHunterFirebaseStrikeNovaX3669 extends FrostHunterMotionSceneTitaniumMega7732 {
    public final int FrostHunterFlowMaxDragonHero5809;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FrostHunterFirebaseStrikeNovaX3669(IOException iOException, int i, int i2) {
        super(iOException, i);
        if (i == 2000 && i2 == 1) {
            i = 2001;
        }
        this.FrostHunterFlowMaxDragonHero5809 = i2;
    }

    public static FrostHunterFirebaseStrikeNovaX3669 FrostHunterAlphaAnimationNeoCosmos5761(IOException iOException, int i) {
        String message = iOException.getMessage();
        int i2 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? ErrorCodes.PROTOCOL_EXCEPTION : (message == null || !FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterConstraintSetCloneOmegaHyperion9304(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i2 == 2007 ? new FrostHunterRoomEntityMegaLegendThunder8151("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007) : new FrostHunterFirebaseStrikeNovaX3669(iOException, i2, i);
    }

    public FrostHunterFirebaseStrikeNovaX3669() {
        super(2008);
        this.FrostHunterFlowMaxDragonHero5809 = 1;
    }

    public FrostHunterFirebaseStrikeNovaX3669(String str, IOException iOException, int i) {
        super(str, iOException, i == 2000 ? 2001 : i);
        this.FrostHunterFlowMaxDragonHero5809 = 1;
    }
}
