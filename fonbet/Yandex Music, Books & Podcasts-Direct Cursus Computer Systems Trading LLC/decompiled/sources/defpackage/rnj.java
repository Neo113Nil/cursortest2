package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import kotlin.KotlinVersion;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class rnj implements zg3, nw0, tzt {
    public static final byte[] e = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};
    public static final byte[] f = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public Object d;

    public rnj(vfi vfiVar, dsc dscVar) {
        this.a = 1;
        d7k d7kVar = vfiVar.g;
        this.d = d7kVar;
        d7kVar.H(12);
        int z = d7kVar.z();
        if ("audio/raw".equals(dscVar.n)) {
            int v = dvt.v(dscVar.F) * dscVar.D;
            if (z == 0 || z % v != 0) {
                vq1.n0("BoxParsers", "Audio sample size mismatch. stsd sample size: " + v + ", stsz sample size: " + z);
                z = v;
            }
        }
        this.b = z == 0 ? -1 : z;
        this.c = d7kVar.z();
    }

    public static void t(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        long j2 = i2;
        o2g.I("out of range: %s", j2, (j2 >> 8) == 0);
        byteBuffer.put((byte) j2);
    }

    @Override // defpackage.rzt
    public cn0 A(long j, cn0 cn0Var, cn0 cn0Var2, cn0 cn0Var3) {
        return ((bjt) this.d).A(j, cn0Var, cn0Var2, cn0Var3);
    }

    @Override // defpackage.nw0
    public Object b() {
        return ((nw0) this.d).b();
    }

    @Override // defpackage.nw0
    public void c(int i, int i2, int i3) {
        int i4 = this.c == 0 ? this.b : 0;
        ((nw0) this.d).c(i + i4, i2 + i4, i3);
    }

    @Override // defpackage.nw0
    public void d(int i, int i2) {
        ((nw0) this.d).d(i + (this.c == 0 ? this.b : 0), i2);
    }

    @Override // defpackage.nw0
    public void e(int i, Object obj) {
        ((nw0) this.d).e(i + (this.c == 0 ? this.b : 0), obj);
    }

    @Override // defpackage.zg3
    public int g() {
        int i = this.b;
        return i == -1 ? ((d7k) this.d).z() : i;
    }

    @Override // defpackage.nw0
    public void h(int i, Object obj) {
        ((nw0) this.d).h(i + (this.c == 0 ? this.b : 0), obj);
    }

    @Override // defpackage.nw0
    public void i(Object obj) {
        this.c++;
        ((nw0) this.d).i(obj);
    }

    @Override // defpackage.zg3
    public int k() {
        return this.b;
    }

    @Override // defpackage.nw0
    public void l() {
        if (this.c <= 0) {
            pq5.c("OffsetApplier up called with no corresponding down");
        }
        this.c--;
        ((nw0) this.d).l();
    }

    @Override // defpackage.zg3
    public int n() {
        return this.c;
    }

    @Override // defpackage.tzt
    public int o() {
        return this.c;
    }

    public byte p(int i, int i2) {
        return ((byte[][]) this.d)[i2][i];
    }

    public void q(qg7 qg7Var, List list) {
        int i;
        ByteBuffer byteBuffer;
        qg7Var.i.getClass();
        if (qg7Var.i.limit() - qg7Var.i.position() == 0) {
            return;
        }
        byte[] bArr = (this.b == 2 && (list.size() == 1 || list.size() == 3)) ? (byte[]) list.get(0) : null;
        ByteBuffer byteBuffer2 = qg7Var.i;
        int position = byteBuffer2.position();
        int limit = byteBuffer2.limit();
        int i2 = limit - position;
        int i3 = (i2 + KotlinVersion.MAX_COMPONENT_VALUE) / KotlinVersion.MAX_COMPONENT_VALUE;
        int i4 = i3 + 27 + i2;
        if (this.b == 2) {
            int length = bArr != null ? bArr.length + 28 : 47;
            i4 += length + 44;
            i = length;
        } else {
            i = 0;
        }
        if (((ByteBuffer) this.d).capacity() < i4) {
            this.d = ByteBuffer.allocate(i4).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            ((ByteBuffer) this.d).clear();
        }
        ByteBuffer byteBuffer3 = (ByteBuffer) this.d;
        if (this.b == 2) {
            if (bArr != null) {
                t(byteBuffer3, 0L, 0, 1, true);
                byteBuffer = byteBuffer3;
                long length2 = bArr.length;
                o2g.I("out of range: %s", length2, (length2 >> 8) == 0);
                byteBuffer.put((byte) length2);
                byteBuffer.put(bArr);
                byteBuffer.putInt(22, dvt.o(byteBuffer.arrayOffset(), bArr.length + 28, 0, byteBuffer.array()));
                byteBuffer.position(bArr.length + 28);
            } else {
                byteBuffer = byteBuffer3;
                byteBuffer.put(e);
            }
            byteBuffer.put(f);
        } else {
            byteBuffer = byteBuffer3;
        }
        int M = this.c + ((int) ((u7g.M(byteBuffer2.get(0), byteBuffer2.limit() > 1 ? byteBuffer2.get(1) : (byte) 0) * 48000) / 1000000));
        this.c = M;
        t(byteBuffer, M, this.b, i3, false);
        for (int i5 = 0; i5 < i3; i5++) {
            if (i2 >= 255) {
                byteBuffer.put((byte) -1);
                i2 -= 255;
            } else {
                byteBuffer.put((byte) i2);
                i2 = 0;
            }
        }
        while (position < limit) {
            byteBuffer.put(byteBuffer2.get(position));
            position++;
        }
        byteBuffer2.position(byteBuffer2.limit());
        byteBuffer.flip();
        if (this.b == 2) {
            byteBuffer.putInt(i + 66, dvt.o(byteBuffer.arrayOffset() + i + 44, byteBuffer.limit() - byteBuffer.position(), 0, byteBuffer.array()));
        } else {
            byteBuffer.putInt(22, dvt.o(byteBuffer.arrayOffset(), byteBuffer.limit() - byteBuffer.position(), 0, byteBuffer.array()));
        }
        this.b++;
        this.d = byteBuffer;
        qg7Var.z();
        qg7Var.B(((ByteBuffer) this.d).remaining());
        qg7Var.i.put((ByteBuffer) this.d);
        qg7Var.C();
    }

    public void r(int i, int i2, int i3) {
        ((byte[][]) this.d)[i2][i] = (byte) i3;
    }

    public void s(int i, int i2, boolean z) {
        ((byte[][]) this.d)[i2][i] = z ? (byte) 1 : (byte) 0;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                int i = this.b;
                int i2 = this.c;
                StringBuilder sb = new StringBuilder((i * 2 * i2) + 2);
                for (int i3 = 0; i3 < i2; i3++) {
                    byte[] bArr = ((byte[][]) this.d)[i3];
                    for (int i4 = 0; i4 < i; i4++) {
                        byte b = bArr[i4];
                        if (b == 0) {
                            sb.append(" 0");
                        } else if (b != 1) {
                            sb.append("  ");
                        } else {
                            sb.append(" 1");
                        }
                    }
                    sb.append('\n');
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.tzt
    public int u() {
        return this.b;
    }

    public synchronized int w() {
        PackageInfo packageInfo;
        if (this.b == 0) {
            try {
                packageInfo = b6w.a((Context) this.d).b.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e2) {
                Log.w("Metadata", "Failed to find package ".concat(e2.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.b = packageInfo.versionCode;
            }
        }
        return this.b;
    }

    @Override // defpackage.rzt
    public cn0 x(long j, cn0 cn0Var, cn0 cn0Var2, cn0 cn0Var3) {
        return ((bjt) this.d).x(j, cn0Var, cn0Var2, cn0Var3);
    }

    public synchronized int y() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        Context context = (Context) this.d;
        PackageManager packageManager = context.getPackageManager();
        if (b6w.a(context).b.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i2 = 1;
        if (!fxf.F()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                this.c = i2;
                return i2;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
            i2 = 2;
            this.c = i2;
            return i2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (true == fxf.F()) {
            i2 = 2;
        }
        this.c = i2;
        return i2;
    }

    public rnj(int i, int i2, int i3) {
        this.a = i3;
        switch (i3) {
            case 4:
                this.d = null;
                this.b = i;
                int i4 = i2 & 7;
                this.c = i4 == 0 ? 8 : i4;
                break;
            case 5:
                this.d = null;
                this.b = i;
                int i5 = i2 & 7;
                this.c = i5 == 0 ? 8 : i5;
                break;
            default:
                this.d = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i2, i);
                this.b = i;
                this.c = i2;
                break;
        }
    }

    public rnj(int i) {
        this.a = i;
        switch (i) {
            case 4:
                this.d = new rnj[256];
                this.b = 0;
                this.c = 0;
                break;
            case 5:
                this.d = new rnj[256];
                this.b = 0;
                this.c = 0;
                break;
            case 6:
            case 7:
            default:
                this.d = vx1.a;
                this.c = 0;
                this.b = 2;
                break;
            case 8:
                break;
        }
    }

    public rnj(nw0 nw0Var, int i) {
        this.a = 6;
        this.d = nw0Var;
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public rnj(Function0 function0, int i, int i2) {
        this.a = 7;
        this.b = i;
        this.c = i2;
        this.d = (uif) function0;
    }

    public rnj(int i, int i2, kya kyaVar) {
        this.a = 9;
        this.b = i;
        this.c = i2;
        this.d = new bjt(new djc(i, i2, kyaVar));
    }

    public rnj(int i, int i2, SparseArray sparseArray) {
        this.a = 3;
        this.b = i;
        this.c = i2;
        this.d = sparseArray;
    }

    public rnj(Context context) {
        this.a = 10;
        this.c = 0;
        this.d = context;
    }
}
