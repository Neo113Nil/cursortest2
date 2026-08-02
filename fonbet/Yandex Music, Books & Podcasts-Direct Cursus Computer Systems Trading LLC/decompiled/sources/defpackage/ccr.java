package defpackage;

import ru.yandex.music.glagol.legacy.StartLegacyGlagolQueueBasicCommand;

/* loaded from: classes5.dex */
public final class ccr extends cg6 {
    public StartLegacyGlagolQueueBasicCommand j;
    public /* synthetic */ Object k;
    public final /* synthetic */ dcr l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccr(dcr dcrVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = dcrVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, null, this);
    }
}
