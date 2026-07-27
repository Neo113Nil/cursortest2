package kotlin.text;

import android.content.Intent;
import androidx.core.app.JobIntentService;

/* loaded from: classes.dex */
public final class CatchingFishLayoutMVIRoom implements CatchingFishViewSharedFlow {
    public final /* synthetic */ JobIntentService CatchingFishCoroutine;
    public final Intent CatchingFishParcelableFAB;
    public final int CatchingFishSnackbar;

    public CatchingFishLayoutMVIRoom(JobIntentService jobIntentService, Intent intent, int i) {
        this.CatchingFishCoroutine = jobIntentService;
        this.CatchingFishParcelableFAB = intent;
        this.CatchingFishSnackbar = i;
    }

    @Override // kotlin.text.CatchingFishViewSharedFlow
    public final void CatchingFishParcelableFAB() {
        this.CatchingFishCoroutine.stopSelf(this.CatchingFishSnackbar);
    }

    @Override // kotlin.text.CatchingFishViewSharedFlow
    public final Intent getIntent() {
        return this.CatchingFishParcelableFAB;
    }
}
