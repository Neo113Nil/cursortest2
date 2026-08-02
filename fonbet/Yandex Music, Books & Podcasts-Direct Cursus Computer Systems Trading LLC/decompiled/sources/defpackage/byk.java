package defpackage;

import com.appsflyer.internal.k;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class byk {
    public final nmb a;

    public byk(int i) {
        switch (i) {
            case 1:
                this.a = qld.m();
                break;
            default:
                this.a = qld.m();
                break;
        }
    }

    public void a(x1u x1uVar, String str) {
        String str2;
        String str3;
        x1uVar.getClass();
        str.getClass();
        c01 c01Var = (c01) CollectionsKt.firstOrNull(x1uVar.h);
        if (c01Var == null || (str2 = c01Var.a) == null) {
            str2 = "";
        }
        if (c01Var == null || (str3 = c01Var.b) == null) {
            str3 = "";
        }
        String str4 = (String) CollectionsKt.firstOrNull(x1uVar.g);
        if (str4 == null) {
            str4 = "";
        }
        String str5 = x1uVar.b;
        String str6 = x1uVar.a;
        nmb nmbVar = this.a;
        nmbVar.getClass();
        str5.getClass();
        str6.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("artist_id", str2);
        linkedHashMap.put("artist_name", str3);
        linkedHashMap.put("hash", str);
        linkedHashMap.put("page_type", "object");
        linkedHashMap.put("track_id", str4);
        linkedHashMap.put("track_name", str5);
        linkedHashMap.put("tag", "");
        dfi.p(1, "clip_id", str6, "_meta", linkedHashMap);
        nmbVar.C("Video.Audio.Activated", linkedHashMap);
    }

    public void b(x1u x1uVar, String str) {
        String str2;
        String str3;
        x1uVar.getClass();
        str.getClass();
        c01 c01Var = (c01) CollectionsKt.firstOrNull(x1uVar.h);
        if (c01Var == null || (str2 = c01Var.a) == null) {
            str2 = "";
        }
        if (c01Var == null || (str3 = c01Var.b) == null) {
            str3 = "";
        }
        String str4 = (String) CollectionsKt.firstOrNull(x1uVar.g);
        if (str4 == null) {
            str4 = "";
        }
        String str5 = x1uVar.b;
        String str6 = x1uVar.a;
        nmb nmbVar = this.a;
        nmbVar.getClass();
        str5.getClass();
        str6.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("artist_id", str2);
        linkedHashMap.put("artist_name", str3);
        linkedHashMap.put("hash", str);
        linkedHashMap.put("page_type", "object");
        linkedHashMap.put("track_id", str4);
        linkedHashMap.put("track_name", str5);
        linkedHashMap.put("tag", "");
        dfi.p(1, "clip_id", str6, "_meta", linkedHashMap);
        nmbVar.C("Video.Audio.Deactivated", linkedHashMap);
    }

    public void c(x5l x5lVar, gxc gxcVar) {
        String str;
        String str2;
        pkb pkbVar;
        x5lVar.getClass();
        String str3 = "";
        if (x5lVar instanceof v5l) {
            v5l v5lVar = (v5l) x5lVar;
            cvo cvoVar = v5lVar.a;
            b70 b70Var = v5lVar.b;
            d70 d70Var = v5lVar.c;
            String str4 = gxcVar.a;
            wjb wjbVar = cvoVar.a;
            p80 p80Var = b70Var.e;
            String str5 = p80Var != null ? p80Var.a : "";
            int i = p80Var != null ? p80Var.b + 1 : 0;
            boolean z = p80Var != null && p80Var.c;
            String str6 = b70Var.f;
            String str7 = str6 == null ? "" : str6;
            String str8 = b70Var.b;
            String str9 = b70Var.a;
            int i2 = b70Var.c + 1;
            int i3 = b70Var.d;
            String str10 = b70Var.g;
            String str11 = b70Var.h;
            int i4 = b70Var.i;
            c70 c70Var = d70Var.b;
            c70Var.getClass();
            switch (c70Var.ordinal()) {
                case 0:
                    pkbVar = pkb.Album;
                    break;
                case 1:
                    pkbVar = pkb.UpcomingAlbum;
                    break;
                case 2:
                    pkbVar = pkb.Artist;
                    break;
                case 3:
                    pkbVar = pkb.Banner;
                    break;
                case 4:
                    pkbVar = pkb.Playlist;
                    break;
                case 5:
                    pkbVar = pkb.Wave;
                    break;
                case 6:
                case 13:
                    pkbVar = pkb.Shortcut;
                    break;
                case 7:
                    pkbVar = pkb.Track;
                    break;
                case 8:
                    pkbVar = pkb.Feature;
                    break;
                case 9:
                    pkbVar = pkb.Video;
                    break;
                case 10:
                    pkbVar = pkb.Text;
                    break;
                case 11:
                    pkbVar = pkb.Concert;
                    break;
                case 12:
                    pkbVar = pkb.Concert;
                    break;
                case 14:
                    pkbVar = pkb.Donation;
                    break;
                case 15:
                    pkbVar = pkb.Generative;
                    break;
                case 16:
                    pkbVar = pkb.NonApplicable;
                    break;
                case 17:
                    pkbVar = pkb.NonApplicable;
                    break;
                case 18:
                    pkbVar = pkb.NonApplicable;
                    break;
                case 19:
                    pkbVar = pkb.NonApplicable;
                    break;
                default:
                    b6e.s();
                    return;
            }
            nmb.t(this.a, str4, wjbVar, null, null, null, null, null, pkbVar, d70Var.a, d70Var.d + 1, d70Var.e + 1, gxcVar.b, str5, i, z, str8, str9, 0, i2, i3, str7, str10, str11, i4, cvoVar.a(), cvoVar.a(), null, 134484092);
            return;
        }
        if (!(x5lVar instanceof w5l)) {
            if (!(x5lVar instanceof u5l)) {
                b6e.s();
                return;
            }
            String str12 = gxcVar.a;
            u5l u5lVar = (u5l) x5lVar;
            cvo cvoVar2 = u5lVar.a;
            nab nabVar = u5lVar.b;
            wjb wjbVar2 = cvoVar2.a;
            u0s u0sVar = u5lVar.d;
            String str13 = (u0sVar == null || (str = u0sVar.a) == null) ? "" : str;
            int i5 = u0sVar != null ? u0sVar.b + 1 : 0;
            avo avoVar = cvoVar2.e;
            String str14 = avoVar.b;
            pkb pkbVar2 = avoVar.a;
            String a = nabVar.a();
            String c = nabVar.c();
            int b = nabVar.b();
            int d = nabVar.d();
            thj thjVar = u5lVar.c;
            nmb.t(this.a, str12, wjbVar2, null, null, null, pkbVar2, str14, thjVar.a, thjVar.b, thjVar.c, thjVar.d, gxcVar.b, str13, i5, false, c, a, b, d, nabVar.getCount(), null, null, null, 0, cvoVar2.a(), cvoVar2.a(), null, 165711900);
            return;
        }
        w5l w5lVar = (w5l) x5lVar;
        jab jabVar = w5lVar.b;
        if (jabVar == null) {
            jabVar = null;
        }
        if (jabVar == null) {
            dfi.r("Playback start screen action without entityType", "PlaybackAnalytics");
            return;
        }
        String str15 = gxcVar.a;
        cvo cvoVar3 = w5lVar.a;
        wjb wjbVar3 = cvoVar3.a;
        String str16 = cvoVar3.d.a;
        avo avoVar2 = cvoVar3.e;
        pkb pkbVar3 = avoVar2.a;
        String str17 = avoVar2.b;
        qkb qkbVar = jabVar.a;
        int i6 = jabVar.c;
        int i7 = jabVar.b;
        u0s u0sVar2 = w5lVar.d;
        if (u0sVar2 != null && (str2 = u0sVar2.a) != null) {
            str3 = str2;
        }
        int i8 = u0sVar2 != null ? u0sVar2.b + 1 : 0;
        String str18 = gxcVar.b;
        thj thjVar2 = w5lVar.c;
        pkb pkbVar4 = thjVar2.a;
        String str19 = thjVar2.b;
        int i9 = thjVar2.d + 1;
        int i10 = thjVar2.c;
        hlb hlbVar = cvoVar3.b;
        fmb[] fmbVarArr = fmb.a;
        String str20 = str3;
        nmb nmbVar = this.a;
        nmbVar.getClass();
        qkbVar.getClass();
        String str21 = qkbVar.a;
        pkbVar4.getClass();
        str19.getClass();
        str18.getClass();
        str15.getClass();
        wjbVar3.getClass();
        hlbVar.getClass();
        str16.getClass();
        pkbVar3.getClass();
        str17.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("entity_type", str21);
        eta.m(i7, "entity_id", str21, "entity_pos_x", linkedHashMap);
        linkedHashMap.put("entity_pos_y", String.valueOf(i6));
        linkedHashMap.put("object_type", pkbVar4.a);
        eta.m(i10, "object_id", str19, "object_pos_x", linkedHashMap);
        k.u(i9, "object_pos_y", "playback_action_id", str18, linkedHashMap);
        linkedHashMap.put("stream_start_trigger", "user_action");
        linkedHashMap.put("hash", str15);
        linkedHashMap.put("page_id", wjbVar3.a);
        linkedHashMap.put("page_style", hlbVar.a);
        linkedHashMap.put("skeleton_id", str16);
        linkedHashMap.put("main_object_type", pkbVar3.a);
        linkedHashMap.put("main_object_id", str17);
        eta.m(i8, "tab_id", str20, "tab_pos", linkedHashMap);
        linkedHashMap.put("is_tab_selected_by_default", String.valueOf(false));
        linkedHashMap.put("_meta", nmb.u(4));
        nmbVar.C("Screen.Started", linkedHashMap);
    }
}
