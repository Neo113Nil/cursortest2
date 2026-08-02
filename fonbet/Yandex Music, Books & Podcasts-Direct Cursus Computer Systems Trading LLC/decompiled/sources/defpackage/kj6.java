package defpackage;

import com.yandex.music.shared.network.api.retrofit.MusicBackendHttpException;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class kj6 extends mj6 {
    public final String b;
    public final gfb c;
    public final jyr d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj6(int i, gfb gfbVar, String str, String str2, String str3) {
        super(i);
        str3.getClass();
        jyr b = btf.b(new gk1(i, gfbVar, str, str2, str3));
        this.b = str;
        this.c = gfbVar;
        this.d = b;
    }

    @Override // defpackage.pj6
    public final IOException a() {
        return (MusicBackendHttpException) this.d.getValue();
    }

    @Override // defpackage.pj6
    public final arf b() {
        return this.d;
    }
}
