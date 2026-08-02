package androidx.compose.ui.semantics;

import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.KProperty;

/* loaded from: classes3.dex */
public abstract class SemanticsProperties_androidKt {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {new MutablePropertyReference1Impl(SemanticsProperties_androidKt.class, "testTagsAsResourceId", "getTestTagsAsResourceId(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl(SemanticsProperties_androidKt.class, "accessibilityClassName", "getAccessibilityClassName(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)};

    static {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsPropertiesAndroid.TestTagsAsResourceId;
    }

    public static final void setTestTagsAsResourceId(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsPropertiesAndroid.TestTagsAsResourceId;
        KProperty kProperty = $$delegatedProperties[0];
        semanticsPropertyReceiver.set(semanticsPropertyKey, Boolean.TRUE);
    }
}
