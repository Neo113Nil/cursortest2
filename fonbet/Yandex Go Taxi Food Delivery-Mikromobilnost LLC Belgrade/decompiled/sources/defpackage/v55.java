package defpackage;

import com.yandex.go.places.organization.card.impl.ui.card.common.BaseOrganizationCardModalView;

/* loaded from: classes13.dex */
public final /* synthetic */ class v55 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseOrganizationCardModalView b;

    public /* synthetic */ v55(BaseOrganizationCardModalView baseOrganizationCardModalView, int i) {
        this.a = i;
        this.b = baseOrganizationCardModalView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int cornerRadius;
        int i = this.a;
        BaseOrganizationCardModalView baseOrganizationCardModalView = this.b;
        switch (i) {
            case 0:
                cornerRadius = baseOrganizationCardModalView.getCornerRadius();
                break;
            case 1:
                cornerRadius = BaseOrganizationCardModalView.transparentColor_delegate$lambda$0(baseOrganizationCardModalView);
                break;
            default:
                cornerRadius = BaseOrganizationCardModalView.cardCornerRadius_delegate$lambda$0(baseOrganizationCardModalView);
                break;
        }
        return Integer.valueOf(cornerRadius);
    }
}
