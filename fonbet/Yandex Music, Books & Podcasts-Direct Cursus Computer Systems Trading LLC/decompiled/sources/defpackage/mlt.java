package defpackage;

import com.yandex.messenger.websdk.api.Cancelable;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class mlt {
    public final /* synthetic */ cr a;
    public final /* synthetic */ jlt b;

    public mlt(cr crVar, jlt jltVar) {
        this.a = crVar;
        this.b = jltVar;
    }

    public final void a() {
        cr crVar = this.a;
        crVar.getClass();
        LinkedHashMap linkedHashMap = (LinkedHashMap) crVar.h;
        jlt jltVar = this.b;
        Cancelable cancelable = (Cancelable) linkedHashMap.get(jltVar);
        if (cancelable != null) {
            linkedHashMap.remove(jltVar);
            cancelable.cancel();
        }
    }

    public final void b() {
        cr crVar = this.a;
        LinkedHashMap linkedHashMap = (LinkedHashMap) crVar.h;
        jlt jltVar = this.b;
        if (linkedHashMap.containsKey(jltVar)) {
            return;
        }
        linkedHashMap.put(jltVar, ((f5r) crVar.g).invoke(jltVar, Boolean.FALSE));
    }
}
