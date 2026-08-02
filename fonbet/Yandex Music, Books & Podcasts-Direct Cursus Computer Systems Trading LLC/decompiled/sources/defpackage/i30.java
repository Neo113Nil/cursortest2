package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class i30 {
    public static final String d;
    public static final String e;
    public static final String f;
    public final boolean a;
    public final String b;
    public final jyr c;

    static {
        String str = icm.c;
        String q = hrg.q("name_surrogate LIKE ? AND ", icm.c, " AND liked=1 AND (available=1 OR for_premium=1 OR for_options!='')");
        d = q;
        String n = ouj.n(q, " AND tracks_cached>0");
        e = n;
        f = ouj.n(n, " AND artist_id LIKE '%' || ? || '%'");
    }

    public i30(boolean z, String str) {
        this.a = z;
        this.b = z ? str : null;
        this.c = l18.b.b(hag.I(i5h.class), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
    
        if (r11 != r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a6, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x004d, code lost:
    
        if (r11 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(String str, String str2, Continuation continuation) {
        h30 h30Var;
        int i;
        String str3;
        String[] strArr;
        if (continuation instanceof h30) {
            h30Var = (h30) continuation;
            int i2 = h30Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h30Var.m = i2 - Integer.MIN_VALUE;
                Object obj = h30Var.k;
                nm6 nm6Var = nm6.a;
                i = h30Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    i5h i5hVar = (i5h) this.c.getValue();
                    h30Var.j = str2;
                    h30Var.m = 1;
                    obj = i5hVar.b(str, h30Var);
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
                    str2 = h30Var.j;
                    qgg.h0(obj);
                }
                cw w = ((MainDatabase) obj).w();
                ysr ysrVar = new ysr("album_mview");
                str3 = this.b;
                String str4 = str3 == null ? f : this.a ? e : d;
                if (str3 == null) {
                    String S = q7g.S(str2);
                    S.getClass();
                    strArr = new String[]{S, str3.concat("#|")};
                } else {
                    String S2 = q7g.S(str2);
                    S2.getClass();
                    strArr = new String[]{S2};
                }
                ysrVar.d = str4;
                ysrVar.e = strArr;
                ysrVar.f = "timestamp DESC";
                atn a = ysrVar.a();
                h30Var.j = null;
                h30Var.m = 2;
                obj = w.b(a, h30Var);
            }
        }
        h30Var = new h30(this, (cg6) continuation);
        Object obj2 = h30Var.k;
        nm6 nm6Var2 = nm6.a;
        i = h30Var.m;
        if (i != 0) {
        }
        cw w2 = ((MainDatabase) obj2).w();
        ysr ysrVar2 = new ysr("album_mview");
        str3 = this.b;
        if (str3 == null) {
        }
        if (str3 == null) {
        }
        ysrVar2.d = str4;
        ysrVar2.e = strArr;
        ysrVar2.f = "timestamp DESC";
        atn a2 = ysrVar2.a();
        h30Var.j = null;
        h30Var.m = 2;
        obj2 = w2.b(a2, h30Var);
    }
}
