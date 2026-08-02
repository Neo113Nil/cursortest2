package com.squareup.cash.investing.viewmodels.keystats;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface InvestingKeyStatsDetailsViewModel {

    public final class Content implements InvestingKeyStatsDetailsViewModel {
        public final ArrayList rows;
        public final String title;

        public final class Row {
            public final String details;
            public final String key;
            public final String spokenLabel;
            public final String value;

            public Row(String str, String str2, String str3, String str4) {
                str2.getClass();
                str3.getClass();
                this.spokenLabel = str;
                this.key = str2;
                this.value = str3;
                this.details = str4;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Row)) {
                    return false;
                }
                Row row = (Row) obj;
                return Intrinsics.areEqual(this.spokenLabel, row.spokenLabel) && Intrinsics.areEqual(this.key, row.key) && Intrinsics.areEqual(this.value, row.value) && Intrinsics.areEqual(this.details, row.details);
            }

            public final int hashCode() {
                String str = this.spokenLabel;
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.key), 31, this.value);
                String str2 = this.details;
                return m + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Row(spokenLabel=", this.spokenLabel, ", key=", this.key, ", value="), this.value, ", details=", this.details, ")");
            }
        }

        public Content(String str, ArrayList arrayList) {
            this.title = str;
            this.rows = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return this.title.equals(content.title) && this.rows.equals(content.rows);
        }

        public final int hashCode() {
            return this.rows.hashCode() + (this.title.hashCode() * 31);
        }

        public final String toString() {
            return NavAction$$ExternalSyntheticOutline0.m(this.rows, "Content(title=", this.title, ", rows=", ")");
        }
    }

    /* loaded from: classes7.dex */
    public final class Loading implements InvestingKeyStatsDetailsViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -819082469;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
