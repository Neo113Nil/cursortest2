package androidx.compose.ui.text.platform.style;

import android.graphics.Paint;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;

/* compiled from: DrawStyleSpan.android.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"toAndroidJoin", "Landroid/graphics/Paint$Join;", "Landroidx/compose/ui/graphics/StrokeJoin;", "toAndroidJoin-Ww9F2mQ", "(I)Landroid/graphics/Paint$Join;", "toAndroidCap", "Landroid/graphics/Paint$Cap;", "Landroidx/compose/ui/graphics/StrokeCap;", "toAndroidCap-BeK7IIE", "(I)Landroid/graphics/Paint$Cap;", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
public final class DrawStyleSpan_androidKt {
    /* renamed from: toAndroidJoin-Ww9F2mQ, reason: not valid java name */
    public static final Paint.Join m9459toAndroidJoinWw9F2mQ(int i) {
        return StrokeJoin.m7178equalsimpl0(i, StrokeJoin.INSTANCE.m7183getMiterLxFBmk8()) ? Paint.Join.MITER : StrokeJoin.m7178equalsimpl0(i, StrokeJoin.INSTANCE.m7184getRoundLxFBmk8()) ? Paint.Join.ROUND : StrokeJoin.m7178equalsimpl0(i, StrokeJoin.INSTANCE.m7182getBevelLxFBmk8()) ? Paint.Join.BEVEL : Paint.Join.MITER;
    }

    /* renamed from: toAndroidCap-BeK7IIE, reason: not valid java name */
    public static final Paint.Cap m9458toAndroidCapBeK7IIE(int i) {
        return StrokeCap.m7168equalsimpl0(i, StrokeCap.INSTANCE.m7172getButtKaPHkGw()) ? Paint.Cap.BUTT : StrokeCap.m7168equalsimpl0(i, StrokeCap.INSTANCE.m7173getRoundKaPHkGw()) ? Paint.Cap.ROUND : StrokeCap.m7168equalsimpl0(i, StrokeCap.INSTANCE.m7174getSquareKaPHkGw()) ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
    }
}
