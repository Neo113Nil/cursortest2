package com.anythink.basead.ui.improveclick;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.anythink.basead.ui.improveclick.c;
import com.anythink.basead.ui.improveclick.g;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import java.util.Map;

/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f11302a = 2;

    /* renamed from: b, reason: collision with root package name */
    public static final int f11303b = 3;

    /* renamed from: c, reason: collision with root package name */
    public static final int f11304c = 4;

    /* renamed from: l, reason: collision with root package name */
    public static final int f11305l = 5;

    /* renamed from: m, reason: collision with root package name */
    com.anythink.basead.ui.c.a f11306m;

    /* renamed from: n, reason: collision with root package name */
    boolean f11307n = false;

    public interface a {
        View a();

        void a(boolean z8);

        void b();

        View c();

        void d();
    }

    @Override // com.anythink.basead.ui.improveclick.c
    public final void a(Context context, w wVar, x xVar, ViewGroup viewGroup, RelativeLayout relativeLayout, View view, int i, c.a aVar) {
        super.a(context, wVar, xVar, viewGroup, relativeLayout, view, i, aVar);
        int aQ = xVar.f14325o.aQ();
        if (aQ == 2) {
            this.f11306m = new com.anythink.basead.ui.c.b(context, wVar, xVar, aVar, i, viewGroup);
            return;
        }
        if (aQ == 3) {
            this.f11306m = new com.anythink.basead.ui.c.c(context, wVar, xVar, aVar, i, viewGroup);
        } else if (aQ == 4) {
            this.f11306m = new com.anythink.basead.ui.c.e(context, wVar, xVar, aVar, i, viewGroup);
        } else {
            if (aQ != 5) {
                return;
            }
            this.f11306m = new com.anythink.basead.ui.c.d(context, wVar, xVar, aVar, i, viewGroup);
        }
    }

    @Override // com.anythink.basead.ui.improveclick.c
    public final void a(int i, Map<String, Object> map) {
        com.anythink.basead.ui.c.a aVar;
        if (i == 102) {
            if (this.f11307n || (aVar = this.f11306m) == null) {
                return;
            }
            aVar.a();
            return;
        }
        if (i == 103) {
            if (!this.f11307n) {
                com.anythink.basead.ui.c.a aVar2 = this.f11306m;
                if (aVar2 != null) {
                    aVar2.a(this.i);
                    return;
                }
                return;
            }
            if (com.anythink.basead.b.e.e(this.f11296e, this.f11297f)) {
                return;
            }
            com.anythink.core.common.u.e.a(this.f11296e, this.f11297f, com.anythink.basead.b.e.a(this.f11297f, this.f11298g.getContext()));
            return;
        }
        if (i == 112) {
            a();
            return;
        }
        if (i == 113) {
            this.f11307n = true;
            com.anythink.basead.ui.c.a aVar3 = this.f11306m;
            if (aVar3 != null) {
                aVar3.d();
                return;
            }
            return;
        }
        if (i != 125) {
            return;
        }
        Object obj = map.get(g.a.f11331j);
        if (((obj == null || !(obj instanceof Integer)) ? 0 : ((Integer) obj).intValue()) == 1) {
            a();
        }
    }

    @Override // com.anythink.basead.ui.improveclick.c
    public final void a() {
        com.anythink.basead.ui.c.a aVar = this.f11306m;
        if (aVar != null) {
            aVar.e();
            this.f11306m = null;
        }
    }

    private void a(a aVar) {
        com.anythink.basead.ui.c.a aVar2 = this.f11306m;
        if (aVar2 != null) {
            aVar2.a(aVar);
        }
    }
}
