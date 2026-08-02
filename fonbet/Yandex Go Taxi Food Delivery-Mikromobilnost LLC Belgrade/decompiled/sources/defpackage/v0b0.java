package defpackage;

import com.google.firebase.a;
import com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import ru.cprocsp.ACSP.tools.common.CSPDirectoryConstants;

/* loaded from: classes.dex */
public final class v0b0 {
    public File a;
    public final a b;

    public v0b0(a aVar) {
        this.b = aVar;
    }

    public final File a() {
        if (this.a == null) {
            synchronized (this) {
                try {
                    if (this.a == null) {
                        a aVar = this.b;
                        aVar.a();
                        this.a = new File(aVar.a.getFilesDir(), "PersistedInstallation." + this.b.f() + ".json");
                    }
                } finally {
                }
            }
        }
        return this.a;
    }

    public final void b(w0b0 w0b0Var) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", w0b0Var.c());
            jSONObject.put("Status", w0b0Var.f().ordinal());
            jSONObject.put("AuthToken", w0b0Var.a());
            jSONObject.put("RefreshToken", w0b0Var.e());
            jSONObject.put("TokenCreationEpochInSecs", w0b0Var.g());
            jSONObject.put("ExpiresInSecs", w0b0Var.b());
            jSONObject.put("FisError", w0b0Var.d());
            a aVar = this.b;
            aVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", CSPDirectoryConstants.SUBDIRECTORY_TMP, aVar.a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(a())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public final w0b0 c() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(a());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        PersistedInstallation$RegistrationStatus persistedInstallation$RegistrationStatus = PersistedInstallation$RegistrationStatus.ATTEMPT_MIGRATION;
        int optInt = jSONObject.optInt("Status", persistedInstallation$RegistrationStatus.ordinal());
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i = w0b0.a;
        t74 t74Var = new t74();
        t74Var.d(0L);
        t74Var.c(persistedInstallation$RegistrationStatus);
        t74Var.b(0L);
        t74Var.a = optString;
        t74Var.c(PersistedInstallation$RegistrationStatus.values()[optInt]);
        t74Var.c = optString2;
        t74Var.d = optString3;
        t74Var.d(optLong);
        t74Var.b(optLong2);
        t74Var.g = optString4;
        return t74Var.a();
    }
}
