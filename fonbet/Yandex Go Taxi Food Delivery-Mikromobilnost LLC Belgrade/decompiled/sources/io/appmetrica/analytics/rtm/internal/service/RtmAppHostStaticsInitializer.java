package io.appmetrica.analytics.rtm.internal.service;

import defpackage.d5i0;

/* loaded from: classes9.dex */
public class RtmAppHostStaticsInitializer {
    private final RtmLibBuilderWrapper a;
    private String b;

    /* loaded from: classes15.dex */
    public enum Scope {
        MAIN,
        REPORTER
    }

    public RtmAppHostStaticsInitializer(RtmLibBuilderWrapper rtmLibBuilderWrapper) {
        this.a = rtmLibBuilderWrapper;
    }

    public void updateUploadUrl(Scope scope, String str) {
        if ((scope == Scope.MAIN || this.b == null) && !str.equals(this.b)) {
            this.b = str;
            d5i0 newAppHostStaticsBuilder = this.a.newAppHostStaticsBuilder();
            String str2 = this.b;
            if (str2 != null) {
                newAppHostStaticsBuilder.b(str2);
            }
            this.a.initAppHostStatics(newAppHostStaticsBuilder);
        }
    }
}
