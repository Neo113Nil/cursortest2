package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class ihf {
    public final /* synthetic */ int a;
    public final boolean b;
    public final jyr c;

    public ihf(int i, boolean z) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = z;
                this.c = l18.b.b(hag.I(p3u.class), false);
                break;
            default:
                this.b = z;
                this.c = l18.b.b(hag.I(i5h.class), false);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0120, code lost:
    
        if (r13 != r5) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d2, code lost:
    
        if (r13 == r5) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(String str, String str2, Continuation continuation) {
        hhf hhfVar;
        int i;
        bau bauVar;
        int i2;
        int i3 = this.a;
        jyr jyrVar = this.c;
        boolean z = this.b;
        switch (i3) {
            case 0:
                if (continuation instanceof hhf) {
                    hhfVar = (hhf) continuation;
                    int i4 = hhfVar.m;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        hhfVar.m = i4 - Integer.MIN_VALUE;
                        Object obj = hhfVar.k;
                        nm6 nm6Var = nm6.a;
                        i = hhfVar.m;
                        if (i != 0) {
                            qgg.h0(obj);
                            i5h i5hVar = (i5h) jyrVar.getValue();
                            hhfVar.j = str2;
                            hhfVar.m = 1;
                            obj = i5hVar.b(str, hhfVar);
                            break;
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                qgg.h0(obj);
                                List<rxs> list = (List) obj;
                                ArrayList arrayList = new ArrayList(v75.o(list, 10));
                                for (rxs rxsVar : list) {
                                    arrayList.add(new Pair(rxsVar.i, ngg.M(rxsVar)));
                                }
                                return arrayList;
                            }
                            str2 = hhfVar.j;
                            qgg.h0(obj);
                        }
                        uxs Q = ((MainDatabase) obj).Q();
                        ysr ysrVar = new ysr("track_mview");
                        StringBuilder sb = new StringBuilder("liked = 1 AND (name_surrogate LIKE ? OR artist_name_surrogate LIKE ?)AND track_for_kids = 1 ");
                        if (z) {
                            sb.append(" AND is_permanent = 1 ");
                        }
                        jyr jyrVar2 = txd.e;
                        if (n7w.Q()) {
                            sb.append(" AND (  (playlist_original_ids != '-15' )  OR (playlist_original_ids IS NULL) OR (is_permanent = 1) ) ");
                        }
                        String sb2 = sb.toString();
                        String S = q7g.S(str2);
                        S.getClass();
                        ysrVar.d = sb2;
                        ysrVar.e = new String[]{S, S};
                        ysrVar.f = "timestamp DESC, position ASC";
                        atn a = ysrVar.a();
                        hhfVar.j = null;
                        hhfVar.m = 2;
                        obj = Q.b(a, hhfVar);
                        break;
                    }
                }
                hhfVar = new hhf(this, (cg6) continuation);
                Object obj2 = hhfVar.k;
                nm6 nm6Var2 = nm6.a;
                i = hhfVar.m;
                if (i != 0) {
                }
                uxs Q2 = ((MainDatabase) obj2).Q();
                ysr ysrVar2 = new ysr("track_mview");
                StringBuilder sb3 = new StringBuilder("liked = 1 AND (name_surrogate LIKE ? OR artist_name_surrogate LIKE ?)AND track_for_kids = 1 ");
                if (z) {
                }
                jyr jyrVar22 = txd.e;
                if (n7w.Q()) {
                }
                String sb22 = sb3.toString();
                String S2 = q7g.S(str2);
                S2.getClass();
                ysrVar2.d = sb22;
                ysrVar2.e = new String[]{S2, S2};
                ysrVar2.f = "timestamp DESC, position ASC";
                atn a2 = ysrVar2.a();
                hhfVar.j = null;
                hhfVar.m = 2;
                obj2 = Q2.b(a2, hhfVar);
            default:
                if (continuation instanceof bau) {
                    bauVar = (bau) continuation;
                    int i5 = bauVar.l;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        bauVar.l = i5 - Integer.MIN_VALUE;
                        Object obj3 = bauVar.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = bauVar.l;
                        if (i2 != 0) {
                            qgg.h0(obj3);
                            if (z) {
                                return c5b.a;
                            }
                            p3u p3uVar = (p3u) jyrVar.getValue();
                            bauVar.l = 1;
                            obj3 = ((b4u) p3uVar).i(str, str2, t75.c(j1g.a), bauVar);
                            if (obj3 == nm6Var3) {
                                return nm6Var3;
                            }
                        } else {
                            if (i2 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj3);
                        }
                        Iterable<x1u> iterable = (Iterable) obj3;
                        ArrayList arrayList2 = new ArrayList(v75.o(iterable, 10));
                        for (x1u x1uVar : iterable) {
                            Date date = x1uVar.m;
                            arrayList2.add(new Pair(date != null ? wc7.a(date) : null, x1uVar));
                        }
                        return arrayList2;
                    }
                }
                bauVar = new bau(this, (cg6) continuation);
                Object obj32 = bauVar.j;
                nm6 nm6Var32 = nm6.a;
                i2 = bauVar.l;
                if (i2 != 0) {
                }
                Iterable<x1u> iterable2 = (Iterable) obj32;
                ArrayList arrayList22 = new ArrayList(v75.o(iterable2, 10));
                while (r12.hasNext()) {
                }
                return arrayList22;
        }
    }
}
