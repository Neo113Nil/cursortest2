package com.squareup.cash.family.familyhub.viewmodels;

import com.squareup.protos.cash.ui.Icon;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface FamilyListItem {

    public final class Loaded implements FamilyListItem {
        public final String analyticalIdentifier;
        public final Icon icon;
        public final String title;
        public final String url;

        public Loaded(Icon icon, String str, String str2, String str3) {
            this.icon = icon;
            this.title = str;
            this.url = str2;
            this.analyticalIdentifier = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return this.icon.equals(loaded.icon) && this.title.equals(loaded.title) && this.url.equals(loaded.url) && Intrinsics.areEqual(this.analyticalIdentifier, loaded.analyticalIdentifier);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.icon.hashCode() * 31, 31, this.title), 31, this.url);
            String str = this.analyticalIdentifier;
            return m + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loaded(icon=");
            sb.append(this.icon);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", url=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.url, ", analyticalIdentifier=", this.analyticalIdentifier, ")");
        }
    }

    public final class Loading implements FamilyListItem {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1927477997;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
