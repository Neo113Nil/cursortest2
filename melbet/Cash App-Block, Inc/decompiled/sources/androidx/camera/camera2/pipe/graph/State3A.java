package androidx.camera.camera2.pipe.graph;

import androidx.camera.camera2.pipe.AeMode;
import androidx.camera.camera2.pipe.AfMode;
import androidx.camera.camera2.pipe.AwbMode;
import androidx.camera.camera2.pipe.FlashMode;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class State3A {
    public final Boolean aeLock;
    public final AeMode aeMode;
    public final List aeRegions;
    public final Boolean afLock;
    public final AfMode afMode;
    public final List afRegions;
    public final Boolean awbLock;
    public final AwbMode awbMode;
    public final List awbRegions;
    public final FlashMode flashMode;

    public State3A(AeMode aeMode, AfMode afMode, AwbMode awbMode, FlashMode flashMode, List list, List list2, List list3, Boolean bool, Boolean bool2, Boolean bool3) {
        this.aeMode = aeMode;
        this.afMode = afMode;
        this.awbMode = awbMode;
        this.flashMode = flashMode;
        this.aeRegions = list;
        this.afRegions = list2;
        this.awbRegions = list3;
        this.aeLock = bool;
        this.afLock = bool2;
        this.awbLock = bool3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof State3A)) {
            return false;
        }
        State3A state3A = (State3A) obj;
        return Intrinsics.areEqual(this.aeMode, state3A.aeMode) && Intrinsics.areEqual(this.afMode, state3A.afMode) && Intrinsics.areEqual(this.awbMode, state3A.awbMode) && Intrinsics.areEqual(this.flashMode, state3A.flashMode) && Intrinsics.areEqual(this.aeRegions, state3A.aeRegions) && Intrinsics.areEqual(this.afRegions, state3A.afRegions) && Intrinsics.areEqual(this.awbRegions, state3A.awbRegions) && Intrinsics.areEqual(this.aeLock, state3A.aeLock) && Intrinsics.areEqual(this.afLock, state3A.afLock) && Intrinsics.areEqual(this.awbLock, state3A.awbLock);
    }

    public final int hashCode() {
        AeMode aeMode = this.aeMode;
        int hashCode = (aeMode == null ? 0 : Integer.hashCode(aeMode.value)) * 31;
        AfMode afMode = this.afMode;
        int hashCode2 = (hashCode + (afMode == null ? 0 : Integer.hashCode(afMode.value))) * 31;
        AwbMode awbMode = this.awbMode;
        int hashCode3 = (hashCode2 + (awbMode == null ? 0 : Integer.hashCode(awbMode.value))) * 31;
        FlashMode flashMode = this.flashMode;
        int hashCode4 = (hashCode3 + (flashMode == null ? 0 : Integer.hashCode(flashMode.value))) * 31;
        List list = this.aeRegions;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.afRegions;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.awbRegions;
        int hashCode7 = (hashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool = this.aeLock;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.afLock;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.awbLock;
        return hashCode9 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        return "State3A(aeMode=" + this.aeMode + ", afMode=" + this.afMode + ", awbMode=" + this.awbMode + ", flashMode=" + this.flashMode + ", aeRegions=" + this.aeRegions + ", afRegions=" + this.afRegions + ", awbRegions=" + this.awbRegions + ", aeLock=" + this.aeLock + ", afLock=" + this.afLock + ", awbLock=" + this.awbLock + ')';
    }
}
