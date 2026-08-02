package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.yandex.go.preorder.suggested.menu.ui.SuggestMenuModalView;
import com.yandex.go.safety.center.main.SafetyCenterMainView;
import com.yandex.go.settings.mvp.SettingsModalView;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.l;
import com.yandex.messaging.input.g;
import com.yandex.messaging.internal.entities.FullReactionInfo;
import com.yandex.messaging.internal.view.chat.input.textsuggest.d;
import com.yandex.messaging.telemost.ui.StartPersonalMeetingMenuDialog;
import com.ybsdk.core.stories.StoriesComponentView;
import com.ybsdk.feature.cashback.impl.entities.CashbackSelectorCategoryEntity;
import com.ybsdk.feature.qr.payments.internal.screens.list.presentation.view.SelectorListView;
import com.ybsdk.feature.savings.internal.screens.account.view.SavingsAccountThemeSelectorView;
import com.ybsdk.feature.savings.internal.screens.account.view.SavingsIncomeProgressView;
import com.ybsdk.feature.savings.internal.screens.close.deposit.SavingsAccountCloseDepositFragment;
import com.ybsdk.feature.savings.internal.screens.dashboard.v4.SavingsShelfView;
import com.ybsdk.feature.savings.internal.views.SavingsCardView;
import com.ybsdk.feature.savings.internal.views.SavingsNoAccountsView;
import com.ybsdk.widgets.common.SuggestsGroupView;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import java.util.Map;
import java.util.function.Consumer;
import kotlin.Pair;
import kotlin.collections.b;
import org.json.JSONException;
import org.json.JSONObject;
import ru.yandex.taxi.design.ListItemSwitchComponent;
import ru.yandex.taxi.order.state.TaxiOnTheWayStateView;
import ru.yandex.taxi.order.view.CarDescriptionTextView;
import ru.yandex.taxi.preorder.summary.altchoice.ui.selector.RequiredAltChoiceOptionSelectorView;

