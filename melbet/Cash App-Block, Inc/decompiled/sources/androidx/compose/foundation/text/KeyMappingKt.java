package androidx.compose.foundation.text;

import android.text.Spanned;
import android.view.KeyEvent;
import androidx.camera.camera2.pipe.core.Threads$$ExternalSyntheticLambda1;
import androidx.camera.camera2.pipe.graph.GraphLoop$processingQueue$1;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.view.PreviewView;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ClickableKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.Magnifier_androidKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerDefaults$$ExternalSyntheticLambda0;
import androidx.compose.foundation.relocation.BringIntoViewRequesterImpl;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGesturesModifierKt;
import androidx.compose.foundation.text.handwriting.StylusHandwritingKt;
import androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter;
import androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifier;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter_androidKt;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1;
import androidx.compose.foundation.text.input.internal.MathUtilsKt;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.foundation.text.selection.PlatformSelectionBehaviors_androidKt;
import androidx.compose.foundation.text.selection.SelectedTextType;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextPreparedSelectionState;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material.MenuKt$$ExternalSyntheticLambda0;
import androidx.compose.material.MenuKt$$ExternalSyntheticLambda1;
import androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda0;
import androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda3;
import androidx.compose.material3.SliderKt$sliderTapModifier$1;
import androidx.compose.material3.TextKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Latch$await$2$2;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusOwnerImplKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;
import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidClipboard;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.platform.LazyWindowInfo;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.text.AndroidParagraph;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.ParagraphInfo;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.StringAnnotation;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.PlatformTextInputService;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.EmojiProcessor$EmojiProcessLookupCallback;
import androidx.emoji2.text.TypefaceEmojiSpan;
import androidx.media3.common.util.LongArrayQueue;
import androidx.paging.HintHandler$$ExternalSyntheticLambda0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.broadway.ui.compose.FullScreenKt$$ExternalSyntheticLambda0;
import app.cash.local.views.LocalViewFactory$createUi$view$3$1$1$1;
import app.cash.local.views.sheet.EducationalSheetKt$$ExternalSyntheticLambda8;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.b$$ExternalSyntheticLambda0;
import bo.app.c7$$ExternalSyntheticLambda6;
import bo.app.n3$$ExternalSyntheticLambda0;
import coil3.RealImageLoader$execute$result$1;
import coil3.gif.AnimatedImageDecoder$wrapDrawable$2;
import com.google.android.gms.dynamite.zzg;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.calendar.views.CalendarRowKt$$ExternalSyntheticLambda2;
import com.squareup.cash.db.SessionQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda12;
import com.squareup.cash.tax.views.TaxTooltipView$Content$1$1$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class KeyMappingKt {
    public static final int AltShift = 9;
    public static final int CtrlShift = 10;
    public static final int ShiftMeta = 12;
    public static final ComposableLambdaImpl lambda$759698998 = new ComposableLambdaImpl(new FullScreenKt$$ExternalSyntheticLambda0(2), false, 759698998);
    public static final ComposableLambdaImpl lambda$486633673 = new ComposableLambdaImpl(new FullScreenKt$$ExternalSyntheticLambda0(3), false, 486633673);
    public static final PreviewView.AnonymousClass1 defaultKeyMapping = new PreviewView.AnonymousClass1(new TextRangeLayoutMeasureScope(), false);

    /* JADX WARN: Code restructure failed: missing block: B:179:0x03b2, code lost:
    
        if (r1.fontFamilyResolver == r9) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x048b, code lost:
    
        if (r5 > ((r7 != null ? r7.longValue() : 0) + 5000)) goto L243;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:190:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x05a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x05ee A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0639 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x06f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0733 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0765  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0786 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x07aa  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x07be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x07df  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0823 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0862 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x08d3  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x08f5  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0902  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x07e2  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0779  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0428  */
    /* JADX WARN: Type inference failed for: r15v5, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r15v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v33, types: [androidx.compose.ui.Modifier] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CoreTextField(final TextFieldValue textFieldValue, final Function1 function1, final Modifier modifier, final TextStyle textStyle, final VisualTransformation visualTransformation, final Function1 function12, final MutableInteractionSourceImpl mutableInteractionSourceImpl, final Brush brush, final boolean z, final int i, final int i2, final ImeOptions imeOptions, final KeyboardActions keyboardActions, final boolean z2, final boolean z3, final Function3 function3, Composer composer, final int i3, final int i4) {
        int i5;
        int i6;
        GapComposer gapComposer;
        AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter;
        int i7;
        TextFieldScrollerPosition textFieldScrollerPosition;
        int i8;
        TransformedText transformedText;
        OffsetMapping offsetMapping;
        FocusOwnerImpl focusOwnerImpl;
        WindowInfo windowInfo;
        Object obj;
        boolean z4;
        Object legacyTextFieldState;
        AnnotatedString annotatedString;
        GapComposer gapComposer2;
        Density density;
        FontFamilyResolverImpl fontFamilyResolverImpl;
        TextStyle textStyle2;
        FocusOwnerImpl focusOwnerImpl2;
        boolean z5;
        boolean z6;
        TextFieldValue m1001copy3r_uNRQ$default;
        Object rememberedValue;
        Object obj2;
        UndoManager undoManager;
        Object rememberedValue2;
        Object rememberedValue3;
        Object rememberedValue4;
        int i9;
        int i10;
        ImeOptions imeOptions2;
        boolean z7;
        UndoManager undoManager2;
        boolean z8;
        boolean changedInstance;
        Object obj3;
        FocusRequester focusRequester;
        int i11;
        final LegacyTextFieldState legacyTextFieldState2;
        Object obj4;
        int i12;
        BringIntoViewRequesterImpl bringIntoViewRequesterImpl;
        OffsetMapping offsetMapping2;
        TextFieldSelectionManager textFieldSelectionManager;
        TextFieldValue textFieldValue2;
        CoroutineScope coroutineScope;
        boolean z9;
        ImeOptions imeOptions3;
        LegacyTextFieldState legacyTextFieldState3;
        boolean z10;
        boolean z11;
        Object realImageLoader$execute$result$1;
        TextFieldSelectionManager textFieldSelectionManager2;
        Unit unit;
        CoroutineScope coroutineScope2;
        OffsetMapping offsetMapping3;
        Modifier modifier2;
        LegacyTextFieldState legacyTextFieldState4;
        Modifier.Companion companion;
        FocusRequester focusRequester2;
        MutableInteractionSourceImpl mutableInteractionSourceImpl2;
        TextInputService textInputService;
        final TextFieldSelectionManager textFieldSelectionManager3;
        OffsetMapping offsetMapping4;
        int i13;
        Modifier then;
        WindowInfo windowInfo2;
        boolean changed;
        Object rememberedValue5;
        TextInputService textInputService2;
        WindowInfo windowInfo3;
        final LegacyTextFieldState legacyTextFieldState5;
        OffsetMapping offsetMapping5;
        Modifier.Companion companion2;
        boolean changedInstance2;
        Object rememberedValue6;
        boolean changedInstance3;
        Object rememberedValue7;
        ImeOptions imeOptions4;
        boolean z12;
        boolean changed2;
        Object rememberedValue8;
        boolean changedInstance4;
        Object rememberedValue9;
        int i14;
        Modifier modifier3;
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(31062401);
        if ((i3 & 6) == 0) {
            i5 = i3 | (gapComposer3.changed(textFieldValue) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= gapComposer3.changedInstance(function1) ? 32 : 16;
        }
        if ((i3 & MLKEMEngine.KyberPolyBytes) == 0) {
            i5 |= gapComposer3.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= gapComposer3.changed(textStyle) ? 2048 : 1024;
        }
        int i15 = i3 & 24576;
        int i16 = PKIFailureInfo.certRevoked;
        if (i15 == 0) {
            i5 |= gapComposer3.changed(visualTransformation) ? 16384 : 8192;
        }
        int i17 = i3 & 196608;
        int i18 = PKIFailureInfo.unsupportedVersion;
        if (i17 == 0) {
            i5 |= gapComposer3.changedInstance(function12) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= gapComposer3.changed(mutableInteractionSourceImpl) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= gapComposer3.changed(brush) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= gapComposer3.changed(z) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= gapComposer3.changed(i) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i4 & 6) == 0) {
            i6 = i4 | (gapComposer3.changed(i2) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= gapComposer3.changed(imeOptions) ? 32 : 16;
        }
        if ((i4 & MLKEMEngine.KyberPolyBytes) == 0) {
            i6 |= gapComposer3.changed(keyboardActions) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= gapComposer3.changed(z2) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            if (gapComposer3.changed(z3)) {
                i16 = 16384;
            }
            i6 |= i16;
        }
        if ((i4 & 196608) == 0) {
            if (!gapComposer3.changedInstance(function3)) {
                i18 = 65536;
            }
            i6 |= i18;
        }
        int i19 = i6 | 1572864;
        if (gapComposer3.shouldExecute(i5 & 1, ((i5 & 306783379) == 306783378 && (599187 & i19) == 599186) ? false : true)) {
            gapComposer3.startDefaults();
            if ((i3 & 1) != 0 && !gapComposer3.getDefaultsInvalid()) {
                gapComposer3.skipToGroupEnd();
            }
            gapComposer3.endDefaults();
            Object rememberedValue10 = gapComposer3.rememberedValue();
            Object obj5 = Composer.Companion.Empty;
            if (rememberedValue10 == obj5) {
                rememberedValue10 = Recorder$$ExternalSyntheticOutline2.m106m(gapComposer3);
            }
            FocusRequester focusRequester3 = (FocusRequester) rememberedValue10;
            Object rememberedValue11 = gapComposer3.rememberedValue();
            if (rememberedValue11 == obj5) {
                LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1 legacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1 = LegacyPlatformTextInputServiceAdapter_androidKt.inputMethodManagerFactory;
                rememberedValue11 = new AndroidLegacyPlatformTextInputServiceAdapter();
                gapComposer3.updateRememberedValue(rememberedValue11);
            }
            AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter2 = (AndroidLegacyPlatformTextInputServiceAdapter) rememberedValue11;
            Object rememberedValue12 = gapComposer3.rememberedValue();
            if (rememberedValue12 == obj5) {
                rememberedValue12 = new TextInputService(androidLegacyPlatformTextInputServiceAdapter2);
                gapComposer3.updateRememberedValue(rememberedValue12);
            }
            TextInputService textInputService3 = (TextInputService) rememberedValue12;
            Density density2 = (Density) gapComposer3.consume(CompositionLocalsKt.LocalDensity);
            FontFamilyResolverImpl fontFamilyResolverImpl2 = (FontFamilyResolverImpl) gapComposer3.consume(CompositionLocalsKt.LocalFontFamilyResolver);
            long j = ((TextSelectionColors) gapComposer3.consume(TextSelectionColorsKt.LocalTextSelectionColors)).backgroundColor;
            FocusOwnerImpl focusOwnerImpl3 = (FocusOwnerImpl) gapComposer3.consume(CompositionLocalsKt.LocalFocusManager);
            WindowInfo windowInfo4 = (WindowInfo) gapComposer3.consume(CompositionLocalsKt.LocalWindowInfo);
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer3.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            Orientation orientation = (i == 1 && !z && imeOptions.singleLine) ? Orientation.Horizontal : Orientation.Vertical;
            gapComposer3.startReplaceGroup(-213744626);
            Object[] objArr = {orientation};
            WorkLauncherImpl workLauncherImpl = TextFieldScrollerPosition.Saver;
            boolean changed3 = gapComposer3.changed(orientation.ordinal());
            Object rememberedValue13 = gapComposer3.rememberedValue();
            if (changed3 || rememberedValue13 == obj5) {
                androidLegacyPlatformTextInputServiceAdapter = androidLegacyPlatformTextInputServiceAdapter2;
                rememberedValue13 = new Threads$$ExternalSyntheticLambda1(orientation, 21);
                gapComposer3.updateRememberedValue(rememberedValue13);
            } else {
                androidLegacyPlatformTextInputServiceAdapter = androidLegacyPlatformTextInputServiceAdapter2;
            }
            TextFieldScrollerPosition textFieldScrollerPosition2 = (TextFieldScrollerPosition) SaverKt.m581rememberSaveable(objArr, (Saver) workLauncherImpl, (Function0) rememberedValue13, (Composer) gapComposer3, 0);
            gapComposer3.end(false);
            if (((Orientation) textFieldScrollerPosition2.orientation$delegate.getValue()) != orientation) {
                throw new IllegalArgumentException("Mismatching scroller orientation; ".concat(orientation == Orientation.Vertical ? "only single-line, non-wrap text fields can scroll horizontally" : "single-line, non-wrap text fields can only scroll horizontally"));
            }
            int i20 = i5 & 14;
            boolean z13 = ((i5 & 57344) == 16384) | (i20 == 4);
            Object rememberedValue14 = gapComposer3.rememberedValue();
            if (z13 || rememberedValue14 == obj5) {
                TransformedText filterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation, textFieldValue.annotatedString);
                OffsetMapping offsetMapping6 = filterWithValidation.offsetMapping;
                TextRange textRange = textFieldValue.composition;
                if (textRange != null) {
                    i7 = i20;
                    long j2 = textRange.packedValue;
                    int i21 = TextRange.$r8$clinit;
                    int originalToTransformed = offsetMapping6.originalToTransformed((int) (j2 >> 32));
                    int originalToTransformed2 = offsetMapping6.originalToTransformed((int) (j2 & BodyPartID.bodyIdMax));
                    int min = Math.min(originalToTransformed, originalToTransformed2);
                    int max = Math.max(originalToTransformed, originalToTransformed2);
                    AnnotatedString.Builder builder = new AnnotatedString.Builder(filterWithValidation.text);
                    builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Underline, (Shadow) null, 61439), min, max);
                    rememberedValue14 = new TransformedText(builder.toAnnotatedString(), offsetMapping6);
                } else {
                    i7 = i20;
                    rememberedValue14 = filterWithValidation;
                }
                gapComposer3.updateRememberedValue(rememberedValue14);
            } else {
                i7 = i20;
            }
            TransformedText transformedText2 = (TransformedText) rememberedValue14;
            AnnotatedString annotatedString2 = transformedText2.text;
            OffsetMapping offsetMapping7 = transformedText2.offsetMapping;
            RecomposeScopeImpl currentRecomposeScope$runtime = gapComposer3.getCurrentRecomposeScope$runtime();
            if (currentRecomposeScope$runtime == null) {
                a$$ExternalSyntheticBUOutline0.m$1("no recompose scope found");
                return;
            }
            currentRecomposeScope$runtime.flags |= 1;
            boolean changed4 = gapComposer3.changed(delegatingSoftwareKeyboardController);
            Object rememberedValue15 = gapComposer3.rememberedValue();
            if (changed4 || rememberedValue15 == obj5) {
                textFieldScrollerPosition = textFieldScrollerPosition2;
                i8 = i19;
                transformedText = transformedText2;
                offsetMapping = offsetMapping7;
                focusOwnerImpl = focusOwnerImpl3;
                windowInfo = windowInfo4;
                obj = obj5;
                z4 = z;
                annotatedString = annotatedString2;
                gapComposer2 = gapComposer3;
                density = density2;
                fontFamilyResolverImpl = fontFamilyResolverImpl2;
                textStyle2 = textStyle;
                legacyTextFieldState = new LegacyTextFieldState(new TextDelegate(annotatedString, textStyle2, z4, density, fontFamilyResolverImpl, EmptyList.INSTANCE), currentRecomposeScope$runtime, delegatingSoftwareKeyboardController);
                gapComposer2.updateRememberedValue(legacyTextFieldState);
            } else {
                obj = obj5;
                textFieldScrollerPosition = textFieldScrollerPosition2;
                i8 = i19;
                transformedText = transformedText2;
                offsetMapping = offsetMapping7;
                density = density2;
                focusOwnerImpl = focusOwnerImpl3;
                windowInfo = windowInfo4;
                z4 = z;
                legacyTextFieldState = rememberedValue15;
                annotatedString = annotatedString2;
                gapComposer2 = gapComposer3;
                fontFamilyResolverImpl = fontFamilyResolverImpl2;
                textStyle2 = textStyle;
            }
            LegacyTextFieldState legacyTextFieldState6 = (LegacyTextFieldState) legacyTextFieldState;
            AnnotatedString annotatedString3 = textFieldValue.annotatedString;
            ?? r15 = gapComposer2;
            long j3 = textFieldValue.selection;
            legacyTextFieldState6.onValueChangeOriginal = function1;
            legacyTextFieldState6.selectionBackgroundColor = j;
            KeyboardActionRunner keyboardActionRunner = legacyTextFieldState6.keyboardActionRunner;
            keyboardActionRunner.keyboardActions = keyboardActions;
            keyboardActionRunner.focusManager = focusOwnerImpl;
            legacyTextFieldState6.untransformedText = annotatedString3;
            TextDelegate textDelegate = legacyTextFieldState6.textDelegate;
            EmptyList emptyList = EmptyList.INSTANCE;
            if (Intrinsics.areEqual(textDelegate.text, annotatedString) && Intrinsics.areEqual(textDelegate.style, textStyle2) && textDelegate.softWrap == z4) {
                focusOwnerImpl2 = focusOwnerImpl;
                if (textDelegate.overflow == 1) {
                    if (textDelegate.maxLines == Integer.MAX_VALUE) {
                        if (textDelegate.minLines == 1) {
                            if (Intrinsics.areEqual(textDelegate.density, density)) {
                                if (Intrinsics.areEqual(textDelegate.placeholders, emptyList)) {
                                }
                            }
                        }
                    }
                }
            } else {
                focusOwnerImpl2 = focusOwnerImpl;
            }
            textDelegate = new TextDelegate(annotatedString, textStyle2, z4, density, fontFamilyResolverImpl, emptyList);
            TextStyle textStyle3 = textStyle2;
            final Density density3 = density;
            if (legacyTextFieldState6.textDelegate != textDelegate) {
                legacyTextFieldState6.isLayoutResultStale = true;
            }
            legacyTextFieldState6.textDelegate = textDelegate;
            Recorder.AnonymousClass1 anonymousClass1 = legacyTextFieldState6.processor;
            TextInputSession textInputSession = legacyTextFieldState6.inputSession;
            anonymousClass1.getClass();
            TextRange textRange2 = textFieldValue.composition;
            boolean areEqual = Intrinsics.areEqual(textRange2, ((LongArrayQueue) anonymousClass1.this$0).m1141getCompositionMzsxiRA$ui_text());
            String str = ((TextFieldValue) anonymousClass1.val$videoEncoderSession).annotatedString.text;
            AnnotatedString annotatedString4 = textFieldValue.annotatedString;
            if (!Intrinsics.areEqual(str, annotatedString4.text)) {
                anonymousClass1.this$0 = new LongArrayQueue(annotatedString4, j3);
                z5 = true;
            } else if (TextRange.m986equalsimpl0(((TextFieldValue) anonymousClass1.val$videoEncoderSession).selection, j3)) {
                z5 = false;
            } else {
                ((LongArrayQueue) anonymousClass1.this$0).setSelection$ui_text(TextRange.m990getMinimpl(j3), TextRange.m989getMaximpl(j3));
                z5 = false;
                z6 = true;
                if (textRange2 != null) {
                    LongArrayQueue longArrayQueue = (LongArrayQueue) anonymousClass1.this$0;
                    longArrayQueue.size = -1;
                    longArrayQueue.wrapAroundMask = -1;
                } else {
                    long j4 = textRange2.packedValue;
                    if (!TextRange.m987getCollapsedimpl(j4)) {
                        ((LongArrayQueue) anonymousClass1.this$0).setComposition$ui_text(TextRange.m990getMinimpl(j4), TextRange.m989getMaximpl(j4));
                    }
                }
                if (z5 && (z6 || areEqual)) {
                    m1001copy3r_uNRQ$default = textFieldValue;
                } else {
                    LongArrayQueue longArrayQueue2 = (LongArrayQueue) anonymousClass1.this$0;
                    longArrayQueue2.size = -1;
                    longArrayQueue2.wrapAroundMask = -1;
                    m1001copy3r_uNRQ$default = TextFieldValue.m1001copy3r_uNRQ$default(textFieldValue, (AnnotatedString) null, 0L, 3);
                }
                TextFieldValue textFieldValue3 = (TextFieldValue) anonymousClass1.val$videoEncoderSession;
                anonymousClass1.val$videoEncoderSession = m1001copy3r_uNRQ$default;
                if (textInputSession != null) {
                    textInputSession.updateState(textFieldValue3, m1001copy3r_uNRQ$default);
                }
                rememberedValue = r15.rememberedValue();
                obj2 = obj;
                if (rememberedValue == obj2) {
                    rememberedValue = new UndoManager();
                    r15.updateRememberedValue(rememberedValue);
                }
                undoManager = (UndoManager) rememberedValue;
                long currentTimeMillis = System.currentTimeMillis();
                if (!undoManager.forceNextSnapshot) {
                    Long l = undoManager.lastSnapshot;
                }
                undoManager.lastSnapshot = Long.valueOf(currentTimeMillis);
                undoManager.makeSnapshot(textFieldValue);
                rememberedValue2 = r15.rememberedValue();
                if (rememberedValue2 == obj2) {
                    rememberedValue2 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, r15);
                    r15.updateRememberedValue(rememberedValue2);
                }
                final CoroutineScope coroutineScope3 = (CoroutineScope) rememberedValue2;
                rememberedValue3 = r15.rememberedValue();
                if (rememberedValue3 == obj2) {
                    rememberedValue3 = new BringIntoViewRequesterImpl();
                    r15.updateRememberedValue(rememberedValue3);
                }
                final BringIntoViewRequesterImpl bringIntoViewRequesterImpl2 = (BringIntoViewRequesterImpl) rememberedValue3;
                rememberedValue4 = r15.rememberedValue();
                if (rememberedValue4 == obj2) {
                    rememberedValue4 = new TextFieldSelectionManager(undoManager);
                    r15.updateRememberedValue(rememberedValue4);
                }
                final TextFieldSelectionManager textFieldSelectionManager4 = (TextFieldSelectionManager) rememberedValue4;
                final OffsetMapping offsetMapping8 = offsetMapping;
                textFieldSelectionManager4.offsetMapping = offsetMapping8;
                textFieldSelectionManager4.onValueChange = legacyTextFieldState6.onValueChange;
                textFieldSelectionManager4.state = legacyTextFieldState6;
                textFieldSelectionManager4.valueState.setValue(textFieldValue);
                textFieldSelectionManager4.latestSelection = new TextRange(j3);
                textFieldSelectionManager4.clipboard = (AndroidClipboard) r15.consume(CompositionLocalsKt.LocalClipboard);
                textFieldSelectionManager4.coroutineScope = coroutineScope3;
                textFieldSelectionManager4.hapticFeedBack = (PlatformHapticFeedback) r15.consume(CompositionLocalsKt.LocalHapticFeedback);
                textFieldSelectionManager4.focusRequester = focusRequester3;
                final boolean z14 = !z3;
                textFieldSelectionManager4.editable$delegate.setValue(Boolean.valueOf(z14));
                textFieldSelectionManager4.enabled$delegate.setValue(Boolean.valueOf(z2));
                r15.startReplaceGroup(1966756105);
                textFieldSelectionManager4.platformSelectionBehaviors = PlatformSelectionBehaviors_androidKt.rememberPlatformSelectionBehaviors(SelectedTextType.EditableText, textStyle3.spanStyle.localeList, r15, 6);
                r15.end(false);
                legacyTextFieldState6.getHasFocus();
                i9 = i8;
                int i22 = i9 & 7168;
                final TextInputService textInputService4 = textInputService3;
                int i23 = i7;
                boolean changedInstance5 = (i22 != 2048) | r15.changedInstance(legacyTextFieldState6) | ((i9 & 57344) != 16384) | r15.changedInstance(textInputService4) | (i23 != 4);
                i10 = (i9 & 112) ^ 48;
                if (i10 <= 32) {
                    imeOptions2 = imeOptions;
                    if (r15.changed(imeOptions2)) {
                        z7 = changedInstance5;
                        undoManager2 = undoManager;
                        z8 = true;
                        changedInstance = z7 | z8 | r15.changedInstance(offsetMapping8) | r15.changedInstance(coroutineScope3) | r15.changedInstance(bringIntoViewRequesterImpl2) | r15.changedInstance(textFieldSelectionManager4);
                        Object rememberedValue16 = r15.rememberedValue();
                        if (!changedInstance || rememberedValue16 == obj2) {
                            final ImeOptions imeOptions5 = imeOptions2;
                            focusRequester = focusRequester3;
                            i11 = i23;
                            legacyTextFieldState2 = legacyTextFieldState6;
                            obj4 = obj2;
                            i12 = i22;
                            obj3 = new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj6) {
                                    TextLayoutResultProxy layoutResult;
                                    FocusStateImpl focusStateImpl = (FocusStateImpl) obj6;
                                    LegacyTextFieldState legacyTextFieldState7 = LegacyTextFieldState.this;
                                    if (legacyTextFieldState7.getHasFocus() == focusStateImpl.isFocused()) {
                                        return Unit.INSTANCE;
                                    }
                                    legacyTextFieldState7.hasFocus$delegate.setValue(Boolean.valueOf(focusStateImpl.isFocused()));
                                    boolean hasFocus = legacyTextFieldState7.getHasFocus();
                                    TextFieldValue textFieldValue4 = textFieldValue;
                                    OffsetMapping offsetMapping9 = offsetMapping8;
                                    if (hasFocus && z2 && !z3) {
                                        KeyMappingKt.startInputSession(textInputService4, legacyTextFieldState7, textFieldValue4, imeOptions5, offsetMapping9);
                                    } else {
                                        KeyMappingKt.endInputSession(legacyTextFieldState7);
                                    }
                                    if (focusStateImpl.isFocused() && (layoutResult = legacyTextFieldState7.getLayoutResult()) != null) {
                                        JobKt.launch$default(coroutineScope3, null, null, new RealImageLoader$execute$result$1(bringIntoViewRequesterImpl2, textFieldValue4, legacyTextFieldState7, layoutResult, offsetMapping9, null, 5), 3);
                                    }
                                    if (!focusStateImpl.isFocused()) {
                                        textFieldSelectionManager4.m456deselect_kEHs6E$foundation(null);
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            bringIntoViewRequesterImpl = bringIntoViewRequesterImpl2;
                            offsetMapping2 = offsetMapping8;
                            textFieldSelectionManager = textFieldSelectionManager4;
                            textFieldValue2 = textFieldValue;
                            coroutineScope = coroutineScope3;
                            z9 = z2;
                            textInputService4 = textInputService4;
                            imeOptions3 = imeOptions5;
                            r15.updateRememberedValue(obj3);
                        } else {
                            obj3 = rememberedValue16;
                            bringIntoViewRequesterImpl = bringIntoViewRequesterImpl2;
                            i11 = i23;
                            legacyTextFieldState2 = legacyTextFieldState6;
                            obj4 = obj2;
                            offsetMapping2 = offsetMapping8;
                            i12 = i22;
                            imeOptions3 = imeOptions2;
                            textFieldValue2 = textFieldValue;
                            focusRequester = focusRequester3;
                            textFieldSelectionManager = textFieldSelectionManager4;
                            coroutineScope = coroutineScope3;
                            z9 = z2;
                        }
                        Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
                        Modifier focusable = CanvasKt.focusable(FocusOwnerImplKt.onFocusChanged(FocusTraversalKt.focusRequester(companion3, focusRequester), (Function1) obj3), z9, mutableInteractionSourceImpl);
                        MutableState rememberUpdatedState = Updater.rememberUpdatedState(Boolean.valueOf((z9 || z3) ? false : true), r15);
                        Unit unit2 = Unit.INSTANCE;
                        boolean changed5 = r15.changed(rememberUpdatedState) | r15.changedInstance(legacyTextFieldState2) | r15.changedInstance(textInputService4) | r15.changedInstance(textFieldSelectionManager);
                        if (i10 > 32 || !r15.changed(imeOptions3)) {
                            legacyTextFieldState3 = legacyTextFieldState2;
                            if ((i9 & 48) != 32) {
                                z10 = false;
                                z11 = changed5 | z10;
                                Object rememberedValue17 = r15.rememberedValue();
                                if (!z11 || rememberedValue17 == obj4) {
                                    textFieldSelectionManager2 = textFieldSelectionManager;
                                    unit = unit2;
                                    coroutineScope2 = coroutineScope;
                                    offsetMapping3 = offsetMapping2;
                                    modifier2 = focusable;
                                    legacyTextFieldState4 = legacyTextFieldState3;
                                    companion = companion3;
                                    focusRequester2 = focusRequester;
                                    mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
                                    TextInputService textInputService5 = textInputService4;
                                    realImageLoader$execute$result$1 = new RealImageLoader$execute$result$1(legacyTextFieldState4, rememberUpdatedState, textInputService5, textFieldSelectionManager2, imeOptions, null, 4);
                                    textInputService = textInputService5;
                                    r15.updateRememberedValue(realImageLoader$execute$result$1);
                                } else {
                                    realImageLoader$execute$result$1 = rememberedValue17;
                                    coroutineScope2 = coroutineScope;
                                    unit = unit2;
                                    textFieldSelectionManager2 = textFieldSelectionManager;
                                    offsetMapping3 = offsetMapping2;
                                    modifier2 = focusable;
                                    legacyTextFieldState4 = legacyTextFieldState3;
                                    textInputService = textInputService4;
                                    companion = companion3;
                                    focusRequester2 = focusRequester;
                                    mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
                                }
                                Updater.LaunchedEffect((Composer) r15, unit, (Function2) realImageLoader$execute$result$1);
                                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, 8675309, new TaxTooltipView$Content$1$1$1(1, new CoreTextFieldKt$$ExternalSyntheticLambda2(legacyTextFieldState4, 4)));
                                textFieldSelectionManager3 = textFieldSelectionManager2;
                                offsetMapping4 = offsetMapping3;
                                TextFieldPointerModifier_commonKt$$ExternalSyntheticLambda1 textFieldPointerModifier_commonKt$$ExternalSyntheticLambda1 = new TextFieldPointerModifier_commonKt$$ExternalSyntheticLambda1(legacyTextFieldState4, focusRequester2, z3, z2, textFieldSelectionManager3, offsetMapping4);
                                if (z2) {
                                    i13 = 2;
                                    pointerInput = PlatformKt.composed(pointerInput, new PagerDefaults$$ExternalSyntheticLambda0(i13, textFieldPointerModifier_commonKt$$ExternalSyntheticLambda1, mutableInteractionSourceImpl2));
                                } else {
                                    i13 = 2;
                                }
                                Modifier pointerInput2 = SuspendingPointerInputFilterKt.pointerInput(pointerInput, textFieldSelectionManager3.mouseSelectionObserver, textFieldSelectionManager3.touchSelectionObserver, new SliderKt$sliderTapModifier$1(textFieldSelectionManager3, i13));
                                PointerIcon.Companion.getClass();
                                then = pointerInput2.then(new PointerHoverIconModifierElement(PointerId.pointerIconText));
                                final Modifier drawBehind = ClipKt.drawBehind(companion, new MenuKt$$ExternalSyntheticLambda0(7, legacyTextFieldState4, textFieldValue2, offsetMapping4));
                                boolean changedInstance6 = r15.changedInstance(legacyTextFieldState4) | (i12 == 2048);
                                windowInfo2 = windowInfo;
                                int i24 = i11;
                                changed = changedInstance6 | r15.changed(windowInfo2) | r15.changedInstance(textFieldSelectionManager3) | (i24 == 4) | r15.changedInstance(offsetMapping4);
                                rememberedValue5 = r15.rememberedValue();
                                if (!changed || rememberedValue5 == obj4) {
                                    LegacyTextFieldState legacyTextFieldState7 = legacyTextFieldState4;
                                    TextFieldValue textFieldValue4 = textFieldValue2;
                                    textInputService2 = textInputService;
                                    SessionQueries$$ExternalSyntheticLambda0 sessionQueries$$ExternalSyntheticLambda0 = new SessionQueries$$ExternalSyntheticLambda0(1, legacyTextFieldState7, windowInfo2, textFieldSelectionManager3, textFieldValue4, offsetMapping4, z2);
                                    legacyTextFieldState4 = legacyTextFieldState7;
                                    windowInfo3 = windowInfo2;
                                    r15.updateRememberedValue(sessionQueries$$ExternalSyntheticLambda0);
                                    rememberedValue5 = sessionQueries$$ExternalSyntheticLambda0;
                                } else {
                                    windowInfo3 = windowInfo2;
                                    textInputService2 = textInputService;
                                }
                                final Modifier onGloballyPositioned = ValueInsets.onGloballyPositioned(companion, (Function1) rememberedValue5);
                                LegacyTextFieldState legacyTextFieldState8 = legacyTextFieldState4;
                                TextInputService textInputService6 = textInputService2;
                                CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier = new CoreTextFieldSemanticsModifier(transformedText, textFieldValue, legacyTextFieldState8, z3, z2, offsetMapping4, textFieldSelectionManager3, imeOptions, focusRequester2);
                                legacyTextFieldState5 = legacyTextFieldState8;
                                if (!z2 && !z3 && ((LazyWindowInfo) windowInfo3).isWindowFocused() && TextRange.m987getCollapsedimpl(((TextRange) legacyTextFieldState5.selectionPreviewHighlightRange$delegate.getValue()).packedValue) && TextRange.m987getCollapsedimpl(((TextRange) legacyTextFieldState5.deletionPreviewHighlightRange$delegate.getValue()).packedValue)) {
                                    ComposeDialogKt$$ExternalSyntheticLambda12 composeDialogKt$$ExternalSyntheticLambda12 = new ComposeDialogKt$$ExternalSyntheticLambda12(brush, legacyTextFieldState5, textFieldValue, offsetMapping4, 2);
                                    legacyTextFieldState5 = legacyTextFieldState5;
                                    offsetMapping5 = offsetMapping4;
                                    companion2 = PlatformKt.composed(companion, composeDialogKt$$ExternalSyntheticLambda12);
                                } else {
                                    offsetMapping5 = offsetMapping4;
                                    companion2 = companion;
                                }
                                changedInstance2 = r15.changedInstance(textFieldSelectionManager3);
                                rememberedValue6 = r15.rememberedValue();
                                if (!changedInstance2 || rememberedValue6 == obj4) {
                                    rememberedValue6 = new CoreTextFieldKt$$ExternalSyntheticLambda8(textFieldSelectionManager3, 0);
                                    r15.updateRememberedValue(rememberedValue6);
                                }
                                Updater.DisposableEffect(textFieldSelectionManager3, (Function1) rememberedValue6, (Composer) r15);
                                changedInstance3 = r15.changedInstance(legacyTextFieldState5) | r15.changedInstance(textInputService6) | (i24 == 4) | ((i10 <= 32 && r15.changed(imeOptions)) || (i9 & 48) == 32);
                                rememberedValue7 = r15.rememberedValue();
                                if (!changedInstance3 || rememberedValue7 == obj4) {
                                    n3$$ExternalSyntheticLambda0 n3__externalsyntheticlambda0 = new n3$$ExternalSyntheticLambda0(legacyTextFieldState5, textInputService6, textFieldValue, imeOptions, 5);
                                    imeOptions4 = imeOptions;
                                    r15.updateRememberedValue(n3__externalsyntheticlambda0);
                                    rememberedValue7 = n3__externalsyntheticlambda0;
                                } else {
                                    imeOptions4 = imeOptions;
                                }
                                Updater.DisposableEffect(imeOptions4, (Function1) rememberedValue7, (Composer) r15);
                                final CoreTextFieldKt$$ExternalSyntheticLambda2 coreTextFieldKt$$ExternalSyntheticLambda2 = legacyTextFieldState5.onValueChange;
                                final boolean z15 = i == 1;
                                final OffsetMapping offsetMapping9 = offsetMapping5;
                                final int i25 = imeOptions4.imeAction;
                                final UndoManager undoManager3 = undoManager2;
                                Modifier composed = PlatformKt.composed(companion, new Function3() { // from class: androidx.compose.foundation.text.TextFieldKeyInputKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                        ((Integer) obj8).getClass();
                                        GapComposer gapComposer4 = (GapComposer) ((Composer) obj7);
                                        gapComposer4.startReplaceGroup(851809892);
                                        Object rememberedValue18 = gapComposer4.rememberedValue();
                                        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                                        if (rememberedValue18 == neverEqualPolicy) {
                                            rememberedValue18 = new TextPreparedSelectionState();
                                            gapComposer4.updateRememberedValue(rememberedValue18);
                                        }
                                        TextPreparedSelectionState textPreparedSelectionState = (TextPreparedSelectionState) rememberedValue18;
                                        Object rememberedValue19 = gapComposer4.rememberedValue();
                                        if (rememberedValue19 == neverEqualPolicy) {
                                            rememberedValue19 = new DeadKeyCombiner();
                                            gapComposer4.updateRememberedValue(rememberedValue19);
                                        }
                                        TextFieldKeyInput textFieldKeyInput = new TextFieldKeyInput(LegacyTextFieldState.this, textFieldSelectionManager3, textFieldValue, z14, z15, textPreparedSelectionState, offsetMapping9, undoManager3, (DeadKeyCombiner) rememberedValue19, coreTextFieldKt$$ExternalSyntheticLambda2, i25);
                                        boolean changedInstance7 = gapComposer4.changedInstance(textFieldKeyInput);
                                        Object rememberedValue20 = gapComposer4.rememberedValue();
                                        if (changedInstance7 || rememberedValue20 == neverEqualPolicy) {
                                            GraphLoop$processingQueue$1 graphLoop$processingQueue$1 = new GraphLoop$processingQueue$1(1, textFieldKeyInput, TextFieldKeyInput.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 2);
                                            gapComposer4.updateRememberedValue(graphLoop$processingQueue$1);
                                            rememberedValue20 = graphLoop$processingQueue$1;
                                        }
                                        Modifier onKeyEvent = KeyEventType.onKeyEvent(Modifier.Companion.$$INSTANCE, (Function1) ((KFunction) rememberedValue20));
                                        gapComposer4.end(false);
                                        return onKeyEvent;
                                    }
                                });
                                int i26 = imeOptions4.keyboardType;
                                z12 = (i26 == 7 || i26 == 8) ? false : true;
                                boolean booleanValue = ((Boolean) rememberUpdatedState.getValue()).booleanValue();
                                AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter3 = androidLegacyPlatformTextInputServiceAdapter;
                                changed2 = r15.changed(z12) | r15.changedInstance(androidLegacyPlatformTextInputServiceAdapter3);
                                rememberedValue8 = r15.rememberedValue();
                                if (!changed2 || rememberedValue8 == obj4) {
                                    rememberedValue8 = new b$$ExternalSyntheticLambda0(z12, androidLegacyPlatformTextInputServiceAdapter3, 1);
                                    r15.updateRememberedValue(rememberedValue8);
                                }
                                Modifier stylusHandwriting = StylusHandwritingKt.stylusHandwriting(companion, booleanValue, z12, (Function0) rememberedValue8);
                                Brush m344resolveAutofillHighlightWkMShQ = AutofillHighlightKt.m344resolveAutofillHighlightWkMShQ((Brush) r15.consume(AutofillHighlightKt.LocalAutofillHighlightBrush), ((Color) r15.consume(AutofillHighlightKt.LocalAutofillHighlightColor)).value, ColorKt.Color(1308617531));
                                changedInstance4 = r15.changedInstance(legacyTextFieldState5) | r15.changed(m344resolveAutofillHighlightWkMShQ);
                                rememberedValue9 = r15.rememberedValue();
                                if (!changedInstance4 || rememberedValue9 == obj4) {
                                    rememberedValue9 = new ClickableKt$$ExternalSyntheticLambda0(29, legacyTextFieldState5, m344resolveAutofillHighlightWkMShQ);
                                    r15.updateRememberedValue(rememberedValue9);
                                }
                                Modifier then2 = MathUtilsKt.legacyTextInputAdapter(modifier.then(ClipKt.drawWithContent(companion, (Function1) rememberedValue9)), androidLegacyPlatformTextInputServiceAdapter3, legacyTextFieldState5, textFieldSelectionManager3).then(stylusHandwriting).then(modifier2);
                                int i27 = 3;
                                final TextFieldScrollerPosition textFieldScrollerPosition3 = textFieldScrollerPosition;
                                Modifier addTextContextMenuComponentsWithContext = TextContextMenuGesturesModifierKt.addTextContextMenuComponentsWithContext(ValueInsets.onGloballyPositioned(PlatformKt.composed(KeyEventType.onPreviewKeyEvent(KeyEventType.onPreviewKeyEvent(then2, new Latch$await$2$2(i27, focusOwnerImpl2, legacyTextFieldState5)), new Latch$await$2$2(2, legacyTextFieldState5, textFieldSelectionManager3)).then(composed), new EducationalSheetKt$$ExternalSyntheticLambda8(textFieldScrollerPosition3, z2, mutableInteractionSourceImpl, 1)).then(then).then(coreTextFieldSemanticsModifier), new CoreTextFieldKt$$ExternalSyntheticLambda2(legacyTextFieldState5, 0)), new TextKt$$ExternalSyntheticLambda0(15, textFieldSelectionManager3, coroutineScope2));
                                i14 = (!z2 && legacyTextFieldState5.getHasFocus() && ((Boolean) legacyTextFieldState5.isInTouchMode$delegate.getValue()).booleanValue() && ((LazyWindowInfo) windowInfo3).isWindowFocused()) ? 1 : 0;
                                if (i14 == 0) {
                                    SemanticsPropertyKey semanticsPropertyKey = Magnifier_androidKt.MagnifierPositionInRoot;
                                    modifier3 = PlatformKt.composed(companion, new SliderDefaults$$ExternalSyntheticLambda3(textFieldSelectionManager3, i27));
                                } else {
                                    modifier3 = companion;
                                }
                                final Modifier modifier4 = modifier3;
                                final BringIntoViewRequesterImpl bringIntoViewRequesterImpl3 = bringIntoViewRequesterImpl;
                                final Modifier.Companion companion4 = companion2;
                                final LegacyTextFieldState legacyTextFieldState9 = legacyTextFieldState5;
                                final ?? r152 = i14;
                                Function2 function2 = new Function2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj6, Object obj7) {
                                        Composer composer2 = (Composer) obj6;
                                        int intValue = ((Integer) obj7).intValue();
                                        GapComposer gapComposer4 = (GapComposer) composer2;
                                        if (gapComposer4.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            final LegacyTextFieldState legacyTextFieldState10 = legacyTextFieldState9;
                                            final TextStyle textStyle4 = textStyle;
                                            final int i28 = i2;
                                            final int i29 = i;
                                            final TextFieldScrollerPosition textFieldScrollerPosition4 = textFieldScrollerPosition3;
                                            final TextFieldValue textFieldValue5 = textFieldValue;
                                            final VisualTransformation visualTransformation2 = visualTransformation;
                                            final Modifier modifier5 = companion4;
                                            final Modifier modifier6 = drawBehind;
                                            final Modifier modifier7 = onGloballyPositioned;
                                            final Modifier modifier8 = modifier4;
                                            final BringIntoViewRequesterImpl bringIntoViewRequesterImpl4 = bringIntoViewRequesterImpl3;
                                            final TextFieldSelectionManager textFieldSelectionManager5 = textFieldSelectionManager3;
                                            final boolean z16 = r152;
                                            final boolean z17 = z3;
                                            final Function1 function13 = function12;
                                            final OffsetMapping offsetMapping10 = offsetMapping9;
                                            final Density density4 = density3;
                                            Function3.this.invoke(Expect_jvmKt.rememberComposableLambda(-44346382, new Function2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda13
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj8, Object obj9) {
                                                    Modifier verticalScrollLayoutModifier;
                                                    Composer composer3 = (Composer) obj8;
                                                    int intValue2 = ((Integer) obj9).intValue();
                                                    GapComposer gapComposer5 = (GapComposer) composer3;
                                                    if (gapComposer5.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                                        LegacyTextFieldState legacyTextFieldState11 = LegacyTextFieldState.this;
                                                        Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(Modifier.Companion.$$INSTANCE, ((Dp) legacyTextFieldState11.minHeightForSingleLineField$delegate.getValue()).value, RecyclerView.DECELERATION_RATE, 2);
                                                        int i30 = i28;
                                                        int i31 = i29;
                                                        BasicTextKt.validateMinMaxLines(i30, i31);
                                                        TextStyle textStyle5 = textStyle4;
                                                        if (i30 != 1 || i31 != Integer.MAX_VALUE) {
                                                            m279heightInVpY3zN4$default = m279heightInVpY3zN4$default.then(new HeightInLinesElement(textStyle5, i30, i31));
                                                        }
                                                        boolean changedInstance7 = gapComposer5.changedInstance(legacyTextFieldState11);
                                                        Object rememberedValue18 = gapComposer5.rememberedValue();
                                                        if (changedInstance7 || rememberedValue18 == Composer.Companion.Empty) {
                                                            rememberedValue18 = new Threads$$ExternalSyntheticLambda1(legacyTextFieldState11, 20);
                                                            gapComposer5.updateRememberedValue(rememberedValue18);
                                                        }
                                                        Function0 function0 = (Function0) rememberedValue18;
                                                        TextFieldScrollerPosition textFieldScrollerPosition5 = textFieldScrollerPosition4;
                                                        Orientation orientation2 = (Orientation) textFieldScrollerPosition5.orientation$delegate.getValue();
                                                        TextFieldValue textFieldValue6 = textFieldValue5;
                                                        long j5 = textFieldValue6.selection;
                                                        int i32 = TextRange.$r8$clinit;
                                                        int i33 = (int) (j5 >> 32);
                                                        long j6 = textFieldScrollerPosition5.previousSelection;
                                                        if (i33 == ((int) (j6 >> 32)) && (i33 = (int) (j5 & BodyPartID.bodyIdMax)) == ((int) (j6 & BodyPartID.bodyIdMax))) {
                                                            i33 = TextRange.m990getMinimpl(j5);
                                                        }
                                                        textFieldScrollerPosition5.previousSelection = textFieldValue6.selection;
                                                        TransformedText filterWithValidation2 = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, textFieldValue6.annotatedString);
                                                        int ordinal = orientation2.ordinal();
                                                        if (ordinal == 0) {
                                                            verticalScrollLayoutModifier = new VerticalScrollLayoutModifier(textFieldScrollerPosition5, i33, filterWithValidation2, function0);
                                                        } else {
                                                            if (ordinal != 1) {
                                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                                return null;
                                                            }
                                                            verticalScrollLayoutModifier = new HorizontalScrollLayoutModifier(textFieldScrollerPosition5, i33, filterWithValidation2, function0);
                                                        }
                                                        SimpleLayoutKt.SimpleLayout(BringIntoViewRequesterKt.bringIntoViewRequester(ClipKt.clipToBounds(m279heightInVpY3zN4$default).then(verticalScrollLayoutModifier).then(modifier5).then(modifier6).then(new TextFieldSizeElement(textStyle5)).then(modifier7).then(modifier8), bringIntoViewRequesterImpl4), Expect_jvmKt.rememberComposableLambda(1412697320, new CalendarRowKt$$ExternalSyntheticLambda2(textFieldSelectionManager5, legacyTextFieldState11, z16, z17, function13, textFieldValue6, offsetMapping10, density4, i31), gapComposer5), gapComposer5, 48);
                                                    } else {
                                                        gapComposer5.skipToGroupEnd();
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }, gapComposer4), gapComposer4, 6);
                                        } else {
                                            gapComposer4.skipToGroupEnd();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                gapComposer = r15;
                                CoreTextFieldRootBox(addTextContextMenuComponentsWithContext, textFieldSelectionManager3, Expect_jvmKt.rememberComposableLambda(-814563849, function2, gapComposer), gapComposer, MLKEMEngine.KyberPolyBytes);
                            }
                        } else {
                            legacyTextFieldState3 = legacyTextFieldState2;
                        }
                        z10 = true;
                        z11 = changed5 | z10;
                        Object rememberedValue172 = r15.rememberedValue();
                        if (z11) {
                        }
                        textFieldSelectionManager2 = textFieldSelectionManager;
                        unit = unit2;
                        coroutineScope2 = coroutineScope;
                        offsetMapping3 = offsetMapping2;
                        modifier2 = focusable;
                        legacyTextFieldState4 = legacyTextFieldState3;
                        companion = companion3;
                        focusRequester2 = focusRequester;
                        mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
                        TextInputService textInputService52 = textInputService4;
                        realImageLoader$execute$result$1 = new RealImageLoader$execute$result$1(legacyTextFieldState4, rememberUpdatedState, textInputService52, textFieldSelectionManager2, imeOptions, null, 4);
                        textInputService = textInputService52;
                        r15.updateRememberedValue(realImageLoader$execute$result$1);
                        Updater.LaunchedEffect((Composer) r15, unit, (Function2) realImageLoader$execute$result$1);
                        Modifier pointerInput3 = SuspendingPointerInputFilterKt.pointerInput(companion, 8675309, new TaxTooltipView$Content$1$1$1(1, new CoreTextFieldKt$$ExternalSyntheticLambda2(legacyTextFieldState4, 4)));
                        textFieldSelectionManager3 = textFieldSelectionManager2;
                        offsetMapping4 = offsetMapping3;
                        TextFieldPointerModifier_commonKt$$ExternalSyntheticLambda1 textFieldPointerModifier_commonKt$$ExternalSyntheticLambda12 = new TextFieldPointerModifier_commonKt$$ExternalSyntheticLambda1(legacyTextFieldState4, focusRequester2, z3, z2, textFieldSelectionManager3, offsetMapping4);
                        if (z2) {
                        }
                        Modifier pointerInput22 = SuspendingPointerInputFilterKt.pointerInput(pointerInput3, textFieldSelectionManager3.mouseSelectionObserver, textFieldSelectionManager3.touchSelectionObserver, new SliderKt$sliderTapModifier$1(textFieldSelectionManager3, i13));
                        PointerIcon.Companion.getClass();
                        then = pointerInput22.then(new PointerHoverIconModifierElement(PointerId.pointerIconText));
                        final Modifier drawBehind2 = ClipKt.drawBehind(companion, new MenuKt$$ExternalSyntheticLambda0(7, legacyTextFieldState4, textFieldValue2, offsetMapping4));
                        boolean changedInstance62 = r15.changedInstance(legacyTextFieldState4) | (i12 == 2048);
                        windowInfo2 = windowInfo;
                        int i242 = i11;
                        changed = changedInstance62 | r15.changed(windowInfo2) | r15.changedInstance(textFieldSelectionManager3) | (i242 == 4) | r15.changedInstance(offsetMapping4);
                        rememberedValue5 = r15.rememberedValue();
                        if (changed) {
                        }
                        LegacyTextFieldState legacyTextFieldState72 = legacyTextFieldState4;
                        TextFieldValue textFieldValue42 = textFieldValue2;
                        textInputService2 = textInputService;
                        SessionQueries$$ExternalSyntheticLambda0 sessionQueries$$ExternalSyntheticLambda02 = new SessionQueries$$ExternalSyntheticLambda0(1, legacyTextFieldState72, windowInfo2, textFieldSelectionManager3, textFieldValue42, offsetMapping4, z2);
                        legacyTextFieldState4 = legacyTextFieldState72;
                        windowInfo3 = windowInfo2;
                        r15.updateRememberedValue(sessionQueries$$ExternalSyntheticLambda02);
                        rememberedValue5 = sessionQueries$$ExternalSyntheticLambda02;
                        final Modifier onGloballyPositioned2 = ValueInsets.onGloballyPositioned(companion, (Function1) rememberedValue5);
                        LegacyTextFieldState legacyTextFieldState82 = legacyTextFieldState4;
                        TextInputService textInputService62 = textInputService2;
                        CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier2 = new CoreTextFieldSemanticsModifier(transformedText, textFieldValue, legacyTextFieldState82, z3, z2, offsetMapping4, textFieldSelectionManager3, imeOptions, focusRequester2);
                        legacyTextFieldState5 = legacyTextFieldState82;
                        if (!z2 && !z3 && ((LazyWindowInfo) windowInfo3).isWindowFocused() && TextRange.m987getCollapsedimpl(((TextRange) legacyTextFieldState5.selectionPreviewHighlightRange$delegate.getValue()).packedValue) && TextRange.m987getCollapsedimpl(((TextRange) legacyTextFieldState5.deletionPreviewHighlightRange$delegate.getValue()).packedValue)) {
                        }
                        changedInstance2 = r15.changedInstance(textFieldSelectionManager3);
                        rememberedValue6 = r15.rememberedValue();
                        if (!changedInstance2) {
                        }
                        rememberedValue6 = new CoreTextFieldKt$$ExternalSyntheticLambda8(textFieldSelectionManager3, 0);
                        r15.updateRememberedValue(rememberedValue6);
                        Updater.DisposableEffect(textFieldSelectionManager3, (Function1) rememberedValue6, (Composer) r15);
                        changedInstance3 = r15.changedInstance(legacyTextFieldState5) | r15.changedInstance(textInputService62) | (i242 == 4) | ((i10 <= 32 && r15.changed(imeOptions)) || (i9 & 48) == 32);
                        rememberedValue7 = r15.rememberedValue();
                        if (changedInstance3) {
                        }
                        n3$$ExternalSyntheticLambda0 n3__externalsyntheticlambda02 = new n3$$ExternalSyntheticLambda0(legacyTextFieldState5, textInputService62, textFieldValue, imeOptions, 5);
                        imeOptions4 = imeOptions;
                        r15.updateRememberedValue(n3__externalsyntheticlambda02);
                        rememberedValue7 = n3__externalsyntheticlambda02;
                        Updater.DisposableEffect(imeOptions4, (Function1) rememberedValue7, (Composer) r15);
                        final Function1 coreTextFieldKt$$ExternalSyntheticLambda22 = legacyTextFieldState5.onValueChange;
                        if (i == 1) {
                        }
                        final OffsetMapping offsetMapping92 = offsetMapping5;
                        final int i252 = imeOptions4.imeAction;
                        final UndoManager undoManager32 = undoManager2;
                        Modifier composed2 = PlatformKt.composed(companion, new Function3() { // from class: androidx.compose.foundation.text.TextFieldKeyInputKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                ((Integer) obj8).getClass();
                                GapComposer gapComposer4 = (GapComposer) ((Composer) obj7);
                                gapComposer4.startReplaceGroup(851809892);
                                Object rememberedValue18 = gapComposer4.rememberedValue();
                                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                                if (rememberedValue18 == neverEqualPolicy) {
                                    rememberedValue18 = new TextPreparedSelectionState();
                                    gapComposer4.updateRememberedValue(rememberedValue18);
                                }
                                TextPreparedSelectionState textPreparedSelectionState = (TextPreparedSelectionState) rememberedValue18;
                                Object rememberedValue19 = gapComposer4.rememberedValue();
                                if (rememberedValue19 == neverEqualPolicy) {
                                    rememberedValue19 = new DeadKeyCombiner();
                                    gapComposer4.updateRememberedValue(rememberedValue19);
                                }
                                TextFieldKeyInput textFieldKeyInput = new TextFieldKeyInput(LegacyTextFieldState.this, textFieldSelectionManager3, textFieldValue, z14, z15, textPreparedSelectionState, offsetMapping92, undoManager32, (DeadKeyCombiner) rememberedValue19, coreTextFieldKt$$ExternalSyntheticLambda22, i252);
                                boolean changedInstance7 = gapComposer4.changedInstance(textFieldKeyInput);
                                Object rememberedValue20 = gapComposer4.rememberedValue();
                                if (changedInstance7 || rememberedValue20 == neverEqualPolicy) {
                                    GraphLoop$processingQueue$1 graphLoop$processingQueue$1 = new GraphLoop$processingQueue$1(1, textFieldKeyInput, TextFieldKeyInput.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 2);
                                    gapComposer4.updateRememberedValue(graphLoop$processingQueue$1);
                                    rememberedValue20 = graphLoop$processingQueue$1;
                                }
                                Modifier onKeyEvent = KeyEventType.onKeyEvent(Modifier.Companion.$$INSTANCE, (Function1) ((KFunction) rememberedValue20));
                                gapComposer4.end(false);
                                return onKeyEvent;
                            }
                        });
                        int i262 = imeOptions4.keyboardType;
                        if (i262 == 7) {
                            boolean booleanValue2 = ((Boolean) rememberUpdatedState.getValue()).booleanValue();
                            AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter32 = androidLegacyPlatformTextInputServiceAdapter;
                            changed2 = r15.changed(z12) | r15.changedInstance(androidLegacyPlatformTextInputServiceAdapter32);
                            rememberedValue8 = r15.rememberedValue();
                            if (!changed2) {
                            }
                            rememberedValue8 = new b$$ExternalSyntheticLambda0(z12, androidLegacyPlatformTextInputServiceAdapter32, 1);
                            r15.updateRememberedValue(rememberedValue8);
                            Modifier stylusHandwriting2 = StylusHandwritingKt.stylusHandwriting(companion, booleanValue2, z12, (Function0) rememberedValue8);
                            Brush m344resolveAutofillHighlightWkMShQ2 = AutofillHighlightKt.m344resolveAutofillHighlightWkMShQ((Brush) r15.consume(AutofillHighlightKt.LocalAutofillHighlightBrush), ((Color) r15.consume(AutofillHighlightKt.LocalAutofillHighlightColor)).value, ColorKt.Color(1308617531));
                            changedInstance4 = r15.changedInstance(legacyTextFieldState5) | r15.changed(m344resolveAutofillHighlightWkMShQ2);
                            rememberedValue9 = r15.rememberedValue();
                            if (!changedInstance4) {
                            }
                            rememberedValue9 = new ClickableKt$$ExternalSyntheticLambda0(29, legacyTextFieldState5, m344resolveAutofillHighlightWkMShQ2);
                            r15.updateRememberedValue(rememberedValue9);
                            Modifier then22 = MathUtilsKt.legacyTextInputAdapter(modifier.then(ClipKt.drawWithContent(companion, (Function1) rememberedValue9)), androidLegacyPlatformTextInputServiceAdapter32, legacyTextFieldState5, textFieldSelectionManager3).then(stylusHandwriting2).then(modifier2);
                            int i272 = 3;
                            final TextFieldScrollerPosition textFieldScrollerPosition32 = textFieldScrollerPosition;
                            Modifier addTextContextMenuComponentsWithContext2 = TextContextMenuGesturesModifierKt.addTextContextMenuComponentsWithContext(ValueInsets.onGloballyPositioned(PlatformKt.composed(KeyEventType.onPreviewKeyEvent(KeyEventType.onPreviewKeyEvent(then22, new Latch$await$2$2(i272, focusOwnerImpl2, legacyTextFieldState5)), new Latch$await$2$2(2, legacyTextFieldState5, textFieldSelectionManager3)).then(composed2), new EducationalSheetKt$$ExternalSyntheticLambda8(textFieldScrollerPosition32, z2, mutableInteractionSourceImpl, 1)).then(then).then(coreTextFieldSemanticsModifier2), new CoreTextFieldKt$$ExternalSyntheticLambda2(legacyTextFieldState5, 0)), new TextKt$$ExternalSyntheticLambda0(15, textFieldSelectionManager3, coroutineScope2));
                            if (!z2) {
                            }
                            if (i14 == 0) {
                            }
                            final Modifier modifier42 = modifier3;
                            final BringIntoViewRequesterImpl bringIntoViewRequesterImpl32 = bringIntoViewRequesterImpl;
                            final Modifier companion42 = companion2;
                            final LegacyTextFieldState legacyTextFieldState92 = legacyTextFieldState5;
                            final boolean r1522 = i14;
                            Function2 function22 = new Function2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj6, Object obj7) {
                                    Composer composer2 = (Composer) obj6;
                                    int intValue = ((Integer) obj7).intValue();
                                    GapComposer gapComposer4 = (GapComposer) composer2;
                                    if (gapComposer4.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        final LegacyTextFieldState legacyTextFieldState10 = legacyTextFieldState92;
                                        final TextStyle textStyle4 = textStyle;
                                        final int i28 = i2;
                                        final int i29 = i;
                                        final TextFieldScrollerPosition textFieldScrollerPosition4 = textFieldScrollerPosition32;
                                        final TextFieldValue textFieldValue5 = textFieldValue;
                                        final VisualTransformation visualTransformation2 = visualTransformation;
                                        final Modifier modifier5 = companion42;
                                        final Modifier modifier6 = drawBehind2;
                                        final Modifier modifier7 = onGloballyPositioned2;
                                        final Modifier modifier8 = modifier42;
                                        final BringIntoViewRequesterImpl bringIntoViewRequesterImpl4 = bringIntoViewRequesterImpl32;
                                        final TextFieldSelectionManager textFieldSelectionManager5 = textFieldSelectionManager3;
                                        final boolean z16 = r1522;
                                        final boolean z17 = z3;
                                        final Function1 function13 = function12;
                                        final OffsetMapping offsetMapping10 = offsetMapping92;
                                        final Density density4 = density3;
                                        Function3.this.invoke(Expect_jvmKt.rememberComposableLambda(-44346382, new Function2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda13
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj8, Object obj9) {
                                                Modifier verticalScrollLayoutModifier;
                                                Composer composer3 = (Composer) obj8;
                                                int intValue2 = ((Integer) obj9).intValue();
                                                GapComposer gapComposer5 = (GapComposer) composer3;
                                                if (gapComposer5.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                                    LegacyTextFieldState legacyTextFieldState11 = LegacyTextFieldState.this;
                                                    Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(Modifier.Companion.$$INSTANCE, ((Dp) legacyTextFieldState11.minHeightForSingleLineField$delegate.getValue()).value, RecyclerView.DECELERATION_RATE, 2);
                                                    int i30 = i28;
                                                    int i31 = i29;
                                                    BasicTextKt.validateMinMaxLines(i30, i31);
                                                    TextStyle textStyle5 = textStyle4;
                                                    if (i30 != 1 || i31 != Integer.MAX_VALUE) {
                                                        m279heightInVpY3zN4$default = m279heightInVpY3zN4$default.then(new HeightInLinesElement(textStyle5, i30, i31));
                                                    }
                                                    boolean changedInstance7 = gapComposer5.changedInstance(legacyTextFieldState11);
                                                    Object rememberedValue18 = gapComposer5.rememberedValue();
                                                    if (changedInstance7 || rememberedValue18 == Composer.Companion.Empty) {
                                                        rememberedValue18 = new Threads$$ExternalSyntheticLambda1(legacyTextFieldState11, 20);
                                                        gapComposer5.updateRememberedValue(rememberedValue18);
                                                    }
                                                    Function0 function0 = (Function0) rememberedValue18;
                                                    TextFieldScrollerPosition textFieldScrollerPosition5 = textFieldScrollerPosition4;
                                                    Orientation orientation2 = (Orientation) textFieldScrollerPosition5.orientation$delegate.getValue();
                                                    TextFieldValue textFieldValue6 = textFieldValue5;
                                                    long j5 = textFieldValue6.selection;
                                                    int i32 = TextRange.$r8$clinit;
                                                    int i33 = (int) (j5 >> 32);
                                                    long j6 = textFieldScrollerPosition5.previousSelection;
                                                    if (i33 == ((int) (j6 >> 32)) && (i33 = (int) (j5 & BodyPartID.bodyIdMax)) == ((int) (j6 & BodyPartID.bodyIdMax))) {
                                                        i33 = TextRange.m990getMinimpl(j5);
                                                    }
                                                    textFieldScrollerPosition5.previousSelection = textFieldValue6.selection;
                                                    TransformedText filterWithValidation2 = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, textFieldValue6.annotatedString);
                                                    int ordinal = orientation2.ordinal();
                                                    if (ordinal == 0) {
                                                        verticalScrollLayoutModifier = new VerticalScrollLayoutModifier(textFieldScrollerPosition5, i33, filterWithValidation2, function0);
                                                    } else {
                                                        if (ordinal != 1) {
                                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                                            return null;
                                                        }
                                                        verticalScrollLayoutModifier = new HorizontalScrollLayoutModifier(textFieldScrollerPosition5, i33, filterWithValidation2, function0);
                                                    }
                                                    SimpleLayoutKt.SimpleLayout(BringIntoViewRequesterKt.bringIntoViewRequester(ClipKt.clipToBounds(m279heightInVpY3zN4$default).then(verticalScrollLayoutModifier).then(modifier5).then(modifier6).then(new TextFieldSizeElement(textStyle5)).then(modifier7).then(modifier8), bringIntoViewRequesterImpl4), Expect_jvmKt.rememberComposableLambda(1412697320, new CalendarRowKt$$ExternalSyntheticLambda2(textFieldSelectionManager5, legacyTextFieldState11, z16, z17, function13, textFieldValue6, offsetMapping10, density4, i31), gapComposer5), gapComposer5, 48);
                                                } else {
                                                    gapComposer5.skipToGroupEnd();
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer4), gapComposer4, 6);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            gapComposer = r15;
                            CoreTextFieldRootBox(addTextContextMenuComponentsWithContext2, textFieldSelectionManager3, Expect_jvmKt.rememberComposableLambda(-814563849, function22, gapComposer), gapComposer, MLKEMEngine.KyberPolyBytes);
                        }
                        boolean booleanValue22 = ((Boolean) rememberUpdatedState.getValue()).booleanValue();
                        AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter322 = androidLegacyPlatformTextInputServiceAdapter;
                        changed2 = r15.changed(z12) | r15.changedInstance(androidLegacyPlatformTextInputServiceAdapter322);
                        rememberedValue8 = r15.rememberedValue();
                        if (!changed2) {
                        }
                        rememberedValue8 = new b$$ExternalSyntheticLambda0(z12, androidLegacyPlatformTextInputServiceAdapter322, 1);
                        r15.updateRememberedValue(rememberedValue8);
                        Modifier stylusHandwriting22 = StylusHandwritingKt.stylusHandwriting(companion, booleanValue22, z12, (Function0) rememberedValue8);
                        Brush m344resolveAutofillHighlightWkMShQ22 = AutofillHighlightKt.m344resolveAutofillHighlightWkMShQ((Brush) r15.consume(AutofillHighlightKt.LocalAutofillHighlightBrush), ((Color) r15.consume(AutofillHighlightKt.LocalAutofillHighlightColor)).value, ColorKt.Color(1308617531));
                        changedInstance4 = r15.changedInstance(legacyTextFieldState5) | r15.changed(m344resolveAutofillHighlightWkMShQ22);
                        rememberedValue9 = r15.rememberedValue();
                        if (!changedInstance4) {
                        }
                        rememberedValue9 = new ClickableKt$$ExternalSyntheticLambda0(29, legacyTextFieldState5, m344resolveAutofillHighlightWkMShQ22);
                        r15.updateRememberedValue(rememberedValue9);
                        Modifier then222 = MathUtilsKt.legacyTextInputAdapter(modifier.then(ClipKt.drawWithContent(companion, (Function1) rememberedValue9)), androidLegacyPlatformTextInputServiceAdapter322, legacyTextFieldState5, textFieldSelectionManager3).then(stylusHandwriting22).then(modifier2);
                        int i2722 = 3;
                        final TextFieldScrollerPosition textFieldScrollerPosition322 = textFieldScrollerPosition;
                        Modifier addTextContextMenuComponentsWithContext22 = TextContextMenuGesturesModifierKt.addTextContextMenuComponentsWithContext(ValueInsets.onGloballyPositioned(PlatformKt.composed(KeyEventType.onPreviewKeyEvent(KeyEventType.onPreviewKeyEvent(then222, new Latch$await$2$2(i2722, focusOwnerImpl2, legacyTextFieldState5)), new Latch$await$2$2(2, legacyTextFieldState5, textFieldSelectionManager3)).then(composed2), new EducationalSheetKt$$ExternalSyntheticLambda8(textFieldScrollerPosition322, z2, mutableInteractionSourceImpl, 1)).then(then).then(coreTextFieldSemanticsModifier2), new CoreTextFieldKt$$ExternalSyntheticLambda2(legacyTextFieldState5, 0)), new TextKt$$ExternalSyntheticLambda0(15, textFieldSelectionManager3, coroutineScope2));
                        if (!z2) {
                        }
                        if (i14 == 0) {
                        }
                        final Modifier modifier422 = modifier3;
                        final BringIntoViewRequesterImpl bringIntoViewRequesterImpl322 = bringIntoViewRequesterImpl;
                        final Modifier companion422 = companion2;
                        final LegacyTextFieldState legacyTextFieldState922 = legacyTextFieldState5;
                        final boolean r15222 = i14;
                        Function2 function222 = new Function2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj6, Object obj7) {
                                Composer composer2 = (Composer) obj6;
                                int intValue = ((Integer) obj7).intValue();
                                GapComposer gapComposer4 = (GapComposer) composer2;
                                if (gapComposer4.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    final LegacyTextFieldState legacyTextFieldState10 = legacyTextFieldState922;
                                    final TextStyle textStyle4 = textStyle;
                                    final int i28 = i2;
                                    final int i29 = i;
                                    final TextFieldScrollerPosition textFieldScrollerPosition4 = textFieldScrollerPosition322;
                                    final TextFieldValue textFieldValue5 = textFieldValue;
                                    final VisualTransformation visualTransformation2 = visualTransformation;
                                    final Modifier modifier5 = companion422;
                                    final Modifier modifier6 = drawBehind2;
                                    final Modifier modifier7 = onGloballyPositioned2;
                                    final Modifier modifier8 = modifier422;
                                    final BringIntoViewRequesterImpl bringIntoViewRequesterImpl4 = bringIntoViewRequesterImpl322;
                                    final TextFieldSelectionManager textFieldSelectionManager5 = textFieldSelectionManager3;
                                    final boolean z16 = r15222;
                                    final boolean z17 = z3;
                                    final Function1 function13 = function12;
                                    final OffsetMapping offsetMapping10 = offsetMapping92;
                                    final Density density4 = density3;
                                    Function3.this.invoke(Expect_jvmKt.rememberComposableLambda(-44346382, new Function2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda13
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj8, Object obj9) {
                                            Modifier verticalScrollLayoutModifier;
                                            Composer composer3 = (Composer) obj8;
                                            int intValue2 = ((Integer) obj9).intValue();
                                            GapComposer gapComposer5 = (GapComposer) composer3;
                                            if (gapComposer5.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                                LegacyTextFieldState legacyTextFieldState11 = LegacyTextFieldState.this;
                                                Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(Modifier.Companion.$$INSTANCE, ((Dp) legacyTextFieldState11.minHeightForSingleLineField$delegate.getValue()).value, RecyclerView.DECELERATION_RATE, 2);
                                                int i30 = i28;
                                                int i31 = i29;
                                                BasicTextKt.validateMinMaxLines(i30, i31);
                                                TextStyle textStyle5 = textStyle4;
                                                if (i30 != 1 || i31 != Integer.MAX_VALUE) {
                                                    m279heightInVpY3zN4$default = m279heightInVpY3zN4$default.then(new HeightInLinesElement(textStyle5, i30, i31));
                                                }
                                                boolean changedInstance7 = gapComposer5.changedInstance(legacyTextFieldState11);
                                                Object rememberedValue18 = gapComposer5.rememberedValue();
                                                if (changedInstance7 || rememberedValue18 == Composer.Companion.Empty) {
                                                    rememberedValue18 = new Threads$$ExternalSyntheticLambda1(legacyTextFieldState11, 20);
                                                    gapComposer5.updateRememberedValue(rememberedValue18);
                                                }
                                                Function0 function0 = (Function0) rememberedValue18;
                                                TextFieldScrollerPosition textFieldScrollerPosition5 = textFieldScrollerPosition4;
                                                Orientation orientation2 = (Orientation) textFieldScrollerPosition5.orientation$delegate.getValue();
                                                TextFieldValue textFieldValue6 = textFieldValue5;
                                                long j5 = textFieldValue6.selection;
                                                int i32 = TextRange.$r8$clinit;
                                                int i33 = (int) (j5 >> 32);
                                                long j6 = textFieldScrollerPosition5.previousSelection;
                                                if (i33 == ((int) (j6 >> 32)) && (i33 = (int) (j5 & BodyPartID.bodyIdMax)) == ((int) (j6 & BodyPartID.bodyIdMax))) {
                                                    i33 = TextRange.m990getMinimpl(j5);
                                                }
                                                textFieldScrollerPosition5.previousSelection = textFieldValue6.selection;
                                                TransformedText filterWithValidation2 = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, textFieldValue6.annotatedString);
                                                int ordinal = orientation2.ordinal();
                                                if (ordinal == 0) {
                                                    verticalScrollLayoutModifier = new VerticalScrollLayoutModifier(textFieldScrollerPosition5, i33, filterWithValidation2, function0);
                                                } else {
                                                    if (ordinal != 1) {
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                        return null;
                                                    }
                                                    verticalScrollLayoutModifier = new HorizontalScrollLayoutModifier(textFieldScrollerPosition5, i33, filterWithValidation2, function0);
                                                }
                                                SimpleLayoutKt.SimpleLayout(BringIntoViewRequesterKt.bringIntoViewRequester(ClipKt.clipToBounds(m279heightInVpY3zN4$default).then(verticalScrollLayoutModifier).then(modifier5).then(modifier6).then(new TextFieldSizeElement(textStyle5)).then(modifier7).then(modifier8), bringIntoViewRequesterImpl4), Expect_jvmKt.rememberComposableLambda(1412697320, new CalendarRowKt$$ExternalSyntheticLambda2(textFieldSelectionManager5, legacyTextFieldState11, z16, z17, function13, textFieldValue6, offsetMapping10, density4, i31), gapComposer5), gapComposer5, 48);
                                            } else {
                                                gapComposer5.skipToGroupEnd();
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, gapComposer4), gapComposer4, 6);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer = r15;
                        CoreTextFieldRootBox(addTextContextMenuComponentsWithContext22, textFieldSelectionManager3, Expect_jvmKt.rememberComposableLambda(-814563849, function222, gapComposer), gapComposer, MLKEMEngine.KyberPolyBytes);
                    }
                } else {
                    imeOptions2 = imeOptions;
                }
                z7 = changedInstance5;
                undoManager2 = undoManager;
                if ((i9 & 48) != 32) {
                    z8 = false;
                    changedInstance = z7 | z8 | r15.changedInstance(offsetMapping8) | r15.changedInstance(coroutineScope3) | r15.changedInstance(bringIntoViewRequesterImpl2) | r15.changedInstance(textFieldSelectionManager4);
                    Object rememberedValue162 = r15.rememberedValue();
                    if (changedInstance) {
                    }
                    final ImeOptions imeOptions52 = imeOptions2;
                    focusRequester = focusRequester3;
                    i11 = i23;
                    legacyTextFieldState2 = legacyTextFieldState6;
                    obj4 = obj2;
                    i12 = i22;
                    obj3 = new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            TextLayoutResultProxy layoutResult;
                            FocusStateImpl focusStateImpl = (FocusStateImpl) obj6;
                            LegacyTextFieldState legacyTextFieldState73 = LegacyTextFieldState.this;
                            if (legacyTextFieldState73.getHasFocus() == focusStateImpl.isFocused()) {
                                return Unit.INSTANCE;
                            }
                            legacyTextFieldState73.hasFocus$delegate.setValue(Boolean.valueOf(focusStateImpl.isFocused()));
                            boolean hasFocus = legacyTextFieldState73.getHasFocus();
                            TextFieldValue textFieldValue43 = textFieldValue;
                            OffsetMapping offsetMapping93 = offsetMapping8;
                            if (hasFocus && z2 && !z3) {
                                KeyMappingKt.startInputSession(textInputService4, legacyTextFieldState73, textFieldValue43, imeOptions52, offsetMapping93);
                            } else {
                                KeyMappingKt.endInputSession(legacyTextFieldState73);
                            }
                            if (focusStateImpl.isFocused() && (layoutResult = legacyTextFieldState73.getLayoutResult()) != null) {
                                JobKt.launch$default(coroutineScope3, null, null, new RealImageLoader$execute$result$1(bringIntoViewRequesterImpl2, textFieldValue43, legacyTextFieldState73, layoutResult, offsetMapping93, null, 5), 3);
                            }
                            if (!focusStateImpl.isFocused()) {
                                textFieldSelectionManager4.m456deselect_kEHs6E$foundation(null);
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    bringIntoViewRequesterImpl = bringIntoViewRequesterImpl2;
                    offsetMapping2 = offsetMapping8;
                    textFieldSelectionManager = textFieldSelectionManager4;
                    textFieldValue2 = textFieldValue;
                    coroutineScope = coroutineScope3;
                    z9 = z2;
                    textInputService4 = textInputService4;
                    imeOptions3 = imeOptions52;
                    r15.updateRememberedValue(obj3);
                    Modifier.Companion companion32 = Modifier.Companion.$$INSTANCE;
                    Modifier focusable2 = CanvasKt.focusable(FocusOwnerImplKt.onFocusChanged(FocusTraversalKt.focusRequester(companion32, focusRequester), (Function1) obj3), z9, mutableInteractionSourceImpl);
                    MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(Boolean.valueOf((z9 || z3) ? false : true), r15);
                    Unit unit22 = Unit.INSTANCE;
                    boolean changed52 = r15.changed(rememberUpdatedState2) | r15.changedInstance(legacyTextFieldState2) | r15.changedInstance(textInputService4) | r15.changedInstance(textFieldSelectionManager);
                    if (i10 > 32) {
                    }
                    legacyTextFieldState3 = legacyTextFieldState2;
                    if ((i9 & 48) != 32) {
                    }
                    z10 = true;
                    z11 = changed52 | z10;
                    Object rememberedValue1722 = r15.rememberedValue();
                    if (z11) {
                    }
                    textFieldSelectionManager2 = textFieldSelectionManager;
                    unit = unit22;
                    coroutineScope2 = coroutineScope;
                    offsetMapping3 = offsetMapping2;
                    modifier2 = focusable2;
                    legacyTextFieldState4 = legacyTextFieldState3;
                    companion = companion32;
                    focusRequester2 = focusRequester;
                    mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
                    TextInputService textInputService522 = textInputService4;
                    realImageLoader$execute$result$1 = new RealImageLoader$execute$result$1(legacyTextFieldState4, rememberUpdatedState2, textInputService522, textFieldSelectionManager2, imeOptions, null, 4);
                    textInputService = textInputService522;
                    r15.updateRememberedValue(realImageLoader$execute$result$1);
                    Updater.LaunchedEffect((Composer) r15, unit, (Function2) realImageLoader$execute$result$1);
                    Modifier pointerInput32 = SuspendingPointerInputFilterKt.pointerInput(companion, 8675309, new TaxTooltipView$Content$1$1$1(1, new CoreTextFieldKt$$ExternalSyntheticLambda2(legacyTextFieldState4, 4)));
                    textFieldSelectionManager3 = textFieldSelectionManager2;
                    offsetMapping4 = offsetMapping3;
                    TextFieldPointerModifier_commonKt$$ExternalSyntheticLambda1 textFieldPointerModifier_commonKt$$ExternalSyntheticLambda122 = new TextFieldPointerModifier_commonKt$$ExternalSyntheticLambda1(legacyTextFieldState4, focusRequester2, z3, z2, textFieldSelectionManager3, offsetMapping4);
                    if (z2) {
                    }
                    Modifier pointerInput222 = SuspendingPointerInputFilterKt.pointerInput(pointerInput32, textFieldSelectionManager3.mouseSelectionObserver, textFieldSelectionManager3.touchSelectionObserver, new SliderKt$sliderTapModifier$1(textFieldSelectionManager3, i13));
                    PointerIcon.Companion.getClass();
                    then = pointerInput222.then(new PointerHoverIconModifierElement(PointerId.pointerIconText));
                    final Modifier drawBehind22 = ClipKt.drawBehind(companion, new MenuKt$$ExternalSyntheticLambda0(7, legacyTextFieldState4, textFieldValue2, offsetMapping4));
                    boolean changedInstance622 = r15.changedInstance(legacyTextFieldState4) | (i12 == 2048);
                    windowInfo2 = windowInfo;
                    int i2422 = i11;
                    changed = changedInstance622 | r15.changed(windowInfo2) | r15.changedInstance(textFieldSelectionManager3) | (i2422 == 4) | r15.changedInstance(offsetMapping4);
                    rememberedValue5 = r15.rememberedValue();
                    if (changed) {
                    }
                    LegacyTextFieldState legacyTextFieldState722 = legacyTextFieldState4;
                    TextFieldValue textFieldValue422 = textFieldValue2;
                    textInputService2 = textInputService;
                    SessionQueries$$ExternalSyntheticLambda0 sessionQueries$$ExternalSyntheticLambda022 = new SessionQueries$$ExternalSyntheticLambda0(1, legacyTextFieldState722, windowInfo2, textFieldSelectionManager3, textFieldValue422, offsetMapping4, z2);
                    legacyTextFieldState4 = legacyTextFieldState722;
                    windowInfo3 = windowInfo2;
                    r15.updateRememberedValue(sessionQueries$$ExternalSyntheticLambda022);
                    rememberedValue5 = sessionQueries$$ExternalSyntheticLambda022;
                    final Modifier onGloballyPositioned22 = ValueInsets.onGloballyPositioned(companion, (Function1) rememberedValue5);
                    LegacyTextFieldState legacyTextFieldState822 = legacyTextFieldState4;
                    TextInputService textInputService622 = textInputService2;
                    CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier22 = new CoreTextFieldSemanticsModifier(transformedText, textFieldValue, legacyTextFieldState822, z3, z2, offsetMapping4, textFieldSelectionManager3, imeOptions, focusRequester2);
                    legacyTextFieldState5 = legacyTextFieldState822;
                    if (!z2 && !z3 && ((LazyWindowInfo) windowInfo3).isWindowFocused() && TextRange.m987getCollapsedimpl(((TextRange) legacyTextFieldState5.selectionPreviewHighlightRange$delegate.getValue()).packedValue) && TextRange.m987getCollapsedimpl(((TextRange) legacyTextFieldState5.deletionPreviewHighlightRange$delegate.getValue()).packedValue)) {
                    }
                    changedInstance2 = r15.changedInstance(textFieldSelectionManager3);
                    rememberedValue6 = r15.rememberedValue();
                    if (!changedInstance2) {
                    }
                    rememberedValue6 = new CoreTextFieldKt$$ExternalSyntheticLambda8(textFieldSelectionManager3, 0);
                    r15.updateRememberedValue(rememberedValue6);
                    Updater.DisposableEffect(textFieldSelectionManager3, (Function1) rememberedValue6, (Composer) r15);
                    changedInstance3 = r15.changedInstance(legacyTextFieldState5) | r15.changedInstance(textInputService622) | (i2422 == 4) | ((i10 <= 32 && r15.changed(imeOptions)) || (i9 & 48) == 32);
                    rememberedValue7 = r15.rememberedValue();
                    if (changedInstance3) {
                    }
                    n3$$ExternalSyntheticLambda0 n3__externalsyntheticlambda022 = new n3$$ExternalSyntheticLambda0(legacyTextFieldState5, textInputService622, textFieldValue, imeOptions, 5);
                    imeOptions4 = imeOptions;
                    r15.updateRememberedValue(n3__externalsyntheticlambda022);
                    rememberedValue7 = n3__externalsyntheticlambda022;
                    Updater.DisposableEffect(imeOptions4, (Function1) rememberedValue7, (Composer) r15);
                    final Function1 coreTextFieldKt$$ExternalSyntheticLambda222 = legacyTextFieldState5.onValueChange;
                    if (i == 1) {
                    }
                    final OffsetMapping offsetMapping922 = offsetMapping5;
                    final int i2522 = imeOptions4.imeAction;
                    final UndoManager undoManager322 = undoManager2;
                    Modifier composed22 = PlatformKt.composed(companion, new Function3() { // from class: androidx.compose.foundation.text.TextFieldKeyInputKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                            ((Integer) obj8).getClass();
                            GapComposer gapComposer4 = (GapComposer) ((Composer) obj7);
                            gapComposer4.startReplaceGroup(851809892);
                            Object rememberedValue18 = gapComposer4.rememberedValue();
                            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                            if (rememberedValue18 == neverEqualPolicy) {
                                rememberedValue18 = new TextPreparedSelectionState();
                                gapComposer4.updateRememberedValue(rememberedValue18);
                            }
                            TextPreparedSelectionState textPreparedSelectionState = (TextPreparedSelectionState) rememberedValue18;
                            Object rememberedValue19 = gapComposer4.rememberedValue();
                            if (rememberedValue19 == neverEqualPolicy) {
                                rememberedValue19 = new DeadKeyCombiner();
                                gapComposer4.updateRememberedValue(rememberedValue19);
                            }
                            TextFieldKeyInput textFieldKeyInput = new TextFieldKeyInput(LegacyTextFieldState.this, textFieldSelectionManager3, textFieldValue, z14, z15, textPreparedSelectionState, offsetMapping922, undoManager322, (DeadKeyCombiner) rememberedValue19, coreTextFieldKt$$ExternalSyntheticLambda222, i2522);
                            boolean changedInstance7 = gapComposer4.changedInstance(textFieldKeyInput);
                            Object rememberedValue20 = gapComposer4.rememberedValue();
                            if (changedInstance7 || rememberedValue20 == neverEqualPolicy) {
                                GraphLoop$processingQueue$1 graphLoop$processingQueue$1 = new GraphLoop$processingQueue$1(1, textFieldKeyInput, TextFieldKeyInput.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 2);
                                gapComposer4.updateRememberedValue(graphLoop$processingQueue$1);
                                rememberedValue20 = graphLoop$processingQueue$1;
                            }
                            Modifier onKeyEvent = KeyEventType.onKeyEvent(Modifier.Companion.$$INSTANCE, (Function1) ((KFunction) rememberedValue20));
                            gapComposer4.end(false);
                            return onKeyEvent;
                        }
                    });
                    int i2622 = imeOptions4.keyboardType;
                    if (i2622 == 7) {
                    }
                    boolean booleanValue222 = ((Boolean) rememberUpdatedState2.getValue()).booleanValue();
                    AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter3222 = androidLegacyPlatformTextInputServiceAdapter;
                    changed2 = r15.changed(z12) | r15.changedInstance(androidLegacyPlatformTextInputServiceAdapter3222);
                    rememberedValue8 = r15.rememberedValue();
                    if (!changed2) {
                    }
                    rememberedValue8 = new b$$ExternalSyntheticLambda0(z12, androidLegacyPlatformTextInputServiceAdapter3222, 1);
                    r15.updateRememberedValue(rememberedValue8);
                    Modifier stylusHandwriting222 = StylusHandwritingKt.stylusHandwriting(companion, booleanValue222, z12, (Function0) rememberedValue8);
                    Brush m344resolveAutofillHighlightWkMShQ222 = AutofillHighlightKt.m344resolveAutofillHighlightWkMShQ((Brush) r15.consume(AutofillHighlightKt.LocalAutofillHighlightBrush), ((Color) r15.consume(AutofillHighlightKt.LocalAutofillHighlightColor)).value, ColorKt.Color(1308617531));
                    changedInstance4 = r15.changedInstance(legacyTextFieldState5) | r15.changed(m344resolveAutofillHighlightWkMShQ222);
                    rememberedValue9 = r15.rememberedValue();
                    if (!changedInstance4) {
                    }
                    rememberedValue9 = new ClickableKt$$ExternalSyntheticLambda0(29, legacyTextFieldState5, m344resolveAutofillHighlightWkMShQ222);
                    r15.updateRememberedValue(rememberedValue9);
                    Modifier then2222 = MathUtilsKt.legacyTextInputAdapter(modifier.then(ClipKt.drawWithContent(companion, (Function1) rememberedValue9)), androidLegacyPlatformTextInputServiceAdapter3222, legacyTextFieldState5, textFieldSelectionManager3).then(stylusHandwriting222).then(modifier2);
                    int i27222 = 3;
                    final TextFieldScrollerPosition textFieldScrollerPosition3222 = textFieldScrollerPosition;
                    Modifier addTextContextMenuComponentsWithContext222 = TextContextMenuGesturesModifierKt.addTextContextMenuComponentsWithContext(ValueInsets.onGloballyPositioned(PlatformKt.composed(KeyEventType.onPreviewKeyEvent(KeyEventType.onPreviewKeyEvent(then2222, new Latch$await$2$2(i27222, focusOwnerImpl2, legacyTextFieldState5)), new Latch$await$2$2(2, legacyTextFieldState5, textFieldSelectionManager3)).then(composed22), new EducationalSheetKt$$ExternalSyntheticLambda8(textFieldScrollerPosition3222, z2, mutableInteractionSourceImpl, 1)).then(then).then(coreTextFieldSemanticsModifier22), new CoreTextFieldKt$$ExternalSyntheticLambda2(legacyTextFieldState5, 0)), new TextKt$$ExternalSyntheticLambda0(15, textFieldSelectionManager3, coroutineScope2));
                    if (!z2) {
                    }
                    if (i14 == 0) {
                    }
                    final Modifier modifier4222 = modifier3;
                    final BringIntoViewRequesterImpl bringIntoViewRequesterImpl3222 = bringIntoViewRequesterImpl;
                    final Modifier companion4222 = companion2;
                    final LegacyTextFieldState legacyTextFieldState9222 = legacyTextFieldState5;
                    final boolean r152222 = i14;
                    Function2 function2222 = new Function2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj6, Object obj7) {
                            Composer composer2 = (Composer) obj6;
                            int intValue = ((Integer) obj7).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer2;
                            if (gapComposer4.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                final LegacyTextFieldState legacyTextFieldState10 = legacyTextFieldState9222;
                                final TextStyle textStyle4 = textStyle;
                                final int i28 = i2;
                                final int i29 = i;
                                final TextFieldScrollerPosition textFieldScrollerPosition4 = textFieldScrollerPosition3222;
                                final TextFieldValue textFieldValue5 = textFieldValue;
                                final VisualTransformation visualTransformation2 = visualTransformation;
                                final Modifier modifier5 = companion4222;
                                final Modifier modifier6 = drawBehind22;
                                final Modifier modifier7 = onGloballyPositioned22;
                                final Modifier modifier8 = modifier4222;
                                final BringIntoViewRequesterImpl bringIntoViewRequesterImpl4 = bringIntoViewRequesterImpl3222;
                                final TextFieldSelectionManager textFieldSelectionManager5 = textFieldSelectionManager3;
                                final boolean z16 = r152222;
                                final boolean z17 = z3;
                                final Function1 function13 = function12;
                                final OffsetMapping offsetMapping10 = offsetMapping922;
                                final Density density4 = density3;
                                Function3.this.invoke(Expect_jvmKt.rememberComposableLambda(-44346382, new Function2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda13
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj8, Object obj9) {
                                        Modifier verticalScrollLayoutModifier;
                                        Composer composer3 = (Composer) obj8;
                                        int intValue2 = ((Integer) obj9).intValue();
                                        GapComposer gapComposer5 = (GapComposer) composer3;
                                        if (gapComposer5.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                            LegacyTextFieldState legacyTextFieldState11 = LegacyTextFieldState.this;
                                            Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(Modifier.Companion.$$INSTANCE, ((Dp) legacyTextFieldState11.minHeightForSingleLineField$delegate.getValue()).value, RecyclerView.DECELERATION_RATE, 2);
                                            int i30 = i28;
                                            int i31 = i29;
                                            BasicTextKt.validateMinMaxLines(i30, i31);
                                            TextStyle textStyle5 = textStyle4;
                                            if (i30 != 1 || i31 != Integer.MAX_VALUE) {
                                                m279heightInVpY3zN4$default = m279heightInVpY3zN4$default.then(new HeightInLinesElement(textStyle5, i30, i31));
                                            }
                                            boolean changedInstance7 = gapComposer5.changedInstance(legacyTextFieldState11);
                                            Object rememberedValue18 = gapComposer5.rememberedValue();
                                            if (changedInstance7 || rememberedValue18 == Composer.Companion.Empty) {
                                                rememberedValue18 = new Threads$$ExternalSyntheticLambda1(legacyTextFieldState11, 20);
                                                gapComposer5.updateRememberedValue(rememberedValue18);
                                            }
                                            Function0 function0 = (Function0) rememberedValue18;
                                            TextFieldScrollerPosition textFieldScrollerPosition5 = textFieldScrollerPosition4;
                                            Orientation orientation2 = (Orientation) textFieldScrollerPosition5.orientation$delegate.getValue();
                                            TextFieldValue textFieldValue6 = textFieldValue5;
                                            long j5 = textFieldValue6.selection;
                                            int i32 = TextRange.$r8$clinit;
                                            int i33 = (int) (j5 >> 32);
                                            long j6 = textFieldScrollerPosition5.previousSelection;
                                            if (i33 == ((int) (j6 >> 32)) && (i33 = (int) (j5 & BodyPartID.bodyIdMax)) == ((int) (j6 & BodyPartID.bodyIdMax))) {
                                                i33 = TextRange.m990getMinimpl(j5);
                                            }
                                            textFieldScrollerPosition5.previousSelection = textFieldValue6.selection;
                                            TransformedText filterWithValidation2 = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, textFieldValue6.annotatedString);
                                            int ordinal = orientation2.ordinal();
                                            if (ordinal == 0) {
                                                verticalScrollLayoutModifier = new VerticalScrollLayoutModifier(textFieldScrollerPosition5, i33, filterWithValidation2, function0);
                                            } else {
                                                if (ordinal != 1) {
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    return null;
                                                }
                                                verticalScrollLayoutModifier = new HorizontalScrollLayoutModifier(textFieldScrollerPosition5, i33, filterWithValidation2, function0);
                                            }
                                            SimpleLayoutKt.SimpleLayout(BringIntoViewRequesterKt.bringIntoViewRequester(ClipKt.clipToBounds(m279heightInVpY3zN4$default).then(verticalScrollLayoutModifier).then(modifier5).then(modifier6).then(new TextFieldSizeElement(textStyle5)).then(modifier7).then(modifier8), bringIntoViewRequesterImpl4), Expect_jvmKt.rememberComposableLambda(1412697320, new CalendarRowKt$$ExternalSyntheticLambda2(textFieldSelectionManager5, legacyTextFieldState11, z16, z17, function13, textFieldValue6, offsetMapping10, density4, i31), gapComposer5), gapComposer5, 48);
                                        } else {
                                            gapComposer5.skipToGroupEnd();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, gapComposer4), gapComposer4, 6);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    gapComposer = r15;
                    CoreTextFieldRootBox(addTextContextMenuComponentsWithContext222, textFieldSelectionManager3, Expect_jvmKt.rememberComposableLambda(-814563849, function2222, gapComposer), gapComposer, MLKEMEngine.KyberPolyBytes);
                }
                z8 = true;
                changedInstance = z7 | z8 | r15.changedInstance(offsetMapping8) | r15.changedInstance(coroutineScope3) | r15.changedInstance(bringIntoViewRequesterImpl2) | r15.changedInstance(textFieldSelectionManager4);
                Object rememberedValue1622 = r15.rememberedValue();
                if (changedInstance) {
                }
                final ImeOptions imeOptions522 = imeOptions2;
                focusRequester = focusRequester3;
                i11 = i23;
                legacyTextFieldState2 = legacyTextFieldState6;
                obj4 = obj2;
                i12 = i22;
                obj3 = new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        TextLayoutResultProxy layoutResult;
                        FocusStateImpl focusStateImpl = (FocusStateImpl) obj6;
                        LegacyTextFieldState legacyTextFieldState73 = LegacyTextFieldState.this;
                        if (legacyTextFieldState73.getHasFocus() == focusStateImpl.isFocused()) {
                            return Unit.INSTANCE;
                        }
                        legacyTextFieldState73.hasFocus$delegate.setValue(Boolean.valueOf(focusStateImpl.isFocused()));
                        boolean hasFocus = legacyTextFieldState73.getHasFocus();
                        TextFieldValue textFieldValue43 = textFieldValue;
                        OffsetMapping offsetMapping93 = offsetMapping8;
                        if (hasFocus && z2 && !z3) {
                            KeyMappingKt.startInputSession(textInputService4, legacyTextFieldState73, textFieldValue43, imeOptions522, offsetMapping93);
                        } else {
                            KeyMappingKt.endInputSession(legacyTextFieldState73);
                        }
                        if (focusStateImpl.isFocused() && (layoutResult = legacyTextFieldState73.getLayoutResult()) != null) {
                            JobKt.launch$default(coroutineScope3, null, null, new RealImageLoader$execute$result$1(bringIntoViewRequesterImpl2, textFieldValue43, legacyTextFieldState73, layoutResult, offsetMapping93, null, 5), 3);
                        }
                        if (!focusStateImpl.isFocused()) {
                            textFieldSelectionManager4.m456deselect_kEHs6E$foundation(null);
                        }
                        return Unit.INSTANCE;
                    }
                };
                bringIntoViewRequesterImpl = bringIntoViewRequesterImpl2;
                offsetMapping2 = offsetMapping8;
                textFieldSelectionManager = textFieldSelectionManager4;
                textFieldValue2 = textFieldValue;
                coroutineScope = coroutineScope3;
                z9 = z2;
                textInputService4 = textInputService4;
                imeOptions3 = imeOptions522;
                r15.updateRememberedValue(obj3);
                Modifier.Companion companion322 = Modifier.Companion.$$INSTANCE;
                Modifier focusable22 = CanvasKt.focusable(FocusOwnerImplKt.onFocusChanged(FocusTraversalKt.focusRequester(companion322, focusRequester), (Function1) obj3), z9, mutableInteractionSourceImpl);
                MutableState rememberUpdatedState22 = Updater.rememberUpdatedState(Boolean.valueOf((z9 || z3) ? false : true), r15);
                Unit unit222 = Unit.INSTANCE;
                boolean changed522 = r15.changed(rememberUpdatedState22) | r15.changedInstance(legacyTextFieldState2) | r15.changedInstance(textInputService4) | r15.changedInstance(textFieldSelectionManager);
                if (i10 > 32) {
                }
                legacyTextFieldState3 = legacyTextFieldState2;
                if ((i9 & 48) != 32) {
                }
                z10 = true;
                z11 = changed522 | z10;
                Object rememberedValue17222 = r15.rememberedValue();
                if (z11) {
                }
                textFieldSelectionManager2 = textFieldSelectionManager;
                unit = unit222;
                coroutineScope2 = coroutineScope;
                offsetMapping3 = offsetMapping2;
                modifier2 = focusable22;
                legacyTextFieldState4 = legacyTextFieldState3;
                companion = companion322;
                focusRequester2 = focusRequester;
                mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
                TextInputService textInputService5222 = textInputService4;
                realImageLoader$execute$result$1 = new RealImageLoader$execute$result$1(legacyTextFieldState4, rememberUpdatedState22, textInputService5222, textFieldSelectionManager2, imeOptions, null, 4);
                textInputService = textInputService5222;
                r15.updateRememberedValue(realImageLoader$execute$result$1);
                Updater.LaunchedEffect((Composer) r15, unit, (Function2) realImageLoader$execute$result$1);
                Modifier pointerInput322 = SuspendingPointerInputFilterKt.pointerInput(companion, 8675309, new TaxTooltipView$Content$1$1$1(1, new CoreTextFieldKt$$ExternalSyntheticLambda2(legacyTextFieldState4, 4)));
                textFieldSelectionManager3 = textFieldSelectionManager2;
                offsetMapping4 = offsetMapping3;
                TextFieldPointerModifier_commonKt$$ExternalSyntheticLambda1 textFieldPointerModifier_commonKt$$ExternalSyntheticLambda1222 = new TextFieldPointerModifier_commonKt$$ExternalSyntheticLambda1(legacyTextFieldState4, focusRequester2, z3, z2, textFieldSelectionManager3, offsetMapping4);
                if (z2) {
                }
                Modifier pointerInput2222 = SuspendingPointerInputFilterKt.pointerInput(pointerInput322, textFieldSelectionManager3.mouseSelectionObserver, textFieldSelectionManager3.touchSelectionObserver, new SliderKt$sliderTapModifier$1(textFieldSelectionManager3, i13));
                PointerIcon.Companion.getClass();
                then = pointerInput2222.then(new PointerHoverIconModifierElement(PointerId.pointerIconText));
                final Modifier drawBehind222 = ClipKt.drawBehind(companion, new MenuKt$$ExternalSyntheticLambda0(7, legacyTextFieldState4, textFieldValue2, offsetMapping4));
                boolean changedInstance6222 = r15.changedInstance(legacyTextFieldState4) | (i12 == 2048);
                windowInfo2 = windowInfo;
                int i24222 = i11;
                changed = changedInstance6222 | r15.changed(windowInfo2) | r15.changedInstance(textFieldSelectionManager3) | (i24222 == 4) | r15.changedInstance(offsetMapping4);
                rememberedValue5 = r15.rememberedValue();
                if (changed) {
                }
                LegacyTextFieldState legacyTextFieldState7222 = legacyTextFieldState4;
                TextFieldValue textFieldValue4222 = textFieldValue2;
                textInputService2 = textInputService;
                SessionQueries$$ExternalSyntheticLambda0 sessionQueries$$ExternalSyntheticLambda0222 = new SessionQueries$$ExternalSyntheticLambda0(1, legacyTextFieldState7222, windowInfo2, textFieldSelectionManager3, textFieldValue4222, offsetMapping4, z2);
                legacyTextFieldState4 = legacyTextFieldState7222;
                windowInfo3 = windowInfo2;
                r15.updateRememberedValue(sessionQueries$$ExternalSyntheticLambda0222);
                rememberedValue5 = sessionQueries$$ExternalSyntheticLambda0222;
                final Modifier onGloballyPositioned222 = ValueInsets.onGloballyPositioned(companion, (Function1) rememberedValue5);
                LegacyTextFieldState legacyTextFieldState8222 = legacyTextFieldState4;
                TextInputService textInputService6222 = textInputService2;
                CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier222 = new CoreTextFieldSemanticsModifier(transformedText, textFieldValue, legacyTextFieldState8222, z3, z2, offsetMapping4, textFieldSelectionManager3, imeOptions, focusRequester2);
                legacyTextFieldState5 = legacyTextFieldState8222;
                if (!z2 && !z3 && ((LazyWindowInfo) windowInfo3).isWindowFocused() && TextRange.m987getCollapsedimpl(((TextRange) legacyTextFieldState5.selectionPreviewHighlightRange$delegate.getValue()).packedValue) && TextRange.m987getCollapsedimpl(((TextRange) legacyTextFieldState5.deletionPreviewHighlightRange$delegate.getValue()).packedValue)) {
                }
                changedInstance2 = r15.changedInstance(textFieldSelectionManager3);
                rememberedValue6 = r15.rememberedValue();
                if (!changedInstance2) {
                }
                rememberedValue6 = new CoreTextFieldKt$$ExternalSyntheticLambda8(textFieldSelectionManager3, 0);
                r15.updateRememberedValue(rememberedValue6);
                Updater.DisposableEffect(textFieldSelectionManager3, (Function1) rememberedValue6, (Composer) r15);
                changedInstance3 = r15.changedInstance(legacyTextFieldState5) | r15.changedInstance(textInputService6222) | (i24222 == 4) | ((i10 <= 32 && r15.changed(imeOptions)) || (i9 & 48) == 32);
                rememberedValue7 = r15.rememberedValue();
                if (changedInstance3) {
                }
                n3$$ExternalSyntheticLambda0 n3__externalsyntheticlambda0222 = new n3$$ExternalSyntheticLambda0(legacyTextFieldState5, textInputService6222, textFieldValue, imeOptions, 5);
                imeOptions4 = imeOptions;
                r15.updateRememberedValue(n3__externalsyntheticlambda0222);
                rememberedValue7 = n3__externalsyntheticlambda0222;
                Updater.DisposableEffect(imeOptions4, (Function1) rememberedValue7, (Composer) r15);
                final Function1 coreTextFieldKt$$ExternalSyntheticLambda2222 = legacyTextFieldState5.onValueChange;
                if (i == 1) {
                }
                final OffsetMapping offsetMapping9222 = offsetMapping5;
                final int i25222 = imeOptions4.imeAction;
                final UndoManager undoManager3222 = undoManager2;
                Modifier composed222 = PlatformKt.composed(companion, new Function3() { // from class: androidx.compose.foundation.text.TextFieldKeyInputKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        ((Integer) obj8).getClass();
                        GapComposer gapComposer4 = (GapComposer) ((Composer) obj7);
                        gapComposer4.startReplaceGroup(851809892);
                        Object rememberedValue18 = gapComposer4.rememberedValue();
                        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                        if (rememberedValue18 == neverEqualPolicy) {
                            rememberedValue18 = new TextPreparedSelectionState();
                            gapComposer4.updateRememberedValue(rememberedValue18);
                        }
                        TextPreparedSelectionState textPreparedSelectionState = (TextPreparedSelectionState) rememberedValue18;
                        Object rememberedValue19 = gapComposer4.rememberedValue();
                        if (rememberedValue19 == neverEqualPolicy) {
                            rememberedValue19 = new DeadKeyCombiner();
                            gapComposer4.updateRememberedValue(rememberedValue19);
                        }
                        TextFieldKeyInput textFieldKeyInput = new TextFieldKeyInput(LegacyTextFieldState.this, textFieldSelectionManager3, textFieldValue, z14, z15, textPreparedSelectionState, offsetMapping9222, undoManager3222, (DeadKeyCombiner) rememberedValue19, coreTextFieldKt$$ExternalSyntheticLambda2222, i25222);
                        boolean changedInstance7 = gapComposer4.changedInstance(textFieldKeyInput);
                        Object rememberedValue20 = gapComposer4.rememberedValue();
                        if (changedInstance7 || rememberedValue20 == neverEqualPolicy) {
                            GraphLoop$processingQueue$1 graphLoop$processingQueue$1 = new GraphLoop$processingQueue$1(1, textFieldKeyInput, TextFieldKeyInput.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 2);
                            gapComposer4.updateRememberedValue(graphLoop$processingQueue$1);
                            rememberedValue20 = graphLoop$processingQueue$1;
                        }
                        Modifier onKeyEvent = KeyEventType.onKeyEvent(Modifier.Companion.$$INSTANCE, (Function1) ((KFunction) rememberedValue20));
                        gapComposer4.end(false);
                        return onKeyEvent;
                    }
                });
                int i26222 = imeOptions4.keyboardType;
                if (i26222 == 7) {
                }
                boolean booleanValue2222 = ((Boolean) rememberUpdatedState22.getValue()).booleanValue();
                AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter32222 = androidLegacyPlatformTextInputServiceAdapter;
                changed2 = r15.changed(z12) | r15.changedInstance(androidLegacyPlatformTextInputServiceAdapter32222);
                rememberedValue8 = r15.rememberedValue();
                if (!changed2) {
                }
                rememberedValue8 = new b$$ExternalSyntheticLambda0(z12, androidLegacyPlatformTextInputServiceAdapter32222, 1);
                r15.updateRememberedValue(rememberedValue8);
                Modifier stylusHandwriting2222 = StylusHandwritingKt.stylusHandwriting(companion, booleanValue2222, z12, (Function0) rememberedValue8);
                Brush m344resolveAutofillHighlightWkMShQ2222 = AutofillHighlightKt.m344resolveAutofillHighlightWkMShQ((Brush) r15.consume(AutofillHighlightKt.LocalAutofillHighlightBrush), ((Color) r15.consume(AutofillHighlightKt.LocalAutofillHighlightColor)).value, ColorKt.Color(1308617531));
                changedInstance4 = r15.changedInstance(legacyTextFieldState5) | r15.changed(m344resolveAutofillHighlightWkMShQ2222);
                rememberedValue9 = r15.rememberedValue();
                if (!changedInstance4) {
                }
                rememberedValue9 = new ClickableKt$$ExternalSyntheticLambda0(29, legacyTextFieldState5, m344resolveAutofillHighlightWkMShQ2222);
                r15.updateRememberedValue(rememberedValue9);
                Modifier then22222 = MathUtilsKt.legacyTextInputAdapter(modifier.then(ClipKt.drawWithContent(companion, (Function1) rememberedValue9)), androidLegacyPlatformTextInputServiceAdapter32222, legacyTextFieldState5, textFieldSelectionManager3).then(stylusHandwriting2222).then(modifier2);
                int i272222 = 3;
                final TextFieldScrollerPosition textFieldScrollerPosition32222 = textFieldScrollerPosition;
                Modifier addTextContextMenuComponentsWithContext2222 = TextContextMenuGesturesModifierKt.addTextContextMenuComponentsWithContext(ValueInsets.onGloballyPositioned(PlatformKt.composed(KeyEventType.onPreviewKeyEvent(KeyEventType.onPreviewKeyEvent(then22222, new Latch$await$2$2(i272222, focusOwnerImpl2, legacyTextFieldState5)), new Latch$await$2$2(2, legacyTextFieldState5, textFieldSelectionManager3)).then(composed222), new EducationalSheetKt$$ExternalSyntheticLambda8(textFieldScrollerPosition32222, z2, mutableInteractionSourceImpl, 1)).then(then).then(coreTextFieldSemanticsModifier222), new CoreTextFieldKt$$ExternalSyntheticLambda2(legacyTextFieldState5, 0)), new TextKt$$ExternalSyntheticLambda0(15, textFieldSelectionManager3, coroutineScope2));
                if (!z2) {
                }
                if (i14 == 0) {
                }
                final Modifier modifier42222 = modifier3;
                final BringIntoViewRequesterImpl bringIntoViewRequesterImpl32222 = bringIntoViewRequesterImpl;
                final Modifier companion42222 = companion2;
                final LegacyTextFieldState legacyTextFieldState92222 = legacyTextFieldState5;
                final boolean r1522222 = i14;
                Function2 function22222 = new Function2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj6, Object obj7) {
                        Composer composer2 = (Composer) obj6;
                        int intValue = ((Integer) obj7).intValue();
                        GapComposer gapComposer4 = (GapComposer) composer2;
                        if (gapComposer4.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                            final LegacyTextFieldState legacyTextFieldState10 = legacyTextFieldState92222;
                            final TextStyle textStyle4 = textStyle;
                            final int i28 = i2;
                            final int i29 = i;
                            final TextFieldScrollerPosition textFieldScrollerPosition4 = textFieldScrollerPosition32222;
                            final TextFieldValue textFieldValue5 = textFieldValue;
                            final VisualTransformation visualTransformation2 = visualTransformation;
                            final Modifier modifier5 = companion42222;
                            final Modifier modifier6 = drawBehind222;
                            final Modifier modifier7 = onGloballyPositioned222;
                            final Modifier modifier8 = modifier42222;
                            final BringIntoViewRequesterImpl bringIntoViewRequesterImpl4 = bringIntoViewRequesterImpl32222;
                            final TextFieldSelectionManager textFieldSelectionManager5 = textFieldSelectionManager3;
                            final boolean z16 = r1522222;
                            final boolean z17 = z3;
                            final Function1 function13 = function12;
                            final OffsetMapping offsetMapping10 = offsetMapping9222;
                            final Density density4 = density3;
                            Function3.this.invoke(Expect_jvmKt.rememberComposableLambda(-44346382, new Function2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda13
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj8, Object obj9) {
                                    Modifier verticalScrollLayoutModifier;
                                    Composer composer3 = (Composer) obj8;
                                    int intValue2 = ((Integer) obj9).intValue();
                                    GapComposer gapComposer5 = (GapComposer) composer3;
                                    if (gapComposer5.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                        LegacyTextFieldState legacyTextFieldState11 = LegacyTextFieldState.this;
                                        Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(Modifier.Companion.$$INSTANCE, ((Dp) legacyTextFieldState11.minHeightForSingleLineField$delegate.getValue()).value, RecyclerView.DECELERATION_RATE, 2);
                                        int i30 = i28;
                                        int i31 = i29;
                                        BasicTextKt.validateMinMaxLines(i30, i31);
                                        TextStyle textStyle5 = textStyle4;
                                        if (i30 != 1 || i31 != Integer.MAX_VALUE) {
                                            m279heightInVpY3zN4$default = m279heightInVpY3zN4$default.then(new HeightInLinesElement(textStyle5, i30, i31));
                                        }
                                        boolean changedInstance7 = gapComposer5.changedInstance(legacyTextFieldState11);
                                        Object rememberedValue18 = gapComposer5.rememberedValue();
                                        if (changedInstance7 || rememberedValue18 == Composer.Companion.Empty) {
                                            rememberedValue18 = new Threads$$ExternalSyntheticLambda1(legacyTextFieldState11, 20);
                                            gapComposer5.updateRememberedValue(rememberedValue18);
                                        }
                                        Function0 function0 = (Function0) rememberedValue18;
                                        TextFieldScrollerPosition textFieldScrollerPosition5 = textFieldScrollerPosition4;
                                        Orientation orientation2 = (Orientation) textFieldScrollerPosition5.orientation$delegate.getValue();
                                        TextFieldValue textFieldValue6 = textFieldValue5;
                                        long j5 = textFieldValue6.selection;
                                        int i32 = TextRange.$r8$clinit;
                                        int i33 = (int) (j5 >> 32);
                                        long j6 = textFieldScrollerPosition5.previousSelection;
                                        if (i33 == ((int) (j6 >> 32)) && (i33 = (int) (j5 & BodyPartID.bodyIdMax)) == ((int) (j6 & BodyPartID.bodyIdMax))) {
                                            i33 = TextRange.m990getMinimpl(j5);
                                        }
                                        textFieldScrollerPosition5.previousSelection = textFieldValue6.selection;
                                        TransformedText filterWithValidation2 = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, textFieldValue6.annotatedString);
                                        int ordinal = orientation2.ordinal();
                                        if (ordinal == 0) {
                                            verticalScrollLayoutModifier = new VerticalScrollLayoutModifier(textFieldScrollerPosition5, i33, filterWithValidation2, function0);
                                        } else {
                                            if (ordinal != 1) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                return null;
                                            }
                                            verticalScrollLayoutModifier = new HorizontalScrollLayoutModifier(textFieldScrollerPosition5, i33, filterWithValidation2, function0);
                                        }
                                        SimpleLayoutKt.SimpleLayout(BringIntoViewRequesterKt.bringIntoViewRequester(ClipKt.clipToBounds(m279heightInVpY3zN4$default).then(verticalScrollLayoutModifier).then(modifier5).then(modifier6).then(new TextFieldSizeElement(textStyle5)).then(modifier7).then(modifier8), bringIntoViewRequesterImpl4), Expect_jvmKt.rememberComposableLambda(1412697320, new CalendarRowKt$$ExternalSyntheticLambda2(textFieldSelectionManager5, legacyTextFieldState11, z16, z17, function13, textFieldValue6, offsetMapping10, density4, i31), gapComposer5), gapComposer5, 48);
                                    } else {
                                        gapComposer5.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, gapComposer4), gapComposer4, 6);
                        } else {
                            gapComposer4.skipToGroupEnd();
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer = r15;
                CoreTextFieldRootBox(addTextContextMenuComponentsWithContext2222, textFieldSelectionManager3, Expect_jvmKt.rememberComposableLambda(-814563849, function22222, gapComposer), gapComposer, MLKEMEngine.KyberPolyBytes);
            }
            z6 = false;
            if (textRange2 != null) {
            }
            if (z5) {
            }
            LongArrayQueue longArrayQueue22 = (LongArrayQueue) anonymousClass1.this$0;
            longArrayQueue22.size = -1;
            longArrayQueue22.wrapAroundMask = -1;
            m1001copy3r_uNRQ$default = TextFieldValue.m1001copy3r_uNRQ$default(textFieldValue, (AnnotatedString) null, 0L, 3);
            TextFieldValue textFieldValue32 = (TextFieldValue) anonymousClass1.val$videoEncoderSession;
            anonymousClass1.val$videoEncoderSession = m1001copy3r_uNRQ$default;
            if (textInputSession != null) {
            }
            rememberedValue = r15.rememberedValue();
            obj2 = obj;
            if (rememberedValue == obj2) {
            }
            undoManager = (UndoManager) rememberedValue;
            long currentTimeMillis2 = System.currentTimeMillis();
            if (!undoManager.forceNextSnapshot) {
            }
            undoManager.lastSnapshot = Long.valueOf(currentTimeMillis2);
            undoManager.makeSnapshot(textFieldValue);
            rememberedValue2 = r15.rememberedValue();
            if (rememberedValue2 == obj2) {
            }
            final CoroutineScope coroutineScope32 = (CoroutineScope) rememberedValue2;
            rememberedValue3 = r15.rememberedValue();
            if (rememberedValue3 == obj2) {
            }
            final BringIntoViewRequesterImpl bringIntoViewRequesterImpl22 = (BringIntoViewRequesterImpl) rememberedValue3;
            rememberedValue4 = r15.rememberedValue();
            if (rememberedValue4 == obj2) {
            }
            final TextFieldSelectionManager textFieldSelectionManager42 = (TextFieldSelectionManager) rememberedValue4;
            final OffsetMapping offsetMapping82 = offsetMapping;
            textFieldSelectionManager42.offsetMapping = offsetMapping82;
            textFieldSelectionManager42.onValueChange = legacyTextFieldState6.onValueChange;
            textFieldSelectionManager42.state = legacyTextFieldState6;
            textFieldSelectionManager42.valueState.setValue(textFieldValue);
            textFieldSelectionManager42.latestSelection = new TextRange(j3);
            textFieldSelectionManager42.clipboard = (AndroidClipboard) r15.consume(CompositionLocalsKt.LocalClipboard);
            textFieldSelectionManager42.coroutineScope = coroutineScope32;
            textFieldSelectionManager42.hapticFeedBack = (PlatformHapticFeedback) r15.consume(CompositionLocalsKt.LocalHapticFeedback);
            textFieldSelectionManager42.focusRequester = focusRequester3;
            final boolean z142 = !z3;
            textFieldSelectionManager42.editable$delegate.setValue(Boolean.valueOf(z142));
            textFieldSelectionManager42.enabled$delegate.setValue(Boolean.valueOf(z2));
            r15.startReplaceGroup(1966756105);
            textFieldSelectionManager42.platformSelectionBehaviors = PlatformSelectionBehaviors_androidKt.rememberPlatformSelectionBehaviors(SelectedTextType.EditableText, textStyle3.spanStyle.localeList, r15, 6);
            r15.end(false);
            legacyTextFieldState6.getHasFocus();
            i9 = i8;
            int i222 = i9 & 7168;
            final TextInputService textInputService42 = textInputService3;
            int i232 = i7;
            boolean changedInstance52 = (i222 != 2048) | r15.changedInstance(legacyTextFieldState6) | ((i9 & 57344) != 16384) | r15.changedInstance(textInputService42) | (i232 != 4);
            i10 = (i9 & 112) ^ 48;
            if (i10 <= 32) {
            }
            z7 = changedInstance52;
            undoManager2 = undoManager;
            if ((i9 & 48) != 32) {
            }
            z8 = true;
            changedInstance = z7 | z8 | r15.changedInstance(offsetMapping82) | r15.changedInstance(coroutineScope32) | r15.changedInstance(bringIntoViewRequesterImpl22) | r15.changedInstance(textFieldSelectionManager42);
            Object rememberedValue16222 = r15.rememberedValue();
            if (changedInstance) {
            }
            final ImeOptions imeOptions5222 = imeOptions2;
            focusRequester = focusRequester3;
            i11 = i232;
            legacyTextFieldState2 = legacyTextFieldState6;
            obj4 = obj2;
            i12 = i222;
            obj3 = new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj6) {
                    TextLayoutResultProxy layoutResult;
                    FocusStateImpl focusStateImpl = (FocusStateImpl) obj6;
                    LegacyTextFieldState legacyTextFieldState73 = LegacyTextFieldState.this;
                    if (legacyTextFieldState73.getHasFocus() == focusStateImpl.isFocused()) {
                        return Unit.INSTANCE;
                    }
                    legacyTextFieldState73.hasFocus$delegate.setValue(Boolean.valueOf(focusStateImpl.isFocused()));
                    boolean hasFocus = legacyTextFieldState73.getHasFocus();
                    TextFieldValue textFieldValue43 = textFieldValue;
                    OffsetMapping offsetMapping93 = offsetMapping82;
                    if (hasFocus && z2 && !z3) {
                        KeyMappingKt.startInputSession(textInputService42, legacyTextFieldState73, textFieldValue43, imeOptions5222, offsetMapping93);
                    } else {
                        KeyMappingKt.endInputSession(legacyTextFieldState73);
                    }
                    if (focusStateImpl.isFocused() && (layoutResult = legacyTextFieldState73.getLayoutResult()) != null) {
                        JobKt.launch$default(coroutineScope32, null, null, new RealImageLoader$execute$result$1(bringIntoViewRequesterImpl22, textFieldValue43, legacyTextFieldState73, layoutResult, offsetMapping93, null, 5), 3);
                    }
                    if (!focusStateImpl.isFocused()) {
                        textFieldSelectionManager42.m456deselect_kEHs6E$foundation(null);
                    }
                    return Unit.INSTANCE;
                }
            };
            bringIntoViewRequesterImpl = bringIntoViewRequesterImpl22;
            offsetMapping2 = offsetMapping82;
            textFieldSelectionManager = textFieldSelectionManager42;
            textFieldValue2 = textFieldValue;
            coroutineScope = coroutineScope32;
            z9 = z2;
            textInputService42 = textInputService42;
            imeOptions3 = imeOptions5222;
            r15.updateRememberedValue(obj3);
            Modifier.Companion companion3222 = Modifier.Companion.$$INSTANCE;
            Modifier focusable222 = CanvasKt.focusable(FocusOwnerImplKt.onFocusChanged(FocusTraversalKt.focusRequester(companion3222, focusRequester), (Function1) obj3), z9, mutableInteractionSourceImpl);
            MutableState rememberUpdatedState222 = Updater.rememberUpdatedState(Boolean.valueOf((z9 || z3) ? false : true), r15);
            Unit unit2222 = Unit.INSTANCE;
            boolean changed5222 = r15.changed(rememberUpdatedState222) | r15.changedInstance(legacyTextFieldState2) | r15.changedInstance(textInputService42) | r15.changedInstance(textFieldSelectionManager);
            if (i10 > 32) {
            }
            legacyTextFieldState3 = legacyTextFieldState2;
            if ((i9 & 48) != 32) {
            }
            z10 = true;
            z11 = changed5222 | z10;
            Object rememberedValue172222 = r15.rememberedValue();
            if (z11) {
            }
            textFieldSelectionManager2 = textFieldSelectionManager;
            unit = unit2222;
            coroutineScope2 = coroutineScope;
            offsetMapping3 = offsetMapping2;
            modifier2 = focusable222;
            legacyTextFieldState4 = legacyTextFieldState3;
            companion = companion3222;
            focusRequester2 = focusRequester;
            mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
            TextInputService textInputService52222 = textInputService42;
            realImageLoader$execute$result$1 = new RealImageLoader$execute$result$1(legacyTextFieldState4, rememberUpdatedState222, textInputService52222, textFieldSelectionManager2, imeOptions, null, 4);
            textInputService = textInputService52222;
            r15.updateRememberedValue(realImageLoader$execute$result$1);
            Updater.LaunchedEffect((Composer) r15, unit, (Function2) realImageLoader$execute$result$1);
            Modifier pointerInput3222 = SuspendingPointerInputFilterKt.pointerInput(companion, 8675309, new TaxTooltipView$Content$1$1$1(1, new CoreTextFieldKt$$ExternalSyntheticLambda2(legacyTextFieldState4, 4)));
            textFieldSelectionManager3 = textFieldSelectionManager2;
            offsetMapping4 = offsetMapping3;
            TextFieldPointerModifier_commonKt$$ExternalSyntheticLambda1 textFieldPointerModifier_commonKt$$ExternalSyntheticLambda12222 = new TextFieldPointerModifier_commonKt$$ExternalSyntheticLambda1(legacyTextFieldState4, focusRequester2, z3, z2, textFieldSelectionManager3, offsetMapping4);
            if (z2) {
            }
            Modifier pointerInput22222 = SuspendingPointerInputFilterKt.pointerInput(pointerInput3222, textFieldSelectionManager3.mouseSelectionObserver, textFieldSelectionManager3.touchSelectionObserver, new SliderKt$sliderTapModifier$1(textFieldSelectionManager3, i13));
            PointerIcon.Companion.getClass();
            then = pointerInput22222.then(new PointerHoverIconModifierElement(PointerId.pointerIconText));
            final Modifier drawBehind2222 = ClipKt.drawBehind(companion, new MenuKt$$ExternalSyntheticLambda0(7, legacyTextFieldState4, textFieldValue2, offsetMapping4));
            boolean changedInstance62222 = r15.changedInstance(legacyTextFieldState4) | (i12 == 2048);
            windowInfo2 = windowInfo;
            int i242222 = i11;
            changed = changedInstance62222 | r15.changed(windowInfo2) | r15.changedInstance(textFieldSelectionManager3) | (i242222 == 4) | r15.changedInstance(offsetMapping4);
            rememberedValue5 = r15.rememberedValue();
            if (changed) {
            }
            LegacyTextFieldState legacyTextFieldState72222 = legacyTextFieldState4;
            TextFieldValue textFieldValue42222 = textFieldValue2;
            textInputService2 = textInputService;
            SessionQueries$$ExternalSyntheticLambda0 sessionQueries$$ExternalSyntheticLambda02222 = new SessionQueries$$ExternalSyntheticLambda0(1, legacyTextFieldState72222, windowInfo2, textFieldSelectionManager3, textFieldValue42222, offsetMapping4, z2);
            legacyTextFieldState4 = legacyTextFieldState72222;
            windowInfo3 = windowInfo2;
            r15.updateRememberedValue(sessionQueries$$ExternalSyntheticLambda02222);
            rememberedValue5 = sessionQueries$$ExternalSyntheticLambda02222;
            final Modifier onGloballyPositioned2222 = ValueInsets.onGloballyPositioned(companion, (Function1) rememberedValue5);
            LegacyTextFieldState legacyTextFieldState82222 = legacyTextFieldState4;
            TextInputService textInputService62222 = textInputService2;
            CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier2222 = new CoreTextFieldSemanticsModifier(transformedText, textFieldValue, legacyTextFieldState82222, z3, z2, offsetMapping4, textFieldSelectionManager3, imeOptions, focusRequester2);
            legacyTextFieldState5 = legacyTextFieldState82222;
            if (!z2 && !z3 && ((LazyWindowInfo) windowInfo3).isWindowFocused() && TextRange.m987getCollapsedimpl(((TextRange) legacyTextFieldState5.selectionPreviewHighlightRange$delegate.getValue()).packedValue) && TextRange.m987getCollapsedimpl(((TextRange) legacyTextFieldState5.deletionPreviewHighlightRange$delegate.getValue()).packedValue)) {
            }
            changedInstance2 = r15.changedInstance(textFieldSelectionManager3);
            rememberedValue6 = r15.rememberedValue();
            if (!changedInstance2) {
            }
            rememberedValue6 = new CoreTextFieldKt$$ExternalSyntheticLambda8(textFieldSelectionManager3, 0);
            r15.updateRememberedValue(rememberedValue6);
            Updater.DisposableEffect(textFieldSelectionManager3, (Function1) rememberedValue6, (Composer) r15);
            changedInstance3 = r15.changedInstance(legacyTextFieldState5) | r15.changedInstance(textInputService62222) | (i242222 == 4) | ((i10 <= 32 && r15.changed(imeOptions)) || (i9 & 48) == 32);
            rememberedValue7 = r15.rememberedValue();
            if (changedInstance3) {
            }
            n3$$ExternalSyntheticLambda0 n3__externalsyntheticlambda02222 = new n3$$ExternalSyntheticLambda0(legacyTextFieldState5, textInputService62222, textFieldValue, imeOptions, 5);
            imeOptions4 = imeOptions;
            r15.updateRememberedValue(n3__externalsyntheticlambda02222);
            rememberedValue7 = n3__externalsyntheticlambda02222;
            Updater.DisposableEffect(imeOptions4, (Function1) rememberedValue7, (Composer) r15);
            final Function1 coreTextFieldKt$$ExternalSyntheticLambda22222 = legacyTextFieldState5.onValueChange;
            if (i == 1) {
            }
            final OffsetMapping offsetMapping92222 = offsetMapping5;
            final int i252222 = imeOptions4.imeAction;
            final UndoManager undoManager32222 = undoManager2;
            Modifier composed2222 = PlatformKt.composed(companion, new Function3() { // from class: androidx.compose.foundation.text.TextFieldKeyInputKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj6, Object obj7, Object obj8) {
                    ((Integer) obj8).getClass();
                    GapComposer gapComposer4 = (GapComposer) ((Composer) obj7);
                    gapComposer4.startReplaceGroup(851809892);
                    Object rememberedValue18 = gapComposer4.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (rememberedValue18 == neverEqualPolicy) {
                        rememberedValue18 = new TextPreparedSelectionState();
                        gapComposer4.updateRememberedValue(rememberedValue18);
                    }
                    TextPreparedSelectionState textPreparedSelectionState = (TextPreparedSelectionState) rememberedValue18;
                    Object rememberedValue19 = gapComposer4.rememberedValue();
                    if (rememberedValue19 == neverEqualPolicy) {
                        rememberedValue19 = new DeadKeyCombiner();
                        gapComposer4.updateRememberedValue(rememberedValue19);
                    }
                    TextFieldKeyInput textFieldKeyInput = new TextFieldKeyInput(LegacyTextFieldState.this, textFieldSelectionManager3, textFieldValue, z142, z15, textPreparedSelectionState, offsetMapping92222, undoManager32222, (DeadKeyCombiner) rememberedValue19, coreTextFieldKt$$ExternalSyntheticLambda22222, i252222);
                    boolean changedInstance7 = gapComposer4.changedInstance(textFieldKeyInput);
                    Object rememberedValue20 = gapComposer4.rememberedValue();
                    if (changedInstance7 || rememberedValue20 == neverEqualPolicy) {
                        GraphLoop$processingQueue$1 graphLoop$processingQueue$1 = new GraphLoop$processingQueue$1(1, textFieldKeyInput, TextFieldKeyInput.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 2);
                        gapComposer4.updateRememberedValue(graphLoop$processingQueue$1);
                        rememberedValue20 = graphLoop$processingQueue$1;
                    }
                    Modifier onKeyEvent = KeyEventType.onKeyEvent(Modifier.Companion.$$INSTANCE, (Function1) ((KFunction) rememberedValue20));
                    gapComposer4.end(false);
                    return onKeyEvent;
                }
            });
            int i262222 = imeOptions4.keyboardType;
            if (i262222 == 7) {
            }
            boolean booleanValue22222 = ((Boolean) rememberUpdatedState222.getValue()).booleanValue();
            AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter322222 = androidLegacyPlatformTextInputServiceAdapter;
            changed2 = r15.changed(z12) | r15.changedInstance(androidLegacyPlatformTextInputServiceAdapter322222);
            rememberedValue8 = r15.rememberedValue();
            if (!changed2) {
            }
            rememberedValue8 = new b$$ExternalSyntheticLambda0(z12, androidLegacyPlatformTextInputServiceAdapter322222, 1);
            r15.updateRememberedValue(rememberedValue8);
            Modifier stylusHandwriting22222 = StylusHandwritingKt.stylusHandwriting(companion, booleanValue22222, z12, (Function0) rememberedValue8);
            Brush m344resolveAutofillHighlightWkMShQ22222 = AutofillHighlightKt.m344resolveAutofillHighlightWkMShQ((Brush) r15.consume(AutofillHighlightKt.LocalAutofillHighlightBrush), ((Color) r15.consume(AutofillHighlightKt.LocalAutofillHighlightColor)).value, ColorKt.Color(1308617531));
            changedInstance4 = r15.changedInstance(legacyTextFieldState5) | r15.changed(m344resolveAutofillHighlightWkMShQ22222);
            rememberedValue9 = r15.rememberedValue();
            if (!changedInstance4) {
            }
            rememberedValue9 = new ClickableKt$$ExternalSyntheticLambda0(29, legacyTextFieldState5, m344resolveAutofillHighlightWkMShQ22222);
            r15.updateRememberedValue(rememberedValue9);
            Modifier then222222 = MathUtilsKt.legacyTextInputAdapter(modifier.then(ClipKt.drawWithContent(companion, (Function1) rememberedValue9)), androidLegacyPlatformTextInputServiceAdapter322222, legacyTextFieldState5, textFieldSelectionManager3).then(stylusHandwriting22222).then(modifier2);
            int i2722222 = 3;
            final TextFieldScrollerPosition textFieldScrollerPosition322222 = textFieldScrollerPosition;
            Modifier addTextContextMenuComponentsWithContext22222 = TextContextMenuGesturesModifierKt.addTextContextMenuComponentsWithContext(ValueInsets.onGloballyPositioned(PlatformKt.composed(KeyEventType.onPreviewKeyEvent(KeyEventType.onPreviewKeyEvent(then222222, new Latch$await$2$2(i2722222, focusOwnerImpl2, legacyTextFieldState5)), new Latch$await$2$2(2, legacyTextFieldState5, textFieldSelectionManager3)).then(composed2222), new EducationalSheetKt$$ExternalSyntheticLambda8(textFieldScrollerPosition322222, z2, mutableInteractionSourceImpl, 1)).then(then).then(coreTextFieldSemanticsModifier2222), new CoreTextFieldKt$$ExternalSyntheticLambda2(legacyTextFieldState5, 0)), new TextKt$$ExternalSyntheticLambda0(15, textFieldSelectionManager3, coroutineScope2));
            if (!z2) {
            }
            if (i14 == 0) {
            }
            final Modifier modifier422222 = modifier3;
            final BringIntoViewRequesterImpl bringIntoViewRequesterImpl322222 = bringIntoViewRequesterImpl;
            final Modifier companion422222 = companion2;
            final LegacyTextFieldState legacyTextFieldState922222 = legacyTextFieldState5;
            final boolean r15222222 = i14;
            Function2 function222222 = new Function2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj6, Object obj7) {
                    Composer composer2 = (Composer) obj6;
                    int intValue = ((Integer) obj7).intValue();
                    GapComposer gapComposer4 = (GapComposer) composer2;
                    if (gapComposer4.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                        final LegacyTextFieldState legacyTextFieldState10 = legacyTextFieldState922222;
                        final TextStyle textStyle4 = textStyle;
                        final int i28 = i2;
                        final int i29 = i;
                        final TextFieldScrollerPosition textFieldScrollerPosition4 = textFieldScrollerPosition322222;
                        final TextFieldValue textFieldValue5 = textFieldValue;
                        final VisualTransformation visualTransformation2 = visualTransformation;
                        final Modifier modifier5 = companion422222;
                        final Modifier modifier6 = drawBehind2222;
                        final Modifier modifier7 = onGloballyPositioned2222;
                        final Modifier modifier8 = modifier422222;
                        final BringIntoViewRequesterImpl bringIntoViewRequesterImpl4 = bringIntoViewRequesterImpl322222;
                        final TextFieldSelectionManager textFieldSelectionManager5 = textFieldSelectionManager3;
                        final boolean z16 = r15222222;
                        final boolean z17 = z3;
                        final Function1 function13 = function12;
                        final OffsetMapping offsetMapping10 = offsetMapping92222;
                        final Density density4 = density3;
                        Function3.this.invoke(Expect_jvmKt.rememberComposableLambda(-44346382, new Function2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda13
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj8, Object obj9) {
                                Modifier verticalScrollLayoutModifier;
                                Composer composer3 = (Composer) obj8;
                                int intValue2 = ((Integer) obj9).intValue();
                                GapComposer gapComposer5 = (GapComposer) composer3;
                                if (gapComposer5.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    LegacyTextFieldState legacyTextFieldState11 = LegacyTextFieldState.this;
                                    Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(Modifier.Companion.$$INSTANCE, ((Dp) legacyTextFieldState11.minHeightForSingleLineField$delegate.getValue()).value, RecyclerView.DECELERATION_RATE, 2);
                                    int i30 = i28;
                                    int i31 = i29;
                                    BasicTextKt.validateMinMaxLines(i30, i31);
                                    TextStyle textStyle5 = textStyle4;
                                    if (i30 != 1 || i31 != Integer.MAX_VALUE) {
                                        m279heightInVpY3zN4$default = m279heightInVpY3zN4$default.then(new HeightInLinesElement(textStyle5, i30, i31));
                                    }
                                    boolean changedInstance7 = gapComposer5.changedInstance(legacyTextFieldState11);
                                    Object rememberedValue18 = gapComposer5.rememberedValue();
                                    if (changedInstance7 || rememberedValue18 == Composer.Companion.Empty) {
                                        rememberedValue18 = new Threads$$ExternalSyntheticLambda1(legacyTextFieldState11, 20);
                                        gapComposer5.updateRememberedValue(rememberedValue18);
                                    }
                                    Function0 function0 = (Function0) rememberedValue18;
                                    TextFieldScrollerPosition textFieldScrollerPosition5 = textFieldScrollerPosition4;
                                    Orientation orientation2 = (Orientation) textFieldScrollerPosition5.orientation$delegate.getValue();
                                    TextFieldValue textFieldValue6 = textFieldValue5;
                                    long j5 = textFieldValue6.selection;
                                    int i32 = TextRange.$r8$clinit;
                                    int i33 = (int) (j5 >> 32);
                                    long j6 = textFieldScrollerPosition5.previousSelection;
                                    if (i33 == ((int) (j6 >> 32)) && (i33 = (int) (j5 & BodyPartID.bodyIdMax)) == ((int) (j6 & BodyPartID.bodyIdMax))) {
                                        i33 = TextRange.m990getMinimpl(j5);
                                    }
                                    textFieldScrollerPosition5.previousSelection = textFieldValue6.selection;
                                    TransformedText filterWithValidation2 = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, textFieldValue6.annotatedString);
                                    int ordinal = orientation2.ordinal();
                                    if (ordinal == 0) {
                                        verticalScrollLayoutModifier = new VerticalScrollLayoutModifier(textFieldScrollerPosition5, i33, filterWithValidation2, function0);
                                    } else {
                                        if (ordinal != 1) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        }
                                        verticalScrollLayoutModifier = new HorizontalScrollLayoutModifier(textFieldScrollerPosition5, i33, filterWithValidation2, function0);
                                    }
                                    SimpleLayoutKt.SimpleLayout(BringIntoViewRequesterKt.bringIntoViewRequester(ClipKt.clipToBounds(m279heightInVpY3zN4$default).then(verticalScrollLayoutModifier).then(modifier5).then(modifier6).then(new TextFieldSizeElement(textStyle5)).then(modifier7).then(modifier8), bringIntoViewRequesterImpl4), Expect_jvmKt.rememberComposableLambda(1412697320, new CalendarRowKt$$ExternalSyntheticLambda2(textFieldSelectionManager5, legacyTextFieldState11, z16, z17, function13, textFieldValue6, offsetMapping10, density4, i31), gapComposer5), gapComposer5, 48);
                                } else {
                                    gapComposer5.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer4), gapComposer4, 6);
                    } else {
                        gapComposer4.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            };
            gapComposer = r15;
            CoreTextFieldRootBox(addTextContextMenuComponentsWithContext22222, textFieldSelectionManager3, Expect_jvmKt.rememberComposableLambda(-814563849, function222222, gapComposer), gapComposer, MLKEMEngine.KyberPolyBytes);
        } else {
            gapComposer = gapComposer3;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj6, Object obj7) {
                    ((Integer) obj7).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(i3 | 1);
                    int updateChangedFlags2 = Updater.updateChangedFlags(i4);
                    KeyMappingKt.CoreTextField(TextFieldValue.this, function1, modifier, textStyle, visualTransformation, function12, mutableInteractionSourceImpl, brush, z, i, i2, imeOptions, keyboardActions, z2, z3, function3, (Composer) obj6, updateChangedFlags, updateChangedFlags2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void CoreTextFieldRootBox(Modifier modifier, TextFieldSelectionManager textFieldSelectionManager, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2036174316);
        int i2 = (gapComposer.changed(modifier) ? 4 : 2) | i | (gapComposer.changedInstance(textFieldSelectionManager) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, true);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            BasicTextKt.ContextMenuArea(textFieldSelectionManager, composableLambdaImpl, gapComposer, (i2 >> 3) & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MenuKt$$ExternalSyntheticLambda1(modifier, textFieldSelectionManager, composableLambdaImpl, i, 2);
        }
    }

    public static final void SelectionToolbarAndHandles(TextFieldSelectionManager textFieldSelectionManager, boolean z, Composer composer, int i) {
        TextLayoutResultProxy layoutResult;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(626339208);
        int i2 = (gapComposer.changedInstance(textFieldSelectionManager) ? 4 : 2) | i | (gapComposer.changed(z) ? 32 : 16);
        int i3 = 1;
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else if (z) {
            gapComposer.startReplaceGroup(1530097388);
            LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.state;
            TextLayoutResult textLayoutResult = null;
            if (legacyTextFieldState != null && (layoutResult = legacyTextFieldState.getLayoutResult()) != null) {
                TextLayoutResult textLayoutResult2 = layoutResult.value;
                LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager.state;
                if (!(legacyTextFieldState2 != null ? legacyTextFieldState2.isLayoutResultStale : true)) {
                    textLayoutResult = textLayoutResult2;
                }
            }
            if (textLayoutResult == null) {
                gapComposer.startReplaceGroup(1530097387);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1530097388);
                if (TextRange.m987getCollapsedimpl(textFieldSelectionManager.getValue$foundation().selection)) {
                    gapComposer.startReplaceGroup(2110860558);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(2109807302);
                    int originalToTransformed = textFieldSelectionManager.offsetMapping.originalToTransformed((int) (textFieldSelectionManager.getValue$foundation().selection >> 32));
                    int originalToTransformed2 = textFieldSelectionManager.offsetMapping.originalToTransformed((int) (textFieldSelectionManager.getValue$foundation().selection & BodyPartID.bodyIdMax));
                    ResolvedTextDirection bidiRunDirection = textLayoutResult.getBidiRunDirection(originalToTransformed);
                    ResolvedTextDirection bidiRunDirection2 = textLayoutResult.getBidiRunDirection(Math.max(originalToTransformed2 - 1, 0));
                    LegacyTextFieldState legacyTextFieldState3 = textFieldSelectionManager.state;
                    if (legacyTextFieldState3 == null || !((Boolean) legacyTextFieldState3.showSelectionHandleStart$delegate.getValue()).booleanValue()) {
                        gapComposer.startReplaceGroup(2110490542);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(2110225306);
                        SimpleLayoutKt.TextFieldSelectionHandle(true, bidiRunDirection, textFieldSelectionManager, gapComposer, ((i2 << 6) & 896) | 6);
                        gapComposer.end(false);
                    }
                    LegacyTextFieldState legacyTextFieldState4 = textFieldSelectionManager.state;
                    if (legacyTextFieldState4 == null || !((Boolean) legacyTextFieldState4.showSelectionHandleEnd$delegate.getValue()).booleanValue()) {
                        gapComposer.startReplaceGroup(2110838734);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(2110574459);
                        SimpleLayoutKt.TextFieldSelectionHandle(false, bidiRunDirection2, textFieldSelectionManager, gapComposer, ((i2 << 6) & 896) | 6);
                        gapComposer.end(false);
                    }
                    gapComposer.end(false);
                }
                LegacyTextFieldState legacyTextFieldState5 = textFieldSelectionManager.state;
                if (legacyTextFieldState5 != null) {
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState = legacyTextFieldState5.showFloatingToolbar$delegate;
                    if (!Intrinsics.areEqual(textFieldSelectionManager.oldValue.annotatedString.text, textFieldSelectionManager.getValue$foundation().annotatedString.text)) {
                        parcelableSnapshotMutableState.setValue(Boolean.FALSE);
                    }
                    if (legacyTextFieldState5.getHasFocus()) {
                        if (((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue()) {
                            textFieldSelectionManager.showSelectionToolbar$foundation();
                        } else {
                            textFieldSelectionManager.hideSelectionToolbar$foundation();
                        }
                    }
                }
                gapComposer.end(false);
            }
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(1989076778);
            gapComposer.end(false);
            textFieldSelectionManager.hideSelectionToolbar$foundation();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SliderDefaults$$ExternalSyntheticLambda0(textFieldSelectionManager, z, i, i3);
        }
    }

    public static final void TextFieldCursorHandle(final TextFieldSelectionManager textFieldSelectionManager, Composer composer, int i) {
        AnnotatedString transformedText$foundation;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1436003720);
        int i2 = 4;
        int i3 = 2;
        int i4 = (gapComposer.changedInstance(textFieldSelectionManager) ? 4 : 2) | i;
        int i5 = 1;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 3) != 2)) {
            LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.state;
            if (legacyTextFieldState == null || !((Boolean) legacyTextFieldState.showCursorHandle$delegate.getValue()).booleanValue() || (transformedText$foundation = textFieldSelectionManager.getTransformedText$foundation()) == null || transformedText$foundation.text.length() <= 0) {
                gapComposer.startReplaceGroup(-2111042550);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-2112351432);
                boolean changed = gapComposer.changed(textFieldSelectionManager);
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (changed || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$cursorDragObserver$1
                        @Override // androidx.compose.foundation.text.TextDragObserver
                        public final void onCancel() {
                        }

                        @Override // androidx.compose.foundation.text.TextDragObserver
                        /* renamed from: onDown-k-4lQ0M */
                        public final void mo365onDownk4lQ0M() {
                        }

                        @Override // androidx.compose.foundation.text.TextDragObserver
                        /* renamed from: onDrag-k-4lQ0M */
                        public final void mo366onDragk4lQ0M(long j) {
                            TextLayoutResultProxy layoutResult;
                            PlatformHapticFeedback platformHapticFeedback;
                            TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                            textFieldSelectionManager2.dragTotalDistance = Offset.m626plusMKHz9U(textFieldSelectionManager2.dragTotalDistance, j);
                            LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager2.state;
                            if (legacyTextFieldState2 == null || (layoutResult = legacyTextFieldState2.getLayoutResult()) == null) {
                                return;
                            }
                            textFieldSelectionManager2.currentDragPosition$delegate.setValue(new Offset(Offset.m626plusMKHz9U(textFieldSelectionManager2.dragBeginPosition, textFieldSelectionManager2.dragTotalDistance)));
                            OffsetMapping offsetMapping = textFieldSelectionManager2.offsetMapping;
                            Offset m457getCurrentDragPosition_m7T9E = textFieldSelectionManager2.m457getCurrentDragPosition_m7T9E();
                            m457getCurrentDragPosition_m7T9E.getClass();
                            int transformedToOriginal = offsetMapping.transformedToOriginal(layoutResult.m369getOffsetForPosition3MmeM6k(m457getCurrentDragPosition_m7T9E.packedValue, true));
                            long TextRange = coil3.size.SizeKt.TextRange(transformedToOriginal, transformedToOriginal);
                            if (TextRange.m986equalsimpl0(TextRange, textFieldSelectionManager2.getValue$foundation().selection)) {
                                return;
                            }
                            LegacyTextFieldState legacyTextFieldState3 = textFieldSelectionManager2.state;
                            if ((legacyTextFieldState3 == null || ((Boolean) legacyTextFieldState3.isInTouchMode$delegate.getValue()).booleanValue()) && (platformHapticFeedback = textFieldSelectionManager2.hapticFeedBack) != null) {
                                platformHapticFeedback.m769performHapticFeedbackCdsT49E(9);
                            }
                            textFieldSelectionManager2.onValueChange.invoke(TextFieldSelectionManager.m455createTextFieldValueFDrldGo(textFieldSelectionManager2.getValue$foundation().annotatedString, TextRange));
                            textFieldSelectionManager2.latestSelection = new TextRange(TextRange);
                        }

                        @Override // androidx.compose.foundation.text.TextDragObserver
                        /* renamed from: onStart-3MmeM6k */
                        public final void mo367onStart3MmeM6k(long j, SelectionAdjustment$Companion$$ExternalSyntheticLambda0 selectionAdjustment$Companion$$ExternalSyntheticLambda0) {
                            TextLayoutResultProxy layoutResult;
                            TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                            long m442getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m442getAdjustedCoordinatesk4lQ0M(textFieldSelectionManager2.m458getHandlePositiontuRUvjQ$foundation(true));
                            LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager2.state;
                            if (legacyTextFieldState2 == null || (layoutResult = legacyTextFieldState2.getLayoutResult()) == null) {
                                return;
                            }
                            long m372translateInnerToDecorationCoordinatesMKHz9U$foundation = layoutResult.m372translateInnerToDecorationCoordinatesMKHz9U$foundation(m442getAdjustedCoordinatesk4lQ0M);
                            textFieldSelectionManager2.dragBeginPosition = m372translateInnerToDecorationCoordinatesMKHz9U$foundation;
                            textFieldSelectionManager2.currentDragPosition$delegate.setValue(new Offset(m372translateInnerToDecorationCoordinatesMKHz9U$foundation));
                            textFieldSelectionManager2.dragTotalDistance = 0L;
                            textFieldSelectionManager2.draggingHandle$delegate.setValue(Handle.Cursor);
                            textFieldSelectionManager2.updateFloatingToolbar(false);
                        }

                        @Override // androidx.compose.foundation.text.TextDragObserver
                        public final void onStop() {
                            TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                            textFieldSelectionManager2.draggingHandle$delegate.setValue(null);
                            textFieldSelectionManager2.currentDragPosition$delegate.setValue(null);
                        }

                        @Override // androidx.compose.foundation.text.TextDragObserver
                        public final void onUp() {
                            TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                            textFieldSelectionManager2.draggingHandle$delegate.setValue(null);
                            textFieldSelectionManager2.currentDragPosition$delegate.setValue(null);
                        }
                    };
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                TextDragObserver textDragObserver = (TextDragObserver) rememberedValue;
                Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
                OffsetMapping offsetMapping = textFieldSelectionManager.offsetMapping;
                long j = textFieldSelectionManager.getValue$foundation().selection;
                int i6 = TextRange.$r8$clinit;
                int originalToTransformed = offsetMapping.originalToTransformed((int) (j >> 32));
                LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager.state;
                TextLayoutResultProxy layoutResult = legacyTextFieldState2 != null ? legacyTextFieldState2.getLayoutResult() : null;
                layoutResult.getClass();
                TextLayoutResult textLayoutResult = layoutResult.value;
                Rect cursorRect = textLayoutResult.getCursorRect(RangesKt___RangesKt.coerceIn(originalToTransformed, 0, textLayoutResult.layoutInput.text.text.length()));
                final long floatToRawIntBits = (Float.floatToRawIntBits((density.mo236toPx0680j_4(2.0f) / 2.0f) + cursorRect.left) << 32) | (BodyPartID.bodyIdMax & Float.floatToRawIntBits(cursorRect.bottom));
                boolean changed2 = gapComposer.changed(floatToRawIntBits);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed2 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new OffsetProvider() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        /* renamed from: provide-F1C5BW0 */
                        public final long mo345provideF1C5BW0() {
                            return floatToRawIntBits;
                        }
                    };
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                OffsetProvider offsetProvider = (OffsetProvider) rememberedValue2;
                boolean changedInstance = gapComposer.changedInstance(textDragObserver) | gapComposer.changedInstance(textFieldSelectionManager);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new LocalViewFactory$createUi$view$3$1$1$1(i5, textDragObserver, textFieldSelectionManager);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion.$$INSTANCE, textDragObserver, (PointerInputEventHandler) rememberedValue3);
                boolean changed3 = gapComposer.changed(floatToRawIntBits);
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (changed3 || rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new c7$$ExternalSyntheticLambda6(floatToRawIntBits, i3);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                AndroidCursorHandle_androidKt.m343CursorHandleUSBMPiE(offsetProvider, SemanticsModifierKt.semantics(pointerInput, false, (Function1) rememberedValue4), 0L, gapComposer, 0, 4);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HintHandler$$ExternalSyntheticLambda0(textFieldSelectionManager, i, i2);
        }
    }

    public static final Rect access$getCursorRectInScroller(Placeable.PlacementScope placementScope, int i, TransformedText transformedText, TextLayoutResult textLayoutResult, boolean z, int i2) {
        Rect cursorRect = textLayoutResult != null ? textLayoutResult.getCursorRect(transformedText.offsetMapping.originalToTransformed(i)) : Rect.Zero;
        float f = cursorRect.left;
        int mo230roundToPx0680j_4 = placementScope.mo230roundToPx0680j_4(2.0f);
        return Rect.copy$default(cursorRect, z ? (i2 - f) - mo230roundToPx0680j_4 : f, z ? i2 - f : mo230roundToPx0680j_4 + f, RecyclerView.DECELERATION_RATE, 10);
    }

    /* renamed from: access$isKeyCode-YhN2O0w, reason: not valid java name */
    public static final boolean m352access$isKeyCodeYhN2O0w(int i, KeyEvent keyEvent) {
        return ((int) (KeyEventType.m782getKeyZmokQxo(keyEvent) >> 32)) == i;
    }

    public static final void appendInlineContent(AnnotatedString.Builder builder, String str, String str2) {
        if (str2.length() <= 0) {
            InlineClassHelperKt.throwIllegalArgumentException("alternateText can't be an empty string.");
        }
        AnnotatedString.Builder.MutableRange mutableRange = new AnnotatedString.Builder.MutableRange(new StringAnnotation(str), builder.text.length(), 0, 4);
        ArrayList arrayList = builder.styleStack;
        arrayList.add(mutableRange);
        builder.annotations.add(mutableRange);
        arrayList.size();
        builder.append(str2);
        builder.pop();
    }

    public static final long autofillHighlightColor() {
        return ColorKt.Color(1308617531);
    }

    /* renamed from: cancelsTextSelection-ZmokQxo, reason: not valid java name */
    public static final boolean m353cancelsTextSelectionZmokQxo(KeyEvent keyEvent) {
        return keyEvent.getKeyCode() == 4 && KeyEventType.m790getTypeZmokQxo(keyEvent) == 1;
    }

    public static final Object detectDownAndDragGesturesWithObserver(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, Continuation continuation) {
        Object coroutineScope = JobKt.coroutineScope(new AnimatedImageDecoder$wrapDrawable$2(pointerInputScope, textDragObserver, (Continuation) null, 2), continuation);
        return coroutineScope == CoroutineSingletons.COROUTINE_SUSPENDED ? coroutineScope : Unit.INSTANCE;
    }

    public static final void endInputSession(LegacyTextFieldState legacyTextFieldState) {
        TextInputSession textInputSession = legacyTextFieldState.inputSession;
        if (textInputSession != null) {
            legacyTextFieldState.onValueChange.invoke(TextFieldValue.m1001copy3r_uNRQ$default((TextFieldValue) legacyTextFieldState.processor.val$videoEncoderSession, (AnnotatedString) null, 0L, 3));
            TextInputService textInputService = textInputSession.textInputService;
            AtomicReference atomicReference = textInputService._currentInputSession;
            while (true) {
                if (atomicReference.compareAndSet(textInputSession, null)) {
                    textInputService.platformTextInputService.stopInput();
                    break;
                } else if (atomicReference.get() != textInputSession) {
                    break;
                }
            }
        }
        legacyTextFieldState.inputSession = null;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m354equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int findFollowingBreak(int i, String str) {
        String str2;
        int i2;
        EmojiCompat emojiCompatIfLoaded = getEmojiCompatIfLoaded();
        Integer num = null;
        if (emojiCompatIfLoaded != null) {
            TransactorKt.checkState("Not initialized yet", emojiCompatIfLoaded.isInitialized());
            TransactorKt.checkNotNull(str, "charSequence cannot be null");
            Recorder.AnonymousClass3 anonymousClass3 = emojiCompatIfLoaded.mHelper.mProcessor;
            anonymousClass3.getClass();
            if (i < 0 || i >= str.length()) {
                str2 = str;
                i2 = -1;
            } else {
                if (str instanceof Spanned) {
                    Spanned spanned = (Spanned) str;
                    TypefaceEmojiSpan[] typefaceEmojiSpanArr = (TypefaceEmojiSpan[]) spanned.getSpans(i, i + 1, TypefaceEmojiSpan.class);
                    if (typefaceEmojiSpanArr.length > 0) {
                        i2 = spanned.getSpanEnd(typefaceEmojiSpanArr[0]);
                        str2 = str;
                    }
                }
                str2 = str;
                i2 = ((EmojiProcessor$EmojiProcessLookupCallback) anonymousClass3.process(str2, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new EmojiProcessor$EmojiProcessLookupCallback(i))).end;
            }
            Integer valueOf = Integer.valueOf(i2);
            if (i2 != -1) {
                num = valueOf;
            }
        } else {
            str2 = str;
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str2);
        return characterInstance.following(i);
    }

    public static final int findParagraphEnd(int i, CharSequence charSequence) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static final int findParagraphStart(int i, CharSequence charSequence) {
        while (i > 0) {
            if (charSequence.charAt(i - 1) == '\n') {
                return i;
            }
            i--;
        }
        return 0;
    }

    public static final int findPrecedingBreak(int i, String str) {
        EmojiCompat emojiCompatIfLoaded = getEmojiCompatIfLoaded();
        Integer num = null;
        if (emojiCompatIfLoaded != null) {
            Integer valueOf = Integer.valueOf(emojiCompatIfLoaded.getEmojiStart(Math.max(0, i - 1), str));
            if (valueOf.intValue() != -1) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    public static void getDefault() {
        KeyboardActions keyboardActions = KeyboardActions.Default;
    }

    public static final EmojiCompat getEmojiCompatIfLoaded() {
        if (!EmojiCompat.isConfigured()) {
            return null;
        }
        EmojiCompat emojiCompat = EmojiCompat.get();
        if (emojiCompat.getLoadState() == 1) {
            return emojiCompat;
        }
        return null;
    }

    public static final float getLineHeight(TextLayoutResult textLayoutResult, int i) {
        if (i < 0) {
            return RecyclerView.DECELERATION_RATE;
        }
        TextLayoutInput textLayoutInput = textLayoutResult.layoutInput;
        MultiParagraph multiParagraph = textLayoutResult.multiParagraph;
        if (textLayoutInput.text.text.length() == 0) {
            return RecyclerView.DECELERATION_RATE;
        }
        int min = Math.min(multiParagraph.getLineForOffset(i), Math.min(multiParagraph.maxLines - 1, multiParagraph.lineCount - 1));
        if (i > multiParagraph.getLineEnd(min, false)) {
            return RecyclerView.DECELERATION_RATE;
        }
        multiParagraph.requireLineIndexInRange(min);
        ArrayList arrayList = multiParagraph.paragraphInfoList;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(DBUtil.findParagraphByLineIndex(min, arrayList));
        AndroidParagraph androidParagraph = paragraphInfo.paragraph;
        int i2 = min - paragraphInfo.startLineIndex;
        TextLayout textLayout = androidParagraph.layout;
        return textLayout.getLineBottom(i2) - textLayout.getLineTop(i2);
    }

    /* renamed from: getModifiers-ZmokQxo, reason: not valid java name */
    public static final int m355getModifiersZmokQxo(KeyEvent keyEvent) {
        return (keyEvent.isAltPressed() ? 1 : 0) | (keyEvent.isCtrlPressed() ? 2 : 0) | (keyEvent.isMetaPressed() ? 4 : 0) | (keyEvent.isShiftPressed() ? 8 : 0);
    }

    /* renamed from: isTypedEvent-ZmokQxo, reason: not valid java name */
    public static final boolean m356isTypedEventZmokQxo(KeyEvent keyEvent) {
        return keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar());
    }

    public static final void notifyFocusedRect(LegacyTextFieldState legacyTextFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping) {
        Snapshot currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
        Function1 readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
            if (layoutResult == null) {
                return;
            }
            TextInputSession textInputSession = legacyTextFieldState.inputSession;
            if (textInputSession == null) {
                return;
            }
            LayoutCoordinates layoutCoordinates = legacyTextFieldState.getLayoutCoordinates();
            if (layoutCoordinates == null) {
                return;
            }
            notifyFocusedRect$foundation(textFieldValue, legacyTextFieldState.textDelegate, layoutResult.value, layoutCoordinates, textInputSession, legacyTextFieldState.getHasFocus(), offsetMapping);
        } finally {
            zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
        }
    }

    public static void notifyFocusedRect$foundation(TextFieldValue textFieldValue, TextDelegate textDelegate, TextLayoutResult textLayoutResult, LayoutCoordinates layoutCoordinates, TextInputSession textInputSession, boolean z, OffsetMapping offsetMapping) {
        long computeSizeForDefaultText;
        Rect rect;
        if (z) {
            int originalToTransformed = offsetMapping.originalToTransformed(TextRange.m989getMaximpl(textFieldValue.selection));
            String str = TextFieldDelegateKt.EmptyTextReplacement;
            if (originalToTransformed < textLayoutResult.layoutInput.text.text.length()) {
                rect = textLayoutResult.getBoundingBox(originalToTransformed);
            } else if (originalToTransformed != 0) {
                rect = textLayoutResult.getBoundingBox(originalToTransformed - 1);
            } else {
                computeSizeForDefaultText = TextFieldDelegateKt.computeSizeForDefaultText(textDelegate.style, textDelegate.density, textDelegate.fontFamilyResolver, TextFieldDelegateKt.EmptyTextReplacement, 1);
                rect = new Rect(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f, (int) (computeSizeForDefaultText & BodyPartID.bodyIdMax));
            }
            float f = rect.top;
            float f2 = rect.left;
            long mo841localToRootMKHz9U = layoutCoordinates.mo841localToRootMKHz9U((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f) & BodyPartID.bodyIdMax));
            float intBitsToFloat = Float.intBitsToFloat((int) (mo841localToRootMKHz9U >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (mo841localToRootMKHz9U & BodyPartID.bodyIdMax));
            long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
            float f3 = rect.right - f2;
            float f4 = rect.bottom - f;
            Rect m1180Recttz77jQw = DBUtil.m1180Recttz77jQw(floatToRawIntBits, (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f4) & BodyPartID.bodyIdMax));
            if (Intrinsics.areEqual((TextInputSession) textInputSession.textInputService._currentInputSession.get(), textInputSession)) {
                textInputSession.platformTextInputService.notifyFocusedRect(m1180Recttz77jQw);
            }
        }
    }

    public static final void startInputSession(TextInputService textInputService, LegacyTextFieldState legacyTextFieldState, TextFieldValue textFieldValue, ImeOptions imeOptions, OffsetMapping offsetMapping) {
        Recorder.AnonymousClass1 anonymousClass1 = legacyTextFieldState.processor;
        CoreTextFieldKt$$ExternalSyntheticLambda2 coreTextFieldKt$$ExternalSyntheticLambda2 = legacyTextFieldState.onValueChange;
        CoreTextFieldKt$$ExternalSyntheticLambda2 coreTextFieldKt$$ExternalSyntheticLambda22 = legacyTextFieldState.onImeActionPerformed;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        MenuKt$$ExternalSyntheticLambda0 menuKt$$ExternalSyntheticLambda0 = new MenuKt$$ExternalSyntheticLambda0(9, anonymousClass1, coreTextFieldKt$$ExternalSyntheticLambda2, ref$ObjectRef);
        PlatformTextInputService platformTextInputService = textInputService.platformTextInputService;
        platformTextInputService.startInput(textFieldValue, imeOptions, menuKt$$ExternalSyntheticLambda0, coreTextFieldKt$$ExternalSyntheticLambda22);
        TextInputSession textInputSession = new TextInputSession(textInputService, platformTextInputService);
        textInputService._currentInputSession.set(textInputSession);
        ref$ObjectRef.element = textInputSession;
        legacyTextFieldState.inputSession = textInputSession;
        notifyFocusedRect(legacyTextFieldState, textFieldValue, offsetMapping);
    }

    public static final long timeNowMillis() {
        return System.currentTimeMillis();
    }
}
