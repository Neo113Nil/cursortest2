package com.squareup.cash.cdf.cashcard;

import android.os.Build;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CashCardCustomizePreviewPerformance implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Integer average_fps;
    public final String engine;
    public final String gpu;
    public final LinkedHashMap parameters;
    public final String theme;

    public CashCardCustomizePreviewPerformance(Integer num, String str, String str2, String str3) {
        String str4 = Build.MODEL;
        this.gpu = str;
        this.theme = str2;
        this.average_fps = num;
        this.engine = str3;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "CashCard", "cdf_action", "Customize");
        Countries.putSafe(m, "device", str4);
        Countries.putSafe(m, "gpu", str);
        Countries.putSafe(m, "theme", str2);
        Countries.putSafe(m, "average_fps", num);
        Countries.putSafe(m, "engine", str3);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashCardCustomizePreviewPerformance)) {
            return false;
        }
        CashCardCustomizePreviewPerformance cashCardCustomizePreviewPerformance = (CashCardCustomizePreviewPerformance) obj;
        String str = Build.MODEL;
        return Intrinsics.areEqual(str, str) && this.gpu.equals(cashCardCustomizePreviewPerformance.gpu) && this.theme.equals(cashCardCustomizePreviewPerformance.theme) && this.average_fps.equals(cashCardCustomizePreviewPerformance.average_fps) && this.engine.equals(cashCardCustomizePreviewPerformance.engine);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CashCard Customize PreviewPerformance";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = Build.MODEL;
        return this.engine.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.gpu), 31, this.theme), 31, this.average_fps);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CashCardCustomizePreviewPerformance(device=", Build.MODEL, ", gpu=", this.gpu, ", theme=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.theme, ", average_fps=", this.average_fps, ", engine=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.engine, ")");
    }
}
