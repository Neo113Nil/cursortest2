package androidx.media3.common;

import android.text.TextUtils;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.tracing.Trace;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class TrackGroup {
    public final Format[] formats;
    public int hashCode;
    public final String id;
    public final int length;

    /* renamed from: type, reason: collision with root package name */
    public final int f871type;

    static {
        Util.intToStringMaxRadix(0);
        Util.intToStringMaxRadix(1);
    }

    public TrackGroup(String str, Format... formatArr) {
        Trace.checkArgument(formatArr.length > 0);
        this.id = str;
        this.formats = formatArr;
        this.length = formatArr.length;
        String str2 = formatArr[0].sampleMimeType;
        this.f871type = TextUtils.isEmpty(str2) ? MimeTypes.getTrackType(formatArr[0].containerMimeType) : MimeTypes.getTrackType(str2);
        String str3 = formatArr[0].language;
        str3 = (str3 == null || str3.equals("und")) ? "" : str3;
        int i = formatArr[0].roleFlags | 16384;
        for (int i2 = 1; i2 < formatArr.length; i2++) {
            String str4 = formatArr[i2].language;
            if (!str3.equals((str4 == null || str4.equals("und")) ? "" : str4)) {
                logErrorMessage(i2, "languages", formatArr[0].language, formatArr[i2].language);
                return;
            } else {
                if (i != (formatArr[i2].roleFlags | 16384)) {
                    logErrorMessage(i2, "role flags", Integer.toBinaryString(formatArr[0].roleFlags), Integer.toBinaryString(formatArr[i2].roleFlags));
                    return;
                }
            }
        }
    }

    public static void logErrorMessage(int i, String str, String str2, String str3) {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        m.append(str3);
        m.append("' (track ");
        m.append(i);
        m.append(")");
        Log.e("TrackGroup", "", new IllegalStateException(m.toString()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TrackGroup.class == obj.getClass()) {
            TrackGroup trackGroup = (TrackGroup) obj;
            if (this.id.equals(trackGroup.id) && Arrays.equals(this.formats, trackGroup.formats)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = Arrays.hashCode(this.formats) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(527, 31, this.id);
        }
        return this.hashCode;
    }

    public final String toString() {
        return this.id + ": " + Arrays.toString(this.formats);
    }
}
