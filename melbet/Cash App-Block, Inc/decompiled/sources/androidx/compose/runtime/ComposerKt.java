package androidx.compose.runtime;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public abstract class ComposerKt {
    public static final OpaqueKey invocation = new OpaqueKey("provider");
    public static final OpaqueKey provider = new OpaqueKey("provider");
    public static final OpaqueKey compositionLocalMap = new OpaqueKey("compositionLocalMap");
    public static final OpaqueKey providerMaps = new OpaqueKey("providers");
    public static final OpaqueKey reference = new OpaqueKey("reference");

    public static final void composeImmediateRuntimeError(String str) {
        throw new ComposeRuntimeError(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final Void composeRuntimeError(String str) {
        throw new ComposeRuntimeError(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }
}
