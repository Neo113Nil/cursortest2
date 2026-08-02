package androidx.compose.ui.text.input;

import androidx.compose.ui.graphics.Matrix;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class TextInputServiceAndroid$onEditCommand$1 extends Lambda implements Function1 {
    public static final TextInputServiceAndroid$onEditCommand$1 INSTANCE;
    public static final TextInputServiceAndroid$onEditCommand$1 INSTANCE$1;
    public static final TextInputServiceAndroid$onEditCommand$1 INSTANCE$2;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 1;
        INSTANCE$1 = new TextInputServiceAndroid$onEditCommand$1(i, 1);
        INSTANCE = new TextInputServiceAndroid$onEditCommand$1(i, 0);
        INSTANCE$2 = new TextInputServiceAndroid$onEditCommand$1(i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextInputServiceAndroid$onEditCommand$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                break;
            case 1:
                float[] fArr = ((Matrix) obj).values;
                break;
            default:
                int i = ((ImeAction) obj).value;
                break;
        }
        return Unit.INSTANCE;
    }
}
