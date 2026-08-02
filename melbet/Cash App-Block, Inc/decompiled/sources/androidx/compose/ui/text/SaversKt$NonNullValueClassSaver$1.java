package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaveableHolder;
import androidx.compose.runtime.saveable.Saver;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class SaversKt$NonNullValueClassSaver$1 implements Saver {
    public final /* synthetic */ Function1 $restore;
    public final /* synthetic */ Function2 $save;

    public SaversKt$NonNullValueClassSaver$1(Function2 function2, Function1 function1) {
        this.$save = function2;
        this.$restore = function1;
    }

    @Override // androidx.compose.runtime.saveable.Saver
    /* renamed from: restore */
    public final Object mo380restore(Object obj) {
        return this.$restore.invoke(obj);
    }

    @Override // androidx.compose.runtime.saveable.Saver
    public final Object save(SaveableHolder saveableHolder, Object obj) {
        return this.$save.invoke(saveableHolder, obj);
    }
}
