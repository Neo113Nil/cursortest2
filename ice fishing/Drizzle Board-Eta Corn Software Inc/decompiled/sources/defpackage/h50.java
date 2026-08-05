package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class h50 {
    public kn qoPGr6Ce;

    public final Object qoPGr6Ce(String str) {
        Object Qr9iLBAD;
        kn knVar = this.qoPGr6Ce;
        LinkedHashMap linkedHashMap = (LinkedHashMap) knVar.NCTxEWno;
        try {
            x90 x90Var = (x90) ((LinkedHashMap) knVar.VgvYg0wo).get(str);
            if (x90Var != null && (Qr9iLBAD = x90Var.Qr9iLBAD()) != null) {
                return Qr9iLBAD;
            }
            return linkedHashMap.get(str);
        } catch (ClassCastException unused) {
            linkedHashMap.remove(str);
            ((LinkedHashMap) knVar.wxUZMvaN).remove(str);
            return null;
        }
    }
}
