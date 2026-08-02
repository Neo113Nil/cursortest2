package com.plaid.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.plaid.internal.C0095a6;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PollingOptions;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.p4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0256p4 {
    public final boolean a;
    public final long b;
    public final long c;

    /* renamed from: com.plaid.internal.p4$a */
    public static final class a {
        public static C0256p4 a(Common$PollingOptions common$PollingOptions) {
            common$PollingOptions.getClass();
            if (Intrinsics.areEqual(common$PollingOptions, Common$PollingOptions.getDefaultInstance())) {
                C0095a6.a.b(C0095a6.a, "No polling options received");
                return new C0256p4(false, common$PollingOptions.getIntervalMs() > 0 ? common$PollingOptions.getIntervalMs() : 500L, common$PollingOptions.getMaxDurationMs() > 0 ? common$PollingOptions.getMaxDurationMs() : 5000L);
            }
            if (common$PollingOptions.getIntervalMs() <= 0 || common$PollingOptions.getMaxDurationMs() <= 0) {
                C0095a6.a.b(C0095a6.a, "Invalid polling options received - duration: " + common$PollingOptions.getMaxDurationMs() + " interval: " + common$PollingOptions.getIntervalMs());
            }
            return new C0256p4(true, common$PollingOptions.getIntervalMs() > 0 ? common$PollingOptions.getIntervalMs() : 500L, common$PollingOptions.getMaxDurationMs() > 0 ? common$PollingOptions.getMaxDurationMs() : 5000L);
        }
    }

    public C0256p4(boolean z, long j, long j2) {
        this.a = z;
        this.b = j;
        this.c = j2;
    }

    public final long a() {
        return this.b;
    }

    public final long b() {
        return this.c;
    }

    public final boolean c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0256p4)) {
            return false;
        }
        C0256p4 c0256p4 = (C0256p4) obj;
        return this.a == c0256p4.a && this.b == c0256p4.b && this.c == c0256p4.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + Recorder$$ExternalSyntheticOutline2.m(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        boolean z = this.a;
        long j = this.b;
        long j2 = this.c;
        StringBuilder sb = new StringBuilder("OAuthPollingOptions(shouldPoll=");
        sb.append(z);
        sb.append(", interval=");
        sb.append(j);
        return Boxes$$ExternalSyntheticOutline1.m(j2, ", maxDuration=", ")", sb);
    }
}
