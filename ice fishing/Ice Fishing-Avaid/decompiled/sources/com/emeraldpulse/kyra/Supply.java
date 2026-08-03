package com.emeraldpulse.kyra;

import androidx.autofill.HintConstants;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: MainActivity.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003JE\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0007HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0014\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\rR\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lcom/emeraldpulse/kyra/Supply;", "", "id", "", HintConstants.AUTOFILL_HINT_NAME, "area", "quantity", "", "minimum", "unit", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "getArea", "getQuantity", "()I", "getMinimum", "getUnit", NotificationCompat.CATEGORY_STATUS, "getStatus", "fill", "", "getFill", "()F", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
final /* data */ class Supply {
    private final String area;
    private final String id;
    private final int minimum;
    private final String name;
    private final int quantity;
    private final String unit;

    public static /* synthetic */ Supply copy$default(Supply supply, String str, String str2, String str3, int i, int i2, String str4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = supply.id;
        }
        if ((i3 & 2) != 0) {
            str2 = supply.name;
        }
        if ((i3 & 4) != 0) {
            str3 = supply.area;
        }
        if ((i3 & 8) != 0) {
            i = supply.quantity;
        }
        if ((i3 & 16) != 0) {
            i2 = supply.minimum;
        }
        if ((i3 & 32) != 0) {
            str4 = supply.unit;
        }
        int i4 = i2;
        String str5 = str4;
        return supply.copy(str, str2, str3, i, i4, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getArea() {
        return this.area;
    }

    /* renamed from: component4, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    /* renamed from: component5, reason: from getter */
    public final int getMinimum() {
        return this.minimum;
    }

    /* renamed from: component6, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    public final Supply copy(String id, String name, String area, int quantity, int minimum, String unit) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(area, "area");
        Intrinsics.checkNotNullParameter(unit, "unit");
        return new Supply(id, name, area, quantity, minimum, unit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Supply)) {
            return false;
        }
        Supply supply = (Supply) other;
        return Intrinsics.areEqual(this.id, supply.id) && Intrinsics.areEqual(this.name, supply.name) && Intrinsics.areEqual(this.area, supply.area) && this.quantity == supply.quantity && this.minimum == supply.minimum && Intrinsics.areEqual(this.unit, supply.unit);
    }

    public int hashCode() {
        return (((((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.area.hashCode()) * 31) + this.quantity) * 31) + this.minimum) * 31) + this.unit.hashCode();
    }

    public String toString() {
        return "Supply(id=" + this.id + ", name=" + this.name + ", area=" + this.area + ", quantity=" + this.quantity + ", minimum=" + this.minimum + ", unit=" + this.unit + ")";
    }

    public Supply(String id, String name, String area, int i, int i2, String unit) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(area, "area");
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.id = id;
        this.name = name;
        this.area = area;
        this.quantity = i;
        this.minimum = i2;
        this.unit = unit;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getArea() {
        return this.area;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final int getMinimum() {
        return this.minimum;
    }

    public final String getUnit() {
        return this.unit;
    }

    public final String getStatus() {
        return this.quantity <= this.minimum ? "Restock" : "Ready";
    }

    public final float getFill() {
        return RangesKt.coerceIn(this.quantity / RangesKt.coerceAtLeast(this.minimum * 3, 1), 0.0f, 1.0f);
    }
}
