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
    private static final String f23283a = "ATAlertDialog";

    /* renamed from: b, reason: collision with root package name */
    private b f23284b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f23285c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f23286d;

    /* renamed from: e, reason: collision with root package name */
    private Button f23287e;

    /* renamed from: f, reason: collision with root package name */
    private Button f23288f;

    public a(Context context, final b bVar) {
        super(context);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        requestWindowFeature(1);
        View inflate = LayoutInflater.from(context).inflate(k.a(context, "anythink_cm_alertview", "layout"), (ViewGroup) null);
        this.f23284b = bVar;
        if (inflate != null) {
            setContentView(inflate);
            try {
                this.f23285c = (TextView) inflate.findViewById(k.a(context, "anythink_video_common_alertview_titleview", "id"));
            } catch (Exception e9) {
                e9.getMessage();
            }
            try {
                this.f23286d = (TextView) inflate.findViewById(k.a(context, "anythink_video_common_alertview_contentview", "id"));
                this.f23287e = (Button) inflate.findViewById(k.a(context, "anythink_video_common_alertview_confirm_button", "id"));
                this.f23288f = (Button) inflate.findViewById(k.a(context, "anythink_video_common_alertview_cancel_button", "id"));
            } catch (Exception e10) {
                e10.getMessage();
            }
        }
        Button button = this.f23288f;
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
        Button button2 = this.f23287e;
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
        TextView textView = this.f23286d;
        if (textView != null) {
            textView.setText(str);
        }
    }

    private void c(String str) {
        Button button = this.f23287e;
        if (button != null) {
            button.setText(str);
        }
    }

    private void d(String str) {
        Button button = this.f23288f;
        if (button != null) {
            button.setText(str);
        }
    }

    private void e() {
        Context g9 = t.b().g();
        String string = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close_warn", k.f20423g));
        String string2 = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close_desc", k.f20423g));
        String string3 = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close", k.f20423g));
        String string4 = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_continue_to_play", k.f20423g));
        a(string);
        b(string2);
        c(string3);
        d(string4);
    }

    public final void a() {
        if (this.f23284b != null) {
            this.f23284b = null;
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
        } catch (Exception e9) {
            e9.getMessage();
            super.show();
        }
    }

    private void a(String str) {
        TextView textView = this.f23285c;
        if (textView != null) {
            textView.setText(str);
        }
    }

    private void c() {
        Context g9 = t.b().g();
        String string = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close_warn", k.f20423g));
        String string2 = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close_desc", k.f20423g));
        String string3 = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close", k.f20423g));
        String string4 = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_cancel_close", k.f20423g));
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
        String string = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close_warn", k.f20423g));
        String string2 = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close_desc", k.f20423g));
        String string3 = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close", k.f20423g));
        String string4 = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_continue_to_play", k.f20423g));
        a(string);
        b(string2);
        c(string3);
        d(string4);
    }

    public final void b() {
        try {
            Context g9 = t.b().g();
            String string = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close_warn", k.f20423g));
            String string2 = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close_desc", k.f20423g));
            String string3 = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close", k.f20423g));
            String string4 = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_cancel_close", k.f20423g));
            a(string);
            b(string2);
            c(string3);
            d(string4);
        } catch (Exception e9) {
            e9.getMessage();
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
        String string = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close_warn", k.f20423g));
        String string2 = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close_warn_tips", k.f20423g));
        String string3 = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close_warn_close", k.f20423g));
        String string4 = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close_warn_continue", k.f20423g));
        String string5 = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close", k.f20423g));
        String string6 = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close_cancel", k.f20423g));
        String string7 = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close_continue", k.f20423g));
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
                String string = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close_warn", k.f20423g));
                String string2 = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close_warn_tips", k.f20423g));
                String string3 = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close_warn_close", k.f20423g));
                String string4 = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close_warn_continue", k.f20423g));
                String string5 = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close", k.f20423g));
                String string6 = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close_cancel", k.f20423g));
                String string7 = g9.getString(k.a(getContext(), "anythink_cm_dialog_alert_confim_close_continue", k.f20423g));
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
        } catch (Exception e9) {
            e9.getMessage();
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
