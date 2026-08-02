package androidx.compose.foundation.text.contextmenu.internal;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$lambda$1$0$$inlined$onDispose$2;
import com.plaid.internal.P5$$ExternalSyntheticLambda0;
import com.squareup.cash.mooncake.resourceindex.ColorCodesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class AndroidTextContextMenuToolbarProvider$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AndroidTextContextMenuToolbarProvider f$0;

    public /* synthetic */ AndroidTextContextMenuToolbarProvider$$ExternalSyntheticLambda0(AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider, int i) {
        this.$r8$classId = i;
        this.f$0 = androidTextContextMenuToolbarProvider;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider = this.f$0;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj;
                View view = androidTextContextMenuToolbarProvider.view;
                Handler handler = view.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    function0.invoke();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new P5$$ExternalSyntheticLambda0(1, function0));
                    }
                }
                return Unit.INSTANCE;
            case 1:
                ActionMode actionMode = androidTextContextMenuToolbarProvider.actionMode;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return Unit.INSTANCE;
            case 2:
                ActionMode actionMode2 = androidTextContextMenuToolbarProvider.actionMode;
                if (actionMode2 != null) {
                    ColorCodesKt.invalidateContentRect(actionMode2);
                }
                return Unit.INSTANCE;
            default:
                androidTextContextMenuToolbarProvider.snapshotStateObserver.start();
                return new ReportDrawnKt$ReportDrawnWhen$lambda$1$0$$inlined$onDispose$2(androidTextContextMenuToolbarProvider, 3);
        }
    }
}
