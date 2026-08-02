package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class p2t extends uif implements Function0 {
    public final /* synthetic */ q2t r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2t(q2t q2tVar) {
        super(0);
        this.r = q2tVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.r.d.getDeviceId().toString();
    }
}
