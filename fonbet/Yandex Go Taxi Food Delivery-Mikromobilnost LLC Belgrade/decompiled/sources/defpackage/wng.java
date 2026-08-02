package defpackage;

import com.google.firebase.sessions.DataCollectionState;

/* loaded from: classes.dex */
public final class wng {
    public final DataCollectionState a;
    public final DataCollectionState b;
    public final double c;

    public wng(DataCollectionState dataCollectionState, DataCollectionState dataCollectionState2, double d) {
        this.a = dataCollectionState;
        this.b = dataCollectionState2;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wng)) {
            return false;
        }
        wng wngVar = (wng) obj;
        return this.a == wngVar.a && this.b == wngVar.b && Double.compare(this.c, wngVar.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataCollectionStatus(performance=");
        sb.append(this.a);
        sb.append(", crashlytics=");
        sb.append(this.b);
        sb.append(", sessionSamplingRate=");
        return unr0.q(sb, this.c, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wng() {
        this(r0, r0, 1.0d);
        DataCollectionState dataCollectionState = DataCollectionState.COLLECTION_SDK_NOT_INSTALLED;
    }
}
