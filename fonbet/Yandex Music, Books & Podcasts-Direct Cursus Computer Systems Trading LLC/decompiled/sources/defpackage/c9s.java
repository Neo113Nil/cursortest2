package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class c9s {
    public static final c9s a;
    public static final /* synthetic */ c9s[] b;

    static {
        c9s c9sVar = new c9s("VIDEO_CLIP_OVERLAY_ANIMATION", 0);
        a = c9sVar;
        b = new c9s[]{c9sVar};
    }

    public static c9s valueOf(String str) {
        return (c9s) Enum.valueOf(c9s.class, str);
    }

    public static c9s[] values() {
        return (c9s[]) b.clone();
    }
}
