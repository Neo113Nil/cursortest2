package com.squareup.cash.agents.applets.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface AgentsHomeContentState {

    public final class Content implements AgentsHomeContentState {
        public final ArrayList agents;

        public Content(ArrayList arrayList) {
            this.agents = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Content) && this.agents.equals(((Content) obj).agents);
        }

        public final int hashCode() {
            return this.agents.hashCode();
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("Content(agents=", ")", this.agents);
        }
    }

    public final class Empty implements AgentsHomeContentState {
        public final String body;
        public final String title;

        public Empty(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.title = str;
            this.body = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Empty)) {
                return false;
            }
            Empty empty = (Empty) obj;
            return Intrinsics.areEqual(this.title, empty.title) && Intrinsics.areEqual(this.body, empty.body);
        }

        public final int hashCode() {
            return this.body.hashCode() + (this.title.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Empty(title=", this.title, ", body=", this.body, ")");
        }
    }

    public final class Failure implements AgentsHomeContentState {
        public final String title;

        public Failure(String str) {
            str.getClass();
            this.title = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && Intrinsics.areEqual(this.title, ((Failure) obj).title);
        }

        public final int hashCode() {
            return this.title.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failure(title=", this.title, ")");
        }
    }

    public final class Loading implements AgentsHomeContentState {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -369247921;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
