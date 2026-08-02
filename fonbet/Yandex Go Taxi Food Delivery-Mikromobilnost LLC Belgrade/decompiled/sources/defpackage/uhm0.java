package defpackage;

import android.text.Editable;
import com.ybsdk.feature.main.internal.screens.sbpPartners.SbpPartnersFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class uhm0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ SbpPartnersFragment b;

    public /* synthetic */ uhm0(SbpPartnersFragment sbpPartnersFragment, int i) {
        this.a = i;
        this.b = sbpPartnersFragment;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 inputWatcher$lambda$2;
        zy11 consumeSideEffect$lambda$25$lambda$24;
        zy11 consumeSideEffect$lambda$35$lambda$33;
        zy11 consumeSideEffect$lambda$35$lambda$34;
        int i = this.a;
        SbpPartnersFragment sbpPartnersFragment = this.b;
        switch (i) {
            case 0:
                inputWatcher$lambda$2 = SbpPartnersFragment.inputWatcher$lambda$2(sbpPartnersFragment, (Editable) obj);
                return inputWatcher$lambda$2;
            case 1:
                consumeSideEffect$lambda$25$lambda$24 = SbpPartnersFragment.consumeSideEffect$lambda$25$lambda$24(sbpPartnersFragment, ((Boolean) obj).booleanValue());
                return consumeSideEffect$lambda$25$lambda$24;
            case 2:
                consumeSideEffect$lambda$35$lambda$33 = SbpPartnersFragment.consumeSideEffect$lambda$35$lambda$33(sbpPartnersFragment, ((Boolean) obj).booleanValue());
                return consumeSideEffect$lambda$35$lambda$33;
            default:
                consumeSideEffect$lambda$35$lambda$34 = SbpPartnersFragment.consumeSideEffect$lambda$35$lambda$34(sbpPartnersFragment, (String) obj);
                return consumeSideEffect$lambda$35$lambda$34;
        }
    }
}
