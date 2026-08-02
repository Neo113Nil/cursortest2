package com.plaid.internal;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.u7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0303u7 extends AbstractC0187h7 {
    public final String a;
    public final String b;

    public C0303u7(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0303u7)) {
            return false;
        }
        C0303u7 c0303u7 = (C0303u7) obj;
        return Intrinsics.areEqual(this.a, c0303u7.a) && Intrinsics.areEqual(this.b, c0303u7.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("TwilioSnaSessionInfo(verificationId=", this.a, ", redirectUri=", this.b, ")");
    }
}
