package kotlin.text;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* loaded from: classes.dex */
public final class CatchingFishAndroidXMVI implements CatchingFishCoroutineWidget {
    public final /* synthetic */ CatchingFishToolbarToast CatchingFishReduxKtor;

    public CatchingFishAndroidXMVI(EmojiCompatInitializer emojiCompatInitializer, CatchingFishToolbarToast catchingFishToolbarToast) {
        this.CatchingFishReduxKtor = catchingFishToolbarToast;
    }

    @Override // kotlin.text.CatchingFishCoroutineWidget
    public final void CatchingFishCoroutine(CatchingFishToastFlux catchingFishToastFlux) {
        (Build.VERSION.SDK_INT >= 28 ? CatchingFishWidgetRedux.CatchingFishParcelableFAB(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new CatchingFishGlideWidget(), 500L);
        this.CatchingFishReduxKtor.CatchingFishWorkManager(this);
    }
}
