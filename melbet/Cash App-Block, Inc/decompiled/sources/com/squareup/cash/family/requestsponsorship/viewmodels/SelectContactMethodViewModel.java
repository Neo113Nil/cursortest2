package com.squareup.cash.family.requestsponsorship.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface SelectContactMethodViewModel {

    public final class Content implements SelectContactMethodViewModel {
        public final List contactMethods;
        public final String title;

        public Content(String str, List list) {
            list.getClass();
            this.title = str;
            this.contactMethods = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return this.title.equals(content.title) && Intrinsics.areEqual(this.contactMethods, content.contactMethods);
        }

        public final int hashCode() {
            return this.contactMethods.hashCode() + (this.title.hashCode() * 31);
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("Content(title=", this.title, ", contactMethods=", ")", this.contactMethods);
        }
    }

    public final class Loading implements SelectContactMethodViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -424951267;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
