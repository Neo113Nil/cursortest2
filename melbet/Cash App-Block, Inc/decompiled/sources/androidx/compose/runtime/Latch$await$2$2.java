package androidx.compose.runtime;

import android.os.CancellationSignal;
import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.camera.camera2.impl.LowLightBoostControl;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.KeyMappingKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.material3.TooltipStateImpl;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.text.Savers_androidKt$$ExternalSyntheticLambda0;
import androidx.paging.CachedPageEventFlow$$ExternalSyntheticLambda0;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Screen;
import app.cash.local.primitives.LocationMenu$$ExternalSyntheticLambda6;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda9;
import app.cash.molecule.AndroidUiDispatcher;
import app.cash.molecule.AndroidUiFrameClock;
import app.cash.molecule.AndroidUiFrameClock$withFrameNanos$2$callback$1;
import app.cash.passcode.presenters.EndAppLockPresenter;
import app.cash.redwood.yoga.internal.Yoga$$ExternalSyntheticLambda0;
import com.google.maps.android.compose.CameraPositionState;
import com.google.maps.android.compose.CameraPositionState$animate$2$1$animateOnMapAvailable$1;
import com.squareup.cash.activity.views.ActivityTabViewKt$$ExternalSyntheticLambda17;
import com.squareup.cash.appmessages.db.CardMessageQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.benefits.views.BenefitsHubViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.bitcoin.views.send.MoveBitcoinViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.views.LabelValueView$$ExternalSyntheticLambda0;
import com.squareup.cash.borrow.viewmodels.BorrowHomeOverlayEvent;
import com.squareup.cash.borrow.viewmodels.BorrowHomeOverlayViewModel;
import com.squareup.cash.borrow.viewmodels.SheetButtonAction;
import com.squareup.cash.calendar.views.CalendarRowKt$$ExternalSyntheticLambda10;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.StandaloneCoroutine;
import okio.ByteString;

