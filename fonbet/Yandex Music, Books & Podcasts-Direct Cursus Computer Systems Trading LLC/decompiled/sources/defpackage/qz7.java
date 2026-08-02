package defpackage;

import android.content.Context;
import android.util.Log;
import com.connectsdk.service.airplay.PListParser;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class qz7 {
    public final String a;
    public final String b;

    public qz7(pt0 pt0Var) {
        Context context = (Context) pt0Var.a;
        int w = kg5.w(context, "com.google.firebase.crashlytics.unity_version", PListParser.TAG_STRING);
        if (w != 0) {
            this.a = "Unity";
            String string = context.getResources().getString(w);
            this.b = string;
            String g = f1d.g("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", g, null);
                return;
            }
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream open = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (open != null) {
                    open.close();
                }
                this.a = "Flutter";
                this.b = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
            }
        }
        this.a = null;
        this.b = null;
    }

    public qz7(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
