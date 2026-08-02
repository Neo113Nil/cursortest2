package com.squareup.cash.data.blockers;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.paging.CachedPagingDataKt$cachedIn$4;
import app.cash.broadway.screen.Screen;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface BlockersHelper {

    /* loaded from: classes6.dex */
    public abstract class BlockersAction {

        public final class DisableControl extends BlockersAction {
            public static final DisableControl INSTANCE = new DisableControl();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof DisableControl);
            }

            public final int hashCode() {
                return 1865323984;
            }

            public final String toString() {
                return "DisableControl";
            }
        }

        public final class EnableControl extends BlockersAction {
            public static final EnableControl INSTANCE = new EnableControl();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof EnableControl);
            }

            public final int hashCode() {
                return 1356948095;
            }

            public final String toString() {
                return "EnableControl";
            }
        }

        public final class ShowError extends BlockersAction {
            public final BlockersData blockersData;
            public final String message;

            public ShowError(BlockersData blockersData, String str) {
                str.getClass();
                blockersData.getClass();
                this.message = str;
                this.blockersData = blockersData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowError)) {
                    return false;
                }
                ShowError showError = (ShowError) obj;
                return Intrinsics.areEqual(this.message, showError.message) && Intrinsics.areEqual(this.blockersData, showError.blockersData);
            }

            public final int hashCode() {
                return this.blockersData.hashCode() + (this.message.hashCode() * 31);
            }

            public final String toString() {
                return "ShowError(message=" + this.message + ", blockersData=" + this.blockersData + ")";
            }
        }

        public final class ShowScreen extends BlockersAction {
            public final Screen screen;

            public ShowScreen(Screen screen) {
                screen.getClass();
                this.screen = screen;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowScreen) && Intrinsics.areEqual(this.screen, ((ShowScreen) obj).screen);
            }

            public final int hashCode() {
                return this.screen.hashCode();
            }

            public final String toString() {
                return re$$ExternalSyntheticOutline0.m(this.screen, "ShowScreen(screen=", ")");
            }
        }

        public final class ToggleSpinner extends BlockersAction {
            public final boolean show;

            public ToggleSpinner(boolean z) {
                this.show = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ToggleSpinner) && this.show == ((ToggleSpinner) obj).show;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.show);
            }

            public final String toString() {
                return Fragment$5$$ExternalSyntheticOutline0.m("ToggleSpinner(show=", ")", this.show);
            }
        }
    }

    static Object handleBlockerAction$default(BlockersHelper blockersHelper, BlockerAction blockerAction, BlockersScreens blockersScreens, SubmitFormRequest submitFormRequest, Screen screen, boolean z, BlockerAction blockerAction2, Function2 function2, Continuation continuation, int i) {
        Object handleBlockerAction = ((RealBlockersHelper) blockersHelper).handleBlockerAction(blockerAction, blockersScreens, (i & 4) != 0 ? null : submitFormRequest, (i & 8) != 0 ? null : screen, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : blockerAction2, new CachedPagingDataKt$cachedIn$4(7), (i & 128) != 0 ? null : function2, null, null, continuation);
        return handleBlockerAction == CoroutineSingletons.COROUTINE_SUSPENDED ? handleBlockerAction : Unit.INSTANCE;
    }

    static void launchClientScenario$default(BlockersHelper blockersHelper, BlockersData.Flow flow, ClientScenario clientScenario, Screen screen, Screen screen2, String str, String str2, boolean z, BlockersData.AnalyticsData analyticsData, BlockersData.MoneybotContext moneybotContext, boolean z2, int i) {
        Screen screen3 = (i & 8) != 0 ? null : screen2;
        String str3 = (i & 32) != 0 ? null : str;
        String str4 = (i & 64) != 0 ? null : str2;
        EmptyList emptyList = EmptyList.INSTANCE;
        boolean z3 = (i & 256) != 0 ? true : z;
        BlockersData.AnalyticsData analyticsData2 = (i & 512) != 0 ? null : analyticsData;
        BlockersData.MoneybotContext moneybotContext2 = (i & 1024) != 0 ? null : moneybotContext;
        boolean z4 = (i & 2048) != 0 ? false : z2;
        RealBlockersHelper realBlockersHelper = (RealBlockersHelper) blockersHelper;
        realBlockersHelper.getClass();
        flow.getClass();
        clientScenario.getClass();
        screen.getClass();
        emptyList.getClass();
        realBlockersHelper.navigator.goTo(new BlockersScreens.ClientScenarioLauncher(flow, clientScenario, screen, screen3, true, str3, str4, emptyList, z3, analyticsData2, moneybotContext2, z4));
    }
}
