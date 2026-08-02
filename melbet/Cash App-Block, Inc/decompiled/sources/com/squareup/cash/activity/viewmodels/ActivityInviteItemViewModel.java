package com.squareup.cash.activity.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class ActivityInviteItemViewModel {

    public final class Loading extends ActivityInviteItemViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -1116278123;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class Ready extends ActivityInviteItemViewModel {
        public final String text;

        public Ready(String str) {
            str.getClass();
            this.text = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Ready) && Intrinsics.areEqual(this.text, ((Ready) obj).text);
        }

        public final int hashCode() {
            return this.text.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Ready(text=", this.text, ")");
        }
    }
}
