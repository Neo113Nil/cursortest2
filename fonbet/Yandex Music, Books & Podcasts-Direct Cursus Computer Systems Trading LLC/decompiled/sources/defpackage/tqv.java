package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class tqv {
    public final ArrayList a = new ArrayList();
    public final jb b = new jb(12, this);
    public kqv c;

    public static final void a(tqv tqvVar, kqv kqvVar) {
        if (Intrinsics.d(tqvVar.c, kqvVar)) {
            return;
        }
        tqvVar.c = kqvVar;
        if (kqvVar != null) {
            Iterator it = tqvVar.a.iterator();
            if (it.hasNext()) {
                throw hrg.j(it);
            }
        }
    }
}
