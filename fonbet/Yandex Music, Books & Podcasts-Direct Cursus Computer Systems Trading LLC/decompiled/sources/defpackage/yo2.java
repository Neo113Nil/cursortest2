package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class yo2 extends vo2 {
    public final jyr k;
    public final jyr l;
    public final fkn m;

    public yo2(xm2 xm2Var, jyr jyrVar, jyr jyrVar2) {
        xm2Var.getClass();
        this.k = jyrVar;
        this.l = jyrVar2;
        this.m = lg3.u0(zsd.b0(new xo2(zsd.M0(xm2Var.b, new l1((Continuation) null, this, 7)), 0)), ot0.F(this), to2.a);
    }

    @Override // defpackage.vo2
    public final vdr G() {
        return this.m;
    }

    @Override // defpackage.vo2
    public final void H(mo2 mo2Var, wjb wjbVar) {
        tm2 tm2Var;
        mo2Var.getClass();
        sm2 sm2Var = (sm2) this.k.getValue();
        String a = mo2Var.a();
        sm2Var.getClass();
        String str = (String) sm2Var.b.get(a);
        if (str == null || (tm2Var = (tm2) sm2Var.c.get(a)) == null) {
            return;
        }
        um2 um2Var = (um2) sm2Var.a.getValue();
        um2Var.getClass();
        nmb nmbVar = (nmb) um2Var.a.getValue();
        String g = f1d.g("android_client_bar_above_", tm2Var.b);
        wjb wjbVar2 = um2.b;
        ilb ilbVar = um2.c;
        glb glbVar = um2.d;
        avo avoVar = um2.e;
        String str2 = avoVar.b;
        pkb pkbVar = avoVar.a;
        String str3 = tm2Var.a;
        nmbVar.n(wjbVar2, wjbVar, g, wjbVar2, (r60 & 16) != 0 ? ilb.Fullscreen : ilbVar, (r60 & 32) != 0 ? glb.Fullscreen : glbVar, (r60 & 64) != 0 ? "" : null, (r60 & 128) != 0 ? pkb.NonApplicable : pkbVar, (r60 & 256) != 0 ? "" : str2, pkbVar, str2, (r60 & 2048) != 0 ? 0 : 1, (r60 & 4096) != 0 ? 0 : 1, (r60 & RemoteCameraConfig.Notification.ID) != 0 ? "" : null, (r60 & 16384) != 0 ? 0 : 0, (32768 & r60) != 0 ? false : false, str3, str3, 1, (524288 & r60) != 0 ? 1 : 0, (1048576 & r60) != 0 ? 0 : 0, (2097152 & r60) != 0 ? "" : "", (4194304 & r60) != 0 ? "" : null, (8388608 & r60) != 0 ? "" : null, (16777216 & r60) != 0 ? 0 : 0, str, "", "", (r60 & 268435456) != 0 ? "" : "");
    }

    @Override // defpackage.vo2
    public final void J(mo2 mo2Var, boolean z) {
        tm2 tm2Var;
        mo2Var.getClass();
        jyr jyrVar = this.k;
        if (!z) {
            sm2 sm2Var = (sm2) jyrVar.getValue();
            String a = mo2Var.a();
            sm2Var.getClass();
            LinkedHashMap linkedHashMap = sm2Var.b;
            String str = (String) linkedHashMap.get(a);
            if (str == null || (tm2Var = (tm2) sm2Var.c.get(a)) == null) {
                return;
            }
            linkedHashMap.remove(a);
            um2 um2Var = (um2) sm2Var.a.getValue();
            um2Var.getClass();
            nmb nmbVar = (nmb) um2Var.a.getValue();
            String g = f1d.g("android_client_bar_above_", tm2Var.b);
            wjb wjbVar = um2.b;
            ilb ilbVar = um2.c;
            glb glbVar = um2.d;
            avo avoVar = um2.e;
            String str2 = avoVar.b;
            pkb pkbVar = avoVar.a;
            String str3 = tm2Var.a;
            nmbVar.k(g, wjbVar, ilbVar, glbVar, "", pkbVar, str2, pkbVar, str2, (r44 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 ? 0 : 1, (r44 & 1024) != 0 ? 0 : 1, "", 0, false, str3, str3, 1, 1, 0, "", "", "", 0, str, "", "");
            return;
        }
        sm2 sm2Var2 = (sm2) jyrVar.getValue();
        String a2 = mo2Var.a();
        LinkedHashMap linkedHashMap2 = sm2Var2.c;
        LinkedHashMap linkedHashMap3 = sm2Var2.b;
        if (linkedHashMap3.containsKey(a2)) {
            return;
        }
        String e = eta.e();
        tm2 tm2Var2 = (tm2) linkedHashMap2.get(a2);
        if (tm2Var2 == null) {
            tm2Var2 = new tm2(a2);
        }
        linkedHashMap3.put(a2, e);
        linkedHashMap2.put(a2, tm2Var2);
        um2 um2Var2 = (um2) sm2Var2.a.getValue();
        um2Var2.getClass();
        nmb nmbVar2 = (nmb) um2Var2.a.getValue();
        String g2 = f1d.g("android_client_bar_above_", tm2Var2.b);
        wjb wjbVar2 = um2.b;
        ilb ilbVar2 = um2.c;
        glb glbVar2 = um2.d;
        avo avoVar2 = um2.e;
        String str4 = avoVar2.b;
        pkb pkbVar2 = avoVar2.a;
        String str5 = tm2Var2.a;
        nmbVar2.q(g2, wjbVar2, ilbVar2, glbVar2, "", pkbVar2, str4, pkbVar2, str4, (r44 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 ? 0 : 1, (r44 & 1024) != 0 ? 0 : 1, "", 0, false, str5, str5, 1, 1, 0, "", "", "", 0, e, "", "");
    }
}
