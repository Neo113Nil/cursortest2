package com.squareup.cash.clientroutes;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class DeepLinksConfig {
    public static final DeepLinksConfig production = new DeepLinksConfig(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"https", "http"}), CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"cashme", "squarecash"}), CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"cash.app", "cash.me"}));
    public final List hosts;
    public final List platformProtocols;
    public final List webProtocols;

    static {
        new DeepLinksConfig(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"https", "http"}), CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"cashme", "squarecash"}), CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"cashstaging.app", "cashstaging.me"}));
    }

    public DeepLinksConfig(List list, List list2, List list3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.webProtocols = list;
        this.platformProtocols = list2;
        this.hosts = list3;
        if (list.isEmpty()) {
            a$$ExternalSyntheticBUOutline0.m$3("Deep links must specify a web protocol");
            throw null;
        }
        if (list3.isEmpty()) {
            a$$ExternalSyntheticBUOutline0.m$3("Deep links must specify a host");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeepLinksConfig)) {
            return false;
        }
        DeepLinksConfig deepLinksConfig = (DeepLinksConfig) obj;
        return Intrinsics.areEqual(this.webProtocols, deepLinksConfig.webProtocols) && Intrinsics.areEqual(this.platformProtocols, deepLinksConfig.platformProtocols) && Intrinsics.areEqual(this.hosts, deepLinksConfig.hosts);
    }

    public final int hashCode() {
        return this.hosts.hashCode() + Recorder$$ExternalSyntheticOutline2.m(this.webProtocols.hashCode() * 31, 31, this.platformProtocols);
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(re$$ExternalSyntheticOutline0.m("DeepLinksConfig(webProtocols=", ", platformProtocols=", ", hosts=", this.webProtocols, this.platformProtocols), this.hosts, ")");
    }
}
