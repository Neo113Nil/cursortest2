package defpackage;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;

@we7(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {322, 348, 505}, m = "readAndInit")
@Metadata(k = 3, mv = {1, 5, 1}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
final class zkq extends cg6 {
    public okq j;
    public Object k;
    public Serializable l;
    public Object m;
    public blq n;
    public Iterator o;
    public /* synthetic */ Object p;
    public final /* synthetic */ okq q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zkq(okq okqVar, cg6 cg6Var) {
        super(cg6Var);
        this.q = okqVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        LinkedHashSet linkedHashSet = okq.j;
        return this.q.d(this);
    }
}
