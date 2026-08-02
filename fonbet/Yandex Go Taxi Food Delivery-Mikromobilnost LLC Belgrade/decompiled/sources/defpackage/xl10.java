package defpackage;

import android.view.MenuItem;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.room.util.a;
import com.google.android.material.navigation.NavigationBarView;
import com.yandex.go.layers.domain.g;
import com.yandex.go.masstransit.sdk.order.api.tickets.analytics.MtTicketActivationType;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.OrderDetailsSectionTitlesExperiment;
import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.messaging.internal.ChatAlias;
import com.yandex.messaging.internal.CreateChannel;
import com.yandex.messaging.internal.CreateFamilyChat;
import com.yandex.messaging.internal.CreateGroupChat;
import com.yandex.messaging.internal.ExistingChat;
import com.yandex.messaging.internal.InviteChat;
import com.yandex.messaging.internal.InviteThread;
import com.yandex.messaging.internal.PrivateChat;
import com.yandex.messaging.internal.StaffChat;
import com.yandex.messaging.internal.ThreadChat;
import com.yandex.messaging.internal.entities.ChatId;
import com.yandex.payment.sdk.core.data.BoundCard;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.ybsdk.core.common.domain.entities.BottomBarItemId;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.feature.merchant.offers.internal.screens.root.ShimmerType;
import com.ybsdk.rconfig.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import ru.yandex.taxi.masstransit.tickets.analyticks.MasstransitTicketsAnalytics$TicketActivationType;
import ru.yandex.taxi.widget.dialog.AlertDialog;

/* loaded from: classes10.dex */
public final class xl10 implements fx, ev31, k8b, ca20, sj10, ryj0, on8, rt41, hr20 {
    public final Object a;

    public xl10(o2y0 o2y0Var) {
        OrderStatusInfo V = o2y0Var.b().V();
        qn11 qn11Var = OrderDetailsSectionTitlesExperiment.e;
        qn11 b = V.b(OrderDetailsSectionTitlesExperiment.class);
        this.a = (OrderDetailsSectionTitlesExperiment) (b != null ? b : qn11Var);
    }

    public static v510 f(r640 r640Var) {
        String str = r640Var.a;
        MtTicketActivationType mtTicketActivationType = r640Var.b;
        return new v510(str, mtTicketActivationType != null ? g(mtTicketActivationType) : null);
    }

    public static MasstransitTicketsAnalytics$TicketActivationType g(MtTicketActivationType mtTicketActivationType) {
        int i = u740.a[mtTicketActivationType.ordinal()];
        if (i == 1) {
            return MasstransitTicketsAnalytics$TicketActivationType.QR;
        }
        if (i == 2) {
            return MasstransitTicketsAnalytics$TicketActivationType.NFC;
        }
        w511.b();
        return null;
    }

    public void a() {
        ((g) this.a).c(rfu0.i);
    }

    @Override // defpackage.on8
    public void b(nn8 nn8Var) {
        ((p560) this.a).k.l(nn8Var);
    }

    @Override // defpackage.k8b
    public Object c(ExistingChat existingChat) {
        return ((k020) this.a).l(existingChat.id());
    }

    public void d(String str, String str2, String str3, String str4, sls slsVar, sls slsVar2) {
        AlertDialog a = ((uq1) this.a).a();
        a.setTitle(str);
        if (str2.length() > 0) {
            a.setMessage(str2);
        }
        a.setPositiveButton(str3, new ijs(15, slsVar));
        if (str4 != null && str4.length() > 0) {
            a.setNegativeButton(str4, slsVar2 != null ? new ijs(16, slsVar2) : null);
        }
        a.setCancelable(false);
        a.show();
    }

    public void e(Route route, List list, fay0 fay0Var, List list2) {
        xus xusVar = (xus) this.a;
        cg30 cg30Var = (cg30) ((yvf0) xusVar.E).get();
        xusVar.H = cg30Var;
        xusVar.A(cg30Var, new bg30(route, fay0Var, list, new q6s0(false, false), list2, 200), sy60.Q2);
    }

