package defpackage;

/* loaded from: classes.dex */
public final class kg extends java.lang.RuntimeException {
    public final defpackage.wk0 AARZUJiTa;
    public final int EXtogiMhuM;
    public final defpackage.gl0 adDC3e2L;
    public final defpackage.gl0 xiZrDbcSW0;

    public kg(defpackage.gl0 gl0Var, defpackage.gl0 gl0Var2, defpackage.wk0 wk0Var, int i, java.lang.Exception exc) {
        super(exc);
        this.adDC3e2L = gl0Var;
        this.xiZrDbcSW0 = gl0Var2;
        this.AARZUJiTa = wk0Var;
        this.EXtogiMhuM = i;
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        java.util.List list;
        java.util.Collection collection;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("\n            |Failed to execute op number ");
        sb.append(this.EXtogiMhuM);
        sb.append(":\n            |");
        defpackage.z71 PAEGRtP0bX = defpackage.j70.PAEGRtP0bX(new defpackage.jg(this, null));
        if (PAEGRtP0bX.hasNext()) {
            java.lang.Object next = PAEGRtP0bX.next();
            if (PAEGRtP0bX.hasNext()) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(next);
                while (PAEGRtP0bX.hasNext()) {
                    arrayList.add(PAEGRtP0bX.next());
                }
                list = arrayList;
            } else {
                list = defpackage.fm.p4kuH6PDtgom(next);
            }
        } else {
            list = defpackage.nt.adDC3e2L;
        }
        int size = list.size();
        if (50 >= size) {
            collection = defpackage.td.boH8X4DXyc4(list);
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(50);
            if (list instanceof java.util.RandomAccess) {
                for (int i = size - 50; i < size; i++) {
                    arrayList2.add(list.get(i));
                }
            } else {
                java.util.ListIterator listIterator = list.listIterator(size - 50);
                while (listIterator.hasNext()) {
                    arrayList2.add(listIterator.next());
                }
            }
            collection = arrayList2;
        }
        sb.append(defpackage.td.cSNyPqwud(collection, "\n", null, null, null, 62));
        sb.append("\n            ");
        return defpackage.sc1.Ye0N2xE9Hc(sb.toString());
    }
}
