package androidx.compose.runtime.composer.gapbuffer;

import androidx.collection.MutableIntObjectMap;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.tooling.CompositionData;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes.dex */
public final class SlotTable implements CompositionData, Iterable, KMappedMarker {
    public MutableIntObjectMap calledByMap;
    public int groupsSize;
    public int readers;
    public int slotsSize;
    public HashMap sourceInformationMap;
    public int version;
    public boolean writer;
    public int[] groups = new int[0];
    public Object[] slots = new Object[0];
    public final Object lock = new Object();
    public ArrayList anchors = new ArrayList();

    public final GapAnchor anchor(int i) {
        if (this.writer) {
            ComposerKt.composeImmediateRuntimeError("use active SlotWriter to create an anchor location instead");
        }
        if (i < 0 || i >= this.groupsSize) {
            PreconditionsKt.throwIllegalArgumentException("Parameter index is out of range");
        }
        ArrayList arrayList = this.anchors;
        int search = SlotTableKt.search(arrayList, i, this.groupsSize);
        if (search >= 0) {
            return (GapAnchor) arrayList.get(search);
        }
        GapAnchor gapAnchor = new GapAnchor(i);
        arrayList.add(-(search + 1), gapAnchor);
        return gapAnchor;
    }

    public final int anchorIndex(GapAnchor gapAnchor) {
        if (this.writer) {
            ComposerKt.composeImmediateRuntimeError("Use active SlotWriter to determine anchor location instead");
        }
        if (!gapAnchor.getValid()) {
            PreconditionsKt.throwIllegalArgumentException("Anchor refers to a group that was removed");
        }
        return gapAnchor.location;
    }

    public final void collectSourceInformation() {
        this.sourceInformationMap = new HashMap();
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public final Iterable getCompositionGroups() {
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new GroupIterator(this, 0, this.groupsSize);
    }

    public final SlotReader openReader() {
        if (this.writer) {
            a$$ExternalSyntheticBUOutline0.m$1("Cannot read while a writer is pending");
            return null;
        }
        this.readers++;
        return new SlotReader(this);
    }

    public final SlotWriter openWriter() {
        if (this.writer) {
            ComposerKt.composeImmediateRuntimeError("Cannot start a writer when another writer is pending");
        }
        if (this.readers > 0) {
            ComposerKt.composeImmediateRuntimeError("Cannot start a writer when a reader is pending");
        }
        this.writer = true;
        this.version++;
        return new SlotWriter(this);
    }

    public final boolean ownsAnchor(GapAnchor gapAnchor) {
        int search;
        return gapAnchor.getValid() && (search = SlotTableKt.search(this.anchors, gapAnchor.location, this.groupsSize)) >= 0 && Intrinsics.areEqual(this.anchors.get(search), gapAnchor);
    }

    public final GapGroupSourceInformation sourceInformationOf(int i) {
        int i2;
        ArrayList arrayList;
        int search;
        HashMap hashMap = this.sourceInformationMap;
        if (hashMap != null) {
            if (this.writer) {
                ComposerKt.composeImmediateRuntimeError("use active SlotWriter to crate an anchor for location instead");
            }
            GapAnchor gapAnchor = (i < 0 || i >= (i2 = this.groupsSize) || (search = SlotTableKt.search((arrayList = this.anchors), i, i2)) < 0) ? null : (GapAnchor) arrayList.get(search);
            if (gapAnchor != null) {
                return (GapGroupSourceInformation) hashMap.get(gapAnchor);
            }
        }
        return null;
    }
}
