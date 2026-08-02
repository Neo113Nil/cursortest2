package defpackage;

import ru.yandex.music.common.media.control.shared.commands.LaunchGlagolCommand;

/* loaded from: classes5.dex */
public final class dnf extends cg6 {
    public LaunchGlagolCommand j;
    public ced k;
    public a0q l;
    public u8n m;
    public /* synthetic */ Object n;
    public final /* synthetic */ enf o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnf(enf enfVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = enfVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.b(null, this);
    }
}
