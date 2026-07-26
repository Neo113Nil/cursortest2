package android.content.Context;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterPushNotificationVortexPulsePhoenix5596 extends ViewOutlineProvider {
    public final /* synthetic */ int FrostHunterAlphaAnimationNeoCosmos5761;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        switch (this.FrostHunterAlphaAnimationNeoCosmos5761) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 1:
                if (!(view instanceof FrostHunterJavaAlphaDeltaStrike8974) || (outline2 = ((FrostHunterJavaAlphaDeltaStrike8974) view).FrostHunterFragmentBetaMegaVortex6025) == null) {
                    return;
                }
                outline.set(outline2);
                return;
            default:
                view.getClass();
                throw new ClassCastException();
        }
    }
}
