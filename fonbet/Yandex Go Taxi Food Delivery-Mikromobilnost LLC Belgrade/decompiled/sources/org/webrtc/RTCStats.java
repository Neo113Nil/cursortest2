package org.webrtc;

import defpackage.qv10;
import java.util.Map;
import ru.CryptoPro.JCP.VMInspector.OpenList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public class RTCStats {
    private final String id;
    private final Map<String, Object> members;
    private final long timestampUs;
    private final String type;

    public RTCStats(long j, String str, String str2, Map<String, Object> map) {
        this.timestampUs = j;
        this.type = str;
        this.id = str2;
        this.members = map;
    }

    private static void appendValue(StringBuilder sb, Object obj) {
        if (!(obj instanceof Object[])) {
            if (!(obj instanceof String)) {
                sb.append(obj);
                return;
            }
            sb.append(OpenList.CHAR_QUOTE);
            sb.append(obj);
            sb.append(OpenList.CHAR_QUOTE);
            return;
        }
        Object[] objArr = (Object[]) obj;
        sb.append('[');
        for (int i = 0; i < objArr.length; i++) {
            if (i != 0) {
                sb.append(Extension.FIX_SPACE);
            }
            appendValue(sb, objArr[i]);
        }
        sb.append(']');
    }

    public static RTCStats create(long j, String str, String str2, Map map) {
        return new RTCStats(j, str, str2, map);
    }

    public String getId() {
        return this.id;
    }

    public Map<String, Object> getMembers() {
        return this.members;
    }

    public double getTimestampUs() {
        return this.timestampUs;
    }

    public String getType() {
        return this.type;
    }

    public String toString() {
        StringBuilder t = qv10.t("{ timestampUs: ");
        t.append(this.timestampUs);
        t.append(", type: ");
        t.append(this.type);
        t.append(", id: ");
        t.append(this.id);
        for (Map.Entry<String, Object> entry : this.members.entrySet()) {
            t.append(Extension.FIX_SPACE);
            t.append(entry.getKey());
            t.append(Extension.COLON_SPACE);
            appendValue(t, entry.getValue());
        }
        t.append(" }");
        return t.toString();
    }
}
