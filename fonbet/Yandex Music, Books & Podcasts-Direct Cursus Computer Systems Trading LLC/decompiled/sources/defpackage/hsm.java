package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class hsm {
    public final Object a;
    public final byte[] b;
    public final fbf c;
    public final oyj d;

    public hsm(Object obj, byte[] bArr, fbf fbfVar, oyj oyjVar) {
        this.a = obj;
        this.b = Arrays.copyOf(bArr, bArr.length);
        this.c = fbfVar;
        this.d = oyjVar;
    }

    public final byte[] a() {
        byte[] bArr = this.b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
