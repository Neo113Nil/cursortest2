package yads;

import defpackage.mh;
import defpackage.tls;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class bh extends Lambda implements tls {
    public final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(long j) {
        super(1);
        this.b = j;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        long timestamp;
        timestamp = mh.g(obj).getTimestamp();
        return Boolean.valueOf(timestamp > this.b);
    }
}
