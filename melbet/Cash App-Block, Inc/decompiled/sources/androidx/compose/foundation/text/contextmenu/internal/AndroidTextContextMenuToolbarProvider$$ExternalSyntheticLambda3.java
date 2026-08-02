package androidx.compose.foundation.text.contextmenu.internal;

import androidx.camera.camera2.pipe.core.Threads$$ExternalSyntheticLambda1;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuData;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes3.dex */
public final /* synthetic */ class AndroidTextContextMenuToolbarProvider$$ExternalSyntheticLambda3 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AndroidTextContextMenuToolbarProvider f$0;
    public final /* synthetic */ TextContextMenuDataProvider f$1;

    public /* synthetic */ AndroidTextContextMenuToolbarProvider$$ExternalSyntheticLambda3(AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider, TextContextMenuDataProvider textContextMenuDataProvider, int i) {
        this.$r8$classId = i;
        this.f$0 = androidTextContextMenuToolbarProvider;
        this.f$1 = textContextMenuDataProvider;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        int i2 = 15;
        TextContextMenuDataProvider textContextMenuDataProvider = this.f$1;
        AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider = this.f$0;
        switch (i) {
            case 0:
                AndroidTextContextMenuToolbarProvider$$ExternalSyntheticLambda0 androidTextContextMenuToolbarProvider$$ExternalSyntheticLambda0 = androidTextContextMenuToolbarProvider.onDataChange;
                Threads$$ExternalSyntheticLambda1 threads$$ExternalSyntheticLambda1 = new Threads$$ExternalSyntheticLambda1(textContextMenuDataProvider, 24);
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                androidTextContextMenuToolbarProvider.snapshotStateObserver.observeReads("dataBuilder", androidTextContextMenuToolbarProvider$$ExternalSyntheticLambda0, new DialogHostKt$$ExternalSyntheticLambda0(i2, ref$ObjectRef, threads$$ExternalSyntheticLambda1));
                Object obj = ref$ObjectRef.element;
                if (obj != null) {
                    return (TextContextMenuData) obj;
                }
                Intrinsics.throwUninitializedPropertyAccessException("result");
                throw null;
            case 1:
                AndroidTextContextMenuToolbarProvider$$ExternalSyntheticLambda0 androidTextContextMenuToolbarProvider$$ExternalSyntheticLambda02 = androidTextContextMenuToolbarProvider.onPositionChange;
                AndroidTextContextMenuToolbarProvider$$ExternalSyntheticLambda3 androidTextContextMenuToolbarProvider$$ExternalSyntheticLambda3 = new AndroidTextContextMenuToolbarProvider$$ExternalSyntheticLambda3(androidTextContextMenuToolbarProvider, textContextMenuDataProvider, 2);
                Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                androidTextContextMenuToolbarProvider.snapshotStateObserver.observeReads("positioner", androidTextContextMenuToolbarProvider$$ExternalSyntheticLambda02, new DialogHostKt$$ExternalSyntheticLambda0(i2, ref$ObjectRef2, androidTextContextMenuToolbarProvider$$ExternalSyntheticLambda3));
                Object obj2 = ref$ObjectRef2.element;
                if (obj2 != null) {
                    return (Rect) obj2;
                }
                Intrinsics.throwUninitializedPropertyAccessException("result");
                throw null;
            default:
                Object invoke = androidTextContextMenuToolbarProvider.coordinatesProvider.invoke();
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) (((LayoutCoordinates) invoke).isAttached() ? invoke : null);
                return layoutCoordinates == null ? Rect.Zero : textContextMenuDataProvider.contentBounds(layoutCoordinates).m637translatek4lQ0M(layoutCoordinates.mo841localToRootMKHz9U(0L));
        }
    }
}
