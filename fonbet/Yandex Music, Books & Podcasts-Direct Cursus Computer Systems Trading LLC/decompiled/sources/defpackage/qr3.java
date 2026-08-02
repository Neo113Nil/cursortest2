package defpackage;

import android.util.Log;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class qr3 {
    public final File a;

    public qr3(File file) {
        this.a = file;
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        file.createNewFile();
    }

    public LinkedHashMap a() {
        File file = this.a;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), Charsets.UTF_8), RemoteCameraConfig.Notification.ID);
            try {
                lcc lccVar = new lcc(new o7t(new n86(new wz0(3, bufferedReader)), new grt(21, this)), true, new grt(22));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                kcc kccVar = new kcc(lccVar);
                while (kccVar.hasNext()) {
                    List list = (List) kccVar.next();
                    linkedHashMap.put((String) list.get(0), (String) list.get(1));
                }
                bufferedReader.close();
                return linkedHashMap;
            } finally {
            }
        } catch (IOException e) {
            ssg.a(6, null, hrg.q("Could not read ", file.getName(), " settings"), e);
            return null;
        }
    }

    public JSONObject b() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = this.a;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(kg5.L(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e) {
                        e = e;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        kg5.q(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    kg5.q(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            kg5.q(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            kg5.q(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    public void c(Map map) {
        File file = this.a;
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), Charsets.UTF_8), RemoteCameraConfig.Notification.ID);
            try {
                for (Map.Entry entry : map.entrySet()) {
                    bufferedWriter.write(((String) entry.getKey()) + "=#=" + ((String) entry.getValue()) + StringUtil.LF);
                }
                bufferedWriter.flush();
                bufferedWriter.close();
            } finally {
            }
        } catch (IOException e) {
            ssg.a(6, null, hrg.q("Could not write ", file.getName(), " settings"), e);
        }
    }

    public qr3(jac jacVar) {
        this.a = new File((File) jacVar.c, "com.crashlytics.settings.json");
    }
}
