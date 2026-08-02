package com.squareup.cash.core.navigationcontainer.api;

import app.cash.broadway.screen.Screen;
import bo.app.re$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface NavigationPolicy {

    public final class ManagedAccountHomeRoot implements NavigationPolicy {
        public final List disallowedLegacyRootMatchers;
        public final Screen homeScreen;

        public ManagedAccountHomeRoot(Screen screen, List list) {
            list.getClass();
            this.homeScreen = screen;
            this.disallowedLegacyRootMatchers = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ManagedAccountHomeRoot)) {
                return false;
            }
            ManagedAccountHomeRoot managedAccountHomeRoot = (ManagedAccountHomeRoot) obj;
            return this.homeScreen.equals(managedAccountHomeRoot.homeScreen) && Intrinsics.areEqual(this.disallowedLegacyRootMatchers, managedAccountHomeRoot.disallowedLegacyRootMatchers);
        }

        public final int hashCode() {
            return this.disallowedLegacyRootMatchers.hashCode() + (this.homeScreen.hashCode() * 31);
        }

        public final String toString() {
            return "ManagedAccountHomeRoot(homeScreen=" + this.homeScreen + ", disallowedLegacyRootMatchers=" + this.disallowedLegacyRootMatchers + ")";
        }
    }

    public final class StandardTabs implements NavigationPolicy {
        public final Screen homeScreen;

        public StandardTabs(Screen screen) {
            this.homeScreen = screen;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StandardTabs) && this.homeScreen.equals(((StandardTabs) obj).homeScreen);
        }

        public final int hashCode() {
            return this.homeScreen.hashCode();
        }

        public final String toString() {
            return re$$ExternalSyntheticOutline0.m(this.homeScreen, "StandardTabs(homeScreen=", ")");
        }
    }
}
