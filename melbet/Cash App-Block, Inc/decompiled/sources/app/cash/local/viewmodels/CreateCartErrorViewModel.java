package app.cash.local.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class CreateCartErrorViewModel {
    public final String id;
    public final String message;
    public final String relatedToken;

    public final class ErrorId {
        public final String id;

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m1293toStringimpl(String str) {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ErrorId(id=", str, ")");
        }

        public final boolean equals(Object obj) {
            if (obj instanceof ErrorId) {
                return Intrinsics.areEqual(this.id, ((ErrorId) obj).id);
            }
            return false;
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final String toString() {
            return m1293toStringimpl(this.id);
        }
    }

    public final class RelatedToken {
        public final String token;

        public final boolean equals(Object obj) {
            if (obj instanceof RelatedToken) {
                return Intrinsics.areEqual(this.token, ((RelatedToken) obj).token);
            }
            return false;
        }

        public final int hashCode() {
            String str = this.token;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RelatedToken(token=", this.token, ")");
        }
    }

    public CreateCartErrorViewModel(String str, String str2, String str3) {
        str3.getClass();
        this.id = str;
        this.relatedToken = str2;
        this.message = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateCartErrorViewModel)) {
            return false;
        }
        CreateCartErrorViewModel createCartErrorViewModel = (CreateCartErrorViewModel) obj;
        return this.id.equals(createCartErrorViewModel.id) && Intrinsics.areEqual(this.relatedToken, createCartErrorViewModel.relatedToken) && Intrinsics.areEqual(this.message, createCartErrorViewModel.message);
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.relatedToken;
        return this.message.hashCode() + (((str == null ? 0 : str.hashCode()) + hashCode) * 31);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CreateCartErrorViewModel(id=", ErrorId.m1293toStringimpl(this.id), ", relatedToken=", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RelatedToken(token=", this.relatedToken, ")"), ", message="), this.message, ")");
    }
}
