package com.squareup.cash.session.backend;

import com.squareup.protos.franklin.common.ResponseContext;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes.dex */
public interface SessionManager {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class DeletionMode {
        public static final /* synthetic */ DeletionMode[] $VALUES;
        public static final DeletionMode ALL;
        public static final DeletionMode WIPEOUT;

        static {
            DeletionMode deletionMode = new DeletionMode("ALL", 0);
            ALL = deletionMode;
            DeletionMode deletionMode2 = new DeletionMode("WIPEOUT", 1);
            WIPEOUT = deletionMode2;
            $VALUES = new DeletionMode[]{deletionMode, deletionMode2};
        }

        public static DeletionMode valueOf(String str) {
            return (DeletionMode) Enum.valueOf(DeletionMode.class, str);
        }

        public static DeletionMode[] values() {
            return (DeletionMode[]) $VALUES.clone();
        }
    }

    Object delete(DeletionMode deletionMode, ContinuationImpl continuationImpl);

    StateFlow getOnboardedAccountStatus();

    StateFlow getSessionState();

    Object updateActiveAccountToken(String str, ContinuationImpl continuationImpl);

    Object updateAppToken(String str, ContinuationImpl continuationImpl);

    Object updateOnboardedState(boolean z, ContinuationImpl continuationImpl);

    Object updateSession(Session session, String str, ContinuationImpl continuationImpl);

    Object updateSession(ResponseContext responseContext, String str, Exception exc, Continuation continuation);

    Object updateSessionFinishAccountSwitchCall(ContinuationImpl continuationImpl);

    Object updateSessionForAccountSwitchOnboarding(String str, ContinuationImpl continuationImpl);
}
