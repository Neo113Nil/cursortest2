package kotlin.text;

import android.view.View;
import android.widget.AdapterView;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishFirebaseRedux implements AdapterView.OnItemClickListener {
    public final /* synthetic */ Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishFirebaseRedux(int i, Object obj) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        CharSequence convertSelectionToString;
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishMVIFAB catchingFishMVIFAB = (CatchingFishMVIFAB) this.CatchingFishDaggerWebsocket;
                CatchingFishHandlerContext catchingFishHandlerContext = catchingFishMVIFAB.CatchingFishEspressoMockk;
                catchingFishHandlerContext.setSelection(i);
                if (catchingFishHandlerContext.getOnItemClickListener() != null) {
                    catchingFishHandlerContext.performItemClick(view, i, catchingFishMVIFAB.CatchingFishJobScheduler.getItemId(i));
                }
                catchingFishMVIFAB.dismiss();
                break;
            default:
                CatchingFishMVIMVPOkHttp catchingFishMVIMVPOkHttp = (CatchingFishMVIMVPOkHttp) this.CatchingFishDaggerWebsocket;
                CatchingFishAndroidXService catchingFishAndroidXService = catchingFishMVIMVPOkHttp.CatchingFishViewModelFAB;
                convertSelectionToString = catchingFishMVIMVPOkHttp.convertSelectionToString(i < 0 ? !catchingFishAndroidXService.CatchingFishMVPRobolectric.isShowing() ? null : catchingFishAndroidXService.CatchingFishWorkManager.getSelectedItem() : catchingFishMVIMVPOkHttp.getAdapter().getItem(i));
                catchingFishMVIMVPOkHttp.setText(convertSelectionToString, false);
                AdapterView.OnItemClickListener onItemClickListener = catchingFishMVIMVPOkHttp.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = !catchingFishAndroidXService.CatchingFishMVPRobolectric.isShowing() ? null : catchingFishAndroidXService.CatchingFishWorkManager.getSelectedView();
                        i = !catchingFishAndroidXService.CatchingFishMVPRobolectric.isShowing() ? -1 : catchingFishAndroidXService.CatchingFishWorkManager.getSelectedItemPosition();
                        j = !catchingFishAndroidXService.CatchingFishMVPRobolectric.isShowing() ? Long.MIN_VALUE : catchingFishAndroidXService.CatchingFishWorkManager.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(catchingFishAndroidXService.CatchingFishWorkManager, view, i, j);
                }
                catchingFishAndroidXService.dismiss();
                break;
        }
    }
}
