package defpackage;

import com.yandex.music.shared.music_starter.executor.VideoClipQueueStartCommand;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class u6u extends cg6 {
    public VideoClipQueueStartCommand j;
    public Object k;
    public Iterator l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ v6u o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6u(v6u v6uVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = v6uVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.c(null, this);
    }
}
