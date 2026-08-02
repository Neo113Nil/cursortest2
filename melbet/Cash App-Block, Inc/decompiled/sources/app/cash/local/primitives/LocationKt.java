package app.cash.local.primitives;

import app.cash.local.primitives.DiscountMode;
import app.cash.local.primitives.Location;
import com.squareup.protos.cash.local.client.v1.LocalActionOrdering;
import com.squareup.protos.cash.local.client.v1.LocalActions;
import com.squareup.protos.cash.local.client.v1.LocalLargeOrderLimits;
import com.squareup.protos.cash.local.client.v1.LocalLocationDetail;
import com.squareup.protos.cash.local.client.v1.LocalLocationLinks;
import com.squareup.protos.cash.local.client.v1.LocalMenu;
import com.squareup.protos.cash.local.client.v1.LocalMenuItem;
import com.squareup.protos.cash.local.client.v1.LocalMenuItemVariation;
import com.squareup.protos.cash.local.client.v1.LocalOpenHours;
import com.squareup.protos.cash.local.client.v1.LocalOpenStatus;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class LocationKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[LocalOpenStatus.values().length];
            try {
                iArr[LocalOpenStatus.LOCAL_OPEN_STATUS_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LocalOpenStatus.LOCAL_OPEN_STATUS_CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LocalOpenStatus.LOCAL_OPEN_STATUS_OPEN_24_HOURS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LocalOpenStatus.LOCAL_OPEN_STATUS_HOURS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LocalActionOrdering.OrderingMode.values().length];
            try {
                iArr2[LocalActionOrdering.OrderingMode.ORDERING_MODE_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[LocalActionOrdering.OrderingMode.ORDERING_MODE_PERMANENTLY_UNAVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[LocalActionOrdering.OrderingMode.ORDERING_MODE_TEMPORARILY_UNAVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[LocalActionOrdering.OrderingMode.ORDERING_MODE_AVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[LocalLargeOrderLimits.LimitMode.values().length];
            try {
                iArr3[LocalLargeOrderLimits.LimitMode.LIMIT_MODE_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[LocalLargeOrderLimits.LimitMode.LIMIT_MODE_QUANTITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[LocalLargeOrderLimits.LimitMode.LIMIT_MODE_SUBTOTAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final Location.OpenState openStateModel(LocalOpenStatus localOpenStatus, LocalOpenHours localOpenHours) {
        if (localOpenStatus == null) {
            localOpenStatus = LocalOpenStatus.LOCAL_OPEN_STATUS_UNSPECIFIED;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[localOpenStatus.ordinal()];
        Location.OpenState.Unspecified unspecified = Location.OpenState.Unspecified.INSTANCE;
        if (i == 1) {
            return unspecified;
        }
        if (i == 2) {
            return Location.OpenState.Closed.INSTANCE;
        }
        if (i == 3) {
            return Location.OpenState.Open24Hours.INSTANCE;
        }
        if (i == 4) {
            return localOpenHours == null ? unspecified : new Location.OpenState.Hours(localOpenHours);
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    public static final app.cash.local.primitives.Location.LocationSummary toLocation(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r23v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */

    public static final Location.LocationDetail toLocation(LocalLocationDetail localLocationDetail) {
        String str;
        Map map;
        Collection values;
        LocalMenuItem localMenuItem;
        com.squareup.protos.cash.local.client.v1.LocalMoney localMoney;
        Actions actions;
        DiscountMode discountMode;
        List list;
        List list2;
        List list3;
        Map map2;
        Collection values2;
        LocalMenuItem localMenuItem2;
        List list4;
        LocalMenuItemVariation localMenuItemVariation;
        com.squareup.protos.cash.local.client.v1.LocalMoney localMoney2;
        localLocationDetail.getClass();
        Location.LocationSummary location = toLocation(localLocationDetail.summary);
        LocalMenu localMenu = localLocationDetail.menu;
        if (localMenu == null || (map2 = localMenu.items) == null || (values2 = map2.values()) == null || (localMenuItem2 = (LocalMenuItem) CollectionsKt.firstOrNull(values2)) == null || (list4 = localMenuItem2.variations) == null || (localMenuItemVariation = (LocalMenuItemVariation) CollectionsKt.firstOrNull(list4)) == null || (localMoney2 = localMenuItemVariation.price) == null || (str = localMoney2.currency_code) == null) {
            str = (localMenu == null || (map = localMenu.items) == null || (values = map.values()) == null || (localMenuItem = (LocalMenuItem) CollectionsKt.firstOrNull(values)) == null || (localMoney = localMenuItem.price) == null) ? null : localMoney.currency_code;
            if (str == null) {
                str = "USD";
            }
        }
        LocalCurrencyCode valueOf = LocalCurrencyCode.valueOf(str);
        LocationMenu locationMenu = localMenu != null ? LocationMenuKt.toLocationMenu(localMenu) : null;
        LocalActions localActions = localLocationDetail.actions;
        if (localActions != null) {
            LocalActionOrdering localActionOrdering = localActions.ordering;
            LocalActionOrdering.DiscountCodeMode discountCodeMode = localActionOrdering != null ? localActionOrdering.discount_code_mode : null;
            int i = discountCodeMode == null ? -1 : ActionKt$WhenMappings.$EnumSwitchMapping$0[discountCodeMode.ordinal()];
            if (i == -1 || i == 1 || i == 2) {
                discountMode = DiscountMode.Disabled.INSTANCE;
            } else if (i == 3) {
                String str2 = localActionOrdering.discount_code_label;
                str2.getClass();
                discountMode = new DiscountMode.Enabled(false, str2);
            } else if (i == 4) {
                String str3 = localActionOrdering.discount_code_label;
                str3.getClass();
                discountMode = new DiscountMode.Enabled(true, str3);
            } else {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            if (localActionOrdering == null || (list = localActionOrdering.popular_orders) == null) {
                list = EmptyList.INSTANCE;
            }
            if (localActionOrdering == null || (list2 = localActionOrdering.past_orders) == null) {
                list2 = EmptyList.INSTANCE;
            }
            if (localActionOrdering == null || (list3 = localActionOrdering.reorderable_past_selections) == null) {
                list3 = EmptyList.INSTANCE;
            }
            actions = new Actions(discountMode, list, list2, list3);
        } else {
            actions = null;
        }
        LocalLocationLinks localLocationLinks = localLocationDetail.links;
        localLocationLinks.getClass();
        return new Location.LocationDetail(location, valueOf, locationMenu, actions, localLocationLinks, localLocationDetail.loyalty_account, localLocationDetail.loyalty_program);
    }
}
