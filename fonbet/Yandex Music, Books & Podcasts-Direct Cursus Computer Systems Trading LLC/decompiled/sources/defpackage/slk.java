package defpackage;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class slk implements ulk {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ slk(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.ulk
    public final ulk a(int i, Object obj, Object obj2, int i2) {
        slk slkVar;
        switch (this.a) {
            case 0:
                Object[] objArr = (Object[]) this.c;
                Object[] objArr2 = (Object[]) this.b;
                int i3 = 0;
                int hashCode = objArr2[0].hashCode();
                if (hashCode != i) {
                    return tlk.c(new slk(1, obj, obj2), i, this, hashCode, i2);
                }
                while (true) {
                    if (i3 >= objArr2.length) {
                        i3 = -1;
                    } else if (objArr2[i3] != obj) {
                        i3++;
                    }
                }
                if (i3 != -1) {
                    Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
                    Object[] copyOf2 = Arrays.copyOf(objArr, objArr2.length);
                    copyOf[i3] = obj;
                    copyOf2[i3] = obj2;
                    slkVar = new slk(0, copyOf, copyOf2);
                } else {
                    Object[] copyOf3 = Arrays.copyOf(objArr2, objArr2.length + 1);
                    Object[] copyOf4 = Arrays.copyOf(objArr, objArr2.length + 1);
                    copyOf3[objArr2.length] = obj;
                    copyOf4[objArr2.length] = obj2;
                    slkVar = new slk(0, copyOf3, copyOf4);
                }
                return slkVar;
            default:
                Object obj3 = this.b;
                int hashCode2 = obj3.hashCode();
                if (hashCode2 != i) {
                    return tlk.c(new slk(1, obj, obj2), i, this, hashCode2, i2);
                }
                if (obj3 == obj) {
                    return new slk(1, obj, obj2);
                }
                return new slk(0, new Object[]{obj3, obj}, new Object[]{this.c, obj2});
        }
    }

    @Override // defpackage.ulk
    public final Object b(int i, int i2, Object obj) {
        switch (this.a) {
            case 0:
                int i3 = 0;
                while (true) {
                    Object[] objArr = (Object[]) this.b;
                    if (i3 >= objArr.length) {
                        return null;
                    }
                    if (objArr[i3] == obj) {
                        return ((Object[]) this.c)[i3];
                    }
                    i3++;
                }
            default:
                if (this.b == obj) {
                    return this.c;
                }
                return null;
        }
    }

    @Override // defpackage.ulk
    public final int size() {
        switch (this.a) {
            case 0:
                return ((Object[]) this.c).length;
            default:
                return 1;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                Object[] objArr = (Object[]) this.c;
                StringBuilder sb = new StringBuilder("CollisionLeaf(");
                for (int i = 0; i < objArr.length; i++) {
                    sb.append("(key=");
                    sb.append(((Object[]) this.b)[i]);
                    sb.append(" value=");
                    sb.append(objArr[i]);
                    sb.append(") ");
                }
                sb.append(")");
                return sb.toString();
            default:
                return String.format("Leaf(key=%s value=%s)", this.b, this.c);
        }
    }
}
