package com.squareup.cash.db2;

import com.squareup.cash.mosaic.models.v1.TextFormat;
import com.squareup.cash.mosaic.resources.api.v2.ReleaseState;
import com.squareup.protos.cash.ui.Color;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ExpressivePaymentsBackgroundConfig {
    public final String accessibility_description;
    public final Color background_color;
    public final TextFormat default_text_format;
    public final List effects;
    public final boolean is_default;
    public final String main_url;
    public final String name;
    public final String preview_url;
    public final Integer priority;
    public final ReleaseState release_state;
    public final List tags;

    public ExpressivePaymentsBackgroundConfig(String str, String str2, String str3, Color color, TextFormat textFormat, List list, Integer num, ReleaseState releaseState, List list2, boolean z, String str4) {
        releaseState.getClass();
        this.name = str;
        this.main_url = str2;
        this.preview_url = str3;
        this.background_color = color;
        this.default_text_format = textFormat;
        this.effects = list;
        this.priority = num;
        this.release_state = releaseState;
        this.tags = list2;
        this.is_default = z;
        this.accessibility_description = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExpressivePaymentsBackgroundConfig)) {
            return false;
        }
        ExpressivePaymentsBackgroundConfig expressivePaymentsBackgroundConfig = (ExpressivePaymentsBackgroundConfig) obj;
        return Intrinsics.areEqual(this.name, expressivePaymentsBackgroundConfig.name) && Intrinsics.areEqual(this.main_url, expressivePaymentsBackgroundConfig.main_url) && Intrinsics.areEqual(this.preview_url, expressivePaymentsBackgroundConfig.preview_url) && Intrinsics.areEqual(this.background_color, expressivePaymentsBackgroundConfig.background_color) && Intrinsics.areEqual(this.default_text_format, expressivePaymentsBackgroundConfig.default_text_format) && Intrinsics.areEqual(this.effects, expressivePaymentsBackgroundConfig.effects) && Intrinsics.areEqual(this.priority, expressivePaymentsBackgroundConfig.priority) && this.release_state == expressivePaymentsBackgroundConfig.release_state && Intrinsics.areEqual(this.tags, expressivePaymentsBackgroundConfig.tags) && this.is_default == expressivePaymentsBackgroundConfig.is_default && Intrinsics.areEqual(this.accessibility_description, expressivePaymentsBackgroundConfig.accessibility_description);
    }

    public final int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.main_url;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.preview_url;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Color color = this.background_color;
        int hashCode4 = (hashCode3 + (color == null ? 0 : color.hashCode())) * 31;
        TextFormat textFormat = this.default_text_format;
        int hashCode5 = (hashCode4 + (textFormat == null ? 0 : textFormat.hashCode())) * 31;
        List list = this.effects;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.priority;
        int hashCode7 = (this.release_state.hashCode() + ((hashCode6 + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        List list2 = this.tags;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.is_default);
        String str4 = this.accessibility_description;
        return m + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ExpressivePaymentsBackgroundConfig(name=", this.name, ", main_url=", this.main_url, ", preview_url=");
        m.append(this.preview_url);
        m.append(", background_color=");
        m.append(this.background_color);
        m.append(", default_text_format=");
        m.append(this.default_text_format);
        m.append(", effects=");
        m.append(this.effects);
        m.append(", priority=");
        m.append(this.priority);
        m.append(", release_state=");
        m.append(this.release_state);
        m.append(", tags=");
        m.append(this.tags);
        m.append(", is_default=");
        m.append(this.is_default);
        m.append(", accessibility_description=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.accessibility_description, ")");
    }
}
