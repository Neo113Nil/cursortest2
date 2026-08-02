package com.squareup.cash.core.navigationcontainer.models;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import app.cash.broadway.screen.Screen;
import app.cash.versioned.Versioned;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public interface NavigationModel {

    public final class Initializing implements NavigationModel {
        public static final Initializing INSTANCE = new Initializing();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Initializing);
        }

        public final int hashCode() {
            return -1631434996;
        }

        public final String toString() {
            return "Initializing";
        }
    }

    public final class Paused implements NavigationModel {
        public static final Paused INSTANCE = new Paused();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Paused);
        }

        public final int hashCode() {
            return -1049340115;
        }

        public final String toString() {
            return "Paused";
        }
    }

    public final class Ready implements NavigationModel {
        public final FullScreenLocation fullScreen;
        public final OverlayLocation overlay;
        public final PersistentOrderedSet statesToKeep;
        public final Swipe swipe;

        public final class FullScreenLocation implements Location {
            public final Screen initiatorScreen;
            public final boolean isBack;
            public final ImmutableList overlayResults;
            public final String previousFullScreenStateKey;
            public final Object result;
            public final CoroutineScope scope;
            public final Screen screen;
            public final boolean showTabs;
            public final String stateKey;

            /* loaded from: classes6.dex */
            public final class OverlayResult {
                public final Object result;
                public final Screen screen;
                public final String stateKey;

                public OverlayResult(String str, Screen screen, Object obj) {
                    str.getClass();
                    screen.getClass();
                    this.stateKey = str;
                    this.screen = screen;
                    this.result = obj;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof OverlayResult)) {
                        return false;
                    }
                    OverlayResult overlayResult = (OverlayResult) obj;
                    return Intrinsics.areEqual(this.stateKey, overlayResult.stateKey) && Intrinsics.areEqual(this.screen, overlayResult.screen) && Intrinsics.areEqual(this.result, overlayResult.result);
                }

                public final Object getResult() {
                    return this.result;
                }

                public final Screen getScreen() {
                    return this.screen;
                }

                public final String getStateKey() {
                    return this.stateKey;
                }

                public final int hashCode() {
                    int m = BalanceFeedKt$$ExternalSyntheticOutline0.m(this.screen, this.stateKey.hashCode() * 31, 31);
                    Object obj = this.result;
                    return m + (obj == null ? 0 : obj.hashCode());
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("OverlayResult(stateKey=");
                    sb.append(this.stateKey);
                    sb.append(", screen=");
                    sb.append(this.screen);
                    sb.append(", result=");
                    return Recorder$$ExternalSyntheticOutline1.m(sb, this.result, ")");
                }
            }

            public FullScreenLocation(String str, Screen screen, CoroutineScope coroutineScope, String str2, boolean z, boolean z2, Object obj, AbstractPersistentList abstractPersistentList, Screen screen2) {
                str.getClass();
                screen.getClass();
                coroutineScope.getClass();
                abstractPersistentList.getClass();
                this.stateKey = str;
                this.screen = screen;
                this.scope = coroutineScope;
                this.previousFullScreenStateKey = str2;
                this.isBack = z;
                this.showTabs = z2;
                this.result = obj;
                this.overlayResults = abstractPersistentList;
                this.initiatorScreen = screen2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FullScreenLocation)) {
                    return false;
                }
                FullScreenLocation fullScreenLocation = (FullScreenLocation) obj;
                return Intrinsics.areEqual(this.stateKey, fullScreenLocation.stateKey) && Intrinsics.areEqual(this.screen, fullScreenLocation.screen) && Intrinsics.areEqual(this.scope, fullScreenLocation.scope) && Intrinsics.areEqual(this.previousFullScreenStateKey, fullScreenLocation.previousFullScreenStateKey) && this.isBack == fullScreenLocation.isBack && this.showTabs == fullScreenLocation.showTabs && Intrinsics.areEqual(this.result, fullScreenLocation.result) && Intrinsics.areEqual(this.overlayResults, fullScreenLocation.overlayResults) && Intrinsics.areEqual(this.initiatorScreen, fullScreenLocation.initiatorScreen);
            }

            @Override // com.squareup.cash.core.navigationcontainer.models.NavigationModel.Ready.Location
            public final CoroutineScope getScope() {
                return this.scope;
            }

            @Override // com.squareup.cash.core.navigationcontainer.models.NavigationModel.Ready.Location
            public final Screen getScreen() {
                return this.screen;
            }

            @Override // com.squareup.cash.core.navigationcontainer.models.NavigationModel.Ready.Location
            public final String getStateKey() {
                return this.stateKey;
            }

            public final int hashCode() {
                int hashCode = (this.scope.hashCode() + BalanceFeedKt$$ExternalSyntheticOutline0.m(this.screen, this.stateKey.hashCode() * 31, 31)) * 31;
                String str = this.previousFullScreenStateKey;
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isBack), 31, this.showTabs);
                Object obj = this.result;
                int m2 = BalanceFeedKt$$ExternalSyntheticOutline0.m(this.overlayResults, (m + (obj == null ? 0 : obj.hashCode())) * 31, 31);
                Screen screen = this.initiatorScreen;
                return m2 + (screen != null ? screen.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("FullScreenLocation(stateKey=");
                sb.append(this.stateKey);
                sb.append(", screen=");
                sb.append(this.screen);
                sb.append(", scope=");
                sb.append(this.scope);
                sb.append(", previousFullScreenStateKey=");
                sb.append(this.previousFullScreenStateKey);
                sb.append(", isBack=");
                re$$ExternalSyntheticOutline0.m(sb, this.isBack, ", showTabs=", this.showTabs, ", result=");
                sb.append(this.result);
                sb.append(", overlayResults=");
                sb.append(this.overlayResults);
                sb.append(", initiatorScreen=");
                sb.append(this.initiatorScreen);
                sb.append(")");
                return sb.toString();
            }
        }

        public interface Location {
            CoroutineScope getScope();

            Screen getScreen();

            String getStateKey();
        }

        public final class OverlayLocation implements Location {
            public final CoroutineScope scope;
            public final Screen screen;
            public final String stateKey;

            public OverlayLocation(String str, Screen screen, CoroutineScope coroutineScope) {
                str.getClass();
                screen.getClass();
                coroutineScope.getClass();
                this.stateKey = str;
                this.screen = screen;
                this.scope = coroutineScope;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OverlayLocation)) {
                    return false;
                }
                OverlayLocation overlayLocation = (OverlayLocation) obj;
                return Intrinsics.areEqual(this.stateKey, overlayLocation.stateKey) && Intrinsics.areEqual(this.screen, overlayLocation.screen) && Intrinsics.areEqual(this.scope, overlayLocation.scope);
            }

            @Override // com.squareup.cash.core.navigationcontainer.models.NavigationModel.Ready.Location
            public final CoroutineScope getScope() {
                return this.scope;
            }

            @Override // com.squareup.cash.core.navigationcontainer.models.NavigationModel.Ready.Location
            public final Screen getScreen() {
                return this.screen;
            }

            @Override // com.squareup.cash.core.navigationcontainer.models.NavigationModel.Ready.Location
            public final String getStateKey() {
                return this.stateKey;
            }

            public final int hashCode() {
                return this.scope.hashCode() + BalanceFeedKt$$ExternalSyntheticOutline0.m(this.screen, this.stateKey.hashCode() * 31, 31);
            }

            public final String toString() {
                return "OverlayLocation(stateKey=" + this.stateKey + ", screen=" + this.screen + ", scope=" + this.scope + ")";
            }
        }

        public Ready(FullScreenLocation fullScreenLocation, OverlayLocation overlayLocation, PersistentOrderedSet persistentOrderedSet, Swipe swipe) {
            this.fullScreen = fullScreenLocation;
            this.overlay = overlayLocation;
            this.statesToKeep = persistentOrderedSet;
            this.swipe = swipe;
        }

        public final class Swipe {
            public final Versioned activePage;
            public final FullScreenLocation location;
            public final List pages;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Page {
                public static final /* synthetic */ EnumEntriesList $ENTRIES;
                public static final /* synthetic */ Page[] $VALUES;
                public static final Page MainTabs;
                public static final Page SidePanel;

                static {
                    Page page = new Page("SidePanel", 0);
                    SidePanel = page;
                    Page page2 = new Page("MainTabs", 1);
                    MainTabs = page2;
                    Page[] pageArr = {page, page2};
                    $VALUES = pageArr;
                    $ENTRIES = new EnumEntriesList(pageArr);
                }

                public static Page valueOf(String str) {
                    return (Page) Enum.valueOf(Page.class, str);
                }

                public static Page[] values() {
                    return (Page[]) $VALUES.clone();
                }
            }

            public Swipe(Versioned versioned, int i) {
                this(null, CollectionsKt.toList(Page.$ENTRIES), (i & 4) != 0 ? new Versioned(Page.MainTabs, 0) : versioned);
            }

            public static Swipe copy$default(Swipe swipe, FullScreenLocation fullScreenLocation, Versioned versioned, int i) {
                if ((i & 1) != 0) {
                    fullScreenLocation = swipe.location;
                }
                List list = swipe.pages;
                if ((i & 4) != 0) {
                    versioned = swipe.activePage;
                }
                swipe.getClass();
                list.getClass();
                versioned.getClass();
                return new Swipe(fullScreenLocation, list, versioned);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Swipe)) {
                    return false;
                }
                Swipe swipe = (Swipe) obj;
                return Intrinsics.areEqual(this.location, swipe.location) && Intrinsics.areEqual(this.pages, swipe.pages) && Intrinsics.areEqual(this.activePage, swipe.activePage);
            }

            public final int hashCode() {
                FullScreenLocation fullScreenLocation = this.location;
                return this.activePage.hashCode() + Recorder$$ExternalSyntheticOutline2.m((fullScreenLocation == null ? 0 : fullScreenLocation.hashCode()) * 31, 31, this.pages);
            }

            public final String toString() {
                return "Swipe(location=" + this.location + ", pages=" + this.pages + ", activePage=" + this.activePage + ")";
            }

            public Swipe(FullScreenLocation fullScreenLocation, List list, Versioned versioned) {
                list.getClass();
                versioned.getClass();
                this.location = fullScreenLocation;
                this.pages = list;
                this.activePage = versioned;
            }
        }
    }
}
