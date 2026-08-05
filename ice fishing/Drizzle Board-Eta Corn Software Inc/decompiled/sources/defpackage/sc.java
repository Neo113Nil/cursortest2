package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;
import java.util.Map;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class sc implements Comparator {
    public final /* synthetic */ int qoPGr6Ce;

    public /* synthetic */ sc(int i) {
        this.qoPGr6Ce = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00df, code lost:
    
        if (r4 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ea, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e8, code lost:
    
        if (r4 != false) goto L40;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        switch (this.qoPGr6Ce) {
            case 0:
                return ((tc) obj).qoPGr6Ce - ((tc) obj2).qoPGr6Ce;
            case 1:
                ql qlVar = (ql) obj;
                ql qlVar2 = (ql) obj2;
                RecyclerView recyclerView = qlVar.wxUZMvaN;
                if ((recyclerView == null) == (qlVar2.wxUZMvaN == null)) {
                    boolean z = qlVar.qoPGr6Ce;
                    if (z == qlVar2.qoPGr6Ce) {
                        int i = qlVar2.NCTxEWno - qlVar.NCTxEWno;
                        if (i == 0 && (i = qlVar.MdtA4re8 - qlVar2.MdtA4re8) == 0) {
                            return 0;
                        }
                        return i;
                    }
                }
                break;
            case 2:
                return w30.k3x7lurq(((xx) obj).NCTxEWno, ((xx) obj2).NCTxEWno);
            case 3:
                return w30.k3x7lurq(Integer.valueOf(((xx) obj2).OxcuoDLp), Integer.valueOf(((xx) obj).OxcuoDLp));
            case 4:
                return w30.k3x7lurq(Integer.valueOf(((xx) obj2).sjUBp5pO), Integer.valueOf(((xx) obj).sjUBp5pO));
            case 5:
                return w30.k3x7lurq(Integer.valueOf(((xx) obj2).sjUBp5pO), Integer.valueOf(((xx) obj).sjUBp5pO));
            case 6:
                return ((r70) obj).MdtA4re8 - ((r70) obj2).MdtA4re8;
            case 7:
                return w30.k3x7lurq(Integer.valueOf(((xx) obj2).sjUBp5pO), Integer.valueOf(((xx) obj).sjUBp5pO));
            case 8:
                return w30.k3x7lurq((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 9:
                return w30.k3x7lurq((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 10:
                return w30.k3x7lurq(Integer.valueOf(((h80) obj2).NCTxEWno), Integer.valueOf(((h80) obj).NCTxEWno));
            case 11:
                return w30.k3x7lurq(((gb0) obj).qoPGr6Ce, ((gb0) obj2).qoPGr6Ce);
            default:
                return w30.k3x7lurq(((ib0) obj).qoPGr6Ce, ((ib0) obj2).qoPGr6Ce);
        }
    }
}
