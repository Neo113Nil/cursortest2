package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d0;
import com.yandex.go.mainscreen.superapp.orders.presentation.ui.SuperAppMainScreenOrdersView;
import com.yandex.go.payments.cards.ui.YbWidgetView;
import com.yandex.go.payments.shared.members.invitation.InvitationView;
import com.yandex.go.payments.shared.z;
import com.yandex.go.taxi.order.y;
import com.yandex.go.yb.data.e;
import com.yandex.go.yb.domain.j;
import io.appmetrica.analytics.impl.C0289e;
import io.appmetrica.analytics.impl.C0390hd;
import io.appmetrica.analytics.locationinternal.impl.v2;
import io.appmetrica.analytics.networkquality.impl.n;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import just.adapter.scroll.ScrollDirection;
import just.adapter.snapping.SnappingAnchor;
import just.adapter.snapping.b;
import just.adapter.snapping.c;
import just.adapter.sticky.a;
import ru.yandex.taxi.activity.ContentContainer$ZOrder;
import ru.yandex.taxi.widget.SlideableModalView;
import skeletor.render.SkeletonContentView;

/* loaded from: classes8.dex */
public final /* synthetic */ class ymp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ymp0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView;
        RecyclerView.e layoutManager;
        d0 b;
        a2t0 a2t0Var;
        t1t0 e;
        int i = this.a;
        boolean z = true;
        String str = null;
        Map map = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                e eVar = (e) ((j) obj).b.get();
                pzt0 pzt0Var = eVar.w;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                eVar.w = null;
                eVar.q.clear();
                return;
            case 1:
                c cVar = ((flex.engine.section.c) obj).Q;
                if (cVar != null) {
                    b bVar = cVar.e;
                    RecyclerView recyclerView2 = cVar.j;
                    if (recyclerView2 == null || recyclerView2.getScrollState() != 0 || (recyclerView = cVar.j) == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
                        return;
                    }
                    if (((layoutManager instanceof LinearLayoutManager) || (layoutManager instanceof gki0)) && (b = cVar.d.b(layoutManager)) != null) {
                        int k = b.k();
                        int g = b.g();
                        int d0 = layoutManager.d0();
                        for (int i2 = 0; i2 < d0; i2++) {
                            View c0 = layoutManager.c0(i2);
                            if (c0 != null && (a2t0Var = (a2t0) cVar.a.invoke(c0)) != null && a2t0Var.d() && (e = a2t0Var.e()) != null) {
                                d2t0 c = a2t0Var.c();
                                if (c != null && new n1t0(layoutManager, cVar.b, SnappingAnchor.START, c0, c, ScrollDirection.IGNORE).d() == k) {
                                    bVar.b();
                                    bVar.c(e);
                                    bVar.a();
                                }
                                d2t0 b2 = a2t0Var.b();
                                if (b2 != null && new n1t0(layoutManager, cVar.b, SnappingAnchor.END, c0, b2, ScrollDirection.IGNORE).d() == g) {
                                    bVar.b();
                                    bVar.c(e);
                                    bVar.a();
                                }
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                pzt0 pzt0Var2 = ((z) ((ror0) obj).b.get()).g;
                if (pzt0Var2 != null) {
                    pzt0Var2.a(null);
                    return;
                }
                return;
            case 3:
                bpr0 bpr0Var = (bpr0) obj;
                x43 x43Var = bpr0Var.g;
                while (bpr0Var.f && x43Var != null && !x43Var.isEmpty()) {
                    xnr0 xnr0Var = (xnr0) x43Var.removeFirst();
                    if (bpr0Var.f) {
                        InvitationView p = xub1.b(bpr0Var.b, xnr0Var).p();
                        ffe ffeVar = bpr0Var.d;
                        ContentContainer$ZOrder contentContainer$ZOrder = ContentContainer$ZOrder.IMPORTANT;
                        ffeVar.a.addView(p);
                        ffeVar.a(p, contentContainer$ZOrder);
                        p.requestFocus();
                    } else {
                        x43Var.addLast(xnr0Var);
                    }
                }
                return;
            case 4:
                SkeletonContentView.setSkeletonProxy$lambda$0((SkeletonContentView) obj);
                return;
            case 5:
                ((SlideableModalView) obj).onArrowClick();
                return;
            case 6:
                ((prt0) obj).d.invoke();
                return;
            case 7:
                ((com.yandex.go.splash.domain.c) obj).d = true;
                return;
            case 8:
                ((a) obj).c(ScrollDirection.IGNORE, 0);
                return;
            case 9:
                ((a2w0) obj).b = null;
                return;
            case 10:
                ((SuperAppMainScreenOrdersView) obj).invalidateItemDecorations();
                return;
            case 11:
                y yVar = ((com.yandex.go.taxi.order.listener.b) obj).c;
                yVar.getClass();
                yVar.t = new yvi0(yVar);
                return;
            case 12:
                ((qhq0) obj).invoke();
                return;
            case 13:
                jp21 jp21Var = (jp21) obj;
                synchronized (jp21Var.g) {
                    try {
                        if (jp21Var.g.isMarked()) {
                            str = (String) jp21Var.g.getReference();
                            jp21Var.g.set(str, false);
                        } else {
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z) {
                    jp21Var.a.i(jp21Var.c, str);
                    return;
                }
                return;
            case 14:
                lxj lxjVar = (lxj) obj;
                ((AtomicReference) lxjVar.a).set(null);
                synchronized (lxjVar) {
                    if (((AtomicMarkableReference) lxjVar.c).isMarked()) {
                        dlx dlxVar = (dlx) ((AtomicMarkableReference) lxjVar.c).getReference();
                        synchronized (dlxVar) {
                            map = Collections.unmodifiableMap(new HashMap(dlxVar.a));
                        }
                        AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) lxjVar.c;
                        atomicMarkableReference.set((dlx) atomicMarkableReference.getReference(), false);
                    }
                }
                if (map != null) {
                    jp21 jp21Var2 = (jp21) lxjVar.d;
                    jp21Var2.a.h(jp21Var2.c, map, lxjVar.b);
                    return;
                }
                return;
            case 15:
                k441 k441Var = ((j441) obj).b;
                k441Var.getClass();
                jst.e.A("WALKING_NAVIGATION");
                k441Var.a.g(zy11.a);
                return;
            case 16:
                ofa0 ofa0Var = (ofa0) obj;
                ((com.google.android.datatransport.runtime.scheduling.persistence.b) ((w0x0) ofa0Var.w)).n(new el11(27, ofa0Var));
                return;
            case 17:
                com.yandex.go.yb.domain.y yVar2 = (com.yandex.go.yb.domain.y) obj;
                yVar2.a.q.remove(yVar2);
                return;
            case 18:
                ((YbWidgetView) obj).invalidate();
                return;
            case 19:
                ((C0289e) obj).a();
                return;
            case 20:
                C0390hd.a((C0390hd) obj);
                return;
            case 21:
                n.a((n) obj);
                return;
            default:
                v2.a((v2) obj);
                return;
        }
    }
}
