package defpackage;

import defpackage.hmm;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class p44 {
    public static final String e = f1d.g("Collection.Carousel.", "SectionsOrderStorage");
    public final jyr a = l18.b.b(hag.I(zzp.class), true);
    public final jyr b = btf.b(wg.g);
    public final x0q c = y0q.b(0, 0, null, 7);
    public final x0q d = y0q.b(0, 0, null, 7);

    public static hmm.a c(f24 f24Var) {
        String str;
        switch (f24Var.ordinal()) {
            case 0:
                str = "downloads";
                break;
            case 1:
                str = "playlists";
                break;
            case 2:
                str = "albums";
                break;
            case 3:
                str = "kids";
                break;
            case 4:
                str = "books";
                break;
            case 5:
                str = "podcasts";
                break;
            case 6:
                str = "videoClips";
                break;
            case 7:
                str = "waveForTwo";
                break;
            default:
                b6e.s();
                return null;
        }
        return new hmm.a(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(cg6 cg6Var) {
        j44 j44Var;
        int i;
        pjc data;
        hmm hmmVar;
        if (cg6Var instanceof j44) {
            j44Var = (j44) cg6Var;
            int i2 = j44Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j44Var.l = i2 - Integer.MIN_VALUE;
                Object obj = j44Var.j;
                nm6 nm6Var = nm6.a;
                i = j44Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    wb7 a = d().a("collection_section_action_timestamps");
                    if (a != null && (data = a.getData()) != null) {
                        j44Var.l = 1;
                        obj = zsd.g0(data, j44Var);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                    }
                    e5b e5bVar = e5b.a;
                    e5bVar.getClass();
                    return e5bVar;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                hmmVar = (hmm) obj;
                if (hmmVar != null) {
                    f24.a.getClass();
                    List<f24> list = f24.c;
                    ArrayList arrayList = new ArrayList();
                    for (f24 f24Var : list) {
                        Long l = (Long) ((lpi) hmmVar).a.get(c(f24Var));
                        Pair pair = l != null ? new Pair(f24Var, new Long(l.longValue())) : null;
                        if (pair != null) {
                            arrayList.add(pair);
                        }
                    }
                    int a2 = tah.a(v75.o(arrayList, 10));
                    if (a2 < 16) {
                        a2 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(a2);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Pair pair2 = (Pair) it.next();
                        linkedHashMap.put(pair2.a, pair2.b);
                    }
                    return linkedHashMap;
                }
                e5b e5bVar2 = e5b.a;
                e5bVar2.getClass();
                return e5bVar2;
            }
        }
        j44Var = new j44(this, cg6Var);
        Object obj2 = j44Var.j;
        nm6 nm6Var2 = nm6.a;
        i = j44Var.l;
        if (i != 0) {
        }
        hmmVar = (hmm) obj2;
        if (hmmVar != null) {
        }
        e5b e5bVar22 = e5b.a;
        e5bVar22.getClass();
        return e5bVar22;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(cg6 cg6Var) {
        k44 k44Var;
        int i;
        pjc data;
        hmm hmmVar;
        if (cg6Var instanceof k44) {
            k44Var = (k44) cg6Var;
            int i2 = k44Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k44Var.l = i2 - Integer.MIN_VALUE;
                Object obj = k44Var.j;
                nm6 nm6Var = nm6.a;
                i = k44Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    wb7 a = d().a("collection_section_pin_timestamps");
                    if (a != null && (data = a.getData()) != null) {
                        k44Var.l = 1;
                        obj = zsd.g0(data, k44Var);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                    }
                    e5b e5bVar = e5b.a;
                    e5bVar.getClass();
                    return e5bVar;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                hmmVar = (hmm) obj;
                if (hmmVar != null) {
                    f24.a.getClass();
                    List<f24> list = f24.c;
                    ArrayList arrayList = new ArrayList();
                    for (f24 f24Var : list) {
                        Long l = (Long) ((lpi) hmmVar).a.get(c(f24Var));
                        Pair pair = l != null ? new Pair(f24Var, new Long(l.longValue())) : null;
                        if (pair != null) {
                            arrayList.add(pair);
                        }
                    }
                    int a2 = tah.a(v75.o(arrayList, 10));
                    if (a2 < 16) {
                        a2 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(a2);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Pair pair2 = (Pair) it.next();
                        linkedHashMap.put(pair2.a, pair2.b);
                    }
                    return linkedHashMap;
                }
                e5b e5bVar2 = e5b.a;
                e5bVar2.getClass();
                return e5bVar2;
            }
        }
        k44Var = new k44(this, cg6Var);
        Object obj2 = k44Var.j;
        nm6 nm6Var2 = nm6.a;
        i = k44Var.l;
        if (i != 0) {
        }
        hmmVar = (hmm) obj2;
        if (hmmVar != null) {
        }
        e5b e5bVar22 = e5b.a;
        e5bVar22.getClass();
        return e5bVar22;
    }

    public final jv0 d() {
        return (jv0) this.b.getValue();
    }

    public final Object e(f24 f24Var, String str, Continuation continuation) {
        Object V = x97.V(dm6.b, new k3(this, f24Var, str, (Continuation) null, 29), continuation);
        return V == nm6.a ? V : Unit.a;
    }
}
