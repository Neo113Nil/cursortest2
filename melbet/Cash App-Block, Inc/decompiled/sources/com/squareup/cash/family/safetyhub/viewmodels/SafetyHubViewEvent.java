package com.squareup.cash.family.safetyhub.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface SafetyHubViewEvent {

    public final class TapClose implements SafetyHubViewEvent {
        public static final TapClose INSTANCE = new TapClose();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapClose);
        }

        public final int hashCode() {
            return 1194575605;
        }

        public final String toString() {
            return "TapClose";
        }
    }

    public final class TapTile implements SafetyHubViewEvent {
        public final String tileId;

        public TapTile(String str) {
            str.getClass();
            this.tileId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TapTile) && Intrinsics.areEqual(this.tileId, ((TapTile) obj).tileId);
        }

        public final int hashCode() {
            return this.tileId.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TapTile(tileId=", this.tileId, ")");
        }
    }
}
