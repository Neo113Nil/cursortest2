package kotlin.text;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class CatchingFishGradleHandler extends CatchingFishViewStateFlow {
    public static final Parcelable.Creator<CatchingFishGradleHandler> CREATOR = new CatchingFishSnackbarPayPal(24);
    public final String CatchingFishDaggerWebsocket;
    public final List CatchingFishReduxKtor;

    public CatchingFishGradleHandler(String str, ArrayList arrayList) {
        this.CatchingFishReduxKtor = arrayList;
        this.CatchingFishDaggerWebsocket = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int CatchingFishJobScheduler = CatchingFishViewMVIMVVM.CatchingFishJobScheduler(parcel, 20293);
        List<String> list = this.CatchingFishReduxKtor;
        if (list != null) {
            int CatchingFishJobScheduler2 = CatchingFishViewMVIMVVM.CatchingFishJobScheduler(parcel, 1);
            parcel.writeStringList(list);
            CatchingFishViewMVIMVVM.CatchingFishPayPalService(parcel, CatchingFishJobScheduler2);
        }
        CatchingFishViewMVIMVVM.CatchingFishPayPal(parcel, 2, this.CatchingFishDaggerWebsocket);
        CatchingFishViewMVIMVVM.CatchingFishPayPalService(parcel, CatchingFishJobScheduler);
    }
}
