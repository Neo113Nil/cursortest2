package com.squareup.cash.education.stories.backend.api;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface GetStoriesResult {

    public final class HttpFailure implements GetStoriesResult {
        public final int errorCode;

        public HttpFailure(int i) {
            this.errorCode = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HttpFailure) && this.errorCode == ((HttpFailure) obj).errorCode;
        }

        public final int hashCode() {
            return Integer.hashCode(this.errorCode);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.errorCode, "HttpFailure(errorCode=", ")");
        }
    }

    public final class NetworkFailure implements GetStoriesResult {
        public final Throwable throwable;

        public NetworkFailure(Throwable th) {
            this.throwable = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NetworkFailure) && this.throwable.equals(((NetworkFailure) obj).throwable);
        }

        public final int hashCode() {
            return this.throwable.hashCode();
        }

        public final String toString() {
            return NavAction$$ExternalSyntheticOutline0.m("NetworkFailure(throwable=", ")", this.throwable);
        }
    }

    public final class Success implements GetStoriesResult {
        public final ArrayList stories;

        public Success(ArrayList arrayList) {
            this.stories = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && this.stories.equals(((Success) obj).stories);
        }

        public final int hashCode() {
            return this.stories.hashCode();
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("Success(stories=", ")", this.stories);
        }
    }

    public final class UnknownFailure implements GetStoriesResult {
        public final Throwable throwable;

        public UnknownFailure(Throwable th) {
            th.getClass();
            this.throwable = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnknownFailure) && Intrinsics.areEqual(this.throwable, ((UnknownFailure) obj).throwable);
        }

        public final int hashCode() {
            return this.throwable.hashCode();
        }

        public final String toString() {
            return NavAction$$ExternalSyntheticOutline0.m("UnknownFailure(throwable=", ")", this.throwable);
        }
    }
}
