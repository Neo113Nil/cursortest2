package defpackage;

import androidx.camera.camera2.internal.compat.quirk.Preview3AThreadCrashQuirk;
import androidx.camera.camera2.internal.compat.quirk.UseTorchAsFlashQuirk;
import androidx.media3.container.a;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class w7o implements v7o, o671 {
    public final boolean a;

    public w7o(kr60 kr60Var, jr60 jr60Var) {
        int i = jr60Var.a;
        ByteBuffer byteBuffer = jr60Var.b;
        d6z.l(i == 6 || i == 3);
        int min = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[min];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        df90 df90Var = new df90(bArr, min);
        a.a(kr60Var.a);
        if (df90Var.f()) {
            this.a = false;
            return;
        }
        int g = df90Var.g(2);
        boolean f = df90Var.f();
        a.a(kr60Var.b);
        if (!f) {
            this.a = true;
            return;
        }
        boolean f2 = (g == 3 || g == 0) ? true : df90Var.f();
        df90Var.n();
        a.a(!kr60Var.d);
        if (df90Var.f()) {
            a.a(!kr60Var.e);
            df90Var.n();
        }
        a.a(kr60Var.c);
        if (g != 3) {
            df90Var.n();
        }
        df90Var.o(kr60Var.f);
        if (g != 2 && g != 0 && !f2) {
            df90Var.o(3);
        }
        this.a = ((g == 3 || g == 0) ? 255 : df90Var.g(8)) != 0;
    }

    @Override // defpackage.o671
    public String a() {
        return String.format("viewable: %s", Arrays.copyOf(new Object[]{Boolean.valueOf(this.a)}, 1));
    }

    @Override // defpackage.v7o
    public boolean b() {
        return this.a;
    }

    public w7o(d881 d881Var) {
        this.a = jl40.l(d881Var.t, "loading_on_show") || jl40.l(d881Var.t, "loading_on_back");
    }

    public w7o(b2w b2wVar) {
        this.a = !((a2w) b2wVar.b.a.getValue()).a();
    }

    public w7o(a73 a73Var, int i) {
        switch (i) {
            case 4:
                this.a = a73Var.a(UseTorchAsFlashQuirk.class);
                break;
            default:
                this.a = a73Var.a(Preview3AThreadCrashQuirk.class);
                break;
        }
    }

    public /* synthetic */ w7o(boolean z) {
        this.a = z;
    }
}
