package defpackage;

import android.os.Looper;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.data.e;
import com.yandex.messaging.internal.authorized.sync.f;
import com.yandex.messaging.internal.net.Error;
import java.util.HashMap;

/* loaded from: classes15.dex */
public final class w1b {
    public final Looper a;
    public final k020 b;
    public final ml21 c;
    public final h3b d;
    public final fxj0 e;
    public final to3 f;
    public final v3b g;
    public final hwd h;
    public final x22 i;
    public final vmi0 j;
    public final bx6 k;
    public final f l;
    public final e m;
    public final lqo n;
    public final HashMap o = new HashMap();

    public w1b(Looper looper, k020 k020Var, ml21 ml21Var, h3b h3bVar, fxj0 fxj0Var, to3 to3Var, v3b v3bVar, hwd hwdVar, x22 x22Var, vmi0 vmi0Var, bx6 bx6Var, f fVar, e eVar, lqo lqoVar) {
        this.a = looper;
        this.b = k020Var;
        this.c = ml21Var;
        this.d = h3bVar;
        this.e = fxj0Var;
        this.f = to3Var;
        this.g = v3bVar;
        this.h = hwdVar;
        this.i = x22Var;
        this.j = vmi0Var;
        this.k = bx6Var;
        this.l = fVar;
        this.m = eVar;
        this.n = lqoVar;
    }

    public final v1b a(ChatRequest chatRequest, o1b o1bVar) {
        z83.g(null, this.a, Looper.myLooper());
        HashMap hashMap = this.o;
        u1b u1bVar = (u1b) hashMap.get(chatRequest);
        if (u1bVar == null) {
            u1bVar = new u1b(this, chatRequest);
            hashMap.put(chatRequest, u1bVar);
        }
        Error error = u1bVar.w;
        if (error != null) {
            o1bVar.a(error);
        }
        return new v1b(this, u1bVar, o1bVar);
    }
}
