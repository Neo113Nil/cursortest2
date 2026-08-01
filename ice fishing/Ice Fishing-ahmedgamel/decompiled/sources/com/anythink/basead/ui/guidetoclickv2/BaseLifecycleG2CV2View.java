package com.anythink.basead.ui.guidetoclickv2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View;
import com.anythink.basead.ui.guidetoclickv2.GTCV2InnerCountDownView;
import com.anythink.basead.ui.improveclick.c;
import com.anythink.core.common.d.t;

/* loaded from: classes.dex */
public abstract class BaseLifecycleG2CV2View extends BaseG2CV2View {

    /* renamed from: d, reason: collision with root package name */
    private GTCV2InnerCountDownView f10853d;

    public BaseLifecycleG2CV2View(Context context) {
        super(context);
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public void a() {
        GTCV2InnerCountDownView gTCV2InnerCountDownView = this.f10853d;
        if (gTCV2InnerCountDownView != null) {
            gTCV2InnerCountDownView.onResume();
        } else {
            super.a();
        }
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public void b() {
        GTCV2InnerCountDownView gTCV2InnerCountDownView = this.f10853d;
        if (gTCV2InnerCountDownView != null) {
            gTCV2InnerCountDownView.onPause();
        } else {
            super.b();
        }
    }

    public final void d() {
        if (this.f10853d == null) {
            this.f10853d = new GTCV2InnerCountDownView(getContext());
            addView(this.f10853d, new ViewGroup.MarginLayoutParams(-1, -1));
            this.f10853d.initSetting(new GTCV2InnerCountDownView.a() { // from class: com.anythink.basead.ui.guidetoclickv2.BaseLifecycleG2CV2View.1
                @Override // com.anythink.basead.ui.guidetoclickv2.GTCV2InnerCountDownView.a
                public final void a() {
                    BaseLifecycleG2CV2View baseLifecycleG2CV2View = BaseLifecycleG2CV2View.this;
                    c.a aVar = baseLifecycleG2CV2View.f10834c;
                    if (aVar != null) {
                        aVar.a(11, baseLifecycleG2CV2View.e());
                    }
                }

                @Override // com.anythink.basead.ui.guidetoclickv2.GTCV2InnerCountDownView.a
                public final void b() {
                    BaseLifecycleG2CV2View.this.c();
                }
            });
        }
        t.b().d(this.f10833b);
    }

    public abstract int e();

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public void init(long j6, int i, int i6, c.a aVar, BaseG2CV2View.b bVar) {
        super.init(j6, i, i6, aVar, bVar);
        c.a aVar2 = this.f10834c;
        if (aVar2 instanceof c.b) {
            ((c.b) aVar2).b();
        }
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public void pauseAnimPlay() {
        GTCV2InnerCountDownView gTCV2InnerCountDownView = this.f10853d;
        if (gTCV2InnerCountDownView != null) {
            gTCV2InnerCountDownView.onPause();
        } else {
            super.pauseAnimPlay();
        }
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public void release() {
        super.release();
        GTCV2InnerCountDownView gTCV2InnerCountDownView = this.f10853d;
        if (gTCV2InnerCountDownView != null) {
            gTCV2InnerCountDownView.release();
        }
        c.a aVar = this.f10834c;
        if (aVar instanceof c.b) {
            ((c.b) aVar).a();
        }
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public void resumeAnimPlay() {
        GTCV2InnerCountDownView gTCV2InnerCountDownView = this.f10853d;
        if (gTCV2InnerCountDownView != null) {
            gTCV2InnerCountDownView.onResume();
        } else {
            super.resumeAnimPlay();
        }
    }

    public BaseLifecycleG2CV2View(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BaseLifecycleG2CV2View(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
