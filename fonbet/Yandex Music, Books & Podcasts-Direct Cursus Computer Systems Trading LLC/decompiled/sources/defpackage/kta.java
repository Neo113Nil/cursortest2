package defpackage;

import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes5.dex */
public final class kta {
    public final String a;
    public final jyr b;
    public final jyr c;
    public final jyr d;
    public final jyr e;

    public kta(String str, jyr jyrVar, jyr jyrVar2, jyr jyrVar3, jyr jyrVar4) {
        this.a = str;
        this.b = jyrVar;
        this.c = jyrVar2;
        this.d = jyrVar4;
        this.e = jyrVar3;
    }

    public static xta b(dh5 dh5Var) {
        String str;
        String str2 = dh5Var.b;
        ch5 ch5Var = dh5Var.d;
        String str3 = ch5Var.a;
        String str4 = ch5Var.b;
        String pathForSize = new jcv(ch5Var.c, WebPath$Storage.AVATARS_NO_CROP).getPathForSize(wct.s());
        bh5 bh5Var = ch5Var.d;
        vta vtaVar = null;
        wta c = bh5Var != null ? c(bh5Var) : null;
        bh5 bh5Var2 = ch5Var.e;
        wta c2 = bh5Var2 != null ? c(bh5Var2) : null;
        zg5 zg5Var = ch5Var.f;
        uta utaVar = zg5Var != null ? new uta(zg5Var.b, zg5Var.a) : null;
        ah5 ah5Var = ch5Var.g;
        if (ah5Var != null && (str = (String) avf.Q(ah5Var.a)) != null) {
            vtaVar = new vta(str);
        }
        return new xta(str2, str3, str4, pathForSize, c, c2, utaVar, vtaVar);
    }

    public static wta c(bh5 bh5Var) {
        String str = bh5Var.a;
        Integer b0 = str != null ? y2x.b0(str) : null;
        String str2 = bh5Var.b;
        Integer b02 = str2 != null ? y2x.b0(str2) : null;
        String str3 = bh5Var.c;
        Integer b03 = str3 != null ? y2x.b0(str3) : null;
        String str4 = bh5Var.d;
        return new wta(b0, b02, b03, str4 != null ? new jcv(str4, WebPath$Storage.AVATARS_NO_CROP).getPathForSize(wct.s()) : null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0063, code lost:
    
        if (r9 == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00d1, code lost:
    
        if (r9 == r1) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:67:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        jta jtaVar;
        int i;
        if (cg6Var instanceof jta) {
            jtaVar = (jta) cg6Var;
            int i2 = jtaVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jtaVar.l = i2 - Integer.MIN_VALUE;
                Object obj = jtaVar.j;
                nm6 nm6Var = nm6.a;
                i = jtaVar.l;
                jyr jyrVar = this.e;
                String str = this.a;
                if (i != 0) {
                    qgg.h0(obj);
                    jyr jyrVar2 = k3j.e;
                    if (ixf.x()) {
                        dh5 dh5Var = (dh5) ((gta) jyrVar.getValue()).a.get(str);
                        if (dh5Var != null) {
                            return b(dh5Var);
                        }
                        oi5 oi5Var = (oi5) this.b.getValue();
                        jtaVar.l = 2;
                        obj = oi5.e(oi5Var, str, null, jtaVar, 6);
                    } else {
                        gj5 gj5Var = (gj5) this.d.getValue();
                        gj5Var.getClass();
                        gj5Var.a.add(str);
                        pi5 pi5Var = (pi5) this.c.getValue();
                        jtaVar.l = 1;
                        obj = pi5Var.c(str, jtaVar);
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    xyo xyoVar = (xyo) obj;
                    if (xyoVar instanceof vyo) {
                        vyo vyoVar = (vyo) xyoVar;
                        return new zta(vyoVar.b, vyoVar.a);
                    }
                    if (!(xyoVar instanceof wyo)) {
                        b6e.s();
                        return null;
                    }
                    xh5 xh5Var = (xh5) ((wyo) xyoVar).a;
                    if (xh5Var instanceof dh5) {
                        return b((dh5) xh5Var);
                    }
                    if (!(xh5Var instanceof vh5) && !(xh5Var instanceof ph5) && !(xh5Var instanceof lh5) && !(xh5Var instanceof mh5) && !(xh5Var instanceof kh5) && xh5Var != null) {
                        b6e.s();
                        return null;
                    }
                } else {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    xyo xyoVar2 = (xyo) obj;
                    if (xyoVar2 instanceof vyo) {
                        vyo vyoVar2 = (vyo) xyoVar2;
                        return new zta(vyoVar2.b, vyoVar2.a);
                    }
                    if (!(xyoVar2 instanceof wyo)) {
                        b6e.s();
                        return null;
                    }
                    xh5 xh5Var2 = (xh5) ((wyo) xyoVar2).a;
                    if (xh5Var2 instanceof dh5) {
                        dh5 dh5Var2 = (dh5) xh5Var2;
                        xta b = b(dh5Var2);
                        gta gtaVar = (gta) jyrVar.getValue();
                        gtaVar.getClass();
                        gtaVar.a.put(str, dh5Var2);
                        return b;
                    }
                    if (!(xh5Var2 instanceof vh5) && !(xh5Var2 instanceof ph5) && !(xh5Var2 instanceof lh5) && !(xh5Var2 instanceof mh5) && !(xh5Var2 instanceof kh5) && xh5Var2 != null) {
                        b6e.s();
                        return null;
                    }
                }
                return yta.a;
            }
        }
        jtaVar = new jta(this, cg6Var);
        Object obj2 = jtaVar.j;
        nm6 nm6Var2 = nm6.a;
        i = jtaVar.l;
        jyr jyrVar3 = this.e;
        String str2 = this.a;
        if (i != 0) {
        }
        return yta.a;
    }
}
