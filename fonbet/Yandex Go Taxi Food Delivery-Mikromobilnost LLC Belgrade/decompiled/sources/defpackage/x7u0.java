package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes10.dex */
public final class x7u0 implements kpg {
    public final kpg a;
    public long b;
    public Uri c;
    public Map w;

    public x7u0(kpg kpgVar) {
        kpgVar.getClass();
        this.a = kpgVar;
        this.c = Uri.EMPTY;
        this.w = Collections.EMPTY_MAP;
    }

    @Override // defpackage.kpg
    public final void addTransferListener(cj01 cj01Var) {
        cj01Var.getClass();
        this.a.addTransferListener(cj01Var);
    }

    @Override // defpackage.kpg
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.kpg
    public final Map getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override // defpackage.kpg
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.kpg
    public final long open(npg npgVar) {
        kpg kpgVar = this.a;
        this.c = npgVar.a;
        this.w = Collections.EMPTY_MAP;
        try {
            return kpgVar.open(npgVar);
        } finally {
            Uri uri = kpgVar.getUri();
            if (uri != null) {
                this.c = uri;
            }
            this.w = kpgVar.getResponseHeaders();
        }
    }

    @Override // defpackage.apg
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.a.read(bArr, i, i2);
        if (read != -1) {
            this.b += read;
        }
        return read;
    }
}