    @Override // defpackage.hr20
    public String get(String str) {
        return ((kvj0) this.a).y.a(str);
    }

    @Override // defpackage.ryj0
    public void i(Object obj) {
        l560 l560Var = (l560) this.a;
        l560Var.y.l(kl41.a);
        l560Var.w.l(new in8((PaymentKitError) obj));
    }

    @Override // defpackage.k8b
    public /* bridge */ /* synthetic */ Object j(CreateChannel createChannel) {
        return null;
    }

    @Override // defpackage.k8b
    public Object k(InviteThread inviteThread) {
        k020 k020Var = (k020) this.a;
        String str = (String) a.b(k020Var.b.Y().a, true, false, new b5a(inviteThread.inviteHash(), 20));
        if (str == null) {
            return null;
        }
        return k020Var.l(ChatId.Companion.a(str).b(inviteThread.getParentMessageTs()).a);
    }

    @Override // defpackage.rt41
    public void l() {
        ((sl60) this.a).r();
    }

    @Override // defpackage.k8b
    public Object m(InviteChat inviteChat) {
        k020 k020Var = (k020) this.a;
        String str = (String) a.b(k020Var.b.Y().a, true, false, new b5a(inviteChat.inviteHash(), 20));
        if (str != null) {
            return k020Var.l(str);
        }
        return null;
    }

    @Override // defpackage.k8b
    public /* bridge */ /* synthetic */ Object n(StaffChat staffChat) {
        return null;
    }

    @Override // defpackage.rt41
    public void onCanceled() {
        ((sl60) this.a).a();
    }

