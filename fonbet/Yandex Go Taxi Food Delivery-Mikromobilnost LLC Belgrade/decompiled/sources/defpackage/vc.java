package defpackage;

import android.view.View;
import ru.yandex.taxi.surge.dialog.accept_paid.AcceptPaidOptionDialog;

/* loaded from: classes6.dex */
public final /* synthetic */ class vc implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ AcceptPaidOptionDialog b;

    public /* synthetic */ vc(AcceptPaidOptionDialog acceptPaidOptionDialog, int i) {
        this.a = i;
        this.b = acceptPaidOptionDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        AcceptPaidOptionDialog acceptPaidOptionDialog = this.b;
        switch (i) {
            case 0:
                AcceptPaidOptionDialog.setupNextButton$lambda$0(acceptPaidOptionDialog, view);
                break;
            default:
                AcceptPaidOptionDialog._init_$lambda$0(acceptPaidOptionDialog, view);
                break;
        }
    }
}
