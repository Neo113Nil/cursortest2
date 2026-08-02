package com.squareup.cash.investing.viewmodels.holdings;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Holding {
    public final boolean enabled;
    public final Image image;
    public final String name;
    public final String percent;
    public final String ticker;
    public final String token;

    public Holding(String str, Image image, String str2, String str3, String str4, boolean z) {
        str2.getClass();
        this.token = str;
        this.image = image;
        this.name = str2;
        this.ticker = str3;
        this.percent = str4;
        this.enabled = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Holding)) {
            return false;
        }
        Holding holding = (Holding) obj;
        if (!Intrinsics.areEqual(this.token, holding.token) || !Intrinsics.areEqual(this.image, holding.image)) {
            return false;
        }
        ColorModel.Investing investing = ColorModel.Investing.INSTANCE;
        return investing.equals(investing) && Intrinsics.areEqual(this.name, holding.name) && Intrinsics.areEqual(this.ticker, holding.ticker) && this.percent.equals(holding.percent) && this.enabled == holding.enabled;
    }

    public final int hashCode() {
        String str = this.token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Image image = this.image;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((((hashCode + (image == null ? 0 : image.hashCode())) * 31) + 677591443) * 31, 31, this.name);
        String str2 = this.ticker;
        return Boolean.hashCode(this.enabled) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.percent);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Holding(token=");
        sb.append(this.token);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(", color=");
        sb.append(ColorModel.Investing.INSTANCE);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", ticker=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.ticker, ", percent=", this.percent, ", enabled=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.enabled, ")");
    }
}
