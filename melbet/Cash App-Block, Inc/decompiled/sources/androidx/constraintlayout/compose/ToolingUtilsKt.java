package androidx.constraintlayout.compose;

import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

/* loaded from: classes3.dex */
public abstract class ToolingUtilsKt {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.factory.mutableProperty1(new MutablePropertyReference1Impl(ToolingUtilsKt.class, "designInfoProvider", "getDesignInfoProvider(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/constraintlayout/compose/DesignInfoProvider;", 1))};
    public static final SemanticsPropertyKey DesignInfoDataKey = new SemanticsPropertyKey("DesignInfoProvider");

    public static final void setDesignInfoProvider(SemanticsPropertyReceiver semanticsPropertyReceiver, Measurer2 measurer2) {
        KProperty kProperty = $$delegatedProperties[0];
        SemanticsPropertyKey semanticsPropertyKey = DesignInfoDataKey;
        semanticsPropertyKey.getClass();
        semanticsPropertyReceiver.set(semanticsPropertyKey, measurer2);
    }
}
