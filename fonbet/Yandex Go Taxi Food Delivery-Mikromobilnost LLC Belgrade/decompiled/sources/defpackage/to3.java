package defpackage;

import com.yandex.messaging.core.net.entities.Bucket;
import com.yandex.messaging.core.net.entities.GetUsersDataParam;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public final class to3 {
    public final nk21 a;
    public final ouu b;
    public final evu c;
    public final oyq d;
    public final a1r e;
    public final bbj f;
    public final q3f0 g;
    public final lqo h;
    public final q6v i;
    public final b7m j;

    public to3(nk21 nk21Var, ouu ouuVar, evu evuVar, oyq oyqVar, a1r a1rVar, bbj bbjVar, q3f0 q3f0Var, lqo lqoVar, q6v q6vVar, b7m b7mVar) {
        this.a = nk21Var;
        this.b = ouuVar;
        this.c = evuVar;
        this.d = oyqVar;
        this.e = a1rVar;
        this.f = bbjVar;
        this.g = q3f0Var;
        this.h = lqoVar;
        this.i = q6vVar;
        this.j = b7mVar;
    }

    public final xo3 a(Class cls, tls tlsVar, Bucket.GetParams getParams) {
        return this.a.a(new mo3(this, getParams, cls, tlsVar));
    }

    public final xo3 b(go3 go3Var, String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(new ijg0("id", str));
        }
        return this.a.a(new no3(this, arrayList, go3Var));
    }

    public final xo3 c(ho3 ho3Var, String str) {
        GetUsersDataParam getUsersDataParam = new GetUsersDataParam();
        getUsersDataParam.guids = new String[]{str};
        return this.a.a(new io3(17, this, getUsersDataParam, ho3Var));
    }

    public final xo3 d(Class cls, eo3 eo3Var, Bucket bucket) {
        return this.a.a(new jo3(this, bucket, cls, eo3Var, 3));
    }
}
