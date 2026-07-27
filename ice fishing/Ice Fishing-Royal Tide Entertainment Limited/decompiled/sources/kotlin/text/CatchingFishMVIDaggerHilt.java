package kotlin.text;

import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class CatchingFishMVIDaggerHilt extends ClickableSpan {
    public final CatchingFishOkHttpViewModel CatchingFishReduxKtor;

    public CatchingFishMVIDaggerHilt(CatchingFishOkHttpViewModel catchingFishOkHttpViewModel) {
        this.CatchingFishReduxKtor = catchingFishOkHttpViewModel;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.CatchingFishReduxKtor.getClass();
    }
}
