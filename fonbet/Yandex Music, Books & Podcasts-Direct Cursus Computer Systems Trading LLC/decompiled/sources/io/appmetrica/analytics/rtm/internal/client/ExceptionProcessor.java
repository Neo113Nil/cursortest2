package io.appmetrica.analytics.rtm.internal.client;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import defpackage.t7g;
import io.appmetrica.analytics.rtm.impl.q;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.File;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class ExceptionProcessor {
    private final CrashesDirectoryProvider a;
    private final Context b;

    public ExceptionProcessor(@NonNull Context context, @NonNull CrashesDirectoryProvider crashesDirectoryProvider) {
        this.a = crashesDirectoryProvider;
        this.b = context;
    }

    private void a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(str)) {
            str = Constants.DEFAULT_MESSAGE;
        }
        try {
            jSONObject.put(Constants.KEY_MESSAGE, str);
            jSONObject.put(Constants.KEY_EXCEPTION, str2);
        } catch (Throwable unused) {
        }
        try {
            File crashesDirectory = this.a.getCrashesDirectory(this.b);
            if (crashesDirectory == null) {
                return;
            }
            if (crashesDirectory.exists() || crashesDirectory.mkdirs()) {
                File createTempFile = File.createTempFile("crash", ".rtm", crashesDirectory);
                q.a(createTempFile, jSONObject.toString());
                String name = createTempFile.getName();
                File crashesTriggerDirectory = this.a.getCrashesTriggerDirectory(this.b);
                if (crashesTriggerDirectory == null) {
                    return;
                }
                if (!crashesTriggerDirectory.exists()) {
                    if (!crashesTriggerDirectory.mkdirs()) {
                        return;
                    }
                }
                new File(crashesTriggerDirectory, name).createNewFile();
            }
        } catch (Throwable unused2) {
        }
    }

    public void onException(String str, Throwable th) {
        a(str, th == null ? null : t7g.t(th));
    }

    public void onException(String str, @NonNull String str2) {
        a(str, str2);
    }
}
