package defpackage;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.a;
import com.google.android.gms.common.b;

/* loaded from: classes.dex */
public final class yz81 {
    public final SparseIntArray a;
    public final b b;

    public yz81(b bVar) {
        this.a = new SparseIntArray();
        cvw.l(bVar);
        this.b = bVar;
    }

    public final int a(Context context, om2 om2Var) {
        cvw.l(context);
        cvw.l(om2Var);
        int i = 0;
        if (!om2Var.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = om2Var.getMinApkVersion();
        SparseIntArray sparseIntArray = this.a;
        int i2 = sparseIntArray.get(minApkVersion, -1);
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= sparseIntArray.size()) {
                i = -1;
                break;
            }
            int keyAt = sparseIntArray.keyAt(i3);
            if (keyAt > minApkVersion && sparseIntArray.get(keyAt) == 0) {
                break;
            }
            i3++;
        }
        if (i == -1) {
            i = this.b.d(context, minApkVersion);
        }
        sparseIntArray.put(minApkVersion, i);
        return i;
    }

    public yz81() {
        this(a.d);
    }
}
