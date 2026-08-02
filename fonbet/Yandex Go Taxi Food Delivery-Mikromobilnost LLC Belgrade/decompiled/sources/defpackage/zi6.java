package defpackage;

import android.opengl.GLES20;
import android.opengl.GLES30;
import android.view.View;
import java.nio.Buffer;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

/* loaded from: classes10.dex */
public final class zi6 implements wi6, bx60, ii61 {
    public final /* synthetic */ int a = 3;
    public int b;
    public int c;
    public int w;
    public int x;
    public final Object y;

    public zi6(int i, Buffer buffer) {
        int[] iArr = {0};
        this.y = iArr;
        if (buffer != null) {
            if (!buffer.isDirect()) {
                ny61.g("If non-null, entries buffer must be a direct buffer");
                throw null;
            }
            if (buffer.limit() == 0) {
                buffer = null;
            }
        }
        this.b = i;
        this.c = 4;
        if (buffer == null) {
            this.w = 0;
            this.x = 0;
        } else {
            this.w = buffer.limit();
            this.x = buffer.limit();
        }
        try {
            GLES30.glBindVertexArray(0);
            pva1.i("Failed to unbind vertex array", "glBindVertexArray");
            GLES20.glGenBuffers(1, iArr, 0);
            pva1.i("Failed to generate buffers", "glGenBuffers");
            GLES20.glBindBuffer(i, iArr[0]);
            pva1.i("Failed to bind buffer object", "glBindBuffer");
            if (buffer != null) {
                buffer.rewind();
                GLES20.glBufferData(i, buffer.limit() * 4, buffer, 35048);
            }
            pva1.i("Failed to populate buffer object", "glBufferData");
        } catch (Throwable th) {
            f();
            throw th;
        }
    }

    @Override // defpackage.ii61
    public int a() {
        return -1;
    }

    @Override // defpackage.ii61
    public int b() {
        return this.b;
    }

    @Override // defpackage.ii61
    public int c() {
        dl81 dl81Var = (dl81) this.y;
        int i = this.c;
        if (i == 8) {
            return dl81Var.s();
        }
        if (i == 16) {
            return dl81Var.x();
        }
        int i2 = this.w;
        this.w = i2 + 1;
        if (i2 % 2 != 0) {
            return this.x & 15;
        }
        int s = dl81Var.s();
        this.x = s;
        return (s & PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC) >> 4;
    }

    public void d(int i, int i2) {
        long c = eja1.c(i, i2);
        ((yi6) this.y).u(i, i2, "");
        long f = p4a1.f(eja1.c(this.b, this.c), c);
        r(asy0.f(f));
        q(asy0.e(f));
        if (k()) {
            long f2 = p4a1.f(eja1.c(this.w, this.x), c);
            if (asy0.c(f2)) {
                this.w = -1;
                this.x = -1;
            } else {
                this.w = asy0.f(f2);
                this.x = asy0.e(f2);
            }
        }
    }

    @Override // defpackage.wi6
    public int e() {
        ef90 ef90Var = (ef90) this.y;
        int i = this.c;
        if (i == 8) {
            return ef90Var.y();
        }
        if (i == 16) {
            return ef90Var.E();
        }
        int i2 = this.w;
        this.w = i2 + 1;
        if (i2 % 2 != 0) {
            return this.x & 15;
        }
        int y = ef90Var.y();
        this.x = y;
        return (y & PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC) >> 4;
    }

    public void f() {
        int[] iArr = (int[]) this.y;
        if (iArr[0] != 0) {
            GLES20.glDeleteBuffers(1, iArr, 0);
            pva1.h("zi6", "Failed to free buffer object", "glDeleteBuffers");
            iArr[0] = 0;
        }
    }

    public char g(int i) {
        yi6 yi6Var = (yi6) this.y;
        qv4 qv4Var = (qv4) yi6Var.x;
        if (qv4Var != null && i >= yi6Var.b) {
            int a = qv4Var.b - qv4Var.a();
            int i2 = yi6Var.b;
            if (i >= a + i2) {
                return ((String) yi6Var.w).charAt(i - ((a - yi6Var.c) + i2));
            }
            int i3 = i - i2;
            int i4 = qv4Var.c;
            char[] cArr = (char[]) qv4Var.x;
            return i3 < i4 ? cArr[i3] : cArr[(i3 - i4) + qv4Var.w];
        }
        return ((String) yi6Var.w).charAt(i);
    }

    @Override // defpackage.wi6
    public int h() {
        return this.b;
    }

    public asy0 i() {
        if (k()) {
            return new asy0(eja1.c(this.w, this.x));
        }
        return null;
    }

    public int j() {
        int i = this.b;
        int i2 = this.c;
        if (i == i2) {
            return i2;
        }
        return -1;
    }

    public boolean k() {
        return this.w != -1;
    }

