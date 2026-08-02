package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class cx1 {
    public final int a;
    public final AudioManager.OnAudioFocusChangeListener b;
    public final jyr c;
    public final jyr d;
    public AudioFocusRequest e;
    public boolean f;
    public final qqi g;

    public cx1(Context context, int i, int i2, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        context.getClass();
        this.a = i;
        this.b = onAudioFocusChangeListener;
        this.c = btf.b(new uw1(i2, 0));
        this.d = btf.b(new vw1(context, 0));
        this.g = rqi.a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(4:(2:3|(7:5|6|7|(1:(1:(1:(7:12|13|14|(1:16)(1:22)|17|18|19)(2:23|24))(7:25|26|27|(0)(0)|17|18|19))(1:28))(3:48|(1:50)|40)|29|30|(3:32|33|34)(3:35|(2:37|(6:39|27|(0)(0)|17|18|19))(2:41|(6:43|14|(0)(0)|17|18|19))|40)))|29|30|(0)(0))|52|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0032, code lost:
    
        r12 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062 A[Catch: all -> 0x006f, TRY_LEAVE, TryCatch #1 {all -> 0x006f, blocks: (B:30:0x005e, B:32:0x0062, B:35:0x0074, B:37:0x007c, B:41:0x009a), top: B:29:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074 A[Catch: all -> 0x006f, TRY_ENTER, TryCatch #1 {all -> 0x006f, blocks: (B:30:0x005e, B:32:0x0062, B:35:0x0074, B:37:0x007c, B:41:0x009a), top: B:29:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r0v14, types: [oqi] */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.coroutines.Continuation, ww1] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [oqi] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r12v4, types: [oqi, qqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        ?? r0;
        int i;
        int i2;
        oqi oqiVar;
        oqi oqiVar2;
        oqi oqiVar3;
        int intValue;
        try {
            if (cg6Var instanceof ww1) {
                ww1 ww1Var = (ww1) cg6Var;
                int i3 = ww1Var.n;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    ww1Var.n = i3 - Integer.MIN_VALUE;
                    r0 = ww1Var;
                    Object obj = r0.l;
                    nm6 nm6Var = nm6.a;
                    i = r0.n;
                    boolean z = true;
                    Continuation continuation = null;
                    if (i != 0) {
                        qgg.h0(obj);
                        ?? r12 = this.g;
                        r0.j = r12;
                        r0.k = 0;
                        r0.n = 1;
                        if (r12.a(r0) != nm6Var) {
                            i2 = 0;
                            oqiVar = r12;
                        }
                        return nm6Var;
                    }
                    if (i != 1) {
                        if (i == 2) {
                            oqi oqiVar4 = r0.j;
                            qgg.h0(obj);
                            oqiVar3 = oqiVar4;
                            intValue = ((Number) obj).intValue();
                            r0 = oqiVar3;
                            if (intValue == 1) {
                            }
                            Boolean valueOf = Boolean.valueOf(z);
                            r0.b(null);
                            return valueOf;
                        }
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oqi oqiVar5 = r0.j;
                        qgg.h0(obj);
                        oqiVar2 = oqiVar5;
                        intValue = ((Number) obj).intValue();
                        r0 = oqiVar2;
                        if (intValue == 1) {
                            z = false;
                        }
                        Boolean valueOf2 = Boolean.valueOf(z);
                        r0.b(null);
                        return valueOf2;
                    }
                    i2 = r0.k;
                    oqi oqiVar6 = r0.j;
                    qgg.h0(obj);
                    oqiVar = oqiVar6;
                    if (this.f) {
                        ssg.a(3, "AudioFocusRequester", "abandon() audio focus was not requested", null);
                        Boolean bool = Boolean.TRUE;
                        oqiVar.b(null);
                        return bool;
                    }
                    this.f = false;
                    if (Build.VERSION.SDK_INT >= 26) {
                        xw1 xw1Var = new xw1(this, null);
                        mn7 mn7Var = dm6.b;
                        r0.j = oqiVar;
                        r0.k = i2;
                        r0.n = 2;
                        Object V = x97.V(mn7Var, xw1Var, r0);
                        if (V != nm6Var) {
                            oqiVar3 = oqiVar;
                            obj = V;
                            intValue = ((Number) obj).intValue();
                            r0 = oqiVar3;
                            if (intValue == 1) {
                            }
                            Boolean valueOf22 = Boolean.valueOf(z);
                            r0.b(null);
                            return valueOf22;
                        }
                    } else {
                        yw1 yw1Var = new yw1(this, continuation, 0);
                        mn7 mn7Var2 = dm6.b;
                        r0.j = oqiVar;
                        r0.k = i2;
                        r0.n = 3;
                        Object V2 = x97.V(mn7Var2, yw1Var, r0);
                        if (V2 != nm6Var) {
                            oqiVar2 = oqiVar;
                            obj = V2;
                            intValue = ((Number) obj).intValue();
                            r0 = oqiVar2;
                            if (intValue == 1) {
                            }
                            Boolean valueOf222 = Boolean.valueOf(z);
                            r0.b(null);
                            return valueOf222;
                        }
                    }
                    return nm6Var;
                }
            }
            if (this.f) {
            }
        } catch (Throwable th) {
            r0 = oqiVar;
            th = th;
            r0.b(null);
            throw th;
        }
        r0 = new ww1(this, cg6Var);
        Object obj2 = r0.l;
        nm6 nm6Var2 = nm6.a;
        i = r0.n;
        boolean z2 = true;
        Continuation continuation2 = null;
        if (i != 0) {
        }
    }

    public final String b() {
        StringBuilder sb = new StringBuilder();
        sb.append("mode " + c().getMode() + StringUtil.SPACE);
        sb.append("isMusicActive " + c().isMusicActive() + StringUtil.SPACE);
        sb.append("isRequested " + this.f + StringUtil.SPACE);
        return sb.toString();
    }

    public final AudioManager c() {
        return (AudioManager) this.d.getValue();
    }

    public final AudioFocusRequest d(boolean z) {
        return new AudioFocusRequest.Builder(this.a).setAudioAttributes((AudioAttributes) this.c.getValue()).setAcceptsDelayedFocusGain(z).setOnAudioFocusChangeListener(this.b).build();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0056, code lost:
    
        if (r9.a(r0) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r4v2, types: [oqi] */
    /* JADX WARN: Type inference failed for: r7v0, types: [cx1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(boolean z, cg6 cg6Var) {
        zw1 zw1Var;
        nm6 nm6Var;
        int i;
        qqi qqiVar;
        int i2;
        Throwable th;
        oqi oqiVar;
        Object f;
        try {
            if (cg6Var instanceof zw1) {
                zw1Var = (zw1) cg6Var;
                int i3 = zw1Var.o;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    zw1Var.o = i3 - Integer.MIN_VALUE;
                    Object obj = zw1Var.m;
                    nm6Var = nm6.a;
                    i = zw1Var.o;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqiVar = this.g;
                        zw1Var.k = qqiVar;
                        zw1Var.j = z;
                        i2 = 0;
                        zw1Var.l = 0;
                        zw1Var.o = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oqiVar = zw1Var.k;
                            try {
                                qgg.h0(obj);
                                oqiVar.b(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                oqiVar.b(null);
                                throw th;
                            }
                        }
                        int i4 = zw1Var.l;
                        boolean z2 = zw1Var.j;
                        ?? r4 = zw1Var.k;
                        qgg.h0(obj);
                        i2 = i4;
                        z = z2;
                        qqiVar = r4;
                    }
                    zw1Var.k = qqiVar;
                    zw1Var.j = z;
                    zw1Var.l = i2;
                    zw1Var.o = 2;
                    f = f(z, zw1Var);
                    if (f != nm6Var) {
                        qqi qqiVar2 = qqiVar;
                        obj = f;
                        oqiVar = qqiVar2;
                        oqiVar.b(null);
                        return obj;
                    }
                    return nm6Var;
                }
            }
            zw1Var.k = qqiVar;
            zw1Var.j = z;
            zw1Var.l = i2;
            zw1Var.o = 2;
            f = f(z, zw1Var);
            if (f != nm6Var) {
            }
            return nm6Var;
        } catch (Throwable th3) {
            qqi qqiVar3 = qqiVar;
            th = th3;
            oqiVar = qqiVar3;
            oqiVar.b(null);
            throw th;
        }
        zw1Var = new zw1(this, cg6Var);
        Object obj2 = zw1Var.m;
        nm6Var = nm6.a;
        i = zw1Var.o;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0074, code lost:
    
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008e, code lost:
    
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(boolean z, cg6 cg6Var) {
        ax1 ax1Var;
        int i;
        int intValue;
        if (cg6Var instanceof ax1) {
            ax1Var = (ax1) cg6Var;
            int i2 = ax1Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ax1Var.m = i2 - Integer.MIN_VALUE;
                Object obj = ax1Var.k;
                nm6 nm6Var = nm6.a;
                i = ax1Var.m;
                boolean z2 = true;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    if (Build.VERSION.SDK_INT >= 26) {
                        xqn xqnVar = new xqn();
                        AudioFocusRequest audioFocusRequest = this.e;
                        xqnVar.a = audioFocusRequest;
                        if (audioFocusRequest == null) {
                            AudioFocusRequest d = d(z);
                            xqnVar.a = d;
                            this.e = d;
                        } else if (audioFocusRequest.acceptsDelayedFocusGain() != z) {
                            AudioFocusRequest d2 = d(z);
                            xqnVar.a = d2;
                            this.e = d2;
                        }
                        bx1 bx1Var = new bx1(this, xqnVar, null);
                        mn7 mn7Var = dm6.b;
                        ax1Var.j = z;
                        ax1Var.m = 1;
                        obj = x97.V(mn7Var, bx1Var, ax1Var);
                    } else {
                        yw1 yw1Var = new yw1(this, continuation, 1);
                        mn7 mn7Var2 = dm6.b;
                        ax1Var.j = z;
                        ax1Var.m = 2;
                        obj = x97.V(mn7Var2, yw1Var, ax1Var);
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    z = ax1Var.j;
                    qgg.h0(obj);
                    intValue = ((Number) obj).intValue();
                } else {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = ax1Var.j;
                    qgg.h0(obj);
                    intValue = ((Number) obj).intValue();
                }
                if (intValue == 1) {
                    if (intValue != 2) {
                        String b = b();
                        StringBuilder sb = new StringBuilder("AudioFocus FAILED: result=");
                        sb.append(intValue);
                        sb.append(", useDelayedAudioFocus=");
                        sb.append(z);
                        sb.append(", ");
                        v3w.m(sb, b, 6, "AudioFocusRequester", null);
                        z2 = false;
                    } else {
                        if (!z) {
                            ssg.a(6, "AudioFocusRequester", "AudioFocus DELAYED but not requested with delay option".concat(b()), null);
                            return Boolean.FALSE;
                        }
                        if (!this.f) {
                            this.f = true;
                        }
                        ssg.a(3, "AudioFocusRequester", "AudioFocus DELAYED (treated optimistically) ".concat(b()), null);
                    }
                } else if (!this.f) {
                    this.f = true;
                }
                return Boolean.valueOf(z2);
            }
        }
        ax1Var = new ax1(this, cg6Var);
        Object obj2 = ax1Var.k;
        nm6 nm6Var2 = nm6.a;
        i = ax1Var.m;
        boolean z22 = true;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        if (intValue == 1) {
        }
        return Boolean.valueOf(z22);
    }
}
