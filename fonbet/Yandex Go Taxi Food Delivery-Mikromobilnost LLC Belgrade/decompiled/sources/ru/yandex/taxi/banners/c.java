package ru.yandex.taxi.banners;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import com.yandex.go.analytics.realtime.event.CreativeType;
import com.yandex.go.top_modal.api.priority.PopupPriorityLauncher$PopupType;
import defpackage.aae0;
import defpackage.b7;
import defpackage.bae0;
import defpackage.cay0;
import defpackage.cb8;
import defpackage.cv4;
import defpackage.d1;
import defpackage.dae0;
import defpackage.dei0;
import defpackage.duc;
import defpackage.e100;
import defpackage.esc;
import defpackage.gep0;
import defpackage.hpo0;
import defpackage.iei0;
import defpackage.is4;
import defpackage.iu4;
import defpackage.jo0;
import defpackage.jpu0;
import defpackage.jt4;
import defpackage.kr4;
import defpackage.ku4;
import defpackage.ltc;
import defpackage.lu4;
import defpackage.mu4;
import defpackage.pav;
import defpackage.pzt0;
import defpackage.qu4;
import defpackage.r94;
import defpackage.rfw0;
import defpackage.shs;
import defpackage.tg60;
import defpackage.tje;
import defpackage.tse;
import defpackage.vby;
import defpackage.vd2;
import defpackage.xby;
import defpackage.xg;
import defpackage.xsc;
import defpackage.yes0;
import defpackage.yvi0;
import defpackage.zi;
import defpackage.zi20;
import defpackage.zpf0;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.banners.model.g;
import ru.yandex.taxi.banners.model.h;
import ru.yandex.taxi.communications.api.dto.Story;
import ru.yandex.taxi.design.NotificationStackComponent;
import ru.yandex.taxi.promotions.model.Promotion;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.taxi.widget.progress.SimpleSpinnerModalView;

/* loaded from: classes9.dex */
public final class c implements jt4 {
    public final is4 a;
    public final h b;
    public final yvi0 c;
    public final cv4 d;
    public final gep0 e;
    public final g f;
    public final b7 g;
    public final ltc h;
    public final duc i;
    public final jpu0 j;
    public final rfw0 k;
    public final Lifecycle l;
    public final tse m;
    public final zpf0 n;
    public NotificationStackComponent o;
    public pzt0 p;
    public boolean v;
    public String q = "#none#";
    public String r = "#none#";
    public final BannersController$hierarchyChangeListener$1 s = new ViewGroup.OnHierarchyChangeListener() { // from class: ru.yandex.taxi.banners.BannersController$hierarchyChangeListener$1
        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view1) {
            c cVar = c.this;
            Iterator it = cVar.z.iterator();
            while (it.hasNext()) {
                ((Consumer) it.next()).accept(Boolean.valueOf(cVar.d()));
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view1) {
            c cVar = c.this;
            Iterator it = cVar.z.iterator();
            while (it.hasNext()) {
                ((Consumer) it.next()).accept(Boolean.valueOf(cVar.d()));
            }
            Object tag = view1.getTag();
            if (tag != null) {
                duc ducVar = c.this.i;
                ((dae0) ducVar.a).d(tag.toString());
            }
        }
    };
    public final ConcurrentHashMap t = new ConcurrentHashMap();
    public final Set u = Collections.newSetFromMap(new ConcurrentHashMap());
    public final b7 w = new b7(11, this);
    public final b x = new b(this, 0);
    public final b y = new b(this, 1);
    public final CopyOnWriteArrayList z = new CopyOnWriteArrayList();
    public final xg A = new xg();

    /* JADX WARN: Type inference failed for: r1v2, types: [ru.yandex.taxi.banners.BannersController$hierarchyChangeListener$1] */
    public c(is4 is4Var, h hVar, yvi0 yvi0Var, cv4 cv4Var, gep0 gep0Var, g gVar, b7 b7Var, ltc ltcVar, duc ducVar, jpu0 jpu0Var, rfw0 rfw0Var, Lifecycle lifecycle, tse tseVar, zpf0 zpf0Var) {
        this.a = is4Var;
        this.b = hVar;
        this.c = yvi0Var;
        this.d = cv4Var;
        this.e = gep0Var;
        this.f = gVar;
        this.g = b7Var;
        this.h = ltcVar;
        this.i = ducVar;
        this.j = jpu0Var;
        this.k = rfw0Var;
        this.l = lifecycle;
        this.m = tseVar;
        this.n = zpf0Var;
    }

