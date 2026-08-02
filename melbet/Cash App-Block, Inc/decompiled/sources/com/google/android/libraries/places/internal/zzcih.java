package com.google.android.libraries.places.internal;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class zzcih {
    public static zzcig zza(int i) {
        return new zzcig(new zzclo(), Math.min(PKIFailureInfo.badCertTemplate, ((i + 8191) / PKIFailureInfo.certRevoked) * PKIFailureInfo.certRevoked));
    }
}
