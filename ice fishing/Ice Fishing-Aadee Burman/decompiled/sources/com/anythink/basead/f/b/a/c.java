package com.anythink.basead.f.b.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.anythink.basead.ui.BaseMediaATView;
import com.anythink.basead.ui.MediaATView;
import com.anythink.basead.ui.MraidMediaView;
import com.anythink.basead.ui.OwnNativeATView;
import com.anythink.core.common.h.bj;
import com.anythink.core.common.h.x;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Random;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class c extends com.anythink.basead.f.b.a.a {

    /* renamed from: p, reason: collision with root package name */
    BaseMediaATView f8871p;

    /* renamed from: q, reason: collision with root package name */
    List<View> f8872q;

    public static class a implements BaseMediaATView.a {

        /* renamed from: a, reason: collision with root package name */
        private final BaseMediaATView.a f8874a;

        public a(BaseMediaATView.a aVar) {
            this.f8874a = aVar;
        }

        @Override // com.anythink.basead.ui.BaseMediaATView.a
        public final void onClickCloseView() {
            BaseMediaATView.a aVar = this.f8874a;
            if (aVar != null) {
                aVar.onClickCloseView();
            }
        }
    }

    public c(Context context, bj bjVar, x xVar, boolean z3) {
        super(context, bjVar, xVar, z3);
    }

    private int N() {
        int bi = this.f8882t.f14168o.bi();
        if (bi > 0) {
            return bi;
        }
        JSONArray jSONArray = this.f8877C;
        if (jSONArray == null) {
            return 6;
        }
        try {
            int optInt = this.f8877C.optInt(new Random().nextInt(jSONArray.length()));
            if (optInt <= 0) {
                return 6;
            }
            this.f8877C.toString();
            return optInt;
        } catch (Throwable unused) {
            return 6;
        }
    }

    @Override // com.anythink.basead.f.b.a.a, com.anythink.basead.f.b.a.d
    public final View H() {
        return this.f8881s.n() ? this.f8871p : super.H();
    }

    @Override // com.anythink.basead.f.b.a.a
    public final void I() {
        super.I();
        if (this.f8886x && this.f8881s.n()) {
            BaseMediaATView baseMediaATView = this.f8871p;
            if (baseMediaATView instanceof MraidMediaView) {
                ((MraidMediaView) baseMediaATView).fireAudioVolumeChange(this.f8886x);
            }
        }
    }

    @Override // com.anythink.basead.f.b.a.a
    public final List<View> J() {
        return this.f8872q;
    }

    @Override // com.anythink.basead.f.b.a.a
    public final void K() {
        BaseMediaATView baseMediaATView = this.f8871p;
        if (baseMediaATView != null) {
            baseMediaATView.changeCloseViewSizeAfterClick();
        }
    }

    @Override // com.anythink.basead.f.b.a.a
    public final View L() {
        OwnNativeATView ownNativeATView = this.f8840c;
        BaseMediaATView baseMediaATView = this.f8871p;
        if (baseMediaATView == null || baseMediaATView.getMonitorClickView() == null) {
            return ownNativeATView;
        }
        View monitorClickView = this.f8871p.getMonitorClickView();
        this.f8841d = new WeakReference<>(monitorClickView);
        return monitorClickView;
    }

    @Override // com.anythink.basead.f.a
    public final View a(Context context, boolean z3, BaseMediaATView.a aVar) {
        if (!p()) {
            return null;
        }
        if (this.f8840c == null) {
            this.f8840c = G();
        }
        a aVar2 = new a(aVar);
        bj bjVar = this.f8881s;
        if (bjVar == null || !bjVar.n()) {
            this.f8871p = new MediaATView(context, this.f8881s, this.f8882t, z3, aVar2);
        } else {
            MraidMediaView mraidMediaView = new MraidMediaView(context, this.f8881s, this.f8882t, z3, aVar2, this.f8849m);
            this.f8871p = mraidMediaView;
            mraidMediaView.setMraidWebViewListener(new MraidMediaView.a() { // from class: com.anythink.basead.f.b.a.c.1
                @Override // com.anythink.basead.ui.MraidMediaView.a
                public final void a(String str) {
                    bj bjVar2 = c.this.f8881s;
                    if (bjVar2 != null) {
                        bjVar2.w(str);
                    }
                    c cVar = c.this;
                    cVar.a(cVar.f8871p, 1, 13);
                }

                @Override // com.anythink.basead.ui.MraidMediaView.a
                public final void a() {
                    c cVar = c.this;
                    OwnNativeATView ownNativeATView = cVar.f8840c;
                    if (ownNativeATView != null) {
                        cVar.a(ownNativeATView);
                    }
                }
            });
        }
        int N8 = N();
        this.f8882t.f14168o.ap(N8);
        this.f8871p.init(this.f8875A, this.f8876B, N8);
        ViewParent viewParent = this.f8871p;
        if (viewParent instanceof com.anythink.basead.ui.a) {
            a((com.anythink.basead.ui.a) viewParent);
        }
        this.f8840c.addView(this.f8871p, new FrameLayout.LayoutParams(this.f8871p.getMediaViewWidth(), this.f8871p.getMediaViewHeight()));
        this.f8872q = this.f8871p.getContainerClickViews();
        a(this.f8840c, this.f8871p.getClickViews(), null, null, null);
        return this.f8840c;
    }

    @Override // com.anythink.basead.f.a
    public final ViewGroup b() {
        return null;
    }

    @Override // com.anythink.basead.f.b.a.a, com.anythink.basead.f.b.a.d, com.anythink.basead.f.a
    public final void r() {
        super.r();
        BaseMediaATView baseMediaATView = this.f8871p;
        if (baseMediaATView != null) {
            baseMediaATView.destroy();
        }
    }
}
