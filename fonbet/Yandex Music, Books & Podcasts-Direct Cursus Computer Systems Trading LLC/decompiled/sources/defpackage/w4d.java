package defpackage;

import com.yandex.music.shared.generative.api.commands.StartGenerativeQueueCommand;
import com.yandex.music.shared.music_starter.executor.GenerativeQueueStartCommand;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class w4d extends cg6 {
    public GenerativeQueueStartCommand j;
    public StartGenerativeQueueCommand k;
    public Iterator l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ x4d o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4d(x4d x4dVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = x4dVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.b(null, this);
    }
}
