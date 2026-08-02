package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.protobuf.Internal;

/* loaded from: classes5.dex */
public enum E implements Internal.EnumLite {
    NOTE_TYPE_DEFAULT(0),
    NOTE_TYPE_INFO(1),
    NOTE_TYPE_WARNING(2),
    NOTE_TYPE_ERROR(3),
    NOTE_TYPE_SUCCESS(4),
    NOTE_TYPE_PROMINENT(5),
    UNRECOGNIZED(-1);

    public static final int NOTE_TYPE_DEFAULT_VALUE = 0;
    public static final int NOTE_TYPE_ERROR_VALUE = 3;
    public static final int NOTE_TYPE_INFO_VALUE = 1;
    public static final int NOTE_TYPE_PROMINENT_VALUE = 5;
    public static final int NOTE_TYPE_SUCCESS_VALUE = 4;
    public static final int NOTE_TYPE_WARNING_VALUE = 2;
    public static final a b = new a();
    public final int a;

    public class a implements Internal.EnumLiteMap<E> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final E findValueByNumber(int i) {
            return E.forNumber(i);
        }
    }

    public static final class b implements Internal.EnumVerifier {
        public static final b a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return E.forNumber(i) != null;
        }
    }

    E(int i) {
        this.a = i;
    }

    public static E forNumber(int i) {
        if (i == 0) {
            return NOTE_TYPE_DEFAULT;
        }
        if (i == 1) {
            return NOTE_TYPE_INFO;
        }
        if (i == 2) {
            return NOTE_TYPE_WARNING;
        }
        if (i == 3) {
            return NOTE_TYPE_ERROR;
        }
        if (i == 4) {
            return NOTE_TYPE_SUCCESS;
        }
        if (i != 5) {
            return null;
        }
        return NOTE_TYPE_PROMINENT;
    }

    public static Internal.EnumLiteMap<E> internalGetValueMap() {
        return b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static E valueOf(int i) {
        return forNumber(i);
    }
}
