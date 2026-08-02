package kotlin.collections.builders;

import defpackage.bb1;
import defpackage.bgx;
import defpackage.g8;
import defpackage.jl40;
import defpackage.k8;
import defpackage.ny61;
import defpackage.sf00;
import defpackage.vf00;
import defpackage.w511;
import defpackage.wf00;
import defpackage.xf00;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005:\u0006012223B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR$\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00188\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010!R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R$\u0010)\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R$\u0010,\u001a\u00020+2\u0006\u0010\u001e\u001a\u00020+8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00064"}, d2 = {"Lkotlin/collections/builders/MapBuilder;", CA20Status.STATUS_REQUEST_K, CA20Status.STATUS_CERTIFICATE_V, "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "input", "Lzy11;", "readObject", "(Ljava/io/ObjectInputStream;)V", "", "keysArray", "[Ljava/lang/Object;", "valuesArray", "", "presenceArray", "[I", "hashArray", "", "maxProbeDistance", CA20Status.STATUS_USER_I, "length", "hashShift", "modCount", "value", "size", "getSize", "()I", "Lwf00;", "keysView", "Lwf00;", "Lxf00;", "valuesView", "Lxf00;", "Lvf00;", "entriesView", "Lvf00;", "", "isReadOnly", "Z", "s", "()Z", "tms", "uf00", "sf00", "tf00", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MapBuilder<K, V> implements Map<K, V>, Serializable, bgx {
    public static final MapBuilder a;
    private vf00 entriesView;
    private int[] hashArray;
    private int hashShift;
    private boolean isReadOnly;
    private K[] keysArray;
    private wf00 keysView;
    private int length;
    private int maxProbeDistance;
    private int modCount;
    private int[] presenceArray;
    private int size;
    private V[] valuesArray;
    private xf00 valuesView;

    static {
        MapBuilder mapBuilder = new MapBuilder(0);
        mapBuilder.isReadOnly = true;
        a = mapBuilder;
    }

    public MapBuilder(int i) {
        if (i < 0) {
            ny61.g("capacity must be non-negative.");
            throw null;
        }
        K[] kArr = (K[]) new Object[i];
        int[] iArr = new int[i];
        int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.keysArray = kArr;
        this.valuesArray = null;
        this.presenceArray = iArr;
        this.hashArray = new int[highestOneBit];
        this.maxProbeDistance = 2;
        this.length = 0;
        this.hashShift = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }

    private final void readObject(ObjectInputStream input) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        if (this.isReadOnly) {
            return new SerializedMap(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    @Override // java.util.Map
    public final void clear() {
        k();
        int i = this.length - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.presenceArray;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.hashArray[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        bb1.H(0, this.length, this.keysArray);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            bb1.H(0, this.length, vArr);
        }
        this.size = 0;
        this.length = 0;
        this.modCount++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return p(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return q(obj) >= 0;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        vf00 vf00Var = this.entriesView;
        if (vf00Var != null) {
            return vf00Var;
        }
        vf00 vf00Var2 = new vf00(this);
        this.entriesView = vf00Var2;
        return vf00Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this.size != map.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry == null) {
                return false;
            }
            try {
                if (!m(entry)) {
                    return false;
                }
            } catch (ClassCastException unused) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int p = p(obj);
        if (p < 0) {
            return null;
        }
        return this.valuesArray[p];
    }

    public final int h(Object obj) {
        k();
        while (true) {
            int r = r(obj);
            int i = this.maxProbeDistance * 2;
            int length = this.hashArray.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.hashArray;
                int i3 = iArr[r];
                if (i3 == 0) {
                    int i4 = this.length;
                    Object[] objArr = (K[]) this.keysArray;
                    if (i4 < objArr.length) {
                        int i5 = i4 + 1;
                        this.length = i5;
                        objArr[i4] = obj;
                        this.presenceArray[i4] = r;
                        iArr[r] = i5;
                        this.size++;
                        this.modCount++;
                        if (i2 > this.maxProbeDistance) {
                            this.maxProbeDistance = i2;
                        }
                        return i4;
                    }
                    n(1);
                } else {
                    if (jl40.l(this.keysArray[i3 - 1], obj)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        t(this.hashArray.length * 2);
                        break;
                    }
                    r = r == 0 ? this.hashArray.length - 1 : r - 1;
                }
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        sf00 sf00Var = new sf00(this, 0);
        int i = 0;
        while (sf00Var.hasNext()) {
            int i2 = sf00Var.a;
            MapBuilder mapBuilder = (MapBuilder) sf00Var.w;
            if (i2 >= mapBuilder.length) {
                ny61.p();
                return 0;
            }
            int i3 = sf00Var.a;
            sf00Var.a = i3 + 1;
            sf00Var.b = i3;
            Object obj = mapBuilder.keysArray[sf00Var.b];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object obj2 = mapBuilder.valuesArray[sf00Var.b];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            sf00Var.d();
            i += hashCode ^ hashCode2;
        }
        return i;
    }

    public final Object[] i() {
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            return vArr;
        }
        int length = this.keysArray.length;
        if (length < 0) {
            ny61.g("capacity must be non-negative.");
            return null;
        }
        V[] vArr2 = (V[]) new Object[length];
        this.valuesArray = vArr2;
        return vArr2;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.size == 0;
    }

    public final MapBuilder j() {
        k();
        this.isReadOnly = true;
        return this.size > 0 ? this : a;
    }

    public final void k() {
        if (this.isReadOnly) {
            w511.u();
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        wf00 wf00Var = this.keysView;
        if (wf00Var != null) {
            return wf00Var;
        }
        wf00 wf00Var2 = new wf00(this);
        this.keysView = wf00Var2;
        return wf00Var2;
    }

    public final void l(boolean z) {
        int i;
        V[] vArr = this.valuesArray;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.length;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.presenceArray;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                K[] kArr = this.keysArray;
                kArr[i3] = kArr[i2];
                if (vArr != null) {
                    vArr[i3] = vArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.hashArray[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        bb1.H(i3, i, this.keysArray);
        if (vArr != null) {
            bb1.H(i3, this.length, vArr);
        }
        this.length = i3;
    }

    public final boolean m(Map.Entry entry) {
        int p = p(entry.getKey());
        if (p < 0) {
            return false;
        }
        return jl40.l(this.valuesArray[p], entry.getValue());
    }

    public final void n(int i) {
        K[] kArr = this.keysArray;
        int length = kArr.length;
        int i2 = this.length;
        int i3 = length - i2;
        int i4 = i2 - this.size;
        if (i3 < i && i3 + i4 >= i && i4 >= kArr.length / 4) {
            l(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > kArr.length) {
            g8 g8Var = k8.Companion;
            int length2 = kArr.length;
            g8Var.getClass();
            int e = g8.e(length2, i5);
            this.keysArray = (K[]) Arrays.copyOf(this.keysArray, e);
            V[] vArr = this.valuesArray;
            this.valuesArray = vArr != null ? (V[]) Arrays.copyOf(vArr, e) : null;
            this.presenceArray = Arrays.copyOf(this.presenceArray, e);
            int highestOneBit = Integer.highestOneBit((e >= 1 ? e : 1) * 3);
            if (highestOneBit > this.hashArray.length) {
                t(highestOneBit);
            }
        }
    }

    public final int p(Object obj) {
        int r = r(obj);
        int i = this.maxProbeDistance;
        while (true) {
            int i2 = this.hashArray[r];
            if (i2 == 0) {
                return -1;
            }
            int i3 = i2 - 1;
            if (jl40.l(this.keysArray[i3], obj)) {
                return i3;
            }
            i--;
            if (i < 0) {
                return -1;
            }
            r = r == 0 ? this.hashArray.length - 1 : r - 1;
        }
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        k();
        int h = h(obj);
        Object[] i = i();
        if (h >= 0) {
            i[h] = obj2;
            return null;
        }
        int i2 = (-h) - 1;
        Object obj3 = i[i2];
        i[i2] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        k();
        Set<Map.Entry<K, V>> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        n(entrySet.size());
        for (Map.Entry<K, V> entry : entrySet) {
            int h = h(entry.getKey());
            Object[] i = i();
            if (h >= 0) {
                i[h] = entry.getValue();
            } else {
                int i2 = (-h) - 1;
                if (!jl40.l(entry.getValue(), i[i2])) {
                    i[i2] = entry.getValue();
                }
            }
        }
    }

    public final int q(Object obj) {
        int i = this.length;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.presenceArray[i] >= 0 && jl40.l(this.valuesArray[i], obj)) {
                return i;
            }
        }
    }

    public final int r(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.hashShift;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        k();
        int p = p(obj);
        if (p < 0) {
            return null;
        }
        V v = this.valuesArray[p];
        v(p);
        return v;
    }

    /* renamed from: s, reason: from getter */
    public final boolean getIsReadOnly() {
        return this.isReadOnly;
    }

    @Override // java.util.Map
    public final int size() {
        return this.size;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.presenceArray[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(int i) {
        this.modCount++;
        int i2 = 0;
        if (this.length > this.size) {
            l(false);
        }
        this.hashArray = new int[i];
        this.hashShift = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.length) {
            int i3 = i2 + 1;
            int r = r(this.keysArray[i2]);
            int i4 = this.maxProbeDistance;
            while (true) {
                int[] iArr = this.hashArray;
                if (iArr[r] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    ny61.r("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
                r = r == 0 ? iArr.length - 1 : r - 1;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.size * 3) + 2);
        sb.append("{");
        int i = 0;
        sf00 sf00Var = new sf00(this, i);
        while (sf00Var.hasNext()) {
            if (i > 0) {
                sb.append(Extension.FIX_SPACE);
            }
            int i2 = sf00Var.a;
            MapBuilder mapBuilder = (MapBuilder) sf00Var.w;
            if (i2 >= mapBuilder.length) {
                ny61.p();
                return null;
            }
            int i3 = sf00Var.a;
            sf00Var.a = i3 + 1;
            sf00Var.b = i3;
            Object obj = mapBuilder.keysArray[sf00Var.b];
            if (obj == mapBuilder) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object obj2 = mapBuilder.valuesArray[sf00Var.b];
            if (obj2 == mapBuilder) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            sf00Var.d();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    public final boolean u(Map.Entry entry) {
        k();
        int p = p(entry.getKey());
        if (p < 0 || !jl40.l(this.valuesArray[p], entry.getValue())) {
            return false;
        }
        v(p);
        return true;
    }

    public final void v(int i) {
        int i2;
        int i3;
        int r;
        int[] iArr;
        this.keysArray[i] = null;
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            vArr[i] = null;
        }
        int i4 = this.presenceArray[i];
        loop0: while (true) {
            int i5 = i4;
            int i6 = 0;
            do {
                i4 = i4 == 0 ? this.hashArray.length - 1 : i4 - 1;
                int[] iArr2 = this.hashArray;
                i2 = iArr2[i4];
                i6++;
                if (i6 > this.maxProbeDistance) {
                    iArr2[i5] = 0;
                    break loop0;
                } else if (i2 == 0) {
                    iArr2[i5] = 0;
                    break loop0;
                } else {
                    i3 = i2 - 1;
                    r = r(this.keysArray[i3]) - i4;
                    iArr = this.hashArray;
                }
            } while ((r & (iArr.length - 1)) < i6);
            iArr[i5] = i2;
            this.presenceArray[i3] = i5;
        }
        this.presenceArray[i] = -1;
        this.size--;
        this.modCount++;
    }

    @Override // java.util.Map
    public final Collection values() {
        xf00 xf00Var = this.valuesView;
        if (xf00Var != null) {
            return xf00Var;
        }
        xf00 xf00Var2 = new xf00(this);
        this.valuesView = xf00Var2;
        return xf00Var2;
    }

    public MapBuilder() {
        this(8);
    }
}
