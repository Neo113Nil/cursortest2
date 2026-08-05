package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class xv {
    public static final LinkedHashMap NCTxEWno = new LinkedHashMap();
    public final LinkedHashMap qoPGr6Ce = new LinkedHashMap();

    public final wv NCTxEWno(String str) {
        str.getClass();
        if (str.length() <= 0) {
            m1.sjUBp5pO("navigator name cannot be an empty string");
            return null;
        }
        wv wvVar = (wv) this.qoPGr6Ce.get(str);
        if (wvVar != null) {
            return wvVar;
        }
        m1.Ey6iv0m0(q70.P7K7Inc8("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
        return null;
    }

    public final void qoPGr6Ce(wv wvVar) {
        String OxcuoDLp = fn.OxcuoDLp(wvVar.getClass());
        if (OxcuoDLp.length() <= 0) {
            m1.sjUBp5pO("navigator name cannot be an empty string");
            return;
        }
        LinkedHashMap linkedHashMap = this.qoPGr6Ce;
        wv wvVar2 = (wv) linkedHashMap.get(OxcuoDLp);
        if (fn.qoPGr6Ce(wvVar2, wvVar)) {
            return;
        }
        if (wvVar2 != null && wvVar2.NCTxEWno) {
            m1.OxcuoDLp("Navigator ", wvVar, " is replacing an already attached ", wvVar2);
        } else if (wvVar.NCTxEWno) {
            m1.I5GHvsYW(wvVar, " is already attached to another NavController", "Navigator ");
        }
    }
}
