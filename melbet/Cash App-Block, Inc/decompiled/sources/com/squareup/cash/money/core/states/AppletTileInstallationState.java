package com.squareup.cash.money.core.states;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface AppletTileInstallationState {

    public final class Installed implements AppletTileInstallationState {
        public static final Installed INSTANCE = new Installed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Installed);
        }

        public final int hashCode() {
            return -678105122;
        }

        public final String toString() {
            return "Installed";
        }
    }

    public final class Loading implements AppletTileInstallationState {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1426416288;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class Uninstalled implements AppletTileInstallationState {
        public static final Uninstalled INSTANCE = new Uninstalled();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Uninstalled);
        }

        public final int hashCode() {
            return -870534043;
        }

        public final String toString() {
            return "Uninstalled";
        }
    }

    public final class Failure implements AppletTileInstallationState {
        public final String message;

        public Failure(Exception exc) {
            this(ExceptionsKt__ExceptionsKt.stackTraceToString(exc));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && Intrinsics.areEqual(this.message, ((Failure) obj).message);
        }

        public final int hashCode() {
            String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failure(message=", this.message, ")");
        }

        public Failure(String str) {
            this.message = str;
        }
    }
}
