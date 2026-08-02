package com.anythink.expressad.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.IceFishing.LiveIceFishing.k;
import com.anythink.core.common.d.t;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.d.e;
import com.anythink.expressad.foundation.f.a;
import com.anythink.expressad.foundation.g.d.c;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.foundation.h.z;
import com.anythink.expressad.shake.MBShakeView;
import com.anythink.expressad.video.dynview.f.h;
import com.anythink.expressad.video.dynview.widget.AnyThinkLevelLayoutView;
import com.anythink.expressad.video.dynview.widget.AnythinkBaitClickView;
import com.anythink.expressad.video.module.a.a.j;
import com.anythink.expressad.video.signal.f;
import com.anythink.expressad.video.signal.factory.b;
import com.anythink.expressad.videocommon.view.RoundImageView;
import com.anythink.expressad.videocommon.view.StarLevelView;
import com.anythink.expressad.widget.FeedBackButton;
import com.google.android.gms.internal.ads.Wv;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AnythinkNativeEndCardView extends AnythinkBaseView implements f {

    /* renamed from: n, reason: collision with root package name */
    private static final String f22352n = "anythink_reward_endcard_native_hor";

    /* renamed from: o, reason: collision with root package name */
    private static final String f22353o = "anythink_reward_endcard_native_land";

    /* renamed from: p, reason: collision with root package name */
    private static final String f22354p = "anythink_reward_endcard_native_half_portrait";

    /* renamed from: q, reason: collision with root package name */
    private static final String f22355q = "anythink_reward_endcard_native_half_landscape";

    /* renamed from: A, reason: collision with root package name */
    private ImageView f22356A;

    /* renamed from: B, reason: collision with root package name */
    private TextView f22357B;

    /* renamed from: C, reason: collision with root package name */
    private TextView f22358C;

    /* renamed from: D, reason: collision with root package name */
    private TextView f22359D;

    /* renamed from: E, reason: collision with root package name */
    private LinearLayout f22360E;

    /* renamed from: F, reason: collision with root package name */
    private FeedBackButton f22361F;

    /* renamed from: G, reason: collision with root package name */
    private Runnable f22362G;

    /* renamed from: H, reason: collision with root package name */
    private Runnable f22363H;

    /* renamed from: I, reason: collision with root package name */
    private RelativeLayout f22364I;
    private b J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f22365K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f22366L;

    /* renamed from: M, reason: collision with root package name */
    private int f22367M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f22368N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f22369O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f22370P;

    /* renamed from: Q, reason: collision with root package name */
    private AlphaAnimation f22371Q;

    /* renamed from: R, reason: collision with root package name */
    private int f22372R;

    /* renamed from: S, reason: collision with root package name */
    private int f22373S;

    /* renamed from: T, reason: collision with root package name */
    private int f22374T;

    /* renamed from: U, reason: collision with root package name */
    private int f22375U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f22376V;

    /* renamed from: W, reason: collision with root package name */
    private Bitmap f22377W;
    private int aa;
    private String ab;
    private View ac;
    private TextView ad;
    private boolean ae;
    private String af;
    private e ag;
    private MBShakeView ah;
    private com.anythink.core.express.c.b ai;
    private AnythinkBaitClickView aj;
    private int ak;
    private boolean al;

    /* renamed from: r, reason: collision with root package name */
    private ViewGroup f22378r;

    /* renamed from: s, reason: collision with root package name */
    private ViewGroup f22379s;

    /* renamed from: t, reason: collision with root package name */
    private RelativeLayout f22380t;

    /* renamed from: u, reason: collision with root package name */
    private RelativeLayout f22381u;

    /* renamed from: v, reason: collision with root package name */
    private ImageView f22382v;

    /* renamed from: w, reason: collision with root package name */
    private ImageView f22383w;

    /* renamed from: x, reason: collision with root package name */
    private ImageView f22384x;

    /* renamed from: y, reason: collision with root package name */
    private ImageView f22385y;

    /* renamed from: z, reason: collision with root package name */
    private ImageView f22386z;

    /* renamed from: com.anythink.expressad.video.module.AnythinkNativeEndCardView$11, reason: invalid class name */
    public class AnonymousClass11 implements c {
        public AnonymousClass11() {
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(String str, String str2) {
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(Bitmap bitmap, String str) {
            if (bitmap == null || bitmap.isRecycled()) {
                return;
            }
            try {
                if (AnythinkNativeEndCardView.this.f22383w != null) {
                    AnythinkNativeEndCardView anythinkNativeEndCardView = AnythinkNativeEndCardView.this;
                    if (anythinkNativeEndCardView.i) {
                        anythinkNativeEndCardView.f22383w.setBackgroundDrawable(null);
                    }
                    AnythinkNativeEndCardView.this.f22383w.setImageBitmap(bitmap);
                }
                AnythinkNativeEndCardView.a(AnythinkNativeEndCardView.this, bitmap);
            } catch (Throwable unused) {
                if (AnythinkNativeEndCardView.this.f22382v != null) {
                    AnythinkNativeEndCardView.this.f22382v.setVisibility(4);
                }
            }
        }
    }

    /* renamed from: com.anythink.expressad.video.module.AnythinkNativeEndCardView$12, reason: invalid class name */
    public class AnonymousClass12 implements c {
        public AnonymousClass12() {
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(String str, String str2) {
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(Bitmap bitmap, String str) {
            if (bitmap == null || bitmap.isRecycled() || bitmap.isRecycled()) {
                return;
            }
            try {
                int b9 = v.b(AnythinkNativeEndCardView.this.f22228a, 12.0f);
                AnythinkNativeEndCardView.this.f22385y.getLayoutParams().height = b9;
                AnythinkNativeEndCardView.this.f22385y.getLayoutParams().width = (int) (b9 * ((bitmap.getWidth() * 1.0f) / bitmap.getHeight()));
                AnythinkNativeEndCardView.this.f22385y.setImageBitmap(bitmap);
                AnythinkNativeEndCardView.this.f22385y.setBackgroundColor(1426063360);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.anythink.expressad.video.module.AnythinkNativeEndCardView$13, reason: invalid class name */
    public class AnonymousClass13 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bitmap f22391a;

        public AnonymousClass13(Bitmap bitmap) {
            this.f22391a = bitmap;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnythinkNativeEndCardView anythinkNativeEndCardView = AnythinkNativeEndCardView.this;
            anythinkNativeEndCardView.f22377W = anythinkNativeEndCardView.blurBitmap(this.f22391a);
            if (AnythinkNativeEndCardView.this.f22377W == null || AnythinkNativeEndCardView.this.f22377W.isRecycled() || AnythinkNativeEndCardView.this.f22382v == null) {
                return;
            }
            AnythinkNativeEndCardView.this.f22382v.post(new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkNativeEndCardView.13.1
                @Override // java.lang.Runnable
                public final void run() {
                    AnythinkNativeEndCardView anythinkNativeEndCardView2 = AnythinkNativeEndCardView.this;
                    if (anythinkNativeEndCardView2.i) {
                        anythinkNativeEndCardView2.f22382v.setBackgroundDrawable(null);
                    }
                    AnythinkNativeEndCardView.this.f22382v.setImageBitmap(AnythinkNativeEndCardView.this.f22377W);
                }
            });
        }
    }

    /* renamed from: com.anythink.expressad.video.module.AnythinkNativeEndCardView$4, reason: invalid class name */
    public class AnonymousClass4 implements a {
        public AnonymousClass4() {
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void a() {
            AnythinkNativeEndCardView.this.f22370P = true;
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void b() {
            AnythinkNativeEndCardView.this.f22370P = false;
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void c() {
            AnythinkNativeEndCardView.this.f22370P = false;
        }
    }

    /* renamed from: com.anythink.expressad.video.module.AnythinkNativeEndCardView$5, reason: invalid class name */
    public class AnonymousClass5 implements View.OnClickListener {
        public AnonymousClass5() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            AnythinkNativeEndCardView.a(AnythinkNativeEndCardView.this, 0);
        }
    }

    /* renamed from: com.anythink.expressad.video.module.AnythinkNativeEndCardView$6, reason: invalid class name */
    public class AnonymousClass6 extends com.anythink.core.express.c.b {
        public AnonymousClass6(int i, int i4) {
            super(i, i4);
        }

        @Override // com.anythink.core.express.c.b
        public final void a() {
            if (!AnythinkNativeEndCardView.this.f22370P && AnythinkNativeEndCardView.this.f22369O && AnythinkNativeEndCardView.this.isShown()) {
                AnythinkNativeEndCardView anythinkNativeEndCardView = AnythinkNativeEndCardView.this;
                anythinkNativeEndCardView.f22234g = 0.0f;
                anythinkNativeEndCardView.f22235h = 0.0f;
                AnythinkNativeEndCardView.a(anythinkNativeEndCardView, 4);
            }
        }
    }

    /* renamed from: com.anythink.expressad.video.module.AnythinkNativeEndCardView$7, reason: invalid class name */
    public class AnonymousClass7 implements View.OnAttachStateChangeListener {
        public AnonymousClass7() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            if (AnythinkNativeEndCardView.this.ai != null) {
                AnythinkNativeEndCardView.this.al = true;
                AnythinkNativeEndCardView.this.a();
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            AnythinkNativeEndCardView.this.b();
            AnythinkNativeEndCardView.this.ai = null;
            AnythinkNativeEndCardView.this.al = false;
        }
    }

    /* renamed from: com.anythink.expressad.video.module.AnythinkNativeEndCardView$8, reason: invalid class name */
    public class AnonymousClass8 implements View.OnClickListener {
        public AnonymousClass8() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            AnythinkNativeEndCardView.a(AnythinkNativeEndCardView.this, 0);
        }
    }

    /* renamed from: com.anythink.expressad.video.module.AnythinkNativeEndCardView$9, reason: invalid class name */
    public class AnonymousClass9 implements Runnable {
        public AnonymousClass9() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnythinkNativeEndCardView.a(AnythinkNativeEndCardView.this, 2);
        }
    }

    public AnythinkNativeEndCardView(Context context) {
        super(context);
        this.f22365K = false;
        this.f22366L = false;
        this.f22367M = 0;
        this.f22368N = false;
        this.f22369O = false;
        this.f22370P = false;
        this.f22376V = false;
        this.aa = 1;
        this.ak = 1;
        this.al = false;
    }

    private static void o() {
    }

    public static /* synthetic */ void r(AnythinkNativeEndCardView anythinkNativeEndCardView) {
        if (!com.anythink.expressad.foundation.f.b.a().b()) {
            FeedBackButton feedBackButton = anythinkNativeEndCardView.f22361F;
            if (feedBackButton != null) {
                feedBackButton.setVisibility(8);
                return;
            }
            return;
        }
        anythinkNativeEndCardView.f22229b.l(anythinkNativeEndCardView.af);
        com.anythink.expressad.foundation.f.b.a().a(Wv.i(new StringBuilder(), anythinkNativeEndCardView.af, "_2"), anythinkNativeEndCardView.new AnonymousClass4());
        com.anythink.expressad.foundation.f.b.a().a(Wv.i(new StringBuilder(), anythinkNativeEndCardView.af, "_2"), anythinkNativeEndCardView.f22229b);
        com.anythink.expressad.foundation.f.b.a().c(anythinkNativeEndCardView.af + "_1");
        com.anythink.expressad.foundation.f.b.a().a(Wv.i(new StringBuilder(), anythinkNativeEndCardView.af, "_2"), anythinkNativeEndCardView.f22361F);
        if (anythinkNativeEndCardView.f22361F != null) {
            com.anythink.expressad.foundation.f.b.a().a(Wv.i(new StringBuilder(), anythinkNativeEndCardView.af, "_2"), anythinkNativeEndCardView.f22361F);
        }
    }

    public Bitmap blurBitmap(Bitmap bitmap) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
            RenderScript create = RenderScript.create(this.f22228a.getApplicationContext());
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
            create2.setRadius(25.0f);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap);
            create.destroy();
            return createBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean canBackPress() {
        View view = this.ac;
        return view != null && view.getVisibility() == 0;
    }

    public void clearMoreOfferBitmap() {
        e eVar;
        ArrayList<d> arrayList;
        d dVar = this.f22229b;
        if (dVar == null || !dVar.j() || (eVar = this.ag) == null || (arrayList = eVar.f19467K) == null || arrayList.size() <= 0) {
            return;
        }
        Iterator<d> it = this.ag.f19467K.iterator();
        while (it.hasNext()) {
            d next = it.next();
            if (!TextUtils.isEmpty(next.bl())) {
                k.m().c(next.bl());
            }
        }
    }

    public boolean ctaViewCanGet(View view, boolean z6) {
        try {
            View findViewById = view.findViewById(filterFindViewId(z6, "anythink_tv_cta"));
            if (findViewById instanceof TextView) {
                this.ad = (TextView) findViewById;
            }
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f18405a) {
                e9.printStackTrace();
            }
        }
        return this.ad != null;
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
    }

    public boolean isDyXmlSuccess() {
        return this.f22376V;
    }

    public void notifyShowListener() {
        this.f22232e.a(110, "");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int parseInt;
        int parseInt2;
        int i;
        AnythinkBaitClickView anythinkBaitClickView;
        super.onAttachedToWindow();
        if (this.f22362G == null) {
            this.f22362G = new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkNativeEndCardView.1
                @Override // java.lang.Runnable
                public final void run() {
                    AnythinkNativeEndCardView.a(AnythinkNativeEndCardView.this);
                    if (AnythinkNativeEndCardView.this.ac != null) {
                        AnythinkNativeEndCardView.this.ac.setVisibility(0);
                    }
                }
            };
        }
        Runnable runnable = this.f22362G;
        if (runnable != null) {
            postDelayed(runnable, this.f22367M * 1000);
            if (!this.f22369O) {
                this.f22369O = true;
            }
            try {
                d dVar = this.f22229b;
                if (dVar != null && dVar.j()) {
                    String J = this.f22229b.J();
                    if (TextUtils.isEmpty(J)) {
                        J = this.f22229b.Q();
                    }
                    String a9 = z.a(J, "alac");
                    if (!TextUtils.isEmpty(a9) && a9.equals("1")) {
                        postDelayed(new AnonymousClass9(), 1000L);
                    }
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        try {
            d dVar2 = this.f22229b;
            if (dVar2 != null && dVar2.j()) {
                String J8 = this.f22229b.J();
                if (TextUtils.isEmpty(J8)) {
                    J8 = this.f22229b.Q();
                }
                String a10 = z.a(J8, "bait_click");
                try {
                    i = Integer.parseInt(a10);
                } catch (Throwable th2) {
                    th2.getMessage();
                    i = 1;
                }
                if (!TextUtils.isEmpty(a10) && i != 0 && (anythinkBaitClickView = this.aj) != null) {
                    anythinkBaitClickView.setVisibility(0);
                    this.aj.init(1342177280, i);
                    if (this.f22229b.s() == 1302) {
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setShape(0);
                        gradientDrawable.setColor(1342177280);
                        gradientDrawable.setStroke(0, -65536);
                        gradientDrawable.setCornerRadius(25.0f);
                        this.aj.setBackground(gradientDrawable);
                    }
                    this.aj.startAnimation();
                    this.aj.setOnClickListener(new AnonymousClass8());
                }
            }
        } catch (Throwable th3) {
            th3.getMessage();
        }
        try {
            d dVar3 = this.f22229b;
            if (dVar3 != null && dVar3.j()) {
                String J9 = this.f22229b.J();
                if (TextUtils.isEmpty(J9)) {
                    J9 = this.f22229b.Q();
                }
                String a11 = z.a(J9, "shake_strength");
                String a12 = z.a(J9, "shake_time");
                if (!TextUtils.isEmpty("1") && this.ah == null) {
                    AnythinkBaitClickView anythinkBaitClickView2 = this.aj;
                    if (anythinkBaitClickView2 != null) {
                        anythinkBaitClickView2.setVisibility(8);
                    }
                    MBShakeView mBShakeView = new MBShakeView(getContext());
                    this.ah = mBShakeView;
                    mBShakeView.initView(this.f22229b.dj, true);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    if (isLandscape()) {
                        layoutParams.addRule(13);
                    } else {
                        layoutParams.addRule(2, filterFindViewId(this.f22376V, "anythink_iv_logo"));
                        layoutParams.addRule(14);
                        this.ah.setPadding(0, 0, 0, v.b(getContext(), 20.0f));
                    }
                    this.ah.setLayoutParams(layoutParams);
                    RelativeLayout relativeLayout = this.f22380t;
                    if (relativeLayout != null && relativeLayout.isShown()) {
                        if (this.ad != null) {
                            this.f22380t.addView(this.ah);
                        }
                        this.ad.setVisibility(4);
                        this.ah.setOnClickListener(new AnonymousClass5());
                        int i4 = 10;
                        if (!TextUtils.isEmpty(a11) && (parseInt2 = Integer.parseInt(a11)) >= 0) {
                            i4 = parseInt2;
                        }
                        int i6 = 5000;
                        if (!TextUtils.isEmpty(a12) && (parseInt = Integer.parseInt(a12)) > 0) {
                            i6 = parseInt * 1000;
                        }
                        this.ai = new AnonymousClass6(i4, i6);
                        this.ah.addOnAttachStateChangeListener(new AnonymousClass7());
                    }
                }
            }
        } catch (Throwable th4) {
            th4.getMessage();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f22362G;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f22363H;
        if (runnable2 != null) {
            removeCallbacks(runnable2);
        }
        if (this.ai != null) {
            com.anythink.core.express.c.a.a().b(this.ai);
            this.ai = null;
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        d dVar = this.f22229b;
        if (dVar == null || !dVar.j()) {
            RelativeLayout relativeLayout = this.f22364I;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(4);
            }
            int i = configuration.orientation;
            this.f22231d = i;
            if (i == 2) {
                removeView(this.f22378r);
                a(this.f22379s);
            } else {
                removeView(this.f22379s);
                a(this.f22378r);
            }
        }
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z6) {
        super.onVisibilityAggregated(z6);
        if (!z6) {
            b();
        } else {
            if (!this.al || this.ah == null || this.ai == null) {
                return;
            }
            a();
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z6) {
        super.onWindowFocusChanged(z6);
        if (!z6) {
            b();
        } else {
            if (!this.al || this.ai == null) {
                return;
            }
            a();
        }
    }

    @Override // com.anythink.expressad.video.signal.f
    public void preLoadData(b bVar) {
        this.J = bVar;
        try {
            if (this.f22229b == null || !this.f22233f) {
                return;
            }
            com.anythink.expressad.foundation.g.d.b.a(this.f22228a.getApplicationContext()).a(this.f22229b.bm(), new AnonymousClass11());
            com.anythink.expressad.foundation.g.d.b.a(this.f22228a.getApplicationContext()).a(this.f22229b.bl(), new j(this.f22384x, v.b(t.b().g(), 8.0f)));
            this.f22357B.setText(this.f22229b.bj());
            TextView textView = this.ad;
            if (textView != null) {
                textView.setText(this.f22229b.dj);
            }
            TextView textView2 = this.f22358C;
            if (textView2 != null) {
                textView2.setText(this.f22229b.bk());
            }
            TextView textView3 = this.f22359D;
            if (textView3 != null) {
                textView3.setText(this.f22229b.bg() + ")");
            }
            this.f22360E.removeAllViews();
            double bf = this.f22229b.bf();
            if (bf <= 0.0d) {
                bf = 5.0d;
            }
            LinearLayout linearLayout = this.f22360E;
            if (linearLayout instanceof StarLevelView) {
                ((StarLevelView) linearLayout).initScore(bf);
            }
            LinearLayout linearLayout2 = this.f22360E;
            if (linearLayout2 instanceof AnyThinkLevelLayoutView) {
                ((AnyThinkLevelLayoutView) linearLayout2).setRatingAndUser(bf, this.f22229b.bg());
            }
            if (!TextUtils.isEmpty(this.f22229b.J()) && this.f22229b.J().contains("alecfc=1")) {
                this.f22365K = true;
            }
            com.anythink.expressad.foundation.g.d.b.a(this.f22228a.getApplicationContext()).a(TextUtils.isEmpty(this.f22229b.aH()) ? com.anythink.expressad.a.ae : this.f22229b.aH(), new AnonymousClass12());
            v.a(this.f22386z, this.f22229b, this.f22228a, true);
            if (this.f22366L) {
                return;
            }
            this.ac.setVisibility(8);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void release() {
        try {
            removeAllViews();
            AlphaAnimation alphaAnimation = this.f22371Q;
            if (alphaAnimation != null) {
                alphaAnimation.cancel();
            }
            this.f22362G = null;
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    public void setCloseBtnDelay(int i) {
        this.f22367M = i;
    }

    public void setLayout() {
        if (!this.i) {
            f();
            return;
        }
        new com.anythink.expressad.video.dynview.j.c();
        com.anythink.expressad.video.dynview.c a9 = com.anythink.expressad.video.dynview.j.c.a(getContext(), this.f22229b, this.f22236j, "en_");
        this.aa = a9.m();
        com.anythink.expressad.video.dynview.b.a();
        com.anythink.expressad.video.dynview.b.a(a9, new AnonymousClass10());
    }

    public void setMoreOfferCampaignUnit(e eVar) {
        ArrayList<d> arrayList;
        MBShakeView mBShakeView;
        d dVar = this.f22229b;
        if (dVar == null || !dVar.j()) {
            return;
        }
        this.ag = eVar;
        if (eVar == null || (arrayList = eVar.f19467K) == null || arrayList.size() <= 5 || (mBShakeView = this.ah) == null) {
            return;
        }
        mBShakeView.setPadding(0, 0, 0, v.b(getContext(), 5.0f));
    }

    public void setNotchPadding(int i, int i4, int i6, int i9) {
        String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i6), Integer.valueOf(i9));
        this.f22372R = i;
        this.f22373S = i4;
        this.f22374T = i6;
        this.f22375U = i9;
        j();
    }

    public void setOnPause() {
        this.f22369O = false;
    }

    public void setOnResume() {
        this.f22369O = true;
    }

    public void setUnitId(String str) {
        this.af = str;
    }

    public static /* synthetic */ boolean a(AnythinkNativeEndCardView anythinkNativeEndCardView) {
        anythinkNativeEndCardView.f22366L = true;
        return true;
    }

    private void e() {
        new com.anythink.expressad.video.dynview.j.c();
        com.anythink.expressad.video.dynview.c a9 = com.anythink.expressad.video.dynview.j.c.a(getContext(), this.f22229b, this.f22236j, "en_");
        this.aa = a9.m();
        com.anythink.expressad.video.dynview.b.a();
        com.anythink.expressad.video.dynview.b.a(a9, new AnonymousClass10());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        int i = i();
        if (i > 0) {
            this.f22233f = b(i);
            g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        com.anythink.expressad.video.module.a.a aVar;
        c();
        if (!this.f22233f && (aVar = this.f22232e) != null) {
            aVar.a(104, "");
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 100.0f);
        this.f22371Q = alphaAnimation;
        alphaAnimation.setDuration(200L);
    }

    private void h() {
        com.anythink.expressad.foundation.g.d.b.a(this.f22228a.getApplicationContext()).a(this.f22229b.bm(), new AnonymousClass11());
        com.anythink.expressad.foundation.g.d.b.a(this.f22228a.getApplicationContext()).a(this.f22229b.bl(), new j(this.f22384x, k.e(8.0f)));
        this.f22357B.setText(this.f22229b.bj());
        TextView textView = this.ad;
        if (textView != null) {
            textView.setText(this.f22229b.dj);
        }
        TextView textView2 = this.f22358C;
        if (textView2 != null) {
            textView2.setText(this.f22229b.bk());
        }
        TextView textView3 = this.f22359D;
        if (textView3 != null) {
            textView3.setText(this.f22229b.bg() + ")");
        }
        this.f22360E.removeAllViews();
        double bf = this.f22229b.bf();
        if (bf <= 0.0d) {
            bf = 5.0d;
        }
        LinearLayout linearLayout = this.f22360E;
        if (linearLayout instanceof StarLevelView) {
            ((StarLevelView) linearLayout).initScore(bf);
        }
        LinearLayout linearLayout2 = this.f22360E;
        if (linearLayout2 instanceof AnyThinkLevelLayoutView) {
            ((AnyThinkLevelLayoutView) linearLayout2).setRatingAndUser(bf, this.f22229b.bg());
        }
        if (!TextUtils.isEmpty(this.f22229b.J()) && this.f22229b.J().contains("alecfc=1")) {
            this.f22365K = true;
        }
        com.anythink.expressad.foundation.g.d.b.a(this.f22228a.getApplicationContext()).a(TextUtils.isEmpty(this.f22229b.aH()) ? com.anythink.expressad.a.ae : this.f22229b.aH(), new AnonymousClass12());
        v.a(this.f22386z, this.f22229b, this.f22228a, true);
        if (this.f22366L) {
            return;
        }
        this.ac.setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        r1 = com.anythink.expressad.video.module.AnythinkNativeEndCardView.f22355q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002e, code lost:
    
        if (r6.ae != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r6.ae != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int i() {
        int i = this.ak;
        String str = f22353o;
        String str2 = f22352n;
        if (i == 0) {
            if (this.ae) {
                str2 = f22354p;
            }
            if (isLandscape()) {
            }
        } else {
            if (i != 1) {
                str2 = "";
            } else if (this.ae) {
                str2 = f22354p;
            }
            if (i == 2) {
            }
        }
        return findLayout(str2);
    }

    private void j() {
        RelativeLayout relativeLayout;
        if (!this.f22233f || (relativeLayout = this.f22364I) == null) {
            return;
        }
        relativeLayout.postDelayed(new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkNativeEndCardView.3
            @Override // java.lang.Runnable
            public final void run() {
                d dVar = AnythinkNativeEndCardView.this.f22229b;
                if (dVar != null && !dVar.j() && AnythinkNativeEndCardView.this.f22229b.e() != 2) {
                    AnythinkNativeEndCardView.this.f22364I.setPadding(AnythinkNativeEndCardView.this.f22372R, AnythinkNativeEndCardView.this.f22374T, AnythinkNativeEndCardView.this.f22373S, AnythinkNativeEndCardView.this.f22375U);
                    AnythinkNativeEndCardView.this.f22364I.startAnimation(AnythinkNativeEndCardView.this.f22371Q);
                }
                AnythinkNativeEndCardView.this.f22364I.setVisibility(0);
                if (AnythinkNativeEndCardView.this.ac.getVisibility() != 0 && AnythinkNativeEndCardView.this.f22366L) {
                    AnythinkNativeEndCardView.this.ac.setVisibility(0);
                }
                AnythinkNativeEndCardView.r(AnythinkNativeEndCardView.this);
            }
        }, 200L);
    }

    private void k() {
        if (!com.anythink.expressad.foundation.f.b.a().b()) {
            FeedBackButton feedBackButton = this.f22361F;
            if (feedBackButton != null) {
                feedBackButton.setVisibility(8);
                return;
            }
            return;
        }
        this.f22229b.l(this.af);
        com.anythink.expressad.foundation.f.b.a().a(Wv.i(new StringBuilder(), this.af, "_2"), new AnonymousClass4());
        com.anythink.expressad.foundation.f.b.a().a(Wv.i(new StringBuilder(), this.af, "_2"), this.f22229b);
        com.anythink.expressad.foundation.f.b.a().c(this.af + "_1");
        com.anythink.expressad.foundation.f.b.a().a(Wv.i(new StringBuilder(), this.af, "_2"), this.f22361F);
        if (this.f22361F != null) {
            com.anythink.expressad.foundation.f.b.a().a(Wv.i(new StringBuilder(), this.af, "_2"), this.f22361F);
        }
    }

    private void l() {
        int parseInt;
        int parseInt2;
        try {
            d dVar = this.f22229b;
            if (dVar != null && dVar.j()) {
                String J = this.f22229b.J();
                if (TextUtils.isEmpty(J)) {
                    J = this.f22229b.Q();
                }
                String a9 = z.a(J, "shake_strength");
                String a10 = z.a(J, "shake_time");
                if (!TextUtils.isEmpty("1") && this.ah == null) {
                    AnythinkBaitClickView anythinkBaitClickView = this.aj;
                    if (anythinkBaitClickView != null) {
                        anythinkBaitClickView.setVisibility(8);
                    }
                    MBShakeView mBShakeView = new MBShakeView(getContext());
                    this.ah = mBShakeView;
                    mBShakeView.initView(this.f22229b.dj, true);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    if (isLandscape()) {
                        layoutParams.addRule(13);
                    } else {
                        layoutParams.addRule(2, filterFindViewId(this.f22376V, "anythink_iv_logo"));
                        layoutParams.addRule(14);
                        this.ah.setPadding(0, 0, 0, v.b(getContext(), 20.0f));
                    }
                    this.ah.setLayoutParams(layoutParams);
                    RelativeLayout relativeLayout = this.f22380t;
                    if (relativeLayout != null && relativeLayout.isShown()) {
                        if (this.ad != null) {
                            this.f22380t.addView(this.ah);
                        }
                        this.ad.setVisibility(4);
                        this.ah.setOnClickListener(new AnonymousClass5());
                        int i = 10;
                        if (!TextUtils.isEmpty(a9) && (parseInt2 = Integer.parseInt(a9)) >= 0) {
                            i = parseInt2;
                        }
                        int i4 = 5000;
                        if (!TextUtils.isEmpty(a10) && (parseInt = Integer.parseInt(a10)) > 0) {
                            i4 = parseInt * 1000;
                        }
                        this.ai = new AnonymousClass6(i, i4);
                        this.ah.addOnAttachStateChangeListener(new AnonymousClass7());
                    }
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private void m() {
        int i;
        AnythinkBaitClickView anythinkBaitClickView;
        try {
            d dVar = this.f22229b;
            if (dVar != null && dVar.j()) {
                String J = this.f22229b.J();
                if (TextUtils.isEmpty(J)) {
                    J = this.f22229b.Q();
                }
                String a9 = z.a(J, "bait_click");
                try {
                    i = Integer.parseInt(a9);
                } catch (Throwable th) {
                    th.getMessage();
                    i = 1;
                }
                if (TextUtils.isEmpty(a9) || i == 0 || (anythinkBaitClickView = this.aj) == null) {
                    return;
                }
                anythinkBaitClickView.setVisibility(0);
                this.aj.init(1342177280, i);
                if (this.f22229b.s() == 1302) {
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    gradientDrawable.setColor(1342177280);
                    gradientDrawable.setStroke(0, -65536);
                    gradientDrawable.setCornerRadius(25.0f);
                    this.aj.setBackground(gradientDrawable);
                }
                this.aj.startAnimation();
                this.aj.setOnClickListener(new AnonymousClass8());
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    private void n() {
        try {
            d dVar = this.f22229b;
            if (dVar != null && dVar.j()) {
                String J = this.f22229b.J();
                if (TextUtils.isEmpty(J)) {
                    J = this.f22229b.Q();
                }
                String a9 = z.a(J, "alac");
                if (TextUtils.isEmpty(a9) || !a9.equals("1")) {
                    return;
                }
                postDelayed(new AnonymousClass9(), 1000L);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public final void c() {
        View view = this.ac;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkNativeEndCardView.14
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AnythinkNativeEndCardView.this.f22232e.a(104, "");
                }
            });
        }
        if (this.f22233f) {
            this.f22380t.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkNativeEndCardView.15
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    if (AnythinkNativeEndCardView.this.f22365K) {
                        AnythinkNativeEndCardView.a(AnythinkNativeEndCardView.this, 1);
                    }
                }
            });
            TextView textView = this.ad;
            if (textView != null) {
                textView.setOnClickListener(new com.anythink.expressad.widget.a() { // from class: com.anythink.expressad.video.module.AnythinkNativeEndCardView.16
                    @Override // com.anythink.expressad.widget.a
                    public final void a(View view2) {
                        AnythinkNativeEndCardView.a(AnythinkNativeEndCardView.this, 0);
                    }
                });
            }
            this.f22384x.setOnClickListener(new com.anythink.expressad.widget.a() { // from class: com.anythink.expressad.video.module.AnythinkNativeEndCardView.17
                @Override // com.anythink.expressad.widget.a
                public final void a(View view2) {
                    AnythinkNativeEndCardView.a(AnythinkNativeEndCardView.this, 0);
                }
            });
            this.f22383w.setOnClickListener(new com.anythink.expressad.widget.a() { // from class: com.anythink.expressad.video.module.AnythinkNativeEndCardView.2
                @Override // com.anythink.expressad.widget.a
                public final void a(View view2) {
                    AnythinkNativeEndCardView.a(AnythinkNativeEndCardView.this, 0);
                }
            });
        }
    }

    private boolean b(int i) {
        if (isLandscape()) {
            ViewGroup viewGroup = (ViewGroup) this.f22230c.inflate(i, (ViewGroup) null);
            this.f22379s = viewGroup;
            addView(viewGroup);
            return b(this.f22379s);
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f22230c.inflate(i, (ViewGroup) null);
        this.f22378r = viewGroup2;
        addView(viewGroup2);
        return b(this.f22378r);
    }

    private void a(Bitmap bitmap) {
        try {
            com.anythink.expressad.foundation.g.i.a.b().execute(new AnonymousClass13(bitmap));
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    /* renamed from: com.anythink.expressad.video.module.AnythinkNativeEndCardView$10, reason: invalid class name */
    public class AnonymousClass10 implements h {
        public AnonymousClass10() {
        }

        @Override // com.anythink.expressad.video.dynview.f.h
        public final void a(com.anythink.expressad.video.dynview.a aVar) {
            AnythinkNativeEndCardView.this.addView(aVar.a());
            AnythinkNativeEndCardView.this.f22376V = aVar.c();
            if (AnythinkNativeEndCardView.this.ctaViewCanGet(aVar.a(), AnythinkNativeEndCardView.this.f22376V)) {
                AnythinkNativeEndCardView anythinkNativeEndCardView = AnythinkNativeEndCardView.this;
                anythinkNativeEndCardView.f22233f = anythinkNativeEndCardView.b(aVar.a());
                AnythinkNativeEndCardView.this.g();
            } else {
                AnythinkNativeEndCardView.this.f22376V = false;
                AnythinkNativeEndCardView anythinkNativeEndCardView2 = AnythinkNativeEndCardView.this;
                anythinkNativeEndCardView2.i = false;
                anythinkNativeEndCardView2.f();
            }
        }

        @Override // com.anythink.expressad.video.dynview.f.h
        public final void a(com.anythink.expressad.video.dynview.c.b bVar) {
            bVar.b();
        }
    }

    private void a(View view) {
        if (view == null) {
            setLayout();
            preLoadData(this.J);
        } else {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            addView(view);
            b(view);
            c();
        }
        j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(View view) {
        try {
            this.f22380t = (RelativeLayout) view.findViewById(filterFindViewId(this.f22376V, "anythink_native_ec_layout"));
            this.f22381u = (RelativeLayout) view.findViewById(filterFindViewId(this.f22376V, "anythink_native_ec_layer_layout"));
            this.f22383w = (ImageView) view.findViewById(filterFindViewId(this.f22376V, "anythink_iv_adbanner"));
            this.f22384x = (ImageView) view.findViewById(filterFindViewId(this.f22376V, "anythink_iv_icon"));
            this.f22385y = (ImageView) view.findViewById(filterFindViewId(this.f22376V, "anythink_iv_flag"));
            this.f22356A = (ImageView) view.findViewById(filterFindViewId(this.f22376V, "anythink_iv_logo"));
            this.f22386z = (ImageView) view.findViewById(filterFindViewId(this.f22376V, "anythink_iv_link"));
            this.f22357B = (TextView) view.findViewById(filterFindViewId(this.f22376V, "anythink_tv_apptitle"));
            this.f22360E = (LinearLayout) view.findViewById(filterFindViewId(this.f22376V, "anythink_sv_starlevel"));
            this.ac = view.findViewById(filterFindViewId(this.f22376V, "anythink_iv_close"));
            View findViewById = view.findViewById(filterFindViewId(this.f22376V, "anythink_tv_cta"));
            if (findViewById != null && (findViewById instanceof TextView)) {
                this.ad = (TextView) findViewById;
            }
            this.f22361F = (FeedBackButton) view.findViewById(filterFindViewId(this.f22376V, "anythink_native_endcard_feed_btn"));
            this.f22364I = (RelativeLayout) view.findViewById(filterFindViewId(this.f22376V, "anythink_native_ec_controller"));
            this.f22382v = (ImageView) view.findViewById(filterFindViewId(this.f22376V, "anythink_iv_adbanner_bg"));
            this.aj = (AnythinkBaitClickView) findViewById(filterFindViewId(this.f22376V, "anythink_animation_click_view"));
            this.f22358C = (TextView) view.findViewById(filterFindViewId(this.f22376V, "anythink_tv_appdesc"));
            if (!this.i) {
                this.f22358C = (TextView) view.findViewById(filterFindViewId(this.f22376V, "anythink_tv_appdesc"));
                TextView textView = (TextView) view.findViewById(filterFindViewId(this.f22376V, "anythink_tv_number"));
                this.f22359D = textView;
                return isNotNULL(this.f22383w, this.f22384x, this.f22357B, this.f22358C, textView, this.f22360E, this.ac, this.ad);
            }
            ImageView imageView = this.f22383w;
            if (imageView != null && (imageView instanceof RoundImageView)) {
                ((RoundImageView) imageView).setBorderRadius(10);
            }
            ImageView imageView2 = this.f22384x;
            if (imageView2 != null && (imageView2 instanceof RoundImageView)) {
                ((RoundImageView) imageView2).setBorderRadius(10);
            }
            return isNotNULL(this.f22383w, this.f22384x, this.f22357B, this.f22360E, this.ac);
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    private void c(int i) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
        } catch (JSONException e9) {
            e = e9;
        }
        try {
            jSONObject.put(com.anythink.expressad.foundation.g.a.ci, a(i));
            if (this.f22229b.k() == 5) {
                jSONObject.put("camp_position", 0);
            }
        } catch (JSONException e10) {
            e = e10;
            jSONObject2 = jSONObject;
            e.printStackTrace();
            jSONObject = jSONObject2;
            this.f22232e.a(105, jSONObject);
        }
        this.f22232e.a(105, jSONObject);
    }

    public AnythinkNativeEndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22365K = false;
        this.f22366L = false;
        this.f22367M = 0;
        this.f22368N = false;
        this.f22369O = false;
        this.f22370P = false;
        this.f22376V = false;
        this.aa = 1;
        this.ak = 1;
        this.al = false;
    }

    public final void a() {
        if (this.ai != null) {
            com.anythink.core.express.c.a.a().a(this.ai);
        }
    }

    public static /* synthetic */ void a(AnythinkNativeEndCardView anythinkNativeEndCardView, Bitmap bitmap) {
        try {
            com.anythink.expressad.foundation.g.i.a.b().execute(anythinkNativeEndCardView.new AnonymousClass13(bitmap));
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    public static /* synthetic */ void a(AnythinkNativeEndCardView anythinkNativeEndCardView, int i) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
        } catch (JSONException e9) {
            e = e9;
        }
        try {
            jSONObject.put(com.anythink.expressad.foundation.g.a.ci, anythinkNativeEndCardView.a(i));
            if (anythinkNativeEndCardView.f22229b.k() == 5) {
                jSONObject.put("camp_position", 0);
            }
        } catch (JSONException e10) {
            e = e10;
            jSONObject2 = jSONObject;
            e.printStackTrace();
            jSONObject = jSONObject2;
            anythinkNativeEndCardView.f22232e.a(105, jSONObject);
        }
        anythinkNativeEndCardView.f22232e.a(105, jSONObject);
    }

    public AnythinkNativeEndCardView(Context context, AttributeSet attributeSet, boolean z6, int i, boolean z9, int i4, int i6) {
        super(context, attributeSet, z6, i, z9, i4, i6);
        this.f22365K = false;
        this.f22366L = false;
        this.f22367M = 0;
        this.f22368N = false;
        this.f22369O = false;
        this.f22370P = false;
        this.f22376V = false;
        this.aa = 1;
        this.ak = 1;
        this.al = false;
    }

    public final void b() {
        if (this.ai != null) {
            com.anythink.core.express.c.a.a().b(this.ai);
        }
    }
}
