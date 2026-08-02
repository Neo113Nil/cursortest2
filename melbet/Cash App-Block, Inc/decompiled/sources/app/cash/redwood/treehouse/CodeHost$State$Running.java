package app.cash.redwood.treehouse;

import androidx.room.Room;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes3.dex */
public final class CodeHost$State$Running extends Room {
    public final ZiplineCodeSession codeSession;
    public final CoroutineScope codeUpdatesScope;

    public CodeHost$State$Running(CoroutineScope coroutineScope, ZiplineCodeSession ziplineCodeSession) {
        ziplineCodeSession.getClass();
        this.codeUpdatesScope = coroutineScope;
        this.codeSession = ziplineCodeSession;
    }

    @Override // androidx.room.Room
    public final ZiplineCodeSession getCodeSession() {
        return this.codeSession;
    }

    @Override // androidx.room.Room
    public final CoroutineScope getCodeUpdatesScope() {
        return this.codeUpdatesScope;
    }
}
