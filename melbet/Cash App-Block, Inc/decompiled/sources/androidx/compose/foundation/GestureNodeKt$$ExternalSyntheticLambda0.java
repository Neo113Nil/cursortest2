package androidx.compose.foundation;

import android.content.Context;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.platform.InspectorInfo;
import app.cash.broadway.ui.compose.DialogListenerEvent;
import app.cash.local.viewmodels.LocalBrandLocationCheckoutViewEvent;
import app.cash.local.viewmodels.LocalCashBalanceViewEvent;
import app.cash.local.viewmodels.LocalOpenTabCheckoutViewEvent;
import app.cash.local.viewmodels.LocalOrderStatusViewEvent;
import app.cash.local.viewmodels.LocalSearchViewEvent$SearchInput;
import app.cash.local.viewmodels.MoreOptionsMenuEvent;
import app.cash.local.viewmodels.instore.TableQrCodeScannerViewEvent;
import app.cash.local.viewmodels.wallet.LocalHomeViewEvent;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewEvent;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class GestureNodeKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ GestureNodeKt$$ExternalSyntheticLambda0(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                TraversableNode traversableNode = (TraversableNode) obj;
                if (!(traversableNode instanceof GestureNode)) {
                    a$$ExternalSyntheticBUOutline0.m$1("Node is not a GestureNode instance");
                    break;
                } else {
                    Boolean bool = (Boolean) function1.invoke(((GestureNode) traversableNode).gestureConnection);
                    bool.getClass();
                    break;
                }
            case 1:
                InspectorInfo inspectorInfo = (InspectorInfo) obj;
                inspectorInfo.name = "offset";
                inspectorInfo.properties.set(function1, "offset");
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                Context context = (Context) obj;
                context.getClass();
                break;
            case 6:
                String str = (String) obj;
                str.getClass();
                function1.invoke(new LocalBrandLocationCheckoutViewEvent.CouponCodeSubmitted(str));
                break;
            case 7:
                String str2 = (String) obj;
                str2.getClass();
                function1.invoke(new LocalBrandLocationCheckoutViewEvent.CouponRemoved(str2));
                break;
            case 8:
                function1.invoke(new LocalBrandLocationCheckoutViewEvent.SuggestedTipClicked(((Integer) obj).intValue()));
                break;
            case 9:
                String str3 = (String) obj;
                str3.getClass();
                function1.invoke(new LocalBrandLocationCheckoutViewEvent.TipEntered(str3));
                break;
            case 10:
                String str4 = (String) obj;
                str4.getClass();
                function1.invoke(new LocalBrandLocationCheckoutViewEvent.UrlClicked(str4));
                break;
            case 11:
                function1.invoke(new LocalBrandLocationCheckoutViewEvent.NoContactDeliveryToggled(((Boolean) obj).booleanValue()));
                break;
            case 12:
                String str5 = (String) obj;
                if (str5 == null) {
                    str5 = "";
                }
                function1.invoke(new LocalBrandLocationCheckoutViewEvent.DropoffNotesUpdated(str5));
                break;
            case 13:
                LocalFulfillmentType localFulfillmentType = (LocalFulfillmentType) obj;
                localFulfillmentType.getClass();
                function1.invoke(new LocalBrandLocationCheckoutViewEvent.FulfillmentRowSwitchType(localFulfillmentType));
                break;
            case 14:
                String str6 = (String) obj;
                str6.getClass();
                function1.invoke(new LocalBrandLocationCheckoutViewEvent.UrlClicked(str6));
                break;
            case 15:
                String str7 = (String) obj;
                str7.getClass();
                function1.invoke(new LocalBrandLocationCheckoutViewEvent.UrlClicked(str7));
                break;
            case 16:
                function1.invoke(new LocalBrandLocationCheckoutViewEvent.GiftCardsExpandedChanged(((Boolean) obj).booleanValue()));
                break;
            case 17:
                String str8 = (String) obj;
                str8.getClass();
                function1.invoke(new LocalBrandLocationCheckoutViewEvent.GiftCardCodeEntered(str8));
                break;
            case 18:
                function1.invoke(new LocalBrandLocationCheckoutViewEvent.CurbsidePickupToggled(((Boolean) obj).booleanValue()));
                break;
            case 19:
                function1.invoke(new LocalBrandLocationCheckoutViewEvent.OrderNotesUpdated((String) obj));
                break;
            case 20:
                function1.invoke(new LocalOpenTabCheckoutViewEvent.OrderNotesUpdated((String) obj));
                break;
            case 21:
                String str9 = (String) obj;
                str9.getClass();
                function1.invoke(new LocalOpenTabCheckoutViewEvent.UrlClicked(str9));
                break;
            case 22:
                String str10 = (String) obj;
                str10.getClass();
                function1.invoke(new LocalSearchViewEvent$SearchInput(str10));
                break;
            case 23:
                String str11 = (String) obj;
                str11.getClass();
                function1.invoke(new LocalOrderStatusViewEvent.UrlClicked(str11));
                break;
            case 24:
                MoreOptionsMenuEvent moreOptionsMenuEvent = (MoreOptionsMenuEvent) obj;
                moreOptionsMenuEvent.getClass();
                function1.invoke(moreOptionsMenuEvent);
                if (!(moreOptionsMenuEvent instanceof MoreOptionsMenuEvent.AddBrandClicked)) {
                    break;
                } else {
                    break;
                }
            case 25:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                function1.invoke(bool2);
                break;
            case 26:
                TabToolbarInternalViewEvent tabToolbarInternalViewEvent = (TabToolbarInternalViewEvent) obj;
                tabToolbarInternalViewEvent.getClass();
                function1.invoke(new LocalHomeViewEvent.TabToolbarEvent(tabToolbarInternalViewEvent));
                break;
            case 27:
                ((DialogListenerEvent) obj).getClass();
                function1.invoke(TableQrCodeScannerViewEvent.DialogClosed.INSTANCE);
                break;
            case 28:
                String str12 = (String) obj;
                str12.getClass();
                function1.invoke(new TableQrCodeScannerViewEvent.QrCodeDetected(str12));
                break;
            default:
                String str13 = (String) obj;
                str13.getClass();
                function1.invoke(new LocalCashBalanceViewEvent.UrlClicked(str13));
                break;
        }
        return Unit.INSTANCE;
    }
}
