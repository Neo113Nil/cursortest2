package kotlin.text;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishBiometricJUnit implements CatchingFishRealmXMLLayout {
    public final /* synthetic */ CatchingFishBundleMVIHilt CatchingFishDaggerWebsocket;
    public final /* synthetic */ long CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishBiometricJUnit(long j, CatchingFishBundleMVIHilt catchingFishBundleMVIHilt) {
        this.CatchingFishReduxKtor = j;
        this.CatchingFishDaggerWebsocket = catchingFishBundleMVIHilt;
    }

    @Override // kotlin.text.CatchingFishRealmXMLLayout
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.CatchingFishReduxKtor));
        CatchingFishBundleMVIHilt catchingFishBundleMVIHilt = this.CatchingFishDaggerWebsocket;
        String str = catchingFishBundleMVIHilt.CatchingFishParcelableFAB;
        CatchingFishContextMVI catchingFishContextMVI = catchingFishBundleMVIHilt.CatchingFishCoroutine;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(CatchingFishRoomGlide.CatchingFishParcelableFAB(catchingFishContextMVI))}) < 1) {
            contentValues.put("backend_name", catchingFishBundleMVIHilt.CatchingFishParcelableFAB);
            contentValues.put("priority", Integer.valueOf(CatchingFishRoomGlide.CatchingFishParcelableFAB(catchingFishContextMVI)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
