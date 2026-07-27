package kotlin.text;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class CatchingFishHiltFragment extends InputConnectionWrapper {
    public final /* synthetic */ CatchingFishLayoutCoroutine CatchingFishParcelableFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishHiltFragment(InputConnection inputConnection, CatchingFishLayoutCoroutine catchingFishLayoutCoroutine) {
        super(inputConnection, false);
        this.CatchingFishParcelableFAB = catchingFishLayoutCoroutine;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        CatchingFishViewPagerMockk catchingFishViewPagerMockk = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            catchingFishViewPagerMockk = new CatchingFishViewPagerMockk(13, new CatchingFishJUnitMVP(inputContentInfo));
        }
        if (this.CatchingFishParcelableFAB.CatchingFishReduxKtor(catchingFishViewPagerMockk, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