    public void l(int i, int i2, String str) {
        yi6 yi6Var = (yi6) this.y;
        if (i < 0 || i > yi6Var.h()) {
            ny61.i(b64.t(i, "start (", ") offset is outside of text region "), yi6Var.h());
            return;
        }
        if (i2 < 0 || i2 > yi6Var.h()) {
            ny61.i(b64.t(i2, "end (", ") offset is outside of text region "), yi6Var.h());
            return;
        }
        if (i > i2) {
            ny61.g(oyr.h(i, i2, "Do not set reversed range: ", " > "));
            return;
        }
        yi6Var.u(i, i2, str);
        r(str.length() + i);
        q(str.length() + i);
        this.w = -1;
        this.x = -1;
    }

    public void m(Buffer buffer) {
        int i = this.c;
        int i2 = this.b;
        if (buffer == null || buffer.limit() == 0) {
            this.w = 0;
            return;
        }
        if (!buffer.isDirect()) {
            ny61.g("If non-null, entries buffer must be a direct buffer");
            return;
        }
        GLES20.glBindBuffer(i2, ((int[]) this.y)[0]);
        pva1.i("Failed to bind vertex buffer object", "glBindBuffer");
        buffer.rewind();
        if (buffer.limit() <= this.x) {
            GLES20.glBufferSubData(i2, 0, buffer.limit() * i, buffer);
            pva1.i("Failed to populate vertex buffer object", "glBufferSubData");
            this.w = buffer.limit();
        } else {
            GLES20.glBufferData(i2, buffer.limit() * i, buffer, 35048);
            pva1.i("Failed to populate vertex buffer object", "glBufferData");
            this.w = buffer.limit();
            this.x = buffer.limit();
        }
    }

    public void n(int i, int i2) {
        yi6 yi6Var = (yi6) this.y;
        if (i < 0 || i > yi6Var.h()) {
            ny61.i(b64.t(i, "start (", ") offset is outside of text region "), yi6Var.h());
            return;
        }
        if (i2 < 0 || i2 > yi6Var.h()) {
            ny61.i(b64.t(i2, "end (", ") offset is outside of text region "), yi6Var.h());
        } else if (i >= i2) {
            ny61.g(oyr.h(i, i2, "Do not set reversed or empty range: ", " > "));
        } else {
            this.w = i;
            this.x = i2;
        }
    }

    @Override // defpackage.wi6
    public int o() {
        return -1;
    }

    @Override // defpackage.bx60
    public n751 onApplyWindowInsets(View view, n751 n751Var) {
        View view2 = (View) this.y;
        u1w g = n751Var.a.g(519);
        int i = this.b;
        if (i >= 0) {
            view2.getLayoutParams().height = i + g.b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.c + g.a, this.w + g.b, this.x + g.c, view2.getPaddingBottom());
        return n751Var;
    }

    public void p(int i, int i2) {
        yi6 yi6Var = (yi6) this.y;
        if (i < 0 || i > yi6Var.h()) {
            ny61.i(b64.t(i, "start (", ") offset is outside of text region "), yi6Var.h());
            return;
        }
        if (i2 < 0 || i2 > yi6Var.h()) {
            ny61.i(b64.t(i2, "end (", ") offset is outside of text region "), yi6Var.h());
        } else if (i > i2) {
            ny61.g(oyr.h(i, i2, "Do not set reversed range: ", " > "));
        } else {
            r(i);
            q(i2);
        }
    }

    public void q(int i) {
        if (!(i >= 0)) {
            jxv.a("Cannot set selectionEnd to a negative value: " + i);
        }
        this.c = i;
    }

    public void r(int i) {
        if (!(i >= 0)) {
            jxv.a("Cannot set selectionStart to a negative value: " + i);
        }
        this.b = i;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return ((yi6) this.y).toString();
            default:
                return super.toString();
        }
    }

    public zi6(hp81 hp81Var) {
        dl81 dl81Var = hp81Var.c;
        this.y = dl81Var;
        dl81Var.m(12);
        this.c = dl81Var.v() & 255;
        this.b = dl81Var.v();
    }

    public zi6(kk2 kk2Var, long j) {
        String str = kk2Var.b;
        yi6 yi6Var = new yi6((byte) 0, 4);
        yi6Var.w = str;
        yi6Var.b = -1;
        yi6Var.c = -1;
        this.y = yi6Var;
        this.b = asy0.f(j);
        this.c = asy0.e(j);
        this.w = -1;
        this.x = -1;
        int f = asy0.f(j);
        int e = asy0.e(j);
        if (f >= 0 && f <= str.length()) {
            if (e < 0 || e > str.length()) {
                ny61.i(b64.t(e, "end (", ") offset is outside of text region "), str.length());
                throw null;
            }
            if (f <= e) {
                return;
            }
            ny61.g(oyr.h(f, e, "Do not set reversed range: ", " > "));
            throw null;
        }
        ny61.i(b64.t(f, "start (", ") offset is outside of text region "), str.length());
        throw null;
    }

    public zi6(int i, int i2, int i3, int i4, View view) {
        this.b = i;
        this.y = view;
        this.c = i2;
        this.w = i3;
        this.x = i4;
    }

    public zi6(ub30 ub30Var) {
        ef90 ef90Var = ub30Var.c;
        this.y = ef90Var;
        ef90Var.K(12);
        this.c = ef90Var.C() & 255;
        this.b = ef90Var.C();
    }
}
