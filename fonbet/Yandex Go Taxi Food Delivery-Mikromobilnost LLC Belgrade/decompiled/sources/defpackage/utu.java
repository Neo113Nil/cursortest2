package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import ru.CryptoPro.JCP.VMInspector.OpenList;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes9.dex */
public final class utu extends stu {
    public long x;
    public boolean y;
    public final /* synthetic */ xtu z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public utu(xtu xtuVar, kwu kwuVar) {
        super(xtuVar, kwuVar);
        this.z = xtuVar;
        this.x = -1L;
        this.y = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (this.c) {
            return;
        }
        if (this.y) {
            try {
                z = bg61.h(this, 100);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                this.z.b.b();
                a(xtu.f);
            }
        }
        this.c = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e3, code lost:
    
        if (r16.y == false) goto L52;
     */
    @Override // defpackage.stu, defpackage.y9t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long read(yp6 yp6Var, long j) {
        byte e;
        xtu xtuVar = this.z;
        jb7 jb7Var = xtuVar.c;
        if (j < 0) {
            w511.f(qv10.j(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.c) {
            ny61.r("closed");
            return 0L;
        }
        if (this.y) {
            long j2 = this.x;
            if (j2 == 0 || j2 == -1) {
                if (j2 != -1) {
                    ((jci0) jb7Var.c).w1();
                }
                try {
                    jci0 jci0Var = (jci0) jb7Var.c;
                    yp6 yp6Var2 = jci0Var.b;
                    jci0Var.B1(1L);
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        if (!jci0Var.S(i2)) {
                            break;
                        }
                        e = yp6Var2.e(i);
                        if ((e < 48 || e > 57) && ((e < 97 || e > 102) && (e < 65 || e > 70))) {
                            break;
                        }
                        i = i2;
                    }
                    if (i == 0) {
                        rza.a(16);
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(Integer.toString(e, 16)));
                    }
                    this.x = yp6Var2.P();
                    String obj = evu0.k0(((jci0) jb7Var.c).j1(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED)).toString();
                    if (this.x < 0 || (obj.length() > 0 && !cvu0.x(obj, ";", false))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.x + obj + OpenList.CHAR_QUOTE);
                    }
                    if (this.x == 0) {
                        this.y = false;
                        jpb jpbVar = xtuVar.e;
                        keu keuVar = new keu();
                        while (true) {
                            String j1 = ((qq6) jpbVar.c).j1(jpbVar.b);
                            jpbVar.b -= j1.length();
                            if (j1.length() == 0) {
                                break;
                            }
                            keuVar.b(j1);
                        }
                        a(keuVar.d());
                    }
                } catch (NumberFormatException e2) {
                    throw new ProtocolException(e2.getMessage());
                }
            }
            long read = super.read(yp6Var, Math.min(j, this.x));
            if (read != -1) {
                this.x -= read;
                return read;
            }
            xtuVar.b.b();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a(xtu.f);
            throw protocolException;
        }
        return -1L;
    }
}
