package defpackage;

import android.net.Uri;
import java.io.IOException;

/* loaded from: classes10.dex */
public final class s3c0 implements kpg {
    public static final s3c0 a = new s3c0();

    @Override // defpackage.kpg
    public final void addTransferListener(cj01 cj01Var) {
    }

    @Override // defpackage.kpg
    public final void close() {
    }

    @Override // defpackage.kpg
    public final Uri getUri() {
        return null;
    }

    @Override // defpackage.kpg
    public final long open(npg npgVar) {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // defpackage.apg
    public final int read(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }
}
