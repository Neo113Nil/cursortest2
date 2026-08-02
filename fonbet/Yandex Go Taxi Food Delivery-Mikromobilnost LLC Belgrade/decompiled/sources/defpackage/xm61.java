package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes7.dex */
public abstract class xm61 implements lv81 {
    public mp81 b;
    public mp81 c;
    public mp81 d;
    public mp81 e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public xm61() {
        ByteBuffer byteBuffer = lv81.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        mp81 mp81Var = mp81.e;
        this.d = mp81Var;
        this.e = mp81Var;
        this.b = mp81Var;
        this.c = mp81Var;
    }

    @Override // defpackage.lv81
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.g;
        this.g = lv81.a;
        return byteBuffer;
    }

    @Override // defpackage.lv81
    public final mp81 b(mp81 mp81Var) {
        this.d = mp81Var;
        this.e = d(mp81Var);
        return isActive() ? this.e : mp81.e;
    }

    public final ByteBuffer c(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    public abstract mp81 d(mp81 mp81Var);

    @Override // defpackage.lv81
    public final void d() {
        flush();
        this.f = lv81.a;
        mp81 mp81Var = mp81.e;
        this.d = mp81Var;
        this.e = mp81Var;
        this.b = mp81Var;
        this.c = mp81Var;
        g();
    }

    public void e() {
    }

    public void f() {
    }

    @Override // defpackage.lv81
    public final void flush() {
        this.g = lv81.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        e();
    }

    public void g() {
    }

    @Override // defpackage.lv81
    public boolean isActive() {
        return this.e != mp81.e;
    }

    @Override // defpackage.lv81
    public final void b() {
        this.h = true;
        f();
    }

    @Override // defpackage.lv81
    public boolean c() {
        return this.h && this.g == lv81.a;
    }
}
