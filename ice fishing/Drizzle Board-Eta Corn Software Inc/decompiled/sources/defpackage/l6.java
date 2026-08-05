package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final /* synthetic */ class l6 implements dl {
    public final /* synthetic */ int NCTxEWno;

    public /* synthetic */ l6(int i) {
        this.NCTxEWno = i;
    }

    @Override // defpackage.dl
    public final Object Qr9iLBAD(Object obj, Object obj2) {
        m6 m6Var;
        switch (this.NCTxEWno) {
            case 0:
                String str = (String) obj;
                j9 j9Var = (j9) obj2;
                str.getClass();
                j9Var.getClass();
                if (str.length() == 0) {
                    return j9Var.toString();
                }
                return str + ", " + j9Var;
            case 1:
                l9 l9Var = (l9) obj;
                j9 j9Var2 = (j9) obj2;
                l9Var.getClass();
                j9Var2.getClass();
                l9 lDXGDhIF = l9Var.lDXGDhIF(j9Var2.getKey());
                uf ufVar = uf.NCTxEWno;
                if (lDXGDhIF == ufVar) {
                    return j9Var2;
                }
                re reVar = re.MdtA4re8;
                n9 n9Var = (n9) lDXGDhIF.OnDfzHZD(reVar);
                if (n9Var == null) {
                    m6Var = new m6(j9Var2, lDXGDhIF);
                } else {
                    l9 lDXGDhIF2 = lDXGDhIF.lDXGDhIF(reVar);
                    if (lDXGDhIF2 == ufVar) {
                        return new m6(n9Var, j9Var2);
                    }
                    m6Var = new m6(n9Var, new m6(j9Var2, lDXGDhIF2));
                }
                return m6Var;
            case 2:
                return Boolean.valueOf(((Boolean) obj).booleanValue());
            case 3:
                return ((l9) obj).eVhOlqcC((j9) obj2);
            case 4:
                return ((l9) obj).eVhOlqcC((j9) obj2);
            case 5:
                return Boolean.valueOf(fn.qoPGr6Ce(obj, obj2));
            case 6:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 7:
                j9 j9Var3 = (j9) obj2;
                if (!(j9Var3 instanceof jc0)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? j9Var3 : Integer.valueOf(intValue + 1);
            case 8:
                jc0 jc0Var = (jc0) obj;
                j9 j9Var4 = (j9) obj2;
                if (jc0Var != null) {
                    return jc0Var;
                }
                if (j9Var4 instanceof jc0) {
                    return (jc0) j9Var4;
                }
                return null;
            default:
                nc0 nc0Var = (nc0) obj;
                j9 j9Var5 = (j9) obj2;
                if (j9Var5 instanceof jc0) {
                    jc0 jc0Var2 = (jc0) j9Var5;
                    l9 l9Var2 = nc0Var.qoPGr6Ce;
                    ThreadLocal threadLocal = jc0Var2.MdtA4re8;
                    Object obj3 = threadLocal.get();
                    threadLocal.set(jc0Var2.NCTxEWno);
                    Object[] objArr = nc0Var.NCTxEWno;
                    int i = nc0Var.wxUZMvaN;
                    objArr[i] = obj3;
                    jc0[] jc0VarArr = nc0Var.MdtA4re8;
                    nc0Var.wxUZMvaN = i + 1;
                    jc0VarArr[i] = jc0Var2;
                }
                return nc0Var;
        }
    }
}
