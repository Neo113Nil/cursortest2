package bo.app;

import android.content.Context;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.braze.enums.DataStoreKey;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f5 implements h9 {
    public final com.braze.storage.c a;

    public f5(Context context, String str) {
        context.getClass();
        str.getClass();
        this.a = new com.braze.storage.c(context, str);
    }

    public final String a() {
        com.braze.storage.c cVar = this.a;
        DataStoreKey dataStoreKey = DataStoreKey.DEVICE_ID;
        String readString = cVar.readString(dataStoreKey, null);
        if (readString == null) {
            com.braze.storage.c cVar2 = this.a;
            DataStoreKey dataStoreKey2 = DataStoreKey.LEGACY_DEVICE_ID;
            readString = cVar2.readString(dataStoreKey2, null);
            this.a.clearData(dataStoreKey2);
        }
        com.braze.storage.c cVar3 = this.a;
        DataStoreKey dataStoreKey3 = DataStoreKey.PERSISTENT_DEVICE_ID;
        if ((cVar3.contains(dataStoreKey3) ? !Intrinsics.areEqual(this.a.readString(dataStoreKey3, null), String.valueOf(722989291)) : false) || readString == null) {
            readString = Boxes$$ExternalSyntheticOutline1.m();
        }
        this.a.writeData(dataStoreKey, readString);
        this.a.writeData(dataStoreKey3, String.valueOf(722989291));
        return readString;
    }
}
