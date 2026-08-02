package com.squareup.cash.appmessages.overlay;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface OverlayAppMessageToken {

    public final class FullScreenToken implements OverlayAppMessageToken {
        public final String token;

        public final boolean equals(Object obj) {
            if (obj instanceof FullScreenToken) {
                return this.token.equals(((FullScreenToken) obj).token);
            }
            return false;
        }

        public final int hashCode() {
            return this.token.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FullScreenToken(token=", this.token, ")");
        }
    }

    public final class PopupToken implements OverlayAppMessageToken {
        public final String token;

        public final boolean equals(Object obj) {
            if (obj instanceof PopupToken) {
                return this.token.equals(((PopupToken) obj).token);
            }
            return false;
        }

        public final int hashCode() {
            return this.token.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PopupToken(token=", this.token, ")");
        }
    }

    public final class SheetToken implements OverlayAppMessageToken {
        public final String token;

        public final boolean equals(Object obj) {
            if (obj instanceof SheetToken) {
                return Intrinsics.areEqual(this.token, ((SheetToken) obj).token);
            }
            return false;
        }

        public final int hashCode() {
            return this.token.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SheetToken(token=", this.token, ")");
        }
    }
}
