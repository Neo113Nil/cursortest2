package io.appmetrica.analytics.impl;

import defpackage.g041;
import defpackage.sls;
import java.util.concurrent.FutureTask;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes9.dex */
public final class W extends Lambda implements sls {
    public final /* synthetic */ C0175a0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(C0175a0 c0175a0) {
        super(0);
        this.a = c0175a0;
    }

    @Override // defpackage.sls
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final FutureTask invoke() {
        return new FutureTask(new g041(this.a, 0));
    }

    public static final Void a(C0175a0 c0175a0) {
        c0175a0.b();
        return null;
    }
}
