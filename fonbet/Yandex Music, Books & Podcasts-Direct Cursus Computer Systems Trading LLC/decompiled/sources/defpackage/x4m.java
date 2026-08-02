package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class x4m {
    public static final String d;
    public static final String e;
    public final boolean a;
    public final String b;
    public final jyr c;

    static {
        StringBuilder sb = new StringBuilder("name_surrogate LIKE ? AND (liked=1 OR uid=?) AND original_id NOT IN (");
        jyr jyrVar = txd.e;
        if (n7w.Q()) {
            sb.append("'-15', ");
        }
        sb.append("'-14')");
        String sb2 = sb.toString();
        d = sb2;
        e = sb2.concat(" AND tracks_cached>0").concat(" AND (uid<>? OR original_id<>?)");
    }

    public x4m(frt frtVar, boolean z) {
        frtVar.getClass();
        this.a = z;
        this.b = frtVar.c().a;
        this.c = l18.b.b(hag.I(i5h.class), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a5, code lost:
    
        if (r11 != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a7, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004d, code lost:
    
        if (r11 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(String str, String str2, Continuation continuation) {
        w4m w4mVar;
        int i;
        boolean z;
        String[] strArr;
        if (continuation instanceof w4m) {
            w4mVar = (w4m) continuation;
            int i2 = w4mVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w4mVar.m = i2 - Integer.MIN_VALUE;
                Object obj = w4mVar.k;
                nm6 nm6Var = nm6.a;
                i = w4mVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    i5h i5hVar = (i5h) this.c.getValue();
                    w4mVar.j = str2;
                    w4mVar.m = 1;
                    obj = i5hVar.b(str, w4mVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        List<qwl> list = (List) obj;
                        ArrayList arrayList = new ArrayList(v75.o(list, 10));
                        for (qwl qwlVar : list) {
                            arrayList.add(new Pair(qwlVar.q, ezf.W(qwlVar)));
                        }
                        return arrayList;
                    }
                    str2 = w4mVar.j;
                    qgg.h0(obj);
                }
                swl J = ((MainDatabase) obj).J();
                ysr ysrVar = new ysr("playlist_mview");
                z = this.a;
                String str3 = !z ? e : d;
                String str4 = this.b;
                if (z) {
                    String S = q7g.S(str2);
                    S.getClass();
                    strArr = new String[]{S, str4};
                } else {
                    String S2 = q7g.S(str2);
                    S2.getClass();
                    strArr = new String[]{S2, str4, "414787002", "1076"};
                }
                ysrVar.d = str3;
                ysrVar.e = strArr;
                ysrVar.f = "name_surrogate DESC";
                atn a = ysrVar.a();
                w4mVar.j = null;
                w4mVar.m = 2;
                obj = J.a(a, w4mVar);
            }
        }
        w4mVar = new w4m(this, (cg6) continuation);
        Object obj2 = w4mVar.k;
        nm6 nm6Var2 = nm6.a;
        i = w4mVar.m;
        if (i != 0) {
        }
        swl J2 = ((MainDatabase) obj2).J();
        ysr ysrVar2 = new ysr("playlist_mview");
        z = this.a;
        if (!z) {
        }
        String str42 = this.b;
        if (z) {
        }
        ysrVar2.d = str3;
        ysrVar2.e = strArr;
        ysrVar2.f = "name_surrogate DESC";
        atn a2 = ysrVar2.a();
        w4mVar.j = null;
        w4mVar.m = 2;
        obj2 = J2.a(a2, w4mVar);
    }
}
