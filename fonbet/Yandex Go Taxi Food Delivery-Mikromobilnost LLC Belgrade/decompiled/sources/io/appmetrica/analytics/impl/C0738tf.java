package io.appmetrica.analytics.impl;

import defpackage.tls;
import defpackage.zy11;
import io.appmetrica.analytics.MviEventsReporter;
import io.appmetrica.analytics.MviScreen;
import java.util.Set;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.impl.tf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0738tf extends Lambda implements tls {
    public final /* synthetic */ MviScreen a;
    public final /* synthetic */ Set b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0738tf(MviScreen mviScreen, Set set) {
        super(1);
        this.a = mviScreen;
        this.b = set;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ((MviEventsReporter) obj).confirmReporting(this.a, this.b);
        return zy11.a;
    }
}
