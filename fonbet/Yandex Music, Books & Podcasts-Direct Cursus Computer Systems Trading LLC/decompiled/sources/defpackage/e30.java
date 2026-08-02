package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class e30 {
    public static final String c = ouj.n("(name_surrogate LIKE ? OR artist_name_surrogate LIKE ?) AND liked=1 AND (available=1 OR for_premium=1 OR for_options!='')", " AND tracks_cached>0");
    public final boolean a;
    public final jyr b = l18.b.b(hag.I(i5h.class), false);

    public e30(boolean z) {
        this.a = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
    
        if (r8 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(String str, String str2, Continuation continuation) {
        d30 d30Var;
        int i;
        if (continuation instanceof d30) {
            d30Var = (d30) continuation;
            int i2 = d30Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d30Var.m = i2 - Integer.MIN_VALUE;
                Object obj = d30Var.k;
                nm6 nm6Var = nm6.a;
                i = d30Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    i5h i5hVar = (i5h) this.b.getValue();
                    d30Var.j = str2;
                    d30Var.m = 1;
                    obj = i5hVar.b(str, d30Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        List<zv> list = (List) obj;
                        ArrayList arrayList = new ArrayList(v75.o(list, 10));
                        for (zv zvVar : list) {
                            arrayList.add(new Pair(zvVar.b, h4a.X(zvVar)));
                        }
                        return arrayList;
                    }
                    str2 = d30Var.j;
                    qgg.h0(obj);
                }
                cw w = ((MainDatabase) obj).w();
                ysr ysrVar = new ysr("album_mview");
                String str3 = !this.a ? c : "(name_surrogate LIKE ? OR artist_name_surrogate LIKE ?) AND liked=1 AND (available=1 OR for_premium=1 OR for_options!='')";
                String S = q7g.S(str2);
                S.getClass();
                String S2 = q7g.S(str2);
                S2.getClass();
                ysrVar.d = str3;
                ysrVar.e = new String[]{S, S2};
                ysrVar.f = "timestamp DESC";
                atn a = ysrVar.a();
                d30Var.j = null;
                d30Var.m = 2;
                obj = w.b(a, d30Var);
            }
        }
        d30Var = new d30(this, (cg6) continuation);
        Object obj2 = d30Var.k;
        nm6 nm6Var2 = nm6.a;
        i = d30Var.m;
        if (i != 0) {
        }
        cw w2 = ((MainDatabase) obj2).w();
        ysr ysrVar2 = new ysr("album_mview");
        if (!this.a) {
        }
        String S3 = q7g.S(str2);
        S3.getClass();
        String S22 = q7g.S(str2);
        S22.getClass();
        ysrVar2.d = str3;
        ysrVar2.e = new String[]{S3, S22};
        ysrVar2.f = "timestamp DESC";
        atn a2 = ysrVar2.a();
        d30Var.j = null;
        d30Var.m = 2;
        obj2 = w2.b(a2, d30Var);
    }
}
