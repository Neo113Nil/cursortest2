package com.squareup.cash.earnings.presenters.streamdetail;

import com.squareup.cash.earnings.backend.api.EarningsStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface EarningsStreamDetailPresenter$StreamDetailState {

    public final class Error implements EarningsStreamDetailPresenter$StreamDetailState {
        public static final Error INSTANCE = new Error();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            return 872749069;
        }

        public final String toString() {
            return "Error";
        }
    }

    public final class Loaded implements EarningsStreamDetailPresenter$StreamDetailState {
        public final EarningsStream stream;

        public Loaded(EarningsStream earningsStream) {
            this.stream = earningsStream;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loaded) && Intrinsics.areEqual(this.stream, ((Loaded) obj).stream);
        }

        public final int hashCode() {
            EarningsStream earningsStream = this.stream;
            if (earningsStream == null) {
                return 0;
            }
            return earningsStream.hashCode();
        }

        public final String toString() {
            return "Loaded(stream=" + this.stream + ")";
        }
    }

    public final class Loading implements EarningsStreamDetailPresenter$StreamDetailState {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -1286096383;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
