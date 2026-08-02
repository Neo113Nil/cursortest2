package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class i5h extends ekk {
    public final h5h i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i5h(oc7 oc7Var) {
        super("MainDatabase", new dae(17, oc7Var, r0), MainDatabase.o, new d5h(oc7Var), 112);
        h5h h5hVar = new h5h(0);
        oc7Var.getClass();
        int i = MainDatabase.p;
        this.i = h5hVar;
    }

    public final eno f(String str, String[] strArr, Function1 function1) {
        str.getClass();
        return new eno(new xg(this, str, strArr, function1, (Continuation) null));
    }

    public final eno g(String str, String... strArr) {
        str.getClass();
        return new eno(new ckg(this, str, strArr, (Continuation) null));
    }
}
