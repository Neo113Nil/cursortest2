package defpackage;

import android.os.Looper;
import android.os.Message;
import androidx.media3.exoplayer.ExoPlayer;
import com.yandex.plus.bdui.plus.checkout.h;
import com.yandex.plus.home.common.utils.c;
import com.yandex.plus.home.common.utils.d;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class au1 implements o97, z5e, f4c, s2c, t2c, zpj {
    public final /* synthetic */ int a;
    public long b;
    public Object c;

    public au1(int i) {
        this.a = i;
        switch (i) {
            case 5:
                break;
            case 9:
                this.b = 1L;
                this.c = new HashMap();
                break;
            case 15:
                Looper mainLooper = Looper.getMainLooper();
                mainLooper.getClass();
                this.b = 500L;
                this.c = btf.b(new h(25, mainLooper));
                break;
            default:
                this.b = 0L;
                break;
        }
    }

    @Override // defpackage.s2c
    public void A(byte[] bArr, int i, int i2) {
        ((s2c) this.c).A(bArr, i, i2);
    }

    public void B(int i) {
        if (i < 64) {
            this.b &= ~(1 << i);
            return;
        }
        au1 au1Var = (au1) this.c;
        if (au1Var != null) {
            au1Var.B(i - 64);
        }
    }

    public int C(int i) {
        au1 au1Var = (au1) this.c;
        if (au1Var == null) {
            long j = this.b;
            return i >= 64 ? Long.bitCount(j) : Long.bitCount(((1 << i) - 1) & j);
        }
        if (i < 64) {
            return Long.bitCount(this.b & ((1 << i) - 1));
        }
        return Long.bitCount(this.b) + au1Var.C(i - 64);
    }

    public void D(Function0 function0) {
        if (N().hasMessages(1)) {
            return;
        }
        N().sendMessageDelayed(Message.obtain(N(), 1, new c(1, function0)), this.b);
    }

    @Override // defpackage.t2c
    public void E(fap fapVar) {
        ((t2c) this.c).E(new ecr(this, fapVar, fapVar));
    }

    public void F() {
        if (((au1) this.c) == null) {
            this.c = new au1(1);
        }
    }

    @Override // defpackage.o97
    public boolean G() {
        return true;
    }

    @Override // defpackage.o97
    public long H() {
        return 0L;
    }

    public long I(String str) {
        str.getClass();
        Long l = (Long) ((ConcurrentHashMap) this.c).get(str);
        if (l == null || l.longValue() < this.b) {
            l = Long.valueOf(this.b);
        }
        return l.longValue();
    }

    @Override // defpackage.o97
    public long J(long j, long j2) {
        return ((tk4) this.c).a;
    }

    @Override // defpackage.t2c
    public void K() {
        ((t2c) this.c).K();
    }

    public boolean L(int i) {
        if (i < 64) {
            return (this.b & (1 << i)) != 0;
        }
        F();
        return ((au1) this.c).L(i - 64);
    }

    @Override // defpackage.t2c
    public azs M(int i, int i2) {
        return ((t2c) this.c).M(i, i2);
    }

    public d N() {
        return (d) ((jyr) this.c).getValue();
    }

    public void O(int i, boolean z) {
        if (i >= 64) {
            F();
            ((au1) this.c).O(i - 64, z);
            return;
        }
        long j = this.b;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.b = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            S(i);
        } else {
            B(i);
        }
        if (z2 || ((au1) this.c) != null) {
            F();
            ((au1) this.c).O(0, z2);
        }
    }

    public boolean P(int i) {
        if (i >= 64) {
            F();
            return ((au1) this.c).P(i - 64);
        }
        long j = 1 << i;
        long j2 = this.b;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.b = j3;
        long j4 = j - 1;
        this.b = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        au1 au1Var = (au1) this.c;
        if (au1Var != null) {
            if (au1Var.L(0)) {
                S(63);
            }
            ((au1) this.c).P(0);
        }
        return z;
    }

    public void Q() {
        this.b = 0L;
        au1 au1Var = (au1) this.c;
        if (au1Var != null) {
            au1Var.Q();
        }
    }

    public void R(Function0 function0) {
        N().removeMessages(1);
        N().sendMessage(Message.obtain(N(), 1, new c(0, function0)));
    }

    public void S(int i) {
        if (i < 64) {
            this.b |= 1 << i;
        } else {
            F();
            ((au1) this.c).S(i - 64);
        }
    }

    @Override // defpackage.o97
    public long c(long j) {
        return ((tk4) this.c).e[(int) j] - this.b;
    }

    @Override // defpackage.zpj
    public void d(Exception exc) {
        int i = exc instanceof qo0 ? ((qo0) exc).a.a : 13;
        long j = this.b;
        Iterator it = ((xun) ((yks) this.c).d).c.d.iterator();
        while (it.hasNext()) {
            ((j2x) it.next()).b(j, i, null);
        }
    }

    @Override // defpackage.o97
    public long f(long j, long j2) {
        return ((tk4) this.c).d[(int) j];
    }

    @Override // defpackage.z5e
    public void g(gj3 gj3Var) {
        gj3Var.W((pn3) this.c);
    }

    @Override // defpackage.z5e
    public long getContentLength() {
        return this.b;
    }

    @Override // defpackage.z5e
    public String getContentType() {
        return "application/json";
    }

    @Override // defpackage.s2c
    public long getLength() {
        return ((s2c) this.c).getLength() - this.b;
    }

    @Override // defpackage.s2c
    public long getPosition() {
        return ((s2c) this.c).getPosition() - this.b;
    }

    @Override // defpackage.o97
    public long i(long j, long j2) {
        return 0L;
    }

    @Override // defpackage.o97
    public long j(long j, long j2) {
        return -9223372036854775807L;
    }

    @Override // defpackage.o97
    public whn k(long j) {
        return new whn(null, ((tk4) this.c).c[(int) j], r1.b[r7]);
    }

    @Override // defpackage.s2c
    public boolean l(byte[] bArr, int i, int i2, boolean z) {
        return ((s2c) this.c).l(bArr, i, i2, z);
    }

    @Override // defpackage.s2c
    public void m(long j, IOException iOException) {
        ((s2c) this.c).m(j + this.b, iOException);
    }

    @Override // defpackage.s2c
    public void n() {
        ((s2c) this.c).n();
    }

    @Override // defpackage.s2c
    public boolean o(byte[] bArr, int i, int i2, boolean z) {
        return ((s2c) this.c).o(bArr, 0, i2, z);
    }

    @Override // defpackage.o97
    public long p(long j, long j2) {
        tk4 tk4Var = (tk4) this.c;
        return dvt.e(tk4Var.e, j + this.b, true);
    }

    @Override // defpackage.ma7
    public int read(byte[] bArr, int i, int i2) {
        return ((s2c) this.c).read(bArr, i, i2);
    }

    @Override // defpackage.s2c
    public void readFully(byte[] bArr, int i, int i2) {
        ((s2c) this.c).readFully(bArr, i, i2);
    }

    @Override // defpackage.s2c
    public long s() {
        return ((s2c) this.c).s() - this.b;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                if (((au1) this.c) == null) {
                    return Long.toBinaryString(this.b);
                }
                return ((au1) this.c).toString() + "xx" + Long.toBinaryString(this.b);
            default:
                return super.toString();
        }
    }

    @Override // defpackage.s2c
    public void u(int i) {
        ((s2c) this.c).u(i);
    }

    @Override // defpackage.s2c
    public int v(int i) {
        return ((s2c) this.c).v(i);
    }

    @Override // defpackage.s2c
    public int w(byte[] bArr, int i, int i2) {
        return ((s2c) this.c).w(bArr, i, i2);
    }

    @Override // defpackage.f4c
    public pjc x() {
        return new eno(new d4c(this, null));
    }

    @Override // defpackage.s2c
    public void y(int i) {
        ((s2c) this.c).y(i);
    }

    @Override // defpackage.o97
    public long z(long j) {
        return ((tk4) this.c).a;
    }

    public /* synthetic */ au1(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    public au1(ExoPlayer exoPlayer) {
        this.a = 2;
        exoPlayer.getClass();
        this.c = exoPlayer;
    }

    public au1(long j) {
        this.a = 14;
        this.b = j;
        this.c = new ConcurrentHashMap();
    }

    public au1(mka mkaVar, long j) {
        this.a = 6;
        mkaVar.getClass();
        this.c = mkaVar;
        this.b = j;
    }

    public au1(ij3 ij3Var) {
        this.a = 8;
        ij3Var.getClass();
        this.c = ij3Var;
        this.b = 262144L;
    }

    public au1(s2c s2cVar, long j) {
        this.a = 12;
        this.c = s2cVar;
        vq1.v(s2cVar.getPosition() >= j);
        this.b = j;
    }

    public au1(ByteBuffer byteBuffer) {
        this.a = 7;
        this.b = 0L;
        this.c = byteBuffer;
    }

    public au1(pn3 pn3Var) {
        this.a = 4;
        this.c = pn3Var;
        this.b = pn3Var.d();
    }

    public /* synthetic */ au1(long j, Object obj, int i) {
        this.a = i;
        this.b = j;
        this.c = obj;
    }
}
