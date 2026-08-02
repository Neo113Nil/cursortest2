package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class AnimatedContentMeasurePolicy implements MeasurePolicy {
    public final AnimatedContentTransitionScopeImpl rootScope;

    public AnimatedContentMeasurePolicy(AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
        this.rootScope = animatedContentTransitionScopeImpl;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((IntrinsicMeasurable) list.get(0)).maxIntrinsicHeight(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((IntrinsicMeasurable) list.get(i2)).maxIntrinsicHeight(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((IntrinsicMeasurable) list.get(0)).maxIntrinsicWidth(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((IntrinsicMeasurable) list.get(i2)).maxIntrinsicWidth(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s, reason: not valid java name */
    public final MeasureResult mo138measure3p2s80s(MeasureScope measureScope, List list, long j) {
        Placeable placeable;
        int i;
        Placeable placeable2;
        final int i2;
        final int i3;
        int size = list.size();
        final Placeable[] placeableArr = new Placeable[size];
        List list2 = list;
        int size2 = list2.size();
        long j2 = 0;
        int i4 = 0;
        while (true) {
            placeable = null;
            i = 1;
            if (i4 >= size2) {
                break;
            }
            Measurable measurable = (Measurable) list.get(i4);
            Object parentData = measurable.getParentData();
            AnimatedContentTransitionScopeImpl.ChildData childData = parentData instanceof AnimatedContentTransitionScopeImpl.ChildData ? (AnimatedContentTransitionScopeImpl.ChildData) parentData : null;
            if (childData != null && ((Boolean) childData.isTarget$delegate.getValue()).booleanValue()) {
                Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(j);
                long j3 = (mo833measureBRTryo0.height & BodyPartID.bodyIdMax) | (mo833measureBRTryo0.width << 32);
                placeableArr[i4] = mo833measureBRTryo0;
                j2 = j3;
            }
            i4++;
        }
        int size3 = list2.size();
        for (int i5 = 0; i5 < size3; i5++) {
            Measurable measurable2 = (Measurable) list.get(i5);
            if (placeableArr[i5] == null) {
                placeableArr[i5] = measurable2.mo833measureBRTryo0(j);
            }
        }
        if (measureScope.isLookingAhead()) {
            i2 = (int) (j2 >> 32);
        } else {
            if (size == 0) {
                placeable2 = null;
            } else {
                placeable2 = placeableArr[0];
                int i6 = size - 1;
                if (i6 != 0) {
                    int i7 = placeable2 != null ? placeable2.width : 0;
                    if (1 <= i6) {
                        int i8 = 1;
                        while (true) {
                            Placeable placeable3 = placeableArr[i8];
                            int i9 = placeable3 != null ? placeable3.width : 0;
                            if (i7 < i9) {
                                placeable2 = placeable3;
                                i7 = i9;
                            }
                            if (i8 == i6) {
                                break;
                            }
                            i8++;
                        }
                    }
                }
            }
            i2 = placeable2 != null ? placeable2.width : 0;
        }
        if (measureScope.isLookingAhead()) {
            i3 = (int) (j2 & BodyPartID.bodyIdMax);
        } else {
            if (size != 0) {
                placeable = placeableArr[0];
                int i10 = size - 1;
                if (i10 != 0) {
                    int i11 = placeable != null ? placeable.height : 0;
                    if (1 <= i10) {
                        while (true) {
                            Placeable placeable4 = placeableArr[i];
                            int i12 = placeable4 != null ? placeable4.height : 0;
                            if (i11 < i12) {
                                placeable = placeable4;
                                i11 = i12;
                            }
                            if (i == i10) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            i3 = placeable != null ? placeable.height : 0;
        }
        if (!measureScope.isLookingAhead()) {
            this.rootScope.measuredSize$delegate.setValue(new IntSize((i2 << 32) | (i3 & BodyPartID.bodyIdMax)));
        }
        return MeasureScope.layout$default(measureScope, i2, i3, new Function1() { // from class: androidx.compose.animation.AnimatedContentMeasurePolicy$measure$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                for (Placeable placeable5 : placeableArr) {
                    if (placeable5 != null) {
                        long mo584alignKFBX0sM = this.rootScope.contentAlignment.mo584alignKFBX0sM((placeable5.width << 32) | (placeable5.height & BodyPartID.bodyIdMax), (i2 << 32) | (i3 & BodyPartID.bodyIdMax), LayoutDirection.Ltr);
                        placementScope.place(placeable5, (int) (mo584alignKFBX0sM >> 32), (int) (mo584alignKFBX0sM & BodyPartID.bodyIdMax), RecyclerView.DECELERATION_RATE);
                    }
                }
                return Unit.INSTANCE;
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((IntrinsicMeasurable) list.get(0)).minIntrinsicHeight(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((IntrinsicMeasurable) list.get(i2)).minIntrinsicHeight(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((IntrinsicMeasurable) list.get(0)).minIntrinsicWidth(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((IntrinsicMeasurable) list.get(i2)).minIntrinsicWidth(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }
}
