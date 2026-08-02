package com.squareup.cash.maps.views;

import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.IntSize;
import app.cash.broadway.ui.compose.DialogListenerEvent;
import coil3.compose.AsyncImagePainter;
import com.miteksystems.misnap.controller.MiSnapController;
import com.miteksystems.misnap.core.MibiData;
import com.miteksystems.misnap.workflow.view.MiSnapView;
import com.squareup.cash.activity.viewmodels.ActivityItemViewEvent;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletUpsellSheetViewEvent;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinLocationFilter;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinMapViewEvent;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.CashtagViewEvent;
import com.squareup.cash.blockers.viewmodels.ReferralCodeViewEvent;
import com.squareup.cash.blockers.viewmodels.VerifyAliasViewEvent;
import com.squareup.cash.card.onboarding.PaymentDeviceCustomizationViewEvent;
import com.squareup.cash.checks.CaptureCheckFaceViewEvent;
import com.squareup.cash.deposits.physical.viewmodels.map.PaperMoneyDepositMapEvent;
import com.squareup.cash.maps.viewmodels.CashMapViewEvent;
import com.squareup.cash.maps.views.MapEngineEvent;
import com.squareup.cash.mooncake.screens.AlertDialogResult;
import com.squareup.cash.payments.viewmodels.MainPaymentViewEvent;
import com.squareup.cash.support.chat.views.transcript.message.compose.ImageState;
import com.squareup.cash.work.viewmodels.ShiftListViewEvent;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* loaded from: classes6.dex */
public final /* synthetic */ class CashMapViewKt$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ MutableState f$1;

    public /* synthetic */ CashMapViewKt$$ExternalSyntheticLambda3(MutableState mutableState, Function1 function1) {
        this.$r8$classId = 3;
        this.f$1 = mutableState;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                MapEngineEvent mapEngineEvent = (MapEngineEvent) obj;
                mapEngineEvent.getClass();
                if (!(mapEngineEvent instanceof MapEngineEvent.MovementFinished)) {
                    boolean z = mapEngineEvent instanceof MapEngineEvent.MapClicked;
                    CashMapViewEvent.ClearSelectedLocation clearSelectedLocation = CashMapViewEvent.ClearSelectedLocation.INSTANCE;
                    if (!z) {
                        if (!(mapEngineEvent instanceof MapEngineEvent.MarkerClicked)) {
                            if (!(mapEngineEvent instanceof MapEngineEvent.ClusterClicked)) {
                                if (!(mapEngineEvent instanceof MapEngineEvent.MaxZoomClusterClicked)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    break;
                                } else {
                                    function1.invoke(clearSelectedLocation);
                                    mutableState.setValue(CollectionsKt.toList(((MapEngineEvent.MaxZoomClusterClicked) mapEngineEvent).items));
                                }
                            } else {
                                MapEngineEvent.ClusterClicked clusterClicked = (MapEngineEvent.ClusterClicked) mapEngineEvent;
                                function1.invoke(new CashMapViewEvent.ClusterClicked(clusterClicked.lat, clusterClicked.lng, clusterClicked.items, Float.valueOf(clusterClicked.targetZoom)));
                            }
                        } else {
                            function1.invoke(new CashMapViewEvent.MarkerClicked(((MapEngineEvent.MarkerClicked) mapEngineEvent).token));
                        }
                    } else {
                        function1.invoke(clearSelectedLocation);
                    }
                } else {
                    MapEngineEvent.MovementFinished movementFinished = (MapEngineEvent.MovementFinished) mapEngineEvent;
                    function1.invoke(new CashMapViewEvent.MapMovementFinished(movementFinished.lat, movementFinished.lng, movementFinished.zoom, movementFinished.zoomRadiusInMeters, movementFinished.boundary, movementFinished.isUserGesture));
                }
                break;
            case 1:
                Integer num = (Integer) obj;
                num.getClass();
                mutableState.setValue(Boolean.FALSE);
                function1.invoke(num);
                break;
            case 2:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                layoutCoordinates.getClass();
                Rect boundsInWindow = ValueInsets.boundsInWindow(layoutCoordinates, true);
                ActivityItemViewEvent.VisibilityChanged.Visibility visibility = IntSize.m1055equalsimpl0(Countries.m3990toIntSizeuvyYCjk(boundsInWindow.m634getSizeNHjbRc()), layoutCoordinates.mo838getSizeYbymL2g()) ? ActivityItemViewEvent.VisibilityChanged.Visibility.FullyVisible : !boundsInWindow.isEmpty() ? ActivityItemViewEvent.VisibilityChanged.Visibility.PartiallyVisible : ActivityItemViewEvent.VisibilityChanged.Visibility.Hidden;
                if (((ActivityItemViewEvent.VisibilityChanged.Visibility) mutableState.getValue()) != visibility) {
                    function1.invoke(new ActivityItemViewEvent.VisibilityChanged(visibility));
                }
                mutableState.setValue(visibility);
                break;
            case 3:
                ((LayoutCoordinates) obj).getClass();
                if (!((Boolean) mutableState.getValue()).booleanValue()) {
                    function1.invoke(AfterpayAppletUpsellSheetViewEvent.SheetViewed.INSTANCE);
                    mutableState.setValue(Boolean.TRUE);
                }
                break;
            case 4:
                BitcoinLocationFilter bitcoinLocationFilter = (BitcoinLocationFilter) obj;
                bitcoinLocationFilter.getClass();
                function1.invoke(new BitcoinMapViewEvent.UpdateLocationFilter(bitcoinLocationFilter));
                mutableState.setValue(Boolean.FALSE);
                break;
            case 5:
                DialogListenerEvent dialogListenerEvent = (DialogListenerEvent) obj;
                dialogListenerEvent.getClass();
                boolean z2 = dialogListenerEvent instanceof DialogListenerEvent.OnDialogCanceled;
                CashtagViewEvent.DialogNegativeResult dialogNegativeResult = CashtagViewEvent.DialogNegativeResult.INSTANCE;
                if (!z2) {
                    if (!(dialogListenerEvent instanceof DialogListenerEvent.OnDialogResult)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        DialogListenerEvent.OnDialogResult onDialogResult = (DialogListenerEvent.OnDialogResult) dialogListenerEvent;
                        if (onDialogResult.screen instanceof BlockersScreens.CashtagConfirmationScreen) {
                            if (onDialogResult.result == AlertDialogResult.POSITIVE) {
                                function1.invoke(new CashtagViewEvent.DialogPositiveResult(((TextFieldValue) mutableState.getValue()).annotatedString.text));
                            } else {
                                function1.invoke(dialogNegativeResult);
                            }
                        }
                    }
                } else if (((DialogListenerEvent.OnDialogCanceled) dialogListenerEvent).screen instanceof BlockersScreens.CashtagConfirmationScreen) {
                    function1.invoke(dialogNegativeResult);
                }
                break;
            case 6:
                TextFieldValue textFieldValue = (TextFieldValue) obj;
                textFieldValue.getClass();
                AnnotatedString annotatedString = textFieldValue.annotatedString;
                if (!Intrinsics.areEqual(annotatedString.text, ((TextFieldValue) mutableState.getValue()).annotatedString.text)) {
                    function1.invoke(new CashtagViewEvent.InputChange(annotatedString.text));
                }
                mutableState.setValue(textFieldValue);
                break;
            case 7:
                String str = (String) obj;
                str.getClass();
                Locale locale = Locale.getDefault();
                locale.getClass();
                String upperCase = str.toUpperCase(locale);
                upperCase.getClass();
                mutableState.setValue(upperCase);
                function1.invoke(new ReferralCodeViewEvent.CodeInputChanged(upperCase));
                break;
            case 8:
                ((KeyboardActionScope) obj).getClass();
                function1.invoke(new VerifyAliasViewEvent.SubmitCode((String) mutableState.getValue()));
                break;
            case 9:
                Float f = (Float) obj;
                f.getClass();
                mutableState.setValue(Boolean.TRUE);
                function1.invoke(f);
                break;
            case 10:
                String str2 = (String) obj;
                str2.getClass();
                if (((String) mutableState.getValue()) != null) {
                    function1.invoke(PaymentDeviceCustomizationViewEvent.CloseProductDetailsPage.INSTANCE);
                }
                mutableState.setValue(str2);
                function1.invoke(new PaymentDeviceCustomizationViewEvent.DeviceOptionSelected(str2));
                break;
            case 11:
                MiSnapController.FrameResult frameResult = (MiSnapController.FrameResult) obj;
                frameResult.getClass();
                MiSnapController.FrameResult.DocumentAnalysis documentAnalysis = (MiSnapController.FrameResult.DocumentAnalysis) frameResult;
                Object last = CollectionsKt.last(documentAnalysis.f.c);
                last.getClass();
                MibiData.DocumentSessionInfo documentSessionInfo = (MibiData.DocumentSessionInfo) last;
                ByteString.Companion companion = ByteString.Companion;
                ByteString of$default = ByteString.Companion.of$default(documentAnalysis.a);
                int[][] iArr = documentSessionInfo.g;
                function1.invoke(new CaptureCheckFaceViewEvent.RawFinalFrame(of$default, iArr != null ? ArraysKt___ArraysKt.toList(iArr) : null, documentSessionInfo.j, documentSessionInfo.i, ((MiSnapView) mutableState.getValue()).getWidth(), ((MiSnapView) mutableState.getValue()).getHeight()));
                break;
            case 12:
                List list = (List) obj;
                list.getClass();
                function1.invoke(new PaperMoneyDepositMapEvent.UpdateFilters(list));
                mutableState.setValue(Boolean.FALSE);
                break;
            case 13:
                IntSize intSize = (IntSize) obj;
                mutableState.setValue(new IntSize(intSize.packedValue));
                function1.invoke(intSize);
                break;
            case 14:
                Float f2 = (Float) obj;
                f2.floatValue();
                mutableState.setValue(f2);
                function1.invoke(f2);
                break;
            case 15:
                String str3 = (String) obj;
                str3.getClass();
                mutableState.setValue(str3);
                function1.invoke(new MainPaymentViewEvent.NoteTextChanged(str3));
                break;
            case 16:
                AsyncImagePainter.State.Error error = (AsyncImagePainter.State.Error) obj;
                error.getClass();
                mutableState.setValue(ImageState.ERROR);
                function1.invoke(error.result.throwable.getMessage());
                break;
            case 17:
                Map map = (Map) obj;
                map.getClass();
                function1.invoke(new ShiftListViewEvent.FilterApplied(map));
                mutableState.setValue(Boolean.FALSE);
                break;
            default:
                String str4 = (String) obj;
                str4.getClass();
                mutableState.setValue(str4);
                function1.invoke((String) mutableState.getValue());
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ CashMapViewKt$$ExternalSyntheticLambda3(Function1 function1, MutableState mutableState, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = mutableState;
    }
}
