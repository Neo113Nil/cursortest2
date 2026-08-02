package defpackage;

import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes11.dex */
public final /* synthetic */ class wk11 implements tls {
    public final /* synthetic */ m3u0 A;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ m3u0 c;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ long x;
    public final /* synthetic */ m3u0 y;
    public final /* synthetic */ m3u0 z;

    public /* synthetic */ wk11(float f, m3u0 m3u0Var, boolean z, long j, osv osvVar, osv osvVar2, osv osvVar3) {
        this.b = f;
        this.c = m3u0Var;
        this.w = z;
        this.x = j;
        this.y = osvVar;
        this.z = osvVar2;
        this.A = osvVar3;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        m3u0 m3u0Var = this.z;
        m3u0 m3u0Var2 = this.A;
        m3u0 m3u0Var3 = this.y;
        boolean z = this.w;
        m3u0 m3u0Var4 = this.c;
        float f = this.b;
        switch (i) {
            case 0:
                qam qamVar = (qam) obj;
                jvu0 jvu0Var = new jvu0(0, 0, 30, qamVar.w0(f), 0.0f);
                long j = ((wu60) m3u0Var4.getValue()).a;
                long j2 = 9223372034707292159L & j;
                if (j2 == 9205357640488583168L) {
                    j = qamVar.P();
                }
                long j3 = j;
                float c = (!z || j2 == 9205357640488583168L) ? cjs0.c(qamVar.c()) / 2.0f : fi91.d(Float.intBitsToFloat((int) (qamVar.c() >> 32)), Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), j3);
                float floatValue = ((Number) m3u0Var3.getValue()).floatValue() * c;
                float floatValue2 = ((Number) m3u0Var.getValue()).floatValue();
                long j4 = this.x;
                qam.z(qamVar, j4, floatValue, j3, floatValue2, jvu0Var, 0, 96);
                qam.z(qamVar, j4, ((Number) m3u0Var2.getValue()).floatValue() * c, j3, ((Number) m3u0Var.getValue()).floatValue(), jvu0Var, 0, 96);
                break;
            default:
                oz40 oz40Var = (oz40) m3u0Var2;
                qam qamVar2 = (qam) obj;
                float w0 = qamVar2.w0(f);
                long j5 = ((wu60) m3u0Var4.getValue()).a;
                long j6 = 9223372034707292159L & j5;
                if (j6 == 9205357640488583168L) {
                    j5 = qamVar2.P();
                }
                float c2 = (!z || j6 == 9205357640488583168L) ? cjs0.c(qamVar2.c()) / 2.0f : fi91.d(Float.intBitsToFloat((int) (qamVar2.c() >> 32)), Float.intBitsToFloat((int) (qamVar2.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), j5);
                float floatValue3 = ((Number) m3u0Var3.getValue()).floatValue();
                float f2 = c2 - w0;
                long j7 = this.x;
                long j8 = j5;
                qam.z(qamVar2, j7, (f2 * floatValue3) + w0, j8, (1.0f - floatValue3) * 0.5f, null, 0, 112);
                if (((Boolean) oz40Var.getValue()).booleanValue()) {
                    float floatValue4 = ((Number) m3u0Var.getValue()).floatValue();
                    qam.z(qamVar2, j7, (f2 * floatValue4) + w0, j8, (1.0f - floatValue4) * 0.5f, null, 0, 112);
                    break;
                }
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ wk11(float f, m3u0 m3u0Var, boolean z, long j, osv osvVar, oz40 oz40Var, osv osvVar2) {
        this.b = f;
        this.c = m3u0Var;
        this.w = z;
        this.x = j;
        this.y = osvVar;
        this.A = oz40Var;
        this.z = osvVar2;
    }
}
