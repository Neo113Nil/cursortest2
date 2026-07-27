package kotlin.text;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class CatchingFishServiceIntent implements Runnable {
    public final /* synthetic */ int CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor = 0;
    public final /* synthetic */ Object CatchingFishViewModelScope;
    public final /* synthetic */ View CatchingFishWorkManager;

    public CatchingFishServiceIntent(TextView textView, Typeface typeface, int i) {
        this.CatchingFishWorkManager = textView;
        this.CatchingFishViewModelScope = typeface;
        this.CatchingFishDaggerWebsocket = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((TextView) this.CatchingFishWorkManager).setTypeface((Typeface) this.CatchingFishViewModelScope, this.CatchingFishDaggerWebsocket);
                break;
            default:
                ((BottomSheetBehavior) this.CatchingFishViewModelScope).CatchingFishFragmentFactory(this.CatchingFishWorkManager, this.CatchingFishDaggerWebsocket, false);
                break;
        }
    }

    public CatchingFishServiceIntent(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.CatchingFishViewModelScope = bottomSheetBehavior;
        this.CatchingFishWorkManager = view;
        this.CatchingFishDaggerWebsocket = i;
    }
}
