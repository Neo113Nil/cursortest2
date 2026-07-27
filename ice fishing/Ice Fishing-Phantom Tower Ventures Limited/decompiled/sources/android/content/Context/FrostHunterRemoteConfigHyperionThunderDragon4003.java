package android.content.Context;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.os.Build;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterRemoteConfigHyperionThunderDragon4003 implements DialogInterface.OnClickListener {
    public abstract void FrostHunterAlphaAnimationNeoCosmos5761();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            FrostHunterAlphaAnimationNeoCosmos5761();
        } catch (ActivityNotFoundException unused) {
            Build.FINGERPRINT.contains("generic");
        } finally {
            dialogInterface.dismiss();
        }
    }
}
