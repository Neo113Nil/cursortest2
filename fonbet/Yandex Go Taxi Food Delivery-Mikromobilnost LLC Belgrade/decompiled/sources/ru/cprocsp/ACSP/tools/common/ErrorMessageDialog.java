package ru.cprocsp.ACSP.tools.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import defpackage.ow4;
import defpackage.x610;

/* loaded from: classes4.dex */
public class ErrorMessageDialog extends DialogFragment {
    private Boolean isCancellable;
    private Boolean isFinishing;
    private String message = "";

    public ErrorMessageDialog() {
        Boolean bool = Boolean.FALSE;
        this.isCancellable = bool;
        this.isFinishing = bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateDialog$0(FragmentActivity fragmentActivity, DialogInterface dialogInterface, int i) {
        if (this.isFinishing.booleanValue()) {
            fragmentActivity.finishAndRemoveTask();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        DialogContent dialogContent;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (dialogContent = (DialogContent) arguments.getSerializable(DialogContent.INTENT_PARAM_DIALOG_CONTENT)) != null) {
            this.message = dialogContent.message;
            this.isCancellable = dialogContent.isCancellable;
            this.isFinishing = dialogContent.isFinishing;
        }
        setCancelable(this.isCancellable.booleanValue());
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        FragmentActivity requireActivity = requireActivity();
        x610 x610Var = new x610(requireActivity, 0);
        x610Var.n();
        x610Var.a.f = this.message;
        x610 k = x610Var.k(new ow4(3, this, requireActivity));
        k.a.m = this.isCancellable.booleanValue();
        return k.create();
    }
}
