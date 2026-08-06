package defpackage;

import com.combinations.level.experts.core.domain.model.GameSettings;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class q11 implements dc1 {
    public final GameSettings GWasM1elztuh;
    public final boolean OOA6hdeuvCS;
    public final int X1lG3V04pd;
    public final int Yi7zF1RB1;
    public final int xqGvceK5x;

    public q11(GameSettings gameSettings, int i, int i2, int i3, boolean z) {
        this.GWasM1elztuh = gameSettings;
        this.Yi7zF1RB1 = i;
        this.X1lG3V04pd = i2;
        this.xqGvceK5x = i3;
        this.OOA6hdeuvCS = z;
    }

    public static q11 GWasM1elztuh(q11 q11Var, GameSettings gameSettings, int i, int i2, int i3, boolean z, int i4) {
        if ((i4 & 1) != 0) {
            gameSettings = q11Var.GWasM1elztuh;
        }
        GameSettings gameSettings2 = gameSettings;
        if ((i4 & 2) != 0) {
            i = q11Var.Yi7zF1RB1;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            i2 = q11Var.X1lG3V04pd;
        }
        int i6 = i2;
        if ((i4 & 8) != 0) {
            i3 = q11Var.xqGvceK5x;
        }
        int i7 = i3;
        if ((i4 & 16) != 0) {
            z = q11Var.OOA6hdeuvCS;
        }
        q11Var.getClass();
        gameSettings2.getClass();
        return new q11(gameSettings2, i5, i6, i7, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q11)) {
            return false;
        }
        q11 q11Var = (q11) obj;
        return this.GWasM1elztuh.equals(q11Var.GWasM1elztuh) && this.Yi7zF1RB1 == q11Var.Yi7zF1RB1 && this.X1lG3V04pd == q11Var.X1lG3V04pd && this.xqGvceK5x == q11Var.xqGvceK5x && this.OOA6hdeuvCS == q11Var.OOA6hdeuvCS;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.OOA6hdeuvCS) + mr0.Yi7zF1RB1(this.xqGvceK5x, mr0.Yi7zF1RB1(this.X1lG3V04pd, mr0.Yi7zF1RB1(this.Yi7zF1RB1, this.GWasM1elztuh.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "SettingsState(settings=" + this.GWasM1elztuh + ", totalStars=" + this.Yi7zF1RB1 + ", completedLevels=" + this.X1lG3V04pd + ", hints=" + this.xqGvceK5x + ", confirmingReset=" + this.OOA6hdeuvCS + ")";
    }
}
