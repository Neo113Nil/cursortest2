package defpackage;

import android.net.Uri;
import ru.yandex.music.catalog.info.FullInfoActivity;

/* loaded from: classes4.dex */
public final class jxc extends cg6 {
    public Uri j;
    public /* synthetic */ Object k;
    public final /* synthetic */ FullInfoActivity l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jxc(FullInfoActivity fullInfoActivity, cg6 cg6Var) {
        super(cg6Var);
        this.l = fullInfoActivity;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return FullInfoActivity.k(this.l, null, this);
    }
}
