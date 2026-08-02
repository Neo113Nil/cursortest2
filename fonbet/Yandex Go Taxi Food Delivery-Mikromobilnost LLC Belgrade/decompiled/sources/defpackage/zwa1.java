package defpackage;

import android.util.Pair;
import androidx.compose.runtime.f;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.shortcuts.dto.request.KnownOrderInfo;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public abstract class zwa1 {
    public static au2 a;

    public static final void a(f530 f530Var, qor qorVar, qor qorVar2, qor qorVar3, wls wlsVar, a aVar, wls wlsVar2, fid fidVar, int i) {
        wls wlsVar3;
        wls wlsVar4;
        wls wlsVar5;
        qor qorVar4;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1189449480);
        int i2 = i | (btsVar.k(qorVar) ? 32 : 16) | (btsVar.k(qorVar2) ? 256 : 128) | HProv.ALG_TYPE_SECURECHANNEL;
        if (btsVar.V(i2 & 1, (599187 & i2) != 599186)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.f(0.0f);
                btsVar.o0(Q);
            }
            qorVar4 = (tx40) Q;
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object Q2 = btsVar.Q();
            if (z || Q2 == o430Var) {
                Q2 = new dg2(qorVar, qorVar2, qorVar4);
                btsVar.o0(Q2);
            }
            z910 z910Var = (z910) Q2;
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, f530Var);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, z910Var);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            wlsVar3 = wlsVar;
            wlsVar3.invoke(btsVar, 6);
            wlsVar4 = aVar;
            wlsVar4.invoke(btsVar, 6);
            wlsVar5 = wlsVar2;
            wlsVar5.invoke(btsVar, 6);
            btsVar.t(true);
        } else {
            wlsVar3 = wlsVar;
            wlsVar4 = aVar;
            wlsVar5 = wlsVar2;
            btsVar.Y();
            qorVar4 = qorVar3;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new et0(f530Var, qorVar, qorVar2, qorVar4, wlsVar3, wlsVar4, wlsVar5, i, 2);
        }
    }

    public static final KnownOrderInfo b(kx70 kx70Var) {
        return new KnownOrderInfo(kx70Var.a, kx70Var.b.getAlias(), kx70Var.c, kx70Var.e, kx70Var.f, kx70Var.g);
    }

    public static Pair c(RandomAccessFile randomAccessFile, int i) {
        int i2;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(((int) Math.min(i, (-22) + length)) + 22);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        long capacity = length - allocate.capacity();
        randomAccessFile.seek(capacity);
        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
        d(allocate);
        int capacity2 = allocate.capacity();
        if (capacity2 >= 22) {
            int i3 = capacity2 - 22;
            int min = Math.min(i3, 65535);
            for (int i4 = 0; i4 < min; i4++) {
                i2 = i3 - i4;
                if (allocate.getInt(i2) == 101010256 && ((char) allocate.getShort(i2 + 20)) == i4) {
                    break;
                }
            }
        }
        i2 = -1;
        if (i2 == -1) {
            return null;
        }
        allocate.position(i2);
        ByteBuffer slice = allocate.slice();
        slice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(slice, Long.valueOf(capacity + i2));
    }

    public static void d(ByteBuffer byteBuffer) {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
            return;
        }
        ny61.g("ByteBuffer byte order must be little endian");
    }
}
