package defpackage;

import com.yandex.go.pickup_from_photo.presentation.PickupFromPhotoModalView;

/* loaded from: classes13.dex */
public final /* synthetic */ class vnb0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickupFromPhotoModalView b;

    public /* synthetic */ vnb0(PickupFromPhotoModalView pickupFromPhotoModalView, int i) {
        this.a = i;
        this.b = pickupFromPhotoModalView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 _init_$lambda$0;
        zy11 _init_$lambda$2;
        zy11 _init_$lambda$3;
        zy11 takePhoto$lambda$0;
        int i = this.a;
        PickupFromPhotoModalView pickupFromPhotoModalView = this.b;
        switch (i) {
            case 0:
                _init_$lambda$0 = PickupFromPhotoModalView._init_$lambda$0(pickupFromPhotoModalView);
                return _init_$lambda$0;
            case 1:
                _init_$lambda$2 = PickupFromPhotoModalView._init_$lambda$2(pickupFromPhotoModalView);
                return _init_$lambda$2;
            case 2:
                _init_$lambda$3 = PickupFromPhotoModalView._init_$lambda$3(pickupFromPhotoModalView);
                return _init_$lambda$3;
            default:
                takePhoto$lambda$0 = PickupFromPhotoModalView.takePhoto$lambda$0(pickupFromPhotoModalView);
                return takePhoto$lambda$0;
        }
    }
}
