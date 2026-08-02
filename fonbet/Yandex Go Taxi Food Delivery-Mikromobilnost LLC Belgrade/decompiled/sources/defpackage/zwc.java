package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Toast;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.yandex.messaging.internal.view.messagemenu.MessageMenuDialog;
import com.yandex.messaging.internal.view.messagemenu.a;
import com.ybsdk.feature.savings.internal.screens.dashboard.v4.SavingsShelfView;

/* loaded from: classes15.dex */
public final /* synthetic */ class zwc implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ zwc(SavingsShelfView savingsShelfView, tdm0 tdm0Var, boolean z) {
        this.a = 2;
        this.b = z;
        this.c = savingsShelfView;
        this.w = tdm0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MessageMenuDialog messageMenuDialog;
        int i = this.a;
        Object obj = this.w;
        Object obj2 = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                j4n j4nVar = (j4n) obj2;
                Context context = (Context) j4nVar.a;
                Runnable runnable = (Runnable) obj;
                if (!z) {
                    ((BottomSheetDialog) j4nVar.b).dismiss();
                    Toast.makeText(context, (String) j4nVar.w, 0).show();
                    runnable.run();
                    break;
                } else {
                    new AlertDialog.Builder(context, w0i0.Messaging_AlertDialog).setTitle(oyh0.report_abusive_user_title).setMessage(oyh0.report_abusive_user_content).setPositiveButton(oyh0.report_abusive_user_ok, new ow4(2, j4nVar, runnable)).setNegativeButton(oyh0.report_abusive_user_cancel, (DialogInterface.OnClickListener) null).create().show();
                    break;
                }
            case 1:
                a aVar = (a) obj;
                ((sls) obj2).invoke();
                if (z && (messageMenuDialog = aVar.A) != null) {
                    messageMenuDialog.close();
                    break;
                }
                break;
            default:
                SavingsShelfView.render$lambda$7(z, (SavingsShelfView) obj2, (tdm0) obj, view);
                break;
        }
    }

    public /* synthetic */ zwc(Object obj, boolean z, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
        this.w = obj2;
    }
}
