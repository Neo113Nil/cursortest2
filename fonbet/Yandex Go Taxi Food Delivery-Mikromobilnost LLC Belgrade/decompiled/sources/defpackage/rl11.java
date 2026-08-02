package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes11.dex */
public final class rl11 extends nl11 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nl11 b;

    public /* synthetic */ rl11(nl11 nl11Var, int i) {
        this.a = i;
        this.b = nl11Var;
    }

    @Override // defpackage.nl11
    public final Object read(wdx wdxVar) {
        int i = this.a;
        nl11 nl11Var = this.b;
        switch (i) {
            case 0:
                ArrayList arrayList = new ArrayList();
                wdxVar.a();
                while (wdxVar.hasNext()) {
                    arrayList.add(Long.valueOf(((Number) nl11Var.read(wdxVar)).longValue()));
                }
                wdxVar.k();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
                }
                return atomicLongArray;
            default:
                return new AtomicLong(((Number) nl11Var.read(wdxVar)).longValue());
        }
    }

    @Override // defpackage.nl11
    public final void write(afx afxVar, Object obj) {
        int i = this.a;
        nl11 nl11Var = this.b;
        switch (i) {
            case 0:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                afxVar.c();
                int length = atomicLongArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    nl11Var.write(afxVar, Long.valueOf(atomicLongArray.get(i2)));
                }
                afxVar.k();
                break;
            default:
                nl11Var.write(afxVar, Long.valueOf(((AtomicLong) obj).get()));
                break;
        }
    }
}
