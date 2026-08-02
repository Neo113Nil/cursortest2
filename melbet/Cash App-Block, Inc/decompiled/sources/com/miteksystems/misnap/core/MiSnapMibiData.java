package com.miteksystems.misnap.core;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.miteksystems.misnap.core.MibiData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/miteksystems/misnap/core/MiSnapMibiData;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {1, 8, 0})
@Serializable
/* loaded from: classes4.dex */
public final /* data */ class MiSnapMibiData {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public final String a;
    public final MibiData.DeviceInfo b;
    public final List c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/miteksystems/misnap/core/MiSnapMibiData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/MiSnapMibiData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer serializer() {
            return MiSnapMibiData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MiSnapMibiData(int i, String str, MibiData.DeviceInfo deviceInfo, List list) {
        if (7 != (i & 7)) {
            TuplesKt.throwMissingFieldException(i, 7, MiSnapMibiData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = deviceInfo;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MiSnapMibiData)) {
            return false;
        }
        MiSnapMibiData miSnapMibiData = (MiSnapMibiData) obj;
        return Intrinsics.areEqual(this.a, miSnapMibiData.a) && Intrinsics.areEqual(this.b, miSnapMibiData.b) && Intrinsics.areEqual(this.c, miSnapMibiData.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MiSnapMibiData(mibiData=");
        sb.append(this.a);
        sb.append(", deviceInfo=");
        sb.append(this.b);
        sb.append(", sessionInfo=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.c, ')');
    }

    public MiSnapMibiData(String str, MibiData.DeviceInfo deviceInfo, ArrayList arrayList) {
        this.a = str;
        this.b = deviceInfo;
        this.c = arrayList;
    }
}
