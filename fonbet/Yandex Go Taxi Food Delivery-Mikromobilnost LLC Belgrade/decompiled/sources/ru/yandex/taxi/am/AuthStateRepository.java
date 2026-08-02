package ru.yandex.taxi.am;

import defpackage.bvf0;
import defpackage.gci0;
import defpackage.k4o;
import kotlin.Metadata;

/* loaded from: classes9.dex */
public final class AuthStateRepository {
    public final kotlinx.coroutines.flow.r0 a;
    public final gci0 b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/am/AuthStateRepository$AuthState;", "", "IN_PROGRESS", "READY", "DONE", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class AuthState {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ AuthState[] $VALUES;
        public static final AuthState DONE;
        public static final AuthState IN_PROGRESS;
        public static final AuthState READY;

        static {
            AuthState authState = new AuthState("IN_PROGRESS", 0);
            IN_PROGRESS = authState;
            AuthState authState2 = new AuthState("READY", 1);
            READY = authState2;
            AuthState authState3 = new AuthState("DONE", 2);
            DONE = authState3;
            AuthState[] authStateArr = {authState, authState2, authState3};
            $VALUES = authStateArr;
            $ENTRIES = kotlin.enums.a.a(authStateArr);
        }

        public static AuthState valueOf(String str) {
            return (AuthState) Enum.valueOf(AuthState.class, str);
        }

        public static AuthState[] values() {
            return (AuthState[]) $VALUES.clone();
        }
    }

    public AuthStateRepository() {
        kotlinx.coroutines.flow.r0 c = bvf0.c(AuthState.READY);
        this.a = c;
        this.b = kotlinx.coroutines.flow.e.d(c);
    }
}
