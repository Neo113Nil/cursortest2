package kotlin.text;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class CatchingFishCardViewToolbar implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ CatchingFishAndroidXService CatchingFishReduxKtor;

    public CatchingFishCardViewToolbar(CatchingFishAndroidXService catchingFishAndroidXService) {
        this.CatchingFishReduxKtor = catchingFishAndroidXService;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        CatchingFishCameraXOkHttp catchingFishCameraXOkHttp;
        if (i == -1 || (catchingFishCameraXOkHttp = this.CatchingFishReduxKtor.CatchingFishWorkManager) == null) {
            return;
        }
        catchingFishCameraXOkHttp.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
