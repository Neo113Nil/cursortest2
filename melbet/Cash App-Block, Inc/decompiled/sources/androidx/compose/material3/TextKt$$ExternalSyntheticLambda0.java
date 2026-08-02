package androidx.compose.material3;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.video.Recorder;
import androidx.camera.viewfinder.core.ImplementationMode;
import androidx.collection.ObjectList$$ExternalSyntheticLambda0;
import androidx.compose.foundation.contextmenu.ContextMenuColors;
import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDragScope$1;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement$Horizontal;
import androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScopeImpl;
import androidx.compose.foundation.lazy.layout.LazySaveableStateHolder;
import androidx.compose.foundation.pager.PagerScrollScopeKt$LazyLayoutScrollScope$1;
import androidx.compose.foundation.text.BasicTextFieldKt$DefaultTextFieldDecorator$1;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuData;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt;
import androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import androidx.compose.foundation.text.selection.PlatformSelectionBehaviors_androidKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.material.AnchoredDraggableState;
import androidx.compose.material.AppBarKt$$ExternalSyntheticLambda4;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.ScaffoldState;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalContext;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.ReusableGapRememberObserverHolder;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.composer.gapbuffer.SlotWriter;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.RememberEventDispatcher;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.tooling.PreviewActivity;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.common.FlagSet;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.VideoSize;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.media3.ui.compose.state.PresentationState;
import androidx.navigation.compose.DialogHostKt;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda0;
import androidx.paging.PageFetcher$generateNewPagingSource$3;
import app.cash.local.backend.CartBuilder;
import app.cash.local.backend.real.RealCartBuilder;
import app.cash.local.primitives.LocalMoney;
import app.cash.local.primitives.LocationMenu;
import coil3.size.SizeKt;
import com.fillr.featuretoggle.UnleashContext;
import com.google.android.filament.Viewport;
import com.squareup.cash.ui.CashInsetsListenerKt;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmc.BodyPartID;
import string.TrimMode;

