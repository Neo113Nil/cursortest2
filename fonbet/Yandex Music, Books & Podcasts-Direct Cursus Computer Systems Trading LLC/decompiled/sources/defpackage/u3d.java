package defpackage;

import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes5.dex */
public final class u3d extends cg6 {
    public StationId j;
    public /* synthetic */ Object k;
    public final /* synthetic */ v3d l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3d(v3d v3dVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = v3dVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, this);
    }
}
