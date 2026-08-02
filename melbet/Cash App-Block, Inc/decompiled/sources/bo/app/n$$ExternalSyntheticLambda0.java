package bo.app;

import app.cash.local.primitives.LocationMenu;
import app.cash.local.viewmodels.CardManagementSheetModel;
import app.cash.local.viewmodels.LocalAddBrandsViewEvent;
import app.cash.local.viewmodels.LocalAddBrandsViewModel;
import app.cash.local.viewmodels.LocalBrandLocationCartViewEvent;
import app.cash.local.viewmodels.LocalBrandLocationCartViewModel;
import app.cash.local.viewmodels.LocalCashBalanceViewEvent;
import app.cash.local.viewmodels.pos.LocalPosBrandOnboardingViewEvent;
import app.cash.local.viewmodels.pos.LocalPosBrandOnboardingViewModel;
import app.cash.local.viewmodels.sheet.MenuPickerSheetEvent;
import app.cash.local.viewmodels.wallet.BrandCollectionEvent;
import app.cash.local.viewmodels.wallet.BrandCollectionModel;
import app.cash.local.viewmodels.wallet.LocalHomeViewEvent;
import app.cash.local.viewmodels.wallet.LocalHomeViewModel;
import app.cash.local.viewmodels.wallet.LocalHomeViewModel$TabContent$Widget$Portfolio$Brand;
import app.cash.local.views.internal.dropdown.LocalDropdownItemModel;
import app.cash.redwood.widget.RedwoodLayoutKt$toAndroid$1;
import com.android.volley.Response;
import com.braze.models.Banner;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.KProperty;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final /* synthetic */ class n$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ n$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        LocalDropdownItemModel.ClickResult.CloseMenu closeMenu = LocalDropdownItemModel.ClickResult.CloseMenu.INSTANCE;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                return n.a((Set) obj2, (List) obj);
            case 1:
                ((Function1) obj2).invoke(new LocalBrandLocationCartViewEvent.ItemEditClicked(((LocalBrandLocationCartViewModel.Selection) obj).index));
                return Unit.INSTANCE;
            case 2:
                CardManagementSheetModel.Card card = (CardManagementSheetModel.Card) obj;
                ((Function1) obj2).invoke(new LocalCashBalanceViewEvent.UpdateCardState(card.id, card.linked));
                return closeMenu;
            case 3:
                LocalAddBrandsViewModel.BrandCard brandCard = (LocalAddBrandsViewModel.BrandCard) obj;
                ((Function1) obj2).invoke(new LocalAddBrandsViewEvent.BrandClicked(brandCard.brandToken, brandCard.clientRoute));
                return Unit.INSTANCE;
            case 4:
                Function0 function0 = (Function0) obj;
                if (Intrinsics.areEqual(((LocalDropdownItemModel) obj2).onClick.invoke(), closeMenu)) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
            case 5:
                Function1 function1 = (Function1) obj;
                if (((LocalPosBrandOnboardingViewModel) obj2).getHideToolbar()) {
                    return Unit.INSTANCE;
                }
                function1.invoke(LocalPosBrandOnboardingViewEvent.NavigationClicked.INSTANCE);
                return Unit.INSTANCE;
            case 6:
                ((Function1) obj2).invoke(new MenuPickerSheetEvent.MenuSelected((LocationMenu.Menu) obj));
                return Unit.INSTANCE;
            case 7:
                Function1 function12 = (Function1) obj;
                String str = ((BrandCollectionModel) obj2).primaryCtaClientRoute;
                if (str != null) {
                    function12.invoke(new BrandCollectionEvent.PrimaryCtaClicked(str));
                }
                return Unit.INSTANCE;
            case 8:
                ((Function1) obj2).invoke(new LocalHomeViewEvent.WalletCardClicked(((LocalHomeViewModel$TabContent$Widget$Portfolio$Brand) obj).brandSpot));
                return Unit.INSTANCE;
            case 9:
                ((Function1) obj2).invoke(new LocalHomeViewEvent.MarketingMessageClicked(((LocalHomeViewModel.TabContent.Widget.MarketingMessage) obj).marketingMessage));
                return Unit.INSTANCE;
            case 10:
                ((RedwoodLayoutKt$toAndroid$1) obj2).setEnabled(((Response) obj).intermediate);
                return Unit.INSTANCE;
            case 11:
                return d0.a((d0) obj2, (List) obj);
            case 12:
                return e2.a((e2) obj2, (y8) obj);
            case 13:
                return f4.a((l4) obj2, (id) obj);
            case 14:
                return g6.a((g6) obj2, (Integer) obj);
            case 15:
                return h0.a((h0) obj2, (t9) obj);
            case 16:
                return j1.b((String) obj2, (String[]) obj);
            case 17:
                return j1.b((String) obj2, (mf) obj);
            case 18:
                return jc.a((String) obj2, (Long) obj);
            case 19:
                return l2.a((l2) obj2, (re) obj);
            case 20:
                return l2.a((l2) obj2, (JSONArray) obj);
            case 21:
                return ld.a((String) obj, (Set) obj2);
            case 22:
                return mg.a((v9) obj2, (Ref$ObjectRef) obj);
            case 23:
                return n3.a(obj2, (JSONArray) obj);
            case 24:
                return o6.a((Ref$ObjectRef) obj2, (Ref$ObjectRef) obj);
            case 25:
                return p7.a((Class) obj, (Set) obj2);
            case 26:
                return q.a((Banner) obj2, (String) obj);
            case 27:
                return ra.a(obj2, (KProperty) obj);
            case 28:
                return rg.a((rg) obj2, (v9) obj);
            default:
                return t7.a((t7) obj2, (y8) obj);
        }
    }

    public /* synthetic */ n$$ExternalSyntheticLambda0(Serializable serializable, Set set, int i) {
        this.$r8$classId = i;
        this.f$1 = serializable;
        this.f$0 = set;
    }
}
