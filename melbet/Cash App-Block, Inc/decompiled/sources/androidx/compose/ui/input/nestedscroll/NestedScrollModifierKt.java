package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.Modifier;
import androidx.datastore.core.SimpleActor;

/* loaded from: classes.dex */
public abstract class NestedScrollModifierKt {
    public static final Modifier nestedScroll(Modifier modifier, NestedScrollConnection nestedScrollConnection, SimpleActor simpleActor) {
        return modifier.then(new NestedScrollElement(nestedScrollConnection, simpleActor));
    }
}
