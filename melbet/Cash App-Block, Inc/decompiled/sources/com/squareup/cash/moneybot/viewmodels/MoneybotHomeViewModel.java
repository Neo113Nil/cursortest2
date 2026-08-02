package com.squareup.cash.moneybot.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import com.squareup.cash.loadable.Loadable;
import com.squareup.cash.moneybot.viewmodels.MoneybotHomeViewEvent;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import com.squareup.protos.cash.kgoose.api.v3.ClientRenderType;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface MoneybotHomeViewModel {

    public final class Content implements MoneybotHomeViewModel {
        public final boolean animateHomeEntrance;
        public final String homeSessionId;
        public final Loadable nba;
        public final boolean showCanvasBackground;
        public final TabToolbarInternalViewModel tabToolbarViewModel;
        public final ArrayList widgets;

        public Content(TabToolbarInternalViewModel tabToolbarInternalViewModel, boolean z, String str, Loadable loadable, ArrayList arrayList, boolean z2) {
            this.tabToolbarViewModel = tabToolbarInternalViewModel;
            this.showCanvasBackground = z;
            this.homeSessionId = str;
            this.nba = loadable;
            this.widgets = arrayList;
            this.animateHomeEntrance = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return this.tabToolbarViewModel.equals(content.tabToolbarViewModel) && this.showCanvasBackground == content.showCanvasBackground && this.homeSessionId.equals(content.homeSessionId) && this.nba.equals(content.nba) && this.widgets.equals(content.widgets) && this.animateHomeEntrance == content.animateHomeEntrance;
        }

        @Override // com.squareup.cash.moneybot.viewmodels.MoneybotHomeViewModel
        public final boolean getShowCanvasBackground() {
            return this.showCanvasBackground;
        }

        @Override // com.squareup.cash.moneybot.viewmodels.MoneybotHomeViewModel
        public final TabToolbarInternalViewModel getTabToolbarViewModel() {
            return this.tabToolbarViewModel;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.animateHomeEntrance) + CameraState$Type$EnumUnboxingLocalUtility.m(this.widgets, (this.nba.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.tabToolbarViewModel.hashCode() * 31, 31, this.showCanvasBackground), 31, this.homeSessionId)) * 31, 31);
        }

        public final String toString() {
            return "Content(tabToolbarViewModel=" + this.tabToolbarViewModel + ", showCanvasBackground=" + this.showCanvasBackground + ", homeSessionId=" + this.homeSessionId + ", nba=" + this.nba + ", widgets=" + this.widgets + ", animateHomeEntrance=" + this.animateHomeEntrance + ")";
        }
    }

    public final class Error implements MoneybotHomeViewModel {
        public final boolean showCanvasBackground;
        public final TabToolbarInternalViewModel tabToolbarViewModel;

        public Error(TabToolbarInternalViewModel tabToolbarInternalViewModel, boolean z) {
            this.tabToolbarViewModel = tabToolbarInternalViewModel;
            this.showCanvasBackground = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return this.tabToolbarViewModel.equals(error.tabToolbarViewModel) && this.showCanvasBackground == error.showCanvasBackground;
        }

        @Override // com.squareup.cash.moneybot.viewmodels.MoneybotHomeViewModel
        public final boolean getShowCanvasBackground() {
            return this.showCanvasBackground;
        }

        @Override // com.squareup.cash.moneybot.viewmodels.MoneybotHomeViewModel
        public final TabToolbarInternalViewModel getTabToolbarViewModel() {
            return this.tabToolbarViewModel;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.showCanvasBackground) + (this.tabToolbarViewModel.hashCode() * 31);
        }

        public final String toString() {
            return "Error(tabToolbarViewModel=" + this.tabToolbarViewModel + ", showCanvasBackground=" + this.showCanvasBackground + ")";
        }
    }

    public final class Loading implements MoneybotHomeViewModel {
        public final boolean showAnimation;
        public final boolean showCanvasBackground;
        public final TabToolbarInternalViewModel tabToolbarViewModel;

        public Loading(TabToolbarInternalViewModel tabToolbarInternalViewModel, boolean z, boolean z2) {
            this.tabToolbarViewModel = tabToolbarInternalViewModel;
            this.showCanvasBackground = z;
            this.showAnimation = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loading)) {
                return false;
            }
            Loading loading = (Loading) obj;
            return this.tabToolbarViewModel.equals(loading.tabToolbarViewModel) && this.showCanvasBackground == loading.showCanvasBackground && this.showAnimation == loading.showAnimation;
        }

        @Override // com.squareup.cash.moneybot.viewmodels.MoneybotHomeViewModel
        public final boolean getShowCanvasBackground() {
            return this.showCanvasBackground;
        }

        @Override // com.squareup.cash.moneybot.viewmodels.MoneybotHomeViewModel
        public final TabToolbarInternalViewModel getTabToolbarViewModel() {
            return this.tabToolbarViewModel;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.showAnimation) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.tabToolbarViewModel.hashCode() * 31, 31, this.showCanvasBackground);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loading(tabToolbarViewModel=");
            sb.append(this.tabToolbarViewModel);
            sb.append(", showCanvasBackground=");
            sb.append(this.showCanvasBackground);
            sb.append(", showAnimation=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.showAnimation, ")");
        }
    }

    public final class NextBestAction {
        public final Action action;
        public final String cta;
        public final String nbaId;
        public final Action skipAction;
        public final String subtitle;
        public final String title;
        public final MoneybotHomeViewEvent.NbaViewed viewedEvent;

        public final class Action {
            public final MoneybotHomeViewEvent event;

            public Action(MoneybotHomeViewEvent moneybotHomeViewEvent) {
                this.event = moneybotHomeViewEvent;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Action) && this.event.equals(((Action) obj).event);
            }

            public final int hashCode() {
                return this.event.hashCode() * 31;
            }

            public final String toString() {
                return "Action(event=" + this.event + ", cdfEvent=null)";
            }
        }

        public NextBestAction(String str, String str2, String str3, String str4, Action action, Action action2, MoneybotHomeViewEvent.NbaViewed nbaViewed) {
            str4.getClass();
            this.nbaId = str;
            this.title = str2;
            this.subtitle = str3;
            this.cta = str4;
            this.action = action;
            this.skipAction = action2;
            this.viewedEvent = nbaViewed;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NextBestAction)) {
                return false;
            }
            NextBestAction nextBestAction = (NextBestAction) obj;
            return this.nbaId.equals(nextBestAction.nbaId) && this.title.equals(nextBestAction.title) && Intrinsics.areEqual(this.subtitle, nextBestAction.subtitle) && Intrinsics.areEqual(this.cta, nextBestAction.cta) && this.action.equals(nextBestAction.action) && Intrinsics.areEqual(this.skipAction, nextBestAction.skipAction) && this.viewedEvent.equals(nextBestAction.viewedEvent);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.nbaId.hashCode() * 31, 31, this.title);
            String str = this.subtitle;
            int hashCode = (this.action.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.cta)) * 31;
            Action action = this.skipAction;
            return this.viewedEvent.hashCode() + ((hashCode + (action != null ? action.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("NextBestAction(nbaId=", this.nbaId, ", title=", this.title, ", subtitle=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.subtitle, ", cta=", this.cta, ", action=");
            m.append(this.action);
            m.append(", skipAction=");
            m.append(this.skipAction);
            m.append(", viewedEvent=");
            m.append(this.viewedEvent);
            m.append(")");
            return m.toString();
        }
    }

    public final class WidgetCard {
        public final Action action;
        public final UiCallbackModel callbackModel;
        public final Action deleteAction;
        public final String lazyColumnKey;
        public final ClientRenderType renderType;
        public final MoneybotHomeViewEvent.WidgetViewed viewedEvent;
        public final String widgetId;

        public final class Action {
            public final MoneybotHomeViewEvent event;

            public Action(MoneybotHomeViewEvent moneybotHomeViewEvent) {
                this.event = moneybotHomeViewEvent;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Action) && this.event.equals(((Action) obj).event);
            }

            public final int hashCode() {
                return this.event.hashCode();
            }

            public final String toString() {
                return "Action(event=" + this.event + ")";
            }
        }

        public WidgetCard(String str, String str2, ClientRenderType clientRenderType, UiCallbackModel uiCallbackModel, Action action, Action action2, MoneybotHomeViewEvent.WidgetViewed widgetViewed) {
            str.getClass();
            str2.getClass();
            clientRenderType.getClass();
            this.widgetId = str;
            this.lazyColumnKey = str2;
            this.renderType = clientRenderType;
            this.callbackModel = uiCallbackModel;
            this.action = action;
            this.deleteAction = action2;
            this.viewedEvent = widgetViewed;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WidgetCard)) {
                return false;
            }
            WidgetCard widgetCard = (WidgetCard) obj;
            return Intrinsics.areEqual(this.widgetId, widgetCard.widgetId) && Intrinsics.areEqual(this.lazyColumnKey, widgetCard.lazyColumnKey) && this.renderType == widgetCard.renderType && this.callbackModel.equals(widgetCard.callbackModel) && Intrinsics.areEqual(this.action, widgetCard.action) && Intrinsics.areEqual(this.deleteAction, widgetCard.deleteAction) && this.viewedEvent.equals(widgetCard.viewedEvent);
        }

        public final int hashCode() {
            int hashCode = (this.callbackModel.hashCode() + ((this.renderType.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.widgetId.hashCode() * 31, 31, this.lazyColumnKey)) * 31)) * 31;
            Action action = this.action;
            int hashCode2 = (hashCode + (action == null ? 0 : action.event.hashCode())) * 31;
            Action action2 = this.deleteAction;
            return this.viewedEvent.widgetId.hashCode() + ((hashCode2 + (action2 != null ? action2.event.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("WidgetCard(widgetId=", this.widgetId, ", lazyColumnKey=", this.lazyColumnKey, ", renderType=");
            m.append(this.renderType);
            m.append(", callbackModel=");
            m.append(this.callbackModel);
            m.append(", action=");
            m.append(this.action);
            m.append(", deleteAction=");
            m.append(this.deleteAction);
            m.append(", viewedEvent=");
            m.append(this.viewedEvent);
            m.append(")");
            return m.toString();
        }
    }

    boolean getShowCanvasBackground();

    TabToolbarInternalViewModel getTabToolbarViewModel();
}
