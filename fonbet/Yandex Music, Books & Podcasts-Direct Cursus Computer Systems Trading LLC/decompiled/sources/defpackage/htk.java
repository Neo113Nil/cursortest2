package defpackage;

import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes5.dex */
public final class htk extends ntk {
    public final ime e;
    public final ime f;
    public final ime g;
    public final ime h;
    public final int i;

    public htk(ime imeVar, ime imeVar2, ime imeVar3, ime imeVar4, Provider provider, int i) {
        super(provider);
        this.e = imeVar;
        this.f = imeVar2;
        this.g = imeVar3;
        this.h = imeVar4;
        this.i = i;
    }

    @Override // defpackage.ntk
    public final void c(SSLSocket sSLSocket, String str, List list) {
        if (str != null) {
            this.e.z(sSLSocket, Boolean.TRUE);
            this.f.z(sSLSocket, str);
        }
        Class<?> cls = sSLSocket.getClass();
        ime imeVar = this.h;
        if (imeVar.t(cls) != null) {
            imeVar.A(sSLSocket, ntk.b(list));
        }
    }

    @Override // defpackage.ntk
    public final String d(SSLSocket sSLSocket) {
        byte[] bArr;
        Class<?> cls = sSLSocket.getClass();
        ime imeVar = this.g;
        if (imeVar.t(cls) == null || (bArr = (byte[]) imeVar.A(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, bvt.b);
    }

    @Override // defpackage.ntk
    public final int e() {
        return this.i;
    }
}
