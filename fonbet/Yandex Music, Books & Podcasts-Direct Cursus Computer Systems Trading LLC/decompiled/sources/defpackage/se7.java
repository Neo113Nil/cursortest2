package defpackage;

import java.util.LinkedHashMap;
import ru.yandex.video.m3.data.StartFromCacheInfo;

/* loaded from: classes6.dex */
public final class se7 implements u9l {
    public final /* synthetic */ ue7 a;

    public se7(ue7 ue7Var) {
        this.a = ue7Var;
    }

    @Override // defpackage.u9l
    public final void k0(gfc gfcVar) {
        ue7 ue7Var = this.a;
        imh imhVar = ue7Var.m;
        if (imhVar == null) {
            return;
        }
        gag gagVar = ue7Var.d;
        StartFromCacheInfo startFromCacheInfo = gfcVar.a;
        Long videoCachePositionMs = startFromCacheInfo != null ? startFromCacheInfo.getVideoCachePositionMs() : null;
        xdr xdrVar = gagVar.c;
        if (videoCachePositionMs == null) {
            return;
        }
        LinkedHashMap q = uah.q(((eag) xdrVar.getValue()).k);
        q.put(imhVar, Boolean.valueOf(videoCachePositionMs.longValue() >= ((long) 1000)));
        while (true) {
            Object value = xdrVar.getValue();
            LinkedHashMap linkedHashMap = q;
            if (xdrVar.k(value, eag.a((eag) value, null, null, null, null, null, null, null, null, null, null, linkedHashMap, null, null, null, null, null, null, 130047))) {
                return;
            } else {
                q = linkedHashMap;
            }
        }
    }
}
