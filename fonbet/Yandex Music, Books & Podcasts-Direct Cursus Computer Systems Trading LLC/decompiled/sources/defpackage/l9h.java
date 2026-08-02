package defpackage;

import com.yandex.music.shared.relay.common.proto.v;

/* loaded from: classes3.dex */
public final class l9h {
    public final j6e a;

    public l9h(prv prvVar, prv prvVar2) {
        v vVar = v.c;
        v vVar2 = v.c;
        j6e j6eVar = new j6e();
        j6eVar.a = prvVar;
        j6eVar.b = prvVar2;
        this.a = j6eVar;
    }

    public static int a(j6e j6eVar, Object obj, Object obj2) {
        return f9c.a((prv) j6eVar.b, 2, obj2) + f9c.a((prv) j6eVar.a, 1, obj);
    }
}
