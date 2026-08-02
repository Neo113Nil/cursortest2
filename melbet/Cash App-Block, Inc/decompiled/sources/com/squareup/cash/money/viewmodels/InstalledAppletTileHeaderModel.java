package com.squareup.cash.money.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.Color;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.arcade.Icons;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InstalledAppletTileHeaderModel {
    public final Icon endIcon;
    public final Icon startIcon;
    public final String title;
    public final String titleCaption;

    public final class Icon {
        public final String contentDescription;
        public final long tint;

        public Icon(long j, String str) {
            zzd zzdVar = Icons.Companion;
            this.tint = j;
            this.contentDescription = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Icon)) {
                return false;
            }
            Icon icon = (Icon) obj;
            zzd zzdVar = Icons.Companion;
            return Color.m676equalsimpl0(this.tint, icon.tint) && Intrinsics.areEqual(this.contentDescription, icon.contentDescription);
        }

        public final int hashCode() {
            int hashCode = Icons.SubtlePush16.hashCode() * 31;
            int i = Color.$r8$clinit;
            ULong.Companion companion = ULong.Companion;
            int m = Recorder$$ExternalSyntheticOutline2.m(hashCode, 31, this.tint);
            String str = this.contentDescription;
            return m + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            Icons icons = Icons.SubtlePush16;
            String m682toStringimpl = Color.m682toStringimpl(this.tint);
            StringBuilder sb = new StringBuilder("Icon(icon=");
            sb.append(icons);
            sb.append(", tint=");
            sb.append(m682toStringimpl);
            sb.append(", contentDescription=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.contentDescription, ")");
        }
    }

    public InstalledAppletTileHeaderModel(String str, String str2, Icon icon, int i) {
        str2 = (i & 2) != 0 ? null : str2;
        icon = (i & 8) != 0 ? null : icon;
        str.getClass();
        this.title = str;
        this.titleCaption = str2;
        this.startIcon = null;
        this.endIcon = icon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstalledAppletTileHeaderModel)) {
            return false;
        }
        InstalledAppletTileHeaderModel installedAppletTileHeaderModel = (InstalledAppletTileHeaderModel) obj;
        return Intrinsics.areEqual(this.title, installedAppletTileHeaderModel.title) && Intrinsics.areEqual(this.titleCaption, installedAppletTileHeaderModel.titleCaption) && Intrinsics.areEqual(this.startIcon, installedAppletTileHeaderModel.startIcon) && Intrinsics.areEqual(this.endIcon, installedAppletTileHeaderModel.endIcon);
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.titleCaption;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Icon icon = this.startIcon;
        int hashCode3 = (hashCode2 + (icon == null ? 0 : icon.hashCode())) * 31;
        Icon icon2 = this.endIcon;
        return hashCode3 + (icon2 != null ? icon2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InstalledAppletTileHeaderModel(title=", this.title, ", titleCaption=", this.titleCaption, ", startIcon=");
        m.append(this.startIcon);
        m.append(", endIcon=");
        m.append(this.endIcon);
        m.append(")");
        return m.toString();
    }
}
