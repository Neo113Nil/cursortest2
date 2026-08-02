package yads;

import defpackage.tls;
import defpackage.y271;
import java.util.Set;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class xa2 extends Lambda implements tls {
    public final /* synthetic */ Set b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa2(Set set) {
        super(1);
        this.b = set;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return Boolean.valueOf(this.b.contains(((y271) obj).a));
    }
}
