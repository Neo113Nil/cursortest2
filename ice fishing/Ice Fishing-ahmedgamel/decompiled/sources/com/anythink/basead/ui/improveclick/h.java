package com.anythink.basead.ui.improveclick;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.anythink.basead.ui.improveclick.c;
import com.anythink.basead.ui.improveclick.incentivetask.BaseIncentiveTaskView;
import com.anythink.basead.ui.improveclick.incentivetask.CountDownSkipIncentiveTaskView;
import com.anythink.basead.ui.improveclick.incentivetask.QAIncentiveTaskView;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.am;
import java.util.Map;

/* loaded from: classes.dex */
public final class h extends c {

    /* renamed from: a, reason: collision with root package name */
    com.anythink.core.common.t.c f11962a;

    /* renamed from: b, reason: collision with root package name */
    BaseIncentiveTaskView f11963b;

    /* renamed from: n, reason: collision with root package name */
    private long f11967n;

    /* renamed from: o, reason: collision with root package name */
    private long f11968o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f11969p;

    /* renamed from: q, reason: collision with root package name */
    private int f11970q;

    /* renamed from: c, reason: collision with root package name */
    private final int f11964c = 1;

    /* renamed from: l, reason: collision with root package name */
    private final int f11965l = 2;

    /* renamed from: m, reason: collision with root package name */
    private final int f11966m = 3;

    /* renamed from: r, reason: collision with root package name */
    private int f11971r = 3;

    public static /* synthetic */ boolean g(h hVar) {
        hVar.f11969p = true;
        return true;
    }

    /* renamed from: com.anythink.basead.ui.improveclick.h$2, reason: invalid class name */
    public class AnonymousClass2 implements BaseIncentiveTaskView.a {
        public AnonymousClass2() {
        }

        @Override // com.anythink.basead.ui.improveclick.incentivetask.BaseIncentiveTaskView.a
        public final void a() {
            h hVar = h.this;
            com.anythink.core.common.u.e.a(hVar.f11926f, hVar.f11925e, hVar.f11968o, h.this.f11969p, h.this.f11967n, h.this.f11971r);
            h.this.c();
        }

        @Override // com.anythink.basead.ui.improveclick.incentivetask.BaseIncentiveTaskView.a
        public final void b() {
            h.g(h.this);
            h hVar = h.this;
            c.a aVar = hVar.f11930k;
            if (aVar != null) {
                aVar.a(16, hVar.f11970q == 3 ? 42 : 13);
            }
        }

        @Override // com.anythink.basead.ui.improveclick.incentivetask.BaseIncentiveTaskView.a
        public final void a(long j6) {
            c.a aVar = h.this.f11930k;
            if (aVar instanceof c.b) {
                ((c.b) aVar).a(j6);
            }
        }

        @Override // com.anythink.basead.ui.improveclick.incentivetask.BaseIncentiveTaskView.a
        public final void a(int i) {
            h.this.f11971r = i;
        }
    }

    private void b() {
        int br = this.f11926f.f14954o.br();
        this.f11970q = br;
        if (br == 2) {
            this.f11963b = new QAIncentiveTaskView(this.f11924d);
        } else if (br == 3) {
            this.f11963b = new CountDownSkipIncentiveTaskView(this.f11924d);
        }
        if (this.f11963b != null) {
            this.f11968o = System.currentTimeMillis();
            this.f11963b.initSetting(this.f11925e, this.f11926f.f14954o, this.f11967n, new AnonymousClass2());
            if (this.i != null) {
                this.i.addView(this.f11963b, new RelativeLayout.LayoutParams(-1, -1));
                c.a aVar = this.f11930k;
                if (aVar instanceof c.b) {
                    ((c.b) aVar).b();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        BaseIncentiveTaskView baseIncentiveTaskView = this.f11963b;
        if (baseIncentiveTaskView != null) {
            am.a(baseIncentiveTaskView);
            c.a aVar = this.f11930k;
            if (aVar instanceof c.b) {
                ((c.b) aVar).a();
            }
            this.f11963b.release();
            this.f11963b = null;
        }
    }

    @Override // com.anythink.basead.ui.improveclick.c
    public final void a(Context context, w wVar, x xVar, ViewGroup viewGroup, RelativeLayout relativeLayout, View view, int i, c.a aVar) {
        super.a(context, wVar, xVar, viewGroup, relativeLayout, view, i, aVar);
    }

    @Override // com.anythink.basead.ui.improveclick.c
    public final void a(int i, Map<String, Object> map) {
        if (i != 107 && i != 108) {
            if (i == 114) {
                if (this.f11962a == null) {
                    this.f11962a = new com.anythink.core.common.t.c(this.f11926f.f14954o.bs(), new Runnable() { // from class: com.anythink.basead.ui.improveclick.h.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            h.a(h.this);
                        }
                    }, true);
                }
                Object obj = map.get("video_length");
                if (obj != null && (obj instanceof Long)) {
                    this.f11967n = ((Long) obj).longValue();
                }
                com.anythink.core.common.t.c cVar = this.f11962a;
                if (cVar != null) {
                    cVar.a();
                    return;
                }
                return;
            }
            if (i != 120) {
                switch (i) {
                    case 110:
                        com.anythink.core.common.t.c cVar2 = this.f11962a;
                        if (cVar2 != null) {
                            cVar2.a();
                        }
                        BaseIncentiveTaskView baseIncentiveTaskView = this.f11963b;
                        if (baseIncentiveTaskView != null) {
                            baseIncentiveTaskView.onResume();
                            break;
                        }
                        break;
                    case 111:
                        com.anythink.core.common.t.c cVar3 = this.f11962a;
                        if (cVar3 != null) {
                            cVar3.b();
                        }
                        BaseIncentiveTaskView baseIncentiveTaskView2 = this.f11963b;
                        if (baseIncentiveTaskView2 != null) {
                            baseIncentiveTaskView2.onPause();
                            break;
                        }
                        break;
                }
                return;
            }
        }
        a();
    }

    @Override // com.anythink.basead.ui.improveclick.c
    public final void a() {
        com.anythink.core.common.t.c cVar = this.f11962a;
        if (cVar != null) {
            cVar.c();
            this.f11962a = null;
        }
        c();
    }

    public static /* synthetic */ void a(h hVar) {
        int br = hVar.f11926f.f14954o.br();
        hVar.f11970q = br;
        if (br == 2) {
            hVar.f11963b = new QAIncentiveTaskView(hVar.f11924d);
        } else if (br == 3) {
            hVar.f11963b = new CountDownSkipIncentiveTaskView(hVar.f11924d);
        }
        if (hVar.f11963b != null) {
            hVar.f11968o = System.currentTimeMillis();
            hVar.f11963b.initSetting(hVar.f11925e, hVar.f11926f.f14954o, hVar.f11967n, hVar.new AnonymousClass2());
            if (hVar.i != null) {
                hVar.i.addView(hVar.f11963b, new RelativeLayout.LayoutParams(-1, -1));
                c.a aVar = hVar.f11930k;
                if (aVar instanceof c.b) {
                    ((c.b) aVar).b();
                }
            }
        }
    }
}
