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
public final class icm {
    public static final String c;
    public static final String d;
    public static final String e;
    public final boolean a;
    public final jyr b = l18.b.b(hag.I(i5h.class), false);

    static {
        String X = CollectionsKt.X(dw.MyMusic.a, StringUtils.COMMA, null, null, new fam(5), 30);
        String q = hrg.q("album_type IN (", X, ")");
        c = hrg.q("album_type NOT IN (", X, ")");
        String q2 = hrg.q("name_surrogate LIKE ? AND ", q, " AND liked=1");
        d = q2;
        e = q2.concat(" AND tracks_cached>0");
    }

    public icm(boolean z) {
        this.a = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0085, code lost:
    
        if (r8 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
    
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
        hcm hcmVar;
        int i;
        if (continuation instanceof hcm) {
            hcmVar = (hcm) continuation;
            int i2 = hcmVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hcmVar.m = i2 - Integer.MIN_VALUE;
                Object obj = hcmVar.k;
                nm6 nm6Var = nm6.a;
                i = hcmVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    i5h i5hVar = (i5h) this.b.getValue();
                    hcmVar.j = str2;
                    hcmVar.m = 1;
                    obj = i5hVar.b(str, hcmVar);
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
                    str2 = hcmVar.j;
                    qgg.h0(obj);
                }
                cw w = ((MainDatabase) obj).w();
                ysr ysrVar = new ysr("album_mview");
                String str3 = !this.a ? e : d;
                String S = q7g.S(str2);
                S.getClass();
                ysrVar.d = str3;
                ysrVar.e = new String[]{S};
                ysrVar.f = "timestamp DESC";
                atn a = ysrVar.a();
                hcmVar.j = null;
                hcmVar.m = 2;
                obj = w.b(a, hcmVar);
            }
        }
        hcmVar = new hcm(this, (cg6) continuation);
        Object obj2 = hcmVar.k;
        nm6 nm6Var2 = nm6.a;
        i = hcmVar.m;
        if (i != 0) {
        }
        cw w2 = ((MainDatabase) obj2).w();
        ysr ysrVar2 = new ysr("album_mview");
        if (!this.a) {
        }
        String S2 = q7g.S(str2);
        S2.getClass();
        ysrVar2.d = str3;
        ysrVar2.e = new String[]{S2};
        ysrVar2.f = "timestamp DESC";
        atn a2 = ysrVar2.a();
        hcmVar.j = null;
        hcmVar.m = 2;
        obj2 = w2.b(a2, hcmVar);
    }
}
