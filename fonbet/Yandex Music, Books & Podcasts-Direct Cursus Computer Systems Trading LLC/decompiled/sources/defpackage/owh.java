package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import com.google.android.gms.cast.MediaInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class owh extends l9 {

    @NonNull
    public static final Parcelable.Creator<owh> CREATOR;
    public MediaInfo a;
    public long b;
    public int c;
    public double d;
    public int e;
    public int f;
    public long g;
    public long h;
    public double i;
    public boolean j;
    public long[] k;
    public int l;
    public int m;
    public String n;
    public JSONObject o;
    public int p;
    public boolean r;
    public yi s;
    public kbu t;
    public aoh u;
    public bph v;
    public boolean w;
    public final ArrayList q = new ArrayList();
    public final SparseArray x = new SparseArray();

    static {
        y1g.D("MediaStatus", "The log tag cannot be null or empty.");
        CREATOR = new k5x(5);
    }

    public owh(MediaInfo mediaInfo, long j, int i, double d, int i2, int i3, long j2, long j3, double d2, boolean z, long[] jArr, int i4, int i5, String str, int i6, ArrayList arrayList, boolean z2, yi yiVar, kbu kbuVar, aoh aohVar, bph bphVar) {
        this.a = mediaInfo;
        this.b = j;
        this.c = i;
        this.d = d;
        this.e = i2;
        this.f = i3;
        this.g = j2;
        this.h = j3;
        this.i = d2;
        this.j = z;
        this.k = jArr;
        this.l = i4;
        this.m = i5;
        this.n = str;
        if (str != null) {
            try {
                this.o = new JSONObject(this.n);
            } catch (JSONException unused) {
                this.o = null;
                this.n = null;
            }
        } else {
            this.o = null;
        }
        this.p = i6;
        if (arrayList != null && !arrayList.isEmpty()) {
            b(arrayList);
        }
        this.r = z2;
        this.s = yiVar;
        this.t = kbuVar;
        this.u = aohVar;
        this.v = bphVar;
        boolean z3 = false;
        if (bphVar != null && bphVar.j) {
            z3 = true;
        }
        this.w = z3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x023d, code lost:
    
        if (r12 != 3) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0240, code lost:
    
        if (r2 != 2) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0243, code lost:
    
        if (r13 == 0) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x01ad, code lost:
    
        if (r2 != null) goto L109;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0479 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0407 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x03ba A[Catch: JSONException -> 0x03c5, TryCatch #0 {JSONException -> 0x03c5, blocks: (B:311:0x0394, B:313:0x03ba, B:314:0x03bb), top: B:310:0x0394 }] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006c  */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, yi] */
    /* JADX WARN: Type inference failed for: r0v30, types: [kbu] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [aoh] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r2v103 */
    /* JADX WARN: Type inference failed for: r2v57, types: [aph, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v60, types: [aph] */
    /* JADX WARN: Type inference failed for: r2v62 */
    /* JADX WARN: Type inference failed for: r36v0, types: [owh] */
    /* JADX WARN: Type inference failed for: r38v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v28, types: [aoh] */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v45, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v46, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r5v16, types: [yi] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v35, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r8v23, types: [java.lang.Object, kbu] */
    /* JADX WARN: Type inference failed for: r8v60 */
    /* JADX WARN: Type inference failed for: r8v61 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(JSONObject jSONObject, int i) {
        JSONObject jSONObject2;
        long j;
        int i2;
        double d;
        JSONArray jSONArray;
        long[] jArr;
        int optInt;
        int optInt2;
        int i3;
        boolean z;
        int i4;
        int i5;
        JSONObject jSONObject3;
        MediaInfo mediaInfo;
        int i6;
        JSONObject optJSONObject;
        long optLong;
        ?? yiVar;
        ?? r5;
        JSONObject optJSONObject2;
        int i7;
        ?? r8;
        ?? r0;
        int i8;
        int i9;
        ?? aohVar;
        int i10;
        String str;
        String str2;
        int i11;
        JSONObject jSONObject4;
        ?? r4;
        String str3;
        boolean optBoolean;
        ?? r02;
        int i12;
        int i13;
        String str4;
        ?? r52;
        int i14;
        JSONArray optJSONArray;
        ?? r3;
        JSONArray optJSONArray2;
        ?? r42;
        String str5;
        ?? r2;
        MediaInfo mediaInfo2;
        int i15;
        JSONObject optJSONObject3 = jSONObject.optJSONObject("extendedStatus");
        if (optJSONObject3 != null) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    arrayList.add(keys.next());
                }
                jSONObject2 = new JSONObject(jSONObject, (String[]) arrayList.toArray(new String[0]));
                Iterator<String> keys2 = optJSONObject3.keys();
                while (keys2.hasNext()) {
                    String next = keys2.next();
                    jSONObject2.put(next, optJSONObject3.get(next));
                }
                jSONObject2.remove("extendedStatus");
            } catch (JSONException unused) {
            }
            j = jSONObject2.getLong("mediaSessionId");
            if (j == this.b) {
                this.b = j;
                i2 = 1;
            } else {
                i2 = 0;
            }
            int i16 = 2;
            if (jSONObject2.has("playerState")) {
                String string = jSONObject2.getString("playerState");
                int i17 = string.equals("IDLE") ? 1 : string.equals("PLAYING") ? 2 : string.equals("PAUSED") ? 3 : string.equals("BUFFERING") ? 4 : string.equals("LOADING") ? 5 : 0;
                if (i17 != this.e) {
                    this.e = i17;
                    i2 |= 2;
                }
                if (i17 == 1 && jSONObject2.has("idleReason")) {
                    String string2 = jSONObject2.getString("idleReason");
                    int i18 = string2.equals("CANCELLED") ? 2 : string2.equals("INTERRUPTED") ? 3 : string2.equals("FINISHED") ? 1 : string2.equals("ERROR") ? 4 : 0;
                    if (i18 != this.f) {
                        this.f = i18;
                        i2 |= 2;
                    }
                }
            }
            if (jSONObject2.has("playbackRate")) {
                double d2 = jSONObject2.getDouble("playbackRate");
                if (this.d != d2) {
                    this.d = d2;
                    i2 |= 2;
                }
            }
            if (jSONObject2.has("currentTime")) {
                double d3 = jSONObject2.getDouble("currentTime");
                Pattern pattern = d94.a;
                long j2 = (long) (d3 * 1000.0d);
                if (j2 != this.g) {
                    this.g = j2;
                    i2 |= 2;
                }
                i2 |= 128;
            }
            if (jSONObject2.has("supportedMediaCommands")) {
                long j3 = jSONObject2.getLong("supportedMediaCommands");
                if (j3 != this.h) {
                    this.h = j3;
                    i2 |= 2;
                }
            }
            if (jSONObject2.has("volume") || i != 0) {
                d = 1000.0d;
            } else {
                JSONObject jSONObject5 = jSONObject2.getJSONObject("volume");
                double d4 = jSONObject5.getDouble("level");
                d = 1000.0d;
                if (d4 != this.i) {
                    this.i = d4;
                    i2 |= 2;
                }
                boolean z2 = jSONObject5.getBoolean("muted");
                if (z2 != this.j) {
                    this.j = z2;
                    i2 |= 2;
                }
            }
            JSONObject jSONObject6 = null;
            jSONArray = !jSONObject2.has("activeTrackIds") ? jSONObject2.getJSONArray("activeTrackIds") : null;
            Pattern pattern2 = d94.a;
            if (jSONArray != null) {
                jArr = null;
            } else {
                jArr = new long[jSONArray.length()];
                for (int i19 = 0; i19 < jSONArray.length(); i19++) {
                    jArr[i19] = jSONArray.getLong(i19);
                }
            }
            long[] jArr2 = this.k;
            if (jArr == null) {
                if (jArr2 != null) {
                    if (jArr2.length == jArr.length) {
                        for (int i20 = 0; i20 < jArr.length; i20++) {
                            if (this.k[i20] == jArr[i20]) {
                            }
                        }
                    }
                }
                this.k = jArr;
                i2 |= 2;
                break;
            }
            if (jSONObject2.has("customData")) {
                this.o = jSONObject2.getJSONObject("customData");
                this.n = null;
                i2 |= 2;
            }
            if (jSONObject2.has("media")) {
                JSONObject jSONObject7 = jSONObject2.getJSONObject("media");
                MediaInfo mediaInfo3 = new MediaInfo(jSONObject7);
                MediaInfo mediaInfo4 = this.a;
                if (mediaInfo4 == null || !mediaInfo4.equals(mediaInfo3)) {
                    this.a = mediaInfo3;
                    i2 |= 2;
                }
                if (jSONObject7.has("metadata")) {
                    i2 |= 4;
                }
            }
            if (jSONObject2.has("currentItemId") && this.c != (i15 = jSONObject2.getInt("currentItemId"))) {
                this.c = i15;
                i2 |= 2;
            }
            optInt = jSONObject2.optInt("preloadedItemId", 0);
            if (this.m != optInt) {
                this.m = optInt;
                i2 |= 16;
            }
            optInt2 = jSONObject2.optInt("loadingItemId", 0);
            if (this.l != optInt2) {
                this.l = optInt2;
                i2 |= 2;
            }
            MediaInfo mediaInfo5 = this.a;
            int i21 = mediaInfo5 != null ? -1 : mediaInfo5.b;
            i3 = this.e;
            int i22 = this.f;
            int i23 = this.l;
            SparseArray sparseArray = this.x;
            ArrayList arrayList2 = this.q;
            double d5 = d;
            if (i3 == 1) {
                if (i22 != 1) {
                    if (i22 != 2) {
                    }
                    this.c = 0;
                    this.l = 0;
                    this.m = 0;
                    if (arrayList2.isEmpty()) {
                        i4 = 1;
                        i5 = 2;
                        jSONObject3 = null;
                        i6 = i2;
                        optJSONObject = jSONObject2.optJSONObject("breakStatus");
                        Parcelable.Creator<yi> creator = yi.CREATOR;
                        long j4 = -1;
                        if (optJSONObject != null) {
                            long j5 = optJSONObject.getLong("currentBreakTime");
                            Pattern pattern3 = d94.a;
                            long j6 = j5 * 1000;
                            long j7 = optJSONObject.getLong("currentBreakClipTime") * 1000;
                            String a = d94.a(optJSONObject, "breakId");
                            String a2 = d94.a(optJSONObject, "breakClipId");
                            optLong = optJSONObject.optLong("whenSkippable", -1L);
                            if (optLong != -1) {
                            }
                            yiVar = new yi(j6, j7, optLong, a, a2);
                            r5 = this.s;
                            if (r5 == 0) {
                            }
                            this.r = (yiVar != 0 || (yiVar.c == null && yiVar.d == null)) ? 0 : i4;
                            this.s = yiVar;
                            i6 |= 32;
                            optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                            msg msgVar = kbu.d;
                            if (optJSONObject2 != null) {
                            }
                            r8 = jSONObject3;
                            r0 = this.t;
                            if (r0 == 0) {
                            }
                            this.t = r8;
                            i6 |= 64;
                            if (jSONObject2.has("breakInfo")) {
                            }
                            if (jSONObject2.has("queueData")) {
                            }
                            i9 = i8;
                            if (jSONObject2.has("liveSeekableRange")) {
                            }
                            return i9;
                        }
                        yiVar = jSONObject3;
                        r5 = this.s;
                        if (r5 == 0) {
                        }
                        this.r = (yiVar != 0 || (yiVar.c == null && yiVar.d == null)) ? 0 : i4;
                        this.s = yiVar;
                        i6 |= 32;
                        optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                        msg msgVar2 = kbu.d;
                        if (optJSONObject2 != null) {
                        }
                        r8 = jSONObject3;
                        r0 = this.t;
                        if (r0 == 0) {
                        }
                        this.t = r8;
                        i6 |= 64;
                        if (jSONObject2.has("breakInfo")) {
                        }
                        if (jSONObject2.has("queueData")) {
                        }
                        i9 = i8;
                        if (jSONObject2.has("liveSeekableRange")) {
                        }
                        return i9;
                    }
                    this.p = 0;
                    arrayList2.clear();
                    sparseArray.clear();
                    i6 = i2 | 8;
                    i4 = 1;
                    i5 = 2;
                    jSONObject3 = null;
                    optJSONObject = jSONObject2.optJSONObject("breakStatus");
                    Parcelable.Creator<yi> creator2 = yi.CREATOR;
                    long j42 = -1;
                    if (optJSONObject != null && optJSONObject.has("currentBreakTime") && optJSONObject.has("currentBreakClipTime")) {
                        try {
                            long j52 = optJSONObject.getLong("currentBreakTime");
                            Pattern pattern32 = d94.a;
                            long j62 = j52 * 1000;
                            long j72 = optJSONObject.getLong("currentBreakClipTime") * 1000;
                            String a3 = d94.a(optJSONObject, "breakId");
                            String a22 = d94.a(optJSONObject, "breakClipId");
                            optLong = optJSONObject.optLong("whenSkippable", -1L);
                            if (optLong != -1) {
                                optLong *= 1000;
                            }
                            yiVar = new yi(j62, j72, optLong, a3, a22);
                        } catch (JSONException e) {
                            msg msgVar3 = yi.f;
                            Log.e(msgVar3.a, msgVar3.d("Error while creating an AdBreakClipInfo from JSON", new Object[0]), e);
                        }
                        r5 = this.s;
                        if ((r5 == 0 && yiVar != 0) || (r5 != 0 && !r5.equals(yiVar))) {
                            this.r = (yiVar != 0 || (yiVar.c == null && yiVar.d == null)) ? 0 : i4;
                            this.s = yiVar;
                            i6 |= 32;
                        }
                        optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                        msg msgVar22 = kbu.d;
                        if (optJSONObject2 != null) {
                            try {
                                String string3 = optJSONObject2.getString("hdrType");
                                int hashCode = string3.hashCode();
                                if (hashCode == 3218) {
                                    if (string3.equals("dv")) {
                                        i7 = 3;
                                        r8 = new kbu(optJSONObject2.getInt(CameraProperty.WIDTH), optJSONObject2.getInt(CameraProperty.HEIGHT), i7);
                                    }
                                    msgVar22.b("Unknown HDR type: %s", string3);
                                    i7 = 0;
                                    r8 = new kbu(optJSONObject2.getInt(CameraProperty.WIDTH), optJSONObject2.getInt(CameraProperty.HEIGHT), i7);
                                } else if (hashCode == 103158) {
                                    if (string3.equals("hdr")) {
                                        i7 = 4;
                                        r8 = new kbu(optJSONObject2.getInt(CameraProperty.WIDTH), optJSONObject2.getInt(CameraProperty.HEIGHT), i7);
                                    }
                                    msgVar22.b("Unknown HDR type: %s", string3);
                                    i7 = 0;
                                    r8 = new kbu(optJSONObject2.getInt(CameraProperty.WIDTH), optJSONObject2.getInt(CameraProperty.HEIGHT), i7);
                                } else if (hashCode != 113729) {
                                    if (hashCode == 99136405 && string3.equals("hdr10")) {
                                        i7 = i5;
                                        r8 = new kbu(optJSONObject2.getInt(CameraProperty.WIDTH), optJSONObject2.getInt(CameraProperty.HEIGHT), i7);
                                    }
                                    msgVar22.b("Unknown HDR type: %s", string3);
                                    i7 = 0;
                                    r8 = new kbu(optJSONObject2.getInt(CameraProperty.WIDTH), optJSONObject2.getInt(CameraProperty.HEIGHT), i7);
                                } else {
                                    if (string3.equals("sdr")) {
                                        i7 = i4;
                                        r8 = new kbu(optJSONObject2.getInt(CameraProperty.WIDTH), optJSONObject2.getInt(CameraProperty.HEIGHT), i7);
                                    }
                                    msgVar22.b("Unknown HDR type: %s", string3);
                                    i7 = 0;
                                    r8 = new kbu(optJSONObject2.getInt(CameraProperty.WIDTH), optJSONObject2.getInt(CameraProperty.HEIGHT), i7);
                                }
                            } catch (JSONException e2) {
                                msgVar22.a(e2, "Error while creating a VideoInfo instance from JSON", new Object[0]);
                            }
                            r0 = this.t;
                            if ((r0 == 0 && r8 != 0) || (r0 != 0 && !r0.equals(r8))) {
                                this.t = r8;
                                i6 |= 64;
                            }
                            if (jSONObject2.has("breakInfo") && (mediaInfo2 = this.a) != null) {
                                mediaInfo2.e(jSONObject2.getJSONObject("breakInfo"));
                                i6 |= 2;
                            }
                            if (jSONObject2.has("queueData")) {
                                i8 = i6;
                            } else {
                                JSONObject jSONObject8 = jSONObject2.getJSONObject("queueData");
                                if (jSONObject8 == null) {
                                    JSONObject jSONObject9 = jSONObject3;
                                    r52 = jSONObject9;
                                    str4 = r52;
                                    str3 = str4;
                                    i8 = i6;
                                    i13 = 0;
                                    i12 = 0;
                                    optBoolean = false;
                                    i11 = 0;
                                    r2 = str3;
                                    r02 = jSONObject9;
                                } else {
                                    String a4 = d94.a(jSONObject8, ConnectableDevice.KEY_ID);
                                    String a5 = d94.a(jSONObject8, "entity");
                                    String optString = jSONObject8.optString("queueType");
                                    switch (optString.hashCode()) {
                                        case -1803151310:
                                            if (optString.equals("PODCAST_SERIES")) {
                                                i10 = 5;
                                                break;
                                            }
                                            i10 = 0;
                                            break;
                                        case -1758903120:
                                            if (optString.equals("RADIO_STATION")) {
                                                i10 = 4;
                                                break;
                                            }
                                            i10 = 0;
                                            break;
                                        case -1632865838:
                                            if (optString.equals("PLAYLIST")) {
                                                i10 = i5;
                                                break;
                                            }
                                            i10 = 0;
                                            break;
                                        case -1319760993:
                                            if (optString.equals("AUDIOBOOK")) {
                                                i10 = 3;
                                                break;
                                            }
                                            i10 = 0;
                                            break;
                                        case -1088524588:
                                            if (optString.equals("TV_SERIES")) {
                                                i10 = 6;
                                                break;
                                            }
                                            i10 = 0;
                                            break;
                                        case 62359119:
                                            if (optString.equals("ALBUM")) {
                                                i10 = i4;
                                                break;
                                            }
                                            i10 = 0;
                                            break;
                                        case 73549584:
                                            if (optString.equals("MOVIE")) {
                                                i10 = 9;
                                                break;
                                            }
                                            i10 = 0;
                                            break;
                                        case 393100598:
                                            if (optString.equals("VIDEO_PLAYLIST")) {
                                                i10 = 7;
                                                break;
                                            }
                                            i10 = 0;
                                            break;
                                        case 902303413:
                                            if (optString.equals("LIVE_TV")) {
                                                i10 = 8;
                                                break;
                                            }
                                            i10 = 0;
                                            break;
                                        default:
                                            i10 = 0;
                                            break;
                                    }
                                    String a6 = d94.a(jSONObject8, "name");
                                    JSONObject optJSONObject4 = jSONObject8.has("containerMetadata") ? jSONObject8.optJSONObject("containerMetadata") : jSONObject3;
                                    if (optJSONObject4 != null) {
                                        String optString2 = optJSONObject4.optString("containerType", "");
                                        int hashCode2 = optString2.hashCode();
                                        if (hashCode2 != 6924225) {
                                            if (hashCode2 == 828666841) {
                                                optString2.equals("GENERIC_CONTAINER");
                                            }
                                        } else if (optString2.equals("AUDIOBOOK_CONTAINER")) {
                                            i14 = i4;
                                            String a7 = d94.a(optJSONObject4, "title");
                                            optJSONArray = optJSONObject4.optJSONArray("sections");
                                            if (optJSONArray == null) {
                                                r3 = new ArrayList();
                                                i8 = i6;
                                                int i24 = 0;
                                                while (i24 < optJSONArray.length()) {
                                                    JSONObject optJSONObject5 = optJSONArray.optJSONObject(i24);
                                                    int i25 = i24;
                                                    if (optJSONObject5 != null) {
                                                        str5 = a4;
                                                        goh gohVar = new goh(0);
                                                        gohVar.e(optJSONObject5);
                                                        r3.add(gohVar);
                                                    } else {
                                                        str5 = a4;
                                                    }
                                                    i24 = i25 + 1;
                                                    a4 = str5;
                                                }
                                            } else {
                                                i8 = i6;
                                                r3 = jSONObject3;
                                            }
                                            str = a4;
                                            optJSONArray2 = optJSONObject4.optJSONArray("containerImages");
                                            if (optJSONArray2 == null) {
                                                ArrayList arrayList3 = new ArrayList();
                                                c0x.c(arrayList3, optJSONArray2);
                                                r42 = arrayList3;
                                            } else {
                                                r42 = jSONObject3;
                                            }
                                            str2 = a5;
                                            i11 = i10;
                                            double optDouble = optJSONObject4.optDouble("containerDuration", 0.0d);
                                            ?? aphVar = new aph();
                                            aphVar.a = i14;
                                            aphVar.b = a7;
                                            aphVar.c = r3;
                                            aphVar.d = r42;
                                            aphVar.e = optDouble;
                                            jSONObject4 = aphVar;
                                        }
                                        i14 = 0;
                                        String a72 = d94.a(optJSONObject4, "title");
                                        optJSONArray = optJSONObject4.optJSONArray("sections");
                                        if (optJSONArray == null) {
                                        }
                                        str = a4;
                                        optJSONArray2 = optJSONObject4.optJSONArray("containerImages");
                                        if (optJSONArray2 == null) {
                                        }
                                        str2 = a5;
                                        i11 = i10;
                                        double optDouble2 = optJSONObject4.optDouble("containerDuration", 0.0d);
                                        ?? aphVar2 = new aph();
                                        aphVar2.a = i14;
                                        aphVar2.b = a72;
                                        aphVar2.c = r3;
                                        aphVar2.d = r42;
                                        aphVar2.e = optDouble2;
                                        jSONObject4 = aphVar2;
                                    } else {
                                        i8 = i6;
                                        str = a4;
                                        str2 = a5;
                                        i11 = i10;
                                        jSONObject4 = jSONObject3;
                                    }
                                    Integer K = u1g.K(jSONObject8.optString("repeatMode"));
                                    int intValue = K != null ? K.intValue() : 0;
                                    JSONArray optJSONArray3 = jSONObject8.optJSONArray("items");
                                    if (optJSONArray3 != null) {
                                        r4 = new ArrayList();
                                        for (int i26 = 0; i26 < optJSONArray3.length(); i26++) {
                                            JSONObject optJSONObject6 = optJSONArray3.optJSONObject(i26);
                                            if (optJSONObject6 != null) {
                                                try {
                                                    r4.add(new cph(optJSONObject6));
                                                } catch (JSONException unused2) {
                                                }
                                            }
                                        }
                                    } else {
                                        r4 = jSONObject3;
                                    }
                                    int optInt3 = jSONObject8.optInt("startIndex", 0);
                                    long optDouble3 = jSONObject8.has("startTime") ? (long) (jSONObject8.optDouble("startTime", -1L) * d5) : -1L;
                                    str3 = a6;
                                    optBoolean = jSONObject8.optBoolean("shuffle");
                                    r02 = r4;
                                    long j8 = optDouble3;
                                    i12 = optInt3;
                                    i13 = intValue;
                                    j42 = j8;
                                    str4 = str2;
                                    r52 = str;
                                    r2 = jSONObject4;
                                }
                                bph bphVar = new bph();
                                bphVar.a = r52;
                                bphVar.b = str4;
                                bphVar.c = i11;
                                bphVar.d = str3;
                                bphVar.e = r2;
                                bphVar.f = i13;
                                bphVar.g = r02;
                                bphVar.h = i12;
                                bphVar.i = j42;
                                bphVar.j = optBoolean;
                                this.v = bphVar;
                                if (this.w != optBoolean) {
                                    this.w = optBoolean;
                                    i9 = i8 | 8;
                                    if (jSONObject2.has("liveSeekableRange")) {
                                        i9 |= 2;
                                        JSONObject optJSONObject7 = jSONObject2.optJSONObject("liveSeekableRange");
                                        Parcelable.Creator<aoh> creator3 = aoh.CREATOR;
                                        if (optJSONObject7 != null && optJSONObject7.has("start") && optJSONObject7.has("end")) {
                                            try {
                                                double d6 = optJSONObject7.getDouble("start");
                                                Pattern pattern4 = d94.a;
                                                aohVar = new aoh((long) (d6 * d5), (long) (optJSONObject7.getDouble("end") * d5), optJSONObject7.optBoolean("isMovingWindow"), optJSONObject7.optBoolean("isLiveDone"));
                                            } catch (JSONException unused3) {
                                                msg msgVar4 = aoh.e;
                                                Log.e(msgVar4.a, msgVar4.d("Ignoring Malformed MediaLiveSeekableRange: ".concat(optJSONObject7.toString()), new Object[0]));
                                            }
                                            this.u = aohVar;
                                        }
                                        aohVar = jSONObject3;
                                        this.u = aohVar;
                                    } else {
                                        if (this.u != null) {
                                            i9 |= 2;
                                        }
                                        this.u = jSONObject3;
                                    }
                                    return i9;
                                }
                            }
                            i9 = i8;
                            if (jSONObject2.has("liveSeekableRange")) {
                            }
                            return i9;
                        }
                        r8 = jSONObject3;
                        r0 = this.t;
                        if (r0 == 0) {
                            this.t = r8;
                            i6 |= 64;
                            if (jSONObject2.has("breakInfo")) {
                                mediaInfo2.e(jSONObject2.getJSONObject("breakInfo"));
                                i6 |= 2;
                            }
                            if (jSONObject2.has("queueData")) {
                            }
                            i9 = i8;
                            if (jSONObject2.has("liveSeekableRange")) {
                            }
                            return i9;
                        }
                        this.t = r8;
                        i6 |= 64;
                        if (jSONObject2.has("breakInfo")) {
                        }
                        if (jSONObject2.has("queueData")) {
                        }
                        i9 = i8;
                        if (jSONObject2.has("liveSeekableRange")) {
                        }
                        return i9;
                    }
                    yiVar = jSONObject3;
                    r5 = this.s;
                    if (r5 == 0) {
                        this.r = (yiVar != 0 || (yiVar.c == null && yiVar.d == null)) ? 0 : i4;
                        this.s = yiVar;
                        i6 |= 32;
                        optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                        msg msgVar222 = kbu.d;
                        if (optJSONObject2 != null) {
                        }
                        r8 = jSONObject3;
                        r0 = this.t;
                        if (r0 == 0) {
                        }
                        this.t = r8;
                        i6 |= 64;
                        if (jSONObject2.has("breakInfo")) {
                        }
                        if (jSONObject2.has("queueData")) {
                        }
                        i9 = i8;
                        if (jSONObject2.has("liveSeekableRange")) {
                        }
                        return i9;
                    }
                    this.r = (yiVar != 0 || (yiVar.c == null && yiVar.d == null)) ? 0 : i4;
                    this.s = yiVar;
                    i6 |= 32;
                    optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                    msg msgVar2222 = kbu.d;
                    if (optJSONObject2 != null) {
                    }
                    r8 = jSONObject3;
                    r0 = this.t;
                    if (r0 == 0) {
                    }
                    this.t = r8;
                    i6 |= 64;
                    if (jSONObject2.has("breakInfo")) {
                    }
                    if (jSONObject2.has("queueData")) {
                    }
                    i9 = i8;
                    if (jSONObject2.has("liveSeekableRange")) {
                    }
                    return i9;
                }
            }
            if (jSONObject2.has("repeatMode")) {
                Integer K2 = u1g.K(jSONObject2.getString("repeatMode"));
                int intValue2 = K2 == null ? this.p : K2.intValue();
                if (this.p != intValue2) {
                    this.p = intValue2;
                    z = true;
                    if (jSONObject2.has("items")) {
                        JSONArray jSONArray2 = jSONObject2.getJSONArray("items");
                        int length = jSONArray2.length();
                        SparseArray sparseArray2 = new SparseArray();
                        i4 = 1;
                        int i27 = 0;
                        while (i27 < length) {
                            sparseArray2.put(i27, Integer.valueOf(jSONArray2.getJSONObject(i27).getInt("itemId")));
                            i27++;
                            i16 = i16;
                        }
                        i5 = i16;
                        ArrayList arrayList4 = new ArrayList();
                        int i28 = 0;
                        while (i28 < length) {
                            Integer num = (Integer) sparseArray2.get(i28);
                            ?? r38 = jSONObject6;
                            JSONObject jSONObject10 = jSONArray2.getJSONObject(i28);
                            Integer num2 = (Integer) sparseArray.get(num.intValue());
                            cph cphVar = num2 == null ? r38 : (cph) arrayList2.get(num2.intValue());
                            if (cphVar != null) {
                                z |= cphVar.a(jSONObject10);
                                arrayList4.add(cphVar);
                                if (i28 == ((Integer) sparseArray.get(num.intValue())).intValue()) {
                                    i28++;
                                    jSONObject6 = r38;
                                }
                            } else if (num.intValue() != this.c || (mediaInfo = this.a) == null) {
                                arrayList4.add(new cph(jSONObject10));
                            } else {
                                h4b h4bVar = new h4b();
                                cph cphVar2 = new cph(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
                                if (mediaInfo == null) {
                                    xq0.x("media cannot be null.");
                                    throw r38;
                                }
                                h4bVar.a = cphVar2;
                                cph f = h4bVar.f();
                                f.a(jSONObject10);
                                arrayList4.add(f);
                            }
                            z = true;
                            i28++;
                            jSONObject6 = r38;
                        }
                        jSONObject3 = jSONObject6;
                        z |= !(arrayList2.size() == length);
                        b(arrayList4);
                    } else {
                        i4 = 1;
                        i5 = 2;
                        jSONObject3 = null;
                    }
                    if (z) {
                        i2 |= 8;
                    }
                    i6 = i2;
                    optJSONObject = jSONObject2.optJSONObject("breakStatus");
                    Parcelable.Creator<yi> creator22 = yi.CREATOR;
                    long j422 = -1;
                    if (optJSONObject != null) {
                    }
                    yiVar = jSONObject3;
                    r5 = this.s;
                    if (r5 == 0) {
                    }
                    this.r = (yiVar != 0 || (yiVar.c == null && yiVar.d == null)) ? 0 : i4;
                    this.s = yiVar;
                    i6 |= 32;
                    optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                    msg msgVar22222 = kbu.d;
                    if (optJSONObject2 != null) {
                    }
                    r8 = jSONObject3;
                    r0 = this.t;
                    if (r0 == 0) {
                    }
                    this.t = r8;
                    i6 |= 64;
                    if (jSONObject2.has("breakInfo")) {
                    }
                    if (jSONObject2.has("queueData")) {
                    }
                    i9 = i8;
                    if (jSONObject2.has("liveSeekableRange")) {
                    }
                    return i9;
                }
            }
            z = false;
            if (jSONObject2.has("items")) {
            }
            if (z) {
            }
            i6 = i2;
            optJSONObject = jSONObject2.optJSONObject("breakStatus");
            Parcelable.Creator<yi> creator222 = yi.CREATOR;
            long j4222 = -1;
            if (optJSONObject != null) {
            }
            yiVar = jSONObject3;
            r5 = this.s;
            if (r5 == 0) {
            }
            this.r = (yiVar != 0 || (yiVar.c == null && yiVar.d == null)) ? 0 : i4;
            this.s = yiVar;
            i6 |= 32;
            optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
            msg msgVar222222 = kbu.d;
            if (optJSONObject2 != null) {
            }
            r8 = jSONObject3;
            r0 = this.t;
            if (r0 == 0) {
            }
            this.t = r8;
            i6 |= 64;
            if (jSONObject2.has("breakInfo")) {
            }
            if (jSONObject2.has("queueData")) {
            }
            i9 = i8;
            if (jSONObject2.has("liveSeekableRange")) {
            }
            return i9;
        }
        jSONObject2 = jSONObject;
        j = jSONObject2.getLong("mediaSessionId");
        if (j == this.b) {
        }
        int i162 = 2;
        if (jSONObject2.has("playerState")) {
        }
        if (jSONObject2.has("playbackRate")) {
        }
        if (jSONObject2.has("currentTime")) {
        }
        if (jSONObject2.has("supportedMediaCommands")) {
        }
        if (jSONObject2.has("volume")) {
        }
        d = 1000.0d;
        JSONObject jSONObject62 = null;
        if (!jSONObject2.has("activeTrackIds")) {
        }
        Pattern pattern22 = d94.a;
        if (jSONArray != null) {
        }
        long[] jArr22 = this.k;
        if (jArr == null) {
        }
        if (jSONObject2.has("customData")) {
        }
        if (jSONObject2.has("media")) {
        }
        if (jSONObject2.has("currentItemId")) {
            this.c = i15;
            i2 |= 2;
        }
        optInt = jSONObject2.optInt("preloadedItemId", 0);
        if (this.m != optInt) {
        }
        optInt2 = jSONObject2.optInt("loadingItemId", 0);
        if (this.l != optInt2) {
        }
        MediaInfo mediaInfo52 = this.a;
        if (mediaInfo52 != null) {
        }
        i3 = this.e;
        int i222 = this.f;
        int i232 = this.l;
        SparseArray sparseArray3 = this.x;
        ArrayList arrayList22 = this.q;
        double d52 = d;
        if (i3 == 1) {
        }
        if (jSONObject2.has("repeatMode")) {
        }
        z = false;
        if (jSONObject2.has("items")) {
        }
        if (z) {
        }
        i6 = i2;
        optJSONObject = jSONObject2.optJSONObject("breakStatus");
        Parcelable.Creator<yi> creator2222 = yi.CREATOR;
        long j42222 = -1;
        if (optJSONObject != null) {
        }
        yiVar = jSONObject3;
        r5 = this.s;
        if (r5 == 0) {
        }
        this.r = (yiVar != 0 || (yiVar.c == null && yiVar.d == null)) ? 0 : i4;
        this.s = yiVar;
        i6 |= 32;
        optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
        msg msgVar2222222 = kbu.d;
        if (optJSONObject2 != null) {
        }
        r8 = jSONObject3;
        r0 = this.t;
        if (r0 == 0) {
        }
        this.t = r8;
        i6 |= 64;
        if (jSONObject2.has("breakInfo")) {
        }
        if (jSONObject2.has("queueData")) {
        }
        i9 = i8;
        if (jSONObject2.has("liveSeekableRange")) {
        }
        return i9;
    }

    public final void b(List list) {
        ArrayList arrayList = this.q;
        arrayList.clear();
        SparseArray sparseArray = this.x;
        sparseArray.clear();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                cph cphVar = (cph) list.get(i);
                arrayList.add(cphVar);
                sparseArray.put(cphVar.b, Integer.valueOf(i));
            }
        }
    }

    public final boolean equals(Object obj) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (this != obj) {
            if (obj instanceof owh) {
                owh owhVar = (owh) obj;
                if ((this.o == null) == (owhVar.o == null) && this.b == owhVar.b && this.c == owhVar.c && this.d == owhVar.d && this.e == owhVar.e && this.f == owhVar.f && this.g == owhVar.g && this.i == owhVar.i && this.j == owhVar.j && this.l == owhVar.l && this.m == owhVar.m && this.p == owhVar.p && Arrays.equals(this.k, owhVar.k) && d94.d(Long.valueOf(this.h), Long.valueOf(owhVar.h)) && d94.d(this.q, owhVar.q) && d94.d(this.a, owhVar.a) && (((jSONObject = this.o) == null || (jSONObject2 = owhVar.o) == null || o7f.a(jSONObject, jSONObject2)) && this.r == owhVar.r && d94.d(this.s, owhVar.s) && d94.d(this.t, owhVar.t) && d94.d(this.u, owhVar.u) && ldg.s(this.v, owhVar.v) && this.w == owhVar.w)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), Integer.valueOf(this.c), Double.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Long.valueOf(this.g), Long.valueOf(this.h), Double.valueOf(this.i), Boolean.valueOf(this.j), Integer.valueOf(Arrays.hashCode(this.k)), Integer.valueOf(this.l), Integer.valueOf(this.m), String.valueOf(this.o), Integer.valueOf(this.p), this.q, Boolean.valueOf(this.r), this.s, this.t, this.u, this.v});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.o;
        this.n = jSONObject == null ? null : jSONObject.toString();
        int o0 = o8g.o0(parcel, 20293);
        o8g.i0(parcel, 2, this.a, i);
        long j = this.b;
        o8g.q0(3, 8, parcel);
        parcel.writeLong(j);
        int i2 = this.c;
        o8g.q0(4, 4, parcel);
        parcel.writeInt(i2);
        double d = this.d;
        o8g.q0(5, 8, parcel);
        parcel.writeDouble(d);
        int i3 = this.e;
        o8g.q0(6, 4, parcel);
        parcel.writeInt(i3);
        int i4 = this.f;
        o8g.q0(7, 4, parcel);
        parcel.writeInt(i4);
        long j2 = this.g;
        o8g.q0(8, 8, parcel);
        parcel.writeLong(j2);
        long j3 = this.h;
        o8g.q0(9, 8, parcel);
        parcel.writeLong(j3);
        double d2 = this.i;
        o8g.q0(10, 8, parcel);
        parcel.writeDouble(d2);
        boolean z = this.j;
        o8g.q0(11, 4, parcel);
        parcel.writeInt(z ? 1 : 0);
        o8g.h0(parcel, 12, this.k);
        int i5 = this.l;
        o8g.q0(13, 4, parcel);
        parcel.writeInt(i5);
        int i6 = this.m;
        o8g.q0(14, 4, parcel);
        parcel.writeInt(i6);
        o8g.j0(parcel, 15, this.n);
        int i7 = this.p;
        o8g.q0(16, 4, parcel);
        parcel.writeInt(i7);
        o8g.n0(parcel, 17, this.q);
        boolean z2 = this.r;
        o8g.q0(18, 4, parcel);
        parcel.writeInt(z2 ? 1 : 0);
        o8g.i0(parcel, 19, this.s, i);
        o8g.i0(parcel, 20, this.t, i);
        o8g.i0(parcel, 21, this.u, i);
        o8g.i0(parcel, 22, this.v, i);
        o8g.p0(parcel, o0);
    }
}
