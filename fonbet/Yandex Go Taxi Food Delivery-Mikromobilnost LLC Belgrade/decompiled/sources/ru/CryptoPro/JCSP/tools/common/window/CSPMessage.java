package ru.CryptoPro.JCSP.tools.common.window;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.appcompat.app.AlertDialog;
import defpackage.eb3;
import defpackage.x610;
import ru.CryptoPro.JCSP.tools.common.window.CSPMessage;
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;

/* loaded from: classes4.dex */
public class CSPMessage extends CSPDialog {
    private String replacedMessage;
    private boolean okEnabled = true;
    private boolean cancelEnabled = false;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateDialog$0(DialogInterface dialogInterface, int i) {
        endDialog(0, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateDialog$1(DialogInterface dialogInterface, int i) {
        endDialog(1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$onCreateDialog$2(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return keyBackController(i, keyEvent);
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Bundle bundle2 = this.bundle;
        final int i = 0;
        if (bundle2 != null) {
            this.replacedMessage = bundle2.getString(IDialogId.INTENT_EXTRA_IN_REPLACED_MESSAGE);
            this.okEnabled = this.bundle.getBoolean(IDialogId.INTENT_EXTRA_IN_OK_ENABLED, false);
            this.cancelEnabled = this.bundle.getBoolean(IDialogId.INTENT_EXTRA_IN_CANCEL_ENABLED, false);
        }
        x610 m = new x610(requireActivity(), 0).m(getDialogTitle());
        m.a.f = this.replacedMessage;
        if (this.okEnabled) {
            m.k(new DialogInterface.OnClickListener(this) { // from class: l97
                public final /* synthetic */ CSPMessage b;

                {
                    this.b = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    int i3 = i;
                    CSPMessage cSPMessage = this.b;
                    switch (i3) {
                        case 0:
                            cSPMessage.lambda$onCreateDialog$0(dialogInterface, i2);
                            break;
                        default:
                            cSPMessage.lambda$onCreateDialog$1(dialogInterface, i2);
                            break;
                    }
                }
            });
        }
        final int i2 = 1;
        if (this.cancelEnabled) {
            m.j(new DialogInterface.OnClickListener(this) { // from class: l97
                public final /* synthetic */ CSPMessage b;

                {
                    this.b = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i22) {
                    int i3 = i2;
                    CSPMessage cSPMessage = this.b;
                    switch (i3) {
                        case 0:
                            cSPMessage.lambda$onCreateDialog$0(dialogInterface, i22);
                            break;
                        default:
                            cSPMessage.lambda$onCreateDialog$1(dialogInterface, i22);
                            break;
                    }
                }
            });
        }
        AlertDialog create = m.create();
        create.setCancelable(true);
        create.setCanceledOnTouchOutside(false);
        create.setOnKeyListener(new eb3(i2, this));
        return create;
    }
}
