package com.squareup.cash.core.navigationcontainer.navigator;

import app.cash.broadway.screen.Screen;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.backstack.real.RealBackStackSnapshot;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class EventListener {

    public interface Initiator {

        public final class Location implements Initiator {
            public final String id;
            public final Screen screen;

            public Location(Screen screen, String str) {
                str.getClass();
                screen.getClass();
                this.id = str;
                this.screen = screen;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Location)) {
                    return false;
                }
                Location location = (Location) obj;
                return Intrinsics.areEqual(this.id, location.id) && Intrinsics.areEqual(this.screen, location.screen);
            }

            public final int hashCode() {
                return this.screen.hashCode() + (this.id.hashCode() * 31);
            }

            public final String toString() {
                return "Location(id=" + this.id + ", screen=" + this.screen + ")";
            }
        }

        public final class None implements Initiator {
            public static final None INSTANCE = new None();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof None);
            }

            public final int hashCode() {
                return -1053325364;
            }

            public final String toString() {
                return "None";
            }
        }

        /* loaded from: classes6.dex */
        public final class Restore implements Initiator {
            public static final Restore INSTANCE = new Restore();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Restore);
            }

            public final int hashCode() {
                return -1610923654;
            }

            public final String toString() {
                return "Restore";
            }
        }
    }

    public final class Location {
        public final String id;
        public final boolean isBack;
        public final Screen screen;

        public Location(String str, Screen screen, boolean z) {
            str.getClass();
            screen.getClass();
            this.id = str;
            this.screen = screen;
            this.isBack = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Location)) {
                return false;
            }
            Location location = (Location) obj;
            return Intrinsics.areEqual(this.id, location.id) && Intrinsics.areEqual(this.screen, location.screen) && this.isBack == location.isBack;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isBack) + BalanceFeedKt$$ExternalSyntheticOutline0.m(this.screen, this.id.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Location(id=");
            sb.append(this.id);
            sb.append(", screen=");
            sb.append(this.screen);
            sb.append(", isBack=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isBack, ")");
        }
    }

    public final class State {
        public final RealBackStackSnapshot backStack;
        public final Location fullScreen;
        public final String identifier;
        public final Location overlay;
        public final BetterNavigator.State state;

        public State(String str, BetterNavigator.State state, Location location, Location location2, RealBackStackSnapshot realBackStackSnapshot) {
            str.getClass();
            state.getClass();
            this.identifier = str;
            this.state = state;
            this.fullScreen = location;
            this.overlay = location2;
            this.backStack = realBackStackSnapshot;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return Intrinsics.areEqual(this.identifier, state.identifier) && this.state == state.state && Intrinsics.areEqual(this.fullScreen, state.fullScreen) && Intrinsics.areEqual(this.overlay, state.overlay) && this.backStack.equals(state.backStack);
        }

        public final int hashCode() {
            int hashCode = (this.state.hashCode() + (this.identifier.hashCode() * 31)) * 31;
            Location location = this.fullScreen;
            int hashCode2 = (hashCode + (location == null ? 0 : location.hashCode())) * 31;
            Location location2 = this.overlay;
            return this.backStack.backStackEntries.hashCode() + ((hashCode2 + (location2 != null ? location2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "State(identifier=" + this.identifier + ", state=" + this.state + ", fullScreen=" + this.fullScreen + ", overlay=" + this.overlay + ", backStack=" + this.backStack + ")";
        }
    }

    public void answerEnd(Initiator initiator, State state) {
    }

    public void answerStart(Initiator initiator, State state) {
    }

    public void appFullyDrawn(Screen screen) {
        screen.getClass();
    }

    public void backEnd(State state) {
    }

    public void backStart(State state) {
    }

    public abstract void navigationEnd(Screen screen, Initiator initiator, State state);

    public void navigationStart(Screen screen, Initiator initiator, State state) {
        screen.getClass();
    }

    /* renamed from: presenterStart-5qebJ5I, reason: not valid java name */
    public void mo3506presenterStart5qebJ5I(Screen screen, long j, long j2) {
        screen.getClass();
    }

    public void questionEnd(Screen screen, Initiator initiator, State state) {
        screen.getClass();
    }

    public void questionStart(Screen screen, Initiator initiator, State state) {
        screen.getClass();
    }

    public void stateChanged(State state) {
    }

    public void uiCreate(Screen screen) {
        screen.getClass();
    }
}
