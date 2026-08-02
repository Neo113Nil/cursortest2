package com.squareup.cash.blockers.actions.util;

import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/cash/blockers/actions/util/BlockerActionDecodingError;", "Lcom/squareup/cash/observability/types/ReportedError;", "UnexpectedCharactersInBlockerAction", "BlockerActionBase64DecodingError", "BlockerActionProtoDecodingError", "Lcom/squareup/cash/blockers/actions/util/BlockerActionDecodingError$BlockerActionBase64DecodingError;", "Lcom/squareup/cash/blockers/actions/util/BlockerActionDecodingError$BlockerActionProtoDecodingError;", "Lcom/squareup/cash/blockers/actions/util/BlockerActionDecodingError$UnexpectedCharactersInBlockerAction;", "util"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class BlockerActionDecodingError extends ReportedError {
    public final Set features = SetsKt__SetsJVMKt.setOf(ErrorFeature.Flows.INSTANCE);

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/blockers/actions/util/BlockerActionDecodingError$BlockerActionBase64DecodingError;", "Lcom/squareup/cash/blockers/actions/util/BlockerActionDecodingError;", "util"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BlockerActionBase64DecodingError extends BlockerActionDecodingError {
        public final String message;
        public final String uri;

        public BlockerActionBase64DecodingError(String str) {
            this.uri = str;
            this.message = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to decode BlockerAction base64 string in Base64 decoding step: ", str, ".");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BlockerActionBase64DecodingError) && Intrinsics.areEqual(this.uri, ((BlockerActionBase64DecodingError) obj).uri);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.message;
        }

        public final int hashCode() {
            return this.uri.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BlockerActionBase64DecodingError(uri=", this.uri, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/blockers/actions/util/BlockerActionDecodingError$BlockerActionProtoDecodingError;", "Lcom/squareup/cash/blockers/actions/util/BlockerActionDecodingError;", "util"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BlockerActionProtoDecodingError extends BlockerActionDecodingError {
        public final IOException cause;
        public final IOException e;
        public final String message;
        public final String uri;

        public BlockerActionProtoDecodingError(String str, IOException iOException) {
            this.e = iOException;
            this.uri = str;
            this.cause = iOException;
            this.message = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to decode BlockerAction base64 string in proto decoding step: ", str, ".");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BlockerActionProtoDecodingError)) {
                return false;
            }
            BlockerActionProtoDecodingError blockerActionProtoDecodingError = (BlockerActionProtoDecodingError) obj;
            return Intrinsics.areEqual(this.e, blockerActionProtoDecodingError.e) && Intrinsics.areEqual(this.uri, blockerActionProtoDecodingError.uri);
        }

        @Override // java.lang.Throwable
        public final Throwable getCause() {
            return this.cause;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.message;
        }

        public final int hashCode() {
            return this.uri.hashCode() + (this.e.hashCode() * 31);
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "BlockerActionProtoDecodingError(e=" + this.e + ", uri=" + this.uri + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/blockers/actions/util/BlockerActionDecodingError$UnexpectedCharactersInBlockerAction;", "Lcom/squareup/cash/blockers/actions/util/BlockerActionDecodingError;", "util"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnexpectedCharactersInBlockerAction extends BlockerActionDecodingError {
        public final String message;
        public final String uri;

        public UnexpectedCharactersInBlockerAction(String str) {
            this.uri = str;
            this.message = "BlockerAction base64 string contains unexpected '+' or '/' characters. Please ask server to use base64url encoding instead: ".concat(str);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnexpectedCharactersInBlockerAction) && Intrinsics.areEqual(this.uri, ((UnexpectedCharactersInBlockerAction) obj).uri);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.message;
        }

        public final int hashCode() {
            return this.uri.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("UnexpectedCharactersInBlockerAction(uri=", this.uri, ")");
        }
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return this.features;
    }
}
