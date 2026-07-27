package kotlin.text;

import android.app.Dialog;
import android.view.View;

/* loaded from: classes.dex */
public final class CatchingFishMVVMNavigation extends CatchingFishRobolectricHilt {
    public final /* synthetic */ CatchingFishPayPalMVP CatchingFishCoroutineFlow;
    public final /* synthetic */ CatchingFishGsonJUnitRoom CatchingFishJetpackCompose;

    public CatchingFishMVVMNavigation(CatchingFishPayPalMVP catchingFishPayPalMVP, CatchingFishGsonJUnitRoom catchingFishGsonJUnitRoom) {
        this.CatchingFishCoroutineFlow = catchingFishPayPalMVP;
        this.CatchingFishJetpackCompose = catchingFishGsonJUnitRoom;
    }

    @Override // kotlin.text.CatchingFishRobolectricHilt
    public final boolean CatchingFishDagger() {
        return this.CatchingFishJetpackCompose.CatchingFishDagger() || this.CatchingFishCoroutineFlow.CatchingFishFirebase;
    }

    @Override // kotlin.text.CatchingFishRobolectricHilt
    public final View CatchingFishEspressoMockk(int i) {
        CatchingFishGsonJUnitRoom catchingFishGsonJUnitRoom = this.CatchingFishJetpackCompose;
        if (catchingFishGsonJUnitRoom.CatchingFishDagger()) {
            return catchingFishGsonJUnitRoom.CatchingFishEspressoMockk(i);
        }
        Dialog dialog = this.CatchingFishCoroutineFlow.CatchingFishDaggerMVVM;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }
}