    @Override // defpackage.sj10
    public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
        NavigationBarView navigationBarView = (NavigationBarView) this.a;
        NavigationBarView.access$000(navigationBarView);
        NavigationBarView.access$100(navigationBarView);
        return false;
    }

    @Override // defpackage.sj10
    public void onMenuModeChange(MenuBuilder menuBuilder) {
    }

    @Override // defpackage.ca20
    public void onMethodCall(x920 x920Var, da20 da20Var) {
        uk10 uk10Var = (uk10) this.a;
        if (((io.flutter.plugin.mouse.a) uk10Var.a) == null) {
            return;
        }
        String str = x920Var.a;
        try {
            if (str.hashCode() == -1307105544 && str.equals("activateSystemCursor")) {
                try {
                    ((io.flutter.plugin.mouse.a) uk10Var.a).a((String) ((HashMap) x920Var.b).get("kind"));
                    ((ba20) da20Var).success(Boolean.TRUE);
                } catch (Exception e) {
                    ((ba20) da20Var).error("error", "Error when setting cursors: " + e.getMessage(), null);
                }
            }
        } catch (Exception e2) {
            ((ba20) da20Var).error("error", "Unhandled error: " + e2.getMessage(), null);
        }
    }

    @Override // defpackage.ryj0
    public void onSuccess(Object obj) {
        l560 l560Var = (l560) this.a;
        l560Var.y.l(kl41.a);
        l560Var.w.l(new ln8((BoundCard) obj));
    }

    @Override // defpackage.k8b
    public /* bridge */ /* synthetic */ Object p(ChatAlias chatAlias) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [rbv] */
    /* JADX WARN: Type inference failed for: r14v3 */
    @Override // defpackage.ev31
    public Object q(Object obj) {
        wp10 vp10Var;
        rw51 rw51Var;
        ArrayList arrayList;
        Object obj2;
        nq10 nq10Var = (nq10) obj;
        qp10 qp10Var = (qp10) this.a;
        pp10 pp10Var = nq10Var.d;
        rp10 rp10Var = nq10Var.b;
        rb6 c = fab1.c(nq10Var.a, BottomBarItemId.MERCHANTS);
        Throwable th = nq10Var.c;
        if (th != null) {
            vp10Var = new up10(r501.a(th, null, null, null, null, null, null, null, null, null, null, null, null, 65534));
        } else if (rp10Var != null) {
            List list = rp10Var.a;
            ColorModel colorModel = null;
            if (list != null) {
                List list2 = list;
                ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new qw51(0, ((ro10) it.next()).i));
                }
                rw51Var = new rw51(arrayList2, null, null);
            } else {
                rw51Var = null;
            }
            if (list != null) {
                List<ro10> list3 = list;
                arrayList = new ArrayList(tcc.n(list3, 10));
                for (ro10 ro10Var : list3) {
                    rr51 rr51Var = ro10Var.a;
                    String str = ro10Var.b;
                    fxy0 fxy0Var = ro10Var.c;
                    ColorModel e = fxy0Var != null ? lvy0.e((String) fxy0Var.b, (String) fxy0Var.a) : colorModel;
                    ThemedImageUrlEntity themedImageUrlEntity = ro10Var.d;
                    ?? f = themedImageUrlEntity != null ? job1.f(themedImageUrlEntity, new ws00(25)) : colorModel;
                    String str2 = ro10Var.e;
                    ThemedImageUrlEntity themedImageUrlEntity2 = ro10Var.f;
                    arrayList.add(new uo10(rr51Var, str, e, f, str2, themedImageUrlEntity2 != null ? job1.f(themedImageUrlEntity2, new ws00(26)) : null, ro10Var.g, ro10Var.h, ro10Var.i));
                    colorModel = null;
                }
            } else {
                arrayList = null;
            }
            ListBuilder a = rcc.a();
            a.addAll(rp10Var.b);
            if (pp10Var instanceof mp10) {
                obj2 = new f990(2, "MERCHANT_OFFERS_PAGING_ERROR_ITEM_ID", ((mp10) pp10Var).a, false);
            } else if (jl40.l(pp10Var, op10.a)) {
                b bVar = ((xo10) qp10Var).a;
                obj2 = (jl40.l(bVar.r().isEnabledOnMerchantOffersScreen(), Boolean.TRUE) && bVar.r().isEnabled()) ? new hyk("MERCHANT_OFFERS_DIVKIT_PAGING_LOADING_ITEM_ID", new eal(uks0.b, false, null, 6)) : new j990();
            } else {
                if (!jl40.l(pp10Var, np10.a)) {
                    w511.b();
                    return null;
                }
                obj2 = null;
            }
            if (obj2 != null) {
                a.add(obj2);
            }
            vp10Var = new tp10(rw51Var, arrayList, a.j());
        } else {
            b bVar2 = ((xo10) qp10Var).a;
            vp10Var = new vp10((jl40.l(bVar2.r().isEnabledOnMerchantOffersScreen(), Boolean.TRUE) && bVar2.r().isEnabled()) ? ShimmerType.DIV_KIT_SHIMMER : ShimmerType.NATIVE_SHIMMER);
        }
        return new xq10(c, vp10Var, !(pp10Var instanceof op10));
    }

    @Override // defpackage.k8b
    public Object t(ThreadChat threadChat) {
        return ((k020) this.a).l(threadChat.getThreadId());
    }

    @Override // defpackage.k8b
    public /* bridge */ /* synthetic */ Object u(CreateFamilyChat createFamilyChat) {
        return null;
    }

    @Override // defpackage.k8b
    public Object v() {
        k020 k020Var = (k020) this.a;
        Long l = (Long) a.b(k020Var.b.Y().a, true, false, new rfa(23));
        if (l != null) {
            return k020Var.k(l.longValue());
        }
        return null;
    }

    @Override // defpackage.k8b
    public /* bridge */ /* synthetic */ Object w(CreateGroupChat createGroupChat) {
        return null;
    }

    @Override // defpackage.k8b
    public Object z(PrivateChat privateChat) {
        return ((k020) this.a).m(privateChat.addressee());
    }

    public /* synthetic */ xl10(Object obj) {
        this.a = obj;
    }

    public xl10(iz30 iz30Var) {
        this.a = iz30Var.b;
    }
}
