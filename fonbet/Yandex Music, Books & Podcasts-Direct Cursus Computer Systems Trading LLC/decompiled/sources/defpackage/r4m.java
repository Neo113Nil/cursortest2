package defpackage;

import com.connectsdk.device.DefaultConnectableDeviceStore;
import com.connectsdk.service.DeviceService;
import com.yandex.auth.LegacyAccountType;

/* loaded from: classes3.dex */
public final class r4m {
    public final ueo a;
    public final xq b = new xq(21);

    public r4m(ueo ueoVar) {
        this.a = ueoVar;
    }

    public static ytl a(cko ckoVar) {
        boolean z;
        int o = s7g.o(ckoVar, "_id");
        int o2 = s7g.o(ckoVar, "uuid");
        int o3 = s7g.o(ckoVar, "original_id");
        int o4 = s7g.o(ckoVar, "uid");
        int o5 = s7g.o(ckoVar, LegacyAccountType.STRING_LOGIN);
        int o6 = s7g.o(ckoVar, "user_full_name");
        int o7 = s7g.o(ckoVar, "name");
        int o8 = s7g.o(ckoVar, "name_surrogate");
        int o9 = s7g.o(ckoVar, DeviceService.KEY_DESC);
        int o10 = s7g.o(ckoVar, "revision");
        int o11 = s7g.o(ckoVar, "snapshot");
        int o12 = s7g.o(ckoVar, DefaultConnectableDeviceStore.KEY_CREATED);
        int o13 = s7g.o(ckoVar, "visibility");
        int o14 = s7g.o(ckoVar, "sync");
        int o15 = s7g.o(ckoVar, "cover_info");
        int o16 = s7g.o(ckoVar, "position");
        int o17 = s7g.o(ckoVar, "tracks");
        int o18 = s7g.o(ckoVar, "liked");
        int o19 = s7g.o(ckoVar, "liked_timestamp");
        int o20 = s7g.o(ckoVar, "likes_count");
        int o21 = s7g.o(ckoVar, "auto_generated_type");
        int o22 = s7g.o(ckoVar, "modified");
        int o23 = s7g.o(ckoVar, "made_for_genitive");
        int o24 = s7g.o(ckoVar, "target_uid");
        int o25 = s7g.o(ckoVar, "target_login");
        int o26 = s7g.o(ckoVar, "playlist_for_kids");
        int o27 = s7g.o(ckoVar, "bg_image_url");
        int o28 = s7g.o(ckoVar, "bg_video_url");
        long j = o == -1 ? 0L : ckoVar.getLong(o);
        String str = null;
        String x0 = (o2 == -1 || ckoVar.isNull(o2)) ? null : ckoVar.x0(o2);
        if (o3 == -1) {
            xq0.q("Missing column 'original_id' for a NON-NULL value, column not found in result.");
            return null;
        }
        String x02 = ckoVar.x0(o3);
        if (o4 == -1) {
            xq0.q("Missing column 'uid' for a NON-NULL value, column not found in result.");
            return null;
        }
        String x03 = ckoVar.x0(o4);
        if (o5 == -1) {
            xq0.q("Missing column 'login' for a NON-NULL value, column not found in result.");
            return null;
        }
        String x04 = ckoVar.x0(o5);
        String x05 = (o6 == -1 || ckoVar.isNull(o6)) ? null : ckoVar.x0(o6);
        if (o7 == -1) {
            xq0.q("Missing column 'name' for a NON-NULL value, column not found in result.");
            return null;
        }
        String x06 = ckoVar.x0(o7);
        if (o8 == -1) {
            xq0.q("Missing column 'name_surrogate' for a NON-NULL value, column not found in result.");
            return null;
        }
        String x07 = ckoVar.x0(o8);
        String x08 = (o9 == -1 || ckoVar.isNull(o9)) ? null : ckoVar.x0(o9);
        Integer valueOf = (o10 == -1 || ckoVar.isNull(o10)) ? null : Integer.valueOf((int) ckoVar.getLong(o10));
        Integer valueOf2 = (o11 == -1 || ckoVar.isNull(o11)) ? null : Integer.valueOf((int) ckoVar.getLong(o11));
        if (o12 == -1) {
            xq0.q("Missing column 'created' for a NON-NULL value, column not found in result.");
            return null;
        }
        String x09 = ckoVar.x0(o12);
        if (o13 == -1) {
            xq0.q("Missing column 'visibility' for a NON-NULL value, column not found in result.");
            return null;
        }
        String x010 = ckoVar.x0(o13);
        boolean z2 = false;
        int i = o14 == -1 ? 0 : (int) ckoVar.getLong(o14);
        String x011 = (o15 == -1 || ckoVar.isNull(o15)) ? null : ckoVar.x0(o15);
        Long valueOf3 = (o16 == -1 || ckoVar.isNull(o16)) ? null : Long.valueOf(ckoVar.getLong(o16));
        Integer valueOf4 = (o17 == -1 || ckoVar.isNull(o17)) ? null : Integer.valueOf((int) ckoVar.getLong(o17));
        if (o18 == -1) {
            z = false;
        } else {
            z = ((int) ckoVar.getLong(o18)) != 0;
        }
        String x012 = (o19 == -1 || ckoVar.isNull(o19)) ? null : ckoVar.x0(o19);
        Integer valueOf5 = (o20 == -1 || ckoVar.isNull(o20)) ? null : Integer.valueOf((int) ckoVar.getLong(o20));
        String x013 = (o21 == -1 || ckoVar.isNull(o21)) ? null : ckoVar.x0(o21);
        String x014 = (o22 == -1 || ckoVar.isNull(o22)) ? null : ckoVar.x0(o22);
        String x015 = (o23 == -1 || ckoVar.isNull(o23)) ? null : ckoVar.x0(o23);
        String x016 = (o24 == -1 || ckoVar.isNull(o24)) ? null : ckoVar.x0(o24);
        String x017 = (o25 == -1 || ckoVar.isNull(o25)) ? null : ckoVar.x0(o25);
        if (o26 != -1 && ((int) ckoVar.getLong(o26)) != 0) {
            z2 = true;
        }
        boolean z3 = z2;
        String x018 = (o27 == -1 || ckoVar.isNull(o27)) ? null : ckoVar.x0(o27);
        if (o28 != -1 && !ckoVar.isNull(o28)) {
            str = ckoVar.x0(o28);
        }
        return new ytl(i, j, valueOf, valueOf2, valueOf4, valueOf5, valueOf3, x0, x02, x03, x04, x05, x06, x07, x08, x09, x010, x011, x012, x013, x014, x015, x016, x017, x018, str, z, z3);
    }

    public final Object b(String str, String str2, cg6 cg6Var) {
        return up6.G(this.a, true, false, new cb(str, str2, 6), cg6Var);
    }
}
