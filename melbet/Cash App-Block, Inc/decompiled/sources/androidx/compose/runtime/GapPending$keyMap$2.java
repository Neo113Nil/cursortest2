package androidx.compose.runtime;

import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.ObjectListKt;
import androidx.compose.runtime.collection.MultiValueMap;
import androidx.compose.runtime.composer.gapbuffer.KeyInfo;
import com.squareup.preferences.values.MoneyTabCardIntroState;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.ModuleByClassLoaderKt;

/* loaded from: classes.dex */
public final class GapPending$keyMap$2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final Object this$0;

    public /* synthetic */ GapPending$keyMap$2(Object obj, int i) {
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Object obj = this.this$0;
        switch (i) {
            case 0:
                ArrayList arrayList = ((GapPending) obj).keyInfos;
                MutableScatterMap mutableScatterMap = new MutableScatterMap(arrayList.size());
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    KeyInfo keyInfo = (KeyInfo) arrayList.get(i2);
                    Object obj2 = keyInfo.objectKey;
                    int i3 = keyInfo.key;
                    Object joinedKey = obj2 != null ? new JoinedKey(Integer.valueOf(i3), keyInfo.objectKey) : Integer.valueOf(i3);
                    int findInsertIndex = mutableScatterMap.findInsertIndex(joinedKey);
                    boolean z = findInsertIndex < 0;
                    Object obj3 = z ? null : mutableScatterMap.values[findInsertIndex];
                    if (obj3 != null) {
                        if (obj3 instanceof MutableObjectList) {
                            MutableObjectList mutableObjectList = (MutableObjectList) obj3;
                            mutableObjectList.add(keyInfo);
                            keyInfo = mutableObjectList;
                        } else {
                            Object[] objArr = ObjectListKt.EmptyArray;
                            MutableObjectList mutableObjectList2 = new MutableObjectList(2);
                            mutableObjectList2.add(obj3);
                            mutableObjectList2.add(keyInfo);
                            keyInfo = mutableObjectList2;
                        }
                    }
                    if (z) {
                        int i4 = ~findInsertIndex;
                        mutableScatterMap.keys[i4] = joinedKey;
                        mutableScatterMap.values[i4] = keyInfo;
                    } else {
                        mutableScatterMap.values[findInsertIndex] = keyInfo;
                    }
                }
                return new MultiValueMap(mutableScatterMap);
            case 1:
                return (MoneyTabCardIntroState) obj;
            default:
                return ModuleByClassLoaderKt.getOrCreateModule(((KDeclarationContainerImpl) obj).getJClass());
        }
    }
}
