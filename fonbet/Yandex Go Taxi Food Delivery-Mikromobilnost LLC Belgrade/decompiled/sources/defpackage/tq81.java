package defpackage;

import java.util.Iterator;
import yads.xz;

/* loaded from: classes7.dex */
public final class tq81 {
    public static xz a(String str) {
        Object obj;
        Iterator<E> it = xz.m.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((xz) obj).b, str)) {
                break;
            }
        }
        return (xz) obj;
    }
}
