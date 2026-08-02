package coil3.decode;

import android.content.res.AssetFileDescriptor;
import android.util.Base64OutputStream;
import bo.app.xg$$ExternalSyntheticLambda9;
import com.google.firebase.heartbeatinfo.AutoValue_HeartBeatResult;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.heartbeatinfo.HeartBeatInfoStorage;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final /* synthetic */ class StaticImageDecoderKt$$ExternalSyntheticLambda0 implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ StaticImageDecoderKt$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String byteArrayOutputStream;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                return (AssetFileDescriptor) obj;
            default:
                DefaultHeartBeatController defaultHeartBeatController = (DefaultHeartBeatController) obj;
                synchronized (defaultHeartBeatController) {
                    try {
                        HeartBeatInfoStorage heartBeatInfoStorage = (HeartBeatInfoStorage) defaultHeartBeatController.storageProvider.get();
                        ArrayList allHeartBeats = heartBeatInfoStorage.getAllHeartBeats();
                        synchronized (heartBeatInfoStorage) {
                            heartBeatInfoStorage.firebaseDataStore.editSync(new xg$$ExternalSyntheticLambda9(heartBeatInfoStorage, 17));
                        }
                        JSONArray jSONArray = new JSONArray();
                        for (int i2 = 0; i2 < allHeartBeats.size(); i2++) {
                            AutoValue_HeartBeatResult autoValue_HeartBeatResult = (AutoValue_HeartBeatResult) allHeartBeats.get(i2);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", autoValue_HeartBeatResult.userAgent);
                            jSONObject.put("dates", new JSONArray((Collection) autoValue_HeartBeatResult.usedDates));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return byteArrayOutputStream;
        }
    }
}
