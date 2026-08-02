package androidx.activity.compose;

import com.squareup.cash.clientsync.readers.SyncValueSpec;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ComposeBackHandler extends SyncValueSpec {
    public Function0 currentOnBackCompleted;

    @Override // com.squareup.cash.clientsync.readers.SyncValueSpec
    public final void onBackCompleted() {
        this.currentOnBackCompleted.invoke();
    }
}
