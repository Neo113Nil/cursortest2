package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class a4m extends cg6 {
    public MainDatabase j;
    public ArrayList k;
    public long l;
    public /* synthetic */ Object m;
    public final /* synthetic */ b4m n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4m(b4m b4mVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = b4mVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return b4m.b(this.n, null, 0L, null, this);
    }
}
