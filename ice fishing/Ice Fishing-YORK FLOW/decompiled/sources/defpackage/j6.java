package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class j6 implements java.lang.Appendable {
    public final java.lang.StringBuilder WDYagTQQm9ns = new java.lang.StringBuilder(16);
    public final java.util.ArrayList oh71FJcDz6S2;

    public j6(defpackage.l6 l6Var) {
        new java.util.ArrayList();
        this.oh71FJcDz6S2 = new java.util.ArrayList();
        new java.util.ArrayList();
        ZpBGe2uQfcn8(l6Var);
    }

    public final void ZpBGe2uQfcn8(defpackage.l6 l6Var) {
        java.lang.StringBuilder sb = this.WDYagTQQm9ns;
        int length = sb.length();
        sb.append(l6Var.oh71FJcDz6S2);
        java.util.List list = l6Var.WDYagTQQm9ns;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                defpackage.k6 k6Var = (defpackage.k6) list.get(i);
                this.oh71FJcDz6S2.add(new defpackage.i6(k6Var.giKS3J6vZuNy + length, k6Var.fWTAfUmVKrZq + length, k6Var.ZpBGe2uQfcn8, k6Var.JhCgjQRTAOCT));
            }
        }
    }

    @Override // java.lang.Appendable
    public final java.lang.Appendable append(java.lang.CharSequence charSequence, int i, int i2) {
        boolean z = charSequence instanceof defpackage.l6;
        java.lang.StringBuilder sb = this.WDYagTQQm9ns;
        if (!z) {
            sb.append(charSequence, i, i2);
            return this;
        }
        defpackage.l6 l6Var = (defpackage.l6) charSequence;
        int length = sb.length();
        sb.append((java.lang.CharSequence) l6Var.oh71FJcDz6S2, i, i2);
        java.util.List ZpBGe2uQfcn8 = defpackage.m6.ZpBGe2uQfcn8(l6Var, i, i2, null);
        if (ZpBGe2uQfcn8 != null) {
            int size = ZpBGe2uQfcn8.size();
            for (int i3 = 0; i3 < size; i3++) {
                defpackage.k6 k6Var = (defpackage.k6) ZpBGe2uQfcn8.get(i3);
                this.oh71FJcDz6S2.add(new defpackage.i6(k6Var.giKS3J6vZuNy + length, k6Var.fWTAfUmVKrZq + length, k6Var.ZpBGe2uQfcn8, k6Var.JhCgjQRTAOCT));
            }
        }
        return this;
    }

    public final defpackage.l6 giKS3J6vZuNy() {
        java.lang.StringBuilder sb = this.WDYagTQQm9ns;
        java.lang.String sb2 = sb.toString();
        java.util.ArrayList arrayList = this.oh71FJcDz6S2;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            defpackage.i6 i6Var = (defpackage.i6) arrayList.get(i);
            int length = sb.length();
            int i2 = i6Var.fWTAfUmVKrZq;
            if (i2 != Integer.MIN_VALUE) {
                length = i2;
            }
            if (length == Integer.MIN_VALUE) {
                defpackage.f80.giKS3J6vZuNy("Item.end should be set first");
            }
            arrayList2.add(new defpackage.k6(i6Var.giKS3J6vZuNy, length, i6Var.ZpBGe2uQfcn8, i6Var.JhCgjQRTAOCT));
        }
        return new defpackage.l6(sb2, arrayList2);
    }

    @Override // java.lang.Appendable
    public final java.lang.Appendable append(java.lang.CharSequence charSequence) {
        if (charSequence instanceof defpackage.l6) {
            ZpBGe2uQfcn8((defpackage.l6) charSequence);
            return this;
        }
        this.WDYagTQQm9ns.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final java.lang.Appendable append(char c) {
        this.WDYagTQQm9ns.append(c);
        return this;
    }
}
