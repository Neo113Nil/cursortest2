package androidx.compose.foundation.text.input.internal;

import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.autofill.AutofillValue;
import androidx.activity.compose.BackHandlerKt$$ExternalSyntheticLambda1;
import androidx.collection.MutableLongSet;
import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1;
import androidx.compose.foundation.FocusableNode;
import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.AutofillHighlightKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.DeadKeyCombiner;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.KeyMappingKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.selection.SelectionMovementDeletionContext;
import androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextToolbarState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.foundation.text.input.internal.undo.TextUndoOperation;
import androidx.compose.foundation.text.input.internal.undo.UndoManager;
import androidx.compose.material.ButtonKt$$ExternalSyntheticLambda2;
import androidx.compose.runtime.ComposerKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.autofill.AndroidFillableData;
import androidx.compose.ui.autofill.ContentDataType$Companion;
import androidx.compose.ui.autofill.ContentType;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDropNode;
import androidx.compose.ui.draganddrop.DragAndDropTarget;
import androidx.compose.ui.draganddrop.DragAndDrop_androidKt;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.platform.LazyWindowInfo;
import androidx.compose.ui.platform.PlatformTextInputModifierNode;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.InputTextSuggestionState;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.datastore.core.SimpleActor;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkLauncherImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.q2$$ExternalSyntheticLambda8;
import coil3.size.SizeKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzadm;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.CashApp$$ExternalSyntheticLambda2;
import com.squareup.cash.common.ui.ColorModelsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.mooncake.resources.ImageResourcesKt;
import com.squareup.cash.overlays.OverlayKt;
import com.squareup.util.Strings;
import com.squareup.wire.GrpcMethod;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class TextFieldDecoratorModifierNode extends DelegatingNode implements DrawModifierNode, PlatformTextInputModifierNode, SemanticsModifierNode, GlobalPositionAwareModifierNode, PointerInputModifierNode, KeyInputModifierNode, CompositionLocalConsumerModifierNode, ModifierLocalModifierNode, ObserverModifierNode, LayoutAwareModifierNode, FocusPropertiesModifierNode {
    public final ParcelableSnapshotMutableState autofillHighlightOn$delegate;
    public final TextFieldDecoratorModifierNode$$ExternalSyntheticLambda2 clipboardKeyCommandsHandler;
    public final DragAndDropNode dragAndDropNode;
    public DragAndDropHoverInteraction$Enter dragEnterEvent;
    public boolean enabled;
    public InputTransformation filter;
    public final FocusableNode focusableNode;
    public StandaloneCoroutine inputSessionJob;
    public MutableInteractionSourceImpl interactionSource;
    public KeyboardActionHandler keyboardActionHandler;
    public final TextFieldDecoratorModifierNode$keyboardActionScope$1 keyboardActionScope;
    public KeyboardOptions keyboardOptions;
    public final SuspendingPointerInputModifierNodeImpl pointerInputNode;
    public boolean readOnly;
    public final TextFieldDecoratorModifierNode$$ExternalSyntheticLambda1 receiveContentConfigurationProvider;
    public boolean singleLine;
    public MutableSharedFlow stylusHandwritingTrigger;
    public final GrpcMethod textFieldKeyEventHandler;
    public TextFieldSelectionState textFieldSelectionState;
    public TransformedTextFieldState textFieldState;
    public TextLayoutState textLayoutState;
    public StandaloneCoroutine toolbarAndHandlesVisibilityObserverJob;
    public WindowInfo windowInfo;

    public TextFieldDecoratorModifierNode(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, InputTransformation inputTransformation, boolean z, boolean z2, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, boolean z3, MutableInteractionSourceImpl mutableInteractionSourceImpl, MutableSharedFlow mutableSharedFlow) {
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.filter = inputTransformation;
        this.enabled = z;
        this.readOnly = z2;
        this.keyboardOptions = keyboardOptions;
        this.keyboardActionHandler = keyboardActionHandler;
        this.singleLine = z3;
        this.interactionSource = mutableInteractionSourceImpl;
        this.stylusHandwritingTrigger = mutableSharedFlow;
        int i = 3;
        textFieldSelectionState.requestAutofillAction = new TextFieldDecoratorModifierNode$$ExternalSyntheticLambda1(this, i);
        int i2 = 2;
        this.focusableNode = new FocusableNode(mutableInteractionSourceImpl, new TextFieldDecoratorModifierNode$$ExternalSyntheticLambda2(this, 1), i2);
        AndroidEdgeEffectOverscrollEffect$pointerInputNode$1 androidEdgeEffectOverscrollEffect$pointerInputNode$1 = new AndroidEdgeEffectOverscrollEffect$pointerInputNode$1(this, i);
        PointerEvent pointerEvent = SuspendingPointerInputFilterKt.EmptyPointerEvent;
        SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = new SuspendingPointerInputModifierNodeImpl(null, null, null, androidEdgeEffectOverscrollEffect$pointerInputNode$1);
        delegate(suspendingPointerInputModifierNodeImpl);
        this.pointerInputNode = suspendingPointerInputModifierNodeImpl;
        int i3 = 5;
        TextFieldDecoratorModifierNode$$ExternalSyntheticLambda1 textFieldDecoratorModifierNode$$ExternalSyntheticLambda1 = new TextFieldDecoratorModifierNode$$ExternalSyntheticLambda1(this, i3);
        final ComposerKt$$ExternalSyntheticLambda0 composerKt$$ExternalSyntheticLambda0 = new ComposerKt$$ExternalSyntheticLambda0(this, i3);
        final TextFieldDecoratorModifierNode$$ExternalSyntheticLambda2 textFieldDecoratorModifierNode$$ExternalSyntheticLambda2 = new TextFieldDecoratorModifierNode$$ExternalSyntheticLambda2(this, i2);
        final TextFieldDecoratorModifierNode$$ExternalSyntheticLambda2 textFieldDecoratorModifierNode$$ExternalSyntheticLambda22 = new TextFieldDecoratorModifierNode$$ExternalSyntheticLambda2(this, i);
        int i4 = 4;
        final TextFieldDecoratorModifierNode$$ExternalSyntheticLambda2 textFieldDecoratorModifierNode$$ExternalSyntheticLambda23 = new TextFieldDecoratorModifierNode$$ExternalSyntheticLambda2(this, i4);
        final TextFieldDecoratorModifierNode$$ExternalSyntheticLambda2 textFieldDecoratorModifierNode$$ExternalSyntheticLambda24 = new TextFieldDecoratorModifierNode$$ExternalSyntheticLambda2(this, i3);
        final TextFieldDecoratorModifierNode$$ExternalSyntheticLambda2 textFieldDecoratorModifierNode$$ExternalSyntheticLambda25 = new TextFieldDecoratorModifierNode$$ExternalSyntheticLambda2(this, 6);
        DragAndDropNode dragAndDropNode = new DragAndDropNode(new SimpleActor.AnonymousClass1(i2, new CashApp$$ExternalSyntheticLambda2(textFieldDecoratorModifierNode$$ExternalSyntheticLambda1, 10), new DragAndDropTarget() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDragAndDropNode_androidKt$textFieldDragAndDropNode$2
            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public final boolean onDrop(DragAndDropEvent dragAndDropEvent) {
                TextFieldDecoratorModifierNode$$ExternalSyntheticLambda2.this.invoke(dragAndDropEvent);
                ClipEntry clipEntry = OverlayKt.toClipEntry(DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent).getClipData());
                DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent).getClipDescription();
                composerKt$$ExternalSyntheticLambda0.invoke(clipEntry, OverlayKt.toClipMetadata());
                return Boolean.TRUE.booleanValue();
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public final void onEnded(DragAndDropEvent dragAndDropEvent) {
                textFieldDecoratorModifierNode$$ExternalSyntheticLambda25.invoke(dragAndDropEvent);
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public final void onEntered(DragAndDropEvent dragAndDropEvent) {
                textFieldDecoratorModifierNode$$ExternalSyntheticLambda22.invoke(dragAndDropEvent);
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public final void onExited(DragAndDropEvent dragAndDropEvent) {
                textFieldDecoratorModifierNode$$ExternalSyntheticLambda24.invoke(dragAndDropEvent);
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public final void onMoved(DragAndDropEvent dragAndDropEvent) {
                DragEvent androidDragEvent = DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent);
                float x = androidDragEvent.getX();
                float y = androidDragEvent.getY();
                long floatToRawIntBits = (Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & BodyPartID.bodyIdMax);
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = textFieldDecoratorModifierNode$$ExternalSyntheticLambda23.f$0;
                long m399fromWindowToDecorationUv8p0NA = MathUtilsKt.m399fromWindowToDecorationUv8p0NA(textFieldDecoratorModifierNode.textLayoutState, floatToRawIntBits);
                int m410getOffsetForPosition3MmeM6k = textFieldDecoratorModifierNode.textLayoutState.m410getOffsetForPosition3MmeM6k(m399fromWindowToDecorationUv8p0NA, true);
                if (m410getOffsetForPosition3MmeM6k >= 0) {
                    textFieldDecoratorModifierNode.textFieldState.m416selectCharsIn5zctL8(SizeKt.TextRange(m410getOffsetForPosition3MmeM6k, m410getOffsetForPosition3MmeM6k));
                }
                textFieldDecoratorModifierNode.textFieldSelectionState.m422updateHandleDraggingUv8p0NA(Handle.Cursor, m399fromWindowToDecorationUv8p0NA);
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public final void onStarted(DragAndDropEvent dragAndDropEvent) {
            }
        }), 1);
        delegate(dragAndDropNode);
        this.dragAndDropNode = dragAndDropNode;
        this.textFieldKeyEventHandler = new GrpcMethod(3, false);
        this.keyboardActionScope = new TextFieldDecoratorModifierNode$keyboardActionScope$1(this);
        this.clipboardKeyCommandsHandler = new TextFieldDecoratorModifierNode$$ExternalSyntheticLambda2(this, 7);
        this.receiveContentConfigurationProvider = new TextFieldDecoratorModifierNode$$ExternalSyntheticLambda1(this, i4);
        this.autofillHighlightOn$delegate = Updater.mutableStateOf$default(Boolean.FALSE);
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public final void applyFocusProperties(FocusProperties focusProperties) {
        Rect rect;
        TextFieldSelectionState textFieldSelectionState = this.textFieldSelectionState;
        TextLayoutState textLayoutState = textFieldSelectionState.textLayoutState;
        TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
        Rect rect2 = Rect.Zero;
        if (layoutResult != null) {
            if (textFieldSelectionState.isFocused) {
                TextFieldCharSequence visualText = textFieldSelectionState.textFieldState.getVisualText();
                if (TextRange.m987getCollapsedimpl(visualText.selection)) {
                    rect = textFieldSelectionState.calculateCursorRect(layoutResult, visualText);
                } else {
                    long j = visualText.selection;
                    if (!TextRange.m987getCollapsedimpl(j)) {
                        int i = (int) (j >> 32);
                        MultiParagraph multiParagraph = layoutResult.multiParagraph;
                        int lineForOffset = multiParagraph.getLineForOffset(i);
                        int i2 = (int) (BodyPartID.bodyIdMax & j);
                        int lineForOffset2 = multiParagraph.getLineForOffset(i2);
                        if (lineForOffset == lineForOffset2) {
                            float horizontalPosition = layoutResult.getHorizontalPosition(i, true);
                            float horizontalPosition2 = layoutResult.getHorizontalPosition(i2, true);
                            rect2 = new Rect(Math.min(horizontalPosition, horizontalPosition2), multiParagraph.getLineTop(lineForOffset), Math.max(horizontalPosition, horizontalPosition2), multiParagraph.getLineBottom(lineForOffset2));
                        } else {
                            rect2 = layoutResult.getPathForRange(TextRange.m990getMinimpl(j), TextRange.m989getMaximpl(j)).getBounds();
                        }
                    }
                    rect = rect2;
                }
                rect2 = MathUtilsKt.fromTextLayoutToDecoration(textLayoutState, rect);
            } else {
                rect2 = FocusProperties.Companion.UnsetFocusRect;
            }
        }
        focusProperties.setFocusRect(rect2);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        TextFieldCharSequence outputText = this.textFieldState.getOutputText();
        long j = outputText.selection;
        AnnotatedString annotatedString = new AnnotatedString(this.textFieldState.textFieldState.getValue$foundation().text.toString());
        KProperty[] kPropertyArr = SemanticsPropertiesKt.$$delegatedProperties;
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.InputText;
        KProperty[] kPropertyArr2 = SemanticsPropertiesKt.$$delegatedProperties;
        KProperty kProperty = kPropertyArr2[18];
        semanticsPropertyReceiver.set(semanticsPropertyKey, annotatedString);
        AnnotatedString annotatedString2 = new AnnotatedString(outputText.text.toString());
        SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.EditableText;
        KProperty kProperty2 = kPropertyArr2[19];
        semanticsPropertyReceiver.set(semanticsPropertyKey2, annotatedString2);
        SemanticsPropertyKey semanticsPropertyKey3 = SemanticsProperties.TextSelectionRange;
        KProperty kProperty3 = kPropertyArr2[20];
        semanticsPropertyReceiver.set(semanticsPropertyKey3, new TextRange(j));
        TextRange textRange = this.textFieldState.textFieldState.getValue$foundation().composition;
        SemanticsPropertyKey semanticsPropertyKey4 = SemanticsProperties.TextCompositionRange;
        KProperty kProperty4 = kPropertyArr2[21];
        semanticsPropertyReceiver.set(semanticsPropertyKey4, textRange);
        InputTextSuggestionState inputTextSuggestionState = new InputTextSuggestionState(((Boolean) this.textFieldState.textFieldState.userCommit$delegate.getValue()).booleanValue());
        SemanticsPropertyKey semanticsPropertyKey5 = SemanticsProperties.InputTextSuggestionState;
        KProperty kProperty5 = kPropertyArr2[27];
        semanticsPropertyReceiver.set(semanticsPropertyKey5, inputTextSuggestionState);
        if (!this.enabled) {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        int i = 0;
        int i2 = 1;
        boolean z = this.enabled && !this.readOnly;
        SemanticsPropertyKey semanticsPropertyKey6 = SemanticsProperties.IsEditable;
        KProperty kProperty6 = kPropertyArr2[28];
        semanticsPropertyReceiver.set(semanticsPropertyKey6, Boolean.valueOf(z));
        SemanticsPropertyKey semanticsPropertyKey7 = SemanticsProperties.ContentDataType;
        KProperty kProperty7 = kPropertyArr2[9];
        semanticsPropertyReceiver.set(semanticsPropertyKey7, ContentDataType$Companion.Text);
        AndroidFillableData androidFillableData = new AndroidFillableData(AutofillValue.forText(outputText));
        SemanticsPropertyKey semanticsPropertyKey8 = SemanticsProperties.FillableData;
        KProperty kProperty8 = kPropertyArr2[10];
        semanticsPropertyReceiver.set(semanticsPropertyKey8, androidFillableData);
        semanticsPropertyReceiver.set(SemanticsActions.OnFillData, new AccessibilityAction(null, new BackHandlerKt$$ExternalSyntheticLambda1(z, this, i2)));
        int i3 = this.keyboardOptions.keyboardType;
        int i4 = 8;
        int i5 = 7;
        int i6 = 6;
        if (i3 == 6) {
            ContentType.Companion.getClass();
            SemanticsPropertiesKt.setContentType(semanticsPropertyReceiver, ContentType.Companion.EmailAddress);
        } else if (i3 == 7) {
            ContentType.Companion.getClass();
            SemanticsPropertiesKt.setContentType(semanticsPropertyReceiver, ContentType.Companion.Password);
        } else if (i3 == 8) {
            ContentType.Companion.getClass();
            SemanticsPropertiesKt.setContentType(semanticsPropertyReceiver, ContentType.Companion.Password);
        } else if (i3 == 4) {
            ContentType.Companion.getClass();
            SemanticsPropertiesKt.setContentType(semanticsPropertyReceiver, ContentType.Companion.PhoneNumber);
        }
        semanticsPropertyReceiver.set(SemanticsActions.GetTextLayoutResult, new AccessibilityAction(null, new TextFieldDecoratorModifierNode$$ExternalSyntheticLambda2(this, i)));
        int i7 = 2;
        if (z) {
            semanticsPropertyReceiver.set(SemanticsActions.SetText, new AccessibilityAction(null, new BackHandlerKt$$ExternalSyntheticLambda1(z, this, i7)));
            semanticsPropertyReceiver.set(SemanticsActions.InsertTextAtCursor, new AccessibilityAction(null, new BackHandlerKt$$ExternalSyntheticLambda1(z, this, 3)));
        }
        semanticsPropertyReceiver.set(SemanticsActions.SetSelection, new AccessibilityAction(null, new ColorModelsKt$$ExternalSyntheticLambda0(this, i7)));
        final int m360getImeActionOrDefaulteUduSuo$foundation = this.keyboardOptions.m360getImeActionOrDefaulteUduSuo$foundation();
        SemanticsPropertiesKt.m948onImeAction9UiTYpY$default(semanticsPropertyReceiver, m360getImeActionOrDefaulteUduSuo$foundation, new Function0() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TextFieldDecoratorModifierNode.this.m408onImeActionPerformedKlQnJC8(m360getImeActionOrDefaulteUduSuo$foundation);
                return Boolean.TRUE;
            }
        });
        SemanticsPropertiesKt.onClick(semanticsPropertyReceiver, null, new TextFieldDecoratorModifierNode$$ExternalSyntheticLambda1(this, i6));
        semanticsPropertyReceiver.set(SemanticsActions.OnLongClick, new AccessibilityAction(null, new TextFieldDecoratorModifierNode$$ExternalSyntheticLambda1(this, i5)));
        if (!TextRange.m987getCollapsedimpl(j)) {
            semanticsPropertyReceiver.set(SemanticsActions.CopyText, new AccessibilityAction(null, new TextFieldDecoratorModifierNode$$ExternalSyntheticLambda1(this, i4)));
            if (this.enabled && !this.readOnly) {
                semanticsPropertyReceiver.set(SemanticsActions.CutText, new AccessibilityAction(null, new TextFieldDecoratorModifierNode$$ExternalSyntheticLambda1(this, i2)));
            }
        }
        if (z) {
            semanticsPropertyReceiver.set(SemanticsActions.PasteText, new AccessibilityAction(null, new TextFieldDecoratorModifierNode$$ExternalSyntheticLambda1(this, i)));
        }
        InputTransformation inputTransformation = this.filter;
        if (inputTransformation != null) {
            inputTransformation.applySemantics(semanticsPropertyReceiver);
        }
        if (this.enabled) {
            this.focusableNode.applySemantics(semanticsPropertyReceiver);
        }
    }

    /* renamed from: defaultKeyboardActionWithResult-KlQnJC8, reason: not valid java name */
    public final boolean m407defaultKeyboardActionWithResultKlQnJC8(int i) {
        if (i == 6) {
            ((FocusOwnerImpl) DepthSortedSetKt.currentValueOf(this, CompositionLocalsKt.LocalFocusManager)).m597moveFocusaToIllA(1, true);
            return true;
        }
        if (i == 5) {
            ((FocusOwnerImpl) DepthSortedSetKt.currentValueOf(this, CompositionLocalsKt.LocalFocusManager)).m597moveFocusaToIllA(2, true);
            return true;
        }
        if (i != 7) {
            return false;
        }
        requireKeyboardController().hide();
        return true;
    }

    public final void disposeInputSession() {
        StandaloneCoroutine standaloneCoroutine = this.inputSessionJob;
        if (standaloneCoroutine != null) {
            standaloneCoroutine.cancel(null);
        }
        this.inputSessionJob = null;
        MutableSharedFlow mutableSharedFlow = this.stylusHandwritingTrigger;
        if (mutableSharedFlow != null) {
            mutableSharedFlow.resetReplayCache();
        }
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(LayoutNodeDrawScope layoutNodeDrawScope) {
        layoutNodeDrawScope.drawContent();
        if (((Boolean) this.autofillHighlightOn$delegate.getValue()).booleanValue()) {
            DrawScope.m746drawRectAsUm42w$default(layoutNodeDrawScope, AutofillHighlightKt.m344resolveAutofillHighlightWkMShQ((Brush) DepthSortedSetKt.currentValueOf(this, AutofillHighlightKt.getLocalAutofillHighlightBrush()), ((Color) DepthSortedSetKt.currentValueOf(this, AutofillHighlightKt.getLocalAutofillHighlightColor())).value, KeyMappingKt.autofillHighlightColor()), 0L, 0L, RecyclerView.DECELERATION_RATE, null, null, 0, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
        }
    }

    public final void emitDragExitEvent() {
        DragAndDropHoverInteraction$Enter dragAndDropHoverInteraction$Enter = this.dragEnterEvent;
        if (dragAndDropHoverInteraction$Enter != null) {
            this.interactionSource.tryEmit(new DragAndDropHoverInteraction$Exit(dragAndDropHoverInteraction$Enter));
            this.dragEnterEvent = null;
        }
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    public final boolean isFocused$1() {
        WindowInfo windowInfo;
        return this.focusableNode.focusTargetNode.getFocusState$1().isFocused() && (windowInfo = this.windowInfo) != null && ((LazyWindowInfo) windowInfo).isWindowFocused();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        DepthSortedSetKt.observeReads(this, new TextFieldDecoratorModifierNode$$ExternalSyntheticLambda1(this, 2));
        this.textFieldSelectionState.receiveContentConfiguration = this.receiveContentConfigurationProvider;
        if (this.enabled) {
            delegate(this.focusableNode);
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void onCancelPointerInput() {
        this.pointerInputNode.onCancelPointerInput();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        disposeInputSession();
        this.textFieldSelectionState.receiveContentConfiguration = null;
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public final void onGloballyPositioned(NodeCoordinator nodeCoordinator) {
        this.textLayoutState.decoratorNodeCoordinates$delegate.setValue(nodeCoordinator);
        if (this.enabled) {
            this.focusableNode.onGloballyPositioned(nodeCoordinator);
        }
    }

    /* renamed from: onImeActionPerformed-KlQnJC8, reason: not valid java name */
    public final boolean m408onImeActionPerformedKlQnJC8(int i) {
        KeyboardActionHandler keyboardActionHandler;
        if (i == 0 || i == 1 || (keyboardActionHandler = this.keyboardActionHandler) == null) {
            return m407defaultKeyboardActionWithResultKlQnJC8(i);
        }
        keyboardActionHandler.onKeyboardAction(new q2$$ExternalSyntheticLambda8(this, i, 1));
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:102:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x031e  */
    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onKeyEvent-ZmokQxo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo161onKeyEventZmokQxo(KeyEvent keyEvent) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        float f;
        WedgeAffinity wedgeAffinity;
        Integer m350consumeZmokQxo;
        TransformedTextFieldState transformedTextFieldState = this.textFieldState;
        TextLayoutState textLayoutState = this.textLayoutState;
        TextFieldSelectionState textFieldSelectionState = this.textFieldSelectionState;
        DelegatingSoftwareKeyboardController requireKeyboardController = requireKeyboardController();
        int i2 = 1;
        boolean z4 = this.enabled && !this.readOnly;
        boolean z5 = this.singleLine;
        TextFieldDecoratorModifierNode$$ExternalSyntheticLambda12 textFieldDecoratorModifierNode$$ExternalSyntheticLambda12 = new TextFieldDecoratorModifierNode$$ExternalSyntheticLambda12(this, i2);
        GrpcMethod grpcMethod = this.textFieldKeyEventHandler;
        grpcMethod.getClass();
        TextFieldPreparedSelectionState textFieldPreparedSelectionState = (TextFieldPreparedSelectionState) grpcMethod.path;
        if (KeyEventType.m772equalsimpl0(KeyEventType.m790getTypeZmokQxo(keyEvent), 2) && keyEvent.isFromSource(EnumC0170g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE) && (!Strings.m3987isFromSoftKeyboardZmokQxo(keyEvent) || !KeyMappingKt.m356isTypedEventZmokQxo(keyEvent))) {
            textFieldSelectionState.setInTouchMode(false);
        }
        long m782getKeyZmokQxo = KeyEventType.m782getKeyZmokQxo(keyEvent);
        if (KeyEventType.m772equalsimpl0(KeyEventType.m790getTypeZmokQxo(keyEvent), 1)) {
            MutableLongSet mutableLongSet = (MutableLongSet) grpcMethod.responseAdapter;
            if (mutableLongSet != null && mutableLongSet.contains(m782getKeyZmokQxo)) {
                MutableLongSet mutableLongSet2 = (MutableLongSet) grpcMethod.responseAdapter;
                if (mutableLongSet2 != null) {
                    mutableLongSet2.remove(m782getKeyZmokQxo);
                }
                return true;
            }
        } else if (!KeyEventType.m772equalsimpl0(KeyEventType.m790getTypeZmokQxo(keyEvent), 0) || KeyMappingKt.m356isTypedEventZmokQxo(keyEvent)) {
            if (!KeyMappingKt.m356isTypedEventZmokQxo(keyEvent) || (m350consumeZmokQxo = ((DeadKeyCombiner) grpcMethod.requestAdapter).m350consumeZmokQxo(keyEvent)) == null) {
                KeyCommand m357mapZmokQxo = BasicTextKt.platformDefaultKeyMapping.m357mapZmokQxo(keyEvent);
                if (m357mapZmokQxo == null || (m357mapZmokQxo.getEditsText() && !z4)) {
                    i = 3;
                    z = false;
                } else {
                    TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
                    LayoutCoordinates textLayoutNodeCoordinates = textLayoutState.getTextLayoutNodeCoordinates();
                    if (textLayoutNodeCoordinates != null) {
                        Rect rect = null;
                        LayoutCoordinates layoutCoordinates = textLayoutNodeCoordinates.isAttached() ? textLayoutNodeCoordinates : null;
                        if (layoutCoordinates != null) {
                            LayoutCoordinates decoratorNodeCoordinates = textLayoutState.getDecoratorNodeCoordinates();
                            if (decoratorNodeCoordinates != null) {
                                if (!decoratorNodeCoordinates.isAttached()) {
                                    decoratorNodeCoordinates = null;
                                }
                                if (decoratorNodeCoordinates != null) {
                                    rect = decoratorNodeCoordinates.localBoundingBoxOf(layoutCoordinates, true);
                                }
                            }
                            if (rect != null) {
                                z2 = true;
                                z3 = z5;
                                f = Float.intBitsToFloat((int) (rect.m634getSizeNHjbRc() & BodyPartID.bodyIdMax));
                                i = 3;
                                SelectionMovementDeletionContext selectionMovementDeletionContext = new SelectionMovementDeletionContext(transformedTextFieldState, layoutResult, Strings.m3987isFromSoftKeyboardZmokQxo(keyEvent), f, textFieldPreparedSelectionState);
                                ParcelableSnapshotMutableState parcelableSnapshotMutableState = transformedTextFieldState.selectionWedgeAffinity$delegate;
                                TextFieldState textFieldState = transformedTextFieldState.textFieldState;
                                switch (m357mapZmokQxo.ordinal()) {
                                    case 0:
                                        selectionMovementDeletionContext.collapseLeftOr(new ButtonKt$$ExternalSyntheticLambda2(2));
                                        z = z2;
                                        if (m357mapZmokQxo != KeyCommand.UP || m357mapZmokQxo == KeyCommand.DOWN || m357mapZmokQxo == KeyCommand.LEFT_CHAR || m357mapZmokQxo == KeyCommand.RIGHT_CHAR) {
                                            z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                        }
                                        if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                            transformedTextFieldState.m416selectCharsIn5zctL8(selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                        }
                                        if (selectionMovementDeletionContext.getWedgeAffinity() != null && (wedgeAffinity = selectionMovementDeletionContext.getWedgeAffinity()) != null) {
                                            if (!TextRange.m987getCollapsedimpl(textFieldState.getValue$foundation().selection)) {
                                                parcelableSnapshotMutableState.setValue(new SelectionWedgeAffinity(wedgeAffinity, wedgeAffinity));
                                                break;
                                            } else {
                                                parcelableSnapshotMutableState.setValue(new SelectionWedgeAffinity(selectionMovementDeletionContext.getInitialWedgeAffinity().startAffinity, wedgeAffinity));
                                                break;
                                            }
                                        }
                                        break;
                                    case 1:
                                        selectionMovementDeletionContext.collapseRightOr(new ButtonKt$$ExternalSyntheticLambda2(i));
                                        z = z2;
                                        if (m357mapZmokQxo != KeyCommand.UP) {
                                            break;
                                        }
                                        z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                        if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                        }
                                        if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            if (!TextRange.m987getCollapsedimpl(textFieldState.getValue$foundation().selection)) {
                                            }
                                            break;
                                        }
                                        break;
                                    case 2:
                                        selectionMovementDeletionContext.moveCursorRightByWord();
                                        z = z2;
                                        if (m357mapZmokQxo != KeyCommand.UP) {
                                        }
                                        z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                        if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                        }
                                        if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                        }
                                        break;
                                    case 3:
                                        selectionMovementDeletionContext.moveCursorLeftByWord();
                                        z = z2;
                                        if (m357mapZmokQxo != KeyCommand.UP) {
                                        }
                                        z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                        if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                        }
                                        if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                        }
                                        break;
                                    case 4:
                                        selectionMovementDeletionContext.moveCursorNextByParagraph();
                                        z = z2;
                                        if (m357mapZmokQxo != KeyCommand.UP) {
                                        }
                                        z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                        if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                        }
                                        if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                        }
                                        break;
                                    case 5:
                                        selectionMovementDeletionContext.moveCursorPrevByParagraph();
                                        z = z2;
                                        if (m357mapZmokQxo != KeyCommand.UP) {
                                        }
                                        z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                        if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                        }
                                        if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                        }
                                        break;
                                    case 6:
                                        selectionMovementDeletionContext.moveCursorToLineStart();
                                        z = z2;
                                        if (m357mapZmokQxo != KeyCommand.UP) {
                                        }
                                        z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                        if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                        }
                                        if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                        }
                                        break;
                                    case 7:
                                        selectionMovementDeletionContext.moveCursorToLineEnd();
                                        z = z2;
                                        if (m357mapZmokQxo != KeyCommand.UP) {
                                        }
                                        z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                        if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                        }
                                        if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                        }
                                        break;
                                    case 8:
                                        selectionMovementDeletionContext.moveCursorToLineLeftSide();
                                        z = z2;
                                        if (m357mapZmokQxo != KeyCommand.UP) {
                                        }
                                        z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                        if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                        }
                                        if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                        }
                                        break;
                                    case 9:
                                        selectionMovementDeletionContext.moveCursorToLineRightSide();
                                        z = z2;
                                        if (m357mapZmokQxo != KeyCommand.UP) {
                                        }
                                        z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                        if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                        }
                                        if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                        }
                                        break;
                                    case 10:
                                        selectionMovementDeletionContext.moveCursorUpByLine();
                                        z = z2;
                                        if (m357mapZmokQxo != KeyCommand.UP) {
                                        }
                                        z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                        if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                        }
                                        if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                        }
                                        break;
                                    case 11:
                                        selectionMovementDeletionContext.moveCursorDownByLine();
                                        z = z2;
                                        if (m357mapZmokQxo != KeyCommand.UP) {
                                        }
                                        z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                        if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                        }
                                        if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                        }
                                        break;
                                    case 12:
                                        requireKeyboardController.show();
                                        z = z2;
                                        if (m357mapZmokQxo != KeyCommand.UP) {
                                        }
                                        z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                        if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                        }
                                        if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                        }
                                        break;
                                    case 13:
                                        selectionMovementDeletionContext.moveCursorUpByPage();
                                        z = z2;
                                        if (m357mapZmokQxo != KeyCommand.UP) {
                                        }
                                        z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                        if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                        }
                                        if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                        }
                                        break;
                                    case 14:
                                        selectionMovementDeletionContext.moveCursorDownByPage();
                                        z = z2;
                                        if (m357mapZmokQxo != KeyCommand.UP) {
                                        }
                                        z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                        if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                        }
                                        if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                        }
                                        break;
                                    case 15:
                                        selectionMovementDeletionContext.moveCursorToHome();
                                        z = z2;
                                        if (m357mapZmokQxo != KeyCommand.UP) {
                                        }
                                        z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                        if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                        }
                                        if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                        }
                                        break;
                                    case 16:
                                        selectionMovementDeletionContext.moveCursorToEnd();
                                        z = z2;
                                        if (m357mapZmokQxo != KeyCommand.UP) {
                                        }
                                        z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                        if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                        }
                                        if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                        }
                                        break;
                                    case 17:
                                    case 18:
                                    case 19:
                                        this.clipboardKeyCommandsHandler.invoke(m357mapZmokQxo);
                                        z = z2;
                                        if (m357mapZmokQxo != KeyCommand.UP) {
                                        }
                                        z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                        if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                        }
                                        if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                        }
                                        break;
                                    case 20:
                                        selectionMovementDeletionContext.moveCursorPrevByCodePointOrEmoji();
                                        selectionMovementDeletionContext.deleteMovement();
                                        z = z2;
                                        if (m357mapZmokQxo != KeyCommand.UP) {
                                        }
                                        z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                        if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                        }
                                        if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                        }
                                        break;
                                    case 21:
                                        selectionMovementDeletionContext.moveCursorNextByChar();
                                        selectionMovementDeletionContext.deleteMovement();
                                        z = z2;
                                        if (m357mapZmokQxo != KeyCommand.UP) {
                                        }
                                        z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                        if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                        }
                                        if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                        }
                                        break;
                                    case 22:
                                        selectionMovementDeletionContext.moveCursorPrevByWord();
                                        selectionMovementDeletionContext.deleteMovement();
                                        z = z2;
                                        if (m357mapZmokQxo != KeyCommand.UP) {
                                        }
                                        z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                        if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                        }
                                        if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                        }
                                        break;
                                    case 23:
                                        selectionMovementDeletionContext.moveCursorNextByWord();
                                        selectionMovementDeletionContext.deleteMovement();
                                        z = z2;
                                        if (m357mapZmokQxo != KeyCommand.UP) {
                                        }
                                        z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                        if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                        }
                                        if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                        }
                                        break;
                                    case 24:
                                        selectionMovementDeletionContext.moveCursorToLineStart();
                                        selectionMovementDeletionContext.deleteMovement();
                                        z = z2;
                                        if (m357mapZmokQxo != KeyCommand.UP) {
                                        }
                                        z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                        if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                        }
                                        if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                        }
                                        break;
                                    case 25:
                                        selectionMovementDeletionContext.moveCursorToLineEnd();
                                        selectionMovementDeletionContext.deleteMovement();
                                        z = z2;
                                        if (m357mapZmokQxo != KeyCommand.UP) {
                                        }
                                        z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                        if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                        }
                                        if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                        }
                                        break;
                                    case 26:
                                        selectionMovementDeletionContext.selectAll();
                                        z = z2;
                                        if (m357mapZmokQxo != KeyCommand.UP) {
                                        }
                                        z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                        if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                        }
                                        if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                        }
                                        break;
                                    case 27:
                                        selectionMovementDeletionContext.moveCursorLeftByChar();
                                        selectionMovementDeletionContext.selectMovement();
                                        z = z2;
                                        if (m357mapZmokQxo != KeyCommand.UP) {
                                        }
                                        z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                        if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                        }
                                        if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                        }
                                        break;
                                    case 28:
                                        selectionMovementDeletionContext.moveCursorRightByChar();
                                        selectionMovementDeletionContext.selectMovement();
                                        z = z2;
                                        if (m357mapZmokQxo != KeyCommand.UP) {
                                        }
                                        z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                        if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                        }
                                        if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                        }
                                        break;
                                    case 29:
                                        selectionMovementDeletionContext.moveCursorUpByLine();
                                        selectionMovementDeletionContext.selectMovement();
                                        z = z2;
                                        if (m357mapZmokQxo != KeyCommand.UP) {
                                        }
                                        z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                        if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                        }
                                        if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                        }
                                        break;
                                    case 30:
                                        selectionMovementDeletionContext.moveCursorDownByLine();
                                        selectionMovementDeletionContext.selectMovement();
                                        z = z2;
                                        if (m357mapZmokQxo != KeyCommand.UP) {
                                        }
                                        z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                        if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                        }
                                        if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                        }
                                        break;
                                    case 31:
                                        selectionMovementDeletionContext.moveCursorUpByPage();
                                        selectionMovementDeletionContext.selectMovement();
                                        z = z2;
                                        if (m357mapZmokQxo != KeyCommand.UP) {
                                        }
                                        z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                        if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                        }
                                        if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                        }
                                        break;
                                    case 32:
                                        selectionMovementDeletionContext.moveCursorDownByPage();
                                        selectionMovementDeletionContext.selectMovement();
                                        z = z2;
                                        if (m357mapZmokQxo != KeyCommand.UP) {
                                        }
                                        z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                        if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                        }
                                        if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                        }
                                        break;
                                    case 33:
                                        selectionMovementDeletionContext.moveCursorToHome();
                                        selectionMovementDeletionContext.selectMovement();
                                        z = z2;
                                        if (m357mapZmokQxo != KeyCommand.UP) {
                                        }
                                        z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                        if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                        }
                                        if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                        }
                                        break;
                                    case 34:
                                        selectionMovementDeletionContext.moveCursorToEnd();
                                        selectionMovementDeletionContext.selectMovement();
                                        z = z2;
                                        if (m357mapZmokQxo != KeyCommand.UP) {
                                        }
                                        z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                        if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                        }
                                        if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                        }
                                        break;
                                    case 35:
                                        selectionMovementDeletionContext.moveCursorLeftByWord();
                                        selectionMovementDeletionContext.selectMovement();
                                        z = z2;
                                        if (m357mapZmokQxo != KeyCommand.UP) {
                                        }
                                        z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                        if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                        }
                                        if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                        }
                                        break;
                                    case 36:
                                        selectionMovementDeletionContext.moveCursorRightByWord();
                                        selectionMovementDeletionContext.selectMovement();
                                        z = z2;
                                        if (m357mapZmokQxo != KeyCommand.UP) {
                                        }
                                        z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                        if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                        }
                                        if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                        }
                                        break;
                                    case 37:
                                        selectionMovementDeletionContext.moveCursorNextByParagraph();
                                        selectionMovementDeletionContext.selectMovement();
                                        z = z2;
                                        if (m357mapZmokQxo != KeyCommand.UP) {
                                        }
                                        z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                        if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                        }
                                        if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                        }
                                        break;
                                    case 38:
                                        selectionMovementDeletionContext.moveCursorPrevByParagraph();
                                        selectionMovementDeletionContext.selectMovement();
                                        z = z2;
                                        if (m357mapZmokQxo != KeyCommand.UP) {
                                        }
                                        z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                        if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                        }
                                        if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                        }
                                        break;
                                    case 39:
                                        selectionMovementDeletionContext.moveCursorToLineStart();
                                        selectionMovementDeletionContext.selectMovement();
                                        z = z2;
                                        if (m357mapZmokQxo != KeyCommand.UP) {
                                        }
                                        z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                        if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                        }
                                        if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                        }
                                        break;
                                    case 40:
                                        selectionMovementDeletionContext.moveCursorToLineEnd();
                                        selectionMovementDeletionContext.selectMovement();
                                        z = z2;
                                        if (m357mapZmokQxo != KeyCommand.UP) {
                                        }
                                        z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                        if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                        }
                                        if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                        }
                                        break;
                                    case 41:
                                        selectionMovementDeletionContext.moveCursorToLineLeftSide();
                                        selectionMovementDeletionContext.selectMovement();
                                        z = z2;
                                        if (m357mapZmokQxo != KeyCommand.UP) {
                                        }
                                        z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                        if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                        }
                                        if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                        }
                                        break;
                                    case 42:
                                        selectionMovementDeletionContext.moveCursorToLineRightSide();
                                        selectionMovementDeletionContext.selectMovement();
                                        z = z2;
                                        if (m357mapZmokQxo != KeyCommand.UP) {
                                        }
                                        z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                        if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                        }
                                        if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                        }
                                        break;
                                    case 43:
                                        selectionMovementDeletionContext.deselect();
                                        z = z2;
                                        if (m357mapZmokQxo != KeyCommand.UP) {
                                        }
                                        z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                        if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                        }
                                        if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                        }
                                        break;
                                    case 44:
                                        if (z3) {
                                            z = ((Boolean) textFieldDecoratorModifierNode$$ExternalSyntheticLambda12.invoke()).booleanValue();
                                            if (m357mapZmokQxo != KeyCommand.UP) {
                                            }
                                            z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                            if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                        } else {
                                            TransformedTextFieldState.replaceSelectedText$default(transformedTextFieldState, "\n", !Strings.m3987isFromSoftKeyboardZmokQxo(keyEvent), 4);
                                            z = z2;
                                            if (m357mapZmokQxo != KeyCommand.UP) {
                                            }
                                            z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                            if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                        }
                                        break;
                                    case 45:
                                        if (z3) {
                                            z = false;
                                            if (m357mapZmokQxo != KeyCommand.UP) {
                                            }
                                            z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                            if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                        } else {
                                            TransformedTextFieldState.replaceSelectedText$default(transformedTextFieldState, "\t", !Strings.m3987isFromSoftKeyboardZmokQxo(keyEvent), 4);
                                            z = z2;
                                            if (m357mapZmokQxo != KeyCommand.UP) {
                                            }
                                            z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                            if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                            }
                                            if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                            }
                                        }
                                        break;
                                    case 46:
                                        TextFieldState textFieldState2 = (TextFieldState) textFieldState.undoState.f61default;
                                        WorkLauncherImpl workLauncherImpl = textFieldState2.textUndoManager;
                                        UndoManager undoManager = (UndoManager) workLauncherImpl.processor;
                                        SnapshotStateList snapshotStateList = undoManager.undoStack;
                                        if (!snapshotStateList.isEmpty() || ((TextUndoOperation) ((ParcelableSnapshotMutableState) workLauncherImpl.workTaskExecutor).getValue()) != null) {
                                            workLauncherImpl.flush();
                                            if (snapshotStateList.isEmpty()) {
                                                InlineClassHelperKt.throwIllegalStateException("It's an error to call undo while there is nothing to undo. Please first check `canUndo` value before calling the `undo` function.");
                                            }
                                            Object removeLast = CollectionsKt__MutableCollectionsKt.removeLast(snapshotStateList);
                                            undoManager.redoStack.add(removeLast);
                                            zzadm.undo(textFieldState2, (TextUndoOperation) removeLast);
                                        }
                                        z = z2;
                                        if (m357mapZmokQxo != KeyCommand.UP) {
                                        }
                                        z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                        if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                        }
                                        if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                        }
                                        break;
                                    case 47:
                                        TextFieldState textFieldState3 = (TextFieldState) textFieldState.undoState.f61default;
                                        WorkLauncherImpl workLauncherImpl2 = textFieldState3.textUndoManager;
                                        UndoManager undoManager2 = (UndoManager) workLauncherImpl2.processor;
                                        SnapshotStateList snapshotStateList2 = undoManager2.redoStack;
                                        if (!snapshotStateList2.isEmpty() && ((TextUndoOperation) ((ParcelableSnapshotMutableState) workLauncherImpl2.workTaskExecutor).getValue()) == null) {
                                            if (snapshotStateList2.isEmpty()) {
                                                InlineClassHelperKt.throwIllegalStateException("It's an error to call redo while there is nothing to redo. Please first check `canRedo` value before calling the `redo` function.");
                                            }
                                            Object removeLast2 = CollectionsKt__MutableCollectionsKt.removeLast(snapshotStateList2);
                                            undoManager2.undoStack.add(removeLast2);
                                            zzadm.redo(textFieldState3, (TextUndoOperation) removeLast2);
                                        }
                                        z = z2;
                                        if (m357mapZmokQxo != KeyCommand.UP) {
                                        }
                                        z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                        if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                        }
                                        if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                        }
                                        break;
                                    case 48:
                                        z = z2;
                                        if (m357mapZmokQxo != KeyCommand.UP) {
                                        }
                                        z = !TextRange.m986equalsimpl0(selectionMovementDeletionContext.getInitialValue().selection, selectionMovementDeletionContext.m418getSelectiond9O1mEE());
                                        if (!TextRange.m986equalsimpl0(selectionMovementDeletionContext.m418getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().selection)) {
                                        }
                                        if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                                        }
                                        break;
                                    default:
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return false;
                                }
                            }
                        }
                    }
                    z2 = true;
                    z3 = z5;
                    f = Float.NaN;
                    i = 3;
                    SelectionMovementDeletionContext selectionMovementDeletionContext2 = new SelectionMovementDeletionContext(transformedTextFieldState, layoutResult, Strings.m3987isFromSoftKeyboardZmokQxo(keyEvent), f, textFieldPreparedSelectionState);
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = transformedTextFieldState.selectionWedgeAffinity$delegate;
                    TextFieldState textFieldState4 = transformedTextFieldState.textFieldState;
                    switch (m357mapZmokQxo.ordinal()) {
                    }
                }
            } else {
                String sb = new StringBuilder(2).appendCodePoint(m350consumeZmokQxo.intValue()).toString();
                if (z4) {
                    TransformedTextFieldState.replaceSelectedText$default(transformedTextFieldState, sb, !Strings.m3987isFromSoftKeyboardZmokQxo(keyEvent), 4);
                    textFieldPreparedSelectionState.cachedX = Float.NaN;
                    z = true;
                } else {
                    z = false;
                }
                i = 3;
            }
            if (z) {
                MutableLongSet mutableLongSet3 = (MutableLongSet) grpcMethod.responseAdapter;
                if (mutableLongSet3 == null) {
                    mutableLongSet3 = new MutableLongSet(i);
                    grpcMethod.responseAdapter = mutableLongSet3;
                }
                mutableLongSet3.plusAssign(m782getKeyZmokQxo);
            }
            return z;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        DepthSortedSetKt.observeReads(this, new TextFieldDecoratorModifierNode$$ExternalSyntheticLambda1(this, 2));
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public final void onPlaced(LayoutCoordinates layoutCoordinates) {
        this.dragAndDropNode.getClass();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public final void mo162onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        this.pointerInputNode.mo162onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j);
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onPreKeyEvent-ZmokQxo */
    public final boolean mo163onPreKeyEventZmokQxo(KeyEvent keyEvent) {
        TransformedTextFieldState transformedTextFieldState = this.textFieldState;
        TextFieldSelectionState textFieldSelectionState = this.textFieldSelectionState;
        requireKeyboardController();
        this.textFieldKeyEventHandler.getClass();
        if (TextRange.m987getCollapsedimpl(transformedTextFieldState.getVisualText().selection) || !KeyMappingKt.m353cancelsTextSelectionZmokQxo(keyEvent)) {
            return false;
        }
        TransformedTextFieldState transformedTextFieldState2 = textFieldSelectionState.textFieldState;
        if (!TextRange.m987getCollapsedimpl(transformedTextFieldState2.getVisualText().selection)) {
            TextFieldState textFieldState = transformedTextFieldState2.textFieldState;
            InputTransformation inputTransformation = transformedTextFieldState2.inputTransformation;
            TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
            textFieldState.mainBuffer.getChangeTracker$foundation().clearChanges();
            TextFieldBuffer textFieldBuffer = textFieldState.mainBuffer;
            ImageResourcesKt.setSelectionCoerced(textFieldBuffer, (int) (textFieldBuffer.selectionInChars & BodyPartID.bodyIdMax), r5);
            TextFieldState.access$commitEditAsUser(textFieldState, inputTransformation, true, textFieldEditUndoBehavior);
            textFieldState.setUserCommit(true);
        }
        textFieldSelectionState.setShowCursorHandle(false);
        textFieldSelectionState.setTextToolbarState(TextToolbarState.None);
        return true;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode, androidx.compose.ui.node.MeasuredSizeAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public final void mo197onRemeasuredozmzZPI(long j) {
        this.dragAndDropNode.size = j;
    }

    public final DelegatingSoftwareKeyboardController requireKeyboardController() {
        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) DepthSortedSetKt.currentValueOf(this, CompositionLocalsKt.LocalSoftwareKeyboardController);
        if (delegatingSoftwareKeyboardController != null) {
            return delegatingSoftwareKeyboardController;
        }
        a$$ExternalSyntheticBUOutline0.m$1("No software keyboard controller");
        return null;
    }

    public final void startInputSession(boolean z) {
        if (!z) {
            Boolean bool = this.keyboardOptions.showKeyboardOnFocus;
            if (!(bool != null ? bool.booleanValue() : true)) {
                return;
            }
        }
        ReceiveContentConfigurationKt.getReceiveContentConfiguration(this);
        this.inputSessionJob = JobKt.launch$default(getCoroutineScope(), null, null, new TextFieldDecoratorModifierNode$startInputSession$1(this, null, 0), 3);
    }
}
