package defpackage;

import ru.yandex.music.common.media.control.shared.commands.StartQueueIntoYnisonRemoteCommandOld;

/* loaded from: classes5.dex */
public final class rcr extends cg6 {
    public StartQueueIntoYnisonRemoteCommandOld j;
    public es6 k;
    public oow l;
    public /* synthetic */ Object m;
    public final /* synthetic */ tcr n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rcr(tcr tcrVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = tcrVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.a(null, null, this);
    }
}
