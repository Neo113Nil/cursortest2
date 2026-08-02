package app.cash.broadway.ui.compose;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.work.Data$$ExternalSyntheticLambda0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.moneybot.views.shared.MoneybotToolbarSharedKey$Leading;
import com.squareup.cash.moneybot.views.shared.MoneybotToolbarSharedKey$Trailing;
import com.squareup.cash.sharedElements.DiscoverTabSharedKey$SearchBounds;
import com.squareup.cash.sharedElements.DiscoverTabSharedKey$SearchIcon;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.ULong;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ToolbarConfig {
    public final ColorConfiguration colorConfiguration;
    public final List endActions;
    public final MoneybotSharedElementKeys moneybotSharedElementKeys;
    public final Function1 onEvent;
    public final SearchSharedElementKeys searchSharedElementKeys;
    public final boolean showMoneybotTooltip;
    public final List startActions;
    public final String title;
    public final TabToolbarInternalViewModel toolbarInternalModel;
    public final boolean useIconColorAroundProfile;

    /* loaded from: classes3.dex */
    public final class Action {
        public static final /* synthetic */ int $r8$clinit = 0;
        public final Background background;
        public final ElementBoundsRegistry.Element element;
        public final Painter icon;
        public final String label;
        public final Function0 onClick;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Background {
            public static final /* synthetic */ Background[] $VALUES;
            public static final Background None;
            public static final Background Tonal;

            static {
                Background background = new Background("Tonal", 0);
                Tonal = background;
                Background background2 = new Background("None", 1);
                None = background2;
                $VALUES = new Background[]{background, background2};
            }

            public static Background valueOf(String str) {
                return (Background) Enum.valueOf(Background.class, str);
            }

            public static Background[] values() {
                return (Background[]) $VALUES.clone();
            }
        }

        public Action(Painter painter, String str, Function0 function0, ElementBoundsRegistry.Element element, int i) {
            Background background = Background.None;
            element = (i & 8) != 0 ? null : element;
            background = (i & 16) != 0 ? Background.Tonal : background;
            painter.getClass();
            str.getClass();
            this.icon = painter;
            this.label = str;
            this.onClick = function0;
            this.element = element;
            this.background = background;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action)) {
                return false;
            }
            Action action = (Action) obj;
            return Intrinsics.areEqual(this.icon, action.icon) && Intrinsics.areEqual(this.label, action.label) && Intrinsics.areEqual(this.onClick, action.onClick) && this.element == action.element && this.background == action.background;
        }

        public final Background getBackground() {
            return this.background;
        }

        public final ElementBoundsRegistry.Element getElement() {
            return this.element;
        }

        public final int hashCode() {
            int hashCode = (this.onClick.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.icon.hashCode() * 31, 31, this.label)) * 31;
            ElementBoundsRegistry.Element element = this.element;
            return (this.background.hashCode() + ((hashCode + (element == null ? 0 : element.hashCode())) * 31)) * 31;
        }

        public final String toString() {
            return "Action(icon=" + this.icon + ", label=" + this.label + ", onClick=" + this.onClick + ", element=" + this.element + ", background=" + this.background + ", badge=null)";
        }
    }

    /* loaded from: classes3.dex */
    public final class ColorConfiguration {
        public final long deselectedIcon;
        public final long icon;
        public final long text;

        public ColorConfiguration(int i, long j, long j2) {
            j = (i & 1) != 0 ? Color.Unspecified : j;
            long j3 = Color.Unspecified;
            this.text = j;
            this.icon = j2;
            this.deselectedIcon = j3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ColorConfiguration)) {
                return false;
            }
            ColorConfiguration colorConfiguration = (ColorConfiguration) obj;
            return Color.m676equalsimpl0(this.text, colorConfiguration.text) && Color.m676equalsimpl0(this.icon, colorConfiguration.icon) && Color.m676equalsimpl0(this.deselectedIcon, colorConfiguration.deselectedIcon);
        }

        /* renamed from: getDeselectedIcon-0d7_KjU, reason: not valid java name */
        public final long m1199getDeselectedIcon0d7_KjU() {
            return this.deselectedIcon;
        }

        /* renamed from: getIcon-0d7_KjU, reason: not valid java name */
        public final long m1200getIcon0d7_KjU() {
            return this.icon;
        }

        /* renamed from: getText-0d7_KjU, reason: not valid java name */
        public final long m1201getText0d7_KjU() {
            return this.text;
        }

        public final int hashCode() {
            int i = Color.$r8$clinit;
            ULong.Companion companion = ULong.Companion;
            return Long.hashCode(this.deselectedIcon) + Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.text) * 31, 31, this.icon);
        }

        public final String toString() {
            String m682toStringimpl = Color.m682toStringimpl(this.text);
            String m682toStringimpl2 = Color.m682toStringimpl(this.icon);
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ColorConfiguration(text=", m682toStringimpl, ", icon=", m682toStringimpl2, ", deselectedIcon="), Color.m682toStringimpl(this.deselectedIcon), ")");
        }
    }

    /* loaded from: classes3.dex */
    public final class MoneybotSharedElementKeys {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MoneybotSharedElementKeys)) {
                return false;
            }
            MoneybotToolbarSharedKey$Leading moneybotToolbarSharedKey$Leading = MoneybotToolbarSharedKey$Leading.INSTANCE;
            if (!moneybotToolbarSharedKey$Leading.equals(moneybotToolbarSharedKey$Leading)) {
                return false;
            }
            MoneybotToolbarSharedKey$Trailing moneybotToolbarSharedKey$Trailing = MoneybotToolbarSharedKey$Trailing.INSTANCE;
            return moneybotToolbarSharedKey$Trailing.equals(moneybotToolbarSharedKey$Trailing);
        }

        public final int hashCode() {
            return -1814997250;
        }

        public final String toString() {
            return "MoneybotSharedElementKeys(leadingButtonKey=" + MoneybotToolbarSharedKey$Leading.INSTANCE + ", trailingButtonKey=" + MoneybotToolbarSharedKey$Trailing.INSTANCE + ")";
        }
    }

    /* loaded from: classes3.dex */
    public final class SearchSharedElementKeys {
        public final DiscoverTabSharedKey$SearchBounds searchBoundsKey;
        public final DiscoverTabSharedKey$SearchIcon searchIconKey;

        public SearchSharedElementKeys(DiscoverTabSharedKey$SearchBounds discoverTabSharedKey$SearchBounds, DiscoverTabSharedKey$SearchIcon discoverTabSharedKey$SearchIcon) {
            this.searchBoundsKey = discoverTabSharedKey$SearchBounds;
            this.searchIconKey = discoverTabSharedKey$SearchIcon;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SearchSharedElementKeys)) {
                return false;
            }
            SearchSharedElementKeys searchSharedElementKeys = (SearchSharedElementKeys) obj;
            return this.searchBoundsKey.equals(searchSharedElementKeys.searchBoundsKey) && this.searchIconKey.equals(searchSharedElementKeys.searchIconKey);
        }

        public final Object getSearchBoundsKey() {
            return this.searchBoundsKey;
        }

        public final Object getSearchIconKey() {
            return this.searchIconKey;
        }

        public final int hashCode() {
            return this.searchIconKey.origin.hashCode() + (this.searchBoundsKey.origin.hashCode() * 31);
        }

        public final String toString() {
            return "SearchSharedElementKeys(searchBoundsKey=" + this.searchBoundsKey + ", searchIconKey=" + this.searchIconKey + ")";
        }
    }

    public ToolbarConfig(ListBuilder listBuilder, ListBuilder listBuilder2, ColorConfiguration colorConfiguration, TabToolbarInternalViewModel tabToolbarInternalViewModel, String str, Function1 function1, boolean z, boolean z2, SearchSharedElementKeys searchSharedElementKeys, MoneybotSharedElementKeys moneybotSharedElementKeys, int i) {
        List list = (i & 1) != 0 ? EmptyList.INSTANCE : listBuilder;
        List list2 = (i & 2) != 0 ? EmptyList.INSTANCE : listBuilder2;
        colorConfiguration = (i & 4) != 0 ? null : colorConfiguration;
        str = (i & 16) != 0 ? null : str;
        function1 = (i & 32) != 0 ? new Data$$ExternalSyntheticLambda0(8) : function1;
        z = (i & 64) != 0 ? true : z;
        z2 = (i & 128) != 0 ? false : z2;
        searchSharedElementKeys = (i & 256) != 0 ? null : searchSharedElementKeys;
        moneybotSharedElementKeys = (i & 512) != 0 ? null : moneybotSharedElementKeys;
        list.getClass();
        list2.getClass();
        this.startActions = list;
        this.endActions = list2;
        this.colorConfiguration = colorConfiguration;
        this.toolbarInternalModel = tabToolbarInternalViewModel;
        this.title = str;
        this.onEvent = function1;
        this.useIconColorAroundProfile = z;
        this.showMoneybotTooltip = z2;
        this.searchSharedElementKeys = searchSharedElementKeys;
        this.moneybotSharedElementKeys = moneybotSharedElementKeys;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToolbarConfig)) {
            return false;
        }
        ToolbarConfig toolbarConfig = (ToolbarConfig) obj;
        return this.startActions.equals(toolbarConfig.startActions) && this.endActions.equals(toolbarConfig.endActions) && Intrinsics.areEqual(this.colorConfiguration, toolbarConfig.colorConfiguration) && Intrinsics.areEqual(this.toolbarInternalModel, toolbarConfig.toolbarInternalModel) && Intrinsics.areEqual(this.title, toolbarConfig.title) && this.onEvent.equals(toolbarConfig.onEvent) && this.useIconColorAroundProfile == toolbarConfig.useIconColorAroundProfile && this.showMoneybotTooltip == toolbarConfig.showMoneybotTooltip && Intrinsics.areEqual(this.searchSharedElementKeys, toolbarConfig.searchSharedElementKeys) && Intrinsics.areEqual(this.moneybotSharedElementKeys, toolbarConfig.moneybotSharedElementKeys);
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m(this.startActions.hashCode() * 31, 31, this.endActions);
        ColorConfiguration colorConfiguration = this.colorConfiguration;
        int hashCode = (m + (colorConfiguration == null ? 0 : colorConfiguration.hashCode())) * 31;
        TabToolbarInternalViewModel tabToolbarInternalViewModel = this.toolbarInternalModel;
        int hashCode2 = (hashCode + (tabToolbarInternalViewModel == null ? 0 : tabToolbarInternalViewModel.hashCode())) * 31;
        String str = this.title;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline1.m((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.onEvent), 31, this.useIconColorAroundProfile), 31, this.showMoneybotTooltip);
        SearchSharedElementKeys searchSharedElementKeys = this.searchSharedElementKeys;
        return ((m2 + (searchSharedElementKeys == null ? 0 : searchSharedElementKeys.hashCode())) * 31) + (this.moneybotSharedElementKeys != null ? -1814997250 : 0);
    }

    public final String toString() {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("ToolbarConfig(startActions=", ", endActions=", ", colorConfiguration=", this.startActions, this.endActions);
        m.append(this.colorConfiguration);
        m.append(", toolbarInternalModel=");
        m.append(this.toolbarInternalModel);
        m.append(", title=");
        m.append(this.title);
        m.append(", onEvent=");
        m.append(this.onEvent);
        m.append(", useIconColorAroundProfile=");
        re$$ExternalSyntheticOutline0.m(m, this.useIconColorAroundProfile, ", showMoneybotTooltip=", this.showMoneybotTooltip, ", searchSharedElementKeys=");
        m.append(this.searchSharedElementKeys);
        m.append(", moneybotSharedElementKeys=");
        m.append(this.moneybotSharedElementKeys);
        m.append(")");
        return m.toString();
    }
}
