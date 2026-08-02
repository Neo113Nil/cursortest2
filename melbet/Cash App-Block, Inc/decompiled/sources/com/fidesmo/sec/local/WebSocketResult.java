package com.fidesmo.sec.local;

import com.fidesmo.sec.local.models.WebSocketMessage;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/fidesmo/sec/local/WebSocketResult;", "", "()V", "Failed", "Succeeded", "Lcom/fidesmo/sec/local/WebSocketResult$Failed;", "Lcom/fidesmo/sec/local/WebSocketResult$Succeeded;", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class WebSocketResult {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/fidesmo/sec/local/WebSocketResult$Succeeded;", "Lcom/fidesmo/sec/local/WebSocketResult;", "status", "Lcom/fidesmo/sec/local/models/WebSocketMessage$Status;", "(Lcom/fidesmo/sec/local/models/WebSocketMessage$Status;)V", "getStatus", "()Lcom/fidesmo/sec/local/models/WebSocketMessage$Status;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Succeeded extends WebSocketResult {
        private final WebSocketMessage.Status status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Succeeded(WebSocketMessage.Status status) {
            super(null);
            status.getClass();
            this.status = status;
        }

        public static /* synthetic */ Succeeded copy$default(Succeeded succeeded, WebSocketMessage.Status status, int i, Object obj) {
            if ((i & 1) != 0) {
                status = succeeded.status;
            }
            return succeeded.copy(status);
        }

        /* renamed from: component1, reason: from getter */
        public final WebSocketMessage.Status getStatus() {
            return this.status;
        }

        public final Succeeded copy(WebSocketMessage.Status status) {
            status.getClass();
            return new Succeeded(status);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Succeeded) && Intrinsics.areEqual(this.status, ((Succeeded) other).status);
        }

        public final WebSocketMessage.Status getStatus() {
            return this.status;
        }

        public int hashCode() {
            return this.status.hashCode();
        }

        public String toString() {
            return "Succeeded(status=" + this.status + ')';
        }
    }

    public /* synthetic */ WebSocketResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private WebSocketResult() {
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J9\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/fidesmo/sec/local/WebSocketResult$Failed;", "Lcom/fidesmo/sec/local/WebSocketResult;", BreadcrumbHelper.Category.ERROR, "", "code", "", "message", "status", "Lcom/fidesmo/sec/local/models/WebSocketMessage$Status;", "(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;Lcom/fidesmo/sec/local/models/WebSocketMessage$Status;)V", "getCode", "()Ljava/lang/String;", "getError", "()Ljava/lang/Throwable;", "getMessage", "getStatus", "()Lcom/fidesmo/sec/local/models/WebSocketMessage$Status;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Failed extends WebSocketResult {
        private final String code;
        private final Throwable error;
        private final String message;
        private final WebSocketMessage.Status status;

        public /* synthetic */ Failed(Throwable th, String str, String str2, WebSocketMessage.Status status, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : th, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : status);
        }

        public static /* synthetic */ Failed copy$default(Failed failed, Throwable th, String str, String str2, WebSocketMessage.Status status, int i, Object obj) {
            if ((i & 1) != 0) {
                th = failed.error;
            }
            if ((i & 2) != 0) {
                str = failed.code;
            }
            if ((i & 4) != 0) {
                str2 = failed.message;
            }
            if ((i & 8) != 0) {
                status = failed.status;
            }
            return failed.copy(th, str, str2, status);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        /* renamed from: component3, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component4, reason: from getter */
        public final WebSocketMessage.Status getStatus() {
            return this.status;
        }

        public final Failed copy(Throwable error, String code, String message, WebSocketMessage.Status status) {
            return new Failed(error, code, message, status);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failed)) {
                return false;
            }
            Failed failed = (Failed) other;
            return Intrinsics.areEqual(this.error, failed.error) && Intrinsics.areEqual(this.code, failed.code) && Intrinsics.areEqual(this.message, failed.message) && Intrinsics.areEqual(this.status, failed.status);
        }

        public final String getCode() {
            return this.code;
        }

        public final Throwable getError() {
            return this.error;
        }

        public final String getMessage() {
            return this.message;
        }

        public final WebSocketMessage.Status getStatus() {
            return this.status;
        }

        public int hashCode() {
            Throwable th = this.error;
            int hashCode = (th == null ? 0 : th.hashCode()) * 31;
            String str = this.code;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.message;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            WebSocketMessage.Status status = this.status;
            return hashCode3 + (status != null ? status.hashCode() : 0);
        }

        public String toString() {
            return "Failed(error=" + this.error + ", code=" + this.code + ", message=" + this.message + ", status=" + this.status + ')';
        }

        public Failed(Throwable th, String str, String str2, WebSocketMessage.Status status) {
            super(null);
            this.error = th;
            this.code = str;
            this.message = str2;
            this.status = status;
        }

        public Failed() {
            this(null, null, null, null, 15, null);
        }
    }
}
