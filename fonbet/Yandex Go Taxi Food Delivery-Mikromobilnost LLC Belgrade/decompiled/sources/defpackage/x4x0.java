package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.TransactionsFeedEvents$TransactionsEntryPointClickedSource;
import com.ybsdk.core.common.domain.entities.BottomBarItemId;
import com.ybsdk.core.navigation.cicerone.Screen;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.navigation.cicerone.androidx.TransitionPolicyType;
import com.ybsdk.rconfig.b;
import com.ybsdk.rconfig.configs.YbMobileTabBarConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public final class x4x0 implements w4x0 {
    public final tfl0 a;
    public final AppAnalyticsReporter b;
    public final b c;
    public final j3h d;

    public x4x0(tfl0 tfl0Var, AppAnalyticsReporter appAnalyticsReporter, b bVar, j3h j3hVar) {
        this.a = tfl0Var;
        this.b = appAnalyticsReporter;
        this.c = bVar;
        this.d = j3hVar;
    }

    public final void a() {
        Object obj;
        String deeplink;
        Iterator<T> it = this.c.q().getItems().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (jl40.l(((YbMobileTabBarConfig.TabBarItem) obj).getId(), BottomBarItemId.PAY.getId())) {
                    break;
                }
            }
        }
        YbMobileTabBarConfig.TabBarItem tabBarItem = (YbMobileTabBarConfig.TabBarItem) obj;
        if (tabBarItem == null || (deeplink = tabBarItem.getDeeplink()) == null) {
            x4c.g("[TabNavigation] Failed to find Pay button action", null, null, null, 14);
        } else {
            b(new ph6(deeplink));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v9, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r14v12, types: [tfl0] */
    public final void b(sh6 sh6Var) {
        ?? r0;
        FragmentScreen copy$default;
        boolean z = sh6Var instanceof ph6;
        j3h j3hVar = this.d;
        if (z) {
            h791.e(j3hVar, ((ph6) sh6Var).a, false, null, 14);
            return;
        }
        if (sh6Var instanceof mh6) {
            List c = ((l3h) j3hVar).c(((mh6) sh6Var).a);
            if (c != null) {
                List<Screen> list = c;
                r0 = new ArrayList(tcc.n(list, 10));
                for (Screen screen : list) {
                    FragmentScreen fragmentScreen = screen instanceof FragmentScreen ? (FragmentScreen) screen : null;
                    if (fragmentScreen != null && (copy$default = FragmentScreen.copy$default(fragmentScreen, null, false, null, TransitionPolicyType.NONE, null, null, 55, null)) != null) {
                        screen = copy$default;
                    }
                    r0.add(screen);
                }
            } else {
                r0 = 0;
            }
            if (r0 == 0) {
                r0 = EmptyList.a;
            }
            if (r0.isEmpty()) {
                x4c.g("[TabNavigation] Failed to resolve tab bar click: Home", null, null, null, 14);
            }
            this.a.i(r0);
            return;
        }
        if (sh6Var instanceof lh6) {
            String str = ((lh6) sh6Var).a;
            l0p l0pVar = this.b.p0;
            TransactionsFeedEvents$TransactionsEntryPointClickedSource transactionsFeedEvents$TransactionsEntryPointClickedSource = TransactionsFeedEvents$TransactionsEntryPointClickedSource.TABBAR;
            LinkedHashMap linkedHashMap = new LinkedHashMap(1);
            linkedHashMap.put("source", transactionsFeedEvents$TransactionsEntryPointClickedSource.getOriginalValue());
            l0pVar.a.a("transactions.entry_point.clicked", linkedHashMap);
            h791.e(j3hVar, str, false, null, 14);
            return;
        }
        if (sh6Var instanceof nh6) {
            h791.e(j3hVar, ((nh6) sh6Var).a, false, null, 14);
            return;
        }
        if (sh6Var instanceof qh6) {
            h791.e(j3hVar, ((qh6) sh6Var).a, false, null, 14);
        } else if (sh6Var instanceof rh6) {
            h791.e(j3hVar, ((rh6) sh6Var).a, false, null, 14);
        } else {
            if (sh6Var.equals(oh6.a)) {
                return;
            }
            w511.b();
        }
    }
}
