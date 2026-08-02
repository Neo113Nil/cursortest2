package defpackage;

import java.io.Serializable;
import java.util.List;
import ru.yandex.music.glagol.data.b;

/* loaded from: classes5.dex */
public final class did extends cg6 {
    public List j;
    public qhd k;
    public qqi l;
    public Serializable m;
    public /* synthetic */ Object n;
    public final /* synthetic */ b o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public did(b bVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = bVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.d(null, null, this);
    }
}
