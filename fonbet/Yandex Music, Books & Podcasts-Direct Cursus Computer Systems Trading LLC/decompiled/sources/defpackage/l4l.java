package defpackage;

import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes5.dex */
public final class l4l extends cg6 {
    public StationId j;
    public a6l k;
    public xpt l;
    public /* synthetic */ Object m;
    public final /* synthetic */ m4l n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4l(m4l m4lVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = m4lVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.a(null, null, null, this);
    }
}
