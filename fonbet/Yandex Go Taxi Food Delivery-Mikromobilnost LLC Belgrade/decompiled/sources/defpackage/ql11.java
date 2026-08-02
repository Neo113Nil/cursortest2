package defpackage;

import com.google.gson.JsonSyntaxException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: classes11.dex */
public class ql11 extends nl11 {
    @Override // defpackage.nl11
    public final Object read(wdx wdxVar) {
        ArrayList arrayList = new ArrayList();
        wdxVar.a();
        while (wdxVar.hasNext()) {
            try {
                arrayList.add(Integer.valueOf(wdxVar.nextInt()));
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }
        wdxVar.k();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i = 0; i < size; i++) {
            atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override // defpackage.nl11
    public final void write(afx afxVar, Object obj) {
        afxVar.c();
        int length = ((AtomicIntegerArray) obj).length();
        for (int i = 0; i < length; i++) {
            afxVar.R(r5.get(i));
        }
        afxVar.k();
    }
}
