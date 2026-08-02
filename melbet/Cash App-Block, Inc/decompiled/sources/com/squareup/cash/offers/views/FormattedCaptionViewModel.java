package com.squareup.cash.offers.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.Color;
import com.squareup.cash.offers.viewmodels.ShoppingIconId;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ULong;

/* loaded from: classes6.dex */
public final class FormattedCaptionViewModel {
    public final long color;
    public final ShoppingIconId icon;
    public final String text;

    public FormattedCaptionViewModel(String str, long j, ShoppingIconId shoppingIconId) {
        this.text = str;
        this.color = j;
        this.icon = shoppingIconId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormattedCaptionViewModel)) {
            return false;
        }
        FormattedCaptionViewModel formattedCaptionViewModel = (FormattedCaptionViewModel) obj;
        return this.text.equals(formattedCaptionViewModel.text) && Color.m676equalsimpl0(this.color, formattedCaptionViewModel.color) && this.icon == formattedCaptionViewModel.icon;
    }

    public final int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        int m = Recorder$$ExternalSyntheticOutline2.m(hashCode, 31, this.color);
        ShoppingIconId shoppingIconId = this.icon;
        return m + (shoppingIconId == null ? 0 : shoppingIconId.hashCode());
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FormattedCaptionViewModel(text=", this.text, ", color=", Color.m682toStringimpl(this.color), ", icon=");
        m.append(this.icon);
        m.append(")");
        return m.toString();
    }
}
