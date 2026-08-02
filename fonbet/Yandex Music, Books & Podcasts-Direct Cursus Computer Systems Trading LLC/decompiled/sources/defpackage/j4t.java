package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class j4t {
    public static final String d;
    public static final String e;
    public static final String f;
    public final boolean a;
    public final String b;
    public final jyr c;

    static {
        String q = hrg.q("track_type NOT IN (", CollectionsKt.X(gys.MyMusic.a, StringUtils.COMMA, null, null, new h4t(0), 30), ")");
        StringBuilder sb = new StringBuilder();
        sb.append("name_surrogate LIKE ? AND ".concat(q));
        jyr jyrVar = txd.e;
        if (n7w.Q()) {
            sb.append(" AND (  (playlist_original_ids != '-15' )  OR (playlist_original_ids IS NULL) OR (is_permanent = 1) ) ");
        }
        String sb2 = sb.toString();
        d = sb2;
        String concat = sb2.concat(" AND is_permanent=1");
        e = concat;
        f = concat.concat(" AND artist_id LIKE '%' || ? || '%'");
    }

    public j4t(boolean z, String str) {
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
        i4t i4tVar;
        int i;
        String str3;
        String[] strArr;
        if (continuation instanceof i4t) {
            i4tVar = (i4t) continuation;
            int i2 = i4tVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i4tVar.m = i2 - Integer.MIN_VALUE;
                Object obj = i4tVar.k;
                nm6 nm6Var = nm6.a;
                i = i4tVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    i5h i5hVar = (i5h) this.c.getValue();
                    i4tVar.j = str2;
                    i4tVar.m = 1;
                    obj = i5hVar.b(str, i4tVar);
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
                    str2 = i4tVar.j;
                    qgg.h0(obj);
                }
                uxs Q = ((MainDatabase) obj).Q();
                ysr ysrVar = new ysr("track_mview");
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
                i4tVar.j = null;
                i4tVar.m = 2;
                obj = Q.b(a, i4tVar);
            }
        }
        i4tVar = new i4t(this, (cg6) continuation);
        Object obj2 = i4tVar.k;
        nm6 nm6Var2 = nm6.a;
        i = i4tVar.m;
        if (i != 0) {
        }
        uxs Q2 = ((MainDatabase) obj2).Q();
        ysr ysrVar2 = new ysr("track_mview");
        str3 = this.b;
        if (str3 == null) {
        }
        if (str3 == null) {
        }
        ysrVar2.d = str4;
        ysrVar2.e = strArr;
        ysrVar2.f = "timestamp DESC";
        atn a2 = ysrVar2.a();
        i4tVar.j = null;
        i4tVar.m = 2;
        obj2 = Q2.b(a2, i4tVar);
    }
}
