package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class yod implements bcx {
    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ Class annotationType() {
        return bcx.class;
    }

    @Override // defpackage.bcx
    public final /* synthetic */ String discriminator() {
        return "typename";
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        return (obj instanceof bcx) && "typename".equals(((bcx) obj).discriminator());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return -41165919;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=typename)";
    }
}
