package defpackage;

import android.graphics.Bitmap;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;

/* loaded from: classes.dex */
public final class yyt extends nwt {
    public final nqd b;
    public String c;
    public boolean d;
    public final fpa e;
    public uif f;
    public final x6k g;
    public d43 h;
    public final x6k i;
    public long j;
    public float k;
    public float l;
    public final xyt m;

    public yyt(nqd nqdVar) {
        this.b = nqdVar;
        nqdVar.i = new xyt(this, 0);
        this.c = "";
        this.d = true;
        this.e = new fpa();
        this.f = wjp.w0;
        this.g = szf.g0(null);
        this.i = szf.g0(new nmq(0L));
        this.j = 9205357640488583168L;
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = new xyt(this, 1);
    }

    @Override // defpackage.nwt
    public final void a(jpa jpaVar) {
        e(jpaVar, 1.0f, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        if (r3 != r8) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010b, code lost:
    
        if (r9.a == r3) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(jpa jpaVar, float f, m85 m85Var) {
        int i;
        boolean z;
        fpa fpaVar;
        yg0 yg0Var;
        char c;
        long j;
        yg0 yg0Var2;
        yg0 yg0Var3;
        int i2;
        int i3;
        int i4;
        m85 m85Var2 = m85Var;
        nqd nqdVar = this.b;
        boolean z2 = nqdVar.d;
        x6k x6kVar = this.g;
        if (z2 && nqdVar.e != 16) {
            m85 m85Var3 = (m85) x6kVar.getValue();
            c5b c5bVar = nzt.a;
            if (!(m85Var3 instanceof d43) ? m85Var3 == null : !((i4 = ((d43) m85Var3).c) != 5 && i4 != 3)) {
                if (!(m85Var2 instanceof d43) ? m85Var2 == null : !((i3 = ((d43) m85Var2).c) != 5 && i3 != 3)) {
                    i = 1;
                    z = this.d;
                    fpaVar = this.e;
                    if (!z && nmq.a(this.j, jpaVar.e())) {
                        yg0Var3 = (yg0) fpaVar.c;
                        if (yg0Var3 == null) {
                            Bitmap.Config config = yg0Var3.a.getConfig();
                            config.getClass();
                            i2 = fx1.q(config);
                        } else {
                            i2 = 0;
                        }
                    }
                    this.h = i != 1 ? new d43(nqdVar.e, 5) : null;
                    float intBitsToFloat = Float.intBitsToFloat((int) (jpaVar.e() >> 32));
                    x6k x6kVar2 = this.i;
                    this.k = intBitsToFloat / Float.intBitsToFloat((int) (((nmq) x6kVar2.getValue()).a >> 32));
                    this.l = Float.intBitsToFloat((int) (jpaVar.e() & 4294967295L)) / Float.intBitsToFloat((int) (((nmq) x6kVar2.getValue()).a & 4294967295L));
                    long ceil = (((int) Math.ceil(Float.intBitsToFloat((int) (jpaVar.e() >> 32)))) << 32) | (((int) Math.ceil(Float.intBitsToFloat((int) (jpaVar.e() & 4294967295L)))) & 4294967295L);
                    xof layoutDirection = jpaVar.getLayoutDirection();
                    yg0Var = (yg0) fpaVar.c;
                    ud0 ud0Var = (ud0) fpaVar.d;
                    if (yg0Var != null || ud0Var == null) {
                        c = ' ';
                        j = 4294967295L;
                    } else {
                        int i5 = (int) (ceil >> 32);
                        Bitmap bitmap = yg0Var.a;
                        c = ' ';
                        j = 4294967295L;
                        if (i5 <= bitmap.getWidth()) {
                            if (((int) (ceil & 4294967295L)) <= bitmap.getHeight()) {
                            }
                        }
                    }
                    yg0Var = xee.o((int) (ceil >> c), (int) (ceil & j), i);
                    ud0Var = bow.d(yg0Var);
                    fpaVar.c = yg0Var;
                    fpaVar.d = ud0Var;
                    fpaVar.a = i;
                    fpaVar.b = ceil;
                    ou3 ou3Var = (ou3) fpaVar.e;
                    long Q = nt0.Q(ceil);
                    nu3 nu3Var = ou3Var.a;
                    jx7 jx7Var = nu3Var.a;
                    xof xofVar = nu3Var.b;
                    mu3 mu3Var = nu3Var.c;
                    ud0 ud0Var2 = ud0Var;
                    long j2 = nu3Var.d;
                    nu3Var.a = jpaVar;
                    nu3Var.b = layoutDirection;
                    nu3Var.c = ud0Var2;
                    nu3Var.d = Q;
                    ud0Var2.r();
                    jpa.B(ou3Var, d85.b, 0L, 0L, 0.0f, null, 0, 62);
                    this.m.invoke(ou3Var);
                    ud0Var2.k();
                    nu3 nu3Var2 = ou3Var.a;
                    nu3Var2.a = jx7Var;
                    nu3Var2.b = xofVar;
                    nu3Var2.c = mu3Var;
                    nu3Var2.d = j2;
                    yg0Var.a.prepareToDraw();
                    this.d = false;
                    this.j = jpaVar.e();
                    if (m85Var2 == null) {
                        m85Var2 = ((m85) x6kVar.getValue()) != null ? (m85) x6kVar.getValue() : this.h;
                    }
                    m85 m85Var4 = m85Var2;
                    yg0Var2 = (yg0) fpaVar.c;
                    if (yg0Var2 == null) {
                        sme.b("drawCachedImage must be invoked first before attempting to draw the result into another destination");
                    }
                    jpa.j0(jpaVar, yg0Var2, 0L, fpaVar.b, 0L, 0L, f, m85Var4, 0, 858);
                }
            }
        }
        i = 0;
        z = this.d;
        fpaVar = this.e;
        if (!z) {
            yg0Var3 = (yg0) fpaVar.c;
            if (yg0Var3 == null) {
            }
        }
        this.h = i != 1 ? new d43(nqdVar.e, 5) : null;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (jpaVar.e() >> 32));
        x6k x6kVar22 = this.i;
        this.k = intBitsToFloat2 / Float.intBitsToFloat((int) (((nmq) x6kVar22.getValue()).a >> 32));
        this.l = Float.intBitsToFloat((int) (jpaVar.e() & 4294967295L)) / Float.intBitsToFloat((int) (((nmq) x6kVar22.getValue()).a & 4294967295L));
        long ceil2 = (((int) Math.ceil(Float.intBitsToFloat((int) (jpaVar.e() >> 32)))) << 32) | (((int) Math.ceil(Float.intBitsToFloat((int) (jpaVar.e() & 4294967295L)))) & 4294967295L);
        xof layoutDirection2 = jpaVar.getLayoutDirection();
        yg0Var = (yg0) fpaVar.c;
        ud0 ud0Var3 = (ud0) fpaVar.d;
        if (yg0Var != null) {
        }
        c = ' ';
        j = 4294967295L;
        yg0Var = xee.o((int) (ceil2 >> c), (int) (ceil2 & j), i);
        ud0Var3 = bow.d(yg0Var);
        fpaVar.c = yg0Var;
        fpaVar.d = ud0Var3;
        fpaVar.a = i;
        fpaVar.b = ceil2;
        ou3 ou3Var2 = (ou3) fpaVar.e;
        long Q2 = nt0.Q(ceil2);
        nu3 nu3Var3 = ou3Var2.a;
        jx7 jx7Var2 = nu3Var3.a;
        xof xofVar2 = nu3Var3.b;
        mu3 mu3Var2 = nu3Var3.c;
        ud0 ud0Var22 = ud0Var3;
        long j22 = nu3Var3.d;
        nu3Var3.a = jpaVar;
        nu3Var3.b = layoutDirection2;
        nu3Var3.c = ud0Var22;
        nu3Var3.d = Q2;
        ud0Var22.r();
        jpa.B(ou3Var2, d85.b, 0L, 0L, 0.0f, null, 0, 62);
        this.m.invoke(ou3Var2);
        ud0Var22.k();
        nu3 nu3Var22 = ou3Var2.a;
        nu3Var22.a = jx7Var2;
        nu3Var22.b = xofVar2;
        nu3Var22.c = mu3Var2;
        nu3Var22.d = j22;
        yg0Var.a.prepareToDraw();
        this.d = false;
        this.j = jpaVar.e();
        if (m85Var2 == null) {
        }
        m85 m85Var42 = m85Var2;
        yg0Var2 = (yg0) fpaVar.c;
        if (yg0Var2 == null) {
        }
        jpa.j0(jpaVar, yg0Var2, 0L, fpaVar.b, 0L, 0L, f, m85Var42, 0, 858);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.c);
        sb.append("\n\tviewportWidth: ");
        x6k x6kVar = this.i;
        sb.append(Float.intBitsToFloat((int) (((nmq) x6kVar.getValue()).a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((nmq) x6kVar.getValue()).a & 4294967295L)));
        sb.append(StringUtil.LF);
        return sb.toString();
    }
}
