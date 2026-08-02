package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicIntegerArray;
import okhttp3.Protocol;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes9.dex */
public final class suu implements pyl0 {
    public final /* synthetic */ int a = 0;
    public int b;
    public final Serializable c;
    public final Object d;

    public suu(AtomicIntegerArray atomicIntegerArray, po6 po6Var) {
        this.c = atomicIntegerArray;
        this.d = po6Var;
        atomicIntegerArray.length();
        f();
    }

    @Override // defpackage.pyl0
    public boolean a() {
        d();
        return true;
    }

    @Override // defpackage.pyl0
    public int b() {
        d();
        return this.b;
    }

    @Override // defpackage.pyl0
    public int c() {
        d();
        po6 po6Var = (po6) this.d;
        return po6Var.a[this.b];
    }

    @Override // defpackage.pyl0
    public boolean d() {
        return this.b >= ((AtomicIntegerArray) this.c).length();
    }

    @Override // defpackage.pyl0
    public long e() {
        d();
        po6 po6Var = (po6) this.d;
        return po6Var.a[this.b + 1];
    }

    public void f() {
        AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) this.c;
        if (d()) {
            return;
        }
        while (this.b < atomicIntegerArray.length() && atomicIntegerArray.get(this.b) == 0) {
            this.b++;
        }
    }

    @Override // defpackage.pyl0
    public int getCount() {
        d();
        return ((AtomicIntegerArray) this.c).get(this.b);
    }

    @Override // defpackage.pyl0
    public void next() {
        d();
        this.b++;
        f();
    }

    public String toString() {
        switch (this.a) {
            case 2:
                StringBuilder sb = new StringBuilder();
                if (((Protocol) this.d) == Protocol.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(HexString.CHAR_SPACE);
                sb.append(this.b);
                sb.append(HexString.CHAR_SPACE);
                sb.append((String) this.c);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public suu(Protocol protocol, int i, String str) {
        this.d = protocol;
        this.b = i;
        this.c = str;
    }

    public suu(int i, String str, byte[] bArr) {
        this.b = i;
        this.c = str;
        this.d = bArr;
    }
}
