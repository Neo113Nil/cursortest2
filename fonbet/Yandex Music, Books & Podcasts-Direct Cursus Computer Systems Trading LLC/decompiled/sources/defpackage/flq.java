package defpackage;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import java.util.LinkedHashSet;
import kotlin.Metadata;

@we7(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {359, 362, 365}, m = "readDataOrHandleCorruption")
@Metadata(k = 3, mv = {1, 5, 1}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
final class flq extends cg6 {
    public Object j;
    public Object k;
    public /* synthetic */ Object l;
    public final /* synthetic */ okq m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public flq(okq okqVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = okqVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        LinkedHashSet linkedHashSet = okq.j;
        return this.m.h(this);
    }
}
