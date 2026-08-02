package defpackage;

import com.google.gson.Gson;
import com.yandex.music.shared.smart.downloading.data.SmartDownloadingStorageImpl$parseTimeIntervals$type$1;
import defpackage.hmm;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Set;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class nzq implements hzq {
    public static final hmm.a c = new hmm.a("smart_downloading_key_uid");
    public static final hmm.a d = new hmm.a("smart_downloading_key_interval_list");
    public static final hmm.a e = new hmm.a("smart_downloading_key_launch_time");
    public static final hmm.a f = new hmm.a("smart_downloading_key_update_time");
    public static final hmm.a g = new hmm.a("smart_downloading_key_next_update_time");
    public static final hmm.a h = new hmm.a("smart_downloading_key_tracks_to_add");
    public static final hmm.a i = new hmm.a("smart_downloading_key_tracks_to_delete");
    public final Gson a;
    public final jyr b;

    public nzq(frt frtVar, cc7 cc7Var, Gson gson) {
        this.a = gson;
        this.b = btf.b(new cdc(cc7Var, frtVar, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        izq izqVar;
        int i2;
        hmm hmmVar;
        if (cg6Var instanceof izq) {
            izqVar = (izq) cg6Var;
            int i3 = izqVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                izqVar.l = i3 - Integer.MIN_VALUE;
                Object obj = izqVar.j;
                nm6 nm6Var = nm6.a;
                i2 = izqVar.l;
                if (i2 != 0) {
                    qgg.h0(obj);
                    pjc data = ((wb7) this.b.getValue()).getData();
                    izqVar.l = 1;
                    obj = zsd.i0(data, izqVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                hmmVar = (hmm) obj;
                if (hmmVar == null) {
                    return (Long) hmmVar.a(e);
                }
                return null;
            }
        }
        izqVar = new izq(this, cg6Var);
        Object obj2 = izqVar.j;
        nm6 nm6Var2 = nm6.a;
        i2 = izqVar.l;
        if (i2 != 0) {
        }
        hmmVar = (hmm) obj2;
        if (hmmVar == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        jzq jzqVar;
        int i2;
        hmm hmmVar;
        String str;
        List list;
        Object t7oVar;
        if (cg6Var instanceof jzq) {
            jzqVar = (jzq) cg6Var;
            int i3 = jzqVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jzqVar.l = i3 - Integer.MIN_VALUE;
                Object obj = jzqVar.j;
                nm6 nm6Var = nm6.a;
                i2 = jzqVar.l;
                if (i2 != 0) {
                    qgg.h0(obj);
                    pjc data = ((wb7) this.b.getValue()).getData();
                    jzqVar.l = 1;
                    obj = zsd.i0(data, jzqVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                hmmVar = (hmm) obj;
                if (hmmVar != null || (str = (String) hmmVar.a(c)) == null) {
                    return null;
                }
                String str2 = (String) hmmVar.a(d);
                if (str2 == null || str2.length() == 0) {
                    list = c5b.a;
                } else {
                    Type type = new SmartDownloadingStorageImpl$parseTimeIntervals$type$1().getType();
                    try {
                        r7o r7oVar = z7o.b;
                        t7oVar = (List) this.a.e(str2, type);
                    } catch (Throwable th) {
                        r7o r7oVar2 = z7o.b;
                        t7oVar = new t7o(th);
                    }
                    Object obj2 = c5b.a;
                    if (t7oVar instanceof t7o) {
                        t7oVar = obj2;
                    }
                    list = (List) t7oVar;
                }
                List list2 = list;
                Set set = (Set) hmmVar.a(h);
                if (set == null) {
                    set = q5b.a;
                }
                Set set2 = set;
                Set set3 = (Set) hmmVar.a(i);
                if (set3 == null) {
                    set3 = q5b.a;
                }
                Set set4 = set3;
                Long l = (Long) hmmVar.a(g);
                long longValue = l != null ? l.longValue() : 0L;
                Long l2 = (Long) hmmVar.a(f);
                return new gzq(str, list2, set2, set4, longValue, l2 != null ? l2.longValue() : 0L);
            }
        }
        jzqVar = new jzq(this, cg6Var);
        Object obj3 = jzqVar.j;
        nm6 nm6Var2 = nm6.a;
        i2 = jzqVar.l;
        if (i2 != 0) {
        }
        hmmVar = (hmm) obj3;
        if (hmmVar != null) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (defpackage.lmm.a(r7, r2, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(boolean z, cg6 cg6Var) {
        kzq kzqVar;
        Object obj;
        int i2;
        if (cg6Var instanceof kzq) {
            kzqVar = (kzq) cg6Var;
            int i3 = kzqVar.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kzqVar.m = i3 - Integer.MIN_VALUE;
                obj = kzqVar.k;
                Object obj2 = nm6.a;
                i2 = kzqVar.m;
                if (i2 != 0) {
                    qgg.h0(obj);
                    if (!z) {
                        kzqVar.j = z;
                        kzqVar.m = 1;
                        obj = a(kzqVar);
                    }
                    wb7 wb7Var = (wb7) this.b.getValue();
                    lzq lzqVar = new lzq(2, null);
                    kzqVar.j = z;
                    kzqVar.m = 2;
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = kzqVar.j;
                    qgg.h0(obj);
                }
                if (obj != null) {
                    return Unit.a;
                }
                wb7 wb7Var2 = (wb7) this.b.getValue();
                lzq lzqVar2 = new lzq(2, null);
                kzqVar.j = z;
                kzqVar.m = 2;
            }
        }
        kzqVar = new kzq(this, cg6Var);
        obj = kzqVar.k;
        Object obj22 = nm6.a;
        i2 = kzqVar.m;
        if (i2 != 0) {
        }
        if (obj != null) {
        }
        wb7 wb7Var22 = (wb7) this.b.getValue();
        lzq lzqVar22 = new lzq(2, null);
        kzqVar.j = z;
        kzqVar.m = 2;
    }
}
