package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class brd implements vj6 {
    public static final twh c;
    public static final Charset d;
    public final Gson a;
    public final TypeAdapter b;

    static {
        Pattern pattern = twh.e;
        c = q5g.C("application/json; charset=UTF-8");
        d = Charset.forName("UTF-8");
    }

    public brd(Gson gson, TypeAdapter typeAdapter) {
        this.a = gson;
        this.b = typeAdapter;
    }

    @Override // defpackage.vj6
    public final Object a(Object obj) {
        hi3 hi3Var = new hi3();
        JsonWriter h = this.a.h(new OutputStreamWriter(new gi3(0, hi3Var), d));
        this.b.c(h, obj);
        h.close();
        pn3 g0 = hi3Var.g0(hi3Var.b);
        g0.getClass();
        return new f0o(c, g0, 1);
    }
}
