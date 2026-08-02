package com.squareup.cash.p2pblocking.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class P2PListButtonValues {
    public final boolean enabled;
    public final P2PListViewEvent event;
    public final boolean isProminent;
    public final String text;

    public P2PListButtonValues(String str, boolean z, P2PListViewEvent p2PListViewEvent, boolean z2) {
        str.getClass();
        this.text = str;
        this.isProminent = z;
        this.event = p2PListViewEvent;
        this.enabled = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P2PListButtonValues)) {
            return false;
        }
        P2PListButtonValues p2PListButtonValues = (P2PListButtonValues) obj;
        return Intrinsics.areEqual(this.text, p2PListButtonValues.text) && this.isProminent == p2PListButtonValues.isProminent && Intrinsics.areEqual(this.event, p2PListButtonValues.event) && this.enabled == p2PListButtonValues.enabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.enabled) + ((this.event.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.text.hashCode() * 31, 31, this.isProminent)) * 31);
    }

    public final String toString() {
        StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("P2PListButtonValues(text=", this.text, ", isProminent=", ", event=", this.isProminent);
        m1540m.append(this.event);
        m1540m.append(", enabled=");
        m1540m.append(this.enabled);
        m1540m.append(")");
        return m1540m.toString();
    }
}
