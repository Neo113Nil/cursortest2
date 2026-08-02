package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import com.squareup.cash.mooncake.screens.AlertDialogResult;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class SelectionManager_androidKt$$ExternalSyntheticLambda10 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function0 f$0;
    public final /* synthetic */ Function0 f$1;

    public /* synthetic */ SelectionManager_androidKt$$ExternalSyntheticLambda10(Function0 function0, Function0 function02, int i) {
        this.$r8$classId = i;
        this.f$0 = function0;
        this.f$1 = function02;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Function0 function0 = this.f$1;
        Function0 function02 = this.f$0;
        switch (i) {
            case 0:
                TextContextMenuSession textContextMenuSession = (TextContextMenuSession) obj;
                function02.invoke();
                if (function0 != null ? ((Boolean) function0.invoke()).booleanValue() : true) {
                    textContextMenuSession.close();
                }
                break;
            case 1:
                TextContextMenuSession textContextMenuSession2 = (TextContextMenuSession) obj;
                function02.invoke();
                if (function0 != null ? ((Boolean) function0.invoke()).booleanValue() : true) {
                    textContextMenuSession2.close();
                }
                break;
            default:
                AlertDialogResult alertDialogResult = (AlertDialogResult) obj;
                alertDialogResult.getClass();
                int ordinal = alertDialogResult.ordinal();
                if (ordinal == 0) {
                    function02.invoke();
                } else if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    function0.invoke();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
