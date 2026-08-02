package com.squareup.cash.investing.db;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Investment_performance {
    public final String entity_token;
    public final List sections;
    public final String title;

    public Investment_performance(String str, String str2, List list) {
        str.getClass();
        list.getClass();
        this.entity_token = str;
        this.title = str2;
        this.sections = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Investment_performance)) {
            return false;
        }
        Investment_performance investment_performance = (Investment_performance) obj;
        return Intrinsics.areEqual(this.entity_token, investment_performance.entity_token) && Intrinsics.areEqual(this.title, investment_performance.title) && Intrinsics.areEqual(this.sections, investment_performance.sections);
    }

    public final int hashCode() {
        int hashCode = this.entity_token.hashCode() * 31;
        String str = this.title;
        return this.sections.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Investment_performance(entity_token=", this.entity_token, ", title=", this.title, ", sections="), this.sections, ")");
    }
}
