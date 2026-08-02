package com.datadog.android.core.internal.data.upload;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.util.Strings;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import okhttp3.Dns;

/* loaded from: classes4.dex */
public final class RotatingDnsResolver implements Dns {
    public static final long TTL_30_MIN;
    public final Dns delegate;
    public final LinkedHashMap knownHosts;
    public final Strings timeProvider;
    public final long ttl;

    public final class ResolvedHost {
        public final ArrayList addresses;
        public final String hostname;
        public final long resolutionTimestamp;

        public ResolvedHost(long j, String str, ArrayList arrayList) {
            str.getClass();
            this.hostname = str;
            this.addresses = arrayList;
            this.resolutionTimestamp = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResolvedHost)) {
                return false;
            }
            ResolvedHost resolvedHost = (ResolvedHost) obj;
            return Intrinsics.areEqual(this.hostname, resolvedHost.hostname) && this.addresses.equals(resolvedHost.addresses) && this.resolutionTimestamp == resolvedHost.resolutionTimestamp;
        }

        public final int hashCode() {
            return Long.hashCode(this.resolutionTimestamp) + CameraState$Type$EnumUnboxingLocalUtility.m(this.addresses, this.hostname.hashCode() * 31, 31);
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m(this.resolutionTimestamp, ")", CameraState$Type$EnumUnboxingLocalUtility.m(this.addresses, "ResolvedHost(hostname=", this.hostname, ", addresses=", ", resolutionTimestamp="));
        }
    }

    static {
        Duration.Companion companion = Duration.Companion;
        TTL_30_MIN = DurationKt.toDuration(30, DurationUnit.MINUTES);
    }

    public RotatingDnsResolver(Strings strings) {
        strings.getClass();
        this.delegate = Dns.SYSTEM;
        this.ttl = TTL_30_MIN;
        this.timeProvider = strings;
        this.knownHosts = new LinkedHashMap();
    }

    @Override // okhttp3.Dns
    public final List lookup(String str) {
        List list;
        List list2;
        str.getClass();
        ResolvedHost resolvedHost = (ResolvedHost) this.knownHosts.get(str);
        if (resolvedHost != null) {
            this.timeProvider.getClass();
            long nanoTime = System.nanoTime();
            Duration.Companion companion = Duration.Companion;
            if (Duration.m4164compareToLRDsOJo(DurationKt.toDuration(nanoTime - resolvedHost.resolutionTimestamp, DurationUnit.NANOSECONDS), this.ttl) < 0 && !resolvedHost.addresses.isEmpty()) {
                synchronized (resolvedHost.addresses) {
                    ArrayList arrayList = resolvedHost.addresses;
                    InetAddress inetAddress = (InetAddress) (arrayList.isEmpty() ? null : arrayList.remove(0));
                    if (inetAddress != null) {
                        resolvedHost.addresses.add(inetAddress);
                    }
                }
                ArrayList arrayList2 = resolvedHost.addresses;
                synchronized (arrayList2) {
                    list2 = CollectionsKt.toList(arrayList2);
                }
                return list2;
            }
        }
        List lookup = this.delegate.lookup(str);
        LinkedHashMap linkedHashMap = this.knownHosts;
        ArrayList mutableList = CollectionsKt.toMutableList((Collection) lookup);
        this.timeProvider.getClass();
        linkedHashMap.put(str, new ResolvedHost(System.nanoTime(), str, mutableList));
        synchronized (lookup) {
            list = CollectionsKt.toList(lookup);
        }
        return list;
    }
}
