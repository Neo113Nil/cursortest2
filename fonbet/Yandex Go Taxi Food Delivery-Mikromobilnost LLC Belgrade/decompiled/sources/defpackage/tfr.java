package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class tfr implements bcx {
    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ Class annotationType() {
        return bcx.class;
    }

    @Override // defpackage.bcx
    public final /* synthetic */ String discriminator() {
        return "type";
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        return (obj instanceof bcx) && "type".equals(((bcx) obj).discriminator());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return 705071198;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=type)";
    }
}
