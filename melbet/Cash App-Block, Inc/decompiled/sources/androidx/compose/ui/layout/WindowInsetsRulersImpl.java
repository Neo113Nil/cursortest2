package androidx.compose.ui.layout;

/* loaded from: classes.dex */
public final class WindowInsetsRulersImpl implements WindowInsetsRulers {
    public final RectRulersImpl current;
    public final RectRulersImpl maximum;
    public final String name;

    public WindowInsetsRulersImpl(String str) {
        this.name = str;
        this.current = new RectRulersImpl(str);
        this.maximum = new RectRulersImpl(str.concat(" maximum"));
    }

    public final String toString() {
        return this.name;
    }
}