/* loaded from: classes13.dex */
public final /* synthetic */ class tai0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tai0(g9r0 g9r0Var, tls tlsVar, tls tlsVar2) {
        this.a = 18;
        this.b = tlsVar;
        this.c = tlsVar2;
    }

    private final void a(View view) {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ls10 ls10Var;
        Map map;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                FullReactionInfo fullReactionInfo = (FullReactionInfo) obj;
                ((uai0) obj2).Q.invoke(Integer.valueOf(fullReactionInfo.getType()), Boolean.valueOf(fullReactionInfo.isChecked()));
                break;
            case 1:
                RequiredAltChoiceOptionSelectorView.setAltChoiceClickListeners$lambda$0((RequiredAltChoiceOptionSelectorView) obj2, (waj0) obj, view);
                break;
            case 2:
                jik0 jik0Var = (jik0) obj;
                ((l) obj2).S.a(jik0Var.f, jik0Var.g);
                break;
            case 3:
                ((tyk0) obj2).invoke(Integer.valueOf(((n70) obj).E()));
                break;
            case 4:
                SafetyCenterMainView.setShakeToggleEnabled$lambda$0$0((SafetyCenterMainView) obj2, (chr0) obj, view);
                break;
            case 5:
                ((SafetyCenterMainView) obj2).clearTooltip((FrameLayout) obj);
                break;
            case 6:
                SavingsAccountCloseDepositFragment.showBottomSheet$lambda$15$lambda$13((SavingsAccountCloseDepositFragment) obj2, (BottomSheetDialogView) obj, view);
                break;
            case 7:
                SavingsAccountThemeSelectorView.themeSelectionDelegate$lambda$9$lambda$8$lambda$7((SavingsAccountThemeSelectorView) obj2, (n70) obj, view);
                break;
            case 8:
                SavingsCardView.render$lambda$1((aam0) obj2, (SavingsCardView) obj, view);
                break;
            case 9:
                SavingsIncomeProgressView.createPeriodsAdapter$lambda$7$lambda$6$lambda$5((SavingsIncomeProgressView) obj2, (n70) obj, view);
                break;
            case 10:
                SavingsNoAccountsView.render$lambda$2$lambda$1((SavingsNoAccountsView) obj2, (kdm0) obj, view);
                break;
            case 11:
                SavingsShelfView.setupHeaderClickArea$lambda$9((SavingsShelfView) obj2, (tdm0) obj, view);
                break;
            case 12:
                n70 n70Var = (n70) obj2;
                lbb0 lbb0Var = (lbb0) obj;
                if (((phm0) n70Var.Z()).l && ((phm0) n70Var.Z()).g) {
                    lbb0Var.invoke(n70Var.Z(), Integer.valueOf(n70Var.F()));
                    break;
                }
                break;
            case 13:
                vym0 vym0Var = ((kzm0) obj).a;
                tls tlsVar = ((ozm0) obj2).d;
                if (tlsVar != null) {
                    tlsVar.invoke(vym0Var);
                    break;
                }
                break;
            case 14:
                rcq0 rcq0Var = (rcq0) obj2;
                xcq0 xcq0Var = (xcq0) obj;
                if (rcq0Var.F() != -1 && !rcq0Var.X(rcq0Var.F())) {
                    ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
                    int F = rcq0Var.F();
                    if (F != -1) {
                        xcq0Var.A = (vcq0) xcq0Var.y.get(F);
                        xcq0Var.notifyDataSetChanged();
                        xcq0Var.a.onSelectPaymentMethod(F);
                        break;
                    }
                }
                break;
            case 15:
                rcq0 rcq0Var2 = (rcq0) obj2;
                xcq0 xcq0Var2 = (xcq0) obj;
                if (rcq0Var2.F() != -1) {
                    TextView textView = rcq0Var2.Q;
                    ((InputMethodManager) textView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(textView.getWindowToken(), 0);
                    int F2 = rcq0Var2.F();
                    if (F2 != -1) {
                        xcq0Var2.A = (vcq0) xcq0Var2.y.get(F2);
                        xcq0Var2.notifyDataSetChanged();
                        xcq0Var2.a.onSelectPaymentMethod(F2);
                        break;
                    }
                }
                break;
            case 16:
                SelectorListView.selectorsAdapterDelegate$lambda$7$lambda$6$lambda$5$lambda$4$lambda$3((SelectorListView) obj2, (n70) obj, view);
                break;
            case 17:
                SettingsModalView.initLayout$lambda$0$8$0((SettingsModalView) obj2, (ListItemSwitchComponent) obj, view);
                break;
            case 18:
                break;
            case 19:
                ((wls) ((mt6) obj2).T).invoke(((tlr0) obj).a.a, Boolean.valueOf(!r1.c));
                break;
            case 20:
                StartPersonalMeetingMenuDialog.bindRunnableItem$lambda$2((StartPersonalMeetingMenuDialog) obj2, (tls) obj, view);
                break;
            case 21:
                StoriesComponentView.setCloseButtonClickListener$lambda$6((StoriesComponentView) obj2, (sls) obj, view);
                break;
            case 22:
                SuggestMenuModalView.renderMap$lambda$0$1((l6v0) obj2, (SuggestMenuModalView) obj, view);
                break;
            case 23:
                n70 n70Var2 = (n70) obj2;
                irb1.a(n70Var2.P, ((CashbackSelectorCategoryEntity) n70Var2.Z()).getSubtitle()).f(((p061) obj).d, 0L);
                break;
            case 24:
                SuggestsGroupView.suggestsAdapterDelegate$lambda$5$lambda$4$lambda$3$lambda$2((SuggestsGroupView) obj2, (n70) obj, view);
                break;
            case 25:
                sls slsVar = (sls) obj;
                if (!((bcv0) obj2).a) {
                    slsVar.invoke();
                    break;
                }
                break;
            case 26:
                ((ymx0) obj2).U.invoke(((zmx0) obj).a);
                break;
            case 27:
                TaxiOnTheWayStateView.setTitles$lambda$0((TaxiOnTheWayStateView) obj2, (CarDescriptionTextView) obj, view);
                break;
            case 28:
                view.setClickable(false);
                ((Consumer) obj2).accept((jv10) obj);
                break;
            default:
                pty0 pty0Var = (pty0) obj2;
                oty0 oty0Var = (oty0) obj;
                d dVar = pty0Var.P;
                int F3 = pty0Var.F();
                qty0 qty0Var = dVar.g;
                if (qty0Var != null) {
                    dVar.g = null;
                    dVar.d.reportEvent("bot suggest was selected", b.i(new Pair("chat id", dVar.f), new Pair("action id", qty0Var.b), new Pair("count", Integer.valueOf(qty0Var.d)), new Pair("suggest sequence number", Integer.valueOf(F3)), new Pair("text length", Integer.valueOf(oty0Var.a.length())), new Pair("input length", Integer.valueOf(qty0Var.a.length()))));
                }
                g gVar = pty0Var.N;
                String str = oty0Var.a;
                String str2 = oty0Var.b;
                if (str2 != null) {
                    try {
                        w53 d = nbb1.d(new JSONObject(str2));
                        Map t = d != null ? b.t(d) : null;
                        ls10Var = t != null ? new ls10(t) : null;
                    } catch (JSONException unused) {
                        z83.i();
                    }
                    if (ls10Var != null) {
                        map = ls10Var.a;
                        gVar.getClass();
                        tje.e();
                        g.d(gVar, str, false, null, null, false, map, null, false, null, null, 926);
                        pty0Var.O.clear();
                        break;
                    }
                }
                map = null;
                gVar.getClass();
                tje.e();
                g.d(gVar, str, false, null, null, false, map, null, false, null, null, 926);
                pty0Var.O.clear();
        }
    }

    public /* synthetic */ tai0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
