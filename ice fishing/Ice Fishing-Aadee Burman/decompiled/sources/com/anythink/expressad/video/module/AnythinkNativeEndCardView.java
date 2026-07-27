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
import com.anythink.core.common.d.t;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.d.e;
import com.anythink.expressad.foundation.f.a;
import com.anythink.expressad.foundation.g.d.c;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.foundation.h.z;
import com.anythink.expressad.shake.MBShakeView;
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
import u1.h;

/* loaded from: classes.dex */
public class AnythinkNativeEndCardView extends AnythinkBaseView implements f {

    /* renamed from: n, reason: collision with root package name */
    private static final String f21565n = "anythink_reward_endcard_native_hor";

    /* renamed from: o, reason: collision with root package name */
    private static final String f21566o = "anythink_reward_endcard_native_land";

    /* renamed from: p, reason: collision with root package name */
    private static final String f21567p = "anythink_reward_endcard_native_half_portrait";

    /* renamed from: q, reason: collision with root package name */
    private static final String f21568q = "anythink_reward_endcard_native_half_landscape";

    /* renamed from: A, reason: collision with root package name */
    private ImageView f21569A;

    /* renamed from: B, reason: collision with root package name */
    private TextView f21570B;

    /* renamed from: C, reason: collision with root package name */
    private TextView f21571C;

    /* renamed from: D, reason: collision with root package name */
    private TextView f21572D;

    /* renamed from: E, reason: collision with root package name */
    private LinearLayout f21573E;

    /* renamed from: F, reason: collision with root package name */
    private FeedBackButton f21574F;

    /* renamed from: G, reason: collision with root package name */
    private Runnable f21575G;

    /* renamed from: H, reason: collision with root package name */
    private Runnable f21576H;

    /* renamed from: I, reason: collision with root package name */
    private RelativeLayout f21577I;
    private b J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f21578K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f21579L;

    /* renamed from: M, reason: collision with root package name */
    private int f21580M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f21581N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f21582O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f21583P;

    /* renamed from: Q, reason: collision with root package name */
    private AlphaAnimation f21584Q;

    /* renamed from: R, reason: collision with root package name */
    private int f21585R;

    /* renamed from: S, reason: collision with root package name */
    private int f21586S;

    /* renamed from: T, reason: collision with root package name */
    private int f21587T;

    /* renamed from: U, reason: collision with root package name */
    private int f21588U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f21589V;

    /* renamed from: W, reason: collision with root package name */
    private Bitmap f21590W;
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
    private ViewGroup f21591r;

    /* renamed from: s, reason: collision with root package name */
    private ViewGroup f21592s;

    /* renamed from: t, reason: collision with root package name */
    private RelativeLayout f21593t;

    /* renamed from: u, reason: collision with root package name */
    private RelativeLayout f21594u;

    /* renamed from: v, reason: collision with root package name */
    private ImageView f21595v;

    /* renamed from: w, reason: collision with root package name */
    private ImageView f21596w;

    /* renamed from: x, reason: collision with root package name */
    private ImageView f21597x;

    /* renamed from: y, reason: collision with root package name */
    private ImageView f21598y;

