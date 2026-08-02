package com.squareup.cash.growtools.viewmodels.manager;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class GrowToolsActivityViewModel {
    public final UiCallbackModel activityEmbeddedViewModel;
    public final String title;
    public final ArrayList totalStats;

    /* loaded from: classes9.dex */
    public final class TotalStat {
        public final String label;
        public final String stat;

        public TotalStat(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.label = str;
            this.stat = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TotalStat)) {
                return false;
            }
            TotalStat totalStat = (TotalStat) obj;
            return Intrinsics.areEqual(this.label, totalStat.label) && Intrinsics.areEqual(this.stat, totalStat.stat);
        }

        public final int hashCode() {
            return this.stat.hashCode() + (this.label.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("TotalStat(label=", this.label, ", stat=", this.stat, ")");
        }
    }

    public GrowToolsActivityViewModel(String str, ArrayList arrayList, UiCallbackModel uiCallbackModel) {
        str.getClass();
        uiCallbackModel.getClass();
        this.title = str;
        this.totalStats = arrayList;
        this.activityEmbeddedViewModel = uiCallbackModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GrowToolsActivityViewModel)) {
            return false;
        }
        GrowToolsActivityViewModel growToolsActivityViewModel = (GrowToolsActivityViewModel) obj;
        return Intrinsics.areEqual(this.title, growToolsActivityViewModel.title) && this.totalStats.equals(growToolsActivityViewModel.totalStats) && Intrinsics.areEqual(this.activityEmbeddedViewModel, growToolsActivityViewModel.activityEmbeddedViewModel);
    }

    public final int hashCode() {
        return this.activityEmbeddedViewModel.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.totalStats, this.title.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder m = CameraState$Type$EnumUnboxingLocalUtility.m(this.totalStats, "GrowToolsActivityViewModel(title=", this.title, ", totalStats=", ", activityEmbeddedViewModel=");
        m.append(this.activityEmbeddedViewModel);
        m.append(")");
        return m.toString();
    }
}
