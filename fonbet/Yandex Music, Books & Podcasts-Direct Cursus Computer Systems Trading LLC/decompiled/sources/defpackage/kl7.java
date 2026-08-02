package defpackage;

import java.util.UUID;

/* loaded from: classes6.dex */
public final class kl7 implements e18 {
    public static final UUID c = new UUID(0, 0);
    public final jyr a;
    public final jyr b = btf.b(new b8w(0, 10));

    public kl7(String str) {
        this.a = btf.b(new cr4(str, this));
    }

    @Override // defpackage.e18
    public final boolean b() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    @Override // defpackage.e18
    public final UUID getDeviceId() {
        return (UUID) this.a.getValue();
    }
}
