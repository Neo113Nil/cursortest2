package android.content.Context;

import android.content.Context;
import android.net.Uri;
import com.adjust.sdk.AdjustInstance;
import com.adjust.sdk.OnLastDeeplinkReadListener;
import com.adjust.sdk.scheduler.AsyncTaskExecutor;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterPaintFusionStrikeVortex9799 extends AsyncTaskExecutor {
    public final /* synthetic */ Context FrostHunterAlphaAnimationNeoCosmos5761;
    public final /* synthetic */ AdjustInstance FrostHunterBundlePulseFusionHero2475;
    public final /* synthetic */ OnLastDeeplinkReadListener FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterPaintFusionStrikeVortex9799(AdjustInstance adjustInstance, Context context, OnLastDeeplinkReadListener onLastDeeplinkReadListener) {
        this.FrostHunterBundlePulseFusionHero2475 = adjustInstance;
        this.FrostHunterAlphaAnimationNeoCosmos5761 = context;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = onLastDeeplinkReadListener;
    }

    @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
    public final Object doInBackground(Object[] objArr) {
        String cachedDeeplink;
        cachedDeeplink = this.FrostHunterBundlePulseFusionHero2475.getCachedDeeplink(this.FrostHunterAlphaAnimationNeoCosmos5761);
        try {
            return Uri.parse(cachedDeeplink);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
    public final void onPostExecute(Object obj) {
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633.onLastDeeplinkRead((Uri) obj);
    }
}
