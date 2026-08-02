package androidx.compose.foundation.text.selection;

import android.graphics.Bitmap;
import android.os.LocaleList;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.Magnifier_androidKt;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.KeyMappingKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.LongPressTextDragObserverKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGesturesModifierKt;
import androidx.compose.foundation.text.modifiers.SelectionController$$ExternalSyntheticLambda0;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.material.MenuKt$$ExternalSyntheticLambda0;
import androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda0;
import androidx.compose.material3.DateInputKt$$ExternalSyntheticLambda5;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda8;
import androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAbsoluteAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.focus.FocusOwnerImplKt;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidClipboard;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import androidx.compose.ui.window.SecureFlagPolicy;
import androidx.navigation.Navigator$$ExternalSyntheticLambda0;
import androidx.paging.CachedPageEventFlow$$ExternalSyntheticLambda0;
import androidx.paging.HintHandler$$ExternalSyntheticLambda0;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.views.LocalViewFactory$createUi$view$3$1$1$1;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.q2$$ExternalSyntheticLambda8;
import com.squareup.cash.arcade.components.avatar.AvatarKt$$ExternalSyntheticLambda11;
import com.squareup.cash.arcade.components.list.ListOrderedKt$$ExternalSyntheticLambda11;
import com.squareup.cash.blockers.views.CalendarDatePickerKt$$ExternalSyntheticLambda21;
import com.squareup.cash.moneybot.widgets.ComposerKt$$ExternalSyntheticLambda12;
import com.squareup.cash.offers.views.home.OffersHomeV2Kt$$ExternalSyntheticLambda9;
import com.squareup.cash.pools.views.StartPoolAmountKt$$ExternalSyntheticLambda9;
import com.squareup.cash.tax.views.TaxTooltipView$Content$1$1$1;
import com.squareup.cash.wallet.views.CardLockViewKt$$ExternalSyntheticLambda2;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.Size$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.reflect.full.KClasses$$Lambda$2;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.brotli.dec.HuffmanTreeGroup;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public abstract class SimpleLayoutKt {
    public static AndroidCanvas canvas;
    public static CanvasDrawScope canvasDrawScope;
    public static AndroidImageBitmap imageBitmap;
    public static final Rect invertedInfiniteRect = new Rect(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static final void HandlePopup(OffsetProvider offsetProvider, Alignment alignment, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1090171650);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? gapComposer.changed(offsetProvider) : gapComposer.changedInstance(offsetProvider) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(alignment) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 256 : 128;
        }
        boolean z = true;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32;
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !gapComposer.changed(offsetProvider))) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z3 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new HandlePositionProvider(alignment, offsetProvider);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            AndroidPopup_androidKt.Popup((HandlePositionProvider) rememberedValue, null, new PopupProperties(false, SecureFlagPolicy.Inherit, false), composableLambdaImpl, gapComposer, ((i2 << 3) & 7168) | MLKEMEngine.KyberPolyBytes, 2);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda8(offsetProvider, alignment, composableLambdaImpl, i, 8);
        }
    }

    public static final void SelectionContainer(Modifier modifier, Selection selection, Function1 function1, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-917932944);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(selection) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 2048 : 1024;
        }
        int i4 = 0;
        int i5 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Object[] objArr = new Object[0];
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new Size$$ExternalSyntheticLambda0(26);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SelectionRegistrarImpl selectionRegistrarImpl = (SelectionRegistrarImpl) SaverKt.m581rememberSaveable(objArr, (Saver) SelectionRegistrarImpl.Saver, (Function0) rememberedValue, (Composer) gapComposer, MLKEMEngine.KyberPolyBytes);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new SelectionManager(selectionRegistrarImpl);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            SelectionManager selectionManager = (SelectionManager) rememberedValue2;
            AndroidClipboard androidClipboard = (AndroidClipboard) gapComposer.consume(CompositionLocalsKt.LocalClipboard);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            CoroutineScope coroutineScope = (CoroutineScope) rememberedValue3;
            selectionManager.hapticFeedBack = (PlatformHapticFeedback) gapComposer.consume(CompositionLocalsKt.LocalHapticFeedback);
            boolean changed = gapComposer.changed(coroutineScope) | gapComposer.changed(androidClipboard);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changed || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new Navigator$$ExternalSyntheticLambda0(7, coroutineScope, androidClipboard);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            selectionManager.onCopyHandler = (Function1) rememberedValue4;
            selectionManager.onSelectionChange = new Navigator$$ExternalSyntheticLambda0(8, selectionManager, function1);
            selectionManager.setSelection(selection);
            gapComposer.startReplaceGroup(-82280708);
            selectionManager.platformSelectionBehaviors = PlatformSelectionBehaviors_androidKt.rememberPlatformSelectionBehaviors(SelectedTextType.StaticText, null, gapComposer, 54);
            selectionManager.coroutineScope = coroutineScope;
            gapComposer.end(false);
            selectionManager.isNonEmptySelection$foundation();
            SelectionManager$$ExternalSyntheticLambda0 selectionManager$$ExternalSyntheticLambda0 = new SelectionManager$$ExternalSyntheticLambda0(selectionManager, i4);
            Unit unit = Unit.INSTANCE;
            LocalViewFactory$createUi$view$3$1$1$1 localViewFactory$createUi$view$3$1$1$1 = new LocalViewFactory$createUi$view$3$1$1$1(i3, selectionManager, selectionManager$$ExternalSyntheticLambda0);
            Modifier modifier2 = Modifier.Companion.$$INSTANCE;
            Modifier onKeyEvent = KeyEventType.onKeyEvent(SuspendingPointerInputFilterKt.pointerInput(CanvasKt.focusable(FocusOwnerImplKt.onFocusChanged(FocusTraversalKt.focusRequester(ValueInsets.onGloballyPositioned(SuspendingPointerInputFilterKt.pointerInput(modifier2, unit, localViewFactory$createUi$view$3$1$1$1), new SelectionManager$$ExternalSyntheticLambda1(selectionManager, i4)), selectionManager.focusRequester), new SelectionManager$$ExternalSyntheticLambda1(selectionManager, 5)), true, null), 8675309, new TaxTooltipView$Content$1$1$1(i5, new SelectionManager$$ExternalSyntheticLambda1(selectionManager, 6))), new KClasses$$Lambda$2(selectionManager, 3));
            if (selectionManager.getDraggingHandle() != null && selectionManager.isInTouchMode()) {
                Selection selection2 = selectionManager.getSelection();
                if (!(selection2 == null ? true : Intrinsics.areEqual(selection2.start, selection2.end))) {
                    SemanticsPropertyKey semanticsPropertyKey = Magnifier_androidKt.MagnifierPositionInRoot;
                    modifier2 = PlatformKt.composed(modifier2, new SliderDefaults$$ExternalSyntheticLambda3(selectionManager, i3));
                }
            }
            SimpleLayout(modifier.then(TextContextMenuGesturesModifierKt.addTextContextMenuComponentsWithContext(onKeyEvent.then(modifier2), new HintHandler$$ExternalSyntheticLambda0(selectionManager, 11))), Expect_jvmKt.rememberComposableLambda(-1799563674, new SelectionContainerKt$$ExternalSyntheticLambda4(selectionManager, selectionRegistrarImpl, composableLambdaImpl), gapComposer), gapComposer, 48);
            boolean changedInstance = gapComposer.changedInstance(selectionManager);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue5 == neverEqualPolicy) {
                rememberedValue5 = new SelectionManager$$ExternalSyntheticLambda1(selectionManager, i5);
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            Updater.DisposableEffect(selectionManager, (Function1) rememberedValue5, gapComposer);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertDialogKt$$ExternalSyntheticLambda0(modifier, selection, function1, composableLambdaImpl, i, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d3, code lost:
    
        if (r21 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00d9, code lost:
    
        if (r21 != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00e2, code lost:
    
        if (r21 == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00e8, code lost:
    
        if (r21 != false) goto L83;
     */
    /* renamed from: SelectionHandle-wLIcFTc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m447SelectionHandlewLIcFTc(final OffsetProvider offsetProvider, final boolean z, final ResolvedTextDirection resolvedTextDirection, final boolean z2, long j, final float f, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        long j2;
        long j3;
        boolean z3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-466280168);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? gapComposer.changed(offsetProvider) : gapComposer.changedInstance(offsetProvider) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changed(z) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(resolvedTextDirection.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changed(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            j2 = j;
            i3 |= ((i2 & 16) == 0 && gapComposer.changed(j2)) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            j2 = j;
        }
        if ((1572864 & i) == 0) {
            i3 |= gapComposer.changed(modifier) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        int i4 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (533651 & i3) != 533650)) {
            gapComposer.startDefaults();
            if ((i & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
            } else if ((i2 & 16) != 0) {
                i3 &= -57345;
                j2 = 9205357640488583168L;
            }
            gapComposer.endDefaults();
            if (z) {
                SemanticsPropertyKey semanticsPropertyKey = SelectionHandlesKt.SelectionHandleInfoKey;
                if (resolvedTextDirection == ResolvedTextDirection.Ltr) {
                }
                if (resolvedTextDirection == ResolvedTextDirection.Rtl) {
                }
                z3 = false;
            } else {
                SemanticsPropertyKey semanticsPropertyKey2 = SelectionHandlesKt.SelectionHandleInfoKey;
                if (resolvedTextDirection == ResolvedTextDirection.Ltr) {
                }
                if (resolvedTextDirection == ResolvedTextDirection.Rtl) {
                }
                z3 = true;
            }
            BiasAbsoluteAlignment biasAbsoluteAlignment = z3 ? ZIndexModifierKt.TopRight : ZIndexModifierKt.TopLeft;
            int i5 = i3 & 14;
            boolean changed = ((i3 & 112) == 32) | (i5 == 4 || ((i3 & 8) != 0 && gapComposer.changedInstance(offsetProvider))) | gapComposer.changed(z3);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CalendarDatePickerKt$$ExternalSyntheticLambda21(i4, offsetProvider, z, z3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            long j4 = j2;
            boolean z4 = z3;
            j3 = j4;
            HandlePopup(offsetProvider, biasAbsoluteAlignment, Expect_jvmKt.rememberComposableLambda(1365123137, new AvatarKt$$ExternalSyntheticLambda11((ViewConfiguration) gapComposer.consume(CompositionLocalsKt.LocalViewConfiguration), j3, z4, SemanticsModifierKt.semantics(modifier, false, (Function1) rememberedValue), offsetProvider), gapComposer), gapComposer, i5 | MLKEMEngine.KyberPolyBytes);
        } else {
            gapComposer.skipToGroupEnd();
            j3 = j2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final long j5 = j3;
            endRestartGroup.block = new Function2() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    SimpleLayoutKt.m447SelectionHandlewLIcFTc(OffsetProvider.this, z, resolvedTextDirection, z2, j5, f, modifier, (Composer) obj, Updater.updateChangedFlags(i | 1), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void SelectionHandleIcon(int i, Composer composer, Modifier modifier, Function0 function0, boolean z) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2111672474);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (gapComposer.changedInstance(function0) ? 32 : 16) | (gapComposer.changed(z) ? 256 : 128);
        int i4 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            SemanticsPropertyKey semanticsPropertyKey = SelectionHandlesKt.SelectionHandleInfoKey;
            SpacerKt.Spacer(gapComposer, PlatformKt.composed(SizeKt.m287sizeVpY3zN4(modifier, 25.0f, 25.0f), new StartPoolAmountKt$$ExternalSyntheticLambda9(function0, z, i4)));
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ComposerKt$$ExternalSyntheticLambda12(modifier, function0, z, i);
        }
    }

    public static final void SimpleLayout(Modifier modifier, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1854833411);
        int i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = SimpleLayoutKt$SimpleLayout$1$1.INSTANCE;
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, measurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Recorder$$ExternalSyntheticOutline2.m(6, composableLambdaImpl, gapComposer, true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SimpleLayoutKt$$ExternalSyntheticLambda0(modifier, composableLambdaImpl, i, i3);
        }
    }

    public static final void TextFieldSelectionHandle(final boolean z, ResolvedTextDirection resolvedTextDirection, final TextFieldSelectionManager textFieldSelectionManager, Composer composer, int i) {
        int i2;
        TextLayoutResultProxy layoutResult;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1344558920);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(resolvedTextDirection.ordinal()) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(textFieldSelectionManager) ? 256 : 128;
        }
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            int i4 = i2 & 14;
            boolean changed = (i4 == 4) | gapComposer.changed(textFieldSelectionManager);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new SelectionManager$handleDragObserver$1(textFieldSelectionManager, z);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            TextDragObserver textDragObserver = (TextDragObserver) rememberedValue;
            boolean changedInstance = gapComposer.changedInstance(textFieldSelectionManager) | (i4 == 4);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new OffsetProvider() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$1$1
                    @Override // androidx.compose.foundation.text.selection.OffsetProvider
                    /* renamed from: provide-F1C5BW0 */
                    public final long mo345provideF1C5BW0() {
                        return TextFieldSelectionManager.this.m458getHandlePositiontuRUvjQ$foundation(z);
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            OffsetProvider offsetProvider = (OffsetProvider) rememberedValue2;
            boolean m991getReversedimpl = TextRange.m991getReversedimpl(textFieldSelectionManager.getValue$foundation().selection);
            int i5 = (int) (z ? textFieldSelectionManager.getValue$foundation().selection >> 32 : textFieldSelectionManager.getValue$foundation().selection & BodyPartID.bodyIdMax);
            LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.state;
            float lineHeight = (legacyTextFieldState == null || (layoutResult = legacyTextFieldState.getLayoutResult()) == null) ? RecyclerView.DECELERATION_RATE : KeyMappingKt.getLineHeight(layoutResult.value, i5);
            boolean changedInstance2 = gapComposer.changedInstance(textDragObserver);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new SelectionContainerKt$SelectionContainer$5$1$1$1$1$1$1(textDragObserver, i3);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            m447SelectionHandlewLIcFTc(offsetProvider, z, resolvedTextDirection, m991getReversedimpl, 0L, lineHeight, SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion.$$INSTANCE, textDragObserver, (PointerInputEventHandler) rememberedValue3), gapComposer, (i2 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION, 16);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CardLockViewKt$$ExternalSyntheticLambda2(z, resolvedTextDirection, textFieldSelectionManager, i, 2);
        }
    }

    public static final Selection access$adjustToBoundaries(SelectionLayout selectionLayout, SelectionAdjustment$Companion selectionAdjustment$Companion) {
        boolean z = selectionLayout.getCrossStatus() == CrossStatus.CROSSED;
        return new Selection(anchorOnBoundary(selectionLayout.getStartInfo(), z, true, selectionLayout.getStartSlot(), selectionAdjustment$Companion), anchorOnBoundary(selectionLayout.getEndInfo(), z, false, selectionLayout.getEndSlot(), selectionAdjustment$Companion), z);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:10:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$awaitDown(SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine, BaseContinuationImpl baseContinuationImpl) {
        SelectionGesturesKt$awaitDown$1 selectionGesturesKt$awaitDown$1;
        int i;
        int size;
        int i2;
        if (baseContinuationImpl instanceof SelectionGesturesKt$awaitDown$1) {
            selectionGesturesKt$awaitDown$1 = (SelectionGesturesKt$awaitDown$1) baseContinuationImpl;
            int i3 = selectionGesturesKt$awaitDown$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                selectionGesturesKt$awaitDown$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = selectionGesturesKt$awaitDown$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectionGesturesKt$awaitDown$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    PointerEventPass pointerEventPass = PointerEventPass.Main;
                    selectionGesturesKt$awaitDown$1.L$0 = pointerEventHandlerCoroutine;
                    selectionGesturesKt$awaitDown$1.label = 1;
                    obj = pointerEventHandlerCoroutine.awaitPointerEvent(pointerEventPass, selectionGesturesKt$awaitDown$1);
                    if (obj == coroutineSingletons) {
                    }
                    PointerEvent pointerEvent = (PointerEvent) obj;
                    List list = pointerEvent.changes;
                    size = list.size();
                    i2 = 0;
                    while (i2 < size) {
                    }
                    return pointerEvent;
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pointerEventHandlerCoroutine = selectionGesturesKt$awaitDown$1.L$0;
                SafeTrace.throwOnFailure(obj);
                PointerEvent pointerEvent2 = (PointerEvent) obj;
                List list2 = pointerEvent2.changes;
                size = list2.size();
                i2 = 0;
                while (i2 < size) {
                    if (PointerEventKt.changedToDown((PointerInputChange) list2.get(i2))) {
                        i2++;
                    } else {
                        PointerEventPass pointerEventPass2 = PointerEventPass.Main;
                        selectionGesturesKt$awaitDown$1.L$0 = pointerEventHandlerCoroutine;
                        selectionGesturesKt$awaitDown$1.label = 1;
                        obj = pointerEventHandlerCoroutine.awaitPointerEvent(pointerEventPass2, selectionGesturesKt$awaitDown$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        PointerEvent pointerEvent22 = (PointerEvent) obj;
                        List list22 = pointerEvent22.changes;
                        size = list22.size();
                        i2 = 0;
                        while (i2 < size) {
                        }
                    }
                }
                return pointerEvent22;
            }
        }
        selectionGesturesKt$awaitDown$1 = new SelectionGesturesKt$awaitDown$1(baseContinuationImpl);
        Object obj2 = selectionGesturesKt$awaitDown$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectionGesturesKt$awaitDown$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c3, code lost:
    
        if (r14 == r1) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093 A[Catch: CancellationException -> 0x0030, TryCatch #0 {CancellationException -> 0x0030, blocks: (B:12:0x002b, B:13:0x00c6, B:15:0x00ce, B:17:0x00de, B:19:0x00ea, B:21:0x00ed, B:24:0x00f0, B:28:0x00f4, B:35:0x008f, B:37:0x0093, B:38:0x0095, B:40:0x0099, B:42:0x009f, B:44:0x00a3, B:46:0x00a9, B:48:0x00ad, B:49:0x00b2, B:58:0x004f, B:60:0x005d, B:61:0x0062, B:64:0x0060), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0099 A[Catch: CancellationException -> 0x0030, TryCatch #0 {CancellationException -> 0x0030, blocks: (B:12:0x002b, B:13:0x00c6, B:15:0x00ce, B:17:0x00de, B:19:0x00ea, B:21:0x00ed, B:24:0x00f0, B:28:0x00f4, B:35:0x008f, B:37:0x0093, B:38:0x0095, B:40:0x0099, B:42:0x009f, B:44:0x00a3, B:46:0x00a9, B:48:0x00ad, B:49:0x00b2, B:58:0x004f, B:60:0x005d, B:61:0x0062, B:64:0x0060), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f A[Catch: CancellationException -> 0x0030, TryCatch #0 {CancellationException -> 0x0030, blocks: (B:12:0x002b, B:13:0x00c6, B:15:0x00ce, B:17:0x00de, B:19:0x00ea, B:21:0x00ed, B:24:0x00f0, B:28:0x00f4, B:35:0x008f, B:37:0x0093, B:38:0x0095, B:40:0x0099, B:42:0x009f, B:44:0x00a3, B:46:0x00a9, B:48:0x00ad, B:49:0x00b2, B:58:0x004f, B:60:0x005d, B:61:0x0062, B:64:0x0060), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$touchSelectionSubsequentPress(SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine, TextDragObserver textDragObserver, PointerEvent pointerEvent, int i, BaseContinuationImpl baseContinuationImpl) {
        SelectionGesturesKt$touchSelectionSubsequentPress$1 selectionGesturesKt$touchSelectionSubsequentPress$1;
        int i2;
        long j;
        Ref$LongRef ref$LongRef;
        DownResolution downResolution;
        try {
            if (baseContinuationImpl instanceof SelectionGesturesKt$touchSelectionSubsequentPress$1) {
                selectionGesturesKt$touchSelectionSubsequentPress$1 = (SelectionGesturesKt$touchSelectionSubsequentPress$1) baseContinuationImpl;
                int i3 = selectionGesturesKt$touchSelectionSubsequentPress$1.label;
                if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                    selectionGesturesKt$touchSelectionSubsequentPress$1.label = i3 - PKIFailureInfo.systemUnavail;
                    Object obj = selectionGesturesKt$touchSelectionSubsequentPress$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = selectionGesturesKt$touchSelectionSubsequentPress$1.label;
                    int i4 = 2;
                    if (i2 != 0) {
                        SafeTrace.throwOnFailure(obj);
                        PointerInputChange pointerInputChange = (PointerInputChange) CollectionsKt.first(pointerEvent.changes);
                        j = pointerInputChange.id;
                        textDragObserver.mo367onStart3MmeM6k(pointerInputChange.position, i > 2 ? SelectionAdjustment$Companion.Paragraph : SelectionAdjustment$Companion.Word);
                        ref$LongRef = new Ref$LongRef();
                        ref$LongRef.element = 9205357640488583168L;
                        long longPressTimeoutMillis = pointerEventHandlerCoroutine.getViewConfiguration().getLongPressTimeoutMillis();
                        TapGestureDetectorKt$awaitSecondDown$2 tapGestureDetectorKt$awaitSecondDown$2 = new TapGestureDetectorKt$awaitSecondDown$2(j, ref$LongRef, null);
                        selectionGesturesKt$touchSelectionSubsequentPress$1.L$0 = pointerEventHandlerCoroutine;
                        selectionGesturesKt$touchSelectionSubsequentPress$1.L$1 = textDragObserver;
                        selectionGesturesKt$touchSelectionSubsequentPress$1.L$2 = ref$LongRef;
                        selectionGesturesKt$touchSelectionSubsequentPress$1.J$0 = j;
                        selectionGesturesKt$touchSelectionSubsequentPress$1.label = 1;
                        obj = pointerEventHandlerCoroutine.withTimeoutOrNull(longPressTimeoutMillis, tapGestureDetectorKt$awaitSecondDown$2, selectionGesturesKt$touchSelectionSubsequentPress$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            textDragObserver = selectionGesturesKt$touchSelectionSubsequentPress$1.L$1;
                            pointerEventHandlerCoroutine = selectionGesturesKt$touchSelectionSubsequentPress$1.L$0;
                            SafeTrace.throwOnFailure(obj);
                            if (((Boolean) obj).booleanValue()) {
                                List list = SuspendingPointerInputModifierNodeImpl.this.currentEvent.changes;
                                int size = list.size();
                                for (int i5 = 0; i5 < size; i5++) {
                                    PointerInputChange pointerInputChange2 = (PointerInputChange) list.get(i5);
                                    if (PointerEventKt.changedToUp(pointerInputChange2)) {
                                        pointerInputChange2.consume();
                                    }
                                }
                                textDragObserver.onStop();
                            } else {
                                textDragObserver.onCancel();
                            }
                            return Unit.INSTANCE;
                        }
                        long j2 = selectionGesturesKt$touchSelectionSubsequentPress$1.J$0;
                        ref$LongRef = selectionGesturesKt$touchSelectionSubsequentPress$1.L$2;
                        TextDragObserver textDragObserver2 = selectionGesturesKt$touchSelectionSubsequentPress$1.L$1;
                        SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine2 = selectionGesturesKt$touchSelectionSubsequentPress$1.L$0;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            j = j2;
                            textDragObserver = textDragObserver2;
                            pointerEventHandlerCoroutine = pointerEventHandlerCoroutine2;
                        } catch (CancellationException e) {
                            e = e;
                            textDragObserver = textDragObserver2;
                            textDragObserver.onCancel();
                            throw e;
                        }
                    }
                    downResolution = (DownResolution) obj;
                    if (downResolution == null) {
                        downResolution = DownResolution.Timeout;
                    }
                    if (downResolution != DownResolution.Cancel) {
                        textDragObserver.onCancel();
                        return Unit.INSTANCE;
                    }
                    if (downResolution == DownResolution.Up) {
                        textDragObserver.onStop();
                        return Unit.INSTANCE;
                    }
                    if (downResolution == DownResolution.Drag) {
                        textDragObserver.mo366onDragk4lQ0M(ref$LongRef.element);
                    }
                    LongPressTextDragObserverKt$$ExternalSyntheticLambda0 longPressTextDragObserverKt$$ExternalSyntheticLambda0 = new LongPressTextDragObserverKt$$ExternalSyntheticLambda0(textDragObserver, i4);
                    selectionGesturesKt$touchSelectionSubsequentPress$1.L$0 = pointerEventHandlerCoroutine;
                    selectionGesturesKt$touchSelectionSubsequentPress$1.L$1 = textDragObserver;
                    selectionGesturesKt$touchSelectionSubsequentPress$1.L$2 = null;
                    selectionGesturesKt$touchSelectionSubsequentPress$1.label = 2;
                    obj = DragGestureDetectorKt.m210dragjO51t88(pointerEventHandlerCoroutine, j, longPressTextDragObserverKt$$ExternalSyntheticLambda0, selectionGesturesKt$touchSelectionSubsequentPress$1);
                }
            }
            if (i2 != 0) {
            }
            downResolution = (DownResolution) obj;
            if (downResolution == null) {
            }
            if (downResolution != DownResolution.Cancel) {
            }
        } catch (CancellationException e2) {
            e = e2;
        }
        selectionGesturesKt$touchSelectionSubsequentPress$1 = new SelectionGesturesKt$touchSelectionSubsequentPress$1(baseContinuationImpl);
        Object obj2 = selectionGesturesKt$touchSelectionSubsequentPress$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = selectionGesturesKt$touchSelectionSubsequentPress$1.label;
        int i42 = 2;
    }

    public static final Selection.AnchorInfo access$updateSelectionBoundary(SelectionLayout selectionLayout, SelectableInfo selectableInfo, Selection.AnchorInfo anchorInfo) {
        int i = selectionLayout.isStartHandle() ? selectableInfo.rawStartHandleOffset : selectableInfo.rawEndHandleOffset;
        int startSlot = selectionLayout.isStartHandle() ? selectionLayout.getStartSlot() : selectionLayout.getEndSlot();
        int i2 = selectableInfo.slot;
        TextLayoutResult textLayoutResult = selectableInfo.textLayoutResult;
        int i3 = selectableInfo.rawPreviousHandleOffset;
        if (startSlot != i2) {
            return selectableInfo.anchorForOffset(i);
        }
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new q2$$ExternalSyntheticLambda8(selectableInfo, i, 2));
        Lazy lazy2 = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new OffersHomeV2Kt$$ExternalSyntheticLambda9(selectableInfo, i, selectionLayout.isStartHandle() ? selectableInfo.rawEndHandleOffset : selectableInfo.rawStartHandleOffset, selectionLayout, lazy));
        if (selectableInfo.selectableId != anchorInfo.selectableId) {
            return (Selection.AnchorInfo) lazy2.getValue();
        }
        if (i == i3) {
            return anchorInfo;
        }
        if (((Number) lazy.getValue()).intValue() != textLayoutResult.multiParagraph.getLineForOffset(i3)) {
            return (Selection.AnchorInfo) lazy2.getValue();
        }
        int i4 = anchorInfo.offset;
        long m978getWordBoundaryjx7JFs = textLayoutResult.m978getWordBoundaryjx7JFs(i4);
        boolean isStartHandle = selectionLayout.isStartHandle();
        if (i3 != -1) {
            if (i != i3) {
                if (!(isStartHandle ^ (selectableInfo.getRawCrossStatus() == CrossStatus.CROSSED))) {
                }
            }
            return selectableInfo.anchorForOffset(i);
        }
        int i5 = TextRange.$r8$clinit;
        return (i4 == ((int) (m978getWordBoundaryjx7JFs >> 32)) || i4 == ((int) (m978getWordBoundaryjx7JFs & BodyPartID.bodyIdMax))) ? (Selection.AnchorInfo) lazy2.getValue() : selectableInfo.anchorForOffset(i);
    }

    public static final Selection.AnchorInfo anchorOnBoundary(SelectableInfo selectableInfo, boolean z, boolean z2, int i, SelectionAdjustment$Companion selectionAdjustment$Companion) {
        long TextRange;
        long j;
        int i2 = z2 ? selectableInfo.rawStartHandleOffset : selectableInfo.rawEndHandleOffset;
        if (i != selectableInfo.slot) {
            return selectableInfo.anchorForOffset(i2);
        }
        switch (selectionAdjustment$Companion.$r8$classId) {
            case 1:
                String str = selectableInfo.textLayoutResult.layoutInput.text.text;
                TextRange = coil3.size.SizeKt.TextRange(KeyMappingKt.findParagraphStart(i2, str), KeyMappingKt.findParagraphEnd(i2, str));
                break;
            default:
                TextRange = selectableInfo.textLayoutResult.m978getWordBoundaryjx7JFs(i2);
                break;
        }
        if (z ^ z2) {
            int i3 = TextRange.$r8$clinit;
            j = TextRange >> 32;
        } else {
            int i4 = TextRange.$r8$clinit;
            j = BodyPartID.bodyIdMax & TextRange;
        }
        return selectableInfo.anchorForOffset((int) j);
    }

    public static final Direction appendSelectableInfo_Parwq6A$otherDirection(Direction direction, Direction direction2, SelectionLayoutBuilder selectionLayoutBuilder, long j, Selection.AnchorInfo anchorInfo) {
        if (anchorInfo == null) {
            return resolve2dDirection(direction, direction2);
        }
        int compare = selectionLayoutBuilder.selectableIdOrderingComparator.compare(Long.valueOf(anchorInfo.selectableId), Long.valueOf(j));
        return compare < 0 ? Direction.BEFORE : compare > 0 ? Direction.AFTER : Direction.ON;
    }

    public static final Object awaitSelectionGestures(PointerInputScope pointerInputScope, MouseSelectionObserver mouseSelectionObserver, TextDragObserver textDragObserver, Continuation continuation) {
        SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = (SuspendingPointerInputModifierNodeImpl) pointerInputScope;
        suspendingPointerInputModifierNodeImpl.getClass();
        Object awaitEachGesture = Draggable2DKt.awaitEachGesture(pointerInputScope, new LocalViewFactory$createUi$view$3$1$1$1.AnonymousClass1(new HuffmanTreeGroup(DepthSortedSetKt.requireLayoutNode(suspendingPointerInputModifierNodeImpl).viewConfiguration), mouseSelectionObserver, textDragObserver, null, 4), continuation);
        return awaitEachGesture == CoroutineSingletons.COROUTINE_SUSPENDED ? awaitEachGesture : Unit.INSTANCE;
    }

    public static final Selection.AnchorInfo changeOffset(Selection.AnchorInfo anchorInfo, SelectableInfo selectableInfo, int i) {
        return new Selection.AnchorInfo(selectableInfo.textLayoutResult.getBidiRunDirection(i), i, anchorInfo.selectableId);
    }

    /* renamed from: containsInclusive-Uv8p0NA, reason: not valid java name */
    public static final boolean m448containsInclusiveUv8p0NA(long j, Rect rect) {
        float f = rect.left;
        float f2 = rect.right;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        if (f > intBitsToFloat || intBitsToFloat > f2) {
            return false;
        }
        float f3 = rect.top;
        float f4 = rect.bottom;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
        return f3 <= intBitsToFloat2 && intBitsToFloat2 <= f4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        if (r1 <= r6.getHeight()) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final AndroidImageBitmap createHandleImage(CacheDrawScope cacheDrawScope, float f) {
        int ceil = ((int) Math.ceil(f)) * 2;
        AndroidImageBitmap androidImageBitmap = imageBitmap;
        AndroidCanvas androidCanvas = canvas;
        CanvasDrawScope canvasDrawScope2 = canvasDrawScope;
        if (androidImageBitmap != null && androidCanvas != null) {
            Bitmap bitmap = androidImageBitmap.bitmap;
            if (ceil <= bitmap.getWidth()) {
            }
        }
        androidImageBitmap = ColorKt.m683ImageBitmapx__hDU$default(ceil, ceil, 1);
        imageBitmap = androidImageBitmap;
        androidCanvas = ColorKt.Canvas(androidImageBitmap);
        canvas = androidCanvas;
        AndroidImageBitmap androidImageBitmap2 = androidImageBitmap;
        AndroidCanvas androidCanvas2 = androidCanvas;
        if (canvasDrawScope2 == null) {
            canvasDrawScope2 = new CanvasDrawScope();
            canvasDrawScope = canvasDrawScope2;
        }
        CanvasDrawScope canvasDrawScope3 = canvasDrawScope2;
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope3.drawParams;
        LayoutDirection layoutDirection = cacheDrawScope.cacheParams.getLayoutDirection();
        Bitmap bitmap2 = androidImageBitmap2.bitmap;
        float width = bitmap2.getWidth();
        float height = bitmap2.getHeight();
        long floatToRawIntBits = (Float.floatToRawIntBits(width) << 32) | (Float.floatToRawIntBits(height) & BodyPartID.bodyIdMax);
        Density density = drawParams.density;
        LayoutDirection layoutDirection2 = drawParams.layoutDirection;
        Canvas canvas2 = drawParams.canvas;
        long j = drawParams.size;
        drawParams.density = cacheDrawScope;
        drawParams.layoutDirection = layoutDirection;
        drawParams.canvas = androidCanvas2;
        drawParams.size = floatToRawIntBits;
        androidCanvas2.save();
        DrawScope.m747drawRectnJ9OG0$default(canvasDrawScope3, Color.Black, 0L, canvasDrawScope3.mo753getSizeNHjbRc(), RecyclerView.DECELERATION_RATE, null, null, 0, 58);
        DrawScope.m747drawRectnJ9OG0$default(canvasDrawScope3, ColorKt.Color(4278190080L), 0L, (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & BodyPartID.bodyIdMax), RecyclerView.DECELERATION_RATE, null, null, 0, 120);
        DrawScope.m738drawCircleVaOC9Bg$default(canvasDrawScope3, ColorKt.Color(4278190080L), f, (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & BodyPartID.bodyIdMax), null, 0, 120);
        androidCanvas2.restore();
        drawParams.density = density;
        drawParams.layoutDirection = layoutDirection2;
        drawParams.canvas = canvas2;
        drawParams.size = j;
        return androidImageBitmap2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0016, code lost:
    
        if (r2.offset == r5.offset) goto L4;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Selection ensureAtLeastOneChar(Selection selection, SelectionLayout selectionLayout) {
        boolean z;
        boolean z2 = false;
        z2 = false;
        if (selection != null) {
            Selection.AnchorInfo anchorInfo = selection.start;
            long j = anchorInfo.selectableId;
            Selection.AnchorInfo anchorInfo2 = selection.end;
            if (j != anchorInfo2.selectableId) {
                boolean z3 = selection.handlesCrossed;
                if ((z3 ? anchorInfo : anchorInfo2).offset == 0) {
                    if (z3) {
                        anchorInfo = anchorInfo2;
                    }
                    if (selectionLayout.getFirstInfo().textLayoutResult.layoutInput.text.text.length() == anchorInfo.offset) {
                        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                        ref$BooleanRef.element = true;
                        selectionLayout.forEachMiddleInfo(new SelectionLayoutKt$$ExternalSyntheticLambda0(ref$BooleanRef, z2 ? 1 : 0));
                        z = ref$BooleanRef.element;
                        if (!z) {
                            return selection;
                        }
                        String str = selectionLayout.getCurrentInfo().textLayoutResult.layoutInput.text.text;
                        if (selectionLayout.getSize() > 1 || selectionLayout.getPreviousSelection() == null || str.length() == 0) {
                            return selection;
                        }
                        SelectableInfo currentInfo = selectionLayout.getCurrentInfo();
                        String str2 = currentInfo.textLayoutResult.layoutInput.text.text;
                        int i = currentInfo.rawStartHandleOffset;
                        int length = str2.length();
                        if (i == 0) {
                            int findFollowingBreak = KeyMappingKt.findFollowingBreak(0, str2);
                            return selectionLayout.isStartHandle() ? Selection.copy$default(selection, changeOffset(selection.start, currentInfo, findFollowingBreak), null, true, 2) : Selection.copy$default(selection, null, changeOffset(selection.end, currentInfo, findFollowingBreak), false, 1);
                        }
                        if (i == length) {
                            int findPrecedingBreak = KeyMappingKt.findPrecedingBreak(length, str2);
                            return selectionLayout.isStartHandle() ? Selection.copy$default(selection, changeOffset(selection.start, currentInfo, findPrecedingBreak), null, false, 2) : Selection.copy$default(selection, null, changeOffset(selection.end, currentInfo, findPrecedingBreak), true, 1);
                        }
                        Selection previousSelection = selectionLayout.getPreviousSelection();
                        if (previousSelection != null && previousSelection.handlesCrossed) {
                            z2 = true;
                        }
                        int findPrecedingBreak2 = ((selectionLayout.isStartHandle() ? 1 : 0) ^ z2) != 0 ? KeyMappingKt.findPrecedingBreak(i, str2) : KeyMappingKt.findFollowingBreak(i, str2);
                        return selectionLayout.isStartHandle() ? Selection.copy$default(selection, changeOffset(selection.start, currentInfo, findPrecedingBreak2), null, z2, 2) : Selection.copy$default(selection, null, changeOffset(selection.end, currentInfo, findPrecedingBreak2), z2, 1);
                    }
                }
            }
            z = false;
            if (!z) {
            }
        }
        z = true;
        if (!z) {
        }
    }

    /* renamed from: getMagnifierCenter-JVtK1S4, reason: not valid java name */
    public static final long m449getMagnifierCenterJVtK1S4(SelectionManager selectionManager, long j, Selection.AnchorInfo anchorInfo) {
        LayoutCoordinates layoutCoordinates;
        int i;
        long TextRange;
        float f;
        MultiParagraph multiParagraph;
        int lineForOffset;
        float coerceIn;
        MultiParagraph multiParagraph2;
        int lineForOffset2;
        MultiParagraph multiParagraph3;
        int lineForOffset3;
        float lineBottom;
        MultiParagraph multiParagraph4;
        int lineForOffset4;
        MultiWidgetSelectionDelegate anchorSelectable$foundation = selectionManager.getAnchorSelectable$foundation(anchorInfo);
        if (anchorSelectable$foundation == null) {
            return 9205357640488583168L;
        }
        SelectionController$$ExternalSyntheticLambda0 selectionController$$ExternalSyntheticLambda0 = anchorSelectable$foundation.layoutResultCallback;
        LayoutCoordinates layoutCoordinates2 = selectionManager.containerLayoutCoordinates;
        if (layoutCoordinates2 == null || (layoutCoordinates = anchorSelectable$foundation.getLayoutCoordinates()) == null || (i = anchorInfo.offset) > anchorSelectable$foundation.getLastVisibleOffset()) {
            return 9205357640488583168L;
        }
        Offset offset = (Offset) selectionManager.currentDragPosition$delegate.getValue();
        offset.getClass();
        float intBitsToFloat = Float.intBitsToFloat((int) (layoutCoordinates.mo839localPositionOfR5De75A(layoutCoordinates2, offset.packedValue) >> 32));
        TextLayoutResult textLayoutResult = (TextLayoutResult) selectionController$$ExternalSyntheticLambda0.invoke();
        if (textLayoutResult == null) {
            TextRange = TextRange.Zero;
        } else {
            MultiParagraph multiParagraph5 = textLayoutResult.multiParagraph;
            int lastVisibleOffset = anchorSelectable$foundation.getLastVisibleOffset(textLayoutResult);
            if (lastVisibleOffset < 1) {
                TextRange = TextRange.Zero;
            } else {
                int lineForOffset5 = multiParagraph5.getLineForOffset(RangesKt___RangesKt.coerceIn(i, 0, lastVisibleOffset - 1));
                TextRange = coil3.size.SizeKt.TextRange(textLayoutResult.getLineStart(lineForOffset5), multiParagraph5.getLineEnd(lineForOffset5, true));
            }
        }
        if (TextRange.m987getCollapsedimpl(TextRange)) {
            TextLayoutResult textLayoutResult2 = (TextLayoutResult) selectionController$$ExternalSyntheticLambda0.invoke();
            coerceIn = (textLayoutResult2 != null && (lineForOffset4 = (multiParagraph4 = textLayoutResult2.multiParagraph).getLineForOffset(i)) < multiParagraph4.lineCount) ? textLayoutResult2.getLineLeft(lineForOffset4) : -1.0f;
            f = -1.0f;
        } else {
            f = -1.0f;
            int i2 = (int) (TextRange >> 32);
            TextLayoutResult textLayoutResult3 = (TextLayoutResult) selectionController$$ExternalSyntheticLambda0.invoke();
            float lineLeft = (textLayoutResult3 != null && (lineForOffset2 = (multiParagraph2 = textLayoutResult3.multiParagraph).getLineForOffset(i2)) < multiParagraph2.lineCount) ? textLayoutResult3.getLineLeft(lineForOffset2) : -1.0f;
            int i3 = ((int) (TextRange & BodyPartID.bodyIdMax)) - 1;
            TextLayoutResult textLayoutResult4 = (TextLayoutResult) selectionController$$ExternalSyntheticLambda0.invoke();
            float lineRight = (textLayoutResult4 != null && (lineForOffset = (multiParagraph = textLayoutResult4.multiParagraph).getLineForOffset(i3)) < multiParagraph.lineCount) ? textLayoutResult4.getLineRight(lineForOffset) : -1.0f;
            coerceIn = RangesKt___RangesKt.coerceIn(intBitsToFloat, Math.min(lineLeft, lineRight), Math.max(lineLeft, lineRight));
        }
        if (coerceIn == f) {
            return 9205357640488583168L;
        }
        if (!IntSize.m1055equalsimpl0(j, 0L) && Math.abs(intBitsToFloat - coerceIn) > ((int) (j >> 32)) / 2) {
            return 9205357640488583168L;
        }
        TextLayoutResult textLayoutResult5 = (TextLayoutResult) selectionController$$ExternalSyntheticLambda0.invoke();
        if (textLayoutResult5 != null && (lineForOffset3 = (multiParagraph3 = textLayoutResult5.multiParagraph).getLineForOffset(i)) < multiParagraph3.lineCount) {
            float lineTop = multiParagraph3.getLineTop(lineForOffset3);
            lineBottom = ((multiParagraph3.getLineBottom(lineForOffset3) - lineTop) / 2.0f) + lineTop;
        } else {
            lineBottom = f;
        }
        if (lineBottom == f) {
            return 9205357640488583168L;
        }
        return layoutCoordinates2.mo839localPositionOfR5De75A(layoutCoordinates, (Float.floatToRawIntBits(coerceIn) << 32) | (Float.floatToRawIntBits(lineBottom) & BodyPartID.bodyIdMax));
    }

    /* renamed from: getOffsetForPosition-3MmeM6k, reason: not valid java name */
    public static final int m450getOffsetForPosition3MmeM6k(long j, TextLayoutResult textLayoutResult) {
        int i = (int) (BodyPartID.bodyIdMax & j);
        if (Float.intBitsToFloat(i) <= RecyclerView.DECELERATION_RATE) {
            return 0;
        }
        float intBitsToFloat = Float.intBitsToFloat(i);
        MultiParagraph multiParagraph = textLayoutResult.multiParagraph;
        return intBitsToFloat >= multiParagraph.height ? textLayoutResult.layoutInput.text.text.length() : multiParagraph.m966getOffsetForPositionk4lQ0M(j);
    }

    public static final long getSelectionHandleCoordinates(TextLayoutResult textLayoutResult, int i, boolean z, boolean z2) {
        MultiParagraph multiParagraph = textLayoutResult.multiParagraph;
        long j = textLayoutResult.size;
        if (multiParagraph.getLineForOffset(i) >= multiParagraph.lineCount) {
            return 9205357640488583168L;
        }
        return (Float.floatToRawIntBits(RangesKt___RangesKt.coerceIn(textLayoutResult.getHorizontalPosition(i, textLayoutResult.getBidiRunDirection(((!z || z2) && (z || !z2)) ? Math.max(i + (-1), 0) : i) == multiParagraph.getParagraphDirection(i)), RecyclerView.DECELERATION_RATE, (int) (j >> 32))) << 32) | (Float.floatToRawIntBits(RangesKt___RangesKt.coerceIn(multiParagraph.getLineBottom(r3), RecyclerView.DECELERATION_RATE, (int) (j & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax);
    }

    public static final ResolvedTextDirection getTextDirectionForOffset(TextLayoutResult textLayoutResult, int i) {
        TextLayoutInput textLayoutInput = textLayoutResult.layoutInput;
        MultiParagraph multiParagraph = textLayoutResult.multiParagraph;
        if (textLayoutInput.text.text.length() != 0) {
            int lineForOffset = multiParagraph.getLineForOffset(i);
            if ((i != 0 && lineForOffset == multiParagraph.getLineForOffset(i - 1)) || (i != textLayoutInput.text.text.length() && lineForOffset == multiParagraph.getLineForOffset(i + 1))) {
                return textLayoutResult.getBidiRunDirection(i);
            }
        }
        return multiParagraph.getParagraphDirection(i);
    }

    /* renamed from: getTextFieldSelectionLayout-RcvT-LA, reason: not valid java name */
    public static final SingleSelectionLayout m451getTextFieldSelectionLayoutRcvTLA(TextLayoutResult textLayoutResult, int i, int i2, int i3, long j, boolean z, boolean z2) {
        Selection selection;
        if (z) {
            selection = null;
        } else {
            int i4 = TextRange.$r8$clinit;
            int i5 = (int) (j >> 32);
            Selection.AnchorInfo anchorInfo = new Selection.AnchorInfo(getTextDirectionForOffset(textLayoutResult, i5), i5, 1L);
            int i6 = (int) (BodyPartID.bodyIdMax & j);
            selection = new Selection(anchorInfo, new Selection.AnchorInfo(getTextDirectionForOffset(textLayoutResult, i6), i6, 1L), TextRange.m991getReversedimpl(j));
        }
        return new SingleSelectionLayout(z2, 1, 1, selection, new SelectableInfo(1L, 1, i, i2, i3, textLayoutResult));
    }

    public static boolean hasLegacyAssistItem$foundation(TextClassification textClassification) {
        if (textClassification.getIcon() == null && TextUtils.isEmpty(textClassification.getLabel())) {
            return false;
        }
        return (textClassification.getIntent() == null && textClassification.getOnClickListener() == null) ? false : true;
    }

    public static final boolean isSelectionHandleInVisibleBound(TextFieldSelectionManager textFieldSelectionManager, boolean z) {
        LayoutCoordinates layoutCoordinates;
        LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.state;
        if (legacyTextFieldState == null || (layoutCoordinates = legacyTextFieldState.getLayoutCoordinates()) == null) {
            return false;
        }
        return m448containsInclusiveUv8p0NA(textFieldSelectionManager.m458getHandlePositiontuRUvjQ$foundation(z), visibleBounds(layoutCoordinates));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0100 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:12:0x002f, B:13:0x00e5, B:15:0x00ed, B:17:0x00f1, B:19:0x0100, B:21:0x010c, B:62:0x00be), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f A[Catch: all -> 0x0046, TryCatch #1 {all -> 0x0046, blocks: (B:34:0x0042, B:35:0x0077, B:37:0x007f, B:39:0x008e, B:41:0x009a, B:52:0x0060), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object mouseSelection(SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine, MouseSelectionObserver mouseSelectionObserver, HuffmanTreeGroup huffmanTreeGroup, PointerEvent pointerEvent, BaseContinuationImpl baseContinuationImpl) {
        SelectionGesturesKt$mouseSelection$1 selectionGesturesKt$mouseSelection$1;
        int i;
        SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine2;
        Ref$BooleanRef ref$BooleanRef;
        int size;
        SelectionAdjustment$Companion$$ExternalSyntheticLambda0 selectionAdjustment$Companion$$ExternalSyntheticLambda0 = SelectionAdjustment$Companion.None;
        try {
            try {
                if (baseContinuationImpl instanceof SelectionGesturesKt$mouseSelection$1) {
                    selectionGesturesKt$mouseSelection$1 = (SelectionGesturesKt$mouseSelection$1) baseContinuationImpl;
                    int i2 = selectionGesturesKt$mouseSelection$1.label;
                    if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                        selectionGesturesKt$mouseSelection$1.label = i2 - PKIFailureInfo.systemUnavail;
                        Object obj = selectionGesturesKt$mouseSelection$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = selectionGesturesKt$mouseSelection$1.label;
                        int i3 = 0;
                        int i4 = 2;
                        if (i == 0) {
                            if (i == 1) {
                                mouseSelectionObserver = selectionGesturesKt$mouseSelection$1.L$1;
                                pointerEventHandlerCoroutine = selectionGesturesKt$mouseSelection$1.L$0;
                                SafeTrace.throwOnFailure(obj);
                                if (((Boolean) obj).booleanValue()) {
                                    List list = SuspendingPointerInputModifierNodeImpl.this.currentEvent.changes;
                                    int size2 = list.size();
                                    while (i3 < size2) {
                                        PointerInputChange pointerInputChange = (PointerInputChange) list.get(i3);
                                        if (PointerEventKt.changedToUp(pointerInputChange)) {
                                            pointerInputChange.consume();
                                        }
                                        i3++;
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                            if (i != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ref$BooleanRef = selectionGesturesKt$mouseSelection$1.L$2;
                            mouseSelectionObserver = selectionGesturesKt$mouseSelection$1.L$1;
                            pointerEventHandlerCoroutine2 = selectionGesturesKt$mouseSelection$1.L$0;
                            SafeTrace.throwOnFailure(obj);
                            if (((Boolean) obj).booleanValue() && ref$BooleanRef.element) {
                                List list2 = SuspendingPointerInputModifierNodeImpl.this.currentEvent.changes;
                                size = list2.size();
                                while (i3 < size) {
                                    PointerInputChange pointerInputChange2 = (PointerInputChange) list2.get(i3);
                                    if (PointerEventKt.changedToUp(pointerInputChange2)) {
                                        pointerInputChange2.consume();
                                    }
                                    i3++;
                                }
                            }
                            mouseSelectionObserver.onDragDone();
                            return Unit.INSTANCE;
                        }
                        SafeTrace.throwOnFailure(obj);
                        PointerInputChange pointerInputChange3 = (PointerInputChange) pointerEvent.changes.get(0);
                        if ((pointerEvent.keyboardModifiers & 1) != 0) {
                            if (mouseSelectionObserver.mo120onExtendk4lQ0M(pointerInputChange3.position)) {
                                pointerInputChange3.consume();
                                long j = pointerInputChange3.id;
                                CachedPageEventFlow$$ExternalSyntheticLambda0 cachedPageEventFlow$$ExternalSyntheticLambda0 = new CachedPageEventFlow$$ExternalSyntheticLambda0(mouseSelectionObserver, i4);
                                selectionGesturesKt$mouseSelection$1.L$0 = pointerEventHandlerCoroutine;
                                selectionGesturesKt$mouseSelection$1.L$1 = mouseSelectionObserver;
                                selectionGesturesKt$mouseSelection$1.label = 1;
                                obj = DragGestureDetectorKt.m210dragjO51t88(pointerEventHandlerCoroutine, j, cachedPageEventFlow$$ExternalSyntheticLambda0, selectionGesturesKt$mouseSelection$1);
                                if (obj == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                if (((Boolean) obj).booleanValue()) {
                                }
                            }
                            return Unit.INSTANCE;
                        }
                        int i5 = huffmanTreeGroup.alphabetSize;
                        SelectionAdjustment$Companion$$ExternalSyntheticLambda0 selectionAdjustment$Companion$$ExternalSyntheticLambda02 = i5 != 1 ? i5 != 2 ? SelectionAdjustment$Companion.Paragraph : SelectionAdjustment$Companion.Word : selectionAdjustment$Companion$$ExternalSyntheticLambda0;
                        if (mouseSelectionObserver.mo122onStart9KIMszo(pointerInputChange3.position, selectionAdjustment$Companion$$ExternalSyntheticLambda02, i5)) {
                            Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                            ref$BooleanRef2.element = !selectionAdjustment$Companion$$ExternalSyntheticLambda02.equals(selectionAdjustment$Companion$$ExternalSyntheticLambda0);
                            long j2 = pointerInputChange3.id;
                            MenuKt$$ExternalSyntheticLambda0 menuKt$$ExternalSyntheticLambda0 = new MenuKt$$ExternalSyntheticLambda0(15, mouseSelectionObserver, selectionAdjustment$Companion$$ExternalSyntheticLambda02, ref$BooleanRef2);
                            selectionGesturesKt$mouseSelection$1.L$0 = pointerEventHandlerCoroutine;
                            selectionGesturesKt$mouseSelection$1.L$1 = mouseSelectionObserver;
                            selectionGesturesKt$mouseSelection$1.L$2 = ref$BooleanRef2;
                            selectionGesturesKt$mouseSelection$1.label = 2;
                            obj = DragGestureDetectorKt.m210dragjO51t88(pointerEventHandlerCoroutine, j2, menuKt$$ExternalSyntheticLambda0, selectionGesturesKt$mouseSelection$1);
                            if (obj != coroutineSingletons) {
                                pointerEventHandlerCoroutine2 = pointerEventHandlerCoroutine;
                                ref$BooleanRef = ref$BooleanRef2;
                                if (((Boolean) obj).booleanValue()) {
                                    List list22 = SuspendingPointerInputModifierNodeImpl.this.currentEvent.changes;
                                    size = list22.size();
                                    while (i3 < size) {
                                    }
                                }
                                mouseSelectionObserver.onDragDone();
                            }
                            return coroutineSingletons;
                        }
                        return Unit.INSTANCE;
                    }
                }
                if (i == 0) {
                }
            } finally {
            }
        } finally {
        }
        selectionGesturesKt$mouseSelection$1 = new SelectionGesturesKt$mouseSelection$1(baseContinuationImpl);
        Object obj2 = selectionGesturesKt$mouseSelection$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectionGesturesKt$mouseSelection$1.label;
        int i32 = 0;
        int i42 = 2;
    }

    public static final Direction resolve2dDirection(Direction direction, Direction direction2) {
        int ordinal = direction2.ordinal();
        if (ordinal == 0) {
            return Direction.BEFORE;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                return Direction.AFTER;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        int ordinal2 = direction.ordinal();
        if (ordinal2 == 0) {
            return Direction.BEFORE;
        }
        if (ordinal2 == 1) {
            return Direction.ON;
        }
        if (ordinal2 == 2) {
            return Direction.AFTER;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static LocaleList toAndroidLocaleList(androidx.compose.ui.text.intl.LocaleList localeList) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(localeList, 10));
        Iterator it = localeList.localeList.iterator();
        while (it.hasNext()) {
            arrayList.add(((Locale) it.next()).platformLocale);
        }
        java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
        return new LocaleList((java.util.Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009e, code lost:
    
        if (r15 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067 A[Catch: CancellationException -> 0x0031, TryCatch #0 {CancellationException -> 0x0031, blocks: (B:12:0x002c, B:13:0x00a1, B:15:0x00a9, B:17:0x00b8, B:19:0x00c4, B:21:0x00c7, B:24:0x00ca, B:28:0x00ce, B:32:0x0040, B:34:0x0063, B:36:0x0067, B:40:0x0086, B:45:0x004a), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object touchSelectionFirstPress(SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine, TextDragObserver textDragObserver, PointerEvent pointerEvent, BaseContinuationImpl baseContinuationImpl) {
        SelectionGesturesKt$touchSelectionFirstPress$1 selectionGesturesKt$touchSelectionFirstPress$1;
        int i;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        try {
            if (baseContinuationImpl instanceof SelectionGesturesKt$touchSelectionFirstPress$1) {
                selectionGesturesKt$touchSelectionFirstPress$1 = (SelectionGesturesKt$touchSelectionFirstPress$1) baseContinuationImpl;
                int i2 = selectionGesturesKt$touchSelectionFirstPress$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    selectionGesturesKt$touchSelectionFirstPress$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = selectionGesturesKt$touchSelectionFirstPress$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = selectionGesturesKt$touchSelectionFirstPress$1.label;
                    int i3 = 1;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        pointerInputChange = (PointerInputChange) CollectionsKt.first(pointerEvent.changes);
                        long j = pointerInputChange.id;
                        selectionGesturesKt$touchSelectionFirstPress$1.L$0 = pointerEventHandlerCoroutine;
                        selectionGesturesKt$touchSelectionFirstPress$1.L$1 = textDragObserver;
                        selectionGesturesKt$touchSelectionFirstPress$1.L$2 = pointerInputChange;
                        selectionGesturesKt$touchSelectionFirstPress$1.label = 1;
                        obj = DragGestureDetectorKt.m207awaitLongPressOrCancellationrnUCldI(pointerEventHandlerCoroutine, j, selectionGesturesKt$touchSelectionFirstPress$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            textDragObserver = selectionGesturesKt$touchSelectionFirstPress$1.L$1;
                            pointerEventHandlerCoroutine = selectionGesturesKt$touchSelectionFirstPress$1.L$0;
                            SafeTrace.throwOnFailure(obj);
                            if (((Boolean) obj).booleanValue()) {
                                List list = SuspendingPointerInputModifierNodeImpl.this.currentEvent.changes;
                                int size = list.size();
                                for (int i4 = 0; i4 < size; i4++) {
                                    PointerInputChange pointerInputChange3 = (PointerInputChange) list.get(i4);
                                    if (PointerEventKt.changedToUp(pointerInputChange3)) {
                                        pointerInputChange3.consume();
                                    }
                                }
                                textDragObserver.onStop();
                            } else {
                                textDragObserver.onCancel();
                            }
                            return Unit.INSTANCE;
                        }
                        PointerInputChange pointerInputChange4 = selectionGesturesKt$touchSelectionFirstPress$1.L$2;
                        textDragObserver = selectionGesturesKt$touchSelectionFirstPress$1.L$1;
                        SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine2 = selectionGesturesKt$touchSelectionFirstPress$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        pointerInputChange = pointerInputChange4;
                        pointerEventHandlerCoroutine = pointerEventHandlerCoroutine2;
                    }
                    pointerInputChange2 = (PointerInputChange) obj;
                    if (pointerInputChange2 != null) {
                        long j2 = pointerInputChange2.position;
                        if (Offset.m623getDistanceimpl(Offset.m625minusMKHz9U(pointerInputChange.position, j2)) < DragGestureDetectorKt.m212pointerSlopE8SPZFQ(pointerEventHandlerCoroutine.getViewConfiguration(), pointerInputChange.f859type)) {
                            textDragObserver.mo367onStart3MmeM6k(j2, SelectionGestures_androidKt.FirstLongPressSelectionAdjustment);
                            long j3 = pointerInputChange2.id;
                            LongPressTextDragObserverKt$$ExternalSyntheticLambda0 longPressTextDragObserverKt$$ExternalSyntheticLambda0 = new LongPressTextDragObserverKt$$ExternalSyntheticLambda0(textDragObserver, i3);
                            selectionGesturesKt$touchSelectionFirstPress$1.L$0 = pointerEventHandlerCoroutine;
                            selectionGesturesKt$touchSelectionFirstPress$1.L$1 = textDragObserver;
                            selectionGesturesKt$touchSelectionFirstPress$1.L$2 = null;
                            selectionGesturesKt$touchSelectionFirstPress$1.label = 2;
                            obj = DragGestureDetectorKt.m210dragjO51t88(pointerEventHandlerCoroutine, j3, longPressTextDragObserverKt$$ExternalSyntheticLambda0, selectionGesturesKt$touchSelectionFirstPress$1);
                        }
                    }
                    return Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            pointerInputChange2 = (PointerInputChange) obj;
            if (pointerInputChange2 != null) {
            }
            return Unit.INSTANCE;
        } catch (CancellationException e) {
            textDragObserver.onCancel();
            throw e;
        }
        selectionGesturesKt$touchSelectionFirstPress$1 = new SelectionGesturesKt$touchSelectionFirstPress$1(baseContinuationImpl);
        Object obj2 = selectionGesturesKt$touchSelectionFirstPress$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectionGesturesKt$touchSelectionFirstPress$1.label;
        int i32 = 1;
    }

    public static final Rect visibleBounds(LayoutCoordinates layoutCoordinates) {
        Rect boundsInWindow = ValueInsets.boundsInWindow(layoutCoordinates, true);
        long mo847windowToLocalMKHz9U = layoutCoordinates.mo847windowToLocalMKHz9U(boundsInWindow.m636getTopLeftF1C5BW0());
        long mo847windowToLocalMKHz9U2 = layoutCoordinates.mo847windowToLocalMKHz9U(boundsInWindow.m632getBottomRightF1C5BW0());
        return new Rect(Float.intBitsToFloat((int) (mo847windowToLocalMKHz9U >> 32)), Float.intBitsToFloat((int) (mo847windowToLocalMKHz9U & BodyPartID.bodyIdMax)), Float.intBitsToFloat((int) (mo847windowToLocalMKHz9U2 >> 32)), Float.intBitsToFloat((int) (mo847windowToLocalMKHz9U2 & BodyPartID.bodyIdMax)));
    }

    public static final void SelectionContainer(Modifier modifier, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1949207773);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                modifier = Modifier.Companion.$$INSTANCE;
            }
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(null);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            Selection selection = (Selection) mutableState.getValue();
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new DateInputKt$$ExternalSyntheticLambda5(6, mutableState);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            int i5 = (i3 & 14) | 3456;
            Modifier modifier3 = modifier;
            SelectionContainer(modifier3, selection, (Function1) rememberedValue2, composableLambdaImpl, gapComposer, i5);
            modifier2 = modifier3;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ListOrderedKt$$ExternalSyntheticLambda11(i, i2, 4, composableLambdaImpl, modifier2);
        }
    }
}
