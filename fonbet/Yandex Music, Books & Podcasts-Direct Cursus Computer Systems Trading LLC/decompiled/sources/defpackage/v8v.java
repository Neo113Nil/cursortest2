package defpackage;

import com.yandex.music.shared.wave.screen.wordsinwave.data.WaveWordsImpressionsParser$WaveWordsBigCardViewReportJson;
import com.yandex.music.shared.wave.screen.wordsinwave.data.WaveWordsImpressionsParser$WaveWordsViewReportJson;
import defpackage.hmm;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class v8v {
    public static final hmm.a h = new hmm.a("view_reports");
    public static final hmm.a i = new hmm.a("big_card_view_reports");
    public final frt a;
    public final cc7 b;
    public final boolean c;
    public final jyr d;
    public final jyr e;
    public final jyr f;
    public final jyr g;

    public v8v(frt frtVar, cc7 cc7Var, boolean z) {
        frtVar.getClass();
        cc7Var.getClass();
        this.a = frtVar;
        this.b = cc7Var;
        this.c = z;
        this.d = btf.b(new h8v(7));
        final int i2 = 0;
        this.e = btf.b(new Function0(this) { // from class: o8v
            public final /* synthetic */ v8v b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        v8v v8vVar = this.b;
                        return new c1f("wave_words_storage", new buu(v8vVar, null, 2), v8vVar.b);
                    case 1:
                        return ((c1f) this.b.e.getValue()).c(v8v.h, WaveWordsImpressionsParser$WaveWordsViewReportJson.class);
                    default:
                        return ((c1f) this.b.e.getValue()).c(v8v.i, WaveWordsImpressionsParser$WaveWordsBigCardViewReportJson.class);
                }
            }
        });
        final int i3 = 1;
        this.f = btf.b(new Function0(this) { // from class: o8v
            public final /* synthetic */ v8v b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        v8v v8vVar = this.b;
                        return new c1f("wave_words_storage", new buu(v8vVar, null, 2), v8vVar.b);
                    case 1:
                        return ((c1f) this.b.e.getValue()).c(v8v.h, WaveWordsImpressionsParser$WaveWordsViewReportJson.class);
                    default:
                        return ((c1f) this.b.e.getValue()).c(v8v.i, WaveWordsImpressionsParser$WaveWordsBigCardViewReportJson.class);
                }
            }
        });
        final int i4 = 2;
        this.g = btf.b(new Function0(this) { // from class: o8v
            public final /* synthetic */ v8v b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        v8v v8vVar = this.b;
                        return new c1f("wave_words_storage", new buu(v8vVar, null, 2), v8vVar.b);
                    case 1:
                        return ((c1f) this.b.e.getValue()).c(v8v.h, WaveWordsImpressionsParser$WaveWordsViewReportJson.class);
                    default:
                        return ((c1f) this.b.e.getValue()).c(v8v.i, WaveWordsImpressionsParser$WaveWordsBigCardViewReportJson.class);
                }
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if (defpackage.ec7.c(r7, r2, r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0049, code lost:
    
        if (r7 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
    
        if (r7.a(r2, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        p8v p8vVar;
        int i2;
        if (cg6Var instanceof p8v) {
            p8vVar = (p8v) cg6Var;
            int i3 = p8vVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                p8vVar.l = i3 - Integer.MIN_VALUE;
                Object obj = p8vVar.j;
                Object obj2 = nm6.a;
                i2 = p8vVar.l;
                if (i2 != 0) {
                    qgg.h0(obj);
                    if (this.c) {
                        c1f c1fVar = (c1f) this.e.getValue();
                        hmm.a[] aVarArr = {h, i};
                        p8vVar.l = 3;
                    } else {
                        p8vVar.l = 1;
                        obj = b(p8vVar);
                    }
                    return obj2;
                }
                if (i2 == 1) {
                    qgg.h0(obj);
                    wb7 wb7Var = (wb7) obj;
                    if (wb7Var != null) {
                        t0v t0vVar = new t0v(15);
                        p8vVar.l = 2;
                    }
                    return Unit.a;
                }
                if (i2 == 2) {
                    qgg.h0(obj);
                    return Unit.a;
                }
                if (i2 == 3) {
                    qgg.h0(obj);
                    return Unit.a;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        p8vVar = new p8v(this, cg6Var);
        Object obj3 = p8vVar.j;
        Object obj22 = nm6.a;
        i2 = p8vVar.l;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        q8v q8vVar;
        int i2;
        xxq xxqVar;
        if (cg6Var instanceof q8v) {
            q8vVar = (q8v) cg6Var;
            int i3 = q8vVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                q8vVar.l = i3 - Integer.MIN_VALUE;
                Object obj = q8vVar.j;
                nm6 nm6Var = nm6.a;
                i2 = q8vVar.l;
                if (i2 != 0) {
                    qgg.h0(obj);
                    pjc g = this.a.g();
                    q8vVar.l = 1;
                    obj = zsd.i0(g, q8vVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                xxqVar = (xxq) obj;
                if (xxqVar != null) {
                    return null;
                }
                return ((dc7) this.b).c(xxqVar.a, "wave_words_storage");
            }
        }
        q8vVar = new q8v(this, cg6Var);
        Object obj2 = q8vVar.j;
        nm6 nm6Var2 = nm6.a;
        i2 = q8vVar.l;
        if (i2 != 0) {
        }
        xxqVar = (xxq) obj2;
        if (xxqVar != null) {
        }
    }

    public final y7v c() {
        return (y7v) this.d.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x005d, code lost:
    
        if (r7 == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0049, code lost:
    
        if (r7 == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008b, code lost:
    
        if (r7 == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable d(cg6 cg6Var) {
        r8v r8vVar;
        int i2;
        String str;
        if (cg6Var instanceof r8v) {
            r8vVar = (r8v) cg6Var;
            int i3 = r8vVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                r8vVar.l = i3 - Integer.MIN_VALUE;
                Object obj = r8vVar.j;
                nm6 nm6Var = nm6.a;
                i2 = r8vVar.l;
                if (i2 != 0) {
                    qgg.h0(obj);
                    if (this.c) {
                        x0f x0fVar = (x0f) this.f.getValue();
                        r8vVar.l = 3;
                        obj = x0fVar.a(r8vVar);
                    } else {
                        r8vVar.l = 1;
                        obj = b(r8vVar);
                    }
                    return nm6Var;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        qgg.h0(obj);
                        hmm hmmVar = (hmm) obj;
                        return (hmmVar == null || (str = (String) hmmVar.a(h)) == null) ? c5b.a : (Serializable) c().a(str);
                    }
                    if (i2 != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    ArrayList arrayList = new ArrayList();
                    for (WaveWordsImpressionsParser$WaveWordsViewReportJson waveWordsImpressionsParser$WaveWordsViewReportJson : (Iterable) obj) {
                        c().getClass();
                        waveWordsImpressionsParser$WaveWordsViewReportJson.getClass();
                        String cardId = waveWordsImpressionsParser$WaveWordsViewReportJson.getCardId();
                        b9v b9vVar = cardId == null ? null : new b9v(cardId);
                        if (b9vVar != null) {
                            arrayList.add(b9vVar);
                        }
                    }
                    return arrayList;
                }
                qgg.h0(obj);
                wb7 wb7Var = (wb7) obj;
                if (wb7Var == null) {
                    return c5b.a;
                }
                pjc data = wb7Var.getData();
                r8vVar.l = 2;
                obj = zsd.i0(data, r8vVar);
            }
        }
        r8vVar = new r8v(this, cg6Var);
        Object obj2 = r8vVar.j;
        nm6 nm6Var2 = nm6.a;
        i2 = r8vVar.l;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x005d, code lost:
    
        if (r7 == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0049, code lost:
    
        if (r7 == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x008b, code lost:
    
        if (r7 == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable e(cg6 cg6Var) {
        s8v s8vVar;
        int i2;
        String str;
        String bigCardId;
        if (cg6Var instanceof s8v) {
            s8vVar = (s8v) cg6Var;
            int i3 = s8vVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                s8vVar.l = i3 - Integer.MIN_VALUE;
                Object obj = s8vVar.j;
                nm6 nm6Var = nm6.a;
                i2 = s8vVar.l;
                if (i2 != 0) {
                    qgg.h0(obj);
                    if (this.c) {
                        x0f x0fVar = (x0f) this.g.getValue();
                        s8vVar.l = 3;
                        obj = x0fVar.a(s8vVar);
                    } else {
                        s8vVar.l = 1;
                        obj = b(s8vVar);
                    }
                    return nm6Var;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        qgg.h0(obj);
                        hmm hmmVar = (hmm) obj;
                        return (hmmVar == null || (str = (String) hmmVar.a(i)) == null) ? c5b.a : (Serializable) c().b(str);
                    }
                    if (i2 != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    ArrayList arrayList = new ArrayList();
                    for (WaveWordsImpressionsParser$WaveWordsBigCardViewReportJson waveWordsImpressionsParser$WaveWordsBigCardViewReportJson : (Iterable) obj) {
                        c().getClass();
                        waveWordsImpressionsParser$WaveWordsBigCardViewReportJson.getClass();
                        String smallCardId = waveWordsImpressionsParser$WaveWordsBigCardViewReportJson.getSmallCardId();
                        c9v c9vVar = (smallCardId == null || (bigCardId = waveWordsImpressionsParser$WaveWordsBigCardViewReportJson.getBigCardId()) == null) ? null : new c9v(smallCardId, bigCardId);
                        if (c9vVar != null) {
                            arrayList.add(c9vVar);
                        }
                    }
                    return arrayList;
                }
                qgg.h0(obj);
                wb7 wb7Var = (wb7) obj;
                if (wb7Var == null) {
                    return c5b.a;
                }
                pjc data = wb7Var.getData();
                s8vVar.l = 2;
                obj = zsd.i0(data, s8vVar);
            }
        }
        s8vVar = new s8v(this, cg6Var);
        Object obj2 = s8vVar.j;
        nm6 nm6Var2 = nm6.a;
        i2 = s8vVar.l;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
    
        if (defpackage.ec7.c(r9, r2, r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004e, code lost:
    
        if (r9 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008d, code lost:
    
        if (r9.b(r2, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(c9v c9vVar, cg6 cg6Var) {
        t8v t8vVar;
        int i2;
        if (cg6Var instanceof t8v) {
            t8vVar = (t8v) cg6Var;
            int i3 = t8vVar.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                t8vVar.m = i3 - Integer.MIN_VALUE;
                Object obj = t8vVar.k;
                Object obj2 = nm6.a;
                i2 = t8vVar.m;
                if (i2 != 0) {
                    qgg.h0(obj);
                    if (this.c) {
                        x0f x0fVar = (x0f) this.g.getValue();
                        c().getClass();
                        c9vVar.getClass();
                        WaveWordsImpressionsParser$WaveWordsBigCardViewReportJson waveWordsImpressionsParser$WaveWordsBigCardViewReportJson = new WaveWordsImpressionsParser$WaveWordsBigCardViewReportJson(c9vVar.a, c9vVar.b);
                        t8vVar.j = null;
                        t8vVar.m = 3;
                    } else {
                        t8vVar.j = c9vVar;
                        t8vVar.m = 1;
                        obj = b(t8vVar);
                    }
                    return obj2;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    if (i2 == 3) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c9vVar = t8vVar.j;
                qgg.h0(obj);
                wb7 wb7Var = (wb7) obj;
                if (wb7Var != null) {
                    wes wesVar = new wes(29, this, c9vVar);
                    t8vVar.j = null;
                    t8vVar.m = 2;
                }
                return Unit.a;
            }
        }
        t8vVar = new t8v(this, cg6Var);
        Object obj3 = t8vVar.k;
        Object obj22 = nm6.a;
        i2 = t8vVar.m;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
    
        if (defpackage.ec7.c(r9, r2, r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004e, code lost:
    
        if (r9 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
    
        if (r9.b(r2, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(b9v b9vVar, cg6 cg6Var) {
        u8v u8vVar;
        int i2;
        if (cg6Var instanceof u8v) {
            u8vVar = (u8v) cg6Var;
            int i3 = u8vVar.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                u8vVar.m = i3 - Integer.MIN_VALUE;
                Object obj = u8vVar.k;
                Object obj2 = nm6.a;
                i2 = u8vVar.m;
                if (i2 != 0) {
                    qgg.h0(obj);
                    if (this.c) {
                        x0f x0fVar = (x0f) this.f.getValue();
                        c().getClass();
                        b9vVar.getClass();
                        WaveWordsImpressionsParser$WaveWordsViewReportJson waveWordsImpressionsParser$WaveWordsViewReportJson = new WaveWordsImpressionsParser$WaveWordsViewReportJson(b9vVar.a);
                        u8vVar.j = null;
                        u8vVar.m = 3;
                    } else {
                        u8vVar.j = b9vVar;
                        u8vVar.m = 1;
                        obj = b(u8vVar);
                    }
                    return obj2;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    if (i2 == 3) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b9vVar = u8vVar.j;
                qgg.h0(obj);
                wb7 wb7Var = (wb7) obj;
                if (wb7Var != null) {
                    wes wesVar = new wes(28, this, b9vVar);
                    u8vVar.j = null;
                    u8vVar.m = 2;
                }
                return Unit.a;
            }
        }
        u8vVar = new u8v(this, cg6Var);
        Object obj3 = u8vVar.k;
        Object obj22 = nm6.a;
        i2 = u8vVar.m;
        if (i2 != 0) {
        }
    }
}
