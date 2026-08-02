package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class mm3 implements ca7 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ mm3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ca7
    public final Class a() {
        switch (this.a) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.b.getClass();
        }
    }

    @Override // defpackage.ca7
    public final void b() {
        int i = this.a;
    }

    @Override // defpackage.ca7
    public final void cancel() {
        int i = this.a;
    }

    @Override // defpackage.ca7
    public final void d(nsm nsmVar, ba7 ba7Var) {
        switch (this.a) {
            case 0:
                try {
                    ba7Var.g(tm3.a((File) this.b));
                    break;
                } catch (IOException e) {
                    if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                        Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
                    }
                    ba7Var.c(e);
                    return;
                }
            default:
                ba7Var.g(this.b);
                break;
        }
    }

    @Override // defpackage.ca7
    public final int e() {
        switch (this.a) {
        }
        return 1;
    }

    private final void c() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }
}
