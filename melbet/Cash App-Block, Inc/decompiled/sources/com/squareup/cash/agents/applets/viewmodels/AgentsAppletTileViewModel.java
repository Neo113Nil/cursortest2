package com.squareup.cash.agents.applets.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface AgentsAppletTileViewModel {

    public final class Failure implements AgentsAppletTileViewModel {
        public final Throwable cause;
        public final String title;

        public Failure(String str, Throwable th) {
            str.getClass();
            this.title = str;
            this.cause = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Failure) {
                Failure failure = (Failure) obj;
                return Intrinsics.areEqual(this.title, failure.title) && this.cause == failure.cause;
            }
            return false;
        }

        public final int hashCode() {
            return this.cause.hashCode() + (this.title.hashCode() * 31);
        }

        public final String toString() {
            return "Failure(title=" + this.title + ", cause=" + this.cause + ")";
        }
    }

    public final class Installed implements AgentsAppletTileViewModel {
        public final ArrayList avatars;
        public final String body;
        public final String title;

        public Installed(String str, String str2, ArrayList arrayList) {
            str.getClass();
            this.title = str;
            this.body = str2;
            this.avatars = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Installed)) {
                return false;
            }
            Installed installed = (Installed) obj;
            return Intrinsics.areEqual(this.title, installed.title) && Intrinsics.areEqual(this.body, installed.body) && this.avatars.equals(installed.avatars);
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.body;
            return this.avatars.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return Recorder$$ExternalSyntheticOutline1.m(")", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Installed(title=", this.title, ", body=", this.body, ", avatars="), this.avatars);
        }
    }

    public final class Loading implements AgentsAppletTileViewModel {
        public final String title;

        public Loading(String str) {
            str.getClass();
            this.title = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && Intrinsics.areEqual(this.title, ((Loading) obj).title);
        }

        public final int hashCode() {
            return this.title.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Loading(title=", this.title, ")");
        }
    }

    public final class Uninstalled implements AgentsAppletTileViewModel {
        public final String subtitle;
        public final String title;

        public Uninstalled(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.title = str;
            this.subtitle = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Uninstalled)) {
                return false;
            }
            Uninstalled uninstalled = (Uninstalled) obj;
            return Intrinsics.areEqual(this.title, uninstalled.title) && Intrinsics.areEqual(this.subtitle, uninstalled.subtitle);
        }

        public final int hashCode() {
            return this.subtitle.hashCode() + (this.title.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Uninstalled(title=", this.title, ", subtitle=", this.subtitle, ")");
        }
    }
}
