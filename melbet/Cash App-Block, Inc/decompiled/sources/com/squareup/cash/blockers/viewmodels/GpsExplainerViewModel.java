package com.squareup.cash.blockers.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Icon;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class GpsExplainerViewModel {
    public final String buttonLabel;
    public final String description;
    public final ArrayList details;
    public final String footerMarkdown;
    public final Icon image;
    public final String title;

    public final class DetailModel {
        public final Icon icon;
        public final String title;

        public DetailModel(Icon icon, String str) {
            this.icon = icon;
            this.title = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DetailModel)) {
                return false;
            }
            DetailModel detailModel = (DetailModel) obj;
            return this.icon.equals(detailModel.icon) && this.title.equals(detailModel.title);
        }

        public final int hashCode() {
            return this.title.hashCode() + (this.icon.hashCode() * 31);
        }

        public final String toString() {
            return "DetailModel(icon=" + this.icon + ", title=" + this.title + ")";
        }
    }

    public GpsExplainerViewModel(Icon icon, String str, String str2, ArrayList arrayList, String str3, String str4) {
        icon.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.image = icon;
        this.title = str;
        this.description = str2;
        this.details = arrayList;
        this.footerMarkdown = str3;
        this.buttonLabel = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GpsExplainerViewModel)) {
            return false;
        }
        GpsExplainerViewModel gpsExplainerViewModel = (GpsExplainerViewModel) obj;
        return Intrinsics.areEqual(this.image, gpsExplainerViewModel.image) && Intrinsics.areEqual(this.title, gpsExplainerViewModel.title) && Intrinsics.areEqual(this.description, gpsExplainerViewModel.description) && this.details.equals(gpsExplainerViewModel.details) && Intrinsics.areEqual(this.footerMarkdown, gpsExplainerViewModel.footerMarkdown) && Intrinsics.areEqual(this.buttonLabel, gpsExplainerViewModel.buttonLabel);
    }

    public final int hashCode() {
        return this.buttonLabel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.details, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.image.hashCode() * 31, 31, this.title), 31, this.description), 31), 31, this.footerMarkdown);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GpsExplainerViewModel(image=");
        sb.append(this.image);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", details=");
        sb.append(this.details);
        sb.append(", footerMarkdown=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.footerMarkdown, ", buttonLabel=", this.buttonLabel, ")");
    }
}
