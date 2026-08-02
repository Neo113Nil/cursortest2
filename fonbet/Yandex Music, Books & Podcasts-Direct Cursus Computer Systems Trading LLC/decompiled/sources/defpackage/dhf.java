package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class dhf extends cg6 {
    public List j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ghf l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhf(ghf ghfVar, Continuation continuation) {
        super(continuation);
        this.l = ghfVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return ghf.a(this.l, null, null, this);
    }
}
