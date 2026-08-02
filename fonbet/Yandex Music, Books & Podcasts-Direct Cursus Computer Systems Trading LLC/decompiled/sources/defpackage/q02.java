package defpackage;

import com.yandex.music.shared.network.api.okhttp.AuthenticatorHelper$RefreshTokenException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class q02 {
    public final fos a;
    public final AtomicReference b = new AtomicReference(null);
    public final t9w c;

    public q02(fos fosVar, t9w t9wVar) {
        this.a = fosVar;
        this.c = t9wVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e2, code lost:
    
        if (r5.a(r0) == r1) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(xum xumVar, cg6 cg6Var) {
        p02 p02Var;
        int i;
        Object znsVar;
        xum xumVar2;
        AuthenticatorHelper$RefreshTokenException e;
        Object obj;
        String str;
        try {
            if (cg6Var instanceof p02) {
                p02Var = (p02) cg6Var;
                int i2 = p02Var.n;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    p02Var.n = i2 - Integer.MIN_VALUE;
                    Object obj2 = p02Var.l;
                    nm6 nm6Var = nm6.a;
                    i = p02Var.n;
                    fos fosVar = this.a;
                    String str2 = null;
                    if (i != 0) {
                        qgg.h0(obj2);
                        ReentrantLock reentrantLock = fosVar.e;
                        reentrantLock.lock();
                        try {
                            boolean b = fosVar.d.b();
                            yns ynsVar = yns.a;
                            xns xnsVar = xns.a;
                            if (b) {
                                znsVar = xnsVar;
                            } else {
                                mns mnsVar = (mns) fosVar.c.getAndSet(null);
                                if (mnsVar == null) {
                                    reentrantLock.unlock();
                                    znsVar = ynsVar;
                                    if (!(znsVar instanceof zns)) {
                                        try {
                                            p02Var.j = xumVar;
                                            p02Var.k = (zns) znsVar;
                                            p02Var.n = 1;
                                            obj2 = this.c.a(p02Var);
                                            if (obj2 != nm6Var) {
                                                xumVar2 = xumVar;
                                                obj = znsVar;
                                                str = (String) obj2;
                                                this.b.set(((zns) obj).a);
                                                r7o r7oVar = z7o.b;
                                                Unit unit = Unit.a;
                                                fosVar.b(str);
                                                return unit;
                                            }
                                        } catch (AuthenticatorHelper$RefreshTokenException e2) {
                                            xumVar2 = xumVar;
                                            e = e2;
                                        }
                                    } else {
                                        if (znsVar.equals(ynsVar)) {
                                            r7o r7oVar2 = z7o.b;
                                            return Unit.a;
                                        }
                                        if (!znsVar.equals(xnsVar)) {
                                            b6e.s();
                                            return null;
                                        }
                                        p02Var.j = null;
                                        p02Var.k = null;
                                        p02Var.n = 2;
                                    }
                                    return nm6Var;
                                }
                                xdr xdrVar = fosVar.a;
                                aos aosVar = aos.a;
                                xdrVar.getClass();
                                xdrVar.m(null, aosVar);
                                fosVar.d = hld.j();
                                znsVar = new zns(mnsVar);
                            }
                            if (!(znsVar instanceof zns)) {
                            }
                            return nm6Var;
                        } finally {
                            reentrantLock.unlock();
                        }
                    }
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj2);
                        r7o r7oVar3 = z7o.b;
                        return Unit.a;
                    }
                    obj = p02Var.k;
                    xumVar2 = p02Var.j;
                    try {
                        qgg.h0(obj2);
                        str = (String) obj2;
                        try {
                            this.b.set(((zns) obj).a);
                            r7o r7oVar4 = z7o.b;
                            Unit unit2 = Unit.a;
                            fosVar.b(str);
                            return unit2;
                        } catch (AuthenticatorHelper$RefreshTokenException e3) {
                            e = e3;
                            str2 = str;
                        } catch (Throwable th) {
                            th = th;
                            str2 = str;
                            fosVar.b(str2);
                            throw th;
                        }
                    } catch (AuthenticatorHelper$RefreshTokenException e4) {
                        e = e4;
                    }
                    e = e4;
                    xumVar2.invoke(e);
                    r7o r7oVar5 = z7o.b;
                    t7o t7oVar = new t7o(e);
                    fosVar.b(str2);
                    return t7oVar;
                }
            }
            if (i != 0) {
            }
            e = e4;
            xumVar2.invoke(e);
            r7o r7oVar52 = z7o.b;
            t7o t7oVar2 = new t7o(e);
            fosVar.b(str2);
            return t7oVar2;
        } catch (Throwable th2) {
            th = th2;
        }
        p02Var = new p02(this, cg6Var);
        Object obj22 = p02Var.l;
        nm6 nm6Var2 = nm6.a;
        i = p02Var.n;
        fos fosVar2 = this.a;
        String str22 = null;
    }
}
