package defpackage;

import android.media.MediaDrmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class y2n implements mno {
    @Override // defpackage.mno
    public final void closeSession(byte[] bArr) {
    }

    @Override // defpackage.mno
    public final rcf createCryptoConfig(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // defpackage.mno
    public final int getCryptoType() {
        return 1;
    }

    @Override // defpackage.mno
    public final gno getKeyRequest(byte[] bArr, List list, int i, HashMap hashMap) {
        throw new IllegalStateException();
    }

    @Override // defpackage.mno
    public final lno getProvisionRequest() {
        throw new IllegalStateException();
    }

    @Override // defpackage.mno
    public final byte[] openSession() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // defpackage.mno
    public final byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // defpackage.mno
    public final void provideProvisionResponse(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // defpackage.mno
    public final Map queryKeyStatus(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // defpackage.mno
    public final void release() {
    }

    @Override // defpackage.mno
    public final boolean requiresSecureDecoder(byte[] bArr, String str) {
        throw new IllegalStateException();
    }

    @Override // defpackage.mno
    public final void restoreKeys(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // defpackage.mno
    public final void setOnEventListener(hno hnoVar) {
    }
}
