package com.yandex.plus.pay.data.mb.dto;

import defpackage.i4f;

/* loaded from: classes5.dex */
public final /* synthetic */ class p0 implements i4f {
    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ Class annotationType() {
        return i4f.class;
    }

    @Override // defpackage.i4f
    public final /* synthetic */ String discriminator() {
        return "typename";
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        return (obj instanceof i4f) && "typename".equals(((i4f) obj).discriminator());
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
