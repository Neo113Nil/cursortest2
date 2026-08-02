package defpackage;

import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* loaded from: classes5.dex */
public final class pgd extends vgd {
    public final ngd a;
    public final String b;
    public final Function1 c;
    public final String d;
    public final String e;

    public pgd(ngd ngdVar, String str, Function1 function1, String str2, String str3) {
        ngdVar.getClass();
        str.getClass();
        str2.getClass();
        this.a = ngdVar;
        this.b = str;
        this.c = function1;
        this.d = str2;
        this.e = str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        ogd ogdVar;
        int i;
        mgd mgdVar;
        bdt I;
        qdc qdcVar;
        ygd ygdVar;
        Double d;
        double doubleValue;
        ygd ygdVar2;
        ygd ygdVar3;
        String str = this.d;
        ngd ngdVar = this.a;
        String str2 = this.b;
        if (continuation instanceof ogd) {
            ogdVar = (ogd) continuation;
            int i2 = ogdVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ogdVar.l = i2 - Integer.MIN_VALUE;
                Object obj = ogdVar.j;
                nm6 nm6Var = nm6.a;
                i = ogdVar.l;
                Double d2 = null;
                if (i != 0) {
                    qgg.h0(obj);
                    Function1 function1 = this.c;
                    if (function1 == null) {
                        mgdVar = null;
                        String str3 = (mgdVar != null || (ygdVar3 = mgdVar.a) == null) ? null : ygdVar3.a;
                        Pair pair = (this.e != null || str3 == null) ? new Pair(str2, ngdVar) : new Pair(str3, ngd.TRACK);
                        String str4 = (String) pair.a;
                        kfd kfdVar = ((ngd) pair.b).a;
                        l18 l18Var = l18.b;
                        I = hag.I(byb.class);
                        qdcVar = l18Var.a;
                        qdcVar.getClass();
                        if (((thd) ((byb) qdcVar.C(I)).b(thd.class)).h() ? c.v(str2, "user:onyourwave", false) : Intrinsics.d(str2, "user:onyourwave")) {
                            int ordinal = ngdVar.a.ordinal();
                            if (ordinal == 0) {
                                str = "pult";
                            } else if (ordinal != 1 && ordinal != 2 && ordinal != 3 && ordinal != 4 && ordinal != 5) {
                                b6e.s();
                                return null;
                            }
                        }
                        String str5 = str;
                        if (mgdVar != null || (ygdVar2 = mgdVar.a) == null) {
                            ygdVar = null;
                        } else {
                            String str6 = ygdVar2.a;
                            long j = ygdVar2.b;
                            str6.getClass();
                            ygdVar = new ygd(str6, j, null);
                        }
                        if (mgdVar != null && (d = mgdVar.b) != null) {
                            doubleValue = d.doubleValue();
                            if (doubleValue < 0.0d) {
                                doubleValue = 0.0d;
                            }
                            d2 = new Double(doubleValue);
                        }
                        return new lfd(kfdVar, str4, ygdVar, d2, str5);
                    }
                    ogdVar.l = 1;
                    obj = function1.invoke(ogdVar);
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
                mgdVar = (mgd) obj;
                if (mgdVar != null) {
                }
                if (this.e != null) {
                }
                String str42 = (String) pair.a;
                kfd kfdVar2 = ((ngd) pair.b).a;
                l18 l18Var2 = l18.b;
                I = hag.I(byb.class);
                qdcVar = l18Var2.a;
                qdcVar.getClass();
                if (((thd) ((byb) qdcVar.C(I)).b(thd.class)).h() ? c.v(str2, "user:onyourwave", false) : Intrinsics.d(str2, "user:onyourwave")) {
                }
                String str52 = str;
                if (mgdVar != null) {
                }
                ygdVar = null;
                if (mgdVar != null) {
                    doubleValue = d.doubleValue();
                    if (doubleValue < 0.0d) {
                    }
                    d2 = new Double(doubleValue);
                }
                return new lfd(kfdVar2, str42, ygdVar, d2, str52);
            }
        }
        ogdVar = new ogd(this, (cg6) continuation);
        Object obj2 = ogdVar.j;
        nm6 nm6Var2 = nm6.a;
        i = ogdVar.l;
        Double d22 = null;
        if (i != 0) {
        }
        mgdVar = (mgd) obj2;
        if (mgdVar != null) {
        }
        if (this.e != null) {
        }
        String str422 = (String) pair.a;
        kfd kfdVar22 = ((ngd) pair.b).a;
        l18 l18Var22 = l18.b;
        I = hag.I(byb.class);
        qdcVar = l18Var22.a;
        qdcVar.getClass();
        if (((thd) ((byb) qdcVar.C(I)).b(thd.class)).h() ? c.v(str2, "user:onyourwave", false) : Intrinsics.d(str2, "user:onyourwave")) {
        }
        String str522 = str;
        if (mgdVar != null) {
        }
        ygdVar = null;
        if (mgdVar != null) {
        }
        return new lfd(kfdVar22, str422, ygdVar, d22, str522);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Entity {entityType=");
        sb.append(this.a);
        sb.append(", entityId=");
        sb.append(this.b);
        sb.append(", from=");
        return su4.o(sb, this.d, ", }");
    }
}
