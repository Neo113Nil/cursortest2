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
    Context f11804a;

    /* renamed from: b, reason: collision with root package name */
    RelativeLayout f11805b;

    /* renamed from: c, reason: collision with root package name */
    View f11806c;

    /* renamed from: d, reason: collision with root package name */
    Runnable f11807d;

    /* renamed from: e, reason: collision with root package name */
    private w f11808e;

    /* renamed from: f, reason: collision with root package name */
    private x f11809f;

    /* renamed from: g, reason: collision with root package name */
    private int f11810g;

    /* renamed from: h, reason: collision with root package name */
    private int f11811h;
    private BaseG2CV2View.b i;

    /* renamed from: j, reason: collision with root package name */
    private BaseG2CV2View f11812j;

    /* renamed from: k, reason: collision with root package name */
    private long f11813k;

    /* renamed from: l, reason: collision with root package name */
    private long f11814l;

    /* renamed from: m, reason: collision with root package name */
    private long f11815m;

    /* renamed from: n, reason: collision with root package name */
    private String f11816n;

    /* renamed from: o, reason: collision with root package name */
    private int f11817o;

    /* renamed from: p, reason: collision with root package name */
    private c.a f11818p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f11819q = false;

    /* renamed from: r, reason: collision with root package name */
    private int f11820r;

    /* renamed from: s, reason: collision with root package name */
    private long f11821s;

    /* renamed from: t, reason: collision with root package name */
    private long f11822t;

    /* renamed from: com.anythink.basead.ui.guidetoclickv2.b$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ BaseG2CV2View f11825a;

        public AnonymousClass2(BaseG2CV2View baseG2CV2View) {
            this.f11825a = baseG2CV2View;
        }

        @Override // java.lang.Runnable
        public final void run() {
            RelativeLayout relativeLayout = b.this.f11805b;
            if (relativeLayout == null || relativeLayout.getMeasuredHeight() <= q.a(b.this.f11804a, 90.0f)) {
                return;
            }
            ((FingerG2CV2View) this.f11825a).setFingerViewMode(GuideToClickView.a.f10872f);
        }
    }

    /* renamed from: com.anythink.basead.ui.guidetoclickv2.b$4, reason: invalid class name */
    public class AnonymousClass4 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f11829a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f11830b;

        public AnonymousClass4(int i, View view) {
            this.f11829a = i;
            this.f11830b = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f11829a != 11) {
                RelativeLayout relativeLayout = b.this.f11805b;
                if (relativeLayout != null && ((relativeLayout.getMeasuredHeight() < 100 || b.this.f11805b.getMeasuredWidth() < 200) && b.this.i != null)) {
                    b.this.i.b();
                    return;
                }
            } else {
                RelativeLayout relativeLayout2 = b.this.f11805b;
                if (relativeLayout2 != null && ((relativeLayout2.getMeasuredHeight() < q.a(b.this.f11805b.getContext(), a.C0060a.f11802a) || b.this.f11805b.getMeasuredWidth() < q.a(b.this.f11805b.getContext(), a.C0060a.f11803b)) && b.this.i != null)) {
                    b.this.i.b();
                    return;
                }
            }
            this.f11830b.setVisibility(0);
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f11832a;

        /* renamed from: b, reason: collision with root package name */
        public int f11833b;

        /* renamed from: c, reason: collision with root package name */
        public long f11834c;

        /* renamed from: d, reason: collision with root package name */
        public long f11835d;

        /* renamed from: e, reason: collision with root package name */
        private String f11836e;

        /* renamed from: f, reason: collision with root package name */
        private int f11837f;

        public a(int i, int i4, long j6, long j9, String str, int i6) {
            this.f11832a = i;
            this.f11833b = i4;
            this.f11834c = j6;
            this.f11835d = j9;
            this.f11836e = str;
            this.f11837f = i6;
        }
    }

    public b(Context context, w wVar, x xVar, final int i, a aVar, RelativeLayout relativeLayout, View view, c.a aVar2, BaseG2CV2View.b bVar) {
        this.f11814l = 0L;
        this.f11815m = f.f7973a;
        this.f11816n = "";
        this.f11817o = 1;
        this.f11804a = context;
        this.f11808e = wVar;
        this.f11809f = xVar;
        this.f11805b = relativeLayout;
        this.f11806c = view;
        this.f11810g = i;
        this.f11818p = aVar2;
        this.i = bVar;
        this.f11811h = aVar.f11833b;
        this.f11815m = aVar.f11834c;
        this.f11814l = aVar.f11835d;
        this.f11816n = aVar.f11836e;
        this.f11817o = aVar.f11837f;
        this.f11820r = aVar.f11832a;
        this.f11807d = new Runnable() { // from class: com.anythink.basead.ui.guidetoclickv2.b.1
            @Override // java.lang.Runnable
            public final void run() {
                if (b.this.f11812j == null) {
                    b bVar2 = b.this;
                    bVar2.f11812j = b.a(bVar2, bVar2.f11811h);
                    if (b.this.f11812j != null) {
                        b.this.f11821s = System.currentTimeMillis();
                        b.this.f11812j.init(b.this.f11815m, i, b.this.f11817o, b.this.f11818p, b.this.i);
                        b bVar3 = b.this;
                        RelativeLayout relativeLayout2 = bVar3.f11805b;
                        if (relativeLayout2 != null) {
                            relativeLayout2.addView(bVar3.f11812j);
                        }
                        b bVar4 = b.this;
                        int i4 = bVar4.f11811h;
                        if (i4 == 3 || i4 == 4 || i4 == 6 || i4 == 13) {
                            View view2 = bVar4.f11806c;
                            if (view2 != null) {
                                if (i4 == 13) {
                                    view2.setBackgroundResource(q.a(bVar4.f11804a, "myoffer_mask_half_shadow_bg", k.f20419c));
                                }
                                bVar4.f11806c.setVisibility(0);
                            }
                        } else {
                            View view3 = bVar4.f11806c;
                            if (view3 != null) {
                                view3.setVisibility(8);
                            }
                        }
                    }
                }
                b.this.f11812j.resumeAnimPlay();
            }
        };
    }

    private void d() {
        if (this.f11821s > 0) {
            x xVar = this.f11809f;
            w wVar = this.f11808e;
            e.a(xVar, wVar, com.anythink.basead.b.e.a(wVar, xVar), this.f11820r, this.f11811h, this.f11821s, this.f11822t);
        }
    }

    public final void b() {
        if (this.f11819q) {
            this.f11819q = false;
            long j6 = this.f11814l;
            if (j6 > 0) {
                this.f11814l = Math.max(j6 - (SystemClock.elapsedRealtime() - this.f11813k), 0L);
            }
            t.b().d(this.f11807d);
            BaseG2CV2View baseG2CV2View = this.f11812j;
            if (baseG2CV2View != null) {
                baseG2CV2View.pauseAnimPlay();
            }
        }
    }

    public final void c() {
        long currentTimeMillis = System.currentTimeMillis();
        long j6 = this.f11821s;
        this.f11822t = currentTimeMillis - j6;
        if (j6 > 0) {
            x xVar = this.f11809f;
            w wVar = this.f11808e;
            e.a(xVar, wVar, com.anythink.basead.b.e.a(wVar, xVar), this.f11820r, this.f11811h, this.f11821s, this.f11822t);
        }
        t.b().d(this.f11807d);
        BaseG2CV2View baseG2CV2View = this.f11812j;
        if (baseG2CV2View != null) {
            baseG2CV2View.release();
            am.a(this.f11812j);
        }
        View view = this.f11806c;
        if (view != null) {
            view.setBackgroundColor(Color.parseColor("#80000000"));
            this.f11806c.setVisibility(8);
        }
    }

    public final void a() {
        if (this.f11819q) {
            return;
        }
        this.f11819q = true;
        this.f11813k = SystemClock.elapsedRealtime();
        t.b().a(this.f11807d, this.f11814l);
    }

    private void a(int i) {
        if (i != 3 && i != 4 && i != 6 && i != 13) {
            View view = this.f11806c;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        View view2 = this.f11806c;
        if (view2 != null) {
            if (i == 13) {
                view2.setBackgroundResource(q.a(this.f11804a, "myoffer_mask_half_shadow_bg", k.f20419c));
            }
            this.f11806c.setVisibility(0);
        }
    }

    private BaseG2CV2View b(int i) {
        String str;
        BaseG2CV2View baseG2CV2View;
        BaseG2CV2View baseG2CV2View2;
        int i4 = 502;
        switch (i) {
            case 1:
                GestureG2CV2View gestureG2CV2View = new GestureG2CV2View(this.f11804a);
                gestureG2CV2View.setLayoutParams(c(i));
                gestureG2CV2View.setVerticalLandscape(this.f11806c == null);
                baseG2CV2View2 = gestureG2CV2View;
                break;
            case 2:
                PicVerifyG2CV2View picVerifyG2CV2View = new PicVerifyG2CV2View(this.f11804a);
                picVerifyG2CV2View.loadImage(this.f11808e.B());
                picVerifyG2CV2View.setLayoutParams(c(i));
                baseG2CV2View2 = picVerifyG2CV2View;
                break;
            case 3:
                QuestionDialogG2CV2View questionDialogG2CV2View = new QuestionDialogG2CV2View(this.f11804a);
                questionDialogG2CV2View.setLayoutParams(c(i));
                if (!TextUtils.isEmpty(this.f11808e.x())) {
                    str = this.f11808e.x();
                } else if (!TextUtils.isEmpty(this.f11808e.y())) {
                    str = this.f11808e.y();
                } else {
                    str = "";
                }
                questionDialogG2CV2View.setQuestionAnswer(str, this.f11816n);
                baseG2CV2View2 = questionDialogG2CV2View;
                break;
            case 4:
                BaseG2CV2View hintTextG2CV2View = new HintTextG2CV2View(this.f11804a);
                hintTextG2CV2View.setLayoutParams(c(i));
                baseG2CV2View2 = hintTextG2CV2View;
                break;
            case 5:
                BaseG2CV2View jumpConfirmG2CV2View = new JumpConfirmG2CV2View(this.f11804a);
                jumpConfirmG2CV2View.setLayoutParams(c(i));
                baseG2CV2View2 = jumpConfirmG2CV2View;
                break;
            case 6:
                FingerG2CV2View fingerG2CV2View = new FingerG2CV2View(this.f11804a);
                switch (this.f11810g) {
                    case 1:
                    default:
                        i4 = 501;
                        break;
                    case 2:
                        if (this.f11806c == null) {
                            i4 = GuideToClickView.a.f10869c;
                            break;
                        }
                        break;
                    case 3:
                        i4 = 507;
                        break;
                    case 4:
                        this.f11805b.post(new AnonymousClass2(fingerG2CV2View));
                        i4 = 505;
                        break;
                    case 5:
                    case 6:
                        i4 = 504;
                        break;
                }
                fingerG2CV2View.setFingerViewMode(i4);
                fingerG2CV2View.setLayoutParams(c(i));
                baseG2CV2View = fingerG2CV2View;
                baseG2CV2View2 = baseG2CV2View;
                break;
            case 7:
                FullOrientationG2CV2View fullOrientationG2CV2View = new FullOrientationG2CV2View(this.f11804a);
                switch (this.f11810g) {
                    case 1:
                    default:
                        i4 = 501;
                        break;
                    case 2:
                        break;
                    case 3:
                        i4 = 507;
                        break;
                    case 4:
                        a(fullOrientationG2CV2View);
                        i4 = 505;
                        break;
                    case 5:
                    case 6:
                        a(fullOrientationG2CV2View);
                        i4 = 504;
                        break;
                }
                fullOrientationG2CV2View.setViewMode(i4);
                fullOrientationG2CV2View.setLayoutParams(c(i));
                baseG2CV2View = fullOrientationG2CV2View;
                baseG2CV2View2 = baseG2CV2View;
                break;
            case 8:
                BaseG2CV2View luckyBagG2CV2View = new LuckyBagG2CV2View(this.f11804a);
                luckyBagG2CV2View.setLayoutParams(c(i));
                baseG2CV2View2 = luckyBagG2CV2View;
                break;
            case 9:
                BaseG2CV2View chopOnceG2CV2View = new ChopOnceG2CV2View(this.f11804a);
                chopOnceG2CV2View.setLayoutParams(c(i));
                baseG2CV2View2 = chopOnceG2CV2View;
                break;
            case 10:
                BaseG2CV2View puzzleV2G2CV2View = new PuzzleV2G2CV2View(this.f11804a);
                puzzleV2G2CV2View.setLayoutParams(c(i));
                baseG2CV2View2 = puzzleV2G2CV2View;
                break;
            case 11:
                BaseG2CV2View gestureNewG2CV2View = new GestureNewG2CV2View(this.f11804a);
                gestureNewG2CV2View.setLayoutParams(c(i));
                baseG2CV2View2 = gestureNewG2CV2View;
                break;
            case 12:
                BaseG2CV2View fingerNewG2CV2View = new FingerNewG2CV2View(this.f11804a);
                fingerNewG2CV2View.setLayoutParams(c(i));
                baseG2CV2View2 = fingerNewG2CV2View;
                break;
            case 13:
                FingerSlideUpG2CV2View fingerSlideUpG2CV2View = new FingerSlideUpG2CV2View(this.f11804a);
                fingerSlideUpG2CV2View.setLayoutParams(c(i));
                baseG2CV2View2 = fingerSlideUpG2CV2View;
                if (this.f11810g == 2) {
                    baseG2CV2View2 = fingerSlideUpG2CV2View;
                    if (!com.anythink.basead.b.e.a(this.f11808e)) {
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
        int i6 = this.f11810g;
        if (i6 != 5 && i6 != 6) {
            return baseG2CV2View2;
        }
        baseG2CV2View2.setVisibility(4);
        this.f11805b.post(new AnonymousClass4(i, baseG2CV2View2));
        return baseG2CV2View2;
    }

    private void a(final FullOrientationG2CV2View fullOrientationG2CV2View) {
        this.f11805b.post(new Runnable() { // from class: com.anythink.basead.ui.guidetoclickv2.b.3
            @Override // java.lang.Runnable
            public final void run() {
                b bVar = b.this;
                if (bVar.f11805b != null) {
                    int a9 = q.a(bVar.f11804a, 120.0f);
                    int min = Math.min(b.this.f11805b.getMeasuredWidth(), b.this.f11805b.getMeasuredHeight());
                    if (min < a9) {
                        fullOrientationG2CV2View.updateSize(min);
                        b.this.f11806c.setVisibility(0);
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
                    if (this.f11810g != 2 && this.f11817o == 1) {
                        layoutParams2.setMargins(0, 0, 0, q.a(this.f11805b.getContext(), 290.0f));
                        layoutParams2.addRule(12);
                        return layoutParams2;
                    }
                    layoutParams2.addRule(13);
                    return layoutParams2;
                case 5:
                    if (this.f11810g == 2) {
                        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, q.a(this.f11805b.getContext(), 48.0f));
                        layoutParams3.setMargins(q.a(this.f11805b.getContext(), 36.0f), 0, q.a(this.f11805b.getContext(), 36.0f), 0);
                        layoutParams3.addRule(13);
                        return layoutParams3;
                    }
                    RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(q.a(this.f11805b.getContext(), 300.0f), q.a(this.f11805b.getContext(), 48.0f));
                    if (this.f11817o == 2) {
                        layoutParams4.setMargins(0, 0, q.a(this.f11805b.getContext(), 24.0f), q.a(this.f11805b.getContext(), 96.0f));
                        layoutParams4.addRule(11);
                        layoutParams4.addRule(12);
                        return layoutParams4;
                    }
                    layoutParams4.setMargins(0, 0, 0, q.a(this.f11805b.getContext(), 290.0f));
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
        int i4 = this.f11810g;
        if (i4 == 3) {
            layoutParams5.addRule(12);
            return layoutParams5;
        }
        if (i4 == 2) {
            layoutParams5.addRule(12);
            return layoutParams5;
        }
        if (i4 == 1) {
            layoutParams5.addRule(12);
        }
        return layoutParams5;
    }

    private void a(int i, View view) {
        int i4 = this.f11810g;
        if (i4 == 5 || i4 == 6) {
            view.setVisibility(4);
            this.f11805b.post(new AnonymousClass4(i, view));
        }
    }

    public static /* synthetic */ BaseG2CV2View a(b bVar, int i) {
        String str;
        BaseG2CV2View baseG2CV2View;
        BaseG2CV2View baseG2CV2View2;
        int i4 = 502;
        switch (i) {
            case 1:
                GestureG2CV2View gestureG2CV2View = new GestureG2CV2View(bVar.f11804a);
                gestureG2CV2View.setLayoutParams(bVar.c(i));
                gestureG2CV2View.setVerticalLandscape(bVar.f11806c == null);
                baseG2CV2View2 = gestureG2CV2View;
                break;
            case 2:
                PicVerifyG2CV2View picVerifyG2CV2View = new PicVerifyG2CV2View(bVar.f11804a);
                picVerifyG2CV2View.loadImage(bVar.f11808e.B());
                picVerifyG2CV2View.setLayoutParams(bVar.c(i));
                baseG2CV2View2 = picVerifyG2CV2View;
                break;
            case 3:
                QuestionDialogG2CV2View questionDialogG2CV2View = new QuestionDialogG2CV2View(bVar.f11804a);
                questionDialogG2CV2View.setLayoutParams(bVar.c(i));
                if (!TextUtils.isEmpty(bVar.f11808e.x())) {
                    str = bVar.f11808e.x();
                } else if (!TextUtils.isEmpty(bVar.f11808e.y())) {
                    str = bVar.f11808e.y();
                } else {
                    str = "";
                }
                questionDialogG2CV2View.setQuestionAnswer(str, bVar.f11816n);
                baseG2CV2View2 = questionDialogG2CV2View;
                break;
            case 4:
                BaseG2CV2View hintTextG2CV2View = new HintTextG2CV2View(bVar.f11804a);
                hintTextG2CV2View.setLayoutParams(bVar.c(i));
                baseG2CV2View2 = hintTextG2CV2View;
                break;
            case 5:
                BaseG2CV2View jumpConfirmG2CV2View = new JumpConfirmG2CV2View(bVar.f11804a);
                jumpConfirmG2CV2View.setLayoutParams(bVar.c(i));
                baseG2CV2View2 = jumpConfirmG2CV2View;
                break;
            case 6:
                FingerG2CV2View fingerG2CV2View = new FingerG2CV2View(bVar.f11804a);
                switch (bVar.f11810g) {
                    case 1:
                    default:
                        i4 = 501;
                        break;
                    case 2:
                        if (bVar.f11806c == null) {
                            i4 = GuideToClickView.a.f10869c;
                            break;
                        }
                        break;
                    case 3:
                        i4 = 507;
                        break;
                    case 4:
                        bVar.f11805b.post(bVar.new AnonymousClass2(fingerG2CV2View));
                        i4 = 505;
                        break;
                    case 5:
                    case 6:
                        i4 = 504;
                        break;
                }
                fingerG2CV2View.setFingerViewMode(i4);
                fingerG2CV2View.setLayoutParams(bVar.c(i));
                baseG2CV2View = fingerG2CV2View;
                baseG2CV2View2 = baseG2CV2View;
                break;
            case 7:
                FullOrientationG2CV2View fullOrientationG2CV2View = new FullOrientationG2CV2View(bVar.f11804a);
                switch (bVar.f11810g) {
                    case 1:
                    default:
                        i4 = 501;
                        break;
                    case 2:
                        break;
                    case 3:
                        i4 = 507;
                        break;
                    case 4:
                        bVar.a(fullOrientationG2CV2View);
                        i4 = 505;
                        break;
                    case 5:
                    case 6:
                        bVar.a(fullOrientationG2CV2View);
                        i4 = 504;
                        break;
                }
                fullOrientationG2CV2View.setViewMode(i4);
                fullOrientationG2CV2View.setLayoutParams(bVar.c(i));
                baseG2CV2View = fullOrientationG2CV2View;
                baseG2CV2View2 = baseG2CV2View;
                break;
            case 8:
                BaseG2CV2View luckyBagG2CV2View = new LuckyBagG2CV2View(bVar.f11804a);
                luckyBagG2CV2View.setLayoutParams(bVar.c(i));
                baseG2CV2View2 = luckyBagG2CV2View;
                break;
            case 9:
                BaseG2CV2View chopOnceG2CV2View = new ChopOnceG2CV2View(bVar.f11804a);
                chopOnceG2CV2View.setLayoutParams(bVar.c(i));
                baseG2CV2View2 = chopOnceG2CV2View;
                break;
            case 10:
                BaseG2CV2View puzzleV2G2CV2View = new PuzzleV2G2CV2View(bVar.f11804a);
                puzzleV2G2CV2View.setLayoutParams(bVar.c(i));
                baseG2CV2View2 = puzzleV2G2CV2View;
                break;
            case 11:
                BaseG2CV2View gestureNewG2CV2View = new GestureNewG2CV2View(bVar.f11804a);
                gestureNewG2CV2View.setLayoutParams(bVar.c(i));
                baseG2CV2View2 = gestureNewG2CV2View;
                break;
            case 12:
                BaseG2CV2View fingerNewG2CV2View = new FingerNewG2CV2View(bVar.f11804a);
                fingerNewG2CV2View.setLayoutParams(bVar.c(i));
                baseG2CV2View2 = fingerNewG2CV2View;
                break;
            case 13:
                FingerSlideUpG2CV2View fingerSlideUpG2CV2View = new FingerSlideUpG2CV2View(bVar.f11804a);
                fingerSlideUpG2CV2View.setLayoutParams(bVar.c(i));
                baseG2CV2View2 = fingerSlideUpG2CV2View;
                if (bVar.f11810g == 2) {
                    baseG2CV2View2 = fingerSlideUpG2CV2View;
                    if (!com.anythink.basead.b.e.a(bVar.f11808e)) {
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
        int i6 = bVar.f11810g;
        if (i6 != 5 && i6 != 6) {
            return baseG2CV2View2;
        }
        baseG2CV2View2.setVisibility(4);
        bVar.f11805b.post(bVar.new AnonymousClass4(i, baseG2CV2View2));
        return baseG2CV2View2;
    }

    private static /* synthetic */ void b(b bVar, int i) {
        if (i != 3 && i != 4 && i != 6 && i != 13) {
            View view = bVar.f11806c;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        View view2 = bVar.f11806c;
        if (view2 != null) {
            if (i == 13) {
                view2.setBackgroundResource(q.a(bVar.f11804a, "myoffer_mask_half_shadow_bg", k.f20419c));
            }
            bVar.f11806c.setVisibility(0);
        }
    }
}
