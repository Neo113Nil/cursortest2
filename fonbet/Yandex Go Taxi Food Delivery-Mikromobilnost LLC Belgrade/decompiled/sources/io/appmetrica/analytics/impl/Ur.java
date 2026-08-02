package io.appmetrica.analytics.impl;

import java.util.LinkedList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class Ur implements Vr {
    @Override // io.appmetrica.analytics.impl.Vr
    public final Tr a(List<Tr> list) {
        LinkedList linkedList = new LinkedList();
        boolean z = true;
        for (Tr tr : list) {
            if (!tr.a) {
                linkedList.add(tr.b);
                z = false;
            }
        }
        if (z) {
            return new Tr(this, true, "");
        }
        StringBuilder sb = new StringBuilder();
        kotlin.collections.a.V(linkedList, sb, Extension.FIX_SPACE, "", "", "", null);
        return new Tr(this, false, sb.toString());
    }
}
