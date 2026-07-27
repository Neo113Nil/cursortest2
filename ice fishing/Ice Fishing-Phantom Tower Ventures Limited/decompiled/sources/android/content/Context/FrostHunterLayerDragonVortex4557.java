package android.content.Context;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterLayerDragonVortex4557 extends ContentObserver {
    public final ContentResolver FrostHunterAlphaAnimationNeoCosmos5761;
    public final /* synthetic */ androidx.media3.exoplayer.audio.FrostHunterTransitionManagerOmegaNeoMaster3754 FrostHunterBundlePulseFusionHero2475;
    public final Uri FrostHunterConstraintSetCloneMasterUltraRogue2633;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrostHunterLayerDragonVortex4557(androidx.media3.exoplayer.audio.FrostHunterTransitionManagerOmegaNeoMaster3754 frostHunterTransitionManagerOmegaNeoMaster3754, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.FrostHunterBundlePulseFusionHero2475 = frostHunterTransitionManagerOmegaNeoMaster3754;
        this.FrostHunterAlphaAnimationNeoCosmos5761 = contentResolver;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.FrostHunterBundlePulseFusionHero2475.FrostHunterBundlePulseFusionHero2475();
    }
}
