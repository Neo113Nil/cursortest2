package kotlin.text;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishAsyncTaskWidget implements CatchingFishReduxGson, CatchingFishRealmXMLLayout, CatchingFishCardViewDagger, CatchingFishMockkAsyncTask {
    public final /* synthetic */ int CatchingFishReduxKtor;
    public static final CatchingFishAsyncTaskWidget CatchingFishDaggerWebsocket = new CatchingFishAsyncTaskWidget(4);
    public static final CatchingFishAsyncTaskWidget CatchingFishWorkManager = new CatchingFishAsyncTaskWidget(5);
    public static final CatchingFishAsyncTaskWidget CatchingFishViewModelScope = new CatchingFishAsyncTaskWidget(6);
    public static final CatchingFishAsyncTaskWidget CatchingFishViewModelFAB = new CatchingFishAsyncTaskWidget(7);
    public static final CatchingFishAsyncTaskWidget CatchingFishLayout = new CatchingFishAsyncTaskWidget(8);

    public /* synthetic */ CatchingFishAsyncTaskWidget(int i) {
        this.CatchingFishReduxKtor = i;
    }

    @Override // kotlin.text.CatchingFishReduxGson
    public double CatchingFishCoroutine(double d) {
        return d;
    }

    @Override // kotlin.text.CatchingFishMockkAsyncTask
    public Object CatchingFishWorkManager(CatchingFishViewWorkManager catchingFishViewWorkManager) {
        CatchingFishContextMVVM lambda$getComponents$0;
        CatchingFishContextMVVM lambda$getComponents$1;
        CatchingFishContextMVVM lambda$getComponents$2;
        switch (this.CatchingFishReduxKtor) {
            case 10:
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(catchingFishViewWorkManager);
                return lambda$getComponents$0;
            case 11:
                lambda$getComponents$1 = TransportRegistrar.lambda$getComponents$1(catchingFishViewWorkManager);
                return lambda$getComponents$1;
            default:
                lambda$getComponents$2 = TransportRegistrar.lambda$getComponents$2(catchingFishViewWorkManager);
                return lambda$getComponents$2;
        }
    }

    @Override // kotlin.text.CatchingFishRealmXMLLayout
    public Object apply(Object obj) {
        Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (rawQuery.moveToNext()) {
                CatchingFishAsyncTaskDagger CatchingFishParcelableFAB = CatchingFishBundleMVIHilt.CatchingFishParcelableFAB();
                CatchingFishParcelableFAB.CatchingFishMoshiDaggerHilt(rawQuery.getString(1));
                CatchingFishParcelableFAB.CatchingFishViewModelScope = CatchingFishRoomGlide.CatchingFishSnackbar(rawQuery.getInt(2));
                String string = rawQuery.getString(3);
                CatchingFishParcelableFAB.CatchingFishWorkManager = string == null ? null : Base64.decode(string, 0);
                arrayList.add(CatchingFishParcelableFAB.CatchingFishCoroutineFlow());
            }
            return arrayList;
        } finally {
            rawQuery.close();
        }
    }
}
