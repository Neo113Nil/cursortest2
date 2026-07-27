package kotlin.text;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class CatchingFishMVPRecyclerView {
    public static final /* synthetic */ int CatchingFishDaggerWebsocket = 0;
    public static final long CatchingFishReduxKtor = TimeUnit.DAYS.toMillis(7);
    public final long CatchingFishCoroutine;
    public final String CatchingFishParcelableFAB;
    public final String CatchingFishSnackbar;

    public CatchingFishMVPRecyclerView(String str, String str2, long j) {
        this.CatchingFishParcelableFAB = str;
        this.CatchingFishSnackbar = str2;
        this.CatchingFishCoroutine = j;
    }

    public static CatchingFishMVPRecyclerView CatchingFishParcelableFAB(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new CatchingFishMVPRecyclerView(str, null, 0L);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new CatchingFishMVPRecyclerView(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e) {
            e.toString();
            return null;
        }
    }
}
