package defpackage;

import io.requery.android.database.sqlite.SQLiteDatabase;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class yzj extends cq2 {
    public final c5p i;
    public final zzp j;
    public ByteBuffer k;
    public long l;
    public int m;
    public int n;
    public int o;
    public int p;

    public yzj(c5p c5pVar, zzp zzpVar) {
        this.i = c5pVar;
        this.j = zzpVar;
        ByteBuffer byteBuffer = vx1.a;
        byteBuffer.getClass();
        this.k = byteBuffer;
        this.o = -1;
        this.p = -1;
    }

    @Override // defpackage.dq2
    public final tx1 a(tx1 tx1Var) {
        if (tx1Var.c != 2) {
            throw new ux1(tx1Var);
        }
        int i = tx1Var.b;
        this.o = i * 4;
        int i2 = i * SQLiteDatabase.OPEN_FULLMUTEX;
        this.p = i2;
        ByteBuffer order = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
        order.getClass();
        this.k = order;
        return tx1Var;
    }

    @Override // defpackage.vx1
    public final void d(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        Integer valueOf = Integer.valueOf(remaining);
        if (remaining == 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            c5p c5pVar = this.i;
            if (((Number) ((xy1) c5pVar.b).f.i().getValue()).intValue() != 0) {
                long b = this.j.b();
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                if (this.l == 0) {
                    this.l = b;
                }
                if (this.m < this.o && b - this.l >= 0) {
                    int remaining2 = this.k.remaining();
                    ByteBuffer byteBuffer2 = this.k;
                    if (intValue <= remaining2) {
                        byteBuffer2.put(asReadOnlyBuffer);
                        this.m++;
                        this.n += intValue;
                    } else {
                        ssg.a(4, "PCMAudioStreamAudioProcessor", f1d.e(byteBuffer2.remaining(), intValue, "bufferOverflow sampleBufferRemaining=", ", inputBufferRemaining="), null);
                    }
                }
                if (this.m == this.o || b - this.l >= 100) {
                    long j = this.l;
                    if (b - j < 100) {
                        b = j + 100;
                    }
                    this.l = b;
                    this.k.position(0);
                    this.k.limit(this.n);
                    this.m = 0;
                    this.n = 0;
                    ByteBuffer byteBuffer3 = this.k;
                    tx1 tx1Var = this.b;
                    int i = tx1Var.a;
                    int i2 = tx1Var.b;
                    byteBuffer3.getClass();
                    xy1 xy1Var = (xy1) c5pVar.b;
                    xy1Var.d = i;
                    xy1Var.c = i2;
                    xy1Var.f.a(byteBuffer3);
                    xy1Var.g.a(Unit.a);
                    ByteBuffer order = ByteBuffer.allocateDirect(this.p).order(ByteOrder.nativeOrder());
                    order.getClass();
                    this.k = order;
                }
            } else {
                this.l = 0L;
                this.m = 0;
                this.n = 0;
                this.k.clear();
            }
            k(intValue).put(byteBuffer).flip();
        }
    }

    @Override // defpackage.dq2
    public final void j() {
        xy1 xy1Var = (xy1) this.i.b;
        x0q x0qVar = xy1Var.f;
        if (((Number) x0qVar.i().getValue()).intValue() != 0) {
            dxa dxaVar = (dxa) xy1Var.b.getValue();
            dxaVar.getClass();
            dxaVar.a = new axq(60, 10.0f);
            dxaVar.b = new axq(40, 3.0f);
            dxaVar.c = new axq(20, 1.0f);
        }
        ByteBuffer byteBuffer = xy1.h;
        byteBuffer.getClass();
        x0qVar.a(byteBuffer);
        xy1Var.e.set(true);
        this.l = 0L;
        this.m = 0;
        this.n = 0;
        this.k.clear();
    }
}
