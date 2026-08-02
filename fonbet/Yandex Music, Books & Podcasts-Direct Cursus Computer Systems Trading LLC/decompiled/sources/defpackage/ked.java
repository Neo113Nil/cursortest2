package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.a;
import ru.yandex.music.common.media.queue.RemoteQueueStartException;

/* loaded from: classes5.dex */
public final class ked {
    public final a a;
    public final mm6 b;
    public final jyr c;
    public final qqi d;
    public final CopyOnWriteArrayList e;
    public final bdd f;
    public final ConcurrentHashMap g;
    public boolean h;

    public ked() {
        dq7 dq7Var = ca8.a;
        mn7 mn7Var = mn7.d;
        mn7Var.getClass();
        this.a = mn7Var;
        this.b = hld.r(new yiq(), mn7Var);
        this.c = l18.b.b(hag.I(yjd.class), true);
        this.d = rqi.a();
        this.e = new CopyOnWriteArrayList();
        this.f = new bdd(1, this);
        this.g = new ConcurrentHashMap();
        this.h = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(ked kedVar, String str, egd egdVar, vgd vgdVar, cg6 cg6Var) {
        jed jedVar;
        int i;
        String deviceId;
        vgd vgdVar2;
        ced cedVar;
        RemoteQueueStartException e;
        ConcurrentHashMap concurrentHashMap = kedVar.g;
        if (cg6Var instanceof jed) {
            jedVar = (jed) cg6Var;
            int i2 = jedVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jedVar.o = i2 - Integer.MIN_VALUE;
                Object obj = jedVar.m;
                nm6 nm6Var = nm6.a;
                i = jedVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    deviceId = egdVar.b.getDeviceId();
                    deviceId.getClass();
                    mdg mdgVar = (mdg) concurrentHashMap.get(deviceId);
                    if (mdgVar == null) {
                        return new fed(new shd(hrg.q("Conversation to ", deviceId, " not found")));
                    }
                    try {
                        ssg.a(2, null, "establish new connection to " + mdgVar.getDiscoveredDevice().getDeviceId(), null);
                        ced cedVar2 = new ced(mdgVar, egdVar.b, str, egdVar.d, egdVar.e, egdVar.c, vgdVar, kedVar.f);
                        vgdVar2 = vgdVar;
                        try {
                            jedVar.j = vgdVar2;
                            jedVar.k = deviceId;
                            jedVar.l = cedVar2;
                            jedVar.o = 1;
                            if (cedVar2.D(jedVar) == nm6Var) {
                                return nm6Var;
                            }
                            cedVar = cedVar2;
                        } catch (RemoteQueueStartException e2) {
                            e = e2;
                            ssg.a(6, null, vgdVar2 + " launch to " + deviceId + " have failed", null);
                            nmb nmbVar = w64.a;
                            w64.b(ulb.Logic, w64.a("RemoteQueueStartException", e.getMessage()));
                            return new ged(e);
                        }
                    } catch (shd e3) {
                        ssg.a(6, null, hrg.q("connection to ", deviceId, " have failed"), e3);
                        mdg mdgVar2 = (mdg) concurrentHashMap.remove(deviceId);
                        if (mdgVar2 != null) {
                            mdgVar2.close();
                        }
                        return new fed(new shd(hrg.q("Connection to ", deviceId, " have failed"), e3));
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cedVar = jedVar.l;
                    String str2 = jedVar.k;
                    vgd vgdVar3 = jedVar.j;
                    try {
                        qgg.h0(obj);
                        deviceId = str2;
                        vgdVar2 = vgdVar3;
                    } catch (RemoteQueueStartException e4) {
                        e = e4;
                        deviceId = str2;
                        vgdVar2 = vgdVar3;
                        ssg.a(6, null, vgdVar2 + " launch to " + deviceId + " have failed", null);
                        nmb nmbVar2 = w64.a;
                        w64.b(ulb.Logic, w64.a("RemoteQueueStartException", e.getMessage()));
                        return new ged(e);
                    }
                }
                return new eed(cedVar);
            }
        }
        jedVar = new jed(kedVar, cg6Var);
        Object obj2 = jedVar.m;
        nm6 nm6Var2 = nm6.a;
        i = jedVar.o;
        if (i != 0) {
        }
        return new eed(cedVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00ed -> B:11:0x00f0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(egd egdVar, vgd vgdVar, cg6 cg6Var) {
        ied iedVar;
        int i;
        egd egdVar2;
        int i2;
        xqn xqnVar;
        int i3;
        vgd vgdVar2;
        egd egdVar3;
        vgd vgdVar3;
        xqn xqnVar2;
        int i4;
        int i5;
        int i6;
        int i7;
        hed hedVar;
        if (cg6Var instanceof ied) {
            iedVar = (ied) cg6Var;
            int i8 = iedVar.t;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                iedVar.t = i8 - Integer.MIN_VALUE;
                Object obj = iedVar.r;
                nm6 nm6Var = nm6.a;
                i = iedVar.t;
                int i9 = 0;
                if (i != 0) {
                    xqn i10 = hrg.i(obj);
                    egdVar2 = egdVar;
                    String deviceId = egdVar2.b.getDeviceId();
                    i10.a = new fed(new shd(hrg.A(deviceId, "connection with retry to ", deviceId, " have failed")));
                    i2 = 5;
                    xqnVar = i10;
                    i3 = 0;
                    vgdVar2 = vgdVar;
                    if (i3 < i2) {
                    }
                } else if (i == 1) {
                    int i11 = iedVar.q;
                    int i12 = iedVar.p;
                    int i13 = iedVar.o;
                    i4 = iedVar.n;
                    xqn xqnVar3 = iedVar.m;
                    xqn xqnVar4 = iedVar.l;
                    vgdVar3 = iedVar.k;
                    egdVar3 = iedVar.j;
                    qgg.h0(obj);
                    i6 = i11;
                    i7 = i13;
                    i5 = i12;
                    xqnVar2 = xqnVar3;
                    xqnVar = xqnVar4;
                    xqnVar2.a = obj;
                    Object obj2 = xqnVar.a;
                    hedVar = (hed) obj2;
                    if (hedVar instanceof eed) {
                    }
                } else {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i7 = iedVar.o;
                    int i14 = iedVar.n;
                    xqn xqnVar5 = iedVar.l;
                    vgd vgdVar4 = iedVar.k;
                    egd egdVar4 = iedVar.j;
                    qgg.h0(obj);
                    xqnVar = xqnVar5;
                    egdVar2 = egdVar4;
                    vgdVar2 = vgdVar4;
                    int i15 = i14;
                    i3 = i7 + 1;
                    i2 = i15;
                    i9 = 0;
                    if (i3 < i2) {
                        iedVar.j = egdVar2;
                        iedVar.k = vgdVar2;
                        iedVar.l = xqnVar;
                        iedVar.m = xqnVar;
                        iedVar.n = i2;
                        iedVar.o = i3;
                        iedVar.p = i3;
                        iedVar.q = i9;
                        iedVar.t = 1;
                        Object V = x97.V(this.a, new avb(this, egdVar2, vgdVar2, (Continuation) null), iedVar);
                        if (V != nm6Var) {
                            vgdVar3 = vgdVar2;
                            egdVar3 = egdVar2;
                            obj = V;
                            xqnVar2 = xqnVar;
                            i4 = i2;
                            i7 = i3;
                            i5 = i7;
                            i6 = i9;
                            xqnVar2.a = obj;
                            Object obj22 = xqnVar.a;
                            hedVar = (hed) obj22;
                            if (hedVar instanceof eed) {
                                return obj22;
                            }
                            if (!(hedVar instanceof ded) && !(hedVar instanceof fed) && !(hedVar instanceof ged)) {
                                b6e.s();
                                return null;
                            }
                            iedVar.j = egdVar3;
                            iedVar.k = vgdVar3;
                            iedVar.l = xqnVar;
                            iedVar.m = null;
                            iedVar.n = i4;
                            iedVar.o = i7;
                            iedVar.p = i5;
                            iedVar.q = i6;
                            iedVar.t = 2;
                            if (y2x.o(1000L, iedVar) != nm6Var) {
                                i14 = i4;
                                vgdVar2 = vgdVar3;
                                egdVar2 = egdVar3;
                                int i152 = i14;
                                i3 = i7 + 1;
                                i2 = i152;
                                i9 = 0;
                                if (i3 < i2) {
                                    return xqnVar.a;
                                }
                            }
                        }
                        return nm6Var;
                    }
                }
            }
        }
        iedVar = new ied(this, cg6Var);
        Object obj3 = iedVar.r;
        nm6 nm6Var2 = nm6.a;
        i = iedVar.t;
        int i92 = 0;
        if (i != 0) {
        }
    }
}
