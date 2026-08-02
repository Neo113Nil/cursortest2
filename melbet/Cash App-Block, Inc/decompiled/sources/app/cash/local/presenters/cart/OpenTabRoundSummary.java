package app.cash.local.presenters.cart;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import app.cash.local.primitives.LocalMoney;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class OpenTabRoundSummary {
    public final ArrayList images;
    public final int itemCount;
    public final LocalMoney subtotal;

    public OpenTabRoundSummary(LocalMoney localMoney, int i, ArrayList arrayList) {
        this.subtotal = localMoney;
        this.itemCount = i;
        this.images = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenTabRoundSummary)) {
            return false;
        }
        OpenTabRoundSummary openTabRoundSummary = (OpenTabRoundSummary) obj;
        return Intrinsics.areEqual(this.subtotal, openTabRoundSummary.subtotal) && this.itemCount == openTabRoundSummary.itemCount && this.images.equals(openTabRoundSummary.images);
    }

    public final int hashCode() {
        LocalMoney localMoney = this.subtotal;
        return this.images.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.itemCount, (localMoney == null ? 0 : localMoney.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenTabRoundSummary(subtotal=");
        sb.append(this.subtotal);
        sb.append(", itemCount=");
        sb.append(this.itemCount);
        sb.append(", images=");
        return Recorder$$ExternalSyntheticOutline1.m(")", sb, this.images);
    }
}
