package defpackage;

import com.yandex.music.shared.offline.recommender.proto.a;

/* loaded from: classes4.dex */
public final class glj extends cg6 {
    public a j;
    public o6c k;
    public int[] l;
    public /* synthetic */ Object m;
    public final /* synthetic */ llj n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public glj(llj lljVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = lljVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.b(this);
    }
}
