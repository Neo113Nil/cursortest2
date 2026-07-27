package kotlin.text;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Trace;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.firebase.messaging.EnhancedIntentService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishXMLLayoutOkHttp implements CatchingFishMockkAsyncTask, CatchingFishFragmentFAB, CatchingFishJUnitBiometric, CatchingFishRealmXMLLayout, CatchingFishHandlerJUnit {
    public final /* synthetic */ Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final /* synthetic */ Object CatchingFishWorkManager;

    public /* synthetic */ CatchingFishXMLLayoutOkHttp(int i, Object obj, Object obj2) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = obj;
        this.CatchingFishWorkManager = obj2;
    }

    @Override // kotlin.text.CatchingFishJUnitBiometric
    public Object CatchingFishFragmentHandler(CatchingFishWorkManagerMVP catchingFishWorkManagerMVP) {
        CatchingFishViewModelIntent catchingFishViewModelIntent = (CatchingFishViewModelIntent) this.CatchingFishWorkManager;
        String str = (String) this.CatchingFishDaggerWebsocket;
        synchronized (catchingFishViewModelIntent) {
            ((CatchingFishCameraXRetrofit) catchingFishViewModelIntent.CatchingFishWorkManager).remove(str);
        }
        return catchingFishWorkManagerMVP;
    }

    @Override // kotlin.text.CatchingFishHandlerJUnit
    public Object CatchingFishParcelableFAB() {
        switch (this.CatchingFishReduxKtor) {
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                CatchingFishGsonRetrofit catchingFishGsonRetrofit = (CatchingFishGsonRetrofit) this.CatchingFishDaggerWebsocket;
                Iterable iterable = (Iterable) this.CatchingFishWorkManager;
                CatchingFishMVIView catchingFishMVIView = (CatchingFishMVIView) catchingFishGsonRetrofit.CatchingFishCoroutine;
                catchingFishMVIView.getClass();
                if (iterable.iterator().hasNext()) {
                    catchingFishMVIView.CatchingFishSnackbar().compileStatement("DELETE FROM events WHERE _id in " + CatchingFishMVIView.CatchingFishOkHttp(iterable)).execute();
                    break;
                }
                break;
            default:
                CatchingFishGsonRetrofit catchingFishGsonRetrofit2 = (CatchingFishGsonRetrofit) this.CatchingFishDaggerWebsocket;
                for (Map.Entry entry : ((HashMap) this.CatchingFishWorkManager).entrySet()) {
                    ((CatchingFishMVIView) catchingFishGsonRetrofit2.CatchingFishLayout).CatchingFishLayout(((Integer) entry.getValue()).intValue(), CatchingFishGsonService.INVALID_PAYLOD, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // kotlin.text.CatchingFishFragmentFAB
    public void CatchingFishRoomDatabase(CatchingFishWorkManagerMVP catchingFishWorkManagerMVP) {
        EnhancedIntentService enhancedIntentService = (EnhancedIntentService) this.CatchingFishDaggerWebsocket;
        Intent intent = (Intent) this.CatchingFishWorkManager;
        int i = EnhancedIntentService.CatchingFishLayout;
        enhancedIntentService.CatchingFishParcelableFAB(intent);
    }

    @Override // kotlin.text.CatchingFishMockkAsyncTask
    public Object CatchingFishWorkManager(CatchingFishViewWorkManager catchingFishViewWorkManager) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                String str = (String) this.CatchingFishDaggerWebsocket;
                CatchingFishToastKtor catchingFishToastKtor = (CatchingFishToastKtor) this.CatchingFishWorkManager;
                try {
                    Trace.beginSection(str);
                    return catchingFishToastKtor.CatchingFishWorkManager.CatchingFishWorkManager(catchingFishViewWorkManager);
                } finally {
                    Trace.endSection();
                }
            default:
                return new CatchingFishSpannableWidget((String) this.CatchingFishDaggerWebsocket, ((CatchingFishManifestDagger) this.CatchingFishWorkManager).CatchingFishSnackbar((Context) catchingFishViewWorkManager.CatchingFishParcelableFAB(Context.class)));
        }
    }

    @Override // kotlin.text.CatchingFishRealmXMLLayout
    public Object apply(Object obj) {
        CatchingFishMVIView catchingFishMVIView = (CatchingFishMVIView) this.CatchingFishDaggerWebsocket;
        CatchingFishBundleMVIHilt catchingFishBundleMVIHilt = (CatchingFishBundleMVIHilt) this.CatchingFishWorkManager;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        CatchingFishViewEspresso catchingFishViewEspresso = catchingFishMVIView.CatchingFishViewModelScope;
        ArrayList CatchingFishDaggerWebsocket = catchingFishMVIView.CatchingFishDaggerWebsocket(sQLiteDatabase, catchingFishBundleMVIHilt, catchingFishViewEspresso.CatchingFishSnackbar);
        for (CatchingFishContextMVI catchingFishContextMVI : CatchingFishContextMVI.values()) {
            if (catchingFishContextMVI != catchingFishBundleMVIHilt.CatchingFishCoroutine) {
                int size = catchingFishViewEspresso.CatchingFishSnackbar - CatchingFishDaggerWebsocket.size();
                if (size <= 0) {
                    break;
                }
                CatchingFishAsyncTaskDagger CatchingFishParcelableFAB = CatchingFishBundleMVIHilt.CatchingFishParcelableFAB();
                CatchingFishParcelableFAB.CatchingFishMoshiDaggerHilt(catchingFishBundleMVIHilt.CatchingFishParcelableFAB);
                if (catchingFishContextMVI == null) {
                    throw new NullPointerException("Null priority");
                }
                CatchingFishParcelableFAB.CatchingFishViewModelScope = catchingFishContextMVI;
                CatchingFishParcelableFAB.CatchingFishWorkManager = catchingFishBundleMVIHilt.CatchingFishSnackbar;
                CatchingFishDaggerWebsocket.addAll(catchingFishMVIView.CatchingFishDaggerWebsocket(sQLiteDatabase, CatchingFishParcelableFAB.CatchingFishCoroutineFlow(), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < CatchingFishDaggerWebsocket.size(); i++) {
            sb.append(((CatchingFishHiltIntent) CatchingFishDaggerWebsocket.get(i)).CatchingFishParcelableFAB);
            if (i < CatchingFishDaggerWebsocket.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j), set);
                }
                set.add(new CatchingFishRealmExoPlayer(query.getString(1), query.getString(2)));
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        query.close();
        ListIterator listIterator = CatchingFishDaggerWebsocket.listIterator();
        while (listIterator.hasNext()) {
            CatchingFishHiltIntent catchingFishHiltIntent = (CatchingFishHiltIntent) listIterator.next();
            long j2 = catchingFishHiltIntent.CatchingFishParcelableFAB;
            if (hashMap.containsKey(Long.valueOf(j2))) {
                CatchingFishViewWorkManager CatchingFishCoroutine = catchingFishHiltIntent.CatchingFishCoroutine.CatchingFishCoroutine();
                for (CatchingFishRealmExoPlayer catchingFishRealmExoPlayer : (Set) hashMap.get(Long.valueOf(j2))) {
                    CatchingFishCoroutine.CatchingFishLayout(catchingFishRealmExoPlayer.CatchingFishParcelableFAB, catchingFishRealmExoPlayer.CatchingFishSnackbar);
                }
                listIterator.set(new CatchingFishHiltIntent(j2, catchingFishHiltIntent.CatchingFishSnackbar, CatchingFishCoroutine.CatchingFishCloudMessaging()));
            }
        }
        return CatchingFishDaggerWebsocket;
    }

    public /* synthetic */ CatchingFishXMLLayoutOkHttp(CatchingFishViewModelIntent catchingFishViewModelIntent, String str) {
        this.CatchingFishReduxKtor = 3;
        this.CatchingFishWorkManager = catchingFishViewModelIntent;
        this.CatchingFishDaggerWebsocket = str;
    }
}
