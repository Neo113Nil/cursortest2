package com.zennvvarroo.pealkkk.data.services;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ZenvaroPeakC533GatePayload.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/zennvvarroo/pealkkk/data/services/ZenvaroPeakC533GatePayload;", "", "link", "", "naming", "first_link", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getFirst_link", "()Z", "getLink", "()Ljava/lang/String;", "getNaming", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ZenvaroPeakC533GatePayload {
    public static final int $stable = 0;
    private final boolean first_link;
    private final String link;
    private final String naming;

    public static /* synthetic */ ZenvaroPeakC533GatePayload copy$default(ZenvaroPeakC533GatePayload zenvaroPeakC533GatePayload, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = zenvaroPeakC533GatePayload.link;
        }
        if ((i & 2) != 0) {
            str2 = zenvaroPeakC533GatePayload.naming;
        }
        if ((i & 4) != 0) {
            z = zenvaroPeakC533GatePayload.first_link;
        }
        return zenvaroPeakC533GatePayload.copy(str, str2, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    /* renamed from: component2, reason: from getter */
    public final String getNaming() {
        return this.naming;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getFirst_link() {
        return this.first_link;
    }

    public final ZenvaroPeakC533GatePayload copy(String link, String naming, boolean first_link) {
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(naming, "naming");
        return new ZenvaroPeakC533GatePayload(link, naming, first_link);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ZenvaroPeakC533GatePayload)) {
            return false;
        }
        ZenvaroPeakC533GatePayload zenvaroPeakC533GatePayload = (ZenvaroPeakC533GatePayload) other;
        return Intrinsics.areEqual(this.link, zenvaroPeakC533GatePayload.link) && Intrinsics.areEqual(this.naming, zenvaroPeakC533GatePayload.naming) && this.first_link == zenvaroPeakC533GatePayload.first_link;
    }

    public int hashCode() {
        return (((this.link.hashCode() * 31) + this.naming.hashCode()) * 31) + Boolean.hashCode(this.first_link);
    }

    public String toString() {
        return "ZenvaroPeakC533GatePayload(link=" + this.link + ", naming=" + this.naming + ", first_link=" + this.first_link + ")";
    }

    public ZenvaroPeakC533GatePayload(String link, String naming, boolean z) {
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(naming, "naming");
        this.link = link;
        this.naming = naming;
        this.first_link = z;
    }

    public final String getLink() {
        return this.link;
    }

    public final String getNaming() {
        return this.naming;
    }

    public final boolean getFirst_link() {
        return this.first_link;
    }
}
