package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.google.common.cache.b;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.a;

/* loaded from: classes3.dex */
public final class wnh {
    public final Context a;
    public final cce b;
    public final tf6 c;
    public final a d;
    public final jyr e;
    public final big f;
    public final aig g;

    public wnh(Context context, cce cceVar, ssh sshVar) {
        this.a = context;
        this.b = cceVar;
        mn7 mn7Var = dm6.b;
        this.c = gld.e(mn7Var.plus(a4g.n()).plus(new im6("MediaItemMetaSource")));
        this.d = mn7Var.I0(3);
        this.e = btf.b(new dmg(12, this));
        ap3 d = ap3.d();
        d.c(2L);
        int i = d.b;
        o2g.R(i, "initial capacity was already set to %s", i == -1);
        d.b = 2;
        gig gigVar = iig.b;
        d.e(gigVar);
        TimeUnit timeUnit = TimeUnit.MINUTES;
        d.b(10L, timeUnit);
        d.a();
        this.f = new big(new b(d, null));
        ap3 d2 = ap3.d();
        d2.c(5L);
        int i2 = d2.b;
        o2g.R(i2, "initial capacity was already set to %s", i2 == -1);
        d2.b = 4;
        d2.e(gigVar);
        d2.b(10L, timeUnit);
        pnh pnhVar = new pnh();
        o2g.V(d2.m == null);
        d2.m = pnhVar;
        qzc qzcVar = new qzc(13, this);
        d2.a();
        this.g = new aig(new b(d2, qzcVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(wnh wnhVar, unh unhVar, cg6 cg6Var) {
        vnh vnhVar;
        int i;
        int i2;
        big bigVar = wnhVar.f;
        if (cg6Var instanceof vnh) {
            vnhVar = (vnh) cg6Var;
            int i3 = vnhVar.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                vnhVar.m = i3 - Integer.MIN_VALUE;
                Object obj = vnhVar.k;
                nm6 nm6Var = nm6.a;
                i = vnhVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    if (unhVar instanceof tnh) {
                        tnh tnhVar = (tnh) unhVar;
                        Drawable drawable = tnhVar.a;
                        if (drawable != null) {
                            int i4 = tnhVar.b;
                            Integer valueOf = Integer.valueOf(i4);
                            b bVar = bigVar.a;
                            int d = bVar.d(valueOf);
                            Object h = bVar.f(d).h(d, valueOf);
                            d51 d51Var = bVar.q;
                            if (h == null) {
                                d51Var.getClass();
                            } else {
                                d51Var.getClass();
                            }
                            rnh rnhVar = (rnh) h;
                            if (rnhVar != null) {
                                return rnhVar;
                            }
                            Bitmap N = vq2.N(drawable, 0, 0, 7);
                            vnhVar.j = i4;
                            vnhVar.m = 1;
                            obj = sk3.S(wnhVar.d, new axb(false, N, new nzb(2, (byte) 0)), vnhVar);
                            if (obj == nm6Var) {
                                return nm6Var;
                            }
                            i2 = i4;
                        }
                    } else {
                        if (!(unhVar instanceof snh)) {
                            b6e.s();
                            return null;
                        }
                        byte[] bArr = ((snh) unhVar).a;
                        if (bArr != null) {
                            eoh eohVar = new eoh();
                            eohVar.b(bArr, 6);
                            return new rnh(new hoh(eohVar));
                        }
                    }
                    return rnh.b;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = vnhVar.j;
                qgg.h0(obj);
                eoh eohVar2 = new eoh();
                eohVar2.b((byte[]) obj, 6);
                rnh rnhVar2 = new rnh(new hoh(eohVar2));
                bigVar.a.put(Integer.valueOf(i2), rnhVar2);
                return rnhVar2;
            }
        }
        vnhVar = new vnh(wnhVar, cg6Var);
        Object obj2 = vnhVar.k;
        nm6 nm6Var2 = nm6.a;
        i = vnhVar.m;
        if (i != 0) {
        }
        eoh eohVar22 = new eoh();
        eohVar22.b((byte[]) obj2, 6);
        rnh rnhVar22 = new rnh(new hoh(eohVar22));
        bigVar.a.put(Integer.valueOf(i2), rnhVar22);
        return rnhVar22;
    }
}
