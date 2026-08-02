package app.cash.redwood.treehouse;

import androidx.room.Room;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes3.dex */
public final class CodeHost$State$Starting extends Room {
    public final ContextScope codeUpdatesScope;

    public CodeHost$State$Starting(ContextScope contextScope) {
        this.codeUpdatesScope = contextScope;
    }

    @Override // androidx.room.Room
    public final CoroutineScope getCodeUpdatesScope() {
        return this.codeUpdatesScope;
    }
}
