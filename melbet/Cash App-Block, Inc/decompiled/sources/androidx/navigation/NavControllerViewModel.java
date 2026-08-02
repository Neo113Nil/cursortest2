package androidx.navigation;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStore;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.UInt;
import kotlin.text.UStringsKt;

/* loaded from: classes3.dex */
public final class NavControllerViewModel extends ViewModel {
    public final LinkedHashMap viewModelStores = new LinkedHashMap();

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        LinkedHashMap linkedHashMap = this.viewModelStores;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((ViewModelStore) it.next()).clear();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        int identityHashCode = System.identityHashCode(this);
        UInt.Companion companion = UInt.Companion;
        sb.append(UStringsKt.m4159toStringV7xB4Y4(identityHashCode));
        sb.append("} ViewModelStores (");
        Iterator it = this.viewModelStores.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
