package com.anythink.basead.ui.thirdparty;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.anythink.basead.d.g;
import com.anythink.basead.g.i;
import com.anythink.basead.g.j;
import com.anythink.basead.ui.BaseScreenATView;
import com.anythink.basead.ui.CloseImageView;
import com.anythink.core.api.ATNativeAdInfo;
import com.anythink.core.api.ATNetworkConfirmInfo;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.d.p;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.l.e.a.e;
import com.anythink.core.common.v.am;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public class ThirdPartySelfRenderScreenATView extends BaseScreenATView implements e {
    private static final String ah = "ThirdPartySelfRenderScreenATView";
    private static final int ai = 0;
    private View aj;
    private View ak;
    private BaseAd al;
    private ATNativeAdInfo.AdPrepareInfo am;
    private com.anythink.core.common.l.e.a.b an;
    private boolean ao;
    private boolean ap;
    private FrameLayout aq;

    public ThirdPartySelfRenderScreenATView(Context context) {
        super(context);
        this.ao = true;
        this.ap = false;
    }

    private View ag() {
        try {
            Context context = getContext();
            CloseImageView closeImageView = new CloseImageView(context, null);
            closeImageView.setBackgroundResource(q.a(context, "myoffer_base_close_icon", k.f19632c));
            int a9 = q.a(getContext(), 24.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a9, a9);
            layoutParams.gravity = 5;
            int a10 = q.a(context, 5.0f);
            if (ai()) {
                layoutParams.topMargin = a10;
            } else {
                layoutParams.topMargin = q.b(context) + a10;
            }
            layoutParams.rightMargin = a10;
            this.aq.addView(closeImageView, layoutParams);
            return closeImageView;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    private void ah() {
        am.a(this.aj);
        BaseAd baseAd = this.al;
        ViewGroup customAdContainer = baseAd != null ? baseAd.getCustomAdContainer() : null;
        try {
            if (this.aj.getLayoutParams() == null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 17;
                if (customAdContainer != null) {
                    am.a(customAdContainer);
                    customAdContainer.addView(this.aj);
                    this.aq.addView(customAdContainer, layoutParams);
                } else {
                    this.aq.addView(this.aj, layoutParams);
                }
            } else {
                ViewGroup.LayoutParams layoutParams2 = this.aj.getLayoutParams();
                if (customAdContainer != null) {
                    am.a(customAdContainer);
                    customAdContainer.addView(this.aj);
                    this.aq.addView(customAdContainer, layoutParams2);
                } else {
                    this.aq.addView(this.aj, layoutParams2);
                }
            }
            if (customAdContainer != null) {
                customAdContainer.setBackgroundColor(0);
            }
        } catch (Throwable th) {
            Log.e(ah, "addAdView() >>> failed: " + th.getMessage());
        }
    }

    private boolean ai() {
        x xVar = this.f9735f;
        return xVar != null && xVar.f14163j == Integer.parseInt("2");
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void M() {
        i iVar = this.f9861W;
        if (iVar != null) {
            iVar.d();
        }
        com.anythink.core.common.l.e.a.b bVar = this.an;
        if (bVar != null) {
            bVar.onClose();
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void T() {
        ATNativeAdInfo.AdPrepareInfo adPrepareInfo = this.am;
        if (adPrepareInfo == null) {
            return;
        }
        View closeView = adPrepareInfo.getCloseView();
        if (closeView == null && (!ai() || this.ao)) {
            closeView = ag();
        }
        this.ak = closeView;
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void U() {
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final void a() {
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final boolean b(int i) {
        return false;
    }

    @Override // com.anythink.basead.ui.BaseScreenATView, com.anythink.basead.ui.BaseATView
    public void destroy() {
        super.destroy();
        BaseAd baseAd = this.al;
        if (baseAd != null) {
            baseAd.setNativeEventListener(null);
            this.al.clear(this);
            this.al.destroy();
        }
        RelativeLayout relativeLayout = this.f9851M;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        removeAllViews();
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public void init() {
        BaseAd baseAd = this.al;
        if (baseAd == null) {
            return;
        }
        baseAd.setNativeEventListener(new p() { // from class: com.anythink.basead.ui.thirdparty.ThirdPartySelfRenderScreenATView.1
            @Override // com.anythink.core.common.d.p
            public final void a(String str, String str2) {
                ThirdPartySelfRenderScreenATView.this.a(g.a(str, str2));
                if (ThirdPartySelfRenderScreenATView.this.an != null) {
                    ThirdPartySelfRenderScreenATView.this.an.onVideoError(str, str2);
                }
            }

            @Override // com.anythink.core.common.d.o
            public final void onAdClicked(View view) {
                if (((BaseScreenATView) ThirdPartySelfRenderScreenATView.this).f9861W != null) {
                    ((BaseScreenATView) ThirdPartySelfRenderScreenATView.this).f9861W.b(new j().a(1, com.anythink.basead.mixad.f.b.f9563a));
                }
                if (ThirdPartySelfRenderScreenATView.this.an != null) {
                    ThirdPartySelfRenderScreenATView.this.an.onAdClicked(view);
                }
            }

            @Override // com.anythink.core.common.d.o
            public final void onAdDislikeButtonClick() {
                String unused = ThirdPartySelfRenderScreenATView.ah;
                if (((BaseScreenATView) ThirdPartySelfRenderScreenATView.this).f9861W != null) {
                    ((BaseScreenATView) ThirdPartySelfRenderScreenATView.this).f9861W.d();
                }
                if (ThirdPartySelfRenderScreenATView.this.an != null) {
                    ThirdPartySelfRenderScreenATView.this.an.onClose();
                }
            }

            @Override // com.anythink.core.common.d.o
            public final void onAdImpressed() {
                if (ThirdPartySelfRenderScreenATView.this.ap) {
                    return;
                }
                ThirdPartySelfRenderScreenATView.b(ThirdPartySelfRenderScreenATView.this);
                if (((BaseScreenATView) ThirdPartySelfRenderScreenATView.this).f9861W != null) {
                    ((BaseScreenATView) ThirdPartySelfRenderScreenATView.this).f9861W.a(new j());
                }
                if (ThirdPartySelfRenderScreenATView.this.an != null) {
                    ThirdPartySelfRenderScreenATView.this.an.onAdImpressed();
                }
            }

            @Override // com.anythink.core.common.d.o
            public final void onAdVideoEnd() {
                if (((BaseScreenATView) ThirdPartySelfRenderScreenATView.this).f9861W != null) {
                    ((BaseScreenATView) ThirdPartySelfRenderScreenATView.this).f9861W.b();
                }
                if (ThirdPartySelfRenderScreenATView.this.an != null) {
                    ThirdPartySelfRenderScreenATView.this.an.onAdVideoEnd();
                }
            }

            @Override // com.anythink.core.common.d.o
            public final void onAdVideoProgress(int i) {
            }

            @Override // com.anythink.core.common.d.o
            public final void onAdVideoStart() {
                if (((BaseScreenATView) ThirdPartySelfRenderScreenATView.this).f9861W != null) {
                    ((BaseScreenATView) ThirdPartySelfRenderScreenATView.this).f9861W.a();
                }
                if (ThirdPartySelfRenderScreenATView.this.an != null) {
                    ThirdPartySelfRenderScreenATView.this.an.onAdVideoStart();
                }
            }

            @Override // com.anythink.core.common.d.o
            public final void onDeeplinkCallback(boolean z3) {
                if (((BaseScreenATView) ThirdPartySelfRenderScreenATView.this).f9861W != null) {
                    ((BaseScreenATView) ThirdPartySelfRenderScreenATView.this).f9861W.a(z3);
                }
                if (ThirdPartySelfRenderScreenATView.this.an != null) {
                    ThirdPartySelfRenderScreenATView.this.an.onDeeplinkCallback(z3);
                }
            }

            @Override // com.anythink.core.common.d.o
            public final void onDownloadConfirmCallback(Context context, View view, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
            }
        });
        this.al.registerListener(this.aq, this.am);
        View view = this.ak;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.thirdparty.ThirdPartySelfRenderScreenATView.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ThirdPartySelfRenderScreenATView.this.M();
                }
            });
        }
    }

    public void setMixNativeAdEventListener(com.anythink.core.common.l.e.a.b bVar) {
        this.an = bVar;
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final int y() {
        return 0;
    }

    public static /* synthetic */ boolean b(ThirdPartySelfRenderScreenATView thirdPartySelfRenderScreenATView) {
        thirdPartySelfRenderScreenATView.ap = true;
        return true;
    }

    public ThirdPartySelfRenderScreenATView(Context context, x xVar, w wVar, String str, int i, int i6, BaseAd baseAd, View view, ATNativeAdInfo.AdPrepareInfo adPrepareInfo) {
        super(context, xVar, wVar, str, i, i6);
        this.ao = true;
        this.ap = false;
        this.aq = new FrameLayout(getContext());
        this.aq.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        if (adPrepareInfo != null) {
            this.am = adPrepareInfo;
        } else {
            this.am = new ATNativeAdInfo.AdPrepareInfo();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(q.a(context, 32.0f), q.a(context, 8.0f));
            layoutParams.gravity = 85;
            this.am.setChoiceViewLayoutParams(layoutParams);
        }
        if (xVar != null) {
            y yVar = xVar.f14168o;
            if (yVar instanceof com.anythink.basead.mixad.e.c) {
                this.ao = ((com.anythink.basead.mixad.e.c) yVar).d();
            }
        }
        this.aj = view;
        this.al = baseAd;
        am.a(view);
        BaseAd baseAd2 = this.al;
        ViewGroup customAdContainer = baseAd2 != null ? baseAd2.getCustomAdContainer() : null;
        try {
            if (this.aj.getLayoutParams() == null) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams2.gravity = 17;
                if (customAdContainer != null) {
                    am.a(customAdContainer);
                    customAdContainer.addView(this.aj);
                    this.aq.addView(customAdContainer, layoutParams2);
                } else {
                    this.aq.addView(this.aj, layoutParams2);
                }
            } else {
                ViewGroup.LayoutParams layoutParams3 = this.aj.getLayoutParams();
                if (customAdContainer != null) {
                    am.a(customAdContainer);
                    customAdContainer.addView(this.aj);
                    this.aq.addView(customAdContainer, layoutParams3);
                } else {
                    this.aq.addView(this.aj, layoutParams3);
                }
            }
            if (customAdContainer != null) {
                customAdContainer.setBackgroundColor(0);
            }
        } catch (Throwable th) {
            Log.e(ah, "addAdView() >>> failed: " + th.getMessage());
        }
        T();
        setBackgroundColor(0);
        addView(this.aq);
    }

    private void a(Context context, x xVar, ATNativeAdInfo.AdPrepareInfo adPrepareInfo) {
        if (adPrepareInfo != null) {
            this.am = adPrepareInfo;
        } else {
            this.am = new ATNativeAdInfo.AdPrepareInfo();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(q.a(context, 32.0f), q.a(context, 8.0f));
            layoutParams.gravity = 85;
            this.am.setChoiceViewLayoutParams(layoutParams);
        }
        if (xVar != null) {
            y yVar = xVar.f14168o;
            if (yVar instanceof com.anythink.basead.mixad.e.c) {
                this.ao = ((com.anythink.basead.mixad.e.c) yVar).d();
            }
        }
    }
}
