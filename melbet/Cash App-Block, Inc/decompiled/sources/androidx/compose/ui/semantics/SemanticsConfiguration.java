package androidx.compose.ui.semantics;

import androidx.collection.Keys;
import androidx.collection.MapWrapper;
import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import kotlin.Function;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes.dex */
public final class SemanticsConfiguration implements SemanticsPropertyReceiver, Iterable, KMappedMarker {
    public boolean isClearingSemantics;
    public boolean isMergingSemanticsOfDescendants;
    public MapWrapper mapWrapper;
    public final MutableScatterMap props;

    public SemanticsConfiguration() {
        long[] jArr = ScatterMapKt.EmptyGroup;
        this.props = new MutableScatterMap();
    }

    public final SemanticsConfiguration copy() {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.isMergingSemanticsOfDescendants = this.isMergingSemanticsOfDescendants;
        semanticsConfiguration.isClearingSemantics = this.isClearingSemantics;
        MutableScatterMap mutableScatterMap = semanticsConfiguration.props;
        mutableScatterMap.getClass();
        MutableScatterMap mutableScatterMap2 = this.props;
        mutableScatterMap2.getClass();
        Object[] objArr = mutableScatterMap2.keys;
        Object[] objArr2 = mutableScatterMap2.values;
        long[] jArr = mutableScatterMap2.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            mutableScatterMap.set(objArr[i4], objArr2[i4]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return semanticsConfiguration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SemanticsConfiguration)) {
            return false;
        }
        SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) obj;
        return Intrinsics.areEqual(this.props, semanticsConfiguration.props) && this.isMergingSemanticsOfDescendants == semanticsConfiguration.isMergingSemanticsOfDescendants && this.isClearingSemantics == semanticsConfiguration.isClearingSemantics;
    }

    public final Object get(SemanticsPropertyKey semanticsPropertyKey) {
        Object obj = this.props.get(semanticsPropertyKey);
        if (obj != null) {
            return obj;
        }
        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Key not present: ", semanticsPropertyKey, " - consider getOrElse or getOrNull");
        return null;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isClearingSemantics) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.props.hashCode() * 31, 31, this.isMergingSemanticsOfDescendants);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        MapWrapper mapWrapper = this.mapWrapper;
        if (mapWrapper == null) {
            MutableScatterMap mutableScatterMap = this.props;
            mutableScatterMap.getClass();
            MapWrapper mapWrapper2 = new MapWrapper(mutableScatterMap);
            this.mapWrapper = mapWrapper2;
            mapWrapper = mapWrapper2;
        }
        return ((Keys) mapWrapper.entrySet()).iterator();
    }

    public final void mergeChild$ui(SemanticsConfiguration semanticsConfiguration) {
        MutableScatterMap mutableScatterMap = semanticsConfiguration.props;
        Object[] objArr = mutableScatterMap.keys;
        Object[] objArr2 = mutableScatterMap.values;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) obj;
                        MutableScatterMap mutableScatterMap2 = this.props;
                        Object obj3 = mutableScatterMap2.get(semanticsPropertyKey);
                        semanticsPropertyKey.getClass();
                        Object invoke = semanticsPropertyKey.mergePolicy.invoke(obj3, obj2);
                        if (invoke != null) {
                            mutableScatterMap2.set(semanticsPropertyKey, invoke);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // androidx.compose.ui.semantics.SemanticsPropertyReceiver
    public final void set(SemanticsPropertyKey semanticsPropertyKey, Object obj) {
        boolean z = obj instanceof AccessibilityAction;
        MutableScatterMap mutableScatterMap = this.props;
        if (z && mutableScatterMap.containsKey(semanticsPropertyKey)) {
            Object obj2 = mutableScatterMap.get(semanticsPropertyKey);
            obj2.getClass();
            AccessibilityAction accessibilityAction = (AccessibilityAction) obj2;
            AccessibilityAction accessibilityAction2 = (AccessibilityAction) obj;
            String str = accessibilityAction2.label;
            if (str == null) {
                str = accessibilityAction.label;
            }
            Function function = accessibilityAction2.action;
            if (function == null) {
                function = accessibilityAction.action;
            }
            mutableScatterMap.set(semanticsPropertyKey, new AccessibilityAction(str, function));
        } else {
            mutableScatterMap.set(semanticsPropertyKey, obj);
        }
        semanticsPropertyKey.getClass();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.isMergingSemanticsOfDescendants) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.isClearingSemantics) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        MutableScatterMap mutableScatterMap = this.props;
        Object[] objArr = mutableScatterMap.keys;
        Object[] objArr2 = mutableScatterMap.values;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((SemanticsPropertyKey) obj).name);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return JvmActuals_jvmKt.simpleIdentityToString(this) + "{ " + ((Object) sb) + " }";
    }
}
