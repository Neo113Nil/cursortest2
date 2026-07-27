package kotlin.text;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class CatchingFishLayoutStateFlow extends ClickableSpan {
    public final CatchingFishViewJUnitJUnit CatchingFishDaggerWebsocket;
    public final int CatchingFishReduxKtor;
    public final int CatchingFishWorkManager;

    public CatchingFishLayoutStateFlow(int i, CatchingFishViewJUnitJUnit catchingFishViewJUnitJUnit, int i2) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = catchingFishViewJUnitJUnit;
        this.CatchingFishWorkManager = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.CatchingFishReduxKtor);
        this.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB.performAction(this.CatchingFishWorkManager, bundle);
    }
}
