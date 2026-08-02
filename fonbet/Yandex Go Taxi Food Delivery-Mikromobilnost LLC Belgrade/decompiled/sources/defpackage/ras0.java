package defpackage;

import android.content.ContentResolver;
import android.content.Context;

/* loaded from: classes15.dex */
public final class ras0 {
    public final ContentResolver a;

    public ras0(Context context) {
        this.a = context.getContentResolver();
    }

    public static final e9v a(i3y i3yVar, String str) {
        byte[] bArr = (byte[]) i3yVar.getValue();
        if (bArr != null) {
            return new e9v(bArr, false);
        }
        ny61.v(str.concat(", also failed read original image"));
        return null;
    }
}
