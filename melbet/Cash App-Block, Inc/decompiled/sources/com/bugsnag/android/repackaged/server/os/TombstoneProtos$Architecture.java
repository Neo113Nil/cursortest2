package com.bugsnag.android.repackaged.server.os;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public enum TombstoneProtos$Architecture implements Internal.EnumLite {
    ARM32(0),
    ARM64(1),
    X86(2),
    X86_64(3),
    RISCV64(4),
    UNRECOGNIZED(-1);

    public final int value;

    TombstoneProtos$Architecture(int i) {
        this.value = i;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Can't get the number of an unknown enum value.");
        return 0;
    }
}
