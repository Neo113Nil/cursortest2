package defpackage;

import defpackage.hmm;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class l91 implements f91 {
    public static final hmm.a d = new hmm.a("artist_pick_hint_popup");
    public static final hmm.a e = new hmm.a("pre_save_first_subscribe");
    public final tf6 a = gld.e(dm6.b);
    public final jyr b;
    public final jyr c;

    static {
        new AtomicBoolean(false);
    }

    public l91() {
        bdt I = hag.I(cc7.class);
        l18 l18Var = l18.b;
        this.b = l18Var.b(I, true);
        this.c = l18Var.b(hag.I(frt.class), true);
    }

    public final wb7 a() {
        return ((dc7) ((cc7) this.b.getValue())).c(((frt) this.c.getValue()).c().a, "artist_flags");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        g91 g91Var;
        int i;
        hmm hmmVar;
        if (cg6Var instanceof g91) {
            g91Var = (g91) cg6Var;
            int i2 = g91Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g91Var.l = i2 - Integer.MIN_VALUE;
                Object obj = g91Var.j;
                nm6 nm6Var = nm6.a;
                i = g91Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    pjc data = a().getData();
                    g91Var.l = 1;
                    obj = zsd.i0(data, g91Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                hmmVar = (hmm) obj;
                if (hmmVar != null) {
                    return Boolean.FALSE;
                }
                Boolean bool = (Boolean) hmmVar.a(d);
                return Boolean.valueOf(bool != null ? bool.booleanValue() : true);
            }
        }
        g91Var = new g91(this, cg6Var);
        Object obj2 = g91Var.j;
        nm6 nm6Var2 = nm6.a;
        i = g91Var.l;
        if (i != 0) {
        }
        hmmVar = (hmm) obj2;
        if (hmmVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(cg6 cg6Var) {
        h91 h91Var;
        int i;
        hmm hmmVar;
        if (cg6Var instanceof h91) {
            h91Var = (h91) cg6Var;
            int i2 = h91Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h91Var.l = i2 - Integer.MIN_VALUE;
                Object obj = h91Var.j;
                nm6 nm6Var = nm6.a;
                i = h91Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    pjc data = a().getData();
                    h91Var.l = 1;
                    obj = zsd.i0(data, h91Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                hmmVar = (hmm) obj;
                if (hmmVar != null) {
                    return Boolean.TRUE;
                }
                Boolean bool = (Boolean) hmmVar.a(e);
                return Boolean.valueOf(bool != null ? bool.booleanValue() : true);
            }
        }
        h91Var = new h91(this, cg6Var);
        Object obj2 = h91Var.j;
        nm6 nm6Var2 = nm6.a;
        i = h91Var.l;
        if (i != 0) {
        }
        hmmVar = (hmm) obj2;
        if (hmmVar != null) {
        }
    }
}
