package kotlin.text;

import android.text.InputFilter;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class CatchingFishServiceManifest extends CatchingFishFirebaseDagger {
    public final CatchingFishKtorGradle CatchingFishCoroutineFlow;

    public CatchingFishServiceManifest(TextView textView) {
        this.CatchingFishCoroutineFlow = new CatchingFishKtorGradle(textView);
    }

    @Override // kotlin.text.CatchingFishFirebaseDagger
    public final void CatchingFishAppCompat(boolean z) {
        CatchingFishKtorGradle catchingFishKtorGradle = this.CatchingFishCoroutineFlow;
        if (CatchingFishMVPOkHttpMVP.CatchingFishCloudMessaging != null) {
            catchingFishKtorGradle.CatchingFishAppCompat(z);
        } else {
            catchingFishKtorGradle.CatchingFishSpannableWidget = z;
        }
    }

    @Override // kotlin.text.CatchingFishFirebaseDagger
    public final InputFilter[] CatchingFishMVPRobolectric(InputFilter[] inputFilterArr) {
        return !(CatchingFishMVPOkHttpMVP.CatchingFishCloudMessaging != null) ? inputFilterArr : this.CatchingFishCoroutineFlow.CatchingFishMVPRobolectric(inputFilterArr);
    }

    @Override // kotlin.text.CatchingFishFirebaseDagger
    public final void CatchingFishRecyclerView(boolean z) {
        if (CatchingFishMVPOkHttpMVP.CatchingFishCloudMessaging != null) {
            this.CatchingFishCoroutineFlow.CatchingFishRecyclerView(z);
        }
    }
}
