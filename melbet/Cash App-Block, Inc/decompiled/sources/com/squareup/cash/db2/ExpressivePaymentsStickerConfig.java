package com.squareup.cash.db2;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.sqldelight.EnumColumnAdapter;
import com.squareup.cash.db.WireRepeatedAdapter;
import com.squareup.cash.mosaic.resources.api.v2.ReleaseState;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ExpressivePaymentsStickerConfig {
    public final String accessibility_description;
    public final List effects;
    public final boolean is_default;
    public final String main_url;
    public final String name;
    public final String preview_url;
    public final Integer priority;
    public final ReleaseState release_state;
    public final List tags;

    public ExpressivePaymentsStickerConfig(String str, String str2, String str3, List list, Integer num, ReleaseState releaseState, List list2, boolean z, String str4) {
        releaseState.getClass();
        this.name = str;
        this.main_url = str2;
        this.preview_url = str3;
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
        if (!(obj instanceof ExpressivePaymentsStickerConfig)) {
            return false;
        }
        ExpressivePaymentsStickerConfig expressivePaymentsStickerConfig = (ExpressivePaymentsStickerConfig) obj;
        return Intrinsics.areEqual(this.name, expressivePaymentsStickerConfig.name) && Intrinsics.areEqual(this.main_url, expressivePaymentsStickerConfig.main_url) && Intrinsics.areEqual(this.preview_url, expressivePaymentsStickerConfig.preview_url) && Intrinsics.areEqual(this.effects, expressivePaymentsStickerConfig.effects) && Intrinsics.areEqual(this.priority, expressivePaymentsStickerConfig.priority) && this.release_state == expressivePaymentsStickerConfig.release_state && Intrinsics.areEqual(this.tags, expressivePaymentsStickerConfig.tags) && this.is_default == expressivePaymentsStickerConfig.is_default && Intrinsics.areEqual(this.accessibility_description, expressivePaymentsStickerConfig.accessibility_description);
    }

    public final int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.main_url;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.preview_url;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.effects;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.priority;
        int hashCode5 = (this.release_state.hashCode() + ((hashCode4 + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        List list2 = this.tags;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.is_default);
        String str4 = this.accessibility_description;
        return m + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ExpressivePaymentsStickerConfig(name=", this.name, ", main_url=", this.main_url, ", preview_url=");
        NavAction$$ExternalSyntheticOutline0.m(this.preview_url, ", effects=", ", priority=", m, this.effects);
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

    /* loaded from: classes.dex */
    public final class Adapter {
        public final WireRepeatedAdapter effectsAdapter;
        public final EnumColumnAdapter release_stateAdapter;
        public final WireRepeatedAdapter tagsAdapter;

        public Adapter(WireRepeatedAdapter wireRepeatedAdapter, WireRepeatedAdapter wireRepeatedAdapter2, EnumColumnAdapter enumColumnAdapter) {
            this.effectsAdapter = wireRepeatedAdapter;
            this.tagsAdapter = wireRepeatedAdapter2;
            this.release_stateAdapter = enumColumnAdapter;
        }

        public Adapter(WireRepeatedAdapter wireRepeatedAdapter, EnumColumnAdapter enumColumnAdapter, WireRepeatedAdapter wireRepeatedAdapter2) {
            this.effectsAdapter = wireRepeatedAdapter;
            this.release_stateAdapter = enumColumnAdapter;
            this.tagsAdapter = wireRepeatedAdapter2;
        }
    }
}
