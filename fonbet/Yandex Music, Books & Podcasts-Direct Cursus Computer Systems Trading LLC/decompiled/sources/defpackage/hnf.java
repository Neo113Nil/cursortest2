package defpackage;

import ru.yandex.music.common.media.control.shared.commands.LaunchGlagolCommandOld;

/* loaded from: classes5.dex */
public final class hnf extends cg6 {
    public LaunchGlagolCommandOld j;
    public v8n k;
    public a0q l;
    public /* synthetic */ Object m;
    public final /* synthetic */ inf n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hnf(inf infVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = infVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.b(null, this);
    }
}
