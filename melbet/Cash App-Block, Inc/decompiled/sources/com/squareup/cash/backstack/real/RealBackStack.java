package com.squareup.cash.backstack.real;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.android.gms.common.zza;
import com.squareup.cash.appmessages.SheetAppMessage;
import com.squareup.cash.backstack.api.BackStack$Entry;
import com.squareup.cash.backstack.api.BackStack$ScreenEntry;
import com.squareup.cash.backstack.api.DoubleEditException;
import com.squareup.cash.observability.types.ErrorReporter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.collections.ArrayDeque;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.builders.SetBuilder;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class RealBackStack implements Parcelable {
    public static final Parcelable.Creator<RealBackStack> CREATOR = new zza(11);
    public DoubleEditException currentEdit;
    public ArrayDeque entries = new ArrayDeque();

    /* loaded from: classes5.dex */
    public final class FlowEntry implements BackStack$Entry {
        public static final Parcelable.Creator<FlowEntry> CREATOR = new SheetAppMessage.Creator(5);
        public final Parcelable data;
        public final String name;

        public FlowEntry(Parcelable parcelable, String str) {
            this.name = str;
            this.data = parcelable;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FlowEntry)) {
                return false;
            }
            FlowEntry flowEntry = (FlowEntry) obj;
            return Intrinsics.areEqual(this.name, flowEntry.name) && Intrinsics.areEqual(this.data, flowEntry.data);
        }

        public final Parcelable getData() {
            return this.data;
        }

        public final String getName() {
            return this.name;
        }

        public final int hashCode() {
            String str = this.name;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Parcelable parcelable = this.data;
            return hashCode + (parcelable != null ? parcelable.hashCode() : 0);
        }

        public final String toString() {
            return "FlowEntry(name=" + this.name + ", data=" + this.data + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.name);
            parcel.writeParcelable(this.data, i);
        }
    }

    /* loaded from: classes5.dex */
    public final class Mark implements BackStack$Entry {
        public static final Parcelable.Creator<Mark> CREATOR = new SheetAppMessage.Creator(6);
        public final String id;
        public final String owner;

        public Mark(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.id = str;
            this.owner = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Mark)) {
                return false;
            }
            Mark mark = (Mark) obj;
            return Intrinsics.areEqual(this.id, mark.id) && Intrinsics.areEqual(this.owner, mark.owner);
        }

        public final String getId() {
            return this.id;
        }

        public final String getOwner() {
            return this.owner;
        }

        public final int hashCode() {
            return this.owner.hashCode() + (this.id.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Mark(id=", this.id, ", owner=", this.owner, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.id);
            parcel.writeString(this.owner);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final synchronized RealBackStackEditor edit(ErrorReporter errorReporter) {
        if (this.currentEdit != null) {
            throw new DoubleEditException(this.currentEdit);
        }
        this.currentEdit = new DoubleEditException(null);
        return new RealBackStackEditor(new ArrayDeque(this.entries), this, errorReporter);
    }

    public final FlowEntry getCurrentFlow$real() {
        Object obj;
        ArrayDeque arrayDeque = this.entries;
        ListIterator<E> listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((BackStack$Entry) obj) instanceof FlowEntry) {
                break;
            }
        }
        return (FlowEntry) obj;
    }

    public final ArrayList getCurrentFlowScreens() {
        int i;
        ArrayDeque arrayDeque = this.entries;
        ListIterator listIterator = arrayDeque.listIterator(arrayDeque.getSize());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i = -1;
                break;
            }
            if (((BackStack$Entry) listIterator.previous()) instanceof FlowEntry) {
                i = listIterator.nextIndex();
                break;
            }
        }
        if (i == -1) {
            return getScreenEntries();
        }
        ArrayDeque arrayDeque2 = this.entries;
        List subList = arrayDeque2.subList(i + 1, arrayDeque2.size);
        ArrayList arrayList = new ArrayList();
        for (Object obj : subList) {
            if (obj instanceof BackStack$ScreenEntry) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List getFlowEntries$real() {
        ArrayDeque arrayDeque = this.entries;
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayDeque) {
            if (obj instanceof FlowEntry) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final ArrayList getScreenEntries() {
        ArrayDeque arrayDeque = this.entries;
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof BackStack$ScreenEntry) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final Set getStateKeys() {
        SetBuilder setBuilder = new SetBuilder();
        Iterator it = getScreenEntries().iterator();
        while (it.hasNext()) {
            BackStack$ScreenEntry backStack$ScreenEntry = (BackStack$ScreenEntry) it.next();
            String str = backStack$ScreenEntry.stateKey;
            if (str != null) {
                setBuilder.add(str);
            }
            BackStack$ScreenEntry.Overlay overlay = backStack$ScreenEntry.overlay;
            if (overlay != null) {
                setBuilder.add(overlay.getStateKey());
            }
        }
        return SetsKt__SetsJVMKt.build(setBuilder);
    }

    public final boolean isCurrentFlowScreensEmpty() {
        return getCurrentFlowScreens().size() == 0;
    }

    public final boolean isEmpty() {
        return peekScreen() == null;
    }

    public final BackStack$ScreenEntry peekScreen() {
        Object obj;
        ArrayDeque arrayDeque = this.entries;
        ListIterator<E> listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((BackStack$Entry) obj) instanceof BackStack$ScreenEntry) {
                break;
            }
        }
        if (obj instanceof BackStack$ScreenEntry) {
            return (BackStack$ScreenEntry) obj;
        }
        return null;
    }

    public final BackStack$ScreenEntry peekScreenInCurrentFlow() {
        Object obj;
        ArrayDeque arrayDeque = this.entries;
        ListIterator<E> listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            obj = null;
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object previous = listIterator.previous();
            BackStack$Entry backStack$Entry = (BackStack$Entry) previous;
            if (backStack$Entry instanceof FlowEntry) {
                return null;
            }
            if (backStack$Entry instanceof BackStack$ScreenEntry) {
                obj = previous;
                break;
            }
        }
        return (BackStack$ScreenEntry) obj;
    }

    public final String toString() {
        return this.entries.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.entries.getSize());
        Iterator<E> it = this.entries.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((BackStack$Entry) it.next(), 0);
        }
    }
}
