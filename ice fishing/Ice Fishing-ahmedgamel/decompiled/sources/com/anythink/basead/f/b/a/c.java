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
    BaseMediaATView f9657p;

    /* renamed from: q, reason: collision with root package name */
    List<View> f9658q;

    public static class a implements BaseMediaATView.a {

        /* renamed from: a, reason: collision with root package name */
        private final BaseMediaATView.a f9660a;

        public a(BaseMediaATView.a aVar) {
            this.f9660a = aVar;
        }

        @Override // com.anythink.basead.ui.BaseMediaATView.a
        public final void onClickCloseView() {
            BaseMediaATView.a aVar = this.f9660a;
            if (aVar != null) {
                aVar.onClickCloseView();
            }
        }
    }

    public c(Context context, bj bjVar, x xVar, boolean z6) {
        super(context, bjVar, xVar, z6);
    }

    private int N() {
        int bi = this.f9668t.f14954o.bi();
        if (bi > 0) {
            return bi;
        }
        JSONArray jSONArray = this.f9663C;
        if (jSONArray == null) {
            return 6;
        }
        try {
            int optInt = this.f9663C.optInt(new Random().nextInt(jSONArray.length()));
            if (optInt <= 0) {
                return 6;
            }
            this.f9663C.toString();
            return optInt;
        } catch (Throwable unused) {
            return 6;
        }
    }

    @Override // com.anythink.basead.f.b.a.a, com.anythink.basead.f.b.a.d
    public final View H() {
        return this.f9667s.n() ? this.f9657p : super.H();
    }

    @Override // com.anythink.basead.f.b.a.a
    public final void I() {
        super.I();
        if (this.f9672x && this.f9667s.n()) {
            BaseMediaATView baseMediaATView = this.f9657p;
            if (baseMediaATView instanceof MraidMediaView) {
                ((MraidMediaView) baseMediaATView).fireAudioVolumeChange(this.f9672x);
            }
        }
    }

    @Override // com.anythink.basead.f.b.a.a
    public final List<View> J() {
        return this.f9658q;
    }

    @Override // com.anythink.basead.f.b.a.a
    public final void K() {
        BaseMediaATView baseMediaATView = this.f9657p;
        if (baseMediaATView != null) {
            baseMediaATView.changeCloseViewSizeAfterClick();
        }
    }

    @Override // com.anythink.basead.f.b.a.a
    public final View L() {
        OwnNativeATView ownNativeATView = this.f9626c;
        BaseMediaATView baseMediaATView = this.f9657p;
        if (baseMediaATView == null || baseMediaATView.getMonitorClickView() == null) {
            return ownNativeATView;
        }
        View monitorClickView = this.f9657p.getMonitorClickView();
        this.f9627d = new WeakReference<>(monitorClickView);
        return monitorClickView;
    }

    @Override // com.anythink.basead.f.a
    public final View a(Context context, boolean z6, BaseMediaATView.a aVar) {
        if (!p()) {
            return null;
        }
        if (this.f9626c == null) {
            this.f9626c = G();
        }
        a aVar2 = new a(aVar);
        bj bjVar = this.f9667s;
        if (bjVar == null || !bjVar.n()) {
            this.f9657p = new MediaATView(context, this.f9667s, this.f9668t, z6, aVar2);
        } else {
            MraidMediaView mraidMediaView = new MraidMediaView(context, this.f9667s, this.f9668t, z6, aVar2, this.f9635m);
            this.f9657p = mraidMediaView;
            mraidMediaView.setMraidWebViewListener(new MraidMediaView.a() { // from class: com.anythink.basead.f.b.a.c.1
                @Override // com.anythink.basead.ui.MraidMediaView.a
                public final void a(String str) {
                    bj bjVar2 = c.this.f9667s;
                    if (bjVar2 != null) {
                        bjVar2.w(str);
                    }
                    c cVar = c.this;
                    cVar.a(cVar.f9657p, 1, 13);
                }

                @Override // com.anythink.basead.ui.MraidMediaView.a
                public final void a() {
                    c cVar = c.this;
                    OwnNativeATView ownNativeATView = cVar.f9626c;
                    if (ownNativeATView != null) {
                        cVar.a(ownNativeATView);
                    }
                }
            });
        }
        int N8 = N();
        this.f9668t.f14954o.ap(N8);
        this.f9657p.init(this.f9661A, this.f9662B, N8);
        ViewParent viewParent = this.f9657p;
        if (viewParent instanceof com.anythink.basead.ui.a) {
            a((com.anythink.basead.ui.a) viewParent);
        }
        this.f9626c.addView(this.f9657p, new FrameLayout.LayoutParams(this.f9657p.getMediaViewWidth(), this.f9657p.getMediaViewHeight()));
        this.f9658q = this.f9657p.getContainerClickViews();
        a(this.f9626c, this.f9657p.getClickViews(), null, null, null);
        return this.f9626c;
    }

    @Override // com.anythink.basead.f.a
    public final ViewGroup b() {
        return null;
    }

    @Override // com.anythink.basead.f.b.a.a, com.anythink.basead.f.b.a.d, com.anythink.basead.f.a
    public final void r() {
        super.r();
        BaseMediaATView baseMediaATView = this.f9657p;
        if (baseMediaATView != null) {
            baseMediaATView.destroy();
        }
    }
}
