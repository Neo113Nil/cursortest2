package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.t;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public class lbv extends Dialog {
    public static volatile int m;
    public String a;
    public String b;
    public hbv c;
    public kbv d;
    public ProgressDialog e;
    public ImageView f;
    public FrameLayout g;
    public final jbv h;
    public boolean i;
    public boolean j;
    public boolean k;
    public WindowManager.LayoutParams l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lbv(t tVar, String str, Bundle bundle, int i, hbv hbvVar) {
        super(tVar, m);
        Uri a;
        wxf.J();
        this.b = "fbconnect://success";
        bundle = bundle == null ? new Bundle() : bundle;
        String str2 = gvt.A(tVar) ? "fbconnect://chrome_os_success" : "fbconnect://success";
        this.b = str2;
        bundle.putString("redirect_uri", str2);
        bundle.putString("display", "touch");
        bundle.putString("client_id", j3c.c());
        bundle.putString("sdk", String.format(Locale.ROOT, "android-%s", Arrays.copyOf(new Object[]{"12.2.0"}, 1)));
        this.c = hbvVar;
        if (str.equals("share") && bundle.containsKey("media")) {
            this.h = new jbv(this, str, bundle);
            return;
        }
        if (ouj.D(i) != 1) {
            Collection collection = qjp.a;
            a = gvt.a(String.format("m.%s", Arrays.copyOf(new Object[]{j3c.p}, 1)), j3c.e() + "/dialog/" + str, bundle);
        } else {
            Collection collection2 = qjp.a;
            a = gvt.a(String.format("m.%s", Arrays.copyOf(new Object[]{j3c.o}, 1)), "oauth/authorize", bundle);
        }
        this.a = a.toString();
    }

    public static int a(int i, int i2, int i3, float f) {
        int i4 = (int) (i / f);
        return (int) (i * (i4 <= i2 ? 1.0d : i4 >= i3 ? 0.5d : (((i3 - i4) / (i3 - i2)) * 0.5d) + 0.5d));
    }

    public Bundle b(String str) {
        Uri parse = Uri.parse(str);
        parse.getClass();
        Bundle J = gvt.J(parse.getQuery());
        J.putAll(gvt.J(parse.getFragment()));
        return J;
    }

    public final void c() {
        Object systemService = getContext().getSystemService("window");
        if (systemService == null) {
            jj4.j("null cannot be cast to non-null type android.view.WindowManager");
            return;
        }
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        int i3 = i < i2 ? i : i2;
        if (i < i2) {
            i = i2;
        }
        int min = Math.min(a(i3, 480, 800, displayMetrics.density), displayMetrics.widthPixels);
        int min2 = Math.min(a(i, 800, 1280, displayMetrics.density), displayMetrics.heightPixels);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(min, min2);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.c == null || this.i) {
            return;
        }
        d(new f3c());
    }

    public final void d(Exception exc) {
        if (this.c == null || this.i) {
            return;
        }
        this.i = true;
        c3c c3cVar = exc instanceof c3c ? (c3c) exc : new c3c(exc);
        hbv hbvVar = this.c;
        if (hbvVar != null) {
            hbvVar.h(null, c3cVar);
        }
        dismiss();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        ProgressDialog progressDialog;
        kbv kbvVar = this.d;
        if (kbvVar != null) {
            kbvVar.stopLoading();
        }
        if (!this.j && (progressDialog = this.e) != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        super.dismiss();
    }

    public final void e(int i) {
        WebSettings settings;
        WebSettings settings2;
        WebSettings settings3;
        LinearLayout linearLayout = new LinearLayout(getContext());
        kbv kbvVar = new kbv(getContext());
        this.d = kbvVar;
        kbvVar.setVerticalScrollBarEnabled(false);
        kbv kbvVar2 = this.d;
        if (kbvVar2 != null) {
            kbvVar2.setHorizontalScrollBarEnabled(false);
        }
        kbv kbvVar3 = this.d;
        if (kbvVar3 != null) {
            kbvVar3.setWebViewClient(new d4n(1, this));
        }
        kbv kbvVar4 = this.d;
        if (kbvVar4 != null && (settings3 = kbvVar4.getSettings()) != null) {
            settings3.setJavaScriptEnabled(true);
        }
        kbv kbvVar5 = this.d;
        if (kbvVar5 != null) {
            String str = this.a;
            if (str == null) {
                xq0.q("Required value was null.");
                return;
            }
            kbvVar5.loadUrl(str);
        }
        kbv kbvVar6 = this.d;
        if (kbvVar6 != null) {
            kbvVar6.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        kbv kbvVar7 = this.d;
        if (kbvVar7 != null) {
            kbvVar7.setVisibility(4);
        }
        kbv kbvVar8 = this.d;
        if (kbvVar8 != null && (settings2 = kbvVar8.getSettings()) != null) {
            settings2.setSavePassword(false);
        }
        kbv kbvVar9 = this.d;
        if (kbvVar9 != null && (settings = kbvVar9.getSettings()) != null) {
            settings.setSaveFormData(false);
        }
        kbv kbvVar10 = this.d;
        if (kbvVar10 != null) {
            kbvVar10.setFocusable(true);
        }
        kbv kbvVar11 = this.d;
        if (kbvVar11 != null) {
            kbvVar11.setFocusableInTouchMode(true);
        }
        kbv kbvVar12 = this.d;
        if (kbvVar12 != null) {
            kbvVar12.setOnTouchListener(abe.c);
        }
        linearLayout.setPadding(i, i, i, i);
        linearLayout.addView(this.d);
        linearLayout.setBackgroundColor(-872415232);
        FrameLayout frameLayout = this.g;
        if (frameLayout != null) {
            frameLayout.addView(linearLayout);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        WindowManager.LayoutParams layoutParams;
        Window window;
        WindowManager.LayoutParams attributes;
        this.j = false;
        Context context = getContext();
        context.getClass();
        if (gvt.I(context) && (layoutParams = this.l) != null && layoutParams.token == null) {
            Activity ownerActivity = getOwnerActivity();
            layoutParams.token = (ownerActivity == null || (window = ownerActivity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
            WindowManager.LayoutParams layoutParams2 = this.l;
            Objects.toString(layoutParams2 != null ? layoutParams2.token : null);
            HashSet hashSet = j3c.a;
        }
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.e = progressDialog;
        progressDialog.requestWindowFeature(1);
        ProgressDialog progressDialog2 = this.e;
        if (progressDialog2 != null) {
            progressDialog2.setMessage(getContext().getString(R.string.com_facebook_loading));
        }
        ProgressDialog progressDialog3 = this.e;
        if (progressDialog3 != null) {
            progressDialog3.setCanceledOnTouchOutside(false);
        }
        ProgressDialog progressDialog4 = this.e;
        if (progressDialog4 != null) {
            progressDialog4.setOnCancelListener(new t18(this, 1));
        }
        requestWindowFeature(1);
        this.g = new FrameLayout(getContext());
        c();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        ImageView imageView = new ImageView(getContext());
        this.f = imageView;
        imageView.setOnClickListener(new je(12, this));
        Context context = getContext();
        context.getClass();
        Drawable drawable = context.getResources().getDrawable(2131231098);
        ImageView imageView2 = this.f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
        ImageView imageView3 = this.f;
        if (imageView3 != null) {
            imageView3.setVisibility(4);
        }
        if (this.a != null) {
            ImageView imageView4 = this.f;
            if (imageView4 == null) {
                xq0.q("Required value was null.");
                return;
            } else {
                Drawable drawable2 = imageView4.getDrawable();
                drawable2.getClass();
                e((drawable2.getIntrinsicWidth() / 2) + 1);
            }
        }
        FrameLayout frameLayout = this.g;
        if (frameLayout != null) {
            frameLayout.addView(this.f, new ViewGroup.LayoutParams(-2, -2));
        }
        FrameLayout frameLayout2 = this.g;
        if (frameLayout2 != null) {
            setContentView(frameLayout2);
        } else {
            xq0.q("Required value was null.");
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.j = true;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        if (i == 4) {
            kbv kbvVar = this.d;
            if (kbvVar != null && kbvVar.canGoBack()) {
                kbv kbvVar2 = this.d;
                if (kbvVar2 != null) {
                    kbvVar2.goBack();
                }
                return true;
            }
            cancel();
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        jbv jbvVar = this.h;
        if (jbvVar != null) {
            if ((jbvVar != null ? jbvVar.getStatus() : null) == AsyncTask.Status.PENDING) {
                if (jbvVar != null) {
                    jbvVar.execute(new Void[0]);
                }
                ProgressDialog progressDialog = this.e;
                if (progressDialog != null) {
                    progressDialog.show();
                    return;
                }
                return;
            }
        }
        c();
    }

    @Override // android.app.Dialog
    public final void onStop() {
        jbv jbvVar = this.h;
        if (jbvVar != null) {
            jbvVar.cancel(true);
            ProgressDialog progressDialog = this.e;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        }
        super.onStop();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        layoutParams.getClass();
        if (layoutParams.token == null) {
            this.l = layoutParams;
        }
        super.onWindowAttributesChanged(layoutParams);
    }
}
