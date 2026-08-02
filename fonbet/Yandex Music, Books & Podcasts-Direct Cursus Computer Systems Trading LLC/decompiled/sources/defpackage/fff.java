package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class fff {
    public static final String c = "sync  NOT IN ('2','4') AND liked=1 AND playlist_for_kids=1 AND name_surrogate LIKE ?";
    public static final String d = ouj.n("sync  NOT IN ('2','4') AND liked=1 AND playlist_for_kids=1 AND name_surrogate LIKE ?", " AND tracks_cached>0 AND (uid<>? OR original_id<>?)");
    public final boolean a;
    public final jyr b = l18.b.b(hag.I(i5h.class), false);

    public fff(boolean z) {
        this.a = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009e, code lost:
    
        if (r10 != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a0, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004d, code lost:
    
        if (r10 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(String str, String str2, Continuation continuation) {
        eff effVar;
        int i;
        boolean z;
        String[] strArr;
        if (continuation instanceof eff) {
            effVar = (eff) continuation;
            int i2 = effVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                effVar.m = i2 - Integer.MIN_VALUE;
                Object obj = effVar.k;
                nm6 nm6Var = nm6.a;
                i = effVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    i5h i5hVar = (i5h) this.b.getValue();
                    effVar.j = str2;
                    effVar.m = 1;
                    obj = i5hVar.b(str, effVar);
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
                    str2 = effVar.j;
                    qgg.h0(obj);
                }
                swl J = ((MainDatabase) obj).J();
                ysr ysrVar = new ysr("playlist_mview");
                z = this.a;
                String str3 = !z ? d : c;
                if (z) {
                    String S = q7g.S(str2);
                    S.getClass();
                    strArr = new String[]{S};
                } else {
                    String S2 = q7g.S(str2);
                    S2.getClass();
                    strArr = new String[]{S2, "414787002", "1076"};
                }
                ysrVar.d = str3;
                ysrVar.e = strArr;
                ysrVar.f = "original_id=3 DESC,position";
                atn a = ysrVar.a();
                effVar.j = null;
                effVar.m = 2;
                obj = J.a(a, effVar);
            }
        }
        effVar = new eff(this, (cg6) continuation);
        Object obj2 = effVar.k;
        nm6 nm6Var2 = nm6.a;
        i = effVar.m;
        if (i != 0) {
        }
        swl J2 = ((MainDatabase) obj2).J();
        ysr ysrVar2 = new ysr("playlist_mview");
        z = this.a;
        if (!z) {
        }
        if (z) {
        }
        ysrVar2.d = str3;
        ysrVar2.e = strArr;
        ysrVar2.f = "original_id=3 DESC,position";
        atn a2 = ysrVar2.a();
        effVar.j = null;
        effVar.m = 2;
        obj2 = J2.a(a2, effVar);
    }
}
