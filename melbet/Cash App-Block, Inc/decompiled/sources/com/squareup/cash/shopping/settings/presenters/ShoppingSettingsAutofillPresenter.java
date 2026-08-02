package com.squareup.cash.shopping.settings.presenters;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.address.typeahead.backend.api.AddressKt;
import com.squareup.cash.R;
import com.squareup.cash.cashcommercebrowser.api.v1.CustomerPreferencesService;
import com.squareup.cash.cashcommercebrowser.api.v1.UpdateCustomerPreferencesRequest;
import com.squareup.cash.cdf.personalprofile.PersonalProfileTapShoppingAutofillToggle;
import com.squareup.cash.cdf.personalprofile.PersonalProfileViewShoppingAutofillToggleError;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$1$1$1$2$1$3$1;
import com.squareup.cash.pools.presenters.PoolsListPresenter$models$2$2;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.sheet.BasicShieetKt$BasicShieet$4$1;
import com.squareup.cash.shopping.backend.api.ShippingAddressRepository$ShippingAddressResult;
import com.squareup.cash.shopping.backend.real.RealShippingAddressRepository;
import com.squareup.cash.shopping.settings.screens.ErrorScreen;
import com.squareup.cash.shopping.settings.viewmodels.ShoppingSettingsAutofillViewModel;
import com.squareup.protos.cash.commercebrowser.CommerceBrowserAutofillPreferences;
import com.squareup.protos.cash.grantly.api.FullName;
import com.squareup.protos.cash.grantly.api.ShippingAddress;
import com.squareup.protos.common.location.GlobalAddress;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class ShoppingSettingsAutofillPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final CustomerPreferencesService customerPreferenceService;
    public final CoroutineContext ioContext;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealShippingAddressRepository shippingAddressRepository;
    public final AndroidStringManager stringManager;
    public final SyncValueReader syncValueReader;

    public ShoppingSettingsAutofillPresenter(SyncValueReader syncValueReader, CustomerPreferencesService customerPreferencesService, RealShippingAddressRepository realShippingAddressRepository, Analytics analytics, AndroidStringManager androidStringManager, CoroutineContext coroutineContext, BetterNavigator.ScreenNavigator screenNavigator) {
        this.syncValueReader = syncValueReader;
        this.customerPreferenceService = customerPreferencesService;
        this.shippingAddressRepository = realShippingAddressRepository;
        this.analytics = analytics;
        this.stringManager = androidStringManager;
        this.ioContext = coroutineContext;
        this.navigator = screenNavigator;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleAutofillCheckChange(boolean z, QuickPayViewKt$QuickPay$1$1$1$2$1$3$1 quickPayViewKt$QuickPay$1$1$1$2$1$3$1, ContinuationImpl continuationImpl) {
        ShoppingSettingsAutofillPresenter$handleAutofillCheckChange$1 shoppingSettingsAutofillPresenter$handleAutofillCheckChange$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof ShoppingSettingsAutofillPresenter$handleAutofillCheckChange$1) {
            shoppingSettingsAutofillPresenter$handleAutofillCheckChange$1 = (ShoppingSettingsAutofillPresenter$handleAutofillCheckChange$1) continuationImpl;
            int i2 = shoppingSettingsAutofillPresenter$handleAutofillCheckChange$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                shoppingSettingsAutofillPresenter$handleAutofillCheckChange$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = shoppingSettingsAutofillPresenter$handleAutofillCheckChange$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = shoppingSettingsAutofillPresenter$handleAutofillCheckChange$1.label;
                Analytics analytics = this.analytics;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    analytics.track(new PersonalProfileTapShoppingAutofillToggle(Boolean.valueOf(z), Boolean.valueOf(!z)), null);
                    shoppingSettingsAutofillPresenter$handleAutofillCheckChange$1.L$0 = quickPayViewKt$QuickPay$1$1$1$2$1$3$1;
                    shoppingSettingsAutofillPresenter$handleAutofillCheckChange$1.Z$0 = z;
                    shoppingSettingsAutofillPresenter$handleAutofillCheckChange$1.label = 1;
                    obj = this.customerPreferenceService.updateCustomerPreferences(new UpdateCustomerPreferencesRequest(new CommerceBrowserAutofillPreferences(Boolean.valueOf(z))), shoppingSettingsAutofillPresenter$handleAutofillCheckChange$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = shoppingSettingsAutofillPresenter$handleAutofillCheckChange$1.Z$0;
                    quickPayViewKt$QuickPay$1$1$1$2$1$3$1 = shoppingSettingsAutofillPresenter$handleAutofillCheckChange$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    quickPayViewKt$QuickPay$1$1$1$2$1$3$1.invoke();
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    analytics.track(new PersonalProfileViewShoppingAutofillToggleError(Boolean.valueOf(z), Boolean.valueOf(!z)), null);
                    AndroidStringManager androidStringManager = this.stringManager;
                    this.navigator.goTo(new ErrorScreen(androidStringManager.get(R.string.shopping_settings_autofill_toggle_error_title), androidStringManager.get(R.string.shopping_settings_autofill_toggle_error_description)));
                }
                return Unit.INSTANCE;
            }
        }
        shoppingSettingsAutofillPresenter$handleAutofillCheckChange$1 = new ShoppingSettingsAutofillPresenter$handleAutofillCheckChange$1(this, continuationImpl);
        Object obj2 = shoppingSettingsAutofillPresenter$handleAutofillCheckChange$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = shoppingSettingsAutofillPresenter$handleAutofillCheckChange$1.label;
        Analytics analytics2 = this.analytics;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        return Unit.INSTANCE;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        ShoppingSettingsAutofillViewModel.AddressViewModel addressViewModel;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(315091229);
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Continuation continuation = null;
        if (changedInstance || rememberedValue == neverEqualPolicy) {
            rememberedValue = new BasicShieetKt$BasicShieet$4$1(this, continuation, 24);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState produceState = Updater.produceState(gapComposer, null, (Function2) rememberedValue);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = this.syncValueReader.getSingleValue(AndroidSyncValueSpecs.CommerceBrowserAutofillPreferences);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState collectAsState = Updater.collectAsState((StateFlow) rememberedValue2, null, gapComposer, 1);
        boolean changed = gapComposer.changed((CommerceBrowserAutofillPreferences) collectAsState.getValue());
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changed || rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = Recorder$$ExternalSyntheticOutline1.m(!(((CommerceBrowserAutofillPreferences) collectAsState.getValue()) != null ? Intrinsics.areEqual(r14.opt_out, Boolean.TRUE) : false), gapComposer);
        }
        MutableState mutableState = (MutableState) rememberedValue3;
        Updater.LaunchedEffect(gapComposer, flow, new PoolsListPresenter$models$2$2(flow, (Continuation) null, (MoleculePresenter) this, mutableState, (State) produceState, 25));
        boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
        ShippingAddressRepository$ShippingAddressResult shippingAddressRepository$ShippingAddressResult = (ShippingAddressRepository$ShippingAddressResult) produceState.getValue();
        if (shippingAddressRepository$ShippingAddressResult == null) {
            addressViewModel = ShoppingSettingsAutofillViewModel.AddressViewModel.Loading.INSTANCE;
        } else if (shippingAddressRepository$ShippingAddressResult instanceof ShippingAddressRepository$ShippingAddressResult.Failure) {
            addressViewModel = ShoppingSettingsAutofillViewModel.AddressViewModel.Error.INSTANCE;
        } else {
            if (!(shippingAddressRepository$ShippingAddressResult instanceof ShippingAddressRepository$ShippingAddressResult.Success)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            ShippingAddressRepository$ShippingAddressResult shippingAddressRepository$ShippingAddressResult2 = (ShippingAddressRepository$ShippingAddressResult) produceState.getValue();
            shippingAddressRepository$ShippingAddressResult2.getClass();
            ShippingAddress shippingAddress = ((ShippingAddressRepository$ShippingAddressResult.Success) shippingAddressRepository$ShippingAddressResult2).shippingAddress;
            if (shippingAddress != null) {
                GlobalAddress globalAddress = shippingAddress.global_address;
                FullName fullName = shippingAddress.full_name;
                if (globalAddress != null && (str = globalAddress.address_line_1) != null && (!StringsKt.isBlank(str)) && (str2 = globalAddress.locality) != null && (!StringsKt.isBlank(str2)) && (str3 = globalAddress.administrative_district_level_1) != null && (!StringsKt.isBlank(str3)) && (str4 = globalAddress.postal_code) != null && (!StringsKt.isBlank(str4)) && (str5 = shippingAddress.email) != null && (!StringsKt.isBlank(str5)) && fullName != null) {
                    String str6 = fullName.family_name;
                    String str7 = fullName.given_name;
                    if (str7 != null && (!StringsKt.isBlank(str7)) && str6 != null && (!StringsKt.isBlank(str6))) {
                        addressViewModel = new ShoppingSettingsAutofillViewModel.AddressViewModel.Loaded(StringsKt.trim(str7 + " " + str6).toString(), AddressKt.buildAsString(globalAddress, false));
                    }
                }
            }
            addressViewModel = ShoppingSettingsAutofillViewModel.AddressViewModel.Incomplete.INSTANCE;
        }
        ShoppingSettingsAutofillViewModel shoppingSettingsAutofillViewModel = new ShoppingSettingsAutofillViewModel(booleanValue, addressViewModel);
        gapComposer.end(false);
        return shoppingSettingsAutofillViewModel;
    }
}
