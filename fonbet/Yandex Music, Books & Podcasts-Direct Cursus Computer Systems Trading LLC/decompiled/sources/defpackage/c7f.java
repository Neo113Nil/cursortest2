package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c7f implements oip {
    public final /* synthetic */ int a;
    public final boolean b;
    public final String c;

    public c7f(j4f j4fVar) {
        this.a = 0;
        this.c = j4fVar.h;
        this.b = j4fVar.k != em4.a;
    }

    @Override // defpackage.oip
    public void a(f9f f9fVar, f9f f9fVar2, t9f t9fVar) {
        mhp descriptor = t9fVar.getDescriptor();
        ivf a = descriptor.a();
        if ((a instanceof igm) || Intrinsics.d(a, shp.b)) {
            jj4.l("Serializer for ", ((lm4) f9fVar2).h(), " can't be registered as a subclass for polymorphic serialization because its kind ", a, " is not concrete. To work with multiple hierarchies, register it as a base class.");
            return;
        }
        boolean z = this.b;
        if (z && (Intrinsics.d(a, emr.c) || Intrinsics.d(a, emr.d) || (a instanceof csm) || (a instanceof thp))) {
            jj4.l("Serializer for ", ((lm4) f9fVar2).h(), " of kind ", a, " cannot be serialized polymorphically with class discriminator.");
            return;
        }
        if (z) {
            int e = descriptor.e();
            for (int i = 0; i < e; i++) {
                String f = descriptor.f(i);
                if (Intrinsics.d(f, this.c)) {
                    kac.g("Polymorphic serializer for ", f9fVar2, " has property '", f, "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
                    return;
                }
            }
        }
    }

    @Override // defpackage.oip
    public void l(f9f f9fVar, t9f t9fVar) {
        t9fVar.getClass();
    }

    @Override // defpackage.oip
    public void p(f9f f9fVar, nip nipVar) {
        f9fVar.getClass();
    }

    public String toString() {
        switch (this.a) {
            case 3:
                String str = this.b ? "Applink" : "Unclassified";
                String str2 = this.c;
                if (str2 == null) {
                    return str;
                }
                return str + '(' + str2 + ')';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ c7f(boolean z, String str, int i) {
        this.a = i;
        this.b = z;
        this.c = str;
    }

    public /* synthetic */ c7f(String str, boolean z, int i) {
        this.a = i;
        this.c = str;
        this.b = z;
    }

    @Override // defpackage.oip
    public void b(f9f f9fVar, Function1 function1) {
    }

    @Override // defpackage.oip
    public void m(f9f f9fVar, Function1 function1) {
    }
}
