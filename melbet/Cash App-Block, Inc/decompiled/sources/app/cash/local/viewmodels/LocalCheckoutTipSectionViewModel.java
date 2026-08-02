package app.cash.local.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalCheckoutTipSectionViewModel {
    public final String finePrint;
    public final boolean isEnabled;
    public final List options;
    public final String overrideTip;
    public final String subtitle;
    public final boolean subtitleHighlighted;
    public final String title;

    public LocalCheckoutTipSectionViewModel(String str, String str2, String str3, String str4, List list, boolean z) {
        str.getClass();
        list.getClass();
        this.title = str;
        this.subtitle = str2;
        this.subtitleHighlighted = z;
        this.overrideTip = str3;
        this.options = list;
        this.isEnabled = true;
        this.finePrint = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalCheckoutTipSectionViewModel)) {
            return false;
        }
        LocalCheckoutTipSectionViewModel localCheckoutTipSectionViewModel = (LocalCheckoutTipSectionViewModel) obj;
        return Intrinsics.areEqual(this.title, localCheckoutTipSectionViewModel.title) && Intrinsics.areEqual(this.subtitle, localCheckoutTipSectionViewModel.subtitle) && this.subtitleHighlighted == localCheckoutTipSectionViewModel.subtitleHighlighted && Intrinsics.areEqual(this.overrideTip, localCheckoutTipSectionViewModel.overrideTip) && Intrinsics.areEqual(this.options, localCheckoutTipSectionViewModel.options) && this.isEnabled == localCheckoutTipSectionViewModel.isEnabled && Intrinsics.areEqual(this.finePrint, localCheckoutTipSectionViewModel.finePrint);
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.subtitleHighlighted);
        String str2 = this.overrideTip;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m((m + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.options), 31, this.isEnabled);
        String str3 = this.finePrint;
        return m2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LocalCheckoutTipSectionViewModel(title=", this.title, ", subtitle=", this.subtitle, ", subtitleHighlighted=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.subtitleHighlighted, ", overrideTip=", this.overrideTip, ", options=");
        m.append(this.options);
        m.append(", isEnabled=");
        m.append(this.isEnabled);
        m.append(", finePrint=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.finePrint, ")");
    }
}
