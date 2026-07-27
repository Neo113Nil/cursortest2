package kotlin.text;

import android.text.TextPaint;

/* loaded from: classes.dex */
public final class CatchingFishRoomDatabaseMVI implements CatchingFishToastLiveData {
    public static final ThreadLocal CatchingFishSnackbar = new ThreadLocal();
    public final TextPaint CatchingFishParcelableFAB;

    public CatchingFishRoomDatabaseMVI() {
        TextPaint textPaint = new TextPaint();
        this.CatchingFishParcelableFAB = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
