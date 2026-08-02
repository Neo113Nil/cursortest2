package com.squareup.cash.genericelements.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class GenericTreeElementsViewModel {

    public final class Loaded extends GenericTreeElementsViewModel {
        public final List containers;
        public final Error error;

        public final class Error {
            public final String message;

            public Error(String str) {
                this.message = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.areEqual(this.message, ((Error) obj).message);
            }

            public final int hashCode() {
                String str = this.message;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Error(message=", this.message, ")");
            }
        }

        public Loaded(List list, Error error) {
            list.getClass();
            this.containers = list;
            this.error = error;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return Intrinsics.areEqual(this.containers, loaded.containers) && Intrinsics.areEqual(this.error, loaded.error);
        }

        public final int hashCode() {
            int hashCode = this.containers.hashCode() * 31;
            Error error = this.error;
            return hashCode + (error == null ? 0 : error.hashCode());
        }

        public final String toString() {
            return "Loaded(containers=" + this.containers + ", error=" + this.error + ")";
        }
    }

    public final class Loading extends GenericTreeElementsViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -1220050317;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
