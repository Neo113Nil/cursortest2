package defpackage;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class apt implements Comparator {
    public final /* synthetic */ dsc a;
    public final /* synthetic */ boolean b;

    public apt(dsc dscVar, boolean z) {
        this.a = dscVar;
        this.b = z;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        boolean z = this.b;
        dsc dscVar = this.a;
        mih mihVar = (mih) obj2;
        int i2 = -1;
        try {
            i = mihVar.e(dscVar) ? 2 : 0;
            if (z) {
                i += !mihVar.i ? 1 : 0;
            }
        } catch (wjh unused) {
            i = -1;
        }
        Integer valueOf = Integer.valueOf(i);
        mih mihVar2 = (mih) obj;
        try {
            int i3 = mihVar2.e(dscVar) ? 2 : 0;
            if (z) {
                i3 += !mihVar2.i ? 1 : 0;
            }
            i2 = i3;
        } catch (wjh unused2) {
        }
        return gl5.b(valueOf, Integer.valueOf(i2));
    }
}
