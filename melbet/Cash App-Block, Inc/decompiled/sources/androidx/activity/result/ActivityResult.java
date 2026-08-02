package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentState;
import org.intellij.markdown.ast.ASTUtilKt;

/* loaded from: classes.dex */
public final class ActivityResult implements Parcelable {
    public static final Parcelable.Creator<ActivityResult> CREATOR = new FragmentState.AnonymousClass1(12);
    public final Intent data;
    public final int resultCode;

    public ActivityResult(int i, Intent intent) {
        this.resultCode = i;
        this.data = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ActivityResult{resultCode=" + ASTUtilKt.resultCodeToString(this.resultCode) + ", data=" + this.data + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.resultCode);
        Intent intent = this.data;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
