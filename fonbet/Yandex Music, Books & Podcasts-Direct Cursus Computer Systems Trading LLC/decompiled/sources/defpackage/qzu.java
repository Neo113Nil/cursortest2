package defpackage;

import com.yandex.music.shared.music_starter.executor.WaveQueueStartCommand;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class qzu extends cg6 {
    public WaveQueueStartCommand j;
    public kzu k;
    public Object l;
    public LinkedHashMap m;
    public /* synthetic */ Object n;
    public final /* synthetic */ rzu o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qzu(rzu rzuVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = rzuVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.e(null, this);
    }
}
