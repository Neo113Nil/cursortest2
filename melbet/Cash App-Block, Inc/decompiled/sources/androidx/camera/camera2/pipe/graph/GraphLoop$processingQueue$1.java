package androidx.camera.camera2.pipe.graph;

import android.util.Log;
import android.view.KeyEvent;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.compat.CameraRequest;
import androidx.camera.camera2.pipe.compat.PruningCamera2DeviceManager;
import androidx.camera.camera2.pipe.compat.RequestClose;
import androidx.camera.camera2.pipe.compat.RequestCloseAll;
import androidx.camera.camera2.pipe.compat.RequestCloseById;
import androidx.camera.camera2.pipe.compat.RequestOpen;
import androidx.camera.camera2.pipe.graph.GraphCommand;
import androidx.collection.ObjectList$$ExternalSyntheticLambda0;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.KeyMappingKt;
import androidx.compose.foundation.text.TextFieldKeyInput;
import androidx.compose.foundation.text.UndoManager;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode.ClickTextContextMenuDataProvider;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProvider;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProviderKt;
import androidx.compose.foundation.text.selection.TextFieldPreparedSelection;
import androidx.compose.foundation.text.selection.TextPreparedSelectionState;
import androidx.compose.material.MenuKt$$ExternalSyntheticLambda0;
import androidx.compose.material.pullrefresh.PullRefreshState;
import androidx.compose.material3.ThumbNode$onAttach$1;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.core.view.ContentInfoCompat;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.arcade.protocol.host.arcade.ArcadeTimeline2ProtocolNode$OnItemClick;
import app.cash.arcade.protocol.host.arcade.BiometricsPromptProtocolNode$OnResult;
import app.cash.arcade.protocol.host.arcade.BottomSheetProtocolNode$OnSheetPositionChanged;
import app.cash.arcade.protocol.host.arcade.CheckboxProtocolNode$OnChange;
import app.cash.arcade.protocol.host.arcade.InputFieldHostProtocol;
import app.cash.arcade.protocol.host.arcade.InputFieldProtocolNode$OnChange;
import app.cash.arcade.protocol.host.arcade.InputFieldProtocolNode$OnFocusChange;
import app.cash.arcade.protocol.host.arcade.InputFieldProtocolNode$OnKeyboardAction;
import app.cash.arcade.protocol.host.arcade.KeypadScaffoldProtocolNode$OnChanged;
import app.cash.arcade.protocol.host.arcade.LegacyAmountPickerHostProtocol;
import app.cash.arcade.protocol.host.arcade.LegacyAmountPickerProtocolNode$OnAmountChanged;
import app.cash.arcade.protocol.host.arcade.LegacyAmountPickerProtocolNode$OnAmountSubmitted;
import app.cash.arcade.protocol.host.arcade.LegacyPasscodeInputProtocolNode$OnFullyFilled;
import app.cash.arcade.protocol.host.arcade.PasscodeInputProtocolNode$OnChange;
import app.cash.arcade.protocol.host.arcade.QrCodeScannerProtocolNode$OnResult;
import app.cash.arcade.protocol.host.arcade.RadioHostProtocol;
import app.cash.arcade.protocol.host.arcade.RadioProtocolNode$OnChange;
import app.cash.arcade.protocol.host.arcade.RadioSelectionGroupProtocolNode$OnSelectionChanged;
import app.cash.arcade.protocol.host.arcade.ReactionDialogAnchorProtocolNode$OnSelect;
import app.cash.arcade.protocol.host.arcade.RoundedRectHostProtocol;
import app.cash.arcade.protocol.host.arcade.SearchBarHostProtocol;
import app.cash.arcade.protocol.host.arcade.SearchBarProtocolNode$OnQueryChange;
import app.cash.arcade.protocol.host.arcade.SearchFieldProtocolNode$OnChange;
import app.cash.arcade.protocol.host.arcade.SegmentedToggleProtocolNode$OnValueChanged;
import app.cash.arcade.protocol.host.arcade.TextFieldHostProtocol;
import app.cash.arcade.protocol.host.arcade.ToggleHostProtocol;
import app.cash.arcade.values.BooleanState;
import app.cash.arcade.values.SegmentedToggleValue;
import app.cash.arcade.values.TextFieldState;
import app.cash.arcade.values.keypad.KeypadTextState;
import com.caverock.androidsvg.SVG;
import com.squareup.cash.card.onboarding.core.CardScene$$ExternalSyntheticLambda3;
import com.squareup.cash.treehouse.biometrics.BiometricsReadResult;
import com.squareup.cash.treehouse.qr.QrScanResult;
import com.squareup.util.task.RepeatOnIntervalTaskRunner$repeatOn$2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class GraphLoop$processingQueue$1 extends FunctionReferenceImpl implements Function1 {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphLoop$processingQueue$1(Object obj) {
        super(1, 0, TextContextMenuGestureNode.class, obj, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V");
        this.$r8$classId = 3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        Integer valueOf;
        boolean z;
        Integer m350consumeZmokQxo;
        KeyCommand m357mapZmokQxo;
        float floatValue;
        int i2 = 4;
        Continuation continuation = null;
        boolean z2 = false;
        int i3 = 1;
        switch (this.$r8$classId) {
            case 0:
                List<GraphCommand> list = (List) obj;
                list.getClass();
                GraphLoop graphLoop = (GraphLoop) this.receiver;
                graphLoop.getClass();
                for (GraphCommand graphCommand : list) {
                    if (graphCommand instanceof GraphCommand.Capture) {
                        graphLoop.abortRequests(((GraphCommand.Capture) graphCommand).requests);
                    } else if (graphCommand instanceof GraphCommand.RequestProcessor) {
                        JobKt.launch$default(graphLoop.shutdownScope, null, CoroutineStart.UNDISPATCHED, new ThumbNode$onAttach$1((GraphCommand.RequestProcessor) graphCommand, continuation, 12), 1);
                    }
                }
                return Unit.INSTANCE;
            case 1:
                List list2 = (List) obj;
                list2.getClass();
                ((PruningCamera2DeviceManager) this.receiver).getClass();
                List<CameraRequest> list3 = list2;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list3) {
                    if (((CameraRequest) obj2) instanceof RequestClose) {
                        arrayList.add(obj2);
                    }
                }
                list2.removeAll(arrayList);
                Iterator it = CollectionsKt.reversed(arrayList).iterator();
                while (it.hasNext()) {
                    list2.add(0, (CameraRequest) it.next());
                }
                ListIterator listIterator = list2.listIterator(list2.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        i = -1;
                    } else if (((CameraRequest) listIterator.previous()) instanceof RequestCloseAll) {
                        i = listIterator.nextIndex();
                    }
                }
                if (i > 0) {
                    Object obj3 = list2.get(i);
                    obj3.getClass();
                    RequestCloseAll requestCloseAll = (RequestCloseAll) obj3;
                    for (int i4 = 0; i4 < i; i4++) {
                        CameraRequest cameraRequest = (CameraRequest) list2.remove(0);
                        CompletableDeferredImpl completableDeferredImpl = cameraRequest instanceof RequestCloseById ? ((RequestCloseById) cameraRequest).deferred : cameraRequest instanceof RequestCloseAll ? ((RequestCloseAll) cameraRequest).deferred : null;
                        if (completableDeferredImpl != null) {
                            requestCloseAll.deferred.invokeOnCompletion(new CardScene$$ExternalSyntheticLambda3(i3, completableDeferredImpl));
                        }
                        if (cameraRequest instanceof RequestOpen) {
                            ((RequestOpen) cameraRequest).virtualCamera.m80disconnectTPqeGZw(null);
                        }
                    }
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int i5 = 0;
                for (CameraRequest cameraRequest2 : list3) {
                    int i6 = i5 + 1;
                    if (cameraRequest2 instanceof RequestOpen) {
                        RequestOpen requestOpen = (RequestOpen) cameraRequest2;
                        String str = requestOpen.virtualCamera.cameraId;
                        Set set = CollectionsKt.toSet(CollectionsKt.plus((Collection) requestOpen.sharedCameraIds, (Object) new CameraId(str)));
                        int size = list2.size();
                        for (int i7 = i6; i7 < size; i7++) {
                            CameraRequest cameraRequest3 = (CameraRequest) list2.get(i7);
                            if (cameraRequest3 instanceof RequestCloseById) {
                                z = set.contains(new CameraId(((RequestCloseById) cameraRequest3).activeCameraId));
                            } else {
                                if (cameraRequest3 instanceof RequestOpen) {
                                    RequestOpen requestOpen2 = (RequestOpen) cameraRequest3;
                                    String str2 = requestOpen2.virtualCamera.cameraId;
                                    Set set2 = CollectionsKt.toSet(CollectionsKt.plus((Collection) requestOpen2.sharedCameraIds, (Object) new CameraId(str2)));
                                    if (Intrinsics.areEqual(str, str2) || !Intrinsics.areEqual(set, set2)) {
                                        z = true;
                                    }
                                }
                                z = false;
                            }
                            if (z) {
                                valueOf = Integer.valueOf(i7);
                            }
                        }
                        valueOf = null;
                    } else {
                        if (cameraRequest2 instanceof RequestCloseById) {
                            int size2 = list2.size();
                            for (int i8 = i6; i8 < size2; i8++) {
                                CameraRequest cameraRequest4 = (CameraRequest) list2.get(i8);
                                if ((cameraRequest4 instanceof RequestCloseById) && Intrinsics.areEqual(((RequestCloseById) cameraRequest4).activeCameraId, ((RequestCloseById) cameraRequest2).activeCameraId)) {
                                    valueOf = Integer.valueOf(i8);
                                }
                            }
                        }
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        CameraRequest cameraRequest5 = (CameraRequest) list2.get(valueOf.intValue());
                        Log.d("CXCP", cameraRequest2 + " is pruned by " + cameraRequest5);
                        linkedHashSet.add(Integer.valueOf(i5));
                        if ((cameraRequest2 instanceof RequestCloseById) && (cameraRequest5 instanceof RequestCloseById)) {
                            ((RequestCloseById) cameraRequest5).deferred.invokeOnCompletion(new ObjectList$$ExternalSyntheticLambda0((RequestCloseById) cameraRequest2, i2));
                        }
                    }
                    i5 = i6;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = CollectionsKt.sorted(linkedHashSet).iterator();
                while (it2.hasNext()) {
                    arrayList2.add(list2.remove(((Number) it2.next()).intValue() - arrayList2.size()));
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    CameraRequest cameraRequest6 = (CameraRequest) it3.next();
                    if (cameraRequest6 instanceof RequestOpen) {
                        ((RequestOpen) cameraRequest6).virtualCamera.m80disconnectTPqeGZw(null);
                    }
                }
                return Unit.INSTANCE;
            case 2:
                KeyEvent keyEvent = ((androidx.compose.ui.input.key.KeyEvent) obj).nativeKeyEvent;
                TextFieldKeyInput textFieldKeyInput = (TextFieldKeyInput) this.receiver;
                TextPreparedSelectionState textPreparedSelectionState = textFieldKeyInput.preparedSelectionState;
                boolean z3 = textFieldKeyInput.editable;
                CommitTextCommand commitTextCommand = (KeyMappingKt.m356isTypedEventZmokQxo(keyEvent) && (m350consumeZmokQxo = textFieldKeyInput.keyCombiner.m350consumeZmokQxo(keyEvent)) != null) ? new CommitTextCommand(new StringBuilder().appendCodePoint(m350consumeZmokQxo.intValue()).toString(), 1) : null;
                if (commitTextCommand != null) {
                    if (z3) {
                        textFieldKeyInput.apply(CollectionsKt__CollectionsJVMKt.listOf(commitTextCommand));
                        textPreparedSelectionState.cachedX = null;
                        z2 = true;
                    }
                } else if (KeyEventType.m790getTypeZmokQxo(keyEvent) == 2 && (m357mapZmokQxo = textFieldKeyInput.keyMapping.m357mapZmokQxo(keyEvent)) != null && (!m357mapZmokQxo.editsText || z3)) {
                    Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                    ref$BooleanRef.element = true;
                    MenuKt$$ExternalSyntheticLambda0 menuKt$$ExternalSyntheticLambda0 = new MenuKt$$ExternalSyntheticLambda0(10, m357mapZmokQxo, textFieldKeyInput, ref$BooleanRef);
                    TextFieldValue textFieldValue = textFieldKeyInput.value;
                    TextFieldPreparedSelection textFieldPreparedSelection = new TextFieldPreparedSelection(textFieldValue, textFieldKeyInput.offsetMapping, textFieldKeyInput.state.getLayoutResult(), textPreparedSelectionState);
                    menuKt$$ExternalSyntheticLambda0.invoke(textFieldPreparedSelection);
                    boolean m986equalsimpl0 = TextRange.m986equalsimpl0(textFieldPreparedSelection.selection, textFieldValue.selection);
                    AnnotatedString annotatedString = textFieldPreparedSelection.annotatedString;
                    if (!m986equalsimpl0 || !Intrinsics.areEqual(annotatedString, textFieldValue.annotatedString)) {
                        textFieldKeyInput.onValueChange.invoke(TextFieldValue.m1001copy3r_uNRQ$default(textFieldValue, annotatedString, textFieldPreparedSelection.selection, 4));
                    }
                    UndoManager undoManager = textFieldKeyInput.undoManager;
                    if (undoManager != null) {
                        undoManager.forceNextSnapshot = true;
                    }
                    z2 = ref$BooleanRef.element;
                }
                return Boolean.valueOf(z2);
            case 3:
                long j = ((Offset) obj).packedValue;
                TextContextMenuGestureNode textContextMenuGestureNode = (TextContextMenuGestureNode) this.receiver;
                textContextMenuGestureNode.getClass();
                TextContextMenuProvider textContextMenuProvider = (TextContextMenuProvider) DepthSortedSetKt.currentValueOf(textContextMenuGestureNode, TextContextMenuProviderKt.LocalTextContextMenuDropdownProvider);
                if (textContextMenuProvider != null) {
                    JobKt.launch$default(textContextMenuGestureNode.getCoroutineScope(), null, null, new RepeatOnIntervalTaskRunner$repeatOn$2(6, j, textContextMenuGestureNode, textContextMenuProvider, textContextMenuGestureNode.new ClickTextContextMenuDataProvider(j), (Continuation) null), 3);
                }
                return Unit.INSTANCE;
            case 4:
                ((TextContextMenuBuilderScope) this.receiver).filters.add((Function1) obj);
                return Unit.INSTANCE;
            case 5:
                float floatValue2 = ((Number) obj).floatValue();
                PullRefreshState pullRefreshState = (PullRefreshState) this.receiver;
                boolean z4 = pullRefreshState.get_refreshing();
                ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = pullRefreshState.distancePulled$delegate;
                ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState2 = pullRefreshState._threshold$delegate;
                float f = RecyclerView.DECELERATION_RATE;
                if (!z4) {
                    float floatValue3 = parcelableSnapshotMutableFloatState.getFloatValue() + floatValue2;
                    if (floatValue3 < RecyclerView.DECELERATION_RATE) {
                        floatValue3 = 0.0f;
                    }
                    float floatValue4 = floatValue3 - parcelableSnapshotMutableFloatState.getFloatValue();
                    parcelableSnapshotMutableFloatState.setFloatValue(floatValue3);
                    if (pullRefreshState.getAdjustedDistancePulled() <= parcelableSnapshotMutableFloatState2.getFloatValue()) {
                        floatValue = pullRefreshState.getAdjustedDistancePulled();
                    } else {
                        float abs = Math.abs(pullRefreshState.getAdjustedDistancePulled() / parcelableSnapshotMutableFloatState2.getFloatValue()) - 1.0f;
                        if (abs >= RecyclerView.DECELERATION_RATE) {
                            f = abs;
                        }
                        if (f > 2.0f) {
                            f = 2.0f;
                        }
                        floatValue = (parcelableSnapshotMutableFloatState2.getFloatValue() * (f - (((float) Math.pow(f, 2.0d)) / 4.0f))) + parcelableSnapshotMutableFloatState2.getFloatValue();
                    }
                    pullRefreshState._position$delegate.setFloatValue(floatValue);
                    f = floatValue4;
                }
                return Float.valueOf(f);
            case 6:
                int intValue = ((Number) obj).intValue();
                ArcadeTimeline2ProtocolNode$OnItemClick arcadeTimeline2ProtocolNode$OnItemClick = (ArcadeTimeline2ProtocolNode$OnItemClick) this.receiver;
                SVG svg = arcadeTimeline2ProtocolNode$OnItemClick.eventSink;
                int i9 = arcadeTimeline2ProtocolNode$OnItemClick.id;
                RoundedRectHostProtocol roundedRectHostProtocol = arcadeTimeline2ProtocolNode$OnItemClick.protocol;
                JsonImpl jsonImpl = (JsonImpl) roundedRectHostProtocol.serializer_2;
                Object[] objArr = {Integer.valueOf(intValue)};
                IntSerializer intSerializer = (IntSerializer) roundedRectHostProtocol.serializer_5;
                intSerializer.getClass();
                svg.sendEvent(new ContentInfoCompat.CompatImpl(i9, 2, jsonImpl, objArr, new KSerializer[]{intSerializer}));
                return Unit.INSTANCE;
            case 7:
                BiometricsReadResult biometricsReadResult = (BiometricsReadResult) obj;
                biometricsReadResult.getClass();
                BiometricsPromptProtocolNode$OnResult biometricsPromptProtocolNode$OnResult = (BiometricsPromptProtocolNode$OnResult) this.receiver;
                biometricsPromptProtocolNode$OnResult.getClass();
                SVG svg2 = biometricsPromptProtocolNode$OnResult.eventSink;
                int i10 = biometricsPromptProtocolNode$OnResult.id;
                TextFieldHostProtocol textFieldHostProtocol = biometricsPromptProtocolNode$OnResult.protocol;
                KSerializer kSerializer = textFieldHostProtocol.serializer_2;
                kSerializer.getClass();
                svg2.sendEvent(new ContentInfoCompat.CompatImpl(i10, 6, (JsonImpl) textFieldHostProtocol.json, new Object[]{biometricsReadResult}, new KSerializer[]{kSerializer}));
                return Unit.INSTANCE;
            case 8:
                int intValue2 = ((Number) obj).intValue();
                BottomSheetProtocolNode$OnSheetPositionChanged bottomSheetProtocolNode$OnSheetPositionChanged = (BottomSheetProtocolNode$OnSheetPositionChanged) this.receiver;
                SVG svg3 = bottomSheetProtocolNode$OnSheetPositionChanged.eventSink;
                int i11 = bottomSheetProtocolNode$OnSheetPositionChanged.id;
                ToggleHostProtocol toggleHostProtocol = bottomSheetProtocolNode$OnSheetPositionChanged.protocol;
                JsonImpl jsonImpl2 = toggleHostProtocol.json;
                Object[] objArr2 = {Integer.valueOf(intValue2)};
                IntSerializer intSerializer2 = (IntSerializer) toggleHostProtocol.serializer_0;
                intSerializer2.getClass();
                svg3.sendEvent(new ContentInfoCompat.CompatImpl(i11, 6, jsonImpl2, objArr2, new KSerializer[]{intSerializer2}));
                return Unit.INSTANCE;
            case 9:
                BooleanState booleanState = (BooleanState) obj;
                booleanState.getClass();
                CheckboxProtocolNode$OnChange checkboxProtocolNode$OnChange = (CheckboxProtocolNode$OnChange) this.receiver;
                checkboxProtocolNode$OnChange.getClass();
                SVG svg4 = checkboxProtocolNode$OnChange.eventSink;
                int i12 = checkboxProtocolNode$OnChange.id;
                ToggleHostProtocol toggleHostProtocol2 = checkboxProtocolNode$OnChange.protocol;
                KSerializer kSerializer2 = toggleHostProtocol2.serializer_0;
                kSerializer2.getClass();
                svg4.sendEvent(new ContentInfoCompat.CompatImpl(i12, 3, toggleHostProtocol2.json, new Object[]{booleanState}, new KSerializer[]{kSerializer2}));
                return Unit.INSTANCE;
            case 10:
                TextFieldState textFieldState = (TextFieldState) obj;
                textFieldState.getClass();
                InputFieldProtocolNode$OnChange inputFieldProtocolNode$OnChange = (InputFieldProtocolNode$OnChange) this.receiver;
                inputFieldProtocolNode$OnChange.getClass();
                SVG svg5 = inputFieldProtocolNode$OnChange.eventSink;
                int i13 = inputFieldProtocolNode$OnChange.id;
                InputFieldHostProtocol inputFieldHostProtocol = inputFieldProtocolNode$OnChange.protocol;
                KSerializer kSerializer3 = inputFieldHostProtocol.serializer_0;
                kSerializer3.getClass();
                svg5.sendEvent(new ContentInfoCompat.CompatImpl(i13, 22, inputFieldHostProtocol.json, new Object[]{textFieldState}, new KSerializer[]{kSerializer3}));
                return Unit.INSTANCE;
            case 11:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                InputFieldProtocolNode$OnFocusChange inputFieldProtocolNode$OnFocusChange = (InputFieldProtocolNode$OnFocusChange) this.receiver;
                SVG svg6 = inputFieldProtocolNode$OnFocusChange.eventSink;
                int i14 = inputFieldProtocolNode$OnFocusChange.id;
                InputFieldHostProtocol inputFieldHostProtocol2 = inputFieldProtocolNode$OnFocusChange.protocol;
                BooleanSerializer booleanSerializer = inputFieldHostProtocol2.serializer_1;
                booleanSerializer.getClass();
                svg6.sendEvent(new ContentInfoCompat.CompatImpl(i14, 23, inputFieldHostProtocol2.json, new Object[]{bool}, new KSerializer[]{booleanSerializer}));
                return Unit.INSTANCE;
            case 12:
                TextFieldState textFieldState2 = (TextFieldState) obj;
                textFieldState2.getClass();
                InputFieldProtocolNode$OnKeyboardAction inputFieldProtocolNode$OnKeyboardAction = (InputFieldProtocolNode$OnKeyboardAction) this.receiver;
                inputFieldProtocolNode$OnKeyboardAction.getClass();
                SVG svg7 = inputFieldProtocolNode$OnKeyboardAction.eventSink;
                int i15 = inputFieldProtocolNode$OnKeyboardAction.id;
                InputFieldHostProtocol inputFieldHostProtocol3 = inputFieldProtocolNode$OnKeyboardAction.protocol;
                KSerializer kSerializer4 = inputFieldHostProtocol3.serializer_0;
                kSerializer4.getClass();
                svg7.sendEvent(new ContentInfoCompat.CompatImpl(i15, 21, inputFieldHostProtocol3.json, new Object[]{textFieldState2}, new KSerializer[]{kSerializer4}));
                return Unit.INSTANCE;
            case 13:
                KeypadTextState keypadTextState = (KeypadTextState) obj;
                keypadTextState.getClass();
                KeypadScaffoldProtocolNode$OnChanged keypadScaffoldProtocolNode$OnChanged = (KeypadScaffoldProtocolNode$OnChanged) this.receiver;
                keypadScaffoldProtocolNode$OnChanged.getClass();
                SVG svg8 = keypadScaffoldProtocolNode$OnChanged.eventSink;
                int i16 = keypadScaffoldProtocolNode$OnChanged.id;
                TextFieldHostProtocol textFieldHostProtocol2 = keypadScaffoldProtocolNode$OnChanged.protocol;
                KSerializer kSerializer5 = textFieldHostProtocol2.serializer_0;
                kSerializer5.getClass();
                svg8.sendEvent(new ContentInfoCompat.CompatImpl(i16, 4, (JsonImpl) textFieldHostProtocol2.json, new Object[]{keypadTextState}, new KSerializer[]{kSerializer5}));
                return Unit.INSTANCE;
            case 14:
                long longValue = ((Number) obj).longValue();
                LegacyAmountPickerProtocolNode$OnAmountChanged legacyAmountPickerProtocolNode$OnAmountChanged = (LegacyAmountPickerProtocolNode$OnAmountChanged) this.receiver;
                SVG svg9 = legacyAmountPickerProtocolNode$OnAmountChanged.eventSink;
                int i17 = legacyAmountPickerProtocolNode$OnAmountChanged.id;
                LegacyAmountPickerHostProtocol legacyAmountPickerHostProtocol = legacyAmountPickerProtocolNode$OnAmountChanged.protocol;
                JsonImpl jsonImpl3 = legacyAmountPickerHostProtocol.json;
                Object[] objArr3 = {Long.valueOf(longValue)};
                LongSerializer longSerializer = legacyAmountPickerHostProtocol.serializer_6;
                longSerializer.getClass();
                svg9.sendEvent(new ContentInfoCompat.CompatImpl(i17, 14, jsonImpl3, objArr3, new KSerializer[]{longSerializer}));
                return Unit.INSTANCE;
            case 15:
                ((Number) obj).doubleValue();
                throw Boxes$$ExternalSyntheticOutline1.m(this.receiver);
            case 16:
                long longValue2 = ((Number) obj).longValue();
                LegacyAmountPickerProtocolNode$OnAmountSubmitted legacyAmountPickerProtocolNode$OnAmountSubmitted = (LegacyAmountPickerProtocolNode$OnAmountSubmitted) this.receiver;
                SVG svg10 = legacyAmountPickerProtocolNode$OnAmountSubmitted.eventSink;
                int i18 = legacyAmountPickerProtocolNode$OnAmountSubmitted.id;
                LegacyAmountPickerHostProtocol legacyAmountPickerHostProtocol2 = legacyAmountPickerProtocolNode$OnAmountSubmitted.protocol;
                JsonImpl jsonImpl4 = legacyAmountPickerHostProtocol2.json;
                Object[] objArr4 = {Long.valueOf(longValue2)};
                LongSerializer longSerializer2 = legacyAmountPickerHostProtocol2.serializer_6;
                longSerializer2.getClass();
                svg10.sendEvent(new ContentInfoCompat.CompatImpl(i18, 15, jsonImpl4, objArr4, new KSerializer[]{longSerializer2}));
                return Unit.INSTANCE;
            case 17:
                ((Number) obj).doubleValue();
                throw Boxes$$ExternalSyntheticOutline1.m(this.receiver);
            case 18:
                String str3 = (String) obj;
                str3.getClass();
                LegacyPasscodeInputProtocolNode$OnFullyFilled legacyPasscodeInputProtocolNode$OnFullyFilled = (LegacyPasscodeInputProtocolNode$OnFullyFilled) this.receiver;
                legacyPasscodeInputProtocolNode$OnFullyFilled.getClass();
                SVG svg11 = legacyPasscodeInputProtocolNode$OnFullyFilled.eventSink;
                int i19 = legacyPasscodeInputProtocolNode$OnFullyFilled.id;
                RoundedRectHostProtocol roundedRectHostProtocol2 = legacyPasscodeInputProtocolNode$OnFullyFilled.protocol;
                StringSerializer stringSerializer = (StringSerializer) roundedRectHostProtocol2.serializer_1;
                stringSerializer.getClass();
                svg11.sendEvent(new ContentInfoCompat.CompatImpl(i19, 3, (JsonImpl) roundedRectHostProtocol2.serializer_3, new Object[]{str3}, new KSerializer[]{stringSerializer}));
                return Unit.INSTANCE;
            case 19:
                TextFieldState textFieldState3 = (TextFieldState) obj;
                textFieldState3.getClass();
                PasscodeInputProtocolNode$OnChange passcodeInputProtocolNode$OnChange = (PasscodeInputProtocolNode$OnChange) this.receiver;
                passcodeInputProtocolNode$OnChange.getClass();
                SVG svg12 = passcodeInputProtocolNode$OnChange.eventSink;
                int i20 = passcodeInputProtocolNode$OnChange.id;
                RadioHostProtocol radioHostProtocol = passcodeInputProtocolNode$OnChange.protocol;
                KSerializer kSerializer6 = radioHostProtocol.serializer_0;
                kSerializer6.getClass();
                svg12.sendEvent(new ContentInfoCompat.CompatImpl(i20, 4, (JsonImpl) radioHostProtocol.json, new Object[]{textFieldState3}, new KSerializer[]{kSerializer6}));
                return Unit.INSTANCE;
            case 20:
                ((Boolean) obj).getClass();
                JsonLogicResult$Success$$ExternalSyntheticOutline0.m4m(this.receiver);
                throw null;
            case 21:
                QrScanResult qrScanResult = (QrScanResult) obj;
                qrScanResult.getClass();
                QrCodeScannerProtocolNode$OnResult qrCodeScannerProtocolNode$OnResult = (QrCodeScannerProtocolNode$OnResult) this.receiver;
                qrCodeScannerProtocolNode$OnResult.getClass();
                SVG svg13 = qrCodeScannerProtocolNode$OnResult.eventSink;
                int i21 = qrCodeScannerProtocolNode$OnResult.id;
                RoundedRectHostProtocol roundedRectHostProtocol3 = qrCodeScannerProtocolNode$OnResult.protocol;
                KSerializer kSerializer7 = (KSerializer) roundedRectHostProtocol3.serializer_2;
                kSerializer7.getClass();
                svg13.sendEvent(new ContentInfoCompat.CompatImpl(i21, 4, (JsonImpl) roundedRectHostProtocol3.serializer_5, new Object[]{qrScanResult}, new KSerializer[]{kSerializer7}));
                return Unit.INSTANCE;
            case 22:
                BooleanState booleanState2 = (BooleanState) obj;
                booleanState2.getClass();
                RadioProtocolNode$OnChange radioProtocolNode$OnChange = (RadioProtocolNode$OnChange) this.receiver;
                radioProtocolNode$OnChange.getClass();
                SVG svg14 = radioProtocolNode$OnChange.eventSink;
                int i22 = radioProtocolNode$OnChange.id;
                RadioHostProtocol radioHostProtocol2 = radioProtocolNode$OnChange.protocol;
                KSerializer kSerializer8 = radioHostProtocol2.serializer_0;
                kSerializer8.getClass();
                svg14.sendEvent(new ContentInfoCompat.CompatImpl(i22, 3, (JsonImpl) radioHostProtocol2.json, new Object[]{booleanState2}, new KSerializer[]{kSerializer8}));
                return Unit.INSTANCE;
            case 23:
                int intValue3 = ((Number) obj).intValue();
                RadioSelectionGroupProtocolNode$OnSelectionChanged radioSelectionGroupProtocolNode$OnSelectionChanged = (RadioSelectionGroupProtocolNode$OnSelectionChanged) this.receiver;
                SVG svg15 = radioSelectionGroupProtocolNode$OnSelectionChanged.eventSink;
                int i23 = radioSelectionGroupProtocolNode$OnSelectionChanged.id;
                RadioHostProtocol radioHostProtocol3 = radioSelectionGroupProtocolNode$OnSelectionChanged.protocol;
                JsonImpl jsonImpl5 = (JsonImpl) radioHostProtocol3.json;
                Object[] objArr5 = {Integer.valueOf(intValue3)};
                IntSerializer intSerializer3 = (IntSerializer) radioHostProtocol3.serializer_0;
                intSerializer3.getClass();
                svg15.sendEvent(new ContentInfoCompat.CompatImpl(i23, 3, jsonImpl5, objArr5, new KSerializer[]{intSerializer3}));
                return Unit.INSTANCE;
            case 24:
                String str4 = (String) obj;
                str4.getClass();
                ReactionDialogAnchorProtocolNode$OnSelect reactionDialogAnchorProtocolNode$OnSelect = (ReactionDialogAnchorProtocolNode$OnSelect) this.receiver;
                reactionDialogAnchorProtocolNode$OnSelect.getClass();
                SVG svg16 = reactionDialogAnchorProtocolNode$OnSelect.eventSink;
                int i24 = reactionDialogAnchorProtocolNode$OnSelect.id;
                RadioHostProtocol radioHostProtocol4 = reactionDialogAnchorProtocolNode$OnSelect.protocol;
                StringSerializer stringSerializer2 = (StringSerializer) radioHostProtocol4.serializer_2;
                stringSerializer2.getClass();
                svg16.sendEvent(new ContentInfoCompat.CompatImpl(i24, 5, (JsonImpl) radioHostProtocol4.json, new Object[]{str4}, new KSerializer[]{stringSerializer2}));
                return Unit.INSTANCE;
            case 25:
                TextFieldState textFieldState4 = (TextFieldState) obj;
                textFieldState4.getClass();
                SearchBarProtocolNode$OnQueryChange searchBarProtocolNode$OnQueryChange = (SearchBarProtocolNode$OnQueryChange) this.receiver;
                searchBarProtocolNode$OnQueryChange.getClass();
                SVG svg17 = searchBarProtocolNode$OnQueryChange.eventSink;
                int i25 = searchBarProtocolNode$OnQueryChange.id;
                SearchBarHostProtocol searchBarHostProtocol = searchBarProtocolNode$OnQueryChange.protocol;
                KSerializer kSerializer9 = searchBarHostProtocol.serializer_0;
                kSerializer9.getClass();
                svg17.sendEvent(new ContentInfoCompat.CompatImpl(i25, 3, searchBarHostProtocol.json, new Object[]{textFieldState4}, new KSerializer[]{kSerializer9}));
                return Unit.INSTANCE;
            case 26:
                TextFieldState textFieldState5 = (TextFieldState) obj;
                textFieldState5.getClass();
                SearchFieldProtocolNode$OnChange searchFieldProtocolNode$OnChange = (SearchFieldProtocolNode$OnChange) this.receiver;
                searchFieldProtocolNode$OnChange.getClass();
                SVG svg18 = searchFieldProtocolNode$OnChange.eventSink;
                int i26 = searchFieldProtocolNode$OnChange.id;
                SearchBarHostProtocol searchBarHostProtocol2 = searchFieldProtocolNode$OnChange.protocol;
                KSerializer kSerializer10 = searchBarHostProtocol2.serializer_0;
                kSerializer10.getClass();
                svg18.sendEvent(new ContentInfoCompat.CompatImpl(i26, 3, searchBarHostProtocol2.json, new Object[]{textFieldState5}, new KSerializer[]{kSerializer10}));
                return Unit.INSTANCE;
            case 27:
                ((Boolean) obj).getClass();
                JsonLogicResult$Success$$ExternalSyntheticOutline0.m4m(this.receiver);
                throw null;
            case 28:
                ((TextFieldState) obj).getClass();
                JsonLogicResult$Success$$ExternalSyntheticOutline0.m4m(this.receiver);
                throw null;
            default:
                SegmentedToggleValue segmentedToggleValue = (SegmentedToggleValue) obj;
                segmentedToggleValue.getClass();
                SegmentedToggleProtocolNode$OnValueChanged segmentedToggleProtocolNode$OnValueChanged = (SegmentedToggleProtocolNode$OnValueChanged) this.receiver;
                segmentedToggleProtocolNode$OnValueChanged.getClass();
                SVG svg19 = segmentedToggleProtocolNode$OnValueChanged.eventSink;
                int i27 = segmentedToggleProtocolNode$OnValueChanged.id;
                SearchBarHostProtocol searchBarHostProtocol3 = segmentedToggleProtocolNode$OnValueChanged.protocol;
                KSerializer kSerializer11 = searchBarHostProtocol3.serializer_0;
                kSerializer11.getClass();
                svg19.sendEvent(new ContentInfoCompat.CompatImpl(i27, 2, searchBarHostProtocol3.json, new Object[]{segmentedToggleValue}, new KSerializer[]{kSerializer11}));
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GraphLoop$processingQueue$1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.$r8$classId = i3;
    }
}
