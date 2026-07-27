package kotlin.text;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class CatchingFishDaggerHiltToast extends AbstractMap {
    public static final /* synthetic */ int CatchingFishLayout = 0;
    public Map CatchingFishDaggerWebsocket;
    public List CatchingFishReduxKtor;
    public Map CatchingFishViewModelFAB;
    public volatile CatchingFishMVPGlideMVP CatchingFishViewModelScope;
    public boolean CatchingFishWorkManager;

    public static CatchingFishDaggerHiltToast CatchingFishWorkManager() {
        CatchingFishDaggerHiltToast catchingFishDaggerHiltToast = new CatchingFishDaggerHiltToast();
        catchingFishDaggerHiltToast.CatchingFishReduxKtor = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        catchingFishDaggerHiltToast.CatchingFishDaggerWebsocket = map;
        catchingFishDaggerHiltToast.CatchingFishViewModelFAB = map;
        return catchingFishDaggerHiltToast;
    }

    public final Map.Entry CatchingFishCoroutine(int i) {
        return (Map.Entry) this.CatchingFishReduxKtor.get(i);
    }

    public final SortedMap CatchingFishDaggerWebsocket() {
        CatchingFishSnackbar();
        if (this.CatchingFishDaggerWebsocket.isEmpty() && !(this.CatchingFishDaggerWebsocket instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.CatchingFishDaggerWebsocket = treeMap;
            this.CatchingFishViewModelFAB = treeMap.descendingMap();
        }
        return (SortedMap) this.CatchingFishDaggerWebsocket;
    }

    public final int CatchingFishParcelableFAB(Comparable comparable) {
        int i;
        int size = this.CatchingFishReduxKtor.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((CatchingFishFragmentMoshi) this.CatchingFishReduxKtor.get(i2)).CatchingFishReduxKtor);
            if (compareTo > 0) {
                i = size + 1;
                return -i;
            }
            if (compareTo == 0) {
                return i2;
            }
        }
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = comparable.compareTo(((CatchingFishFragmentMoshi) this.CatchingFishReduxKtor.get(i4)).CatchingFishReduxKtor);
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        i = i3 + 1;
        return -i;
    }

    public final Set CatchingFishReduxKtor() {
        return this.CatchingFishDaggerWebsocket.isEmpty() ? Collections.EMPTY_SET : this.CatchingFishDaggerWebsocket.entrySet();
    }

    public final void CatchingFishSnackbar() {
        if (this.CatchingFishWorkManager) {
            throw new UnsupportedOperationException();
        }
    }

    public final Object CatchingFishViewModelFAB(int i) {
        CatchingFishSnackbar();
        Object obj = ((CatchingFishFragmentMoshi) this.CatchingFishReduxKtor.remove(i)).CatchingFishDaggerWebsocket;
        if (!this.CatchingFishDaggerWebsocket.isEmpty()) {
            Iterator it = CatchingFishDaggerWebsocket().entrySet().iterator();
            List list = this.CatchingFishReduxKtor;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new CatchingFishFragmentMoshi(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: CatchingFishViewModelScope, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        CatchingFishSnackbar();
        int CatchingFishParcelableFAB = CatchingFishParcelableFAB(comparable);
        if (CatchingFishParcelableFAB >= 0) {
            return ((CatchingFishFragmentMoshi) this.CatchingFishReduxKtor.get(CatchingFishParcelableFAB)).setValue(obj);
        }
        CatchingFishSnackbar();
        if (this.CatchingFishReduxKtor.isEmpty() && !(this.CatchingFishReduxKtor instanceof ArrayList)) {
            this.CatchingFishReduxKtor = new ArrayList(16);
        }
        int i = -(CatchingFishParcelableFAB + 1);
        if (i >= 16) {
            return CatchingFishDaggerWebsocket().put(comparable, obj);
        }
        if (this.CatchingFishReduxKtor.size() == 16) {
            CatchingFishFragmentMoshi catchingFishFragmentMoshi = (CatchingFishFragmentMoshi) this.CatchingFishReduxKtor.remove(15);
            CatchingFishDaggerWebsocket().put(catchingFishFragmentMoshi.CatchingFishReduxKtor, catchingFishFragmentMoshi.CatchingFishDaggerWebsocket);
        }
        this.CatchingFishReduxKtor.add(i, new CatchingFishFragmentMoshi(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        CatchingFishSnackbar();
        if (!this.CatchingFishReduxKtor.isEmpty()) {
            this.CatchingFishReduxKtor.clear();
        }
        if (this.CatchingFishDaggerWebsocket.isEmpty()) {
            return;
        }
        this.CatchingFishDaggerWebsocket.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return CatchingFishParcelableFAB(comparable) >= 0 || this.CatchingFishDaggerWebsocket.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.CatchingFishViewModelScope == null) {
            this.CatchingFishViewModelScope = new CatchingFishMVPGlideMVP(this, 1);
        }
        return this.CatchingFishViewModelScope;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishDaggerHiltToast)) {
            return super.equals(obj);
        }
        CatchingFishDaggerHiltToast catchingFishDaggerHiltToast = (CatchingFishDaggerHiltToast) obj;
        int size = size();
        if (size == catchingFishDaggerHiltToast.size()) {
            int size2 = this.CatchingFishReduxKtor.size();
            if (size2 != catchingFishDaggerHiltToast.CatchingFishReduxKtor.size()) {
                return ((AbstractSet) entrySet()).equals(catchingFishDaggerHiltToast.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (CatchingFishCoroutine(i).equals(catchingFishDaggerHiltToast.CatchingFishCoroutine(i))) {
                }
            }
            if (size2 != size) {
                return this.CatchingFishDaggerWebsocket.equals(catchingFishDaggerHiltToast.CatchingFishDaggerWebsocket);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int CatchingFishParcelableFAB = CatchingFishParcelableFAB(comparable);
        return CatchingFishParcelableFAB >= 0 ? ((CatchingFishFragmentMoshi) this.CatchingFishReduxKtor.get(CatchingFishParcelableFAB)).CatchingFishDaggerWebsocket : this.CatchingFishDaggerWebsocket.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.CatchingFishReduxKtor.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((CatchingFishFragmentMoshi) this.CatchingFishReduxKtor.get(i2)).hashCode();
        }
        return this.CatchingFishDaggerWebsocket.size() > 0 ? this.CatchingFishDaggerWebsocket.hashCode() + i : i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        CatchingFishSnackbar();
        Comparable comparable = (Comparable) obj;
        int CatchingFishParcelableFAB = CatchingFishParcelableFAB(comparable);
        if (CatchingFishParcelableFAB >= 0) {
            return CatchingFishViewModelFAB(CatchingFishParcelableFAB);
        }
        if (this.CatchingFishDaggerWebsocket.isEmpty()) {
            return null;
        }
        return this.CatchingFishDaggerWebsocket.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.CatchingFishDaggerWebsocket.size() + this.CatchingFishReduxKtor.size();
    }
}
