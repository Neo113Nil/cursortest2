package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterTypefaceInfernoHyperStrike3017 extends CancellationException {
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FrostHunterTypefaceInfernoHyperStrike3017(String str, int i) {
        super(str);
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                setStackTrace(new StackTraceElement[0]);
                break;
            default:
                setStackTrace(FrostHunterBannerAdTitanVisionDragon3523.FrostHunterServiceEliteCelestialThunder1757);
                break;
        }
        return this;
    }
}
