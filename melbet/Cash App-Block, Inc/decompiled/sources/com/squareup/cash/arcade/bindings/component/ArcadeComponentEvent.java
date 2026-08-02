package com.squareup.cash.arcade.bindings.component;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface ArcadeComponentEvent {

    public final class Click implements ArcadeComponentEvent {
        public static final Click INSTANCE = new Click();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Click);
        }

        public final int hashCode() {
            return 15584556;
        }

        public final String toString() {
            return "Click";
        }
    }

    public final class ClientRoute implements ArcadeComponentEvent {
        public final String clientRoute;

        public ClientRoute(String str) {
            this.clientRoute = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClientRoute) && this.clientRoute.equals(((ClientRoute) obj).clientRoute);
        }

        public final int hashCode() {
            return this.clientRoute.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ClientRoute(clientRoute=", this.clientRoute, ")");
        }
    }

    public final class InlineMessagePrimaryClick implements ArcadeComponentEvent {
        public static final InlineMessagePrimaryClick INSTANCE = new InlineMessagePrimaryClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InlineMessagePrimaryClick);
        }

        public final int hashCode() {
            return 1431800984;
        }

        public final String toString() {
            return "InlineMessagePrimaryClick";
        }
    }

    public final class InlineMessageSecondaryClick implements ArcadeComponentEvent {
        public static final InlineMessageSecondaryClick INSTANCE = new InlineMessageSecondaryClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InlineMessageSecondaryClick);
        }

        public final int hashCode() {
            return 997805030;
        }

        public final String toString() {
            return "InlineMessageSecondaryClick";
        }
    }

    public final class Url implements ArcadeComponentEvent {
        public final String url;

        public Url(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Url) && Intrinsics.areEqual(this.url, ((Url) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Url(url=", this.url, ")");
        }
    }
}
