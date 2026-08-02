package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class SurfaceCombination {
    public final ArrayList mSurfaceConfigList = new ArrayList();

    public static void generateArrangements(ArrayList arrayList, int i, int[] iArr, int i2) {
        if (i2 >= iArr.length) {
            arrayList.add((int[]) iArr.clone());
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    iArr[i2] = i3;
                    generateArrangements(arrayList, i, iArr, i2 + 1);
                    break;
                } else if (i3 == iArr[i4]) {
                    break;
                } else {
                    i4++;
                }
            }
        }
    }

    public final void addSurfaceConfig(SurfaceConfig surfaceConfig) {
        this.mSurfaceConfigList.add(surfaceConfig);
    }

    public final List getOrderedSupportedSurfaceConfigList(ArrayList arrayList) {
        StreamUseCase streamUseCase;
        StreamUseCase streamUseCase2;
        StreamUseCase streamUseCase3;
        if (arrayList.isEmpty()) {
            return new ArrayList();
        }
        int size = arrayList.size();
        ArrayList arrayList2 = this.mSurfaceConfigList;
        if (size != arrayList2.size()) {
            return null;
        }
        int size2 = arrayList2.size();
        ArrayList arrayList3 = new ArrayList();
        generateArrangements(arrayList3, size2, new int[size2], 0);
        SurfaceConfig[] surfaceConfigArr = new SurfaceConfig[arrayList.size()];
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            boolean z = true;
            for (int i = 0; i < arrayList2.size(); i++) {
                if (iArr[i] < arrayList.size()) {
                    SurfaceConfig surfaceConfig = (SurfaceConfig) arrayList2.get(i);
                    SurfaceConfig surfaceConfig2 = (SurfaceConfig) arrayList.get(iArr[i]);
                    surfaceConfig.getClass();
                    surfaceConfig2.getClass();
                    z &= surfaceConfig2.configSize.id <= surfaceConfig.configSize.id && surfaceConfig2.configType == surfaceConfig.configType && ((streamUseCase = surfaceConfig.streamUseCase) == (streamUseCase2 = StreamUseCase.DEFAULT) || (streamUseCase3 = surfaceConfig2.streamUseCase) == streamUseCase2 || streamUseCase3 == streamUseCase);
                    if (!z) {
                        break;
                    }
                    surfaceConfigArr[iArr[i]] = (SurfaceConfig) arrayList2.get(i);
                }
            }
            if (z) {
                return Arrays.asList(surfaceConfigArr);
            }
        }
        return null;
    }
}
