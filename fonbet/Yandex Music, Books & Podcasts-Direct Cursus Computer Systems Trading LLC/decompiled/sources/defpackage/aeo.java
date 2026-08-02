package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class aeo {
    public final LinkedHashMap a;
    public final LinkedHashMap b;

    public aeo(int i) {
        switch (i) {
            case 1:
                this.a = new LinkedHashMap();
                this.b = new LinkedHashMap();
                break;
            default:
                this.a = new LinkedHashMap();
                this.b = new LinkedHashMap();
                break;
        }
    }

    public static void a(tjo tjoVar, ybg ybgVar) {
        ybgVar.invoke(tjoVar);
        Iterator it = tjoVar.c.iterator();
        while (it.hasNext()) {
            a((tjo) it.next(), ybgVar);
        }
    }
}
