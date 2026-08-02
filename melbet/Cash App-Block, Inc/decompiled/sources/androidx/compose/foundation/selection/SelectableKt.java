package androidx.compose.foundation.selection;

import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.text.BasicTextKt$$ExternalSyntheticLambda14;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import app.cash.molecule.PlatformKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public abstract class SelectableKt {
    /* renamed from: selectable-O2vRcR0, reason: not valid java name */
    public static final Modifier m334selectableO2vRcR0(Modifier modifier, boolean z, MutableInteractionSourceImpl mutableInteractionSourceImpl, IndicationNodeFactory indicationNodeFactory, boolean z2, Role role, Function0 function0) {
        Modifier then;
        if (indicationNodeFactory != null) {
            then = new SelectableElement(z, mutableInteractionSourceImpl, indicationNodeFactory, false, z2, role, function0);
        } else if (indicationNodeFactory == null) {
            then = new SelectableElement(z, mutableInteractionSourceImpl, null, false, z2, role, function0);
        } else {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            then = mutableInteractionSourceImpl != null ? IndicationKt.indication(companion, mutableInteractionSourceImpl, indicationNodeFactory).then(new SelectableElement(z, mutableInteractionSourceImpl, null, false, z2, role, function0)) : PlatformKt.composed(companion, new SelectableKt$selectableO2vRcR0$$inlined$clickableWithIndicationIfNeeded$1(indicationNodeFactory, z, z2, role, function0, 0));
        }
        return modifier.then(then);
    }

    /* renamed from: selectable-oSLSa3U$default, reason: not valid java name */
    public static Modifier m335selectableoSLSa3U$default(Modifier modifier, boolean z, boolean z2, Role role, Function0 function0, int i) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        boolean z3 = z2;
        if ((i & 4) != 0) {
            role = null;
        }
        return modifier.then(new SelectableElement(z, null, null, true, z3, role, function0));
    }

    public static final Modifier selectableGroup(Modifier modifier) {
        return SemanticsModifierKt.semantics(modifier, false, new BasicTextKt$$ExternalSyntheticLambda14(12));
    }

    /* renamed from: toggleable-O2vRcR0, reason: not valid java name */
    public static final Modifier m336toggleableO2vRcR0(Modifier modifier, boolean z, MutableInteractionSourceImpl mutableInteractionSourceImpl, IndicationNodeFactory indicationNodeFactory, boolean z2, Role role, Function1 function1) {
        Modifier then;
        if (indicationNodeFactory != null) {
            then = new ToggleableElement(z, mutableInteractionSourceImpl, indicationNodeFactory, false, z2, role, function1);
        } else if (indicationNodeFactory == null) {
            then = new ToggleableElement(z, mutableInteractionSourceImpl, null, false, z2, role, function1);
        } else {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            then = mutableInteractionSourceImpl != null ? IndicationKt.indication(companion, mutableInteractionSourceImpl, indicationNodeFactory).then(new ToggleableElement(z, mutableInteractionSourceImpl, null, false, z2, role, function1)) : PlatformKt.composed(companion, new SelectableKt$selectableO2vRcR0$$inlined$clickableWithIndicationIfNeeded$1(indicationNodeFactory, z, z2, role, function1, 1));
        }
        return modifier.then(then);
    }

    /* renamed from: toggleable-oSLSa3U$default, reason: not valid java name */
    public static Modifier m337toggleableoSLSa3U$default(Modifier modifier, boolean z, boolean z2, Role role, Function1 function1, int i) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        boolean z3 = z2;
        if ((i & 4) != 0) {
            role = null;
        }
        return modifier.then(new ToggleableElement(z, null, null, true, z3, role, function1));
    }
}
