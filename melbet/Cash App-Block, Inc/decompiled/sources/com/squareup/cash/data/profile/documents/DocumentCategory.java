package com.squareup.cash.data.profile.documents;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface DocumentCategory {

    public final class AccountStatements implements DocumentCategory {
        public static final AccountStatements INSTANCE = new AccountStatements();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AccountStatements);
        }

        public final int hashCode() {
            return -2404311;
        }

        public final String toString() {
            return "AccountStatements";
        }
    }

    public final class None implements DocumentCategory {
        public static final None INSTANCE = new None();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof None);
        }

        public final int hashCode() {
            return 314972928;
        }

        public final String toString() {
            return "None";
        }
    }

    public final class WithId implements DocumentCategory {
        public final String id;

        public WithId(String str) {
            str.getClass();
            this.id = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WithId) && Intrinsics.areEqual(this.id, ((WithId) obj).id);
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("WithId(id=", this.id, ")");
        }
    }
}
