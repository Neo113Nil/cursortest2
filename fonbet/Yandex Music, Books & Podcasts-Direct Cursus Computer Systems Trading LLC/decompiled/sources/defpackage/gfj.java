package defpackage;

import com.yandex.messenger.websdk.api.Cancelable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class gfj implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hfj b;

    public /* synthetic */ gfj(hfj hfjVar, int i) {
        this.a = i;
        this.b = hfjVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                cr crVar = this.b.e;
                crVar.getClass();
                LinkedHashMap linkedHashMap = (LinkedHashMap) crVar.h;
                Set<jlt> keySet = linkedHashMap.keySet();
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    ((Cancelable) ((Map.Entry) it.next()).getValue()).cancel();
                }
                linkedHashMap.clear();
                for (jlt jltVar : keySet) {
                    linkedHashMap.put(jltVar, ((f5r) crVar.g).invoke(jltVar, Boolean.FALSE));
                }
                break;
            default:
                dwt.b(new gfj(this.b, 0));
                break;
        }
        return Unit.a;
    }
}
