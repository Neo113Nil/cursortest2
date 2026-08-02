package defpackage;

import ru.yandex.taxi.design.ClickableImageView;

/* loaded from: classes9.dex */
public final /* synthetic */ class t1c implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ClickableImageView b;

    public /* synthetic */ t1c(ClickableImageView clickableImageView, int i) {
        this.a = i;
        this.b = clickableImageView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        String str;
        String str2;
        int i = this.a;
        ClickableImageView clickableImageView = this.b;
        switch (i) {
            case 0:
                str = clickableImageView.analyticsButtonName;
                return str;
            default:
                str2 = clickableImageView.analyticsButtonName;
                return str2;
        }
    }
}
