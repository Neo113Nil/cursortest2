package com.squareup.cash.phoneplans;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter$models$6$1;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.phoneplans.WirelessProviderListViewModel;
import com.squareup.protos.franklin.api.WirelessProviderListBlocker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class WirelessProviderListPresenter implements MoleculePresenter {
    public final WirelessProviderListBlockerScreen args;
    public final RealBlockersHelper blockersHelper;
    public final ErrorReporter errorReporter;
    public final BetterNavigator.ScreenNavigator navigator;
    public final ArrayList validatedProviders;

    public WirelessProviderListPresenter(RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, ErrorReporter errorReporter, WirelessProviderListBlockerScreen wirelessProviderListBlockerScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        wirelessProviderListBlockerScreen.getClass();
        this.errorReporter = errorReporter;
        this.args = wirelessProviderListBlockerScreen;
        this.navigator = screenNavigator;
        this.blockersHelper = realBlockersHelper$Factory$Impl.create(screenNavigator);
        WirelessProviderListBlocker wirelessProviderListBlocker = wirelessProviderListBlockerScreen.blocker;
        List<WirelessProviderListBlocker.WirelessProvider> list = wirelessProviderListBlocker.wireless_providers;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            String str = null;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            WirelessProviderListBlocker.WirelessProvider wirelessProvider = (WirelessProviderListBlocker.WirelessProvider) obj;
            String str2 = wirelessProvider.id;
            if (str2 == null || StringsKt.isBlank(str2)) {
                String str3 = wirelessProvider.name;
                str = (str3 == null ? "<unnamed>" : str3) + " (index " + i + ")";
            }
            if (str != null) {
                arrayList.add(str);
            }
            i = i2;
        }
        boolean isEmpty = arrayList.isEmpty();
        ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
        if (!isEmpty) {
            this.errorReporter.report(new WirelessProviderListValidationError("WirelessProviderListBlocker contained providers with empty IDs: ".concat(CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, null, 63))), defaultSamplingStrategy);
        }
        List<WirelessProviderListBlocker.WirelessProvider> list2 = wirelessProviderListBlocker.wireless_providers;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            String str4 = ((WirelessProviderListBlocker.WirelessProvider) obj2).id;
            if (str4 != null && !StringsKt.isBlank(str4)) {
                arrayList2.add(obj2);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            WirelessProviderListBlocker.WirelessProvider wirelessProvider2 = (WirelessProviderListBlocker.WirelessProvider) next;
            String str5 = wirelessProvider2.id;
            str5.getClass();
            if (linkedHashSet.add(str5)) {
                arrayList4.add(next);
            } else {
                arrayList3.add(wirelessProvider2.name + " (id " + wirelessProvider2.id + ")");
            }
        }
        if (!arrayList3.isEmpty()) {
            this.errorReporter.report(new WirelessProviderListValidationError("WirelessProviderListBlocker contained duplicate provider IDs: ".concat(CollectionsKt.joinToString$default(arrayList3, null, null, null, 0, null, null, 63))), defaultSamplingStrategy);
        }
        ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            WirelessProviderListBlocker.WirelessProvider wirelessProvider3 = (WirelessProviderListBlocker.WirelessProvider) it2.next();
            String str6 = wirelessProvider3.id;
            str6.getClass();
            String str7 = wirelessProvider3.name;
            if (str7 == null) {
                str7 = "";
            }
            arrayList5.add(new WirelessProviderListViewModel.ProviderItem(wirelessProvider3.logo, str6, str7));
        }
        this.validatedProviders = arrayList5;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        ArrayList arrayList;
        Object content;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1009962759);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Updater.mutableStateOf$default("");
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState2 = (MutableState) rememberedValue2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState3 = (MutableState) rememberedValue3;
        Updater.LaunchedEffect(gapComposer, flow, new MoneybotChatPresenter$models$6$1(flow, (Continuation) null, (MoleculePresenter) this, (Object) mutableState2, (State) mutableState, (Object) mutableState3, 29));
        boolean isBlank = StringsKt.isBlank((String) mutableState2.getValue());
        ArrayList arrayList2 = this.validatedProviders;
        if (isBlank) {
            arrayList = arrayList2;
        } else {
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (StringsKt.contains((CharSequence) ((WirelessProviderListViewModel.ProviderItem) next).name, (CharSequence) mutableState2.getValue(), true)) {
                    arrayList3.add(next);
                }
            }
            arrayList = arrayList3;
        }
        WirelessProviderListBlockerScreen wirelessProviderListBlockerScreen = this.args;
        WirelessProviderListBlocker wirelessProviderListBlocker = wirelessProviderListBlockerScreen.blocker;
        if (((Boolean) mutableState3.getValue()).booleanValue()) {
            content = WirelessProviderListViewModel.Loading.INSTANCE;
        } else {
            String str = wirelessProviderListBlocker.title;
            String str2 = str == null ? "" : str;
            String str3 = wirelessProviderListBlocker.search_hint_text;
            String str4 = str3 == null ? "" : str3;
            String str5 = wirelessProviderListBlocker.empty_state_text;
            String str6 = str5 == null ? "" : str5;
            String str7 = wirelessProviderListBlocker.button_text;
            content = new WirelessProviderListViewModel.Content(str2, str4, str6, str7 == null ? "" : str7, arrayList, (String) mutableState.getValue(), (String) mutableState2.getValue(), ((String) mutableState.getValue()) != null, wirelessProviderListBlockerScreen.retreatAction != null ? WirelessProviderListViewModel.ToolbarButton.Back : WirelessProviderListViewModel.ToolbarButton.Close, wirelessProviderListBlockerScreen.helpAction != null);
        }
        gapComposer.end(false);
        return content;
    }
}
