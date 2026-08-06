package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class DFo87pBq1E5 implements defpackage.g00 {
    public final /* synthetic */ int adDC3e2L;
    public final /* synthetic */ java.lang.Object xiZrDbcSW0;

    public /* synthetic */ DFo87pBq1E5(int i, java.lang.Object obj) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = obj;
    }

    private final java.lang.Object r1MBDhnF(java.lang.Object obj) {
        defpackage.ib1 ib1Var = (defpackage.ib1) this.xiZrDbcSW0;
        synchronized (ib1Var.AARZUJiTa) {
            defpackage.hb1 hb1Var = ib1Var.riuEU0zW4;
            hb1Var.getClass();
            java.lang.Object obj2 = hb1Var.oh6vYeIP;
            obj2.getClass();
            int i = hb1Var.F7NU4MC0GW;
            defpackage.fl0 fl0Var = hb1Var.r1MBDhnF;
            if (fl0Var == null) {
                fl0Var = new defpackage.fl0();
                hb1Var.r1MBDhnF = fl0Var;
                hb1Var.xiZrDbcSW0.DFo87pBq1E5(obj2, fl0Var);
            }
            hb1Var.oh6vYeIP(obj, i, obj2, fl0Var);
        }
        return defpackage.ok1.IHQe1A4L2xu;
    }

    /* JADX WARN: Code restructure failed: missing block: B:303:0x0942, code lost:
    
        if (r13 != false) goto L311;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0910  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x098a  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0959  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0966  */
    @Override // defpackage.g00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
        int i;
        final defpackage.f8 f8Var;
        boolean z;
        int i2;
        android.graphics.Bitmap createBitmap;
        defpackage.jb jbVar;
        defpackage.v5 v5Var;
        float f;
        float f2;
        long riuEU0zW4;
        boolean z2;
        float f3;
        defpackage.sc0 sc0Var;
        defpackage.sc0 sc0Var2;
        android.os.Bundle bundle;
        java.lang.Throwable th;
        final int i3 = 6;
        int i4 = 28;
        float f4 = 2.0f;
        final int i5 = 3;
        int i6 = 32;
        final int i7 = 2;
        final int i8 = 4;
        java.lang.Throwable th2 = null;
        th2 = null;
        th2 = null;
        switch (this.adDC3e2L) {
            case 0:
                return obj == ((defpackage.SyNS6RMn) this.xiZrDbcSW0) ? "(this Collection)" : java.lang.String.valueOf(obj);
            case 1:
                defpackage.hu0 hu0Var = (defpackage.hu0) this.xiZrDbcSW0;
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                entry.getClass();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.Object key = entry.getKey();
                sb.append(key == hu0Var ? "(this Map)" : java.lang.String.valueOf(key));
                sb.append('=');
                java.lang.Object value = entry.getValue();
                sb.append(value != hu0Var ? java.lang.String.valueOf(value) : "(this Map)");
                return sb.toString();
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.q8 q8Var = (defpackage.q8) this.xiZrDbcSW0;
                defpackage.ta taVar = (defpackage.ta) obj;
                if (taVar.oh6vYeIP() * q8Var.V7bD7b8KA < 0.0f || defpackage.z91.oh6vYeIP(taVar.adDC3e2L.r1MBDhnF()) <= 0.0f) {
                    return taVar.IHQe1A4L2xu(new defpackage.JX5fKip1C6(i7));
                }
                final float min = java.lang.Math.min(defpackage.uq.oh6vYeIP(q8Var.V7bD7b8KA, 0.0f) ? 1.0f : (float) java.lang.Math.ceil(taVar.oh6vYeIP() * q8Var.V7bD7b8KA), (float) java.lang.Math.ceil(defpackage.z91.oh6vYeIP(taVar.adDC3e2L.r1MBDhnF()) / 2.0f));
                final float f5 = min / 2.0f;
                final long floatToRawIntBits = (java.lang.Float.floatToRawIntBits(f5) << 32) | (java.lang.Float.floatToRawIntBits(f5) & 4294967295L);
                final long floatToRawIntBits2 = (java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (taVar.adDC3e2L.r1MBDhnF() >> 32)) - min) << 32) | (java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (taVar.adDC3e2L.r1MBDhnF() & 4294967295L)) - min) & 4294967295L);
                float f6 = min * 2.0f;
                final boolean z3 = f6 > defpackage.z91.oh6vYeIP(taVar.adDC3e2L.r1MBDhnF());
                defpackage.e90 IHQe1A4L2xu = q8Var.abhbClRa.IHQe1A4L2xu(taVar.adDC3e2L.r1MBDhnF(), taVar.adDC3e2L.getLayoutDirection(), taVar);
                if (!(IHQe1A4L2xu instanceof defpackage.ms0)) {
                    if (!(IHQe1A4L2xu instanceof defpackage.os0)) {
                        if (!(IHQe1A4L2xu instanceof defpackage.ns0)) {
                            defpackage.db.F7NU4MC0GW();
                            return null;
                        }
                        final defpackage.kb1 kb1Var = q8Var.PAEGRtP0bX;
                        if (z3) {
                            floatToRawIntBits = 0;
                        }
                        final long j = floatToRawIntBits;
                        if (z3) {
                            floatToRawIntBits2 = taVar.adDC3e2L.r1MBDhnF();
                        }
                        final long j2 = floatToRawIntBits2;
                        final defpackage.w70 zc1Var = z3 ? defpackage.nv.WLpAkxCo : new defpackage.zc1(min);
                        return taVar.IHQe1A4L2xu(new defpackage.g00() { // from class: n8
                            @Override // defpackage.g00
                            public final java.lang.Object AARZUJiTa(java.lang.Object obj2) {
                                defpackage.oa0 oa0Var = (defpackage.oa0) obj2;
                                oa0Var.IHQe1A4L2xu();
                                defpackage.xr.adDC3e2L(oa0Var, kb1Var, j, j2, 0.0f, zc1Var, 104);
                                return defpackage.ok1.IHQe1A4L2xu;
                            }
                        });
                    }
                    final defpackage.kb1 kb1Var2 = q8Var.PAEGRtP0bX;
                    defpackage.x21 x21Var = ((defpackage.os0) IHQe1A4L2xu).r1MBDhnF;
                    if (defpackage.c80.PAEGRtP0bX(x21Var)) {
                        final long j3 = x21Var.adDC3e2L;
                        final defpackage.zc1 zc1Var2 = new defpackage.zc1(min);
                        return taVar.IHQe1A4L2xu(new defpackage.g00() { // from class: o8
                            @Override // defpackage.g00
                            public final java.lang.Object AARZUJiTa(java.lang.Object obj2) {
                                long j4;
                                defpackage.oa0 oa0Var = (defpackage.oa0) obj2;
                                oa0Var.IHQe1A4L2xu();
                                defpackage.jb jbVar2 = oa0Var.adDC3e2L;
                                boolean z4 = z3;
                                defpackage.h1 h1Var = kb1Var2;
                                long j5 = j3;
                                if (z4) {
                                    defpackage.xr.XZx205DYe(oa0Var, h1Var, 0L, 0L, j5, null, 246);
                                } else {
                                    float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j5 >> 32));
                                    float f7 = f5;
                                    if (intBitsToFloat < f7) {
                                        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (jbVar2.r1MBDhnF() >> 32));
                                        float f8 = min;
                                        float f9 = intBitsToFloat2 - f8;
                                        float intBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (jbVar2.r1MBDhnF() & 4294967295L)) - f8;
                                        defpackage.v5 v5Var2 = jbVar2.xiZrDbcSW0;
                                        long riuEU0zW42 = v5Var2.riuEU0zW4();
                                        v5Var2.xiZrDbcSW0().riuEU0zW4();
                                        try {
                                            ((defpackage.v5) ((defpackage.c1NqjJifC7) v5Var2.oh6vYeIP).xiZrDbcSW0).xiZrDbcSW0().F7NU4MC0GW(f8, f8, f9, intBitsToFloat3, 0);
                                            j4 = riuEU0zW42;
                                            try {
                                                defpackage.xr.XZx205DYe(oa0Var, h1Var, 0L, 0L, j5, null, 246);
                                                v5Var2.xiZrDbcSW0().AARZUJiTa();
                                                v5Var2.EgCjBq0SZwJ(j4);
                                            } catch (java.lang.Throwable th3) {
                                                th = th3;
                                                v5Var2.xiZrDbcSW0().AARZUJiTa();
                                                v5Var2.EgCjBq0SZwJ(j4);
                                                throw th;
                                            }
                                        } catch (java.lang.Throwable th4) {
                                            th = th4;
                                            j4 = riuEU0zW42;
                                        }
                                    } else {
                                        defpackage.xr.XZx205DYe(oa0Var, h1Var, floatToRawIntBits, floatToRawIntBits2, defpackage.mj1.TFRaUu83X3E(j5, f7), zc1Var2, 208);
                                    }
                                }
                                return defpackage.ok1.IHQe1A4L2xu;
                            }
                        });
                    }
                    if (q8Var.kNAkVymC == null) {
                        q8Var.kNAkVymC = new defpackage.m8();
                    }
                    defpackage.m8 m8Var = q8Var.kNAkVymC;
                    m8Var.getClass();
                    defpackage.y2 y2Var = m8Var.F7NU4MC0GW;
                    if (y2Var == null) {
                        y2Var = defpackage.z2.IHQe1A4L2xu();
                        m8Var.F7NU4MC0GW = y2Var;
                    }
                    y2Var.IHQe1A4L2xu.reset();
                    defpackage.y2.IHQe1A4L2xu(y2Var, x21Var);
                    if (!z3) {
                        defpackage.y2 IHQe1A4L2xu2 = defpackage.z2.IHQe1A4L2xu();
                        defpackage.y2.IHQe1A4L2xu(IHQe1A4L2xu2, new defpackage.x21(min, min, (x21Var.r1MBDhnF - x21Var.IHQe1A4L2xu) - min, (x21Var.F7NU4MC0GW - x21Var.oh6vYeIP) - min, defpackage.mj1.TFRaUu83X3E(x21Var.adDC3e2L, min), defpackage.mj1.TFRaUu83X3E(x21Var.xiZrDbcSW0, min), defpackage.mj1.TFRaUu83X3E(x21Var.AARZUJiTa, min), defpackage.mj1.TFRaUu83X3E(x21Var.EXtogiMhuM, min)));
                        y2Var.F7NU4MC0GW(y2Var, IHQe1A4L2xu2, 0);
                    }
                    return taVar.IHQe1A4L2xu(new defpackage.r1MBDhnF(i5, y2Var, kb1Var2));
                }
                defpackage.kb1 kb1Var3 = q8Var.PAEGRtP0bX;
                defpackage.ms0 ms0Var = (defpackage.ms0) IHQe1A4L2xu;
                defpackage.y2 y2Var2 = ms0Var.r1MBDhnF;
                if (z3) {
                    return taVar.IHQe1A4L2xu(new defpackage.r1MBDhnF(i8, ms0Var, kb1Var3));
                }
                if (kb1Var3 != null) {
                    f8Var = new defpackage.f8(defpackage.ae.oh6vYeIP(kb1Var3.D2vUnMij, 1.0f));
                    i = 1;
                } else {
                    i = 0;
                    f8Var = null;
                }
                final defpackage.kz0 oh6vYeIP = y2Var2.oh6vYeIP();
                float f7 = oh6vYeIP.oh6vYeIP;
                float f8 = oh6vYeIP.IHQe1A4L2xu;
                if (q8Var.kNAkVymC == null) {
                    q8Var.kNAkVymC = new defpackage.m8();
                }
                defpackage.m8 m8Var2 = q8Var.kNAkVymC;
                m8Var2.getClass();
                defpackage.y2 y2Var3 = m8Var2.F7NU4MC0GW;
                if (y2Var3 == null) {
                    y2Var3 = defpackage.z2.IHQe1A4L2xu();
                    m8Var2.F7NU4MC0GW = y2Var3;
                }
                y2Var3.IHQe1A4L2xu.reset();
                float f9 = oh6vYeIP.IHQe1A4L2xu;
                float f10 = oh6vYeIP.F7NU4MC0GW;
                float f11 = oh6vYeIP.r1MBDhnF;
                float f12 = oh6vYeIP.oh6vYeIP;
                if (java.lang.Float.isNaN(f9) || java.lang.Float.isNaN(f12) || java.lang.Float.isNaN(f11) || java.lang.Float.isNaN(f10)) {
                    defpackage.z2.oh6vYeIP("Invalid rectangle, make sure no value is NaN");
                }
                if (y2Var3.oh6vYeIP == null) {
                    y2Var3.oh6vYeIP = new android.graphics.RectF();
                }
                android.graphics.RectF rectF = y2Var3.oh6vYeIP;
                rectF.getClass();
                rectF.set(f9, f12, f11, f10);
                android.graphics.Path path = y2Var3.IHQe1A4L2xu;
                android.graphics.RectF rectF2 = y2Var3.oh6vYeIP;
                rectF2.getClass();
                path.addRect(rectF2, android.graphics.Path.Direction.CCW);
                y2Var3.F7NU4MC0GW(y2Var3, y2Var2, 0);
                final defpackage.rz0 rz0Var = new defpackage.rz0();
                defpackage.y2 y2Var4 = y2Var3;
                final long ceil = (((int) java.lang.Math.ceil(oh6vYeIP.r1MBDhnF - f8)) << 32) | (((int) java.lang.Math.ceil(oh6vYeIP.F7NU4MC0GW - f7)) & 4294967295L);
                defpackage.m8 m8Var3 = q8Var.kNAkVymC;
                m8Var3.getClass();
                defpackage.o2 o2Var = m8Var3.IHQe1A4L2xu;
                defpackage.c0 c0Var = m8Var3.oh6vYeIP;
                defpackage.r40 r40Var = o2Var != null ? new defpackage.r40(o2Var.IHQe1A4L2xu()) : null;
                try {
                    try {
                        if (r40Var == null || r40Var.IHQe1A4L2xu != 0) {
                            defpackage.r40 r40Var2 = o2Var != null ? new defpackage.r40(o2Var.IHQe1A4L2xu()) : null;
                            if (r40Var2 == null || i != r40Var2.IHQe1A4L2xu) {
                                z = false;
                                if (o2Var != null) {
                                    android.graphics.Bitmap bitmap = o2Var.IHQe1A4L2xu;
                                    if (c0Var != null) {
                                        i2 = i;
                                        if (java.lang.Float.intBitsToFloat((int) (taVar.adDC3e2L.r1MBDhnF() >> 32)) <= bitmap.getWidth()) {
                                            if (java.lang.Float.intBitsToFloat((int) (taVar.adDC3e2L.r1MBDhnF() & 4294967295L)) <= bitmap.getHeight()) {
                                            }
                                        }
                                        int i9 = (int) (ceil >> 32);
                                        int i10 = (int) (ceil & 4294967295L);
                                        defpackage.d21 d21Var = defpackage.le.adDC3e2L;
                                        android.graphics.Bitmap.Config EoOhNTTfIN7K = defpackage.x70.EoOhNTTfIN7K(i2);
                                        if (android.os.Build.VERSION.SDK_INT >= 26) {
                                            createBitmap = android.graphics.Bitmap.createBitmap((android.util.DisplayMetrics) null, i9, i10, defpackage.x70.EoOhNTTfIN7K(i2), true, defpackage.p5.IHQe1A4L2xu(d21Var));
                                        } else {
                                            createBitmap = android.graphics.Bitmap.createBitmap((android.util.DisplayMetrics) null, i9, i10, EoOhNTTfIN7K);
                                            createBitmap.setHasAlpha(true);
                                        }
                                        o2Var = new defpackage.o2(createBitmap);
                                        m8Var3.IHQe1A4L2xu = o2Var;
                                        android.graphics.Canvas canvas = defpackage.d0.IHQe1A4L2xu;
                                        c0Var = new defpackage.c0();
                                        c0Var.IHQe1A4L2xu = new android.graphics.Canvas(createBitmap);
                                        m8Var3.oh6vYeIP = c0Var;
                                        jbVar = m8Var3.r1MBDhnF;
                                        if (jbVar == null) {
                                            jbVar = new defpackage.jb();
                                            m8Var3.r1MBDhnF = jbVar;
                                        }
                                        v5Var = jbVar.xiZrDbcSW0;
                                        defpackage.ib ibVar = jbVar.adDC3e2L;
                                        long frpfPPIgqM9O = defpackage.j70.frpfPPIgqM9O(ceil);
                                        defpackage.jb jbVar2 = jbVar;
                                        defpackage.w90 layoutDirection = taVar.adDC3e2L.getLayoutDirection();
                                        defpackage.qn qnVar = ibVar.IHQe1A4L2xu;
                                        defpackage.w90 w90Var = ibVar.oh6vYeIP;
                                        defpackage.hb hbVar = ibVar.r1MBDhnF;
                                        defpackage.o2 o2Var2 = o2Var;
                                        long j4 = ibVar.F7NU4MC0GW;
                                        ibVar.IHQe1A4L2xu = taVar;
                                        ibVar.oh6vYeIP = layoutDirection;
                                        ibVar.r1MBDhnF = c0Var;
                                        ibVar.F7NU4MC0GW = frpfPPIgqM9O;
                                        c0Var.riuEU0zW4();
                                        defpackage.xr.Ye0N2xE9Hc(jbVar2, defpackage.ae.oh6vYeIP, 0L, frpfPPIgqM9O, 58);
                                        f = -f8;
                                        f2 = -f7;
                                        ((defpackage.c1NqjJifC7) v5Var.oh6vYeIP).SyNS6RMn(f, f2);
                                        defpackage.xr.cSNyPqwud(jbVar2, y2Var2, kb1Var3, new defpackage.zc1(f6), 52);
                                        float intBitsToFloat = (java.lang.Float.intBitsToFloat((int) (jbVar2.r1MBDhnF() >> 32)) + 1.0f) / java.lang.Float.intBitsToFloat((int) (jbVar2.r1MBDhnF() >> 32));
                                        float intBitsToFloat2 = (java.lang.Float.intBitsToFloat((int) (jbVar2.r1MBDhnF() & 4294967295L)) + 1.0f) / java.lang.Float.intBitsToFloat((int) (jbVar2.r1MBDhnF() & 4294967295L));
                                        long Uv8CGu3G = jbVar2.Uv8CGu3G();
                                        defpackage.c0 c0Var2 = c0Var;
                                        riuEU0zW4 = v5Var.riuEU0zW4();
                                        v5Var.xiZrDbcSW0().riuEU0zW4();
                                        defpackage.hb xiZrDbcSW0 = ((defpackage.v5) ((defpackage.c1NqjJifC7) v5Var.oh6vYeIP).xiZrDbcSW0).xiZrDbcSW0();
                                        int i11 = (int) (Uv8CGu3G >> 32);
                                        int i12 = (int) (Uv8CGu3G & 4294967295L);
                                        xiZrDbcSW0.adDC3e2L(java.lang.Float.intBitsToFloat(i11), java.lang.Float.intBitsToFloat(i12));
                                        xiZrDbcSW0.IHQe1A4L2xu(intBitsToFloat, intBitsToFloat2);
                                        xiZrDbcSW0.adDC3e2L(-java.lang.Float.intBitsToFloat(i11), -java.lang.Float.intBitsToFloat(i12));
                                        defpackage.xr.cSNyPqwud(jbVar2, y2Var4, kb1Var3, null, 28);
                                        ((defpackage.c1NqjJifC7) v5Var.oh6vYeIP).SyNS6RMn(-f, -f2);
                                        c0Var2.AARZUJiTa();
                                        ibVar.IHQe1A4L2xu = qnVar;
                                        ibVar.oh6vYeIP = w90Var;
                                        ibVar.r1MBDhnF = hbVar;
                                        ibVar.F7NU4MC0GW = j4;
                                        o2Var2.IHQe1A4L2xu.prepareToDraw();
                                        rz0Var.adDC3e2L = o2Var2;
                                        return taVar.IHQe1A4L2xu(new defpackage.g00() { // from class: p8
                                            @Override // defpackage.g00
                                            public final java.lang.Object AARZUJiTa(java.lang.Object obj2) {
                                                defpackage.jb jbVar3;
                                                defpackage.rz0 rz0Var2 = rz0Var;
                                                long j5 = ceil;
                                                defpackage.f8 f8Var2 = f8Var;
                                                defpackage.oa0 oa0Var = (defpackage.oa0) obj2;
                                                oa0Var.IHQe1A4L2xu();
                                                defpackage.kz0 kz0Var = defpackage.kz0.this;
                                                float f13 = kz0Var.IHQe1A4L2xu;
                                                float f14 = kz0Var.oh6vYeIP;
                                                defpackage.jb jbVar4 = oa0Var.adDC3e2L;
                                                ((defpackage.c1NqjJifC7) jbVar4.xiZrDbcSW0.oh6vYeIP).SyNS6RMn(f13, f14);
                                                try {
                                                    jbVar3 = jbVar4;
                                                    try {
                                                        jbVar4.adDC3e2L.r1MBDhnF.r1MBDhnF((defpackage.o2) rz0Var2.adDC3e2L, j5, j5, jbVar4.F7NU4MC0GW(null, defpackage.nv.WLpAkxCo, 1.0f, f8Var2, 3));
                                                        ((defpackage.c1NqjJifC7) jbVar3.xiZrDbcSW0.oh6vYeIP).SyNS6RMn(-f13, -f14);
                                                        return defpackage.ok1.IHQe1A4L2xu;
                                                    } catch (java.lang.Throwable th3) {
                                                        th = th3;
                                                        ((defpackage.c1NqjJifC7) jbVar3.xiZrDbcSW0.oh6vYeIP).SyNS6RMn(-f13, -f14);
                                                        throw th;
                                                    }
                                                } catch (java.lang.Throwable th4) {
                                                    th = th4;
                                                    jbVar3 = jbVar4;
                                                }
                                            }
                                        });
                                    }
                                }
                                i2 = i;
                                int i92 = (int) (ceil >> 32);
                                int i102 = (int) (ceil & 4294967295L);
                                defpackage.d21 d21Var2 = defpackage.le.adDC3e2L;
                                android.graphics.Bitmap.Config EoOhNTTfIN7K2 = defpackage.x70.EoOhNTTfIN7K(i2);
                                if (android.os.Build.VERSION.SDK_INT >= 26) {
                                }
                                o2Var = new defpackage.o2(createBitmap);
                                m8Var3.IHQe1A4L2xu = o2Var;
                                android.graphics.Canvas canvas2 = defpackage.d0.IHQe1A4L2xu;
                                c0Var = new defpackage.c0();
                                c0Var.IHQe1A4L2xu = new android.graphics.Canvas(createBitmap);
                                m8Var3.oh6vYeIP = c0Var;
                                jbVar = m8Var3.r1MBDhnF;
                                if (jbVar == null) {
                                }
                                v5Var = jbVar.xiZrDbcSW0;
                                defpackage.ib ibVar2 = jbVar.adDC3e2L;
                                long frpfPPIgqM9O2 = defpackage.j70.frpfPPIgqM9O(ceil);
                                defpackage.jb jbVar22 = jbVar;
                                defpackage.w90 layoutDirection2 = taVar.adDC3e2L.getLayoutDirection();
                                defpackage.qn qnVar2 = ibVar2.IHQe1A4L2xu;
                                defpackage.w90 w90Var2 = ibVar2.oh6vYeIP;
                                defpackage.hb hbVar2 = ibVar2.r1MBDhnF;
                                defpackage.o2 o2Var22 = o2Var;
                                long j42 = ibVar2.F7NU4MC0GW;
                                ibVar2.IHQe1A4L2xu = taVar;
                                ibVar2.oh6vYeIP = layoutDirection2;
                                ibVar2.r1MBDhnF = c0Var;
                                ibVar2.F7NU4MC0GW = frpfPPIgqM9O2;
                                c0Var.riuEU0zW4();
                                defpackage.xr.Ye0N2xE9Hc(jbVar22, defpackage.ae.oh6vYeIP, 0L, frpfPPIgqM9O2, 58);
                                f = -f8;
                                f2 = -f7;
                                ((defpackage.c1NqjJifC7) v5Var.oh6vYeIP).SyNS6RMn(f, f2);
                                defpackage.xr.cSNyPqwud(jbVar22, y2Var2, kb1Var3, new defpackage.zc1(f6), 52);
                                float intBitsToFloat3 = (java.lang.Float.intBitsToFloat((int) (jbVar22.r1MBDhnF() >> 32)) + 1.0f) / java.lang.Float.intBitsToFloat((int) (jbVar22.r1MBDhnF() >> 32));
                                float intBitsToFloat22 = (java.lang.Float.intBitsToFloat((int) (jbVar22.r1MBDhnF() & 4294967295L)) + 1.0f) / java.lang.Float.intBitsToFloat((int) (jbVar22.r1MBDhnF() & 4294967295L));
                                long Uv8CGu3G2 = jbVar22.Uv8CGu3G();
                                defpackage.c0 c0Var22 = c0Var;
                                riuEU0zW4 = v5Var.riuEU0zW4();
                                v5Var.xiZrDbcSW0().riuEU0zW4();
                                defpackage.hb xiZrDbcSW02 = ((defpackage.v5) ((defpackage.c1NqjJifC7) v5Var.oh6vYeIP).xiZrDbcSW0).xiZrDbcSW0();
                                int i112 = (int) (Uv8CGu3G2 >> 32);
                                int i122 = (int) (Uv8CGu3G2 & 4294967295L);
                                xiZrDbcSW02.adDC3e2L(java.lang.Float.intBitsToFloat(i112), java.lang.Float.intBitsToFloat(i122));
                                xiZrDbcSW02.IHQe1A4L2xu(intBitsToFloat3, intBitsToFloat22);
                                xiZrDbcSW02.adDC3e2L(-java.lang.Float.intBitsToFloat(i112), -java.lang.Float.intBitsToFloat(i122));
                                defpackage.xr.cSNyPqwud(jbVar22, y2Var4, kb1Var3, null, 28);
                                ((defpackage.c1NqjJifC7) v5Var.oh6vYeIP).SyNS6RMn(-f, -f2);
                                c0Var22.AARZUJiTa();
                                ibVar2.IHQe1A4L2xu = qnVar2;
                                ibVar2.oh6vYeIP = w90Var2;
                                ibVar2.r1MBDhnF = hbVar2;
                                ibVar2.F7NU4MC0GW = j42;
                                o2Var22.IHQe1A4L2xu.prepareToDraw();
                                rz0Var.adDC3e2L = o2Var22;
                                return taVar.IHQe1A4L2xu(new defpackage.g00() { // from class: p8
                                    @Override // defpackage.g00
                                    public final java.lang.Object AARZUJiTa(java.lang.Object obj2) {
                                        defpackage.jb jbVar3;
                                        defpackage.rz0 rz0Var2 = rz0Var;
                                        long j5 = ceil;
                                        defpackage.f8 f8Var2 = f8Var;
                                        defpackage.oa0 oa0Var = (defpackage.oa0) obj2;
                                        oa0Var.IHQe1A4L2xu();
                                        defpackage.kz0 kz0Var = defpackage.kz0.this;
                                        float f13 = kz0Var.IHQe1A4L2xu;
                                        float f14 = kz0Var.oh6vYeIP;
                                        defpackage.jb jbVar4 = oa0Var.adDC3e2L;
                                        ((defpackage.c1NqjJifC7) jbVar4.xiZrDbcSW0.oh6vYeIP).SyNS6RMn(f13, f14);
                                        try {
                                            jbVar3 = jbVar4;
                                            try {
                                                jbVar4.adDC3e2L.r1MBDhnF.r1MBDhnF((defpackage.o2) rz0Var2.adDC3e2L, j5, j5, jbVar4.F7NU4MC0GW(null, defpackage.nv.WLpAkxCo, 1.0f, f8Var2, 3));
                                                ((defpackage.c1NqjJifC7) jbVar3.xiZrDbcSW0.oh6vYeIP).SyNS6RMn(-f13, -f14);
                                                return defpackage.ok1.IHQe1A4L2xu;
                                            } catch (java.lang.Throwable th3) {
                                                th = th3;
                                                ((defpackage.c1NqjJifC7) jbVar3.xiZrDbcSW0.oh6vYeIP).SyNS6RMn(-f13, -f14);
                                                throw th;
                                            }
                                        } catch (java.lang.Throwable th4) {
                                            th = th4;
                                            jbVar3 = jbVar4;
                                        }
                                    }
                                });
                            }
                        }
                        defpackage.hb xiZrDbcSW022 = ((defpackage.v5) ((defpackage.c1NqjJifC7) v5Var.oh6vYeIP).xiZrDbcSW0).xiZrDbcSW0();
                        int i1122 = (int) (Uv8CGu3G2 >> 32);
                        int i1222 = (int) (Uv8CGu3G2 & 4294967295L);
                        xiZrDbcSW022.adDC3e2L(java.lang.Float.intBitsToFloat(i1122), java.lang.Float.intBitsToFloat(i1222));
                        xiZrDbcSW022.IHQe1A4L2xu(intBitsToFloat3, intBitsToFloat22);
                        xiZrDbcSW022.adDC3e2L(-java.lang.Float.intBitsToFloat(i1122), -java.lang.Float.intBitsToFloat(i1222));
                        defpackage.xr.cSNyPqwud(jbVar22, y2Var4, kb1Var3, null, 28);
                        ((defpackage.c1NqjJifC7) v5Var.oh6vYeIP).SyNS6RMn(-f, -f2);
                        c0Var22.AARZUJiTa();
                        ibVar2.IHQe1A4L2xu = qnVar2;
                        ibVar2.oh6vYeIP = w90Var2;
                        ibVar2.r1MBDhnF = hbVar2;
                        ibVar2.F7NU4MC0GW = j42;
                        o2Var22.IHQe1A4L2xu.prepareToDraw();
                        rz0Var.adDC3e2L = o2Var22;
                        return taVar.IHQe1A4L2xu(new defpackage.g00() { // from class: p8
                            @Override // defpackage.g00
                            public final java.lang.Object AARZUJiTa(java.lang.Object obj2) {
                                defpackage.jb jbVar3;
                                defpackage.rz0 rz0Var2 = rz0Var;
                                long j5 = ceil;
                                defpackage.f8 f8Var2 = f8Var;
                                defpackage.oa0 oa0Var = (defpackage.oa0) obj2;
                                oa0Var.IHQe1A4L2xu();
                                defpackage.kz0 kz0Var = defpackage.kz0.this;
                                float f13 = kz0Var.IHQe1A4L2xu;
                                float f14 = kz0Var.oh6vYeIP;
                                defpackage.jb jbVar4 = oa0Var.adDC3e2L;
                                ((defpackage.c1NqjJifC7) jbVar4.xiZrDbcSW0.oh6vYeIP).SyNS6RMn(f13, f14);
                                try {
                                    jbVar3 = jbVar4;
                                    try {
                                        jbVar4.adDC3e2L.r1MBDhnF.r1MBDhnF((defpackage.o2) rz0Var2.adDC3e2L, j5, j5, jbVar4.F7NU4MC0GW(null, defpackage.nv.WLpAkxCo, 1.0f, f8Var2, 3));
                                        ((defpackage.c1NqjJifC7) jbVar3.xiZrDbcSW0.oh6vYeIP).SyNS6RMn(-f13, -f14);
                                        return defpackage.ok1.IHQe1A4L2xu;
                                    } catch (java.lang.Throwable th3) {
                                        th = th3;
                                        ((defpackage.c1NqjJifC7) jbVar3.xiZrDbcSW0.oh6vYeIP).SyNS6RMn(-f13, -f14);
                                        throw th;
                                    }
                                } catch (java.lang.Throwable th4) {
                                    th = th4;
                                    jbVar3 = jbVar4;
                                }
                            }
                        });
                    } finally {
                        v5Var.xiZrDbcSW0().AARZUJiTa();
                        v5Var.EgCjBq0SZwJ(riuEU0zW4);
                    }
                    defpackage.xr.cSNyPqwud(jbVar22, y2Var2, kb1Var3, new defpackage.zc1(f6), 52);
                    float intBitsToFloat32 = (java.lang.Float.intBitsToFloat((int) (jbVar22.r1MBDhnF() >> 32)) + 1.0f) / java.lang.Float.intBitsToFloat((int) (jbVar22.r1MBDhnF() >> 32));
                    float intBitsToFloat222 = (java.lang.Float.intBitsToFloat((int) (jbVar22.r1MBDhnF() & 4294967295L)) + 1.0f) / java.lang.Float.intBitsToFloat((int) (jbVar22.r1MBDhnF() & 4294967295L));
                    long Uv8CGu3G22 = jbVar22.Uv8CGu3G();
                    defpackage.c0 c0Var222 = c0Var;
                    riuEU0zW4 = v5Var.riuEU0zW4();
                    v5Var.xiZrDbcSW0().riuEU0zW4();
                } catch (java.lang.Throwable th3) {
                    ((defpackage.c1NqjJifC7) v5Var.oh6vYeIP).SyNS6RMn(-f, -f2);
                    throw th3;
                }
                z = true;
                if (o2Var != null) {
                }
                i2 = i;
                int i922 = (int) (ceil >> 32);
                int i1022 = (int) (ceil & 4294967295L);
                defpackage.d21 d21Var22 = defpackage.le.adDC3e2L;
                android.graphics.Bitmap.Config EoOhNTTfIN7K22 = defpackage.x70.EoOhNTTfIN7K(i2);
                if (android.os.Build.VERSION.SDK_INT >= 26) {
                }
                o2Var = new defpackage.o2(createBitmap);
                m8Var3.IHQe1A4L2xu = o2Var;
                android.graphics.Canvas canvas22 = defpackage.d0.IHQe1A4L2xu;
                c0Var = new defpackage.c0();
                c0Var.IHQe1A4L2xu = new android.graphics.Canvas(createBitmap);
                m8Var3.oh6vYeIP = c0Var;
                jbVar = m8Var3.r1MBDhnF;
                if (jbVar == null) {
                }
                v5Var = jbVar.xiZrDbcSW0;
                defpackage.ib ibVar22 = jbVar.adDC3e2L;
                long frpfPPIgqM9O22 = defpackage.j70.frpfPPIgqM9O(ceil);
                defpackage.jb jbVar222 = jbVar;
                defpackage.w90 layoutDirection22 = taVar.adDC3e2L.getLayoutDirection();
                defpackage.qn qnVar22 = ibVar22.IHQe1A4L2xu;
                defpackage.w90 w90Var22 = ibVar22.oh6vYeIP;
                defpackage.hb hbVar22 = ibVar22.r1MBDhnF;
                defpackage.o2 o2Var222 = o2Var;
                long j422 = ibVar22.F7NU4MC0GW;
                ibVar22.IHQe1A4L2xu = taVar;
                ibVar22.oh6vYeIP = layoutDirection22;
                ibVar22.r1MBDhnF = c0Var;
                ibVar22.F7NU4MC0GW = frpfPPIgqM9O22;
                c0Var.riuEU0zW4();
                defpackage.xr.Ye0N2xE9Hc(jbVar222, defpackage.ae.oh6vYeIP, 0L, frpfPPIgqM9O22, 58);
                f = -f8;
                f2 = -f7;
                ((defpackage.c1NqjJifC7) v5Var.oh6vYeIP).SyNS6RMn(f, f2);
                break;
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.nz0 nz0Var = (defpackage.nz0) this.xiZrDbcSW0;
                defpackage.ui1 ui1Var = (defpackage.ui1) obj;
                if (!nz0Var.adDC3e2L) {
                    ui1Var.getClass();
                    if (!((defpackage.q51) ui1Var).EgCjBq0SZwJ) {
                        z2 = false;
                        nz0Var.adDC3e2L = z2;
                        return java.lang.Boolean.valueOf(!z2);
                    }
                }
                z2 = true;
                nz0Var.adDC3e2L = z2;
                return java.lang.Boolean.valueOf(!z2);
            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                final defpackage.qn0 qn0Var = (defpackage.qn0) this.xiZrDbcSW0;
                defpackage.ln0 ln0Var = (defpackage.ln0) obj;
                ln0Var.getClass();
                final int i13 = 1;
                defpackage.e90.DFo87pBq1E5(ln0Var, "menu", null, new defpackage.sf(1200217780, new defpackage.m00() { // from class: ck
                    @Override // defpackage.m00
                    public final java.lang.Object riuEU0zW4(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                        int i14 = i7;
                        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
                        defpackage.qn0 qn0Var2 = qn0Var;
                        defpackage.t10 t10Var = (defpackage.t10) obj4;
                        ((java.lang.Integer) obj5).getClass();
                        ((defpackage.j4) obj2).getClass();
                        ((defpackage.nm0) obj3).getClass();
                        switch (i14) {
                            case 0:
                                defpackage.fm.SH1y5HwkJhh(qn0Var2, null, t10Var, 0);
                                break;
                            case 1:
                                defpackage.a70.oh6vYeIP(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                                defpackage.e90.oh6vYeIP(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                                defpackage.c80.AARZUJiTa(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                                defpackage.h1.xiZrDbcSW0(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                                defpackage.mj1.adDC3e2L(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                                defpackage.s21.F7NU4MC0GW(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.DOUBLE_FIELD_NUMBER /* 7 */:
                                defpackage.fm.IHQe1A4L2xu(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.BYTES_FIELD_NUMBER /* 8 */:
                                defpackage.mj1.ez2rX8ReCYw(qn0Var2, null, t10Var, 0);
                                break;
                            default:
                                defpackage.mj1.AARZUJiTa(qn0Var2, null, t10Var, 0);
                                break;
                        }
                        return ok1Var;
                    }
                }, true), 254);
                defpackage.e90.DFo87pBq1E5(ln0Var, "map", null, new defpackage.sf(2096402717, new defpackage.m00() { // from class: ck
                    @Override // defpackage.m00
                    public final java.lang.Object riuEU0zW4(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                        int i14 = i8;
                        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
                        defpackage.qn0 qn0Var2 = qn0Var;
                        defpackage.t10 t10Var = (defpackage.t10) obj4;
                        ((java.lang.Integer) obj5).getClass();
                        ((defpackage.j4) obj2).getClass();
                        ((defpackage.nm0) obj3).getClass();
                        switch (i14) {
                            case 0:
                                defpackage.fm.SH1y5HwkJhh(qn0Var2, null, t10Var, 0);
                                break;
                            case 1:
                                defpackage.a70.oh6vYeIP(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                                defpackage.e90.oh6vYeIP(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                                defpackage.c80.AARZUJiTa(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                                defpackage.h1.xiZrDbcSW0(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                                defpackage.mj1.adDC3e2L(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                                defpackage.s21.F7NU4MC0GW(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.DOUBLE_FIELD_NUMBER /* 7 */:
                                defpackage.fm.IHQe1A4L2xu(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.BYTES_FIELD_NUMBER /* 8 */:
                                defpackage.mj1.ez2rX8ReCYw(qn0Var2, null, t10Var, 0);
                                break;
                            default:
                                defpackage.mj1.AARZUJiTa(qn0Var2, null, t10Var, 0);
                                break;
                        }
                        return ok1Var;
                    }
                }, true), 254);
                final int i14 = 5;
                defpackage.e90.DFo87pBq1E5(ln0Var, "dig", null, new defpackage.sf(1790768188, new defpackage.m00() { // from class: ck
                    @Override // defpackage.m00
                    public final java.lang.Object riuEU0zW4(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                        int i142 = i14;
                        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
                        defpackage.qn0 qn0Var2 = qn0Var;
                        defpackage.t10 t10Var = (defpackage.t10) obj4;
                        ((java.lang.Integer) obj5).getClass();
                        ((defpackage.j4) obj2).getClass();
                        ((defpackage.nm0) obj3).getClass();
                        switch (i142) {
                            case 0:
                                defpackage.fm.SH1y5HwkJhh(qn0Var2, null, t10Var, 0);
                                break;
                            case 1:
                                defpackage.a70.oh6vYeIP(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                                defpackage.e90.oh6vYeIP(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                                defpackage.c80.AARZUJiTa(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                                defpackage.h1.xiZrDbcSW0(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                                defpackage.mj1.adDC3e2L(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                                defpackage.s21.F7NU4MC0GW(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.DOUBLE_FIELD_NUMBER /* 7 */:
                                defpackage.fm.IHQe1A4L2xu(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.BYTES_FIELD_NUMBER /* 8 */:
                                defpackage.mj1.ez2rX8ReCYw(qn0Var2, null, t10Var, 0);
                                break;
                            default:
                                defpackage.mj1.AARZUJiTa(qn0Var2, null, t10Var, 0);
                                break;
                        }
                        return ok1Var;
                    }
                }, true), 254);
                defpackage.e90.DFo87pBq1E5(ln0Var, "haul", null, new defpackage.sf(1485133659, new defpackage.m00() { // from class: ck
                    @Override // defpackage.m00
                    public final java.lang.Object riuEU0zW4(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                        int i142 = i3;
                        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
                        defpackage.qn0 qn0Var2 = qn0Var;
                        defpackage.t10 t10Var = (defpackage.t10) obj4;
                        ((java.lang.Integer) obj5).getClass();
                        ((defpackage.j4) obj2).getClass();
                        ((defpackage.nm0) obj3).getClass();
                        switch (i142) {
                            case 0:
                                defpackage.fm.SH1y5HwkJhh(qn0Var2, null, t10Var, 0);
                                break;
                            case 1:
                                defpackage.a70.oh6vYeIP(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                                defpackage.e90.oh6vYeIP(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                                defpackage.c80.AARZUJiTa(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                                defpackage.h1.xiZrDbcSW0(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                                defpackage.mj1.adDC3e2L(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                                defpackage.s21.F7NU4MC0GW(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.DOUBLE_FIELD_NUMBER /* 7 */:
                                defpackage.fm.IHQe1A4L2xu(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.BYTES_FIELD_NUMBER /* 8 */:
                                defpackage.mj1.ez2rX8ReCYw(qn0Var2, null, t10Var, 0);
                                break;
                            default:
                                defpackage.mj1.AARZUJiTa(qn0Var2, null, t10Var, 0);
                                break;
                        }
                        return ok1Var;
                    }
                }, true), 254);
                final int i15 = 7;
                defpackage.e90.DFo87pBq1E5(ln0Var, "album", null, new defpackage.sf(1179499130, new defpackage.m00() { // from class: ck
                    @Override // defpackage.m00
                    public final java.lang.Object riuEU0zW4(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                        int i142 = i15;
                        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
                        defpackage.qn0 qn0Var2 = qn0Var;
                        defpackage.t10 t10Var = (defpackage.t10) obj4;
                        ((java.lang.Integer) obj5).getClass();
                        ((defpackage.j4) obj2).getClass();
                        ((defpackage.nm0) obj3).getClass();
                        switch (i142) {
                            case 0:
                                defpackage.fm.SH1y5HwkJhh(qn0Var2, null, t10Var, 0);
                                break;
                            case 1:
                                defpackage.a70.oh6vYeIP(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                                defpackage.e90.oh6vYeIP(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                                defpackage.c80.AARZUJiTa(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                                defpackage.h1.xiZrDbcSW0(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                                defpackage.mj1.adDC3e2L(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                                defpackage.s21.F7NU4MC0GW(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.DOUBLE_FIELD_NUMBER /* 7 */:
                                defpackage.fm.IHQe1A4L2xu(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.BYTES_FIELD_NUMBER /* 8 */:
                                defpackage.mj1.ez2rX8ReCYw(qn0Var2, null, t10Var, 0);
                                break;
                            default:
                                defpackage.mj1.AARZUJiTa(qn0Var2, null, t10Var, 0);
                                break;
                        }
                        return ok1Var;
                    }
                }, true), 254);
                final int i16 = 8;
                defpackage.e90.DFo87pBq1E5(ln0Var, "trader", null, new defpackage.sf(873864601, new defpackage.m00() { // from class: ck
                    @Override // defpackage.m00
                    public final java.lang.Object riuEU0zW4(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                        int i142 = i16;
                        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
                        defpackage.qn0 qn0Var2 = qn0Var;
                        defpackage.t10 t10Var = (defpackage.t10) obj4;
                        ((java.lang.Integer) obj5).getClass();
                        ((defpackage.j4) obj2).getClass();
                        ((defpackage.nm0) obj3).getClass();
                        switch (i142) {
                            case 0:
                                defpackage.fm.SH1y5HwkJhh(qn0Var2, null, t10Var, 0);
                                break;
                            case 1:
                                defpackage.a70.oh6vYeIP(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                                defpackage.e90.oh6vYeIP(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                                defpackage.c80.AARZUJiTa(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                                defpackage.h1.xiZrDbcSW0(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                                defpackage.mj1.adDC3e2L(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                                defpackage.s21.F7NU4MC0GW(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.DOUBLE_FIELD_NUMBER /* 7 */:
                                defpackage.fm.IHQe1A4L2xu(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.BYTES_FIELD_NUMBER /* 8 */:
                                defpackage.mj1.ez2rX8ReCYw(qn0Var2, null, t10Var, 0);
                                break;
                            default:
                                defpackage.mj1.AARZUJiTa(qn0Var2, null, t10Var, 0);
                                break;
                        }
                        return ok1Var;
                    }
                }, true), 254);
                final int i17 = 9;
                defpackage.e90.DFo87pBq1E5(ln0Var, "log", null, new defpackage.sf(568230072, new defpackage.m00() { // from class: ck
                    @Override // defpackage.m00
                    public final java.lang.Object riuEU0zW4(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                        int i142 = i17;
                        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
                        defpackage.qn0 qn0Var2 = qn0Var;
                        defpackage.t10 t10Var = (defpackage.t10) obj4;
                        ((java.lang.Integer) obj5).getClass();
                        ((defpackage.j4) obj2).getClass();
                        ((defpackage.nm0) obj3).getClass();
                        switch (i142) {
                            case 0:
                                defpackage.fm.SH1y5HwkJhh(qn0Var2, null, t10Var, 0);
                                break;
                            case 1:
                                defpackage.a70.oh6vYeIP(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                                defpackage.e90.oh6vYeIP(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                                defpackage.c80.AARZUJiTa(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                                defpackage.h1.xiZrDbcSW0(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                                defpackage.mj1.adDC3e2L(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                                defpackage.s21.F7NU4MC0GW(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.DOUBLE_FIELD_NUMBER /* 7 */:
                                defpackage.fm.IHQe1A4L2xu(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.BYTES_FIELD_NUMBER /* 8 */:
                                defpackage.mj1.ez2rX8ReCYw(qn0Var2, null, t10Var, 0);
                                break;
                            default:
                                defpackage.mj1.AARZUJiTa(qn0Var2, null, t10Var, 0);
                                break;
                        }
                        return ok1Var;
                    }
                }, true), 254);
                final int i18 = 0;
                defpackage.e90.DFo87pBq1E5(ln0Var, "settings", null, new defpackage.sf(262595543, new defpackage.m00() { // from class: ck
                    @Override // defpackage.m00
                    public final java.lang.Object riuEU0zW4(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                        int i142 = i18;
                        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
                        defpackage.qn0 qn0Var2 = qn0Var;
                        defpackage.t10 t10Var = (defpackage.t10) obj4;
                        ((java.lang.Integer) obj5).getClass();
                        ((defpackage.j4) obj2).getClass();
                        ((defpackage.nm0) obj3).getClass();
                        switch (i142) {
                            case 0:
                                defpackage.fm.SH1y5HwkJhh(qn0Var2, null, t10Var, 0);
                                break;
                            case 1:
                                defpackage.a70.oh6vYeIP(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                                defpackage.e90.oh6vYeIP(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                                defpackage.c80.AARZUJiTa(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                                defpackage.h1.xiZrDbcSW0(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                                defpackage.mj1.adDC3e2L(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                                defpackage.s21.F7NU4MC0GW(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.DOUBLE_FIELD_NUMBER /* 7 */:
                                defpackage.fm.IHQe1A4L2xu(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.BYTES_FIELD_NUMBER /* 8 */:
                                defpackage.mj1.ez2rX8ReCYw(qn0Var2, null, t10Var, 0);
                                break;
                            default:
                                defpackage.mj1.AARZUJiTa(qn0Var2, null, t10Var, 0);
                                break;
                        }
                        return ok1Var;
                    }
                }, true), 254);
                defpackage.e90.DFo87pBq1E5(ln0Var, "victory", null, new defpackage.sf(-43038986, new defpackage.m00() { // from class: ck
                    @Override // defpackage.m00
                    public final java.lang.Object riuEU0zW4(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                        int i142 = i13;
                        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
                        defpackage.qn0 qn0Var2 = qn0Var;
                        defpackage.t10 t10Var = (defpackage.t10) obj4;
                        ((java.lang.Integer) obj5).getClass();
                        ((defpackage.j4) obj2).getClass();
                        ((defpackage.nm0) obj3).getClass();
                        switch (i142) {
                            case 0:
                                defpackage.fm.SH1y5HwkJhh(qn0Var2, null, t10Var, 0);
                                break;
                            case 1:
                                defpackage.a70.oh6vYeIP(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                                defpackage.e90.oh6vYeIP(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                                defpackage.c80.AARZUJiTa(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                                defpackage.h1.xiZrDbcSW0(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                                defpackage.mj1.adDC3e2L(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                                defpackage.s21.F7NU4MC0GW(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.DOUBLE_FIELD_NUMBER /* 7 */:
                                defpackage.fm.IHQe1A4L2xu(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.BYTES_FIELD_NUMBER /* 8 */:
                                defpackage.mj1.ez2rX8ReCYw(qn0Var2, null, t10Var, 0);
                                break;
                            default:
                                defpackage.mj1.AARZUJiTa(qn0Var2, null, t10Var, 0);
                                break;
                        }
                        return ok1Var;
                    }
                }, true), 254);
                defpackage.l8 l8Var = defpackage.eo0.F7NU4MC0GW;
                defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
                defpackage.e90.DFo87pBq1E5(ln0Var, "relic/{relicId}", defpackage.fm.p4kuH6PDtgom(new defpackage.lm0(new defpackage.mm0(l8Var))), new defpackage.sf(-348673515, new defpackage.m00() { // from class: ck
                    @Override // defpackage.m00
                    public final java.lang.Object riuEU0zW4(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                        int i142 = i5;
                        defpackage.ok1 ok1Var2 = defpackage.ok1.IHQe1A4L2xu;
                        defpackage.qn0 qn0Var2 = qn0Var;
                        defpackage.t10 t10Var = (defpackage.t10) obj4;
                        ((java.lang.Integer) obj5).getClass();
                        ((defpackage.j4) obj2).getClass();
                        ((defpackage.nm0) obj3).getClass();
                        switch (i142) {
                            case 0:
                                defpackage.fm.SH1y5HwkJhh(qn0Var2, null, t10Var, 0);
                                break;
                            case 1:
                                defpackage.a70.oh6vYeIP(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                                defpackage.e90.oh6vYeIP(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                                defpackage.c80.AARZUJiTa(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                                defpackage.h1.xiZrDbcSW0(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                                defpackage.mj1.adDC3e2L(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                                defpackage.s21.F7NU4MC0GW(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.DOUBLE_FIELD_NUMBER /* 7 */:
                                defpackage.fm.IHQe1A4L2xu(qn0Var2, null, t10Var, 0);
                                break;
                            case defpackage.gx0.BYTES_FIELD_NUMBER /* 8 */:
                                defpackage.mj1.ez2rX8ReCYw(qn0Var2, null, t10Var, 0);
                                break;
                            default:
                                defpackage.mj1.AARZUJiTa(qn0Var2, null, t10Var, 0);
                                break;
                        }
                        return ok1Var2;
                    }
                }, true), 252);
                return ok1Var;
            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                java.lang.String str = (java.lang.String) this.xiZrDbcSW0;
                defpackage.j90[] j90VarArr = defpackage.l71.IHQe1A4L2xu;
                defpackage.m71 m71Var = defpackage.j71.F7NU4MC0GW;
                defpackage.j90 j90Var = defpackage.l71.IHQe1A4L2xu[2];
                ((defpackage.n71) obj).IHQe1A4L2xu(m71Var, str);
                return defpackage.ok1.IHQe1A4L2xu;
            case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.xl0 xl0Var = (defpackage.xl0) this.xiZrDbcSW0;
                java.lang.Object[] objArr = xl0Var.adDC3e2L;
                int i19 = xl0Var.AARZUJiTa;
                for (int i20 = 0; i20 < i19; i20++) {
                    ((defpackage.ji0) objArr[i20]).oh6vYeIP();
                }
                return defpackage.ok1.IHQe1A4L2xu;
            case defpackage.gx0.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.yj1 yj1Var = (defpackage.yj1) obj;
                return ((defpackage.oy) this.xiZrDbcSW0).IHQe1A4L2xu(new defpackage.yj1(null, yj1Var.oh6vYeIP, yj1Var.r1MBDhnF, yj1Var.F7NU4MC0GW, yj1Var.adDC3e2L)).adDC3e2L;
            case defpackage.gx0.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.r30 r30Var = (defpackage.r30) this.xiZrDbcSW0;
                defpackage.mc0 mc0Var = (defpackage.mc0) obj;
                mc0Var.getClass();
                int i21 = 1;
                defpackage.mc0.IHQe1A4L2xu(mc0Var, null, new defpackage.sf(1408605445, new defpackage.l30(r30Var, i21), true), 3);
                defpackage.mc0.IHQe1A4L2xu(mc0Var, null, new defpackage.sf(2018810620, new defpackage.l30(r30Var, 0), true), 3);
                java.util.List list = r30Var.r1MBDhnF;
                mc0Var.IHQe1A4L2xu.IHQe1A4L2xu(list.size(), new defpackage.v5(new defpackage.k20(i21, new defpackage.JX5fKip1C6(i4), list), new defpackage.p30(0, list), new defpackage.sf(802480018, new defpackage.q30(0, list), true), i3));
                return defpackage.ok1.IHQe1A4L2xu;
            case 9:
                return new defpackage.r1(i7, (defpackage.rb0) this.xiZrDbcSW0);
            case 10:
                return new defpackage.r1(i8, (defpackage.zb0) this.xiZrDbcSW0);
            case 11:
                java.lang.Object obj2 = this.xiZrDbcSW0;
                ((java.lang.Integer) obj).getClass();
                return obj2;
            case 12:
                defpackage.yc0 yc0Var = (defpackage.yc0) this.xiZrDbcSW0;
                float f13 = -((java.lang.Float) obj).floatValue();
                if ((f13 >= 0.0f || yc0Var.r1MBDhnF()) && (f13 <= 0.0f || yc0Var.IHQe1A4L2xu())) {
                    if (java.lang.Math.abs(yc0Var.EXtogiMhuM) > 0.5f) {
                        defpackage.a60.r1MBDhnF("entered drag with non-zero pending scroll");
                    }
                    yc0Var.F7NU4MC0GW = true;
                    float f14 = yc0Var.EXtogiMhuM + f13;
                    yc0Var.EXtogiMhuM = f14;
                    if (java.lang.Math.abs(f14) > 0.5f) {
                        float f15 = yc0Var.EXtogiMhuM;
                        int round = java.lang.Math.round(f15);
                        defpackage.sc0 xiZrDbcSW03 = ((defpackage.sc0) yc0Var.xiZrDbcSW0.getValue()).xiZrDbcSW0(round, !yc0Var.oh6vYeIP);
                        if (xiZrDbcSW03 != null && (sc0Var2 = yc0Var.r1MBDhnF) != null) {
                            defpackage.sc0 xiZrDbcSW04 = sc0Var2.xiZrDbcSW0(round, true);
                            if (xiZrDbcSW04 != null) {
                                yc0Var.r1MBDhnF = xiZrDbcSW04;
                            } else {
                                sc0Var = null;
                                if (sc0Var == null) {
                                    yc0Var.xiZrDbcSW0(sc0Var, yc0Var.oh6vYeIP, true);
                                    yc0Var.V7bD7b8KA.setValue(defpackage.ok1.IHQe1A4L2xu);
                                    yc0Var.EXtogiMhuM(f15 - yc0Var.EXtogiMhuM, sc0Var);
                                } else {
                                    defpackage.ma0 ma0Var = yc0Var.ez2rX8ReCYw;
                                    if (ma0Var != null) {
                                        ma0Var.ez2rX8ReCYw();
                                    }
                                    yc0Var.EXtogiMhuM(f15 - yc0Var.EXtogiMhuM, yc0Var.AARZUJiTa());
                                }
                            }
                        }
                        sc0Var = xiZrDbcSW03;
                        if (sc0Var == null) {
                        }
                    }
                    if (java.lang.Math.abs(yc0Var.EXtogiMhuM) > 0.5f) {
                        f13 -= yc0Var.EXtogiMhuM;
                        yc0Var.EXtogiMhuM = 0.0f;
                    }
                    f3 = f13;
                } else {
                    f3 = 0.0f;
                }
                return java.lang.Float.valueOf(-f3);
            case 13:
                defpackage.t31 t31Var = (defpackage.t31) this.xiZrDbcSW0;
                return java.lang.Boolean.valueOf(t31Var != null ? t31Var.F7NU4MC0GW(obj) : true);
            case 14:
                return ((defpackage.ai0) this.xiZrDbcSW0).oh6vYeIP(((java.lang.Integer) obj).intValue());
            case 15:
                ((defpackage.km0) this.xiZrDbcSW0).oh6vYeIP(null);
                return defpackage.ok1.IHQe1A4L2xu;
            case 16:
                android.os.Bundle bundle2 = (android.os.Bundle) obj;
                defpackage.qn0 AARZUJiTa = defpackage.a70.AARZUJiTa((android.content.Context) this.xiZrDbcSW0);
                if (bundle2 != null) {
                    bundle2.setClassLoader(AARZUJiTa.IHQe1A4L2xu.getClassLoader());
                }
                defpackage.ym0 ym0Var = AARZUJiTa.oh6vYeIP;
                java.util.LinkedHashMap linkedHashMap = ym0Var.DFo87pBq1E5;
                if (bundle2 == null) {
                    th = null;
                } else {
                    if (bundle2.containsKey("android-support-nav:controller:navigatorState")) {
                        bundle = bundle2.getBundle("android-support-nav:controller:navigatorState");
                        if (bundle == null) {
                            defpackage.c80.abhbClRa("android-support-nav:controller:navigatorState");
                            throw null;
                        }
                    } else {
                        bundle = null;
                    }
                    ym0Var.F7NU4MC0GW = bundle;
                    ym0Var.adDC3e2L = bundle2.containsKey("android-support-nav:controller:backStack") ? (android.os.Bundle[]) defpackage.s70.C0U8sNJm(bundle2, "android-support-nav:controller:backStack").toArray(new android.os.Bundle[0]) : null;
                    linkedHashMap.clear();
                    if (bundle2.containsKey("android-support-nav:controller:backStackDestIds") && bundle2.containsKey("android-support-nav:controller:backStackIds")) {
                        int[] intArray = bundle2.getIntArray("android-support-nav:controller:backStackDestIds");
                        if (intArray == null) {
                            defpackage.c80.abhbClRa("android-support-nav:controller:backStackDestIds");
                            throw null;
                        }
                        java.util.ArrayList<java.lang.String> stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:backStackIds");
                        if (stringArrayList == null) {
                            defpackage.c80.abhbClRa("android-support-nav:controller:backStackIds");
                            throw null;
                        }
                        int length = intArray.length;
                        int i22 = 0;
                        int i23 = 0;
                        while (i22 < length) {
                            int i24 = i23 + 1;
                            java.lang.Throwable th4 = th2;
                            ym0Var.JlrlGoKF.put(java.lang.Integer.valueOf(intArray[i22]), !defpackage.x70.QoRHpC4k(stringArrayList.get(i23), "") ? (java.lang.String) stringArrayList.get(i23) : th4);
                            i22++;
                            i23 = i24;
                            th2 = th4;
                        }
                    }
                    th = th2;
                    if (bundle2.containsKey("android-support-nav:controller:backStackStates")) {
                        java.util.ArrayList<java.lang.String> stringArrayList2 = bundle2.getStringArrayList("android-support-nav:controller:backStackStates");
                        if (stringArrayList2 == null) {
                            defpackage.c80.abhbClRa("android-support-nav:controller:backStackStates");
                            throw th;
                        }
                        int size = stringArrayList2.size();
                        int i25 = 0;
                        while (i25 < size) {
                            java.lang.String str2 = stringArrayList2.get(i25);
                            i25++;
                            java.lang.String str3 = str2;
                            if (bundle2.containsKey("android-support-nav:controller:backStackStates:" + str3)) {
                                java.util.ArrayList C0U8sNJm = defpackage.s70.C0U8sNJm(bundle2, "android-support-nav:controller:backStackStates:" + str3);
                                defpackage.l6 l6Var = new defpackage.l6(C0U8sNJm.size());
                                int size2 = C0U8sNJm.size();
                                int i26 = 0;
                                while (i26 < size2) {
                                    java.lang.Object obj3 = C0U8sNJm.get(i26);
                                    i26++;
                                    l6Var.addLast(new defpackage.rm0((android.os.Bundle) obj3));
                                }
                                linkedHashMap.put(str3, l6Var);
                            }
                        }
                    }
                }
                if (bundle2 != null) {
                    boolean z4 = bundle2.getBoolean("android-support-nav:controller:deepLinkHandled", false);
                    java.lang.Boolean valueOf = (z4 || !bundle2.getBoolean("android-support-nav:controller:deepLinkHandled", true)) ? java.lang.Boolean.valueOf(z4) : th;
                    AARZUJiTa.adDC3e2L = valueOf != 0 ? valueOf.booleanValue() : false;
                }
                return AARZUJiTa;
            case 17:
                defpackage.oo0 oo0Var = (defpackage.oo0) this.xiZrDbcSW0;
                defpackage.nm0 nm0Var = (defpackage.nm0) obj;
                nm0Var.getClass();
                defpackage.pm0 pm0Var = nm0Var.JlrlGoKF;
                defpackage.gn0 gn0Var = nm0Var.xiZrDbcSW0;
                if (gn0Var == null) {
                    gn0Var = null;
                }
                if (gn0Var == null) {
                    return null;
                }
                pm0Var.IHQe1A4L2xu();
                defpackage.gn0 r1MBDhnF = oo0Var.r1MBDhnF(gn0Var);
                if (r1MBDhnF == null) {
                    return null;
                }
                return r1MBDhnF.equals(gn0Var) ? nm0Var : oo0Var.oh6vYeIP().oh6vYeIP(r1MBDhnF, r1MBDhnF.IHQe1A4L2xu(pm0Var.IHQe1A4L2xu()));
            case 18:
                defpackage.fe feVar = (defpackage.fe) this.xiZrDbcSW0;
                defpackage.xr xrVar = (defpackage.xr) obj;
                xrVar.getClass();
                defpackage.xr.adDC3e2L(xrVar, new defpackage.me0(defpackage.fm.yIx6ChFVk(new defpackage.ae(feVar.SyNS6RMn), new defpackage.ae(feVar.QoRHpC4k), new defpackage.ae(feVar.SyNS6RMn)), (java.lang.Float.floatToRawIntBits(0.0f) << 32) | (java.lang.Float.floatToRawIntBits(0.0f) & 4294967295L), (java.lang.Float.floatToRawIntBits(0.0f) << 32) | (java.lang.Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & 4294967295L)), 0L, 0L, 0.0f, null, 126);
                long floatToRawIntBits3 = (java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (xrVar.r1MBDhnF() >> 32)) * 0.5f) << 32) | (java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (xrVar.r1MBDhnF() & 4294967295L)) * 0.42f) & 4294967295L);
                float oh6vYeIP2 = defpackage.z91.oh6vYeIP(xrVar.r1MBDhnF()) * 0.34f;
                long j5 = feVar.IHQe1A4L2xu;
                long oh6vYeIP3 = defpackage.ae.oh6vYeIP(j5, 0.06f);
                defpackage.xr.v5iciZok(xrVar, oh6vYeIP3, oh6vYeIP2, floatToRawIntBits3, new defpackage.zc1(2.0f), 104);
                defpackage.xr.v5iciZok(xrVar, oh6vYeIP3, oh6vYeIP2 * 0.72f, floatToRawIntBits3, new defpackage.zc1(1.0f), 104);
                int i27 = 0;
                while (i27 < i6) {
                    int i28 = i6;
                    double d = ((i27 * 360.0f) / 32.0f) * 0.017453292519943295d;
                    int i29 = i27 % 8;
                    double d2 = oh6vYeIP2 * (i29 == 0 ? 0.2f : 0.6f);
                    int i30 = (int) (floatToRawIntBits3 & 4294967295L);
                    float f16 = f4;
                    long floatToRawIntBits4 = (java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat(r9) + ((float) (java.lang.Math.cos(d) * d2))) << i28) | (java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat(i30) + ((float) (d2 * java.lang.Math.sin(d)))) & 4294967295L);
                    float intBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (floatToRawIntBits3 >> i28));
                    double d3 = oh6vYeIP2;
                    xrVar.hyxIchWRW(oh6vYeIP3, floatToRawIntBits4, (java.lang.Float.floatToRawIntBits(intBitsToFloat4 + ((float) (java.lang.Math.cos(d) * d3))) << i28) | (java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat(i30) + ((float) (java.lang.Math.sin(d) * d3))) & 4294967295L), i29 == 0 ? f16 : 1.0f, (r19 & 16) != 0 ? 0 : 0);
                    i27++;
                    i6 = i28;
                    f4 = f16;
                }
                float f17 = f4;
                int i31 = i6;
                long oh6vYeIP4 = defpackage.ae.oh6vYeIP(j5, 0.08f);
                int i32 = 0;
                while (i32 < 4) {
                    float intBitsToFloat5 = ((i32 * 0.05f) + 0.8f) * java.lang.Float.intBitsToFloat((int) (xrVar.r1MBDhnF() & 4294967295L));
                    defpackage.y2 IHQe1A4L2xu3 = defpackage.z2.IHQe1A4L2xu();
                    android.graphics.Path path2 = IHQe1A4L2xu3.IHQe1A4L2xu;
                    path2.moveTo(0.0f, intBitsToFloat5);
                    float intBitsToFloat6 = java.lang.Float.intBitsToFloat((int) (xrVar.r1MBDhnF() >> i31)) / 8.0f;
                    boolean z5 = true;
                    float f18 = 0.0f;
                    while (f18 < java.lang.Float.intBitsToFloat((int) (xrVar.r1MBDhnF() >> i31))) {
                        float f19 = (intBitsToFloat6 / f17) + f18;
                        f18 += intBitsToFloat6;
                        path2.quadTo(f19, z5 ? intBitsToFloat5 - 10.0f : 10.0f + intBitsToFloat5, f18, intBitsToFloat5);
                        z5 = !z5;
                    }
                    defpackage.xr.FyULxpbU8bu(xrVar, IHQe1A4L2xu3, oh6vYeIP4, new defpackage.zc1(f17), 52);
                    i32++;
                    f17 = 2.0f;
                }
                return defpackage.ok1.IHQe1A4L2xu;
            case 19:
                defpackage.n71 n71Var = (defpackage.n71) obj;
                java.lang.Object IHQe1A4L2xu4 = ((defpackage.vz) this.xiZrDbcSW0).IHQe1A4L2xu();
                java.lang.Float f20 = (java.lang.Float) (java.lang.Float.isNaN(((java.lang.Number) IHQe1A4L2xu4).floatValue()) ? null : IHQe1A4L2xu4);
                defpackage.ey0 ey0Var = new defpackage.ey0(f20 != null ? f20.floatValue() : 0.0f, new defpackage.jd(1.0f));
                defpackage.j90[] j90VarArr2 = defpackage.l71.IHQe1A4L2xu;
                defpackage.m71 m71Var2 = defpackage.j71.r1MBDhnF;
                defpackage.j90 j90Var2 = defpackage.l71.IHQe1A4L2xu[1];
                n71Var.IHQe1A4L2xu(m71Var2, ey0Var);
                return defpackage.ok1.IHQe1A4L2xu;
            case 20:
                ((defpackage.kh) this.xiZrDbcSW0).NHJTzaLwkd(obj);
                return defpackage.ok1.IHQe1A4L2xu;
            case 21:
                defpackage.gz0 gz0Var = (defpackage.gz0) this.xiZrDbcSW0;
                java.lang.Throwable th5 = (java.lang.Throwable) obj;
                java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th5);
                synchronized (gz0Var.r1MBDhnF) {
                    try {
                        defpackage.u80 u80Var = gz0Var.F7NU4MC0GW;
                        if (u80Var != null) {
                            defpackage.hc1 hc1Var = gz0Var.kNAkVymC;
                            defpackage.dz0 dz0Var = defpackage.dz0.xiZrDbcSW0;
                            hc1Var.getClass();
                            hc1Var.ez2rX8ReCYw(null, dz0Var);
                            u80Var.F7NU4MC0GW(cancellationException);
                            gz0Var.kd6TUFXn = null;
                            u80Var.kNAkVymC(new defpackage.r1MBDhnF(22, gz0Var, th5));
                        } else {
                            gz0Var.adDC3e2L = cancellationException;
                            defpackage.hc1 hc1Var2 = gz0Var.kNAkVymC;
                            defpackage.dz0 dz0Var2 = defpackage.dz0.adDC3e2L;
                            hc1Var2.getClass();
                            hc1Var2.ez2rX8ReCYw(null, dz0Var2);
                        }
                    } catch (java.lang.Throwable th6) {
                        throw th6;
                    }
                }
                return defpackage.ok1.IHQe1A4L2xu;
            case 22:
                defpackage.o21 o21Var = (defpackage.o21) this.xiZrDbcSW0;
                defpackage.mz mzVar = (defpackage.mz) obj;
                mzVar.getClass();
                o21Var.EXtogiMhuM = mzVar;
                return defpackage.ok1.IHQe1A4L2xu;
            case 23:
                defpackage.t31 t31Var2 = ((defpackage.s31) this.xiZrDbcSW0).AARZUJiTa;
                return java.lang.Boolean.valueOf(t31Var2 != null ? t31Var2.F7NU4MC0GW(obj) : true);
            case 24:
                defpackage.n51 n51Var = (defpackage.n51) this.xiZrDbcSW0;
                float floatValue = ((java.lang.Float) obj).floatValue();
                defpackage.nt0 nt0Var = n51Var.IHQe1A4L2xu;
                float AARZUJiTa2 = nt0Var.AARZUJiTa() + floatValue + n51Var.xiZrDbcSW0;
                float ez2rX8ReCYw = defpackage.x80.ez2rX8ReCYw(AARZUJiTa2, 0.0f, n51Var.adDC3e2L.AARZUJiTa());
                boolean z6 = AARZUJiTa2 == ez2rX8ReCYw;
                float AARZUJiTa3 = ez2rX8ReCYw - nt0Var.AARZUJiTa();
                int round2 = java.lang.Math.round(AARZUJiTa3);
                nt0Var.EXtogiMhuM(nt0Var.AARZUJiTa() + round2);
                n51Var.xiZrDbcSW0 = AARZUJiTa3 - round2;
                if (!z6) {
                    floatValue = AARZUJiTa3;
                }
                return java.lang.Float.valueOf(floatValue);
            case 25:
                defpackage.i61 i61Var = (defpackage.i61) this.xiZrDbcSW0;
                return new defpackage.gq0(i61Var.r1MBDhnF(i61Var.ez2rX8ReCYw, ((defpackage.gq0) obj).IHQe1A4L2xu, i61Var.SH1y5HwkJhh));
            case 26:
                defpackage.y91 y91Var = (defpackage.y91) this.xiZrDbcSW0;
                defpackage.w71 w71Var = y91Var.xiZrDbcSW0;
                w71Var.getClass();
                if (!defpackage.x70.QoRHpC4k(y91Var.xiZrDbcSW0, w71Var)) {
                    defpackage.nw0.oh6vYeIP("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
                }
                defpackage.ol0 ol0Var = y91Var.adDC3e2L;
                java.lang.Object obj4 = y91Var.r1MBDhnF;
                if (ol0Var != null) {
                    if (obj4 != null) {
                        defpackage.nw0.oh6vYeIP("workingSoleWatchedObject must be null when workingWatchSet is non-null");
                    }
                    ol0Var.IHQe1A4L2xu(obj);
                } else if (obj4 == null) {
                    y91Var.r1MBDhnF = obj;
                } else {
                    defpackage.ol0 ol0Var2 = defpackage.a51.IHQe1A4L2xu;
                    defpackage.ol0 ol0Var3 = new defpackage.ol0();
                    ol0Var3.IHQe1A4L2xu(obj4);
                    ol0Var3.IHQe1A4L2xu(obj);
                    y91Var.adDC3e2L = ol0Var3;
                    y91Var.r1MBDhnF = null;
                }
                return defpackage.ok1.IHQe1A4L2xu;
            case 27:
                return r1MBDhnF(obj);
            default:
                defpackage.b5 b5Var = (defpackage.b5) obj;
                ((defpackage.k00) this.xiZrDbcSW0).adDC3e2L(b5Var.adDC3e2L.getValue(), ((defpackage.g00) defpackage.gq1.QoRHpC4k.AARZUJiTa).AARZUJiTa(b5Var.xiZrDbcSW0));
                return defpackage.ok1.IHQe1A4L2xu;
        }
    }

    public /* synthetic */ DFo87pBq1E5(int i, java.lang.Object obj, java.lang.Object obj2) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = obj;
    }
}
