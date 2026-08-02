package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class chf extends cg6 {
    public List j;
    public /* synthetic */ Object k;
    public final /* synthetic */ fhf l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chf(fhf fhfVar, Continuation continuation) {
        super(continuation);
        this.l = fhfVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return fhf.a(this.l, null, null, this);
    }
}
