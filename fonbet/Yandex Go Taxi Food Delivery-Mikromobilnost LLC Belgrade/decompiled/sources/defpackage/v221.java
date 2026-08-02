package defpackage;

import com.yandex.messenger.websdk.api.Cancelable;
import java.util.LinkedHashMap;

/* loaded from: classes15.dex */
public final class v221 {
    public final /* synthetic */ yx1 a;
    public final /* synthetic */ s221 b;

    public v221(yx1 yx1Var, s221 s221Var) {
        this.a = yx1Var;
        this.b = s221Var;
    }

    public final void a() {
        yx1 yx1Var = this.a;
        yx1Var.getClass();
        LinkedHashMap linkedHashMap = (LinkedHashMap) yx1Var.g;
        s221 s221Var = this.b;
        Cancelable cancelable = (Cancelable) linkedHashMap.get(s221Var);
        if (cancelable != null) {
            linkedHashMap.remove(s221Var);
            cancelable.cancel();
        }
    }

    public final void b() {
        yx1 yx1Var = this.a;
        LinkedHashMap linkedHashMap = (LinkedHashMap) yx1Var.g;
        s221 s221Var = this.b;
        if (linkedHashMap.containsKey(s221Var)) {
            return;
        }
        linkedHashMap.put(s221Var, ((jid) yx1Var.f).invoke(s221Var, Boolean.FALSE));
    }

    public final void c(w221 w221Var) {
        yx1 yx1Var = this.a;
        yx1Var.getClass();
        yx1Var.e(this.b, w221Var);
    }
}
