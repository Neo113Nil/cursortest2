package com.squareup.cash.blockers.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.instruments.viewmodels.InstrumentAvatarViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class SelectedInstrumentModel {
    public final InstrumentAvatarViewModel avatar;
    public final int id;
    public final boolean showDialog;
    public final boolean showList;
    public final String subtitle;
    public final String subtitleSuffix;
    public final String title;

    public SelectedInstrumentModel(int i, InstrumentAvatarViewModel instrumentAvatarViewModel, String str, String str2, String str3, boolean z, boolean z2) {
        str.getClass();
        this.id = i;
        this.avatar = instrumentAvatarViewModel;
        this.title = str;
        this.subtitle = str2;
        this.subtitleSuffix = str3;
        this.showList = z;
        this.showDialog = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectedInstrumentModel)) {
            return false;
        }
        SelectedInstrumentModel selectedInstrumentModel = (SelectedInstrumentModel) obj;
        return this.id == selectedInstrumentModel.id && this.avatar.equals(selectedInstrumentModel.avatar) && Intrinsics.areEqual(this.title, selectedInstrumentModel.title) && Intrinsics.areEqual(this.subtitle, selectedInstrumentModel.subtitle) && Intrinsics.areEqual(this.subtitleSuffix, selectedInstrumentModel.subtitleSuffix) && this.showList == selectedInstrumentModel.showList && this.showDialog == selectedInstrumentModel.showDialog;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.avatar.hashCode() + (Integer.hashCode(this.id) * 31)) * 31, 31, this.title);
        String str = this.subtitle;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitleSuffix;
        return Boolean.hashCode(this.showDialog) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.showList);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectedInstrumentModel(id=");
        sb.append(this.id);
        sb.append(", avatar=");
        sb.append(this.avatar);
        sb.append(", title=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.title, ", subtitle=", this.subtitle, ", subtitleSuffix=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.subtitleSuffix, ", showList=", this.showList, ", showDialog=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.showDialog, ")");
    }
}
