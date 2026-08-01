package pl.droidsonroids.gif;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes2.dex */
public final class d extends View.BaseSavedState {
    public static final Parcelable.Creator<d> CREATOR = new B8.d(0);

    /* renamed from: n, reason: collision with root package name */
    public final long[][] f39969n;

    public d(Parcelable parcelable, Drawable... drawableArr) {
        super(parcelable);
        this.f39969n = new long[drawableArr.length][];
        for (int i = 0; i < drawableArr.length; i++) {
            Drawable drawable = drawableArr[i];
            if (drawable instanceof c) {
                this.f39969n[i] = ((c) drawable).f39968z.i();
            } else {
                this.f39969n[i] = null;
            }
        }
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        long[][] jArr = this.f39969n;
        parcel.writeInt(jArr.length);
        for (long[] jArr2 : jArr) {
            parcel.writeLongArray(jArr2);
        }
    }

    public d(Parcel parcel) {
        super(parcel);
        this.f39969n = new long[parcel.readInt()][];
        int i = 0;
        while (true) {
            long[][] jArr = this.f39969n;
            if (i >= jArr.length) {
                return;
            }
            jArr[i] = parcel.createLongArray();
            i++;
        }
    }
}
