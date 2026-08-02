package defpackage;

import android.view.View;
import java.util.HashMap;

/* loaded from: classes10.dex */
public class thx {
    public final HashMap a = new HashMap();

    public final float a(View view, String str) {
        HashMap hashMap;
        float[] fArr;
        HashMap hashMap2 = this.a;
        if (hashMap2.containsKey(view) && (hashMap = (HashMap) hashMap2.get(view)) != null && hashMap.containsKey(str) && (fArr = (float[]) hashMap.get(str)) != null && fArr.length > 0) {
            return fArr[0];
        }
        return Float.NaN;
    }
}
