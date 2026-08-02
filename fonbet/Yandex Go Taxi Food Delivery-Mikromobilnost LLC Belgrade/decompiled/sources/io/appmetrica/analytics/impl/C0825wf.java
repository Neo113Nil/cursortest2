package io.appmetrica.analytics.impl;

import defpackage.tls;
import defpackage.zy11;
import io.appmetrica.analytics.MviEventsReporter;
import io.appmetrica.analytics.MviScreen;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.impl.wf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0825wf extends Lambda implements tls {
    public final /* synthetic */ MviScreen a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0825wf(MviScreen mviScreen) {
        super(1);
        this.a = mviScreen;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ((MviEventsReporter) obj).onDestroy(this.a);
        return zy11.a;
    }
}
