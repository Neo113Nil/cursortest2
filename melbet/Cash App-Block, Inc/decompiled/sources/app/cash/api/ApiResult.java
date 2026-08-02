package app.cash.api;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0001:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lapp/cash/api/ApiResult;", "", "T", "Success", "Failure", "Lapp/cash/api/ApiResult$Failure;", "Lapp/cash/api/ApiResult$Success;", "api-result"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ApiResult<T> {

    public abstract class Failure extends ApiResult {

        public final class HttpFailure extends Failure {
            public final int code;
            public final String errorBody;
            public final Date responseHeaderDate;

            public HttpFailure(int i, Date date, String str) {
                this.code = i;
                this.responseHeaderDate = date;
                this.errorBody = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof HttpFailure)) {
                    return false;
                }
                HttpFailure httpFailure = (HttpFailure) obj;
                return this.code == httpFailure.code && Intrinsics.areEqual(this.responseHeaderDate, httpFailure.responseHeaderDate) && Intrinsics.areEqual(this.errorBody, httpFailure.errorBody);
            }

            public final int hashCode() {
                int hashCode = Integer.hashCode(this.code) * 31;
                Date date = this.responseHeaderDate;
                int hashCode2 = (hashCode + (date == null ? 0 : date.hashCode())) * 31;
                String str = this.errorBody;
                return hashCode2 + (str != null ? str.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("HttpFailure(code=");
                sb.append(this.code);
                sb.append(", responseHeaderDate=");
                sb.append(this.responseHeaderDate);
                sb.append(", errorBody=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.errorBody, ")");
            }
        }

        public final class NetworkFailure extends Failure {
            public final Throwable error;

            public NetworkFailure(Throwable th) {
                this.error = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NetworkFailure) && this.error.equals(((NetworkFailure) obj).error);
            }

            public final int hashCode() {
                return this.error.hashCode();
            }

            public final String toString() {
                return NavAction$$ExternalSyntheticOutline0.m("NetworkFailure(error=", ")", this.error);
            }
        }
    }

    public final class Success extends ApiResult {
        public final Object response;

        public Success(Object obj) {
            obj.getClass();
            this.response = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.response, ((Success) obj).response);
        }

        public final int hashCode() {
            return this.response.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Success(response=", ")", this.response);
        }
    }
}
