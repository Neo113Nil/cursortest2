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
    BaseMediaATView f9028p;

    /* renamed from: q, reason: collision with root package name */
    List<View> f9029q;

    public static class a implements BaseMediaATView.a {

        /* renamed from: a, reason: collision with root package name */
        private final BaseMediaATView.a f9031a;

        public a(BaseMediaATView.a aVar) {
            this.f9031a = aVar;
        }

        @Override // com.anythink.basead.ui.BaseMediaATView.a
        public final void onClickCloseView() {
            BaseMediaATView.a aVar = this.f9031a;
            if (aVar != null) {
                aVar.onClickCloseView();
            }
        }
    }

    public c(Context context, bj bjVar, x xVar, boolean z8) {
        super(context, bjVar, xVar, z8);
    }

    private int N() {
        int bi = this.f9039t.f14325o.bi();
        if (bi > 0) {
            return bi;
        }
        JSONArray jSONArray = this.f9034C;
        if (jSONArray == null) {
            return 6;
        }
        try {
            int optInt = this.f9034C.optInt(new Random().nextInt(jSONArray.length()));
            if (optInt <= 0) {
                return 6;
            }
            this.f9034C.toString();
            return optInt;
        } catch (Throwable unused) {
            return 6;
        }
    }

    @Override // com.anythink.basead.f.b.a.a, com.anythink.basead.f.b.a.d
    public final View H() {
        return this.f9038s.n() ? this.f9028p : super.H();
    }

    @Override // com.anythink.basead.f.b.a.a
    public final void I() {
        super.I();
        if (this.f9043x && this.f9038s.n()) {
            BaseMediaATView baseMediaATView = this.f9028p;
            if (baseMediaATView instanceof MraidMediaView) {
                ((MraidMediaView) baseMediaATView).fireAudioVolumeChange(this.f9043x);
            }
        }
    }

    @Override // com.anythink.basead.f.b.a.a
    public final List<View> J() {
        return this.f9029q;
    }

    @Override // com.anythink.basead.f.b.a.a
    public final void K() {
        BaseMediaATView baseMediaATView = this.f9028p;
        if (baseMediaATView != null) {
            baseMediaATView.changeCloseViewSizeAfterClick();
        }
    }

    @Override // com.anythink.basead.f.b.a.a
    public final View L() {
        OwnNativeATView ownNativeATView = this.f8997c;
        BaseMediaATView baseMediaATView = this.f9028p;
        if (baseMediaATView == null || baseMediaATView.getMonitorClickView() == null) {
            return ownNativeATView;
        }
        View monitorClickView = this.f9028p.getMonitorClickView();
        this.f8998d = new WeakReference<>(monitorClickView);
        return monitorClickView;
    }

    @Override // com.anythink.basead.f.a
    public final View a(Context context, boolean z8, BaseMediaATView.a aVar) {
        if (!p()) {
            return null;
        }
        if (this.f8997c == null) {
            this.f8997c = G();
        }
        a aVar2 = new a(aVar);
        bj bjVar = this.f9038s;
        if (bjVar == null || !bjVar.n()) {
            this.f9028p = new MediaATView(context, this.f9038s, this.f9039t, z8, aVar2);
        } else {
            MraidMediaView mraidMediaView = new MraidMediaView(context, this.f9038s, this.f9039t, z8, aVar2, this.f9006m);
            this.f9028p = mraidMediaView;
            mraidMediaView.setMraidWebViewListener(new MraidMediaView.a() { // from class: com.anythink.basead.f.b.a.c.1
                @Override // com.anythink.basead.ui.MraidMediaView.a
                public final void a(String str) {
                    bj bjVar2 = c.this.f9038s;
                    if (bjVar2 != null) {
                        bjVar2.w(str);
                    }
                    c cVar = c.this;
                    cVar.a(cVar.f9028p, 1, 13);
                }

                @Override // com.anythink.basead.ui.MraidMediaView.a
                public final void a() {
                    c cVar = c.this;
                    OwnNativeATView ownNativeATView = cVar.f8997c;
                    if (ownNativeATView != null) {
                        cVar.a(ownNativeATView);
                    }
                }
            });
        }
        int N8 = N();
        this.f9039t.f14325o.ap(N8);
        this.f9028p.init(this.f9032A, this.f9033B, N8);
        ViewParent viewParent = this.f9028p;
        if (viewParent instanceof com.anythink.basead.ui.a) {
            a((com.anythink.basead.ui.a) viewParent);
        }
        this.f8997c.addView(this.f9028p, new FrameLayout.LayoutParams(this.f9028p.getMediaViewWidth(), this.f9028p.getMediaViewHeight()));
        this.f9029q = this.f9028p.getContainerClickViews();
        a(this.f8997c, this.f9028p.getClickViews(), null, null, null);
        return this.f8997c;
    }

    @Override // com.anythink.basead.f.a
    public final ViewGroup b() {
        return null;
    }

    @Override // com.anythink.basead.f.b.a.a, com.anythink.basead.f.b.a.d, com.anythink.basead.f.a
    public final void r() {
        super.r();
        BaseMediaATView baseMediaATView = this.f9028p;
        if (baseMediaATView != null) {
            baseMediaATView.destroy();
        }
    }
}
