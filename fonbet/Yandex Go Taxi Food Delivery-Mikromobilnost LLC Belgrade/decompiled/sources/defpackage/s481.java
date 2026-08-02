package defpackage;

import android.content.Context;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes7.dex */
public final class s481 {
    public final db81 a;
    public final u781 b;

    public s481() {
        db81 db81Var;
        db81 db81Var2 = db81.d;
        if (db81Var2 == null) {
            synchronized (db81.c) {
                db81Var = db81.d;
                if (db81Var == null) {
                    db81Var = new db81();
                    db81.d = db81Var;
                }
            }
            db81Var2 = db81Var;
        }
        u781 u781Var = new u781();
        this.a = db81Var2;
        this.b = u781Var;
    }

    public final String a(Context context, List list) {
        int i;
        a081 a081Var;
        this.b.getClass();
        a081 a081Var2 = a081.g;
        if (a081Var2 == null) {
            synchronized (a081.f) {
                a081Var = a081.g;
                if (a081Var == null) {
                    a081Var = new a081();
                    a081.g = a081Var;
                }
            }
            a081Var2 = a081Var;
        }
        gg81 a = a081Var2.a(context);
        if (a == null || (i = a.a) == 0) {
            i = 5;
        }
        int size = list.size();
        if (i > size) {
            i = size;
        }
        return a.X(list.subList(list.size() - i, list.size()), ",", null, null, null, 62);
    }
}
