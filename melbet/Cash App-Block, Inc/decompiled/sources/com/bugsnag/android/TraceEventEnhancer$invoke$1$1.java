package com.bugsnag.android;

import androidx.compose.ui.layout.Placeable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
public final class TraceEventEnhancer$invoke$1$1 extends Lambda implements Function1 {
    public final /* synthetic */ ArrayList $newThreads;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TraceEventEnhancer$invoke$1$1(int i, ArrayList arrayList) {
        super(1);
        this.$r8$classId = i;
        this.$newThreads = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        ArrayList arrayList = this.$newThreads;
        switch (i) {
            case 0:
                arrayList.add((Thread) obj);
                break;
            case 1:
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, (Placeable) arrayList.get(i2), 0, 0, RecyclerView.DECELERATION_RATE, 12);
                }
                break;
            case 2:
                Placeable.PlacementScope placementScope2 = (Placeable.PlacementScope) obj;
                int size2 = arrayList.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    placementScope2.placeRelative((Placeable) arrayList.get(i3), 0, 0, RecyclerView.DECELERATION_RATE);
                }
                break;
            default:
                Placeable.PlacementScope placementScope3 = (Placeable.PlacementScope) obj;
                int size3 = arrayList.size() - 1;
                if (size3 >= 0) {
                    int i4 = 0;
                    while (true) {
                        placementScope3.placeRelative((Placeable) arrayList.get(i4), 0, 0, RecyclerView.DECELERATION_RATE);
                        if (i4 != size3) {
                            i4++;
                        }
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
