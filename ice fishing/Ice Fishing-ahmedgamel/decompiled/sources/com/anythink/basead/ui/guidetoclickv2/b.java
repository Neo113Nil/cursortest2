package com.anythink.basead.ui.guidetoclickv2;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import com.anythink.basead.exoplayer.f;
import com.anythink.basead.ui.GuideToClickView;
import com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View;
import com.anythink.basead.ui.guidetoclickv2.a;
import com.anythink.basead.ui.improveclick.c;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.u.e;
import com.anythink.core.common.v.am;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    Context f11018a;

    /* renamed from: b, reason: collision with root package name */
    RelativeLayout f11019b;

    /* renamed from: c, reason: collision with root package name */
    View f11020c;

    /* renamed from: d, reason: collision with root package name */
    Runnable f11021d;

    /* renamed from: e, reason: collision with root package name */
    private w f11022e;

    /* renamed from: f, reason: collision with root package name */
    private x f11023f;

    /* renamed from: g, reason: collision with root package name */
    private int f11024g;

    /* renamed from: h, reason: collision with root package name */
    private int f11025h;
    private BaseG2CV2View.b i;

    /* renamed from: j, reason: collision with root package name */
    private BaseG2CV2View f11026j;

    /* renamed from: k, reason: collision with root package name */
    private long f11027k;

    /* renamed from: l, reason: collision with root package name */
    private long f11028l;

    /* renamed from: m, reason: collision with root package name */
    private long f11029m;

    /* renamed from: n, reason: collision with root package name */
    private String f11030n;

    /* renamed from: o, reason: collision with root package name */
    private int f11031o;

    /* renamed from: p, reason: collision with root package name */
    private c.a f11032p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f11033q = false;

    /* renamed from: r, reason: collision with root package name */
    private int f11034r;

    /* renamed from: s, reason: collision with root package name */
    private long f11035s;

    /* renamed from: t, reason: collision with root package name */
    private long f11036t;

    /* renamed from: com.anythink.basead.ui.guidetoclickv2.b$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ BaseG2CV2View f11039a;

        public AnonymousClass2(BaseG2CV2View baseG2CV2View) {
            this.f11039a = baseG2CV2View;
        }

        @Override // java.lang.Runnable
        public final void run() {
            RelativeLayout relativeLayout = b.this.f11019b;
            if (relativeLayout == null || relativeLayout.getMeasuredHeight() <= q.a(b.this.f11018a, 90.0f)) {
                return;
            }
            ((FingerG2CV2View) this.f11039a).setFingerViewMode(GuideToClickView.a.f10086f);
        }
    }

    /* renamed from: com.anythink.basead.ui.guidetoclickv2.b$4, reason: invalid class name */
    public class AnonymousClass4 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f11043a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f11044b;

        public AnonymousClass4(int i, View view) {
            this.f11043a = i;
            this.f11044b = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f11043a != 11) {
                RelativeLayout relativeLayout = b.this.f11019b;
                if (relativeLayout != null && ((relativeLayout.getMeasuredHeight() < 100 || b.this.f11019b.getMeasuredWidth() < 200) && b.this.i != null)) {
                    b.this.i.b();
                    return;
                }
            } else {
                RelativeLayout relativeLayout2 = b.this.f11019b;
                if (relativeLayout2 != null && ((relativeLayout2.getMeasuredHeight() < q.a(b.this.f11019b.getContext(), a.C0060a.f11016a) || b.this.f11019b.getMeasuredWidth() < q.a(b.this.f11019b.getContext(), a.C0060a.f11017b)) && b.this.i != null)) {
                    b.this.i.b();
                    return;
                }
            }
            this.f11044b.setVisibility(0);
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f11046a;

        /* renamed from: b, reason: collision with root package name */
        public int f11047b;

        /* renamed from: c, reason: collision with root package name */
        public long f11048c;

        /* renamed from: d, reason: collision with root package name */
        public long f11049d;

        /* renamed from: e, reason: collision with root package name */
        private String f11050e;

        /* renamed from: f, reason: collision with root package name */
        private int f11051f;

        public a(int i, int i6, long j6, long j9, String str, int i9) {
            this.f11046a = i;
            this.f11047b = i6;
            this.f11048c = j6;
            this.f11049d = j9;
            this.f11050e = str;
            this.f11051f = i9;
        }
    }

    public b(Context context, w wVar, x xVar, final int i, a aVar, RelativeLayout relativeLayout, View view, c.a aVar2, BaseG2CV2View.b bVar) {
        this.f11028l = 0L;
        this.f11029m = f.f7187a;
        this.f11030n = "";
        this.f11031o = 1;
        this.f11018a = context;
        this.f11022e = wVar;
        this.f11023f = xVar;
        this.f11019b = relativeLayout;
        this.f11020c = view;
        this.f11024g = i;
        this.f11032p = aVar2;
        this.i = bVar;
        this.f11025h = aVar.f11047b;
        this.f11029m = aVar.f11048c;
        this.f11028l = aVar.f11049d;
        this.f11030n = aVar.f11050e;
        this.f11031o = aVar.f11051f;
        this.f11034r = aVar.f11046a;
        this.f11021d = new Runnable() { // from class: com.anythink.basead.ui.guidetoclickv2.b.1
            @Override // java.lang.Runnable
            public final void run() {
                if (b.this.f11026j == null) {
                    b bVar2 = b.this;
                    bVar2.f11026j = b.a(bVar2, bVar2.f11025h);
                    if (b.this.f11026j != null) {
                        b.this.f11035s = System.currentTimeMillis();
                        b.this.f11026j.init(b.this.f11029m, i, b.this.f11031o, b.this.f11032p, b.this.i);
                        b bVar3 = b.this;
                        RelativeLayout relativeLayout2 = bVar3.f11019b;
                        if (relativeLayout2 != null) {
                            relativeLayout2.addView(bVar3.f11026j);
                        }
                        b bVar4 = b.this;
                        int i6 = bVar4.f11025h;
                        if (i6 == 3 || i6 == 4 || i6 == 6 || i6 == 13) {
                            View view2 = bVar4.f11020c;
                            if (view2 != null) {
                                if (i6 == 13) {
                                    view2.setBackgroundResource(q.a(bVar4.f11018a, "myoffer_mask_half_shadow_bg", k.f19632c));
                                }
                                bVar4.f11020c.setVisibility(0);
                            }
                        } else {
                            View view3 = bVar4.f11020c;
                            if (view3 != null) {
                                view3.setVisibility(8);
                            }
                        }
                    }
                }
                b.this.f11026j.resumeAnimPlay();
            }
        };
    }

    private void d() {
        if (this.f11035s > 0) {
            x xVar = this.f11023f;
            w wVar = this.f11022e;
            e.a(xVar, wVar, com.anythink.basead.b.e.a(wVar, xVar), this.f11034r, this.f11025h, this.f11035s, this.f11036t);
        }
    }

    public final void b() {
        if (this.f11033q) {
            this.f11033q = false;
            long j6 = this.f11028l;
            if (j6 > 0) {
                this.f11028l = Math.max(j6 - (SystemClock.elapsedRealtime() - this.f11027k), 0L);
            }
            t.b().d(this.f11021d);
            BaseG2CV2View baseG2CV2View = this.f11026j;
            if (baseG2CV2View != null) {
                baseG2CV2View.pauseAnimPlay();
            }
        }
    }

    public final void c() {
        long currentTimeMillis = System.currentTimeMillis();
        long j6 = this.f11035s;
        this.f11036t = currentTimeMillis - j6;
        if (j6 > 0) {
            x xVar = this.f11023f;
            w wVar = this.f11022e;
            e.a(xVar, wVar, com.anythink.basead.b.e.a(wVar, xVar), this.f11034r, this.f11025h, this.f11035s, this.f11036t);
        }
        t.b().d(this.f11021d);
        BaseG2CV2View baseG2CV2View = this.f11026j;
        if (baseG2CV2View != null) {
            baseG2CV2View.release();
            am.a(this.f11026j);
        }
        View view = this.f11020c;
        if (view != null) {
            view.setBackgroundColor(Color.parseColor("#80000000"));
            this.f11020c.setVisibility(8);
        }
    }

    public final void a() {
        if (this.f11033q) {
            return;
        }
        this.f11033q = true;
        this.f11027k = SystemClock.elapsedRealtime();
        t.b().a(this.f11021d, this.f11028l);
    }

    private void a(int i) {
        if (i != 3 && i != 4 && i != 6 && i != 13) {
            View view = this.f11020c;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        View view2 = this.f11020c;
        if (view2 != null) {
            if (i == 13) {
                view2.setBackgroundResource(q.a(this.f11018a, "myoffer_mask_half_shadow_bg", k.f19632c));
            }
            this.f11020c.setVisibility(0);
        }
    }

    private BaseG2CV2View b(int i) {
        String str;
        BaseG2CV2View baseG2CV2View;
        BaseG2CV2View baseG2CV2View2;
        int i6 = 502;
        switch (i) {
            case 1:
                GestureG2CV2View gestureG2CV2View = new GestureG2CV2View(this.f11018a);
                gestureG2CV2View.setLayoutParams(c(i));
                gestureG2CV2View.setVerticalLandscape(this.f11020c == null);
                baseG2CV2View2 = gestureG2CV2View;
                break;
            case 2:
                PicVerifyG2CV2View picVerifyG2CV2View = new PicVerifyG2CV2View(this.f11018a);
                picVerifyG2CV2View.loadImage(this.f11022e.B());
                picVerifyG2CV2View.setLayoutParams(c(i));
                baseG2CV2View2 = picVerifyG2CV2View;
                break;
            case 3:
                QuestionDialogG2CV2View questionDialogG2CV2View = new QuestionDialogG2CV2View(this.f11018a);
                questionDialogG2CV2View.setLayoutParams(c(i));
                if (!TextUtils.isEmpty(this.f11022e.x())) {
                    str = this.f11022e.x();
                } else if (!TextUtils.isEmpty(this.f11022e.y())) {
                    str = this.f11022e.y();
                } else {
                    str = "";
                }
                questionDialogG2CV2View.setQuestionAnswer(str, this.f11030n);
                baseG2CV2View2 = questionDialogG2CV2View;
                break;
            case 4:
                BaseG2CV2View hintTextG2CV2View = new HintTextG2CV2View(this.f11018a);
                hintTextG2CV2View.setLayoutParams(c(i));
                baseG2CV2View2 = hintTextG2CV2View;
                break;
            case 5:
                BaseG2CV2View jumpConfirmG2CV2View = new JumpConfirmG2CV2View(this.f11018a);
                jumpConfirmG2CV2View.setLayoutParams(c(i));
                baseG2CV2View2 = jumpConfirmG2CV2View;
                break;
            case 6:
                FingerG2CV2View fingerG2CV2View = new FingerG2CV2View(this.f11018a);
                switch (this.f11024g) {
                    case 1:
                    default:
                        i6 = 501;
                        break;
                    case 2:
                        if (this.f11020c == null) {
                            i6 = GuideToClickView.a.f10083c;
                            break;
                        }
                        break;
                    case 3:
                        i6 = 507;
                        break;
                    case 4:
                        this.f11019b.post(new AnonymousClass2(fingerG2CV2View));
                        i6 = 505;
                        break;
                    case 5:
                    case 6:
                        i6 = 504;
                        break;
                }
                fingerG2CV2View.setFingerViewMode(i6);
                fingerG2CV2View.setLayoutParams(c(i));
                baseG2CV2View = fingerG2CV2View;
                baseG2CV2View2 = baseG2CV2View;
                break;
            case 7:
                FullOrientationG2CV2View fullOrientationG2CV2View = new FullOrientationG2CV2View(this.f11018a);
                switch (this.f11024g) {
                    case 1:
                    default:
                        i6 = 501;
                        break;
                    case 2:
                        break;
                    case 3:
                        i6 = 507;
                        break;
                    case 4:
                        a(fullOrientationG2CV2View);
                        i6 = 505;
                        break;
                    case 5:
                    case 6:
                        a(fullOrientationG2CV2View);
                        i6 = 504;
                        break;
                }
                fullOrientationG2CV2View.setViewMode(i6);
                fullOrientationG2CV2View.setLayoutParams(c(i));
                baseG2CV2View = fullOrientationG2CV2View;
                baseG2CV2View2 = baseG2CV2View;
                break;
            case 8:
                BaseG2CV2View luckyBagG2CV2View = new LuckyBagG2CV2View(this.f11018a);
                luckyBagG2CV2View.setLayoutParams(c(i));
                baseG2CV2View2 = luckyBagG2CV2View;
                break;
            case 9:
                BaseG2CV2View chopOnceG2CV2View = new ChopOnceG2CV2View(this.f11018a);
                chopOnceG2CV2View.setLayoutParams(c(i));
                baseG2CV2View2 = chopOnceG2CV2View;
                break;
            case 10:
                BaseG2CV2View puzzleV2G2CV2View = new PuzzleV2G2CV2View(this.f11018a);
                puzzleV2G2CV2View.setLayoutParams(c(i));
                baseG2CV2View2 = puzzleV2G2CV2View;
                break;
            case 11:
                BaseG2CV2View gestureNewG2CV2View = new GestureNewG2CV2View(this.f11018a);
                gestureNewG2CV2View.setLayoutParams(c(i));
                baseG2CV2View2 = gestureNewG2CV2View;
                break;
            case 12:
                BaseG2CV2View fingerNewG2CV2View = new FingerNewG2CV2View(this.f11018a);
                fingerNewG2CV2View.setLayoutParams(c(i));
                baseG2CV2View2 = fingerNewG2CV2View;
                break;
            case 13:
                FingerSlideUpG2CV2View fingerSlideUpG2CV2View = new FingerSlideUpG2CV2View(this.f11018a);
                fingerSlideUpG2CV2View.setLayoutParams(c(i));
                baseG2CV2View2 = fingerSlideUpG2CV2View;
                if (this.f11024g == 2) {
                    baseG2CV2View2 = fingerSlideUpG2CV2View;
                    if (!com.anythink.basead.b.e.a(this.f11022e)) {
                        fingerSlideUpG2CV2View.updateIsEmptyHalfInterLayout();
                        baseG2CV2View2 = fingerSlideUpG2CV2View;
                        break;
                    }
                }
                break;
            default:
                baseG2CV2View2 = null;
                break;
        }
        int i9 = this.f11024g;
        if (i9 != 5 && i9 != 6) {
            return baseG2CV2View2;
        }
        baseG2CV2View2.setVisibility(4);
        this.f11019b.post(new AnonymousClass4(i, baseG2CV2View2));
        return baseG2CV2View2;
    }

    private void a(final FullOrientationG2CV2View fullOrientationG2CV2View) {
        this.f11019b.post(new Runnable() { // from class: com.anythink.basead.ui.guidetoclickv2.b.3
            @Override // java.lang.Runnable
            public final void run() {
                b bVar = b.this;
                if (bVar.f11019b != null) {
                    int a9 = q.a(bVar.f11018a, 120.0f);
                    int min = Math.min(b.this.f11019b.getMeasuredWidth(), b.this.f11019b.getMeasuredHeight());
                    if (min < a9) {
                        fullOrientationG2CV2View.updateSize(min);
                        b.this.f11020c.setVisibility(0);
                    }
                }
            }
        });
    }

    private RelativeLayout.LayoutParams c(int i) {
        if (i != 13) {
            switch (i) {
                case 1:
                    return new RelativeLayout.LayoutParams(-1, -1);
                case 2:
                    return new RelativeLayout.LayoutParams(-1, -1);
                case 3:
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams.addRule(13);
                    return layoutParams;
                case 4:
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                    if (this.f11024g != 2 && this.f11031o == 1) {
                        layoutParams2.setMargins(0, 0, 0, q.a(this.f11019b.getContext(), 290.0f));
                        layoutParams2.addRule(12);
                        return layoutParams2;
                    }
                    layoutParams2.addRule(13);
                    return layoutParams2;
                case 5:
                    if (this.f11024g == 2) {
                        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, q.a(this.f11019b.getContext(), 48.0f));
                        layoutParams3.setMargins(q.a(this.f11019b.getContext(), 36.0f), 0, q.a(this.f11019b.getContext(), 36.0f), 0);
                        layoutParams3.addRule(13);
                        return layoutParams3;
                    }
                    RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(q.a(this.f11019b.getContext(), 300.0f), q.a(this.f11019b.getContext(), 48.0f));
                    if (this.f11031o == 2) {
                        layoutParams4.setMargins(0, 0, q.a(this.f11019b.getContext(), 24.0f), q.a(this.f11019b.getContext(), 96.0f));
                        layoutParams4.addRule(11);
                        layoutParams4.addRule(12);
                        return layoutParams4;
                    }
                    layoutParams4.setMargins(0, 0, 0, q.a(this.f11019b.getContext(), 290.0f));
                    layoutParams4.addRule(14);
                    layoutParams4.addRule(12);
                    return layoutParams4;
                case 6:
                    return new RelativeLayout.LayoutParams(-1, -1);
                case 7:
                    return new RelativeLayout.LayoutParams(-1, -1);
                case 8:
                case 9:
                case 10:
                    return new RelativeLayout.LayoutParams(-1, -1);
                default:
                    return new RelativeLayout.LayoutParams(-2, -2);
            }
        }
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
        int i6 = this.f11024g;
        if (i6 == 3) {
            layoutParams5.addRule(12);
            return layoutParams5;
        }
        if (i6 == 2) {
            layoutParams5.addRule(12);
            return layoutParams5;
        }
        if (i6 == 1) {
            layoutParams5.addRule(12);
        }
        return layoutParams5;
    }

    private void a(int i, View view) {
        int i6 = this.f11024g;
        if (i6 == 5 || i6 == 6) {
            view.setVisibility(4);
            this.f11019b.post(new AnonymousClass4(i, view));
        }
    }

    public static /* synthetic */ BaseG2CV2View a(b bVar, int i) {
        String str;
        BaseG2CV2View baseG2CV2View;
        BaseG2CV2View baseG2CV2View2;
        int i6 = 502;
        switch (i) {
            case 1:
                GestureG2CV2View gestureG2CV2View = new GestureG2CV2View(bVar.f11018a);
                gestureG2CV2View.setLayoutParams(bVar.c(i));
                gestureG2CV2View.setVerticalLandscape(bVar.f11020c == null);
                baseG2CV2View2 = gestureG2CV2View;
                break;
            case 2:
                PicVerifyG2CV2View picVerifyG2CV2View = new PicVerifyG2CV2View(bVar.f11018a);
                picVerifyG2CV2View.loadImage(bVar.f11022e.B());
                picVerifyG2CV2View.setLayoutParams(bVar.c(i));
                baseG2CV2View2 = picVerifyG2CV2View;
                break;
            case 3:
                QuestionDialogG2CV2View questionDialogG2CV2View = new QuestionDialogG2CV2View(bVar.f11018a);
                questionDialogG2CV2View.setLayoutParams(bVar.c(i));
                if (!TextUtils.isEmpty(bVar.f11022e.x())) {
                    str = bVar.f11022e.x();
                } else if (!TextUtils.isEmpty(bVar.f11022e.y())) {
                    str = bVar.f11022e.y();
                } else {
                    str = "";
                }
                questionDialogG2CV2View.setQuestionAnswer(str, bVar.f11030n);
                baseG2CV2View2 = questionDialogG2CV2View;
                break;
            case 4:
                BaseG2CV2View hintTextG2CV2View = new HintTextG2CV2View(bVar.f11018a);
                hintTextG2CV2View.setLayoutParams(bVar.c(i));
                baseG2CV2View2 = hintTextG2CV2View;
                break;
            case 5:
                BaseG2CV2View jumpConfirmG2CV2View = new JumpConfirmG2CV2View(bVar.f11018a);
                jumpConfirmG2CV2View.setLayoutParams(bVar.c(i));
                baseG2CV2View2 = jumpConfirmG2CV2View;
                break;
            case 6:
                FingerG2CV2View fingerG2CV2View = new FingerG2CV2View(bVar.f11018a);
                switch (bVar.f11024g) {
                    case 1:
                    default:
                        i6 = 501;
                        break;
                    case 2:
                        if (bVar.f11020c == null) {
                            i6 = GuideToClickView.a.f10083c;
                            break;
                        }
                        break;
                    case 3:
                        i6 = 507;
                        break;
                    case 4:
                        bVar.f11019b.post(bVar.new AnonymousClass2(fingerG2CV2View));
                        i6 = 505;
                        break;
                    case 5:
                    case 6:
                        i6 = 504;
                        break;
                }
                fingerG2CV2View.setFingerViewMode(i6);
                fingerG2CV2View.setLayoutParams(bVar.c(i));
                baseG2CV2View = fingerG2CV2View;
                baseG2CV2View2 = baseG2CV2View;
                break;
            case 7:
                FullOrientationG2CV2View fullOrientationG2CV2View = new FullOrientationG2CV2View(bVar.f11018a);
                switch (bVar.f11024g) {
                    case 1:
                    default:
                        i6 = 501;
                        break;
                    case 2:
                        break;
                    case 3:
                        i6 = 507;
                        break;
                    case 4:
                        bVar.a(fullOrientationG2CV2View);
                        i6 = 505;
                        break;
                    case 5:
                    case 6:
                        bVar.a(fullOrientationG2CV2View);
                        i6 = 504;
                        break;
                }
                fullOrientationG2CV2View.setViewMode(i6);
                fullOrientationG2CV2View.setLayoutParams(bVar.c(i));
                baseG2CV2View = fullOrientationG2CV2View;
                baseG2CV2View2 = baseG2CV2View;
                break;
            case 8:
                BaseG2CV2View luckyBagG2CV2View = new LuckyBagG2CV2View(bVar.f11018a);
                luckyBagG2CV2View.setLayoutParams(bVar.c(i));
                baseG2CV2View2 = luckyBagG2CV2View;
                break;
            case 9:
                BaseG2CV2View chopOnceG2CV2View = new ChopOnceG2CV2View(bVar.f11018a);
                chopOnceG2CV2View.setLayoutParams(bVar.c(i));
                baseG2CV2View2 = chopOnceG2CV2View;
                break;
            case 10:
                BaseG2CV2View puzzleV2G2CV2View = new PuzzleV2G2CV2View(bVar.f11018a);
                puzzleV2G2CV2View.setLayoutParams(bVar.c(i));
                baseG2CV2View2 = puzzleV2G2CV2View;
                break;
            case 11:
                BaseG2CV2View gestureNewG2CV2View = new GestureNewG2CV2View(bVar.f11018a);
                gestureNewG2CV2View.setLayoutParams(bVar.c(i));
                baseG2CV2View2 = gestureNewG2CV2View;
                break;
            case 12:
                BaseG2CV2View fingerNewG2CV2View = new FingerNewG2CV2View(bVar.f11018a);
                fingerNewG2CV2View.setLayoutParams(bVar.c(i));
                baseG2CV2View2 = fingerNewG2CV2View;
                break;
            case 13:
                FingerSlideUpG2CV2View fingerSlideUpG2CV2View = new FingerSlideUpG2CV2View(bVar.f11018a);
                fingerSlideUpG2CV2View.setLayoutParams(bVar.c(i));
                baseG2CV2View2 = fingerSlideUpG2CV2View;
                if (bVar.f11024g == 2) {
                    baseG2CV2View2 = fingerSlideUpG2CV2View;
                    if (!com.anythink.basead.b.e.a(bVar.f11022e)) {
                        fingerSlideUpG2CV2View.updateIsEmptyHalfInterLayout();
                        baseG2CV2View2 = fingerSlideUpG2CV2View;
                        break;
                    }
                }
                break;
            default:
                baseG2CV2View2 = null;
                break;
        }
        int i9 = bVar.f11024g;
        if (i9 != 5 && i9 != 6) {
            return baseG2CV2View2;
        }
        baseG2CV2View2.setVisibility(4);
        bVar.f11019b.post(bVar.new AnonymousClass4(i, baseG2CV2View2));
        return baseG2CV2View2;
    }

    private static /* synthetic */ void b(b bVar, int i) {
        if (i != 3 && i != 4 && i != 6 && i != 13) {
            View view = bVar.f11020c;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        View view2 = bVar.f11020c;
        if (view2 != null) {
            if (i == 13) {
                view2.setBackgroundResource(q.a(bVar.f11018a, "myoffer_mask_half_shadow_bg", k.f19632c));
            }
            bVar.f11020c.setVisibility(0);
        }
    }
}
