package defpackage;

import com.yandex.music.shared.generative.api.commands.StartGenerativeQueueCommand;

/* loaded from: classes3.dex */
public final class acr extends cg6 {
    public StartGenerativeQueueCommand j;
    public es6 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ bcr m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acr(bcr bcrVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = bcrVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(null, null, this);
    }
}
