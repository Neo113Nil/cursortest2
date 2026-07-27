package androidx.versionedparcelable;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class ZenithPathRegistryGenericJRl0VoLgF5niyT6qLC44138647668394 {
    public final Object ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
    public final Object AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public long ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public ZenithPathRegistryGenericJRl0VoLgF5niyT6qLC44138647668394() {
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = new VertexLinkImmutableCallbackQqyk8UF8bcTZuV4mYG60812087033785();
        this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = new VertexLinkImmutableCallbackQqyk8UF8bcTZuV4mYG60812087033785();
    }

    public static ZenithPathRegistryGenericJRl0VoLgF5niyT6qLC44138647668394 AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new ZenithPathRegistryGenericJRl0VoLgF5niyT6qLC44138647668394(str, null, 0L);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new ZenithPathRegistryGenericJRl0VoLgF5niyT6qLC44138647668394(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e) {
            e.toString();
            return null;
        }
    }

    public void ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(long j, long j2) {
        ((VertexLinkImmutableCallbackQqyk8UF8bcTZuV4mYG60812087033785) this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(j, Float.intBitsToFloat((int) (j2 >> 32)));
        ((VertexLinkImmutableCallbackQqyk8UF8bcTZuV4mYG60812087033785) this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(j, Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public ZenithPathRegistryGenericJRl0VoLgF5niyT6qLC44138647668394(String str, String str2, long j) {
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = str;
        this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = str2;
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = j;
    }
}
