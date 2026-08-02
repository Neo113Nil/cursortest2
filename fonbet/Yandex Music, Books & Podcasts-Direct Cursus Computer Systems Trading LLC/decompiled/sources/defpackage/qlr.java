package defpackage;

import java.util.LinkedHashMap;
import ru.yandex.video.m3.data.DrmType;
import ru.yandex.video.m3.player.impl.tracking.a;

/* loaded from: classes6.dex */
public final /* synthetic */ class qlr {
    public final /* synthetic */ slr a;

    public final void a(Object obj) {
        n2t n2tVar;
        hxo hxoVar = new hxo(14, (DrmType) obj);
        slr slrVar = this.a;
        a aVar = slrVar.H;
        if (aVar == null || (n2tVar = aVar.b) == null) {
            return;
        }
        n2t n2tVar2 = (n2t) hxoVar.invoke(n2tVar);
        a aVar2 = slrVar.H;
        if (aVar2 != null) {
            aVar2.b = n2tVar2;
        }
        bt2 bt2Var = slrVar.w;
        if (bt2Var != null) {
            LinkedHashMap linkedHashMap = n2tVar2.n;
            linkedHashMap.getClass();
            if (!(bt2Var instanceof bt2)) {
                bt2Var = null;
            }
            if (bt2Var != null) {
                bt2Var.d(linkedHashMap);
            }
        }
    }
}
