package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.connectsdk.device.ConnectableDevice;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class bph extends l9 {

    @NonNull
    public static final Parcelable.Creator<bph> CREATOR = new k5x(3);
    public String a;
    public String b;
    public int c;
    public String d;
    public aph e;
    public int f;
    public List g;
    public int h;
    public long i;
    public boolean j;

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3 A[Catch: JSONException -> 0x00fa, TryCatch #0 {JSONException -> 0x00fa, blocks: (B:3:0x0005, B:5:0x000d, B:6:0x0014, B:8:0x001c, B:9:0x0023, B:12:0x002b, B:13:0x0031, B:14:0x0037, B:15:0x003d, B:16:0x0043, B:17:0x0049, B:18:0x004f, B:19:0x0055, B:20:0x005b, B:21:0x0060, B:23:0x0068, B:24:0x006f, B:26:0x0073, B:27:0x007c, B:32:0x00a3, B:33:0x00a8, B:35:0x00ac, B:37:0x00b2, B:38:0x00bd, B:40:0x00c3, B:42:0x00d1, B:43:0x00d6, B:45:0x00e5, B:46:0x00f3, B:50:0x0085), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3 A[Catch: JSONException -> 0x00fa, LOOP:0: B:38:0x00bd->B:40:0x00c3, LOOP_END, TryCatch #0 {JSONException -> 0x00fa, blocks: (B:3:0x0005, B:5:0x000d, B:6:0x0014, B:8:0x001c, B:9:0x0023, B:12:0x002b, B:13:0x0031, B:14:0x0037, B:15:0x003d, B:16:0x0043, B:17:0x0049, B:18:0x004f, B:19:0x0055, B:20:0x005b, B:21:0x0060, B:23:0x0068, B:24:0x006f, B:26:0x0073, B:27:0x007c, B:32:0x00a3, B:33:0x00a8, B:35:0x00ac, B:37:0x00b2, B:38:0x00bd, B:40:0x00c3, B:42:0x00d1, B:43:0x00d6, B:45:0x00e5, B:46:0x00f3, B:50:0x0085), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e5 A[Catch: JSONException -> 0x00fa, TryCatch #0 {JSONException -> 0x00fa, blocks: (B:3:0x0005, B:5:0x000d, B:6:0x0014, B:8:0x001c, B:9:0x0023, B:12:0x002b, B:13:0x0031, B:14:0x0037, B:15:0x003d, B:16:0x0043, B:17:0x0049, B:18:0x004f, B:19:0x0055, B:20:0x005b, B:21:0x0060, B:23:0x0068, B:24:0x006f, B:26:0x0073, B:27:0x007c, B:32:0x00a3, B:33:0x00a8, B:35:0x00ac, B:37:0x00b2, B:38:0x00bd, B:40:0x00c3, B:42:0x00d1, B:43:0x00d6, B:45:0x00e5, B:46:0x00f3, B:50:0x0085), top: B:2:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject d() {
        Integer valueOf;
        String str;
        List list;
        long j;
        Iterator it;
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.a)) {
                jSONObject.put(ConnectableDevice.KEY_ID, this.a);
            }
            if (!TextUtils.isEmpty(this.b)) {
                jSONObject.put("entity", this.b);
            }
            switch (this.c) {
                case 1:
                    jSONObject.put("queueType", "ALBUM");
                    break;
                case 2:
                    jSONObject.put("queueType", "PLAYLIST");
                    break;
                case 3:
                    jSONObject.put("queueType", "AUDIOBOOK");
                    break;
                case 4:
                    jSONObject.put("queueType", "RADIO_STATION");
                    break;
                case 5:
                    jSONObject.put("queueType", "PODCAST_SERIES");
                    break;
                case 6:
                    jSONObject.put("queueType", "TV_SERIES");
                    break;
                case 7:
                    jSONObject.put("queueType", "VIDEO_PLAYLIST");
                    break;
                case 8:
                    jSONObject.put("queueType", "LIVE_TV");
                    break;
                case 9:
                    jSONObject.put("queueType", "MOVIE");
                    break;
            }
            if (!TextUtils.isEmpty(this.d)) {
                jSONObject.put("name", this.d);
            }
            aph aphVar = this.e;
            if (aphVar != null) {
                jSONObject.put("containerMetadata", aphVar.d());
            }
            valueOf = Integer.valueOf(this.f);
        } catch (JSONException unused) {
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            if (intValue == 0) {
                str = "REPEAT_OFF";
            } else if (intValue == 1) {
                str = "REPEAT_ALL";
            } else if (intValue == 2) {
                str = "REPEAT_SINGLE";
            } else if (intValue == 3) {
                str = "REPEAT_ALL_AND_SHUFFLE";
            }
            if (str != null) {
                jSONObject.put("repeatMode", str);
            }
            list = this.g;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                it = this.g.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((cph) it.next()).d());
                }
                jSONObject.put("items", jSONArray);
            }
            jSONObject.put("startIndex", this.h);
            j = this.i;
            if (j != -1) {
                Pattern pattern = d94.a;
                jSONObject.put("startTime", j / 1000.0d);
            }
            jSONObject.put("shuffle", this.j);
            return jSONObject;
        }
        str = null;
        if (str != null) {
        }
        list = this.g;
        if (list != null) {
            JSONArray jSONArray2 = new JSONArray();
            it = this.g.iterator();
            while (it.hasNext()) {
            }
            jSONObject.put("items", jSONArray2);
        }
        jSONObject.put("startIndex", this.h);
        j = this.i;
        if (j != -1) {
        }
        jSONObject.put("shuffle", this.j);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bph)) {
            return false;
        }
        bph bphVar = (bph) obj;
        return TextUtils.equals(this.a, bphVar.a) && TextUtils.equals(this.b, bphVar.b) && this.c == bphVar.c && TextUtils.equals(this.d, bphVar.d) && ldg.s(this.e, bphVar.e) && this.f == bphVar.f && ldg.s(this.g, bphVar.g) && this.h == bphVar.h && this.i == bphVar.i && this.j == bphVar.j;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), this.d, this.e, Integer.valueOf(this.f), this.g, Integer.valueOf(this.h), Long.valueOf(this.i), Boolean.valueOf(this.j)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.j0(parcel, 2, this.a);
        o8g.j0(parcel, 3, this.b);
        int i2 = this.c;
        o8g.q0(4, 4, parcel);
        parcel.writeInt(i2);
        o8g.j0(parcel, 5, this.d);
        o8g.i0(parcel, 6, this.e, i);
        int i3 = this.f;
        o8g.q0(7, 4, parcel);
        parcel.writeInt(i3);
        List list = this.g;
        o8g.n0(parcel, 8, list == null ? null : Collections.unmodifiableList(list));
        int i4 = this.h;
        o8g.q0(9, 4, parcel);
        parcel.writeInt(i4);
        long j = this.i;
        o8g.q0(10, 8, parcel);
        parcel.writeLong(j);
        boolean z = this.j;
        o8g.q0(11, 4, parcel);
        parcel.writeInt(z ? 1 : 0);
        o8g.p0(parcel, o0);
    }
}
