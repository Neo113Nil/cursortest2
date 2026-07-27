package com.anythink.expressad.widget.a;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import com.anythink.core.common.d.t;
import com.anythink.expressad.foundation.h.k;
import com.anythink.expressad.foundation.h.x;

/* loaded from: classes.dex */
public final class a extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    private static final String f22654a = "ATAlertDialog";

    /* renamed from: b, reason: collision with root package name */
    private b f22655b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f22656c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f22657d;

    /* renamed from: e, reason: collision with root package name */
    private Button f22658e;

    /* renamed from: f, reason: collision with root package name */
    private Button f22659f;

    public a(Context context, final b bVar) {
        super(context);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        requestWindowFeature(1);
        View inflate = LayoutInflater.from(context).inflate(k.a(context, "anythink_cm_alertview", "layout"), (ViewGroup) null);
        this.f22655b = bVar;
        if (inflate != null) {
            setContentView(inflate);
            try {
                this.f22656c = (TextView) inflate.findViewById(k.a(context, "anythink_video_common_alertview_titleview", "id"));
            } catch (Exception e6) {
                e6.getMessage();
            }
            try {
                this.f22657d = (TextView) inflate.findViewById(k.a(context, "anythink_video_common_alertview_contentview", "id"));
                this.f22658e = (Button) inflate.findViewById(k.a(context, "anythink_video_common_alertview_confirm_button", "id"));
                this.f22659f = (Button) inflate.findViewById(k.a(context, "anythink_video_common_alertview_cancel_button", "id"));
            } catch (Exception e9) {
                e9.getMessage();
            }
        }
        Button button = this.f22659f;
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.widget.a.a.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.a();
                    }
                    a.this.cancel();
                    a.this.a();
                }
            });
        }
        Button button2 = this.f22658e;
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.widget.a.a.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.b();
                    }
                    a.this.cancel();
                    a.this.a();
                }
            });
        }
        setCanceledOnTouchOutside(false);
        setCancelable(false);
    }

    private void b(String str) {
        TextView textView = this.f22657d;
        if (textView != null) {
            textView.setText(str);
        }
    }

    private void c(String str) {
        Button button = this.f22658e;
        if (button != null) {
            button.setText(str);
        }
    }

    private void d(String str) {
        Button button = this.f22659f;
        if (button != null) {
            button.setText(str);
        }
    }

    private void e() {
        Context g9 = t.b().g();
        String string = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close_warn", k.f19794g));
        String string2 = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close_desc", k.f19794g));
        String string3 = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close", k.f19794g));
        String string4 = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_continue_to_play", k.f19794g));
        a(string);
        b(string2);
        c(string3);
        d(string4);
    }

    public final void a() {
        if (this.f22655b != null) {
            this.f22655b = null;
        }
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        try {
            getWindow().setFlags(8, 8);
            super.show();
            Window window = getWindow();
            if (window != null) {
                window.setFlags(1024, 1024);
                int i = Build.VERSION.SDK_INT;
                window.addFlags(67108864);
                window.getDecorView().setSystemUiVisibility(4098);
                if (i >= 28) {
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    if (i >= 30) {
                        attributes.layoutInDisplayCutoutMode = 3;
                    } else {
                        attributes.layoutInDisplayCutoutMode = 1;
                    }
                    window.setAttributes(attributes);
                }
                window.setBackgroundDrawable(new ColorDrawable(0));
                window.setLayout(-1, -1);
                window.setGravity(17);
            }
            getWindow().clearFlags(8);
        } catch (Exception e6) {
            e6.getMessage();
            super.show();
        }
    }

    private void a(String str) {
        TextView textView = this.f22656c;
        if (textView != null) {
            textView.setText(str);
        }
    }

    private void c() {
        Context g9 = t.b().g();
        String string = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close_warn", k.f19794g));
        String string2 = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close_desc", k.f19794g));
        String string3 = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close", k.f19794g));
        String string4 = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_cancel_close", k.f19794g));
        a(string);
        b(string2);
        c(string3);
        d(string4);
    }

    private void d() {
        com.anythink.expressad.f.b.a();
        com.anythink.expressad.foundation.b.a.c().f();
        com.anythink.expressad.f.a b9 = com.anythink.expressad.f.b.b();
        if (b9 != null) {
            a(b9.C(), b9.D(), b9.E(), b9.F());
            return;
        }
        Context g9 = t.b().g();
        String string = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close_warn", k.f19794g));
        String string2 = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close_desc", k.f19794g));
        String string3 = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close", k.f19794g));
        String string4 = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_continue_to_play", k.f19794g));
        a(string);
        b(string2);
        c(string3);
        d(string4);
    }

    public final void b() {
        try {
            Context g9 = t.b().g();
            String string = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close_warn", k.f19794g));
            String string2 = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close_desc", k.f19794g));
            String string3 = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close", k.f19794g));
            String string4 = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_cancel_close", k.f19794g));
            a(string);
            b(string2);
            c(string3);
            d(string4);
        } catch (Exception e6) {
            e6.getMessage();
        }
    }

    private void a(String str, String str2, String str3, String str4) {
        a(str);
        b(str2);
        c(str3);
        d(str4);
    }

    private void a(int i) {
        Context g9 = t.b().g();
        String string = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close_warn", k.f19794g));
        String string2 = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close_warn_tips", k.f19794g));
        String string3 = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close_warn_close", k.f19794g));
        String string4 = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close_warn_continue", k.f19794g));
        String string5 = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close", k.f19794g));
        String string6 = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close_cancel", k.f19794g));
        String string7 = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close_continue", k.f19794g));
        if (i != com.anythink.expressad.foundation.g.a.cv) {
            string = string2;
        }
        a(string);
        if (i != com.anythink.expressad.foundation.g.a.cv) {
            string3 = string4;
        }
        b(string3);
        if (i != com.anythink.expressad.foundation.g.a.cv) {
            string5 = string6;
        }
        c(string5);
        d(string7);
    }

    public final void a(int i, String str) {
        try {
            String obj = x.b(getContext(), "Anythink_ConfirmTitle".concat(String.valueOf(str)), "").toString();
            String obj2 = x.b(getContext(), "Anythink_ConfirmContent".concat(String.valueOf(str)), "").toString();
            String obj3 = x.b(getContext(), "Anythink_CancelText".concat(String.valueOf(str)), "").toString();
            String obj4 = x.b(getContext(), "Anythink_ConfirmText".concat(String.valueOf(str)), "").toString();
            if (TextUtils.isEmpty(obj) && TextUtils.isEmpty(obj2) && TextUtils.isEmpty(obj3) && TextUtils.isEmpty(obj4)) {
                Context g9 = t.b().g();
                String string = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close_warn", k.f19794g));
                String string2 = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close_warn_tips", k.f19794g));
                String string3 = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close_warn_close", k.f19794g));
                String string4 = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close_warn_continue", k.f19794g));
                String string5 = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close", k.f19794g));
                String string6 = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close_cancel", k.f19794g));
                String string7 = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close_continue", k.f19794g));
                if (i != com.anythink.expressad.foundation.g.a.cv) {
                    string = string2;
                }
                a(string);
                if (i != com.anythink.expressad.foundation.g.a.cv) {
                    string3 = string4;
                }
                b(string3);
                if (i != com.anythink.expressad.foundation.g.a.cv) {
                    string5 = string6;
                }
                c(string5);
                d(string7);
                return;
            }
            a(obj, obj2, obj3, obj4);
        } catch (Exception e6) {
            e6.getMessage();
        }
    }

    private static void a(Window window) {
        if (window != null) {
            window.setFlags(1024, 1024);
            int i = Build.VERSION.SDK_INT;
            window.addFlags(67108864);
            window.getDecorView().setSystemUiVisibility(4098);
            if (i >= 28) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                if (i >= 30) {
                    attributes.layoutInDisplayCutoutMode = 3;
                } else {
                    attributes.layoutInDisplayCutoutMode = 1;
                }
                window.setAttributes(attributes);
            }
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(-1, -1);
            window.setGravity(17);
        }
    }
}
