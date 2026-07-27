package kotlin.text;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* loaded from: classes.dex */
public final class CatchingFishReduxFAB implements CatchingFishGsonDaggerHilt, DialogInterface.OnClickListener {
    public CatchingFishIntentAndroidX CatchingFishDaggerWebsocket;
    public CatchingFishRoomStripeAPI CatchingFishReduxKtor;
    public final /* synthetic */ CatchingFishHandlerContext CatchingFishViewModelScope;
    public CharSequence CatchingFishWorkManager;

    public CatchingFishReduxFAB(CatchingFishHandlerContext catchingFishHandlerContext) {
        this.CatchingFishViewModelScope = catchingFishHandlerContext;
    }

    @Override // kotlin.text.CatchingFishGsonDaggerHilt
    public final CharSequence CatchingFishAnimationMockk() {
        return this.CatchingFishWorkManager;
    }

    @Override // kotlin.text.CatchingFishGsonDaggerHilt
    public final Drawable CatchingFishDaggerWebsocket() {
        return null;
    }

    @Override // kotlin.text.CatchingFishGsonDaggerHilt
    public final void CatchingFishOkHttp(int i, int i2) {
        if (this.CatchingFishDaggerWebsocket == null) {
            return;
        }
        CatchingFishHandlerContext catchingFishHandlerContext = this.CatchingFishViewModelScope;
        CatchingFishRoomManifest catchingFishRoomManifest = new CatchingFishRoomManifest(catchingFishHandlerContext.getPopupContext());
        CatchingFishCardView catchingFishCardView = (CatchingFishCardView) catchingFishRoomManifest.CatchingFishDaggerWebsocket;
        CharSequence charSequence = this.CatchingFishWorkManager;
        if (charSequence != null) {
            catchingFishCardView.CatchingFishReduxKtor = charSequence;
        }
        CatchingFishIntentAndroidX catchingFishIntentAndroidX = this.CatchingFishDaggerWebsocket;
        int selectedItemPosition = catchingFishHandlerContext.getSelectedItemPosition();
        catchingFishCardView.CatchingFishViewModelScope = catchingFishIntentAndroidX;
        catchingFishCardView.CatchingFishViewModelFAB = this;
        catchingFishCardView.CatchingFishFragmentHandler = selectedItemPosition;
        catchingFishCardView.CatchingFishLayout = true;
        CatchingFishRoomStripeAPI CatchingFishReduxKtor = catchingFishRoomManifest.CatchingFishReduxKtor();
        this.CatchingFishReduxKtor = CatchingFishReduxKtor;
        AlertController$RecycleListView alertController$RecycleListView = CatchingFishReduxKtor.CatchingFishFragmentHandler.CatchingFishDaggerWebsocket;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.CatchingFishReduxKtor.show();
    }

    @Override // kotlin.text.CatchingFishGsonDaggerHilt
    public final boolean CatchingFishParcelableFAB() {
        CatchingFishRoomStripeAPI catchingFishRoomStripeAPI = this.CatchingFishReduxKtor;
        if (catchingFishRoomStripeAPI != null) {
            return catchingFishRoomStripeAPI.isShowing();
        }
        return false;
    }

    @Override // kotlin.text.CatchingFishGsonDaggerHilt
    public final int CatchingFishSnackbar() {
        return 0;
    }

    @Override // kotlin.text.CatchingFishGsonDaggerHilt
    public final void CatchingFishStateLiveData(ListAdapter listAdapter) {
        this.CatchingFishDaggerWebsocket = (CatchingFishIntentAndroidX) listAdapter;
    }

    @Override // kotlin.text.CatchingFishGsonDaggerHilt
    public final int CatchingFishUnitTesting() {
        return 0;
    }

    @Override // kotlin.text.CatchingFishGsonDaggerHilt
    public final void CatchingFishWorkManager(CharSequence charSequence) {
        this.CatchingFishWorkManager = charSequence;
    }

    @Override // kotlin.text.CatchingFishGsonDaggerHilt
    public final void dismiss() {
        CatchingFishRoomStripeAPI catchingFishRoomStripeAPI = this.CatchingFishReduxKtor;
        if (catchingFishRoomStripeAPI != null) {
            catchingFishRoomStripeAPI.dismiss();
            this.CatchingFishReduxKtor = null;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        CatchingFishHandlerContext catchingFishHandlerContext = this.CatchingFishViewModelScope;
        catchingFishHandlerContext.setSelection(i);
        if (catchingFishHandlerContext.getOnItemClickListener() != null) {
            catchingFishHandlerContext.performItemClick(null, i, this.CatchingFishDaggerWebsocket.getItemId(i));
        }
        dismiss();
    }

    @Override // kotlin.text.CatchingFishGsonDaggerHilt
    public final void CatchingFishCloudMessaging(int i) {
    }

    @Override // kotlin.text.CatchingFishGsonDaggerHilt
    public final void CatchingFishEspressoTesting(int i) {
    }

    @Override // kotlin.text.CatchingFishGsonDaggerHilt
    public final void CatchingFishFragmentHandler(int i) {
    }

    @Override // kotlin.text.CatchingFishGsonDaggerHilt
    public final void CatchingFishViewModelFAB(Drawable drawable) {
    }
}
