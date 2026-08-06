package defpackage;

import com.combinations.level.experts.core.domain.model.GameSettings;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class mw implements rw {
    public final GameSettings GWasM1elztuh;

    public mw(GameSettings gameSettings) {
        gameSettings.getClass();
        this.GWasM1elztuh = gameSettings;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mw) && o30.rQPn8YBR(this.GWasM1elztuh, ((mw) obj).GWasM1elztuh);
    }

    public final int hashCode() {
        return this.GWasM1elztuh.hashCode();
    }

    public final String toString() {
        return "SettingsUpdated(settings=" + this.GWasM1elztuh + ")";
    }
}
