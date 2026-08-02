package androidx.core.text;

import android.text.SpannableStringBuilder;
import androidx.media3.common.FlagSet;

/* loaded from: classes3.dex */
public final class BidiFormatter {
    public static final BidiFormatter DEFAULT_LTR_INSTANCE;
    public static final BidiFormatter DEFAULT_RTL_INSTANCE;
    public static final String LRM_STRING;
    public static final String RLM_STRING;
    public final boolean mIsRtlContext;

    public final class DirectionalityEstimator {
        public static final byte[] DIR_TYPE_CACHE = new byte[1792];
        public int charIndex;
        public char lastChar;
        public final int length;
        public final CharSequence text;

        static {
            for (int i = 0; i < 1792; i++) {
                DIR_TYPE_CACHE[i] = Character.getDirectionality(i);
            }
        }

        public DirectionalityEstimator(CharSequence charSequence) {
            this.text = charSequence;
            this.length = charSequence.length();
        }

        public final byte dirTypeBackward() {
            int i = this.charIndex - 1;
            CharSequence charSequence = this.text;
            char charAt = charSequence.charAt(i);
            this.lastChar = charAt;
            boolean isLowSurrogate = Character.isLowSurrogate(charAt);
            int i2 = this.charIndex;
            if (isLowSurrogate) {
                int codePointBefore = Character.codePointBefore(charSequence, i2);
                this.charIndex -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.charIndex = i2 - 1;
            char c = this.lastChar;
            return c < 1792 ? DIR_TYPE_CACHE[c] : Character.getDirectionality(c);
        }
    }

    static {
        FlagSet.Builder builder = TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR;
        LRM_STRING = Character.toString((char) 8206);
        RLM_STRING = Character.toString((char) 8207);
        DEFAULT_LTR_INSTANCE = new BidiFormatter(false);
        DEFAULT_RTL_INSTANCE = new BidiFormatter(true);
    }

    public BidiFormatter(boolean z) {
        FlagSet.Builder builder = TextDirectionHeuristicsCompat.LTR;
        this.mIsRtlContext = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006d, code lost:
    
        if (r1 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0070, code lost:
    
        if (r2 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0072, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0075, code lost:
    
        if (r0.charIndex <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x007b, code lost:
    
        switch(r0.dirTypeBackward()) {
            case 14: goto L66;
            case 15: goto L66;
            case 16: goto L65;
            case 17: goto L65;
            case 18: goto L64;
            default: goto L70;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x007f, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0082, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0085, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0088, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x008b, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int getEntryDir(CharSequence charSequence) {
        byte directionality;
        DirectionalityEstimator directionalityEstimator = new DirectionalityEstimator(charSequence);
        directionalityEstimator.charIndex = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = directionalityEstimator.charIndex;
            if (i4 < directionalityEstimator.length && i == 0) {
                CharSequence charSequence2 = directionalityEstimator.text;
                char charAt = charSequence2.charAt(i4);
                directionalityEstimator.lastChar = charAt;
                boolean isHighSurrogate = Character.isHighSurrogate(charAt);
                int i5 = directionalityEstimator.charIndex;
                if (isHighSurrogate) {
                    int codePointAt = Character.codePointAt(charSequence2, i5);
                    directionalityEstimator.charIndex = Character.charCount(codePointAt) + directionalityEstimator.charIndex;
                    directionality = Character.getDirectionality(codePointAt);
                } else {
                    directionalityEstimator.charIndex = i5 + 1;
                    char c = directionalityEstimator.lastChar;
                    directionality = c < 1792 ? DirectionalityEstimator.DIR_TYPE_CACHE[c] : Character.getDirectionality(c);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i3 == 0) {
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                }
                i = i3;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0034, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int getExitDir(CharSequence charSequence) {
        DirectionalityEstimator directionalityEstimator = new DirectionalityEstimator(charSequence);
        directionalityEstimator.charIndex = directionalityEstimator.length;
        int i = 0;
        while (true) {
            int i2 = i;
            while (directionalityEstimator.charIndex > 0) {
                byte dirTypeBackward = directionalityEstimator.dirTypeBackward();
                if (dirTypeBackward != 0) {
                    if (dirTypeBackward == 1 || dirTypeBackward == 2) {
                        if (i != 0) {
                            if (i2 == 0) {
                                break;
                            }
                        }
                    } else if (dirTypeBackward != 9) {
                        switch (dirTypeBackward) {
                            case 14:
                            case 15:
                                if (i2 == i) {
                                    return -1;
                                }
                                i--;
                                break;
                            case 16:
                            case 17:
                                if (i2 == i) {
                                    break;
                                }
                                i--;
                                break;
                            case 18:
                                i++;
                                break;
                            default:
                                if (i2 != 0) {
                                    break;
                                } else {
                                    break;
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (i == 0) {
                        return -1;
                    }
                    if (i2 == 0) {
                        break;
                    }
                }
            }
            return 0;
        }
    }

    public final SpannableStringBuilder unicodeWrap(CharSequence charSequence) {
        FlagSet.Builder builder = TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR;
        if (charSequence == null) {
            return null;
        }
        boolean isRtl = builder.isRtl(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean isRtl2 = (isRtl ? TextDirectionHeuristicsCompat.RTL : TextDirectionHeuristicsCompat.LTR).isRtl(charSequence.length(), charSequence);
        String str = "";
        String str2 = RLM_STRING;
        String str3 = LRM_STRING;
        boolean z = this.mIsRtlContext;
        spannableStringBuilder.append((CharSequence) ((z || !(isRtl2 || getEntryDir(charSequence) == 1)) ? (!z || (isRtl2 && getEntryDir(charSequence) != -1)) ? "" : str2 : str3));
        if (isRtl != z) {
            spannableStringBuilder.append(isRtl ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean isRtl3 = (isRtl ? TextDirectionHeuristicsCompat.RTL : TextDirectionHeuristicsCompat.LTR).isRtl(charSequence.length(), charSequence);
        if (!z && (isRtl3 || getExitDir(charSequence) == 1)) {
            str = str3;
        } else if (z && (!isRtl3 || getExitDir(charSequence) == -1)) {
            str = str2;
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }
}
