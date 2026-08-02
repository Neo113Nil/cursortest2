package io.reactivex.internal.schedulers;

import defpackage.ito;
import defpackage.jto;
import defpackage.p5j;
import defpackage.wjo;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes5.dex */
public final class c extends jto {
    public static final wjo b = new wjo("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())), false);
    public final ThreadFactory a = b;

    @Override // defpackage.jto
    public final ito a() {
        return new p5j(this.a);
    }
}
