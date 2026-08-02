package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import ru.yandex.video.m3.player.PlaybackException;

/* loaded from: classes6.dex */
public final class fag implements rgl {
    public final paw a;
    public final /* synthetic */ gag b;

    public fag(gag gagVar, paw pawVar) {
        this.b = gagVar;
        this.a = pawVar;
    }

    @Override // defpackage.rgl
    public final void P(PlaybackException playbackException) {
        Object value;
        gag gagVar = this.b;
        xdr xdrVar = gagVar.c;
        if (((Boolean) ((fkn) gagVar.b.c).a.getValue()).booleanValue()) {
            LinkedHashMap q = uah.q(((eag) xdrVar.getValue()).h);
            String D = this.a.D();
            Integer num = (Integer) q.get(D);
            q.put(D, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
            do {
                value = xdrVar.getValue();
            } while (!xdrVar.k(value, eag.a((eag) value, null, null, null, null, null, null, null, q, null, null, null, null, null, null, null, null, null, 130943)));
        }
    }

    @Override // defpackage.rgl
    public final void v() {
        paw pawVar;
        Object obj;
        String str;
        Object value;
        isb b;
        imh imhVar;
        gag gagVar = this.b;
        xdr xdrVar = gagVar.c;
        if (((Boolean) ((fkn) gagVar.b.c).a.getValue()).booleanValue()) {
            Iterator it = ((eag) xdrVar.getValue()).f.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                pawVar = this.a;
                if (!hasNext) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((u7b) ((Map.Entry) obj).getValue()).a.equals(pawVar)) {
                        break;
                    }
                }
            }
            Map.Entry entry = (Map.Entry) obj;
            if (entry == null || (imhVar = (imh) entry.getKey()) == null || (str = imhVar.d) == null) {
                str = "nothing";
            }
            ArrayList y0 = CollectionsKt.y0(((eag) xdrVar.getValue()).i);
            nqs x = pawVar.x();
            y0.add(new jbr(str, (x == null || (b = ((jsb) x).b()) == null) ? -1 : b.h));
            do {
                value = xdrVar.getValue();
            } while (!xdrVar.k(value, eag.a((eag) value, null, null, null, null, null, null, null, null, y0, null, null, null, null, null, null, null, null, 130815)));
        }
    }
}
