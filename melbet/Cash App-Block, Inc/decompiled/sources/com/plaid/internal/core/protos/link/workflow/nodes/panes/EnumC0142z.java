package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC0142z implements Internal.EnumLite {
    HAPTIC_TYPE_UNKNOWN(0),
    HAPTIC_TYPE_BUTTON_NAVIGATION(1),
    HAPTIC_TYPE_BUTTON_INPUT(2),
    HAPTIC_TYPE_BUTTON_ACTION(3),
    HAPTIC_TYPE_EVENT_SUCCESS(4),
    HAPTIC_TYPE_EVENT_ERROR(5),
    UNRECOGNIZED(-1);

    public static final int HAPTIC_TYPE_BUTTON_ACTION_VALUE = 3;
    public static final int HAPTIC_TYPE_BUTTON_INPUT_VALUE = 2;
    public static final int HAPTIC_TYPE_BUTTON_NAVIGATION_VALUE = 1;
    public static final int HAPTIC_TYPE_EVENT_ERROR_VALUE = 5;
    public static final int HAPTIC_TYPE_EVENT_SUCCESS_VALUE = 4;
    public static final int HAPTIC_TYPE_UNKNOWN_VALUE = 0;
    public static final a b = new a();
    public final int a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.z$a */
    public class a implements Internal.EnumLiteMap<EnumC0142z> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final EnumC0142z findValueByNumber(int i) {
            return EnumC0142z.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.z$b */
    public static final class b implements Internal.EnumVerifier {
        public static final b a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC0142z.forNumber(i) != null;
        }
    }

    EnumC0142z(int i) {
        this.a = i;
    }

    public static EnumC0142z forNumber(int i) {
        if (i == 0) {
            return HAPTIC_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return HAPTIC_TYPE_BUTTON_NAVIGATION;
        }
        if (i == 2) {
            return HAPTIC_TYPE_BUTTON_INPUT;
        }
        if (i == 3) {
            return HAPTIC_TYPE_BUTTON_ACTION;
        }
        if (i == 4) {
            return HAPTIC_TYPE_EVENT_SUCCESS;
        }
        if (i != 5) {
            return null;
        }
        return HAPTIC_TYPE_EVENT_ERROR;
    }

    public static Internal.EnumLiteMap<EnumC0142z> internalGetValueMap() {
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
    public static EnumC0142z valueOf(int i) {
        return forNumber(i);
    }
}
