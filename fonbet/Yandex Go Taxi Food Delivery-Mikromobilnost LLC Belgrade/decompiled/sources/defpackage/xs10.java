package defpackage;

import android.app.Activity;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetDialog;

/* loaded from: classes15.dex */
public final class xs10 {
    public final Activity a;
    public final su10 b;

    public xs10(Activity activity, su10 su10Var) {
        this.a = activity;
        this.b = su10Var;
    }

    public final void a(int i, Runnable runnable, Runnable runnable2) {
        int i2 = w0i0.Messaging_Theme_BottomSheetDialog;
        Activity activity = this.a;
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(activity, i2);
        bottomSheetDialog.setCancelable(true);
        bottomSheetDialog.setCanceledOnTouchOutside(true);
        bottomSheetDialog.setContentView(olh0.msg_d_confirm_popup);
        TextView textView = (TextView) bottomSheetDialog.findViewById(e9h0.button_delete);
        if (textView == null) {
            kbs.g("Delete button is not found in layout");
            return;
        }
        TextView textView2 = (TextView) bottomSheetDialog.findViewById(e9h0.button_cancel);
        if (textView2 == null) {
            kbs.g("Cancel button is not found in layout");
            return;
        }
        y3b1.g(textView, wwg0.msg_ic_delete);
        y3b1.g(textView2, wwg0.msg_ic_close);
        textView.setText(activity.getResources().getQuantityString(ewh0.menu_confirm_delete_messages_plural, i, Integer.valueOf(i)));
        textView.setOnClickListener(new nl(10, bottomSheetDialog, this, runnable));
        textView2.setOnClickListener(new fx00(5, bottomSheetDialog, this));
        bottomSheetDialog.setOnDismissListener(new zf6(3, runnable2));
        bottomSheetDialog.show();
    }
}
