package defpackage;

import java.util.AbstractSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class jb0 {
    public final Set MdtA4re8;
    public final Map NCTxEWno;
    public final String qoPGr6Ce;
    public final Set wxUZMvaN;

    public jb0(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        abstractSet.getClass();
        this.qoPGr6Ce = str;
        this.NCTxEWno = map;
        this.MdtA4re8 = abstractSet;
        this.wxUZMvaN = abstractSet2;
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jb0)) {
            return false;
        }
        jb0 jb0Var = (jb0) obj;
        if (!this.qoPGr6Ce.equals(jb0Var.qoPGr6Ce) || !this.NCTxEWno.equals(jb0Var.NCTxEWno) || !this.MdtA4re8.equals(jb0Var.MdtA4re8)) {
            return false;
        }
        Set set2 = this.wxUZMvaN;
        if (set2 == null || (set = jb0Var.wxUZMvaN) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.MdtA4re8.hashCode() + ((this.NCTxEWno.hashCode() + (this.qoPGr6Ce.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.qoPGr6Ce);
        sb.append("',\n            |    columns = {");
        sb.append(f50.Qr9iLBAD(x5.XrPeKzBk(this.NCTxEWno.values(), new sc(11))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(f50.Qr9iLBAD(this.MdtA4re8));
        sb.append("\n            |    indices = {");
        Set set = this.wxUZMvaN;
        sb.append(f50.Qr9iLBAD(set != null ? x5.XrPeKzBk(set, new sc(12)) : wf.NCTxEWno));
        sb.append("\n            |}\n        ");
        return ca0.OxcuoDLp(sb.toString());
    }
}
