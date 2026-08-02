package androidx.compose.ui.semantics;

import androidx.compose.ui.autofill.ContentType;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.ImeAction;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.bouncycastle.cms.CMSAttributeTableGenerator;

/* loaded from: classes.dex */
public abstract class SemanticsPropertiesKt {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1), new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "isSensitiveData", "isSensitiveData(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, CMSAttributeTableGenerator.CONTENT_TYPE, "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", 1), new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentDataType;", 1), new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "fillableData", "getFillableData(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/FillableData;", 1), new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1), new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "inputText", "getInputText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1), new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "textCompositionRange", "getTextCompositionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/TextRange;", 1), new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1), new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1), new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1), new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "inputTextSuggestionState", "getInputTextSuggestionState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/InputTextSuggestionState;", 1), new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "shape", "getShape(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/graphics/Shape;", 1), new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1)};

    static {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.ContentDescription;
        SemanticsPropertyKey semanticsPropertyKey2 = SemanticsActions.GetTextLayoutResult;
    }

    public static final void disabled(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.ContentDescription;
        semanticsPropertyReceiver.set(SemanticsProperties.Disabled, Unit.INSTANCE);
    }

    public static final void heading(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.ContentDescription;
        semanticsPropertyReceiver.set(SemanticsProperties.Heading, Unit.INSTANCE);
    }

    public static final void hideFromAccessibility(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.ContentDescription;
        semanticsPropertyReceiver.set(SemanticsProperties.HideFromAccessibility, Unit.INSTANCE);
    }

    public static final void invisibleToUser(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.ContentDescription;
        semanticsPropertyReceiver.set(SemanticsProperties.InvisibleToUser, Unit.INSTANCE);
    }

    public static final void onClick(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0) {
        semanticsPropertyReceiver.set(SemanticsActions.OnClick, new AccessibilityAction(str, function0));
    }

    /* renamed from: onImeAction-9UiTYpY$default, reason: not valid java name */
    public static void m948onImeAction9UiTYpY$default(SemanticsPropertyReceiver semanticsPropertyReceiver, int i, Function0 function0) {
        semanticsPropertyReceiver.set(SemanticsProperties.ImeAction, new ImeAction(i));
        semanticsPropertyReceiver.set(SemanticsActions.OnImeAction, new AccessibilityAction(null, function0));
    }

    public static final void setCollectionInfo(SemanticsPropertyReceiver semanticsPropertyReceiver, CollectionInfo collectionInfo) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.ContentDescription;
        SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.CollectionInfo;
        KProperty kProperty = $$delegatedProperties[24];
        semanticsPropertyReceiver.set(semanticsPropertyKey2, collectionInfo);
    }

    public static final void setContainer(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.IsContainer;
        KProperty kProperty = $$delegatedProperties[5];
        semanticsPropertyReceiver.set(semanticsPropertyKey, Boolean.TRUE);
    }

    public static final void setContentDescription(SemanticsPropertyReceiver semanticsPropertyReceiver, String str) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.ContentDescription;
        semanticsPropertyReceiver.set(SemanticsProperties.ContentDescription, CollectionsKt__CollectionsJVMKt.listOf(str));
    }

    public static final void setContentType(SemanticsPropertyReceiver semanticsPropertyReceiver, ContentType contentType) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.ContentDescription;
        SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.ContentType;
        KProperty kProperty = $$delegatedProperties[8];
        semanticsPropertyReceiver.set(semanticsPropertyKey2, contentType);
    }

    public static final void setCustomActions(SemanticsPropertyReceiver semanticsPropertyReceiver, List list) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsActions.GetTextLayoutResult;
        SemanticsPropertyKey semanticsPropertyKey2 = SemanticsActions.CustomActions;
        KProperty kProperty = $$delegatedProperties[31];
        semanticsPropertyReceiver.set(semanticsPropertyKey2, list);
    }

    /* renamed from: setLiveRegion-hR3wRGc, reason: not valid java name */
    public static final void m949setLiveRegionhR3wRGc(SemanticsPropertyReceiver semanticsPropertyReceiver, int i) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.LiveRegion;
        KProperty kProperty = $$delegatedProperties[3];
        semanticsPropertyReceiver.set(semanticsPropertyKey, LiveRegionMode.m943boximpl(i));
    }

    public static final void setPaneTitle(SemanticsPropertyReceiver semanticsPropertyReceiver, String str) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.ContentDescription;
        SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.PaneTitle;
        KProperty kProperty = $$delegatedProperties[2];
        semanticsPropertyReceiver.set(semanticsPropertyKey2, str);
    }

    public static final void setProgressBarRangeInfo(SemanticsPropertyReceiver semanticsPropertyReceiver, ProgressBarRangeInfo progressBarRangeInfo) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.ContentDescription;
        SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.ProgressBarRangeInfo;
        KProperty kProperty = $$delegatedProperties[1];
        semanticsPropertyReceiver.set(semanticsPropertyKey2, progressBarRangeInfo);
    }

    /* renamed from: setRole-kuIjeqM, reason: not valid java name */
    public static final void m950setRolekuIjeqM(SemanticsPropertyReceiver semanticsPropertyReceiver, int i) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.Role;
        KProperty kProperty = $$delegatedProperties[14];
        semanticsPropertyReceiver.set(semanticsPropertyKey, new Role(i));
    }

    public static final void setSelected(SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.ContentDescription;
        SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.Selected;
        KProperty kProperty = $$delegatedProperties[23];
        semanticsPropertyReceiver.set(semanticsPropertyKey2, Boolean.valueOf(z));
    }

    public static final void setShape(SemanticsPropertyReceiver semanticsPropertyReceiver, Shape shape) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.ContentDescription;
        SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.Shape;
        KProperty kProperty = $$delegatedProperties[30];
        semanticsPropertyReceiver.set(semanticsPropertyKey2, shape);
    }

    public static final void setStateDescription(SemanticsPropertyReceiver semanticsPropertyReceiver, String str) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.ContentDescription;
        SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.StateDescription;
        KProperty kProperty = $$delegatedProperties[0];
        semanticsPropertyReceiver.set(semanticsPropertyKey2, str);
    }

    public static final void setTestTag(SemanticsPropertyReceiver semanticsPropertyReceiver, String str) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.ContentDescription;
        SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.TestTag;
        KProperty kProperty = $$delegatedProperties[15];
        semanticsPropertyReceiver.set(semanticsPropertyKey2, str);
    }

    public static final void setText(SemanticsPropertyReceiver semanticsPropertyReceiver, AnnotatedString annotatedString) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.ContentDescription;
        semanticsPropertyReceiver.set(SemanticsProperties.Text, CollectionsKt__CollectionsJVMKt.listOf(annotatedString));
    }

    public static final void setTraversalGroup(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.IsTraversalGroup;
        KProperty kProperty = $$delegatedProperties[6];
        semanticsPropertyReceiver.set(semanticsPropertyKey, Boolean.TRUE);
    }

    public static final void setTraversalIndex(SemanticsPropertyReceiver semanticsPropertyReceiver, float f) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.ContentDescription;
        SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.TraversalIndex;
        KProperty kProperty = $$delegatedProperties[11];
        semanticsPropertyReceiver.set(semanticsPropertyKey2, Float.valueOf(f));
    }
}
