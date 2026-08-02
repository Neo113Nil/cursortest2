package defpackage;

import com.yandex.music.shared.music_starter.executor.WaveQueueStartCommand;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class ozu extends cg6 {
    public xsu j;
    public oyu k;
    public WaveQueueStartCommand l;
    public Function1 m;
    public /* synthetic */ Object n;
    public final /* synthetic */ rzu o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ozu(rzu rzuVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = rzuVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.c(null, null, null, null, this);
    }
}
