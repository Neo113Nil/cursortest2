package kotlin.text;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class CatchingFishMVPOkHttp implements AdapterView.OnItemClickListener {
    public final /* synthetic */ CatchingFishCardView CatchingFishDaggerWebsocket;
    public final /* synthetic */ CatchingFishMVPWebsocket CatchingFishReduxKtor;

    public CatchingFishMVPOkHttp(CatchingFishCardView catchingFishCardView, CatchingFishMVPWebsocket catchingFishMVPWebsocket) {
        this.CatchingFishDaggerWebsocket = catchingFishCardView;
        this.CatchingFishReduxKtor = catchingFishMVPWebsocket;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        CatchingFishCardView catchingFishCardView = this.CatchingFishDaggerWebsocket;
        DialogInterface.OnClickListener onClickListener = catchingFishCardView.CatchingFishViewModelFAB;
        CatchingFishMVPWebsocket catchingFishMVPWebsocket = this.CatchingFishReduxKtor;
        onClickListener.onClick(catchingFishMVPWebsocket.CatchingFishSnackbar, i);
        if (catchingFishCardView.CatchingFishLayout) {
            return;
        }
        catchingFishMVPWebsocket.CatchingFishSnackbar.dismiss();
    }
}
