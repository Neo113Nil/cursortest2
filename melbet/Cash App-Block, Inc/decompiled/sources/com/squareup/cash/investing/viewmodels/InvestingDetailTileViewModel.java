package com.squareup.cash.investing.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public interface InvestingDetailTileViewModel {

    public final class Content implements InvestingDetailTileViewModel {
        public final ArrayList pages;
        public final String title;

        public Content(String str, ArrayList arrayList) {
            this.title = str;
            this.pages = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return this.title.equals(content.title) && this.pages.equals(content.pages);
        }

        public final int hashCode() {
            return this.pages.hashCode() + (this.title.hashCode() * 31);
        }

        public final String toString() {
            return NavAction$$ExternalSyntheticOutline0.m(this.pages, "Content(title=", this.title, ", pages=", ")");
        }
    }

    public final class Loading implements InvestingDetailTileViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -919069998;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
