package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Serializable;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class RectRulersImpl {
    public final /* synthetic */ int $r8$classId;
    public final VerticalRuler bottom;
    public final VerticalRuler left;
    public final Serializable name;
    public final VerticalRuler right;
    public final VerticalRuler top;

    /* JADX WARN: Multi-variable type inference failed */
    public RectRulersImpl(RectRulersImpl[] rectRulersImplArr) {
        final int i = 1;
        this.$r8$classId = 1;
        this.name = rectRulersImplArr;
        int length = rectRulersImplArr.length;
        final VerticalRuler[] verticalRulerArr = new VerticalRuler[length];
        final int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            verticalRulerArr[i3] = ((RectRulersImpl[]) this.name)[i3].getLeft();
        }
        this.left = new VerticalRuler(0, new Function2() { // from class: androidx.compose.ui.layout.VerticalRuler$Companion$maxOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i4 = i2;
                VerticalRuler[] verticalRulerArr2 = verticalRulerArr;
                switch (i4) {
                    case 0:
                        return Float.valueOf(RulerKt.access$mergeRulerValues((Placeable.PlacementScope) obj, true, verticalRulerArr2, ((Number) obj2).floatValue()));
                    default:
                        return Float.valueOf(RulerKt.access$mergeRulerValues((Placeable.PlacementScope) obj, false, verticalRulerArr2, ((Number) obj2).floatValue()));
                }
            }
        });
        int length2 = ((RectRulersImpl[]) this.name).length;
        final VerticalRuler[] verticalRulerArr2 = new VerticalRuler[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            verticalRulerArr2[i4] = ((RectRulersImpl[]) this.name)[i4].getTop();
        }
        this.top = new VerticalRuler(1, new Function2() { // from class: androidx.compose.ui.layout.HorizontalRuler$Companion$maxOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i5 = i2;
                VerticalRuler[] verticalRulerArr3 = verticalRulerArr2;
                switch (i5) {
                    case 0:
                        return Float.valueOf(RulerKt.access$mergeRulerValues((Placeable.PlacementScope) obj, true, verticalRulerArr3, ((Number) obj2).floatValue()));
                    default:
                        return Float.valueOf(RulerKt.access$mergeRulerValues((Placeable.PlacementScope) obj, false, verticalRulerArr3, ((Number) obj2).floatValue()));
                }
            }
        });
        int length3 = ((RectRulersImpl[]) this.name).length;
        final VerticalRuler[] verticalRulerArr3 = new VerticalRuler[length3];
        for (int i5 = 0; i5 < length3; i5++) {
            verticalRulerArr3[i5] = ((RectRulersImpl[]) this.name)[i5].getRight();
        }
        this.right = new VerticalRuler(0, new Function2() { // from class: androidx.compose.ui.layout.VerticalRuler$Companion$maxOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i42 = i;
                VerticalRuler[] verticalRulerArr22 = verticalRulerArr3;
                switch (i42) {
                    case 0:
                        return Float.valueOf(RulerKt.access$mergeRulerValues((Placeable.PlacementScope) obj, true, verticalRulerArr22, ((Number) obj2).floatValue()));
                    default:
                        return Float.valueOf(RulerKt.access$mergeRulerValues((Placeable.PlacementScope) obj, false, verticalRulerArr22, ((Number) obj2).floatValue()));
                }
            }
        });
        int length4 = ((RectRulersImpl[]) this.name).length;
        final VerticalRuler[] verticalRulerArr4 = new VerticalRuler[length4];
        while (i2 < length4) {
            verticalRulerArr4[i2] = ((RectRulersImpl[]) this.name)[i2].getBottom();
            i2++;
        }
        this.bottom = new VerticalRuler(1, new Function2() { // from class: androidx.compose.ui.layout.HorizontalRuler$Companion$maxOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i52 = i;
                VerticalRuler[] verticalRulerArr32 = verticalRulerArr4;
                switch (i52) {
                    case 0:
                        return Float.valueOf(RulerKt.access$mergeRulerValues((Placeable.PlacementScope) obj, true, verticalRulerArr32, ((Number) obj2).floatValue()));
                    default:
                        return Float.valueOf(RulerKt.access$mergeRulerValues((Placeable.PlacementScope) obj, false, verticalRulerArr32, ((Number) obj2).floatValue()));
                }
            }
        });
    }

    public final VerticalRuler getBottom() {
        int i = this.$r8$classId;
        return this.bottom;
    }

    public final VerticalRuler getLeft() {
        int i = this.$r8$classId;
        return this.left;
    }

    public final VerticalRuler getRight() {
        int i = this.$r8$classId;
        return this.right;
    }

    public final VerticalRuler getTop() {
        int i = this.$r8$classId;
        return this.top;
    }

    public final String toString() {
        int i = this.$r8$classId;
        Object obj = this.name;
        switch (i) {
            case 0:
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(')', "RectRulers(", (String) obj);
            default:
                return ArraysKt___ArraysKt.joinToString$default((RectRulersImpl[]) obj, null, "innermostOf(", ")", null, 57);
        }
    }

    public RectRulersImpl(String str) {
        this.$r8$classId = 0;
        this.name = str;
        this.left = new VerticalRuler(0, null);
        this.top = new VerticalRuler(1, null);
        this.right = new VerticalRuler(0, null);
        this.bottom = new VerticalRuler(1, null);
    }
}
