package defpackage;

import ru.rt.ebs.cryptosdk.core.common.entities.models.IComponent;

/* loaded from: classes4.dex */
public final class u650 implements IComponent {
    public mc50 a;
    public pgk0 b;

    @Override // ru.rt.ebs.cryptosdk.core.common.entities.models.IComponent
    public final void release() {
        this.b = null;
        this.a = null;
    }
}
