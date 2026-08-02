package defpackage;

import java.util.List;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class v3t {
    public final ueo a;
    public final xq b = new xq(28);

    public v3t(ueo ueoVar) {
        this.a = ueoVar;
    }

    public static sus a(cko ckoVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int o = s7g.o(ckoVar, "original_id");
        int o2 = s7g.o(ckoVar, "real_id");
        int o3 = s7g.o(ckoVar, "name");
        int o4 = s7g.o(ckoVar, "name_surrogate");
        int o5 = s7g.o(ckoVar, "version");
        int o6 = s7g.o(ckoVar, "duration");
        int o7 = s7g.o(ckoVar, "warning_content");
        int o8 = s7g.o(ckoVar, "explicit");
        int o9 = s7g.o(ckoVar, "available");
        int o10 = s7g.o(ckoVar, "for_premium");
        int o11 = s7g.o(ckoVar, "for_options");
        int o12 = s7g.o(ckoVar, "lyrics_available");
        int o13 = s7g.o(ckoVar, "txt_lyrics_available");
        int o14 = s7g.o(ckoVar, "sync_lyrics_available");
        int o15 = s7g.o(ckoVar, "track_type");
        int o16 = s7g.o(ckoVar, "track_source");
        int o17 = s7g.o(ckoVar, "track_user");
        int o18 = s7g.o(ckoVar, "ugc_artist_name");
        int o19 = s7g.o(ckoVar, "track_save_progress");
        int o20 = s7g.o(ckoVar, "cover_video_id");
        int o21 = s7g.o(ckoVar, "cover_url");
        int o22 = s7g.o(ckoVar, "color_palette");
        int o23 = s7g.o(ckoVar, "short_description");
        int o24 = s7g.o(ckoVar, "release_date");
        int o25 = s7g.o(ckoVar, "integrated_loudness_db");
        int o26 = s7g.o(ckoVar, "true_peak_db");
        int o27 = s7g.o(ckoVar, "track_for_kids");
        int o28 = s7g.o(ckoVar, "track_disclaimer");
        int o29 = s7g.o(ckoVar, "track_fade");
        int o30 = s7g.o(ckoVar, "special_audio_resources");
        int o31 = s7g.o(ckoVar, "track_video_clip_ids");
        if (o == -1) {
            xq0.q("Missing column 'original_id' for a NON-NULL value, column not found in result.");
            return null;
        }
        String x0 = ckoVar.x0(o);
        String str = null;
        String x02 = (o2 == -1 || ckoVar.isNull(o2)) ? null : ckoVar.x0(o2);
        if (o3 == -1) {
            xq0.q("Missing column 'name' for a NON-NULL value, column not found in result.");
            return null;
        }
        String x03 = ckoVar.x0(o3);
        if (o4 == -1) {
            xq0.q("Missing column 'name_surrogate' for a NON-NULL value, column not found in result.");
            return null;
        }
        String x04 = ckoVar.x0(o4);
        String x05 = (o5 == -1 || ckoVar.isNull(o5)) ? null : ckoVar.x0(o5);
        long j = o6 == -1 ? 0L : ckoVar.getLong(o6);
        if (o7 == -1) {
            xq0.q("Missing column 'warning_content' for a NON-NULL value, column not found in result.");
            return null;
        }
        String x06 = ckoVar.x0(o7);
        if (o8 == -1) {
            z = false;
        } else {
            z = ((int) ckoVar.getLong(o8)) != 0;
        }
        if (o9 == -1) {
            xq0.q("Missing column 'available' for a NON-NULL value, column not found in result.");
            return null;
        }
        String x07 = ckoVar.x0(o9);
        if (o10 == -1) {
            z2 = false;
        } else {
            z2 = ((int) ckoVar.getLong(o10)) != 0;
        }
        String x08 = (o11 == -1 || ckoVar.isNull(o11)) ? null : ckoVar.x0(o11);
        if (o12 == -1) {
            z3 = false;
        } else {
            z3 = ((int) ckoVar.getLong(o12)) != 0;
        }
        if (o13 == -1) {
            z4 = false;
        } else {
            z4 = ((int) ckoVar.getLong(o13)) != 0;
        }
        if (o14 == -1) {
            z5 = false;
        } else {
            z5 = ((int) ckoVar.getLong(o14)) != 0;
        }
        if (o15 == -1) {
            xq0.q("Missing column 'track_type' for a NON-NULL value, column not found in result.");
            return null;
        }
        String x09 = ckoVar.x0(o15);
        String x010 = (o16 == -1 || ckoVar.isNull(o16)) ? null : ckoVar.x0(o16);
        String x011 = (o17 == -1 || ckoVar.isNull(o17)) ? null : ckoVar.x0(o17);
        String x012 = (o18 == -1 || ckoVar.isNull(o18)) ? null : ckoVar.x0(o18);
        if (o19 == -1) {
            z6 = false;
        } else {
            z6 = ((int) ckoVar.getLong(o19)) != 0;
        }
        String x013 = (o20 == -1 || ckoVar.isNull(o20)) ? null : ckoVar.x0(o20);
        String x014 = (o21 == -1 || ckoVar.isNull(o21)) ? null : ckoVar.x0(o21);
        String x015 = (o22 == -1 || ckoVar.isNull(o22)) ? null : ckoVar.x0(o22);
        String x016 = (o23 == -1 || ckoVar.isNull(o23)) ? null : ckoVar.x0(o23);
        String x017 = (o24 == -1 || ckoVar.isNull(o24)) ? null : ckoVar.x0(o24);
        Float valueOf = (o25 == -1 || ckoVar.isNull(o25)) ? null : Float.valueOf((float) ckoVar.getDouble(o25));
        Float valueOf2 = (o26 == -1 || ckoVar.isNull(o26)) ? null : Float.valueOf((float) ckoVar.getDouble(o26));
        if (o27 == -1) {
            z7 = false;
        } else {
            z7 = ((int) ckoVar.getLong(o27)) != 0;
        }
        String x018 = (o28 == -1 || ckoVar.isNull(o28)) ? null : ckoVar.x0(o28);
        String x019 = (o29 == -1 || ckoVar.isNull(o29)) ? null : ckoVar.x0(o29);
        String x020 = (o30 == -1 || ckoVar.isNull(o30)) ? null : ckoVar.x0(o30);
        if (o31 != -1 && !ckoVar.isNull(o31)) {
            str = ckoVar.x0(o31);
        }
        return new sus(x0, x02, x03, x04, x05, j, x06, z, x07, z2, x08, z3, z4, z5, x09, x010, x011, x012, z6, x013, x014, x015, x016, x017, valueOf, valueOf2, z7, x018, x019, x020, str);
    }

    public final Object b(List list, String str, ltl ltlVar) {
        StringBuilder k = dfi.k("UPDATE track SET available = ? WHERE original_id IN (");
        swf.x(list.size(), k);
        k.append(")");
        Object G = up6.G(this.a, false, true, new u3t(0, k.toString(), str, list), ltlVar);
        return G == nm6.a ? G : Unit.a;
    }
}
