package defpackage;

import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes10.dex */
public final class v4u {
    public boolean a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public long f;
    public long g;
    public final Object h;

    public /* synthetic */ v4u(Object obj) {
        this.h = obj;
    }

    public void a(int i, int i2, byte[] bArr) {
        if (this.b) {
            int i3 = this.e;
            int i4 = (i + 1) - i3;
            if (i4 >= i2) {
                this.e = (i2 - i) + i3;
            } else {
                this.c = ((bArr[i4] & DerValue.TAG_PRIVATE) >> 6) == 0;
                this.b = false;
            }
        }
    }

    public void b(boolean z, int i, long j) {
        d6z.x(this.g != -9223372036854775807L);
        if (this.d == 182 && z && this.a) {
            ((g001) this.h).c(this.g, this.c ? 1 : 0, (int) (j - this.f), i, null);
        }
        if (this.d != 179) {
            this.f = j;
        }
    }
}
