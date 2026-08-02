package io.appmetrica.analytics.push.model;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import io.appmetrica.analytics.push.coreutils.internal.utils.CoreUtils;
import io.appmetrica.analytics.push.coreutils.internal.utils.JsonUtils;
import io.appmetrica.analytics.push.impl.C1092z;
import io.appmetrica.analytics.push.impl.H2;
import io.appmetrica.analytics.push.logger.internal.PublicLogger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes4.dex */
public class PushNotification {
    private final String A;
    private Bitmap B;
    private final Integer C;
    private final String D;
    private Bitmap E;
    private final boolean F;
    private final Integer G;
    private final AdditionalAction[] H;
    private final String I;
    private final Boolean J;
    private final Long K;
    private final Long L;
    private final boolean M;
    private final OpenType N;
    private final Context O;
    private final C1092z P;
    private final String a;
    private final Integer b;
    private final String c;
    private final Boolean d;
    private final Integer e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final Integer k;
    private final String l;
    private final Boolean m;
    private final LedLights n;
    private final Integer o;
    private final Boolean p;
    private final Boolean q;
    private final Integer r;
    private final long s;
    private final Boolean t;
    private final String u;
    private final long[] v;
    private final Integer w;
    private final String x;
    private final Integer y;
    private final Integer z;

    public PushNotification(Context context, JSONObject jSONObject, C1092z c1092z) {
        this.O = context;
        this.P = c1092z;
        this.a = jSONObject.optString("ag");
        this.b = JsonUtils.extractIntegerSafely(jSONObject, "a");
        this.c = jSONObject.optString("b");
        this.d = JsonUtils.extractBooleanSafely(jSONObject, "c");
        this.e = JsonUtils.extractIntegerSafely(jSONObject, "d");
        this.f = jSONObject.optString("e");
        this.g = jSONObject.optString("f");
        this.h = jSONObject.optString("g");
        this.i = jSONObject.optString("h");
        this.j = jSONObject.optString(CoreConstants.PushMessage.SERVICE_TYPE);
        this.k = JsonUtils.extractIntegerSafely(jSONObject, CoreConstants.PushMessage.PROCESSING_MIN_TIME);
        this.l = jSONObject.optString("k");
        this.m = JsonUtils.extractBooleanSafely(jSONObject, "l");
        this.n = a(jSONObject);
        this.o = JsonUtils.extractIntegerSafely(jSONObject, "n");
        this.p = JsonUtils.extractBooleanSafely(jSONObject, "o");
        this.q = JsonUtils.extractBooleanSafely(jSONObject, "p");
        this.r = JsonUtils.extractIntegerSafely(jSONObject, "q");
        this.s = jSONObject.optLong("r", System.currentTimeMillis());
        this.t = JsonUtils.extractBooleanSafely(jSONObject, "s");
        this.u = jSONObject.optString("t");
        this.v = b(jSONObject);
        this.w = JsonUtils.extractIntegerSafely(jSONObject, "v");
        this.y = H2.a(context, jSONObject.optString(RemoteBioParameters.X));
        this.A = jSONObject.optString(RemoteBioParameters.Y);
        this.D = jSONObject.optString("aa");
        this.F = jSONObject.optInt("ab", 0) == 1;
        this.G = H2.b(context, jSONObject.optString("ai"));
        this.x = jSONObject.optString("w");
        this.H = a(context, jSONObject);
        this.I = jSONObject.optString("ac");
        this.J = JsonUtils.extractBooleanSafely(jSONObject, "ad");
        this.z = H2.a(context, jSONObject.optString("ae"));
        this.C = H2.a(context, jSONObject.optString("af"));
        this.K = JsonUtils.extractLongSafely(jSONObject, "ah");
        this.L = JsonUtils.extractLongSafely(jSONObject, "aj");
        this.M = JsonUtils.optBoolean(jSONObject, "ak", true);
        this.N = c(jSONObject);
    }

    private static Bitmap a(Context context, C1092z c1092z, Integer num, String str, float f, float f2) {
        Bitmap bitmap;
        if (num != null) {
            PublicLogger.INSTANCE.info("Get bitmap from resources with id: %d", num);
            float f3 = context.getResources().getDisplayMetrics().density;
            Drawable a = H2.a(context, num);
            if (a != null) {
                Rect bounds = a.getBounds();
                float f4 = f * f3;
                float f5 = f3 * f2;
                if (f5 <= 0.0f || f4 <= 0.0f) {
                    int intrinsicWidth = a.getIntrinsicWidth();
                    int intrinsicHeight = a.getIntrinsicHeight();
                    if (intrinsicWidth <= 0) {
                        intrinsicWidth = bounds.width();
                    }
                    if (intrinsicHeight <= 0) {
                        intrinsicHeight = bounds.height();
                    }
                    if (f5 <= 0.0f && f4 <= 0.0f) {
                        f4 = intrinsicWidth;
                        f5 = intrinsicHeight;
                    } else if (f5 <= 0.0f && f4 > 0.0f && intrinsicWidth > 0) {
                        f5 = (intrinsicHeight * f4) / intrinsicWidth;
                    } else if (f5 > 0.0f && f4 <= 0.0f && intrinsicHeight > 0) {
                        f4 = (intrinsicWidth * f5) / intrinsicHeight;
                    }
                }
                if (f4 > 0.0f && f5 > 0.0f) {
                    bitmap = Bitmap.createBitmap((int) f4, (int) f5, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmap);
                    a.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    a.draw(canvas);
                    a.setBounds(bounds);
                    if (bitmap == null || CoreUtils.isEmpty(str)) {
                        return bitmap;
                    }
                    PublicLogger.INSTANCE.info("Download bitmap for url: %s", str);
                    c1092z.getClass();
                    float f6 = context.getResources().getDisplayMetrics().density;
                    float f7 = f * f6;
                    float f8 = f6 * f2;
                    byte[] a2 = c1092z.a.a(str);
                    if (a2 == null) {
                        return null;
                    }
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeByteArray(a2, 0, a2.length, options);
                    float max = Math.max(f > 0.0f ? options.outWidth / f7 : 1.0f, f2 > 0.0f ? options.outHeight / f8 : 1.0f);
                    options.inJustDecodeBounds = false;
                    options.inSampleSize = Math.round(max);
                    return BitmapFactory.decodeByteArray(a2, 0, a2.length, options);
                }
            }
        }
        bitmap = null;
        if (bitmap == null) {
        }
        return bitmap;
    }

