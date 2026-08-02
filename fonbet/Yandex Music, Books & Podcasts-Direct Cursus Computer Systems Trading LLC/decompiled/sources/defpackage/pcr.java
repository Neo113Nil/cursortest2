package defpackage;

import com.yandex.music.shared.ynison.center.api.launcher.StartQueueIntoYnisonRemoteCommand;

/* loaded from: classes4.dex */
public final class pcr extends cg6 {
    public StartQueueIntoYnisonRemoteCommand j;
    public oow k;
    public /* synthetic */ Object l;
    public final /* synthetic */ qcr m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pcr(qcr qcrVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = qcrVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(null, null, this);
    }
}
