package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes9.dex */
public final class ybx implements SerialDescriptor {
    public static final ybx b = new ybx();
    public static final String c = "kotlinx.serialization.json.JsonArray";
    public final /* synthetic */ s43 a = new s43(rcx.a.getDescriptor(), 1);

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        this.a.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String str) {
        return this.a.c(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor d(int i) {
        return this.a.d(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int e() {
        this.a.getClass();
        return 1;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String f(int i) {
        this.a.getClass();
        return String.valueOf(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List g(int i) {
        this.a.g(i);
        return EmptyList.a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        this.a.getClass();
        return EmptyList.a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final jl40 getKind() {
        this.a.getClass();
        return ovu0.h;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String h() {
        return c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i) {
        this.a.i(i);
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        this.a.getClass();
        return false;
    }
}
