package com.emeraldpulse.kyra;

import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MainActivity.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006 "}, d2 = {"Lcom/emeraldpulse/kyra/CostNote;", "", "id", "", "title", "area", "amountCents", "", "note", "date", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTitle", "getArea", "getAmountCents", "()I", "getNote", "getDate", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
final /* data */ class CostNote {
    private final int amountCents;
    private final String area;
    private final String date;
    private final String id;
    private final String note;
    private final String title;

    public static /* synthetic */ CostNote copy$default(CostNote costNote, String str, String str2, String str3, int i, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = costNote.id;
        }
        if ((i2 & 2) != 0) {
            str2 = costNote.title;
        }
        if ((i2 & 4) != 0) {
            str3 = costNote.area;
        }
        if ((i2 & 8) != 0) {
            i = costNote.amountCents;
        }
        if ((i2 & 16) != 0) {
            str4 = costNote.note;
        }
        if ((i2 & 32) != 0) {
            str5 = costNote.date;
        }
        String str6 = str4;
        String str7 = str5;
        return costNote.copy(str, str2, str3, i, str6, str7);
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
    public final int getAmountCents() {
        return this.amountCents;
    }

    /* renamed from: component5, reason: from getter */
    public final String getNote() {
        return this.note;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    public final CostNote copy(String id, String title, String area, int amountCents, String note, String date) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(area, "area");
        Intrinsics.checkNotNullParameter(note, "note");
        Intrinsics.checkNotNullParameter(date, "date");
        return new CostNote(id, title, area, amountCents, note, date);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CostNote)) {
            return false;
        }
        CostNote costNote = (CostNote) other;
        return Intrinsics.areEqual(this.id, costNote.id) && Intrinsics.areEqual(this.title, costNote.title) && Intrinsics.areEqual(this.area, costNote.area) && this.amountCents == costNote.amountCents && Intrinsics.areEqual(this.note, costNote.note) && Intrinsics.areEqual(this.date, costNote.date);
    }

    public int hashCode() {
        return (((((((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.area.hashCode()) * 31) + this.amountCents) * 31) + this.note.hashCode()) * 31) + this.date.hashCode();
    }

    public String toString() {
        return "CostNote(id=" + this.id + ", title=" + this.title + ", area=" + this.area + ", amountCents=" + this.amountCents + ", note=" + this.note + ", date=" + this.date + ")";
    }

    public CostNote(String id, String title, String area, int i, String note, String date) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(area, "area");
        Intrinsics.checkNotNullParameter(note, "note");
        Intrinsics.checkNotNullParameter(date, "date");
        this.id = id;
        this.title = title;
        this.area = area;
        this.amountCents = i;
        this.note = note;
        this.date = date;
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

    public final int getAmountCents() {
        return this.amountCents;
    }

    public final String getNote() {
        return this.note;
    }

    public final String getDate() {
        return this.date;
    }
}
