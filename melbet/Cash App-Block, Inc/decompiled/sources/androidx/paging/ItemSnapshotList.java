package androidx.paging;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.collections.AbstractList;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class ItemSnapshotList extends AbstractList {
    public final ArrayList items;
    public final int placeholdersAfter;
    public final int placeholdersBefore;

    public ItemSnapshotList(ArrayList arrayList, int i, int i2) {
        this.placeholdersBefore = i;
        this.placeholdersAfter = i2;
        this.items = arrayList;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.placeholdersBefore;
        if (i < 0 || i >= i2) {
            ArrayList arrayList = this.items;
            if (i < arrayList.size() + i2 && i2 <= i) {
                return arrayList.get(i - i2);
            }
            int size = arrayList.size() + i2;
            if (i >= getSize() || size > i) {
                Path$$ExternalSyntheticBUOutline0.m(getSize(), JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "Illegal attempt to access index ", " in ItemSnapshotList of size "));
                return null;
            }
        }
        return null;
    }

    @Override // kotlin.collections.AbstractCollection
    public final int getSize() {
        return this.items.size() + this.placeholdersBefore + this.placeholdersAfter;
    }
}
