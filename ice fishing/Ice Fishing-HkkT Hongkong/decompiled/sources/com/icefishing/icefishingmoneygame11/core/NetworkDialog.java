package com.icefishing.icefishingmoneygame11.core;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatButton;
import com.icefishing.icefishingmoneygame11.R;
import com.icefishing.icefishingmoneygame11.screens.LaunchActivity;
import java.util.Objects;

/* loaded from: classes2.dex */
public class NetworkDialog {
    public static AlertDialog mDialog;

    public static void ShowNoInternet(final Activity activity) {
        View inflate = LayoutInflater.from(activity).inflate(R.layout.dialog_network_required, (ViewGroup) null);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setCancelable(false);
        builder.setView(inflate);
        AlertDialog create = builder.create();
        mDialog = create;
        ((Window) Objects.requireNonNull(create.getWindow())).setBackgroundDrawableResource(android.R.color.transparent);
        final AppCompatButton appCompatButton = (AppCompatButton) inflate.findViewById(R.id.btn_ok);
        appCompatButton.setEnabled(true);
        appCompatButton.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingmoneygame11.core.NetworkDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NetworkDialog.lambda$ShowNoInternet$0(activity, appCompatButton, view);
            }
        });
        mDialog.show();
    }

    static /* synthetic */ void lambda$ShowNoInternet$0(Activity activity, AppCompatButton appCompatButton, View view) {
        if (activity instanceof LaunchActivity) {
            activity.finishAffinity();
        } else {
            appCompatButton.setEnabled(false);
            Toast.makeText(activity, activity.getResources().getString(R.string.No_Internet_msg), 0).show();
        }
    }
}
