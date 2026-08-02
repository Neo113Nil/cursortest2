package defpackage;

import androidx.camera.view.internal.ScreenFlashUiInfo$ProviderType;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class rdp0 {
    public final ScreenFlashUiInfo$ProviderType a;
    public final v8v b;

    public rdp0(ScreenFlashUiInfo$ProviderType screenFlashUiInfo$ProviderType, v8v v8vVar) {
        this.a = screenFlashUiInfo$ProviderType;
        this.b = v8vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rdp0)) {
            return false;
        }
        rdp0 rdp0Var = (rdp0) obj;
        return this.a == rdp0Var.a && Objects.equals(this.b, rdp0Var.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
