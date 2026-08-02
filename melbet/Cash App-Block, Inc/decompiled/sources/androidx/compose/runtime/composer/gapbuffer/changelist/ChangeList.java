package androidx.compose.runtime.composer.gapbuffer.changelist;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.composer.gapbuffer.SlotWriter;
import androidx.compose.runtime.internal.RememberEventDispatcher;
import com.squareup.util.cash.Countries;

/* loaded from: classes.dex */
public final class ChangeList extends Countries {

    /* renamed from: operations, reason: collision with root package name */
    public final Operations f854operations = new Operations();

    public final void executeAndFlushAllPendingChanges(Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher, OperationErrorContext operationErrorContext) {
        this.f854operations.executeAndFlushAllPendingOperations(applier, slotWriter, rememberEventDispatcher, operationErrorContext);
    }
}
