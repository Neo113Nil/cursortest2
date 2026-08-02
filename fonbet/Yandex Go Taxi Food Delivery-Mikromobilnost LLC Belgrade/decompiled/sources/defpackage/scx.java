package defpackage;

import java.util.List;
import kotlin.a;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes9.dex */
public final class scx implements SerialDescriptor {
    public final i3y a;

    public scx(sls slsVar) {
        this.a = a.a(slsVar);
    }

    public final SerialDescriptor a() {
        return (SerialDescriptor) this.a.getValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String str) {
        return a().c(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor d(int i) {
        return a().d(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int e() {
        return a().e();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String f(int i) {
        return a().f(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List g(int i) {
        return a().g(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final jl40 getKind() {
        return a().getKind();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String h() {
        return a().h();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i) {
        return a().i(i);
    }
}
