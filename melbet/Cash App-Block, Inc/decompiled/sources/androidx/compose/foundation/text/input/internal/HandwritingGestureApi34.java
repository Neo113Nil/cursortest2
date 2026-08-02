package androidx.compose.foundation.text.input.internal;

import android.os.CancellationSignal;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextHighlightType;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteSurroundingTextCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.SetSelectionCommand;
import androidx.paging.CachedPageEventFlow$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.SizeKt;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.Regex;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public abstract class HandwritingGestureApi34 {
    public static final void addVisibleLineBounds(CursorAnchorInfo.Builder builder, TextLayoutResult textLayoutResult, Rect rect) {
        if (rect.isEmpty()) {
            return;
        }
        MultiParagraph multiParagraph = textLayoutResult.multiParagraph;
        int i = multiParagraph.lineCount - 1;
        if (i < 0) {
            i = 0;
        }
        int coerceIn = RangesKt___RangesKt.coerceIn(multiParagraph.getLineForVerticalPosition(rect.top), 0, i);
        int coerceIn2 = RangesKt___RangesKt.coerceIn(multiParagraph.getLineForVerticalPosition(rect.bottom), 0, i);
        if (coerceIn > coerceIn2) {
            return;
        }
        while (true) {
            builder.addVisibleLineBounds(textLayoutResult.getLineLeft(coerceIn), multiParagraph.getLineTop(coerceIn), textLayoutResult.getLineRight(coerceIn), multiParagraph.getLineBottom(coerceIn));
            if (coerceIn == coerceIn2) {
                return;
            } else {
                coerceIn++;
            }
        }
    }

    public static int fallback(TransformedTextFieldState transformedTextFieldState, HandwritingGesture handwritingGesture) {
        TextFieldState textFieldState = transformedTextFieldState.textFieldState;
        InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.mainBuffer.getChangeTracker$foundation().clearChanges();
        TextFieldBuffer textFieldBuffer = textFieldState.mainBuffer;
        textFieldBuffer.highlight = null;
        transformedTextFieldState.updateWedgeAffinity(textFieldBuffer);
        TextFieldState.access$commitEditAsUser(textFieldState, inputTransformation, true, textFieldEditUndoBehavior);
        textFieldState.setUserCommit(true);
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        TransformedTextFieldState.replaceSelectedText$default(transformedTextFieldState, fallbackText, false, 12);
        return 5;
    }

    public static int fallbackOnLegacyTextField(HandwritingGesture handwritingGesture, CachedPageEventFlow$$ExternalSyntheticLambda0 cachedPageEventFlow$$ExternalSyntheticLambda0) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        cachedPageEventFlow$$ExternalSyntheticLambda0.invoke(new CommitTextCommand(fallbackText, 1));
        return 5;
    }

    /* renamed from: highlightRange-XJREzCE, reason: not valid java name */
    public static void m385highlightRangeXJREzCE(TransformedTextFieldState transformedTextFieldState, long j, int i) {
        if (TextRange.m987getCollapsedimpl(j)) {
            TextFieldState textFieldState = transformedTextFieldState.textFieldState;
            InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
            TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
            textFieldState.mainBuffer.getChangeTracker$foundation().clearChanges();
            TextFieldBuffer textFieldBuffer = textFieldState.mainBuffer;
            textFieldBuffer.highlight = null;
            transformedTextFieldState.updateWedgeAffinity(textFieldBuffer);
            TextFieldState.access$commitEditAsUser(textFieldState, inputTransformation, true, textFieldEditUndoBehavior);
            textFieldState.setUserCommit(true);
            return;
        }
        long m414mapFromTransformedGEjPoXI = transformedTextFieldState.m414mapFromTransformedGEjPoXI(j);
        TextFieldState textFieldState2 = transformedTextFieldState.textFieldState;
        InputTransformation inputTransformation2 = transformedTextFieldState.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior2 = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState2.mainBuffer.getChangeTracker$foundation().clearChanges();
        TextFieldBuffer textFieldBuffer2 = textFieldState2.mainBuffer;
        int i2 = (int) (m414mapFromTransformedGEjPoXI >> 32);
        int i3 = (int) (m414mapFromTransformedGEjPoXI & BodyPartID.bodyIdMax);
        PartialGapBuffer partialGapBuffer = textFieldBuffer2.buffer;
        if (i2 >= i3) {
            a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m("Do not set reversed or empty range: ", i2, i3, " > "));
            return;
        }
        textFieldBuffer2.highlight = new Pair(new TextHighlightType(i), new TextRange(SizeKt.TextRange(RangesKt___RangesKt.coerceIn(i2, 0, partialGapBuffer.length()), RangesKt___RangesKt.coerceIn(i3, 0, partialGapBuffer.length()))));
        TextFieldState.access$commitEditAsUser(textFieldState2, inputTransformation2, true, textFieldEditUndoBehavior2);
        textFieldState2.setUserCommit(true);
    }

    /* renamed from: performDeletionOnLegacyTextField-vJH6DeI, reason: not valid java name */
    public static void m386performDeletionOnLegacyTextFieldvJH6DeI(long j, AnnotatedString annotatedString, boolean z, CachedPageEventFlow$$ExternalSyntheticLambda0 cachedPageEventFlow$$ExternalSyntheticLambda0) {
        if (z) {
            j = MathUtilsKt.m389access$adjustHandwritingDeleteGestureRange72CqOWE(j, annotatedString);
        }
        int i = (int) (BodyPartID.bodyIdMax & j);
        cachedPageEventFlow$$ExternalSyntheticLambda0.invoke(new HandwritingGesture_androidKt$compoundEditCommand$1(new EditCommand[]{new SetSelectionCommand(i, i), new DeleteSurroundingTextCommand(TextRange.m988getLengthimpl(j), 0)}));
    }

    public static int performHandwritingGesture$foundation(LegacyTextFieldState legacyTextFieldState, HandwritingGesture handwritingGesture, TextFieldSelectionManager textFieldSelectionManager, ViewConfiguration viewConfiguration, CachedPageEventFlow$$ExternalSyntheticLambda0 cachedPageEventFlow$$ExternalSyntheticLambda0) {
        int i;
        TextLayoutResultProxy layoutResult;
        TextLayoutResultProxy layoutResult2;
        AnnotatedString annotatedString = legacyTextFieldState.untransformedText;
        if (annotatedString == null) {
            return 3;
        }
        TextLayoutResultProxy layoutResult3 = legacyTextFieldState.getLayoutResult();
        if (!annotatedString.equals(layoutResult3 != null ? layoutResult3.value.layoutInput.text : null)) {
            return 3;
        }
        if (handwritingGesture instanceof SelectGesture) {
            SelectGesture selectGesture = (SelectGesture) handwritingGesture;
            long m402getRangeForScreenRectOH9lIzo = MathUtilsKt.m402getRangeForScreenRectOH9lIzo(legacyTextFieldState, ColorKt.toComposeRect(selectGesture.getSelectionArea()), selectGesture.getGranularity() == 1 ? 1 : 0);
            if (TextRange.m987getCollapsedimpl(m402getRangeForScreenRectOH9lIzo)) {
                return fallbackOnLegacyTextField(selectGesture, cachedPageEventFlow$$ExternalSyntheticLambda0);
            }
            cachedPageEventFlow$$ExternalSyntheticLambda0.invoke(new SetSelectionCommand((int) (m402getRangeForScreenRectOH9lIzo >> 32), (int) (m402getRangeForScreenRectOH9lIzo & BodyPartID.bodyIdMax)));
            if (textFieldSelectionManager != null) {
                textFieldSelectionManager.enterSelectionMode$foundation(true);
                return 1;
            }
        } else {
            if (handwritingGesture instanceof DeleteGesture) {
                DeleteGesture deleteGesture = (DeleteGesture) handwritingGesture;
                int i2 = deleteGesture.getGranularity() != 1 ? 0 : 1;
                long m402getRangeForScreenRectOH9lIzo2 = MathUtilsKt.m402getRangeForScreenRectOH9lIzo(legacyTextFieldState, ColorKt.toComposeRect(deleteGesture.getDeletionArea()), i2);
                if (TextRange.m987getCollapsedimpl(m402getRangeForScreenRectOH9lIzo2)) {
                    return fallbackOnLegacyTextField(deleteGesture, cachedPageEventFlow$$ExternalSyntheticLambda0);
                }
                m386performDeletionOnLegacyTextFieldvJH6DeI(m402getRangeForScreenRectOH9lIzo2, annotatedString, i2 == 1, cachedPageEventFlow$$ExternalSyntheticLambda0);
                return 1;
            }
            if (!(handwritingGesture instanceof SelectRangeGesture)) {
                if (handwritingGesture instanceof DeleteRangeGesture) {
                    DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) handwritingGesture;
                    int i3 = deleteRangeGesture.getGranularity() != 1 ? 0 : 1;
                    long m391access$getRangeForScreenRectsO048IG0 = MathUtilsKt.m391access$getRangeForScreenRectsO048IG0(legacyTextFieldState, ColorKt.toComposeRect(deleteRangeGesture.getDeletionStartArea()), ColorKt.toComposeRect(deleteRangeGesture.getDeletionEndArea()), i3);
                    if (TextRange.m987getCollapsedimpl(m391access$getRangeForScreenRectsO048IG0)) {
                        return fallbackOnLegacyTextField(deleteRangeGesture, cachedPageEventFlow$$ExternalSyntheticLambda0);
                    }
                    m386performDeletionOnLegacyTextFieldvJH6DeI(m391access$getRangeForScreenRectsO048IG0, annotatedString, i3 == 1, cachedPageEventFlow$$ExternalSyntheticLambda0);
                    return 1;
                }
                if (handwritingGesture instanceof JoinOrSplitGesture) {
                    JoinOrSplitGesture joinOrSplitGesture = (JoinOrSplitGesture) handwritingGesture;
                    if (viewConfiguration == null) {
                        return fallbackOnLegacyTextField(joinOrSplitGesture, cachedPageEventFlow$$ExternalSyntheticLambda0);
                    }
                    long access$toOffset = MathUtilsKt.access$toOffset(joinOrSplitGesture.getJoinOrSplitPoint());
                    TextLayoutResultProxy layoutResult4 = legacyTextFieldState.getLayoutResult();
                    int m401getOffsetForHandwritingGestureubNVwUQ = layoutResult4 != null ? MathUtilsKt.m401getOffsetForHandwritingGestureubNVwUQ(layoutResult4.value.multiParagraph, access$toOffset, legacyTextFieldState.getLayoutCoordinates(), viewConfiguration) : -1;
                    if (m401getOffsetForHandwritingGestureubNVwUQ == -1 || ((layoutResult2 = legacyTextFieldState.getLayoutResult()) != null && MathUtilsKt.access$isBiDiBoundary(layoutResult2.value, m401getOffsetForHandwritingGestureubNVwUQ))) {
                        return fallbackOnLegacyTextField(joinOrSplitGesture, cachedPageEventFlow$$ExternalSyntheticLambda0);
                    }
                    long access$rangeOfWhitespaces = MathUtilsKt.access$rangeOfWhitespaces(m401getOffsetForHandwritingGestureubNVwUQ, annotatedString);
                    if (!TextRange.m987getCollapsedimpl(access$rangeOfWhitespaces)) {
                        m386performDeletionOnLegacyTextFieldvJH6DeI(access$rangeOfWhitespaces, annotatedString, false, cachedPageEventFlow$$ExternalSyntheticLambda0);
                        return 1;
                    }
                    int i4 = (int) (access$rangeOfWhitespaces >> 32);
                    cachedPageEventFlow$$ExternalSyntheticLambda0.invoke(new HandwritingGesture_androidKt$compoundEditCommand$1(new EditCommand[]{new SetSelectionCommand(i4, i4), new CommitTextCommand(" ", 1)}));
                    return 1;
                }
                if (handwritingGesture instanceof InsertGesture) {
                    InsertGesture insertGesture = (InsertGesture) handwritingGesture;
                    if (viewConfiguration == null) {
                        return fallbackOnLegacyTextField(insertGesture, cachedPageEventFlow$$ExternalSyntheticLambda0);
                    }
                    long access$toOffset2 = MathUtilsKt.access$toOffset(insertGesture.getInsertionPoint());
                    TextLayoutResultProxy layoutResult5 = legacyTextFieldState.getLayoutResult();
                    int m401getOffsetForHandwritingGestureubNVwUQ2 = layoutResult5 != null ? MathUtilsKt.m401getOffsetForHandwritingGestureubNVwUQ(layoutResult5.value.multiParagraph, access$toOffset2, legacyTextFieldState.getLayoutCoordinates(), viewConfiguration) : -1;
                    if (m401getOffsetForHandwritingGestureubNVwUQ2 == -1 || ((layoutResult = legacyTextFieldState.getLayoutResult()) != null && MathUtilsKt.access$isBiDiBoundary(layoutResult.value, m401getOffsetForHandwritingGestureubNVwUQ2))) {
                        return fallbackOnLegacyTextField(insertGesture, cachedPageEventFlow$$ExternalSyntheticLambda0);
                    }
                    cachedPageEventFlow$$ExternalSyntheticLambda0.invoke(new HandwritingGesture_androidKt$compoundEditCommand$1(new EditCommand[]{new SetSelectionCommand(m401getOffsetForHandwritingGestureubNVwUQ2, m401getOffsetForHandwritingGestureubNVwUQ2), new CommitTextCommand(insertGesture.getTextToInsert(), 1)}));
                    return 1;
                }
                if (!(handwritingGesture instanceof RemoveSpaceGesture)) {
                    return 2;
                }
                RemoveSpaceGesture removeSpaceGesture = (RemoveSpaceGesture) handwritingGesture;
                TextLayoutResultProxy layoutResult6 = legacyTextFieldState.getLayoutResult();
                long m390access$getRangeForRemoveSpaceGesture5iVPX68 = MathUtilsKt.m390access$getRangeForRemoveSpaceGesture5iVPX68(layoutResult6 != null ? layoutResult6.value : null, MathUtilsKt.access$toOffset(removeSpaceGesture.getStartPoint()), MathUtilsKt.access$toOffset(removeSpaceGesture.getEndPoint()), legacyTextFieldState.getLayoutCoordinates(), viewConfiguration);
                if (TextRange.m987getCollapsedimpl(m390access$getRangeForRemoveSpaceGesture5iVPX68)) {
                    return fallbackOnLegacyTextField(removeSpaceGesture, cachedPageEventFlow$$ExternalSyntheticLambda0);
                }
                Ref$IntRef ref$IntRef = new Ref$IntRef();
                ref$IntRef.element = -1;
                Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                ref$IntRef2.element = -1;
                String replace = new Regex("\\s+").replace(SizeKt.m1471substringFDrldGo(m390access$getRangeForRemoveSpaceGesture5iVPX68, annotatedString), new HandwritingGestureApi34$$ExternalSyntheticLambda2(ref$IntRef, ref$IntRef2, r12 ? 1 : 0));
                int i5 = ref$IntRef.element;
                if (i5 == -1 || (i = ref$IntRef2.element) == -1) {
                    return fallbackOnLegacyTextField(removeSpaceGesture, cachedPageEventFlow$$ExternalSyntheticLambda0);
                }
                int i6 = (int) (m390access$getRangeForRemoveSpaceGesture5iVPX68 >> 32);
                cachedPageEventFlow$$ExternalSyntheticLambda0.invoke(new HandwritingGesture_androidKt$compoundEditCommand$1(new EditCommand[]{new SetSelectionCommand(i6 + i5, i6 + i), new CommitTextCommand(replace.substring(i5, replace.length() - (TextRange.m988getLengthimpl(m390access$getRangeForRemoveSpaceGesture5iVPX68) - ref$IntRef2.element)), 1)}));
                return 1;
            }
            SelectRangeGesture selectRangeGesture = (SelectRangeGesture) handwritingGesture;
            long m391access$getRangeForScreenRectsO048IG02 = MathUtilsKt.m391access$getRangeForScreenRectsO048IG0(legacyTextFieldState, ColorKt.toComposeRect(selectRangeGesture.getSelectionStartArea()), ColorKt.toComposeRect(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() == 1 ? 1 : 0);
            if (TextRange.m987getCollapsedimpl(m391access$getRangeForScreenRectsO048IG02)) {
                return fallbackOnLegacyTextField(selectRangeGesture, cachedPageEventFlow$$ExternalSyntheticLambda0);
            }
            cachedPageEventFlow$$ExternalSyntheticLambda0.invoke(new SetSelectionCommand((int) (m391access$getRangeForScreenRectsO048IG02 >> 32), (int) (m391access$getRangeForScreenRectsO048IG02 & BodyPartID.bodyIdMax)));
            if (textFieldSelectionManager != null) {
                textFieldSelectionManager.enterSelectionMode$foundation(true);
            }
        }
        return 1;
    }

    public static boolean previewHandwritingGesture$foundation(LegacyTextFieldState legacyTextFieldState, PreviewableHandwritingGesture previewableHandwritingGesture, TextFieldSelectionManager textFieldSelectionManager, CancellationSignal cancellationSignal) {
        AnnotatedString annotatedString = legacyTextFieldState.untransformedText;
        int i = 0;
        if (annotatedString != null) {
            TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
            if (annotatedString.equals(layoutResult != null ? layoutResult.value.layoutInput.text : null)) {
                if (previewableHandwritingGesture instanceof SelectGesture) {
                    SelectGesture selectGesture = (SelectGesture) previewableHandwritingGesture;
                    if (textFieldSelectionManager != null) {
                        long m402getRangeForScreenRectOH9lIzo = MathUtilsKt.m402getRangeForScreenRectOH9lIzo(legacyTextFieldState, ColorKt.toComposeRect(selectGesture.getSelectionArea()), selectGesture.getGranularity() != 1 ? 0 : 1);
                        LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager.state;
                        if (legacyTextFieldState2 != null) {
                            legacyTextFieldState2.m362setSelectionPreviewHighlightRange5zctL8(m402getRangeForScreenRectOH9lIzo);
                        }
                        LegacyTextFieldState legacyTextFieldState3 = textFieldSelectionManager.state;
                        if (legacyTextFieldState3 != null) {
                            legacyTextFieldState3.m361setDeletionPreviewHighlightRange5zctL8(TextRange.Zero);
                        }
                        if (!TextRange.m987getCollapsedimpl(m402getRangeForScreenRectOH9lIzo)) {
                            textFieldSelectionManager.updateFloatingToolbar(false);
                            textFieldSelectionManager.setHandleState(HandleState.None);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof DeleteGesture) {
                    DeleteGesture deleteGesture = (DeleteGesture) previewableHandwritingGesture;
                    if (textFieldSelectionManager != null) {
                        long m402getRangeForScreenRectOH9lIzo2 = MathUtilsKt.m402getRangeForScreenRectOH9lIzo(legacyTextFieldState, ColorKt.toComposeRect(deleteGesture.getDeletionArea()), deleteGesture.getGranularity() != 1 ? 0 : 1);
                        LegacyTextFieldState legacyTextFieldState4 = textFieldSelectionManager.state;
                        if (legacyTextFieldState4 != null) {
                            legacyTextFieldState4.m361setDeletionPreviewHighlightRange5zctL8(m402getRangeForScreenRectOH9lIzo2);
                        }
                        LegacyTextFieldState legacyTextFieldState5 = textFieldSelectionManager.state;
                        if (legacyTextFieldState5 != null) {
                            legacyTextFieldState5.m362setSelectionPreviewHighlightRange5zctL8(TextRange.Zero);
                        }
                        if (!TextRange.m987getCollapsedimpl(m402getRangeForScreenRectOH9lIzo2)) {
                            textFieldSelectionManager.updateFloatingToolbar(false);
                            textFieldSelectionManager.setHandleState(HandleState.None);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof SelectRangeGesture) {
                    SelectRangeGesture selectRangeGesture = (SelectRangeGesture) previewableHandwritingGesture;
                    if (textFieldSelectionManager != null) {
                        long m391access$getRangeForScreenRectsO048IG0 = MathUtilsKt.m391access$getRangeForScreenRectsO048IG0(legacyTextFieldState, ColorKt.toComposeRect(selectRangeGesture.getSelectionStartArea()), ColorKt.toComposeRect(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() != 1 ? 0 : 1);
                        LegacyTextFieldState legacyTextFieldState6 = textFieldSelectionManager.state;
                        if (legacyTextFieldState6 != null) {
                            legacyTextFieldState6.m362setSelectionPreviewHighlightRange5zctL8(m391access$getRangeForScreenRectsO048IG0);
                        }
                        LegacyTextFieldState legacyTextFieldState7 = textFieldSelectionManager.state;
                        if (legacyTextFieldState7 != null) {
                            legacyTextFieldState7.m361setDeletionPreviewHighlightRange5zctL8(TextRange.Zero);
                        }
                        if (!TextRange.m987getCollapsedimpl(m391access$getRangeForScreenRectsO048IG0)) {
                            textFieldSelectionManager.updateFloatingToolbar(false);
                            textFieldSelectionManager.setHandleState(HandleState.None);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof DeleteRangeGesture) {
                    DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) previewableHandwritingGesture;
                    if (textFieldSelectionManager != null) {
                        long m391access$getRangeForScreenRectsO048IG02 = MathUtilsKt.m391access$getRangeForScreenRectsO048IG0(legacyTextFieldState, ColorKt.toComposeRect(deleteRangeGesture.getDeletionStartArea()), ColorKt.toComposeRect(deleteRangeGesture.getDeletionEndArea()), deleteRangeGesture.getGranularity() != 1 ? 0 : 1);
                        LegacyTextFieldState legacyTextFieldState8 = textFieldSelectionManager.state;
                        if (legacyTextFieldState8 != null) {
                            legacyTextFieldState8.m361setDeletionPreviewHighlightRange5zctL8(m391access$getRangeForScreenRectsO048IG02);
                        }
                        LegacyTextFieldState legacyTextFieldState9 = textFieldSelectionManager.state;
                        if (legacyTextFieldState9 != null) {
                            legacyTextFieldState9.m362setSelectionPreviewHighlightRange5zctL8(TextRange.Zero);
                        }
                        if (!TextRange.m987getCollapsedimpl(m391access$getRangeForScreenRectsO048IG02)) {
                            textFieldSelectionManager.updateFloatingToolbar(false);
                            textFieldSelectionManager.setHandleState(HandleState.None);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new HandwritingGestureApi34$$ExternalSyntheticLambda0(textFieldSelectionManager, i));
                }
                return true;
            }
        }
        return false;
    }

    public static boolean previewHandwritingGesture$foundation(TransformedTextFieldState transformedTextFieldState, PreviewableHandwritingGesture previewableHandwritingGesture, TextLayoutState textLayoutState, CancellationSignal cancellationSignal) {
        int i = 1;
        if (previewableHandwritingGesture instanceof SelectGesture) {
            SelectGesture selectGesture = (SelectGesture) previewableHandwritingGesture;
            m385highlightRangeXJREzCE(transformedTextFieldState, MathUtilsKt.m403getRangeForScreenRectOH9lIzo(textLayoutState, ColorKt.toComposeRect(selectGesture.getSelectionArea()), selectGesture.getGranularity() != 1 ? 0 : 1), 0);
        } else if (previewableHandwritingGesture instanceof DeleteGesture) {
            DeleteGesture deleteGesture = (DeleteGesture) previewableHandwritingGesture;
            m385highlightRangeXJREzCE(transformedTextFieldState, MathUtilsKt.m403getRangeForScreenRectOH9lIzo(textLayoutState, ColorKt.toComposeRect(deleteGesture.getDeletionArea()), deleteGesture.getGranularity() == 1 ? 1 : 0), 1);
        } else if (previewableHandwritingGesture instanceof SelectRangeGesture) {
            SelectRangeGesture selectRangeGesture = (SelectRangeGesture) previewableHandwritingGesture;
            m385highlightRangeXJREzCE(transformedTextFieldState, MathUtilsKt.m392access$getRangeForScreenRectsO048IG0(textLayoutState, ColorKt.toComposeRect(selectRangeGesture.getSelectionStartArea()), ColorKt.toComposeRect(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() != 1 ? 0 : 1), 0);
        } else {
            if (!(previewableHandwritingGesture instanceof DeleteRangeGesture)) {
                return false;
            }
            DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) previewableHandwritingGesture;
            m385highlightRangeXJREzCE(transformedTextFieldState, MathUtilsKt.m392access$getRangeForScreenRectsO048IG0(textLayoutState, ColorKt.toComposeRect(deleteRangeGesture.getDeletionStartArea()), ColorKt.toComposeRect(deleteRangeGesture.getDeletionEndArea()), deleteRangeGesture.getGranularity() == 1 ? 1 : 0), 1);
        }
        if (cancellationSignal != null) {
            cancellationSignal.setOnCancelListener(new HandwritingGestureApi34$$ExternalSyntheticLambda0(transformedTextFieldState, i));
        }
        return true;
    }

    public static int performHandwritingGesture$foundation(TransformedTextFieldState transformedTextFieldState, HandwritingGesture handwritingGesture, TextLayoutState textLayoutState, Function0 function0, ViewConfiguration viewConfiguration) {
        int i;
        TextLayoutResult layoutResult;
        int i2;
        int i3 = 1;
        if (handwritingGesture instanceof SelectGesture) {
            SelectGesture selectGesture = (SelectGesture) handwritingGesture;
            long m403getRangeForScreenRectOH9lIzo = MathUtilsKt.m403getRangeForScreenRectOH9lIzo(textLayoutState, ColorKt.toComposeRect(selectGesture.getSelectionArea()), selectGesture.getGranularity() == 1 ? 1 : 0);
            if (TextRange.m987getCollapsedimpl(m403getRangeForScreenRectOH9lIzo)) {
                return fallback(transformedTextFieldState, selectGesture);
            }
            transformedTextFieldState.m416selectCharsIn5zctL8(m403getRangeForScreenRectOH9lIzo);
            if (function0 != null) {
                function0.invoke();
                return 1;
            }
        } else {
            if (handwritingGesture instanceof DeleteGesture) {
                DeleteGesture deleteGesture = (DeleteGesture) handwritingGesture;
                i2 = deleteGesture.getGranularity() == 1 ? 1 : 0;
                long m403getRangeForScreenRectOH9lIzo2 = MathUtilsKt.m403getRangeForScreenRectOH9lIzo(textLayoutState, ColorKt.toComposeRect(deleteGesture.getDeletionArea()), i2);
                if (TextRange.m987getCollapsedimpl(m403getRangeForScreenRectOH9lIzo2)) {
                    return fallback(transformedTextFieldState, deleteGesture);
                }
                if (i2 == 1) {
                    m403getRangeForScreenRectOH9lIzo2 = MathUtilsKt.m389access$adjustHandwritingDeleteGestureRange72CqOWE(m403getRangeForScreenRectOH9lIzo2, transformedTextFieldState.getVisualText());
                }
                TransformedTextFieldState.m412replaceTextM8tDOmk$default(transformedTextFieldState, "", m403getRangeForScreenRectOH9lIzo2, false, 12);
                return 1;
            }
            if (handwritingGesture instanceof SelectRangeGesture) {
                SelectRangeGesture selectRangeGesture = (SelectRangeGesture) handwritingGesture;
                long m392access$getRangeForScreenRectsO048IG0 = MathUtilsKt.m392access$getRangeForScreenRectsO048IG0(textLayoutState, ColorKt.toComposeRect(selectRangeGesture.getSelectionStartArea()), ColorKt.toComposeRect(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() == 1 ? 1 : 0);
                if (TextRange.m987getCollapsedimpl(m392access$getRangeForScreenRectsO048IG0)) {
                    return fallback(transformedTextFieldState, selectRangeGesture);
                }
                transformedTextFieldState.m416selectCharsIn5zctL8(m392access$getRangeForScreenRectsO048IG0);
                if (function0 != null) {
                    function0.invoke();
                }
            } else {
                if (handwritingGesture instanceof DeleteRangeGesture) {
                    DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) handwritingGesture;
                    i2 = deleteRangeGesture.getGranularity() == 1 ? 1 : 0;
                    long m392access$getRangeForScreenRectsO048IG02 = MathUtilsKt.m392access$getRangeForScreenRectsO048IG0(textLayoutState, ColorKt.toComposeRect(deleteRangeGesture.getDeletionStartArea()), ColorKt.toComposeRect(deleteRangeGesture.getDeletionEndArea()), i2);
                    if (TextRange.m987getCollapsedimpl(m392access$getRangeForScreenRectsO048IG02)) {
                        return fallback(transformedTextFieldState, deleteRangeGesture);
                    }
                    if (i2 == 1) {
                        m392access$getRangeForScreenRectsO048IG02 = MathUtilsKt.m389access$adjustHandwritingDeleteGestureRange72CqOWE(m392access$getRangeForScreenRectsO048IG02, transformedTextFieldState.getVisualText());
                    }
                    TransformedTextFieldState.m412replaceTextM8tDOmk$default(transformedTextFieldState, "", m392access$getRangeForScreenRectsO048IG02, false, 12);
                    return 1;
                }
                if (handwritingGesture instanceof JoinOrSplitGesture) {
                    JoinOrSplitGesture joinOrSplitGesture = (JoinOrSplitGesture) handwritingGesture;
                    if (transformedTextFieldState.getOutputText() != transformedTextFieldState.textFieldState.getValue$foundation()) {
                        return 3;
                    }
                    long access$toOffset = MathUtilsKt.access$toOffset(joinOrSplitGesture.getJoinOrSplitPoint());
                    TextLayoutResult layoutResult2 = textLayoutState.getLayoutResult();
                    int m401getOffsetForHandwritingGestureubNVwUQ = layoutResult2 != null ? MathUtilsKt.m401getOffsetForHandwritingGestureubNVwUQ(layoutResult2.multiParagraph, access$toOffset, textLayoutState.getTextLayoutNodeCoordinates(), viewConfiguration) : -1;
                    if (m401getOffsetForHandwritingGestureubNVwUQ != -1 && ((layoutResult = textLayoutState.getLayoutResult()) == null || !MathUtilsKt.access$isBiDiBoundary(layoutResult, m401getOffsetForHandwritingGestureubNVwUQ))) {
                        long access$rangeOfWhitespaces = MathUtilsKt.access$rangeOfWhitespaces(m401getOffsetForHandwritingGestureubNVwUQ, transformedTextFieldState.getVisualText());
                        if (TextRange.m987getCollapsedimpl(access$rangeOfWhitespaces)) {
                            TransformedTextFieldState.m412replaceTextM8tDOmk$default(transformedTextFieldState, " ", access$rangeOfWhitespaces, false, 12);
                            return 1;
                        }
                        TransformedTextFieldState.m412replaceTextM8tDOmk$default(transformedTextFieldState, "", access$rangeOfWhitespaces, false, 12);
                        return 1;
                    }
                    return fallback(transformedTextFieldState, joinOrSplitGesture);
                }
                if (handwritingGesture instanceof InsertGesture) {
                    InsertGesture insertGesture = (InsertGesture) handwritingGesture;
                    long access$toOffset2 = MathUtilsKt.access$toOffset(insertGesture.getInsertionPoint());
                    TextLayoutResult layoutResult3 = textLayoutState.getLayoutResult();
                    int m401getOffsetForHandwritingGestureubNVwUQ2 = layoutResult3 != null ? MathUtilsKt.m401getOffsetForHandwritingGestureubNVwUQ(layoutResult3.multiParagraph, access$toOffset2, textLayoutState.getTextLayoutNodeCoordinates(), viewConfiguration) : -1;
                    if (m401getOffsetForHandwritingGestureubNVwUQ2 == -1) {
                        return fallback(transformedTextFieldState, insertGesture);
                    }
                    TransformedTextFieldState.m412replaceTextM8tDOmk$default(transformedTextFieldState, insertGesture.getTextToInsert(), SizeKt.TextRange(m401getOffsetForHandwritingGestureubNVwUQ2, m401getOffsetForHandwritingGestureubNVwUQ2), false, 12);
                    return 1;
                }
                if (!(handwritingGesture instanceof RemoveSpaceGesture)) {
                    return 2;
                }
                RemoveSpaceGesture removeSpaceGesture = (RemoveSpaceGesture) handwritingGesture;
                long m390access$getRangeForRemoveSpaceGesture5iVPX68 = MathUtilsKt.m390access$getRangeForRemoveSpaceGesture5iVPX68(textLayoutState.getLayoutResult(), MathUtilsKt.access$toOffset(removeSpaceGesture.getStartPoint()), MathUtilsKt.access$toOffset(removeSpaceGesture.getEndPoint()), textLayoutState.getTextLayoutNodeCoordinates(), viewConfiguration);
                if (TextRange.m987getCollapsedimpl(m390access$getRangeForRemoveSpaceGesture5iVPX68)) {
                    return fallback(transformedTextFieldState, removeSpaceGesture);
                }
                Ref$IntRef ref$IntRef = new Ref$IntRef();
                ref$IntRef.element = -1;
                Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                ref$IntRef2.element = -1;
                String replace = new Regex("\\s+").replace(SizeKt.m1471substringFDrldGo(m390access$getRangeForRemoveSpaceGesture5iVPX68, transformedTextFieldState.getVisualText()), new HandwritingGestureApi34$$ExternalSyntheticLambda2(ref$IntRef, ref$IntRef2, i3));
                int i4 = ref$IntRef.element;
                if (i4 != -1 && (i = ref$IntRef2.element) != -1) {
                    int i5 = (int) (m390access$getRangeForRemoveSpaceGesture5iVPX68 >> 32);
                    TransformedTextFieldState.m412replaceTextM8tDOmk$default(transformedTextFieldState, replace.substring(ref$IntRef.element, replace.length() - (TextRange.m988getLengthimpl(m390access$getRangeForRemoveSpaceGesture5iVPX68) - ref$IntRef2.element)), SizeKt.TextRange(i4 + i5, i5 + i), false, 12);
                    return 1;
                }
                return fallback(transformedTextFieldState, removeSpaceGesture);
            }
        }
        return 1;
    }
}
