package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import ru.yandex.music.data.wave.recommendations.Icon;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes6.dex */
public final class mfn {
    public final ofo a;

    public mfn(ofo ofoVar) {
        this.a = ofoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(StationId stationId, ArrayList arrayList, cg6 cg6Var) {
        jfn jfnVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof jfn) {
            jfnVar = (jfn) cg6Var;
            int i2 = jfnVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jfnVar.m = i2 - Integer.MIN_VALUE;
                Object obj = jfnVar.k;
                nm6 nm6Var = nm6.a;
                i = jfnVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    jfnVar.j = arrayList;
                    jfnVar.m = 1;
                    obj = this.a.a(stationId, jfnVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList = jfnVar.j;
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof qj6)) {
                    rj6Var = new qj6(sk3.b0((egr) ((qj6) rj6Var).a, arrayList));
                } else if (!(rj6Var instanceof pj6)) {
                    b6e.s();
                    return null;
                }
                dgr dgrVar = dgr.e;
                dgrVar.getClass();
                return jf0.Q(rj6Var, dgrVar);
            }
        }
        jfnVar = new jfn(this, cg6Var);
        Object obj2 = jfnVar.k;
        nm6 nm6Var2 = nm6.a;
        i = jfnVar.m;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof qj6)) {
        }
        dgr dgrVar2 = dgr.e;
        dgrVar2.getClass();
        return jf0.Q(rj6Var, dgrVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, cg6 cg6Var) {
        kfn kfnVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof kfn) {
            kfnVar = (kfn) cg6Var;
            int i2 = kfnVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kfnVar.l = i2 - Integer.MIN_VALUE;
                Object obj = kfnVar.j;
                nm6 nm6Var = nm6.a;
                i = kfnVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    kfnVar.l = 1;
                    obj = this.a.c(str, kfnVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof qj6)) {
                    yku ykuVar = (yku) ((qj6) rj6Var).a;
                    ykuVar.getClass();
                    s9p s9pVar = ykuVar.a;
                    StationId e = StationId.e(s9pVar);
                    ArrayList R = o8g.R(s9pVar);
                    String str2 = ykuVar.c;
                    Icon icon = Icon.a;
                    rj6Var = new qj6(new dgr(e, R, str2, ykuVar.b));
                } else if (!(rj6Var instanceof pj6)) {
                    b6e.s();
                    return null;
                }
                dgr dgrVar = dgr.e;
                dgrVar.getClass();
                return jf0.Q(rj6Var, dgrVar);
            }
        }
        kfnVar = new kfn(this, cg6Var);
        Object obj2 = kfnVar.j;
        nm6 nm6Var2 = nm6.a;
        i = kfnVar.l;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof qj6)) {
        }
        dgr dgrVar2 = dgr.e;
        dgrVar2.getClass();
        return jf0.Q(rj6Var, dgrVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(StationId stationId, cg6 cg6Var) {
        lfn lfnVar;
        int i;
        rj6 rj6Var;
        Object obj;
        if (cg6Var instanceof lfn) {
            lfnVar = (lfn) cg6Var;
            int i2 = lfnVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lfnVar.l = i2 - Integer.MIN_VALUE;
                Object obj2 = lfnVar.j;
                nm6 nm6Var = nm6.a;
                i = lfnVar.l;
                if (i != 0) {
                    qgg.h0(obj2);
                    lfnVar.l = 1;
                    obj2 = this.a.a(stationId, lfnVar);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                }
                rj6Var = (rj6) obj2;
                if (!(rj6Var instanceof qj6)) {
                    egr egrVar = (egr) ((qj6) rj6Var).a;
                    ?? r9 = egrVar.g;
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry : r9.entrySet()) {
                        String str = (String) entry.getKey();
                        String str2 = (String) entry.getValue();
                        i7o i7oVar = (i7o) egrVar.f.get(str);
                        String str3 = null;
                        if (i7oVar != null) {
                            Iterator it = i7oVar.b.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it.next();
                                j7o j7oVar = (j7o) obj;
                                if (j7oVar.b.equals(str2) && !j7oVar.d) {
                                    break;
                                }
                            }
                            j7o j7oVar2 = (j7o) obj;
                            if (j7oVar2 != null) {
                                str3 = j7oVar2.c;
                            }
                        }
                        if (str3 != null) {
                            arrayList.add(str3);
                        }
                    }
                    rj6Var = new qj6(sk3.b0(egrVar, arrayList));
                } else if (!(rj6Var instanceof pj6)) {
                    b6e.s();
                    return null;
                }
                dgr dgrVar = dgr.e;
                dgrVar.getClass();
                return jf0.Q(rj6Var, dgrVar);
            }
        }
        lfnVar = new lfn(this, cg6Var);
        Object obj22 = lfnVar.j;
        nm6 nm6Var2 = nm6.a;
        i = lfnVar.l;
        if (i != 0) {
        }
        rj6Var = (rj6) obj22;
        if (!(rj6Var instanceof qj6)) {
        }
        dgr dgrVar2 = dgr.e;
        dgrVar2.getClass();
        return jf0.Q(rj6Var, dgrVar2);
    }
}
