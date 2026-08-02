package com.squareup.cash.borrow.applets.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewModel;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.lending.sync_values.BorrowData;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface BorrowAppletTileModel {

    /* loaded from: classes4.dex */
    public interface Clickable extends BorrowAppletTileModel {
        String getClientRoute();
    }

    public final class Installed implements Clickable {
        public final String clientRoute;
        public final ArrayList rows;
        public final Visual sharedVisual;
        public final String title;

        public final class Row {
            public final Text text;
            public final Visual visual;

            public final class Text {
                public final String brief;
                public final String emphasis;

                public Text(String str, String str2) {
                    this.emphasis = str;
                    this.brief = str2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Text)) {
                        return false;
                    }
                    Text text = (Text) obj;
                    return Intrinsics.areEqual(this.emphasis, text.emphasis) && Intrinsics.areEqual(this.brief, text.brief);
                }

                public final int hashCode() {
                    String str = this.emphasis;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.brief;
                    return hashCode + (str2 != null ? str2.hashCode() : 0);
                }

                public final String toString() {
                    return Boxes$$ExternalSyntheticOutline1.m("Text(emphasis=", this.emphasis, ", brief=", this.brief, ")");
                }
            }

            public Row(Visual visual, Text text) {
                this.visual = visual;
                this.text = text;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Row)) {
                    return false;
                }
                Row row = (Row) obj;
                return Intrinsics.areEqual(this.visual, row.visual) && Intrinsics.areEqual(this.text, row.text);
            }

            public final int hashCode() {
                Visual visual = this.visual;
                int hashCode = (visual == null ? 0 : visual.hashCode()) * 31;
                Text text = this.text;
                return hashCode + (text != null ? text.hashCode() : 0);
            }

            public final String toString() {
                return "Row(visual=" + this.visual + ", text=" + this.text + ")";
            }
        }

        public Installed(String str, String str2, ArrayList arrayList, Visual visual) {
            str.getClass();
            str2.getClass();
            this.clientRoute = str;
            this.title = str2;
            this.rows = arrayList;
            this.sharedVisual = visual;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Installed)) {
                return false;
            }
            Installed installed = (Installed) obj;
            return Intrinsics.areEqual(this.clientRoute, installed.clientRoute) && Intrinsics.areEqual(this.title, installed.title) && this.rows.equals(installed.rows) && Intrinsics.areEqual(this.sharedVisual, installed.sharedVisual);
        }

        @Override // com.squareup.cash.borrow.applets.viewmodels.BorrowAppletTileModel.Clickable
        public final String getClientRoute() {
            return this.clientRoute;
        }

        public final int hashCode() {
            int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.rows, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.clientRoute.hashCode() * 31, 31, this.title), 31);
            Visual visual = this.sharedVisual;
            return m + (visual == null ? 0 : visual.hashCode());
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Installed(clientRoute=", this.clientRoute, ", title=", this.title, ", rows=");
            m.append(this.rows);
            m.append(", sharedVisual=");
            m.append(this.sharedVisual);
            m.append(")");
            return m.toString();
        }
    }

    public final class Loading implements BorrowAppletTileModel {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1995544085;
        }

        public final String toString() {
            return "Loading(appletTitle=Borrow)";
        }
    }

    public final class Uninstalled implements Clickable {
        public final String clientRoute;
        public final Visual.Graphic graphic;
        public final PromotedAppletTileViewModel.Loaded promotedModel;
        public final String secondaryText;
        public final String title;

        public Uninstalled(String str, String str2, Visual.Graphic graphic, String str3, PromotedAppletTileViewModel.Loaded loaded) {
            str.getClass();
            str2.getClass();
            this.clientRoute = str;
            this.title = str2;
            this.graphic = graphic;
            this.secondaryText = str3;
            this.promotedModel = loaded;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Uninstalled)) {
                return false;
            }
            Uninstalled uninstalled = (Uninstalled) obj;
            return Intrinsics.areEqual(this.clientRoute, uninstalled.clientRoute) && Intrinsics.areEqual(this.title, uninstalled.title) && this.graphic.equals(uninstalled.graphic) && Intrinsics.areEqual(this.secondaryText, uninstalled.secondaryText) && Intrinsics.areEqual(this.promotedModel, uninstalled.promotedModel);
        }

        @Override // com.squareup.cash.borrow.applets.viewmodels.BorrowAppletTileModel.Clickable
        public final String getClientRoute() {
            return this.clientRoute;
        }

        public final int hashCode() {
            int hashCode = (this.graphic.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.clientRoute.hashCode() * 31, 31, this.title)) * 31;
            String str = this.secondaryText;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            PromotedAppletTileViewModel.Loaded loaded = this.promotedModel;
            return hashCode2 + (loaded != null ? loaded.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Uninstalled(clientRoute=", this.clientRoute, ", title=", this.title, ", graphic=");
            m.append(this.graphic);
            m.append(", secondaryText=");
            m.append(this.secondaryText);
            m.append(", promotedModel=");
            m.append(this.promotedModel);
            m.append(")");
            return m.toString();
        }
    }

    public interface Visual {

        public final class Allocations implements Visual {
            public final ArrayList values;

            public Allocations(ArrayList arrayList) {
                this.values = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Allocations) && this.values.equals(((Allocations) obj).values);
            }

            public final int hashCode() {
                return this.values.hashCode();
            }

            public final String toString() {
                return Request$Priority$EnumUnboxingLocalUtility.m("Allocations(values=", ")", this.values);
            }
        }

        public final class Graphic implements Visual {
            public final Color foregroundColor;
            public final BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic.Icon foregroundIcon;
            public final Color primaryColor;

            public Graphic(Color color, BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic.Icon icon, Color color2) {
                color.getClass();
                this.primaryColor = color;
                this.foregroundIcon = icon;
                this.foregroundColor = color2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Graphic)) {
                    return false;
                }
                Graphic graphic = (Graphic) obj;
                return Intrinsics.areEqual(this.primaryColor, graphic.primaryColor) && this.foregroundIcon == graphic.foregroundIcon && Intrinsics.areEqual(this.foregroundColor, graphic.foregroundColor);
            }

            public final int hashCode() {
                int hashCode = this.primaryColor.hashCode() * 31;
                BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic.Icon icon = this.foregroundIcon;
                int hashCode2 = (hashCode + (icon == null ? 0 : icon.hashCode())) * 31;
                Color color = this.foregroundColor;
                return hashCode2 + (color != null ? color.hashCode() : 0);
            }

            public final String toString() {
                return "Graphic(primaryColor=" + this.primaryColor + ", foregroundIcon=" + this.foregroundIcon + ", foregroundColor=" + this.foregroundColor + ")";
            }
        }
    }
}
