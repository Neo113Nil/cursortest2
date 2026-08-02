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
public final class g60 {
    public static final String b;
    public final jyr a = l18.b.b(hag.I(i5h.class), false);

    static {
        CollectionsKt.X(gys.MyMusic.a, StringUtils.COMMA, null, null, new u10(4), 30);
        b = CollectionsKt.X(gys.MyMusicWithKids.a, StringUtils.COMMA, null, null, new u10(5), 30);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00af, code lost:
    
        if (r10 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b1, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004d, code lost:
    
        if (r10 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(String str, String str2, Continuation continuation) {
        f60 f60Var;
        int i;
        if (continuation instanceof f60) {
            f60Var = (f60) continuation;
            int i2 = f60Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f60Var.m = i2 - Integer.MIN_VALUE;
                Object obj = f60Var.k;
                nm6 nm6Var = nm6.a;
                i = f60Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    i5h i5hVar = (i5h) this.a.getValue();
                    f60Var.j = str2;
                    f60Var.m = 1;
                    obj = i5hVar.b(str, f60Var);
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
                    str2 = f60Var.j;
                    qgg.h0(obj);
                }
                uxs Q = ((MainDatabase) obj).Q();
                ysr ysrVar = new ysr("track_mview");
                StringBuilder sb = new StringBuilder();
                sb.append("track_type NOT IN (" + b + ")");
                sb.append("AND (name_surrogate LIKE ? OR artist_name_surrogate LIKE ?) AND is_permanent = 1 ");
                jyr jyrVar = txd.e;
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
                f60Var.j = null;
                f60Var.m = 2;
                obj = Q.b(a, f60Var);
            }
        }
        f60Var = new f60(this, (cg6) continuation);
        Object obj2 = f60Var.k;
        nm6 nm6Var2 = nm6.a;
        i = f60Var.m;
        if (i != 0) {
        }
        uxs Q2 = ((MainDatabase) obj2).Q();
        ysr ysrVar2 = new ysr("track_mview");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("track_type NOT IN (" + b + ")");
        sb3.append("AND (name_surrogate LIKE ? OR artist_name_surrogate LIKE ?) AND is_permanent = 1 ");
        jyr jyrVar2 = txd.e;
        if (n7w.Q()) {
        }
        String sb22 = sb3.toString();
        String S2 = q7g.S(str2);
        S2.getClass();
        ysrVar2.d = sb22;
        ysrVar2.e = new String[]{S2, S2};
        ysrVar2.f = "timestamp DESC, position ASC";
        atn a2 = ysrVar2.a();
        f60Var.j = null;
        f60Var.m = 2;
        obj2 = Q2.b(a2, f60Var);
    }
}
