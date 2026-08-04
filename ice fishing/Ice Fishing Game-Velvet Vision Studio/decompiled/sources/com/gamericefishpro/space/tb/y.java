package com.gamericefishpro.space.tb;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class y {
    public static WeakReference b;
    public com.gamericefishpro.space.b1.d a;

    public final synchronized x a() {
        String str;
        x xVar;
        com.gamericefishpro.space.b1.d dVar = this.a;
        synchronized (((ArrayDeque) dVar.v)) {
            str = (String) ((ArrayDeque) dVar.v).peek();
        }
        Pattern pattern = x.d;
        xVar = null;
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("!", -1);
            if (strArrSplit.length == 2) {
                xVar = new x(strArrSplit[0], strArrSplit[1]);
            }
        }
        return xVar;
    }
}
