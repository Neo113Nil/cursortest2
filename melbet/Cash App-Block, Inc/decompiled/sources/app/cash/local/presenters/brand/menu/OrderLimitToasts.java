package app.cash.local.presenters.brand.menu;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.StateListIterator;
import app.cash.local.backend.CartBuilder;
import app.cash.local.backend.real.RealCartBuilder;
import app.cash.local.presenters.cart.OrderLimitChecker$OrderLimitCheckResult$HasQuantityLimit;
import app.cash.local.presenters.cart.OrderLimitChecker$OrderLimitCheckResult$HasValueLimit;
import app.cash.local.presenters.cart.OrderLimitChecker$OrderLimitCheckResult$NoLimitReached;
import app.cash.local.primitives.CartEntryWithQuantity;
import app.cash.local.primitives.DiscountCodeKt;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.primitives.FulfillmentConfigurationKt;
import app.cash.local.primitives.LocalCurrencyCode;
import app.cash.local.primitives.LocalMoney;
import app.cash.local.primitives.Location;
import app.cash.local.primitives.LocationMenu;
import app.cash.local.primitives.math.LocalMoneysKt;
import app.cash.local.viewmodels.toasts.ToastData;
import com.squareup.cash.R;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.work.service.api.EssentialsResponse;
import com.squareup.cash.work.tinygraph.EntityStore;
import com.squareup.cash.work.tinygraph.models.EntityType;
import com.squareup.cash.work.tinygraph.models.Job;
import com.squareup.cash.work.tinygraph.models.Location;
import com.squareup.cash.work.tinygraph.models.Membership;
import com.squareup.cash.work.tinygraph.models.Merchant;
import com.squareup.cash.work.tinygraph.models.Metadata;
import com.squareup.cash.work.tinygraph.models.Person;
import com.squareup.cash.work.tinygraph.models.Setting;
import com.squareup.contour.HasTop$DefaultImpls;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes3.dex */
public abstract class OrderLimitToasts {
    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewCashAppScore.deepLinkSpecs;
    }

    public static final void ingestEssentialsResponse(EntityStore entityStore, EssentialsResponse essentialsResponse) {
        essentialsResponse.getClass();
        Person person = essentialsResponse.person;
        if (person != null) {
            entityStore.upsertEntity(person, EntityType.PERSON_WRAPPER);
        }
        List list = essentialsResponse.merchants;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                entityStore.upsertEntity((Merchant) it.next(), EntityType.MERCHANT_WRAPPER);
            }
        }
        List list2 = essentialsResponse.memberships;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                entityStore.upsertEntity((Membership) it2.next(), EntityType.MEMBERSHIP);
            }
        }
        List list3 = essentialsResponse.metadatas;
        if (list3 != null) {
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                entityStore.upsertEntity((Metadata) it3.next(), EntityType.MEMBERSHIP_METADATA);
            }
        }
        List list4 = essentialsResponse.locations;
        if (list4 != null) {
            Iterator it4 = list4.iterator();
            while (it4.hasNext()) {
                entityStore.upsertEntity((Location) it4.next(), EntityType.LOCATION);
            }
        }
        List list5 = essentialsResponse.jobs;
        if (list5 != null) {
            Iterator it5 = list5.iterator();
            while (it5.hasNext()) {
                entityStore.upsertEntity((Job) it5.next(), EntityType.JOB);
            }
        }
        List list6 = essentialsResponse.settings;
        if (list6 != null) {
            Iterator it6 = list6.iterator();
            while (it6.hasNext()) {
                entityStore.upsertEntity((Setting) it6.next(), EntityType.SETTINGS);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        if (r6.equals(r9) == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ToastData toastDataForOrderLimitCheck(AndroidStringManager androidStringManager, CartBuilder cartBuilder, Location.LocationDetail locationDetail, LocationMenu locationMenu, FulfillmentConfiguration fulfillmentConfiguration, Integer num, LocalMoney localMoney) {
        LocalMoney localMoney2;
        String format2;
        Resources resources = androidStringManager.resources;
        if (locationDetail != null && locationMenu != null && fulfillmentConfiguration != null) {
            Location.LargeOrderLimits largeOrderLimits = (Location.LargeOrderLimits) locationDetail.summary.largeOrderLimits.get(FulfillmentConfigurationKt.getType(fulfillmentConfiguration));
            RealCartBuilder realCartBuilder = (RealCartBuilder) cartBuilder;
            SnapshotStateList snapshotStateList = realCartBuilder.selections;
            if (localMoney == null) {
                localMoney = LocalMoneysKt.zero(LocalCurrencyCode.USD);
            }
            ListIterator listIterator = snapshotStateList.listIterator();
            int i = 0;
            while (true) {
                StateListIterator stateListIterator = (StateListIterator) listIterator;
                if (!stateListIterator.hasNext()) {
                    break;
                }
                i += ((CartEntryWithQuantity) stateListIterator.next()).getQuantity();
            }
            LocalMoney calculateCostNow = realCartBuilder.calculateCostNow(locationMenu, false);
            if (DiscountCodeKt.getOfferToken(realCartBuilder.discountCodes) != null) {
                localMoney2 = realCartBuilder.calculateCostNow(locationMenu, true);
            }
            localMoney2 = null;
            Object check = HasTop$DefaultImpls.check(largeOrderLimits, i + (num != null ? num.intValue() : 0), LocalMoneysKt.plus(calculateCostNow, localMoney), localMoney2 != null ? LocalMoneysKt.plus(localMoney2, localMoney) : null);
            if (check.equals(OrderLimitChecker$OrderLimitCheckResult$NoLimitReached.INSTANCE)) {
                format2 = null;
            } else if (check instanceof OrderLimitChecker$OrderLimitCheckResult$HasQuantityLimit) {
                Object[] objArr = {Integer.valueOf(((OrderLimitChecker$OrderLimitCheckResult$HasQuantityLimit) check).getMaxQuantity())};
                resources.getClass();
                format2 = new MessageFormat(resources.getString(R.string.local_presenters_item_detail_order_item_count_limit)).format(objArr);
                format2.getClass();
            } else if (check instanceof OrderLimitChecker$OrderLimitCheckResult$HasValueLimit) {
                String maxValue = ((OrderLimitChecker$OrderLimitCheckResult$HasValueLimit) check).getMaxValue();
                maxValue.getClass();
                resources.getClass();
                format2 = new MessageFormat(resources.getString(R.string.local_presenters_item_detail_order_value_limit)).format(new Object[]{maxValue});
                format2.getClass();
            } else {
                Drop$$ExternalSyntheticBUOutline0.m1m();
            }
            if (format2 != null) {
                return new ToastData(format2, null);
            }
        }
        return null;
    }
}
