package defpackage;

import android.util.Log;
import com.google.android.gms.cast.MediaInfo;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class r1x extends o3x {
    public final /* synthetic */ int r;
    public final /* synthetic */ xun s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1x(xun xunVar, int[] iArr) {
        super(xunVar, true);
        this.r = 0;
        this.t = iArr;
        this.s = xunVar;
    }

    @Override // defpackage.o3x
    public final void l() {
        int i = this.r;
        int i2 = 0;
        Object obj = this.t;
        xun xunVar = this.s;
        switch (i) {
            case 0:
                w1x w1xVar = xunVar.c;
                c2x m = m();
                int[] iArr = (int[]) obj;
                w1xVar.getClass();
                JSONObject jSONObject = new JSONObject();
                long l = w1xVar.l();
                try {
                    jSONObject.put("requestId", l);
                    jSONObject.put("type", "QUEUE_GET_ITEMS");
                    jSONObject.put("mediaSessionId", w1xVar.o());
                    JSONArray jSONArray = new JSONArray();
                    int length = iArr.length;
                    while (i2 < length) {
                        jSONArray.put(iArr[i2]);
                        i2++;
                    }
                    jSONObject.put("itemIds", jSONArray);
                } catch (JSONException unused) {
                }
                w1xVar.m(l, jSONObject.toString());
                w1xVar.t.a(l, m);
                break;
            case 1:
                w1x w1xVar2 = xunVar.c;
                c2x m2 = m();
                coh cohVar = (coh) obj;
                w1xVar2.getClass();
                MediaInfo mediaInfo = cohVar.a;
                bph bphVar = cohVar.b;
                if (mediaInfo != null || bphVar != null) {
                    long[] jArr = cohVar.f;
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        MediaInfo mediaInfo2 = cohVar.a;
                        if (mediaInfo2 != null) {
                            jSONObject2.put("media", mediaInfo2.d());
                        }
                        if (bphVar != null) {
                            jSONObject2.put("queueData", bphVar.d());
                        }
                        jSONObject2.putOpt("autoplay", cohVar.c);
                        long j = cohVar.d;
                        if (j != -1) {
                            Pattern pattern = d94.a;
                            jSONObject2.put("currentTime", j / 1000.0d);
                        }
                        jSONObject2.put("playbackRate", cohVar.e);
                        jSONObject2.putOpt("credentials", cohVar.i);
                        jSONObject2.putOpt("credentialsType", cohVar.j);
                        jSONObject2.putOpt("atvCredentials", cohVar.k);
                        jSONObject2.putOpt("atvCredentialsType", cohVar.l);
                        if (jArr != null) {
                            JSONArray jSONArray2 = new JSONArray();
                            while (i2 < jArr.length) {
                                jSONArray2.put(i2, jArr[i2]);
                                i2++;
                            }
                            jSONObject2.put("activeTrackIds", jSONArray2);
                        }
                        jSONObject2.putOpt("customData", cohVar.h);
                        jSONObject2.put("requestId", cohVar.m);
                    } catch (JSONException e) {
                        msg msgVar = coh.n;
                        Log.e(msgVar.a, msgVar.d("Error transforming MediaLoadRequestData into JSONObject", e));
                        jSONObject2 = new JSONObject();
                    }
                    long l2 = w1xVar2.l();
                    try {
                        jSONObject2.put("requestId", l2);
                        jSONObject2.put("type", "LOAD");
                    } catch (JSONException unused2) {
                    }
                    w1xVar2.m(l2, jSONObject2.toString());
                    w1xVar2.j.a(l2, m2);
                    break;
                } else {
                    xq0.x("MediaInfo and MediaQueueData should not be both null");
                    break;
                }
            default:
                w1x w1xVar3 = xunVar.c;
                c2x m3 = m();
                w1xVar3.getClass();
                JSONObject jSONObject3 = new JSONObject();
                long l3 = w1xVar3.l();
                long j2 = ((rrh) obj).a;
                try {
                    jSONObject3.put("requestId", l3);
                    jSONObject3.put("type", "SEEK");
                    jSONObject3.put("mediaSessionId", w1xVar3.o());
                    Pattern pattern2 = d94.a;
                    jSONObject3.put("currentTime", j2 / 1000.0d);
                } catch (JSONException unused3) {
                }
                w1xVar3.m(l3, jSONObject3.toString());
                w1xVar3.g = Long.valueOf(j2);
                w1xVar3.n.a(l3, new rjp(w1xVar3, m3, false));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r1x(xun xunVar, Object obj, int i) {
        super(xunVar, false);
        this.r = i;
        this.t = obj;
        this.s = xunVar;
    }
}
