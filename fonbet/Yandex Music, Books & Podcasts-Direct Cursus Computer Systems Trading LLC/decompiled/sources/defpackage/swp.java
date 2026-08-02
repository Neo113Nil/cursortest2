package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class swp implements e5c {
    public final /* synthetic */ e5c a;
    public final twp b;

    public swp(twp twpVar) {
        this.a = (e5c) twpVar.a.getValue();
        this.b = twpVar;
    }

    @Override // defpackage.e5c
    public final Object a(Continuation continuation) {
        return this.a.a(continuation);
    }

    @Override // defpackage.e5c
    public final Object b(Continuation continuation) {
        return this.a.b(continuation);
    }
}
