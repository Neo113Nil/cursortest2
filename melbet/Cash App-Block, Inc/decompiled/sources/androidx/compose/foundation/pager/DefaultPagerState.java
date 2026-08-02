package androidx.compose.foundation.pager;

import androidx.compose.foundation.text.BasicTextKt$$ExternalSyntheticLambda14;
import androidx.compose.material.SnackbarHostKt$$ExternalSyntheticLambda2;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.work.impl.WorkLauncherImpl;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class DefaultPagerState extends PagerState {
    public static final WorkLauncherImpl Saver = ListSaverKt.listSaver(new SnackbarHostKt$$ExternalSyntheticLambda2(5), new BasicTextKt$$ExternalSyntheticLambda14(10));
    public final ParcelableSnapshotMutableState pageCountState;

    public DefaultPagerState(int i, float f, Function0 function0) {
        super(f, i);
        this.pageCountState = Updater.mutableStateOf$default(function0);
    }

    @Override // androidx.compose.foundation.pager.PagerState
    public final int getPageCount() {
        return ((Number) ((Function0) this.pageCountState.getValue()).invoke()).intValue();
    }
}
