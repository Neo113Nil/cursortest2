package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class zn1 {
    public static final String c = ouj.n("liked=1  AND artist_for_kids=1 AND name_surrogate LIKE ? AND (available=1)", " AND tracks_cached>0");
    public final boolean a;
    public final jyr b = l18.b.b(hag.I(i5h.class), false);

    public zn1(boolean z) {
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
        yn1 yn1Var;
        int i;
        if (continuation instanceof yn1) {
            yn1Var = (yn1) continuation;
            int i2 = yn1Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yn1Var.m = i2 - Integer.MIN_VALUE;
                Object obj = yn1Var.k;
                nm6 nm6Var = nm6.a;
                i = yn1Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    i5h i5hVar = (i5h) this.b.getValue();
                    yn1Var.j = str2;
                    yn1Var.m = 1;
                    obj = i5hVar.b(str, yn1Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        List<zd1> list = (List) obj;
                        ArrayList arrayList = new ArrayList(v75.o(list, 10));
                        for (zd1 zd1Var : list) {
                            arrayList.add(new Pair(zd1Var.b, tt0.M(zd1Var)));
                        }
                        return arrayList;
                    }
                    str2 = yn1Var.j;
                    qgg.h0(obj);
                }
                ce1 z = ((MainDatabase) obj).z();
                ysr ysrVar = new ysr("artist_mview");
                String str3 = !this.a ? c : "liked=1  AND artist_for_kids=1 AND name_surrogate LIKE ? AND (available=1)";
                String S = q7g.S(str2);
                S.getClass();
                ysrVar.d = str3;
                ysrVar.e = new String[]{S};
                ysrVar.f = "timestamp DESC";
                atn a = ysrVar.a();
                yn1Var.j = null;
                yn1Var.m = 2;
                obj = z.a(a, yn1Var);
            }
        }
        yn1Var = new yn1(this, (cg6) continuation);
        Object obj2 = yn1Var.k;
        nm6 nm6Var2 = nm6.a;
        i = yn1Var.m;
        if (i != 0) {
        }
        ce1 z2 = ((MainDatabase) obj2).z();
        ysr ysrVar2 = new ysr("artist_mview");
        if (!this.a) {
        }
        String S2 = q7g.S(str2);
        S2.getClass();
        ysrVar2.d = str3;
        ysrVar2.e = new String[]{S2};
        ysrVar2.f = "timestamp DESC";
        atn a2 = ysrVar2.a();
        yn1Var.j = null;
        yn1Var.m = 2;
        obj2 = z2.a(a2, yn1Var);
    }
}
