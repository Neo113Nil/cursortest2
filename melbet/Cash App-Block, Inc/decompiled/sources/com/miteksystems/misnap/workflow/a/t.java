package com.miteksystems.misnap.workflow.a;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t {
    public final boolean a;
    public final List b;

    public t(boolean z, List list) {
        list.getClass();
        this.a = z;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.a == tVar.a && Intrinsics.areEqual(this.b, tVar.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return this.b.hashCode() + (r0 * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoiceProgressResult(error=");
        sb.append(this.a);
        sb.append(", voiceRecordings=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.b, ')');
    }
}
