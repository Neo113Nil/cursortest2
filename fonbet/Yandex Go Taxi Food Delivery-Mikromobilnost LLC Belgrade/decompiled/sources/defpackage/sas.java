package defpackage;

import android.view.View;
import com.ybsdk.feature.transfer.version2.internal.screens.fpspay.presentation.FpsPayEnrollFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class sas implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FpsPayEnrollFragment b;

    public /* synthetic */ sas(FpsPayEnrollFragment fpsPayEnrollFragment, int i) {
        this.a = i;
        this.b = fpsPayEnrollFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        FpsPayEnrollFragment fpsPayEnrollFragment = this.b;
        switch (i) {
            case 0:
                FpsPayEnrollFragment.getViewBinding$lambda$5$lambda$2(fpsPayEnrollFragment, view);
                break;
            case 1:
                FpsPayEnrollFragment.getViewBinding$lambda$5$lambda$3(fpsPayEnrollFragment, view);
                break;
            default:
                FpsPayEnrollFragment.renderBottomSheet$lambda$18$lambda$16$lambda$15$lambda$14$lambda$12(fpsPayEnrollFragment, view);
                break;
        }
    }
}