    public static boolean f(c cVar, Promotion promotion, String str) {
        NotificationStackComponent notificationStackComponent = cVar.o;
        int i = 1;
        boolean z = notificationStackComponent == null || !notificationStackComponent.getIsExpanded();
        if (!cVar.d() && promotion != h.x && z) {
            String b = promotion.getB();
            r94 r94Var = new r94(i, str, cVar, promotion);
            ConcurrentHashMap concurrentHashMap = cVar.t;
            if (cVar.v) {
                if (cVar.u.add(b) && !concurrentHashMap.containsKey(b)) {
                    r94Var.run();
                    return true;
                }
            } else if (!concurrentHashMap.containsKey(b)) {
                concurrentHashMap.put(b, r94Var);
                return true;
            }
        }
        return false;
    }

    public static void l(c cVar, String str, String str2, esc escVar, Runnable runnable, Consumer consumer, int i) {
        esc escVar2 = (i & 4) != 0 ? null : escVar;
        Runnable runnable2 = (i & 8) != 0 ? null : runnable;
        if ((i & 16) != 0) {
            consumer = null;
        }
        cVar.getClass();
        cVar.g(str, consumer, null, new ku4(cVar, str2, escVar2, runnable2, 0), new zi(21), true);
    }

    public static /* synthetic */ void m(c cVar, Promotion promotion, String str, kr4 kr4Var, esc escVar, int i) {
        if ((i & 8) != 0) {
            escVar = null;
        }
        cVar.k(promotion, str, kr4Var, escVar, null);
    }

    @Override // defpackage.jt4
    public final boolean a(vd2 vd2Var) {
        return this.z.contains(vd2Var);
    }

    @Override // defpackage.jt4
    public final void b(Consumer consumer) {
        this.z.remove(consumer);
    }

    @Override // defpackage.jt4
    public final void c(Consumer consumer) {
        this.z.add(consumer);
        consumer.accept(Boolean.valueOf(d()));
    }

    public final boolean d() {
        return this.a.a.getChildCount() != 0;
    }

    public final void e() {
        pzt0 pzt0Var = this.p;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.p = null;
        yes0 yes0Var = SimpleSpinnerModalView.Companion;
        ViewGroup viewGroup = this.a.a;
        yes0Var.getClass();
        yes0.b(viewGroup);
    }

    public final void g(String str, Consumer consumer, Runnable runnable, Consumer consumer2, Runnable runnable2, boolean z) {
        e();
        if (z) {
            yes0 yes0Var = SimpleSpinnerModalView.Companion;
            ViewGroup viewGroup = this.a.a;
            d1 d1Var = new d1(4, runnable, this, runnable2);
            yes0Var.getClass();
            yes0.d(viewGroup, new hpo0(2, viewGroup, runnable2, d1Var));
        }
        this.p = tje.N(this.m, null, null, new BannersController$loadBanner$4(this, str, consumer2, runnable2, consumer, null), 3);
    }

    public final Object h(Continuation continuation) {
        return b0.b(this.l, Lifecycle.State.STARTED, new BannersController$onBannersProcessingStarted$2(this, null), continuation);
    }

    public final void i() {
        if (!this.d.a.contains(this.r)) {
            tje.N(this.m, null, null, new BannersController$processCardAndFullscreenBanners$1(this, null), 3);
        } else {
            vby vbyVar = xby.d;
            String.format("banners was already shown for screen %s", Arrays.copyOf(new Object[]{this.r}, 1));
            vbyVar.getClass();
        }
    }

    public final void j() {
        if (this.f.i == null) {
            return;
        }
        tje.N(this.m, null, null, new BannersController$processGeoCardAndFullscreenBanners$1(this, null), 3);
    }

