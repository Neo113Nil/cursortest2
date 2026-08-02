package defpackage;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import java.util.LinkedHashSet;
import kotlin.Metadata;

@we7(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {402, 410}, m = "transformAndWrite")
@Metadata(k = 3, mv = {1, 5, 1}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
final class glq extends cg6 {
    public okq j;
    public Object k;
    public Object l;
    public /* synthetic */ Object m;
    public final /* synthetic */ okq n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public glq(okq okqVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = okqVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        LinkedHashSet linkedHashSet = okq.j;
        return this.n.i(null, null, this);
    }
}
