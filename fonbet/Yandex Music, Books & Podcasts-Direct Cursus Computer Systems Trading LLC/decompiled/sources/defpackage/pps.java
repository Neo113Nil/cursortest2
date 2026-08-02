package defpackage;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class pps {
    public static WeakReference b;
    public n3m a;

    public final synchronized ops a() {
        String str;
        ops opsVar;
        n3m n3mVar = this.a;
        synchronized (((ArrayDeque) n3mVar.e)) {
            str = (String) ((ArrayDeque) n3mVar.e).peek();
        }
        Pattern pattern = ops.d;
        opsVar = null;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("!", -1);
            if (split.length == 2) {
                opsVar = new ops(split[0], split[1]);
            }
        }
        return opsVar;
    }
}
