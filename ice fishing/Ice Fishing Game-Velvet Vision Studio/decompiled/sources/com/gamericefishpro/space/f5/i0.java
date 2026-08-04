package com.gamericefishpro.space.f5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends m0 {
    public final Class l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Class type) {
        super(0, type);
        Intrinsics.checkNotNullParameter(type, "type");
        if (type.isEnum()) {
            this.l = type;
            return;
        }
        throw new IllegalArgumentException((type + " is not an Enum type.").toString());
    }

    @Override // com.gamericefishpro.space.f5.m0, com.gamericefishpro.space.f5.n0
    public final String b() {
        String name = this.l.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    @Override // com.gamericefishpro.space.f5.m0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Enum d(String value) {
        Object obj;
        Intrinsics.checkNotNullParameter(value, "value");
        Class cls = this.l;
        Object[] enumConstants = cls.getEnumConstants();
        Intrinsics.checkNotNullExpressionValue(enumConstants, "getEnumConstants(...)");
        int length = enumConstants.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                obj = null;
                break;
            }
            obj = enumConstants[i];
            if (kotlin.text.d.g(((Enum) obj).name(), value, true)) {
                break;
            }
            i++;
        }
        Enum r4 = (Enum) obj;
        if (r4 != null) {
            return r4;
        }
        StringBuilder sbL = com.gamericefishpro.space.m5.a.l("Enum value ", value, " not found for type ");
        sbL.append(cls.getName());
        sbL.append('.');
        throw new IllegalArgumentException(sbL.toString());
    }
}
