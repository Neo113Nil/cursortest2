package defpackage;

import android.graphics.drawable.Drawable;
import com.yandex.go.scooters.misc.action_dialog.ScootersActionDialogModalView;

/* loaded from: classes13.dex */
public final /* synthetic */ class zpm0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ScootersActionDialogModalView b;

    public /* synthetic */ zpm0(ScootersActionDialogModalView scootersActionDialogModalView, int i) {
        this.a = i;
        this.b = scootersActionDialogModalView;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 insetsType$lambda$0;
        zy11 bindImage$lambda$0$1;
        zy11 bindIcon$lambda$0$1;
        int i = this.a;
        ScootersActionDialogModalView scootersActionDialogModalView = this.b;
        switch (i) {
            case 0:
                insetsType$lambda$0 = ScootersActionDialogModalView.insetsType$lambda$0(scootersActionDialogModalView, (t1w) obj);
                return insetsType$lambda$0;
            case 1:
                bindImage$lambda$0$1 = ScootersActionDialogModalView.bindImage$lambda$0$1(scootersActionDialogModalView, (Drawable) obj);
                return bindImage$lambda$0$1;
            default:
                bindIcon$lambda$0$1 = ScootersActionDialogModalView.bindIcon$lambda$0$1(scootersActionDialogModalView, (Drawable) obj);
                return bindIcon$lambda$0$1;
        }
    }
}
