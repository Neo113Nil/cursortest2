package defpackage;

import com.yandex.music.shared.network.api.retrofit.MusicBackendHttpException;
import com.yandex.music.shared.network.api.retrofit.MusicCommonHttpException;
import com.yandex.music.shared.ynison.api.deps.bridge.YnisonNetworkStateProvider$UnsupportedException;
import java.io.IOException;
import java.util.concurrent.CancellationException;

/* loaded from: classes4.dex */
public final class bew {
    public final z66 a;
    public final vy7 b;
    public final y8p c;
    public final vtm d;

    public bew(fos fosVar, hwd hwdVar, z66 z66Var, vy7 vy7Var) {
        fosVar.getClass();
        hwdVar.getClass();
        z66Var.getClass();
        vy7Var.getClass();
        this.a = z66Var;
        this.b = vy7Var;
        this.c = new y8p(fosVar, hwdVar);
        this.d = new vtm(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(vx4 vx4Var, cg6 cg6Var) {
        aew aewVar;
        int i;
        Exception e;
        String str;
        IOException e2;
        MusicCommonHttpException e3;
        MusicBackendHttpException e4;
        try {
            if (cg6Var instanceof aew) {
                aewVar = (aew) cg6Var;
                int i2 = aewVar.m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aewVar.m = i2 - Integer.MIN_VALUE;
                    Object obj = aewVar.k;
                    Object obj2 = nm6.a;
                    i = aewVar.m;
                    if (i != 0) {
                        qgg.h0(obj);
                        try {
                            aewVar.j = "runNetworkSafe";
                            aewVar.m = 1;
                            Object invoke = vx4Var.invoke(aewVar);
                            if (invoke == obj2) {
                                return obj2;
                            }
                            obj = invoke;
                            str = "runNetworkSafe";
                        } catch (MusicBackendHttpException e5) {
                            e4 = e5;
                            str = "runNetworkSafe";
                            ssg.a(6, str, "failed Response: " + e4.b, null);
                            return new flw(e4);
                        } catch (MusicCommonHttpException e6) {
                            e3 = e6;
                            str = "runNetworkSafe";
                            ssg.a(6, str, "failed Http: " + e3.b, null);
                            return new flw(e3);
                        } catch (IOException e7) {
                            e2 = e7;
                            str = "runNetworkSafe";
                            ssg.a(6, str, "failed IO: " + e2.getMessage(), null);
                            return new flw(e2);
                        } catch (Exception e8) {
                            e = e8;
                            str = "runNetworkSafe";
                            ssg.a(6, str, hrg.s("unknown exception: ", e.getClass().getSimpleName(), "(", e.getMessage(), ")"), e);
                            throw e;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = aewVar.j;
                        try {
                            qgg.h0(obj);
                        } catch (MusicBackendHttpException e9) {
                            e4 = e9;
                            ssg.a(6, str, "failed Response: " + e4.b, null);
                            return new flw(e4);
                        } catch (MusicCommonHttpException e10) {
                            e3 = e10;
                            ssg.a(6, str, "failed Http: " + e3.b, null);
                            return new flw(e3);
                        } catch (IOException e11) {
                            e2 = e11;
                            ssg.a(6, str, "failed IO: " + e2.getMessage(), null);
                            return new flw(e2);
                        } catch (Exception e12) {
                            e = e12;
                            ssg.a(6, str, hrg.s("unknown exception: ", e.getClass().getSimpleName(), "(", e.getMessage(), ")"), e);
                            throw e;
                        }
                    }
                    return new glw(obj);
                }
            }
            if (i != 0) {
            }
            return new glw(obj);
        } catch (YnisonNetworkStateProvider$UnsupportedException e13) {
            return new hlw(e13.a);
        } catch (CancellationException e14) {
            throw e14;
        }
        aewVar = new aew(this, cg6Var);
        Object obj3 = aewVar.k;
        Object obj22 = nm6.a;
        i = aewVar.m;
    }
}
