package androidx.compose.foundation.text;

import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.HoverableElement;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda8;
import androidx.compose.material3.ThumbNode$onAttach$1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;
import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.navigation.Navigator$$ExternalSyntheticLambda0;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda0;
import androidx.paging.HintHandler$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.Headers;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public final class TextLinkScope {
    public final SnapshotStateList annotators;
    public AnnotatedString text;
    public final ParcelableSnapshotMutableState textLayoutResult$delegate = Updater.mutableStateOf$default(null);

    public TextLinkScope(AnnotatedString annotatedString) {
        BasicTextKt$$ExternalSyntheticLambda14 basicTextKt$$ExternalSyntheticLambda14 = new BasicTextKt$$ExternalSyntheticLambda14(24);
        annotatedString.getClass();
        AnnotatedString.Builder builder = new AnnotatedString.Builder(annotatedString);
        ArrayList arrayList = builder.annotations;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            List list = (List) basicTextKt$$ExternalSyntheticLambda14.invoke(((AnnotatedString.Builder.MutableRange) arrayList.get(i)).toRange(PKIFailureInfo.systemUnavail));
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                AnnotatedString.Range range = (AnnotatedString.Range) list.get(i2);
                arrayList3.add(new AnnotatedString.Builder.MutableRange(range.item, range.start, range.end, range.tag));
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList3, arrayList2);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        this.text = builder.toAnnotatedString();
        this.annotators = new SnapshotStateList();
    }

    public static AnnotatedString.Range calculateVisibleLinkRange(AnnotatedString.Range range, TextLayoutResult textLayoutResult) {
        int lineEnd = textLayoutResult.multiParagraph.getLineEnd(r4.lineCount - 1, false);
        if (range.start < lineEnd) {
            return AnnotatedString.Range.copy$default(range, null, 0, Math.min(range.end, lineEnd), 11);
        }
        return null;
    }

    public final void LinksComposables(Composer composer, int i) {
        int i2;
        int i3;
        boolean z;
        Object obj;
        Modifier then;
        Modifier then2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1154651354);
        int i4 = 4;
        char c = 2;
        int i5 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        boolean z2 = false;
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 3) != 2)) {
            UriHandler uriHandler = (UriHandler) gapComposer.consume(CompositionLocalsKt.LocalUriHandler);
            AnnotatedString annotatedString = this.text;
            List linkAnnotations = annotatedString.getLinkAnnotations(0, annotatedString.text.length());
            int size = linkAnnotations.size();
            int i6 = 0;
            while (i6 < size) {
                AnnotatedString.Range range = (AnnotatedString.Range) linkAnnotations.get(i6);
                int i7 = range.start;
                Object obj2 = range.item;
                char c2 = c;
                if (i7 != range.end) {
                    gapComposer.startReplaceGroup(725478935);
                    Object rememberedValue = gapComposer.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    Object obj3 = rememberedValue;
                    if (rememberedValue == neverEqualPolicy) {
                        obj3 = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                    }
                    MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) obj3;
                    i3 = i4;
                    Modifier graphicsLayer = ColorKt.graphicsLayer(Modifier.Companion.$$INSTANCE, new Navigator$$ExternalSyntheticLambda0(i4, this, range));
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        BasicTextKt$$ExternalSyntheticLambda14 basicTextKt$$ExternalSyntheticLambda14 = new BasicTextKt$$ExternalSyntheticLambda14(25);
                        gapComposer.updateRememberedValue(basicTextKt$$ExternalSyntheticLambda14);
                        obj = basicTextKt$$ExternalSyntheticLambda14;
                    } else {
                        obj = rememberedValue2;
                    }
                    then = SemanticsModifierKt.semantics(graphicsLayer, z2, (Function1) obj).then(new TextRangeLayoutModifier(new CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0(8, this, range))).then(new HoverableElement(mutableInteractionSourceImpl));
                    PointerIcon.Companion.getClass();
                    then2 = then.then(new PointerHoverIconModifierElement(PointerId.pointerIconHand));
                    boolean changedInstance = gapComposer.changedInstance(this) | gapComposer.changed(range) | gapComposer.changedInstance(uriHandler);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    Object obj4 = rememberedValue3;
                    if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                        DialogHostKt$$ExternalSyntheticLambda0 dialogHostKt$$ExternalSyntheticLambda0 = new DialogHostKt$$ExternalSyntheticLambda0(this, range, uriHandler);
                        gapComposer.updateRememberedValue(dialogHostKt$$ExternalSyntheticLambda0);
                        obj4 = dialogHostKt$$ExternalSyntheticLambda0;
                    }
                    BoxKt.Box(ImageKt.m184combinedClickableauXiCPI$default(then2, mutableInteractionSourceImpl, null, false, null, null, null, null, (Function0) obj4, 508), gapComposer, 0);
                    LinkAnnotation linkAnnotation = (LinkAnnotation) obj2;
                    TextLinkStyles styles = linkAnnotation.getStyles();
                    if (styles == null || (styles.style == null && styles.focusedStyle == null && styles.hoveredStyle == null && styles.pressedStyle == null)) {
                        z = false;
                        gapComposer.startReplaceGroup(728331710);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(726303039);
                        Object rememberedValue4 = gapComposer.rememberedValue();
                        Object obj5 = rememberedValue4;
                        if (rememberedValue4 == neverEqualPolicy) {
                            LinkStateInteractionSourceObserver linkStateInteractionSourceObserver = new LinkStateInteractionSourceObserver(mutableInteractionSourceImpl);
                            gapComposer.updateRememberedValue(linkStateInteractionSourceObserver);
                            obj5 = linkStateInteractionSourceObserver;
                        }
                        LinkStateInteractionSourceObserver linkStateInteractionSourceObserver2 = (LinkStateInteractionSourceObserver) obj5;
                        Unit unit = Unit.INSTANCE;
                        Object rememberedValue5 = gapComposer.rememberedValue();
                        boolean z3 = false;
                        Object obj6 = rememberedValue5;
                        if (rememberedValue5 == neverEqualPolicy) {
                            ThumbNode$onAttach$1 thumbNode$onAttach$1 = new ThumbNode$onAttach$1((Object) linkStateInteractionSourceObserver2, (Continuation) (z3 ? 1 : 0), 21);
                            gapComposer.updateRememberedValue(thumbNode$onAttach$1);
                            obj6 = thumbNode$onAttach$1;
                        }
                        Updater.LaunchedEffect(gapComposer, unit, (Function2) obj6);
                        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = linkStateInteractionSourceObserver2.interactionState;
                        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = linkStateInteractionSourceObserver2.interactionState;
                        Boolean valueOf = Boolean.valueOf((parcelableSnapshotMutableIntState.getIntValue() & 2) != 0);
                        Boolean valueOf2 = Boolean.valueOf((parcelableSnapshotMutableIntState2.getIntValue() & 1) != 0);
                        Boolean valueOf3 = Boolean.valueOf((parcelableSnapshotMutableIntState2.getIntValue() & 4) != 0);
                        TextLinkStyles styles2 = linkAnnotation.getStyles();
                        SpanStyle spanStyle = styles2 != null ? styles2.style : null;
                        TextLinkStyles styles3 = linkAnnotation.getStyles();
                        SpanStyle spanStyle2 = styles3 != null ? styles3.focusedStyle : null;
                        TextLinkStyles styles4 = linkAnnotation.getStyles();
                        SpanStyle spanStyle3 = styles4 != null ? styles4.hoveredStyle : null;
                        TextLinkStyles styles5 = linkAnnotation.getStyles();
                        Object[] objArr = {valueOf, valueOf2, valueOf3, spanStyle, spanStyle2, spanStyle3, styles5 != null ? styles5.pressedStyle : null};
                        boolean changedInstance2 = gapComposer.changedInstance(this) | gapComposer.changed(range);
                        Object rememberedValue6 = gapComposer.rememberedValue();
                        Object obj7 = rememberedValue6;
                        if (changedInstance2 || rememberedValue6 == neverEqualPolicy) {
                            Navigator$$ExternalSyntheticLambda0 navigator$$ExternalSyntheticLambda0 = new Navigator$$ExternalSyntheticLambda0(3, this, range, linkStateInteractionSourceObserver2);
                            gapComposer.updateRememberedValue(navigator$$ExternalSyntheticLambda0);
                            obj7 = navigator$$ExternalSyntheticLambda0;
                        }
                        StyleAnnotation(objArr, (Function1) obj7, gapComposer, (i5 << 6) & 896);
                        z = false;
                        gapComposer.end(false);
                    }
                    gapComposer.end(z);
                } else {
                    i3 = i4;
                    z = z2;
                    gapComposer.startReplaceGroup(728345598);
                    gapComposer.end(z);
                }
                i6++;
                c = c2;
                z2 = z;
                i4 = i3;
            }
            i2 = 6;
        } else {
            i2 = 6;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HintHandler$$ExternalSyntheticLambda0(this, i, i2);
        }
    }

    public final void StyleAnnotation(Object[] objArr, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2083052099);
        int i2 = (i & 48) == 0 ? (gapComposer.changedInstance(function1) ? 32 : 16) | i : i;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(this) ? 256 : 128;
        }
        gapComposer.startMovableGroup(-358306546, Integer.valueOf(objArr.length));
        int i3 = i2 | (gapComposer.changed(objArr.length) ? 4 : 0);
        for (Object obj : objArr) {
            i3 |= gapComposer.changedInstance(obj) ? 4 : 0;
        }
        gapComposer.end(false);
        if ((i3 & 14) == 0) {
            i3 |= 2;
        }
        int i4 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Headers.Builder builder = new Headers.Builder(2);
            builder.add(function1);
            builder.addSpread(objArr);
            ArrayList arrayList = builder.namesAndValues;
            Object[] array2 = arrayList.toArray(new Object[arrayList.size()]);
            boolean changedInstance = gapComposer.changedInstance(this) | ((i3 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BasicTextKt$$ExternalSyntheticLambda6(this, function1, i4);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.DisposableEffect(array2, (Function1) rememberedValue, (Composer) gapComposer);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda8((Object) this, (Object) objArr, function1, i, 5);
        }
    }
}
