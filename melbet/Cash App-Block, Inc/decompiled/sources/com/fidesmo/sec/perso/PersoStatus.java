package com.fidesmo.sec.perso;

import com.knotapi.knot.utilities.BreadcrumbHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/fidesmo/sec/perso/PersoStatus;", "", "()V", "Failed", "Succeeded", "Lcom/fidesmo/sec/perso/PersoStatus$Failed;", "Lcom/fidesmo/sec/perso/PersoStatus$Succeeded;", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class PersoStatus {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/fidesmo/sec/perso/PersoStatus$Failed;", "Lcom/fidesmo/sec/perso/PersoStatus;", "type", "Lcom/fidesmo/sec/perso/ErrorType;", BreadcrumbHelper.Category.ERROR, "", "(Lcom/fidesmo/sec/perso/ErrorType;Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "getType", "()Lcom/fidesmo/sec/perso/ErrorType;", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Failed extends PersoStatus {
        private final Throwable error;
        private final ErrorType type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(ErrorType errorType, Throwable th) {
            super(null);
            errorType.getClass();
            this.type = errorType;
            this.error = th;
        }

        public final Throwable getError() {
            return this.error;
        }

        public final ErrorType getType() {
            return this.type;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/fidesmo/sec/perso/PersoStatus$Succeeded;", "Lcom/fidesmo/sec/perso/PersoStatus;", "()V", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Succeeded extends PersoStatus {
        public static final Succeeded INSTANCE = new Succeeded();

        private Succeeded() {
            super(null);
        }
    }

    public /* synthetic */ PersoStatus(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PersoStatus() {
    }
}
