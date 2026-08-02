package defpackage;

import com.yandex.music.shared.ynison.api.queue.StartYnisonQueueCommand;

/* loaded from: classes4.dex */
public final class cdr extends cg6 {
    public StartYnisonQueueCommand j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ddr l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdr(ddr ddrVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = ddrVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, null, this);
    }
}
