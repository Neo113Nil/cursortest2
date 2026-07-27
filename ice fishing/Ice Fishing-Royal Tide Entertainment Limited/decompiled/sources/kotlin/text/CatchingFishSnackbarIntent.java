package kotlin.text;

import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public class CatchingFishSnackbarIntent extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatchingFishSnackbarIntent(Status status) {
        super(r3.toString());
        int i = status.CatchingFishReduxKtor;
        String str = status.CatchingFishDaggerWebsocket;
        str = str == null ? "" : str;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 2 + String.valueOf(str).length());
        sb.append(i);
        sb.append(": ");
        sb.append(str);
    }
}
