package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import kotlin.text.CatchingFishIntentKtor;
import kotlin.text.CatchingFishParcelableMVP;
import kotlin.text.CatchingFishParcelableToast;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(CatchingFishIntentKtor catchingFishIntentKtor) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        CatchingFishParcelableToast catchingFishParcelableToast = remoteActionCompat.CatchingFishParcelableFAB;
        boolean z = true;
        if (catchingFishIntentKtor.CatchingFishDaggerWebsocket(1)) {
            catchingFishParcelableToast = catchingFishIntentKtor.CatchingFishViewModelScope();
        }
        remoteActionCompat.CatchingFishParcelableFAB = (IconCompat) catchingFishParcelableToast;
        CharSequence charSequence = remoteActionCompat.CatchingFishSnackbar;
        if (catchingFishIntentKtor.CatchingFishDaggerWebsocket(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((CatchingFishParcelableMVP) catchingFishIntentKtor).CatchingFishDaggerWebsocket);
        }
        remoteActionCompat.CatchingFishSnackbar = charSequence;
        CharSequence charSequence2 = remoteActionCompat.CatchingFishCoroutine;
        if (catchingFishIntentKtor.CatchingFishDaggerWebsocket(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((CatchingFishParcelableMVP) catchingFishIntentKtor).CatchingFishDaggerWebsocket);
        }
        remoteActionCompat.CatchingFishCoroutine = charSequence2;
        remoteActionCompat.CatchingFishReduxKtor = (PendingIntent) catchingFishIntentKtor.CatchingFishWorkManager(remoteActionCompat.CatchingFishReduxKtor, 4);
        boolean z2 = remoteActionCompat.CatchingFishDaggerWebsocket;
        if (catchingFishIntentKtor.CatchingFishDaggerWebsocket(5)) {
            z2 = ((CatchingFishParcelableMVP) catchingFishIntentKtor).CatchingFishDaggerWebsocket.readInt() != 0;
        }
        remoteActionCompat.CatchingFishDaggerWebsocket = z2;
        boolean z3 = remoteActionCompat.CatchingFishWorkManager;
        if (!catchingFishIntentKtor.CatchingFishDaggerWebsocket(6)) {
            z = z3;
        } else if (((CatchingFishParcelableMVP) catchingFishIntentKtor).CatchingFishDaggerWebsocket.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.CatchingFishWorkManager = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, CatchingFishIntentKtor catchingFishIntentKtor) {
        catchingFishIntentKtor.getClass();
        IconCompat iconCompat = remoteActionCompat.CatchingFishParcelableFAB;
        catchingFishIntentKtor.CatchingFishViewModelFAB(1);
        catchingFishIntentKtor.CatchingFishLayout(iconCompat);
        CharSequence charSequence = remoteActionCompat.CatchingFishSnackbar;
        catchingFishIntentKtor.CatchingFishViewModelFAB(2);
        Parcel parcel = ((CatchingFishParcelableMVP) catchingFishIntentKtor).CatchingFishDaggerWebsocket;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.CatchingFishCoroutine;
        catchingFishIntentKtor.CatchingFishViewModelFAB(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.CatchingFishReduxKtor;
        catchingFishIntentKtor.CatchingFishViewModelFAB(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.CatchingFishDaggerWebsocket;
        catchingFishIntentKtor.CatchingFishViewModelFAB(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.CatchingFishWorkManager;
        catchingFishIntentKtor.CatchingFishViewModelFAB(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
