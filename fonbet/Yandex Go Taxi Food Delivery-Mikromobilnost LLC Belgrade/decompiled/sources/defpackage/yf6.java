package defpackage;

import android.content.DialogInterface;
import com.yandex.messaging.internal.view.messagemenu.MessageMenuReporter$Item;
import com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.TransferMainFragment;

/* loaded from: classes15.dex */
public final /* synthetic */ class yf6 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yf6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((mrb) ((ag6) obj)).b = null;
                break;
            case 1:
                uhx uhxVar = (uhx) ((j4n) obj).z;
                if (uhxVar != null) {
                    ((ts10) uhxVar.b).d.a(MessageMenuReporter$Item.REPORT_CANCEL);
                    break;
                }
                break;
            default:
                ((TransferMainFragment) obj).dismissCommentDialog();
                break;
        }
    }
}
