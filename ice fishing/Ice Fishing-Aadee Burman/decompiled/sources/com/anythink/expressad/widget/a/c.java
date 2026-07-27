package com.anythink.expressad.widget.a;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.anythink.basead.exoplayer.f.f;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public final class c extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    private static final String f22506a = "ATFeedBackDialog";

    /* renamed from: b, reason: collision with root package name */
    private b f22507b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f22508c;

    /* renamed from: d, reason: collision with root package name */
    private LinearLayout f22509d;

    /* renamed from: e, reason: collision with root package name */
    private Button f22510e;

    /* renamed from: f, reason: collision with root package name */
    private Button f22511f;

    /* renamed from: g, reason: collision with root package name */
    private int f22512g;

    /* renamed from: h, reason: collision with root package name */
    private int f22513h;

    /* renamed from: com.anythink.expressad.widget.a.c$1, reason: invalid class name */
    public class AnonymousClass1 implements View.OnClickListener {
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (c.this.f22507b != null) {
                c.this.f22507b.a();
            }
            c.this.dismiss();
        }
    }

    /* renamed from: com.anythink.expressad.widget.a.c$2, reason: invalid class name */
    public class AnonymousClass2 implements View.OnClickListener {
        public AnonymousClass2() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (c.this.f22507b != null) {
                c.this.f22507b.b();
            }
            c.this.dismiss();
        }
    }

    /* renamed from: com.anythink.expressad.widget.a.c$3, reason: invalid class name */
    public class AnonymousClass3 implements DialogInterface.OnCancelListener {
        public AnonymousClass3() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public final void onCancel(DialogInterface dialogInterface) {
            if (c.this.f22507b != null) {
                c.this.f22507b.b();
            }
        }
    }

    public c(Context context, b bVar) {
        super(context);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        requestWindowFeature(1);
        View inflate = LayoutInflater.from(context).inflate(k.a(context, "anythink_cm_feedbackview", "layout"), (ViewGroup) null);
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        if (getContext().getResources().getConfiguration().orientation == 1) {
            this.f22513h = displayMetrics.widthPixels;
            this.f22512g = displayMetrics.heightPixels;
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = (int) (this.f22512g * 0.8f);
            attributes.gravity = 80;
            getWindow().setAttributes(attributes);
        } else {
            this.f22513h = displayMetrics.heightPixels;
            this.f22512g = displayMetrics.widthPixels;
            WindowManager.LayoutParams attributes2 = getWindow().getAttributes();
            attributes2.width = (int) (this.f22512g * 0.5f);
            attributes2.height = -1;
            attributes2.gravity = 17;
            getWindow().setAttributes(attributes2);
        }
        this.f22507b = bVar;
        if (inflate != null) {
            setContentView(inflate);
            try {
                this.f22508c = (TextView) inflate.findViewById(k.a(context, "anythink_video_common_alertview_titleview", "id"));
            } catch (Exception e9) {
                e9.getMessage();
            }
            try {
                this.f22509d = (LinearLayout) inflate.findViewById(k.a(context, "anythink_video_common_alertview_contentview", "id"));
                this.f22510e = (Button) inflate.findViewById(k.a(context, "anythink_video_common_alertview_confirm_button", "id"));
                this.f22511f = (Button) inflate.findViewById(k.a(context, "anythink_video_common_alertview_cancel_button", "id"));
            } catch (Exception e10) {
                e10.getMessage();
            }
        }
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        Button button = this.f22511f;
        if (button != null) {
            button.setOnClickListener(new AnonymousClass1());
        }
        Button button2 = this.f22510e;
        if (button2 != null) {
            button2.setOnClickListener(new AnonymousClass2());
        }
        setOnCancelListener(new AnonymousClass3());
    }

    private void b() {
        if (this.f22507b != null) {
            this.f22507b = null;
        }
    }

    private b c() {
        return this.f22507b;
    }

    private void d() {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        if (getContext().getResources().getConfiguration().orientation != 1) {
            this.f22513h = displayMetrics.heightPixels;
            this.f22512g = displayMetrics.widthPixels;
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = (int) (this.f22512g * 0.5f);
            attributes.height = -1;
            attributes.gravity = 17;
            getWindow().setAttributes(attributes);
            return;
        }
        this.f22513h = displayMetrics.widthPixels;
        this.f22512g = displayMetrics.heightPixels;
        WindowManager.LayoutParams attributes2 = getWindow().getAttributes();
        attributes2.width = -1;
        attributes2.height = (int) (this.f22512g * 0.8f);
        attributes2.gravity = 80;
        getWindow().setAttributes(attributes2);
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

    private void a() {
        Button button = this.f22511f;
        if (button != null) {
            button.setOnClickListener(new AnonymousClass1());
        }
        Button button2 = this.f22510e;
        if (button2 != null) {
            button2.setOnClickListener(new AnonymousClass2());
        }
        setOnCancelListener(new AnonymousClass3());
    }

    public final void c(String str) {
        Button button = this.f22511f;
        if (button != null) {
            button.setText(str);
        }
    }

    public final void b(String str) {
        Button button = this.f22510e;
        if (button != null) {
            button.setText(str);
        }
    }

    public final void a(boolean z3) {
        Button button = this.f22511f;
        if (button != null) {
            button.setClickable(z3);
        }
    }

    public final void a(b bVar) {
        this.f22507b = bVar;
    }

    public final void a(String str) {
        TextView textView = this.f22508c;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final void a(ViewGroup viewGroup) {
        LinearLayout linearLayout = this.f22509d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(viewGroup);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.leftMargin = f.e(38.0f);
            layoutParams.rightMargin = f.e(38.0f);
            layoutParams.topMargin = f.e(20.0f);
            layoutParams.bottomMargin = f.e(24.0f);
            this.f22509d.addView(viewGroup, layoutParams);
        }
    }

    private void a(String str, ViewGroup viewGroup, String str2, String str3) {
        a(str);
        a(viewGroup);
        b(str2);
        c(str3);
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

    private static boolean a(Context context) {
        return context.getResources().getConfiguration().orientation == 1;
    }
}
