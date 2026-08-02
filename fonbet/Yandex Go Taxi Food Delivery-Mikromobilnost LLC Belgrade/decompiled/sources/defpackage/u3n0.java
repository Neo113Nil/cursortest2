package defpackage;

import com.yandex.go.scooters.ble.domain.model.ninebot.Result;

/* loaded from: classes13.dex */
public final class u3n0 {
    public final Result a;

    public u3n0(byte[] bArr) {
        this.a = bArr[7] == 0 ? Result.SUCCESS : Result.FAILURE;
    }
}
