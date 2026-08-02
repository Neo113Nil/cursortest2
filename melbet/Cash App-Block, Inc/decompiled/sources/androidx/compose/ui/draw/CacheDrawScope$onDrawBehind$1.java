package androidx.compose.ui.draw;

import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XFloat;
import com.squareup.contour.XInt;
import com.squareup.contour.YFloat;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class CacheDrawScope$onDrawBehind$1 extends Lambda implements Function1 {
    public final /* synthetic */ Function1 $block;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CacheDrawScope$onDrawBehind$1(int i, Function1 function1) {
        super(1);
        this.$r8$classId = i;
        this.$block = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Function1 function1 = this.$block;
        switch (i) {
            case 0:
                LayoutNodeDrawScope layoutNodeDrawScope = (LayoutNodeDrawScope) obj;
                function1.invoke(layoutNodeDrawScope);
                layoutNodeDrawScope.drawContent();
                return Unit.INSTANCE;
            case 1:
                return new IntOffset(((Number) function1.invoke(Integer.valueOf((int) (((IntSize) obj).packedValue & BodyPartID.bodyIdMax)))).intValue() & BodyPartID.bodyIdMax);
            case 2:
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                layoutSpec.getClass();
                return Integer.valueOf((int) ((XFloat) function1.invoke(layoutSpec)).value);
            case 3:
                return Integer.valueOf(((XInt) function1.invoke(new XInt(((Number) obj).intValue()))).value);
            default:
                ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                layoutSpec2.getClass();
                return Integer.valueOf((int) ((YFloat) function1.invoke(layoutSpec2)).value);
        }
    }
}
