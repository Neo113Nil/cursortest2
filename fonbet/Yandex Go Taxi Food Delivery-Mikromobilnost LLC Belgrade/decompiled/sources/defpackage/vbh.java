package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.ClassDiscriminatorMode;

/* loaded from: classes.dex */
public final class vbh implements htq0 {
    public final boolean a;

    public vbh(ccx ccxVar) {
        this.a = ccxVar.m != ClassDiscriminatorMode.NONE;
    }

    @Override // defpackage.htq0
    public void b(lfx lfxVar, tls tlsVar) {
    }

    @Override // defpackage.htq0
    public void c(lfx lfxVar, tls tlsVar) {
    }

    @Override // defpackage.htq0
    public void e(lfx lfxVar, lfx lfxVar2, KSerializer kSerializer) {
        jl40 kind = kSerializer.getDescriptor().getKind();
        if ((kind instanceof s5e0) || jl40.l(kind, esq0.g)) {
            yhl.f("Serializer for ", ((g0c) lfxVar2).d(), " can't be registered as a subclass for polymorphic serialization because its kind ", kind, " is not concrete. To work with multiple hierarchies, register it as a base class.");
            return;
        }
        if (this.a) {
            if (jl40.l(kind, ovu0.h) || jl40.l(kind, ovu0.i) || (kind instanceof h2f0) || (kind instanceof fsq0)) {
                yhl.f("Serializer for ", ((g0c) lfxVar2).d(), " of kind ", kind, " cannot be serialized polymorphically with class discriminator.");
            }
        }
    }

    @Override // defpackage.htq0
    public void f(lfx lfxVar, tls tlsVar) {
    }

    public vbh(boolean z) {
        this.a = z;
    }
}
