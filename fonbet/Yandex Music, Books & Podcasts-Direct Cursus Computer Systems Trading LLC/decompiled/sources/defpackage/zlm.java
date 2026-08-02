package defpackage;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lzlm;", "Lwb7;", "Lhmm;", "datastore-preferences-core"}, k = 1, mv = {1, 5, 1}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
public final class zlm implements wb7<hmm> {
    public final okq a;

    public zlm(okq okqVar) {
        this.a = okqVar;
    }

    @Override // defpackage.wb7
    public final Object a(Function2 function2, Continuation continuation) {
        return this.a.a(new ylm(function2, null), continuation);
    }

    @Override // defpackage.wb7
    public final pjc getData() {
        return this.a.d;
    }
}
