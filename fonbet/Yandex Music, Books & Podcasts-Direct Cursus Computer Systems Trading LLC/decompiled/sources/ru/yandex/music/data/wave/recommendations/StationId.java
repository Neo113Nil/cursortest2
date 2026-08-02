package ru.yandex.music.data.wave.recommendations;

import androidx.annotation.NonNull;
import com.google.gson.annotations.SerializedName;
import defpackage.cvl;
import defpackage.g9p;
import defpackage.o5g;
import defpackage.s9p;
import defpackage.t75;
import defpackage.tlm;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class StationId implements Serializable {
    public static final StationId a = new StationId();
    private static final long serialVersionUID = -2918872871522945752L;

    @SerializedName("tag")
    private String tag;

    @SerializedName("type")
    private String type;

    private StationId() {
        this.type = "";
        this.tag = "";
    }

    public static StationId a(String str) {
        return f("album:" + str);
    }

    public static StationId b(String str) {
        return f("artist:" + str);
    }

    public static List c(String str, List list) {
        if (list == null) {
            return t75.c(str);
        }
        ArrayList arrayList = new ArrayList(list);
        if (!arrayList.contains(str)) {
            arrayList.add(0, str);
        }
        return arrayList;
    }

    public static List d(StationId stationId, List list) {
        return c(stationId.h(), list);
    }

    public static StationId e(s9p s9pVar) {
        g9p a2 = s9pVar.a();
        return new StationId(a2.getType(), a2.getTag());
    }

    public static StationId f(String str) {
        StationId stationId = a;
        if (!stationId.toString().equals(str)) {
            String[] split = str.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
            if (split.length >= 2) {
                return new StationId(split[0], split[1]);
            }
        }
        return stationId;
    }

    public static StationId k(cvl cvlVar) {
        StringBuilder m = tlm.m(o5g.b ? cvlVar.c.a : cvlVar.c.b, "_");
        m.append(cvlVar.a);
        return l(m.toString());
    }

    public static StationId l(String str) {
        return f("playlist:" + str.replace(':', '_'));
    }

    public static StationId o(String str) {
        return f("track:" + str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && StationId.class == obj.getClass()) {
            StationId stationId = (StationId) obj;
            if (this.tag.equals(stationId.tag) && this.type.equals(stationId.type)) {
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        return "generative".equalsIgnoreCase(this.type);
    }

    public final String h() {
        return this.type + StringUtils.PROCESS_POSTFIX_DELIMITER + this.tag;
    }

    public final int hashCode() {
        return this.type.hashCode() + (this.tag.hashCode() * 31);
    }

    public final boolean i() {
        return (j() || "seed".equalsIgnoreCase(this.type) || g() || "track".equalsIgnoreCase(this.type) || "playlist".equalsIgnoreCase(this.type) || "album".equalsIgnoreCase(this.type) || "artist".equalsIgnoreCase(this.type)) ? false : true;
    }

    public final boolean j() {
        return "user".equalsIgnoreCase(this.type);
    }

    public final String n() {
        return this.tag;
    }

    public final String p() {
        return this.type;
    }

    public final String toString() {
        return this.type + StringUtils.PROCESS_POSTFIX_DELIMITER + this.tag;
    }

    public StationId(@NonNull String str, @NonNull String str2) {
        this.type = str;
        this.tag = str2;
    }
}
