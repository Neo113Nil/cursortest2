package kotlin.text;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public final class CatchingFishMVPMVPViewModel {
    public final SharedPreferences CatchingFishParcelableFAB;

    public CatchingFishMVPMVPViewModel(SharedPreferences sharedPreferences) {
        this.CatchingFishParcelableFAB = sharedPreferences;
    }

    public CatchingFishMVPMVPViewModel(Context context) {
        boolean isEmpty;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.CatchingFishParcelableFAB = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    isEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (isEmpty) {
                    return;
                }
                synchronized (this) {
                    sharedPreferences.edit().clear().commit();
                }
            }
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                e.getMessage();
            }
        }
    }
}
