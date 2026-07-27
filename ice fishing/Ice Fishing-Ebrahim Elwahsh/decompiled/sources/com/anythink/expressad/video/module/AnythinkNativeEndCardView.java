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
import com.anythink.basead.b.c.i;
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
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public class AnythinkNativeEndCardView extends AnythinkBaseView implements f {

    /* renamed from: n, reason: collision with root package name */
    private static final String f21723n = "anythink_reward_endcard_native_hor";

    /* renamed from: o, reason: collision with root package name */
    private static final String f21724o = "anythink_reward_endcard_native_land";

    /* renamed from: p, reason: collision with root package name */
    private static final String f21725p = "anythink_reward_endcard_native_half_portrait";

    /* renamed from: q, reason: collision with root package name */
    private static final String f21726q = "anythink_reward_endcard_native_half_landscape";

    /* renamed from: A, reason: collision with root package name */
    private ImageView f21727A;

    /* renamed from: B, reason: collision with root package name */
    private TextView f21728B;

    /* renamed from: C, reason: collision with root package name */
    private TextView f21729C;

    /* renamed from: D, reason: collision with root package name */
    private TextView f21730D;

    /* renamed from: E, reason: collision with root package name */
    private LinearLayout f21731E;

    /* renamed from: F, reason: collision with root package name */
    private FeedBackButton f21732F;

    /* renamed from: G, reason: collision with root package name */
    private Runnable f21733G;

    /* renamed from: H, reason: collision with root package name */
    private Runnable f21734H;

    /* renamed from: I, reason: collision with root package name */
    private RelativeLayout f21735I;
    private b J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f21736K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f21737L;

    /* renamed from: M, reason: collision with root package name */
    private int f21738M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f21739N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f21740O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f21741P;

    /* renamed from: Q, reason: collision with root package name */
    private AlphaAnimation f21742Q;

    /* renamed from: R, reason: collision with root package name */
    private int f21743R;

    /* renamed from: S, reason: collision with root package name */
    private int f21744S;

    /* renamed from: T, reason: collision with root package name */
    private int f21745T;

    /* renamed from: U, reason: collision with root package name */
    private int f21746U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f21747V;

    /* renamed from: W, reason: collision with root package name */
    private Bitmap f21748W;
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
    private ViewGroup f21749r;

    /* renamed from: s, reason: collision with root package name */
    private ViewGroup f21750s;

    /* renamed from: t, reason: collision with root package name */
    private RelativeLayout f21751t;

    /* renamed from: u, reason: collision with root package name */
    private RelativeLayout f21752u;

    /* renamed from: v, reason: collision with root package name */
    private ImageView f21753v;

    /* renamed from: w, reason: collision with root package name */
    private ImageView f21754w;

    /* renamed from: x, reason: collision with root package name */
    private ImageView f21755x;

    /* renamed from: y, reason: collision with root package name */
    private ImageView f21756y;

    /* renamed from: z, reason: collision with root package name */
    private ImageView f21757z;

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
                if (AnythinkNativeEndCardView.this.f21754w != null) {
                    AnythinkNativeEndCardView anythinkNativeEndCardView = AnythinkNativeEndCardView.this;
                    if (anythinkNativeEndCardView.i) {
                        anythinkNativeEndCardView.f21754w.setBackgroundDrawable(null);
                    }
                    AnythinkNativeEndCardView.this.f21754w.setImageBitmap(bitmap);
                }
                AnythinkNativeEndCardView.a(AnythinkNativeEndCardView.this, bitmap);
            } catch (Throwable unused) {
                if (AnythinkNativeEndCardView.this.f21753v != null) {
                    AnythinkNativeEndCardView.this.f21753v.setVisibility(4);
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
                int b9 = v.b(AnythinkNativeEndCardView.this.f21599a, 12.0f);
                AnythinkNativeEndCardView.this.f21756y.getLayoutParams().height = b9;
                AnythinkNativeEndCardView.this.f21756y.getLayoutParams().width = (int) (b9 * ((bitmap.getWidth() * 1.0f) / bitmap.getHeight()));
                AnythinkNativeEndCardView.this.f21756y.setImageBitmap(bitmap);
                AnythinkNativeEndCardView.this.f21756y.setBackgroundColor(1426063360);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.anythink.expressad.video.module.AnythinkNativeEndCardView$13, reason: invalid class name */
    public class AnonymousClass13 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bitmap f21762a;

        public AnonymousClass13(Bitmap bitmap) {
            this.f21762a = bitmap;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnythinkNativeEndCardView anythinkNativeEndCardView = AnythinkNativeEndCardView.this;
            anythinkNativeEndCardView.f21748W = anythinkNativeEndCardView.blurBitmap(this.f21762a);
            if (AnythinkNativeEndCardView.this.f21748W == null || AnythinkNativeEndCardView.this.f21748W.isRecycled() || AnythinkNativeEndCardView.this.f21753v == null) {
                return;
            }
            AnythinkNativeEndCardView.this.f21753v.post(new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkNativeEndCardView.13.1
                @Override // java.lang.Runnable
                public final void run() {
                    AnythinkNativeEndCardView anythinkNativeEndCardView2 = AnythinkNativeEndCardView.this;
                    if (anythinkNativeEndCardView2.i) {
                        anythinkNativeEndCardView2.f21753v.setBackgroundDrawable(null);
                    }
                    AnythinkNativeEndCardView.this.f21753v.setImageBitmap(AnythinkNativeEndCardView.this.f21748W);
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
            AnythinkNativeEndCardView.this.f21741P = true;
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void b() {
            AnythinkNativeEndCardView.this.f21741P = false;
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void c() {
            AnythinkNativeEndCardView.this.f21741P = false;
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
            if (!AnythinkNativeEndCardView.this.f21741P && AnythinkNativeEndCardView.this.f21740O && AnythinkNativeEndCardView.this.isShown()) {
                AnythinkNativeEndCardView anythinkNativeEndCardView = AnythinkNativeEndCardView.this;
                anythinkNativeEndCardView.f21605g = 0.0f;
                anythinkNativeEndCardView.f21606h = 0.0f;
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
        this.f21736K = false;
        this.f21737L = false;
        this.f21738M = 0;
        this.f21739N = false;
        this.f21740O = false;
        this.f21741P = false;
        this.f21747V = false;
        this.aa = 1;
        this.ak = 1;
        this.al = false;
    }

    private static void o() {
    }

    public static /* synthetic */ void r(AnythinkNativeEndCardView anythinkNativeEndCardView) {
        if (!com.anythink.expressad.foundation.f.b.a().b()) {
            FeedBackButton feedBackButton = anythinkNativeEndCardView.f21732F;
            if (feedBackButton != null) {
                feedBackButton.setVisibility(8);
                return;
            }
            return;
        }
        anythinkNativeEndCardView.f21600b.l(anythinkNativeEndCardView.af);
        com.anythink.expressad.foundation.f.b.a().a(AbstractC5051n.g(new StringBuilder(), anythinkNativeEndCardView.af, "_2"), anythinkNativeEndCardView.new AnonymousClass4());
        com.anythink.expressad.foundation.f.b.a().a(AbstractC5051n.g(new StringBuilder(), anythinkNativeEndCardView.af, "_2"), anythinkNativeEndCardView.f21600b);
        com.anythink.expressad.foundation.f.b.a().c(anythinkNativeEndCardView.af + "_1");
        com.anythink.expressad.foundation.f.b.a().a(AbstractC5051n.g(new StringBuilder(), anythinkNativeEndCardView.af, "_2"), anythinkNativeEndCardView.f21732F);
        if (anythinkNativeEndCardView.f21732F != null) {
            com.anythink.expressad.foundation.f.b.a().a(AbstractC5051n.g(new StringBuilder(), anythinkNativeEndCardView.af, "_2"), anythinkNativeEndCardView.f21732F);
        }
    }

    public Bitmap blurBitmap(Bitmap bitmap) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
            RenderScript create = RenderScript.create(this.f21599a.getApplicationContext());
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
        d dVar = this.f21600b;
        if (dVar == null || !dVar.j() || (eVar = this.ag) == null || (arrayList = eVar.f18838K) == null || arrayList.size() <= 0) {
            return;
        }
        Iterator<d> it = this.ag.f18838K.iterator();
        while (it.hasNext()) {
            d next = it.next();
            if (!TextUtils.isEmpty(next.bl())) {
                i.m().c(next.bl());
            }
        }
    }

    public boolean ctaViewCanGet(View view, boolean z8) {
        try {
            View findViewById = view.findViewById(filterFindViewId(z8, "anythink_tv_cta"));
            if (findViewById instanceof TextView) {
                this.ad = (TextView) findViewById;
            }
        } catch (Exception e6) {
            if (com.anythink.expressad.a.f17776a) {
                e6.printStackTrace();
            }
        }
        return this.ad != null;
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
    }

    public boolean isDyXmlSuccess() {
        return this.f21747V;
    }

    public void notifyShowListener() {
        this.f21603e.a(110, "");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int parseInt;
        int parseInt2;
        int i;
        AnythinkBaitClickView anythinkBaitClickView;
        super.onAttachedToWindow();
        if (this.f21733G == null) {
            this.f21733G = new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkNativeEndCardView.1
                @Override // java.lang.Runnable
                public final void run() {
                    AnythinkNativeEndCardView.a(AnythinkNativeEndCardView.this);
                    if (AnythinkNativeEndCardView.this.ac != null) {
                        AnythinkNativeEndCardView.this.ac.setVisibility(0);
                    }
                }
            };
        }
        Runnable runnable = this.f21733G;
        if (runnable != null) {
            postDelayed(runnable, this.f21738M * 1000);
            if (!this.f21740O) {
                this.f21740O = true;
            }
            try {
                d dVar = this.f21600b;
                if (dVar != null && dVar.j()) {
                    String J = this.f21600b.J();
                    if (TextUtils.isEmpty(J)) {
                        J = this.f21600b.Q();
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
            d dVar2 = this.f21600b;
            if (dVar2 != null && dVar2.j()) {
                String J8 = this.f21600b.J();
                if (TextUtils.isEmpty(J8)) {
                    J8 = this.f21600b.Q();
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
                    if (this.f21600b.s() == 1302) {
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
            d dVar3 = this.f21600b;
            if (dVar3 != null && dVar3.j()) {
                String J9 = this.f21600b.J();
                if (TextUtils.isEmpty(J9)) {
                    J9 = this.f21600b.Q();
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
                    mBShakeView.initView(this.f21600b.dj, true);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    if (isLandscape()) {
                        layoutParams.addRule(13);
                    } else {
                        layoutParams.addRule(2, filterFindViewId(this.f21747V, "anythink_iv_logo"));
                        layoutParams.addRule(14);
                        this.ah.setPadding(0, 0, 0, v.b(getContext(), 20.0f));
                    }
                    this.ah.setLayoutParams(layoutParams);
                    RelativeLayout relativeLayout = this.f21751t;
                    if (relativeLayout != null && relativeLayout.isShown()) {
                        if (this.ad != null) {
                            this.f21751t.addView(this.ah);
                        }
                        this.ad.setVisibility(4);
                        this.ah.setOnClickListener(new AnonymousClass5());
                        int i4 = 10;
                        if (!TextUtils.isEmpty(a11) && (parseInt2 = Integer.parseInt(a11)) >= 0) {
                            i4 = parseInt2;
                        }
                        int i9 = 5000;
                        if (!TextUtils.isEmpty(a12) && (parseInt = Integer.parseInt(a12)) > 0) {
                            i9 = parseInt * 1000;
                        }
                        this.ai = new AnonymousClass6(i4, i9);
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
        Runnable runnable = this.f21733G;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f21734H;
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
        d dVar = this.f21600b;
        if (dVar == null || !dVar.j()) {
            RelativeLayout relativeLayout = this.f21735I;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(4);
            }
            int i = configuration.orientation;
            this.f21602d = i;
            if (i == 2) {
                removeView(this.f21749r);
                a(this.f21750s);
            } else {
                removeView(this.f21750s);
                a(this.f21749r);
            }
        }
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z8) {
        super.onVisibilityAggregated(z8);
        if (!z8) {
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
    public void onWindowFocusChanged(boolean z8) {
        super.onWindowFocusChanged(z8);
        if (!z8) {
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
            if (this.f21600b == null || !this.f21604f) {
                return;
            }
            com.anythink.expressad.foundation.g.d.b.a(this.f21599a.getApplicationContext()).a(this.f21600b.bm(), new AnonymousClass11());
            com.anythink.expressad.foundation.g.d.b.a(this.f21599a.getApplicationContext()).a(this.f21600b.bl(), new j(this.f21755x, v.b(t.b().g(), 8.0f)));
            this.f21728B.setText(this.f21600b.bj());
            TextView textView = this.ad;
            if (textView != null) {
                textView.setText(this.f21600b.dj);
            }
            TextView textView2 = this.f21729C;
            if (textView2 != null) {
                textView2.setText(this.f21600b.bk());
            }
            TextView textView3 = this.f21730D;
            if (textView3 != null) {
                textView3.setText(this.f21600b.bg() + ")");
            }
            this.f21731E.removeAllViews();
            double bf = this.f21600b.bf();
            if (bf <= 0.0d) {
                bf = 5.0d;
            }
            LinearLayout linearLayout = this.f21731E;
            if (linearLayout instanceof StarLevelView) {
                ((StarLevelView) linearLayout).initScore(bf);
            }
            LinearLayout linearLayout2 = this.f21731E;
            if (linearLayout2 instanceof AnyThinkLevelLayoutView) {
                ((AnyThinkLevelLayoutView) linearLayout2).setRatingAndUser(bf, this.f21600b.bg());
            }
            if (!TextUtils.isEmpty(this.f21600b.J()) && this.f21600b.J().contains("alecfc=1")) {
                this.f21736K = true;
            }
            com.anythink.expressad.foundation.g.d.b.a(this.f21599a.getApplicationContext()).a(TextUtils.isEmpty(this.f21600b.aH()) ? com.anythink.expressad.a.ae : this.f21600b.aH(), new AnonymousClass12());
            v.a(this.f21757z, this.f21600b, this.f21599a, true);
            if (this.f21737L) {
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
            AlphaAnimation alphaAnimation = this.f21742Q;
            if (alphaAnimation != null) {
                alphaAnimation.cancel();
            }
            this.f21733G = null;
        } catch (Exception e6) {
            e6.getMessage();
        }
    }

    public void setCloseBtnDelay(int i) {
        this.f21738M = i;
    }

    public void setLayout() {
        if (!this.i) {
            f();
            return;
        }
        new com.anythink.expressad.video.dynview.j.c();
        com.anythink.expressad.video.dynview.c a9 = com.anythink.expressad.video.dynview.j.c.a(getContext(), this.f21600b, this.f21607j, "en_");
        this.aa = a9.m();
        com.anythink.expressad.video.dynview.b.a();
        com.anythink.expressad.video.dynview.b.a(a9, new AnonymousClass10());
    }

    public void setMoreOfferCampaignUnit(e eVar) {
        ArrayList<d> arrayList;
        MBShakeView mBShakeView;
        d dVar = this.f21600b;
        if (dVar == null || !dVar.j()) {
            return;
        }
        this.ag = eVar;
        if (eVar == null || (arrayList = eVar.f18838K) == null || arrayList.size() <= 5 || (mBShakeView = this.ah) == null) {
            return;
        }
        mBShakeView.setPadding(0, 0, 0, v.b(getContext(), 5.0f));
    }

    public void setNotchPadding(int i, int i4, int i9, int i10) {
        String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i9), Integer.valueOf(i10));
        this.f21743R = i;
        this.f21744S = i4;
        this.f21745T = i9;
        this.f21746U = i10;
        j();
    }

    public void setOnPause() {
        this.f21740O = false;
    }

    public void setOnResume() {
        this.f21740O = true;
    }

    public void setUnitId(String str) {
        this.af = str;
    }

    public static /* synthetic */ boolean a(AnythinkNativeEndCardView anythinkNativeEndCardView) {
        anythinkNativeEndCardView.f21737L = true;
        return true;
    }

    private void e() {
        new com.anythink.expressad.video.dynview.j.c();
        com.anythink.expressad.video.dynview.c a9 = com.anythink.expressad.video.dynview.j.c.a(getContext(), this.f21600b, this.f21607j, "en_");
        this.aa = a9.m();
        com.anythink.expressad.video.dynview.b.a();
        com.anythink.expressad.video.dynview.b.a(a9, new AnonymousClass10());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        int i = i();
        if (i > 0) {
            this.f21604f = b(i);
            g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        com.anythink.expressad.video.module.a.a aVar;
        c();
        if (!this.f21604f && (aVar = this.f21603e) != null) {
            aVar.a(104, "");
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 100.0f);
        this.f21742Q = alphaAnimation;
        alphaAnimation.setDuration(200L);
    }

    private void h() {
        com.anythink.expressad.foundation.g.d.b.a(this.f21599a.getApplicationContext()).a(this.f21600b.bm(), new AnonymousClass11());
        com.anythink.expressad.foundation.g.d.b.a(this.f21599a.getApplicationContext()).a(this.f21600b.bl(), new j(this.f21755x, i.e(8.0f)));
        this.f21728B.setText(this.f21600b.bj());
        TextView textView = this.ad;
        if (textView != null) {
            textView.setText(this.f21600b.dj);
        }
        TextView textView2 = this.f21729C;
        if (textView2 != null) {
            textView2.setText(this.f21600b.bk());
        }
        TextView textView3 = this.f21730D;
        if (textView3 != null) {
            textView3.setText(this.f21600b.bg() + ")");
        }
        this.f21731E.removeAllViews();
        double bf = this.f21600b.bf();
        if (bf <= 0.0d) {
            bf = 5.0d;
        }
        LinearLayout linearLayout = this.f21731E;
        if (linearLayout instanceof StarLevelView) {
            ((StarLevelView) linearLayout).initScore(bf);
        }
        LinearLayout linearLayout2 = this.f21731E;
        if (linearLayout2 instanceof AnyThinkLevelLayoutView) {
            ((AnyThinkLevelLayoutView) linearLayout2).setRatingAndUser(bf, this.f21600b.bg());
        }
        if (!TextUtils.isEmpty(this.f21600b.J()) && this.f21600b.J().contains("alecfc=1")) {
            this.f21736K = true;
        }
        com.anythink.expressad.foundation.g.d.b.a(this.f21599a.getApplicationContext()).a(TextUtils.isEmpty(this.f21600b.aH()) ? com.anythink.expressad.a.ae : this.f21600b.aH(), new AnonymousClass12());
        v.a(this.f21757z, this.f21600b, this.f21599a, true);
        if (this.f21737L) {
            return;
        }
        this.ac.setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        r1 = com.anythink.expressad.video.module.AnythinkNativeEndCardView.f21726q;
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
        String str = f21724o;
        String str2 = f21723n;
        if (i == 0) {
            if (this.ae) {
                str2 = f21725p;
            }
            if (isLandscape()) {
            }
        } else {
            if (i != 1) {
                str2 = "";
            } else if (this.ae) {
                str2 = f21725p;
            }
            if (i == 2) {
            }
        }
        return findLayout(str2);
    }

    private void j() {
        RelativeLayout relativeLayout;
        if (!this.f21604f || (relativeLayout = this.f21735I) == null) {
            return;
        }
        relativeLayout.postDelayed(new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkNativeEndCardView.3
            @Override // java.lang.Runnable
            public final void run() {
                d dVar = AnythinkNativeEndCardView.this.f21600b;
                if (dVar != null && !dVar.j() && AnythinkNativeEndCardView.this.f21600b.e() != 2) {
                    AnythinkNativeEndCardView.this.f21735I.setPadding(AnythinkNativeEndCardView.this.f21743R, AnythinkNativeEndCardView.this.f21745T, AnythinkNativeEndCardView.this.f21744S, AnythinkNativeEndCardView.this.f21746U);
                    AnythinkNativeEndCardView.this.f21735I.startAnimation(AnythinkNativeEndCardView.this.f21742Q);
                }
                AnythinkNativeEndCardView.this.f21735I.setVisibility(0);
                if (AnythinkNativeEndCardView.this.ac.getVisibility() != 0 && AnythinkNativeEndCardView.this.f21737L) {
                    AnythinkNativeEndCardView.this.ac.setVisibility(0);
                }
                AnythinkNativeEndCardView.r(AnythinkNativeEndCardView.this);
            }
        }, 200L);
    }

    private void k() {
        if (!com.anythink.expressad.foundation.f.b.a().b()) {
            FeedBackButton feedBackButton = this.f21732F;
            if (feedBackButton != null) {
                feedBackButton.setVisibility(8);
                return;
            }
            return;
        }
        this.f21600b.l(this.af);
        com.anythink.expressad.foundation.f.b.a().a(AbstractC5051n.g(new StringBuilder(), this.af, "_2"), new AnonymousClass4());
        com.anythink.expressad.foundation.f.b.a().a(AbstractC5051n.g(new StringBuilder(), this.af, "_2"), this.f21600b);
        com.anythink.expressad.foundation.f.b.a().c(this.af + "_1");
        com.anythink.expressad.foundation.f.b.a().a(AbstractC5051n.g(new StringBuilder(), this.af, "_2"), this.f21732F);
        if (this.f21732F != null) {
            com.anythink.expressad.foundation.f.b.a().a(AbstractC5051n.g(new StringBuilder(), this.af, "_2"), this.f21732F);
        }
    }

    private void l() {
        int parseInt;
        int parseInt2;
        try {
            d dVar = this.f21600b;
            if (dVar != null && dVar.j()) {
                String J = this.f21600b.J();
                if (TextUtils.isEmpty(J)) {
                    J = this.f21600b.Q();
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
                    mBShakeView.initView(this.f21600b.dj, true);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    if (isLandscape()) {
                        layoutParams.addRule(13);
                    } else {
                        layoutParams.addRule(2, filterFindViewId(this.f21747V, "anythink_iv_logo"));
                        layoutParams.addRule(14);
                        this.ah.setPadding(0, 0, 0, v.b(getContext(), 20.0f));
                    }
                    this.ah.setLayoutParams(layoutParams);
                    RelativeLayout relativeLayout = this.f21751t;
                    if (relativeLayout != null && relativeLayout.isShown()) {
                        if (this.ad != null) {
                            this.f21751t.addView(this.ah);
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
            d dVar = this.f21600b;
            if (dVar != null && dVar.j()) {
                String J = this.f21600b.J();
                if (TextUtils.isEmpty(J)) {
                    J = this.f21600b.Q();
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
                if (this.f21600b.s() == 1302) {
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
            d dVar = this.f21600b;
            if (dVar != null && dVar.j()) {
                String J = this.f21600b.J();
                if (TextUtils.isEmpty(J)) {
                    J = this.f21600b.Q();
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
                    AnythinkNativeEndCardView.this.f21603e.a(104, "");
                }
            });
        }
        if (this.f21604f) {
            this.f21751t.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkNativeEndCardView.15
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    if (AnythinkNativeEndCardView.this.f21736K) {
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
            this.f21755x.setOnClickListener(new com.anythink.expressad.widget.a() { // from class: com.anythink.expressad.video.module.AnythinkNativeEndCardView.17
                @Override // com.anythink.expressad.widget.a
                public final void a(View view2) {
                    AnythinkNativeEndCardView.a(AnythinkNativeEndCardView.this, 0);
                }
            });
            this.f21754w.setOnClickListener(new com.anythink.expressad.widget.a() { // from class: com.anythink.expressad.video.module.AnythinkNativeEndCardView.2
                @Override // com.anythink.expressad.widget.a
                public final void a(View view2) {
                    AnythinkNativeEndCardView.a(AnythinkNativeEndCardView.this, 0);
                }
            });
        }
    }

    private boolean b(int i) {
        if (isLandscape()) {
            ViewGroup viewGroup = (ViewGroup) this.f21601c.inflate(i, (ViewGroup) null);
            this.f21750s = viewGroup;
            addView(viewGroup);
            return b(this.f21750s);
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f21601c.inflate(i, (ViewGroup) null);
        this.f21749r = viewGroup2;
        addView(viewGroup2);
        return b(this.f21749r);
    }

    private void a(Bitmap bitmap) {
        try {
            com.anythink.expressad.foundation.g.i.a.b().execute(new AnonymousClass13(bitmap));
        } catch (Exception e6) {
            e6.getMessage();
        }
    }

    /* renamed from: com.anythink.expressad.video.module.AnythinkNativeEndCardView$10, reason: invalid class name */
    public class AnonymousClass10 implements h {
        public AnonymousClass10() {
        }

        @Override // com.anythink.expressad.video.dynview.f.h
        public final void a(com.anythink.expressad.video.dynview.a aVar) {
            AnythinkNativeEndCardView.this.addView(aVar.a());
            AnythinkNativeEndCardView.this.f21747V = aVar.c();
            if (AnythinkNativeEndCardView.this.ctaViewCanGet(aVar.a(), AnythinkNativeEndCardView.this.f21747V)) {
                AnythinkNativeEndCardView anythinkNativeEndCardView = AnythinkNativeEndCardView.this;
                anythinkNativeEndCardView.f21604f = anythinkNativeEndCardView.b(aVar.a());
                AnythinkNativeEndCardView.this.g();
            } else {
                AnythinkNativeEndCardView.this.f21747V = false;
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
            this.f21751t = (RelativeLayout) view.findViewById(filterFindViewId(this.f21747V, "anythink_native_ec_layout"));
            this.f21752u = (RelativeLayout) view.findViewById(filterFindViewId(this.f21747V, "anythink_native_ec_layer_layout"));
            this.f21754w = (ImageView) view.findViewById(filterFindViewId(this.f21747V, "anythink_iv_adbanner"));
            this.f21755x = (ImageView) view.findViewById(filterFindViewId(this.f21747V, "anythink_iv_icon"));
            this.f21756y = (ImageView) view.findViewById(filterFindViewId(this.f21747V, "anythink_iv_flag"));
            this.f21727A = (ImageView) view.findViewById(filterFindViewId(this.f21747V, "anythink_iv_logo"));
            this.f21757z = (ImageView) view.findViewById(filterFindViewId(this.f21747V, "anythink_iv_link"));
            this.f21728B = (TextView) view.findViewById(filterFindViewId(this.f21747V, "anythink_tv_apptitle"));
            this.f21731E = (LinearLayout) view.findViewById(filterFindViewId(this.f21747V, "anythink_sv_starlevel"));
            this.ac = view.findViewById(filterFindViewId(this.f21747V, "anythink_iv_close"));
            View findViewById = view.findViewById(filterFindViewId(this.f21747V, "anythink_tv_cta"));
            if (findViewById != null && (findViewById instanceof TextView)) {
                this.ad = (TextView) findViewById;
            }
            this.f21732F = (FeedBackButton) view.findViewById(filterFindViewId(this.f21747V, "anythink_native_endcard_feed_btn"));
            this.f21735I = (RelativeLayout) view.findViewById(filterFindViewId(this.f21747V, "anythink_native_ec_controller"));
            this.f21753v = (ImageView) view.findViewById(filterFindViewId(this.f21747V, "anythink_iv_adbanner_bg"));
            this.aj = (AnythinkBaitClickView) findViewById(filterFindViewId(this.f21747V, "anythink_animation_click_view"));
            this.f21729C = (TextView) view.findViewById(filterFindViewId(this.f21747V, "anythink_tv_appdesc"));
            if (!this.i) {
                this.f21729C = (TextView) view.findViewById(filterFindViewId(this.f21747V, "anythink_tv_appdesc"));
                TextView textView = (TextView) view.findViewById(filterFindViewId(this.f21747V, "anythink_tv_number"));
                this.f21730D = textView;
                return isNotNULL(this.f21754w, this.f21755x, this.f21728B, this.f21729C, textView, this.f21731E, this.ac, this.ad);
            }
            ImageView imageView = this.f21754w;
            if (imageView != null && (imageView instanceof RoundImageView)) {
                ((RoundImageView) imageView).setBorderRadius(10);
            }
            ImageView imageView2 = this.f21755x;
            if (imageView2 != null && (imageView2 instanceof RoundImageView)) {
                ((RoundImageView) imageView2).setBorderRadius(10);
            }
            return isNotNULL(this.f21754w, this.f21755x, this.f21728B, this.f21731E, this.ac);
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
        } catch (JSONException e6) {
            e = e6;
        }
        try {
            jSONObject.put(com.anythink.expressad.foundation.g.a.ci, a(i));
            if (this.f21600b.k() == 5) {
                jSONObject.put("camp_position", 0);
            }
        } catch (JSONException e9) {
            e = e9;
            jSONObject2 = jSONObject;
            e.printStackTrace();
            jSONObject = jSONObject2;
            this.f21603e.a(105, jSONObject);
        }
        this.f21603e.a(105, jSONObject);
    }

    public AnythinkNativeEndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21736K = false;
        this.f21737L = false;
        this.f21738M = 0;
        this.f21739N = false;
        this.f21740O = false;
        this.f21741P = false;
        this.f21747V = false;
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
        } catch (Exception e6) {
            e6.getMessage();
        }
    }

    public static /* synthetic */ void a(AnythinkNativeEndCardView anythinkNativeEndCardView, int i) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
        } catch (JSONException e6) {
            e = e6;
        }
        try {
            jSONObject.put(com.anythink.expressad.foundation.g.a.ci, anythinkNativeEndCardView.a(i));
            if (anythinkNativeEndCardView.f21600b.k() == 5) {
                jSONObject.put("camp_position", 0);
            }
        } catch (JSONException e9) {
            e = e9;
            jSONObject2 = jSONObject;
            e.printStackTrace();
            jSONObject = jSONObject2;
            anythinkNativeEndCardView.f21603e.a(105, jSONObject);
        }
        anythinkNativeEndCardView.f21603e.a(105, jSONObject);
    }

    public AnythinkNativeEndCardView(Context context, AttributeSet attributeSet, boolean z8, int i, boolean z9, int i4, int i9) {
        super(context, attributeSet, z8, i, z9, i4, i9);
        this.f21736K = false;
        this.f21737L = false;
        this.f21738M = 0;
        this.f21739N = false;
        this.f21740O = false;
        this.f21741P = false;
        this.f21747V = false;
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
