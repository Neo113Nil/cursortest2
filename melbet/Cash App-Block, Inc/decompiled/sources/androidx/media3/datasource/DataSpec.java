package androidx.media3.datasource;

import android.net.Uri;
import androidx.media3.common.MediaLibraryInfo;
import androidx.tracing.Trace;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class DataSpec {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final int flags;
    public final byte[] httpBody;
    public final int httpMethod;
    public final Map httpRequestHeaders;
    public final long length;
    public final long position;
    public final Uri uri;

    static {
        MediaLibraryInfo.registerModule("media3.datasource");
    }

    public DataSpec(Uri uri, int i, byte[] bArr, Map map, long j, long j2, int i2) {
        Trace.checkArgument(j >= 0);
        Trace.checkArgument(j >= 0);
        Trace.checkArgument(j2 > 0 || j2 == -1);
        uri.getClass();
        this.uri = uri;
        this.httpMethod = i;
        this.httpBody = (bArr == null || bArr.length == 0) ? null : bArr;
        this.httpRequestHeaders = Collections.unmodifiableMap(new HashMap(map));
        this.position = j;
        this.length = j2;
        this.flags = i2;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        int i = this.httpMethod;
        if (i == 1) {
            str = "GET";
        } else if (i == 2) {
            str = "POST";
        } else {
            if (i != 3) {
                Path$$ExternalSyntheticBUOutline0.m();
                return null;
            }
            str = "HEAD";
        }
        sb.append(str);
        sb.append(" ");
        sb.append(this.uri);
        sb.append(", ");
        sb.append(this.position);
        sb.append(", ");
        sb.append(this.length);
        sb.append(", null, ");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.flags, "]", sb);
    }
}
