package androidx.glance;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.glance.semantics.SemanticsConfiguration;
import androidx.glance.semantics.SemanticsProperties;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class ImageKt$Image$finalModifier$1$1 extends Lambda implements Function1 {
    public final /* synthetic */ String $contentDescription;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ImageKt$Image$finalModifier$1$1(String str, int i) {
        super(1);
        this.$r8$classId = i;
        this.$contentDescription = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        String str = this.$contentDescription;
        switch (i) {
            case 0:
                ((SemanticsConfiguration) obj).props.put(SemanticsProperties.ContentDescription, CollectionsKt__CollectionsJVMKt.listOf(str));
                break;
            case 1:
                SemanticsPropertiesKt.setContentDescription((SemanticsPropertyReceiver) obj, str);
                break;
            default:
                int intValue = ((Number) obj).intValue();
                int i2 = 0;
                while (i2 < 3 && intValue < str.length() && str.charAt(intValue) == ' ') {
                    i2++;
                    intValue++;
                }
                if (intValue < str.length() && str.charAt(intValue) == '>') {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