/* loaded from: classes3.dex */
public final /* synthetic */ class TextKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ TextKt$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0114, code lost:
    
        if (r1.getCurrentMediaItemIndex() == r2.getPeriod(r6, r5, false).windowIndex) goto L43;
     */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        TextRange textRange = null;
        int i2 = 25;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                TextKt.ProvideTextStyle((TextStyle) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(49));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                TrimMode.CameraXViewfinder((SurfaceRequest) obj4, (ImplementationMode) obj3, (Composer) obj, Updater.updateChangedFlags(221233));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                ((ContextMenuScope) obj4).Content$foundation((ContextMenuColors) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 3:
                float floatValue = ((Float) obj).floatValue();
                ((AnchoredDraggableState$anchoredDragScope$1) obj4).dragTo(floatValue, ((Float) obj2).floatValue());
                ((Ref$FloatRef) obj3).element = floatValue;
                return Unit.INSTANCE;
            case 4:
                SubcomposeMeasureScope subcomposeMeasureScope = (SubcomposeMeasureScope) obj;
                Constraints constraints = (Constraints) obj2;
                return ((MeasurePolicy) obj4).mo138measure3p2s80s(subcomposeMeasureScope, subcomposeMeasureScope.subcompose(Unit.INSTANCE, new ComposableLambdaImpl(new TextKt$$ExternalSyntheticLambda0((ComposableLambdaImpl) obj3, new BoxWithConstraintsScopeImpl(subcomposeMeasureScope, constraints.value), 5), true, -431986394)), constraints.value);
            case 5:
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj3;
                BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj4;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    composableLambdaImpl.invoke((Object) boxWithConstraintsScopeImpl, (Object) gapComposer, (Object) 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                GridCells gridCells = (GridCells) obj4;
                Arrangement$Horizontal arrangement$Horizontal = (Arrangement$Horizontal) obj3;
                Density density = (Density) obj;
                Constraints constraints2 = (Constraints) obj2;
                if (Constraints.m1025getMaxWidthimpl(constraints2.value) == Integer.MAX_VALUE) {
                    InlineClassHelperKt.throwIllegalArgumentException("LazyVerticalGrid's width should be bound by parent.");
                }
                int m1025getMaxWidthimpl = Constraints.m1025getMaxWidthimpl(constraints2.value);
                int[] intArray = CollectionsKt.toIntArray(gridCells.calculateCrossAxisCellSizes(density, m1025getMaxWidthimpl, density.mo230roundToPx0680j_4(arrangement$Horizontal.mo252getSpacingD9Ej5fM())));
                int[] iArr = new int[intArray.length];
                arrangement$Horizontal.arrange(density, m1025getMaxWidthimpl, intArray, LayoutDirection.Ltr, iArr);
                return new Recorder.AnonymousClass4(intArray, iArr, r9, 15);
            case 7:
                LazyLayoutItemContentFactory lazyLayoutItemContentFactory = (LazyLayoutItemContentFactory) obj4;
                LazyLayoutItemContentFactory.CachedItemContent cachedItemContent = (LazyLayoutItemContentFactory.CachedItemContent) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) lazyLayoutItemContentFactory.itemProvider.invoke();
                    int i3 = cachedItemContent.index;
                    Object obj5 = cachedItemContent.key;
                    if ((i3 >= lazyLayoutItemProvider.getItemCount() || !lazyLayoutItemProvider.getKey(i3).equals(obj5)) && (i3 = lazyLayoutItemProvider.getIndex(obj5)) != -1) {
                        cachedItemContent.index = i3;
                    }
                    int i4 = i3;
                    if (i4 != -1) {
                        gapComposer2.startReplaceGroup(-1664741271);
                        LazyLayoutKt.m322SkippableItemJVlU9Rs(lazyLayoutItemProvider, lazyLayoutItemContentFactory.saveableStateHolder, i4, cachedItemContent.key, gapComposer2, 0);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(-1664505826);
                        gapComposer2.end(false);
                    }
                    boolean changedInstance = gapComposer2.changedInstance(cachedItemContent);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changedInstance || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new ObjectList$$ExternalSyntheticLambda0(cachedItemContent, 21);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    Updater.DisposableEffect(obj5, (Function1) rememberedValue, gapComposer2);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                return ((LazyLayoutMeasurePolicy) obj3).mo307measure0kLqBqw(new LazyLayoutMeasureScopeImpl((LazyLayoutItemContentFactory) obj4, (SubcomposeMeasureScope) obj), ((Constraints) obj2).value);
            case 9:
                ComposableLambdaImpl composableLambdaImpl2 = (ComposableLambdaImpl) obj3;
                LazySaveableStateHolder lazySaveableStateHolder = (LazySaveableStateHolder) obj4;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    composableLambdaImpl2.invoke((Object) lazySaveableStateHolder, (Object) gapComposer3, (Object) 0);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) obj4;
                float floatValue2 = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                ref$FloatRef.element += ((PagerScrollScopeKt$LazyLayoutScrollScope$1) obj3).$$delegate_0.scrollBy(floatValue2 - ref$FloatRef.element);
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                ((BasicTextFieldKt$DefaultTextFieldDecorator$1) obj4).Decoration((ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 12:
                TextContextMenuDataProvider textContextMenuDataProvider = (TextContextMenuDataProvider) obj4;
                TextContextMenuSession textContextMenuSession = (TextContextMenuSession) obj3;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    boolean changed = gapComposer4.changed(textContextMenuDataProvider);
                    Object rememberedValue2 = gapComposer4.rememberedValue();
                    if (changed || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = Updater.derivedStateOf(new PageFetcher$generateNewPagingSource$3(0, textContextMenuDataProvider, TextContextMenuDataProvider.class, "data", "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0, 1));
                        gapComposer4.updateRememberedValue(rememberedValue2);
                    }
                    DefaultTextContextMenuDropdownProvider_androidKt.DefaultTextContextMenuDropdown(textContextMenuSession, (TextContextMenuData) ((State) rememberedValue2).getValue(), gapComposer4, 0);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                DefaultTextContextMenuDropdownProvider_androidKt.DefaultTextContextMenuDropdown((TextContextMenuSession) obj4, (TextContextMenuData) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                ((TextContextMenuHelperApi28) obj4).IconBox((Drawable) obj3, (Composer) obj, Updater.updateChangedFlags(49));
                return Unit.INSTANCE;
            case 15:
                TextFieldSelectionManager textFieldSelectionManager = (TextFieldSelectionManager) obj4;
                CoroutineScope coroutineScope = (CoroutineScope) obj3;
                TextContextMenuBuilderScope textContextMenuBuilderScope = (TextContextMenuBuilderScope) obj;
                Context context = (Context) obj2;
                boolean editable = textFieldSelectionManager.getEditable();
                AnnotatedString transformedText$foundation = textFieldSelectionManager.getTransformedText$foundation();
                String str = transformedText$foundation != null ? transformedText$foundation.text : null;
                TextRange textRange2 = textFieldSelectionManager.latestSelection;
                if (textRange2 != null) {
                    long j = textRange2.packedValue;
                    OffsetMapping offsetMapping = textFieldSelectionManager.offsetMapping;
                    textRange = new TextRange(SizeKt.TextRange(offsetMapping.originalToTransformed((int) (j >> 32)), offsetMapping.originalToTransformed((int) (j & BodyPartID.bodyIdMax))));
                }
                PlatformSelectionBehaviors_androidKt.m440addPlatformTextContextMenuItems71BSaZU(textContextMenuBuilderScope, context, editable, str, textRange, textFieldSelectionManager.platformSelectionBehaviors, new androidx.compose.material.MenuKt$$ExternalSyntheticLambda0(16, textFieldSelectionManager, coroutineScope, context));
                return Unit.INSTANCE;
            case 16:
                float floatValue3 = ((Float) obj).floatValue();
                float floatValue4 = ((Float) obj2).floatValue();
                AnchoredDraggableState anchoredDraggableState = ((androidx.compose.material.AnchoredDraggableState$anchoredDragScope$1) obj4).this$0;
                ((ParcelableSnapshotMutableFloatState) anchoredDraggableState.offset$delegate).setFloatValue(floatValue3);
                ((ParcelableSnapshotMutableFloatState) anchoredDraggableState.lastVelocity$delegate).setFloatValue(floatValue4);
                ((Ref$FloatRef) obj3).element = floatValue3;
                return Unit.INSTANCE;
            case 17:
                androidx.compose.material.Typography typography = (androidx.compose.material.Typography) obj4;
                ComposableLambdaImpl composableLambdaImpl3 = (ComposableLambdaImpl) obj3;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    androidx.compose.material.TextKt.ProvideTextStyle(typography.body1, Expect_jvmKt.rememberComposableLambda(905505767, new AppBarKt$$ExternalSyntheticLambda4(composableLambdaImpl3, 4), gapComposer5), gapComposer5, 48);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                ComposableLambdaImpl composableLambdaImpl4 = (ComposableLambdaImpl) obj3;
                androidx.compose.material.ScaffoldKt$ScaffoldLayout$contentPadding$1$1 scaffoldKt$ScaffoldLayout$contentPadding$1$1 = (androidx.compose.material.ScaffoldKt$ScaffoldLayout$contentPadding$1$1) obj4;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    composableLambdaImpl4.invoke((Object) scaffoldKt$ScaffoldLayout$contentPadding$1$1, (Object) gapComposer6, (Object) 6);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                Function3 function3 = (Function3) obj4;
                ScaffoldState scaffoldState = (ScaffoldState) obj3;
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    function3.invoke(scaffoldState.snackbarHostState, gapComposer7, 0);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                Viewport viewport = (Viewport) obj4;
                Function2 function2 = (Function2) obj3;
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    Updater.CompositionLocalProvider(ScaffoldKt.LocalFabPlacement.defaultProvidedValue$runtime(viewport), function2, gapComposer8, 8);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                ((DefaultBasicAlertDialogOverride) obj4).BasicAlertDialog((UnleashContext) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                Updater.CompositionLocalProvider((CompositionLocalContext) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(49));
                return Unit.INSTANCE;
            case 23:
                RememberEventDispatcher rememberEventDispatcher = (RememberEventDispatcher) obj4;
                SlotWriter slotWriter = (SlotWriter) obj3;
                int intValue9 = ((Integer) obj).intValue();
                if (obj2 instanceof ComposeNodeLifecycleCallback) {
                    ((MutableVector) rememberEventDispatcher.leaving).add((ComposeNodeLifecycleCallback) obj2);
                } else if (!(obj2 instanceof ReusableGapRememberObserverHolder)) {
                    if (obj2 instanceof RememberObserverHolder) {
                        Updater.removeData(slotWriter, intValue9, obj2);
                        rememberEventDispatcher.forgetting((RememberObserverHolder) obj2);
                    } else if (obj2 instanceof RecomposeScopeImpl) {
                        Updater.removeData(slotWriter, intValue9, obj2);
                        ((RecomposeScopeImpl) obj2).release();
                    }
                }
                return Unit.INSTANCE;
            case 24:
                Object[] objArr = (Object[]) obj4;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj3;
                Composer composer9 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                int i5 = PreviewActivity.$r8$clinit;
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    boolean changedInstance2 = gapComposer9.changedInstance(objArr);
                    Object rememberedValue3 = gapComposer9.rememberedValue();
                    if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new DialogHostKt$$ExternalSyntheticLambda0(i2, parcelableSnapshotMutableIntState, objArr);
                        gapComposer9.updateRememberedValue(rememberedValue3);
                    }
                    FloatingActionButtonKt.m530ExtendedFloatingActionButtonXz6DiA((Function0) rememberedValue3, null, null, 0L, 0L, null, gapComposer9, 12582912);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                PresentationState presentationState = (PresentationState) obj4;
                Player player = (Player) obj3;
                Player player2 = (Player) obj;
                Player.Events events = (Player.Events) obj2;
                player2.getClass();
                events.getClass();
                FlagSet flagSet = events.flags;
                if (flagSet.flags.get(25)) {
                    ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) player2;
                    exoPlayerImpl.verifyApplicationThread();
                    if (!Intrinsics.areEqual(exoPlayerImpl.videoSize, VideoSize.UNKNOWN) && exoPlayerImpl.getPlaybackState() != 1) {
                        presentationState.getClass();
                        presentationState.videoSizeDp$delegate.setValue(PresentationState.m1154getVideoSizeDphgXytuQ(player));
                    }
                }
                if (flagSet.flags.get(26)) {
                    presentationState.coverSurface$delegate.setValue(Boolean.FALSE);
                }
                if (flagSet.flags.get(2)) {
                    presentationState.getClass();
                    ExoPlayerImpl exoPlayerImpl2 = (ExoPlayerImpl) player;
                    Timeline currentTimeline = exoPlayerImpl2.isCommandAvailable(17) ? exoPlayerImpl2.getCurrentTimeline() : Timeline.EMPTY;
                    currentTimeline.getClass();
                    if (currentTimeline.isEmpty()) {
                        presentationState.lastPeriodUidWithTracks = null;
                    } else {
                        Timeline.Period period = new Timeline.Period();
                        if (!exoPlayerImpl2.isCommandAvailable(30) || exoPlayerImpl2.getCurrentTracks().groups.isEmpty()) {
                            Object obj6 = presentationState.lastPeriodUidWithTracks;
                            if (obj6 != null) {
                                int indexOfPeriod = currentTimeline.getIndexOfPeriod(obj6);
                                if (indexOfPeriod != -1) {
                                    break;
                                }
                                presentationState.lastPeriodUidWithTracks = null;
                            }
                        } else {
                            presentationState.lastPeriodUidWithTracks = currentTimeline.getPeriod(exoPlayerImpl2.getCurrentPeriodIndex(), period, true).uid;
                        }
                    }
                    presentationState.maybeHideSurface(player);
                }
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                DialogHostKt.PopulateVisibleList((List) obj4, (Collection) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                CashInsetsListenerKt.SaveableStateProvider((SaveableStateHolder) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                GapComposer gapComposer10 = (GapComposer) ((Composer) obj);
                gapComposer10.startReplaceGroup(2097340104);
                LocalMoney calculateCost = ((RealCartBuilder) ((CartBuilder) obj4)).calculateCost((LocationMenu) obj3, false, gapComposer10);
                gapComposer10.end(false);
                return calculateCost;
        }
    }

    public /* synthetic */ TextKt$$ExternalSyntheticLambda0(ComposableLambdaImpl composableLambdaImpl, Object obj, int i) {
        this.$r8$classId = i;
        this.f$1 = composableLambdaImpl;
        this.f$0 = obj;
    }

    public /* synthetic */ TextKt$$ExternalSyntheticLambda0(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
    }
}
