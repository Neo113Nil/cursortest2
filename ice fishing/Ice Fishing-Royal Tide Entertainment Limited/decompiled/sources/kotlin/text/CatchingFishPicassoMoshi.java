package kotlin.text;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class CatchingFishPicassoMoshi implements Callable {
    public final /* synthetic */ Context CatchingFishCoroutine;
    public final /* synthetic */ Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final /* synthetic */ String CatchingFishSnackbar;

    public /* synthetic */ CatchingFishPicassoMoshi(String str, Context context, Object obj, int i, int i2) {
        this.CatchingFishParcelableFAB = i2;
        this.CatchingFishSnackbar = str;
        this.CatchingFishCoroutine = context;
        this.CatchingFishDaggerWebsocket = obj;
        this.CatchingFishReduxKtor = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Object[] objArr = {(CatchingFishViewAsyncTask) this.CatchingFishDaggerWebsocket};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                return CatchingFishAsyncTaskMVI.CatchingFishSnackbar(this.CatchingFishSnackbar, this.CatchingFishCoroutine, Collections.unmodifiableList(arrayList), this.CatchingFishReduxKtor);
            default:
                try {
                    return CatchingFishAsyncTaskMVI.CatchingFishSnackbar(this.CatchingFishSnackbar, this.CatchingFishCoroutine, (ArrayList) this.CatchingFishDaggerWebsocket, this.CatchingFishReduxKtor);
                } catch (Throwable unused) {
                    return new CatchingFishLayoutBiometric(-3);
                }
        }
    }
}
