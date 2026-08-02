package app.cash.broadway.screen;

import android.os.Parcelable;

/* loaded from: classes.dex */
public interface Screen extends Parcelable {
    default String prettyName() {
        return null;
    }
}
