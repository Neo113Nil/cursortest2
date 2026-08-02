package androidx.compose.ui.graphics.vector;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractMap$keys$1$iterator$1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes.dex */
public final class VectorGroup extends VectorNode implements Iterable, KMappedMarker {
    public final List children;
    public final List clipPathData;
    public final String name;
    public final float pivotX;
    public final float pivotY;
    public final float rotation;
    public final float scaleX;
    public final float scaleY;
    public final float translationX;
    public final float translationY;

    public VectorGroup(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ArrayList arrayList) {
        this.name = str;
        this.rotation = f;
        this.pivotX = f2;
        this.pivotY = f3;
        this.scaleX = f4;
        this.scaleY = f5;
        this.translationX = f6;
        this.translationY = f7;
        this.clipPathData = list;
        this.children = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof VectorGroup)) {
            VectorGroup vectorGroup = (VectorGroup) obj;
            return Intrinsics.areEqual(this.name, vectorGroup.name) && this.rotation == vectorGroup.rotation && this.pivotX == vectorGroup.pivotX && this.pivotY == vectorGroup.pivotY && this.scaleX == vectorGroup.scaleX && this.scaleY == vectorGroup.scaleY && this.translationX == vectorGroup.translationX && this.translationY == vectorGroup.translationY && Intrinsics.areEqual(this.clipPathData, vectorGroup.clipPathData) && Intrinsics.areEqual(this.children, vectorGroup.children);
        }
        return false;
    }

    public final int hashCode() {
        return this.children.hashCode() + Recorder$$ExternalSyntheticOutline2.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.translationY, CameraState$Type$EnumUnboxingLocalUtility.m(this.translationX, CameraState$Type$EnumUnboxingLocalUtility.m(this.scaleY, CameraState$Type$EnumUnboxingLocalUtility.m(this.scaleX, CameraState$Type$EnumUnboxingLocalUtility.m(this.pivotY, CameraState$Type$EnumUnboxingLocalUtility.m(this.pivotX, CameraState$Type$EnumUnboxingLocalUtility.m(this.rotation, this.name.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31, this.clipPathData);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new AbstractMap$keys$1$iterator$1(this);
    }
}
