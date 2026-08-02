package defpackage;

import com.yandex.mobile.drive.view.AlertView;

/* loaded from: classes15.dex */
public final /* synthetic */ class tr1 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ AlertView b;

    public /* synthetic */ tr1(AlertView alertView, int i) {
        this.a = i;
        this.b = alertView;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        zy11 doDismiss$lambda$14;
        zy11 showInternal$lambda$11;
        int i = this.a;
        AlertView alertView = this.b;
        float floatValue = ((Float) obj2).floatValue();
        switch (i) {
            case 0:
                doDismiss$lambda$14 = AlertView.doDismiss$lambda$14(alertView, obj, floatValue);
                return doDismiss$lambda$14;
            default:
                showInternal$lambda$11 = AlertView.showInternal$lambda$11(alertView, obj, floatValue);
                return showInternal$lambda$11;
        }
    }
}
