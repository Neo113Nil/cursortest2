package com.squareup.cash.filepicker;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface FilePickerResult {

    public final class Canceled implements FilePickerResult {
        public static final Canceled INSTANCE = new Canceled();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Canceled);
        }

        public final int hashCode() {
            return 1309135438;
        }

        public final String toString() {
            return "Canceled";
        }
    }

    public final class Failure implements FilePickerResult {
        public final int resultCode;
        public final String uri;

        public Failure(int i, String str) {
            this.resultCode = i;
            this.uri = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return this.resultCode == failure.resultCode && Intrinsics.areEqual(this.uri, failure.uri);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.resultCode) * 31;
            String str = this.uri;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "Failure(resultCode=" + this.resultCode + ", uri=" + this.uri + ")";
        }
    }

    /* loaded from: classes7.dex */
    public final class Success implements FilePickerResult {
        public final String uri;

        public Success(String str) {
            this.uri = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && this.uri.equals(((Success) obj).uri);
        }

        public final int hashCode() {
            return this.uri.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Success(uri=", this.uri, ")");
        }
    }
}
