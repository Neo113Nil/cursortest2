package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;

/* loaded from: classes4.dex */
public final class jnq {
    public final fnb a;
    public final cvo b;
    public final nmb c;

    public jnq(fnb fnbVar, cvo cvoVar) {
        fnbVar.getClass();
        cvoVar.getClass();
        this.a = fnbVar;
        this.b = cvoVar;
        this.c = qld.m();
    }

    public final void a(b70 b70Var, d70 d70Var, n70 n70Var) {
        b70Var.getClass();
        d70Var.getClass();
        String G = this.a.G();
        cvo cvoVar = this.b;
        wjb wjbVar = cvoVar.a;
        String str = cvoVar.d.a;
        p80 p80Var = b70Var.e;
        String str2 = p80Var != null ? p80Var.a : "";
        int i = p80Var != null ? p80Var.b + 1 : -1;
        boolean z = p80Var != null && p80Var.c;
        String str3 = b70Var.f;
        String str4 = str3 == null ? "" : str3;
        avo avoVar = cvoVar.e;
        String str5 = avoVar.b;
        pkb pkbVar = avoVar.a;
        String str6 = b70Var.b;
        String str7 = b70Var.a;
        int i2 = b70Var.c + 1;
        int i3 = b70Var.d;
        String str8 = b70Var.g;
        String str9 = b70Var.h;
        int i4 = b70Var.i;
        pkb R = ghh.R(d70Var.b);
        String str10 = d70Var.a;
        int i5 = d70Var.d + 1;
        int i6 = d70Var.e + 1;
        this.c.n(cvoVar.a, ghh.Q(n70Var), G, wjbVar, (r60 & 16) != 0 ? ilb.Fullscreen : null, (r60 & 32) != 0 ? glb.Fullscreen : null, (r60 & 64) != 0 ? "" : str, (r60 & 128) != 0 ? pkb.NonApplicable : pkbVar, (r60 & 256) != 0 ? "" : str5, R, str10, (r60 & 2048) != 0 ? 0 : i5, (r60 & 4096) != 0 ? 0 : i6, (r60 & RemoteCameraConfig.Notification.ID) != 0 ? "" : str2, (r60 & 16384) != 0 ? 0 : i, (32768 & r60) != 0 ? false : z, str6, str7, 1, (524288 & r60) != 0 ? 1 : i2, (1048576 & r60) != 0 ? 0 : i3, (2097152 & r60) != 0 ? "" : str4, (4194304 & r60) != 0 ? "" : str8, (8388608 & r60) != 0 ? "" : str9, (16777216 & r60) != 0 ? 0 : i4, d70Var.f, cvoVar.a(), "", (r60 & 268435456) != 0 ? "" : ghh.r(n70Var));
    }
}
