package com.squareup.cash.account.components.accountswitcher;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.cash.arcade.Icons;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes5.dex */
public final class RowDetails {
    public final int body;
    public final Icons icon;
    public final int title;

    public RowDetails(int i, int i2, Icons icons) {
        this.title = i;
        this.body = i2;
        this.icon = icons;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RowDetails)) {
            return false;
        }
        RowDetails rowDetails = (RowDetails) obj;
        return this.title == rowDetails.title && this.body == rowDetails.body && this.icon == rowDetails.icon;
    }

    public final int hashCode() {
        return this.icon.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.body, Integer.hashCode(this.title) * 31, 31);
    }

    public final String toString() {
        StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(this.title, this.body, "RowDetails(title=", ", body=", ", icon=");
        m107m.append(this.icon);
        m107m.append(")");
        return m107m.toString();
    }
}
