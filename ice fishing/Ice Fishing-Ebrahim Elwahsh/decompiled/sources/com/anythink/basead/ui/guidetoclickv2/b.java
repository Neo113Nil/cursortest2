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
    Context f11175a;

    /* renamed from: b, reason: collision with root package name */
    RelativeLayout f11176b;

    /* renamed from: c, reason: collision with root package name */
    View f11177c;

    /* renamed from: d, reason: collision with root package name */
    Runnable f11178d;

    /* renamed from: e, reason: collision with root package name */
    private w f11179e;

    /* renamed from: f, reason: collision with root package name */
    private x f11180f;

    /* renamed from: g, reason: collision with root package name */
    private int f11181g;

    /* renamed from: h, reason: collision with root package name */
    private int f11182h;
    private BaseG2CV2View.b i;

    /* renamed from: j, reason: collision with root package name */
    private BaseG2CV2View f11183j;

    /* renamed from: k, reason: collision with root package name */
    private long f11184k;

    /* renamed from: l, reason: collision with root package name */
    private long f11185l;

    /* renamed from: m, reason: collision with root package name */
    private long f11186m;

    /* renamed from: n, reason: collision with root package name */
    private String f11187n;

    /* renamed from: o, reason: collision with root package name */
    private int f11188o;

    /* renamed from: p, reason: collision with root package name */
    private c.a f11189p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f11190q = false;

    /* renamed from: r, reason: collision with root package name */
    private int f11191r;

    /* renamed from: s, reason: collision with root package name */
    private long f11192s;

    /* renamed from: t, reason: collision with root package name */
    private long f11193t;

    /* renamed from: com.anythink.basead.ui.guidetoclickv2.b$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ BaseG2CV2View f11196a;

        public AnonymousClass2(BaseG2CV2View baseG2CV2View) {
            this.f11196a = baseG2CV2View;
        }

        @Override // java.lang.Runnable
        public final void run() {
            RelativeLayout relativeLayout = b.this.f11176b;
            if (relativeLayout == null || relativeLayout.getMeasuredHeight() <= q.a(b.this.f11175a, 90.0f)) {
                return;
            }
            ((FingerG2CV2View) this.f11196a).setFingerViewMode(GuideToClickView.a.f10243f);
        }
    }

    /* renamed from: com.anythink.basead.ui.guidetoclickv2.b$4, reason: invalid class name */
    public class AnonymousClass4 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f11200a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f11201b;

        public AnonymousClass4(int i, View view) {
            this.f11200a = i;
            this.f11201b = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f11200a != 11) {
                RelativeLayout relativeLayout = b.this.f11176b;
                if (relativeLayout != null && ((relativeLayout.getMeasuredHeight() < 100 || b.this.f11176b.getMeasuredWidth() < 200) && b.this.i != null)) {
                    b.this.i.b();
                    return;
                }
            } else {
                RelativeLayout relativeLayout2 = b.this.f11176b;
                if (relativeLayout2 != null && ((relativeLayout2.getMeasuredHeight() < q.a(b.this.f11176b.getContext(), a.C0059a.f11173a) || b.this.f11176b.getMeasuredWidth() < q.a(b.this.f11176b.getContext(), a.C0059a.f11174b)) && b.this.i != null)) {
                    b.this.i.b();
                    return;
                }
            }
            this.f11201b.setVisibility(0);
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f11203a;

        /* renamed from: b, reason: collision with root package name */
        public int f11204b;

        /* renamed from: c, reason: collision with root package name */
        public long f11205c;

        /* renamed from: d, reason: collision with root package name */
        public long f11206d;

        /* renamed from: e, reason: collision with root package name */
        private String f11207e;

        /* renamed from: f, reason: collision with root package name */
        private int f11208f;

        public a(int i, int i4, long j9, long j10, String str, int i9) {
            this.f11203a = i;
            this.f11204b = i4;
            this.f11205c = j9;
            this.f11206d = j10;
            this.f11207e = str;
            this.f11208f = i9;
        }
    }

    public b(Context context, w wVar, x xVar, final int i, a aVar, RelativeLayout relativeLayout, View view, c.a aVar2, BaseG2CV2View.b bVar) {
        this.f11185l = 0L;
        this.f11186m = f.f7344a;
        this.f11187n = "";
        this.f11188o = 1;
        this.f11175a = context;
        this.f11179e = wVar;
        this.f11180f = xVar;
        this.f11176b = relativeLayout;
        this.f11177c = view;
        this.f11181g = i;
        this.f11189p = aVar2;
        this.i = bVar;
        this.f11182h = aVar.f11204b;
        this.f11186m = aVar.f11205c;
        this.f11185l = aVar.f11206d;
        this.f11187n = aVar.f11207e;
        this.f11188o = aVar.f11208f;
        this.f11191r = aVar.f11203a;
        this.f11178d = new Runnable() { // from class: com.anythink.basead.ui.guidetoclickv2.b.1
            @Override // java.lang.Runnable
            public final void run() {
                if (b.this.f11183j == null) {
                    b bVar2 = b.this;
                    bVar2.f11183j = b.a(bVar2, bVar2.f11182h);
                    if (b.this.f11183j != null) {
                        b.this.f11192s = System.currentTimeMillis();
                        b.this.f11183j.init(b.this.f11186m, i, b.this.f11188o, b.this.f11189p, b.this.i);
                        b bVar3 = b.this;
                        RelativeLayout relativeLayout2 = bVar3.f11176b;
                        if (relativeLayout2 != null) {
                            relativeLayout2.addView(bVar3.f11183j);
                        }
                        b bVar4 = b.this;
                        int i4 = bVar4.f11182h;
                        if (i4 == 3 || i4 == 4 || i4 == 6 || i4 == 13) {
                            View view2 = bVar4.f11177c;
                            if (view2 != null) {
                                if (i4 == 13) {
                                    view2.setBackgroundResource(q.a(bVar4.f11175a, "myoffer_mask_half_shadow_bg", k.f19790c));
                                }
                                bVar4.f11177c.setVisibility(0);
                            }
                        } else {
                            View view3 = bVar4.f11177c;
                            if (view3 != null) {
                                view3.setVisibility(8);
                            }
                        }
                    }
                }
                b.this.f11183j.resumeAnimPlay();
            }
        };
    }

    private void d() {
        if (this.f11192s > 0) {
            x xVar = this.f11180f;
            w wVar = this.f11179e;
            e.a(xVar, wVar, com.anythink.basead.b.e.a(wVar, xVar), this.f11191r, this.f11182h, this.f11192s, this.f11193t);
        }
    }

    public final void b() {
        if (this.f11190q) {
            this.f11190q = false;
            long j9 = this.f11185l;
            if (j9 > 0) {
                this.f11185l = Math.max(j9 - (SystemClock.elapsedRealtime() - this.f11184k), 0L);
            }
            t.b().d(this.f11178d);
            BaseG2CV2View baseG2CV2View = this.f11183j;
            if (baseG2CV2View != null) {
                baseG2CV2View.pauseAnimPlay();
            }
        }
    }

    public final void c() {
        long currentTimeMillis = System.currentTimeMillis();
        long j9 = this.f11192s;
        this.f11193t = currentTimeMillis - j9;
        if (j9 > 0) {
            x xVar = this.f11180f;
            w wVar = this.f11179e;
            e.a(xVar, wVar, com.anythink.basead.b.e.a(wVar, xVar), this.f11191r, this.f11182h, this.f11192s, this.f11193t);
        }
        t.b().d(this.f11178d);
        BaseG2CV2View baseG2CV2View = this.f11183j;
        if (baseG2CV2View != null) {
            baseG2CV2View.release();
            am.a(this.f11183j);
        }
        View view = this.f11177c;
        if (view != null) {
            view.setBackgroundColor(Color.parseColor("#80000000"));
            this.f11177c.setVisibility(8);
        }
    }

    public final void a() {
        if (this.f11190q) {
            return;
        }
        this.f11190q = true;
        this.f11184k = SystemClock.elapsedRealtime();
        t.b().a(this.f11178d, this.f11185l);
    }

    private void a(int i) {
        if (i != 3 && i != 4 && i != 6 && i != 13) {
            View view = this.f11177c;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        View view2 = this.f11177c;
        if (view2 != null) {
            if (i == 13) {
                view2.setBackgroundResource(q.a(this.f11175a, "myoffer_mask_half_shadow_bg", k.f19790c));
            }
            this.f11177c.setVisibility(0);
        }
    }

    private BaseG2CV2View b(int i) {
        String str;
        BaseG2CV2View baseG2CV2View;
        BaseG2CV2View baseG2CV2View2;
        int i4 = 502;
        switch (i) {
            case 1:
                GestureG2CV2View gestureG2CV2View = new GestureG2CV2View(this.f11175a);
                gestureG2CV2View.setLayoutParams(c(i));
                gestureG2CV2View.setVerticalLandscape(this.f11177c == null);
                baseG2CV2View2 = gestureG2CV2View;
                break;
            case 2:
                PicVerifyG2CV2View picVerifyG2CV2View = new PicVerifyG2CV2View(this.f11175a);
                picVerifyG2CV2View.loadImage(this.f11179e.B());
                picVerifyG2CV2View.setLayoutParams(c(i));
                baseG2CV2View2 = picVerifyG2CV2View;
                break;
            case 3:
                QuestionDialogG2CV2View questionDialogG2CV2View = new QuestionDialogG2CV2View(this.f11175a);
                questionDialogG2CV2View.setLayoutParams(c(i));
                if (!TextUtils.isEmpty(this.f11179e.x())) {
                    str = this.f11179e.x();
                } else if (!TextUtils.isEmpty(this.f11179e.y())) {
                    str = this.f11179e.y();
                } else {
                    str = "";
                }
                questionDialogG2CV2View.setQuestionAnswer(str, this.f11187n);
                baseG2CV2View2 = questionDialogG2CV2View;
                break;
            case 4:
                BaseG2CV2View hintTextG2CV2View = new HintTextG2CV2View(this.f11175a);
                hintTextG2CV2View.setLayoutParams(c(i));
                baseG2CV2View2 = hintTextG2CV2View;
                break;
            case 5:
                BaseG2CV2View jumpConfirmG2CV2View = new JumpConfirmG2CV2View(this.f11175a);
                jumpConfirmG2CV2View.setLayoutParams(c(i));
                baseG2CV2View2 = jumpConfirmG2CV2View;
                break;
            case 6:
                FingerG2CV2View fingerG2CV2View = new FingerG2CV2View(this.f11175a);
                switch (this.f11181g) {
                    case 1:
                    default:
                        i4 = 501;
                        break;
                    case 2:
                        if (this.f11177c == null) {
                            i4 = GuideToClickView.a.f10240c;
                            break;
                        }
                        break;
                    case 3:
                        i4 = 507;
                        break;
                    case 4:
                        this.f11176b.post(new AnonymousClass2(fingerG2CV2View));
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
                FullOrientationG2CV2View fullOrientationG2CV2View = new FullOrientationG2CV2View(this.f11175a);
                switch (this.f11181g) {
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
                BaseG2CV2View luckyBagG2CV2View = new LuckyBagG2CV2View(this.f11175a);
                luckyBagG2CV2View.setLayoutParams(c(i));
                baseG2CV2View2 = luckyBagG2CV2View;
                break;
            case 9:
                BaseG2CV2View chopOnceG2CV2View = new ChopOnceG2CV2View(this.f11175a);
                chopOnceG2CV2View.setLayoutParams(c(i));
                baseG2CV2View2 = chopOnceG2CV2View;
                break;
            case 10:
                BaseG2CV2View puzzleV2G2CV2View = new PuzzleV2G2CV2View(this.f11175a);
                puzzleV2G2CV2View.setLayoutParams(c(i));
                baseG2CV2View2 = puzzleV2G2CV2View;
                break;
            case 11:
                BaseG2CV2View gestureNewG2CV2View = new GestureNewG2CV2View(this.f11175a);
                gestureNewG2CV2View.setLayoutParams(c(i));
                baseG2CV2View2 = gestureNewG2CV2View;
                break;
            case 12:
                BaseG2CV2View fingerNewG2CV2View = new FingerNewG2CV2View(this.f11175a);
                fingerNewG2CV2View.setLayoutParams(c(i));
                baseG2CV2View2 = fingerNewG2CV2View;
                break;
            case 13:
                FingerSlideUpG2CV2View fingerSlideUpG2CV2View = new FingerSlideUpG2CV2View(this.f11175a);
                fingerSlideUpG2CV2View.setLayoutParams(c(i));
                baseG2CV2View2 = fingerSlideUpG2CV2View;
                if (this.f11181g == 2) {
                    baseG2CV2View2 = fingerSlideUpG2CV2View;
                    if (!com.anythink.basead.b.e.a(this.f11179e)) {
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
        int i9 = this.f11181g;
        if (i9 != 5 && i9 != 6) {
            return baseG2CV2View2;
        }
        baseG2CV2View2.setVisibility(4);
        this.f11176b.post(new AnonymousClass4(i, baseG2CV2View2));
        return baseG2CV2View2;
    }

    private void a(final FullOrientationG2CV2View fullOrientationG2CV2View) {
        this.f11176b.post(new Runnable() { // from class: com.anythink.basead.ui.guidetoclickv2.b.3
            @Override // java.lang.Runnable
            public final void run() {
                b bVar = b.this;
                if (bVar.f11176b != null) {
                    int a9 = q.a(bVar.f11175a, 120.0f);
                    int min = Math.min(b.this.f11176b.getMeasuredWidth(), b.this.f11176b.getMeasuredHeight());
                    if (min < a9) {
                        fullOrientationG2CV2View.updateSize(min);
                        b.this.f11177c.setVisibility(0);
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
                    if (this.f11181g != 2 && this.f11188o == 1) {
                        layoutParams2.setMargins(0, 0, 0, q.a(this.f11176b.getContext(), 290.0f));
                        layoutParams2.addRule(12);
                        return layoutParams2;
                    }
                    layoutParams2.addRule(13);
                    return layoutParams2;
                case 5:
                    if (this.f11181g == 2) {
                        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, q.a(this.f11176b.getContext(), 48.0f));
                        layoutParams3.setMargins(q.a(this.f11176b.getContext(), 36.0f), 0, q.a(this.f11176b.getContext(), 36.0f), 0);
                        layoutParams3.addRule(13);
                        return layoutParams3;
                    }
                    RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(q.a(this.f11176b.getContext(), 300.0f), q.a(this.f11176b.getContext(), 48.0f));
                    if (this.f11188o == 2) {
                        layoutParams4.setMargins(0, 0, q.a(this.f11176b.getContext(), 24.0f), q.a(this.f11176b.getContext(), 96.0f));
                        layoutParams4.addRule(11);
                        layoutParams4.addRule(12);
                        return layoutParams4;
                    }
                    layoutParams4.setMargins(0, 0, 0, q.a(this.f11176b.getContext(), 290.0f));
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
        int i4 = this.f11181g;
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
        int i4 = this.f11181g;
        if (i4 == 5 || i4 == 6) {
            view.setVisibility(4);
            this.f11176b.post(new AnonymousClass4(i, view));
        }
    }

    public static /* synthetic */ BaseG2CV2View a(b bVar, int i) {
        String str;
        BaseG2CV2View baseG2CV2View;
        BaseG2CV2View baseG2CV2View2;
        int i4 = 502;
        switch (i) {
            case 1:
                GestureG2CV2View gestureG2CV2View = new GestureG2CV2View(bVar.f11175a);
                gestureG2CV2View.setLayoutParams(bVar.c(i));
                gestureG2CV2View.setVerticalLandscape(bVar.f11177c == null);
                baseG2CV2View2 = gestureG2CV2View;
                break;
            case 2:
                PicVerifyG2CV2View picVerifyG2CV2View = new PicVerifyG2CV2View(bVar.f11175a);
                picVerifyG2CV2View.loadImage(bVar.f11179e.B());
                picVerifyG2CV2View.setLayoutParams(bVar.c(i));
                baseG2CV2View2 = picVerifyG2CV2View;
                break;
            case 3:
                QuestionDialogG2CV2View questionDialogG2CV2View = new QuestionDialogG2CV2View(bVar.f11175a);
                questionDialogG2CV2View.setLayoutParams(bVar.c(i));
                if (!TextUtils.isEmpty(bVar.f11179e.x())) {
                    str = bVar.f11179e.x();
                } else if (!TextUtils.isEmpty(bVar.f11179e.y())) {
                    str = bVar.f11179e.y();
                } else {
                    str = "";
                }
                questionDialogG2CV2View.setQuestionAnswer(str, bVar.f11187n);
                baseG2CV2View2 = questionDialogG2CV2View;
                break;
            case 4:
                BaseG2CV2View hintTextG2CV2View = new HintTextG2CV2View(bVar.f11175a);
                hintTextG2CV2View.setLayoutParams(bVar.c(i));
                baseG2CV2View2 = hintTextG2CV2View;
                break;
            case 5:
                BaseG2CV2View jumpConfirmG2CV2View = new JumpConfirmG2CV2View(bVar.f11175a);
                jumpConfirmG2CV2View.setLayoutParams(bVar.c(i));
                baseG2CV2View2 = jumpConfirmG2CV2View;
                break;
            case 6:
                FingerG2CV2View fingerG2CV2View = new FingerG2CV2View(bVar.f11175a);
                switch (bVar.f11181g) {
                    case 1:
                    default:
                        i4 = 501;
                        break;
                    case 2:
                        if (bVar.f11177c == null) {
                            i4 = GuideToClickView.a.f10240c;
                            break;
                        }
                        break;
                    case 3:
                        i4 = 507;
                        break;
                    case 4:
                        bVar.f11176b.post(bVar.new AnonymousClass2(fingerG2CV2View));
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
                FullOrientationG2CV2View fullOrientationG2CV2View = new FullOrientationG2CV2View(bVar.f11175a);
                switch (bVar.f11181g) {
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
                BaseG2CV2View luckyBagG2CV2View = new LuckyBagG2CV2View(bVar.f11175a);
                luckyBagG2CV2View.setLayoutParams(bVar.c(i));
                baseG2CV2View2 = luckyBagG2CV2View;
                break;
            case 9:
                BaseG2CV2View chopOnceG2CV2View = new ChopOnceG2CV2View(bVar.f11175a);
                chopOnceG2CV2View.setLayoutParams(bVar.c(i));
                baseG2CV2View2 = chopOnceG2CV2View;
                break;
            case 10:
                BaseG2CV2View puzzleV2G2CV2View = new PuzzleV2G2CV2View(bVar.f11175a);
                puzzleV2G2CV2View.setLayoutParams(bVar.c(i));
                baseG2CV2View2 = puzzleV2G2CV2View;
                break;
            case 11:
                BaseG2CV2View gestureNewG2CV2View = new GestureNewG2CV2View(bVar.f11175a);
                gestureNewG2CV2View.setLayoutParams(bVar.c(i));
                baseG2CV2View2 = gestureNewG2CV2View;
                break;
            case 12:
                BaseG2CV2View fingerNewG2CV2View = new FingerNewG2CV2View(bVar.f11175a);
                fingerNewG2CV2View.setLayoutParams(bVar.c(i));
                baseG2CV2View2 = fingerNewG2CV2View;
                break;
            case 13:
                FingerSlideUpG2CV2View fingerSlideUpG2CV2View = new FingerSlideUpG2CV2View(bVar.f11175a);
                fingerSlideUpG2CV2View.setLayoutParams(bVar.c(i));
                baseG2CV2View2 = fingerSlideUpG2CV2View;
                if (bVar.f11181g == 2) {
                    baseG2CV2View2 = fingerSlideUpG2CV2View;
                    if (!com.anythink.basead.b.e.a(bVar.f11179e)) {
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
        int i9 = bVar.f11181g;
        if (i9 != 5 && i9 != 6) {
            return baseG2CV2View2;
        }
        baseG2CV2View2.setVisibility(4);
        bVar.f11176b.post(bVar.new AnonymousClass4(i, baseG2CV2View2));
        return baseG2CV2View2;
    }

    private static /* synthetic */ void b(b bVar, int i) {
        if (i != 3 && i != 4 && i != 6 && i != 13) {
            View view = bVar.f11177c;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        View view2 = bVar.f11177c;
        if (view2 != null) {
            if (i == 13) {
                view2.setBackgroundResource(q.a(bVar.f11175a, "myoffer_mask_half_shadow_bg", k.f19790c));
            }
            bVar.f11177c.setVisibility(0);
        }
    }
}
