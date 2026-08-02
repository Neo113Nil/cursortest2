package androidx.compose.ui.platform;

import android.content.Context;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class AndroidComposeView$getFocusedRect$1 extends Lambda implements Function1 {
    public static final AndroidComposeView$getFocusedRect$1 INSTANCE;
    public static final AndroidComposeView$getFocusedRect$1 INSTANCE$1;
    public static final AndroidComposeView$getFocusedRect$1 INSTANCE$2;
    public static final AndroidComposeView$getFocusedRect$1 INSTANCE$3;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 1;
        INSTANCE = new AndroidComposeView$getFocusedRect$1(i, 0);
        INSTANCE$1 = new AndroidComposeView$getFocusedRect$1(i, 1);
        INSTANCE$2 = new AndroidComposeView$getFocusedRect$1(i, 2);
        INSTANCE$3 = new AndroidComposeView$getFocusedRect$1(i, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AndroidComposeView$getFocusedRect$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return Boolean.TRUE;
            case 1:
                PersistentCompositionLocalHashMap persistentCompositionLocalHashMap = (PersistentCompositionLocalHashMap) obj;
                DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = AndroidCompositionLocals_androidKt.LocalConfiguration;
                persistentCompositionLocalHashMap.getClass();
                Updater.read(persistentCompositionLocalHashMap, dynamicProvidableCompositionLocal);
                return ((Context) Updater.read(persistentCompositionLocalHashMap, AndroidCompositionLocals_androidKt.LocalContext)).getResources();
            case 2:
                return Boolean.valueOf(TestTagKt.canBeSavedToBundle(obj));
            default:
                return Unit.INSTANCE;
        }
    }
}
