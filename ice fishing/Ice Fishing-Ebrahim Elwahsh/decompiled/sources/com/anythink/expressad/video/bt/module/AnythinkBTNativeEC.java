package com.anythink.expressad.video.bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.express.d.a;
import com.anythink.expressad.atsignalcommon.windvane.h;
import com.anythink.expressad.foundation.g.d.b;
import com.anythink.expressad.foundation.g.d.c;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.video.module.a.a.e;
import com.anythink.expressad.video.signal.a.j;
import com.anythink.expressad.videocommon.e.d;
import com.anythink.expressad.videocommon.view.RoundImageView;
import com.anythink.expressad.videocommon.view.StarLevelView;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AnythinkBTNativeEC extends BTBaseView {

    /* renamed from: p, reason: collision with root package name */
    private static final String f21114p = "anythink_reward_endcard_native_hor";

    /* renamed from: q, reason: collision with root package name */
    private static final String f21115q = "anythink_reward_endcard_native_land";

    /* renamed from: A, reason: collision with root package name */
    private TextView f21116A;

    /* renamed from: B, reason: collision with root package name */
    private TextView f21117B;

    /* renamed from: C, reason: collision with root package name */
    private StarLevelView f21118C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f21119D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f21120E;

    /* renamed from: F, reason: collision with root package name */
    private int f21121F;

    /* renamed from: G, reason: collision with root package name */
    private Runnable f21122G;

    /* renamed from: H, reason: collision with root package name */
    private View f21123H;

    /* renamed from: I, reason: collision with root package name */
    private View f21124I;
    private String J;

    /* renamed from: K, reason: collision with root package name */
    private j f21125K;

    /* renamed from: L, reason: collision with root package name */
    private WebView f21126L;

    /* renamed from: r, reason: collision with root package name */
    private ViewGroup f21127r;

    /* renamed from: s, reason: collision with root package name */
    private ViewGroup f21128s;

    /* renamed from: t, reason: collision with root package name */
    private RelativeLayout f21129t;

    /* renamed from: u, reason: collision with root package name */
    private ImageView f21130u;

    /* renamed from: v, reason: collision with root package name */
    private RoundImageView f21131v;

    /* renamed from: w, reason: collision with root package name */
    private ImageView f21132w;

    /* renamed from: x, reason: collision with root package name */
    private ImageView f21133x;

    /* renamed from: y, reason: collision with root package name */
    private ImageView f21134y;

    /* renamed from: z, reason: collision with root package name */
    private TextView f21135z;

    public AnythinkBTNativeEC(Context context) {
        super(context);
        this.f21119D = false;
        this.f21120E = false;
        this.f21121F = 0;
    }

    public static /* synthetic */ boolean a(AnythinkBTNativeEC anythinkBTNativeEC) {
        anythinkBTNativeEC.f21120E = true;
        return true;
    }

    public Bitmap blurBitmap(Bitmap bitmap) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            RenderScript create = RenderScript.create(this.f21204a.getApplicationContext());
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
            create2.setRadius(10.0f);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap);
            bitmap.recycle();
            create.destroy();
            return createBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView
    public void init(Context context) {
        boolean b9;
        int findLayout = findLayout(isLandscape() ? f21115q : f21114p);
        if (findLayout > 0) {
            if (isLandscape()) {
                ViewGroup viewGroup = (ViewGroup) this.f21209f.inflate(findLayout, (ViewGroup) null);
                this.f21128s = viewGroup;
                addView(viewGroup);
                b9 = b(this.f21128s);
            } else {
                ViewGroup viewGroup2 = (ViewGroup) this.f21209f.inflate(findLayout, (ViewGroup) null);
                this.f21127r = viewGroup2;
                addView(viewGroup2);
                b9 = b(this.f21127r);
            }
            this.f21211h = b9;
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f21122G == null) {
            this.f21122G = new Runnable() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTNativeEC.1
                @Override // java.lang.Runnable
                public final void run() {
                    AnythinkBTNativeEC.a(AnythinkBTNativeEC.this);
                    if (AnythinkBTNativeEC.this.f21123H != null) {
                        AnythinkBTNativeEC.this.f21123H.setVisibility(0);
                    }
                }
            };
        }
        Runnable runnable = this.f21122G;
        if (runnable != null) {
            postDelayed(runnable, this.f21121F * 1000);
        }
        if (!this.f21211h && this.f21126L != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("id", this.f21207d);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("unitId", this.J);
                jSONObject.put("data", jSONObject2);
                jSONObject.toString();
            } catch (JSONException e6) {
                e6.getMessage();
            }
            h.a();
            a.a(this.f21126L, "onCloseBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        }
        if (this.f21126L != null) {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("id", this.f21207d);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("unitId", this.J);
                jSONObject3.put("data", jSONObject4);
                jSONObject3.toString();
            } catch (JSONException e9) {
                e9.getMessage();
            }
            h.a();
            a.a(this.f21126L, "onNativeECShow", Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
        }
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView
    public void onDestory() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f21122G;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        int i = configuration.orientation;
        this.f21210g = i;
        if (i == 2) {
            removeView(this.f21127r);
            a(this.f21128s);
        } else {
            removeView(this.f21128s);
            a(this.f21127r);
        }
    }

    public void preLoadData() {
        Bitmap blurBitmap;
        try {
            if (this.f21205b == null || !this.f21211h) {
                return;
            }
            d dVar = this.f21208e;
            if (dVar != null) {
                this.f21121F = dVar.p();
            }
            b.a(this.f21204a.getApplicationContext()).a(this.f21205b.bm(), new e(this.f21131v, this.f21205b, this.J));
            b.a(this.f21204a.getApplicationContext()).a(this.f21205b.bl(), new com.anythink.expressad.video.module.a.a.j(this.f21132w, v.b(com.anythink.expressad.foundation.b.a.c().e(), 8.0f)));
            this.f21135z.setText(this.f21205b.bj());
            this.f21116A.setText(this.f21205b.bk());
            this.f21117B.setText(this.f21205b.bg() + ")");
            this.f21118C.removeAllViews();
            double bf = this.f21205b.bf();
            if (bf <= 0.0d) {
                bf = 5.0d;
            }
            this.f21118C.initScore(bf);
            try {
                Bitmap a9 = a(this.f21131v.getDrawable());
                if (a9 != null && (blurBitmap = blurBitmap(a9)) != null) {
                    this.f21130u.setImageBitmap(blurBitmap);
                }
            } catch (Throwable unused) {
                this.f21130u.setVisibility(8);
            }
            if (!TextUtils.isEmpty(this.f21205b.J()) && this.f21205b.J().contains("alecfc=1")) {
                this.f21119D = true;
            }
            b.a(this.f21204a.getApplicationContext()).a(TextUtils.isEmpty(this.f21205b.aH()) ? com.anythink.expressad.a.ae : this.f21205b.aH(), new c() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTNativeEC.2
                @Override // com.anythink.expressad.foundation.g.d.c
                public final void a(String str, String str2) {
                }

                @Override // com.anythink.expressad.foundation.g.d.c
                public final void a(Bitmap bitmap, String str) {
                    if (bitmap == null || bitmap.isRecycled()) {
                        return;
                    }
                    try {
                        int b9 = v.b(AnythinkBTNativeEC.this.f21204a, 12.0f);
                        AnythinkBTNativeEC.this.f21133x.getLayoutParams().height = b9;
                        AnythinkBTNativeEC.this.f21133x.getLayoutParams().width = (int) (b9 * ((bitmap.getWidth() * 1.0f) / bitmap.getHeight()));
                        AnythinkBTNativeEC.this.f21133x.setImageBitmap(bitmap);
                        AnythinkBTNativeEC.this.f21133x.setBackgroundColor(1426063360);
                    } catch (Throwable unused2) {
                    }
                }
            });
            v.a(this.f21134y, this.f21205b, this.f21204a, true);
            if (this.f21120E) {
                return;
            }
            this.f21123H.setVisibility(8);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void setCreateWebView(WebView webView) {
        this.f21126L = webView;
    }

    public void setJSCommon(j jVar) {
        this.f21125K = jVar;
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView
    public void setUnitId(String str) {
        this.J = str;
    }

    private void a(View view) {
        if (view == null) {
            init(this.f21204a);
            preLoadData();
            return;
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        addView(view);
        b(view);
        a();
    }

    private boolean b(int i) {
        if (isLandscape()) {
            ViewGroup viewGroup = (ViewGroup) this.f21209f.inflate(i, (ViewGroup) null);
            this.f21128s = viewGroup;
            addView(viewGroup);
            return b(this.f21128s);
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f21209f.inflate(i, (ViewGroup) null);
        this.f21127r = viewGroup2;
        addView(viewGroup2);
        return b(this.f21127r);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void c(int i) {
        JSONObject jSONObject;
        j jVar;
        JSONObject jSONObject2 = null;
        try {
            try {
                jSONObject = new JSONObject();
                try {
                    jSONObject.put(com.anythink.expressad.foundation.g.a.ci, a(i));
                } catch (JSONException e6) {
                    e = e6;
                    jSONObject2 = jSONObject;
                    e.printStackTrace();
                    jSONObject = jSONObject2;
                    jVar = this.f21125K;
                    if (jVar == null) {
                    }
                }
            } catch (Throwable th) {
                th.getMessage();
                return;
            }
        } catch (JSONException e9) {
            e = e9;
        }
        jVar = this.f21125K;
        if (jVar == null) {
            jVar.click(1, jSONObject != null ? jSONObject.toString() : "");
        }
    }

    public AnythinkBTNativeEC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21119D = false;
        this.f21120E = false;
        this.f21121F = 0;
    }

    private boolean b(View view) {
        try {
            this.f21129t = (RelativeLayout) view.findViewById(findID("anythink_native_ec_layout"));
            this.f21130u = (ImageView) view.findViewById(findID("anythink_iv_adbanner_bg"));
            this.f21131v = (RoundImageView) view.findViewById(findID("anythink_iv_adbanner"));
            this.f21132w = (ImageView) view.findViewById(findID("anythink_iv_icon"));
            this.f21133x = (ImageView) view.findViewById(findID("anythink_iv_flag"));
            this.f21134y = (ImageView) view.findViewById(findID("anythink_iv_link"));
            this.f21135z = (TextView) view.findViewById(findID("anythink_tv_apptitle"));
            this.f21116A = (TextView) view.findViewById(findID("anythink_tv_appdesc"));
            this.f21117B = (TextView) view.findViewById(findID("anythink_tv_nuater"));
            this.f21118C = (StarLevelView) view.findViewById(findID("anythink_sv_starlevel"));
            this.f21123H = view.findViewById(findID("anythink_iv_close"));
            View findViewById = view.findViewById(findID("anythink_tv_cta"));
            this.f21124I = findViewById;
            return isNotNULL(this.f21130u, this.f21131v, this.f21132w, this.f21135z, this.f21116A, this.f21117B, this.f21118C, this.f21123H, findViewById);
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView
    public final void a() {
        if (this.f21211h) {
            this.f21129t.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTNativeEC.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (AnythinkBTNativeEC.this.f21119D) {
                        AnythinkBTNativeEC.a(AnythinkBTNativeEC.this, 1);
                        AnythinkBTNativeEC.a(AnythinkBTNativeEC.this, view.getX(), view.getY());
                    }
                }
            });
            this.f21123H.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTNativeEC.4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (AnythinkBTNativeEC.this.f21126L != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", AnythinkBTNativeEC.this.f21207d);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("unitId", AnythinkBTNativeEC.this.J);
                            jSONObject.put("data", jSONObject2);
                            jSONObject.toString();
                        } catch (JSONException e6) {
                            e6.getMessage();
                        }
                        h.a();
                        a.a(AnythinkBTNativeEC.this.f21126L, "onCloseBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }
            });
            this.f21124I.setOnClickListener(new com.anythink.expressad.widget.a() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTNativeEC.5
                @Override // com.anythink.expressad.widget.a
                public final void a(View view) {
                    AnythinkBTNativeEC.a(AnythinkBTNativeEC.this, 0);
                    AnythinkBTNativeEC.a(AnythinkBTNativeEC.this, view.getX(), view.getY());
                }
            });
            this.f21132w.setOnClickListener(new com.anythink.expressad.widget.a() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTNativeEC.6
                @Override // com.anythink.expressad.widget.a
                public final void a(View view) {
                    AnythinkBTNativeEC.a(AnythinkBTNativeEC.this, 0);
                    AnythinkBTNativeEC.a(AnythinkBTNativeEC.this, view.getX(), view.getY());
                }
            });
            this.f21131v.setOnClickListener(new com.anythink.expressad.widget.a() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTNativeEC.7
                @Override // com.anythink.expressad.widget.a
                public final void a(View view) {
                    AnythinkBTNativeEC.a(AnythinkBTNativeEC.this, 0);
                    AnythinkBTNativeEC.a(AnythinkBTNativeEC.this, view.getX(), view.getY());
                }
            });
        }
    }

    private static Bitmap a(Drawable drawable) {
        try {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            return createBitmap;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    private void a(float f6, float f9) {
        if (this.f21126L != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", BTBaseView.f21201n);
                jSONObject.put("id", this.f21207d);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("x", String.valueOf(f6));
                jSONObject2.put("y", String.valueOf(f9));
                jSONObject.put("data", jSONObject2);
                h.a();
                a.a(this.f21126L, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (Exception unused) {
                com.anythink.expressad.video.bt.a.c.a();
                com.anythink.expressad.video.bt.a.c.a(this.f21126L, "onClicked", this.f21207d);
            }
        }
    }

    private int b() {
        String str;
        if (isLandscape()) {
            str = f21115q;
        } else {
            str = f21114p;
        }
        return findLayout(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(AnythinkBTNativeEC anythinkBTNativeEC, int i) {
        JSONObject jSONObject;
        j jVar;
        JSONObject jSONObject2 = null;
        try {
            try {
                jSONObject = new JSONObject();
            } catch (JSONException e6) {
                e = e6;
            }
            try {
                jSONObject.put(com.anythink.expressad.foundation.g.a.ci, anythinkBTNativeEC.a(i));
            } catch (JSONException e9) {
                e = e9;
                jSONObject2 = jSONObject;
                e.printStackTrace();
                jSONObject = jSONObject2;
                jVar = anythinkBTNativeEC.f21125K;
                if (jVar == null) {
                }
            }
            jVar = anythinkBTNativeEC.f21125K;
            if (jVar == null) {
                jVar.click(1, jSONObject != null ? jSONObject.toString() : "");
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static /* synthetic */ void a(AnythinkBTNativeEC anythinkBTNativeEC, float f6, float f9) {
        if (anythinkBTNativeEC.f21126L != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", BTBaseView.f21201n);
                jSONObject.put("id", anythinkBTNativeEC.f21207d);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("x", String.valueOf(f6));
                jSONObject2.put("y", String.valueOf(f9));
                jSONObject.put("data", jSONObject2);
                h.a();
                a.a(anythinkBTNativeEC.f21126L, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (Exception unused) {
                com.anythink.expressad.video.bt.a.c.a();
                com.anythink.expressad.video.bt.a.c.a(anythinkBTNativeEC.f21126L, "onClicked", anythinkBTNativeEC.f21207d);
            }
        }
    }
}
