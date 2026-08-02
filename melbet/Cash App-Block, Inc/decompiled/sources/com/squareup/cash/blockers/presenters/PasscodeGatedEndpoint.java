package com.squareup.cash.blockers.presenters;

import app.cash.api.ApiResult;
import com.squareup.cash.blockers.viewmodels.PasscodeViewModel;
import com.squareup.cash.overlays.FakeOverlayLayerKt;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.janus.api.PasscodeService;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.common.ResponseContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public interface PasscodeGatedEndpoint {

    public abstract class Response {

        public final class Failure extends Response {
            public final ApiResult.Failure result;

            public Failure(ApiResult.Failure failure) {
                this.result = failure;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Failure) && this.result.equals(((Failure) obj).result);
            }

            public final int hashCode() {
                return this.result.hashCode();
            }

            public final String toString() {
                return "Failure(result=" + this.result + ")";
            }
        }

        public final class InvalidPasscodeOrToken extends Response {
            public static final InvalidPasscodeOrToken INSTANCE = new InvalidPasscodeOrToken();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof InvalidPasscodeOrToken);
            }

            public final int hashCode() {
                return 1574308624;
            }

            public final String toString() {
                return "InvalidPasscodeOrToken";
            }
        }

        public final class ServiceLevelError extends Response {
            public final ResponseContext responseContext;

            public ServiceLevelError(ResponseContext responseContext) {
                this.responseContext = responseContext;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ServiceLevelError) && Intrinsics.areEqual(this.responseContext, ((ServiceLevelError) obj).responseContext);
            }

            public final int hashCode() {
                ResponseContext responseContext = this.responseContext;
                if (responseContext == null) {
                    return 0;
                }
                return responseContext.hashCode();
            }

            public final String toString() {
                return "ServiceLevelError(responseContext=" + this.responseContext + ")";
            }
        }

        public final class Success extends Response {
            public final ResponseContext responseContext;
            public final String token;

            public Success(String str, ResponseContext responseContext) {
                this.token = str;
                this.responseContext = responseContext;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Success)) {
                    return false;
                }
                Success success = (Success) obj;
                return Intrinsics.areEqual(this.token, success.token) && Intrinsics.areEqual(this.responseContext, success.responseContext);
            }

            public final int hashCode() {
                String str = this.token;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                ResponseContext responseContext = this.responseContext;
                return hashCode + (responseContext != null ? responseContext.hashCode() : 0);
            }

            public final String toString() {
                return "Success(token=" + this.token + ", responseContext=" + this.responseContext + ")";
            }
        }

        public final class TooManyAttempts extends Response {
            public final ResponseContext responseContext;

            public TooManyAttempts(ResponseContext responseContext) {
                this.responseContext = responseContext;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TooManyAttempts) && Intrinsics.areEqual(this.responseContext, ((TooManyAttempts) obj).responseContext);
            }

            public final int hashCode() {
                ResponseContext responseContext = this.responseContext;
                if (responseContext == null) {
                    return 0;
                }
                return responseContext.hashCode();
            }

            public final String toString() {
                return "TooManyAttempts(responseContext=" + this.responseContext + ")";
            }
        }
    }

    Object call(PasscodeService passcodeService, AppService appService, FakeOverlayLayerKt fakeOverlayLayerKt, ContinuationImpl continuationImpl);

    PasscodeViewModel.VerifyPasscodeModel.BiometricsPrompt promptModel(AndroidStringManager androidStringManager);
}
