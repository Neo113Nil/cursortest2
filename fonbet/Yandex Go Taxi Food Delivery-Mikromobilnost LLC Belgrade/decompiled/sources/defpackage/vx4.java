package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes10.dex */
public abstract class vx4 implements og3 {
    public ng3 b;
    public ng3 c;
    public ng3 d;
    public ng3 e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public vx4() {
        ByteBuffer byteBuffer = og3.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        ng3 ng3Var = ng3.e;
        this.d = ng3Var;
        this.e = ng3Var;
        this.b = ng3Var;
        this.c = ng3Var;
    }

    @Override // defpackage.og3
    public final void b() {
        this.h = true;
        g();
    }

    @Override // defpackage.og3
    public ByteBuffer c() {
        ByteBuffer byteBuffer = this.g;
        this.g = og3.a;
        return byteBuffer;
    }

    @Override // defpackage.og3
    public final ng3 d(ng3 ng3Var) {
        this.d = ng3Var;
        this.e = e(ng3Var);
        return isActive() ? this.e : ng3.e;
    }

    public ng3 e(ng3 ng3Var) {
        return ng3.e;
    }

    public void f() {
    }

    @Override // defpackage.og3
    public final void flush() {
        this.g = og3.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        f();
    }

    public void g() {
    }

    public void h() {
    }

    public final ByteBuffer i(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    @Override // defpackage.og3
    public boolean isActive() {
        return this.e != ng3.e;
    }

    @Override // defpackage.og3
    public boolean isEnded() {
        return this.h && this.g == og3.a;
    }

    @Override // defpackage.og3
    public final void reset() {
        flush();
        this.f = og3.a;
        ng3 ng3Var = ng3.e;
        this.d = ng3Var;
        this.e = ng3Var;
        this.b = ng3Var;
        this.c = ng3Var;
        h();
    }
}
