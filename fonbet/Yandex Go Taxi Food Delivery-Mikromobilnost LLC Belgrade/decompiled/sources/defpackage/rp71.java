package defpackage;

import java.util.List;

/* loaded from: classes7.dex */
public final class rp71 {
    public static bpk a(egk egkVar, String str) {
        List<bpk> extensions = egkVar.getExtensions();
        if (extensions == null) {
            return null;
        }
        for (bpk bpkVar : extensions) {
            if (str.equals(bpkVar.a)) {
                return bpkVar;
            }
        }
        return null;
    }
}
