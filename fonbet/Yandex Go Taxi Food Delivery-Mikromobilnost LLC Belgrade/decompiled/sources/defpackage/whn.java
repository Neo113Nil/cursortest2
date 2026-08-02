package defpackage;

import java.util.Comparator;

/* loaded from: classes12.dex */
public final class whn implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        zzs zzsVar = (zzs) obj;
        zzs zzsVar2 = (zzs) obj2;
        return Double.valueOf((zzsVar.b * 1.9349663E7d) + (zzsVar.a * 7.3856093E7d)).compareTo(Double.valueOf((zzsVar2.b * 1.9349663E7d) + (zzsVar2.a * 7.3856093E7d)));
    }
}
