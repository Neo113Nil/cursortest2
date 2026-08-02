package androidx.lifecycle.viewmodel;

import androidx.lifecycle.viewmodel.CreationExtras;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class MutableCreationExtras extends CreationExtras {
    public MutableCreationExtras(CreationExtras creationExtras) {
        creationExtras.getClass();
        LinkedHashMap linkedHashMap = creationExtras.extras;
        linkedHashMap.getClass();
        this.extras.putAll(linkedHashMap);
    }

    @Override // androidx.lifecycle.viewmodel.CreationExtras
    public final Object get(CreationExtras.Key key) {
        return this.extras.get(key);
    }

    public /* synthetic */ MutableCreationExtras(int i) {
        this(CreationExtras.Empty.INSTANCE);
    }
}
