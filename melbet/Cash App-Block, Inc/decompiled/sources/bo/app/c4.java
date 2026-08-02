package bo.app;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class c4 {
    public static final String b(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("DataStoreKey not found for key: ", str);
    }

    public final DataStoreKey a(String str) {
        Lazy lazy;
        str.getClass();
        lazy = DataStoreKey.keyMap$delegate;
        DataStoreKey dataStoreKey = (DataStoreKey) ((Map) lazy.getValue()).get(str);
        if (dataStoreKey == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new b9$$ExternalSyntheticLambda0(str, 4), 6, (Object) null);
        }
        return dataStoreKey;
    }
}
