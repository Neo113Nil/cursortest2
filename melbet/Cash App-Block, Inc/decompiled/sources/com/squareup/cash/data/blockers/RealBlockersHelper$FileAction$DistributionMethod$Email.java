package com.squareup.cash.data.blockers;

import com.stripe.android.core.utils.CreationExtrasKtxKt;

/* loaded from: classes8.dex */
public final class RealBlockersHelper$FileAction$DistributionMethod$Email extends CreationExtrasKtxKt {
    public final String body;
    public final String subject;

    public RealBlockersHelper$FileAction$DistributionMethod$Email(String str, String str2) {
        this.subject = str;
        this.body = str2;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getSubject() {
        return this.subject;
    }
}
