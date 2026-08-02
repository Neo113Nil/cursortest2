package defpackage;

import com.appsflyer.internal.k;
import com.connectsdk.service.NetcastTVService;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* loaded from: classes3.dex */
public final class nmb {
    public final qmb a;

    public nmb(qmb qmbVar, ovn ovnVar, ogp ogpVar) {
        this.a = qmbVar;
    }

    public static void D(nmb nmbVar, String str, int i, String str2, String str3, int i2, int i3, int i4, lmb lmbVar, String str4, int i5) {
        wjb wjbVar = wjb.AboutArtistScreen;
        pkb pkbVar = pkb.Audiobook;
        if ((i5 & 128) != 0) {
            i = 1;
        }
        nmbVar.getClass();
        str.getClass();
        str3.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("hash", str);
        linkedHashMap.put("page_id", "widget");
        linkedHashMap.put("skeleton_id", "");
        linkedHashMap.put("main_object_type", "non_applicable");
        linkedHashMap.put("main_object_id", "");
        linkedHashMap.put("entity_type", "widget");
        eta.m(i, "entity_id", "widget", "entity_pos_x", linkedHashMap);
        k.u(1, "entity_pos_y", "object_type", str2, linkedHashMap);
        eta.m(1, "object_id", str3, "object_pos_x", linkedHashMap);
        ouj.y(1, linkedHashMap, "object_pos_y", i2, "size_horizontal");
        ouj.y(i3, linkedHashMap, "size_vertical", i4, "widgets_amt");
        linkedHashMap.put("widget_type", lmbVar.a);
        dfi.p(2, "playback_action_id", str4, "_meta", linkedHashMap);
        nmbVar.C("Widget.Started", linkedHashMap);
    }

    public static void g(nmb nmbVar, kmb kmbVar, String str, wjb wjbVar, ilb ilbVar, glb glbVar, String str2, pkb pkbVar, String str3, pkb pkbVar2, String str4, int i, int i2, String str5, int i3, boolean z, String str6, String str7, int i4, int i5, String str8, String str9, String str10, int i6, String str11, int i7) {
        ilb ilbVar2 = (i7 & 8) != 0 ? ilb.Fullscreen : ilbVar;
        glb glbVar2 = (i7 & 16) != 0 ? glb.Fullscreen : glbVar;
        String str12 = (i7 & 32) != 0 ? "" : str2;
        pkb pkbVar3 = (i7 & 64) != 0 ? pkb.NonApplicable : pkbVar;
        String str13 = (i7 & 128) != 0 ? "" : str3;
        int i8 = (i7 & 1024) != 0 ? 0 : i;
        int i9 = (i7 & 2048) != 0 ? 0 : i2;
        String str14 = (i7 & 4096) != 0 ? "" : str5;
        int i10 = (i7 & RemoteCameraConfig.Notification.ID) != 0 ? 0 : i3;
        boolean z2 = (i7 & 16384) != 0 ? false : z;
        int i11 = (262144 & i7) != 0 ? 1 : i4;
        int i12 = (524288 & i7) != 0 ? 0 : i5;
        String str15 = (i7 & 1048576) != 0 ? "" : str8;
        String str16 = (i7 & 2097152) != 0 ? "" : str9;
        String str17 = (i7 & RemoteCameraConfig.Camera.BITRATE) == 0 ? str10 : "";
        int i13 = (i7 & 8388608) == 0 ? i6 : 0;
        nmbVar.getClass();
        str.getClass();
        wjbVar.getClass();
        ilbVar2.getClass();
        glbVar2.getClass();
        str12.getClass();
        pkbVar3.getClass();
        str13.getClass();
        pkbVar2.getClass();
        str4.getClass();
        str6.getClass();
        str7.getClass();
        str15.getClass();
        str16.getClass();
        str17.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("user_interaction_type", kmbVar.a);
        linkedHashMap.put("hash", str);
        linkedHashMap.put("page_id", wjbVar.a);
        linkedHashMap.put("page_style", ilbVar2.a);
        linkedHashMap.put("page_placement", glbVar2.a);
        linkedHashMap.put("skeleton_id", str12);
        linkedHashMap.put("main_object_type", pkbVar3.a);
        linkedHashMap.put("main_object_id", str13);
        linkedHashMap.put("object_type", pkbVar2.a);
        eta.m(i8, "object_id", str4, "object_pos_x", linkedHashMap);
        k.u(i9, "object_pos_y", "tab_id", str14, linkedHashMap);
        linkedHashMap.put("tab_pos", String.valueOf(i10));
        linkedHashMap.put("is_tab_selected_by_default", String.valueOf(z2));
        linkedHashMap.put("entity_type", str6);
        eta.m(1, "entity_id", str7, "entity_pos_x", linkedHashMap);
        ouj.y(i11, linkedHashMap, "entity_pos_y", i12, "objects_count");
        linkedHashMap.put("display_reason_id", str15);
        linkedHashMap.put("filter_key", str16);
        eta.m(i13, "filter_value", str17, "filter_pos", linkedHashMap);
        dfi.p(2, "action_type", str11, "_meta", linkedHashMap);
        nmbVar.C("LandingBlock.ActionPerformed", linkedHashMap);
    }

