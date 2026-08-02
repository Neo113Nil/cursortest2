package androidx.media3.ui;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;

/* loaded from: classes3.dex */
public abstract class BidiUtils {
    public static final Splitter LF_SPLITTER = Splitter.on("\n");
    public static final Splitter CRLF_SPLITTER = Splitter.on("\r\n");
    public static final Joiner LF_JOINER = new Joiner("\n");
}
