package defpackage;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class ksh implements Parcelable {
    public static final Parcelable.Creator<ksh> CREATOR = new mmh(3);
    public final pmh a;
    public final long b;
    public MediaSession.QueueItem c;

    public ksh(MediaSession.QueueItem queueItem, pmh pmhVar, long j) {
        if (pmhVar == null) {
            xq0.x("Description cannot be null");
            throw null;
        }
        if (j == -1) {
            xq0.x("Id cannot be QueueItem.UNKNOWN_ID");
            throw null;
        }
        this.a = pmhVar;
        this.b = j;
        this.c = queueItem;
    }

    public static ArrayList a(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaSession.QueueItem queueItem = (MediaSession.QueueItem) it.next();
            arrayList.add(new ksh(queueItem, pmh.a(queueItem.getDescription()), queueItem.getQueueId()));
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSession.QueueItem { Description=");
        sb.append(this.a);
        sb.append(", Id=");
        return hrg.m(this.b, " }", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeLong(this.b);
    }

    public ksh(Parcel parcel) {
        this.a = pmh.CREATOR.createFromParcel(parcel);
        this.b = parcel.readLong();
    }
}
