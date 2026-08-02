package defpackage;

import android.view.View;
import com.yandex.go.slot.api.ui.SlotItemUiState$Size;

/* loaded from: classes14.dex */
public interface yss0 {
    View asView();

    void render(xss0 xss0Var, boolean z, rqs0 rqs0Var);

    void renderBody(css0 css0Var);

    void renderLead(gss0 gss0Var);

    void renderLoading(boolean z);

    void renderTrail(tss0 tss0Var, rqs0 rqs0Var);

    void setAction(nqs0 nqs0Var, rqs0 rqs0Var);

    void setColor(kdc kdcVar);

    void setSize(SlotItemUiState$Size slotItemUiState$Size);

    void setSwitchTrailChecked(boolean z);
}
