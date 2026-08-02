package defpackage;

import com.ybsdk.feature.pin.internal.screens.createpin.CreatePinFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class u6f implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ CreatePinFragment b;

    public /* synthetic */ u6f(CreatePinFragment createPinFragment, int i) {
        this.a = i;
        this.b = createPinFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 render$lambda$14$lambda$12;
        zy11 render$lambda$14$lambda$13;
        zy11 onViewCreated$lambda$10$lambda$7;
        zy11 onViewCreated$lambda$10$lambda$8;
        zy11 onViewCreated$lambda$10$lambda$9;
        int i = this.a;
        CreatePinFragment createPinFragment = this.b;
        switch (i) {
            case 0:
                render$lambda$14$lambda$12 = CreatePinFragment.render$lambda$14$lambda$12(createPinFragment);
                return render$lambda$14$lambda$12;
            case 1:
                render$lambda$14$lambda$13 = CreatePinFragment.render$lambda$14$lambda$13(createPinFragment);
                return render$lambda$14$lambda$13;
            case 2:
                onViewCreated$lambda$10$lambda$7 = CreatePinFragment.onViewCreated$lambda$10$lambda$7(createPinFragment);
                return onViewCreated$lambda$10$lambda$7;
            case 3:
                onViewCreated$lambda$10$lambda$8 = CreatePinFragment.onViewCreated$lambda$10$lambda$8(createPinFragment);
                return onViewCreated$lambda$10$lambda$8;
            default:
                onViewCreated$lambda$10$lambda$9 = CreatePinFragment.onViewCreated$lambda$10$lambda$9(createPinFragment);
                return onViewCreated$lambda$10$lambda$9;
        }
    }
}
