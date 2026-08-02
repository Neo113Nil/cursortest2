package androidx.core.text;

import androidx.media3.common.FlagSet;

/* loaded from: classes3.dex */
public abstract class TextDirectionHeuristicsCompat {
    public static final FlagSet.Builder FIRSTSTRONG_LTR;
    public static final FlagSet.Builder FIRSTSTRONG_RTL;
    public static final FlagSet.Builder LTR = new FlagSet.Builder((FirstStrong) null, false);
    public static final FlagSet.Builder RTL = new FlagSet.Builder((FirstStrong) null, true);

    public final class FirstStrong {
        public static final FirstStrong INSTANCE = new FirstStrong();
    }

    static {
        FirstStrong firstStrong = FirstStrong.INSTANCE;
        FIRSTSTRONG_LTR = new FlagSet.Builder(firstStrong, false);
        FIRSTSTRONG_RTL = new FlagSet.Builder(firstStrong, true);
    }
}
