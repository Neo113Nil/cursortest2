package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class f3s {
    public final k6j a;
    public final int b;

    public f3s(k6j k6jVar, int i) {
        this.a = k6jVar;
        this.b = i;
    }

    public final String toString() {
        k6j k6jVar = this.a;
        byte[] bArr = k6jVar.a;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length + 1);
        int length = copyOf.length - 1;
        int i = this.b;
        copyOf[length] = (byte) i;
        return k6jVar + " length: " + i + StringUtil.SPACE + quj.L("%02x", copyOf);
    }
}
