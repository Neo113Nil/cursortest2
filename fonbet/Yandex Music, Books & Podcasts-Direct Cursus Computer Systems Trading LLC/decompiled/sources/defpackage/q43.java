package defpackage;

import android.R;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class q43 {
    public final s63 a;
    public final jnq b;
    public b70 c;

    public q43(s63 s63Var, jnq jnqVar) {
        s63Var.getClass();
        jnqVar.getClass();
        this.a = s63Var;
        this.b = jnqVar;
    }

    public static void c(q43 q43Var, int i) {
        q43Var.b(q43Var.a, i, null, null);
    }

    public final void a(h70 h70Var) {
        wjb wjbVar;
        b70 b70Var = this.c;
        if (b70Var != null) {
            jnq jnqVar = this.b;
            jnqVar.getClass();
            nmb nmbVar = jnqVar.c;
            String G = jnqVar.a.G();
            cvo cvoVar = jnqVar.b;
            wjb wjbVar2 = cvoVar.a;
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
            pkb R = ghh.R(c70.b);
            wjb wjbVar3 = cvoVar.a;
            switch (h70Var.a.ordinal()) {
                case 0:
                    wjbVar = wjb.AlbumListScreen;
                    break;
                case 1:
                    wjbVar = wjb.ArtistListScreen;
                    break;
                case 2:
                    wjbVar = wjb.PlaylistListScreen;
                    break;
                case 3:
                    wjbVar = wjb.ArtistConcertsScreen;
                    break;
                case 4:
                    wjbVar = wjb.AboutArtistScreen;
                    break;
                case 5:
                    wjbVar = wjb.ArtistFullscreenGalleryScreen;
                    break;
                case 6:
                    wjbVar = wjb.ArtistFamiliarToYouScreen;
                    break;
                case 7:
                    wjbVar = wjb.ArtistTrackListScreen;
                    break;
                case 8:
                    wjbVar = wjb.Link;
                    break;
                default:
                    b6e.s();
                    return;
            }
            nmbVar.n(wjbVar3, wjbVar, G, wjbVar2, (r60 & 16) != 0 ? ilb.Fullscreen : null, (r60 & 32) != 0 ? glb.Fullscreen : null, (r60 & 64) != 0 ? "" : str, (r60 & 128) != 0 ? pkb.NonApplicable : pkbVar, (r60 & 256) != 0 ? "" : str5, R, "", (r60 & 2048) != 0 ? 0 : 0, (r60 & 4096) != 0 ? 0 : 0, (r60 & RemoteCameraConfig.Notification.ID) != 0 ? "" : str2, (r60 & 16384) != 0 ? 0 : i, (32768 & r60) != 0 ? false : z, str6, str7, 1, (524288 & r60) != 0 ? 1 : i2, (1048576 & r60) != 0 ? 0 : i3, (2097152 & r60) != 0 ? "" : str4, (4194304 & r60) != 0 ? "" : str8, (8388608 & r60) != 0 ? "" : str9, (16777216 & r60) != 0 ? 0 : i4, "", cvoVar.a(), "", (r60 & 268435456) != 0 ? "" : "");
        }
    }

    public final void b(s63 s63Var, int i, String str, f70 f70Var) {
        s63Var.getClass();
        f(s63Var, i, str, f70Var);
        b70 b70Var = this.c;
        if (b70Var != null) {
            jnq jnqVar = this.b;
            jnqVar.getClass();
            nmb nmbVar = jnqVar.c;
            String G = jnqVar.a.G();
            cvo cvoVar = jnqVar.b;
            wjb wjbVar = cvoVar.a;
            String str2 = cvoVar.d.a;
            p80 p80Var = b70Var.e;
            String str3 = p80Var != null ? p80Var.a : "";
            int i2 = p80Var != null ? p80Var.b + 1 : -1;
            boolean z = p80Var != null && p80Var.c;
            String str4 = b70Var.f;
            String str5 = str4 == null ? "" : str4;
            avo avoVar = cvoVar.e;
            nmb.m(nmbVar, G, wjbVar, null, null, str2, avoVar.a, avoVar.b, str3, i2, z, b70Var.b, b70Var.a, 0, b70Var.c + 1, b70Var.d, str5, b70Var.g, b70Var.h, b70Var.i, 4108);
        }
    }

    public final void d(int i, int i2, String str) {
        str.getClass();
        b70 b70Var = this.c;
        if (b70Var != null) {
            this.b.a(b70Var, new d70(StringsKt.k0(str, "://", str), c70.f, str, i, i2, ""), new k70(str));
        }
    }

    public final void e(d70 d70Var, String str) {
        d70Var.getClass();
        b70 b70Var = this.c;
        if (b70Var != null) {
            this.b.a(b70Var, d70Var, str != null ? new k70(str) : new j70(d70Var));
        }
    }

    public final void f(s63 s63Var, int i, String str, f70 f70Var) {
        s63Var.getClass();
        drf drfVar = s63Var.a;
        String str2 = drfVar.a().a;
        String str3 = drfVar.a().b;
        int i2 = s63Var.b;
        t63 t63Var = s63Var.d;
        this.c = new b70(str2, str3, i2, i, t63Var != null ? new p80(t63Var.a, t63Var.b, t63Var.c) : null, str, f70Var);
    }

    public final void g(d70 d70Var, String str) {
        d70Var.getClass();
        str.getClass();
        b70 b70Var = this.c;
        if (b70Var != null) {
            jnq jnqVar = this.b;
            jnqVar.getClass();
            nmb nmbVar = jnqVar.c;
            String G = jnqVar.a.G();
            cvo cvoVar = jnqVar.b;
            wjb wjbVar = cvoVar.a;
            String str2 = cvoVar.d.a;
            p80 p80Var = b70Var.e;
            String str3 = p80Var != null ? p80Var.a : "";
            int i = p80Var != null ? p80Var.b + 1 : -1;
            boolean z = p80Var != null && p80Var.c;
            String str4 = b70Var.f;
            String str5 = str4 == null ? "" : str4;
            avo avoVar = cvoVar.e;
            nmb.s(nmbVar, G, wjbVar, str2, avoVar.a, avoVar.b, ghh.R(d70Var.b), d70Var.a, d70Var.d + 1, d70Var.e + 1, str3, i, z, b70Var.b, b70Var.a, b70Var.c + 1, b70Var.d, str5, b70Var.g, b70Var.h, b70Var.i, str, R.attr.hasCode);
        }
    }

    public final void h(d70 d70Var, boolean z) {
        int i = d70Var.e;
        int i2 = d70Var.d;
        c70 c70Var = d70Var.b;
        jnq jnqVar = this.b;
        if (z) {
            b70 b70Var = this.c;
            if (b70Var != null) {
                jnqVar.getClass();
                nmb nmbVar = jnqVar.c;
                String G = jnqVar.a.G();
                cvo cvoVar = jnqVar.b;
                wjb wjbVar = cvoVar.a;
                String str = cvoVar.d.a;
                p80 p80Var = b70Var.e;
                String str2 = p80Var != null ? p80Var.a : "";
                int i3 = p80Var != null ? p80Var.b + 1 : -1;
                boolean z2 = p80Var != null && p80Var.c;
                String str3 = b70Var.f;
                String str4 = str3 == null ? "" : str3;
                avo avoVar = cvoVar.e;
                nmb.p(nmbVar, G, wjbVar, null, null, str, avoVar.a, avoVar.b, ghh.R(c70Var), d70Var.a, i2 + 1, i + 1, str2, i3, z2, b70Var.b, b70Var.a, b70Var.c + 1, b70Var.d, str4, b70Var.g, b70Var.h, b70Var.i, d70Var.f, 65548);
                return;
            }
            return;
        }
        if (z) {
            b6e.s();
            return;
        }
        b70 b70Var2 = this.c;
        if (b70Var2 != null) {
            jnqVar.getClass();
            nmb nmbVar2 = jnqVar.c;
            String G2 = jnqVar.a.G();
            cvo cvoVar2 = jnqVar.b;
            wjb wjbVar2 = cvoVar2.a;
            String str5 = cvoVar2.d.a;
            p80 p80Var2 = b70Var2.e;
            String str6 = p80Var2 != null ? p80Var2.a : "";
            int i4 = p80Var2 != null ? p80Var2.b + 1 : -1;
            boolean z3 = p80Var2 != null && p80Var2.c;
            String str7 = b70Var2.f;
            String str8 = str7 == null ? "" : str7;
            avo avoVar2 = cvoVar2.e;
            nmb.j(nmbVar2, G2, wjbVar2, null, null, str5, avoVar2.a, avoVar2.b, ghh.R(c70Var), d70Var.a, i2 + 1, i + 1, str6, i4, z3, b70Var2.b, b70Var2.a, b70Var2.c + 1, b70Var2.d, str8, d70Var.f, 7405580);
        }
    }
}
