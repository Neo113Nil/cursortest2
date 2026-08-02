package ru.kinopoisk.sdk.easylogin.internal;

import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.impl.SessionLoggerPreferencesStorageImpl;

/* loaded from: classes5.dex */
public final class F0 extends F8 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public F0(@NotNull C1121l6 c1121l6, @NotNull SessionLoggerPreferencesStorageImpl sessionLoggerPreferencesStorageImpl) {
        super(c1121l6, r0);
        c1121l6.getClass();
        sessionLoggerPreferencesStorageImpl.getClass();
        C1171p0 c1171p0 = new C1171p0(sessionLoggerPreferencesStorageImpl);
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        c1171p0.setSessionId(uuid);
    }
}
