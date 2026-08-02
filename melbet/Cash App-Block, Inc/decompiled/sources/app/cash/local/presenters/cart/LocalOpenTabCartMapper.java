package app.cash.local.presenters.cart;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.collection.ArrayMap;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.local.primitives.LocalCurrencyCode;
import app.cash.local.primitives.LocalMoney;
import app.cash.local.primitives.MenuItem;
import app.cash.local.primitives.MenuItemVariation;
import app.cash.local.primitives.Selection;
import app.cash.local.primitives.math.LocalMoneysKt;
import com.squareup.cash.R;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.local.client.v1.LocalCart;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class LocalOpenTabCartMapper {
    public final AndroidClock clock;
    public final AndroidStringManager stringManager;

    public LocalOpenTabCartMapper(AndroidStringManager androidStringManager, AndroidClock androidClock) {
        this.stringManager = androidStringManager;
        this.clock = androidClock;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x003d, code lost:
    
        if (r6 == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String fallbackInformation(LocalCart.Line line, Selection selection, MenuItem menuItem) {
        String str;
        String str2 = line.menu_item_variation_name;
        if (str2 != null) {
            if (StringsKt.isBlank(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                return str2;
            }
        }
        if (selection != null && (str = selection.menuItemVariationToken) != null && menuItem != null) {
            Iterator it = menuItem.variations.iterator();
            boolean z = false;
            Object obj = null;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (Intrinsics.areEqual(((MenuItemVariation) next).token, str)) {
                        if (z) {
                            break;
                        }
                        z = true;
                        obj = next;
                    }
                }
            }
            obj = null;
            MenuItemVariation menuItemVariation = (MenuItemVariation) obj;
            if (menuItemVariation != null) {
                return menuItemVariation.name;
            }
        }
        return null;
    }

    public static LocalMoney subtotalOrLineTotal(LocalCart.OpenTabInfo.Round round) {
        LocalMoney moneyOrNull = toMoneyOrNull(round.subtotal);
        if (moneyOrNull != null) {
            return moneyOrNull;
        }
        List<LocalCart.Line> list = round.lines;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            LocalMoney moneyOrNull2 = toMoneyOrNull(((LocalCart.Line) it.next()).total_price);
            if (moneyOrNull2 == null) {
                moneyOrNull2 = LocalMoneysKt.zero(LocalCurrencyCode.USD);
            }
            arrayList.add(moneyOrNull2);
        }
        LocalMoney sumLocalMoneyOrZero = sumLocalMoneyOrZero(arrayList);
        if (round.lines.isEmpty()) {
            return null;
        }
        return sumLocalMoneyOrZero;
    }

    public static LocalMoney sumLocalMoneyOrZero(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        LocalMoney localMoney = null;
        while (it.hasNext()) {
            LocalMoney localMoney2 = (LocalMoney) it.next();
            localMoney = localMoney == null ? localMoney2 : LocalMoneysKt.plus(localMoney, localMoney2);
        }
        return localMoney == null ? LocalMoneysKt.zero(LocalCurrencyCode.USD) : localMoney;
    }

    public static LocalMoney toMoneyOrNull(com.squareup.protos.cash.local.client.v1.LocalMoney localMoney) {
        Long l;
        Object failure;
        if (localMoney == null || (l = localMoney.amount) == null) {
            return null;
        }
        long longValue = l.longValue();
        String str = localMoney.currency_code;
        if (str == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.Companion;
            failure = LocalCurrencyCode.valueOf(str);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        LocalCurrencyCode localCurrencyCode = (LocalCurrencyCode) failure;
        if (localCurrencyCode == null) {
            return null;
        }
        return new LocalMoney(longValue, localCurrencyCode);
    }

    public final String itemCountSummary(int i) {
        ArrayMap m = NavAction$$ExternalSyntheticOutline0.m(1, Integer.valueOf(i), "count");
        Resources resources = this.stringManager.resources;
        resources.getClass();
        String format2 = new MessageFormat(resources.getString(R.string.local_presenters_items_count)).format(m);
        format2.getClass();
        return format2;
    }
}
