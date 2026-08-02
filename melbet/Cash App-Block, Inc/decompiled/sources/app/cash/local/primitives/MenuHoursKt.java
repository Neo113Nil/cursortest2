package app.cash.local.primitives;

import app.cash.local.primitives.MenuHours;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.protos.cash.local.client.v1.LocalMenuHours;
import com.squareup.protos.cash.local.client.v1.LocalMenuHoursState;
import com.squareup.protos.cash.papermate.enums.FeeType;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class MenuHoursKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LocalMenuHoursState.values().length];
            try {
                FeeType.Companion companion = LocalMenuHoursState.Companion;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                FeeType.Companion companion2 = LocalMenuHoursState.Companion;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                FeeType.Companion companion3 = LocalMenuHoursState.Companion;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                FeeType.Companion companion4 = LocalMenuHoursState.Companion;
                iArr[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewDependentWithParams.deepLinkSpecs;
    }

    public static final boolean isNullOrAvailableNow(MenuHours menuHours) {
        return menuHours == null || menuHours.isAvailableNow();
    }

    public static final MenuHours toMenuHours(LocalMenuHours localMenuHours) {
        MenuHours.State state;
        localMenuHours.getClass();
        LocalMenuHoursState localMenuHoursState = localMenuHours.state;
        int i = localMenuHoursState == null ? -1 : WhenMappings.$EnumSwitchMapping$0[localMenuHoursState.ordinal()];
        if (i != -1) {
            if (i == 1) {
                state = MenuHours.State.AlwaysAvailable;
            } else if (i == 2) {
                state = MenuHours.State.AvailableNow;
            } else if (i == 3) {
                state = MenuHours.State.AvailableLater;
            } else if (i != 4) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            return new MenuHours(state, localMenuHours.hours_formatted, localMenuHours.next_available_formatted);
        }
        state = MenuHours.State.Unspecified;
        return new MenuHours(state, localMenuHours.hours_formatted, localMenuHours.next_available_formatted);
    }
}
