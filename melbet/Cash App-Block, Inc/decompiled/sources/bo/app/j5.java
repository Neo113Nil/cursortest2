package bo.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public final class j5 {
    public final d7 a;
    public final boolean[] b;
    public boolean c;
    public final /* synthetic */ l5 d;

    public j5(l5 l5Var, d7 d7Var) {
        this.d = l5Var;
        this.a = d7Var;
        this.b = d7Var.c ? null : new boolean[l5Var.g];
    }

    public final OutputStream a() {
        FileOutputStream fileOutputStream;
        i5 i5Var;
        l5 l5Var = this.d;
        if (l5Var.g <= 0) {
            a$$ExternalSyntheticBUOutline0.m(this.d.g, "Expected index 0 to be greater than 0 and less than the maximum value count of ");
            return null;
        }
        synchronized (l5Var) {
            try {
                d7 d7Var = this.a;
                if (d7Var.d != this) {
                    throw new IllegalStateException();
                }
                if (!d7Var.c) {
                    this.b[0] = true;
                }
                File a = d7Var.a(0);
                try {
                    fileOutputStream = new FileOutputStream(a);
                } catch (FileNotFoundException unused) {
                    this.d.a.mkdirs();
                    try {
                        fileOutputStream = new FileOutputStream(a);
                    } catch (FileNotFoundException unused2) {
                        return l5.q;
                    }
                }
                i5Var = new i5(this, fileOutputStream);
            } catch (Throwable th) {
                throw th;
            }
        }
        return i5Var;
    }
}
