package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class tk {
    public final defpackage.lb ZpBGe2uQfcn8;
    public final defpackage.dd giKS3J6vZuNy;

    public tk(defpackage.lb lbVar, defpackage.dd ddVar) {
        this.ZpBGe2uQfcn8 = lbVar;
        this.giKS3J6vZuNy = ddVar;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        defpackage.dd ddVar = this.giKS3J6vZuNy;
        defpackage.om omVar = (defpackage.om) ddVar.e6mdH7fiFuta.XntWc4eZSQ8j(defpackage.om.QiMR8OkAhezm);
        java.lang.String str2 = omVar != null ? omVar.oh71FJcDz6S2 : null;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Request@");
        int hashCode = hashCode();
        defpackage.jr0.XntWc4eZSQ8j(16);
        java.lang.String num = java.lang.Integer.toString(hashCode, 16);
        num.getClass();
        sb.append(num);
        if (str2 != null) {
            str = "[" + str2 + "](";
        } else {
            str = "(";
        }
        sb.append(str);
        sb.append("currentBounds()=");
        sb.append(this.ZpBGe2uQfcn8.ZpBGe2uQfcn8());
        sb.append(", continuation=");
        sb.append(ddVar);
        sb.append(')');
        return sb.toString();
    }
}
