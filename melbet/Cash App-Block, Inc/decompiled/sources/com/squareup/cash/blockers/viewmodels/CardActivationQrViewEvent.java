package com.squareup.cash.blockers.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class CardActivationQrViewEvent {

    public final class Exit extends CardActivationQrViewEvent {
        public static final Exit INSTANCE = new Exit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Exit);
        }

        public final int hashCode() {
            return 1560398362;
        }

        public final String toString() {
            return "Exit";
        }
    }

    public final class MissingQr extends CardActivationQrViewEvent {
        public static final MissingQr INSTANCE = new MissingQr();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MissingQr);
        }

        public final int hashCode() {
            return 471922347;
        }

        public final String toString() {
            return "MissingQr";
        }
    }

    public final class Scanned extends CardActivationQrViewEvent {
        public final String code;

        public Scanned(String str) {
            str.getClass();
            this.code = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Scanned) && Intrinsics.areEqual(this.code, ((Scanned) obj).code);
        }

        public final int hashCode() {
            return this.code.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Scanned(code=", this.code, ")");
        }
    }
}
