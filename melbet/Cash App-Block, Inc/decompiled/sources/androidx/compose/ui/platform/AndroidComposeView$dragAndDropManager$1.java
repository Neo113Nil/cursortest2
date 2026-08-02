package androidx.compose.ui.platform;

import android.content.res.Resources;
import androidx.compose.ui.draganddrop.ComposeDragShadowBuilder;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.DensityImpl;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class AndroidComposeView$dragAndDropManager$1 extends FunctionReferenceImpl implements Function3 {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        JsonLogicResult$Success$$ExternalSyntheticOutline0.m4m(obj);
        AndroidComposeView androidComposeView = (AndroidComposeView) this.receiver;
        Class cls = AndroidComposeView.systemPropertiesClass;
        Resources resources = androidComposeView.getContext().getResources();
        return Boolean.valueOf(AndroidComposeViewStartDragAndDropN.INSTANCE.startDragAndDrop(androidComposeView, null, new ComposeDragShadowBuilder(new DensityImpl(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), ((Size) obj2).packedValue, (Function1) obj3)));
    }
}
