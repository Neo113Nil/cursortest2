package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.j3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0363j3 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final H2 fromModel(@NonNull C0421l3 c0421l3) {
        H2 h2 = new H2();
        EnumC0392k3 enumC0392k3 = c0421l3.a;
        if (enumC0392k3 != null) {
            int ordinal = enumC0392k3.ordinal();
            if (ordinal == 0) {
                h2.a = 6;
            } else if (ordinal == 1) {
                h2.a = 1;
            } else if (ordinal == 2) {
                h2.a = 2;
            } else if (ordinal == 3) {
                h2.a = 3;
            } else if (ordinal == 4) {
                h2.a = 4;
            } else if (ordinal != 5) {
                h2.a = 0;
            } else {
                h2.a = 5;
            }
        }
        Boolean bool = c0421l3.b;
        if (bool != null) {
            if (bool.booleanValue()) {
                h2.b = 1;
                return h2;
            }
            h2.b = 0;
        }
        return h2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0421l3 toModel(@NonNull H2 h2) {
        EnumC0392k3 enumC0392k3;
        Boolean bool = null;
        switch (h2.a) {
            case 1:
                enumC0392k3 = EnumC0392k3.ACTIVE;
                break;
            case 2:
                enumC0392k3 = EnumC0392k3.WORKING_SET;
                break;
            case 3:
                enumC0392k3 = EnumC0392k3.FREQUENT;
                break;
            case 4:
                enumC0392k3 = EnumC0392k3.RARE;
                break;
            case 5:
                enumC0392k3 = EnumC0392k3.RESTRICTED;
                break;
            case 6:
                enumC0392k3 = EnumC0392k3.EXEMPTED;
                break;
            default:
                enumC0392k3 = null;
                break;
        }
        int i = h2.b;
        if (i == 0) {
            bool = Boolean.FALSE;
        } else if (i == 1) {
            bool = Boolean.TRUE;
        }
        return new C0421l3(enumC0392k3, bool);
    }
}
