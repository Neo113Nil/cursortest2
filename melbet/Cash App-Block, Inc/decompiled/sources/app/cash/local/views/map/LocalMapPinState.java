package app.cash.local.views.map;

import com.bumptech.glide.GlideBuilder$1;

/* loaded from: classes3.dex */
public enum LocalMapPinState {
    Mini(0, "Mini"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(1, "Regular"),
    Selected(2, "Selected");

    public static final GlideBuilder$1 Companion = new GlideBuilder$1();
    public final float contentCornerRadius;
    public final float scale;

    LocalMapPinState(int i, String str) {
        this.scale = r1;
        this.contentCornerRadius = r2;
    }
}
