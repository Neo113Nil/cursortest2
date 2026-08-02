package androidx.glance.appwidget;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class InsertedViewInfo {
    public final Map children;
    public final int complexViewId;
    public final int mainViewId;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InsertedViewInfo(int i, int i2, Map map, int i3) {
        this(i, map, i2);
        i = (i3 & 1) != 0 ? -1 : i;
        i2 = (i3 & 2) != 0 ? -1 : i2;
        if ((i3 & 4) != 0) {
            map = EmptyMap.INSTANCE;
            map.getClass();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsertedViewInfo)) {
            return false;
        }
        InsertedViewInfo insertedViewInfo = (InsertedViewInfo) obj;
        return this.mainViewId == insertedViewInfo.mainViewId && this.complexViewId == insertedViewInfo.complexViewId && Intrinsics.areEqual(this.children, insertedViewInfo.children);
    }

    public final int hashCode() {
        return this.children.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.complexViewId, Integer.hashCode(this.mainViewId) * 31, 31);
    }

    public final String toString() {
        return "InsertedViewInfo(mainViewId=" + this.mainViewId + ", complexViewId=" + this.complexViewId + ", children=" + this.children + ')';
    }

    public InsertedViewInfo(int i, Map map, int i2) {
        this.mainViewId = i;
        this.complexViewId = i2;
        this.children = map;
    }
}
