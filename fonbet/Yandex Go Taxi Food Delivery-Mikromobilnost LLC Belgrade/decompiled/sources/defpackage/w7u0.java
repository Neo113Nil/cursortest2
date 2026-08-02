package defpackage;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/* loaded from: classes4.dex */
public final class w7u0 {
    public static final w7u0 c;
    public ArrayList a;
    public v7u0 b;

    static {
        w7u0 w7u0Var = new w7u0();
        w7u0Var.a = new ArrayList();
        Date date = new Date();
        if (w7u0Var.b != null) {
            date = new Date(w7u0Var.b.a.getTime());
            w7u0Var.b.getClass();
        }
        v7u0 v7u0Var = new v7u0();
        w7u0Var.b = v7u0Var;
        v7u0Var.a = date;
        w7u0Var.a.add(v7u0Var);
        c = w7u0Var;
        new SimpleDateFormat("HH:mm:ss.SSS");
    }
}
