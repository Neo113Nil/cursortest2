package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.fpspay.presentation.FpsPayEnrollFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class qas implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ FpsPayEnrollFragment b;

    public /* synthetic */ qas(FpsPayEnrollFragment fpsPayEnrollFragment, int i) {
        this.a = i;
        this.b = fpsPayEnrollFragment;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 renderBottomSheet$lambda$18$lambda$16$lambda$15$lambda$14$lambda$13;
        zy11 render$lambda$8$lambda$7$lambda$6;
        int i = this.a;
        FpsPayEnrollFragment fpsPayEnrollFragment = this.b;
        switch (i) {
            case 0:
                renderBottomSheet$lambda$18$lambda$16$lambda$15$lambda$14$lambda$13 = FpsPayEnrollFragment.renderBottomSheet$lambda$18$lambda$16$lambda$15$lambda$14$lambda$13(fpsPayEnrollFragment, ((Boolean) obj).booleanValue());
                return renderBottomSheet$lambda$18$lambda$16$lambda$15$lambda$14$lambda$13;
            default:
                render$lambda$8$lambda$7$lambda$6 = FpsPayEnrollFragment.render$lambda$8$lambda$7$lambda$6(fpsPayEnrollFragment, (String) obj);
                return render$lambda$8$lambda$7$lambda$6;
        }
    }
}
