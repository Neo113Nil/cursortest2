package io.appmetrica.analytics.push.model;

import android.location.Location;
import io.appmetrica.analytics.push.coreutils.internal.utils.JsonUtils;
import io.appmetrica.analytics.push.coreutils.internal.utils.TrackersHub;
import io.appmetrica.analytics.push.logger.internal.PublicLogger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class Coordinates {
    private final Integer a;
    private final List b;

    public Coordinates(JSONObject jSONObject) {
        this.a = JsonUtils.extractIntegerSafely(jSONObject, "r");
        ArrayList a = a(jSONObject);
        this.b = a == null ? null : Collections.unmodifiableList(a);
    }

    private static ArrayList a(JSONObject jSONObject) {
        Location location;
        if (jSONObject.has("p")) {
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("p");
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONArray optJSONArray = jSONArray.optJSONArray(i);
                    if (optJSONArray != null) {
                        try {
                            location = new Location("");
                            location.setLatitude(optJSONArray.getDouble(0));
                            location.setLongitude(optJSONArray.getDouble(1));
                        } catch (JSONException e) {
                            PublicLogger.INSTANCE.error(e, "Error parsing location point", new Object[0]);
                            TrackersHub.getInstance().reportError("Error parsing location point", e);
                        }
                        arrayList.add(location);
                    }
                    location = null;
                    arrayList.add(location);
                }
                return arrayList;
            } catch (JSONException e2) {
                PublicLogger.INSTANCE.error(e2, "Error parsing location points", new Object[0]);
                TrackersHub.getInstance().reportError("Error parsing location points", e2);
            }
        }
        return null;
    }

    public List<Location> getPoints() {
        return this.b;
    }

    public Integer getRadius() {
        return this.a;
    }
}
