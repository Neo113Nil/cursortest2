package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import com.connectsdk.device.ConnectableDevice;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.d94;
import defpackage.goh;
import defpackage.hcx;
import defpackage.jes;
import defpackage.k2x;
import defpackage.l9;
import defpackage.o7f;
import defpackage.o8g;
import defpackage.rzf;
import defpackage.vcx;
import defpackage.vyt;
import defpackage.wi;
import defpackage.xi;
import defpackage.xq0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MediaInfo extends l9 implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<MediaInfo> CREATOR;
    public final String a;
    public final int b;
    public final String c;
    public final goh d;
    public final long e;
    public final List f;
    public final jes g;
    public String h;
    public List i;
    public List j;
    public final String k;
    public final vyt l;
    public final long m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final JSONObject r;

    static {
        Pattern pattern = d94.a;
        CREATOR = new k2x(23);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0312  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MediaInfo(JSONObject jSONObject) {
        this(jSONObject.optString("contentId"), -1, null, null, -1L, null, null, null, null, null, null, null, -1L, null, null, null, null);
        double d;
        vyt vytVar;
        int i;
        int i2;
        vcx vcxVar;
        String optString = jSONObject.optString("streamType", "NONE");
        int i3 = 2;
        int i4 = 1;
        int i5 = 0;
        if ("NONE".equals(optString)) {
            this.b = 0;
        } else if ("BUFFERED".equals(optString)) {
            this.b = 1;
        } else if ("LIVE".equals(optString)) {
            this.b = 2;
        } else {
            this.b = -1;
        }
        this.c = d94.a(jSONObject, "contentType");
        if (jSONObject.has("metadata")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
            goh gohVar = new goh(jSONObject2.getInt("metadataType"));
            this.d = gohVar;
            gohVar.e(jSONObject2);
        }
        this.e = -1L;
        if (this.b != 2 && jSONObject.has("duration") && !jSONObject.isNull("duration")) {
            double optDouble = jSONObject.optDouble("duration", 0.0d);
            if (!Double.isNaN(optDouble) && !Double.isInfinite(optDouble) && optDouble >= 0.0d) {
                this.e = (long) (optDouble * 1000.0d);
            }
        }
        int i6 = 4;
        if (jSONObject.has("tracks")) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("tracks");
            int i7 = 0;
            d = 0.0d;
            while (i7 < jSONArray.length()) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i7);
                long j = jSONObject3.getLong("trackId");
                String optString2 = jSONObject3.optString("type");
                int i8 = "TEXT".equals(optString2) ? i4 : "AUDIO".equals(optString2) ? i3 : "VIDEO".equals(optString2) ? 3 : i5;
                String a = d94.a(jSONObject3, "trackContentId");
                String a2 = d94.a(jSONObject3, "trackContentType");
                String a3 = d94.a(jSONObject3, "name");
                String a4 = d94.a(jSONObject3, "language");
                if (jSONObject3.has("subtype")) {
                    String string = jSONObject3.getString("subtype");
                    i2 = "SUBTITLES".equals(string) ? i4 : "CAPTIONS".equals(string) ? i3 : "DESCRIPTIONS".equals(string) ? 3 : "CHAPTERS".equals(string) ? i6 : "METADATA".equals(string) ? 5 : -1;
                } else {
                    i2 = i5;
                }
                if (jSONObject3.has("roles")) {
                    Object[] objArr = new Object[i6];
                    JSONArray jSONArray2 = jSONObject3.getJSONArray("roles");
                    int i9 = i5;
                    int i10 = i9;
                    while (i9 < jSONArray2.length()) {
                        String optString3 = jSONArray2.optString(i9);
                        optString3.getClass();
                        int length = objArr.length;
                        int i11 = i10 + 1;
                        int R = rzf.R(length, i11);
                        if (R > length) {
                            objArr = Arrays.copyOf(objArr, R);
                        }
                        objArr[i10] = optString3;
                        i9++;
                        i10 = i11;
                    }
                    vcxVar = hcx.t(i10, objArr);
                } else {
                    vcxVar = null;
                }
                arrayList.add(new MediaTrack(j, i8, a, a2, a3, a4, i2, vcxVar, jSONObject3.optJSONObject("customData")));
                i7++;
                i6 = 4;
                i3 = 2;
                i4 = 1;
                i5 = 0;
            }
            this.f = new ArrayList(arrayList);
        } else {
            d = 0.0d;
            this.f = null;
        }
        if (jSONObject.has("textTrackStyle")) {
            JSONObject jSONObject4 = jSONObject.getJSONObject("textTrackStyle");
            jes jesVar = new jes(1.0f, 0, 0, -1, 0, -1, 0, 0, null, -1, -1, null);
            jesVar.a = (float) jSONObject4.optDouble("fontScale", 1.0d);
            jesVar.b = jes.e(jSONObject4.optString("foregroundColor"));
            jesVar.c = jes.e(jSONObject4.optString("backgroundColor"));
            if (jSONObject4.has("edgeType")) {
                String string2 = jSONObject4.getString("edgeType");
                if ("NONE".equals(string2)) {
                    jesVar.d = 0;
                } else if ("OUTLINE".equals(string2)) {
                    jesVar.d = 1;
                } else if ("DROP_SHADOW".equals(string2)) {
                    jesVar.d = 2;
                } else if ("RAISED".equals(string2)) {
                    jesVar.d = 3;
                } else if ("DEPRESSED".equals(string2)) {
                    jesVar.d = 4;
                }
            }
            jesVar.e = jes.e(jSONObject4.optString("edgeColor"));
            if (jSONObject4.has("windowType")) {
                String string3 = jSONObject4.getString("windowType");
                if ("NONE".equals(string3)) {
                    jesVar.f = 0;
                } else if ("NORMAL".equals(string3)) {
                    jesVar.f = 1;
                } else if ("ROUNDED_CORNERS".equals(string3)) {
                    i = 2;
                    jesVar.f = 2;
                    jesVar.g = jes.e(jSONObject4.optString("windowColor"));
                    if (jesVar.f == i) {
                        jesVar.h = jSONObject4.optInt("windowRoundedCornerRadius", 0);
                    }
                    jesVar.i = d94.a(jSONObject4, "fontFamily");
                    if (jSONObject4.has("fontGenericFamily")) {
                        String string4 = jSONObject4.getString("fontGenericFamily");
                        if ("SANS_SERIF".equals(string4)) {
                            jesVar.j = 0;
                        } else if ("MONOSPACED_SANS_SERIF".equals(string4)) {
                            jesVar.j = 1;
                        } else if ("SERIF".equals(string4)) {
                            jesVar.j = 2;
                        } else if ("MONOSPACED_SERIF".equals(string4)) {
                            jesVar.j = 3;
                        } else if ("CASUAL".equals(string4)) {
                            jesVar.j = 4;
                        } else if ("CURSIVE".equals(string4)) {
                            jesVar.j = 5;
                        } else if ("SMALL_CAPITALS".equals(string4)) {
                            jesVar.j = 6;
                        }
                    }
                    if (jSONObject4.has("fontStyle")) {
                        String string5 = jSONObject4.getString("fontStyle");
                        if ("NORMAL".equals(string5)) {
                            jesVar.k = 0;
                        } else if ("BOLD".equals(string5)) {
                            jesVar.k = 1;
                        } else if ("ITALIC".equals(string5)) {
                            jesVar.k = 2;
                        } else if ("BOLD_ITALIC".equals(string5)) {
                            jesVar.k = 3;
                        }
                    }
                    jesVar.m = jSONObject4.optJSONObject("customData");
                    this.g = jesVar;
                    vytVar = null;
                }
            }
            i = 2;
            jesVar.g = jes.e(jSONObject4.optString("windowColor"));
            if (jesVar.f == i) {
            }
            jesVar.i = d94.a(jSONObject4, "fontFamily");
            if (jSONObject4.has("fontGenericFamily")) {
            }
            if (jSONObject4.has("fontStyle")) {
            }
            jesVar.m = jSONObject4.optJSONObject("customData");
            this.g = jesVar;
            vytVar = null;
        } else {
            vytVar = null;
            this.g = null;
        }
        e(jSONObject);
        this.r = jSONObject.optJSONObject("customData");
        this.k = d94.a(jSONObject, "entity");
        this.n = d94.a(jSONObject, "atvEntity");
        JSONObject optJSONObject = jSONObject.optJSONObject("vmapAdsRequest");
        this.l = optJSONObject == null ? vytVar : new vyt(d94.a(optJSONObject, "adTagUrl"), d94.a(optJSONObject, "adsResponse"));
        if (jSONObject.has("startAbsoluteTime") && !jSONObject.isNull("startAbsoluteTime")) {
            double optDouble2 = jSONObject.optDouble("startAbsoluteTime");
            if (!Double.isNaN(optDouble2) && !Double.isInfinite(optDouble2) && optDouble2 >= d) {
                this.m = (long) (optDouble2 * 1000.0d);
            }
        }
        if (jSONObject.has("contentUrl")) {
            this.o = jSONObject.optString("contentUrl");
        }
        this.p = d94.a(jSONObject, "hlsSegmentFormat");
        this.q = d94.a(jSONObject, "hlsVideoSegmentFormat");
    }

    public final JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("contentId", this.a);
            jSONObject.putOpt("contentUrl", this.o);
            int i = this.b;
            jSONObject.put("streamType", i != 1 ? i != 2 ? "NONE" : "LIVE" : "BUFFERED");
            String str = this.c;
            if (str != null) {
                jSONObject.put("contentType", str);
            }
            goh gohVar = this.d;
            if (gohVar != null) {
                jSONObject.put("metadata", gohVar.d());
            }
            long j = this.e;
            if (j <= -1) {
                jSONObject.put("duration", JSONObject.NULL);
            } else {
                Pattern pattern = d94.a;
                jSONObject.put("duration", j / 1000.0d);
            }
            List list = this.f;
            if (list != null) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((MediaTrack) it.next()).d());
                }
                jSONObject.put("tracks", jSONArray);
            }
            jes jesVar = this.g;
            if (jesVar != null) {
                jSONObject.put("textTrackStyle", jesVar.d());
            }
            JSONObject jSONObject2 = this.r;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str2 = this.k;
            if (str2 != null) {
                jSONObject.put("entity", str2);
            }
            if (this.i != null) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator it2 = this.i.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put(((xi) it2.next()).d());
                }
                jSONObject.put("breaks", jSONArray2);
            }
            if (this.j != null) {
                JSONArray jSONArray3 = new JSONArray();
                Iterator it3 = this.j.iterator();
                while (it3.hasNext()) {
                    jSONArray3.put(((wi) it3.next()).d());
                }
                jSONObject.put("breakClips", jSONArray3);
            }
            vyt vytVar = this.l;
            if (vytVar != null) {
                jSONObject.put("vmapAdsRequest", vytVar.d());
            }
            long j2 = this.m;
            if (j2 != -1) {
                Pattern pattern2 = d94.a;
                jSONObject.put("startAbsoluteTime", j2 / 1000.0d);
            }
            jSONObject.putOpt("atvEntity", this.n);
            String str3 = this.p;
            if (str3 != null) {
                jSONObject.put("hlsSegmentFormat", str3);
            }
            String str4 = this.q;
            if (str4 != null) {
                jSONObject.put("hlsVideoSegmentFormat", str4);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00b9 A[LOOP:0: B:4:0x0024->B:11:0x00b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01b2 A[LOOP:1: B:18:0x00e7->B:24:0x01b2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01b9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(JSONObject jSONObject) {
        long j;
        wi wiVar;
        xi xiVar;
        long j2 = 1000;
        int i = 0;
        if (jSONObject.has("breaks")) {
            JSONArray jSONArray = jSONObject.getJSONArray("breaks");
            ArrayList arrayList = new ArrayList(jSONArray.length());
            int i2 = 0;
            while (true) {
                if (i2 >= jSONArray.length()) {
                    j = j2;
                    break;
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                if (jSONObject2 != null && jSONObject2.has(ConnectableDevice.KEY_ID) && jSONObject2.has("position")) {
                    try {
                        String string = jSONObject2.getString(ConnectableDevice.KEY_ID);
                        long j3 = jSONObject2.getLong("position");
                        Pattern pattern = d94.a;
                        long j4 = j3 * j2;
                        boolean optBoolean = jSONObject2.optBoolean("isWatched");
                        long optLong = jSONObject2.optLong("duration") * j2;
                        JSONArray optJSONArray = jSONObject2.optJSONArray("breakClipIds");
                        String[] strArr = new String[0];
                        if (optJSONArray != null) {
                            strArr = new String[optJSONArray.length()];
                            j = j2;
                            for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                                try {
                                    strArr[i3] = optJSONArray.getString(i3);
                                } catch (JSONException e) {
                                    e = e;
                                    String message = e.getMessage();
                                    Locale locale = Locale.ROOT;
                                    Log.d("AdBreakInfo", "Error while creating an AdBreakInfo from JSON: " + message);
                                    xiVar = null;
                                    if (xiVar == null) {
                                    }
                                }
                            }
                        } else {
                            j = j2;
                        }
                        xiVar = new xi(j4, string, optLong, optBoolean, strArr, jSONObject2.optBoolean("isEmbedded"), jSONObject2.optBoolean("expanded"));
                    } catch (JSONException e2) {
                        e = e2;
                        j = j2;
                    }
                    if (xiVar == null) {
                        arrayList.clear();
                        break;
                    } else {
                        arrayList.add(xiVar);
                        i2++;
                        j2 = j;
                    }
                } else {
                    j = j2;
                }
                xiVar = null;
                if (xiVar == null) {
                }
            }
            this.i = new ArrayList(arrayList);
        } else {
            j = 1000;
        }
        if (jSONObject.has("breakClips")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("breakClips");
            ArrayList arrayList2 = new ArrayList(jSONArray2.length());
            while (true) {
                if (i >= jSONArray2.length()) {
                    break;
                }
                JSONObject jSONObject3 = jSONArray2.getJSONObject(i);
                if (jSONObject3 != null && jSONObject3.has(ConnectableDevice.KEY_ID)) {
                    try {
                        String string2 = jSONObject3.getString(ConnectableDevice.KEY_ID);
                        long optLong2 = jSONObject3.optLong("duration") * j;
                        String a = d94.a(jSONObject3, "clickThroughUrl");
                        String a2 = d94.a(jSONObject3, "contentUrl");
                        String a3 = d94.a(jSONObject3, "mimeType");
                        if (a3 == null) {
                            a3 = d94.a(jSONObject3, "contentType");
                        }
                        String str = a3;
                        String a4 = d94.a(jSONObject3, "title");
                        JSONObject optJSONObject = jSONObject3.optJSONObject("customData");
                        String a5 = d94.a(jSONObject3, "contentId");
                        String a6 = d94.a(jSONObject3, "posterUrl");
                        long intValue = jSONObject3.has("whenSkippable") ? ((Integer) jSONObject3.get("whenSkippable")).intValue() * j : -1L;
                        String a7 = d94.a(jSONObject3, "hlsSegmentFormat");
                        JSONObject optJSONObject2 = jSONObject3.optJSONObject("vastAdsRequest");
                        wiVar = new wi(string2, a4, optLong2, a2, str, a, (optJSONObject == null || optJSONObject.length() == 0) ? null : optJSONObject.toString(), a5, a6, intValue, a7, optJSONObject2 == null ? null : new vyt(d94.a(optJSONObject2, "adTagUrl"), d94.a(optJSONObject2, "adsResponse")));
                    } catch (JSONException e3) {
                        String message2 = e3.getMessage();
                        Locale locale2 = Locale.ROOT;
                        Log.d("AdBreakClipInfo", "Error while creating an AdBreakClipInfo from JSON: " + message2);
                    }
                    if (wiVar != null) {
                        arrayList2.clear();
                        break;
                    } else {
                        arrayList2.add(wiVar);
                        i++;
                    }
                }
                wiVar = null;
                if (wiVar != null) {
                }
            }
            this.j = new ArrayList(arrayList2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaInfo)) {
            return false;
        }
        MediaInfo mediaInfo = (MediaInfo) obj;
        JSONObject jSONObject = this.r;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = mediaInfo.r;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || o7f.a(jSONObject, jSONObject2)) && d94.d(this.a, mediaInfo.a) && this.b == mediaInfo.b && d94.d(this.c, mediaInfo.c) && d94.d(this.d, mediaInfo.d) && this.e == mediaInfo.e && d94.d(this.f, mediaInfo.f) && d94.d(this.g, mediaInfo.g) && d94.d(this.i, mediaInfo.i) && d94.d(this.j, mediaInfo.j) && d94.d(this.k, mediaInfo.k) && d94.d(this.l, mediaInfo.l) && this.m == mediaInfo.m && d94.d(this.n, mediaInfo.n) && d94.d(this.o, mediaInfo.o) && d94.d(this.p, mediaInfo.p) && d94.d(this.q, mediaInfo.q);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, this.d, Long.valueOf(this.e), String.valueOf(this.r), this.f, this.g, this.i, this.j, this.k, this.l, Long.valueOf(this.m), this.n, this.p, this.q});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.r;
        this.h = jSONObject == null ? null : jSONObject.toString();
        int o0 = o8g.o0(parcel, 20293);
        String str = this.a;
        if (str == null) {
            str = "";
        }
        o8g.j0(parcel, 2, str);
        o8g.q0(3, 4, parcel);
        parcel.writeInt(this.b);
        o8g.j0(parcel, 4, this.c);
        o8g.i0(parcel, 5, this.d, i);
        o8g.q0(6, 8, parcel);
        parcel.writeLong(this.e);
        o8g.n0(parcel, 7, this.f);
        o8g.i0(parcel, 8, this.g, i);
        o8g.j0(parcel, 9, this.h);
        List list = this.i;
        o8g.n0(parcel, 10, list == null ? null : Collections.unmodifiableList(list));
        List list2 = this.j;
        o8g.n0(parcel, 11, list2 != null ? Collections.unmodifiableList(list2) : null);
        o8g.j0(parcel, 12, this.k);
        o8g.i0(parcel, 13, this.l, i);
        o8g.q0(14, 8, parcel);
        parcel.writeLong(this.m);
        o8g.j0(parcel, 15, this.n);
        o8g.j0(parcel, 16, this.o);
        o8g.j0(parcel, 17, this.p);
        o8g.j0(parcel, 18, this.q);
        o8g.p0(parcel, o0);
    }

    public MediaInfo(String str, int i, String str2, goh gohVar, long j, ArrayList arrayList, jes jesVar, String str3, ArrayList arrayList2, ArrayList arrayList3, String str4, vyt vytVar, long j2, String str5, String str6, String str7, String str8) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = gohVar;
        this.e = j;
        this.f = arrayList;
        this.g = jesVar;
        this.h = str3;
        if (str3 != null) {
            try {
                this.r = new JSONObject(this.h);
            } catch (JSONException unused) {
                this.r = null;
                this.h = null;
            }
        } else {
            this.r = null;
        }
        this.i = arrayList2;
        this.j = arrayList3;
        this.k = str4;
        this.l = vytVar;
        this.m = j2;
        this.n = str5;
        this.o = str6;
        this.p = str7;
        this.q = str8;
        if (this.a == null && str6 == null && str4 == null) {
            xq0.x("Either contentID or contentUrl or entity should be set");
            throw null;
        }
    }
}
