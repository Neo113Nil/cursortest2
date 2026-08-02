package defpackage;

import com.yandex.music.shared.network.api.retrofit.MusicCommonHttpException;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class lj6 extends mj6 {
    public final jyr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj6(int i, String str, String str2) {
        super(i);
        str.getClass();
        str2.getClass();
        jyr b = btf.b(new de(i, 8, str2, str));
        this.b = b;
    }

    @Override // defpackage.pj6
    public final IOException a() {
        return (MusicCommonHttpException) this.b.getValue();
    }

    @Override // defpackage.pj6
    public final arf b() {
        return this.b;
    }
}