    public final void k(Promotion promotion, String str, kr4 kr4Var, esc escVar, String str2) {
        String b = promotion.getB();
        gep0 gep0Var = this.e;
        xsc xscVar = new xsc(b, str2 == null ? ((cay0) gep0Var).b() : str2, escVar);
        kr4Var.a();
        boolean z = promotion instanceof shs;
        duc ducVar = this.i;
        if (z) {
            shs shsVar = (shs) promotion;
            vby vbyVar = xby.d;
            String.format("push fullscreen banner %s to priority queue", Arrays.copyOf(new Object[]{xscVar}, 1));
            vbyVar.getClass();
            ((dae0) ducVar.a).c(shsVar.b, PopupPriorityLauncher$PopupType.Fullscreen, duc.a(xscVar), new aae0(shsVar.c), shsVar.e, new jo0(3, shsVar, this, kr4Var, str));
            return;
        }
        if (promotion instanceof cb8) {
            cb8 cb8Var = (cb8) promotion;
            vby vbyVar2 = xby.d;
            String.format("push card banner %s to priority queue", Arrays.copyOf(new Object[]{xscVar}, 1));
            vbyVar2.getClass();
            ((dae0) ducVar.a).c(cb8Var.b, PopupPriorityLauncher$PopupType.Card, duc.a(xscVar), new aae0(cb8Var.c), cb8Var.e, new jo0(4, cb8Var, this, kr4Var, str));
            return;
        }
        if (promotion instanceof ru.yandex.taxi.communications.api.dto.ticket.a) {
            ru.yandex.taxi.communications.api.dto.ticket.a aVar = (ru.yandex.taxi.communications.api.dto.ticket.a) promotion;
            vby vbyVar3 = xby.d;
            String.format("push ticket banner %s to priority queue", Arrays.copyOf(new Object[]{xscVar}, 1));
            vbyVar3.getClass();
            bae0.a(ducVar.a, aVar.b, PopupPriorityLauncher$PopupType.Ticket, duc.a(xscVar), new aae0(aVar.c), new mu4(aVar, this), 16);
            return;
        }
        if (!(promotion instanceof zi20)) {
            if (promotion instanceof Story) {
                Story story = (Story) promotion;
                xsc xscVar2 = new xsc(story.b, str2 == null ? ((cay0) gep0Var).b() : str2, escVar);
                vby vbyVar4 = xby.d;
                String.format("push story %s to priority queue", Arrays.copyOf(new Object[]{xscVar2}, 1));
                vbyVar4.getClass();
                bae0.a(ducVar.a, story.b, PopupPriorityLauncher$PopupType.Story, duc.a(xscVar2), new aae0(story.c), new lu4(story, this), 16);
                return;
            }
            return;
        }
        zi20 zi20Var = (zi20) promotion;
        String b2 = str2 == null ? ((cay0) gep0Var).b() : str2;
        zpf0 zpf0Var = this.n;
        zpf0Var.getClass();
        Map map = zi20Var.c;
        if (map != null) {
            dei0 dei0Var = zpf0Var.a;
            CreativeType f = zpf0.f(zi20Var);
            String str3 = zi20Var.b;
            MapBuilder mapBuilder = new MapBuilder();
            mapBuilder.put(MetaDataField.SCREEN_FIELD, b2);
            ((com.yandex.go.analytics.realtime.a) dei0Var).d(new iei0(f, str3, map, mapBuilder.j()));
        }
        this.b.k(zi20Var.b, null, Promotion.Type.MISSED_SEEN, false, b2, zi20Var.e);
    }

    public final void n(tg60 tg60Var) {
        NotificationStackComponent notificationStackComponent = this.o;
        if (notificationStackComponent == null) {
            return;
        }
        qu4 qu4Var = (qu4) this.c.a;
        e100 e100Var = new e100(28, tg60Var, qu4Var, notificationStackComponent);
        iu4 iu4Var = qu4Var.a;
        this.o.showNotification(new NotificationBannerView(qu4Var.b, e100Var.g(), iu4Var.a(), (pav) iu4Var.z.getValue(), iu4Var.r, tg60Var));
    }

    public final boolean o() {
        if (!d()) {
            return false;
        }
        is4 is4Var = this.a;
        ViewGroup viewGroup = is4Var.a;
        View childAt = viewGroup.getChildAt(viewGroup.getChildCount() - 1);
        if (childAt instanceof ModalView) {
            ((ModalView) childAt).dismiss();
        } else {
            is4Var.a.removeView(childAt);
        }
        return true;
    }
}
