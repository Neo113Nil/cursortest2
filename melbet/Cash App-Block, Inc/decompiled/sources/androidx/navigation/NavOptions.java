package androidx.navigation;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class NavOptions {
    public final int enterAnim;
    public final int exitAnim;
    public final int popEnterAnim;
    public final int popExitAnim;
    public final int popUpToId;
    public final boolean popUpToInclusive;
    public String popUpToRoute;
    public final boolean popUpToSaveState;
    public final boolean restoreState;
    public final boolean singleTop;

    public final class Builder {
        public boolean popUpToInclusive;
        public String popUpToRoute;
        public boolean popUpToSaveState;
        public boolean restoreState;
        public boolean singleTop;
        public int popUpToId = -1;
        public int enterAnim = -1;
        public int exitAnim = -1;

        public final NavOptions build() {
            String str = this.popUpToRoute;
            boolean z = this.singleTop;
            if (str == null) {
                return new NavOptions(z, this.restoreState, this.popUpToId, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, -1, -1);
            }
            boolean z2 = this.restoreState;
            boolean z3 = this.popUpToInclusive;
            boolean z4 = this.popUpToSaveState;
            int i = this.enterAnim;
            int i2 = this.exitAnim;
            int i3 = NavDestination.$r8$clinit;
            NavOptions navOptions = new NavOptions(z, z2, "android-app://androidx.navigation/".concat(str).hashCode(), z3, z4, i, i2, -1, -1);
            navOptions.popUpToRoute = str;
            return navOptions;
        }
    }

    public NavOptions(boolean z, boolean z2, int i, boolean z3, boolean z4, int i2, int i3, int i4, int i5) {
        this.singleTop = z;
        this.restoreState = z2;
        this.popUpToId = i;
        this.popUpToInclusive = z3;
        this.popUpToSaveState = z4;
        this.enterAnim = i2;
        this.exitAnim = i3;
        this.popEnterAnim = i4;
        this.popExitAnim = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NavOptions)) {
            return false;
        }
        NavOptions navOptions = (NavOptions) obj;
        return this.singleTop == navOptions.singleTop && this.restoreState == navOptions.restoreState && this.popUpToId == navOptions.popUpToId && Intrinsics.areEqual(this.popUpToRoute, navOptions.popUpToRoute) && this.popUpToInclusive == navOptions.popUpToInclusive && this.popUpToSaveState == navOptions.popUpToSaveState && this.enterAnim == navOptions.enterAnim && this.exitAnim == navOptions.exitAnim && this.popEnterAnim == navOptions.popEnterAnim && this.popExitAnim == navOptions.popExitAnim;
    }

    public final int hashCode() {
        int i = (((((this.singleTop ? 1 : 0) * 31) + (this.restoreState ? 1 : 0)) * 31) + this.popUpToId) * 31;
        String str = this.popUpToRoute;
        return ((((((((((((i + (str != null ? str.hashCode() : 0)) * 29791) + (this.popUpToInclusive ? 1 : 0)) * 31) + (this.popUpToSaveState ? 1 : 0)) * 31) + this.enterAnim) * 31) + this.exitAnim) * 31) + this.popEnterAnim) * 31) + this.popExitAnim;
    }

    public final String toString() {
        String str = this.popUpToRoute;
        StringBuilder sb = new StringBuilder("NavOptions(");
        if (this.singleTop) {
            sb.append("launchSingleTop ");
        }
        if (this.restoreState) {
            sb.append("restoreState ");
        }
        if ((str != null || this.popUpToId != -1) && str != null) {
            sb.append("popUpTo(");
            sb.append(str);
            if (this.popUpToInclusive) {
                sb.append(" inclusive");
            }
            if (this.popUpToSaveState) {
                sb.append(" saveState");
            }
            sb.append(")");
        }
        int i = this.popExitAnim;
        int i2 = this.popEnterAnim;
        int i3 = this.exitAnim;
        int i4 = this.enterAnim;
        if (i4 != -1 || i3 != -1 || i2 != -1 || i != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(i4));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(i3));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(i2));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(i));
            sb.append(")");
        }
        return sb.toString();
    }
}
