package androidx.compose.ui.text.style;

import androidx.compose.ui.text.SpanStyleKt;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class TextIndentKt {
    public static List getDeepLinkSpecs() {
        return ClientRoute.DeprecatedViewAddress.deepLinkSpecs;
    }

    public static final TextIndent lerp(TextIndent textIndent, TextIndent textIndent2, float f) {
        return new TextIndent(SpanStyleKt.m975lerpTextUnitInheritableC3pnCVY(f, textIndent.firstLine, textIndent2.firstLine), SpanStyleKt.m975lerpTextUnitInheritableC3pnCVY(f, textIndent.restLine, textIndent2.restLine));
    }
}
