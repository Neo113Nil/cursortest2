package defpackage;

import ru.yandex.music.url.ui.UrlActivity;

/* loaded from: classes6.dex */
public final class opt extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ UrlActivity k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public opt(UrlActivity urlActivity, cg6 cg6Var) {
        super(cg6Var);
        this.k = urlActivity;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return UrlActivity.z(this.k, null, this);
    }
}
