package com.squareup.cash.moneybot.viewmodels;

import androidx.camera.viewfinder.compose.ViewfinderKt;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.moneybot.viewmodels.MoneybotOverflowMenuViewEvent;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class RecentChatHistoryViewModel$Loaded extends ViewfinderKt {
    public final String deleteConfirmationSessionId;
    public final Error error;
    public final boolean hasMoreSessions;
    public final boolean loadingNextPage;
    public final Function0 onLoadMore;
    public final List sessions;

    public interface Error {

        public final class Delete implements Error {
            public static final Delete INSTANCE = new Delete();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Delete);
            }

            public final int hashCode() {
                return 1800704889;
            }

            public final String toString() {
                return "Delete";
            }
        }

        public final class LoadingNextPage implements Error {
            public static final LoadingNextPage INSTANCE = new LoadingNextPage();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LoadingNextPage);
            }

            public final int hashCode() {
                return 1091736432;
            }

            public final String toString() {
                return "LoadingNextPage";
            }
        }
    }

    public final class Session {
        public final MoneybotOverflowMenuViewEvent.OpenChat action;
        public final String sessionId;
        public final String title;

        public Session(String str, String str2, MoneybotOverflowMenuViewEvent.OpenChat openChat) {
            this.sessionId = str;
            this.title = str2;
            this.action = openChat;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Session)) {
                return false;
            }
            Session session = (Session) obj;
            return this.sessionId.equals(session.sessionId) && Intrinsics.areEqual(this.title, session.title) && this.action.equals(session.action);
        }

        public final int hashCode() {
            int hashCode = this.sessionId.hashCode() * 31;
            String str = this.title;
            return this.action.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Session(sessionId=", this.sessionId, ", title=", this.title, ", action=");
            m.append(this.action);
            m.append(")");
            return m.toString();
        }
    }

    public RecentChatHistoryViewModel$Loaded(List list, boolean z, boolean z2, String str, Error error, Function0 function0) {
        list.getClass();
        function0.getClass();
        this.sessions = list;
        this.loadingNextPage = z;
        this.hasMoreSessions = z2;
        this.deleteConfirmationSessionId = str;
        this.error = error;
        this.onLoadMore = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentChatHistoryViewModel$Loaded)) {
            return false;
        }
        RecentChatHistoryViewModel$Loaded recentChatHistoryViewModel$Loaded = (RecentChatHistoryViewModel$Loaded) obj;
        return Intrinsics.areEqual(this.sessions, recentChatHistoryViewModel$Loaded.sessions) && this.loadingNextPage == recentChatHistoryViewModel$Loaded.loadingNextPage && this.hasMoreSessions == recentChatHistoryViewModel$Loaded.hasMoreSessions && Intrinsics.areEqual(this.deleteConfirmationSessionId, recentChatHistoryViewModel$Loaded.deleteConfirmationSessionId) && Intrinsics.areEqual(this.error, recentChatHistoryViewModel$Loaded.error) && Intrinsics.areEqual(this.onLoadMore, recentChatHistoryViewModel$Loaded.onLoadMore);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.sessions.hashCode() * 31, 31, this.loadingNextPage), 31, this.hasMoreSessions);
        String str = this.deleteConfirmationSessionId;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        Error error = this.error;
        return this.onLoadMore.hashCode() + ((hashCode + (error != null ? error.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Loaded(sessions=");
        sb.append(this.sessions);
        sb.append(", loadingNextPage=");
        sb.append(this.loadingNextPage);
        sb.append(", hasMoreSessions=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.hasMoreSessions, ", deleteConfirmationSessionId=", this.deleteConfirmationSessionId, ", error=");
        sb.append(this.error);
        sb.append(", onLoadMore=");
        sb.append(this.onLoadMore);
        sb.append(")");
        return sb.toString();
    }
}
