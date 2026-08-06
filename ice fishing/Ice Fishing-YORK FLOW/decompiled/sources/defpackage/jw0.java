package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public class jw0 {
    public final java.util.List ZpBGe2uQfcn8;
    public int giKS3J6vZuNy;

    public jw0(int i, java.util.ArrayList arrayList) {
        this.ZpBGe2uQfcn8 = (i & 1) != 0 ? new java.util.ArrayList() : arrayList;
    }

    public java.lang.Object ZpBGe2uQfcn8(defpackage.ne neVar) {
        java.lang.Object obj;
        neVar.getClass();
        java.util.List list = this.ZpBGe2uQfcn8;
        if (list.isEmpty()) {
            return null;
        }
        java.lang.Object obj2 = list.get(this.giKS3J6vZuNy);
        if (!neVar.JhCgjQRTAOCT(obj2)) {
            obj2 = null;
        }
        if (obj2 == null) {
            obj2 = null;
        }
        if (obj2 != null && this.giKS3J6vZuNy < defpackage.ma0.BHfvd2J71qpO(list)) {
            this.giKS3J6vZuNy++;
        }
        if (obj2 != null) {
            return obj2;
        }
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (neVar.JhCgjQRTAOCT(obj)) {
                break;
            }
        }
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.jw0) {
            return defpackage.ma0.QiMR8OkAhezm(this.ZpBGe2uQfcn8, ((defpackage.jw0) obj).ZpBGe2uQfcn8);
        }
        return false;
    }

    public final int hashCode() {
        return this.ZpBGe2uQfcn8.hashCode() * 31;
    }

    public final java.lang.String toString() {
        return "DefinitionParameters" + defpackage.hf.a6r05ZxsOP0A(this.ZpBGe2uQfcn8);
    }
}
