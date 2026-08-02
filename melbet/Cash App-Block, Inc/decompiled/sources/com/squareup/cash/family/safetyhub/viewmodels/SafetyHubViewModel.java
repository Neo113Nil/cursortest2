package com.squareup.cash.family.safetyhub.viewmodels;

import com.squareup.protos.cash.aegis.core.SafetyEducationHub;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface SafetyHubViewModel {

    public final class Loaded implements SafetyHubViewModel {
        public final SafetyEducationHub hub;

        public Loaded(SafetyEducationHub safetyEducationHub) {
            safetyEducationHub.getClass();
            this.hub = safetyEducationHub;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loaded) && Intrinsics.areEqual(this.hub, ((Loaded) obj).hub);
        }

        public final int hashCode() {
            return this.hub.hashCode();
        }

        public final String toString() {
            return "Loaded(hub=" + this.hub + ")";
        }
    }

    public final class Loading implements SafetyHubViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 2004763627;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
