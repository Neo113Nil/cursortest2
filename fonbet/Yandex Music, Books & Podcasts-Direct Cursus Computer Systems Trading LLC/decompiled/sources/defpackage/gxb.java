package defpackage;

import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class gxb {
    public final boolean a;
    public final String b;
    public final String c;
    public byb d;

    public gxb(String str, fxb fxbVar, boolean z, boolean z2) {
        this.a = z2;
        this.b = fxbVar.b;
        StringBuilder k = dfi.k(str);
        if (z) {
            k.append("_NotReady");
        }
        this.c = k.toString();
    }

    public final jxb a() {
        jxb jxbVar;
        byb bybVar = this.d;
        jxb jxbVar2 = null;
        if (bybVar == null) {
            Intrinsics.j("experiments");
            throw null;
        }
        gyb gybVar = bybVar.b;
        gybVar.getClass();
        HashMap hashMap = gybVar.d;
        String str = this.c;
        str.getClass();
        ReentrantLock reentrantLock = gybVar.c;
        reentrantLock.lock();
        try {
            Pair pair = (Pair) hashMap.get(str);
            jxb jxbVar3 = pair != null ? (jxb) pair.b : null;
            if (jxbVar3 != null) {
                return jxbVar3;
            }
            bybVar.a();
            reentrantLock.lock();
            try {
                Pair pair2 = (Pair) hashMap.get(str);
                if (pair2 == null || (jxbVar = (jxb) pair2.b) == null) {
                    if (((String) gybVar.a.P().get(str)) != null && (jxbVar2 = (jxb) gybVar.b.B().get(str)) == null) {
                        jxbVar2 = jxb.b;
                    }
                    reentrantLock.unlock();
                    jxbVar = jxbVar2;
                }
                if (jxbVar != null) {
                    return jxbVar;
                }
                vx6 vx6Var = bybVar.e().b;
                ReentrantLock reentrantLock2 = (ReentrantLock) vx6Var.d;
                reentrantLock2.lock();
                try {
                    fyb fybVar = (fyb) vx6Var.c;
                    fybVar.getClass();
                    jxb jxbVar4 = (jxb) fybVar.b().get(str);
                    return jxbVar4 == null ? jxb.b : jxbVar4;
                } finally {
                    reentrantLock2.unlock();
                }
            } finally {
            }
        } finally {
        }
    }

    public final String b() {
        byb bybVar = this.d;
        if (bybVar != null) {
            return byb.g(bybVar, this.c);
        }
        Intrinsics.j("experiments");
        throw null;
    }

    public /* synthetic */ gxb(String str, fxb fxbVar, int i) {
        this(str, fxbVar, false, (i & 8) == 0);
    }

    public void c(exb exbVar) {
    }
}
