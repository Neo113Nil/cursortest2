package ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.rt.ebs.cryptosdk.core.common.entities.models.Token;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/VerificationResult;", "", "<init>", "()V", "Empty", "Cancel", "Error", "Success", "Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/VerificationResult$Cancel;", "Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/VerificationResult$Empty;", "Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/VerificationResult$Error;", "Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/VerificationResult$Success;", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class VerificationResult {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/VerificationResult$Cancel;", "Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/VerificationResult;", "<init>", "()V", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Cancel extends VerificationResult {
        public static final Cancel INSTANCE = new Cancel();

        private Cancel() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/VerificationResult$Empty;", "Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/VerificationResult;", "<init>", "()V", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Empty extends VerificationResult {
        public static final Empty INSTANCE = new Empty();

        private Empty() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/VerificationResult$Error;", "Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/VerificationResult;", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Ljava/lang/Exception;)V", "getError", "()Ljava/lang/Exception;", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Error extends VerificationResult {
        private final Exception error;

        public Error(Exception exc) {
            super(null);
            this.error = exc;
        }

        public final Exception getError() {
            return this.error;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/VerificationResult$Success;", "Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/VerificationResult;", "cookieVrf", "Lru/rt/ebs/cryptosdk/core/common/entities/models/Token;", "<init>", "(Lru/rt/ebs/cryptosdk/core/common/entities/models/Token;)V", "getCookieVrf", "()Lru/rt/ebs/cryptosdk/core/common/entities/models/Token;", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Success extends VerificationResult {
        private final Token cookieVrf;

        public Success(Token token) {
            super(null);
            this.cookieVrf = token;
        }

        public final Token getCookieVrf() {
            return this.cookieVrf;
        }
    }

    public /* synthetic */ VerificationResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private VerificationResult() {
    }
}
