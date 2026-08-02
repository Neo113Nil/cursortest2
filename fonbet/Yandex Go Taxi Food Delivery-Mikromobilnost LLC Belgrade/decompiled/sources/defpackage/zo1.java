package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.database.SQLException;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.coroutines.a;
import com.airbnb.lottie.compose.LottieAnimatableImpl;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation.FlexRouteHandlerImpl;
import com.yandex.go.navigator.gas_stations.filters.GasStationsFiltersModalView;
import com.yandex.go.rida.bids.interactor.b;
import com.yandex.go.ui.d;
import com.yandex.messaging.input.f;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountUnlockMoneyResultResult;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.screens.upgrade.presentation.edit.UpgradeEditFragment;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Pair;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes15.dex */
public final /* synthetic */ class zo1 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zo1(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 popToRoot$lambda$0;
        rus rusVar;
        zy11 animateButtons$lambda$27;
        int i = this.a;
        boolean z = false;
        r3 = false;
        r3 = false;
        r3 = false;
        boolean z2 = false;
        z = false;
        zy11 zy11Var = zy11.a;
        boolean z3 = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return Float.valueOf(z3 ? ((Number) ((LottieAnimatableImpl) ((esz) obj)).getValue()).floatValue() : 0.0f);
            case 1:
                ((zo2) obj).h(z3);
                return zy11Var;
            case 2:
                l25 l25Var = (l25) obj;
                if (!l25Var.k0 && z3) {
                    LocalMessageRef localMessageRef = l25Var.g0;
                    if (localMessageRef != null) {
                        l25Var.e0().f.w(localMessageRef);
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                ((TextView) obj).setVisibility(z3 ? 0 : 8);
                return zy11Var;
            case 4:
                ((b) obj).c.a(z3);
                return zy11Var;
            case 5:
                a aVar = (a) obj;
                String str = z3 ? "reader" : "writer";
                StringBuilder sb = new StringBuilder();
                sb.append("Timed out attempting to acquire a " + str + " connection.");
                sb.append("\n\nWriter pool:\n");
                aVar.b.d(sb);
                sb.append("Reader pool:");
                sb.append('\n');
                aVar.a.d(sb);
                try {
                    vez0.Y(5, sb.toString());
                    throw null;
                } catch (SQLException e) {
                    if (aVar.z != 1) {
                        return zy11Var;
                    }
                    throw e;
                }
            case 6:
                w9y w9yVar = (w9y) obj;
                if (z3) {
                    w9yVar.i();
                }
                return zy11Var;
            case 7:
                Map map = (Map) ((n0h) obj).d.getValue();
                String[] strArr = {"BROADCASTING", "UPD_TARGETS", "SMART_WEBVIEW", "SERVICE_INFORMATION", "MINI_STORIES", z3 ? "COOKIE_INJECT" : null, "CARD_OVER_BRIDGE", "PAY_BUTTON_CONFIG", "ANDROID_SELL_IN_STORY", "ONLY_AUTHORIZED_PURCHASE", "NATIVE_PURCHASE", "INAPP_PURCHASE", "HOST_PURCHASE", "PURCHASE_TARIFFICATOR", "NATIVE_VIBRATE"};
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (int i2 = 0; i2 < 15; i2++) {
                    String str2 = strArr[i2];
                    if (str2 != null) {
                        linkedHashSet.add(str2);
                    }
                }
                return kotlin.collections.b.n(map, gw00.e(new Pair("available_features", linkedHashSet)));
            case 8:
                popToRoot$lambda$0 = FlexRouteHandlerImpl.popToRoot$lambda$0((FlexRouteHandlerImpl) obj, z3);
                return popToRoot$lambda$0;
            case 9:
                rusVar = ((GasStationsFiltersModalView) obj).presenter;
                r0 r0Var = rusVar.I;
                qv10.B(!z3, r0Var, null);
                rusVar.x.d = ((Boolean) r0Var.getValue()).booleanValue();
                rus.Ng(rusVar, "toggle_route", null, null, z3 ? null : Boolean.TRUE, 6);
                return zy11Var;
            case 10:
                ((ru.yandex.taxi.history.b) obj).R(z3);
                return zy11Var;
            case 11:
                s6y j = ((androidx.compose.foundation.lazy.b) obj).j();
                n6y n6yVar = (n6y) kotlin.collections.a.b0(j.k);
                int i3 = j.n;
                if (z3 && n6yVar != null && ((t6y) n6yVar).a >= i3 - 1 && i3 > 0) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 12:
                sw50 sw50Var = (sw50) obj;
                if (!jl40.l(sw50Var.w, Boolean.valueOf(z3))) {
                    if (sw50Var.w != null) {
                        ew2 ew2Var = sw50Var.a;
                        if (z3) {
                            ew2Var.b("wm_connection_established");
                        } else {
                            ew2Var.b("wm_connection_lost");
                        }
                    }
                    sw50Var.w = Boolean.valueOf(z3);
                    Iterator it = sw50Var.b.iterator();
                    while (it.hasNext()) {
                        rw50 rw50Var = (rw50) it.next();
                        if (z3) {
                            sw50 sw50Var2 = rw50Var.a;
                            Handler handler = sw50Var2.x;
                            if (jl40.f && !jl40.l(handler.getLooper(), Looper.myLooper())) {
                                dy31.h(handler.getLooper().getThread());
                                return null;
                            }
                            sw50Var2.b.remove(rw50Var);
                            rw50Var.b.invoke();
                        } else {
                            rw50Var.getClass();
                        }
                    }
                }
                return zy11Var;
            case 13:
                n70 n70Var = (n70) obj;
                if (z3) {
                    ConstraintLayout constraintLayout = ((g261) n70Var.N).a;
                    f990 f990Var = (f990) n70Var.Z();
                    String b = c5b1.b(constraintLayout);
                    if (b == null) {
                        x4c.g("There is no screen_tag in view hierarchy", null, null, null, 14);
                        b = "<no screen tag>";
                    }
                    trp0 trp0Var = trp0.a;
                    trp0.e(new iqp0(null, b, f990Var.f));
                }
                Object Z = n70Var.Z();
                zo31 zo31Var = n70Var.N;
                if (((f990) Z).e) {
                    ConstraintLayout constraintLayout2 = ((g261) zo31Var).a;
                    ViewParent parent = constraintLayout2.getParent();
                    RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
                    if (recyclerView != null) {
                        int childCount = recyclerView.getChildCount();
                        View v = childCount < 2 ? null : uh6.v(recyclerView, childCount - 2);
                        int dimensionPixelSize = ((f990) n70Var.Z()).d ? n70Var.P.getResources().getDimensionPixelSize(lwg0.ybsdk_progress_indicator_size) : 0;
                        int bottom = (recyclerView.getBottom() - (((v == null || v.getBottom() != 0) && v != null) ? v.getBottom() : recyclerView.getTop())) - dimensionPixelSize;
                        ViewGroup.LayoutParams layoutParams = constraintLayout2.getLayoutParams();
                        if (layoutParams == null) {
                            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            return null;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        if (bottom - constraintLayout2.getMinHeight() < 0) {
                            bottom = constraintLayout2.getMinHeight();
                        }
                        marginLayoutParams.height = bottom;
                        marginLayoutParams.bottomMargin = dimensionPixelSize;
                        constraintLayout2.setLayoutParams(marginLayoutParams);
                    }
                }
                return zy11Var;
            case 14:
                com.yandex.plus.home.feature.webviews.internal.a aVar2 = (com.yandex.plus.home.feature.webviews.internal.a) obj;
                if (!jl40.l(aVar2.j, Boolean.valueOf(z3))) {
                    aVar2.l();
                }
                return zy11Var;
            case 15:
                com.ybsdk.feature.savings.internal.helpers.a aVar3 = (com.ybsdk.feature.savings.internal.helpers.a) obj;
                Pair pair = z3 ? new Pair(Integer.valueOf(dzh0.ybsdk_savings_lock_money_snackbar_locked_title), Integer.valueOf(dzh0.ybsdk_savings_lock_money_snackbar_locked_subtitle)) : new Pair(Integer.valueOf(dzh0.ybsdk_savings_unlock_money_snackbar_removed_title), Integer.valueOf(dzh0.ybsdk_savings_unlock_money_snackbar_removed_subtitle));
                aVar3.d.c(unr0.h(Text.Companion, ((Number) pair.getFirst()).intValue()), new Text.Resource(((Number) pair.getSecond()).intValue()));
                if (!z3) {
                    rt1 rt1Var = aVar3.e.f0;
                    SavingsEvents$SavingsAccountUnlockMoneyResultResult savingsEvents$SavingsAccountUnlockMoneyResultResult = SavingsEvents$SavingsAccountUnlockMoneyResultResult.OK;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(1);
                    linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, savingsEvents$SavingsAccountUnlockMoneyResultResult.getOriginalValue());
                    rt1Var.a.a("savings.account.unlock_money.result", linkedHashMap);
                }
                return zy11Var;
            case 16:
                f fVar = (f) obj;
                fVar.d();
                fVar.a.c(!z3);
                return zy11Var;
            case 17:
                com.yandex.go.ultima_mode.preferences.a aVar4 = (com.yandex.go.ultima_mode.preferences.a) obj;
                qv10.B(z3, aVar4.c.a, null);
                lv11 lv11Var = aVar4.b;
                lv11Var.c.setValue(lv11Var, lv11.d[2], Boolean.valueOf(z3));
                return zy11Var;
            case 18:
                animateButtons$lambda$27 = UpgradeEditFragment.animateButtons$lambda$27((UpgradeEditFragment) obj, z3);
                return animateButtons$lambda$27;
            default:
                d dVar = (d) obj;
                boolean f = ((com.yandex.go.permission.b) dVar.B).f(3);
                if (!f) {
                    com.yandex.go.navigation.a aVar5 = dVar.x;
                    aVar5.getClass();
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    zq21 zq21Var = aVar5.a;
                    Context context = zq21Var.F;
                    intent.setData(Uri.fromParts("package", context.getPackageName(), null));
                    if (intent.resolveActivity(context.getPackageManager()) != null) {
                        a60 a60Var = (a60) zq21Var.G;
                        a60Var.getClass();
                        try {
                            a60Var.e(HProv.PP_DELETE_SAVED_PASSWD, intent);
                        } catch (ActivityNotFoundException unused) {
                        }
                    }
                }
                if (z3) {
                    dVar.G.c(f ? "denied" : "forever_denied");
                }
                return zy11Var;
        }
    }

    public /* synthetic */ zo1(boolean z, Object obj, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
    }
}