    private static long[] b(JSONObject jSONObject) {
        if (jSONObject.has("u")) {
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("u");
                long[] jArr = new long[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    jArr[i] = jSONArray.getLong(i);
                }
                return jArr;
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    private static OpenType c(JSONObject jSONObject) {
        OpenType openType = OpenType.UNKNOWN;
        Integer extractIntegerSafely = JsonUtils.extractIntegerSafely(jSONObject, "al");
        return extractIntegerSafely != null ? OpenType.fromValue(extractIntegerSafely.intValue()) : openType;
    }

    public AdditionalAction[] getAdditionalActions() {
        return this.H;
    }

    public Boolean getAutoCancel() {
        return this.d;
    }

    public String getCategory() {
        return this.c;
    }

    public String getChannelId() {
        return this.I;
    }

    public Integer getColor() {
        return this.e;
    }

    public String getContentInfo() {
        return this.g;
    }

    public String getContentSubtext() {
        return this.i;
    }

    public String getContentText() {
        return this.h;
    }

    public String getContentTitle() {
        return this.f;
    }

    public Integer getDefaults() {
        return this.k;
    }

    public Integer getDisplayedNumber() {
        return this.o;
    }

    public Boolean getExplicitIntent() {
        return this.J;
    }

    public String getGroup() {
        return this.l;
    }

    public Boolean getGroupSummary() {
        return this.m;
    }

    public Integer getIconResId() {
        return this.y;
    }

    public Bitmap getLargeBitmap() {
        if (this.E == null) {
            this.E = a(this.O, this.P, this.C, this.D, -1.0f, -1.0f);
        }
        return this.E;
    }

    public Integer getLargeBitmapResId() {
        return this.C;
    }

    public String getLargeBitmapUrl() {
        return this.D;
    }

    public Bitmap getLargeIcon() {
        if (this.B == null) {
            this.B = a(this.O, this.P, this.z, this.A, this.O.getResources().getDimension(R.dimen.notification_large_icon_width), this.O.getResources().getDimension(R.dimen.notification_large_icon_height));
        }
        return this.B;
    }

    public Integer getLargeIconResId() {
        return this.z;
    }

    public String getLargeIconUrl() {
        return this.A;
    }

    public LedLights getLedLights() {
        return this.n;
    }

    public Integer getNotificationId() {
        return this.b;
    }

    public String getNotificationTag() {
        return this.a;
    }

    public Long getNotificationTtl() {
        return this.K;
    }

    public Boolean getOngoing() {
        return this.p;
    }

    public Boolean getOnlyAlertOnce() {
        return this.q;
    }

    public String getOpenActionUrl() {
        return this.x;
    }

    public OpenType getOpenType() {
        return this.N;
    }

    public Integer getPriority() {
        return this.r;
    }

    public Boolean getShowWhen() {
        return this.t;
    }

    public String getSortKey() {
        return this.u;
    }

    public Integer getSoundResId() {
        return this.G;
    }

    public Uri getSoundUri() {
        if (this.G == null) {
            return null;
        }
        Resources resources = this.O.getResources();
        return new Uri.Builder().scheme("android.resource").authority(resources.getResourcePackageName(this.G.intValue())).appendPath(resources.getResourceTypeName(this.G.intValue())).appendPath(resources.getResourceEntryName(this.G.intValue())).build();
    }

    public String getTicker() {
        return this.j;
    }

    public Long getTimeToHideMillis() {
        return this.L;
    }

    public boolean getUseFlagActivityNewTask() {
        return this.M;
    }

    public long[] getVibrate() {
        return this.v;
    }

    public Integer getVisibility() {
        return this.w;
    }

    public Long getWhen() {
        return Long.valueOf(this.s);
    }

    public boolean isSoundEnabled() {
        return this.F;
    }

    private static AdditionalAction[] a(Context context, JSONObject jSONObject) {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("z");
            AdditionalAction[] additionalActionArr = new AdditionalAction[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                additionalActionArr[i] = new AdditionalAction(context, jSONArray.getJSONObject(i));
            }
            return additionalActionArr;
        } catch (JSONException unused) {
            return null;
        }
    }

    private static LedLights a(JSONObject jSONObject) {
        if (!jSONObject.has("m")) {
            return null;
        }
        try {
            return new LedLights(jSONObject.getJSONObject("m"));
        } catch (JSONException unused) {
            return null;
        }
    }

    public PushNotification(Context context, JSONObject jSONObject) {
        this(context, jSONObject, new C1092z(context));
    }
}
