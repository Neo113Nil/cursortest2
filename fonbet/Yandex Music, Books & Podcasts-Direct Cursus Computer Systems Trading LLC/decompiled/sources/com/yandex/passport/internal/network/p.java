package com.yandex.passport.internal.network;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.a2;
import com.yandex.passport.api.b2;
import com.yandex.passport.api.k0;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class p implements a2, Parcelable {

    @NotNull
    public static final Parcelable.Creator<p> CREATOR = new com.yandex.passport.internal.credentials.b(21);
    public final Map a;

    public p(Map map) {
        map.getClass();
        this.a = map;
    }

    public final String a(Pair pair) {
        String str = (String) this.a.get(pair);
        if (str != null) {
            if (StringsKt.U(str)) {
                str = null;
            }
            if (str != null) {
                if (!StringsKt.M(str, "://", false)) {
                    str = "https://".concat(str);
                }
                com.yandex.passport.common.url.b bVar = new com.yandex.passport.common.url.b(str);
                if (!com.yandex.passport.common.url.b.n(str)) {
                    bVar = null;
                }
                if (bVar != null) {
                    return bVar.a;
                }
            }
        }
        return null;
    }

    @Override // com.yandex.passport.api.a2
    public final Map d() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Iterator s = com.appsflyer.internal.k.s(this.a, parcel);
        while (s.hasNext()) {
            Map.Entry entry = (Map.Entry) s.next();
            Pair pair = (Pair) entry.getKey();
            String str = (String) entry.getValue();
            parcel.writeString(((b2) pair.a).name());
            parcel.writeInt(((k0) pair.b).d());
            parcel.writeString(str);
        }
    }
}
