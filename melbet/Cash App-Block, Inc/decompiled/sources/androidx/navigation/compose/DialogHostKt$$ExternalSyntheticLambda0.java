package androidx.navigation.compose;

import android.app.PendingIntent;
import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.media.MediaFormat;
import android.os.Build;
import android.util.Size;
import android.view.textclassifier.TextClassification;
import androidx.activity.compose.ComposePredictiveBackHandler;
import androidx.appcompat.widget.TintInfo;
import androidx.camera.camera2.adapter.SupportedSurfaceCombination;
import androidx.camera.camera2.internal.StreamUseCaseUtil;
import androidx.camera.camera2.pipe.compat.ActiveCamera;
import androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$availableCameraFlow$1$availabilityCallback$1;
import androidx.camera.camera2.pipe.compat.Camera2CameraStatusMonitor;
import androidx.camera.camera2.pipe.compat.Camera2DeviceCache$createCameraIdListFlow$1$callback$1;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.AutoValue_Config_Option;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.video.AutoValue_Quality_ConstantQuality;
import androidx.camera.video.MimeMatchedVideoCapabilities;
import androidx.camera.video.internal.config.DynamicRangeFormatComboRegistry;
import androidx.camera.video.internal.config.FormatComboRegistry;
import androidx.camera.video.internal.config.VideoConfigUtil;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import androidx.camera.video.internal.encoder.VideoEncoderInfoImpl$$ExternalSyntheticLambda0;
import androidx.collection.ObjectList$$ExternalSyntheticLambda0;
import androidx.compose.foundation.FocusableNode;
import androidx.compose.foundation.lazy.grid.LazyGridIntervalContent;
import androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.foundation.lazy.layout.LazySaveableStateHolder;
import androidx.compose.foundation.pager.PagerLayoutIntervalContent;
import androidx.compose.foundation.pager.PagerLazyLayoutItemProvider;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextAnnotatorScope;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuItem;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.SelectionManagerKt$WhenMappings;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$WhenMappings;
import androidx.compose.material.DismissState;
import androidx.compose.material.DismissValue;
import androidx.compose.material3.TooltipStateImpl;
import androidx.compose.material3.internal.BasicTooltipKt$anchorSemantics$1$1$1;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.GapRememberObserverHolder;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.composer.gapbuffer.SlotReader;
import androidx.compose.runtime.composer.gapbuffer.SlotTable;
import androidx.compose.runtime.composer.gapbuffer.SlotTableKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.tooling.ComposeStackTrace;
import androidx.compose.runtime.tooling.CompositionErrorContextImpl;
import androidx.compose.runtime.tooling.ObjectLocation;
import androidx.compose.runtime.tooling.SourceInformationKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.LinkInteractionListener;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.tooling.PreviewActivity;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle$$ExternalSyntheticLambda0;
import androidx.media3.common.Format;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.muxer.Mp4Muxer;
import androidx.media3.muxer.Mp4Writer;
import androidx.media3.muxer.MuxerException;
import androidx.media3.muxer.Track;
import androidx.media3.ui.PlayerView;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController$NavControllerNavigatorState;
import androidx.navigation.fragment.FragmentNavigator;
import androidx.tracing.Trace;
import androidx.work.Logger$LogcatLogger;
import androidx.work.impl.constraints.controllers.BaseConstraintController$track$1$listener$1;
import androidx.work.impl.constraints.controllers.BatteryNotLowController;
import androidx.work.impl.constraints.trackers.BatteryNotLowTracker;
import androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTrackerKt;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.ng$$ExternalSyntheticLambda0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.brotli.dec.HuffmanTreeGroup;

