package com.emeraldpulse.kyra;

import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MainActivity.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0007HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0014\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\r¨\u0006\""}, d2 = {"Lcom/emeraldpulse/kyra/FixTask;", "", "id", "", "title", "area", "intervalDays", "", "daysUntilDue", "effort", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTitle", "getArea", "getIntervalDays", "()I", "getDaysUntilDue", "getEffort", "urgency", "getUrgency", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
final /* data */ class FixTask {
    private final String area;
    private final int daysUntilDue;
    private final String effort;
    private final String id;
    private final int intervalDays;
    private final String title;

    public static /* synthetic */ FixTask copy$default(FixTask fixTask, String str, String str2, String str3, int i, int i2, String str4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = fixTask.id;
        }
        if ((i3 & 2) != 0) {
            str2 = fixTask.title;
        }
        if ((i3 & 4) != 0) {
            str3 = fixTask.area;
        }
        if ((i3 & 8) != 0) {
            i = fixTask.intervalDays;
        }
        if ((i3 & 16) != 0) {
            i2 = fixTask.daysUntilDue;
        }
        if ((i3 & 32) != 0) {
            str4 = fixTask.effort;
        }
        int i4 = i2;
        String str5 = str4;
        return fixTask.copy(str, str2, str3, i, i4, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getArea() {
        return this.area;
    }

    /* renamed from: component4, reason: from getter */
    public final int getIntervalDays() {
        return this.intervalDays;
    }

    /* renamed from: component5, reason: from getter */
    public final int getDaysUntilDue() {
        return this.daysUntilDue;
    }

    /* renamed from: component6, reason: from getter */
    public final String getEffort() {
        return this.effort;
    }

    public final FixTask copy(String id, String title, String area, int intervalDays, int daysUntilDue, String effort) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(area, "area");
        Intrinsics.checkNotNullParameter(effort, "effort");
        return new FixTask(id, title, area, intervalDays, daysUntilDue, effort);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FixTask)) {
            return false;
        }
        FixTask fixTask = (FixTask) other;
        return Intrinsics.areEqual(this.id, fixTask.id) && Intrinsics.areEqual(this.title, fixTask.title) && Intrinsics.areEqual(this.area, fixTask.area) && this.intervalDays == fixTask.intervalDays && this.daysUntilDue == fixTask.daysUntilDue && Intrinsics.areEqual(this.effort, fixTask.effort);
    }

    public int hashCode() {
        return (((((((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.area.hashCode()) * 31) + this.intervalDays) * 31) + this.daysUntilDue) * 31) + this.effort.hashCode();
    }

    public String toString() {
        return "FixTask(id=" + this.id + ", title=" + this.title + ", area=" + this.area + ", intervalDays=" + this.intervalDays + ", daysUntilDue=" + this.daysUntilDue + ", effort=" + this.effort + ")";
    }

    public FixTask(String id, String title, String area, int i, int i2, String effort) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(area, "area");
        Intrinsics.checkNotNullParameter(effort, "effort");
        this.id = id;
        this.title = title;
        this.area = area;
        this.intervalDays = i;
        this.daysUntilDue = i2;
        this.effort = effort;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getArea() {
        return this.area;
    }

    public final int getIntervalDays() {
        return this.intervalDays;
    }

    public final int getDaysUntilDue() {
        return this.daysUntilDue;
    }

    public final String getEffort() {
        return this.effort;
    }

    public final String getUrgency() {
        int i = this.daysUntilDue;
        if (i < 0) {
            return "Overdue";
        }
        if (i == 0) {
            return "Due today";
        }
        if (i <= 7) {
            return "This week";
        }
        return "Scheduled";
    }
}
