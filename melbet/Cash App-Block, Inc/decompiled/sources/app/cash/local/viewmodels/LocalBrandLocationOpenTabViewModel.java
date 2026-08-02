package app.cash.local.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.local.viewmodels.internal.CanWorkAsync;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalBrandLocationOpenTabViewModel implements CanWorkAsync {
    public final List errors;
    public final boolean isFinishAndPayEnabled;
    public final boolean isWorkingAsync;
    public final List rounds;
    public final String subtotalAmount;
    public final String summaryTitle;
    public final String title;

    public final class Round {
        public final boolean isExpandedByDefault;
        public final List selections;
        public final String subtitle;
        public final String title;

        public Round(String str, String str2, List list, boolean z) {
            list.getClass();
            this.title = str;
            this.subtitle = str2;
            this.selections = list;
            this.isExpandedByDefault = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Round)) {
                return false;
            }
            Round round = (Round) obj;
            return this.title.equals(round.title) && Intrinsics.areEqual(this.subtitle, round.subtitle) && Intrinsics.areEqual(this.selections, round.selections) && this.isExpandedByDefault == round.isExpandedByDefault;
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            return Boolean.hashCode(this.isExpandedByDefault) + Recorder$$ExternalSyntheticOutline2.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.selections);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Round(title=", this.title, ", subtitle=", this.subtitle, ", selections=");
            m.append(this.selections);
            m.append(", isExpandedByDefault=");
            m.append(this.isExpandedByDefault);
            m.append(")");
            return m.toString();
        }
    }

    public LocalBrandLocationOpenTabViewModel(String str, String str2, String str3, List list, List list2, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        list.getClass();
        list2.getClass();
        this.title = str;
        this.summaryTitle = str2;
        this.subtotalAmount = str3;
        this.rounds = list;
        this.errors = list2;
        this.isFinishAndPayEnabled = z;
        this.isWorkingAsync = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalBrandLocationOpenTabViewModel)) {
            return false;
        }
        LocalBrandLocationOpenTabViewModel localBrandLocationOpenTabViewModel = (LocalBrandLocationOpenTabViewModel) obj;
        return Intrinsics.areEqual(this.title, localBrandLocationOpenTabViewModel.title) && Intrinsics.areEqual(this.summaryTitle, localBrandLocationOpenTabViewModel.summaryTitle) && Intrinsics.areEqual(this.subtotalAmount, localBrandLocationOpenTabViewModel.subtotalAmount) && Intrinsics.areEqual(this.rounds, localBrandLocationOpenTabViewModel.rounds) && Intrinsics.areEqual(this.errors, localBrandLocationOpenTabViewModel.errors) && this.isFinishAndPayEnabled == localBrandLocationOpenTabViewModel.isFinishAndPayEnabled && this.isWorkingAsync == localBrandLocationOpenTabViewModel.isWorkingAsync;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.summaryTitle);
        String str = this.subtotalAmount;
        return Boolean.hashCode(this.isWorkingAsync) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.rounds), 31, this.errors), 31, this.isFinishAndPayEnabled);
    }

    @Override // app.cash.local.viewmodels.internal.CanWorkAsync
    public final boolean isWorkingAsync() {
        return this.isWorkingAsync;
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LocalBrandLocationOpenTabViewModel(title=", this.title, ", summaryTitle=", this.summaryTitle, ", subtotalAmount=");
        NavAction$$ExternalSyntheticOutline0.m(this.subtotalAmount, ", rounds=", ", errors=", m, this.rounds);
        m.append(this.errors);
        m.append(", isFinishAndPayEnabled=");
        m.append(this.isFinishAndPayEnabled);
        m.append(", isWorkingAsync=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.isWorkingAsync, ")");
    }
}
