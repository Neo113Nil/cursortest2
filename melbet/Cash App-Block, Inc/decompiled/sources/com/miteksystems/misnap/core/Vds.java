package com.miteksystems.misnap.core;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes4.dex */
public final class Vds {
    public static final Companion Companion = new Companion();
    public final VdsHeader a;
    public final String b;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/Vds$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/Vds;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return Vds$$serializer.INSTANCE;
        }
    }

    @Serializable
    public final class VdsHeader {
        public static final Companion Companion = new Companion();
        public final String a;
        public final int b;
        public final int c;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/Vds$VdsHeader$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/Vds$VdsHeader;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return Vds$VdsHeader$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ VdsHeader(int i, String str, int i2, int i3) {
            if (7 != (i & 7)) {
                TuplesKt.throwMissingFieldException(i, 7, Vds$VdsHeader$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = str;
            this.b = i2;
            this.c = i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VdsHeader)) {
                return false;
            }
            VdsHeader vdsHeader = (VdsHeader) obj;
            return Intrinsics.areEqual(this.a, vdsHeader.a) && this.b == vdsHeader.b && this.c == vdsHeader.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VdsHeader(country=");
            sb.append(this.a);
            sb.append(", featureDefinitionReference=");
            sb.append(this.b);
            sb.append(", typeCategory=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.c, ')');
        }
    }

    public /* synthetic */ Vds(int i, VdsHeader vdsHeader, String str) {
        if (1 != (i & 1)) {
            TuplesKt.throwMissingFieldException(i, 1, Vds$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = vdsHeader;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Vds)) {
            return false;
        }
        Vds vds = (Vds) obj;
        return Intrinsics.areEqual(this.a, vds.a) && Intrinsics.areEqual(this.b, vds.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vds(header=");
        sb.append(this.a);
        sb.append(", encryptedPayload=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.b, ')');
    }

    public Vds(VdsHeader vdsHeader, String str) {
        vdsHeader.getClass();
        this.a = vdsHeader;
        this.b = str;
    }
}
