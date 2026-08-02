package com.miteksystems.misnap.core.internal;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;
import kotlinx.serialization.json.JsonBuilder;
import papa.AppUpdateData;

@Serializable
/* loaded from: classes4.dex */
public final class DeviceInfoProvider$DeviceInfo {
    public static final Companion Companion = new Companion();
    public final String a;
    public final long b;
    public final Signals c;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/internal/DeviceInfoProvider$DeviceInfo$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/internal/DeviceInfoProvider$DeviceInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return DeviceInfoProvider$DeviceInfo$$serializer.INSTANCE;
        }
    }

    @Serializable
    public final class Signals {
        public static final Companion Companion = new Companion();
        public final String a;
        public final int b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/internal/DeviceInfoProvider$DeviceInfo$Signals$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/internal/DeviceInfoProvider$DeviceInfo$Signals;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return DeviceInfoProvider$DeviceInfo$Signals$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Signals(String str, String str2, int i, int i2, String str3, String str4, String str5) {
            if (63 != (i & 63)) {
                TuplesKt.throwMissingFieldException(i, 63, DeviceInfoProvider$DeviceInfo$Signals$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = str;
            this.b = i2;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Signals)) {
                return false;
            }
            Signals signals = (Signals) obj;
            return Intrinsics.areEqual(this.a, signals.a) && this.b == signals.b && Intrinsics.areEqual(this.c, signals.c) && Intrinsics.areEqual(this.d, signals.d) && Intrinsics.areEqual(this.e, signals.e) && Intrinsics.areEqual(this.f, signals.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Signals(osVersion=");
            sb.append(this.a);
            sb.append(", sdkLevel=");
            sb.append(this.b);
            sb.append(", timeZone=");
            sb.append(this.c);
            sb.append(", device=");
            sb.append(this.d);
            sb.append(", manufacturer=");
            sb.append(this.e);
            sb.append(", model=");
            return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.f, ')');
        }
    }

    public final class a extends Lambda implements Function1 {
        public static final a a = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            JsonBuilder jsonBuilder = (JsonBuilder) obj;
            jsonBuilder.getClass();
            jsonBuilder.ignoreUnknownKeys = true;
            jsonBuilder.encodeDefaults = true;
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ DeviceInfoProvider$DeviceInfo(int i, String str, long j, Signals signals) {
        if (7 != (i & 7)) {
            TuplesKt.throwMissingFieldException(i, 7, DeviceInfoProvider$DeviceInfo$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = j;
        this.c = signals;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceInfoProvider$DeviceInfo)) {
            return false;
        }
        DeviceInfoProvider$DeviceInfo deviceInfoProvider$DeviceInfo = (DeviceInfoProvider$DeviceInfo) obj;
        return Intrinsics.areEqual(this.a, deviceInfoProvider$DeviceInfo.a) && this.b == deviceInfoProvider$DeviceInfo.b && Intrinsics.areEqual(this.c, deviceInfoProvider$DeviceInfo.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + Recorder$$ExternalSyntheticOutline2.m(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return AppUpdateData.Json$default(a.a).encodeToString(Companion.serializer(), this);
    }
}
