package defpackage;

import ru.yandex.music.services.RoutineService;

/* loaded from: classes6.dex */
public final class kgp extends cg6 {
    public d51 j;
    public RoutineService k;
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ mgp n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kgp(mgp mgpVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = mgpVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.a(this);
    }
}