    public static /* synthetic */ void i(nmb nmbVar, String str, wjb wjbVar, pkb pkbVar, String str2, pkb pkbVar2, String str3, int i, String str4, String str5, String str6, String str7, String str8, String str9, int i2) {
        kmb kmbVar = kmb.Tap;
        ilb ilbVar = ilb.Sheet;
        glb glbVar = glb.Bottom;
        if ((i2 & 8) != 0) {
            ilbVar = ilb.Fullscreen;
        }
        ilb ilbVar2 = ilbVar;
        if ((i2 & 16) != 0) {
            glbVar = glb.Fullscreen;
        }
        nmbVar.h(kmbVar, str, wjbVar, ilbVar2, glbVar, "", (i2 & 64) != 0 ? pkb.NonApplicable : pkbVar, (i2 & 128) != 0 ? "" : str2, pkbVar2, str3, (i2 & 1024) != 0 ? 0 : 1, (i2 & 2048) != 0 ? 0 : i, (i2 & 4096) != 0 ? "" : "top", (i2 & RemoteCameraConfig.Notification.ID) != 0 ? 0 : 1, (i2 & 16384) == 0, str4, str5, 1, 1, (524288 & i2) != 0 ? 0 : 1, (i2 & 1048576) != 0 ? "" : str6, "", "", 0, str7, str8, "", str9);
    }

