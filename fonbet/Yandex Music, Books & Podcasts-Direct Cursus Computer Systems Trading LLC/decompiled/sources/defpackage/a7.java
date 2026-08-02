package defpackage;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* loaded from: classes5.dex */
public final class a7 extends bkp {
    public final /* synthetic */ int h = 1;
    public final /* synthetic */ x6f i;
    public final /* synthetic */ String j;
    public final Object k;

    public a7(x6f x6fVar, String str) {
        this.i = x6fVar;
        this.j = str;
        this.k = x6fVar.b.b;
    }

    @Override // defpackage.bkp, defpackage.l6b
    public void C(int i) {
        switch (this.h) {
            case 1:
                get getVar = het.b;
                x0(Long.toString(i & 4294967295L, 10));
                break;
            default:
                super.C(i);
                break;
        }
    }

    @Override // defpackage.bkp, defpackage.l6b
    public void E(String str) {
        switch (this.h) {
            case 0:
                str.getClass();
                this.i.N(new j5f(str, false, (mhp) this.k), this.j);
                break;
            default:
                super.E(str);
                break;
        }
    }

    @Override // defpackage.l6b
    public final uhp a() {
        switch (this.h) {
            case 0:
                return this.i.b.b;
            default:
                return (uhp) this.k;
        }
    }

    @Override // defpackage.bkp, defpackage.l6b
    public void h(byte b) {
        switch (this.h) {
            case 1:
                zdt zdtVar = aet.b;
                x0(String.valueOf(b & 255));
                break;
            default:
                super.h(b);
                break;
        }
    }

    @Override // defpackage.bkp, defpackage.l6b
    public void r(long j) {
        String str;
        switch (this.h) {
            case 1:
                met metVar = net.b;
                if (j == 0) {
                    str = CommonUrlParts.Values.FALSE_INTEGER;
                } else if (j > 0) {
                    str = Long.toString(j, 10);
                } else {
                    char[] cArr = new char[64];
                    long j2 = (j >>> 1) / 5;
                    long j3 = 10;
                    int i = 63;
                    cArr[63] = Character.forDigit((int) (j - (j2 * j3)), 10);
                    while (j2 > 0) {
                        i--;
                        cArr[i] = Character.forDigit((int) (j2 % j3), 10);
                        j2 /= j3;
                    }
                    str = new String(cArr, i, 64 - i);
                }
                x0(str);
                break;
            default:
                super.r(j);
                break;
        }
    }

    @Override // defpackage.bkp, defpackage.l6b
    public void w(short s) {
        switch (this.h) {
            case 1:
                tet tetVar = uet.b;
                x0(String.valueOf(s & 65535));
                break;
            default:
                super.w(s);
                break;
        }
    }

    public void x0(String str) {
        str.getClass();
        this.i.N(new j5f(str, false, null), this.j);
    }

    public a7(x6f x6fVar, String str, mhp mhpVar) {
        this.i = x6fVar;
        this.j = str;
        this.k = mhpVar;
    }
}
