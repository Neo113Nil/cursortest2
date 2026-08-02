package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class x3t {
    public static final String c;
    public static final String d;
    public final boolean a;
    public final jyr b = l18.b.b(hag.I(i5h.class), false);

    static {
        StringBuilder sb = new StringBuilder(" ( name_surrogate LIKE ? OR artist_name_surrogate LIKE ? ) ");
        jyr jyrVar = txd.e;
        if (n7w.Q()) {
            sb.append(" AND (  (playlist_original_ids != '-15' )  OR (playlist_original_ids IS NULL) OR (is_permanent = 1) ) ");
        }
        String sb2 = sb.toString();
        c = sb2;
        d = hrg.q("(", sb2, ") AND is_permanent=1");
    }

    public x3t(boolean z) {
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
        w3t w3tVar;
        int i;
        if (continuation instanceof w3t) {
            w3tVar = (w3t) continuation;
            int i2 = w3tVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w3tVar.m = i2 - Integer.MIN_VALUE;
                Object obj = w3tVar.k;
                nm6 nm6Var = nm6.a;
                i = w3tVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    i5h i5hVar = (i5h) this.b.getValue();
                    w3tVar.j = str2;
                    w3tVar.m = 1;
                    obj = i5hVar.b(str, w3tVar);
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
                    str2 = w3tVar.j;
                    qgg.h0(obj);
                }
                uxs Q = ((MainDatabase) obj).Q();
                ysr ysrVar = new ysr("track_mview");
                String str3 = !this.a ? d : c;
                String S = q7g.S(str2);
                S.getClass();
                String S2 = q7g.S(str2);
                S2.getClass();
                ysrVar.d = str3;
                ysrVar.e = new String[]{S, S2};
                ysrVar.f = "timestamp DESC";
                atn a = ysrVar.a();
                w3tVar.j = null;
                w3tVar.m = 2;
                obj = Q.b(a, w3tVar);
            }
        }
        w3tVar = new w3t(this, (cg6) continuation);
        Object obj2 = w3tVar.k;
        nm6 nm6Var2 = nm6.a;
        i = w3tVar.m;
        if (i != 0) {
        }
        uxs Q2 = ((MainDatabase) obj2).Q();
        ysr ysrVar2 = new ysr("track_mview");
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
        w3tVar.j = null;
        w3tVar.m = 2;
        obj2 = Q2.b(a2, w3tVar);
    }
}
