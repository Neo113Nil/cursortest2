package defpackage;

import android.net.Uri;
import com.ybsdk.feature.main.internal.screens.sbpAccount.SbpAccountInfoFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class xdm0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ SbpAccountInfoFragment b;

    public /* synthetic */ xdm0(SbpAccountInfoFragment sbpAccountInfoFragment, int i) {
        this.a = i;
        this.b = sbpAccountInfoFragment;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 stateForRender$lambda$3;
        boolean stateForRender$lambda$8$lambda$7$lambda$6;
        zy11 stateForRender$lambda$5;
        zy11 stateForRender$lambda$11$lambda$10;
        zy11 stateForRender$lambda$15$lambda$14;
        zy11 stateForRender$lambda$16;
        int i = this.a;
        SbpAccountInfoFragment sbpAccountInfoFragment = this.b;
        switch (i) {
            case 0:
                stateForRender$lambda$3 = SbpAccountInfoFragment.getStateForRender$lambda$3(sbpAccountInfoFragment, ((Boolean) obj).booleanValue());
                return stateForRender$lambda$3;
            case 1:
                stateForRender$lambda$8$lambda$7$lambda$6 = SbpAccountInfoFragment.getStateForRender$lambda$8$lambda$7$lambda$6(sbpAccountInfoFragment, (Uri) obj);
                return Boolean.valueOf(stateForRender$lambda$8$lambda$7$lambda$6);
            case 2:
                stateForRender$lambda$5 = SbpAccountInfoFragment.getStateForRender$lambda$5(sbpAccountInfoFragment, ((Boolean) obj).booleanValue());
                return stateForRender$lambda$5;
            case 3:
                stateForRender$lambda$11$lambda$10 = SbpAccountInfoFragment.getStateForRender$lambda$11$lambda$10(sbpAccountInfoFragment, ((Boolean) obj).booleanValue());
                return stateForRender$lambda$11$lambda$10;
            case 4:
                stateForRender$lambda$15$lambda$14 = SbpAccountInfoFragment.getStateForRender$lambda$15$lambda$14(sbpAccountInfoFragment, ((Boolean) obj).booleanValue());
                return stateForRender$lambda$15$lambda$14;
            default:
                stateForRender$lambda$16 = SbpAccountInfoFragment.getStateForRender$lambda$16(sbpAccountInfoFragment, ((Boolean) obj).booleanValue());
                return stateForRender$lambda$16;
        }
    }
}
