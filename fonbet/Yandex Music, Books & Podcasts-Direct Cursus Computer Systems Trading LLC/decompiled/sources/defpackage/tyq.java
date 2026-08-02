package defpackage;

import com.yandex.music.shared.smart.downloading.domain.SmartDownloadWorker;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class tyq extends cg6 {
    public int A;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public Long n;
    public String o;
    public xqn p;
    public xqn q;
    public Object r;
    public Serializable s;
    public Object t;
    public Object u;
    public String v;
    public yyq w;
    public Long x;
    public /* synthetic */ Object y;
    public final /* synthetic */ SmartDownloadWorker z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tyq(SmartDownloadWorker smartDownloadWorker, cg6 cg6Var) {
        super(cg6Var);
        this.z = smartDownloadWorker;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.c(this);
    }
}
