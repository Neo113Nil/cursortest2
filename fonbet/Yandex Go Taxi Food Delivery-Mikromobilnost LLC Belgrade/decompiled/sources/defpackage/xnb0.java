package defpackage;

import com.yandex.go.pickup_from_photo.presentation.PickupFromPhotoModalView;

/* loaded from: classes13.dex */
public final class xnb0 implements znb0 {
    public final /* synthetic */ PickupFromPhotoModalView a;

    public xnb0(PickupFromPhotoModalView pickupFromPhotoModalView) {
        this.a = pickupFromPhotoModalView;
    }

    @Override // defpackage.znb0
    public final void h9(String str, String str2) {
        zmb0 binding;
        zmb0 binding2;
        PickupFromPhotoModalView pickupFromPhotoModalView = this.a;
        binding = pickupFromPhotoModalView.getBinding();
        binding.g.setText(str);
        binding2 = pickupFromPhotoModalView.getBinding();
        binding2.g.setVisibility(0);
        pickupFromPhotoModalView.showAnimatedHint(str, str2);
    }

    @Override // defpackage.znb0
    public final void hideHint() {
        this.a.hideAnimatedHint();
    }

    @Override // defpackage.znb0
    public final void j3(qpb0 qpb0Var) {
        zmb0 binding;
        zmb0 binding2;
        zmb0 binding3;
        zmb0 binding4;
        zmb0 binding5;
        dv31 dv31Var;
        boolean z = qpb0Var instanceof ppb0;
        PickupFromPhotoModalView pickupFromPhotoModalView = this.a;
        if (z) {
            dv31Var = pickupFromPhotoModalView.cameraStateHolder;
            dv31Var.g(qpb0Var, false, false);
            return;
        }
        if (!(qpb0Var instanceof npb0)) {
            w511.b();
            return;
        }
        npb0 npb0Var = (npb0) qpb0Var;
        binding = pickupFromPhotoModalView.getBinding();
        binding.j.e.setText(npb0Var.a);
        binding2 = pickupFromPhotoModalView.getBinding();
        binding2.j.d.setText(npb0Var.b);
        binding3 = pickupFromPhotoModalView.getBinding();
        binding3.j.b.setVisibility(0);
        binding4 = pickupFromPhotoModalView.getBinding();
        binding4.k.setVisibility(8);
        binding5 = pickupFromPhotoModalView.getBinding();
        binding5.e.setVisibility(8);
    }

    @Override // defpackage.znb0
    public final void startCamera() {
        PickupFromPhotoModalView pickupFromPhotoModalView = this.a;
        if (pickupFromPhotoModalView.isAttachedToWindow()) {
            pickupFromPhotoModalView.startCamera();
        }
    }
}
