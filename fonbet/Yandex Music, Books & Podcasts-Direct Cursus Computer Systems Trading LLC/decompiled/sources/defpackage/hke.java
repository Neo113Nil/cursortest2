package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class hke {
    public static final wjb c = wjb.InformerScreen;
    public static final ilb d = ilb.Bar;
    public static final glb e = glb.Bottom;
    public final jyr a = btf.b(new sxd(8));
    public final LinkedHashMap b = new LinkedHashMap();

    public static String a(gke gkeVar) {
        return f1d.g("android_client_informer_", gkeVar.b);
    }

    public final void b(gke gkeVar, String str) {
        gkeVar.getClass();
        str.getClass();
        nmb nmbVar = (nmb) this.a.getValue();
        String a = a(gkeVar);
        avo avoVar = gkeVar.e;
        String str2 = avoVar.b;
        pkb pkbVar = avoVar.a;
        String str3 = gkeVar.a;
        avo avoVar2 = gkeVar.d;
        String str4 = avoVar2.b;
        nmb.j(nmbVar, a, c, d, e, null, pkbVar, str2, avoVar2.a, str4, 1, 1, null, 0, false, str3, str3, 0, 0, gkeVar.c, str, 7813136);
        this.b.remove(gkeVar.b);
    }

    public final void c(gke gkeVar, wjb wjbVar, String str) {
        gkeVar.getClass();
        nmb nmbVar = (nmb) this.a.getValue();
        String a = a(gkeVar);
        avo avoVar = gkeVar.e;
        String str2 = avoVar.b;
        pkb pkbVar = avoVar.a;
        String str3 = gkeVar.a;
        avo avoVar2 = gkeVar.d;
        String str4 = avoVar2.b;
        pkb pkbVar2 = avoVar2.a;
        String str5 = gkeVar.c;
        wjb wjbVar2 = wjb.InformerScreen;
        String str6 = (String) this.b.get(gkeVar.b);
        if (str6 == null) {
            str6 = "";
        }
        nmbVar.n(wjbVar2, wjbVar, a, c, (r60 & 16) != 0 ? ilb.Fullscreen : d, (r60 & 32) != 0 ? glb.Fullscreen : e, (r60 & 64) != 0 ? "" : null, (r60 & 128) != 0 ? pkb.NonApplicable : pkbVar, (r60 & 256) != 0 ? "" : str2, pkbVar2, str4, (r60 & 2048) != 0 ? 0 : 1, (r60 & 4096) != 0 ? 0 : 1, (r60 & RemoteCameraConfig.Notification.ID) != 0 ? "" : null, (r60 & 16384) != 0 ? 0 : 0, (32768 & r60) != 0 ? false : false, str3, str3, 1, (524288 & r60) != 0 ? 1 : 0, (1048576 & r60) != 0 ? 0 : 0, (2097152 & r60) != 0 ? "" : str5, (4194304 & r60) != 0 ? "" : null, (8388608 & r60) != 0 ? "" : null, (16777216 & r60) != 0 ? 0 : 0, str6, "", "", (r60 & 268435456) != 0 ? "" : str);
    }

    public final void d(gke gkeVar, String str) {
        gkeVar.getClass();
        str.getClass();
        this.b.put(gkeVar.b, str);
        nmb nmbVar = (nmb) this.a.getValue();
        String a = a(gkeVar);
        avo avoVar = gkeVar.e;
        String str2 = avoVar.b;
        pkb pkbVar = avoVar.a;
        String str3 = gkeVar.a;
        avo avoVar2 = gkeVar.d;
        String str4 = avoVar2.b;
        nmb.p(nmbVar, a, c, d, e, null, pkbVar, str2, avoVar2.a, str4, 1, 1, null, 0, false, str3, str3, 0, 0, gkeVar.c, null, null, 0, str, 7813136);
    }
}
