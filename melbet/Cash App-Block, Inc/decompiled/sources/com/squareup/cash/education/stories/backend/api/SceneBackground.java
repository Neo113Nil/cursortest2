package com.squareup.cash.education.stories.backend.api;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public interface SceneBackground {

    public final class Color implements SceneBackground {
        public final int color;

        public Color(int i) {
            this.color = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Color) && this.color == ((Color) obj).color;
        }

        public final int hashCode() {
            return Integer.hashCode(this.color);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.color, "Color(color=", ")");
        }
    }

    public final class None implements SceneBackground {
        public static final None INSTANCE = new None();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof None);
        }

        public final int hashCode() {
            return -1344473299;
        }

        public final String toString() {
            return "None";
        }
    }
}
