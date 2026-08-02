package com.squareup.cash.instruments.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface InstrumentSelectionViewModel {

    /* loaded from: classes5.dex */
    public final class Loading implements InstrumentSelectionViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -500694792;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class Ready implements InstrumentSelectionViewModel {
        public final List instruments;
        public final String nextButtonTitle;
        public final int selectedIndex;
        public final String title;

        public Ready(int i, String str, String str2, List list) {
            str.getClass();
            list.getClass();
            str2.getClass();
            this.title = str;
            this.instruments = list;
            this.selectedIndex = i;
            this.nextButtonTitle = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) obj;
            return Intrinsics.areEqual(this.title, ready.title) && Intrinsics.areEqual(this.instruments, ready.instruments) && this.selectedIndex == ready.selectedIndex && Intrinsics.areEqual(this.nextButtonTitle, ready.nextButtonTitle);
        }

        public final int hashCode() {
            return this.nextButtonTitle.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.selectedIndex, Recorder$$ExternalSyntheticOutline2.m(this.title.hashCode() * 31, 31, this.instruments), 31);
        }

        public final String toString() {
            StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("Ready(title=", this.title, ", instruments=", ", selectedIndex=", this.instruments);
            m.append(this.selectedIndex);
            m.append(", nextButtonTitle=");
            m.append(this.nextButtonTitle);
            m.append(")");
            return m.toString();
        }
    }
}
