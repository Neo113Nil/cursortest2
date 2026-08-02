package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class z55 extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ gl l;
    public rjc m;
    public ArrayList n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z55(gl glVar, Continuation continuation) {
        super(continuation);
        this.l = glVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
