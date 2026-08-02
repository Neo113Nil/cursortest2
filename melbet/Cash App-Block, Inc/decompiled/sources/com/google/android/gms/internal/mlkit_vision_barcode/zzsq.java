package com.google.android.gms.internal.mlkit_vision_barcode;

import app.cash.local.backend.CartBuilderKt;
import app.cash.local.presenters.cart.ComboSlotViewModelBuilder;
import app.cash.local.presenters.cart.LineSelectionInformationRendererKt;
import app.cash.local.presenters.internal.LocalsKt;
import app.cash.local.primitives.Cart;
import app.cash.local.primitives.CartEntry;
import app.cash.local.primitives.Line;
import app.cash.local.primitives.LocalMoney;
import app.cash.local.primitives.LocationMenu;
import app.cash.local.primitives.MenuItem;
import app.cash.local.primitives.Selection;
import app.cash.local.viewmodels.ComboSlotViewModel;
import app.cash.local.viewmodels.LocalCartSummaryLineViewModel;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.work.service.real.RegisterNetworkingModule$$ExternalSyntheticLambda0;
import com.squareup.cash.work.service.real.RegisterNetworkingModule$$ExternalSyntheticLambda1;
import com.squareup.moshi.Moshi;
import com.squareup.util.logging.NoOpRetrofitLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import okhttp3.Call;
import retrofit2.BuiltInConverters;
import retrofit2.CompletableFutureCallAdapterFactory;
import retrofit2.DefaultCallAdapterFactory;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

/* loaded from: classes6.dex */
public abstract class zzsq {
    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewCardNfc.deepLinkSpecs;
    }

    public static RegisterNetworkingModule$$ExternalSyntheticLambda1 provideCashProxyCallFactory(Lazy lazy) {
        return new RegisterNetworkingModule$$ExternalSyntheticLambda1(LazyKt.lazy(new RegisterNetworkingModule$$ExternalSyntheticLambda0(lazy, 1)), 1);
    }

    public static Retrofit provideCashProxyRetrofit(Call.Factory factory, String str, NoOpRetrofitLogger noOpRetrofitLogger, Moshi moshi) {
        Retrofit.Builder builder = new Retrofit.Builder();
        builder.callFactory = factory;
        builder.baseUrl(str);
        MoshiConverterFactory create = MoshiConverterFactory.create(moshi);
        ArrayList arrayList = (ArrayList) builder.converterFactories;
        arrayList.add(create);
        arrayList.add(new BuiltInConverters(2));
        int i = 1;
        DefaultCallAdapterFactory defaultCallAdapterFactory = new DefaultCallAdapterFactory(noOpRetrofitLogger, i);
        ArrayList arrayList2 = (ArrayList) builder.callAdapterFactories;
        arrayList2.add(defaultCallAdapterFactory);
        arrayList2.add(new CompletableFutureCallAdapterFactory(i));
        return builder.build();
    }

    public static RegisterNetworkingModule$$ExternalSyntheticLambda1 provideRegisterCallFactory(Lazy lazy) {
        return new RegisterNetworkingModule$$ExternalSyntheticLambda1(LazyKt.lazy(new RegisterNetworkingModule$$ExternalSyntheticLambda0(lazy, 0)), 0);
    }

    public static Retrofit provideRegisterRetrofit(Call.Factory factory, String str, NoOpRetrofitLogger noOpRetrofitLogger, Moshi moshi) {
        Retrofit.Builder builder = new Retrofit.Builder();
        builder.callFactory = factory;
        builder.baseUrl(str);
        MoshiConverterFactory create = MoshiConverterFactory.create(moshi);
        ArrayList arrayList = (ArrayList) builder.converterFactories;
        arrayList.add(create);
        arrayList.add(new BuiltInConverters(2));
        int i = 1;
        DefaultCallAdapterFactory defaultCallAdapterFactory = new DefaultCallAdapterFactory(noOpRetrofitLogger, i);
        ArrayList arrayList2 = (ArrayList) builder.callAdapterFactories;
        arrayList2.add(defaultCallAdapterFactory);
        arrayList2.add(new CompletableFutureCallAdapterFactory(i));
        return builder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [app.cash.local.viewmodels.LocalCartSummaryLineViewModel] */
    public static final ArrayList toCheckoutSummaryLines(Cart cart, LocationMenu locationMenu) {
        Iterator it;
        String str;
        cart.getClass();
        locationMenu.getClass();
        List list = cart.lines;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        int i = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i2 = i + 1;
            LocalCartSummaryLineViewModel.Discount discount = null;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            Line line = (Line) next;
            Selection selection = line.selection;
            String str2 = line.discountText;
            MenuItem m1244menuItemOrNullGvMOdU0 = locationMenu.m1244menuItemOrNullGvMOdU0(selection.menuItemToken);
            if (m1244menuItemOrNullGvMOdU0 == null) {
                it = it2;
            } else {
                CartEntry m1202toCartEntryxZOLh24 = CartBuilderKt.m1202toCartEntryxZOLh24(selection, locationMenu, str2, null);
                String str3 = m1244menuItemOrNullGvMOdU0.name;
                String buildSelectionInformationString = LineSelectionInformationRendererKt.buildSelectionInformationString(m1202toCartEntryxZOLh24, locationMenu, m1244menuItemOrNullGvMOdU0);
                int i3 = selection.quantity;
                String prettyPrint$default = LocalsKt.prettyPrint$default(line.totalPrice, false, null, 7);
                it = it2;
                LocalMoney localMoney = line.totalPriceBeforeDiscounts;
                String prettyPrint$default2 = localMoney != null ? LocalsKt.prettyPrint$default(localMoney, false, null, 7) : null;
                LocalMoney localMoney2 = line.discountAmount;
                if (localMoney2 != null) {
                    if (str2 == null) {
                        str2 = "";
                    }
                    str = prettyPrint$default2;
                    discount = new LocalCartSummaryLineViewModel.Discount(str2, LocalsKt.prettyPrint$default(localMoney2, false, "- ", 5));
                } else {
                    str = prettyPrint$default2;
                }
                List list2 = m1202toCartEntryxZOLh24.comboSlotSelections;
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    ComboSlotViewModel buildComboSlotViewModel = ComboSlotViewModelBuilder.buildComboSlotViewModel(locationMenu, m1244menuItemOrNullGvMOdU0, (CartEntry.ComboSlotSelection) it3.next(), EmptyList.INSTANCE);
                    if (buildComboSlotViewModel != null) {
                        arrayList2.add(buildComboSlotViewModel);
                    }
                }
                discount = new LocalCartSummaryLineViewModel(i, str3, buildSelectionInformationString, prettyPrint$default, str, i3, discount, arrayList2);
            }
            if (discount != null) {
                arrayList.add(discount);
            }
            it2 = it;
            i = i2;
        }
        return arrayList;
    }
}
