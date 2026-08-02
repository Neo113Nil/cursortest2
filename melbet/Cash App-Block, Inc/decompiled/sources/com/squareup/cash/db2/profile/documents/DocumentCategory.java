package com.squareup.cash.db2.profile.documents;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.protos.document.DocumentCategoryEntity;
import com.squareup.protos.document.VersionData;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DocumentCategory {
    public final String category_id;
    public final Long display_date;
    public final String display_name;
    public final Integer display_order;
    public final String entity_id;
    public final String parent_category_id;
    public final DocumentCategoryEntity.RenderStyle render_style;
    public final VersionData version_data;

    public DocumentCategory(String str, String str2, String str3, String str4, Integer num, Long l, DocumentCategoryEntity.RenderStyle renderStyle, VersionData versionData) {
        Request$Priority$EnumUnboxingLocalUtility.m(str, str2, str3, str4);
        this.entity_id = str;
        this.category_id = str2;
        this.parent_category_id = str3;
        this.display_name = str4;
        this.display_order = num;
        this.display_date = l;
        this.render_style = renderStyle;
        this.version_data = versionData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocumentCategory)) {
            return false;
        }
        DocumentCategory documentCategory = (DocumentCategory) obj;
        return Intrinsics.areEqual(this.entity_id, documentCategory.entity_id) && Intrinsics.areEqual(this.category_id, documentCategory.category_id) && Intrinsics.areEqual(this.parent_category_id, documentCategory.parent_category_id) && Intrinsics.areEqual(this.display_name, documentCategory.display_name) && Intrinsics.areEqual(this.display_order, documentCategory.display_order) && Intrinsics.areEqual(this.display_date, documentCategory.display_date) && this.render_style == documentCategory.render_style && Intrinsics.areEqual(this.version_data, documentCategory.version_data);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.entity_id.hashCode() * 31, 31, this.category_id), 31, this.parent_category_id), 31, this.display_name);
        Integer num = this.display_order;
        int hashCode = (m + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.display_date;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        DocumentCategoryEntity.RenderStyle renderStyle = this.render_style;
        int hashCode3 = (hashCode2 + (renderStyle == null ? 0 : renderStyle.hashCode())) * 31;
        VersionData versionData = this.version_data;
        return hashCode3 + (versionData != null ? versionData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DocumentCategory(entity_id=", this.entity_id, ", category_id=", this.category_id, ", parent_category_id=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.parent_category_id, ", display_name=", this.display_name, ", display_order=");
        m.append(this.display_order);
        m.append(", display_date=");
        m.append(this.display_date);
        m.append(", render_style=");
        m.append(this.render_style);
        m.append(", version_data=");
        m.append(this.version_data);
        m.append(")");
        return m.toString();
    }
}
