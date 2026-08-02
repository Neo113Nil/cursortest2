package defpackage;

import com.yandex.music.shared.search.api.feedback.SearchFeedbackRequest;
import java.util.Date;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.e;

/* loaded from: classes3.dex */
public final class f1p {
    public final h1p a;
    public final tf6 b;
    public String c;
    public pxm d;
    public Integer e;
    public e1p f;
    public t0p g;
    public Boolean h;
    public c0p i;

    public f1p(h1p h1pVar) {
        this.a = h1pVar;
        wqr n = a4g.n();
        dq7 dq7Var = ca8.a;
        this.b = gld.e(e.c(n, mn7.d));
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x01bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x01c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        pxm pxmVar;
        t0p t0pVar;
        Boolean bool;
        int i;
        tc7 sc7Var;
        tc7 sc7Var2;
        String str;
        String str2;
        String str3;
        SearchFeedbackRequest searchFeedbackRequest;
        Date date = new Date(System.currentTimeMillis());
        String str4 = this.c;
        Continuation continuation = null;
        if (str4 != null && (pxmVar = this.d) != null && !pxmVar.equals(x0p.c) && (t0pVar = this.g) != null && (bool = this.h) != null) {
            boolean booleanValue = bool.booleanValue();
            Integer num = this.e;
            if (num != null) {
                i = num.intValue();
            } else if (booleanValue) {
                i = 0;
            }
            e1p e1pVar = this.f;
            if (e1pVar == null) {
                if (booleanValue) {
                    long time = date.getTime();
                    l18 l18Var = l18.b;
                    bdt I = hag.I(frt.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    e1pVar = new e1p(0, "android-" + time + "-" + ((frt) qdcVar.C(I)).c().a);
                }
            }
            String str5 = pxmVar.a;
            String str6 = pxmVar.b;
            jyr b = btf.b(new x6s(6));
            jyr b2 = btf.b(new x6s(7));
            jyr b3 = btf.b(new x6s(8));
            lm4 a = ern.a(qc7.class);
            if (a.equals(ern.a(qc7.class))) {
                sc7Var = new qc7(date, ((bgs) b.getValue()).a(date));
            } else if (a.equals(ern.a(rc7.class))) {
                sc7Var = new rc7(date, ((bgs) b2.getValue()).a(date));
            } else {
                if (!a.equals(ern.a(sc7.class))) {
                    xq0.x("Add this type to method");
                    return;
                }
                sc7Var = new sc7(date, ((bgs) b3.getValue()).a(date));
            }
            qc7 qc7Var = (qc7) sc7Var;
            jyr b4 = btf.b(new x6s(6));
            jyr b5 = btf.b(new x6s(7));
            jyr b6 = btf.b(new x6s(8));
            lm4 a2 = ern.a(qc7.class);
            if (a2.equals(ern.a(qc7.class))) {
                sc7Var2 = new qc7(date, ((bgs) b4.getValue()).a(date));
            } else if (a2.equals(ern.a(rc7.class))) {
                sc7Var2 = new rc7(date, ((bgs) b5.getValue()).a(date));
            } else {
                if (!a2.equals(ern.a(sc7.class))) {
                    xq0.x("Add this type to method");
                    return;
                }
                sc7Var2 = new sc7(date, ((bgs) b6.getValue()).a(date));
            }
            qc7 qc7Var2 = (qc7) sc7Var2;
            String str7 = e1pVar.b;
            int ordinal = t0pVar.ordinal();
            if (ordinal == 0) {
                str = "play";
            } else if (ordinal == 1) {
                str = "navigate";
            } else {
                if (ordinal != 2) {
                    b6e.s();
                    return;
                }
                str = "like";
            }
            String str8 = str;
            int i2 = e1pVar.a;
            if (booleanValue) {
                str3 = "user-library";
            } else {
                if (this.i != c0p.e) {
                    str2 = null;
                    searchFeedbackRequest = new SearchFeedbackRequest(str5, qc7Var, qc7Var2, i, null, null, null, str7, str6, str4, null, str8, i2, str2);
                    this.d = null;
                    this.g = null;
                    this.h = null;
                    this.e = null;
                    this.f = null;
                    if (searchFeedbackRequest == null) {
                        return;
                    }
                    x97.y(this.b, null, null, new s1n(this, searchFeedbackRequest, continuation, 26), 3);
                    return;
                }
                str3 = "concerts";
            }
            str2 = str3;
            searchFeedbackRequest = new SearchFeedbackRequest(str5, qc7Var, qc7Var2, i, null, null, null, str7, str6, str4, null, str8, i2, str2);
            this.d = null;
            this.g = null;
            this.h = null;
            this.e = null;
            this.f = null;
            if (searchFeedbackRequest == null) {
            }
        }
        searchFeedbackRequest = null;
        if (searchFeedbackRequest == null) {
        }
    }
}
