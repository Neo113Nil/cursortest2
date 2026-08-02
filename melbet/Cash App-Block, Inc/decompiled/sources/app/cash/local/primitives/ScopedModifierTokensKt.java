package app.cash.local.primitives;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.collections.EmptyList;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public abstract class ScopedModifierTokensKt {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewDeviceManager.deepLinkSpecs;
    }

    public static final void requireNoModifierScopeSeparator(String str) {
        str.getClass();
        if (StringsKt.contains((CharSequence) str, (CharSequence) "\u001f", false)) {
            a$$ExternalSyntheticBUOutline0.m$3("Catalog modifier tokens cannot contain the nested modifier scope separator.");
        }
    }
}
