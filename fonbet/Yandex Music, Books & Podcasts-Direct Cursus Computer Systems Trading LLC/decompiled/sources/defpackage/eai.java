package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.yandex.pulse.mvi.a;
import io.appmetrica.analytics.impl.Ff;
import io.appmetrica.analytics.impl.Hf;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class eai {
    public final Ff a;
    public final nkk b;
    public nkk c;
    public nkk d;
    public final Handler e;
    public final Executor f;
    public final pwg g;
    public final boolean h;
    public final boolean i;
    public final zqr j;
    public final zqr k;
    public final zqr l;
    public final zqr m;
    public final zqr n;
    public final zqr o;
    public final iz7 p;
    public final tzb q;
    public final Hf r;
    public final qzc s = new qzc(15, this);
    public final oxa t = new oxa(17, this);

    public eai(Hf hf, jya jyaVar, fai faiVar) {
        this.r = hf;
        this.a = faiVar.a;
        nkk nkkVar = faiVar.b;
        this.b = nkkVar;
        this.c = nkkVar;
        this.d = nkkVar;
        this.j = faiVar.e;
        this.k = faiVar.f;
        this.l = faiVar.g;
        this.m = faiVar.h;
        this.n = faiVar.i;
        this.o = faiVar.j;
        long j = faiVar.c;
        long j2 = faiVar.d;
        long j3 = faiVar.n;
        this.e = new Handler(Looper.getMainLooper());
        this.f = faiVar.r;
        this.g = faiVar.p ? new hq3(j) : new uk7(Looper.getMainLooper(), j);
        this.h = faiVar.o;
        boolean z = faiVar.q;
        this.i = z;
        String str = jyaVar.b;
        jyaVar.b = "warm";
        tzb tzbVar = new tzb();
        tzbVar.a = str;
        this.q = tzbVar;
        bai baiVar = new bai(this, 0);
        qj7 qj7Var = new qj7(this, j, j2, faiVar);
        bai baiVar2 = new bai(this, 2);
        bai baiVar3 = new bai(this, 3);
        suh suhVar = z ? new suh(4, this, faiVar) : null;
        a aVar = new a(this, faiVar, j3);
        iz7 iz7Var = new iz7();
        iz7Var.g = baiVar;
        iz7Var.h = qj7Var;
        iz7Var.i = baiVar2;
        iz7Var.j = baiVar3;
        iz7Var.k = suhVar;
        iz7Var.l = aVar;
        this.p = iz7Var;
    }

    public final void a(String str, long j, String str2, zqr zqrVar) {
        String str3 = this.q.a;
        boolean z = this.i;
        nh nhVar = new nh(j, zqrVar, new cai(this, str, j, str2, str3, z));
        if (z) {
            nhVar.run();
        } else {
            this.f.execute(nhVar);
        }
    }

    public final nkk b() {
        switch (this.q.a) {
            case "hot":
                return this.d;
            case "cold":
                return this.b;
            case "warm":
                return this.c;
            default:
                xq0.w("Not reached");
                return null;
        }
    }
}
