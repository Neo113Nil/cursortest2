package com.squareup.cash.investing.viewmodels.holdings;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface InvestingEtfHoldingsViewModel {

    public final class Content implements InvestingEtfHoldingsViewModel {
        public final String description;
        public final ArrayList holdings;
        public final String title;

        public Content(String str, String str2, ArrayList arrayList) {
            str.getClass();
            str2.getClass();
            this.title = str;
            this.description = str2;
            this.holdings = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.areEqual(this.title, content.title) && Intrinsics.areEqual(this.description, content.description) && this.holdings.equals(content.holdings);
        }

        public final int hashCode() {
            return this.holdings.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.description);
        }

        public final String toString() {
            return Recorder$$ExternalSyntheticOutline1.m(")", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Content(title=", this.title, ", description=", this.description, ", holdings="), this.holdings);
        }
    }

    public final class Empty implements InvestingEtfHoldingsViewModel {
        public static final Empty INSTANCE = new Empty();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Empty);
        }

        public final int hashCode() {
            return 2145276439;
        }

        public final String toString() {
            return "Empty";
        }
    }

    public final class Loading implements InvestingEtfHoldingsViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1986831238;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
