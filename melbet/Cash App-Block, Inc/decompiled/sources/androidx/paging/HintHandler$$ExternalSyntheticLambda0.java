package androidx.paging;

import android.app.RemoteAction;
import android.content.Context;
import android.graphics.RectF;
import android.view.textclassifier.TextClassification;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyMappingKt;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuItem;
import androidx.compose.foundation.text.selection.MultiWidgetSelectionDelegate;
import androidx.compose.foundation.text.selection.PlatformSelectionBehaviors_androidKt;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.material.AnchoredDraggableState;
import androidx.compose.material.DraggableAnchorsConfig;
import androidx.compose.material.MapDraggableAnchors;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.material.pullrefresh.PullRefreshState;
import androidx.compose.material3.ThumbNode$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MultiSubscriptionSnapshotFlowManager;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaveableHolder;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ContentScale$Companion$Fit$1;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import androidx.core.view.DifferentialMotionFlingController$$ExternalSyntheticLambda0;
import androidx.navigation.Navigator$$ExternalSyntheticLambda0;
import androidx.navigation.compose.DialogHostKt;
import androidx.navigation.compose.DialogNavigator;
import androidx.paging.HintHandler;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.local.primitives.MenuDiscountSummary;
import app.cash.local.viewmodels.LocalBrandDescriptionViewModel;
import app.cash.local.viewmodels.LocalBrandLocationCheckoutViewModel;
import app.cash.local.viewmodels.LocalCartSummaryLineViewModel;
import app.cash.local.viewmodels.LocalMenuComboDetailsViewModel;
import app.cash.local.viewmodels.OrderBuilderModel;
import app.cash.local.viewmodels.VehicleColorOption;
import app.cash.local.viewmodels.VehicleTypeOption;
import app.cash.local.views.brand.checkout.CheckoutTipSectionKt;
import app.cash.local.views.brand.checkout.CurbsidePickupCarSheetKt;
import app.cash.local.views.brand.menu.LocalCaloriesTextKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.CheckboxKt;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.channels.SendChannel;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public final /* synthetic */ class HintHandler$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ HintHandler$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long j;
        long j2;
        long j3;
        long j4;
        char c;
        long j5;
        long j6;
        boolean overlaps;
        switch (this.$r8$classId) {
            case 0:
                ViewportHint viewportHint = (ViewportHint) this.f$0;
                HintHandler.HintFlow hintFlow = (HintHandler.HintFlow) obj;
                HintHandler.HintFlow hintFlow2 = (HintHandler.HintFlow) obj2;
                hintFlow.getClass();
                hintFlow2.getClass();
                if (FlowExtKt.shouldPrioritizeOver(viewportHint, hintFlow.value, LoadType.PREPEND)) {
                    hintFlow.value = viewportHint;
                    hintFlow._flow.tryEmit(viewportHint);
                }
                if (FlowExtKt.shouldPrioritizeOver(viewportHint, hintFlow2.value, LoadType.APPEND)) {
                    hintFlow2.value = viewportHint;
                    hintFlow2._flow.tryEmit(viewportHint);
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                ((InfiniteTransition) this.f$0).run$animation_core((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 2:
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) this.f$0;
                float floatValue = ((Float) obj2).floatValue();
                ((PointerInputChange) obj).consume();
                ref$FloatRef.element = floatValue;
                return Unit.INSTANCE;
            case 3:
                Long l = (Long) obj2;
                if (SelectionRegistrarKt.hasSelection((SelectionRegistrar) this.f$0, l.longValue())) {
                    return l;
                }
                return null;
            case 4:
                ((Integer) obj2).getClass();
                KeyMappingKt.TextFieldCursorHandle((TextFieldSelectionManager) this.f$0, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 5:
                ((TextDragObserver) this.f$0).mo366onDragk4lQ0M(((Offset) obj2).packedValue);
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                ((TextLinkScope) this.f$0).LinksComposables((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 7:
                TextContextMenuItem textContextMenuItem = (TextContextMenuItem) this.f$0;
                ((Integer) obj2).getClass();
                GapComposer gapComposer = (GapComposer) ((Composer) obj);
                gapComposer.startReplaceGroup(666084174);
                String str = textContextMenuItem.label;
                gapComposer.end(false);
                return str;
            case 8:
                TextClassification textClassification = (TextClassification) this.f$0;
                ((Integer) obj2).getClass();
                GapComposer gapComposer2 = (GapComposer) ((Composer) obj);
                gapComposer2.startReplaceGroup(950061013);
                String valueOf = String.valueOf(textClassification.getLabel());
                gapComposer2.end(false);
                return valueOf;
            case 9:
                RemoteAction remoteAction = (RemoteAction) this.f$0;
                ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) ((Composer) obj);
                gapComposer3.startReplaceGroup(-1376593684);
                String obj3 = remoteAction.getTitle().toString();
                gapComposer3.end(false);
                return obj3;
            case 10:
                Ref$LongRef ref$LongRef = (Ref$LongRef) this.f$0;
                ((PointerInputChange) obj).consume();
                ref$LongRef.element = ((Offset) obj2).packedValue;
                return Unit.INSTANCE;
            case 11:
                SelectionManager selectionManager = (SelectionManager) this.f$0;
                TextContextMenuBuilderScope textContextMenuBuilderScope = (TextContextMenuBuilderScope) obj;
                Context context = (Context) obj2;
                Pair contextTextAndSelection$foundation = selectionManager.getContextTextAndSelection$foundation();
                PlatformSelectionBehaviors_androidKt.m440addPlatformTextContextMenuItems71BSaZU(textContextMenuBuilderScope, context, false, contextTextAndSelection$foundation != null ? (AnnotatedString) contextTextAndSelection$foundation.first : null, contextTextAndSelection$foundation != null ? (TextRange) contextTextAndSelection$foundation.second : null, selectionManager.platformSelectionBehaviors, new Navigator$$ExternalSyntheticLambda0(9, selectionManager, context));
                return Unit.INSTANCE;
            case 12:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) this.f$0;
                LayoutCoordinates layoutCoordinates2 = ((MultiWidgetSelectionDelegate) obj).getLayoutCoordinates();
                LayoutCoordinates layoutCoordinates3 = ((MultiWidgetSelectionDelegate) obj2).getLayoutCoordinates();
                long j7 = 0;
                if (layoutCoordinates2 != null) {
                    j = layoutCoordinates.mo839localPositionOfR5De75A(layoutCoordinates2, 0L);
                    j2 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)) + ((int) (layoutCoordinates2.mo838getSizeYbymL2g() & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) + ((int) (layoutCoordinates2.mo838getSizeYbymL2g() >> 32))) << 32);
                } else {
                    j = 0;
                    j2 = 0;
                }
                if (layoutCoordinates3 != null) {
                    j7 = layoutCoordinates.mo839localPositionOfR5De75A(layoutCoordinates3, 0L);
                    j3 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j7 & BodyPartID.bodyIdMax)) + ((int) (layoutCoordinates3.mo838getSizeYbymL2g() & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j7 >> 32)) + ((int) (layoutCoordinates3.mo838getSizeYbymL2g() >> 32))) << 32);
                } else {
                    j3 = 0;
                }
                int i = (int) (j2 & BodyPartID.bodyIdMax);
                float intBitsToFloat = Float.intBitsToFloat(i);
                long j8 = j3;
                int i2 = (int) (j & BodyPartID.bodyIdMax);
                float intBitsToFloat2 = intBitsToFloat - Float.intBitsToFloat(i2);
                int i3 = (int) (j2 >> 32);
                int i4 = (int) (j >> 32);
                float intBitsToFloat3 = Float.intBitsToFloat(i3) - Float.intBitsToFloat(i4);
                int i5 = (int) (j8 & BodyPartID.bodyIdMax);
                float intBitsToFloat4 = Float.intBitsToFloat(i5);
                int i6 = (int) (BodyPartID.bodyIdMax & j7);
                float intBitsToFloat5 = intBitsToFloat4 - Float.intBitsToFloat(i6);
                int i7 = (int) (j8 >> 32);
                int i8 = (int) (j7 >> 32);
                float intBitsToFloat6 = Float.intBitsToFloat(i7) - Float.intBitsToFloat(i8);
                float max = Math.max(RecyclerView.DECELERATION_RATE, Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i5)) - Math.max(Float.intBitsToFloat(i2), Float.intBitsToFloat(i6)));
                float max2 = Math.max(RecyclerView.DECELERATION_RATE, Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i7)) - Math.max(Float.intBitsToFloat(i4), Float.intBitsToFloat(i8)));
                boolean z = max >= intBitsToFloat2 * 0.5f || max >= intBitsToFloat5 * 0.5f;
                if (max2 < intBitsToFloat3 * 0.5f && max2 < intBitsToFloat6 * 0.5f) {
                    r6 = true;
                }
                return Integer.valueOf((z && r6) ? ComparisonsKt__ComparisonsKt.compareValues(Float.valueOf(Float.intBitsToFloat(i4)), Float.valueOf(Float.intBitsToFloat(i8))) : ComparisonsKt__ComparisonsKt.compareValues(Float.valueOf(Float.intBitsToFloat(i2)), Float.valueOf(Float.intBitsToFloat(i6))));
            case 13:
                ModalBottomSheetState modalBottomSheetState = (ModalBottomSheetState) this.f$0;
                ThumbNode$$ExternalSyntheticLambda0 thumbNode$$ExternalSyntheticLambda0 = new ThumbNode$$ExternalSyntheticLambda0(Constraints.m1024getMaxHeightimpl(((Constraints) obj2).value), modalBottomSheetState, (IntSize) obj, 4);
                DraggableAnchorsConfig draggableAnchorsConfig = new DraggableAnchorsConfig();
                thumbNode$$ExternalSyntheticLambda0.invoke(draggableAnchorsConfig);
                LinkedHashMap linkedHashMap = draggableAnchorsConfig.anchors;
                MapDraggableAnchors mapDraggableAnchors = new MapDraggableAnchors(linkedHashMap);
                AnchoredDraggableState anchoredDraggableState = modalBottomSheetState.anchoredDraggableState;
                r6 = anchoredDraggableState.getAnchors().anchors.size() > 0;
                ModalBottomSheetValue modalBottomSheetValue = (ModalBottomSheetValue) ((ParcelableSnapshotMutableState) anchoredDraggableState.currentValue$delegate).getValue();
                if (r6 || !linkedHashMap.containsKey(modalBottomSheetValue)) {
                    int ordinal = ((ModalBottomSheetValue) ((DerivedSnapshotState) anchoredDraggableState.targetValue$delegate).getValue()).ordinal();
                    if (ordinal == 0) {
                        modalBottomSheetValue = ModalBottomSheetValue.Hidden;
                    } else {
                        if (ordinal != 1 && ordinal != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        ModalBottomSheetValue modalBottomSheetValue2 = ModalBottomSheetValue.HalfExpanded;
                        if (!linkedHashMap.containsKey(modalBottomSheetValue2)) {
                            modalBottomSheetValue2 = ModalBottomSheetValue.Expanded;
                            if (!linkedHashMap.containsKey(modalBottomSheetValue2)) {
                                modalBottomSheetValue2 = ModalBottomSheetValue.Hidden;
                            }
                        }
                        modalBottomSheetValue = modalBottomSheetValue2;
                    }
                }
                return new Pair(mapDraggableAnchors, modalBottomSheetValue);
            case 14:
                PullRefreshState pullRefreshState = (PullRefreshState) this.f$0;
                float floatValue2 = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                pullRefreshState._position$delegate.setFloatValue(floatValue2);
                return Unit.INSTANCE;
            case 15:
                return (SpringSpec) this.f$0;
            case 16:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer;
                if (gapComposer4.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    throw null;
                }
                gapComposer4.skipToGroupEnd();
                return Unit.INSTANCE;
            case 17:
                MultiSubscriptionSnapshotFlowManager multiSubscriptionSnapshotFlowManager = (MultiSubscriptionSnapshotFlowManager) this.f$0;
                Set set = (Set) obj;
                synchronized (multiSubscriptionSnapshotFlowManager.$$delegate_0) {
                    try {
                        MutableScatterMap mutableScatterMap = multiSubscriptionSnapshotFlowManager.subscriptions;
                        Navigator$$ExternalSyntheticLambda0 navigator$$ExternalSyntheticLambda0 = new Navigator$$ExternalSyntheticLambda0(19, set, multiSubscriptionSnapshotFlowManager);
                        TypeIntrinsics.beforeCheckcastToFunctionOfArity(1, navigator$$ExternalSyntheticLambda0);
                        Object[] objArr = mutableScatterMap.keys;
                        long[] jArr = mutableScatterMap.metadata;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i9 = 0;
                            j4 = 128;
                            j5 = 255;
                            while (true) {
                                long j9 = jArr[i9];
                                c = 7;
                                j6 = -9187201950435737472L;
                                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i10 = 8 - ((~(i9 - length)) >>> 31);
                                    for (int i11 = 0; i11 < i10; i11++) {
                                        if ((j9 & 255) < 128) {
                                            navigator$$ExternalSyntheticLambda0.invoke(objArr[(i9 << 3) + i11]);
                                        }
                                        j9 >>= 8;
                                    }
                                    if (i10 != 8) {
                                    }
                                }
                                if (i9 != length) {
                                    i9++;
                                }
                            }
                        } else {
                            j4 = 128;
                            c = 7;
                            j5 = 255;
                            j6 = -9187201950435737472L;
                        }
                        MutableScatterSet mutableScatterSet = multiSubscriptionSnapshotFlowManager.toNotify;
                        Object[] objArr2 = mutableScatterSet.elements;
                        long[] jArr2 = mutableScatterSet.metadata;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i12 = 0;
                            while (true) {
                                long j10 = jArr2[i12];
                                if ((((~j10) << c) & j10 & j6) != j6) {
                                    int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                    for (int i14 = 0; i14 < i13; i14++) {
                                        if ((j10 & j5) < j4) {
                                            ((SendChannel) objArr2[(i12 << 3) + i14]).mo1159trySendJP2dKIU(Unit.INSTANCE);
                                        }
                                        j10 >>= 8;
                                    }
                                    if (i13 != 8) {
                                    }
                                }
                                if (i12 != length2) {
                                    i12++;
                                }
                            }
                        }
                        multiSubscriptionSnapshotFlowManager.toNotify.clear();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return Unit.INSTANCE;
            case 18:
                Saver saver = (Saver) this.f$0;
                SaveableHolder saveableHolder = (SaveableHolder) obj;
                MutableState mutableState = (MutableState) obj2;
                if (!(mutableState instanceof SnapshotMutableState)) {
                    a$$ExternalSyntheticBUOutline0.m$3("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
                    return null;
                }
                SnapshotMutableState snapshotMutableState = (SnapshotMutableState) mutableState;
                Object save = saver.save(saveableHolder, snapshotMutableState.getValue());
                if (save == null) {
                    return null;
                }
                SnapshotMutationPolicy policy = snapshotMutableState.getPolicy();
                policy.getClass();
                return new ParcelableSnapshotMutableState(save, policy);
            case 19:
                DifferentialMotionFlingController$$ExternalSyntheticLambda0 differentialMotionFlingController$$ExternalSyntheticLambda0 = (DifferentialMotionFlingController$$ExternalSyntheticLambda0) this.f$0;
                Rect composeRect = ColorKt.toComposeRect((RectF) obj);
                Rect composeRect2 = ColorKt.toComposeRect((RectF) obj2);
                switch (differentialMotionFlingController$$ExternalSyntheticLambda0.$r8$classId) {
                    case 5:
                        overlaps = composeRect.overlaps(composeRect2);
                        break;
                    default:
                        overlaps = composeRect2.m629containsk4lQ0M(composeRect.m633getCenterF1C5BW0());
                        break;
                }
                return Boolean.valueOf(overlaps);
            case 20:
                ((Integer) obj2).getClass();
                DialogHostKt.DialogHost((DialogNavigator) this.f$0, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                CheckoutTipSectionKt.SelectionDiscountLine((LocalCartSummaryLineViewModel.Discount) this.f$0, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 22:
                VehicleTypeOption vehicleTypeOption = (VehicleTypeOption) this.f$0;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer2;
                if (gapComposer5.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                    String str2 = vehicleTypeOption.label;
                    TextStyle textStyle = ((Typography) gapComposer5.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                    Colors colors = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                    } else {
                        gapComposer5.startReplaceGroup(-1762997739);
                        gapComposer5.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.semantic.text.prominent, (Composer) gapComposer5, (Modifier) null, textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                VehicleColorOption vehicleColorOption = (VehicleColorOption) this.f$0;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer3;
                if (gapComposer6.shouldExecute(1 & intValue3, (intValue3 & 3) != 2)) {
                    CurbsidePickupCarSheetKt.VehicleColorIndicator(vehicleColorOption.label, vehicleColorOption.colorSpec, gapComposer6, 0);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                OrderBuilderModel.OrderType.Regular regular = (OrderBuilderModel.OrderType.Regular) this.f$0;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer4;
                if (gapComposer7.shouldExecute(1 & intValue4, (intValue4 & 3) != 2)) {
                    ModalKt.Toggle(MLKEMEngine.KyberPolyBytes, 2, gapComposer7, null, regular.noContactDelivery, true);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                LocalBrandLocationCheckoutViewModel.CurbsidePickupSection curbsidePickupSection = (LocalBrandLocationCheckoutViewModel.CurbsidePickupSection) this.f$0;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer5;
                if (gapComposer8.shouldExecute(1 & intValue5, (intValue5 & 3) != 2)) {
                    CheckboxKt.UnlabeledCheckbox(curbsidePickupSection.isSelected, null, null, null, false, gapComposer8, 48, 28);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                LocalCaloriesTextKt.ExpandingDiscountSection((MenuDiscountSummary) this.f$0, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                LocalCaloriesTextKt.ComboSlotOptionAvailability((LocalMenuComboDetailsViewModel.ComboSlotOption.OptionAvailability) this.f$0, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 28:
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                LocalFulfillment.DeliveryDetails.DeliveryCourierDriver deliveryCourierDriver = (LocalFulfillment.DeliveryDetails.DeliveryCourierDriver) this.f$0;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                ContentScale$Companion$Fit$1 contentScale$Companion$Fit$1 = ContentScale.Companion.FillBounds;
                GapComposer gapComposer9 = (GapComposer) composer6;
                if (gapComposer9.shouldExecute(1 & intValue6, (intValue6 & 3) != 2)) {
                    String str3 = deliveryCourierDriver.profile_image_url;
                    if (str3 != null) {
                        gapComposer9.startReplaceGroup(905942721);
                        ImageKt.Image(AsyncImageKt.m1446rememberAsyncImagePainter19ie5dc(0, 30, gapComposer9, str3), null, ClipKt.clip(SizeKt.m285size3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 12.0f, RecyclerView.DECELERATION_RATE, 11), 32.0f), RoundedCornerShapeKt.CircleShape), null, contentScale$Companion$Fit$1, RecyclerView.DECELERATION_RATE, null, gapComposer9, 24624, 104);
                        gapComposer9.end(false);
                    } else {
                        gapComposer9.startReplaceGroup(906229719);
                        Modifier clip = ClipKt.clip(SizeKt.m285size3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 12.0f, RecyclerView.DECELERATION_RATE, 11), 32.0f), RoundedCornerShapeKt.CircleShape);
                        StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                        Colors colors2 = (Colors) gapComposer9.consume(staticProvidableCompositionLocal);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer9, -1762997026, gapComposer9, false);
                        } else {
                            gapComposer9.startReplaceGroup(-1762997739);
                            gapComposer9.end(false);
                        }
                        Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(clip, colors2.semantic.background.standard, ColorKt.RectangleShape), 4.0f);
                        Painter painter = Icons.AvatarFill24.painter(gapComposer9);
                        Colors colors3 = (Colors) gapComposer9.consume(staticProvidableCompositionLocal);
                        if (colors3 == null) {
                            colors3 = re$$ExternalSyntheticOutline0.m(gapComposer9, -1762997026, gapComposer9, false);
                        } else {
                            gapComposer9.startReplaceGroup(-1762997739);
                            gapComposer9.end(false);
                        }
                        long j11 = colors3.semantic.icon.standard;
                        ImageKt.Image(painter, null, m298padding3ABfNKs, null, contentScale$Companion$Fit$1, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j11, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j11), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer9, Painter.$stable | 24624, 40);
                        gapComposer9.end(false);
                    }
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                LocalBrandDescriptionViewModel localBrandDescriptionViewModel = (LocalBrandDescriptionViewModel) this.f$0;
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer7;
                if (gapComposer10.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    String str4 = localBrandDescriptionViewModel.description;
                    TextStyle textStyle2 = ((Typography) gapComposer10.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                    Colors colors4 = (Colors) gapComposer10.consume(ArcadeThemeKt.LocalColors);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer10, -1762997026, gapComposer10, false);
                    } else {
                        gapComposer10.startReplaceGroup(-1762997739);
                        gapComposer10.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, colors4.semantic.text.standard, (Composer) gapComposer10, (Modifier) companion2, textStyle2, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ HintHandler$$ExternalSyntheticLambda0(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
    }
}
