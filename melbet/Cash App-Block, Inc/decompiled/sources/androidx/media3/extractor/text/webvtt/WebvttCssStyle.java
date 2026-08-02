package androidx.media3.extractor.text.webvtt;

import java.util.Set;

/* loaded from: classes3.dex */
public final class WebvttCssStyle {
    public int backgroundColor;
    public int bold;
    public boolean combineUpright;
    public int fontColor;
    public String fontFamily;
    public float fontSize;
    public int fontSizeUnit;
    public boolean hasBackgroundColor;
    public boolean hasFontColor;
    public int italic;
    public int linethrough;
    public int rubyPosition;
    public Set targetClasses;
    public String targetId;
    public String targetTag;
    public String targetVoice;
    public int underline;

    public static int updateScoreForMatch(String str, int i, int i2, String str2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }
}
