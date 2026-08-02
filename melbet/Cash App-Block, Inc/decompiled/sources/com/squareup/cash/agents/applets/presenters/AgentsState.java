package com.squareup.cash.agents.applets.presenters;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public interface AgentsState {

    public final class Failure implements AgentsState {
        public final Throwable cause;

        public Failure(Throwable th) {
            this.cause = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && this.cause == ((Failure) obj).cause;
        }

        public final int hashCode() {
            return this.cause.hashCode();
        }

        public final String toString() {
            return NavAction$$ExternalSyntheticOutline0.m("Failure(cause=", ")", this.cause);
        }
    }

    public final class Installed implements AgentsState {
        public final ArrayList agents;

        public Installed(ArrayList arrayList) {
            this.agents = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Installed) && this.agents.equals(((Installed) obj).agents);
        }

        public final int hashCode() {
            return this.agents.hashCode();
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("Installed(agents=", ")", this.agents);
        }
    }

    public final class Loading implements AgentsState {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -647703183;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
