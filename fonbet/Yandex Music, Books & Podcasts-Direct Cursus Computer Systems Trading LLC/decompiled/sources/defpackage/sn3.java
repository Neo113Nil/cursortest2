package defpackage;

import android.graphics.Bitmap;
import java.io.File;

/* loaded from: classes.dex */
public final class sn3 implements k2o {
    public final /* synthetic */ int a = 2;
    public final Object b;

    public sn3(byte[] bArr) {
        w1g.s(bArr, "Argument must not be null");
        this.b = bArr;
    }

    @Override // defpackage.k2o
    public final int f() {
        switch (this.a) {
            case 0:
                return ((byte[]) this.b).length;
            case 1:
                return 1;
            default:
                return xut.c((Bitmap) this.b);
        }
    }

    @Override // defpackage.k2o
    public final void g() {
        int i = this.a;
    }

    @Override // defpackage.k2o
    public final Object get() {
        switch (this.a) {
            case 0:
                return (byte[]) this.b;
            case 1:
                return (File) this.b;
            default:
                return (Bitmap) this.b;
        }
    }

    @Override // defpackage.k2o
    public final Class h() {
        switch (this.a) {
            case 0:
                return byte[].class;
            case 1:
                return ((File) this.b).getClass();
            default:
                return Bitmap.class;
        }
    }

    public sn3(File file) {
        w1g.s(file, "Argument must not be null");
        this.b = file;
    }

    public sn3(Bitmap bitmap) {
        this.b = bitmap;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }
}