    /* renamed from: z, reason: collision with root package name */
    private ImageView f21599z;

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
                if (AnythinkNativeEndCardView.this.f21596w != null) {
                    AnythinkNativeEndCardView anythinkNativeEndCardView = AnythinkNativeEndCardView.this;
                    if (anythinkNativeEndCardView.i) {
                        anythinkNativeEndCardView.f21596w.setBackgroundDrawable(null);
                    }
                    AnythinkNativeEndCardView.this.f21596w.setImageBitmap(bitmap);
                }
                AnythinkNativeEndCardView.a(AnythinkNativeEndCardView.this, bitmap);
            } catch (Throwable unused) {
                if (AnythinkNativeEndCardView.this.f21595v != null) {
                    AnythinkNativeEndCardView.this.f21595v.setVisibility(4);
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
                int b9 = v.b(AnythinkNativeEndCardView.this.f21441a, 12.0f);
                AnythinkNativeEndCardView.this.f21598y.getLayoutParams().height = b9;
                AnythinkNativeEndCardView.this.f21598y.getLayoutParams().width = (int) (b9 * ((bitmap.getWidth() * 1.0f) / bitmap.getHeight()));
                AnythinkNativeEndCardView.this.f21598y.setImageBitmap(bitmap);
                AnythinkNativeEndCardView.this.f21598y.setBackgroundColor(1426063360);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.anythink.expressad.video.module.AnythinkNativeEndCardView$13, reason: invalid class name */
    public class AnonymousClass13 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bitmap f21604a;

        public AnonymousClass13(Bitmap bitmap) {
            this.f21604a = bitmap;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnythinkNativeEndCardView anythinkNativeEndCardView = AnythinkNativeEndCardView.this;
            anythinkNativeEndCardView.f21590W = anythinkNativeEndCardView.blurBitmap(this.f21604a);
            if (AnythinkNativeEndCardView.this.f21590W == null || AnythinkNativeEndCardView.this.f21590W.isRecycled() || AnythinkNativeEndCardView.this.f21595v == null) {
                return;
            }
            AnythinkNativeEndCardView.this.f21595v.post(new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkNativeEndCardView.13.1
                @Override // java.lang.Runnable
                public final void run() {
                    AnythinkNativeEndCardView anythinkNativeEndCardView2 = AnythinkNativeEndCardView.this;
                    if (anythinkNativeEndCardView2.i) {
                        anythinkNativeEndCardView2.f21595v.setBackgroundDrawable(null);
                    }
                    AnythinkNativeEndCardView.this.f21595v.setImageBitmap(AnythinkNativeEndCardView.this.f21590W);
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
            AnythinkNativeEndCardView.this.f21583P = true;
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void b() {
            AnythinkNativeEndCardView.this.f21583P = false;
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void c() {
            AnythinkNativeEndCardView.this.f21583P = false;
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
        public AnonymousClass6(int i, int i6) {
            super(i, i6);
        }

        @Override // com.anythink.core.express.c.b
        public final void a() {
            if (!AnythinkNativeEndCardView.this.f21583P && AnythinkNativeEndCardView.this.f21582O && AnythinkNativeEndCardView.this.isShown()) {
                AnythinkNativeEndCardView anythinkNativeEndCardView = AnythinkNativeEndCardView.this;
                anythinkNativeEndCardView.f21447g = 0.0f;
                anythinkNativeEndCardView.f21448h = 0.0f;
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
        this.f21578K = false;
        this.f21579L = false;
        this.f21580M = 0;
        this.f21581N = false;
        this.f21582O = false;
        this.f21583P = false;
        this.f21589V = false;
        this.aa = 1;
        this.ak = 1;
        this.al = false;
    }

    private static void o() {
    }

    public static /* synthetic */ void r(AnythinkNativeEndCardView anythinkNativeEndCardView) {
        if (!com.anythink.expressad.foundation.f.b.a().b()) {
            FeedBackButton feedBackButton = anythinkNativeEndCardView.f21574F;
            if (feedBackButton != null) {
                feedBackButton.setVisibility(8);
                return;
            }
            return;
        }
        anythinkNativeEndCardView.f21442b.l(anythinkNativeEndCardView.af);
        com.anythink.expressad.foundation.f.b.a().a(h.g(new StringBuilder(), anythinkNativeEndCardView.af, "_2"), anythinkNativeEndCardView.new AnonymousClass4());
        com.anythink.expressad.foundation.f.b.a().a(h.g(new StringBuilder(), anythinkNativeEndCardView.af, "_2"), anythinkNativeEndCardView.f21442b);
        com.anythink.expressad.foundation.f.b.a().c(anythinkNativeEndCardView.af + "_1");
        com.anythink.expressad.foundation.f.b.a().a(h.g(new StringBuilder(), anythinkNativeEndCardView.af, "_2"), anythinkNativeEndCardView.f21574F);
        if (anythinkNativeEndCardView.f21574F != null) {
            com.anythink.expressad.foundation.f.b.a().a(h.g(new StringBuilder(), anythinkNativeEndCardView.af, "_2"), anythinkNativeEndCardView.f21574F);
        }
    }

    public Bitmap blurBitmap(Bitmap bitmap) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
            RenderScript create = RenderScript.create(this.f21441a.getApplicationContext());
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
        d dVar = this.f21442b;
        if (dVar == null || !dVar.j() || (eVar = this.ag) == null || (arrayList = eVar.f18680K) == null || arrayList.size() <= 0) {
            return;
        }
        Iterator<d> it = this.ag.f18680K.iterator();
        while (it.hasNext()) {
            d next = it.next();
            if (!TextUtils.isEmpty(next.bl())) {
                com.anythink.basead.exoplayer.f.f.l().c(next.bl());
            }
        }
    }

    public boolean ctaViewCanGet(View view, boolean z3) {
        try {
            View findViewById = view.findViewById(filterFindViewId(z3, "anythink_tv_cta"));
            if (findViewById instanceof TextView) {
                this.ad = (TextView) findViewById;
            }
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f17618a) {
                e9.printStackTrace();
            }
        }
        return this.ad != null;
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
    }

    public boolean isDyXmlSuccess() {
        return this.f21589V;
    }

    public void notifyShowListener() {
        this.f21445e.a(110, "");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int parseInt;
        int parseInt2;
        int i;
        AnythinkBaitClickView anythinkBaitClickView;
        super.onAttachedToWindow();
        if (this.f21575G == null) {
            this.f21575G = new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkNativeEndCardView.1
                @Override // java.lang.Runnable
                public final void run() {
                    AnythinkNativeEndCardView.a(AnythinkNativeEndCardView.this);
                    if (AnythinkNativeEndCardView.this.ac != null) {
                        AnythinkNativeEndCardView.this.ac.setVisibility(0);
                    }
                }
            };
        }
        Runnable runnable = this.f21575G;
        if (runnable != null) {
            postDelayed(runnable, this.f21580M * 1000);
            if (!this.f21582O) {
                this.f21582O = true;
            }
            try {
                d dVar = this.f21442b;
                if (dVar != null && dVar.j()) {
                    String J = this.f21442b.J();
                    if (TextUtils.isEmpty(J)) {
                        J = this.f21442b.Q();
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
            d dVar2 = this.f21442b;
            if (dVar2 != null && dVar2.j()) {
                String J2 = this.f21442b.J();
                if (TextUtils.isEmpty(J2)) {
                    J2 = this.f21442b.Q();
                }
                String a10 = z.a(J2, "bait_click");
                try {
                    i = Integer.parseInt(a10);
                } catch (Throwable th2) {
                    th2.getMessage();
                    i = 1;
                }
                if (!TextUtils.isEmpty(a10) && i != 0 && (anythinkBaitClickView = this.aj) != null) {
                    anythinkBaitClickView.setVisibility(0);
                    this.aj.init(1342177280, i);
                    if (this.f21442b.s() == 1302) {
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
            d dVar3 = this.f21442b;
            if (dVar3 != null && dVar3.j()) {
                String J8 = this.f21442b.J();
                if (TextUtils.isEmpty(J8)) {
                    J8 = this.f21442b.Q();
                }
                String a11 = z.a(J8, "shake_strength");
                String a12 = z.a(J8, "shake_time");
                if (!TextUtils.isEmpty("1") && this.ah == null) {
                    AnythinkBaitClickView anythinkBaitClickView2 = this.aj;
                    if (anythinkBaitClickView2 != null) {
                        anythinkBaitClickView2.setVisibility(8);
                    }
                    MBShakeView mBShakeView = new MBShakeView(getContext());
                    this.ah = mBShakeView;
                    mBShakeView.initView(this.f21442b.dj, true);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    if (isLandscape()) {
                        layoutParams.addRule(13);
                    } else {
                        layoutParams.addRule(2, filterFindViewId(this.f21589V, "anythink_iv_logo"));
                        layoutParams.addRule(14);
                        this.ah.setPadding(0, 0, 0, v.b(getContext(), 20.0f));
                    }
                    this.ah.setLayoutParams(layoutParams);
                    RelativeLayout relativeLayout = this.f21593t;
                    if (relativeLayout != null && relativeLayout.isShown()) {
                        if (this.ad != null) {
                            this.f21593t.addView(this.ah);
                        }
                        this.ad.setVisibility(4);
                        this.ah.setOnClickListener(new AnonymousClass5());
                        int i6 = 10;
                        if (!TextUtils.isEmpty(a11) && (parseInt2 = Integer.parseInt(a11)) >= 0) {
                            i6 = parseInt2;
                        }
                        int i9 = 5000;
                        if (!TextUtils.isEmpty(a12) && (parseInt = Integer.parseInt(a12)) > 0) {
                            i9 = parseInt * 1000;
                        }
                        this.ai = new AnonymousClass6(i6, i9);
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
        Runnable runnable = this.f21575G;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f21576H;
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
        d dVar = this.f21442b;
        if (dVar == null || !dVar.j()) {
            RelativeLayout relativeLayout = this.f21577I;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(4);
            }
            int i = configuration.orientation;
            this.f21444d = i;
            if (i == 2) {
                removeView(this.f21591r);
                a(this.f21592s);
            } else {
                removeView(this.f21592s);
                a(this.f21591r);
            }
        }
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z3) {
        super.onVisibilityAggregated(z3);
        if (!z3) {
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
    public void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        if (!z3) {
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
            if (this.f21442b == null || !this.f21446f) {
                return;
            }
            com.anythink.expressad.foundation.g.d.b.a(this.f21441a.getApplicationContext()).a(this.f21442b.bm(), new AnonymousClass11());
            com.anythink.expressad.foundation.g.d.b.a(this.f21441a.getApplicationContext()).a(this.f21442b.bl(), new j(this.f21597x, v.b(t.b().g(), 8.0f)));
            this.f21570B.setText(this.f21442b.bj());
            TextView textView = this.ad;
            if (textView != null) {
                textView.setText(this.f21442b.dj);
            }
            TextView textView2 = this.f21571C;
            if (textView2 != null) {
                textView2.setText(this.f21442b.bk());
            }
            TextView textView3 = this.f21572D;
            if (textView3 != null) {
                textView3.setText(this.f21442b.bg() + ")");
            }
            this.f21573E.removeAllViews();
            double bf = this.f21442b.bf();
            if (bf <= 0.0d) {
                bf = 5.0d;
            }
            LinearLayout linearLayout = this.f21573E;
            if (linearLayout instanceof StarLevelView) {
                ((StarLevelView) linearLayout).initScore(bf);
            }
            LinearLayout linearLayout2 = this.f21573E;
            if (linearLayout2 instanceof AnyThinkLevelLayoutView) {
                ((AnyThinkLevelLayoutView) linearLayout2).setRatingAndUser(bf, this.f21442b.bg());
            }
            if (!TextUtils.isEmpty(this.f21442b.J()) && this.f21442b.J().contains("alecfc=1")) {
                this.f21578K = true;
            }
            com.anythink.expressad.foundation.g.d.b.a(this.f21441a.getApplicationContext()).a(TextUtils.isEmpty(this.f21442b.aH()) ? com.anythink.expressad.a.ae : this.f21442b.aH(), new AnonymousClass12());
            v.a(this.f21599z, this.f21442b, this.f21441a, true);
            if (this.f21579L) {
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
            AlphaAnimation alphaAnimation = this.f21584Q;
            if (alphaAnimation != null) {
                alphaAnimation.cancel();
            }
            this.f21575G = null;
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    public void setCloseBtnDelay(int i) {
        this.f21580M = i;
    }

    public void setLayout() {
        if (!this.i) {
            f();
            return;
        }
        new com.anythink.expressad.video.dynview.j.c();
        com.anythink.expressad.video.dynview.c a9 = com.anythink.expressad.video.dynview.j.c.a(getContext(), this.f21442b, this.f21449j, "en_");
        this.aa = a9.m();
        com.anythink.expressad.video.dynview.b.a();
        com.anythink.expressad.video.dynview.b.a(a9, new AnonymousClass10());
    }

    public void setMoreOfferCampaignUnit(e eVar) {
        ArrayList<d> arrayList;
        MBShakeView mBShakeView;
        d dVar = this.f21442b;
        if (dVar == null || !dVar.j()) {
            return;
        }
        this.ag = eVar;
        if (eVar == null || (arrayList = eVar.f18680K) == null || arrayList.size() <= 5 || (mBShakeView = this.ah) == null) {
            return;
        }
        mBShakeView.setPadding(0, 0, 0, v.b(getContext(), 5.0f));
    }

    public void setNotchPadding(int i, int i6, int i9, int i10) {
        String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i), Integer.valueOf(i6), Integer.valueOf(i9), Integer.valueOf(i10));
        this.f21585R = i;
        this.f21586S = i6;
        this.f21587T = i9;
        this.f21588U = i10;
        j();
    }

    public void setOnPause() {
        this.f21582O = false;
    }

    public void setOnResume() {
        this.f21582O = true;
    }

    public void setUnitId(String str) {
        this.af = str;
    }

    public static /* synthetic */ boolean a(AnythinkNativeEndCardView anythinkNativeEndCardView) {
        anythinkNativeEndCardView.f21579L = true;
        return true;
    }

    private void e() {
        new com.anythink.expressad.video.dynview.j.c();
        com.anythink.expressad.video.dynview.c a9 = com.anythink.expressad.video.dynview.j.c.a(getContext(), this.f21442b, this.f21449j, "en_");
        this.aa = a9.m();
        com.anythink.expressad.video.dynview.b.a();
        com.anythink.expressad.video.dynview.b.a(a9, new AnonymousClass10());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        int i = i();
        if (i > 0) {
            this.f21446f = b(i);
            g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        com.anythink.expressad.video.module.a.a aVar;
        c();
        if (!this.f21446f && (aVar = this.f21445e) != null) {
            aVar.a(104, "");
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 100.0f);
        this.f21584Q = alphaAnimation;
        alphaAnimation.setDuration(200L);
    }

    private void h() {
        com.anythink.expressad.foundation.g.d.b.a(this.f21441a.getApplicationContext()).a(this.f21442b.bm(), new AnonymousClass11());
        com.anythink.expressad.foundation.g.d.b.a(this.f21441a.getApplicationContext()).a(this.f21442b.bl(), new j(this.f21597x, com.anythink.basead.exoplayer.f.f.e(8.0f)));
        this.f21570B.setText(this.f21442b.bj());
        TextView textView = this.ad;
        if (textView != null) {
            textView.setText(this.f21442b.dj);
        }
        TextView textView2 = this.f21571C;
        if (textView2 != null) {
            textView2.setText(this.f21442b.bk());
        }
        TextView textView3 = this.f21572D;
        if (textView3 != null) {
            textView3.setText(this.f21442b.bg() + ")");
        }
        this.f21573E.removeAllViews();
        double bf = this.f21442b.bf();
        if (bf <= 0.0d) {
            bf = 5.0d;
        }
        LinearLayout linearLayout = this.f21573E;
        if (linearLayout instanceof StarLevelView) {
            ((StarLevelView) linearLayout).initScore(bf);
        }
        LinearLayout linearLayout2 = this.f21573E;
        if (linearLayout2 instanceof AnyThinkLevelLayoutView) {
            ((AnyThinkLevelLayoutView) linearLayout2).setRatingAndUser(bf, this.f21442b.bg());
        }
        if (!TextUtils.isEmpty(this.f21442b.J()) && this.f21442b.J().contains("alecfc=1")) {
            this.f21578K = true;
        }
        com.anythink.expressad.foundation.g.d.b.a(this.f21441a.getApplicationContext()).a(TextUtils.isEmpty(this.f21442b.aH()) ? com.anythink.expressad.a.ae : this.f21442b.aH(), new AnonymousClass12());
        v.a(this.f21599z, this.f21442b, this.f21441a, true);
        if (this.f21579L) {
            return;
        }
        this.ac.setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        r1 = com.anythink.expressad.video.module.AnythinkNativeEndCardView.f21568q;
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
        String str = f21566o;
        String str2 = f21565n;
        if (i == 0) {
            if (this.ae) {
                str2 = f21567p;
            }
            if (isLandscape()) {
            }
        } else {
            if (i != 1) {
                str2 = "";
            } else if (this.ae) {
                str2 = f21567p;
            }
            if (i == 2) {
            }
        }
        return findLayout(str2);
    }

    private void j() {
        RelativeLayout relativeLayout;
        if (!this.f21446f || (relativeLayout = this.f21577I) == null) {
            return;
        }
        relativeLayout.postDelayed(new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkNativeEndCardView.3
            @Override // java.lang.Runnable
            public final void run() {
                d dVar = AnythinkNativeEndCardView.this.f21442b;
                if (dVar != null && !dVar.j() && AnythinkNativeEndCardView.this.f21442b.e() != 2) {
                    AnythinkNativeEndCardView.this.f21577I.setPadding(AnythinkNativeEndCardView.this.f21585R, AnythinkNativeEndCardView.this.f21587T, AnythinkNativeEndCardView.this.f21586S, AnythinkNativeEndCardView.this.f21588U);
                    AnythinkNativeEndCardView.this.f21577I.startAnimation(AnythinkNativeEndCardView.this.f21584Q);
                }
                AnythinkNativeEndCardView.this.f21577I.setVisibility(0);
                if (AnythinkNativeEndCardView.this.ac.getVisibility() != 0 && AnythinkNativeEndCardView.this.f21579L) {
                    AnythinkNativeEndCardView.this.ac.setVisibility(0);
                }
                AnythinkNativeEndCardView.r(AnythinkNativeEndCardView.this);
            }
        }, 200L);
    }

    private void k() {
        if (!com.anythink.expressad.foundation.f.b.a().b()) {
            FeedBackButton feedBackButton = this.f21574F;
            if (feedBackButton != null) {
                feedBackButton.setVisibility(8);
                return;
            }
            return;
        }
        this.f21442b.l(this.af);
        com.anythink.expressad.foundation.f.b.a().a(h.g(new StringBuilder(), this.af, "_2"), new AnonymousClass4());
        com.anythink.expressad.foundation.f.b.a().a(h.g(new StringBuilder(), this.af, "_2"), this.f21442b);
        com.anythink.expressad.foundation.f.b.a().c(this.af + "_1");
        com.anythink.expressad.foundation.f.b.a().a(h.g(new StringBuilder(), this.af, "_2"), this.f21574F);
        if (this.f21574F != null) {
            com.anythink.expressad.foundation.f.b.a().a(h.g(new StringBuilder(), this.af, "_2"), this.f21574F);
        }
    }

    private void l() {
        int parseInt;
        int parseInt2;
        try {
            d dVar = this.f21442b;
            if (dVar != null && dVar.j()) {
                String J = this.f21442b.J();
                if (TextUtils.isEmpty(J)) {
                    J = this.f21442b.Q();
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
                    mBShakeView.initView(this.f21442b.dj, true);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    if (isLandscape()) {
                        layoutParams.addRule(13);
                    } else {
                        layoutParams.addRule(2, filterFindViewId(this.f21589V, "anythink_iv_logo"));
                        layoutParams.addRule(14);
                        this.ah.setPadding(0, 0, 0, v.b(getContext(), 20.0f));
                    }
                    this.ah.setLayoutParams(layoutParams);
                    RelativeLayout relativeLayout = this.f21593t;
                    if (relativeLayout != null && relativeLayout.isShown()) {
                        if (this.ad != null) {
                            this.f21593t.addView(this.ah);
                        }
                        this.ad.setVisibility(4);
                        this.ah.setOnClickListener(new AnonymousClass5());
                        int i = 10;
                        if (!TextUtils.isEmpty(a9) && (parseInt2 = Integer.parseInt(a9)) >= 0) {
                            i = parseInt2;
                        }
                        int i6 = 5000;
                        if (!TextUtils.isEmpty(a10) && (parseInt = Integer.parseInt(a10)) > 0) {
                            i6 = parseInt * 1000;
                        }
                        this.ai = new AnonymousClass6(i, i6);
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
            d dVar = this.f21442b;
            if (dVar != null && dVar.j()) {
                String J = this.f21442b.J();
                if (TextUtils.isEmpty(J)) {
                    J = this.f21442b.Q();
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
                if (this.f21442b.s() == 1302) {
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
            d dVar = this.f21442b;
            if (dVar != null && dVar.j()) {
                String J = this.f21442b.J();
                if (TextUtils.isEmpty(J)) {
                    J = this.f21442b.Q();
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
                    AnythinkNativeEndCardView.this.f21445e.a(104, "");
                }
            });
        }
        if (this.f21446f) {
            this.f21593t.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkNativeEndCardView.15
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    if (AnythinkNativeEndCardView.this.f21578K) {
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
            this.f21597x.setOnClickListener(new com.anythink.expressad.widget.a() { // from class: com.anythink.expressad.video.module.AnythinkNativeEndCardView.17
                @Override // com.anythink.expressad.widget.a
                public final void a(View view2) {
                    AnythinkNativeEndCardView.a(AnythinkNativeEndCardView.this, 0);
                }
            });
            this.f21596w.setOnClickListener(new com.anythink.expressad.widget.a() { // from class: com.anythink.expressad.video.module.AnythinkNativeEndCardView.2
                @Override // com.anythink.expressad.widget.a
                public final void a(View view2) {
                    AnythinkNativeEndCardView.a(AnythinkNativeEndCardView.this, 0);
                }
            });
        }
    }

    private boolean b(int i) {
        if (isLandscape()) {
            ViewGroup viewGroup = (ViewGroup) this.f21443c.inflate(i, (ViewGroup) null);
            this.f21592s = viewGroup;
            addView(viewGroup);
            return b(this.f21592s);
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f21443c.inflate(i, (ViewGroup) null);
        this.f21591r = viewGroup2;
        addView(viewGroup2);
        return b(this.f21591r);
    }

    private void a(Bitmap bitmap) {
        try {
            com.anythink.expressad.foundation.g.i.a.b().execute(new AnonymousClass13(bitmap));
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    /* renamed from: com.anythink.expressad.video.module.AnythinkNativeEndCardView$10, reason: invalid class name */
    public class AnonymousClass10 implements com.anythink.expressad.video.dynview.f.h {
        public AnonymousClass10() {
        }

        @Override // com.anythink.expressad.video.dynview.f.h
        public final void a(com.anythink.expressad.video.dynview.a aVar) {
            AnythinkNativeEndCardView.this.addView(aVar.a());
            AnythinkNativeEndCardView.this.f21589V = aVar.c();
            if (AnythinkNativeEndCardView.this.ctaViewCanGet(aVar.a(), AnythinkNativeEndCardView.this.f21589V)) {
                AnythinkNativeEndCardView anythinkNativeEndCardView = AnythinkNativeEndCardView.this;
                anythinkNativeEndCardView.f21446f = anythinkNativeEndCardView.b(aVar.a());
                AnythinkNativeEndCardView.this.g();
            } else {
                AnythinkNativeEndCardView.this.f21589V = false;
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
            this.f21593t = (RelativeLayout) view.findViewById(filterFindViewId(this.f21589V, "anythink_native_ec_layout"));
            this.f21594u = (RelativeLayout) view.findViewById(filterFindViewId(this.f21589V, "anythink_native_ec_layer_layout"));
            this.f21596w = (ImageView) view.findViewById(filterFindViewId(this.f21589V, "anythink_iv_adbanner"));
            this.f21597x = (ImageView) view.findViewById(filterFindViewId(this.f21589V, "anythink_iv_icon"));
            this.f21598y = (ImageView) view.findViewById(filterFindViewId(this.f21589V, "anythink_iv_flag"));
            this.f21569A = (ImageView) view.findViewById(filterFindViewId(this.f21589V, "anythink_iv_logo"));
            this.f21599z = (ImageView) view.findViewById(filterFindViewId(this.f21589V, "anythink_iv_link"));
            this.f21570B = (TextView) view.findViewById(filterFindViewId(this.f21589V, "anythink_tv_apptitle"));
            this.f21573E = (LinearLayout) view.findViewById(filterFindViewId(this.f21589V, "anythink_sv_starlevel"));
            this.ac = view.findViewById(filterFindViewId(this.f21589V, "anythink_iv_close"));
            View findViewById = view.findViewById(filterFindViewId(this.f21589V, "anythink_tv_cta"));
            if (findViewById != null && (findViewById instanceof TextView)) {
                this.ad = (TextView) findViewById;
            }
            this.f21574F = (FeedBackButton) view.findViewById(filterFindViewId(this.f21589V, "anythink_native_endcard_feed_btn"));
            this.f21577I = (RelativeLayout) view.findViewById(filterFindViewId(this.f21589V, "anythink_native_ec_controller"));
            this.f21595v = (ImageView) view.findViewById(filterFindViewId(this.f21589V, "anythink_iv_adbanner_bg"));
            this.aj = (AnythinkBaitClickView) findViewById(filterFindViewId(this.f21589V, "anythink_animation_click_view"));
            this.f21571C = (TextView) view.findViewById(filterFindViewId(this.f21589V, "anythink_tv_appdesc"));
            if (!this.i) {
                this.f21571C = (TextView) view.findViewById(filterFindViewId(this.f21589V, "anythink_tv_appdesc"));
                TextView textView = (TextView) view.findViewById(filterFindViewId(this.f21589V, "anythink_tv_number"));
                this.f21572D = textView;
                return isNotNULL(this.f21596w, this.f21597x, this.f21570B, this.f21571C, textView, this.f21573E, this.ac, this.ad);
            }
            ImageView imageView = this.f21596w;
            if (imageView != null && (imageView instanceof RoundImageView)) {
                ((RoundImageView) imageView).setBorderRadius(10);
            }
            ImageView imageView2 = this.f21597x;
            if (imageView2 != null && (imageView2 instanceof RoundImageView)) {
                ((RoundImageView) imageView2).setBorderRadius(10);
            }
            return isNotNULL(this.f21596w, this.f21597x, this.f21570B, this.f21573E, this.ac);
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
            if (this.f21442b.k() == 5) {
                jSONObject.put("camp_position", 0);
            }
        } catch (JSONException e10) {
            e = e10;
            jSONObject2 = jSONObject;
            e.printStackTrace();
            jSONObject = jSONObject2;
            this.f21445e.a(105, jSONObject);
        }
        this.f21445e.a(105, jSONObject);
    }

    public AnythinkNativeEndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21578K = false;
        this.f21579L = false;
        this.f21580M = 0;
        this.f21581N = false;
        this.f21582O = false;
        this.f21583P = false;
        this.f21589V = false;
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
            if (anythinkNativeEndCardView.f21442b.k() == 5) {
                jSONObject.put("camp_position", 0);
            }
        } catch (JSONException e10) {
            e = e10;
            jSONObject2 = jSONObject;
            e.printStackTrace();
            jSONObject = jSONObject2;
            anythinkNativeEndCardView.f21445e.a(105, jSONObject);
        }
        anythinkNativeEndCardView.f21445e.a(105, jSONObject);
    }

    public AnythinkNativeEndCardView(Context context, AttributeSet attributeSet, boolean z3, int i, boolean z6, int i6, int i9) {
        super(context, attributeSet, z3, i, z6, i6, i9);
        this.f21578K = false;
        this.f21579L = false;
        this.f21580M = 0;
        this.f21581N = false;
        this.f21582O = false;
        this.f21583P = false;
        this.f21589V = false;
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
