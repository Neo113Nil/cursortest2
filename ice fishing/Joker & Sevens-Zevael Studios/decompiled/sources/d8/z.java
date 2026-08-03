package d8;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: b, reason: collision with root package name */
    public static WeakReference f1835b;

    /* renamed from: a, reason: collision with root package name */
    public t f1836a;

    public final synchronized y a() {
        String str;
        y yVar;
        t tVar = this.f1836a;
        synchronized (((ArrayDeque) tVar.f1819d)) {
            str = (String) ((ArrayDeque) tVar.f1819d).peek();
        }
        Pattern pattern = y.f1831d;
        yVar = null;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("!", -1);
            if (split.length == 2) {
                yVar = new y(split[0], split[1]);
            }
        }
        return yVar;
    }
}
