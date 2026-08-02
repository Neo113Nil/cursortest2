package com.squareup.cash.payments.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.R;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.nearby.backend.NearbyPermissionState;
import com.squareup.cash.nearby.backend.RealNearbyManager;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.viewmodels.NearbyPermissionsPromptSheetViewModel;
import com.squareup.cash.phoneplans.PhonePlansHomePresenter$models$1$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.ui.Image;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class NearbyPermissionsPromptSheetPresenter implements MoleculePresenter {
    public static final Image HERO_IMAGE = new Image("https://cash-f.squarecdn.com/static/nux-sheet-light.png", "https://cash-f.squarecdn.com/static/nux-sheet-dark.png", 4);
    public final Analytics analytics;
    public final PaymentScreens.NearbyPermissionsPromptSheet args;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealNearbyManager nearbyManager;
    public final AndroidStringManager stringManager;

    public NearbyPermissionsPromptSheetPresenter(RealNearbyManager realNearbyManager, AndroidStringManager androidStringManager, Analytics analytics, PaymentScreens.NearbyPermissionsPromptSheet nearbyPermissionsPromptSheet, BetterNavigator.ScreenNavigator screenNavigator) {
        nearbyPermissionsPromptSheet.getClass();
        this.nearbyManager = realNearbyManager;
        this.stringManager = androidStringManager;
        this.analytics = analytics;
        this.args = nearbyPermissionsPromptSheet;
        this.navigator = screenNavigator;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1163608222);
        MutableState permissionState = this.nearbyManager.permissionState(gapComposer);
        Continuation continuation = null;
        Updater.LaunchedEffect(gapComposer, flow, new PhonePlansHomePresenter$models$1$1(flow, continuation, this, permissionState, 7));
        NearbyPermissionState nearbyPermissionState = (NearbyPermissionState) permissionState.getValue();
        NearbyPermissionsPromptSheetViewModel.Loading loading = NearbyPermissionsPromptSheetViewModel.Loading.INSTANCE;
        int i2 = 0;
        if (nearbyPermissionState == null) {
            gapComposer.end(false);
            return loading;
        }
        boolean z = nearbyPermissionState.bluetoothPermission.granted;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (z && nearbyPermissionState.locationPermission.granted) {
            gapComposer.startReplaceGroup(-370859681);
            Unit unit = Unit.INSTANCE;
            boolean changedInstance = gapComposer.changedInstance(this);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new NearbyPermissionsPromptSheetPresenter$models$2$1(this, continuation, i2);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
            gapComposer.end(false);
            gapComposer.end(false);
            return loading;
        }
        gapComposer.startReplaceGroup(-370704960);
        gapComposer.end(false);
        Unit unit2 = Unit.INSTANCE;
        boolean changedInstance2 = gapComposer.changedInstance(this);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new NearbyPermissionsPromptSheetPresenter$models$2$1(this, continuation, 1);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.LaunchedEffect(gapComposer, unit2, (Function2) rememberedValue2);
        AndroidStringManager androidStringManager = this.stringManager;
        NearbyPermissionsPromptSheetViewModel.Ready ready = new NearbyPermissionsPromptSheetViewModel.Ready(HERO_IMAGE, androidStringManager.get(R.string.nearby_payments_info_title), androidStringManager.get(R.string.nearby_permissions_prompt_body), !z ? androidStringManager.get(R.string.nearby_permissions_bluetooth_permission_button) : androidStringManager.get(R.string.nearby_permissions_location_button));
        gapComposer.end(false);
        return ready;
    }
}
