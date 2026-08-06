package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.v2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0809v2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final V1 fromModel(C0861x2 c0861x2) {
        V1 v12 = new V1();
        EnumC0835w2 enumC0835w2 = c0861x2.f7164a;
        if (enumC0835w2 != null) {
            int ordinal = enumC0835w2.ordinal();
            if (ordinal == 0) {
                v12.f5203a = 6;
            } else if (ordinal == 1) {
                v12.f5203a = 1;
            } else if (ordinal == 2) {
                v12.f5203a = 2;
            } else if (ordinal == 3) {
                v12.f5203a = 3;
            } else if (ordinal == 4) {
                v12.f5203a = 4;
            } else if (ordinal != 5) {
                v12.f5203a = 0;
            } else {
                v12.f5203a = 5;
            }
        }
        Boolean bool = c0861x2.f7165b;
        if (bool != null) {
            if (bool.booleanValue()) {
                v12.f5204b = 1;
            } else {
                v12.f5204b = 0;
            }
        }
        return v12;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0861x2 toModel(V1 v12) {
        EnumC0835w2 enumC0835w2;
        Boolean bool = null;
        switch (v12.f5203a) {
            case 1:
                enumC0835w2 = EnumC0835w2.ACTIVE;
                break;
            case 2:
                enumC0835w2 = EnumC0835w2.WORKING_SET;
                break;
            case 3:
                enumC0835w2 = EnumC0835w2.FREQUENT;
                break;
            case 4:
                enumC0835w2 = EnumC0835w2.RARE;
                break;
            case 5:
                enumC0835w2 = EnumC0835w2.RESTRICTED;
                break;
            case 6:
                enumC0835w2 = EnumC0835w2.EXEMPTED;
                break;
            default:
                enumC0835w2 = null;
                break;
        }
        int i2 = v12.f5204b;
        if (i2 == 0) {
            bool = Boolean.FALSE;
        } else if (i2 == 1) {
            bool = Boolean.TRUE;
        }
        return new C0861x2(enumC0835w2, bool);
    }
}
