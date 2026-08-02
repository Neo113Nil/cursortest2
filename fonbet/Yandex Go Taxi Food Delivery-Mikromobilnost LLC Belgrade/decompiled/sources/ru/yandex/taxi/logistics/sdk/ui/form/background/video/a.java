package ru.yandex.taxi.logistics.sdk.ui.form.background.video;

import android.content.Context;
import androidx.compose.runtime.f;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.media3.exoplayer.ExoPlayer;
import defpackage.a1z0;
import defpackage.aii0;
import defpackage.an91;
import defpackage.b64;
import defpackage.bts;
import defpackage.c530;
import defpackage.c8i0;
import defpackage.cdz0;
import defpackage.cj6;
import defpackage.cma1;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.g92;
import defpackage.j690;
import defpackage.jl40;
import defpackage.m3u0;
import defpackage.n3z;
import defpackage.ny61;
import defpackage.o430;
import defpackage.ohd;
import defpackage.ono;
import defpackage.oz40;
import defpackage.pey;
import defpackage.pi6;
import defpackage.qje;
import defpackage.qjp0;
import defpackage.r1b0;
import defpackage.sls;
import defpackage.tfx;
import defpackage.tls;
import defpackage.tpr;
import defpackage.uny0;
import defpackage.vg4;
import defpackage.w511;
import defpackage.wls;
import defpackage.x4c;
import defpackage.xxc0;
import defpackage.xz3;
import defpackage.z910;
import defpackage.zpn;
import defpackage.zxc0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(String str, vg4 vg4Var, f530 f530Var, j690 j690Var, fid fidVar, int i) {
        int i2;
        vg4 vg4Var2;
        Object videoBackgroundKt$VideoBackground$2$1;
        oz40 oz40Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1103076010);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(vg4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(f530Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.k(j690Var) ? 2048 : 1024;
        }
        int i3 = i2;
        if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
            pey peyVar = (pey) btsVar.m(n3z.a);
            qjp0 qjp0Var = (qjp0) btsVar.m(ru.yandex.taxi.logistics.sdk.ui.form.scroll.a.a);
            boolean z = (((i3 & 14) ^ 6) > 4 && btsVar.k(str)) || (i3 & 6) == 4;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = str != null ? e.t(qjp0Var.a(str)) : new g92(2, Boolean.TRUE);
                btsVar.o0(Q);
            }
            Boolean bool = Boolean.FALSE;
            oz40 a = f.a((tpr) Q, bool, null, btsVar, 48, 2);
            boolean k = btsVar.k(peyVar);
            Object Q2 = btsVar.Q();
            if (k || Q2 == o430Var) {
                Q2 = e.t(new cdz0(peyVar.getLifecycle().c(), 10));
                btsVar.o0(Q2);
            }
            oz40 a2 = f.a((tpr) Q2, bool, null, btsVar, 48, 2);
            final boolean booleanValue = ((Boolean) a.getValue()).booleanValue();
            final boolean booleanValue2 = ((Boolean) a2.getValue()).booleanValue();
            boolean a3 = btsVar.a(booleanValue) | btsVar.a(booleanValue2);
            Object Q3 = btsVar.Q();
            if (a3 || Q3 == o430Var) {
                Q3 = f.d(new sls() { // from class: vk31
                    @Override // defpackage.sls
                    public final Object invoke() {
                        return Boolean.valueOf(booleanValue && booleanValue2);
                    }
                });
                btsVar.o0(Q3);
            }
            m3u0 m3u0Var = (m3u0) Q3;
            Object Q4 = btsVar.Q();
            if (Q4 == o430Var) {
                Q4 = f.j(null);
                btsVar.o0(Q4);
            }
            oz40 oz40Var2 = (oz40) Q4;
            Object Q5 = btsVar.Q();
            if (Q5 == o430Var) {
                Q5 = f.j(bool);
                btsVar.o0(Q5);
            }
            oz40 oz40Var3 = (oz40) Q5;
            Boolean bool2 = (Boolean) m3u0Var.getValue();
            bool2.getClass();
            boolean e = btsVar.e(context) | btsVar.k(m3u0Var);
            Object Q6 = btsVar.Q();
            if (e || Q6 == o430Var) {
                VideoBackgroundKt$VideoBackground$1$1 videoBackgroundKt$VideoBackground$1$1 = new VideoBackgroundKt$VideoBackground$1$1(context, oz40Var2, oz40Var3, m3u0Var, null);
                btsVar.o0(videoBackgroundKt$VideoBackground$1$1);
                Q6 = videoBackgroundKt$VideoBackground$1$1;
            }
            zpn.e(btsVar, (wls) Q6, bool2);
            Object value = oz40Var2.getValue();
            boolean k2 = ((i3 & 112) == 32) | btsVar.k(m3u0Var);
            Object Q7 = btsVar.Q();
            if (k2 || Q7 == o430Var) {
                oz40Var = oz40Var2;
                videoBackgroundKt$VideoBackground$2$1 = new VideoBackgroundKt$VideoBackground$2$1(vg4Var, oz40Var, oz40Var3, m3u0Var, null);
                vg4Var2 = vg4Var;
                btsVar.o0(videoBackgroundKt$VideoBackground$2$1);
            } else {
                vg4Var2 = vg4Var;
                videoBackgroundKt$VideoBackground$2$1 = Q7;
                oz40Var = oz40Var2;
            }
            zpn.f(value, vg4Var2, (wls) videoBackgroundKt$VideoBackground$2$1, btsVar);
            Object Q8 = btsVar.Q();
            if (Q8 == o430Var) {
                Q8 = new uny0(7, oz40Var);
                btsVar.o0(Q8);
            }
            zpn.a(zy11.a, (tls) Q8, btsVar);
            btsVar = btsVar;
            b((zxc0) oz40Var.getValue(), ((Boolean) oz40Var3.getValue()).booleanValue(), f530Var, j690Var, btsVar, i3 & 8064);
        } else {
            vg4Var2 = vg4Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new c8i0((Object) str, (Object) vg4Var2, f530Var, (Object) j690Var, i, 25);
        }
    }

    public static final void b(zxc0 zxc0Var, boolean z, f530 f530Var, j690 j690Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1232479059);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(zxc0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.a(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(f530Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.k(j690Var) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, f530Var);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d2);
            f530 b = cj6.a.b(an91.j(c530.a, j690Var));
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = VideoBackgroundSurfaceKt$VideoBackgroundSurface$1$1$1.b;
                btsVar.o0(Q);
            }
            tls tlsVar = (tls) ((tfx) Q);
            boolean e = btsVar.e(zxc0Var) | ((i2 & 112) == 32);
            Object Q2 = btsVar.Q();
            if (e || Q2 == o430Var) {
                Q2 = new xz3(zxc0Var, z, 17);
                btsVar.o0(Q2);
            }
            androidx.compose.ui.viewinterop.b.a(tlsVar, b, (tls) Q2, btsVar, 6, 0);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new a1z0(zxc0Var, z, f530Var, j690Var, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(Context context, oz40 oz40Var, final oz40 oz40Var2, ContinuationImpl continuationImpl) {
        VideoBackgroundKt$handleVideoBackgroundVisible$1 videoBackgroundKt$handleVideoBackgroundVisible$1;
        int i;
        boolean z;
        if (continuationImpl instanceof VideoBackgroundKt$handleVideoBackgroundVisible$1) {
            videoBackgroundKt$handleVideoBackgroundVisible$1 = (VideoBackgroundKt$handleVideoBackgroundVisible$1) continuationImpl;
            int i2 = videoBackgroundKt$handleVideoBackgroundVisible$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                videoBackgroundKt$handleVideoBackgroundVisible$1.label = i2 - Integer.MIN_VALUE;
                Object obj = videoBackgroundKt$handleVideoBackgroundVisible$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = videoBackgroundKt$handleVideoBackgroundVisible$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    videoBackgroundKt$handleVideoBackgroundVisible$1.L$0 = context;
                    videoBackgroundKt$handleVideoBackgroundVisible$1.L$1 = oz40Var;
                    videoBackgroundKt$handleVideoBackgroundVisible$1.L$2 = oz40Var2;
                    videoBackgroundKt$handleVideoBackgroundVisible$1.label = 1;
                    if (kotlinx.coroutines.a.i(100L, videoBackgroundKt$handleVideoBackgroundVisible$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oz40Var2 = (oz40) videoBackgroundKt$handleVideoBackgroundVisible$1.L$2;
                    oz40Var = (oz40) videoBackgroundKt$handleVideoBackgroundVisible$1.L$1;
                    context = (Context) videoBackgroundKt$handleVideoBackgroundVisible$1.L$0;
                    kotlin.b.b(obj);
                }
                ExoPlayer exoPlayer = (ExoPlayer) oz40Var.getValue();
                z = exoPlayer != null;
                if (!z) {
                    xxc0 xxc0Var = new xxc0() { // from class: uk31
                        @Override // defpackage.xxc0
                        public final void onRenderedFirstFrame() {
                            oz40.this.setValue(Boolean.TRUE);
                        }
                    };
                    androidx.media3.exoplayer.f a = new ono(context).a();
                    a.m.a(xxc0Var);
                    oz40Var.setValue(a);
                } else {
                    if (z) {
                        w511.b();
                        return null;
                    }
                    exoPlayer.play();
                }
                return zy11.a;
            }
        }
        videoBackgroundKt$handleVideoBackgroundVisible$1 = new VideoBackgroundKt$handleVideoBackgroundVisible$1(continuationImpl);
        Object obj2 = videoBackgroundKt$handleVideoBackgroundVisible$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = videoBackgroundKt$handleVideoBackgroundVisible$1.label;
        if (i != 0) {
        }
        ExoPlayer exoPlayer2 = (ExoPlayer) oz40Var.getValue();
        if (exoPlayer2 != null) {
        }
        if (!z) {
        }
        return zy11.a;
    }
}