/* loaded from: classes3.dex */
public final class Latch$await$2$2 implements Function1 {
    public final /* synthetic */ Object $co;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    public /* synthetic */ Latch$await$2$2(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$co = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        Object tapAction;
        boolean z = false;
        switch (this.$r8$classId) {
            case 0:
                Latch latch = (Latch) this.this$0;
                Object obj2 = latch.lock;
                CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) this.$co;
                synchronized (obj2) {
                    ((ArrayList) latch.awaiters).remove(cancellableContinuationImpl);
                }
                return Unit.INSTANCE;
            case 1:
                CompletableDeferredImpl completableDeferredImpl = (CompletableDeferredImpl) this.this$0;
                LowLightBoostControl lowLightBoostControl = (LowLightBoostControl) this.$co;
                if (completableDeferredImpl == lowLightBoostControl._updateSignal) {
                    lowLightBoostControl._updateSignal = null;
                }
                return Unit.INSTANCE;
            case 2:
                KeyEvent keyEvent = ((androidx.compose.ui.input.key.KeyEvent) obj).nativeKeyEvent;
                if (((LegacyTextFieldState) this.this$0).getHandleState() == HandleState.Selection && KeyMappingKt.m353cancelsTextSelectionZmokQxo(keyEvent)) {
                    ((TextFieldSelectionManager) this.$co).m456deselect_kEHs6E$foundation(null);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                KeyEvent keyEvent2 = ((androidx.compose.ui.input.key.KeyEvent) obj).nativeKeyEvent;
                FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) this.this$0;
                InputDevice device = keyEvent2.getDevice();
                if (device != null && device.supportsSource(513) && ((!device.isVirtual() || keyEvent2.getSource() == 33554433) && KeyEventType.m790getTypeZmokQxo(keyEvent2) == 2 && keyEvent2.getSource() != 257)) {
                    if (KeyMappingKt.m352access$isKeyCodeYhN2O0w(19, keyEvent2)) {
                        z = focusOwnerImpl.m597moveFocusaToIllA(5, true);
                    } else if (KeyMappingKt.m352access$isKeyCodeYhN2O0w(20, keyEvent2)) {
                        z = focusOwnerImpl.m597moveFocusaToIllA(6, true);
                    } else if (KeyMappingKt.m352access$isKeyCodeYhN2O0w(21, keyEvent2)) {
                        z = focusOwnerImpl.m597moveFocusaToIllA(3, true);
                    } else if (KeyMappingKt.m352access$isKeyCodeYhN2O0w(22, keyEvent2)) {
                        z = focusOwnerImpl.m597moveFocusaToIllA(4, true);
                    } else if (KeyMappingKt.m352access$isKeyCodeYhN2O0w(23, keyEvent2)) {
                        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = ((LegacyTextFieldState) this.$co).keyboardController;
                        if (delegatingSoftwareKeyboardController != null) {
                            delegatingSoftwareKeyboardController.show();
                        }
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 4:
                KeyEvent keyEvent3 = ((androidx.compose.ui.input.key.KeyEvent) obj).nativeKeyEvent;
                MutableState mutableState = (MutableState) this.$co;
                if (!((TooltipStateImpl) this.this$0).isVisible()) {
                    mutableState.setValue(Boolean.FALSE);
                }
                return Boolean.FALSE;
            case 5:
                CancellationSignal cancellationSignal = (CancellationSignal) this.this$0;
                if (cancellationSignal != null) {
                    cancellationSignal.cancel();
                }
                ((StandaloneCoroutine) this.$co).cancel(null);
                return Unit.INSTANCE;
            case 6:
                int intValue = ((Number) obj).intValue();
                return ((Savers_androidKt$$ExternalSyntheticLambda0) this.this$0).invoke(Integer.valueOf(intValue), ((List) this.$co).get(intValue));
            case 7:
                return ((CachedPageEventFlow$$ExternalSyntheticLambda0) this.this$0).invoke(((List) this.$co).get(((Number) obj).intValue()));
            case 8:
                ((LocationMenu$$ExternalSyntheticLambda6) this.this$0).invoke(((List) this.$co).get(((Number) obj).intValue()));
                return "content_type_item";
            case 9:
                ((LocationMenu$$ExternalSyntheticLambda6) this.this$0).invoke(((List) this.$co).get(((Number) obj).intValue()));
                return "error_banner";
            case 10:
                ((LocationMenu$$ExternalSyntheticLambda6) this.this$0).invoke(((List) this.$co).get(((Number) obj).intValue()));
                return "cart_selection_item";
            case 11:
                ((LocationMenu$$ExternalSyntheticLambda6) this.this$0).invoke(((List) this.$co).get(((Number) obj).intValue()));
                return "open_tab_error_banner";
            case 12:
                return ((LocationMenu$$ExternalSyntheticLambda6) this.this$0).invoke(((List) this.$co).get(((Number) obj).intValue()));
            case 13:
                int intValue2 = ((Number) obj).intValue();
                return ((Savers_androidKt$$ExternalSyntheticLambda0) this.this$0).invoke(Integer.valueOf(intValue2), ((List) this.$co).get(intValue2));
            case 14:
                return ((Yoga$$ExternalSyntheticLambda0) this.this$0).invoke(((ArrayList) this.$co).get(((Number) obj).intValue()));
            case 15:
                int intValue3 = ((Number) obj).intValue();
                return ((LocalHomeGeoViewKt$$ExternalSyntheticLambda9) this.this$0).invoke(Integer.valueOf(intValue3), ((List) this.$co).get(intValue3));
            case 16:
                AndroidUiDispatcher androidUiDispatcher = (AndroidUiDispatcher) this.this$0;
                AndroidUiFrameClock$withFrameNanos$2$callback$1 androidUiFrameClock$withFrameNanos$2$callback$1 = (AndroidUiFrameClock$withFrameNanos$2$callback$1) this.$co;
                synchronized (androidUiDispatcher.lock) {
                    androidUiDispatcher.toRunOnFrame.remove(androidUiFrameClock$withFrameNanos$2$callback$1);
                }
                return Unit.INSTANCE;
            case 17:
                ((AndroidUiFrameClock) this.this$0).choreographer.removeFrameCallback((AndroidUiFrameClock$withFrameNanos$2$callback$1) this.$co);
                return Unit.INSTANCE;
            case 18:
                CameraPositionState cameraPositionState = (CameraPositionState) this.this$0;
                Unit unit = cameraPositionState.lock;
                Unit unit2 = Unit.INSTANCE;
                CameraPositionState$animate$2$1$animateOnMapAvailable$1 cameraPositionState$animate$2$1$animateOnMapAvailable$1 = (CameraPositionState$animate$2$1$animateOnMapAvailable$1) this.$co;
                synchronized (unit2) {
                    if (((CameraPositionState.OnMapChangedCallback) cameraPositionState.onMapChanged$delegate.getValue()) == cameraPositionState$animate$2$1$animateOnMapAvailable$1) {
                        cameraPositionState.onMapChanged$delegate.setValue(null);
                    }
                }
                return unit2;
            case 19:
                return ((ActivityTabViewKt$$ExternalSyntheticLambda17) this.this$0).invoke(((List) this.$co).get(((Number) obj).intValue()));
            case 20:
                return ((ActivityTabViewKt$$ExternalSyntheticLambda17) this.this$0).invoke(((List) this.$co).get(((Number) obj).intValue()));
            case 21:
                return ((CardMessageQueries$$ExternalSyntheticLambda1) this.this$0).invoke(((ArrayList) this.$co).get(((Number) obj).intValue()));
            case 22:
                return ((CardMessageQueries$$ExternalSyntheticLambda1) this.this$0).invoke(((ArrayList) this.$co).get(((Number) obj).intValue()));
            case 23:
                ((CardMessageQueries$$ExternalSyntheticLambda1) this.this$0).invoke(((ArrayList) this.$co).get(((Number) obj).intValue()));
                return "agents_home_agent";
            case 24:
                return ((BenefitsHubViewKt$$ExternalSyntheticLambda2) this.this$0).invoke(((List) this.$co).get(((Number) obj).intValue()));
            case 25:
                return ((MoveBitcoinViewKt$$ExternalSyntheticLambda3) this.this$0).invoke(((ArrayList) this.$co).get(((Number) obj).intValue()));
            case 26:
                AskedQuestion askedQuestion = (AskedQuestion) obj;
                askedQuestion.getClass();
                EndAppLockPresenter endAppLockPresenter = (EndAppLockPresenter) this.this$0;
                BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) endAppLockPresenter.navigatorSwitcher;
                BlockersScreens.TreehouseBlockerScreen treehouseBlockerScreen = (BlockersScreens.TreehouseBlockerScreen) endAppLockPresenter.appLockState;
                Screen next = blockersDataNavigator.getNext(treehouseBlockerScreen, (BlockersData) this.$co);
                BlockersScreens.TreehouseBlockerScreen treehouseBlockerScreen2 = next instanceof BlockersScreens.TreehouseBlockerScreen ? (BlockersScreens.TreehouseBlockerScreen) next : null;
                if (treehouseBlockerScreen2 == null) {
                    return next;
                }
                List list = treehouseBlockerScreen.askedQuestions;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (((BlockersScreens.TreehouseBlockerQuestion) ((AskedQuestion) obj3).question).stackSize < ((BlockersScreens.TreehouseBlockerQuestion) askedQuestion.question).stackSize) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList plus = CollectionsKt.plus((Collection) arrayList, (Object) askedQuestion);
                BlockersData blockersData = treehouseBlockerScreen2.blockersData;
                String str2 = treehouseBlockerScreen2.path;
                ByteString byteString = treehouseBlockerScreen2.parameters;
                int i = treehouseBlockerScreen2.stackSize;
                String str3 = treehouseBlockerScreen2.proposedTreehouseFlowToken;
                String str4 = treehouseBlockerScreen2.plasmaFlowToken;
                blockersData.getClass();
                str2.getClass();
                return new BlockersScreens.TreehouseBlockerScreen(blockersData, str2, byteString, i, plus, str3, str4);
            case 27:
                return ((LabelValueView$$ExternalSyntheticLambda0) this.this$0).invoke(((ArrayList) this.$co).get(((Number) obj).intValue()));
            case 28:
                SheetButtonAction sheetButtonAction = (SheetButtonAction) obj;
                if (sheetButtonAction == null) {
                    tapAction = BorrowHomeOverlayEvent.BulletinInfoOverlayEvent.Dismiss.INSTANCE;
                } else {
                    BorrowHomeOverlayViewModel borrowHomeOverlayViewModel = (BorrowHomeOverlayViewModel) this.this$0;
                    BorrowHomeOverlayViewModel.BulletinInfo bulletinInfo = (BorrowHomeOverlayViewModel.BulletinInfo) borrowHomeOverlayViewModel;
                    if (bulletinInfo instanceof BorrowHomeOverlayViewModel.InfoSheet) {
                        str = ((BorrowHomeOverlayViewModel.InfoSheet) borrowHomeOverlayViewModel).primaryText;
                    } else {
                        if (!(bulletinInfo instanceof BorrowHomeOverlayViewModel.InfoModal)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        str = ((BorrowHomeOverlayViewModel.InfoModal) borrowHomeOverlayViewModel).primaryText;
                    }
                    tapAction = new BorrowHomeOverlayEvent.BulletinInfoOverlayEvent.TapAction(sheetButtonAction, str);
                }
                ((Function1) this.$co).invoke(tapAction);
                return Unit.INSTANCE;
            default:
                return ((CalendarRowKt$$ExternalSyntheticLambda10) this.this$0).invoke(((List) this.$co).get(((Number) obj).intValue()));
        }
    }
}
