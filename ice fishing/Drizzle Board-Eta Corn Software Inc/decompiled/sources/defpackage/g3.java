package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class g3 implements Runnable {
    public final int MdtA4re8;
    public final /* synthetic */ int NCTxEWno;
    public final Object wxUZMvaN;

    public g3(List list, int i, Throwable th) {
        this.NCTxEWno = 1;
        fn.MdtA4re8(list, "initCallbacks cannot be null");
        this.wxUZMvaN = new ArrayList(list);
        this.MdtA4re8 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.NCTxEWno;
        int i2 = this.MdtA4re8;
        Object obj = this.wxUZMvaN;
        switch (i) {
            case 0:
                ej0 ej0Var = (ej0) ((ya0) obj).MdtA4re8;
                if (ej0Var != null) {
                    ej0Var.ytu5o6f4(i2);
                    break;
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i3 = 0;
                if (i2 == 1) {
                    while (i3 < size) {
                        ((xe) arrayList.get(i3)).qoPGr6Ce();
                        i3++;
                    }
                    break;
                } else {
                    while (i3 < size) {
                        ((xe) arrayList.get(i3)).getClass();
                        i3++;
                    }
                    break;
                }
            default:
                ((iv) obj).k3x7lurq(i2);
                break;
        }
    }

    public /* synthetic */ g3(int i, int i2, Object obj) {
        this.NCTxEWno = i2;
        this.wxUZMvaN = obj;
        this.MdtA4re8 = i;
    }
}
