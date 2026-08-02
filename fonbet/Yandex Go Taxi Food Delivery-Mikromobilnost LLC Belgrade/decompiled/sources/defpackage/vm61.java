package defpackage;

import android.util.Base64;

/* loaded from: classes7.dex */
public final /* synthetic */ class vm61 implements pg61 {
    public final /* synthetic */ int a;

    @Override // defpackage.pg61
    public final Object get() {
        switch (this.a) {
            case 0:
                return new hi81();
            default:
                byte[] bArr = new byte[12];
                x971.h.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
        }
    }
}
