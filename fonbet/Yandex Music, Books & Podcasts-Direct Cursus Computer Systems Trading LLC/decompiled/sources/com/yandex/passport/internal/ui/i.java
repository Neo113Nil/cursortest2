package com.yandex.passport.internal.ui;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import defpackage.gr0;

/* loaded from: classes4.dex */
public final class i {
    public final Context a;
    public boolean b;
    public boolean c;
    public DialogInterface.OnCancelListener d;
    public String e;
    public String f;
    public CharSequence g;
    public DialogInterface.OnClickListener h;
    public CharSequence i;
    public DialogInterface.OnClickListener j;
    public final int k;

    public i(Context context, int i) {
        this.b = true;
        this.c = true;
        this.a = context;
        this.k = i;
    }

    public final gr0 a() {
        final gr0 gr0Var = new gr0(this.a, 0);
        gr0Var.setOnCancelListener(this.d);
        gr0Var.setCancelable(this.b);
        gr0Var.setCanceledOnTouchOutside(this.c);
        gr0Var.setContentView(this.k);
        gr0Var.getWindow().setBackgroundDrawableResource(R.color.transparent);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(gr0Var.getWindow().getAttributes());
        layoutParams.width = -1;
        gr0Var.show();
        gr0Var.getWindow().setAttributes(layoutParams);
        Button button = (Button) gr0Var.findViewById(com.yandex.passport.R.id.button_dialog_negative);
        Button button2 = (Button) gr0Var.findViewById(com.yandex.passport.R.id.button_dialog_positive);
        TextView textView = (TextView) gr0Var.findViewById(com.yandex.passport.R.id.text_dialog_message);
        TextView textView2 = (TextView) gr0Var.findViewById(com.yandex.passport.R.id.text_dialog_title);
        final int i = 0;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: com.yandex.passport.internal.ui.h
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        DialogInterface.OnClickListener onClickListener = this.b.h;
                        gr0 gr0Var2 = gr0Var;
                        if (onClickListener != null) {
                            onClickListener.onClick(gr0Var2, -1);
                        }
                        gr0Var2.dismiss();
                        break;
                    default:
                        DialogInterface.OnClickListener onClickListener2 = this.b.j;
                        gr0 gr0Var3 = gr0Var;
                        if (onClickListener2 != null) {
                            onClickListener2.onClick(gr0Var3, -2);
                        }
                        gr0Var3.dismiss();
                        break;
                }
            }
        });
        final int i2 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.yandex.passport.internal.ui.h
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        DialogInterface.OnClickListener onClickListener = this.b.h;
                        gr0 gr0Var2 = gr0Var;
                        if (onClickListener != null) {
                            onClickListener.onClick(gr0Var2, -1);
                        }
                        gr0Var2.dismiss();
                        break;
                    default:
                        DialogInterface.OnClickListener onClickListener2 = this.b.j;
                        gr0 gr0Var3 = gr0Var;
                        if (onClickListener2 != null) {
                            onClickListener2.onClick(gr0Var3, -2);
                        }
                        gr0Var3.dismiss();
                        break;
                }
            }
        });
        textView2.setVisibility(TextUtils.isEmpty(this.e) ? 8 : 0);
        textView2.setText(this.e);
        textView.setVisibility(0);
        textView.setText(this.f);
        button2.setVisibility(TextUtils.isEmpty(this.g) ? 8 : 0);
        button2.setText(this.g);
        button.setVisibility(TextUtils.isEmpty(this.i) ? 8 : 0);
        button.setText(this.i);
        return gr0Var;
    }

    public final void b(int i) {
        this.f = this.a.getString(i);
    }

    public final void c(int i, DialogInterface.OnClickListener onClickListener) {
        this.g = this.a.getText(i);
        this.h = onClickListener;
    }

    public i(Context context) {
        this(context, com.yandex.passport.R.layout.passport_warning_dialog);
    }
}
