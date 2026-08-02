package defpackage;

import android.view.View;
import com.ybsdk.feature.kyc.internal.screens.photov2.KycPhotoV2Fragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class unx implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KycPhotoV2Fragment b;

    public /* synthetic */ unx(KycPhotoV2Fragment kycPhotoV2Fragment, int i) {
        this.a = i;
        this.b = kycPhotoV2Fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        KycPhotoV2Fragment kycPhotoV2Fragment = this.b;
        switch (i) {
            case 0:
                KycPhotoV2Fragment.getViewBinding$lambda$11$lambda$9(kycPhotoV2Fragment, view);
                break;
            default:
                KycPhotoV2Fragment.showBottomSheet$lambda$23(kycPhotoV2Fragment, view);
                break;
        }
    }
}
