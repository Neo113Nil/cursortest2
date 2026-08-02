package just.adapter.sticky;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"just/adapter/sticky/StickyViewController$SavedState", "Landroid/os/Parcelable;", "", "restoredFirstVisibleItemPosition", "restoredLastVisibleItemPosition", "superState", "<init>", "(IILandroid/os/Parcelable;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", CA20Status.STATUS_USER_I, "getRestoredFirstVisibleItemPosition", "getRestoredLastVisibleItemPosition", "Landroid/os/Parcelable;", "getSuperState", "()Landroid/os/Parcelable;", "just-adapter-sticky_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class StickyViewController$SavedState implements Parcelable {
    public static final Parcelable.Creator<StickyViewController$SavedState> CREATOR = new Creator();
    private final int restoredFirstVisibleItemPosition;
    private final int restoredLastVisibleItemPosition;
    private final Parcelable superState;

    public StickyViewController$SavedState(int i, int i2, Parcelable parcelable) {
        this.restoredFirstVisibleItemPosition = i;
        this.restoredLastVisibleItemPosition = i2;
        this.superState = parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int getRestoredFirstVisibleItemPosition() {
        return this.restoredFirstVisibleItemPosition;
    }

    public final int getRestoredLastVisibleItemPosition() {
        return this.restoredLastVisibleItemPosition;
    }

    public final Parcelable getSuperState() {
        return this.superState;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.restoredFirstVisibleItemPosition);
        dest.writeInt(this.restoredLastVisibleItemPosition);
        dest.writeParcelable(this.superState, flags);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StickyViewController$SavedState> {
        @Override // android.os.Parcelable.Creator
        public final StickyViewController$SavedState createFromParcel(Parcel parcel) {
            return new StickyViewController$SavedState(parcel.readInt(), parcel.readInt(), parcel.readParcelable(StickyViewController$SavedState.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final StickyViewController$SavedState[] newArray(int i) {
            return new StickyViewController$SavedState[i];
        }
    }
}
