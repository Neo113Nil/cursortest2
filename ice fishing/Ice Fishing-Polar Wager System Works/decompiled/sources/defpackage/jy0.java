package defpackage;

/* loaded from: classes.dex */
public final class jy0 {
    public static final defpackage.jy0 r1MBDhnF = new defpackage.jy0();
    public final java.util.concurrent.ConcurrentHashMap oh6vYeIP = new java.util.concurrent.ConcurrentHashMap();
    public final defpackage.c1NqjJifC7 IHQe1A4L2xu = new defpackage.c1NqjJifC7(1);

    public final defpackage.c51 IHQe1A4L2xu(java.lang.Class cls) {
        defpackage.vu vuVar;
        defpackage.c51 PAEGRtP0bX;
        java.lang.Class cls2;
        defpackage.q70.IHQe1A4L2xu(cls, "messageType");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.oh6vYeIP;
        defpackage.c51 c51Var = (defpackage.c51) concurrentHashMap.get(cls);
        if (c51Var != null) {
            return c51Var;
        }
        defpackage.c1NqjJifC7 c1nqjjifc7 = this.IHQe1A4L2xu;
        c1nqjjifc7.getClass();
        java.lang.Class cls3 = defpackage.d51.IHQe1A4L2xu;
        if (!defpackage.e20.class.isAssignableFrom(cls) && (cls2 = defpackage.d51.IHQe1A4L2xu) != null && !cls2.isAssignableFrom(cls)) {
            defpackage.db.fnWB2E7cs("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        defpackage.ty0 IHQe1A4L2xu = ((defpackage.ng0) c1nqjjifc7.xiZrDbcSW0).IHQe1A4L2xu(cls);
        if ((IHQe1A4L2xu.F7NU4MC0GW & 2) == 2) {
            if (defpackage.e20.class.isAssignableFrom(cls)) {
                PAEGRtP0bX = new defpackage.bj0(defpackage.d51.r1MBDhnF, defpackage.wu.IHQe1A4L2xu, IHQe1A4L2xu.IHQe1A4L2xu);
            } else {
                defpackage.qk1 qk1Var = defpackage.d51.oh6vYeIP;
                defpackage.vu vuVar2 = defpackage.wu.oh6vYeIP;
                if (vuVar2 == null) {
                    defpackage.db.AARZUJiTa("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                PAEGRtP0bX = new defpackage.bj0(qk1Var, vuVar2, IHQe1A4L2xu.IHQe1A4L2xu);
            }
        } else if (defpackage.e20.class.isAssignableFrom(cls)) {
            defpackage.yo0 yo0Var = defpackage.zo0.oh6vYeIP;
            defpackage.ve0 ve0Var = defpackage.we0.oh6vYeIP;
            defpackage.qk1 qk1Var2 = defpackage.d51.r1MBDhnF;
            defpackage.vu vuVar3 = defpackage.fx0.fnWB2E7cs(IHQe1A4L2xu.IHQe1A4L2xu()) != 1 ? defpackage.wu.IHQe1A4L2xu : null;
            defpackage.ih0 ih0Var = defpackage.jh0.oh6vYeIP;
            if (!(IHQe1A4L2xu instanceof defpackage.ty0)) {
                int[] iArr = defpackage.aj0.SyNS6RMn;
                defpackage.db.kd6TUFXn();
                return null;
            }
            PAEGRtP0bX = defpackage.aj0.PAEGRtP0bX(IHQe1A4L2xu, yo0Var, ve0Var, qk1Var2, vuVar3, ih0Var);
        } else {
            defpackage.yo0 yo0Var2 = defpackage.zo0.IHQe1A4L2xu;
            defpackage.ve0 ve0Var2 = defpackage.we0.IHQe1A4L2xu;
            defpackage.qk1 qk1Var3 = defpackage.d51.oh6vYeIP;
            if (defpackage.fx0.fnWB2E7cs(IHQe1A4L2xu.IHQe1A4L2xu()) != 1) {
                defpackage.vu vuVar4 = defpackage.wu.oh6vYeIP;
                if (vuVar4 == null) {
                    defpackage.db.AARZUJiTa("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                vuVar = vuVar4;
            } else {
                vuVar = null;
            }
            defpackage.ih0 ih0Var2 = defpackage.jh0.IHQe1A4L2xu;
            if (!(IHQe1A4L2xu instanceof defpackage.ty0)) {
                int[] iArr2 = defpackage.aj0.SyNS6RMn;
                defpackage.db.kd6TUFXn();
                return null;
            }
            PAEGRtP0bX = defpackage.aj0.PAEGRtP0bX(IHQe1A4L2xu, yo0Var2, ve0Var2, qk1Var3, vuVar, ih0Var2);
        }
        defpackage.c51 c51Var2 = (defpackage.c51) concurrentHashMap.putIfAbsent(cls, PAEGRtP0bX);
        return c51Var2 != null ? c51Var2 : PAEGRtP0bX;
    }
}
