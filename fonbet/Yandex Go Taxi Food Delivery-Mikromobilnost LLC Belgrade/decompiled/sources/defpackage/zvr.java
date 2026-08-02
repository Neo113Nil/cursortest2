package defpackage;

import com.yandex.payment.sdk.ui.view.PersonalInfoView;
import com.ybsdk.widgets.common.FullscreenStatusView;

/* loaded from: classes2.dex */
public final /* synthetic */ class zvr implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ sls b;

    public /* synthetic */ zvr(int i, sls slsVar) {
        this.a = i;
        this.b = slsVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 secondaryButtonAction$lambda$12;
        zy11 primaryButtonAction$lambda$11;
        zy11 callback$lambda$0;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        sls slsVar = this.b;
        switch (i) {
            case 0:
                slsVar.invoke();
                return zy11Var;
            case 1:
                slsVar.invoke();
                return zy11Var;
            case 2:
                secondaryButtonAction$lambda$12 = FullscreenStatusView.setSecondaryButtonAction$lambda$12(slsVar);
                return secondaryButtonAction$lambda$12;
            case 3:
                primaryButtonAction$lambda$11 = FullscreenStatusView.setPrimaryButtonAction$lambda$11(slsVar);
                return primaryButtonAction$lambda$11;
            case 4:
                slsVar.invoke();
                return zy11Var;
            case 5:
                slsVar.invoke();
                return zy11Var;
            case 6:
                slsVar.invoke();
                return zy11Var;
            case 7:
                slsVar.invoke();
                return zy11Var;
            case 8:
                slsVar.invoke();
                break;
            case 9:
                slsVar.invoke();
                break;
            case 10:
                slsVar.invoke();
                return zy11Var;
            case 11:
                slsVar.invoke();
                return zy11Var;
            case 12:
                slsVar.invoke();
                return zy11Var;
            case 13:
                slsVar.invoke();
                return zy11Var;
            case 14:
                slsVar.invoke();
                return zy11Var;
            case 15:
                slsVar.invoke();
                break;
            case 16:
                slsVar.invoke();
                return zy11Var;
            case 17:
                slsVar.invoke();
                return zy11Var;
            case 18:
                slsVar.invoke();
                return zy11Var;
            case 19:
                callback$lambda$0 = PersonalInfoView.setCallback$lambda$0(slsVar);
                return callback$lambda$0;
            case 20:
                if (slsVar != null) {
                    slsVar.invoke();
                }
                return zy11Var;
            case 21:
                slsVar.invoke();
                return zy11Var;
            case 22:
                slsVar.invoke();
                return zy11Var;
            case 23:
                float floatValue = ((Number) slsVar.invoke()).floatValue();
                if (floatValue < 0.0f) {
                    floatValue = 0.0f;
                }
                if (floatValue > 1.0f) {
                    floatValue = 1.0f;
                }
                return Float.valueOf(floatValue);
            case 24:
                slsVar.invoke();
                return zy11Var;
            case 25:
                slsVar.invoke();
                break;
            case 26:
                slsVar.invoke();
                break;
            case 27:
                slsVar.invoke();
                return zy11Var;
            case 28:
                slsVar.invoke();
                return zy11Var;
            default:
                slsVar.invoke();
                return zy11Var;
        }
        return Boolean.TRUE;
    }
}
