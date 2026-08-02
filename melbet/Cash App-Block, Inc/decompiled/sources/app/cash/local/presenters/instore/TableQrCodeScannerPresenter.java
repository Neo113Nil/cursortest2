package app.cash.local.presenters.instore;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter$models$cameraPermissionDenial$2$1;
import app.cash.local.viewmodels.instore.CameraState;
import app.cash.local.viewmodels.instore.TableQrCodeScannerViewModel;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmo;
import com.squareup.cash.clientroutes.RealClientRouteParser;
import com.squareup.cash.clientroutes.RealDeepLinkParser;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.permissions.AndroidPermissionManager;
import com.squareup.cash.permissions.AndroidPermissionManager$create$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.ui.MainActivityModule$Companion$ProvideActivityLifecycleStateFlowMetroFactory;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes3.dex */
public final class TableQrCodeScannerPresenter implements MoleculePresenter {
    public final StateFlow activityLifecycleState;
    public final AndroidPermissionManager$create$1 cameraPermissions;
    public final RealClientRouteParser clientRouteParser;
    public final RealDeepLinkParser deepLinkParser;
    public final BetterNavigator.ScreenNavigator navigator;
    public final AndroidStringManager stringManager;

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final Provider activityLifecycleState;
        public final DoubleCheck clientRouteParser;
        public final DoubleCheck deepLinkParser;
        public final Provider permissionManager;
        public final LambdaProvider stringManager;
        public final LambdaProvider uuidGenerator;

        public MetroFactory(DoubleCheck doubleCheck, LambdaProvider lambdaProvider, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, MainActivityModule$Companion$ProvideActivityLifecycleStateFlowMetroFactory mainActivityModule$Companion$ProvideActivityLifecycleStateFlowMetroFactory, LambdaProvider lambdaProvider2) {
            this.permissionManager = doubleCheck;
            this.stringManager = lambdaProvider;
            this.clientRouteParser = doubleCheck2;
            this.deepLinkParser = doubleCheck3;
            this.activityLifecycleState = mainActivityModule$Companion$ProvideActivityLifecycleStateFlowMetroFactory;
            this.uuidGenerator = lambdaProvider2;
        }
    }

    public TableQrCodeScannerPresenter(AndroidPermissionManager androidPermissionManager, AndroidStringManager androidStringManager, RealClientRouteParser realClientRouteParser, RealDeepLinkParser realDeepLinkParser, StateFlow stateFlow, RealUuidGenerator realUuidGenerator, BetterNavigator.ScreenNavigator screenNavigator) {
        this.stringManager = androidStringManager;
        this.clientRouteParser = realClientRouteParser;
        this.deepLinkParser = realDeepLinkParser;
        this.activityLifecycleState = stateFlow;
        this.navigator = screenNavigator;
        this.cameraPermissions = androidPermissionManager.create("android.permission.CAMERA");
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-655083674);
        Object rememberedValue = gapComposer.rememberedValue();
        AndroidPermissionManager$create$1 androidPermissionManager$create$1 = this.cameraPermissions;
        Object obj = Composer.Companion.Empty;
        if (rememberedValue == obj) {
            rememberedValue = androidPermissionManager$create$1.$readonly.granted();
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Flow flow2 = (Flow) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == obj) {
            rememberedValue2 = androidPermissionManager$create$1.$readonly.denied();
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Flow flow3 = (Flow) rememberedValue2;
        MutableState collectAsState = Updater.collectAsState(flow2, null, null, gapComposer, 48, 2);
        Object rememberedValue3 = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (rememberedValue3 == obj) {
            Object flowUtil$createFlow$$inlined$map$1 = new FlowUtil$createFlow$$inlined$map$1(0, flow3, new LocalPosCheckInPresenter$models$cameraPermissionDenial$2$1(3, null, 1));
            gapComposer.updateRememberedValue(flowUtil$createFlow$$inlined$map$1);
            rememberedValue3 = flowUtil$createFlow$$inlined$map$1;
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue3, 0, null, gapComposer, 48, 2);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == obj) {
            rememberedValue4 = Updater.mutableStateOf$default(new TableQrCodeScannerCameraState(false, CameraState.RESUMED));
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState mutableState = (MutableState) rememberedValue4;
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(flow2) | gapComposer.changedInstance(flow3);
        StateFlow stateFlow = this.activityLifecycleState;
        boolean changedInstance2 = changedInstance | gapComposer.changedInstance(stateFlow);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue5 == obj) {
            Object tableQrCodeScannerPresenterKt$rememberTableQrCodeScannerCameraState$1$1 = new TableQrCodeScannerPresenterKt$rememberTableQrCodeScannerCameraState$1$1(flow2, mutableState, flow3, stateFlow, null);
            gapComposer.updateRememberedValue(tableQrCodeScannerPresenterKt$rememberTableQrCodeScannerCameraState$1$1);
            rememberedValue5 = tableQrCodeScannerPresenterKt$rememberTableQrCodeScannerCameraState$1$1;
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue5);
        TableQrCodeScannerCameraState tableQrCodeScannerCameraState = (TableQrCodeScannerCameraState) mutableState.getValue();
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (rememberedValue6 == obj) {
            rememberedValue6 = Updater.mutableStateOf$default(0);
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        MutableState mutableState2 = (MutableState) rememberedValue6;
        Updater.LaunchedEffect(gapComposer, flow, new zzmo(flow, continuation, this, mutableState2, 5));
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (rememberedValue7 == obj) {
            rememberedValue7 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue7);
        }
        MutableState mutableState3 = (MutableState) rememberedValue7;
        Boolean bool = (Boolean) collectAsState.getValue();
        Integer valueOf = Integer.valueOf(((Number) collectAsState2.getValue()).intValue());
        Boolean bool2 = (Boolean) mutableState3.getValue();
        bool2.getClass();
        boolean changed = gapComposer.changed(collectAsState) | gapComposer.changedInstance(this) | gapComposer.changed(collectAsState2);
        Object rememberedValue8 = gapComposer.rememberedValue();
        if (changed || rememberedValue8 == obj) {
            Object zzmoVar = new zzmo(this, mutableState3, collectAsState, collectAsState2, null, 6);
            gapComposer.updateRememberedValue(zzmoVar);
            rememberedValue8 = zzmoVar;
        }
        Updater.LaunchedEffect(bool, valueOf, bool2, (Function2) rememberedValue8, gapComposer);
        TableQrCodeScannerViewModel tableQrCodeScannerViewModel = new TableQrCodeScannerViewModel(tableQrCodeScannerCameraState.hasCameraPermission, tableQrCodeScannerCameraState.cameraState, ((Number) mutableState2.getValue()).intValue());
        gapComposer.end(false);
        return tableQrCodeScannerViewModel;
    }
}
