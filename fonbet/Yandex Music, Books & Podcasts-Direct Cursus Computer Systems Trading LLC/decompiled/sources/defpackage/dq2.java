package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public abstract class dq2 implements vx1 {
    public tx1 b;
    public tx1 c;
    public tx1 d;
    public tx1 e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public dq2() {
        ByteBuffer byteBuffer = vx1.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        tx1 tx1Var = tx1.e;
        this.d = tx1Var;
        this.e = tx1Var;
        this.b = tx1Var;
        this.c = tx1Var;
    }

    public abstract tx1 a(tx1 tx1Var);

    @Override // defpackage.vx1
    public boolean b() {
        return this.e != tx1.e;
    }

    @Override // defpackage.vx1
    public ByteBuffer c() {
        ByteBuffer byteBuffer = this.g;
        this.g = vx1.a;
        return byteBuffer;
    }

    @Override // defpackage.vx1
    public final tx1 e(tx1 tx1Var) {
        this.d = tx1Var;
        this.e = a(tx1Var);
        return b() ? this.e : tx1.e;
    }

    @Override // defpackage.vx1
    public final void f() {
        this.h = true;
        i();
    }

    @Override // defpackage.vx1
    public final void flush() {
        this.g = vx1.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        h();
    }

    @Override // defpackage.vx1
    public boolean g() {
        return this.h && this.g == vx1.a;
    }

    public final ByteBuffer k(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    @Override // defpackage.vx1
    public final void reset() {
        flush();
        this.f = vx1.a;
        tx1 tx1Var = tx1.e;
        this.d = tx1Var;
        this.e = tx1Var;
        this.b = tx1Var;
        this.c = tx1Var;
        j();
    }

    public void h() {
    }

    public void i() {
    }

    public void j() {
    }
}
