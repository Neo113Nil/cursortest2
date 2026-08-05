package defpackage;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class h7 {
    public final HashMap qoPGr6Ce = new HashMap();
    public final HashMap NCTxEWno = new HashMap();
    public final HashMap MdtA4re8 = new HashMap();
    public ArrayList wxUZMvaN = new ArrayList();
    public final transient HashMap VgvYg0wo = new HashMap();
    public final HashMap P7K7Inc8 = new HashMap();
    public final Bundle b2ZJblxo = new Bundle();

    public final mcXgUFR8 NCTxEWno(String str, le0 le0Var, vi viVar) {
        int i;
        HashMap hashMap;
        HashMap hashMap2 = this.NCTxEWno;
        if (((Integer) hashMap2.get(str)) == null) {
            int NCTxEWno = b10.NCTxEWno.NCTxEWno(2147418112);
            while (true) {
                i = NCTxEWno + 65536;
                Integer valueOf = Integer.valueOf(i);
                hashMap = this.qoPGr6Ce;
                if (!hashMap.containsKey(valueOf)) {
                    break;
                }
                NCTxEWno = b10.NCTxEWno.NCTxEWno(2147418112);
            }
            hashMap.put(Integer.valueOf(i), str);
            hashMap2.put(str, Integer.valueOf(i));
        }
        this.VgvYg0wo.put(str, new JulN5IwK(viVar, le0Var));
        HashMap hashMap3 = this.P7K7Inc8;
        if (hashMap3.containsKey(str)) {
            Object obj = hashMap3.get(str);
            hashMap3.remove(str);
            viVar.qoPGr6Ce(obj);
        }
        Bundle bundle = this.b2ZJblxo;
        Bo5Vs0Am bo5Vs0Am = (Bo5Vs0Am) bundle.getParcelable(str);
        if (bo5Vs0Am != null) {
            bundle.remove(str);
            viVar.qoPGr6Ce(le0Var.euDDoUNr(bo5Vs0Am.NCTxEWno, bo5Vs0Am.MdtA4re8));
        }
        return new mcXgUFR8(this, 1, str);
    }

    public final boolean qoPGr6Ce(int i, int i2, Intent intent) {
        String str = (String) this.qoPGr6Ce.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        JulN5IwK julN5IwK = (JulN5IwK) this.VgvYg0wo.get(str);
        if (julN5IwK != null) {
            vi viVar = julN5IwK.qoPGr6Ce;
            if (this.wxUZMvaN.contains(str)) {
                viVar.qoPGr6Ce(julN5IwK.NCTxEWno.euDDoUNr(i2, intent));
                this.wxUZMvaN.remove(str);
                return true;
            }
        }
        this.P7K7Inc8.remove(str);
        this.b2ZJblxo.putParcelable(str, new Bo5Vs0Am(i2, intent));
        return true;
    }
}