    public static void j(nmb nmbVar, String str, wjb wjbVar, ilb ilbVar, glb glbVar, String str2, pkb pkbVar, String str3, pkb pkbVar2, String str4, int i, int i2, String str5, int i3, boolean z, String str6, String str7, int i4, int i5, String str8, String str9, int i6) {
        ilb ilbVar2 = (i6 & 4) != 0 ? ilb.Fullscreen : ilbVar;
        glb glbVar2 = (i6 & 8) != 0 ? glb.Fullscreen : glbVar;
        String str10 = (i6 & 16) != 0 ? "" : str2;
        pkb pkbVar3 = (i6 & 32) != 0 ? pkb.NonApplicable : pkbVar;
        String str11 = (i6 & 64) != 0 ? "" : str3;
        int i7 = (i6 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 ? 0 : i;
        int i8 = (i6 & 1024) != 0 ? 0 : i2;
        String str12 = (i6 & 2048) != 0 ? "" : str5;
        int i9 = (i6 & 4096) != 0 ? 0 : i3;
        boolean z2 = (i6 & RemoteCameraConfig.Notification.ID) != 0 ? false : z;
        int i10 = (131072 & i6) != 0 ? 1 : i4;
        int i11 = (262144 & i6) != 0 ? 0 : i5;
        String str13 = (i6 & 524288) != 0 ? "" : str8;
        nmbVar.getClass();
        str.getClass();
        wjbVar.getClass();
        ilbVar2.getClass();
        glbVar2.getClass();
        str10.getClass();
        pkbVar3.getClass();
        str11.getClass();
        pkbVar2.getClass();
        str4.getClass();
        str6.getClass();
        str7.getClass();
        str13.getClass();
        str9.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("hash", str);
        linkedHashMap.put("page_id", wjbVar.a);
        linkedHashMap.put("page_style", ilbVar2.a);
        linkedHashMap.put("page_placement", glbVar2.a);
        linkedHashMap.put("skeleton_id", str10);
        linkedHashMap.put("main_object_type", pkbVar3.a);
        linkedHashMap.put("main_object_id", str11);
        linkedHashMap.put("object_type", pkbVar2.a);
        eta.m(i7, "object_id", str4, "object_pos_x", linkedHashMap);
        k.u(i8, "object_pos_y", "tab_id", str12, linkedHashMap);
        linkedHashMap.put("tab_pos", String.valueOf(i9));
        linkedHashMap.put("is_tab_selected_by_default", String.valueOf(z2));
        linkedHashMap.put("entity_type", str6);
        eta.m(1, "entity_id", str7, "entity_pos_x", linkedHashMap);
        ouj.y(i10, linkedHashMap, "entity_pos_y", i11, "objects_count");
        linkedHashMap.put("display_reason_id", str13);
        linkedHashMap.put("filter_key", "");
        eta.m(0, "filter_value", "", "filter_pos", linkedHashMap);
        dfi.p(2, "view_uuid", str9, "_meta", linkedHashMap);
        nmbVar.C("LandingBlock.Hidden", linkedHashMap);
    }

    public static void m(nmb nmbVar, String str, wjb wjbVar, ilb ilbVar, glb glbVar, String str2, pkb pkbVar, String str3, String str4, int i, boolean z, String str5, String str6, int i2, int i3, int i4, String str7, String str8, String str9, int i5, int i6) {
        ilb ilbVar2 = (i6 & 4) != 0 ? ilb.Fullscreen : ilbVar;
        glb glbVar2 = (i6 & 8) != 0 ? glb.Fullscreen : glbVar;
        String str10 = (i6 & 16) != 0 ? "" : str2;
        pkb pkbVar2 = (i6 & 32) != 0 ? pkb.NonApplicable : pkbVar;
        String str11 = (i6 & 64) != 0 ? "" : str3;
        String str12 = (i6 & 128) != 0 ? "" : str4;
        int i7 = (i6 & 256) != 0 ? 0 : i;
        boolean z2 = (i6 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 ? false : z;
        int i8 = (i6 & 4096) != 0 ? 1 : i2;
        int i9 = (i6 & RemoteCameraConfig.Notification.ID) == 0 ? i3 : 1;
        String str13 = (32768 & i6) != 0 ? "" : str7;
        String str14 = (65536 & i6) != 0 ? "" : str8;
        String str15 = (131072 & i6) == 0 ? str9 : "";
        int i10 = (i6 & SQLiteDatabase.OPEN_PRIVATECACHE) == 0 ? i5 : 0;
        nmbVar.getClass();
        str.getClass();
        wjbVar.getClass();
        ilbVar2.getClass();
        glbVar2.getClass();
        str10.getClass();
        pkbVar2.getClass();
        str11.getClass();
        str12.getClass();
        str5.getClass();
        str6.getClass();
        str14.getClass();
        str15.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("hash", str);
        linkedHashMap.put("page_id", wjbVar.a);
        linkedHashMap.put("page_style", ilbVar2.a);
        linkedHashMap.put("page_placement", glbVar2.a);
        linkedHashMap.put("skeleton_id", str10);
        linkedHashMap.put("main_object_type", pkbVar2.a);
        linkedHashMap.put("main_object_id", str11);
        eta.m(i7, "tab_id", str12, "tab_pos", linkedHashMap);
        linkedHashMap.put("is_tab_selected_by_default", String.valueOf(z2));
        linkedHashMap.put("entity_type", str5);
        eta.m(i8, "entity_id", str6, "entity_pos_x", linkedHashMap);
        ouj.y(i9, linkedHashMap, "entity_pos_y", i4, "objects_count");
        linkedHashMap.put("display_reason_id", str13);
        linkedHashMap.put("filter_key", str14);
        eta.m(i10, "filter_value", str15, "filter_pos", linkedHashMap);
        linkedHashMap.put("_meta", u(2));
        nmbVar.C("LandingBlock.Loaded", linkedHashMap);
    }

    public static void p(nmb nmbVar, String str, wjb wjbVar, ilb ilbVar, glb glbVar, String str2, pkb pkbVar, String str3, pkb pkbVar2, String str4, int i, int i2, String str5, int i3, boolean z, String str6, String str7, int i4, int i5, String str8, String str9, String str10, int i6, String str11, int i7) {
        ilb ilbVar2 = (i7 & 4) != 0 ? ilb.Fullscreen : ilbVar;
        glb glbVar2 = (i7 & 8) != 0 ? glb.Fullscreen : glbVar;
        String str12 = (i7 & 16) != 0 ? "" : str2;
        pkb pkbVar3 = (i7 & 32) != 0 ? pkb.NonApplicable : pkbVar;
        String str13 = (i7 & 64) != 0 ? "" : str3;
        int i8 = (i7 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 ? 0 : i;
        int i9 = (i7 & 1024) != 0 ? 0 : i2;
        String str14 = (i7 & 2048) != 0 ? "" : str5;
        int i10 = (i7 & 4096) != 0 ? 0 : i3;
        boolean z2 = (i7 & RemoteCameraConfig.Notification.ID) != 0 ? false : z;
        int i11 = (131072 & i7) != 0 ? 1 : i4;
        int i12 = (i7 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? 0 : i5;
        String str15 = (i7 & 524288) != 0 ? "" : str8;
        String str16 = (i7 & 1048576) != 0 ? "" : str9;
        String str17 = (i7 & 2097152) == 0 ? str10 : "";
        int i13 = i10;
        int i14 = (i7 & RemoteCameraConfig.Camera.BITRATE) != 0 ? 0 : i6;
        nmbVar.getClass();
        str.getClass();
        wjbVar.getClass();
        ilbVar2.getClass();
        glbVar2.getClass();
        str12.getClass();
        pkbVar3.getClass();
        str13.getClass();
        pkbVar2.getClass();
        str4.getClass();
        eta.s(str14, str6, str7, str15, str16);
        str17.getClass();
        str11.getClass();
        boolean z3 = z2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("hash", str);
        linkedHashMap.put("page_id", wjbVar.a);
        linkedHashMap.put("page_style", ilbVar2.a);
        linkedHashMap.put("page_placement", glbVar2.a);
        linkedHashMap.put("skeleton_id", str12);
        linkedHashMap.put("main_object_type", pkbVar3.a);
        linkedHashMap.put("main_object_id", str13);
        linkedHashMap.put("object_type", pkbVar2.a);
        eta.m(i8, "object_id", str4, "object_pos_x", linkedHashMap);
        k.u(i9, "object_pos_y", "tab_id", str14, linkedHashMap);
        linkedHashMap.put("tab_pos", String.valueOf(i13));
        linkedHashMap.put("is_tab_selected_by_default", String.valueOf(z3));
        linkedHashMap.put("entity_type", str6);
        eta.m(1, "entity_id", str7, "entity_pos_x", linkedHashMap);
        ouj.y(i11, linkedHashMap, "entity_pos_y", i12, "objects_count");
        linkedHashMap.put("display_reason_id", str15);
        linkedHashMap.put("filter_key", str16);
        eta.m(i14, "filter_value", str17, "filter_pos", linkedHashMap);
        dfi.p(2, "view_uuid", str11, "_meta", linkedHashMap);
        nmbVar.C("LandingBlock.Showed", linkedHashMap);
    }

    public static void s(nmb nmbVar, String str, wjb wjbVar, String str2, pkb pkbVar, String str3, pkb pkbVar2, String str4, int i, int i2, String str5, int i3, boolean z, String str6, String str7, int i4, int i5, String str8, String str9, String str10, int i6, String str11, int i7) {
        ilb ilbVar = ilb.Fullscreen;
        glb glbVar = glb.Fullscreen;
        String str12 = (i7 & 16) != 0 ? "" : str2;
        pkb pkbVar3 = (i7 & 32) != 0 ? pkb.NonApplicable : pkbVar;
        String str13 = (i7 & 64) != 0 ? "" : str3;
        String str14 = (i7 & 2048) != 0 ? "" : str5;
        int i8 = (i7 & 4096) != 0 ? 0 : i3;
        boolean z2 = (i7 & RemoteCameraConfig.Notification.ID) != 0 ? false : z;
        int i9 = (262144 & i7) != 0 ? 0 : i5;
        String str15 = (524288 & i7) != 0 ? "" : str8;
        String str16 = (1048576 & i7) != 0 ? "" : str9;
        String str17 = (2097152 & i7) == 0 ? str10 : "";
        int i10 = (i7 & RemoteCameraConfig.Camera.BITRATE) == 0 ? i6 : 0;
        fmb[] fmbVarArr = fmb.a;
        nmbVar.getClass();
        str.getClass();
        wjbVar.getClass();
        str12.getClass();
        pkbVar3.getClass();
        eta.s(str13, str4, str14, str6, str7);
        str16.getClass();
        str17.getClass();
        str11.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("hash", str);
        linkedHashMap.put("page_id", wjbVar.a);
        linkedHashMap.put("page_style", "fullscreen");
        linkedHashMap.put("page_placement", "fullscreen");
        linkedHashMap.put("skeleton_id", str12);
        linkedHashMap.put("main_object_type", pkbVar3.a);
        linkedHashMap.put("main_object_id", str13);
        linkedHashMap.put("object_type", pkbVar2.a);
        eta.m(i, "object_id", str4, "object_pos_x", linkedHashMap);
        k.u(i2, "object_pos_y", "tab_id", str14, linkedHashMap);
        linkedHashMap.put("tab_pos", String.valueOf(i8));
        linkedHashMap.put("is_tab_selected_by_default", String.valueOf(z2));
        linkedHashMap.put("entity_type", str6);
        eta.m(1, "entity_id", str7, "entity_pos_x", linkedHashMap);
        ouj.y(i4, linkedHashMap, "entity_pos_y", i9, "objects_count");
        linkedHashMap.put("display_reason_id", str15);
        linkedHashMap.put("filter_key", str16);
        eta.m(i10, "filter_value", str17, "filter_pos", linkedHashMap);
        linkedHashMap.put("playback_action_id", str11);
        dfi.p(4, "stream_start_trigger", "user_action", "_meta", linkedHashMap);
        nmbVar.C("LandingBlock.Started", linkedHashMap);
    }

    public static void t(nmb nmbVar, String str, wjb wjbVar, ilb ilbVar, glb glbVar, String str2, pkb pkbVar, String str3, pkb pkbVar2, String str4, int i, int i2, String str5, String str6, int i3, boolean z, String str7, String str8, int i4, int i5, int i6, String str9, String str10, String str11, int i7, String str12, String str13, String str14, int i8) {
        ilb ilbVar2 = (i8 & 4) != 0 ? ilb.Fullscreen : ilbVar;
        glb glbVar2 = (i8 & 8) != 0 ? glb.Fullscreen : glbVar;
        String str15 = (i8 & 16) != 0 ? "" : str2;
        pkb pkbVar3 = (i8 & 32) != 0 ? pkb.NonApplicable : pkbVar;
        String str16 = (i8 & 64) != 0 ? "" : str3;
        fmb[] fmbVarArr = fmb.a;
        boolean z2 = (i8 & SQLiteDatabase.OPEN_NOMUTEX) != 0 ? false : z;
        int i9 = (i8 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? 1 : i4;
        int i10 = (i8 & 524288) == 0 ? i5 : 1;
        String str17 = (i8 & 2097152) != 0 ? "" : str9;
        String str18 = (i8 & RemoteCameraConfig.Camera.BITRATE) != 0 ? "" : str10;
        String str19 = (i8 & 8388608) != 0 ? "" : str11;
        int i11 = (i8 & 16777216) == 0 ? i7 : 0;
        String str20 = (i8 & 134217728) == 0 ? str14 : "";
        nmbVar.getClass();
        str.getClass();
        wjbVar.getClass();
        ilbVar2.getClass();
        glbVar2.getClass();
        str15.getClass();
        pkbVar3.getClass();
        str16.getClass();
        pkbVar2.getClass();
        str4.getClass();
        eta.s(str5, str7, str8, str18, str19);
        str12.getClass();
        str13.getClass();
        str20.getClass();
        boolean z3 = z2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("hash", str);
        linkedHashMap.put("page_id", wjbVar.a);
        linkedHashMap.put("page_style", ilbVar2.a);
        linkedHashMap.put("page_placement", glbVar2.a);
        linkedHashMap.put("skeleton_id", str15);
        linkedHashMap.put("main_object_type", pkbVar3.a);
        linkedHashMap.put("main_object_id", str16);
        linkedHashMap.put("object_type", pkbVar2.a);
        eta.m(i, "object_id", str4, "object_pos_x", linkedHashMap);
        k.u(i2, "object_pos_y", "playback_action_id", str5, linkedHashMap);
        linkedHashMap.put("stream_start_trigger", "user_action");
        eta.m(i3, "tab_id", str6, "tab_pos", linkedHashMap);
        linkedHashMap.put("is_tab_selected_by_default", String.valueOf(z3));
        linkedHashMap.put("entity_type", str7);
        eta.m(i9, "entity_id", str8, "entity_pos_x", linkedHashMap);
        ouj.y(i10, linkedHashMap, "entity_pos_y", i6, "objects_count");
        linkedHashMap.put("display_reason_id", str17);
        linkedHashMap.put("filter_key", str18);
        eta.m(i11, "filter_value", str19, "filter_pos", linkedHashMap);
        linkedHashMap.put("view_uuid", str12);
        linkedHashMap.put("screen_view_uuid", str13);
        dfi.p(5, "loaded_view_uuid", str20, "_meta", linkedHashMap);
        nmbVar.C("LandingBlock.Started", linkedHashMap);
    }

    public static HashMap u(int i) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("version", Integer.valueOf(i));
        hashMap.put(NetcastTVService.UDAP_API_EVENT, hashMap2);
        return hashMap;
    }

    public static void v(nmb nmbVar, sjb sjbVar, String str, wjb wjbVar, String str2, pkb pkbVar, String str3, int i) {
        kmb kmbVar = kmb.Tap;
        if ((i & 16) != 0) {
            str2 = "";
        }
        if ((i & 32) != 0) {
            pkbVar = pkb.NonApplicable;
        }
        if ((i & 64) != 0) {
            str3 = "";
        }
        nmbVar.getClass();
        str.getClass();
        wjbVar.getClass();
        str2.getClass();
        pkbVar.getClass();
        str3.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("action_type", sjbVar.a);
        linkedHashMap.put("user_interaction_type", "tap");
        linkedHashMap.put("hash", str);
        linkedHashMap.put("page_id", wjbVar.a);
        linkedHashMap.put("skeleton_id", str2);
        linkedHashMap.put("main_object_type", pkbVar.a);
        linkedHashMap.put("main_object_id", str3);
        eta.m(0, "tab_id", "", "tab_pos", linkedHashMap);
        linkedHashMap.put("is_tab_selected_by_default", String.valueOf(false));
        linkedHashMap.put("_meta", u(1));
        nmbVar.C("Screen.ActionPerformed", linkedHashMap);
    }

    public static void w(nmb nmbVar, sjb sjbVar, kmb kmbVar, String str, wjb wjbVar, ilb ilbVar, glb glbVar, String str2, pkb pkbVar, String str3, int i) {
        if ((i & 64) != 0) {
            str2 = "";
        }
        nmbVar.getClass();
        sjbVar.getClass();
        str.getClass();
        wjbVar.getClass();
        ilbVar.getClass();
        glbVar.getClass();
        str2.getClass();
        pkbVar.getClass();
        str3.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("action_type", sjbVar.a);
        linkedHashMap.put("user_interaction_type", kmbVar.a);
        linkedHashMap.put("hash", str);
        linkedHashMap.put("page_id", wjbVar.a);
        linkedHashMap.put("page_style", ilbVar.a);
        linkedHashMap.put("page_placement", glbVar.a);
        linkedHashMap.put("skeleton_id", str2);
        linkedHashMap.put("main_object_type", pkbVar.a);
        linkedHashMap.put("main_object_id", str3);
        eta.m(0, "tab_id", "", "tab_pos", linkedHashMap);
        linkedHashMap.put("is_tab_selected_by_default", String.valueOf(false));
        linkedHashMap.put("_meta", u(3));
        nmbVar.C("Screen.ActionPerformed", linkedHashMap);
    }

    public static void x(nmb nmbVar, String str, wjb wjbVar, pkb pkbVar, String str2, wjb wjbVar2, wjb wjbVar3, int i) {
        if ((i & 8) != 0) {
            pkbVar = pkb.NonApplicable;
        }
        if ((i & 16) != 0) {
            str2 = "";
        }
        nmbVar.getClass();
        str.getClass();
        pkbVar.getClass();
        str2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("hash", str);
        linkedHashMap.put("page_id", wjbVar.a);
        linkedHashMap.put("skeleton_id", "");
        linkedHashMap.put("main_object_type", pkbVar.a);
        linkedHashMap.put("main_object_id", str2);
        eta.m(0, "tab_id", "", "tab_pos", linkedHashMap);
        linkedHashMap.put("is_tab_selected_by_default", String.valueOf(false));
        linkedHashMap.put("from", wjbVar2.a);
        dfi.p(1, "to", wjbVar3.a, "_meta", linkedHashMap);
        nmbVar.C("Screen.Navigated", linkedHashMap);
    }

    public static void y(nmb nmbVar, qkb qkbVar, qkb qkbVar2, String str, wjb wjbVar, ilb ilbVar, glb glbVar, String str2, pkb pkbVar, String str3, wjb wjbVar2, wjb wjbVar3, String str4, int i) {
        if ((i & 16) != 0) {
            ilbVar = ilb.Fullscreen;
        }
        if ((i & 32) != 0) {
            glbVar = glb.Fullscreen;
        }
        if ((i & 64) != 0) {
            str2 = "";
        }
        if ((i & 128) != 0) {
            pkbVar = pkb.NonApplicable;
        }
        if ((i & 256) != 0) {
            str3 = "";
        }
        if ((i & 16384) != 0) {
            str4 = "";
        }
        nmbVar.getClass();
        str.getClass();
        wjbVar.getClass();
        ilbVar.getClass();
        glbVar.getClass();
        str2.getClass();
        pkbVar.getClass();
        str3.getClass();
        wjbVar2.getClass();
        wjbVar3.getClass();
        str4.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("entity_type", qkbVar.a);
        linkedHashMap.put("entity_id", qkbVar2.a);
        linkedHashMap.put("hash", str);
        linkedHashMap.put("page_id", wjbVar.a);
        linkedHashMap.put("page_style", ilbVar.a);
        linkedHashMap.put("page_placement", glbVar.a);
        linkedHashMap.put("skeleton_id", str2);
        linkedHashMap.put("main_object_type", pkbVar.a);
        linkedHashMap.put("main_object_id", str3);
        eta.m(0, "tab_id", "", "tab_pos", linkedHashMap);
        linkedHashMap.put("is_tab_selected_by_default", String.valueOf(false));
        linkedHashMap.put("from", wjbVar2.a);
        linkedHashMap.put("to", wjbVar3.a);
        dfi.p(4, "deep_link", str4, "_meta", linkedHashMap);
        nmbVar.C("Screen.Navigated", linkedHashMap);
    }

    public static void z(nmb nmbVar, String str, wjb wjbVar, String str2, pkb pkbVar, String str3, String str4, int i, boolean z, String str5, String str6, int i2, String str7, String str8, int i3, String str9, int i4) {
        if ((i4 & 4) != 0) {
            str2 = "";
        }
        pkb pkbVar2 = (i4 & 8) != 0 ? pkb.NonApplicable : pkbVar;
        String str10 = (i4 & 16) != 0 ? "" : str3;
        String str11 = (i4 & 32) == 0 ? str4 : "";
        int i5 = (i4 & 64) != 0 ? 0 : i;
        boolean z2 = (i4 & 128) == 0 ? z : false;
        int i6 = (i4 & 2048) != 0 ? 1 : i2;
        int i7 = (i4 & SQLiteDatabase.OPEN_NOMUTEX) != 0 ? 1 : i3;
        nmbVar.getClass();
        str.getClass();
        wjbVar.getClass();
        str2.getClass();
        pkbVar2.getClass();
        str10.getClass();
        str5.getClass();
        str6.getClass();
        str8.getClass();
        str9.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("hash", str);
        linkedHashMap.put("page_id", wjbVar.a);
        linkedHashMap.put("skeleton_id", str2);
        linkedHashMap.put("main_object_type", pkbVar2.a);
        linkedHashMap.put("main_object_id", str10);
        eta.m(i5, "tab_id", str11, "tab_pos", linkedHashMap);
        linkedHashMap.put("is_tab_selected_by_default", String.valueOf(z2));
        linkedHashMap.put("entity_type", str5);
        eta.m(1, "entity_id", str6, "entity_pos_x", linkedHashMap);
        k.u(i6, "entity_pos_y", "object_type", str7, linkedHashMap);
        eta.m(1, "object_id", str8, "object_pos_x", linkedHashMap);
        k.u(i7, "object_pos_y", "playback_action_id", str9, linkedHashMap);
        linkedHashMap.put("_meta", u(3));
        nmbVar.C("Screen.Started", linkedHashMap);
    }

    public final void A(amb ambVar, int i, String str, String str2, long j, mkb mkbVar, String str3, int i2, cmb cmbVar, String str4, bmb bmbVar) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        eta.m(i, "filter_type", ambVar.a, "filter_pos", linkedHashMap);
        linkedHashMap.put("req_id", str);
        linkedHashMap.put("search_session_id", str2);
        linkedHashMap.put("event_timestamp", String.valueOf(j));
        linkedHashMap.put("page_id", mkbVar.a);
        eta.m(i2, "hash", str3, "object_pos", linkedHashMap);
        linkedHashMap.put("object_type", cmbVar.a);
        linkedHashMap.put("object_id", str4);
        linkedHashMap.put("to", bmbVar.a);
        linkedHashMap.put("page_type", "landing");
        dfi.p(2, "from", "search_screen", "_meta", linkedHashMap);
        C("Search.SearchResultItem.Navigated", linkedHashMap);
    }

    public final void B(String str, wjb wjbVar, String str2, pkb pkbVar, String str3, String str4, int i, boolean z) {
        str.getClass();
        wjbVar.getClass();
        str2.getClass();
        pkbVar.getClass();
        str3.getClass();
        str4.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("hash", str);
        linkedHashMap.put("page_id", wjbVar.a);
        linkedHashMap.put("skeleton_id", str2);
        linkedHashMap.put("main_object_type", pkbVar.a);
        linkedHashMap.put("main_object_id", str3);
        eta.m(i, "tab_id", str4, "tab_pos", linkedHashMap);
        linkedHashMap.put("is_tab_selected_by_default", String.valueOf(z));
        linkedHashMap.put("_meta", u(1));
        C("Tab.Opened", linkedHashMap);
    }

    public final void C(String str, LinkedHashMap linkedHashMap) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(linkedHashMap);
        hashMap.putAll(tah.b(new Pair("log_session_id", "")));
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        hashMap.putAll(e5bVar);
        this.a.a(str, hashMap);
    }

    public final void a(String str, wjb wjbVar, xjb xjbVar, String str2, String str3) {
        str.getClass();
        wjbVar.getClass();
        xjbVar.getClass();
        str2.getClass();
        str3.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("hash", str);
        linkedHashMap.put("page_id", wjbVar.a);
        linkedHashMap.put("property_key", xjbVar.a);
        linkedHashMap.put("property_value_new", str2);
        dfi.p(2, "property_value_old", str3, "_meta", linkedHashMap);
        C("AppSettings.Changed", linkedHashMap);
    }

    public final void b(String str, String str2, ckb ckbVar, String str3, String str4, dkb dkbVar) {
        str2.getClass();
        ckbVar.getClass();
        str3.getClass();
        str4.getClass();
        dkbVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_type", "other");
        linkedHashMap.put("page_id", str);
        linkedHashMap.put("hash", str2);
        linkedHashMap.put("object_type", ckbVar.a);
        linkedHashMap.put("object_id", str3);
        linkedHashMap.put("object_name", str4);
        dfi.p(1, "opening_method", dkbVar.a, "_meta", linkedHashMap);
        C("BottomSheet.Showed", linkedHashMap);
    }

    public final void c(String str, String str2, ckb ckbVar, String str3, String str4, dkb dkbVar, bkb bkbVar) {
        str2.getClass();
        ckbVar.getClass();
        str3.getClass();
        str4.getClass();
        dkbVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_type", "other");
        linkedHashMap.put("page_id", str);
        linkedHashMap.put("hash", str2);
        linkedHashMap.put("object_type", ckbVar.a);
        linkedHashMap.put("object_id", str3);
        linkedHashMap.put("object_name", str4);
        linkedHashMap.put("opening_method", dkbVar.a);
        dfi.p(1, "button_type", bkbVar.a, "_meta", linkedHashMap);
        C("BottomSheet.Tapped", linkedHashMap);
    }

    public final void d(kkb kkbVar, String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("communication_type", kkbVar.a);
        dfi.p(1, "communication_id", str, "_meta", linkedHashMap);
        C("Communications.Closed", linkedHashMap);
    }

    public final void e(kkb kkbVar, String str) {
        lkb[] lkbVarArr = lkb.a;
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("communication_type", kkbVar.a);
        linkedHashMap.put("communication_id", str);
        linkedHashMap.put("from", "communication_screen");
        dfi.p(1, "to", "link", "_meta", linkedHashMap);
        C("Communications.Navigated", linkedHashMap);
    }

    public final void f(kkb kkbVar, String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("communication_type", kkbVar.a);
        dfi.p(1, "communication_id", str, "_meta", linkedHashMap);
        C("Communications.Showed", linkedHashMap);
    }

    public final void h(kmb kmbVar, String str, wjb wjbVar, ilb ilbVar, glb glbVar, String str2, pkb pkbVar, String str3, pkb pkbVar2, String str4, int i, int i2, String str5, int i3, boolean z, String str6, String str7, int i4, int i5, int i6, String str8, String str9, String str10, int i7, String str11, String str12, String str13, String str14) {
        str.getClass();
        wjbVar.getClass();
        ilbVar.getClass();
        glbVar.getClass();
        str2.getClass();
        pkbVar.getClass();
        str3.getClass();
        pkbVar2.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        str12.getClass();
        str13.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("user_interaction_type", kmbVar.a);
        linkedHashMap.put("hash", str);
        linkedHashMap.put("page_id", wjbVar.a);
        linkedHashMap.put("page_style", ilbVar.a);
        linkedHashMap.put("page_placement", glbVar.a);
        linkedHashMap.put("skeleton_id", str2);
        linkedHashMap.put("main_object_type", pkbVar.a);
        linkedHashMap.put("main_object_id", str3);
        linkedHashMap.put("object_type", pkbVar2.a);
        eta.m(i, "object_id", str4, "object_pos_x", linkedHashMap);
        k.u(i2, "object_pos_y", "tab_id", str5, linkedHashMap);
        linkedHashMap.put("tab_pos", String.valueOf(i3));
        linkedHashMap.put("is_tab_selected_by_default", String.valueOf(z));
        linkedHashMap.put("entity_type", str6);
        eta.m(i4, "entity_id", str7, "entity_pos_x", linkedHashMap);
        ouj.y(i5, linkedHashMap, "entity_pos_y", i6, "objects_count");
        linkedHashMap.put("display_reason_id", str8);
        linkedHashMap.put("filter_key", str9);
        eta.m(i7, "filter_value", str10, "filter_pos", linkedHashMap);
        linkedHashMap.put("view_uuid", str11);
        linkedHashMap.put("screen_view_uuid", str12);
        linkedHashMap.put("loaded_view_uuid", str13);
        dfi.p(3, "action_type", str14, "_meta", linkedHashMap);
        C("LandingBlock.ActionPerformed", linkedHashMap);
    }

    public final void k(String str, wjb wjbVar, ilb ilbVar, glb glbVar, String str2, pkb pkbVar, String str3, pkb pkbVar2, String str4, int i, int i2, String str5, int i3, boolean z, String str6, String str7, int i4, int i5, int i6, String str8, String str9, String str10, int i7, String str11, String str12, String str13) {
        str.getClass();
        wjbVar.getClass();
        ilbVar.getClass();
        glbVar.getClass();
        str2.getClass();
        pkbVar.getClass();
        str3.getClass();
        pkbVar2.getClass();
        str4.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        str11.getClass();
        str12.getClass();
        str13.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("hash", str);
        linkedHashMap.put("page_id", wjbVar.a);
        linkedHashMap.put("page_style", ilbVar.a);
        linkedHashMap.put("page_placement", glbVar.a);
        linkedHashMap.put("skeleton_id", str2);
        linkedHashMap.put("main_object_type", pkbVar.a);
        linkedHashMap.put("main_object_id", str3);
        linkedHashMap.put("object_type", pkbVar2.a);
        eta.m(i, "object_id", str4, "object_pos_x", linkedHashMap);
        k.u(i2, "object_pos_y", "tab_id", str5, linkedHashMap);
        linkedHashMap.put("tab_pos", String.valueOf(i3));
        linkedHashMap.put("is_tab_selected_by_default", String.valueOf(z));
        linkedHashMap.put("entity_type", str6);
        eta.m(i4, "entity_id", str7, "entity_pos_x", linkedHashMap);
        ouj.y(i5, linkedHashMap, "entity_pos_y", i6, "objects_count");
        linkedHashMap.put("display_reason_id", str8);
        linkedHashMap.put("filter_key", str9);
        eta.m(i7, "filter_value", str10, "filter_pos", linkedHashMap);
        linkedHashMap.put("view_uuid", str11);
        linkedHashMap.put("screen_view_uuid", str12);
        dfi.p(3, "loaded_view_uuid", str13, "_meta", linkedHashMap);
        C("LandingBlock.Hidden", linkedHashMap);
    }

    public final void n(wjb wjbVar, wjb wjbVar2, String str, wjb wjbVar3, ilb ilbVar, glb glbVar, String str2, pkb pkbVar, String str3, pkb pkbVar2, String str4, int i, int i2, String str5, int i3, boolean z, String str6, String str7, int i4, int i5, int i6, String str8, String str9, String str10, int i7, String str11, String str12, String str13, String str14) {
        wjbVar.getClass();
        wjbVar2.getClass();
        str.getClass();
        wjbVar3.getClass();
        ilbVar.getClass();
        glbVar.getClass();
        str2.getClass();
        pkbVar.getClass();
        str3.getClass();
        pkbVar2.getClass();
        eta.s(str4, str5, str6, str7, str8);
        eta.s(str9, str10, str11, str12, str13);
        str14.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("from", wjbVar.a);
        linkedHashMap.put("to", wjbVar2.a);
        linkedHashMap.put("hash", str);
        linkedHashMap.put("page_id", wjbVar3.a);
        linkedHashMap.put("page_style", ilbVar.a);
        linkedHashMap.put("page_placement", glbVar.a);
        linkedHashMap.put("skeleton_id", str2);
        linkedHashMap.put("main_object_type", pkbVar.a);
        linkedHashMap.put("main_object_id", str3);
        linkedHashMap.put("object_type", pkbVar2.a);
        eta.m(i, "object_id", str4, "object_pos_x", linkedHashMap);
        k.u(i2, "object_pos_y", "tab_id", str5, linkedHashMap);
        linkedHashMap.put("tab_pos", String.valueOf(i3));
        linkedHashMap.put("is_tab_selected_by_default", String.valueOf(z));
        linkedHashMap.put("entity_type", str6);
        eta.m(i4, "entity_id", str7, "entity_pos_x", linkedHashMap);
        ouj.y(i5, linkedHashMap, "entity_pos_y", i6, "objects_count");
        linkedHashMap.put("display_reason_id", str8);
        linkedHashMap.put("filter_key", str9);
        eta.m(i7, "filter_value", str10, "filter_pos", linkedHashMap);
        linkedHashMap.put("view_uuid", str11);
        linkedHashMap.put("screen_view_uuid", str12);
        linkedHashMap.put("loaded_view_uuid", str13);
        dfi.p(3, "deep_link", str14, "_meta", linkedHashMap);
        C("LandingBlock.Navigated", linkedHashMap);
    }

    public final void q(String str, wjb wjbVar, ilb ilbVar, glb glbVar, String str2, pkb pkbVar, String str3, pkb pkbVar2, String str4, int i, int i2, String str5, int i3, boolean z, String str6, String str7, int i4, int i5, int i6, String str8, String str9, String str10, int i7, String str11, String str12, String str13) {
        str.getClass();
        wjbVar.getClass();
        ilbVar.getClass();
        glbVar.getClass();
        str2.getClass();
        pkbVar.getClass();
        str3.getClass();
        pkbVar2.getClass();
        str4.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        str11.getClass();
        str12.getClass();
        str13.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("hash", str);
        linkedHashMap.put("page_id", wjbVar.a);
        linkedHashMap.put("page_style", ilbVar.a);
        linkedHashMap.put("page_placement", glbVar.a);
        linkedHashMap.put("skeleton_id", str2);
        linkedHashMap.put("main_object_type", pkbVar.a);
        linkedHashMap.put("main_object_id", str3);
        linkedHashMap.put("object_type", pkbVar2.a);
        eta.m(i, "object_id", str4, "object_pos_x", linkedHashMap);
        k.u(i2, "object_pos_y", "tab_id", str5, linkedHashMap);
        linkedHashMap.put("tab_pos", String.valueOf(i3));
        linkedHashMap.put("is_tab_selected_by_default", String.valueOf(z));
        linkedHashMap.put("entity_type", str6);
        eta.m(i4, "entity_id", str7, "entity_pos_x", linkedHashMap);
        ouj.y(i5, linkedHashMap, "entity_pos_y", i6, "objects_count");
        linkedHashMap.put("display_reason_id", str8);
        linkedHashMap.put("filter_key", str9);
        eta.m(i7, "filter_value", str10, "filter_pos", linkedHashMap);
        linkedHashMap.put("view_uuid", str11);
        linkedHashMap.put("screen_view_uuid", str12);
        dfi.p(3, "loaded_view_uuid", str13, "_meta", linkedHashMap);
        C("LandingBlock.Showed", linkedHashMap);
    }
}
