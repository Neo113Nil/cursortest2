package com.squareup.cash.instruments.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class InstrumentSheetHeaderViewModel {
    public final InstrumentAvatarViewModel avatar;
    public final String subtitle;
    public final String title;

    public InstrumentSheetHeaderViewModel(InstrumentAvatarViewModel instrumentAvatarViewModel, String str, String str2) {
        this.avatar = instrumentAvatarViewModel;
        this.title = str;
        this.subtitle = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstrumentSheetHeaderViewModel)) {
            return false;
        }
        InstrumentSheetHeaderViewModel instrumentSheetHeaderViewModel = (InstrumentSheetHeaderViewModel) obj;
        return this.avatar.equals(instrumentSheetHeaderViewModel.avatar) && Intrinsics.areEqual(this.title, instrumentSheetHeaderViewModel.title) && Intrinsics.areEqual(this.subtitle, instrumentSheetHeaderViewModel.subtitle);
    }

    public final int hashCode() {
        int hashCode = this.avatar.hashCode() * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        return (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstrumentSheetHeaderViewModel(avatar=");
        sb.append(this.avatar);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.subtitle, ", additionalInfo=null)");
    }
}
