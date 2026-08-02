package com.squareup.cash.moneybot.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface MoneybotChatHistoryViewModel {

    public final class Content implements MoneybotChatHistoryViewModel {
        public final String deleteConfirmationSessionId;
        public final Error error;
        public final boolean hasMoreSessions;
        public final boolean loadingNextPage;
        public final List sessions;

        public interface Error {

            public final class Delete implements Error {
                public static final Delete INSTANCE = new Delete();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof Delete);
                }

                public final int hashCode() {
                    return -403094149;
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
                    return -1238826066;
                }

                public final String toString() {
                    return "LoadingNextPage";
                }
            }
        }

        public final class Session {
            public final MoneybotChatHistoryViewEvent action;
            public final String date;
            public final String sessionId;
            public final String title;

            public Session(String str, String str2, String str3, MoneybotChatHistoryViewEvent moneybotChatHistoryViewEvent) {
                this.sessionId = str;
                this.title = str2;
                this.date = str3;
                this.action = moneybotChatHistoryViewEvent;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Session)) {
                    return false;
                }
                Session session = (Session) obj;
                return this.sessionId.equals(session.sessionId) && Intrinsics.areEqual(this.title, session.title) && this.date.equals(session.date) && this.action.equals(session.action);
            }

            public final int hashCode() {
                int hashCode = this.sessionId.hashCode() * 31;
                String str = this.title;
                return this.action.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.date);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Session(sessionId=", this.sessionId, ", title=", this.title, ", date=");
                m.append(this.date);
                m.append(", action=");
                m.append(this.action);
                m.append(")");
                return m.toString();
            }
        }

        public Content(List list, boolean z, boolean z2, String str, Error error) {
            list.getClass();
            this.sessions = list;
            this.loadingNextPage = z;
            this.hasMoreSessions = z2;
            this.deleteConfirmationSessionId = str;
            this.error = error;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.areEqual(this.sessions, content.sessions) && this.loadingNextPage == content.loadingNextPage && this.hasMoreSessions == content.hasMoreSessions && Intrinsics.areEqual(this.deleteConfirmationSessionId, content.deleteConfirmationSessionId) && Intrinsics.areEqual(this.error, content.error);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.sessions.hashCode() * 31, 31, this.loadingNextPage), 31, this.hasMoreSessions);
            String str = this.deleteConfirmationSessionId;
            int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
            Error error = this.error;
            return hashCode + (error != null ? error.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(sessions=");
            sb.append(this.sessions);
            sb.append(", loadingNextPage=");
            sb.append(this.loadingNextPage);
            sb.append(", hasMoreSessions=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.hasMoreSessions, ", deleteConfirmationSessionId=", this.deleteConfirmationSessionId, ", error=");
            sb.append(this.error);
            sb.append(")");
            return sb.toString();
        }
    }

    public final class Empty implements MoneybotChatHistoryViewModel {
        public static final Empty INSTANCE = new Empty();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Empty);
        }

        public final int hashCode() {
            return 2097769560;
        }

        public final String toString() {
            return "Empty";
        }
    }

    public final class Error implements MoneybotChatHistoryViewModel {
        public static final Error INSTANCE = new Error();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            return 2097920275;
        }

        public final String toString() {
            return "Error";
        }
    }

    public final class Loading implements MoneybotChatHistoryViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -717606521;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