/* loaded from: classes3.dex */
public final /* synthetic */ class DialogHostKt$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ DialogHostKt$$ExternalSyntheticLambda0(TextLinkScope textLinkScope, AnnotatedString.Range range, UriHandler uriHandler) {
        this.$r8$classId = 14;
        this.f$0 = range;
        this.f$1 = uriHandler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x019a A[LOOP:3: B:93:0x016d->B:105:0x019a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x018d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014a A[SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        Object obj;
        LinkInteractionListener linkInteractionListener;
        long j;
        TextLayoutResultProxy layoutResult;
        LegacyTextFieldState legacyTextFieldState;
        AnnotatedString annotatedString;
        List list;
        Object[] objArr;
        Object[] objArr2;
        long j2 = 9205357640488583168L;
        ObjectLocation objectLocation = null;
        Object[] objArr3 = 0;
        switch (this.$r8$classId) {
            case 0:
                ((DialogNavigator) this.f$0).popBackStack((NavBackStackEntry) this.f$1, false);
                return Unit.INSTANCE;
            case 1:
                ((ComposePredictiveBackHandler) this.f$0).currentOnBack = (Function2) this.f$1;
                return Unit.INSTANCE;
            case 2:
                SupportedSurfaceCombination supportedSurfaceCombination = (SupportedSurfaceCombination) this.f$0;
                List list2 = (List) this.f$1;
                AutoValue_Config_Option autoValue_Config_Option = StreamUseCaseUtil.STREAM_USE_CASE_STREAM_SPEC_OPTION;
                return Boolean.valueOf(StreamUseCaseUtil.areStreamUseCasesAvailableForSurfaceConfigs(supportedSurfaceCombination.cameraMetadata, list2));
            case 3:
                ((ObjectList$$ExternalSyntheticLambda0) this.f$0).invoke((ActiveCamera) this.f$1);
                return Unit.INSTANCE;
            case 4:
                ((CameraManager) this.f$0).unregisterAvailabilityCallback((Camera2CameraAvailabilityMonitor$availableCameraFlow$1$availabilityCallback$1) this.f$1);
                return Unit.INSTANCE;
            case 5:
                ((Camera2CameraStatusMonitor) this.f$0).manager.unregisterAvailabilityCallback((Camera2DeviceCache$createCameraIdListFlow$1$callback$1) this.f$1);
                return Unit.INSTANCE;
            case 6:
                ((CameraManager) this.f$0).unregisterAvailabilityCallback((Camera2DeviceCache$createCameraIdListFlow$1$callback$1) this.f$1);
                return Unit.INSTANCE;
            case 7:
                VideoEncoderInfoImpl$$ExternalSyntheticLambda0 videoEncoderInfoImpl$$ExternalSyntheticLambda0 = (VideoEncoderInfoImpl$$ExternalSyntheticLambda0) this.f$0;
                MimeMatchedVideoCapabilities mimeMatchedVideoCapabilities = (MimeMatchedVideoCapabilities) this.f$1;
                String str = mimeMatchedVideoCapabilities.mime;
                CameraInfoInternal cameraInfoInternal = mimeMatchedVideoCapabilities.cameraInfo;
                videoEncoderInfoImpl$$ExternalSyntheticLambda0.getClass();
                VideoEncoderInfo find = VideoEncoderInfoImpl$$ExternalSyntheticLambda0.find(str);
                if (find == null) {
                    return new MimeMatchedVideoCapabilities.ValidatedData();
                }
                Set supportedDynamicRanges = cameraInfoInternal.getSupportedDynamicRanges();
                supportedDynamicRanges.getClass();
                if (supportedDynamicRanges.isEmpty()) {
                    return new MimeMatchedVideoCapabilities.ValidatedData();
                }
                LinkedHashMap linkedHashMap = VideoConfigUtil.MIME_TO_DATA_SPACE_MAP;
                str.getClass();
                String str2 = DynamicRangeFormatComboRegistry.MIMETYPE_VIDEO_HEVC_GATED;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (Map.Entry entry : ((Map) DynamicRangeFormatComboRegistry.registries$delegate.getValue()).entrySet()) {
                    DynamicRange dynamicRange = (DynamicRange) entry.getKey();
                    FormatComboRegistry formatComboRegistry = (FormatComboRegistry) entry.getValue();
                    formatComboRegistry.getClass();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = formatComboRegistry.formatComboMapping.values().iterator();
                    while (it.hasNext()) {
                        Set set = (Set) ((Map) it.next()).get(str);
                        if (set != null) {
                            arrayList.addAll(set);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        linkedHashSet.add(dynamicRange);
                    }
                }
                LinkedHashSet intersect = CollectionsKt.intersect(supportedDynamicRanges, linkedHashSet);
                if (intersect.isEmpty()) {
                    return new MimeMatchedVideoCapabilities.ValidatedData();
                }
                List supportedResolutions = cameraInfoInternal.getSupportedResolutions(34);
                supportedResolutions.getClass();
                HashSet hashSet = CollectionsKt.toHashSet(supportedResolutions);
                AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality = AutoValue_Quality_ConstantQuality.SD;
                ArrayList arrayList2 = new ArrayList(AutoValue_Quality_ConstantQuality.QUALITIES_ORDER_BY_SIZE);
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (next instanceof AutoValue_Quality_ConstantQuality) {
                        arrayList3.add(next);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality2 = (AutoValue_Quality_ConstantQuality) it3.next();
                    List list3 = autoValue_Quality_ConstantQuality2.typicalSizes;
                    list3.getClass();
                    Iterator it4 = list3.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            obj = it4.next();
                            Size size = (Size) obj;
                            if (!hashSet.contains(size) || !find.isSizeSupported(size.getWidth(), size.getHeight())) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    Size size2 = (Size) obj;
                    Pair pair = size2 != null ? new Pair(autoValue_Quality_ConstantQuality2, size2) : null;
                    if (pair != null) {
                        arrayList4.add(pair);
                    }
                }
                Map map = MapsKt__MapsKt.toMap(arrayList4);
                return map.isEmpty() ? new MimeMatchedVideoCapabilities.ValidatedData() : new MimeMatchedVideoCapabilities.ValidatedData(map, intersect);
            case 8:
                HuffmanTreeGroup huffmanTreeGroup = (HuffmanTreeGroup) this.f$0;
                MediaFormat mediaFormat = (MediaFormat) this.f$1;
                TintInfo tintInfo = (TintInfo) huffmanTreeGroup.codes;
                tintInfo.getClass();
                Mp4Muxer mp4Muxer = (Mp4Muxer) tintInfo.mTintMode;
                Trace.checkState(!tintInfo.mHasTintMode);
                try {
                    float f = !mediaFormat.containsKey("capture-rate") ? -3.4028235E38f : mediaFormat.getValueTypeForKey("capture-rate") == 3 ? mediaFormat.getFloat("capture-rate") : mediaFormat.getInteger("capture-rate");
                    if (f != -3.4028235E38f) {
                        String str3 = Util.DEVICE_DEBUG_INFO;
                        int floatToIntBits = Float.floatToIntBits(f);
                        mp4Muxer.addMetadataEntry(new MdtaMetadataEntry("com.android.capture.fps", new byte[]{(byte) (floatToIntBits >> 24), (byte) (floatToIntBits >> 16), (byte) (floatToIntBits >> 8), (byte) floatToIntBits}, 0, 23));
                    }
                    Format createFormatFromMediaFormat = Log.createFormatFromMediaFormat(mediaFormat);
                    Mp4Writer mp4Writer = mp4Muxer.mp4Writer;
                    int i = mp4Muxer.nextTrackId;
                    mp4Muxer.nextTrackId = i + 1;
                    Track track = new Track(i, createFormatFromMediaFormat, mp4Writer.sampleCopyEnabled);
                    ArrayList arrayList5 = mp4Writer.tracks;
                    arrayList5.add(track);
                    Collections.sort(arrayList5, new ng$$ExternalSyntheticLambda0(20));
                    mp4Muxer.trackIdToTrack.add(track);
                    return Integer.valueOf(i);
                } catch (MuxerException e) {
                    a$$ExternalSyntheticBUOutline0.m((Throwable) e);
                    return null;
                }
            case 9:
                ((Channel) this.f$0).mo1159trySendJP2dKIU(this.f$1);
                return Unit.INSTANCE;
            case 10:
                DerivedSnapshotState derivedSnapshotState = (DerivedSnapshotState) this.f$0;
                LazyGridState lazyGridState = (LazyGridState) this.f$1;
                LazyGridIntervalContent lazyGridIntervalContent = (LazyGridIntervalContent) derivedSnapshotState.getValue();
                return new LazyGridItemProviderImpl(lazyGridState, lazyGridIntervalContent, new HuffmanTreeGroup((IntRange) lazyGridState.scrollPosition.nearestRangeState.getValue(), lazyGridIntervalContent));
            case 11:
                SaveableStateRegistry saveableStateRegistry = (SaveableStateRegistry) this.f$0;
                SaveableStateHolder saveableStateHolder = (SaveableStateHolder) this.f$1;
                EmptyMap emptyMap = EmptyMap.INSTANCE;
                emptyMap.getClass();
                return new LazySaveableStateHolder(saveableStateRegistry, emptyMap, saveableStateHolder);
            case 12:
                DerivedSnapshotState derivedSnapshotState2 = (DerivedSnapshotState) this.f$0;
                PagerState pagerState = (PagerState) this.f$1;
                PagerLayoutIntervalContent pagerLayoutIntervalContent = (PagerLayoutIntervalContent) derivedSnapshotState2.getValue();
                return new PagerLazyLayoutItemProvider(pagerState, pagerLayoutIntervalContent, new HuffmanTreeGroup((IntRange) ((LazyLayoutNearestRangeState) pagerState.scrollPosition.rootElements).getValue(), pagerLayoutIntervalContent));
            case 13:
                TextLinkScope textLinkScope = (TextLinkScope) this.f$0;
                AnnotatedString annotatedString2 = (AnnotatedString) this.f$1;
                if (textLinkScope == null) {
                    return annotatedString2;
                }
                SnapshotStateList snapshotStateList = textLinkScope.annotators;
                boolean isEmpty = snapshotStateList.isEmpty();
                AnnotatedString annotatedString3 = textLinkScope.text;
                if (!isEmpty) {
                    TextAnnotatorScope textAnnotatorScope = new TextAnnotatorScope(annotatedString3);
                    int size3 = snapshotStateList.size();
                    while (r9 < size3) {
                        ((Function1) snapshotStateList.get(r9)).invoke(textAnnotatorScope);
                        r9++;
                    }
                    annotatedString3 = textAnnotatorScope.styledText;
                }
                textLinkScope.text = annotatedString3;
                return annotatedString3 == null ? annotatedString2 : annotatedString3;
            case 14:
                AnnotatedString.Range range = (AnnotatedString.Range) this.f$0;
                UriHandler uriHandler = (UriHandler) this.f$1;
                LinkAnnotation linkAnnotation = (LinkAnnotation) range.item;
                if (linkAnnotation instanceof LinkAnnotation.Url) {
                    LinkInteractionListener linkInteractionListener2 = ((LinkAnnotation.Url) linkAnnotation).linkInteractionListener;
                    if (linkInteractionListener2 != null) {
                        linkInteractionListener2.onClick(linkAnnotation);
                    } else {
                        try {
                            uriHandler.openUri(((LinkAnnotation.Url) linkAnnotation).url);
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                } else if ((linkAnnotation instanceof LinkAnnotation.Clickable) && (linkInteractionListener = ((LinkAnnotation.Clickable) linkAnnotation).linkInteractionListener) != null) {
                    linkInteractionListener.onClick(linkAnnotation);
                }
                return Unit.INSTANCE;
            case 15:
                ((Ref$ObjectRef) this.f$0).element = ((Function0) this.f$1).invoke();
                return Unit.INSTANCE;
            case 16:
                return new IntOffset(PlatformKt.m1344roundk4lQ0M(((TextContextMenuDataProvider) this.f$0).mo375positiontuRUvjQ((LayoutCoordinates) ((Function0) this.f$1).invoke())));
            case 17:
                ((TextContextMenuItem) this.f$0).onClick.invoke((TextContextMenuSession) this.f$1);
                return Unit.INSTANCE;
            case 18:
                Context context = (Context) this.f$0;
                TextClassification textClassification = (TextClassification) this.f$1;
                String text = textClassification.getText();
                PendingIntent activity = PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
                if (Build.VERSION.SDK_INT >= 34) {
                    PlayerView.Api34.sendIntentAllowBackgroundActivityStart(activity);
                } else {
                    activity.send();
                }
                return Unit.INSTANCE;
            case 19:
                TextFieldSelectionState textFieldSelectionState = (TextFieldSelectionState) this.f$0;
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = (TextFieldDecoratorModifierNode) this.f$1;
                if (!textFieldSelectionState.isFocused) {
                    FocusableNode focusableNode = textFieldDecoratorModifierNode.focusableNode;
                    if (focusableNode.isAttached()) {
                        focusableNode.focusTargetNode.m608requestFocus3ESFkO8(7);
                    }
                }
                return Unit.INSTANCE;
            case 20:
                SelectionManager selectionManager = (SelectionManager) this.f$0;
                long j3 = ((IntSize) ((MutableState) this.f$1).getValue()).packedValue;
                Selection selection = selectionManager.getSelection();
                if (selection != null) {
                    Handle draggingHandle = selectionManager.getDraggingHandle();
                    int i2 = draggingHandle == null ? -1 : SelectionManagerKt$WhenMappings.$EnumSwitchMapping$0[draggingHandle.ordinal()];
                    if (i2 != -1) {
                        if (i2 == 1) {
                            j2 = SimpleLayoutKt.m449getMagnifierCenterJVtK1S4(selectionManager, j3, selection.start);
                        } else {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                a$$ExternalSyntheticBUOutline0.m$1("SelectionContainer does not support cursor");
                                return null;
                            }
                            j2 = SimpleLayoutKt.m449getMagnifierCenterJVtK1S4(selectionManager, j3, selection.end);
                        }
                    }
                }
                return new Offset(j2);
            case 21:
                TextFieldSelectionManager textFieldSelectionManager = (TextFieldSelectionManager) this.f$0;
                long j4 = ((IntSize) ((MutableState) this.f$1).getValue()).packedValue;
                Offset m457getCurrentDragPosition_m7T9E = textFieldSelectionManager.m457getCurrentDragPosition_m7T9E();
                if (m457getCurrentDragPosition_m7T9E != null) {
                    long j5 = m457getCurrentDragPosition_m7T9E.packedValue;
                    AnnotatedString transformedText$foundation = textFieldSelectionManager.getTransformedText$foundation();
                    if (transformedText$foundation != null && transformedText$foundation.text.length() != 0) {
                        Handle handle = (Handle) textFieldSelectionManager.draggingHandle$delegate.getValue();
                        int i3 = handle == null ? -1 : TextFieldSelectionManagerKt$WhenMappings.$EnumSwitchMapping$0[handle.ordinal()];
                        if (i3 != -1) {
                            if (i3 == 1 || i3 == 2) {
                                long j6 = textFieldSelectionManager.getValue$foundation().selection;
                                int i4 = TextRange.$r8$clinit;
                                j = j6 >> 32;
                            } else {
                                if (i3 != 3) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                long j7 = textFieldSelectionManager.getValue$foundation().selection;
                                int i5 = TextRange.$r8$clinit;
                                j = j7 & BodyPartID.bodyIdMax;
                            }
                            int i6 = (int) j;
                            LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager.state;
                            if (legacyTextFieldState2 != null && (layoutResult = legacyTextFieldState2.getLayoutResult()) != null && (legacyTextFieldState = textFieldSelectionManager.state) != null && (annotatedString = legacyTextFieldState.textDelegate.text) != null) {
                                int coerceIn = RangesKt___RangesKt.coerceIn(textFieldSelectionManager.offsetMapping.originalToTransformed(i6), 0, annotatedString.text.length());
                                float intBitsToFloat = Float.intBitsToFloat((int) (layoutResult.m371translateDecorationToInnerCoordinatesMKHz9U$foundation(j5) >> 32));
                                TextLayoutResult textLayoutResult = layoutResult.value;
                                MultiParagraph multiParagraph = textLayoutResult.multiParagraph;
                                int lineForOffset = multiParagraph.getLineForOffset(coerceIn);
                                float lineLeft = textLayoutResult.getLineLeft(lineForOffset);
                                float lineRight = textLayoutResult.getLineRight(lineForOffset);
                                float coerceIn2 = RangesKt___RangesKt.coerceIn(intBitsToFloat, Math.min(lineLeft, lineRight), Math.max(lineLeft, lineRight));
                                if (IntSize.m1055equalsimpl0(j4, 0L) || Math.abs(intBitsToFloat - coerceIn2) <= ((int) (j4 >> 32)) / 2) {
                                    float lineTop = multiParagraph.getLineTop(lineForOffset);
                                    j2 = (Float.floatToRawIntBits(((multiParagraph.getLineBottom(lineForOffset) - lineTop) / 2.0f) + lineTop) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(coerceIn2) << 32);
                                }
                            }
                        }
                    }
                }
                return new Offset(j2);
            case 22:
                return new DismissState((DismissValue) this.f$0, (Function1) this.f$1);
            case 23:
                JobKt.launch$default((CoroutineScope) this.f$0, null, null, new BasicTooltipKt$anchorSemantics$1$1$1((TooltipStateImpl) this.f$1, objArr3 == true ? 1 : 0, r9), 3);
                return Boolean.TRUE;
            case 24:
                CompositionErrorContextImpl compositionErrorContextImpl = (CompositionErrorContextImpl) this.f$0;
                Object obj2 = this.f$1;
                GapComposer gapComposer = compositionErrorContextImpl.composer;
                SlotTable slotTable = gapComposer.slotTable;
                SlotReader openReader = slotTable.openReader();
                int i7 = 0;
                while (true) {
                    try {
                        if (i7 < slotTable.groupsSize) {
                            if (openReader.isNode(i7)) {
                                Object node = openReader.node(i7);
                                if (node != obj2) {
                                    RememberObserverHolder rememberObserverHolder = node instanceof RememberObserverHolder ? (RememberObserverHolder) node : null;
                                    if ((rememberObserverHolder != null ? ((GapRememberObserverHolder) rememberObserverHolder).wrapped : null) != obj2) {
                                        objArr2 = false;
                                        if (objArr2 != false) {
                                            ObjectLocation objectLocation2 = new ObjectLocation(i7, null);
                                            openReader.close();
                                            objectLocation = objectLocation2;
                                        }
                                    }
                                }
                                objArr2 = true;
                                if (objArr2 != false) {
                                }
                            }
                            int[] iArr = openReader.groups;
                            int i8 = i7 + 1;
                            int access$slotAnchor = (i8 < openReader.groupsSize ? iArr[(i8 * 5) + 4] : openReader.slotsSize) - SlotTableKt.access$slotAnchor(i7, iArr);
                            for (int i9 = 0; i9 < access$slotAnchor; i9++) {
                                Object groupGet = openReader.groupGet(i7, i9);
                                if (groupGet != obj2) {
                                    RememberObserverHolder rememberObserverHolder2 = groupGet instanceof RememberObserverHolder ? (RememberObserverHolder) groupGet : null;
                                    if ((rememberObserverHolder2 != null ? ((GapRememberObserverHolder) rememberObserverHolder2).wrapped : null) != obj2) {
                                        objArr = false;
                                        if (objArr != true) {
                                            objectLocation = new ObjectLocation(i7, Integer.valueOf(i9));
                                        }
                                    }
                                }
                                objArr = true;
                                if (objArr != true) {
                                }
                            }
                            i7 = i8;
                        }
                    } finally {
                    }
                }
                if (objectLocation != null) {
                    int i10 = objectLocation.group;
                    Integer num = objectLocation.dataOffset;
                    SlotReader openReader2 = slotTable.openReader();
                    try {
                        ArrayList traceForGroup = SourceInformationKt.traceForGroup(openReader2, i10, num);
                        openReader2.close();
                        list = CollectionsKt.plus((Iterable) gapComposer.parentStackTrace$runtime(), (Collection) traceForGroup);
                    } finally {
                    }
                } else {
                    list = EmptyList.INSTANCE;
                }
                return new ComposeStackTrace(list, gapComposer.sourceMarkersEnabled);
            case 25:
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) this.f$0;
                Object[] objArr4 = (Object[]) this.f$1;
                int i11 = PreviewActivity.$r8$clinit;
                parcelableSnapshotMutableIntState.setIntValue((parcelableSnapshotMutableIntState.getIntValue() + 1) % objArr4.length);
                return Unit.INSTANCE;
            case 26:
                ((Lifecycle) this.f$0).removeObserver((Lifecycle$$ExternalSyntheticLambda0) this.f$1);
                return Unit.INSTANCE;
            case 27:
                NavController$NavControllerNavigatorState navController$NavControllerNavigatorState = (NavController$NavControllerNavigatorState) this.f$0;
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.f$1;
                navBackStackEntry.getClass();
                synchronized (navController$NavControllerNavigatorState.backStackLock) {
                    try {
                        StateFlowImpl stateFlowImpl = navController$NavControllerNavigatorState._backStack;
                        Iterable iterable = (Iterable) stateFlowImpl.getValue();
                        ArrayList arrayList6 = new ArrayList();
                        for (Object obj3 : iterable) {
                            if (Intrinsics.areEqual((NavBackStackEntry) obj3, navBackStackEntry)) {
                                stateFlowImpl.getClass();
                                stateFlowImpl.updateState(null, arrayList6);
                            } else {
                                arrayList6.add(obj3);
                            }
                        }
                        stateFlowImpl.getClass();
                        stateFlowImpl.updateState(null, arrayList6);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return Unit.INSTANCE;
            case 28:
                NavController$NavControllerNavigatorState navController$NavControllerNavigatorState2 = (NavController$NavControllerNavigatorState) this.f$0;
                Fragment fragment = (Fragment) this.f$1;
                for (NavBackStackEntry navBackStackEntry2 : (Iterable) navController$NavControllerNavigatorState2.transitionsInProgress.$$delegate_0.getValue()) {
                    if (FragmentNavigator.isLoggingEnabled()) {
                        android.util.Log.v("FragmentNavigator", "Marking transition complete for entry " + navBackStackEntry2 + " due to fragment " + fragment + " viewmodel being cleared");
                    }
                    navController$NavControllerNavigatorState2.markTransitionComplete(navBackStackEntry2);
                }
                return Unit.INSTANCE;
            default:
                BatteryNotLowController batteryNotLowController = (BatteryNotLowController) this.f$0;
                BaseConstraintController$track$1$listener$1 baseConstraintController$track$1$listener$1 = (BaseConstraintController$track$1$listener$1) this.f$1;
                BatteryNotLowTracker batteryNotLowTracker = batteryNotLowController.tracker;
                batteryNotLowTracker.getClass();
                synchronized (batteryNotLowTracker.lock) {
                    if (batteryNotLowTracker.listeners.remove(baseConstraintController$track$1$listener$1) && batteryNotLowTracker.listeners.isEmpty()) {
                        Logger$LogcatLogger.get().debug(BroadcastReceiverConstraintTrackerKt.TAG, batteryNotLowTracker.getClass().getSimpleName().concat(": unregistering receiver"));
                        batteryNotLowTracker.appContext.unregisterReceiver(batteryNotLowTracker.broadcastReceiver);
                    }
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ DialogHostKt$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    public /* synthetic */ DialogHostKt$$ExternalSyntheticLambda0(NavBackStackEntry navBackStackEntry, NavController$NavControllerNavigatorState navController$NavControllerNavigatorState, FragmentNavigator fragmentNavigator, Fragment fragment) {
        this.$r8$classId = 28;
        this.f$0 = navController$NavControllerNavigatorState;
        this.f$1 = fragment;
    }

    public /* synthetic */ DialogHostKt$$ExternalSyntheticLambda0(NavController$NavControllerNavigatorState navController$NavControllerNavigatorState, NavBackStackEntry navBackStackEntry, boolean z) {
        this.$r8$classId = 27;
        this.f$0 = navController$NavControllerNavigatorState;
        this.f$1 = navBackStackEntry;
    }
}
