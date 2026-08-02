package androidx.media3.datasource;

import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public abstract class HttpUtil {
    public static final Pattern CONTENT_RANGE_WITH_START_AND_END = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    public static final Pattern CONTENT_RANGE_WITH_SIZE = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");
}
