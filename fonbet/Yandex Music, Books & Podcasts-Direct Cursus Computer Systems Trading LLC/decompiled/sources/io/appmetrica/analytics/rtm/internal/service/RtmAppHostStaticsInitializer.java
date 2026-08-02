package io.appmetrica.analytics.rtm.internal.service;

import androidx.annotation.NonNull;
import defpackage.ten;

/* loaded from: classes5.dex */
public class RtmAppHostStaticsInitializer {
    private final RtmLibBuilderWrapper a;
    private String b;

    public enum Scope {
        MAIN,
        REPORTER
    }

    public RtmAppHostStaticsInitializer(@NonNull RtmLibBuilderWrapper rtmLibBuilderWrapper) {
        this.a = rtmLibBuilderWrapper;
    }

    public void updateUploadUrl(@NonNull Scope scope, @NonNull String str) {
        if ((scope == Scope.MAIN || this.b == null) && !str.equals(this.b)) {
            this.b = str;
            ten newAppHostStaticsBuilder = this.a.newAppHostStaticsBuilder();
            String str2 = this.b;
            if (str2 != null) {
                newAppHostStaticsBuilder.getClass();
                newAppHostStaticsBuilder.a = str2;
            }
            this.a.initAppHostStatics(newAppHostStaticsBuilder);
        }
    }
}
