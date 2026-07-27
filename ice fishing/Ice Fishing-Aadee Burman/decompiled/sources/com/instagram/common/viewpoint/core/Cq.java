package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: assets/audience_network/classes2.dex */
public final class Cq {
    public static final AtomicLong A07 = new AtomicLong();
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final Uri A04;
    public final C06605i A05;
    public final Map<String, List<String>> A06;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Cq(long j6, C06605i c06605i, long j9) {
        this(j6, c06605i, r4, Collections.emptyMap(), j9, 0L, 0L);
        Uri uri;
        if (c06605i != null) {
            uri = c06605i.A06;
        } else {
            uri = null;
        }
    }

    public Cq(long j6, C06605i c06605i, Uri uri, Map<String, List<String>> responseHeaders, long j9, long j10, long j11) {
        this.A03 = j6;
        this.A05 = c06605i;
        this.A04 = uri;
        this.A06 = responseHeaders;
        this.A01 = j9;
        this.A02 = j10;
        this.A00 = j11;
    }

    public static long A00() {
        return A07.getAndIncrement();
    }
}
